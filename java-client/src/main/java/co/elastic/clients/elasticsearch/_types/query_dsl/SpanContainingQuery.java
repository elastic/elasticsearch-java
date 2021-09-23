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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanContainingQuery
public final class SpanContainingQuery extends QueryBase implements SpanQuery, Query {
	private final SpanQuery big;

	private final SpanQuery little;

	// ---------------------------------------------------------------------------------------------

	public SpanContainingQuery(Builder builder) {
		super(builder);

		this.big = Objects.requireNonNull(builder.big, "big");
		this.little = Objects.requireNonNull(builder.little, "little");

	}

	/**
	 * {@link SpanQuery}, {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "span_containing";
	}

	/**
	 * API name: {@code big}
	 */
	public SpanQuery big() {
		return this.big;
	}

	/**
	 * API name: {@code little}
	 */
	public SpanQuery little() {
		return this.little;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);

		generator.writeKey("big");
		this.big.serialize(generator, mapper);

		generator.writeKey("little");
		this.little.serialize(generator, mapper);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanContainingQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SpanContainingQuery> {
		private SpanQuery big;

		private SpanQuery little;

		/**
		 * API name: {@code big}
		 */
		public Builder big(SpanQuery value) {
			this.big = value;
			return this;
		}

		/**
		 * API name: {@code big}
		 */
		public Builder big(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.big(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * API name: {@code little}
		 */
		public Builder little(SpanQuery value) {
			this.little = value;
			return this;
		}

		/**
		 * API name: {@code little}
		 */
		public Builder little(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.little(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanContainingQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanContainingQuery build() {

			return new SpanContainingQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<SpanContainingQuery.Builder, SpanContainingQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(SpanContainingQuery::setupSpanContainingQueryDeserializer);

	protected static void setupSpanContainingQueryDeserializer(DelegatingDeserializer<SpanContainingQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::big, SpanQuery.DESERIALIZER, "big");
		op.add(Builder::little, SpanQuery.DESERIALIZER, "little");

	}

}
