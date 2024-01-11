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

package realworld.entity.article;

import realworld.entity.user.Author;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public record ArticleEntity(
        String slug,
        String title,
        String description,
        String body,
        List<String> tagList,
        Instant createdAt,
        Instant updatedAt,
        boolean favorited,
        int favoritesCount,
        List<String> favoritedBy,
        Author author) {

    public ArticleEntity(ArticleCreationDAO article, String slug, Instant createdAt, Instant updatedAt, Author author) {
        this(slug, article.title(), article.description(), article.body(), article.tagList(), createdAt, updatedAt, false, 0, new ArrayList<>(), author);
    }
}
