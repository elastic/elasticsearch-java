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
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery.Builder;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.TermsQueryField;
import co.elastic.clients.elasticsearch.core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.util.NamedValue;
import com.github.slugify.Slugify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.document.article.*;
import realworld.document.exception.ResourceAlreadyExistsException;
import realworld.document.exception.ResourceNotFoundException;
import realworld.document.exception.UnauthorizedException;
import realworld.document.user.Author;
import realworld.document.user.User;
import realworld.utils.ArticleIdPair;

import java.io.IOException;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import static realworld.constant.Constants.ARTICLES;
import static realworld.constant.Constants.COMMENTS;
import static realworld.utils.Utility.*;

@Service
public class ArticleService {

    private final ElasticsearchClient esClient;

    @Autowired
    public ArticleService(ElasticsearchClient esClient) {
        this.esClient = esClient;
    }

    /**
     * Creates a new article and saves it into the articles index.
     * <p>
     * The
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-refresh.html"> refresh </a>
     * parameter, which controls when the changes to the index will become visible for search operations,
     * is set
     * as "wait_for",
     * meaning that the indexing request will return after the next refresh. Usually this is not recommended,
     * as it slows down the application, but in this case it's required since the frontends will try to
     * retrieve
     * the article immediately after its creation.
     *
     * @return the new article.
     */
    public Article newArticle(ArticleCreationDTO articleDTO, Author author) throws IOException {

        // Checking if slug would be unique
        String slug = generateAndCheckSlug(articleDTO.title());

        Instant now = Instant.now();
        Article article = new Article(articleDTO, slug, now, now, author);

        IndexRequest<Article> articleReq = IndexRequest.of((id -> id
            .index(ARTICLES)
            .refresh(Refresh.WaitFor)
            .document(article)));

        esClient.index(articleReq);

        return article;
    }

    /**
     * Simple term query (see {@link UserService#findUserByUsername(String)}) to find an article
     * given its unique slug.
     *
     * @return a pair containing the article and its id,
     */
    public ArticleIdPair findArticleBySlug(String slug) throws IOException {

        SearchResponse<Article> getArticle = esClient.search(ss -> ss
                .index(ARTICLES)
                .query(q -> q
                    .term(t -> t
                        .field("slug.keyword")
                        .value(slug))
                )
            , Article.class);

        if (getArticle.hits().hits().isEmpty()) {
            return null;
        }
        return new ArticleIdPair(extractSource(getArticle), extractId(getArticle));
    }

    /**
     * See {@link ArticleService#updateArticle(String, Article)} (String, User)}
     * <p>
     * Updates an article, checking if the author is the same and if the new title's slug would be unique.
     *
     * @return the updated user.
     */
    public ArticleDTO updateArticle(ArticleUpdateDTO article, String slug, Author author) throws IOException {

        // Getting original article from slug
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
            .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        String id = articlePair.id();
        Article oldArticle = articlePair.article();

        // Checking if author is the same
        if (!oldArticle.author().username().equals(author.username())) {
            throw new UnauthorizedException("Cannot modify article from another author");
        }

        String newSlug = slug;
        // If title is being changed, checking if new slug would be unique
        if (!isNullOrBlank(article.title()) && !article.title().equals(oldArticle.title())) {
            newSlug = generateAndCheckSlug(article.title());
        }

        Instant updatedAt = Instant.now();

        // Null/blank check for every optional field
        Article updatedArticle = new Article(newSlug,
            isNullOrBlank(article.title()) ? oldArticle.title() : article.title(),
            isNullOrBlank(article.description()) ? oldArticle.description() : article.description(),
            isNullOrBlank(article.body()) ? oldArticle.body() : article.body(),
            oldArticle.tagList(), oldArticle.createdAt(),
            updatedAt, oldArticle.favorited(), oldArticle.favoritesCount(),
            oldArticle.favoritedBy(), oldArticle.author());

        updateArticle(id, updatedArticle);
        return new ArticleDTO(updatedArticle);
    }

    /**
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update.html
     * "> Updates</a> an article, given the updated object and its unique id.
     */
    private void updateArticle(String id, Article updatedArticle) throws IOException {
        UpdateResponse<Article> upArticle = esClient.update(up -> up
                .index(ARTICLES)
                .id(id)
                .doc(updatedArticle)
            , Article.class);
        if (!upArticle.result().name().equals("Updated")) {
            throw new RuntimeException("Article update failed");
        }
    }

