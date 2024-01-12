/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package realworld.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import realworld.db.CommentService;
import realworld.entity.article.ArticleCreationDAO;
import realworld.entity.article.ArticleDAO;
import realworld.entity.article.ArticleEntity;
import realworld.entity.article.ArticleUpdateDAO;
import realworld.entity.article.Articles;
import realworld.entity.comment.CommentCreationDAO;
import realworld.entity.comment.CommentDAO;
import realworld.entity.comment.CommentEntity;
import realworld.entity.comment.Comments;

import java.io.IOException;

@CrossOrigin()
@RestController
@RequestMapping("/articles")
public class ArticleController {

    private ArticleService articleService;
    private CommentService commentService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public ArticleController(ArticleService articleService, CommentService commentService) {
        this.articleService = articleService;
        this.commentService = commentService;
    }

    @PostMapping()
    public ResponseEntity<ArticleDAO> createArticle(@RequestHeader("Authorization") String auth, @RequestBody ArticleCreationDAO req) throws IOException {
        ArticleEntity res = articleService.newArticle(req, auth);
        logger.debug("Created new article: {}", res.slug());
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @GetMapping("/{slug}")
    public ResponseEntity<ArticleDAO> getArticleBySlug(@PathVariable String slug) throws IOException {
        ArticleEntity res = articleService.getArticleBySlug(slug);
        logger.debug("Retrieved article: {}", slug);
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @GetMapping()
    public ResponseEntity<Articles> getArticles(@RequestParam(required = false) String tag, @RequestParam(required = false) String author,
                                                @RequestParam(required = false) String favorited, @RequestParam(required = false) Integer limit,
                                                @RequestParam(required = false) Integer offset,
                                                @RequestHeader(value = "Authorization", required = false) String auth) throws IOException {
        Articles res = articleService.getArticles(tag, author, favorited, limit, offset, auth);
        logger.debug("Returned article list");
        return ResponseEntity.ok(res);
    }

    @GetMapping("/feed")
    public ResponseEntity<Articles> getFeed(@RequestHeader("Authorization") String auth) throws IOException {
        Articles res = articleService.articleFeed(auth);
        logger.debug("Generated feed");
        return ResponseEntity.ok(res);
    }

    @PostMapping("/{slug}/favorite")
    public ResponseEntity<ArticleDAO> favoriteArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug) throws IOException {
        ArticleEntity res = articleService.favoriteArticle(slug, auth);
        logger.debug("Set article: {} as favorite", slug);
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @DeleteMapping("/{slug}/favorite")
    public ResponseEntity<ArticleDAO> unfavoriteArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug) throws IOException {
        ArticleEntity res = articleService.unfavoriteArticle(slug, auth);
        logger.debug("Removed article: {} from favorites", slug);
        return ResponseEntity.ok(new ArticleDAO(res));
    }

    @PutMapping("/{slug}")
    public ResponseEntity<ArticleDAO> updateArticle(@RequestHeader("Authorization") String auth, @RequestBody ArticleUpdateDAO req, @PathVariable String slug) throws IOException {
        ArticleDAO res = articleService.updateArticle(req, auth, slug);
        logger.debug("Updated article: {}", slug);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{slug}")
    public ResponseEntity<Void> deleteArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug) throws IOException {
        articleService.deleteArticle(auth, slug);
        logger.debug("Deleted article: {}", slug);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{slug}/comments")
    public ResponseEntity<CommentDAO> commentArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug, @RequestBody CommentCreationDAO comment) throws IOException {
        CommentEntity res = commentService.newComment(comment, slug, auth);
        logger.debug("Commented article: {}", slug);
        return ResponseEntity.ok(new CommentDAO(res));
    }

    @GetMapping("/{slug}/comments")
    public ResponseEntity<Comments> allCommentsByArticle(@RequestHeader("Authorization") String auth, @PathVariable String slug) throws IOException {
        Comments res = commentService.allCommentsByArticle(slug, auth);
        logger.debug("Commented article: {}", slug);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{slug}/comments/{commentId}")
    public ResponseEntity<Void> deleteComment(@RequestHeader("Authorization") String auth, @PathVariable String slug, @PathVariable String commentId) throws IOException {
        commentService.deleteComment(commentId, slug, auth);
        logger.debug("Deleted comment: {} from article {}", commentId, slug);
        return ResponseEntity.ok().build();
    }
}
