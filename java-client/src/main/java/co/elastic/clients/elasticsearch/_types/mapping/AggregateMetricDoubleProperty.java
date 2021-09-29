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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.AggregateMetricDoubleProperty
@JsonpDeserializable
public final class AggregateMetricDoubleProperty extends PropertyBase implements PropertyVariant {
	private final String defaultMetric;

	private final List<String> metrics;

	// ---------------------------------------------------------------------------------------------

	public AggregateMetricDoubleProperty(Builder builder) {
		super(builder);

		this.defaultMetric = Objects.requireNonNull(builder.defaultMetric, "default_metric");
		this.metrics = ModelTypeHelper.unmodifiableNonNull(builder.metrics, "metrics");

	}

	public AggregateMetricDoubleProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "aggregate_metric_double";
	}

	/**
	 * API name: {@code default_metric}
	 */
	public String defaultMetric() {
		return this.defaultMetric;
	}

	/**
	 * API name: {@code metrics}
	 */
	public List<String> metrics() {
		return this.metrics;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "aggregate_metric_double");
		super.serializeInternal(generator, mapper);

		generator.writeKey("default_metric");
		generator.write(this.defaultMetric);

		generator.writeKey("metrics");
		generator.writeStartArray();
		for (String item0 : this.metrics) {
			generator.write(item0);

		}
		generator.writeEnd();

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

		/**
		 * API name: {@code default_metric}
		 */
		public Builder defaultMetric(String value) {
			this.defaultMetric = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(List<String> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(String... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed. 4
		 */
		public Builder addMetrics(String value) {
			if (this.metrics == null) {
				this.metrics = new ArrayList<>();
			}
			this.metrics.add(value);
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

			return new AggregateMetricDoubleProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregateMetricDoubleProperty}
	 */
	public static final JsonpDeserializer<AggregateMetricDoubleProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, AggregateMetricDoubleProperty::setupAggregateMetricDoublePropertyDeserializer,
			Builder::build);

	protected static void setupAggregateMetricDoublePropertyDeserializer(
			DelegatingDeserializer<AggregateMetricDoubleProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::defaultMetric, JsonpDeserializer.stringDeserializer(), "default_metric");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"metrics");

		op.ignore("type");
	}

}
