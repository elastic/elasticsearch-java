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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoolQuery
public final class BoolQuery extends QueryBase {
	@Nullable
	private final List<QueryContainer> filter;

	@Nullable
	private final JsonValue minimumShouldMatch;

	@Nullable
	private final List<QueryContainer> must;

	@Nullable
	private final List<QueryContainer> mustNot;

	@Nullable
	private final List<QueryContainer> should;

	// ---------------------------------------------------------------------------------------------

	protected BoolQuery(Builder builder) {
		super(builder);
		this.filter = builder.filter;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.must = builder.must;
		this.mustNot = builder.mustNot;
		this.should = builder.should;

	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public List<QueryContainer> filter() {
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
	public List<QueryContainer> must() {
		return this.must;
	}

	/**
	 * API name: {@code must_not}
	 */
	@Nullable
	public List<QueryContainer> mustNot() {
		return this.mustNot;
	}

	/**
	 * API name: {@code should}
	 */
	@Nullable
	public List<QueryContainer> should() {
		return this.should;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartArray();
			for (QueryContainer item0 : this.filter) {
				item0.toJsonp(generator, mapper);

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
			for (QueryContainer item0 : this.must) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mustNot != null) {

			generator.writeKey("must_not");
			generator.writeStartArray();
			for (QueryContainer item0 : this.mustNot) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.should != null) {

			generator.writeKey("should");
			generator.writeStartArray();
			for (QueryContainer item0 : this.should) {
				item0.toJsonp(generator, mapper);

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
		private List<QueryContainer> filter;

		@Nullable
		private JsonValue minimumShouldMatch;

		@Nullable
		private List<QueryContainer> must;

		@Nullable
		private List<QueryContainer> mustNot;

		@Nullable
		private List<QueryContainer> should;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable List<QueryContainer> value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(QueryContainer... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(QueryContainer value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * Set {@link #filter(List)} to a singleton list.
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.addFilter(fn.apply(new QueryContainer.Builder()).build());
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
		public Builder must(@Nullable List<QueryContainer> value) {
			this.must = value;
			return this;
		}

		/**
		 * API name: {@code must}
		 */
		public Builder must(QueryContainer... value) {
			this.must = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #must(List)}, creating the list if needed.
		 */
		public Builder addMust(QueryContainer value) {
			if (this.must == null) {
				this.must = new ArrayList<>();
			}
			this.must.add(value);
			return this;
		}

		/**
		 * Set {@link #must(List)} to a singleton list.
		 */
		public Builder must(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.must(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #must(List)}, creating the list if needed.
		 */
		public Builder addMust(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.addMust(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code must_not}
		 */
		public Builder mustNot(@Nullable List<QueryContainer> value) {
			this.mustNot = value;
			return this;
		}

		/**
		 * API name: {@code must_not}
		 */
		public Builder mustNot(QueryContainer... value) {
			this.mustNot = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #mustNot(List)}, creating the list if needed.
		 */
		public Builder addMustNot(QueryContainer value) {
			if (this.mustNot == null) {
				this.mustNot = new ArrayList<>();
			}
			this.mustNot.add(value);
			return this;
		}

		/**
		 * Set {@link #mustNot(List)} to a singleton list.
		 */
		public Builder mustNot(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.mustNot(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #mustNot(List)}, creating the list if needed.
		 */
		public Builder addMustNot(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.addMustNot(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code should}
		 */
		public Builder should(@Nullable List<QueryContainer> value) {
			this.should = value;
			return this;
		}

		/**
		 * API name: {@code should}
		 */
		public Builder should(QueryContainer... value) {
			this.should = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #should(List)}, creating the list if needed.
		 */
		public Builder addShould(QueryContainer value) {
			if (this.should == null) {
				this.should = new ArrayList<>();
			}
			this.should.add(value);
			return this;
		}

		/**
		 * Set {@link #should(List)} to a singleton list.
		 */
		public Builder should(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.should(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #should(List)}, creating the list if needed.
		 */
		public Builder addShould(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.addShould(fn.apply(new QueryContainer.Builder()).build());
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

	/**
	 * Json deserializer for BoolQuery
	 */
	public static final JsonpDeserializer<BoolQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BoolQuery::setupBoolQueryDeserializer);

	protected static void setupBoolQueryDeserializer(DelegatingDeserializer<BoolQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(QueryContainer.DESERIALIZER), "filter");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::must, JsonpDeserializer.arrayDeserializer(QueryContainer.DESERIALIZER), "must");
		op.add(Builder::mustNot, JsonpDeserializer.arrayDeserializer(QueryContainer.DESERIALIZER), "must_not");
		op.add(Builder::should, JsonpDeserializer.arrayDeserializer(QueryContainer.DESERIALIZER), "should");

	}

}
