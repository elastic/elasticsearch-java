package realworld.entity.comment;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;
import realworld.entity.user.Author;
import java.time.Instant;

@JsonTypeName("comment")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record CommentDAO(Integer id, Instant createdAt, Instant updatedAt, String body, Author author) {
    public CommentDAO(CommentEntity commentEntity) {
        this(commentEntity.id(), commentEntity.createdAt(),commentEntity.updatedAt(), commentEntity.body(), commentEntity.author());
    }
}
