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

package realworld.entity.comment;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;
import realworld.entity.user.Author;

import java.time.Instant;

@JsonTypeName("comment")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record CommentDAO(Integer id, Instant createdAt, Instant updatedAt, String body, Author author) {
    public CommentDAO(CommentEntity commentEntity) {
        this(commentEntity.id(), Instant.ofEpochMilli(commentEntity.createdAt()),Instant.ofEpochMilli(commentEntity.updatedAt()), commentEntity.body(), commentEntity.author());
    }
}
