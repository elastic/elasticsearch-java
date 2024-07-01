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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.aggregations.WeightedAverageAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.WeightedAverageAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class WeightedAverageAggregation extends AggregationBase implements AggregationVariant, JsonpSerializable {
	@Nullable
	private final String format;

	@Nullable
	private final WeightedAverageValue value;

	@Nullable
	private final ValueType valueType;

	@Nullable
	private final WeightedAverageValue weight;

	// ---------------------------------------------------------------------------------------------

	private WeightedAverageAggregation(Builder builder) {

		this.format = builder.format;
		this.value = builder.value;
		this.valueType = builder.valueType;
		this.weight = builder.weight;

	}

	public static WeightedAverageAggregation of(Function<Builder, ObjectBuilder<WeightedAverageAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.WeightedAvg;
	}

	/**
	 * A numeric response formatter.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * Configuration for the field that provides the values.
	 * <p>
	 * API name: {@code value}
	 */
	@Nullable
	public final WeightedAverageValue value() {
		return this.value;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public final ValueType valueType() {
		return this.valueType;
	}

	/**
	 * Configuration for the field or script that provides the weights.
	 * <p>
	 * API name: {@code weight}
	 */
	@Nullable
	public final WeightedAverageValue weight() {
		return this.weight;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.value != null) {
			generator.writeKey("value");
			this.value.serialize(generator, mapper);

		}
		if (this.valueType != null) {
			generator.writeKey("value_type");
			this.valueType.serialize(generator, mapper);
		}
		if (this.weight != null) {
			generator.writeKey("weight");
			this.weight.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WeightedAverageAggregation}.
	 */

	public static class Builder extends AggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WeightedAverageAggregation> {
		@Nullable
		private String format;

		@Nullable
		private WeightedAverageValue value;

		@Nullable
		private ValueType valueType;

		@Nullable
		private WeightedAverageValue weight;

		/**
		 * A numeric response formatter.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * Configuration for the field that provides the values.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(@Nullable WeightedAverageValue value) {
			this.value = value;
			return this;
		}

		/**
		 * Configuration for the field that provides the values.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(Function<WeightedAverageValue.Builder, ObjectBuilder<WeightedAverageValue>> fn) {
			return this.value(fn.apply(new WeightedAverageValue.Builder()).build());
		}

		/**
		 * API name: {@code value_type}
		 */
		public final Builder valueType(@Nullable ValueType value) {
			this.valueType = value;
			return this;
		}

		/**
		 * Configuration for the field or script that provides the weights.
		 * <p>
		 * API name: {@code weight}
		 */
		public final Builder weight(@Nullable WeightedAverageValue value) {
			this.weight = value;
			return this;
		}

		/**
		 * Configuration for the field or script that provides the weights.
		 * <p>
		 * API name: {@code weight}
		 */
		public final Builder weight(Function<WeightedAverageValue.Builder, ObjectBuilder<WeightedAverageValue>> fn) {
			return this.weight(fn.apply(new WeightedAverageValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WeightedAverageAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WeightedAverageAggregation build() {
			_checkSingleUse();

			return new WeightedAverageAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WeightedAverageAggregation}
	 */
	public static final JsonpDeserializer<WeightedAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WeightedAverageAggregation::setupWeightedAverageAggregationDeserializer);

	protected static void setupWeightedAverageAggregationDeserializer(
			ObjectDeserializer<WeightedAverageAggregation.Builder> op) {

		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::value, WeightedAverageValue._DESERIALIZER, "value");
		op.add(Builder::valueType, ValueType._DESERIALIZER, "value_type");
		op.add(Builder::weight, WeightedAverageValue._DESERIALIZER, "weight");

	}

}
