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

import co.elastic.clients.elasticsearch.core.search.InnerHits;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.HasChildQuery
@JsonpDeserializable
public final class HasChildQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final InnerHits innerHits;

	@Nullable
	private final Integer maxChildren;

	@Nullable
	private final Integer minChildren;

	private final Query query;

	@Nullable
	private final ChildScoreMode scoreMode;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	public HasChildQuery(Builder builder) {
		super(builder);

		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.innerHits = builder.innerHits;
		this.maxChildren = builder.maxChildren;
		this.minChildren = builder.minChildren;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.scoreMode = builder.scoreMode;
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	public HasChildQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "has_child";
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
	public Integer maxChildren() {
		return this.maxChildren;
	}

	/**
	 * API name: {@code min_children}
	 */
	@Nullable
	public Integer minChildren() {
		return this.minChildren;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code score_mode}
	 */
	@Nullable
	public ChildScoreMode scoreMode() {
		return this.scoreMode;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {

			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.innerHits != null) {

			generator.writeKey("inner_hits");
			this.innerHits.serialize(generator, mapper);

		}
		if (this.maxChildren != null) {

			generator.writeKey("max_children");
			generator.write(this.maxChildren);

		}
		if (this.minChildren != null) {

			generator.writeKey("min_children");
			generator.write(this.minChildren);

		}

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.scoreMode != null) {

			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}

		generator.writeKey("type");
		generator.write(this.type);

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
		private Integer maxChildren;

		@Nullable
		private Integer minChildren;

		private Query query;

		@Nullable
		private ChildScoreMode scoreMode;

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
		public Builder maxChildren(@Nullable Integer value) {
			this.maxChildren = value;
			return this;
		}

		/**
		 * API name: {@code min_children}
		 */
		public Builder minChildren(@Nullable Integer value) {
			this.minChildren = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code score_mode}
		 */
		public Builder scoreMode(@Nullable ChildScoreMode value) {
			this.scoreMode = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public Builder type(String value) {
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
	 * Json deserializer for {@link HasChildQuery}
	 */
	public static final JsonpDeserializer<HasChildQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HasChildQuery::setupHasChildQueryDeserializer, Builder::build);

	protected static void setupHasChildQueryDeserializer(DelegatingDeserializer<HasChildQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::innerHits, InnerHits._DESERIALIZER, "inner_hits");
		op.add(Builder::maxChildren, JsonpDeserializer.integerDeserializer(), "max_children");
		op.add(Builder::minChildren, JsonpDeserializer.integerDeserializer(), "min_children");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::scoreMode, ChildScoreMode._DESERIALIZER, "score_mode");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
