package realworld.entity.user;

import java.util.List;

public record UserEntity (

     String username,
     String email,
     String password,
     String token,
     String bio,
     String image,
     List<String> following){
}
