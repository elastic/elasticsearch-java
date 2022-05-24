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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.infer_trained_model.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.infer_trained_model.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferTrainedModelResponse implements JsonpSerializable {
	private final List<InferenceResponseResult> inferenceResults;

	// ---------------------------------------------------------------------------------------------

	private InferTrainedModelResponse(Builder builder) {

		this.inferenceResults = ApiTypeHelper.unmodifiableRequired(builder.inferenceResults, this, "inferenceResults");

	}

	public static InferTrainedModelResponse of(Function<Builder, ObjectBuilder<InferTrainedModelResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code inference_results}
	 */
	public final List<InferenceResponseResult> inferenceResults() {
		return this.inferenceResults;
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

		if (ApiTypeHelper.isDefined(this.inferenceResults)) {
			generator.writeKey("inference_results");
			generator.writeStartArray();
			for (InferenceResponseResult item0 : this.inferenceResults) {
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
	 * Builder for {@link InferTrainedModelResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InferTrainedModelResponse> {
		private List<InferenceResponseResult> inferenceResults;

		/**
		 * Required - API name: {@code inference_results}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>inferenceResults</code>.
		 */
		public final Builder inferenceResults(List<InferenceResponseResult> list) {
			this.inferenceResults = _listAddAll(this.inferenceResults, list);
			return this;
		}

		/**
		 * Required - API name: {@code inference_results}
		 * <p>
		 * Adds one or more values to <code>inferenceResults</code>.
		 */
		public final Builder inferenceResults(InferenceResponseResult value, InferenceResponseResult... values) {
			this.inferenceResults = _listAdd(this.inferenceResults, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code inference_results}
		 * <p>
		 * Adds a value to <code>inferenceResults</code> using a builder lambda.
		 */
		public final Builder inferenceResults(
				Function<InferenceResponseResult.Builder, ObjectBuilder<InferenceResponseResult>> fn) {
			return inferenceResults(fn.apply(new InferenceResponseResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferTrainedModelResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferTrainedModelResponse build() {
			_checkSingleUse();

			return new InferTrainedModelResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferTrainedModelResponse}
	 */
	public static final JsonpDeserializer<InferTrainedModelResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferTrainedModelResponse::setupInferTrainedModelResponseDeserializer);

	protected static void setupInferTrainedModelResponseDeserializer(
			ObjectDeserializer<InferTrainedModelResponse.Builder> op) {

		op.add(Builder::inferenceResults, JsonpDeserializer.arrayDeserializer(InferenceResponseResult._DESERIALIZER),
				"inference_results");

	}

}
