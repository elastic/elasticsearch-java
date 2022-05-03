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

// typedef: _types.aggregations.BucketCorrelationFunctionCountCorrelation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketCorrelationFunctionCountCorrelation">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketCorrelationFunctionCountCorrelation implements JsonpSerializable {
	private final BucketCorrelationFunctionCountCorrelationIndicator indicator;

	// ---------------------------------------------------------------------------------------------

	private BucketCorrelationFunctionCountCorrelation(Builder builder) {

		this.indicator = ApiTypeHelper.requireNonNull(builder.indicator, this, "indicator");

	}

	public static BucketCorrelationFunctionCountCorrelation of(
			Function<Builder, ObjectBuilder<BucketCorrelationFunctionCountCorrelation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The indicator with which to correlate the configured
	 * <code>bucket_path</code> values.
	 * <p>
	 * API name: {@code indicator}
	 */
	public final BucketCorrelationFunctionCountCorrelationIndicator indicator() {
		return this.indicator;
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

		generator.writeKey("indicator");
		this.indicator.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketCorrelationFunctionCountCorrelation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BucketCorrelationFunctionCountCorrelation> {
		private BucketCorrelationFunctionCountCorrelationIndicator indicator;

		/**
		 * Required - The indicator with which to correlate the configured
		 * <code>bucket_path</code> values.
		 * <p>
		 * API name: {@code indicator}
		 */
		public final Builder indicator(BucketCorrelationFunctionCountCorrelationIndicator value) {
			this.indicator = value;
			return this;
		}

		/**
		 * Required - The indicator with which to correlate the configured
		 * <code>bucket_path</code> values.
		 * <p>
		 * API name: {@code indicator}
		 */
		public final Builder indicator(
				Function<BucketCorrelationFunctionCountCorrelationIndicator.Builder, ObjectBuilder<BucketCorrelationFunctionCountCorrelationIndicator>> fn) {
			return this.indicator(fn.apply(new BucketCorrelationFunctionCountCorrelationIndicator.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketCorrelationFunctionCountCorrelation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketCorrelationFunctionCountCorrelation build() {
			_checkSingleUse();

			return new BucketCorrelationFunctionCountCorrelation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketCorrelationFunctionCountCorrelation}
	 */
	public static final JsonpDeserializer<BucketCorrelationFunctionCountCorrelation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					BucketCorrelationFunctionCountCorrelation::setupBucketCorrelationFunctionCountCorrelationDeserializer);

	protected static void setupBucketCorrelationFunctionCountCorrelationDeserializer(
			ObjectDeserializer<BucketCorrelationFunctionCountCorrelation.Builder> op) {

		op.add(Builder::indicator, BucketCorrelationFunctionCountCorrelationIndicator._DESERIALIZER, "indicator");

	}

}
