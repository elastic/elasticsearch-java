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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.DisMaxQuery
public final class DisMaxQuery extends QueryBase implements Query {
	private final List<Query> queries;

	@Nullable
	private final Number tieBreaker;

	// ---------------------------------------------------------------------------------------------

	public DisMaxQuery(Builder builder) {
		super(builder);

		this.queries = Objects.requireNonNull(builder.queries, "queries");
		this.tieBreaker = builder.tieBreaker;

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "dis_max";
	}

	/**
	 * API name: {@code queries}
	 */
	public List<Query> queries() {
		return this.queries;
	}

	/**
	 * API name: {@code tie_breaker}
	 */
	@Nullable
	public Number tieBreaker() {
		return this.tieBreaker;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);

		generator.writeKey("queries");
		generator.writeStartArray();
		for (Query item0 : this.queries) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.tieBreaker != null) {

			generator.writeKey("tie_breaker");
			generator.write(this.tieBreaker.doubleValue());

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DisMaxQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<DisMaxQuery> {
		private List<Query> queries;

		@Nullable
		private Number tieBreaker;

		/**
		 * API name: {@code queries}
		 */
		public Builder queries(List<Query> value) {
			this.queries = value;
			return this;
		}

		/**
		 * API name: {@code queries}
		 */
		public Builder queries(Query... value) {
			this.queries = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #queries(List)}, creating the list if needed.
		 */
		public Builder addQueries(Query value) {
			if (this.queries == null) {
				this.queries = new ArrayList<>();
			}
			this.queries.add(value);
			return this;
		}

		/**
		 * Set {@link #queries(List)} to a singleton list.
		 */
		public Builder queries(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.queries(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Add a value to {@link #queries(List)}, creating the list if needed.
		 */
		public Builder addQueries(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.addQueries(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code tie_breaker}
		 */
		public Builder tieBreaker(@Nullable Number value) {
			this.tieBreaker = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DisMaxQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DisMaxQuery build() {

			return new DisMaxQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<DisMaxQuery.Builder, DisMaxQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(DisMaxQuery::setupDisMaxQueryDeserializer);

	protected static void setupDisMaxQueryDeserializer(DelegatingDeserializer<DisMaxQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::queries, JsonpDeserializer.arrayDeserializer(Query.DESERIALIZER), "queries");
		op.add(Builder::tieBreaker, JsonpDeserializer.numberDeserializer(), "tie_breaker");

	}

}
