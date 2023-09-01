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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.AggregateMetricDoubleProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.AggregateMetricDoubleProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregateMetricDoubleProperty extends PropertyBase implements PropertyVariant {
	private final String defaultMetric;

	private final List<String> metrics;

	@Nullable
	private final TimeSeriesMetricType timeSeriesMetric;

	// ---------------------------------------------------------------------------------------------

	private AggregateMetricDoubleProperty(Builder builder) {
		super(builder);

		this.defaultMetric = ApiTypeHelper.requireNonNull(builder.defaultMetric, this, "defaultMetric");
		this.metrics = ApiTypeHelper.unmodifiableRequired(builder.metrics, this, "metrics");
		this.timeSeriesMetric = builder.timeSeriesMetric;

	}

	public static AggregateMetricDoubleProperty of(Function<Builder, ObjectBuilder<AggregateMetricDoubleProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.AggregateMetricDouble;
	}

	/**
	 * Required - API name: {@code default_metric}
	 */
	public final String defaultMetric() {
		return this.defaultMetric;
	}

	/**
	 * Required - API name: {@code metrics}
	 */
	public final List<String> metrics() {
		return this.metrics;
	}

	/**
	 * API name: {@code time_series_metric}
	 */
	@Nullable
	public final TimeSeriesMetricType timeSeriesMetric() {
		return this.timeSeriesMetric;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "aggregate_metric_double");
		super.serializeInternal(generator, mapper);
		generator.writeKey("default_metric");
		generator.write(this.defaultMetric);

		if (ApiTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartArray();
			for (String item0 : this.metrics) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.timeSeriesMetric != null) {
			generator.writeKey("time_series_metric");
			this.timeSeriesMetric.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregateMetricDoubleProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AggregateMetricDoubleProperty> {
		private String defaultMetric;

		private List<String> metrics;

		@Nullable
		private TimeSeriesMetricType timeSeriesMetric;

		/**
		 * Required - API name: {@code default_metric}
		 */
		public final Builder defaultMetric(String value) {
			this.defaultMetric = value;
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>metrics</code>.
		 */
		public final Builder metrics(List<String> list) {
			this.metrics = _listAddAll(this.metrics, list);
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds one or more values to <code>metrics</code>.
		 */
		public final Builder metrics(String value, String... values) {
			this.metrics = _listAdd(this.metrics, value, values);
			return this;
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
		 * Builds a {@link AggregateMetricDoubleProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregateMetricDoubleProperty build() {
			_checkSingleUse();

			return new AggregateMetricDoubleProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregateMetricDoubleProperty}
	 */
	public static final JsonpDeserializer<AggregateMetricDoubleProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregateMetricDoubleProperty::setupAggregateMetricDoublePropertyDeserializer);

	protected static void setupAggregateMetricDoublePropertyDeserializer(
			ObjectDeserializer<AggregateMetricDoubleProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::defaultMetric, JsonpDeserializer.stringDeserializer(), "default_metric");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"metrics");
		op.add(Builder::timeSeriesMetric, TimeSeriesMetricType._DESERIALIZER, "time_series_metric");

		op.ignore("type");
	}

}
