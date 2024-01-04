package realworld.entity.user;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("profile")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record Profile (
     String username,
     String email,
     String bio,
     boolean following){

    public Profile(UserEntity ue, boolean following) {
        this(ue.username(), ue.email(), ue.bio(), following);
    }
}
