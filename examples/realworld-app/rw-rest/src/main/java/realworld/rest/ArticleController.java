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
import org.springframework.web.bind.annotation.*;
import realworld.db.ArticleService;
import realworld.db.CommentService;
import realworld.db.UserService;
import realworld.document.article.*;
import realworld.document.comment.Comment;
import realworld.document.comment.CommentCreationDTO;
import realworld.document.comment.CommentDTO;
import realworld.document.comment.CommentsDTO;
import realworld.document.exception.ResourceNotFoundException;
import realworld.document.user.Author;
import realworld.document.user.User;
import realworld.utils.UserIdPair;

import java.io.IOException;
import java.util.Optional;

import static realworld.utils.Utility.isNullOrBlank;

@CrossOrigin
@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;
    private final UserService userService;
    private final CommentService commentService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public ArticleController(ArticleService articleService, UserService userService,
                             CommentService commentService) {
        this.articleService = articleService;
        this.userService = userService;
        this.commentService = commentService;
    }

    @PostMapping()
    public ResponseEntity<ArticleDTO> newArticle(@RequestBody ArticleCreationDTO req, @RequestHeader(
        "Authorization") String auth) throws IOException {
        UserIdPair userPair = userService.findUserByToken(auth);
        Author author = new Author(userPair.user(), false);

        Article res = articleService.newArticle(req, author);
        logger.debug("Created new article: {}", res.slug());
        return ResponseEntity.ok(new ArticleDTO(res));
    }

    @GetMapping("/{slug}")
    public ResponseEntity<ArticleDTO> findArticleBySlug(@PathVariable String slug) throws IOException {
        Article res = Optional.ofNullable(articleService.findArticleBySlug(slug))
            .orElseThrow(() -> new ResourceNotFoundException("Article not found"))
            .article();
        logger.debug("Retrieved article: {}", slug);
        return ResponseEntity.ok(new ArticleDTO(res));
    }

    @GetMapping()
    public ResponseEntity<ArticlesDTO> findArticles(@RequestParam(required = false) String tag,
                                                    @RequestParam(required = false) String author,
                                                    @RequestParam(required = false) String favorited,
                                                    @RequestParam(required = false) Integer limit,
                                                    @RequestParam(required = false) Integer offset,
                                                    @RequestHeader(value = "Authorization", required =
                                                        false) String auth) throws IOException {
        Optional<User> user = Optional.empty();
        if (!isNullOrBlank(auth)) {
            user = Optional.of(userService.findUserByToken(auth).user());
        }
        ArticlesDTO res = articleService.findArticles(tag, author, favorited, limit, offset, user);
        logger.debug("Returned article list");
        return ResponseEntity.ok(res);
    }

    @GetMapping("/feed")
    public ResponseEntity<ArticlesDTO> generateFeed(@RequestHeader("Authorization") String auth) throws IOException {
        User user = userService.findUserByToken(auth).user();

        ArticlesDTO res = articleService.generateArticleFeed(user);
        logger.debug("Generated feed");
        return ResponseEntity.ok(res);
    }

    @PostMapping("/{slug}/favorite")
    public ResponseEntity<ArticleDTO> markArticleAsFavorite(@PathVariable String slug, @RequestHeader(
        "Authorization") String auth) throws IOException {
        String username = userService.findUserByToken(auth).user().username();

        Article res = articleService.markArticleAsFavorite(slug, username);
        logger.debug("Set article: {} as favorite", slug);
        return ResponseEntity.ok(new ArticleDTO(res));
    }

    @DeleteMapping("/{slug}/favorite")
    public ResponseEntity<ArticleDTO> removeArticleFromFavorite(@PathVariable String slug, @RequestHeader(
        "Authorization") String auth) throws IOException {
        String username = userService.findUserByToken(auth).user().username();

        Article res = articleService.removeArticleFromFavorite(slug, username);
        logger.debug("Removed article: {} from favorites", slug);
        return ResponseEntity.ok(new ArticleDTO(res));
    }

    @PutMapping("/{slug}")
    public ResponseEntity<ArticleDTO> updateArticle(@RequestBody ArticleUpdateDTO req,
                                                    @PathVariable String slug, @RequestHeader(
        "Authorization") String auth) throws IOException {
        UserIdPair userPair = userService.findUserByToken(auth);
        Author author = new Author(userPair.user(), false);

        ArticleDTO res = articleService.updateArticle(req, slug, author);
        logger.debug("Updated article: {}", slug);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{slug}")
    public ResponseEntity<Void> deleteArticle(@PathVariable String slug,
                                              @RequestHeader("Authorization") String auth) throws IOException {
        UserIdPair userPair = userService.findUserByToken(auth);
        Author author = new Author(userPair.user(), false);

        articleService.deleteArticle(slug, author);
        logger.debug("Deleted article: {}", slug);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{slug}/comments")
    public ResponseEntity<CommentDTO> commentArticle(@PathVariable String slug,
                                                     @RequestBody CommentCreationDTO comment,
                                                     @RequestHeader("Authorization") String auth) throws IOException {
        // Checking if the article exists
        articleService.findArticleBySlug(slug);
        // Getting the comment's author
        User user = userService.findUserByToken(auth).user();

        Comment res = commentService.newComment(comment, slug, user);
        logger.debug("Commented article: {}", slug);
        return ResponseEntity.ok(new CommentDTO(res));
    }

    @GetMapping("/{slug}/comments")
    public ResponseEntity<CommentsDTO> allCommentsByArticle(@PathVariable String slug, @RequestHeader(
        value = "Authorization", required = false) String auth) throws IOException {
        Optional<User> user = Optional.empty();
        if (!isNullOrBlank(auth)) {
            user = Optional.of(userService.findUserByToken(auth).user());
        }
        CommentsDTO res = commentService.findAllCommentsByArticle(slug, user);
        logger.debug("Comments for article: {}", slug);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{slug}/comments/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable String slug, @PathVariable String commentId,
                                              @RequestHeader("Authorization") String auth) throws IOException {
        String username = userService.findUserByToken(auth).user().username();

        commentService.deleteComment(commentId, username);
        logger.debug("Deleted comment: {} from article {}", commentId, slug);
        return ResponseEntity.ok().build();
    }
}
