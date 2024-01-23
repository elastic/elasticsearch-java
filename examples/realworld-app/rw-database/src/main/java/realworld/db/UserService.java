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
import realworld.entity.exception.ResourceAlreadyExistsException;
import realworld.entity.exception.ResourceNotFoundException;
import realworld.entity.exception.UnauthorizedException;
import realworld.entity.user.*;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

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
     * Inserts a new UserEntity into the "users" index, checking beforehand whether the username and email
     * are unique.
     * <br>
     * See {@link UserService#findUserSearchByUsername(String)} for details on how the term query works.
     * <br>
     * Combining multiple term queries into a single
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-bool-query.html"> boolean query with "should" occur</a>
     * to match documents fulfilling either conditions.
     * <br>
     * When the new user document is created, it is left up to elasticsearch to create a unique
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping-id-field.html"> id field </a>, since there's no user field that is guaranteed not to be updated/modified.
     *
     * @return The newly registered user.
     */
    public UserEntity newUser(RegisterDAO user) throws IOException {

        SearchResponse<UserEntity> checkUser = esClient.search(ss -> ss
                        .index(USERS)
                        .query(q -> q
                                .bool(b -> b
                                        .should(m -> m
                                                .term(mc -> mc
                                                        .field("email.keyword")
                                                        .value(user.email()))
                                        ).should(m -> m
                                                .term(mc -> mc
                                                        .field("username.keyword")
                                                        .value(user.username())))))
                , UserEntity.class);

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

        // building user's JWT
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

        UserEntity ue = new UserEntity(user.username(), user.email(),
                user.password(), jws, "", "", new ArrayList<>());

        // creating the index request
        IndexRequest<UserEntity> userReq = IndexRequest.of((id -> id
                .index(USERS)
                .refresh(Refresh.WaitFor)
                .document(ue)));

        // indexing the request (inserting it into to database)
        esClient.index(userReq);

        return ue;
    }

    /**
     * To identify a user based on their email and passoword, a boolean query similar to the one used in
     * {@link UserService#newUser(RegisterDAO)} is used, with a difference: here "must" is used instead of
     * "should", meaning that the documents must match both conditions at the same time.
     *
     * @return The authenticated user.
     */
    public UserEntity login(LoginDAO user) throws IOException {

        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index(USERS)
                        .query(q -> q
                                .bool(b -> b
                                        .must(m -> m
                                                .term(mc -> mc
                                                        .field("email.keyword")
                                                        .value(user.email()))
                                        ).must(m -> m
                                                .term(mc -> mc
                                                        .field("password.keyword")
                                                        .value(user.password()))))
                        )
                , UserEntity.class);

        if (getUser.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Wrong email or password");
        }

        return extractSource(getUser);
    }


    public UserEntity getUserEntityFromToken(String auth) throws IOException {
        return extractSource(getUserSearchFromToken(auth));
    }

    /**
     * Deserializing and checking the token, then performing a term query (see
     * {@link UserService#findUserSearchByUsername(String)} for details) using the token string to retrieve
     * the corresponding user.
     *
     * @return the result of the term query, a single user.
     */
    private SearchResponse<UserEntity> getUserSearchFromToken(String auth) throws IOException {
        String token;
        try {
            token = auth.split(" ")[1];
            Jwts.parser()
                    .setSigningKey(TextCodec.BASE64.decode(jwtSigningKey))
                    .parse(token);
        } catch (Exception e) {
            throw new UnauthorizedException("Token missing or not recognised");
        }

        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index(USERS)
                        .query(q -> q
                                .term(m -> m
                                        .field("token.keyword")
                                        .value(token))
                        )
                , UserEntity.class);

        if (getUser.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Token not assigned to any user");
        }
        return getUser;
    }

    /**
     * See {@link UserService#updateUser(String, UserEntity)}
     * <br>
     * Updated a user, checking before if the new username or email would be unique.
     *
     * @return the updated user.
     */
    public UserEntity updateUser(String auth, UserDAO user) throws IOException {

        SearchResponse<UserEntity> userSearch = getUserSearchFromToken(auth);
        String id = extractId(userSearch);
        UserEntity userEntity = extractSource(userSearch);

        // if the username or email are updated, checking uniqueness
        if (!isNullOrBlank(user.username()) && !user.username().equals(userEntity.username())) {
            SearchResponse<UserEntity> newUsernameSearch = findUserSearchByUsername(user.username());
            if (!newUsernameSearch.hits().hits().isEmpty()) {
                throw new ResourceAlreadyExistsException("Username already exists");
            }
        }

        if (!isNullOrBlank(user.email()) && !user.email().equals(userEntity.email())) {
            SearchResponse<UserEntity> newEmailSearch = findUserSearchByEmail(user.email());
            if (!newEmailSearch.hits().hits().isEmpty()) {
                throw new ResourceAlreadyExistsException("Email already in use");
            }
        }

        // null/blank check for every optional field
        UserEntity ue = new UserEntity(isNullOrBlank(user.username()) ? userEntity.username() :
                user.username(),
                isNullOrBlank(user.email()) ? userEntity.email() : user.email(),
                userEntity.password(), userEntity.token(),
                isNullOrBlank(user.bio()) ? userEntity.bio() : user.bio(),
                isNullOrBlank(user.image()) ? userEntity.image() : user.image(),
                userEntity.following());

        updateUser(id, ue);
        return ue;
    }

    /**
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update.html
     * "> Updates</a> a user, given the updated object and its unique id.
     */
    private void updateUser(String id, UserEntity ue) throws IOException {
        UpdateResponse<UserEntity> upUser = esClient.update(up -> up
                        .index(USERS)
                        .id(id)
                        .doc(ue)
                , UserEntity.class);
        if (!upUser.result().name().equals("Updated")) {
            throw new RuntimeException("User update failed");
        }
    }

    public Profile getUserProfile(String username, String auth) throws IOException {

        UserEntity targetUser = findUserByUsername(username);

        // checking if the user is followed by who's asking
        UserEntity askingUser = getUserEntityFromToken(auth);
        boolean following = askingUser.following().contains(targetUser.username());

        return new Profile(targetUser, following);
    }

    public Profile followUser(String username, String auth) throws IOException {

        UserEntity targetUser = findUserByUsername(username);

        SearchResponse<UserEntity> askingUserSearch = getUserSearchFromToken(auth);
        UserEntity askingUser = extractSource(askingUserSearch);

        if (askingUser.username().equals(targetUser.username())) {
            throw new RuntimeException("Cannot follow yourself!");
        }

        // add followed user to list if not already present
        if (!askingUser.following().contains(targetUser.username())) {
            askingUser.following().add(targetUser.username());

            updateUser(extractId(askingUserSearch), askingUser);
        }

        return new Profile(targetUser, true);
    }

    public Profile unfollowUser(String username, String auth) throws IOException {

        UserEntity targetUser = findUserByUsername(username);

        SearchResponse<UserEntity> askingUserSearch = getUserSearchFromToken(auth);
        UserEntity askingUser = extractSource(askingUserSearch);

        // remove followed user to list if not already present
        if (askingUser.following().contains(targetUser.username())) {
            askingUser.following().remove(targetUser.username());

            updateUser(extractId(askingUserSearch), askingUser);
        }

        return new Profile(targetUser, false);
    }

    private UserEntity findUserByUsername(String username) throws IOException {
        SearchResponse<UserEntity> getUser = findUserSearchByUsername(username);
        if (getUser.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Target user not found");
        }
        return extractSource(getUser);
    }

    /**
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html
     * ">Searches </a> the "users" index for a document containing the exact same username.
     * <br>
     * A
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-term-query.html"> term query</a> means that it will find only results that match character by character.
     * <br>
     * Using the
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/keyword.html"> keyword </a>
     * property of the field allows to use the original value of the string while querying, instead of the
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-tokenizers.html"> processed/tokenized</a> value.
     *
     * @return the result of the term query, a single user.
     */
    private SearchResponse<UserEntity> findUserSearchByUsername(String username) throws IOException {
        // simple term query to match exactly the username string
        return esClient.search(ss -> ss
                        .index(USERS)
                        .query(q -> q
                                .term(t -> t
                                        .field("username.keyword")
                                        .value(username)))
                , UserEntity.class);
    }

    /**
     * Searches the "users" index for a document containing the exact same email.
     * See {@link UserService#findUserSearchByUsername(String)} for details.
     *
     * @return the result of the term query, a single user.
     */
    private SearchResponse<UserEntity> findUserSearchByEmail(String email) throws IOException {
        // simple term query to match exactly the email string
        return esClient.search(ss -> ss
                        .index(USERS)
                        .query(q -> q
                                .term(t -> t
                                        .field("email.keyword")
                                        .value(email)))
                , UserEntity.class);
    }
}
