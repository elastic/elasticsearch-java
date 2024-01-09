package realworld.entity.article;

import realworld.entity.user.Author;

import java.time.Instant;
import java.util.List;

public record ArticleForListDAO(
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


    public ArticleForListDAO(ArticleEntity article) {
        this(article.slug(), article.title(), article.description(), article.body(), article.tagList(), article.createdAt(), article.updatedAt(), article.favorited(), article.favoritesCount(), article.author());
    }
}
