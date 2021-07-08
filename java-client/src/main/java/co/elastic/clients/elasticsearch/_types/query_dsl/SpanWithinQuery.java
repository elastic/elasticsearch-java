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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanWithinQuery
public final class SpanWithinQuery extends QueryBase {
	@Nullable
	private final SpanQuery big;

	@Nullable
	private final SpanQuery little;

	// ---------------------------------------------------------------------------------------------

	protected SpanWithinQuery(Builder builder) {
		super(builder);
		this.big = builder.big;
		this.little = builder.little;

	}

	/**
	 * API name: {@code big}
	 */
	@Nullable
	public SpanQuery big() {
		return this.big;
	}

	/**
	 * API name: {@code little}
	 */
	@Nullable
	public SpanQuery little() {
		return this.little;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.big != null) {

			generator.writeKey("big");
			this.big.toJsonp(generator, mapper);

		}
		if (this.little != null) {

			generator.writeKey("little");
			this.little.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanWithinQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanWithinQuery> {
		@Nullable
		private SpanQuery big;

		@Nullable
		private SpanQuery little;

		/**
		 * API name: {@code big}
		 */
		public Builder big(@Nullable SpanQuery value) {
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
		public Builder little(@Nullable SpanQuery value) {
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
		 * Builds a {@link SpanWithinQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanWithinQuery build() {

			return new SpanWithinQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SpanWithinQuery
	 */
	public static final JsonpDeserializer<SpanWithinQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SpanWithinQuery::setupSpanWithinQueryDeserializer);

	protected static void setupSpanWithinQueryDeserializer(DelegatingDeserializer<SpanWithinQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::big, SpanQuery.DESERIALIZER, "big");
		op.add(Builder::little, SpanQuery.DESERIALIZER, "little");

	}

}
