package realworld.entity.comment;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("comment")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record CommentCreationDAO(String body) {
}
