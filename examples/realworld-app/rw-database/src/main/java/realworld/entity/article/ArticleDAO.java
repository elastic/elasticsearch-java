package realworld.entity.article;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;
import realworld.entity.user.Author;

import java.time.Instant;
import java.util.List;

@JsonTypeName("article")
@JsonTypeInfo(include = As.WRAPPER_OBJECT, use = Id.NAME)
public record ArticleDAO(
        String slug,
        String title,
        String description,
        String body,
        List<String> tagList,
        Instant createdAt,
        Instant updatedAt,
        boolean favorited,
        int favoritesCount,
        Author author) {


    public ArticleDAO(ArticleEntity article) {
        this(article.slug(), article.title(), article.description(), article.body(), article.tagList(), article.createdAt(), article.updatedAt(), article.favorited(), article.favoritesCount(), article.author());
    }
}
