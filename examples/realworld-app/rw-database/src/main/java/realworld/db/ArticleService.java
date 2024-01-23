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
import realworld.entity.article.*;
import realworld.entity.exception.ResourceAlreadyExistsException;
import realworld.entity.exception.ResourceNotFoundException;
import realworld.entity.exception.UnauthorizedException;
import realworld.entity.user.Author;
import realworld.entity.user.User;
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
     *
     * @return {@link Article}
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

    public ArticleIdPair findArticleBySlug(String slug) throws IOException {

        // using term query to match exactly the slug
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

    public ArticleDTO updateArticle(ArticleUpdateDTO article, String slug, Author author) throws IOException {

        // getting original article from slug
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
                .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        String id = articlePair.id();
        Article oldArticle = articlePair.article();

        // checking if author is the same
        if (!oldArticle.author().username().equals(author.username())) {
            throw new UnauthorizedException("Cannot modify article from another author");
        }

        String newSlug = slug;
        // if title is being changed, checking if new slug would be unique
        if (!isNullOrBlank(article.title()) && !article.title().equals(oldArticle.title())) {
            newSlug = generateAndCheckSlug(article.title());
        }

        Instant updatedAt = Instant.now();

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

    public void deleteArticle(String slug, Author author) throws IOException {

        // getting article from slug
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
                .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        Article article = articlePair.article();

        // checking if author is the same
        if (!article.author().username().equals(author.username())) {
            throw new UnauthorizedException("Cannot delete article from another author");
        }

        // the delete query is very similar to the search query
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

        // also delete every comment to the article, using a term query that will match all comments with
        // the same articleSlug
        DeleteByQueryResponse deleteCommentsByArticle = esClient.deleteByQuery(d -> d
                .index(COMMENTS)
                .waitForCompletion(true)
                .refresh(true)
                .query(q -> q
                        .term(t -> t
                                .field("articleSlug.keyword")
                                .value(slug))
                ));
        if (deleteCommentsByArticle.deleted() < 1) {
            throw new RuntimeException("Failed to delete comments after article deletion");
        }
    }

    public Article markArticleAsFavorite(String slug, String username) throws IOException {
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
                .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        String id = articlePair.id();
        Article article = articlePair.article();

        // checking if article was already favorited
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

    public Article removeArticleFromFavorite(String slug, String username) throws IOException {
        ArticleIdPair articlePair = Optional.ofNullable(findArticleBySlug(slug))
                .orElseThrow(() -> new ResourceNotFoundException("Article not found"));
        String id = articlePair.id();
        Article article = articlePair.article();

        // checking if article was not marked as favorite before
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

    public ArticlesDTO findArticles(String tag, String author, String favorited, Integer limit,
                                    Integer offset,
                                    Optional<User> user) throws IOException {
        List<Query> match = new ArrayList<>();
        // since all the parameters for this query are optional, the query must be build conditionally
        // using a "match" query instead of a "term" query to allow the use a single word for searching
        // phrases
        // for example, filtering for articles with the "cat" tag will also return articles with the "cat
        // food" tag
        if (!isNullOrBlank(tag)) {
            match.add(new Builder()
                    .field("tagList")
                    .query(tag).build()._toQuery());
        }
        if (!isNullOrBlank(author)) {
            match.add(new Builder()
                    .field("author.username")
                    .query(author).build()._toQuery());
        }
        if (!isNullOrBlank(favorited)) {
            match.add(new Builder()
                    .field("favoritedBy")
                    .query(favorited).build()._toQuery());
        }

        Query query = new Query.Builder().bool(b -> b.should(match)).build();

        SearchResponse<Article> getArticle = esClient.search(ss -> ss
                        .index(ARTICLES)
                        .size(limit)
                        .from(offset)
                        .query(query)
                        .sort(srt -> srt
                                .field(fld -> fld
                                        .field("updatedAt")
                                        .order(SortOrder.Desc)))
                , Article.class);

        return new ArticlesDTO(getArticle.hits().hits()
                .stream()
                .map(Hit::source)
                // if tag specified, put that tag first in the array
                .peek(a -> {
                    if (!isNullOrBlank(tag) && a.tagList().contains(tag)) {
                        Collections.swap(a.tagList(), a.tagList().indexOf(tag), 0);
                    }
                })
                .map(ArticleForListDTO::new)
                // if auth provided, filling the "following" field of "Author" accordingly
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

    public ArticlesDTO generateArticleFeed(User user) throws IOException {
        // preparing authors filter from user data
        List<FieldValue> authorsFilter = user.following().stream()
                .map(FieldValue::of).toList();

        // a terms query can be used to query for multiple values, like authors.
        // the sort options is used afterward to determine which field determines the output order
        // note how the nested class "author" is easily accessible with the use of the dot notation
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
                .collect(Collectors.toList()), articlesByAuthors.hits().hits().size());
    }


    public TagsDTO findAllTags() throws IOException {

        // since the API definition doesn't specify the return order of tags, sorting by document count
        // using "_count"
        // if alphabetical order is preferred, use "_key" instead
        NamedValue<SortOrder> sort = new NamedValue<>("_count", SortOrder.Desc);

        // using a term aggregation is the simplest way to find every distinct tag for each article
        SearchResponse<Aggregation> aggregateTags = esClient.search(s -> s
                        .index(ARTICLES)
                        .size(0) // this is to only return aggregation result, and not also search result
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

    private String generateAndCheckSlug(String title) throws IOException {
        String slug = Slugify.builder().build().slugify(title);
        if (Objects.nonNull(findArticleBySlug(slug))) {
            throw new ResourceAlreadyExistsException("Article slug already exists, please change the title");
        }
        return slug;
    }

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

}
