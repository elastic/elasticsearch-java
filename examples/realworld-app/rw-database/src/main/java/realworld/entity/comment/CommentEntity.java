package realworld.entity.comment;

import realworld.entity.user.Author;
import java.time.Instant;

public record CommentEntity(Integer id, Instant createdAt, Instant updatedAt, String body, Author author, String articleSlug) {}
