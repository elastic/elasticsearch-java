package realworld.entity.user;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("user")
@JsonTypeInfo(include = As.WRAPPER_OBJECT, use = Id.NAME)
public record User(

        String username,
        String email,
        String token,
        String bio,
        String image) {

    public User(UserDAO userDAO) {
        this(userDAO.username(), userDAO.email(), userDAO.token(), userDAO.bio(), userDAO.image());
    }

}
