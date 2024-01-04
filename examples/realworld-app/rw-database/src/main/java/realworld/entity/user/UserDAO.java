package realworld.entity.user;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("user")
@JsonTypeInfo(include = As.WRAPPER_OBJECT, use = Id.NAME)
public record UserDAO(

     String username,
     String email,
     String password,
     String token,
     String bio,
     String image){

    public UserDAO(UserEntity ue){
        this(ue.username(), ue.email(), ue.password(), ue.token(), ue.bio(), ue.image());
    }
}
