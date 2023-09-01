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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.estimate_model_memory.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.estimate_model_memory.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class EstimateModelMemoryResponse implements JsonpSerializable {
	private final String modelMemoryEstimate;

	// ---------------------------------------------------------------------------------------------

	private EstimateModelMemoryResponse(Builder builder) {

		this.modelMemoryEstimate = ApiTypeHelper.requireNonNull(builder.modelMemoryEstimate, this,
				"modelMemoryEstimate");

	}

	public static EstimateModelMemoryResponse of(Function<Builder, ObjectBuilder<EstimateModelMemoryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code model_memory_estimate}
	 */
	public final String modelMemoryEstimate() {
		return this.modelMemoryEstimate;
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

		generator.writeKey("model_memory_estimate");
		generator.write(this.modelMemoryEstimate);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EstimateModelMemoryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EstimateModelMemoryResponse> {
		private String modelMemoryEstimate;

		/**
		 * Required - API name: {@code model_memory_estimate}
		 */
		public final Builder modelMemoryEstimate(String value) {
			this.modelMemoryEstimate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EstimateModelMemoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EstimateModelMemoryResponse build() {
			_checkSingleUse();

			return new EstimateModelMemoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EstimateModelMemoryResponse}
	 */
	public static final JsonpDeserializer<EstimateModelMemoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EstimateModelMemoryResponse::setupEstimateModelMemoryResponseDeserializer);

	protected static void setupEstimateModelMemoryResponseDeserializer(
			ObjectDeserializer<EstimateModelMemoryResponse.Builder> op) {

		op.add(Builder::modelMemoryEstimate, JsonpDeserializer.stringDeserializer(), "model_memory_estimate");

	}

}
