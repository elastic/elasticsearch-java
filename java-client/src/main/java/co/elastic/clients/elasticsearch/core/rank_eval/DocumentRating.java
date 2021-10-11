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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.DocumentRating
@JsonpDeserializable
public final class DocumentRating implements JsonpSerializable {
	private final String id;

	private final String index;

	private final int rating;

	// ---------------------------------------------------------------------------------------------

	public DocumentRating(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.rating = Objects.requireNonNull(builder.rating, "rating");

	}

	public DocumentRating(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The document ID.
	 * <p>
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - The document’s index. For data streams, this should be the
	 * document’s backing index.
	 * <p>
	 * API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - The document’s relevance with regard to this search request.
	 * <p>
	 * API name: {@code rating}
	 */
	public int rating() {
		return this.rating;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("rating");
		generator.write(this.rating);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentRating}.
	 */
	public static class Builder implements ObjectBuilder<DocumentRating> {
		private String id;

		private String index;

		private Integer rating;

		/**
		 * Required - The document ID.
		 * <p>
		 * API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The document’s index. For data streams, this should be the
		 * document’s backing index.
		 * <p>
		 * API name: {@code _index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - The document’s relevance with regard to this search request.
		 * <p>
		 * API name: {@code rating}
		 */
		public Builder rating(int value) {
			this.rating = value;
			return this;
		}

		/**
		 * Builds a {@link DocumentRating}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentRating build() {

			return new DocumentRating(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DocumentRating}
	 */
	public static final JsonpDeserializer<DocumentRating> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DocumentRating::setupDocumentRatingDeserializer, Builder::build);

	protected static void setupDocumentRatingDeserializer(DelegatingDeserializer<DocumentRating.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::rating, JsonpDeserializer.integerDeserializer(), "rating");

	}

}
