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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketCorrelationFunctionCountCorrelationIndicator

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketCorrelationFunctionCountCorrelationIndicator">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketCorrelationFunctionCountCorrelationIndicator implements JsonpSerializable {
	private final int docCount;

	private final List<Double> expectations;

	private final List<Double> fractions;

	// ---------------------------------------------------------------------------------------------

	private BucketCorrelationFunctionCountCorrelationIndicator(Builder builder) {

		this.docCount = ApiTypeHelper.requireNonNull(builder.docCount, this, "docCount");
		this.expectations = ApiTypeHelper.unmodifiableRequired(builder.expectations, this, "expectations");
		this.fractions = ApiTypeHelper.unmodifiable(builder.fractions);

	}

	public static BucketCorrelationFunctionCountCorrelationIndicator of(
			Function<Builder, ObjectBuilder<BucketCorrelationFunctionCountCorrelationIndicator>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The total number of documents that initially created the
	 * expectations. It’s required to be greater than or equal to the sum of all
	 * values in the buckets_path as this is the originating superset of data to
	 * which the term values are correlated.
	 * <p>
	 * API name: {@code doc_count}
	 */
	public final int docCount() {
		return this.docCount;
	}

	/**
	 * Required - An array of numbers with which to correlate the configured
	 * <code>bucket_path</code> values. The length of this value must always equal
	 * the number of buckets returned by the <code>bucket_path</code>.
	 * <p>
	 * API name: {@code expectations}
	 */
	public final List<Double> expectations() {
		return this.expectations;
	}

	/**
	 * An array of fractions to use when averaging and calculating variance. This
	 * should be used if the pre-calculated data and the buckets_path have known
	 * gaps. The length of fractions, if provided, must equal expectations.
	 * <p>
	 * API name: {@code fractions}
	 */
	public final List<Double> fractions() {
		return this.fractions;
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

		generator.writeKey("doc_count");
		generator.write(this.docCount);

		if (ApiTypeHelper.isDefined(this.expectations)) {
			generator.writeKey("expectations");
			generator.writeStartArray();
			for (Double item0 : this.expectations) {
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketCorrelationFunctionCountCorrelationIndicator}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BucketCorrelationFunctionCountCorrelationIndicator> {
		private Integer docCount;

		private List<Double> expectations;

		@Nullable
		private List<Double> fractions;

		/**
		 * Required - The total number of documents that initially created the
		 * expectations. It’s required to be greater than or equal to the sum of all
		 * values in the buckets_path as this is the originating superset of data to
		 * which the term values are correlated.
		 * <p>
		 * API name: {@code doc_count}
		 */
		public final Builder docCount(int value) {
			this.docCount = value;
			return this;
		}

		/**
		 * Required - An array of numbers with which to correlate the configured
		 * <code>bucket_path</code> values. The length of this value must always equal
		 * the number of buckets returned by the <code>bucket_path</code>.
		 * <p>
		 * API name: {@code expectations}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expectations</code>.
		 */
		public final Builder expectations(List<Double> list) {
			this.expectations = _listAddAll(this.expectations, list);
			return this;
		}

		/**
		 * Required - An array of numbers with which to correlate the configured
		 * <code>bucket_path</code> values. The length of this value must always equal
		 * the number of buckets returned by the <code>bucket_path</code>.
		 * <p>
		 * API name: {@code expectations}
		 * <p>
		 * Adds one or more values to <code>expectations</code>.
		 */
		public final Builder expectations(Double value, Double... values) {
			this.expectations = _listAdd(this.expectations, value, values);
			return this;
		}

		/**
		 * An array of fractions to use when averaging and calculating variance. This
		 * should be used if the pre-calculated data and the buckets_path have known
		 * gaps. The length of fractions, if provided, must equal expectations.
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
		 * An array of fractions to use when averaging and calculating variance. This
		 * should be used if the pre-calculated data and the buckets_path have known
		 * gaps. The length of fractions, if provided, must equal expectations.
		 * <p>
		 * API name: {@code fractions}
		 * <p>
		 * Adds one or more values to <code>fractions</code>.
		 */
		public final Builder fractions(Double value, Double... values) {
			this.fractions = _listAdd(this.fractions, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketCorrelationFunctionCountCorrelationIndicator}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketCorrelationFunctionCountCorrelationIndicator build() {
			_checkSingleUse();

			return new BucketCorrelationFunctionCountCorrelationIndicator(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for
	 * {@link BucketCorrelationFunctionCountCorrelationIndicator}
	 */
	public static final JsonpDeserializer<BucketCorrelationFunctionCountCorrelationIndicator> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					BucketCorrelationFunctionCountCorrelationIndicator::setupBucketCorrelationFunctionCountCorrelationIndicatorDeserializer);

	protected static void setupBucketCorrelationFunctionCountCorrelationIndicatorDeserializer(
			ObjectDeserializer<BucketCorrelationFunctionCountCorrelationIndicator.Builder> op) {

		op.add(Builder::docCount, JsonpDeserializer.integerDeserializer(), "doc_count");
		op.add(Builder::expectations, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"expectations");
		op.add(Builder::fractions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"fractions");

	}

}
