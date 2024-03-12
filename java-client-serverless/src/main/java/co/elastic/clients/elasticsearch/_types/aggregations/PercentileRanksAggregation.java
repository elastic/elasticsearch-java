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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
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

// typedef: _types.aggregations.PercentileRanksAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.PercentileRanksAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class PercentileRanksAggregation extends FormatMetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Boolean keyed;

	private final List<Double> values;

	@Nullable
	private final HdrMethod hdr;

	@Nullable
	private final TDigest tdigest;

	// ---------------------------------------------------------------------------------------------

	private PercentileRanksAggregation(Builder builder) {
		super(builder);

		this.keyed = builder.keyed;
		this.values = ApiTypeHelper.unmodifiable(builder.values);
		this.hdr = builder.hdr;
		this.tdigest = builder.tdigest;

	}

	public static PercentileRanksAggregation of(Function<Builder, ObjectBuilder<PercentileRanksAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.PercentileRanks;
	}

	/**
	 * By default, the aggregation associates a unique string key with each bucket
	 * and returns the ranges as a hash rather than an array. Set to
	 * <code>false</code> to disable this behavior.
	 * <p>
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	/**
	 * An array of values for which to calculate the percentile ranks.
	 * <p>
	 * API name: {@code values}
	 */
	public final List<Double> values() {
		return this.values;
	}

	/**
	 * Uses the alternative High Dynamic Range Histogram algorithm to calculate
	 * percentile ranks.
	 * <p>
	 * API name: {@code hdr}
	 */
	@Nullable
	public final HdrMethod hdr() {
		return this.hdr;
	}

	/**
	 * Sets parameters for the default TDigest algorithm used to calculate
	 * percentile ranks.
	 * <p>
	 * API name: {@code tdigest}
	 */
	@Nullable
	public final TDigest tdigest() {
		return this.tdigest;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}
		if (ApiTypeHelper.isDefined(this.values)) {
			generator.writeKey("values");
			generator.writeStartArray();
			for (Double item0 : this.values) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.hdr != null) {
			generator.writeKey("hdr");
			this.hdr.serialize(generator, mapper);

		}
		if (this.tdigest != null) {
			generator.writeKey("tdigest");
			this.tdigest.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercentileRanksAggregation}.
	 */

	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PercentileRanksAggregation> {
		@Nullable
		private Boolean keyed;

		@Nullable
		private List<Double> values;

		@Nullable
		private HdrMethod hdr;

		@Nullable
		private TDigest tdigest;

		/**
		 * By default, the aggregation associates a unique string key with each bucket
		 * and returns the ranges as a hash rather than an array. Set to
		 * <code>false</code> to disable this behavior.
		 * <p>
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		/**
		 * An array of values for which to calculate the percentile ranks.
		 * <p>
		 * API name: {@code values}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>values</code>.
		 */
		public final Builder values(List<Double> list) {
			this.values = _listAddAll(this.values, list);
			return this;
		}

		/**
		 * An array of values for which to calculate the percentile ranks.
		 * <p>
		 * API name: {@code values}
		 * <p>
		 * Adds one or more values to <code>values</code>.
		 */
		public final Builder values(Double value, Double... values) {
			this.values = _listAdd(this.values, value, values);
			return this;
		}

		/**
		 * Uses the alternative High Dynamic Range Histogram algorithm to calculate
		 * percentile ranks.
		 * <p>
		 * API name: {@code hdr}
		 */
		public final Builder hdr(@Nullable HdrMethod value) {
			this.hdr = value;
			return this;
		}

		/**
		 * Uses the alternative High Dynamic Range Histogram algorithm to calculate
		 * percentile ranks.
		 * <p>
		 * API name: {@code hdr}
		 */
		public final Builder hdr(Function<HdrMethod.Builder, ObjectBuilder<HdrMethod>> fn) {
			return this.hdr(fn.apply(new HdrMethod.Builder()).build());
		}

		/**
		 * Sets parameters for the default TDigest algorithm used to calculate
		 * percentile ranks.
		 * <p>
		 * API name: {@code tdigest}
		 */
		public final Builder tdigest(@Nullable TDigest value) {
			this.tdigest = value;
			return this;
		}

		/**
		 * Sets parameters for the default TDigest algorithm used to calculate
		 * percentile ranks.
		 * <p>
		 * API name: {@code tdigest}
		 */
		public final Builder tdigest(Function<TDigest.Builder, ObjectBuilder<TDigest>> fn) {
			return this.tdigest(fn.apply(new TDigest.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercentileRanksAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercentileRanksAggregation build() {
			_checkSingleUse();

			return new PercentileRanksAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercentileRanksAggregation}
	 */
	public static final JsonpDeserializer<PercentileRanksAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PercentileRanksAggregation::setupPercentileRanksAggregationDeserializer);

	protected static void setupPercentileRanksAggregationDeserializer(
			ObjectDeserializer<PercentileRanksAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()), "values");
		op.add(Builder::hdr, HdrMethod._DESERIALIZER, "hdr");
		op.add(Builder::tdigest, TDigest._DESERIALIZER, "tdigest");

	}

}
