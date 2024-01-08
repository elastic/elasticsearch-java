package realworld.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import realworld.db.ArticleService;
import realworld.entity.article.Article;
import realworld.entity.article.ArticleDAO;
import realworld.entity.article.ArticleEntity;
import realworld.entity.article.ArticleUpdateDAO;
import realworld.entity.article.Articles;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping()
public class ArticleController {

    private ArticleService service;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @PostMapping("/articles")
    public ResponseEntity<ArticleDAO> createArticle(@RequestHeader("Authorization") String auth, @RequestBody Article req) throws IOException {
        // TODO check null
        // TODO consider adding validator
        ArticleEntity res = service.newArticle(req, auth);
        logger.debug("Created new article: {}", res.slug());
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @GetMapping("/articles/{slug}")
    public ResponseEntity<ArticleDAO> getArticleBySlug(@PathVariable String slug) throws IOException {
        ArticleEntity res = service.getArticleBySlug(slug);
        logger.debug("Retrieved article: {}", res.slug());
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @GetMapping("/articles")
    public ResponseEntity<Articles> getArticles(@RequestParam(required = false) String tag, @RequestParam(required = false) String author,
                                                @RequestParam(required = false) String favorited, @RequestParam(required = false) Integer limit,
                                                @RequestParam(required = false) Integer offset) throws IOException {
        Articles res = service.getArticles(tag, author, favorited, limit, offset);
        logger.debug("Returned article list");
        return ResponseEntity.ok(res);
    }

    @PostMapping("/articles/{slug}/favorite")
    public ResponseEntity<ArticleDAO> favoriteArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug) throws IOException {
        ArticleEntity res = service.favoriteArticle(slug, auth);
        logger.debug("Set article: {} as favorite", res.slug());
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @DeleteMapping("/articles/{slug}/favorite")
    public ResponseEntity<ArticleDAO> unfavoriteArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug) throws IOException {
        ArticleEntity res = service.unfavoriteArticle(slug, auth);
        logger.debug("Removed article: {} from favorites", res.slug());
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @PutMapping("/articles/{slug}")
    public ResponseEntity<ArticleDAO> updateArticle(@RequestHeader("Authorization") String auth, @RequestBody ArticleUpdateDAO req, @PathVariable String slug) throws IOException {
        ArticleDAO res = service.updateArticle(req, auth, slug);
        logger.debug("Set article: {} as favorite", res.slug());
        return ResponseEntity.ok(res);
    }

    //TODO REMOVE, JUST FOR TEST
    @GetMapping("/allarticles")
    public ResponseEntity<List<ArticleEntity>> getAllArticlesTest() throws IOException {
        List<ArticleEntity> res = service.allArticles();
        logger.debug("Returned article list");
        return ResponseEntity.ok(res);
    }
}
