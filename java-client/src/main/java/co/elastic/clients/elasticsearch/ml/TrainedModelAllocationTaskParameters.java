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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelAllocationTaskParameters

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelAllocationTaskParameters">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelAllocationTaskParameters implements JsonpSerializable {
	private final int modelBytes;

	private final String modelId;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelAllocationTaskParameters(Builder builder) {

		this.modelBytes = ApiTypeHelper.requireNonNull(builder.modelBytes, this, "modelBytes");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");

	}

	public static TrainedModelAllocationTaskParameters of(
			Function<Builder, ObjectBuilder<TrainedModelAllocationTaskParameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The size of the trained model in bytes.
	 * <p>
	 * API name: {@code model_bytes}
	 */
	public final int modelBytes() {
		return this.modelBytes;
	}

	/**
	 * Required - The unique identifier for the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
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

		generator.writeKey("model_bytes");
		generator.write(this.modelBytes);

		generator.writeKey("model_id");
		generator.write(this.modelId);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelAllocationTaskParameters}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelAllocationTaskParameters> {
		private Integer modelBytes;

		private String modelId;

		/**
		 * Required - The size of the trained model in bytes.
		 * <p>
		 * API name: {@code model_bytes}
		 */
		public final Builder modelBytes(int value) {
			this.modelBytes = value;
			return this;
		}

		/**
		 * Required - The unique identifier for the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelAllocationTaskParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelAllocationTaskParameters build() {
			_checkSingleUse();

			return new TrainedModelAllocationTaskParameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelAllocationTaskParameters}
	 */
	public static final JsonpDeserializer<TrainedModelAllocationTaskParameters> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					TrainedModelAllocationTaskParameters::setupTrainedModelAllocationTaskParametersDeserializer);

	protected static void setupTrainedModelAllocationTaskParametersDeserializer(
			ObjectDeserializer<TrainedModelAllocationTaskParameters.Builder> op) {

		op.add(Builder::modelBytes, JsonpDeserializer.integerDeserializer(), "model_bytes");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");

	}

}
