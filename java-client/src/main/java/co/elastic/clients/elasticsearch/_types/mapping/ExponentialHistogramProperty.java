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

package co.elastic.clients.elasticsearch._types.mapping;

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

// typedef: _types.mapping.ExponentialHistogramProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.ExponentialHistogramProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExponentialHistogramProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final TimeSeriesMetricType timeSeriesMetric;

	// ---------------------------------------------------------------------------------------------

	private ExponentialHistogramProperty(Builder builder) {
		super(builder);

		this.timeSeriesMetric = builder.timeSeriesMetric;

	}

	public static ExponentialHistogramProperty of(Function<Builder, ObjectBuilder<ExponentialHistogramProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.ExponentialHistogram;
	}

	/**
	 * API name: {@code time_series_metric}
	 */
	@Nullable
	public final TimeSeriesMetricType timeSeriesMetric() {
		return this.timeSeriesMetric;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "exponential_histogram");
		super.serializeInternal(generator, mapper);
		if (this.timeSeriesMetric != null) {
			generator.writeKey("time_series_metric");
			this.timeSeriesMetric.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExponentialHistogramProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExponentialHistogramProperty> {
		@Nullable
		private TimeSeriesMetricType timeSeriesMetric;

		public Builder() {
		}
		private Builder(ExponentialHistogramProperty instance) {
			this.timeSeriesMetric = instance.timeSeriesMetric;

		}
		/**
		 * API name: {@code time_series_metric}
		 */
		public final Builder timeSeriesMetric(@Nullable TimeSeriesMetricType value) {
			this.timeSeriesMetric = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExponentialHistogramProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExponentialHistogramProperty build() {
			_checkSingleUse();

			return new ExponentialHistogramProperty(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExponentialHistogramProperty}
	 */
	public static final JsonpDeserializer<ExponentialHistogramProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExponentialHistogramProperty::setupExponentialHistogramPropertyDeserializer);

	protected static void setupExponentialHistogramPropertyDeserializer(
			ObjectDeserializer<ExponentialHistogramProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::timeSeriesMetric, TimeSeriesMetricType._DESERIALIZER, "time_series_metric");

		op.ignore("type");
	}

}
