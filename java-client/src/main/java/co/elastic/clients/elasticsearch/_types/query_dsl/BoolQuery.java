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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoolQuery
@JsonpDeserializable
public class BoolQuery extends QueryBase implements QueryVariant {
	private final List<Query> filter;

	@Nullable
	private final String minimumShouldMatch;

	private final List<Query> must;

	private final List<Query> mustNot;

	private final List<Query> should;

	// ---------------------------------------------------------------------------------------------

	private BoolQuery(Builder builder) {
		super(builder);

		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.must = ModelTypeHelper.unmodifiable(builder.must);
		this.mustNot = ModelTypeHelper.unmodifiable(builder.mustNot);
		this.should = ModelTypeHelper.unmodifiable(builder.should);

	}

	public static BoolQuery of(Function<Builder, ObjectBuilder<BoolQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "bool";
	}

	/**
	 * API name: {@code filter}
	 */
	public final List<Query> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public final String minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code must}
	 */
	public final List<Query> must() {
		return this.must;
	}

	/**
	 * API name: {@code must_not}
	 */
	public final List<Query> mustNot() {
		return this.mustNot;
	}

	/**
	 * API name: {@code should}
	 */
	public final List<Query> should() {
		return this.should;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (Query item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.minimumShouldMatch != null) {
			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (ModelTypeHelper.isDefined(this.must)) {
			generator.writeKey("must");
			generator.writeStartArray();
			for (Query item0 : this.must) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.mustNot)) {
			generator.writeKey("must_not");
			generator.writeStartArray();
			for (Query item0 : this.mustNot) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.should)) {
			generator.writeKey("should");
			generator.writeStartArray();
			for (Query item0 : this.should) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoolQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<BoolQuery> {
		@Nullable
		private List<Query> filter;

		@Nullable
		private String minimumShouldMatch;

		@Nullable
		private List<Query> must;

		@Nullable
		private List<Query> mustNot;

		@Nullable
		private List<Query> should;

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable List<Query> value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(Query... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		@SafeVarargs
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>>... fns) {
			this.filter = new ArrayList<>(fns.length);
			for (Function<Query.Builder, ObjectBuilder<Query>> fn : fns) {
				this.filter.add(fn.apply(new Query.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public final Builder minimumShouldMatch(@Nullable String value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code must}
		 */
		public final Builder must(@Nullable List<Query> value) {
			this.must = value;
			return this;
		}

		/**
		 * API name: {@code must}
		 */
		public final Builder must(Query... value) {
			this.must = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code must}
		 */
		@SafeVarargs
		public final Builder must(Function<Query.Builder, ObjectBuilder<Query>>... fns) {
			this.must = new ArrayList<>(fns.length);
			for (Function<Query.Builder, ObjectBuilder<Query>> fn : fns) {
				this.must.add(fn.apply(new Query.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code must_not}
		 */
		public final Builder mustNot(@Nullable List<Query> value) {
			this.mustNot = value;
			return this;
		}

		/**
		 * API name: {@code must_not}
		 */
		public final Builder mustNot(Query... value) {
			this.mustNot = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code must_not}
		 */
		@SafeVarargs
		public final Builder mustNot(Function<Query.Builder, ObjectBuilder<Query>>... fns) {
			this.mustNot = new ArrayList<>(fns.length);
			for (Function<Query.Builder, ObjectBuilder<Query>> fn : fns) {
				this.mustNot.add(fn.apply(new Query.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code should}
		 */
		public final Builder should(@Nullable List<Query> value) {
			this.should = value;
			return this;
		}

		/**
		 * API name: {@code should}
		 */
		public final Builder should(Query... value) {
			this.should = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code should}
		 */
		@SafeVarargs
		public final Builder should(Function<Query.Builder, ObjectBuilder<Query>>... fns) {
			this.should = new ArrayList<>(fns.length);
			for (Function<Query.Builder, ObjectBuilder<Query>> fn : fns) {
				this.should.add(fn.apply(new Query.Builder()).build());
			}
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BoolQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoolQuery build() {
			_checkSingleUse();

			return new BoolQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BoolQuery}
	 */
	public static final JsonpDeserializer<BoolQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BoolQuery::setupBoolQueryDeserializer, Builder::build);

	protected static void setupBoolQueryDeserializer(DelegatingDeserializer<BoolQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::must, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "must");
		op.add(Builder::mustNot, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "must_not");
		op.add(Builder::should, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "should");

	}

}
