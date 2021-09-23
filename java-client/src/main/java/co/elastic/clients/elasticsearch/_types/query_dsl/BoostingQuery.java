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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoostingQuery
public final class BoostingQuery extends QueryBase implements Query {
	private final Number negativeBoost;

	private final Query negative;

	private final Query positive;

	// ---------------------------------------------------------------------------------------------

	public BoostingQuery(Builder builder) {
		super(builder);

		this.negativeBoost = Objects.requireNonNull(builder.negativeBoost, "negative_boost");
		this.negative = Objects.requireNonNull(builder.negative, "negative");
		this.positive = Objects.requireNonNull(builder.positive, "positive");

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "boosting";
	}

	/**
	 * API name: {@code negative_boost}
	 */
	public Number negativeBoost() {
		return this.negativeBoost;
	}

	/**
	 * API name: {@code negative}
	 */
	public Query negative() {
		return this.negative;
	}

	/**
	 * API name: {@code positive}
	 */
	public Query positive() {
		return this.positive;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);

		generator.writeKey("negative_boost");
		generator.write(this.negativeBoost.doubleValue());

		generator.writeKey("negative");
		this.negative.serialize(generator, mapper);

		generator.writeKey("positive");
		this.positive.serialize(generator, mapper);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoostingQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<BoostingQuery> {
		private Number negativeBoost;

		private Query negative;

		private Query positive;

		/**
		 * API name: {@code negative_boost}
		 */
		public Builder negativeBoost(Number value) {
			this.negativeBoost = value;
			return this;
		}

		/**
		 * API name: {@code negative}
		 */
		public Builder negative(Query value) {
			this.negative = value;
			return this;
		}

		/**
		 * API name: {@code negative}
		 */
		public Builder negative(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.negative(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code positive}
		 */
		public Builder positive(Query value) {
			this.positive = value;
			return this;
		}

		/**
		 * API name: {@code positive}
		 */
		public Builder positive(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.positive(fn.apply(new Query.Builder()).build());
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

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<BoostingQuery.Builder, BoostingQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(BoostingQuery::setupBoostingQueryDeserializer);

	protected static void setupBoostingQueryDeserializer(DelegatingDeserializer<BoostingQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::negativeBoost, JsonpDeserializer.numberDeserializer(), "negative_boost");
		op.add(Builder::negative, Query.DESERIALIZER, "negative");
		op.add(Builder::positive, Query.DESERIALIZER, "positive");

	}

}
