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
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models.Response
public final class GetTrainedModelsResponse implements ToJsonp {
	private final Number count;

	private final List<TrainedModelConfig> trainedModelConfigs;

	// ---------------------------------------------------------------------------------------------

	protected GetTrainedModelsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.trainedModelConfigs = Objects.requireNonNull(builder.trainedModelConfigs, "trained_model_configs");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * An array of trained model resources, which are sorted by the model_id value
	 * in ascending order.
	 * <p>
	 * API name: {@code trained_model_configs}
	 */
	public List<TrainedModelConfig> trainedModelConfigs() {
		return this.trainedModelConfigs;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("trained_model_configs");
		generator.writeStartArray();
		for (TrainedModelConfig item0 : this.trainedModelConfigs) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrainedModelsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetTrainedModelsResponse> {
		private Number count;

		private List<TrainedModelConfig> trainedModelConfigs;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * An array of trained model resources, which are sorted by the model_id value
		 * in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 */
		public Builder trainedModelConfigs(List<TrainedModelConfig> value) {
			this.trainedModelConfigs = value;
			return this;
		}

		/**
		 * An array of trained model resources, which are sorted by the model_id value
		 * in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 */
		public Builder trainedModelConfigs(TrainedModelConfig... value) {
			this.trainedModelConfigs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #trainedModelConfigs(List)}, creating the list if
		 * needed.
		 */
		public Builder addTrainedModelConfigs(TrainedModelConfig value) {
			if (this.trainedModelConfigs == null) {
				this.trainedModelConfigs = new ArrayList<>();
			}
			this.trainedModelConfigs.add(value);
			return this;
		}

		/**
		 * Set {@link #trainedModelConfigs(List)} to a singleton list.
		 */
		public Builder trainedModelConfigs(Function<TrainedModelConfig.Builder, ObjectBuilder<TrainedModelConfig>> fn) {
			return this.trainedModelConfigs(fn.apply(new TrainedModelConfig.Builder()).build());
		}

		/**
		 * Add a value to {@link #trainedModelConfigs(List)}, creating the list if
		 * needed.
		 */
		public Builder addTrainedModelConfigs(
				Function<TrainedModelConfig.Builder, ObjectBuilder<TrainedModelConfig>> fn) {
			return this.addTrainedModelConfigs(fn.apply(new TrainedModelConfig.Builder()).build());
		}

		/**
		 * Builds a {@link GetTrainedModelsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsResponse build() {

			return new GetTrainedModelsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetTrainedModelsResponse
	 */
	public static final JsonpDeserializer<GetTrainedModelsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetTrainedModelsResponse::setupGetTrainedModelsResponseDeserializer);

	protected static void setupGetTrainedModelsResponseDeserializer(
			DelegatingDeserializer<GetTrainedModelsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::trainedModelConfigs, JsonpDeserializer.arrayDeserializer(TrainedModelConfig.DESERIALIZER),
				"trained_model_configs");

	}

}
