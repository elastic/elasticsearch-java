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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketCorrelationAggregation

/**
 * A sibling pipeline aggregation which executes a correlation function on the
 * configured sibling multi-bucket aggregation.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketCorrelationAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketCorrelationAggregation extends BucketPathAggregation implements AggregationVariant {
	private final BucketCorrelationFunction function;

	// ---------------------------------------------------------------------------------------------

	private BucketCorrelationAggregation(Builder builder) {
		super(builder);

		this.function = ApiTypeHelper.requireNonNull(builder.function, this, "function");

	}

	public static BucketCorrelationAggregation of(Function<Builder, ObjectBuilder<BucketCorrelationAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.BucketCorrelation;
	}

	/**
	 * Required - The correlation function to execute.
	 * <p>
	 * API name: {@code function}
	 */
	public final BucketCorrelationFunction function() {
		return this.function;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("function");
		this.function.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketCorrelationAggregation}.
	 */

	public static class Builder extends BucketPathAggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketCorrelationAggregation> {
		private BucketCorrelationFunction function;

		/**
		 * Required - The correlation function to execute.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(BucketCorrelationFunction value) {
			this.function = value;
			return this;
		}

		/**
		 * Required - The correlation function to execute.
		 * <p>
		 * API name: {@code function}
		 */
		public final Builder function(
				Function<BucketCorrelationFunction.Builder, ObjectBuilder<BucketCorrelationFunction>> fn) {
			return this.function(fn.apply(new BucketCorrelationFunction.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketCorrelationAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketCorrelationAggregation build() {
			_checkSingleUse();

			return new BucketCorrelationAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketCorrelationAggregation}
	 */
	public static final JsonpDeserializer<BucketCorrelationAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketCorrelationAggregation::setupBucketCorrelationAggregationDeserializer);

	protected static void setupBucketCorrelationAggregationDeserializer(
			ObjectDeserializer<BucketCorrelationAggregation.Builder> op) {
		BucketPathAggregation.setupBucketPathAggregationDeserializer(op);
		op.add(Builder::function, BucketCorrelationFunction._DESERIALIZER, "function");

	}

}
