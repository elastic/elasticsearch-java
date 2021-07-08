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
import java.lang.Number;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.HasChildQuery
public final class HasChildQuery extends QueryBase {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final InnerHits innerHits;

	@Nullable
	private final Number maxChildren;

	@Nullable
	private final Number minChildren;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final JsonValue scoreMode;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected HasChildQuery(Builder builder) {
		super(builder);
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.innerHits = builder.innerHits;
		this.maxChildren = builder.maxChildren;
		this.minChildren = builder.minChildren;
		this.query = builder.query;
		this.scoreMode = builder.scoreMode;
		this.type = builder.type;

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
	 * API name: {@code max_children}
	 */
	@Nullable
	public Number maxChildren() {
		return this.maxChildren;
	}

	/**
	 * API name: {@code min_children}
	 */
	@Nullable
	public Number minChildren() {
		return this.minChildren;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
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

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
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
		if (this.maxChildren != null) {

			generator.writeKey("max_children");
			generator.write(this.maxChildren.doubleValue());

		}
		if (this.minChildren != null) {

			generator.writeKey("min_children");
			generator.write(this.minChildren.doubleValue());

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.scoreMode != null) {

			generator.writeKey("score_mode");
			generator.write(this.scoreMode);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasChildQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<HasChildQuery> {
		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private InnerHits innerHits;

		@Nullable
		private Number maxChildren;

		@Nullable
		private Number minChildren;

		@Nullable
		private QueryContainer query;

		@Nullable
		private JsonValue scoreMode;

		@Nullable
		private String type;

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
		 * API name: {@code max_children}
		 */
		public Builder maxChildren(@Nullable Number value) {
			this.maxChildren = value;
			return this;
		}

		/**
		 * API name: {@code min_children}
		 */
		public Builder minChildren(@Nullable Number value) {
			this.minChildren = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
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

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HasChildQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasChildQuery build() {

			return new HasChildQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for HasChildQuery
	 */
	public static final JsonpDeserializer<HasChildQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HasChildQuery::setupHasChildQueryDeserializer);

	protected static void setupHasChildQueryDeserializer(DelegatingDeserializer<HasChildQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::innerHits, InnerHits.DESERIALIZER, "inner_hits");
		op.add(Builder::maxChildren, JsonpDeserializer.numberDeserializer(), "max_children");
		op.add(Builder::minChildren, JsonpDeserializer.numberDeserializer(), "min_children");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::scoreMode, JsonpDeserializer.jsonValueDeserializer(), "score_mode");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
