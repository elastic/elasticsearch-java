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
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_trained_models.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_trained_models.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetTrainedModelsResponse implements JsonpSerializable {
	private final int count;

	private final List<TrainedModelConfig> trainedModelConfigs;

	// ---------------------------------------------------------------------------------------------

	private GetTrainedModelsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.trainedModelConfigs = ApiTypeHelper.unmodifiableRequired(builder.trainedModelConfigs, this,
				"trainedModelConfigs");

	}

	public static GetTrainedModelsResponse of(Function<Builder, ObjectBuilder<GetTrainedModelsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - An array of trained model resources, which are sorted by the
	 * model_id value in ascending order.
	 * <p>
	 * API name: {@code trained_model_configs}
	 */
	public final List<TrainedModelConfig> trainedModelConfigs() {
		return this.trainedModelConfigs;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.trainedModelConfigs)) {
			generator.writeKey("trained_model_configs");
			generator.writeStartArray();
			for (TrainedModelConfig item0 : this.trainedModelConfigs) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link GetTrainedModelsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetTrainedModelsResponse> {
		private Integer count;

		private List<TrainedModelConfig> trainedModelConfigs;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - An array of trained model resources, which are sorted by the
		 * model_id value in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>trainedModelConfigs</code>.
		 */
		public final Builder trainedModelConfigs(List<TrainedModelConfig> list) {
			this.trainedModelConfigs = _listAddAll(this.trainedModelConfigs, list);
			return this;
		}

		/**
		 * Required - An array of trained model resources, which are sorted by the
		 * model_id value in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 * <p>
		 * Adds one or more values to <code>trainedModelConfigs</code>.
		 */
		public final Builder trainedModelConfigs(TrainedModelConfig value, TrainedModelConfig... values) {
			this.trainedModelConfigs = _listAdd(this.trainedModelConfigs, value, values);
			return this;
		}

		/**
		 * Required - An array of trained model resources, which are sorted by the
		 * model_id value in ascending order.
		 * <p>
		 * API name: {@code trained_model_configs}
		 * <p>
		 * Adds a value to <code>trainedModelConfigs</code> using a builder lambda.
		 */
		public final Builder trainedModelConfigs(
				Function<TrainedModelConfig.Builder, ObjectBuilder<TrainedModelConfig>> fn) {
			return trainedModelConfigs(fn.apply(new TrainedModelConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTrainedModelsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrainedModelsResponse build() {
			_checkSingleUse();

			return new GetTrainedModelsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTrainedModelsResponse}
	 */
	public static final JsonpDeserializer<GetTrainedModelsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTrainedModelsResponse::setupGetTrainedModelsResponseDeserializer);

	protected static void setupGetTrainedModelsResponseDeserializer(
			ObjectDeserializer<GetTrainedModelsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::trainedModelConfigs, JsonpDeserializer.arrayDeserializer(TrainedModelConfig._DESERIALIZER),
				"trained_model_configs");

	}

}
