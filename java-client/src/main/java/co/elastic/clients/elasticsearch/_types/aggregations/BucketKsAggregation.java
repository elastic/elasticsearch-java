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
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketKsAggregation

/**
 * A sibling pipeline aggregation which executes a two sample Kolmogorov–Smirnov
 * test (referred to as a &quot;K-S test&quot; from now on) against a provided
 * distribution, and the distribution implied by the documents counts in the
 * configured sibling aggregation. Specifically, for some metric, assuming that
 * the percentile intervals of the metric are known beforehand or have been
 * computed by an aggregation, then one would use range aggregation for the
 * sibling to compute the p-value of the distribution difference between the
 * metric and the restriction of that metric to a subset of the documents. A
 * natural use case is if the sibling aggregation range aggregation nested in a
 * terms aggregation, in which case one compares the overall distribution of
 * metric to its restriction to each term.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketKsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketKsAggregation extends BucketPathAggregation implements AggregationVariant {
	private final List<String> alternative;

	private final List<Double> fractions;

	@Nullable
	private final String samplingMethod;

	// ---------------------------------------------------------------------------------------------

	private BucketKsAggregation(Builder builder) {
		super(builder);

		this.alternative = ApiTypeHelper.unmodifiable(builder.alternative);
		this.fractions = ApiTypeHelper.unmodifiable(builder.fractions);
		this.samplingMethod = builder.samplingMethod;

	}

	public static BucketKsAggregation of(Function<Builder, ObjectBuilder<BucketKsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.BucketCountKsTest;
	}

	/**
	 * A list of string values indicating which K-S test alternative to calculate.
	 * The valid values are: &quot;greater&quot;, &quot;less&quot;,
	 * &quot;two_sided&quot;. This parameter is key for determining the K-S
	 * statistic used when calculating the K-S test. Default value is all possible
	 * alternative hypotheses.
	 * <p>
	 * API name: {@code alternative}
	 */
	public final List<String> alternative() {
		return this.alternative;
	}

	/**
	 * A list of doubles indicating the distribution of the samples with which to
	 * compare to the <code>buckets_path</code> results. In typical usage this is
	 * the overall proportion of documents in each bucket, which is compared with
	 * the actual document proportions in each bucket from the sibling aggregation
	 * counts. The default is to assume that overall documents are uniformly
	 * distributed on these buckets, which they would be if one used equal
	 * percentiles of a metric to define the bucket end points.
	 * <p>
	 * API name: {@code fractions}
	 */
	public final List<Double> fractions() {
		return this.fractions;
	}

	/**
	 * Indicates the sampling methodology when calculating the K-S test. Note, this
	 * is sampling of the returned values. This determines the cumulative
	 * distribution function (CDF) points used comparing the two samples. Default is
	 * <code>upper_tail</code>, which emphasizes the upper end of the CDF points.
	 * Valid options are: <code>upper_tail</code>, <code>uniform</code>, and
	 * <code>lower_tail</code>.
	 * <p>
	 * API name: {@code sampling_method}
	 */
	@Nullable
	public final String samplingMethod() {
		return this.samplingMethod;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.alternative)) {
			generator.writeKey("alternative");
			generator.writeStartArray();
			for (String item0 : this.alternative) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.fractions)) {
			generator.writeKey("fractions");
			generator.writeStartArray();
			for (Double item0 : this.fractions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.samplingMethod != null) {
			generator.writeKey("sampling_method");
			generator.write(this.samplingMethod);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketKsAggregation}.
	 */

	public static class Builder extends BucketPathAggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketKsAggregation> {
		@Nullable
		private List<String> alternative;

		@Nullable
		private List<Double> fractions;

		@Nullable
		private String samplingMethod;

		/**
		 * A list of string values indicating which K-S test alternative to calculate.
		 * The valid values are: &quot;greater&quot;, &quot;less&quot;,
		 * &quot;two_sided&quot;. This parameter is key for determining the K-S
		 * statistic used when calculating the K-S test. Default value is all possible
		 * alternative hypotheses.
		 * <p>
		 * API name: {@code alternative}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>alternative</code>.
		 */
		public final Builder alternative(List<String> list) {
			this.alternative = _listAddAll(this.alternative, list);
			return this;
		}

		/**
		 * A list of string values indicating which K-S test alternative to calculate.
		 * The valid values are: &quot;greater&quot;, &quot;less&quot;,
		 * &quot;two_sided&quot;. This parameter is key for determining the K-S
		 * statistic used when calculating the K-S test. Default value is all possible
		 * alternative hypotheses.
		 * <p>
		 * API name: {@code alternative}
		 * <p>
		 * Adds one or more values to <code>alternative</code>.
		 */
		public final Builder alternative(String value, String... values) {
			this.alternative = _listAdd(this.alternative, value, values);
			return this;
		}

		/**
		 * A list of doubles indicating the distribution of the samples with which to
		 * compare to the <code>buckets_path</code> results. In typical usage this is
		 * the overall proportion of documents in each bucket, which is compared with
		 * the actual document proportions in each bucket from the sibling aggregation
		 * counts. The default is to assume that overall documents are uniformly
		 * distributed on these buckets, which they would be if one used equal
		 * percentiles of a metric to define the bucket end points.
		 * <p>
		 * API name: {@code fractions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fractions</code>.
		 */
		public final Builder fractions(List<Double> list) {
			this.fractions = _listAddAll(this.fractions, list);
			return this;
		}

		/**
		 * A list of doubles indicating the distribution of the samples with which to
		 * compare to the <code>buckets_path</code> results. In typical usage this is
		 * the overall proportion of documents in each bucket, which is compared with
		 * the actual document proportions in each bucket from the sibling aggregation
		 * counts. The default is to assume that overall documents are uniformly
		 * distributed on these buckets, which they would be if one used equal
		 * percentiles of a metric to define the bucket end points.
		 * <p>
		 * API name: {@code fractions}
		 * <p>
		 * Adds one or more values to <code>fractions</code>.
		 */
		public final Builder fractions(Double value, Double... values) {
			this.fractions = _listAdd(this.fractions, value, values);
			return this;
		}

		/**
		 * Indicates the sampling methodology when calculating the K-S test. Note, this
		 * is sampling of the returned values. This determines the cumulative
		 * distribution function (CDF) points used comparing the two samples. Default is
		 * <code>upper_tail</code>, which emphasizes the upper end of the CDF points.
		 * Valid options are: <code>upper_tail</code>, <code>uniform</code>, and
		 * <code>lower_tail</code>.
		 * <p>
		 * API name: {@code sampling_method}
		 */
		public final Builder samplingMethod(@Nullable String value) {
			this.samplingMethod = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketKsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketKsAggregation build() {
			_checkSingleUse();

			return new BucketKsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketKsAggregation}
	 */
	public static final JsonpDeserializer<BucketKsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketKsAggregation::setupBucketKsAggregationDeserializer);

	protected static void setupBucketKsAggregationDeserializer(ObjectDeserializer<BucketKsAggregation.Builder> op) {
		BucketPathAggregation.setupBucketPathAggregationDeserializer(op);
		op.add(Builder::alternative, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"alternative");
		op.add(Builder::fractions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"fractions");
		op.add(Builder::samplingMethod, JsonpDeserializer.stringDeserializer(), "sampling_method");

	}

}
