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
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoostingQuery
public final class BoostingQuery extends QueryBase {
	@Nullable
	private final Number negativeBoost;

	@Nullable
	private final QueryContainer negative;

	@Nullable
	private final QueryContainer positive;

	// ---------------------------------------------------------------------------------------------

	protected BoostingQuery(Builder builder) {
		super(builder);
		this.negativeBoost = builder.negativeBoost;
		this.negative = builder.negative;
		this.positive = builder.positive;

	}

	/**
	 * API name: {@code negative_boost}
	 */
	@Nullable
	public Number negativeBoost() {
		return this.negativeBoost;
	}

	/**
	 * API name: {@code negative}
	 */
	@Nullable
	public QueryContainer negative() {
		return this.negative;
	}

	/**
	 * API name: {@code positive}
	 */
	@Nullable
	public QueryContainer positive() {
		return this.positive;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.negativeBoost != null) {

			generator.writeKey("negative_boost");
			generator.write(this.negativeBoost.doubleValue());

		}
		if (this.negative != null) {

			generator.writeKey("negative");
			this.negative.toJsonp(generator, mapper);

		}
		if (this.positive != null) {

			generator.writeKey("positive");
			this.positive.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoostingQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<BoostingQuery> {
		@Nullable
		private Number negativeBoost;

		@Nullable
		private QueryContainer negative;

		@Nullable
		private QueryContainer positive;

		/**
		 * API name: {@code negative_boost}
		 */
		public Builder negativeBoost(@Nullable Number value) {
			this.negativeBoost = value;
			return this;
		}

		/**
		 * API name: {@code negative}
		 */
		public Builder negative(@Nullable QueryContainer value) {
			this.negative = value;
			return this;
		}

		/**
		 * API name: {@code negative}
		 */
		public Builder negative(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.negative(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code positive}
		 */
		public Builder positive(@Nullable QueryContainer value) {
			this.positive = value;
			return this;
		}

		/**
		 * API name: {@code positive}
		 */
		public Builder positive(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.positive(fn.apply(new QueryContainer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BoostingQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoostingQuery build() {

			return new BoostingQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for BoostingQuery
	 */
	public static final JsonpDeserializer<BoostingQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BoostingQuery::setupBoostingQueryDeserializer);

	protected static void setupBoostingQueryDeserializer(DelegatingDeserializer<BoostingQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::negativeBoost, JsonpDeserializer.numberDeserializer(), "negative_boost");
		op.add(Builder::negative, QueryContainer.DESERIALIZER, "negative");
		op.add(Builder::positive, QueryContainer.DESERIALIZER, "positive");

	}

}