    /**
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete.html
     * "> Deletes</a> an article, using the slug to identify it, and all of its comments.
     * <p>
     * Delete queries are very similar to search queries,
     * here a term query (see {@link UserService#findUserByUsername(String)}) is used to match the
     * correct article.
     * <p>
     * The refresh value (see {@link ArticleService#newArticle(ArticleCreationDTO, Author)}) is
     * set as "wait_for" for both delete queries, since the frontend will perform a get operation
     * immediately after. The syntax for setting it as "wait_for" is different from the index operation,
     * but the result is the same.
     */
    public void deleteArticle(String slug, Author author) throws IOException {

        // Getting article from slug
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
            .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        Article article = articlePair.article();

        // Checking if author is the same
        if (!article.author().username().equals(author.username())) {
            throw new UnauthorizedException("Cannot delete article from another author");
        }

        DeleteByQueryResponse deleteArticle = esClient.deleteByQuery(d -> d
            .index(ARTICLES)
            .waitForCompletion(true)
            .refresh(true)
            .query(q -> q
                .term(t -> t
                    .field("slug.keyword")
                    .value(slug))
            ));
        if (deleteArticle.deleted() < 1) {
            throw new RuntimeException("Failed to delete article");
        }

        // Delete every comment to the article, using a term query
        // that will match all comments with the same articleSlug
        DeleteByQueryResponse deleteCommentsByArticle = esClient.deleteByQuery(d -> d
            .index(COMMENTS)
            .waitForCompletion(true)
            .refresh(true)
            .query(q -> q
                .term(t -> t
                    .field("articleSlug.keyword")
                    .value(slug))
            ));
    }

    /**
     * Adds the requesting user to the article's favoritedBy list.
     *
     * @return the target article.
     */
    public Article markArticleAsFavorite(String slug, String username) throws IOException {
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
            .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        String id = articlePair.id();
        Article article = articlePair.article();

        // Checking if article was already marked as favorite
        if (article.favoritedBy().contains(username)) {
            return article;
        }

        article.favoritedBy().add(username);
        Article updatedArticle = new Article(article.slug(), article.title(),
            article.description(),
            article.body(), article.tagList(), article.createdAt(), article.updatedAt(),
            true, article.favoritesCount() + 1, article.favoritedBy(), article.author());

        updateArticle(id, updatedArticle);
        return updatedArticle;
    }

    /**
     * Removes the requesting user from the article's favoritedBy list.
     *
     * @return the target article.
     */
    public Article removeArticleFromFavorite(String slug, String username) throws IOException {
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
            .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        String id = articlePair.id();
        Article article = articlePair.article();

        // Checking if article was not marked as favorite before
        if (!article.favoritedBy().contains(username)) {
            return article;
        }

        article.favoritedBy().remove(username);
        int favoriteCount = article.favoritesCount() - 1;
        boolean favorited = article.favorited();
        if (favoriteCount == 0) {
            favorited = false;
        }

        Article updatedArticle = new Article(article.slug(), article.title(),
            article.description(),
            article.body(), article.tagList(), article.createdAt(), article.updatedAt(), favorited,
            favoriteCount, article.favoritedBy(), article.author());

        updateArticle(id, updatedArticle);
        return updatedArticle;
    }

    /**
     * Builds a search query using the filters the user is passing to retrieve all the matching articles.
     * <p>
     * Since all the parameters are optional, the query must be build conditionally, adding one parameter
     * at a time to the "conditions" array.
     * Using a
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-match-query.html"> match </a>
     * query instead of a
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-match-query.html"> term </a>
     * query to allow the use of a single word for searching phrases,
     * for example, filtering for articles with the "cat" tag will also return articles with the "cat food"
     * tag.
     * <p>
     * The articles are then sorted by the time they were last updated.
     *
     * @return a list containing all articles, filtered.
     */
    public ArticlesDTO findArticles(String tag, String author, String favorited, Integer limit,
                                    Integer offset,
                                    Optional<User> user) throws IOException {
        List<Query> conditions = new ArrayList<>();

        if (!isNullOrBlank(tag)) {
            conditions.add(new Builder()
                .field("tagList")
                .query(tag).build()._toQuery());
        }
        if (!isNullOrBlank(author)) {
            conditions.add(new Builder()
                .field("author.username")
                .query(author).build()._toQuery());
        }
        // Alternative equivalent syntax to build the match query without using the Builder explicitly
        if (!isNullOrBlank(favorited)) {
            conditions.add(MatchQuery.of(mq -> mq
                    .field("favoritedBy")
                    .query(favorited))
                ._toQuery());
        }

        Query query = new Query.Builder().bool(b -> b.should(conditions)).build();

        SearchResponse<Article> getArticle = esClient.search(ss -> ss
                .index(ARTICLES)
                .size(limit) // how many results to return
                .from(offset) // starting point
                .query(query)
                .sort(srt -> srt
                    .field(fld -> fld
                        .field("updatedAt")
                        .order(SortOrder.Desc))) // last updated first
            , Article.class);

        // Making the output adhere to the API specification
        return new ArticlesDTO(getArticle.hits().hits()
            .stream()
            .map(Hit::source)
            // If tag specified, put that tag first in the array
            .peek(a -> {
                if (!isNullOrBlank(tag) && a.tagList().contains(tag)) {
                    Collections.swap(a.tagList(), a.tagList().indexOf(tag), 0);
                }
            })
            .map(ArticleForListDTO::new)
            // If auth was provided, filling the "following" field of "Author" accordingly
            .map(a -> {
                if (user.isPresent()) {
                    boolean following = user.get().following().contains(a.author().username());
                    return new ArticleForListDTO(a, new Author(a.author().username(),
                        a.author().email(), a.author().bio(), following));
                }
                return a;
            })
            .collect(Collectors.toList()), getArticle.hits().hits().size());
    }

