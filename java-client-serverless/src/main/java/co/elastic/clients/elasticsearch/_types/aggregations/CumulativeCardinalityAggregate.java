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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CumulativeCardinalityAggregate

/**
 * Result of the <code>cumulative_cardinality</code> aggregation
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CumulativeCardinalityAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class CumulativeCardinalityAggregate extends AggregateBase implements AggregateVariant {
	private final long value;

	@Nullable
	private final String valueAsString;

	// ---------------------------------------------------------------------------------------------

	private CumulativeCardinalityAggregate(Builder builder) {
		super(builder);

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");
		this.valueAsString = builder.valueAsString;

	}

	public static CumulativeCardinalityAggregate of(
			Function<Builder, ObjectBuilder<CumulativeCardinalityAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.SimpleLongValue;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final long value() {
		return this.value;
	}

	/**
	 * API name: {@code value_as_string}
	 */
	@Nullable
	public final String valueAsString() {
		return this.valueAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("value");
		generator.write(this.value);

		if (this.valueAsString != null) {
			generator.writeKey("value_as_string");
			generator.write(this.valueAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CumulativeCardinalityAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CumulativeCardinalityAggregate> {
		private Long value;

		@Nullable
		private String valueAsString;

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(long value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code value_as_string}
		 */
		public final Builder valueAsString(@Nullable String value) {
			this.valueAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CumulativeCardinalityAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CumulativeCardinalityAggregate build() {
			_checkSingleUse();

			return new CumulativeCardinalityAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CumulativeCardinalityAggregate}
	 */
	public static final JsonpDeserializer<CumulativeCardinalityAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CumulativeCardinalityAggregate::setupCumulativeCardinalityAggregateDeserializer);

	protected static void setupCumulativeCardinalityAggregateDeserializer(
			ObjectDeserializer<CumulativeCardinalityAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::value, JsonpDeserializer.longDeserializer(), "value");
		op.add(Builder::valueAsString, JsonpDeserializer.stringDeserializer(), "value_as_string");

	}

}
