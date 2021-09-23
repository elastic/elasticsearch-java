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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.estimate_model_memory.Response
public final class EstimateModelMemoryResponse implements JsonpSerializable {
	private final String modelMemoryEstimate;

	// ---------------------------------------------------------------------------------------------

	public EstimateModelMemoryResponse(Builder builder) {

		this.modelMemoryEstimate = Objects.requireNonNull(builder.modelMemoryEstimate, "model_memory_estimate");

	}

	/**
	 * API name: {@code model_memory_estimate}
	 */
	public String modelMemoryEstimate() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EstimateModelMemoryResponse}.
	 */
	public static class Builder implements ObjectBuilder<EstimateModelMemoryResponse> {
		private String modelMemoryEstimate;

		/**
		 * API name: {@code model_memory_estimate}
		 */
		public Builder modelMemoryEstimate(String value) {
			this.modelMemoryEstimate = value;
			return this;
		}

		/**
		 * Builds a {@link EstimateModelMemoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EstimateModelMemoryResponse build() {

			return new EstimateModelMemoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EstimateModelMemoryResponse}
	 */
	public static final JsonpDeserializer<EstimateModelMemoryResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, EstimateModelMemoryResponse::setupEstimateModelMemoryResponseDeserializer);

	protected static void setupEstimateModelMemoryResponseDeserializer(
			DelegatingDeserializer<EstimateModelMemoryResponse.Builder> op) {

		op.add(Builder::modelMemoryEstimate, JsonpDeserializer.stringDeserializer(), "model_memory_estimate");

	}

}
