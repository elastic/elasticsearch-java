package realworld.db;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery.Builder;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.github.slugify.Slugify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.entity.article.Article;
import realworld.entity.article.ArticleDAO;
import realworld.entity.article.ArticleEntity;
import realworld.entity.article.Articles;
import realworld.entity.exception.ResourceAlreadyExistsException;
import realworld.entity.user.Author;
import realworld.entity.user.UserDAO;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ArticleService {

    private ElasticsearchClient esClient;
    private UserService userService;

    @Autowired
    public ArticleService(ElasticsearchClient esClient, UserService userService) {
        this.esClient = esClient;
        this.userService = userService;
    }

    public ArticleEntity newArticle(Article article, String auth) throws IOException {

        // checking if slug would be unique
        String slug = Slugify.builder().build().slugify(article.title());
        if (!singleArticleBySlug(slug).hits().hits().isEmpty()) {
            throw new ResourceAlreadyExistsException("Article slug already exists, please change the title");
        }

        // getting the author
        UserDAO ue = userService.getUserFromToken(auth);
        Author author = new Author(ue,false);
        Instant now = Instant.now();

        ArticleEntity articleEntity = new ArticleEntity(article,slug,now,now,author);

        IndexRequest<ArticleEntity> articleReq = IndexRequest.of((id -> id
                .index("articles")
                .document(articleEntity)));

        esClient.index(articleReq);

        return articleEntity;
    }

    public SearchResponse<ArticleEntity> singleArticleBySlug(String slug) throws IOException {

        // using term query to match exactly the slug and check if it already exists
        SearchResponse<ArticleEntity> getArticle = esClient.search(ss -> ss
                        .index("articles")
                        .query(q -> q
                                .term(t -> t
                                        .field("slug.keyword")
                                        .value(slug))
                        )
                , ArticleEntity.class);

        return getArticle;
    }

    public ArticleEntity getArticleBySlug(String slug) throws IOException {
        SearchResponse<ArticleEntity> articleSearch = singleArticleBySlug(slug);
        if (articleSearch.hits().hits().isEmpty()) {
            throw new RuntimeException("Article not found");
        }
        return articleSearch.hits().hits().getFirst().source();
    }

    public ArticleEntity favoriteArticle(String slug, String auth) throws IOException {
        UserDAO user = userService.getUserFromToken(auth);

        SearchResponse<ArticleEntity> articleSearch = singleArticleBySlug(slug);
        if (articleSearch.hits().hits().isEmpty()) {
            throw new RuntimeException("Article not found");
        }
        ArticleEntity article = articleSearch.hits().hits().getFirst().source();
        article.favoritedBy().add(user.username());
        article = new ArticleEntity(article.slug(), article.title(), article.description(), article.body(), article.tagList(), article.createdAt(), article.updatedAt(), true, article.favoritesCount()+1, article.favoritedBy(), article.author());
        //TODO update in db
        return article;
    }

    public ArticleEntity unfavoriteArticle(String slug, String auth) throws IOException {
        UserDAO user = userService.getUserFromToken(auth);

        SearchResponse<ArticleEntity> articleSearch = singleArticleBySlug(slug);
        if (articleSearch.hits().hits().isEmpty()) {
            throw new RuntimeException("Article not found");
        }
        ArticleEntity article = articleSearch.hits().hits().getFirst().source();
        // TODO check if it's favorited before
        article.favoritedBy().remove(user.username());
        int favoriteCount = article.favoritesCount()-1;
        boolean favorited = article.favorited();
        if(favoriteCount==0){
            favorited=false;
        }
        // TODO update in db
        article = new ArticleEntity(article.slug(), article.title(), article.description(), article.body(), article.tagList(), article.createdAt(), article.updatedAt(), favorited, favoriteCount, article.favoritedBy(), article.author());
        return article;
    }

    public Articles getArticles(String tag, String author, String favorited, Integer limit, Integer offset) throws IOException {

        List<Query> match = new ArrayList<>();
        // since all the parameters for this query are optional, the query must be build conditionally
        if (!isNullOrBlank(tag)) {
            match.add(new Builder()
                    .field("tagList")
                    .query(tag).build()._toQuery());
        }
        if (!isNullOrBlank(author)) {
            match.add(new Builder()
                    .field("author")
                    .query(author).build()._toQuery());
        }
        if (!isNullOrBlank(favorited)) {
            match.add(new Builder()
                    .field("favoritedBy")
                    .query(favorited).build()._toQuery());
        }

        Query query = new Query.Builder().bool(b -> b.should(match)).build();

        SearchResponse<ArticleEntity> getArticle = esClient.search(ss -> ss
                .index("articles")
                .size(limit)
                .from(offset)
                .query(query), ArticleEntity.class);

        return new Articles(getArticle.hits().hits()
                .stream()
                .map(Hit::source)
                // if tag specified, put that tag first in the array
                .peek(a -> {
                    if(!isNullOrBlank(tag)&&a.tagList().contains(tag)) {
                        Collections.swap(a.tagList(), a.tagList().indexOf(tag), 0);
                    }
                })
                .map(ArticleDAO::new)
                .collect(Collectors.toList()), getArticle.hits().hits().size());
    }

    // TODO remove
    public List<ArticleEntity> allArticles() throws IOException {
        SearchResponse<ArticleEntity> getArticle = esClient.search(ss -> ss
                        .index("articles")
                        .query(q -> q
                                .matchAll(m -> m)
                        )
                , ArticleEntity.class);

        return getArticle.hits().hits()
                .stream()
                .map(Hit::source)
                .collect(Collectors.toList());
    }
    //TODO common utility class
    private boolean isNullOrBlank(String s) {
        return Objects.isNull(s) || s.isBlank();
    }

}