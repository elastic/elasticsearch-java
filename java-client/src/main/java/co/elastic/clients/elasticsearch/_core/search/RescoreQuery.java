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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.RescoreQuery
@JsonpDeserializable
public final class RescoreQuery implements JsonpSerializable {
	private final Query query;

	@Nullable
	private final Double queryWeight;

	@Nullable
	private final Double rescoreQueryWeight;

	@Nullable
	private final ScoreMode scoreMode;

	// ---------------------------------------------------------------------------------------------

	public RescoreQuery(Builder builder) {

		this.query = Objects.requireNonNull(builder.query, "rescore_query");
		this.queryWeight = builder.queryWeight;
		this.rescoreQueryWeight = builder.rescoreQueryWeight;
		this.scoreMode = builder.scoreMode;

	}

	public RescoreQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code rescore_query}
	 */
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code query_weight}
	 */
	@Nullable
	public Double queryWeight() {
		return this.queryWeight;
	}

	/**
	 * API name: {@code rescore_query_weight}
	 */
	@Nullable
	public Double rescoreQueryWeight() {
		return this.rescoreQueryWeight;
	}

	/**
	 * API name: {@code score_mode}
	 */
	@Nullable
	public ScoreMode scoreMode() {
		return this.scoreMode;
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

		generator.writeKey("rescore_query");
		this.query.serialize(generator, mapper);

		if (this.queryWeight != null) {

			generator.writeKey("query_weight");
			generator.write(this.queryWeight);

		}
		if (this.rescoreQueryWeight != null) {

			generator.writeKey("rescore_query_weight");
			generator.write(this.rescoreQueryWeight);

		}
		if (this.scoreMode != null) {

			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RescoreQuery}.
	 */
	public static class Builder implements ObjectBuilder<RescoreQuery> {
		private Query query;

		@Nullable
		private Double queryWeight;

		@Nullable
		private Double rescoreQueryWeight;

		@Nullable
		private ScoreMode scoreMode;

		/**
		 * Required - API name: {@code rescore_query}
		 */
		public Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code rescore_query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code query_weight}
		 */
		public Builder queryWeight(@Nullable Double value) {
			this.queryWeight = value;
			return this;
		}

		/**
		 * API name: {@code rescore_query_weight}
		 */
		public Builder rescoreQueryWeight(@Nullable Double value) {
			this.rescoreQueryWeight = value;
			return this;
		}

		/**
		 * API name: {@code score_mode}
		 */
		public Builder scoreMode(@Nullable ScoreMode value) {
			this.scoreMode = value;
			return this;
		}

		/**
		 * Builds a {@link RescoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RescoreQuery build() {

			return new RescoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RescoreQuery}
	 */
	public static final JsonpDeserializer<RescoreQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RescoreQuery::setupRescoreQueryDeserializer, Builder::build);

	protected static void setupRescoreQueryDeserializer(DelegatingDeserializer<RescoreQuery.Builder> op) {

		op.add(Builder::query, Query._DESERIALIZER, "rescore_query");
		op.add(Builder::queryWeight, JsonpDeserializer.doubleDeserializer(), "query_weight");
		op.add(Builder::rescoreQueryWeight, JsonpDeserializer.doubleDeserializer(), "rescore_query_weight");
		op.add(Builder::scoreMode, ScoreMode._DESERIALIZER, "score_mode");

	}

}
