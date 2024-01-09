package realworld.entity.article;

import java.util.List;

public record Articles (List<ArticleForListDAO> articles, int articlesCount){}
