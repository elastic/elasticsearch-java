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
import realworld.entity.comment.Comment;
import realworld.entity.comment.CommentCreationDTO;
import realworld.entity.comment.CommentForListDTO;
import realworld.entity.comment.CommentsDTO;
import realworld.entity.exception.ResourceNotFoundException;
import realworld.entity.exception.UnauthorizedException;
import realworld.entity.user.Author;
import realworld.entity.user.User;

import java.io.IOException;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import static realworld.constant.Constants.COMMENTS;
import static realworld.utils.Utility.extractSource;

@Service
public class CommentService {

    private final ElasticsearchClient esClient;

    @Autowired
    public CommentService(ElasticsearchClient esClient) {
        this.esClient = esClient;
    }

    public Comment newComment(CommentCreationDTO commentDTO, String slug, User user) throws IOException {
        // assuming you cannot follow yourself
        Author commentAuthor = new Author(user, false);
        Long now = Instant.now().toEpochMilli();

        // pre-generating id since it's a field in the comment class
        Integer commentId = UUID.randomUUID().hashCode();
        Comment comment = new Comment(commentId, now, now, commentDTO.body(), commentAuthor,
                slug);

        IndexRequest<Comment> commentReq = IndexRequest.of((id -> id
                .index(COMMENTS)
                .refresh(Refresh.WaitFor)
                .document(comment)));


        esClient.index(commentReq);

        return comment;
    }

    public void deleteComment(String commentId, String slug, String username) throws IOException {

        // getting comment by id
        // using term query to match exactly the id
        SearchResponse<Comment> getComment = esClient.search(ss -> ss
                        .index(COMMENTS)
                        .query(q -> q
                                .term(t -> t
                                        .field("id")
                                        .value(commentId))
                        )
                , Comment.class);

        if (getComment.hits().hits().isEmpty()) {
            throw new ResourceNotFoundException("Comment not found");
        }
        Comment comment = extractSource(getComment);

        // checking if the comment is from the same author
        if (!username.equals(comment.author().username())) {
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

    public CommentsDTO findAllCommentsByArticle(String slug, Optional<User> user) throws IOException {
        SearchResponse<Comment> commentsByArticle = esClient.search(s -> s
                        .index(COMMENTS)
                        .query(q -> q
                                .term(t -> t
                                        .field("articleSlug.keyword")
                                        .value(slug))
                        )
                , Comment.class);

        return new CommentsDTO(commentsByArticle.hits().hits().stream()
                .map(x -> new CommentForListDTO(x.source()))
                .map(c -> {
                    if (user.isPresent()) {
                        boolean following = user.get().following().contains(c.author().username());
                        return new CommentForListDTO(c.id(), c.createdAt(), c.updatedAt(), c.body(),
                                new Author(c.author().username(), c.author().email(), c.author().bio(),
                                        following));
                    }
                    return c;
                })
                .collect(Collectors.toList()));
    }
}
