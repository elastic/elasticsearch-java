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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.DocumentRating
public final class DocumentRating implements ToJsonp {
	private final String _id;

	private final String _index;

	private final Number rating;

	// ---------------------------------------------------------------------------------------------

	protected DocumentRating(Builder builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this.rating = Objects.requireNonNull(builder.rating, "rating");

	}

	/**
	 * The document ID.
	 *
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * The document’s index. For data streams, this should be the document’s backing
	 * index.
	 *
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * The document’s relevance with regard to this search request.
	 *
	 * API name: {@code rating}
	 */
	public Number rating() {
		return this.rating;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		generator.writeKey("rating");
		generator.write(this.rating.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentRating}.
	 */
	public static class Builder implements ObjectBuilder<DocumentRating> {
		private String _id;

		private String _index;

		private Number rating;

		/**
		 * The document ID.
		 *
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * The document’s index. For data streams, this should be the document’s backing
		 * index.
		 *
		 * API name: {@code _index}
		 */
		public Builder _index(String value) {
			this._index = value;
			return this;
		}

		/**
		 * The document’s relevance with regard to this search request.
		 *
		 * API name: {@code rating}
		 */
		public Builder rating(Number value) {
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
	 * Json deserializer for DocumentRating
	 */
	public static final JsonpDeserializer<DocumentRating> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DocumentRating::setupDocumentRatingDeserializer);

	protected static void setupDocumentRatingDeserializer(DelegatingDeserializer<DocumentRating.Builder> op) {

		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::rating, JsonpDeserializer.numberDeserializer(), "rating");

	}

}
