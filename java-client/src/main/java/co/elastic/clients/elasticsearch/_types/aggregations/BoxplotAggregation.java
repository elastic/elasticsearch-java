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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
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

// typedef: _types.aggregations.BoxplotAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BoxplotAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class BoxplotAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Double compression;

	@Nullable
	private final TDigestExecutionHint executionHint;

	// ---------------------------------------------------------------------------------------------

	private BoxplotAggregation(Builder builder) {
		super(builder);

		this.compression = builder.compression;
		this.executionHint = builder.executionHint;

	}

	public static BoxplotAggregation of(Function<Builder, ObjectBuilder<BoxplotAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Boxplot;
	}

	/**
	 * Limits the maximum number of nodes used by the underlying TDigest algorithm
	 * to <code>20 * compression</code>, enabling control of memory usage and
	 * approximation error.
	 * <p>
	 * API name: {@code compression}
	 */
	@Nullable
	public final Double compression() {
		return this.compression;
	}

	/**
	 * The default implementation of TDigest is optimized for performance, scaling
	 * to millions or even billions of sample values while maintaining acceptable
	 * accuracy levels (close to 1% relative error for millions of samples in some
	 * cases). To use an implementation optimized for accuracy, set this parameter
	 * to high_accuracy instead.
	 * <p>
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final TDigestExecutionHint executionHint() {
		return this.executionHint;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.compression != null) {
			generator.writeKey("compression");
			generator.write(this.compression);

		}
		if (this.executionHint != null) {
			generator.writeKey("execution_hint");
			this.executionHint.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoxplotAggregation}.
	 */

	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BoxplotAggregation> {
		@Nullable
		private Double compression;

		@Nullable
		private TDigestExecutionHint executionHint;

		/**
		 * Limits the maximum number of nodes used by the underlying TDigest algorithm
		 * to <code>20 * compression</code>, enabling control of memory usage and
		 * approximation error.
		 * <p>
		 * API name: {@code compression}
		 */
		public final Builder compression(@Nullable Double value) {
			this.compression = value;
			return this;
		}

		/**
		 * The default implementation of TDigest is optimized for performance, scaling
		 * to millions or even billions of sample values while maintaining acceptable
		 * accuracy levels (close to 1% relative error for millions of samples in some
		 * cases). To use an implementation optimized for accuracy, set this parameter
		 * to high_accuracy instead.
		 * <p>
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable TDigestExecutionHint value) {
			this.executionHint = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BoxplotAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoxplotAggregation build() {
			_checkSingleUse();

			return new BoxplotAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BoxplotAggregation}
	 */
	public static final JsonpDeserializer<BoxplotAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BoxplotAggregation::setupBoxplotAggregationDeserializer);

	protected static void setupBoxplotAggregationDeserializer(ObjectDeserializer<BoxplotAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::compression, JsonpDeserializer.doubleDeserializer(), "compression");
		op.add(Builder::executionHint, TDigestExecutionHint._DESERIALIZER, "execution_hint");

	}

}
