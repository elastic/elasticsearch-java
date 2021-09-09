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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch._global.search.InnerHits;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.NestedQuery
public final class NestedQuery extends QueryBase {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final InnerHits innerHits;

	private final String path;

	private final QueryContainer query;

	@Nullable
	private final JsonValue scoreMode;

	// ---------------------------------------------------------------------------------------------

	protected NestedQuery(Builder builder) {
		super(builder);
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.innerHits = builder.innerHits;
		this.path = Objects.requireNonNull(builder.path, "path");
		this.query = Objects.requireNonNull(builder.query, "query");
		this.scoreMode = builder.scoreMode;

	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code inner_hits}
	 */
	@Nullable
	public InnerHits innerHits() {
		return this.innerHits;
	}

	/**
	 * API name: {@code path}
	 */
	public String path() {
		return this.path;
	}

	/**
	 * API name: {@code query}
	 */
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code score_mode}
	 */
	@Nullable
	public JsonValue scoreMode() {
		return this.scoreMode;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {

			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.innerHits != null) {

			generator.writeKey("inner_hits");
			this.innerHits.toJsonp(generator, mapper);

		}

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("query");
		this.query.toJsonp(generator, mapper);

		if (this.scoreMode != null) {

			generator.writeKey("score_mode");
			generator.write(this.scoreMode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<NestedQuery> {
		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private InnerHits innerHits;

		private String path;

		private QueryContainer query;

		@Nullable
		private JsonValue scoreMode;

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public Builder innerHits(@Nullable InnerHits value) {
			this.innerHits = value;
			return this;
		}

		/**
		 * API name: {@code inner_hits}
		 */
		public Builder innerHits(Function<InnerHits.Builder, ObjectBuilder<InnerHits>> fn) {
			return this.innerHits(fn.apply(new InnerHits.Builder()).build());
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code score_mode}
		 */
		public Builder scoreMode(@Nullable JsonValue value) {
			this.scoreMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NestedQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedQuery build() {

			return new NestedQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NestedQuery
	 */
	public static final JsonpDeserializer<NestedQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NestedQuery::setupNestedQueryDeserializer);

	protected static void setupNestedQueryDeserializer(DelegatingDeserializer<NestedQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::innerHits, InnerHits.DESERIALIZER, "inner_hits");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::scoreMode, JsonpDeserializer.jsonValueDeserializer(), "score_mode");

	}

}
