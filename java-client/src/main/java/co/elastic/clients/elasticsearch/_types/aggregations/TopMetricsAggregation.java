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

import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.List;
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

// typedef: _types.aggregations.TopMetricsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TopMetricsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopMetricsAggregation extends MetricAggregationBase implements AggregationVariant {
	private final List<TopMetricsValue> metrics;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	// ---------------------------------------------------------------------------------------------

	private TopMetricsAggregation(Builder builder) {
		super(builder);

		this.metrics = ApiTypeHelper.unmodifiable(builder.metrics);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static TopMetricsAggregation of(Function<Builder, ObjectBuilder<TopMetricsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.TopMetrics;
	}

	/**
	 * The fields of the top document to return.
	 * <p>
	 * API name: {@code metrics}
	 */
	public final List<TopMetricsValue> metrics() {
		return this.metrics;
	}

	/**
	 * The number of top documents from which to return metrics.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * The sort order of the documents.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.metrics)) {
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
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

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
		private List<SortOptions> sort;

		/**
		 * The fields of the top document to return.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>metrics</code>.
		 */
		public final Builder metrics(List<TopMetricsValue> list) {
			this.metrics = _listAddAll(this.metrics, list);
			return this;
		}

		/**
		 * The fields of the top document to return.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds one or more values to <code>metrics</code>.
		 */
		public final Builder metrics(TopMetricsValue value, TopMetricsValue... values) {
			this.metrics = _listAdd(this.metrics, value, values);
			return this;
		}

		/**
		 * The fields of the top document to return.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds a value to <code>metrics</code> using a builder lambda.
		 */
		public final Builder metrics(Function<TopMetricsValue.Builder, ObjectBuilder<TopMetricsValue>> fn) {
			return metrics(fn.apply(new TopMetricsValue.Builder()).build());
		}

		/**
		 * The number of top documents from which to return metrics.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The sort order of the documents.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * The sort order of the documents.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * The sort order of the documents.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
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
			.lazy(Builder::new, TopMetricsAggregation::setupTopMetricsAggregationDeserializer);

	protected static void setupTopMetricsAggregationDeserializer(ObjectDeserializer<TopMetricsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(TopMetricsValue._DESERIALIZER), "metrics");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

}
