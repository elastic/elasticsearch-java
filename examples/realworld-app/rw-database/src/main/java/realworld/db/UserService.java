/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package realworld.db;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import realworld.document.exception.ResourceAlreadyExistsException;
import realworld.document.exception.ResourceNotFoundException;
import realworld.document.exception.UnauthorizedException;
import realworld.document.user.*;
import realworld.utils.UserIdPair;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.time.Instant;
import java.util.*;

import static realworld.constant.Constants.USERS;
import static realworld.utils.Utility.*;

@Service
public class UserService {

    private final ElasticsearchClient esClient;

    @Value("${jwt.signing.key}")
    private String jwtSigningKey;

    @Autowired
    public UserService(ElasticsearchClient esClient) {
        this.esClient = esClient;
    }

    /**
     * Inserts a new User into the "users" index, checking beforehand whether the username and email
     * are unique.
     * <p>
     * See {@link UserService#findUserByUsername(String)} for details on how the term query works.
     * <p>
     * Combining multiple term queries into a single
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-bool-query.html"> boolean query with "should" occur</a>
     * to match documents fulfilling either conditions to check the uniqueness of the new email and username.
     * <p>
     * When the new user document is created, it is left up to elasticsearch to create a unique
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-id-field.html"> id field </a>, since there's no user field that is guaranteed not to be updated/modified.
     *
     * @return The newly registered user.
     */
    public User newUser(RegisterDTO user) throws IOException {

        // Checking uniqueness of both email and username
        SearchResponse<User> checkUser = esClient.search(ss -> ss
                .index(USERS)
                .query(q -> q
                    .bool(b -> b
                        .should(s -> s
                            .term(t -> t
                                .field("email.keyword")
                                .value(user.email()))
                        ).should(s -> s
                            .term(t -> t
                                .field("username.keyword")
                                .value(user.username())))))
            , User.class);

        checkUser.hits().hits().stream()
            .map(Hit::source)
            .filter(x -> x.username().equals(user.username()))
            .findFirst()
            .ifPresent(x -> {
                throw new ResourceAlreadyExistsException("Username already exists");
            });

        checkUser.hits().hits().stream()
            .map(Hit::source)
            .filter(x -> x.email().equals(user.email()))
            .findFirst()
            .ifPresent(x -> {
                throw new ResourceAlreadyExistsException("Email already used");
            });

        // Building user's JWT, with no expiration since it's not requested
        String jws = Jwts.builder()
            .setIssuer("rw-backend")
            .setSubject(user.email())
            .claim("name", user.username())
            .claim("scope", "user")
            .setIssuedAt(Date.from(Instant.now()))
            .signWith(
                SignatureAlgorithm.HS256,
                TextCodec.BASE64.decode(jwtSigningKey)
            )
            .compact();

        // Hashing the password, storing the salt with the user
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);
        String hashedPw = hashUserPw(user.password(), salt);

        User newUser = new User(user.username(), user.email(),
            hashedPw, jws, "", "", salt, new ArrayList<>());

        // Creating the index request
        IndexRequest<User> userReq = IndexRequest.of((id -> id
            .index(USERS)
            .refresh(Refresh.WaitFor)
            .document(newUser)));

        // Indexing the request (inserting it into to database)
        esClient.index(userReq);

