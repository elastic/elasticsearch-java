package realworld.entity.article;

import realworld.entity.user.Author;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public record ArticleEntity(
        String slug,
        String title,
        String description,
        String body,
        List<String> tagList,
        Instant createdAt,
        Instant updatedAt,
        boolean favorited,
        int favoritesCount,
        List<String> favoritedBy,
        Author author) {

    public ArticleEntity(Article article, String slug, Instant createdAt, Instant updatedAt, Author author) {
        this(slug, article.title(), article.description(), article.body(), article.tagList(), createdAt, updatedAt, false, 0, new ArrayList<>(), author);
    }
}
