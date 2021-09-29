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

package co.elastic.clients.elasticsearch._core.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalRequestItem
@JsonpDeserializable
public final class RankEvalRequestItem implements JsonpSerializable {
	private final String id;

	@Nullable
	private final RankEvalQuery request;

	private final List<DocumentRating> ratings;

	@Nullable
	private final String templateId;

	@Nullable
	private final Map<String, JsonData> params;

	// ---------------------------------------------------------------------------------------------

	public RankEvalRequestItem(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.request = builder.request;
		this.ratings = ModelTypeHelper.unmodifiableNonNull(builder.ratings, "ratings");
		this.templateId = builder.templateId;
		this.params = ModelTypeHelper.unmodifiable(builder.params);

	}

	public RankEvalRequestItem(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The search request’s ID, used to group result details later.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * The query being evaluated.
	 * <p>
	 * API name: {@code request}
	 */
	@Nullable
	public RankEvalQuery request() {
		return this.request;
	}

	/**
	 * List of document ratings
	 * <p>
	 * API name: {@code ratings}
	 */
	public List<DocumentRating> ratings() {
		return this.ratings;
	}

	/**
	 * The search template Id
	 * <p>
	 * API name: {@code template_id}
	 */
	@Nullable
	public String templateId() {
		return this.templateId;
	}

	/**
	 * The search template parameters.
	 * <p>
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, JsonData> params() {
		return this.params;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.request != null) {

			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}

		generator.writeKey("ratings");
		generator.writeStartArray();
		for (DocumentRating item0 : this.ratings) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.templateId != null) {

			generator.writeKey("template_id");
			generator.write(this.templateId);

		}
		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalRequestItem}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalRequestItem> {
		private String id;

		@Nullable
		private RankEvalQuery request;

		private List<DocumentRating> ratings;

		@Nullable
		private String templateId;

		@Nullable
		private Map<String, JsonData> params;

		/**
		 * The search request’s ID, used to group result details later.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The query being evaluated.
		 * <p>
		 * API name: {@code request}
		 */
		public Builder request(@Nullable RankEvalQuery value) {
			this.request = value;
			return this;
		}

		/**
		 * The query being evaluated.
		 * <p>
		 * API name: {@code request}
		 */
		public Builder request(Function<RankEvalQuery.Builder, ObjectBuilder<RankEvalQuery>> fn) {
			return this.request(fn.apply(new RankEvalQuery.Builder()).build());
		}

		/**
		 * List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public Builder ratings(List<DocumentRating> value) {
			this.ratings = value;
			return this;
		}

		/**
		 * List of document ratings
		 * <p>
		 * API name: {@code ratings}
		 */
		public Builder ratings(DocumentRating... value) {
			this.ratings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ratings(List)}, creating the list if needed. 4
		 */
		public Builder addRatings(DocumentRating value) {
			if (this.ratings == null) {
				this.ratings = new ArrayList<>();
			}
			this.ratings.add(value);
			return this;
		}

		/**
		 * Set {@link #ratings(List)} to a singleton list.
		 */
		public Builder ratings(Function<DocumentRating.Builder, ObjectBuilder<DocumentRating>> fn) {
			return this.ratings(fn.apply(new DocumentRating.Builder()).build());
		}

		/**
		 * Add a value to {@link #ratings(List)}, creating the list if needed. 5
		 */
		public Builder addRatings(Function<DocumentRating.Builder, ObjectBuilder<DocumentRating>> fn) {
			return this.addRatings(fn.apply(new DocumentRating.Builder()).build());
		}

		/**
		 * The search template Id
		 * <p>
		 * API name: {@code template_id}
		 */
		public Builder templateId(@Nullable String value) {
			this.templateId = value;
			return this;
		}

		/**
		 * The search template parameters.
		 * <p>
		 * API name: {@code params}
		 */
		public Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public Builder putParams(String key, JsonData value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link RankEvalRequestItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalRequestItem build() {

			return new RankEvalRequestItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalRequestItem}
	 */
	public static final JsonpDeserializer<RankEvalRequestItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankEvalRequestItem::setupRankEvalRequestItemDeserializer, Builder::build);

	protected static void setupRankEvalRequestItemDeserializer(DelegatingDeserializer<RankEvalRequestItem.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::request, RankEvalQuery._DESERIALIZER, "request");
		op.add(Builder::ratings, JsonpDeserializer.arrayDeserializer(DocumentRating._DESERIALIZER), "ratings");
		op.add(Builder::templateId, JsonpDeserializer.stringDeserializer(), "template_id");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");

	}

}
