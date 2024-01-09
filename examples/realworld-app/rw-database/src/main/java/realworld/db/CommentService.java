package realworld.db;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.entity.article.ArticleCreationDAO;
import realworld.entity.article.ArticleEntity;
import realworld.entity.comment.CommentCreationDAO;
import realworld.entity.comment.CommentEntity;
import realworld.entity.comment.CommentForListDAO;
import realworld.entity.comment.Comments;
import realworld.entity.exception.ResourceNotFoundException;
import realworld.entity.exception.UnauthorizedException;
import realworld.entity.user.Author;
import realworld.entity.user.UserDAO;
import realworld.entity.user.UserEntity;

import java.io.IOException;
import java.time.Instant;
import java.util.UUID;
import java.util.stream.Collectors;

import static realworld.utils.Utility.extractSource;

@Service
public class CommentService {

    private ElasticsearchClient esClient;
    private UserService userService;
    private ArticleService articleService;

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
        SearchResponse<UserEntity> commentUser = userService.getUserEntityFromToken(auth);
        // assuming you cannot follow yourself
        Author commentAuthor = new Author(extractSource(commentUser), false);
        Instant now = Instant.now();

        // pre-generating id since it's a field in the comment class
        Integer commentId = UUID.randomUUID().hashCode();
        CommentEntity commentEntity = new CommentEntity(commentId, now, now, comment.body(), commentAuthor, slug);

        IndexRequest<CommentEntity> commentReq = IndexRequest.of((id -> id
                .index("comments")
                .document(commentEntity)));

        esClient.index(commentReq);

        return commentEntity;
    }

    public void deleteComment(String commentId, String slug, String auth) throws IOException {

        // getting comment by id
        // using term query to match exactly the id
        SearchResponse<CommentEntity> getComment = esClient.search(ss -> ss
                        .index("comments")
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
        SearchResponse<UserEntity> askingUser = userService.getUserEntityFromToken(auth);
        if(!extractSource(askingUser).username().equals(comment.author().username())){
            throw new UnauthorizedException("Cannot delete someone else's comment");
        }

        // checking that the slug matches the one received
        if (!extractSource(getComment).articleSlug().equals(slug)) {
            throw new RuntimeException("Incorrect article slug");
        }

        // deleting comment by id
        DeleteByQueryResponse deleteComment = esClient.deleteByQuery(ss -> ss
                .index("comments")
                .query(q -> q
                        .term(t -> t
                                .field("id")
                                .value(commentId))
                ));
        if (deleteComment.deleted() < 1) {
            throw new RuntimeException("Failed to delete article");
        }
    }

    public Comments allCommentsByArticle(String slug) throws IOException {
        SearchResponse<CommentEntity> commentsByArticle = esClient.search(d -> d
                .index("comments")
                .query(q -> q
                        .term(t -> t
                                .field("articleSlug")
                                .value(slug))
                )
                , CommentEntity.class);

        return new Comments(commentsByArticle.hits().hits().stream()
                .map(x -> new CommentForListDAO(x.source()))
                .collect(Collectors.toList()));
    }
}
