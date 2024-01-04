package realworld.entity.user;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("author")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record Author(
     String username,
     String email,
     String bio,
     boolean following){

    public Author(UserEntity ue, boolean following) {
        this(ue.username(), ue.email(), ue.bio(), following);
    }

    public Author(UserDAO ue, boolean following) {
        this(ue.username(), ue.email(), ue.bio(), following);
    }
}