    /**
     * Searches the article index for articles created by multiple users,
     * using a
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-terms-query.html"> terms </a> query,
     * which works like a
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-term-query.html"> term </a> query
     * that can match multiple values for the same field.
     * <p>
     * The fields of the nested object "author" are easily accessible using the dot notation, for example
     * "author.username".
     * <p>
     * The articles are sorted by the time they were last updated.
     *
     * @return a list of articles from followed users.
     */
    public ArticlesDTO generateArticleFeed(User user) throws IOException {
        // Preparing authors filter from user data
        List<FieldValue> authorsFilter = user.following().stream()
            .map(FieldValue::of).toList();

        SearchResponse<Article> articlesByAuthors = esClient.search(ss -> ss
                .index(ARTICLES)
                .query(q -> q
                    .bool(b -> b
                        .filter(f -> f
                            .terms(t -> t
                                .field("author.username.keyword")
                                .terms(TermsQueryField.of(tqf -> tqf.value(authorsFilter)))
                            ))))
                .sort(srt -> srt
                    .field(fld -> fld
                        .field("updatedAt")
                        .order(SortOrder.Desc)))
            , Article.class);

        return new ArticlesDTO(articlesByAuthors.hits().hits()
            .stream()
            .map(Hit::source)
            .map(ArticleForListDTO::new)
            // Filling the "following" field of "Author" accordingly
            .map(a -> {
                boolean following = user.following().contains(a.author().username());
                return new ArticleForListDTO(a, new Author(a.author().username(),
                    a.author().email(), a.author().bio(), following));
            })
            .collect(Collectors.toList()), articlesByAuthors.hits().hits().size());
    }


    /**
     * Searches the article index to retrieve a list of each distinct tag, using an
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-aggregations.html"> aggregation </a>,
     * more specifically a
     * <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-aggregations-bucket-terms-aggregation.html"> terms aggregation </a>
     * <p>
     * The resulting list of tags is sorted by document count (how many times they appear in different
     * documents).
     *
     * @return a list of all tags.
     */
    public TagsDTO findAllTags() throws IOException {

        // If alphabetical order is preferred, use "_key" instead
        NamedValue<SortOrder> sort = new NamedValue<>("_count", SortOrder.Desc);

        SearchResponse<Aggregation> aggregateTags = esClient.search(s -> s
                .index(ARTICLES)
                .size(0) // this is needed avoid returning the search result, which is not necessary here
                .aggregations("tags", agg -> agg
                    .terms(ter -> ter
                        .field("tagList.keyword")
                        .order(sort))
                ),
            Aggregation.class
        );

        return new TagsDTO(aggregateTags.aggregations().get("tags")
            .sterms().buckets()
            .array().stream()
            .map(st -> st.key().stringValue())
            .collect(Collectors.toList())
        );
    }

    /**
     * Uses the Slugify library to generate the slug of the input string, then checks its uniqueness.
     *
     * @return the "slugified" string.
     */
    private String generateAndCheckSlug(String title) throws IOException {
        String slug = Slugify.builder().build().slugify(title);
        if (Objects.nonNull(findArticleBySlug(slug))) {
            throw new ResourceAlreadyExistsException("Article slug already exists, please change the title");
        }
        return slug;
    }

}
