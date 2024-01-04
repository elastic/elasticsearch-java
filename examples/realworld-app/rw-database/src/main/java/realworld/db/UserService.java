package realworld.db;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.entity.exception.ResourceAlreadyExistsException;
import realworld.entity.exception.ResourceNotFoundException;
import realworld.entity.user.Profile;
import realworld.entity.user.UserDAO;
import realworld.entity.user.UserEntity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    private ElasticsearchClient esClient;

    @Autowired
    public UserService(ElasticsearchClient esClient) {
        this.esClient = esClient;
    }

    public UserDAO newUser(UserDAO user) throws IOException {

        // checking if username or password already used.
        // using a "term" query to match the exact strings
        // (a "match" query would also find words containing the value inserted)
        // using "should" to find documents matching either condition.

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
                //.setExpiration(Date.from(Instant.now().plus(5, ChronoUnit.MINUTES)))
                .signWith(
                        SignatureAlgorithm.HS256,
                        TextCodec.BASE64.decode("c3VjaGFteXN0ZXJ5b3Vyc3VwZXJzZWNyZXR3b3c=")
                )
                .compact();

        UserEntity ue = new UserEntity(user.username(), user.email(),
                user.password(), jws, user.bio(), user.image(), new ArrayList<>());

        // using the username as a document ID will help with operations that require the document ID
        IndexRequest<UserEntity> userReq = IndexRequest.of((id -> id
                .index("users")
                .id(ue.username())
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

        return new UserDAO(getUser.hits().hits().getFirst().source());
    }

    public UserDAO getUserFromToken(String auth) throws IOException {
        return new UserDAO(getUserEntityFromToken(auth).hits().hits().getFirst().source());
    }

    private SearchResponse<UserEntity> getUserEntityFromToken(String auth) throws IOException {
        String token;
        try {
            token = auth.split(" ")[1];
            Jwts.parser()
                    .setSigningKey(TextCodec.BASE64.decode("c3VjaGFteXN0ZXJ5b3Vyc3VwZXJzZWNyZXR3b3c="))
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

    public UserDAO updateUser(String auth, UserDAO user) throws IOException {

        SearchResponse<UserEntity> userSearch = getUserEntityFromToken(auth);
        UserEntity userEntity = userSearch.hits().hits().getFirst().source();

        UserEntity ue = new UserEntity(userEntity.username(), user.email(),
                userEntity.password(), userEntity.token(), user.bio(), user.image(), userEntity.following());

        UpdateResponse upUser = esClient.update(up -> up
                        .index("users")
                        .id(ue.username())
                        .doc(ue)
                , UserEntity.class);

        return new UserDAO(ue);
    }

    public Profile getUserProfile(String username, String auth) throws IOException {

        SearchResponse<UserEntity> getUser = findUserByUsername(username);

        UserEntity targetUser = getUser.hits().hits().getFirst().source();

        // checking if the user is followed by who's asking
        SearchResponse<UserEntity> askingUser = getUserEntityFromToken(auth);
        boolean following = false;
        if (askingUser.hits().hits().getFirst().source().following().contains(targetUser.username())) {
            following = true;
        }

        Profile targetUserProfile = new Profile(targetUser, following);

        return targetUserProfile;
    }

    private SearchResponse<UserEntity> findUserByUsername(String username) throws IOException {
        // since the id is the unique username, using id query since it is the most efficient
        SearchResponse<UserEntity> getUser = esClient.search(ss -> ss
                        .index("users")
                        .query(q -> q
                                .ids(id -> id
                                        .values(List.of(username)))
                        )
                , UserEntity.class);
        return getUser;
    }

    public Profile followUser(String username, String auth) throws IOException {

        SearchResponse<UserEntity> getUser = findUserByUsername(username);

        UserEntity targetUser = getUser.hits().hits().getFirst().source();
        // add followed user to list if not already present

        SearchResponse<UserEntity> userSearch = getUserEntityFromToken(auth);
        UserEntity askingUser = userSearch.hits().hits().getFirst().source();

        if (!askingUser.following().contains(targetUser.username())) {
            askingUser.following().add(targetUser.username());

            UpdateResponse upUser = esClient.update(up -> up //TODO check success
                            .index("users")
                            .id(username)
                            .doc(askingUser)
                    , UserEntity.class);
        }
        Profile targetUserProfile = new Profile(targetUser,true);

        return targetUserProfile;
    }

    // TODO merge follow and unfollow
    public Profile unfollowUser(String username, String auth) throws IOException {

        SearchResponse<UserEntity> getUser = findUserByUsername(username);

        UserEntity targetUser = getUser.hits().hits().getFirst().source();

        // remove followed user to list if not already present

        SearchResponse<UserEntity> userSearch = getUserEntityFromToken(auth);
        UserEntity askingUser = userSearch.hits().hits().getFirst().source();

        if (askingUser.following().contains(targetUser.username())) {
            askingUser.following().remove(targetUser.username());

            UpdateResponse upUser = esClient.update(up -> up //TODO check success
                            .index("users")
                            .id(username)
                            .doc(askingUser)
                    , UserEntity.class);
        }
        Profile targetUserProfile = new Profile(targetUser,false);

        return targetUserProfile;
    }
}
