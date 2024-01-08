package realworld.entity.article;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("article")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record ArticleUpdateDAO (String title, String description, String body){}
