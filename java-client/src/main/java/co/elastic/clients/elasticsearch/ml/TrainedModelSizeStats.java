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

// typedef: ml._types.TrainedModelSizeStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TrainedModelSizeStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelSizeStats implements JsonpSerializable {
	private final String modelSizeBytes;

	private final int requiredNativeMemoryBytes;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelSizeStats(Builder builder) {

		this.modelSizeBytes = ApiTypeHelper.requireNonNull(builder.modelSizeBytes, this, "modelSizeBytes");
		this.requiredNativeMemoryBytes = ApiTypeHelper.requireNonNull(builder.requiredNativeMemoryBytes, this,
				"requiredNativeMemoryBytes");

	}

	public static TrainedModelSizeStats of(Function<Builder, ObjectBuilder<TrainedModelSizeStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The size of the model in bytes.
	 * <p>
	 * API name: {@code model_size_bytes}
	 */
	public final String modelSizeBytes() {
		return this.modelSizeBytes;
	}

	/**
	 * Required - The amount of memory required to load the model in bytes.
	 * <p>
	 * API name: {@code required_native_memory_bytes}
	 */
	public final int requiredNativeMemoryBytes() {
		return this.requiredNativeMemoryBytes;
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

		generator.writeKey("model_size_bytes");
		generator.write(this.modelSizeBytes);

		generator.writeKey("required_native_memory_bytes");
		generator.write(this.requiredNativeMemoryBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelSizeStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelSizeStats> {
		private String modelSizeBytes;

		private Integer requiredNativeMemoryBytes;

		/**
		 * Required - The size of the model in bytes.
		 * <p>
		 * API name: {@code model_size_bytes}
		 */
		public final Builder modelSizeBytes(String value) {
			this.modelSizeBytes = value;
			return this;
		}

		/**
		 * Required - The amount of memory required to load the model in bytes.
		 * <p>
		 * API name: {@code required_native_memory_bytes}
		 */
		public final Builder requiredNativeMemoryBytes(int value) {
			this.requiredNativeMemoryBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelSizeStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelSizeStats build() {
			_checkSingleUse();

			return new TrainedModelSizeStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelSizeStats}
	 */
	public static final JsonpDeserializer<TrainedModelSizeStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelSizeStats::setupTrainedModelSizeStatsDeserializer);

	protected static void setupTrainedModelSizeStatsDeserializer(ObjectDeserializer<TrainedModelSizeStats.Builder> op) {

		op.add(Builder::modelSizeBytes, JsonpDeserializer.stringDeserializer(), "model_size_bytes");
		op.add(Builder::requiredNativeMemoryBytes, JsonpDeserializer.integerDeserializer(),
				"required_native_memory_bytes");

	}

}
