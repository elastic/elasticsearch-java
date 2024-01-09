package realworld.entity.comment;

import realworld.entity.user.Author;

import java.time.Instant;

public record CommentForListDAO(Integer id, Instant createdAt, Instant updatedAt, String body, Author author) {
    public CommentForListDAO(CommentEntity commentEntity) {
        this(commentEntity.id(), commentEntity.createdAt(),commentEntity.updatedAt(), commentEntity.body(), commentEntity.author());
    }
}
