package realworld.entity.article;

import java.util.List;

public record Articles (List<ArticleDAO> articles, int articlesCount){}
