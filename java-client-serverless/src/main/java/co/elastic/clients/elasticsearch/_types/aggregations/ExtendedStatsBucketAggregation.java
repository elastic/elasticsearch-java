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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ExtendedStatsBucketAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ExtendedStatsBucketAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedStatsBucketAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final Double sigma;

	// ---------------------------------------------------------------------------------------------

	private ExtendedStatsBucketAggregation(Builder builder) {
		super(builder);

		this.sigma = builder.sigma;

	}

	public static ExtendedStatsBucketAggregation of(
			Function<Builder, ObjectBuilder<ExtendedStatsBucketAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.ExtendedStatsBucket;
	}

	/**
	 * The number of standard deviations above/below the mean to display.
	 * <p>
	 * API name: {@code sigma}
	 */
	@Nullable
	public final Double sigma() {
		return this.sigma;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.sigma != null) {
			generator.writeKey("sigma");
			generator.write(this.sigma);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedStatsBucketAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedStatsBucketAggregation> {
		@Nullable
		private Double sigma;

		/**
		 * The number of standard deviations above/below the mean to display.
		 * <p>
		 * API name: {@code sigma}
		 */
		public final Builder sigma(@Nullable Double value) {
			this.sigma = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedStatsBucketAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedStatsBucketAggregation build() {
			_checkSingleUse();

			return new ExtendedStatsBucketAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedStatsBucketAggregation}
	 */
	public static final JsonpDeserializer<ExtendedStatsBucketAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedStatsBucketAggregation::setupExtendedStatsBucketAggregationDeserializer);

	protected static void setupExtendedStatsBucketAggregationDeserializer(
			ObjectDeserializer<ExtendedStatsBucketAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::sigma, JsonpDeserializer.doubleDeserializer(), "sigma");

	}

}
