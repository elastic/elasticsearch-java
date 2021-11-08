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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TopMetricsAggregation
@JsonpDeserializable
public class TopMetricsAggregation extends MetricAggregationBase implements AggregationVariant {
	private final List<TopMetricsValue> metrics;

	@Nullable
	private final Integer size;

	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	// ---------------------------------------------------------------------------------------------

	private TopMetricsAggregation(Builder builder) {
		super(builder);

		this.metrics = ModelTypeHelper.unmodifiable(builder.metrics);
		this.size = builder.size;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);

	}

	public static TopMetricsAggregation of(Function<Builder, ObjectBuilder<TopMetricsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "top_metrics";
	}

	/**
	 * API name: {@code metrics}
	 */
	public final List<TopMetricsValue> metrics() {
		return this.metrics;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code sort}
	 */
	public final List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartArray();
			for (TopMetricsValue item0 : this.metrics) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ModelTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
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
		private Integer size;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		/**
		 * API name: {@code metrics}
		 */
		public final Builder metrics(@Nullable List<TopMetricsValue> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public final Builder metrics(TopMetricsValue... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		@SafeVarargs
		public final Builder metrics(Function<TopMetricsValue.Builder, ObjectBuilder<TopMetricsValue>>... fns) {
			this.metrics = new ArrayList<>(fns.length);
			for (Function<TopMetricsValue.Builder, ObjectBuilder<TopMetricsValue>> fn : fns) {
				this.metrics.add(fn.apply(new TopMetricsValue.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public final Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
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
			_checkSingleUse();

			return new TopMetricsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopMetricsAggregation}
	 */
	public static final JsonpDeserializer<TopMetricsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TopMetricsAggregation::setupTopMetricsAggregationDeserializer, Builder::build);

	protected static void setupTopMetricsAggregationDeserializer(
			DelegatingDeserializer<TopMetricsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(TopMetricsValue._DESERIALIZER), "metrics");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");

	}

}
