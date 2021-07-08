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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TopMetricsAggregation
public final class TopMetricsAggregation extends MetricAggregationBase {
	@Nullable
	private final List<TopMetricsValue> metrics;

	@Nullable
	private final Number size;

	@Nullable
	private final List<JsonValue> sort;

	// ---------------------------------------------------------------------------------------------

	protected TopMetricsAggregation(Builder builder) {
		super(builder);
		this.metrics = builder.metrics;
		this.size = builder.size;
		this.sort = builder.sort;

	}

	/**
	 * API name: {@code metrics}
	 */
	@Nullable
	public List<TopMetricsValue> metrics() {
		return this.metrics;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue> sort() {
		return this.sort;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.metrics != null) {

			generator.writeKey("metrics");
			generator.writeStartArray();
			for (TopMetricsValue item0 : this.metrics) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopMetricsAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TopMetricsAggregation> {
		@Nullable
		private List<TopMetricsValue> metrics;

		@Nullable
		private Number size;

		@Nullable
		private List<JsonValue> sort;

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(@Nullable List<TopMetricsValue> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(TopMetricsValue... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(TopMetricsValue value) {
			if (this.metrics == null) {
				this.metrics = new ArrayList<>();
			}
			this.metrics.add(value);
			return this;
		}

		/**
		 * Set {@link #metrics(List)} to a singleton list.
		 */
		public Builder metrics(Function<TopMetricsValue.Builder, ObjectBuilder<TopMetricsValue>> fn) {
			return this.metrics(fn.apply(new TopMetricsValue.Builder()).build());
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(Function<TopMetricsValue.Builder, ObjectBuilder<TopMetricsValue>> fn) {
			return this.addMetrics(fn.apply(new TopMetricsValue.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopMetricsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopMetricsAggregation build() {

			return new TopMetricsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TopMetricsAggregation
	 */
	public static final JsonpDeserializer<TopMetricsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TopMetricsAggregation::setupTopMetricsAggregationDeserializer);

	protected static void setupTopMetricsAggregationDeserializer(
			DelegatingDeserializer<TopMetricsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(TopMetricsValue.DESERIALIZER), "metrics");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

}
