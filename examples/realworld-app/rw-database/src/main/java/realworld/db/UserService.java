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
import realworld.entity.user.Profile;
import realworld.entity.user.User;
import realworld.entity.user.UserDAO;
import realworld.entity.user.UserEntity;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import static realworld.utils.Utility.extractId;
import static realworld.utils.Utility.extractSource;
import static realworld.utils.Utility.isNullOrBlank;

@Service
public class UserService {

    private ElasticsearchClient esClient;

    @Value("jwt.signing.key")
    private String jwtSigningKey;

    @Autowired
    public UserService(ElasticsearchClient esClient) {
        this.esClient = esClient;
    }

    public UserDAO newUser(UserDAO user) throws IOException {

        // checking if username or email already used.
        // using a "term" query to match the exact strings
        // (a "match" query would also find words containing the value inserted)
        // using "should" to find documents matching either condition.

        // TODO explain keyword -> no tokenizer, stored as is. not important here since everything is a single word

        SearchResponse<UserEntity> checkUser = esClient.search(ss -> ss
                        .index("users")
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
                user.password(), jws, user.bio(), user.image(), new ArrayList<>());

        IndexRequest<UserEntity> userReq = IndexRequest.of((id -> id
                .index("users")
                .refresh(Refresh.WaitFor)
                .document(ue)));

        esClient.index(userReq);

        return user;
    }

    public UserDAO login(UserDAO user) throws IOException {

        // term query to match exactly the email and password strings,
        // using "must" to match both
        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index("users")
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

        if(getUser.hits().hits().isEmpty()){
            throw new ResourceNotFoundException("Wrong email or password");
        }

        return new UserDAO(extractSource(getUser));
    }

    public UserDAO getUserFromToken(String auth) throws IOException {
        return new UserDAO(extractSource(getUserEntityFromToken(auth)));
    }

    /**
     *
     * @param auth
     * @return
     * @throws IOException
     */
    public SearchResponse<UserEntity> getUserEntityFromToken(String auth) throws IOException {
        String token;
        try {
            token = auth.split(" ")[1];
            Jwts.parser()
                    .setSigningKey(TextCodec.BASE64.decode(jwtSigningKey))
                    .parse(token);
        } catch (Exception e) {
            throw new RuntimeException("Token not recognised",e);
        }

        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index("users")
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

    public UserDAO updateUser(String auth, User user) throws IOException {

        SearchResponse<UserEntity> userSearch = getUserEntityFromToken(auth);
        String id = extractId(userSearch);
        UserEntity userEntity = extractSource(userSearch);

        // if the username or email are updated, checking uniqueness
        if(!isNullOrBlank(user.username())&&!user.username().equals(userEntity.username())){
            SearchResponse<UserEntity> newUsernameSearch = findUserSearchByUsername(user.username());
            if(!newUsernameSearch.hits().hits().isEmpty()){
                throw new ResourceAlreadyExistsException("Username already exists");
            }
        }

        if(!isNullOrBlank(user.email())&&!user.email().equals(userEntity.email())){
            SearchResponse<UserEntity> newEmailSearch = findUserByEmail(user.email());
            if(!newEmailSearch.hits().hits().isEmpty()){
                throw new ResourceAlreadyExistsException("Email already in use");
            }
        }

        // null/blank check for every optional field
        UserEntity ue = new UserEntity(isNullOrBlank(user.username()) ? userEntity.username() : user.username(),
                isNullOrBlank(user.email()) ? userEntity.email() : user.email(),
                userEntity.password(), userEntity.token(),
                isNullOrBlank(user.bio()) ? userEntity.bio() : user.bio(),
                isNullOrBlank(user.image()) ? userEntity.image() : user.image(),
                userEntity.following());

        updateUser(id, ue);
        return new UserDAO(ue);
    }

    private void updateUser(String id, UserEntity ue) throws IOException {
        UpdateResponse upUser = esClient.update(up -> up
                        .index("users")
                        .id(id)
                        .doc(ue)
                , UserEntity.class);
        if(!upUser.result().name().equals("Updated")){
            throw new RuntimeException("User update failed");
        }
    }

    public Profile getUserProfile(String username, String auth) throws IOException {

        UserEntity targetUser = findUserByUsername(username);

        // checking if the user is followed by who's asking
        SearchResponse<UserEntity> askingUser = getUserEntityFromToken(auth);
        boolean following = false;
        if (extractSource(askingUser).following().contains(targetUser.username())) {
            following = true;
        }

        Profile targetUserProfile = new Profile(targetUser, following);

        return targetUserProfile;
    }

    public Profile followUser(String username, String auth) throws IOException {

        UserEntity targetUser = findUserByUsername(username);

        SearchResponse<UserEntity> askingUserSearch = getUserEntityFromToken(auth);
        UserEntity askingUser = extractSource(askingUserSearch);

        if(askingUser.username().equals(targetUser.username())){
            throw new RuntimeException("Cannot follow yourself!");
        }

        // add followed user to list if not already present
        if (!askingUser.following().contains(targetUser.username())) {
            askingUser.following().add(targetUser.username());

            updateUser(extractId(askingUserSearch), askingUser);
        }
        Profile targetUserProfile = new Profile(targetUser,true);

        return targetUserProfile;
    }

    public Profile unfollowUser(String username, String auth) throws IOException {

        UserEntity targetUser = findUserByUsername(username);

        SearchResponse<UserEntity> askingUserSearch = getUserEntityFromToken(auth);
        UserEntity askingUser = extractSource(askingUserSearch);

        // remove followed user to list if not already present
        if (askingUser.following().contains(targetUser.username())) {
            askingUser.following().remove(targetUser.username());

            updateUser(extractId(askingUserSearch), askingUser);
        }
        Profile targetUserProfile = new Profile(targetUser,false);

        return targetUserProfile;
    }

    private UserEntity findUserByUsername(String username) throws IOException {
        SearchResponse<UserEntity> getUser = findUserSearchByUsername(username);
        if (getUser.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Target user not found");
        }
        return extractSource(getUser);
    }

    private SearchResponse<UserEntity> findUserSearchByUsername(String username) throws IOException {
        // simple term query to match exactly the username string
        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index("users")
                        .query(q -> q
                                .term(t -> t
                                        .field("username.keyword")
                                        .value(username)))
                , UserEntity.class);
        return getUser;
    }

    private SearchResponse<UserEntity> findUserByEmail(String email) throws IOException {
        // simple term query to match exactly the email string
        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index("users")
                        .query(q -> q
                                .term(t -> t
                                        .field("email.keyword")
                                        .value(email)))
                , UserEntity.class);
        return getUser;
    }
}
