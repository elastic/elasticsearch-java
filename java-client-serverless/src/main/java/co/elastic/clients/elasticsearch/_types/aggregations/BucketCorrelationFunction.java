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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketCorrelationFunction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketCorrelationFunction">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketCorrelationFunction implements JsonpSerializable {
	private final BucketCorrelationFunctionCountCorrelation countCorrelation;

	// ---------------------------------------------------------------------------------------------

	private BucketCorrelationFunction(Builder builder) {

		this.countCorrelation = ApiTypeHelper.requireNonNull(builder.countCorrelation, this, "countCorrelation");

	}

	public static BucketCorrelationFunction of(Function<Builder, ObjectBuilder<BucketCorrelationFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The configuration to calculate a count correlation. This function
	 * is designed for determining the correlation of a term value and a given
	 * metric.
	 * <p>
	 * API name: {@code count_correlation}
	 */
	public final BucketCorrelationFunctionCountCorrelation countCorrelation() {
		return this.countCorrelation;
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

		generator.writeKey("count_correlation");
		this.countCorrelation.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketCorrelationFunction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BucketCorrelationFunction> {
		private BucketCorrelationFunctionCountCorrelation countCorrelation;

		/**
		 * Required - The configuration to calculate a count correlation. This function
		 * is designed for determining the correlation of a term value and a given
		 * metric.
		 * <p>
		 * API name: {@code count_correlation}
		 */
		public final Builder countCorrelation(BucketCorrelationFunctionCountCorrelation value) {
			this.countCorrelation = value;
			return this;
		}

		/**
		 * Required - The configuration to calculate a count correlation. This function
		 * is designed for determining the correlation of a term value and a given
		 * metric.
		 * <p>
		 * API name: {@code count_correlation}
		 */
		public final Builder countCorrelation(
				Function<BucketCorrelationFunctionCountCorrelation.Builder, ObjectBuilder<BucketCorrelationFunctionCountCorrelation>> fn) {
			return this.countCorrelation(fn.apply(new BucketCorrelationFunctionCountCorrelation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketCorrelationFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketCorrelationFunction build() {
			_checkSingleUse();

			return new BucketCorrelationFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketCorrelationFunction}
	 */
	public static final JsonpDeserializer<BucketCorrelationFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketCorrelationFunction::setupBucketCorrelationFunctionDeserializer);

	protected static void setupBucketCorrelationFunctionDeserializer(
			ObjectDeserializer<BucketCorrelationFunction.Builder> op) {

		op.add(Builder::countCorrelation, BucketCorrelationFunctionCountCorrelation._DESERIALIZER, "count_correlation");

	}

}
