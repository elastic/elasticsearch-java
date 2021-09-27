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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TTestAggregation
@JsonpDeserializable
public final class TTestAggregation extends AggregationBase implements AggregationVariant {
	@Nullable
	private final TestPopulation a;

	@Nullable
	private final TestPopulation b;

	@Nullable
	private final TTestType type;

	// ---------------------------------------------------------------------------------------------

	public TTestAggregation(Builder builder) {
		super(builder);

		this.a = builder.a;
		this.b = builder.b;
		this.type = builder.type;

	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "t_test";
	}

	/**
	 * API name: {@code a}
	 */
	@Nullable
	public TestPopulation a() {
		return this.a;
	}

	/**
	 * API name: {@code b}
	 */
	@Nullable
	public TestPopulation b() {
		return this.b;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public TTestType type() {
		return this.type;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.a != null) {

			generator.writeKey("a");
			this.a.serialize(generator, mapper);

		}
		if (this.b != null) {

			generator.writeKey("b");
			this.b.serialize(generator, mapper);

		}
		if (this.type != null) {

			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TTestAggregation}.
	 */
	public static class Builder extends AggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TTestAggregation> {
		@Nullable
		private TestPopulation a;

		@Nullable
		private TestPopulation b;

		@Nullable
		private TTestType type;

		/**
		 * API name: {@code a}
		 */
		public Builder a(@Nullable TestPopulation value) {
			this.a = value;
			return this;
		}

		/**
		 * API name: {@code a}
		 */
		public Builder a(Function<TestPopulation.Builder, ObjectBuilder<TestPopulation>> fn) {
			return this.a(fn.apply(new TestPopulation.Builder()).build());
		}

		/**
		 * API name: {@code b}
		 */
		public Builder b(@Nullable TestPopulation value) {
			this.b = value;
			return this;
		}

		/**
		 * API name: {@code b}
		 */
		public Builder b(Function<TestPopulation.Builder, ObjectBuilder<TestPopulation>> fn) {
			return this.b(fn.apply(new TestPopulation.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable TTestType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TTestAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TTestAggregation build() {

			return new TTestAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TTestAggregation}
	 */
	public static final JsonpDeserializer<TTestAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TTestAggregation::setupTTestAggregationDeserializer, Builder::build);

	protected static void setupTTestAggregationDeserializer(DelegatingDeserializer<TTestAggregation.Builder> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(Builder::a, TestPopulation._DESERIALIZER, "a");
		op.add(Builder::b, TestPopulation._DESERIALIZER, "b");
		op.add(Builder::type, TTestType._DESERIALIZER, "type");

	}

}
