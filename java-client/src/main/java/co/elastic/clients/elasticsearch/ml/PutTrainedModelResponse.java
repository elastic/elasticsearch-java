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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Response
public final class PutTrainedModelResponse implements ToJsonp {
	private final TrainedModelConfig value;

	// ---------------------------------------------------------------------------------------------

	protected PutTrainedModelResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code value}
	 */
	public TrainedModelConfig value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		this.value.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutTrainedModelResponse> {
		private TrainedModelConfig value;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(TrainedModelConfig value) {
			this.value = value;
			return this;
		}

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Function<TrainedModelConfig.Builder, ObjectBuilder<TrainedModelConfig>> fn) {
			return this.value(fn.apply(new TrainedModelConfig.Builder()).build());
		}

		/**
		 * Builds a {@link PutTrainedModelResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelResponse build() {

			return new PutTrainedModelResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutTrainedModelResponse
	 */
	public static final JsonpDeserializer<PutTrainedModelResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutTrainedModelResponse::setupPutTrainedModelResponseDeserializer);

	protected static void setupPutTrainedModelResponseDeserializer(
			DelegatingDeserializer<PutTrainedModelResponse.Builder> op) {

		op.add(Builder::value, TrainedModelConfig.DESERIALIZER, "value");

	}

}
