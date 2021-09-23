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
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoolQuery
public final class BoolQuery extends QueryBase implements Query {
	@Nullable
	private final List<Query> filter;

	@Nullable
	private final JsonValue minimumShouldMatch;

	@Nullable
	private final List<Query> must;

	@Nullable
	private final List<Query> mustNot;

	@Nullable
	private final List<Query> should;

	// ---------------------------------------------------------------------------------------------

	public BoolQuery(Builder builder) {
		super(builder);

		this.filter = builder.filter;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.must = builder.must;
		this.mustNot = builder.mustNot;
		this.should = builder.should;

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "bool";
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public List<Query> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public JsonValue minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code must}
	 */
	@Nullable
	public List<Query> must() {
		return this.must;
	}

	/**
	 * API name: {@code must_not}
	 */
	@Nullable
	public List<Query> mustNot() {
		return this.mustNot;
	}

	/**
	 * API name: {@code should}
	 */
	@Nullable
	public List<Query> should() {
		return this.should;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);
		if (this.filter != null) {

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
		if (this.must != null) {

			generator.writeKey("must");
			generator.writeStartArray();
			for (Query item0 : this.must) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mustNot != null) {

			generator.writeKey("must_not");
			generator.writeStartArray();
			for (Query item0 : this.mustNot) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.should != null) {

			generator.writeKey("should");
			generator.writeStartArray();
			for (Query item0 : this.should) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoolQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<BoolQuery> {
		@Nullable
		private List<Query> filter;

		@Nullable
		private JsonValue minimumShouldMatch;

		@Nullable
		private List<Query> must;

		@Nullable
		private List<Query> mustNot;

		@Nullable
		private List<Query> should;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable List<Query> value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Query... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Query value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * Set {@link #filter(List)} to a singleton list.
		 */
		public Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.addFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public Builder minimumShouldMatch(@Nullable JsonValue value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code must}
		 */
		public Builder must(@Nullable List<Query> value) {
			this.must = value;
			return this;
		}

		/**
		 * API name: {@code must}
		 */
		public Builder must(Query... value) {
			this.must = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #must(List)}, creating the list if needed.
		 */
		public Builder addMust(Query value) {
			if (this.must == null) {
				this.must = new ArrayList<>();
			}
			this.must.add(value);
			return this;
		}

		/**
		 * Set {@link #must(List)} to a singleton list.
		 */
		public Builder must(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.must(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Add a value to {@link #must(List)}, creating the list if needed.
		 */
		public Builder addMust(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.addMust(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code must_not}
		 */
		public Builder mustNot(@Nullable List<Query> value) {
			this.mustNot = value;
			return this;
		}

		/**
		 * API name: {@code must_not}
		 */
		public Builder mustNot(Query... value) {
			this.mustNot = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #mustNot(List)}, creating the list if needed.
		 */
		public Builder addMustNot(Query value) {
			if (this.mustNot == null) {
				this.mustNot = new ArrayList<>();
			}
			this.mustNot.add(value);
			return this;
		}

		/**
		 * Set {@link #mustNot(List)} to a singleton list.
		 */
		public Builder mustNot(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.mustNot(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Add a value to {@link #mustNot(List)}, creating the list if needed.
		 */
		public Builder addMustNot(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.addMustNot(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code should}
		 */
		public Builder should(@Nullable List<Query> value) {
			this.should = value;
			return this;
		}

		/**
		 * API name: {@code should}
		 */
		public Builder should(Query... value) {
			this.should = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #should(List)}, creating the list if needed.
		 */
		public Builder addShould(Query value) {
			if (this.should == null) {
				this.should = new ArrayList<>();
			}
			this.should.add(value);
			return this;
		}

		/**
		 * Set {@link #should(List)} to a singleton list.
		 */
		public Builder should(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.should(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Add a value to {@link #should(List)}, creating the list if needed.
		 */
		public Builder addShould(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.addShould(fn.apply(new Query.Builder()).build());
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

			return new BoolQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<BoolQuery.Builder, BoolQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(BoolQuery::setupBoolQueryDeserializer);

	protected static void setupBoolQueryDeserializer(DelegatingDeserializer<BoolQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query.DESERIALIZER), "filter");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::must, JsonpDeserializer.arrayDeserializer(Query.DESERIALIZER), "must");
		op.add(Builder::mustNot, JsonpDeserializer.arrayDeserializer(Query.DESERIALIZER), "must_not");
		op.add(Builder::should, JsonpDeserializer.arrayDeserializer(Query.DESERIALIZER), "should");

	}

}
