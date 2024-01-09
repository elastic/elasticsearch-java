package realworld.entity.user;

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
