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

package realworld.db;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch.core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.entity.comment.CommentCreationDAO;
import realworld.entity.comment.CommentEntity;
import realworld.entity.comment.CommentForListDAO;
import realworld.entity.comment.Comments;
import realworld.entity.exception.ResourceNotFoundException;
import realworld.entity.exception.UnauthorizedException;
import realworld.entity.user.Author;
import realworld.entity.user.UserEntity;

import java.io.IOException;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import static realworld.constant.Constants.COMMENTS;
import static realworld.utils.Utility.extractSource;
import static realworld.utils.Utility.isNullOrBlank;

@Service
public class CommentService {

    private final ElasticsearchClient esClient;
    private final UserService userService;
    private final ArticleService articleService;

    @Autowired
    public CommentService(ElasticsearchClient esClient, UserService userService, ArticleService articleService) {
        this.esClient = esClient;
        this.userService = userService;
        this.articleService = articleService;
    }

    public CommentEntity newComment(CommentCreationDAO comment, String slug, String auth) throws IOException {

        // checking if the article exists
        articleService.getArticleBySlug(slug);

        // getting the comment's author
        UserEntity commentUser = userService.getUserEntityFromToken(auth);
        // assuming you cannot follow yourself
        Author commentAuthor = new Author(commentUser, false);
        Long now = Instant.now().toEpochMilli();

        // pre-generating id since it's a field in the comment class
        Integer commentId = UUID.randomUUID().hashCode();
        CommentEntity commentEntity = new CommentEntity(commentId, now, now, comment.body(), commentAuthor, slug);

        IndexRequest<CommentEntity> commentReq = IndexRequest.of((id -> id
                .index(COMMENTS)
                .refresh(Refresh.WaitFor)
                .document(commentEntity)));

        esClient.index(commentReq);

        return commentEntity;
    }

    public void deleteComment(String commentId, String slug, String auth) throws IOException {

        // getting comment by id
        // using term query to match exactly the id
        SearchResponse<CommentEntity> getComment = esClient.search(ss -> ss
                        .index(COMMENTS)
                        .query(q -> q
                                .term(t -> t
                                        .field("id")
                                        .value(commentId))
                        )
                , CommentEntity.class);

        if (getComment.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Comment not found");
        }
        CommentEntity comment = extractSource(getComment);

        // checking if the comment is from the same author
        UserEntity askingUser = userService.getUserEntityFromToken(auth);
        if (!askingUser.username().equals(comment.author().username())) {
            throw new UnauthorizedException("Cannot delete someone else's comment");
        }

        // checking that the slug matches the one received
        if (!extractSource(getComment).articleSlug().equals(slug)) {
            throw new RuntimeException("Incorrect article slug");
        }

        // deleting comment by id
        DeleteByQueryResponse deleteComment = esClient.deleteByQuery(ss -> ss
                .index(COMMENTS)
                .waitForCompletion(true)
                .refresh(true)
                .query(q -> q
                        .term(t -> t
                                .field("id")
                                .value(commentId))
                ));
        if (deleteComment.deleted() < 1) {
            throw new RuntimeException("Failed to delete article");
        }
    }

    public Comments allCommentsByArticle(String slug, String auth) throws IOException {
        UserEntity user = null;
        if (!isNullOrBlank(auth)) {
            user = userService.getUserEntityFromToken(auth);
        }
        SearchResponse<CommentEntity> commentsByArticle = esClient.search(s -> s
                        .index(COMMENTS)
                        .query(q -> q
                                .term(t -> t
                                        .field("articleSlug.keyword")
                                        .value(slug))
                        )
                , CommentEntity.class);

        UserEntity finalUser = user;
        return new Comments(commentsByArticle.hits().hits().stream()
                .map(x -> new CommentForListDAO(x.source()))
                .map(c -> {
                    if (Objects.nonNull(finalUser)) {
                        boolean following = finalUser.following().contains(c.author().username());
                        return new CommentForListDAO(c.id(),c.createdAt(),c.updatedAt(),c.body(),
                                new Author(c.author().username(), c.author().email(), c.author().bio(), following));
                    }
                    return c;
                })
                .collect(Collectors.toList()));
    }
}
