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

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TTestAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class TTestAggregation extends AggregationBase implements AggregationVariant {
	@Nullable
	private final TestPopulation a;

	@Nullable
	private final TestPopulation b;

	@Nullable
	private final TTestType type;

	// ---------------------------------------------------------------------------------------------

	private TTestAggregation(Builder builder) {
		super(builder);

		this.a = builder.a;
		this.b = builder.b;
		this.type = builder.type;

	}

	public static TTestAggregation of(Function<Builder, ObjectBuilder<TTestAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.TTest;
	}

	/**
	 * Test population A.
	 * <p>
	 * API name: {@code a}
	 */
	@Nullable
	public final TestPopulation a() {
		return this.a;
	}

	/**
	 * Test population B.
	 * <p>
	 * API name: {@code b}
	 */
	@Nullable
	public final TestPopulation b() {
		return this.b;
	}

	/**
	 * The type of test.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final TTestType type() {
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
		 * Test population A.
		 * <p>
		 * API name: {@code a}
		 */
		public final Builder a(@Nullable TestPopulation value) {
			this.a = value;
			return this;
		}

		/**
		 * Test population A.
		 * <p>
		 * API name: {@code a}
		 */
		public final Builder a(Function<TestPopulation.Builder, ObjectBuilder<TestPopulation>> fn) {
			return this.a(fn.apply(new TestPopulation.Builder()).build());
		}

		/**
		 * Test population B.
		 * <p>
		 * API name: {@code b}
		 */
		public final Builder b(@Nullable TestPopulation value) {
			this.b = value;
			return this;
		}

		/**
		 * Test population B.
		 * <p>
		 * API name: {@code b}
		 */
		public final Builder b(Function<TestPopulation.Builder, ObjectBuilder<TestPopulation>> fn) {
			return this.b(fn.apply(new TestPopulation.Builder()).build());
		}

		/**
		 * The type of test.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable TTestType value) {
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
			_checkSingleUse();

			return new TTestAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TTestAggregation}
	 */
	public static final JsonpDeserializer<TTestAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TTestAggregation::setupTTestAggregationDeserializer);

	protected static void setupTTestAggregationDeserializer(ObjectDeserializer<TTestAggregation.Builder> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(Builder::a, TestPopulation._DESERIALIZER, "a");
		op.add(Builder::b, TestPopulation._DESERIALIZER, "b");
		op.add(Builder::type, TTestType._DESERIALIZER, "type");

	}

}