        return newUser;
    }

    /**
     * Using a simple term query (see {@link UserService#findUserByUsername(String)} for details)
     * to find the user using the same unique email as the one provided. The password is then hashed and
     * checked after the search.
     *
     * @return The authenticated user.
     */
    public User authenticateUser(LoginDTO login) throws IOException {

        SearchResponse<User> getUser = esClient.search(ss -> ss
                .index(USERS)
                .query(q -> q
                    .term(t -> t
                        .field("email.keyword")
                        .value(login.email())))
            , User.class);


        if (getUser.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Email not found");
        }

        // Check if the hashed password matches the one provided
        User user = extractSource(getUser);
        String hashedPw = hashUserPw(login.password(), user.salt());

        if (!hashedPw.equals(user.password())) {
            throw new UnauthorizedException("Wrong password");
        }
        return user;
    }

    /**
     * Deserializing and checking the token, then performing a term query
     * (see {@link UserService#findUserByUsername(String)} for details) using the token string to retrieve
     * the corresponding user.
     *
     * @return a pair containing the result of the term query, a single user, with its id.
     */
    public UserIdPair findUserByToken(String auth) throws IOException {
        String token;
        try {
            token = auth.split(" ")[1];
            Jwts.parser()
                .setSigningKey(TextCodec.BASE64.decode(jwtSigningKey))
                .parse(token);
        } catch (Exception e) {
            throw new UnauthorizedException("Token missing or not recognised");
        }

        SearchResponse<User> getUser = esClient.search(ss -> ss
                .index(USERS)
                .query(q -> q
                    .term(t -> t
                        .field("token.keyword")
                        .value(token))
                )
            , User.class);

        if (getUser.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Token not assigned to any user");
        }
        return new UserIdPair(extractSource(getUser), extractId(getUser));
    }

    /**
     * See {@link UserService#updateUser(String, User)}
     * <p>
     * Updates a user, checking before if the new username or email would be unique.
     *
     * @return the updated user.
     */
    public User updateUser(UserDTO userDTO, String auth) throws IOException {

        UserIdPair userPair = findUserByToken(auth);
        User user = userPair.user();

        // If the username or email are updated, checking uniqueness
        if (!isNullOrBlank(userDTO.username()) && !userDTO.username().equals(user.username())) {
            UserIdPair newUsernameSearch = findUserByUsername(userDTO.username());
            if (Objects.nonNull(newUsernameSearch)) {
                throw new ResourceAlreadyExistsException("Username already exists");
            }
        }

        if (!isNullOrBlank(userDTO.email()) && !userDTO.email().equals(user.email())) {
            UserIdPair newUsernameSearch = findUserByEmail(userDTO.username());
            if (Objects.nonNull(newUsernameSearch)) {
                throw new ResourceAlreadyExistsException("Email already in use");
            }
        }

        // Null/blank check for every optional field
        User updatedUser = new User(isNullOrBlank(userDTO.username()) ? user.username() :
            userDTO.username(),
            isNullOrBlank(userDTO.email()) ? user.email() : userDTO.email(),
            user.password(), user.token(),
            isNullOrBlank(userDTO.bio()) ? user.bio() : userDTO.bio(),
            isNullOrBlank(userDTO.image()) ? user.image() : userDTO.image(),
            user.salt(), user.following());

        updateUser(userPair.id(), updatedUser);
        return updatedUser;
    }

    /**
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update.html
     * "> Updates</a> a user, given the updated object and its unique id.
     */
    private void updateUser(String id, User user) throws IOException {
        UpdateResponse<User> upUser = esClient.update(up -> up
                .index(USERS)
                .id(id)
                .doc(user)
            , User.class);
        if (!upUser.result().name().equals("Updated")) {
            throw new RuntimeException("User update failed");
        }
    }

    /**
     * Retrieves data for the requested user and the asking user to provide profile information.
     *
     * @return the requested user's profile.
     */
    public Profile findUserProfile(String username, String auth) throws IOException {

        UserIdPair targetUserPair = Optional.ofNullable(findUserByUsername(username))
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        User targetUser = targetUserPair.user();

        // Checking if the user is followed by who's asking
        UserIdPair askingUserPair = findUserByToken(auth);
        boolean following = askingUserPair.user().following().contains(targetUser.username());

        return new Profile(targetUser, following);
    }

    /**
     * Adds the targed user to the asking user's list of followed profiles.
     *
     * @return the target user's profile.
     */
    public Profile followUser(String username, String auth) throws IOException {

        UserIdPair targetUserPair = Optional.ofNullable(findUserByUsername(username))
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        User targetUser = targetUserPair.user();

        UserIdPair askingUserPair = findUserByToken(auth);
        User askingUser = askingUserPair.user();

        if (askingUser.username().equals(targetUser.username())) {
            throw new RuntimeException("Cannot follow yourself!");
        }

        // Add followed user to list if not already present
        if (!askingUser.following().contains(targetUser.username())) {
            askingUser.following().add(targetUser.username());

            updateUser(askingUserPair.id(), askingUser);
        }

        return new Profile(targetUser, true);
    }

    /**
     * Removes the targed user from the asking user's list of followed profiles.
     *
     * @return the target user's profile.
     */
    public Profile unfollowUser(String username, String auth) throws IOException {
        UserIdPair targetUserPair = Optional.ofNullable(findUserByUsername(username))
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        User targetUser = targetUserPair.user();

        UserIdPair askingUserPair = findUserByToken(auth);
        User askingUser = askingUserPair.user();

        // Remove followed user to list if not already present
        if (askingUser.following().contains(targetUser.username())) {
            askingUser.following().remove(targetUser.username());

            updateUser(askingUserPair.id(), askingUser);
        }

        return new Profile(targetUser, false);
    }

    /**
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html
     * ">Searches </a> the "users" index for a document containing the exact same username.
     * <p>
     * A
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-term-query.html"> term query</a>
     * means that it will find only results that match character by character.
     * <p>
     * Using the
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/keyword.html"> keyword </a>
     * property of the field allows to use the original value of the string while querying, instead of the
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-tokenizers.html"> processed/tokenized</a> value.
     *
     * @return a pair containing the result of the term query, a single user, with its id.
     */
    public UserIdPair findUserByUsername(String username) throws IOException {
        // Simple term query to match exactly the username string
        SearchResponse<User> getUser = esClient.search(ss -> ss
                .index(USERS)
                .query(q -> q
                    .term(t -> t
                        .field("username.keyword")
                        .value(username)))
            , User.class);
        if (getUser.hits().hits().isEmpty()) {
            return null;
        }
        return new UserIdPair(extractSource(getUser), extractId(getUser));
    }

    /**
     * Searches the "users" index for a document containing the exact same email.
     * See {@link UserService#findUserByUsername(String)} for details.
     *
     * @return the result of the term query, a single user, with its id.
     */
    private UserIdPair findUserByEmail(String email) throws IOException {
        // Simple term query to match exactly the email string
        SearchResponse<User> getUser = esClient.search(ss -> ss
                .index(USERS)
                .query(q -> q
                    .term(t -> t
                        .field("email.keyword")
                        .value(email)))
            , User.class);
        if (getUser.hits().hits().isEmpty()) {
            return null;
        }
        return new UserIdPair(extractSource(getUser), extractId(getUser));
    }

    /**
     * Hashes a string using the PBKDF2 method.
     *
     * @return the hashed string.
     */
    private String hashUserPw(String password, byte[] salt) {

        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        String hashedPw = null;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = secretKeyFactory.generateSecret(keySpec).getEncoded();
            Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
            hashedPw = encoder.encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
        return hashedPw;
    }
}
