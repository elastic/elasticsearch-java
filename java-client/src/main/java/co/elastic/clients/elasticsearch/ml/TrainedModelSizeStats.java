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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml._types.TrainedModelSizeStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TrainedModelSizeStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelSizeStats implements JsonpSerializable {
	private final String modelSizeBytes;

	private final String requiredNativeMemoryBytes;

	@Nullable
	private final String runtimeNativeMemoryBytes;

	@Nullable
	private final String peakRuntimeNativeMemoryBytes;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelSizeStats(Builder builder) {

		this.modelSizeBytes = ApiTypeHelper.requireNonNull(builder.modelSizeBytes, this, "modelSizeBytes");
		this.requiredNativeMemoryBytes = ApiTypeHelper.requireNonNull(builder.requiredNativeMemoryBytes, this,
				"requiredNativeMemoryBytes");
		this.runtimeNativeMemoryBytes = builder.runtimeNativeMemoryBytes;
		this.peakRuntimeNativeMemoryBytes = builder.peakRuntimeNativeMemoryBytes;

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
	public final String requiredNativeMemoryBytes() {
		return this.requiredNativeMemoryBytes;
	}

	/**
	 * The sum, across the nodes the deployment runs on, of the average memory of
	 * each node's inference process since it started. Unlike
	 * <code>required_native_memory_bytes</code>, which is an estimate, this is a
	 * measured value. It is returned only after the native process has reported a
	 * measurement.
	 * <p>
	 * API name: {@code runtime_native_memory_bytes}
	 */
	@Nullable
	public final String runtimeNativeMemoryBytes() {
		return this.runtimeNativeMemoryBytes;
	}

	/**
	 * The sum, across the nodes the deployment runs on, of the peak native memory
	 * (resident set size) of each node's inference process since it started. It is
	 * returned only after the native process has reported a measurement.
	 * <p>
	 * API name: {@code peak_runtime_native_memory_bytes}
	 */
	@Nullable
	public final String peakRuntimeNativeMemoryBytes() {
		return this.peakRuntimeNativeMemoryBytes;
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

		if (this.runtimeNativeMemoryBytes != null) {
			generator.writeKey("runtime_native_memory_bytes");
			generator.write(this.runtimeNativeMemoryBytes);

		}
		if (this.peakRuntimeNativeMemoryBytes != null) {
			generator.writeKey("peak_runtime_native_memory_bytes");
			generator.write(this.peakRuntimeNativeMemoryBytes);

		}

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

		private String requiredNativeMemoryBytes;

		@Nullable
		private String runtimeNativeMemoryBytes;

		@Nullable
		private String peakRuntimeNativeMemoryBytes;

		public Builder() {
		}
		private Builder(TrainedModelSizeStats instance) {
			this.modelSizeBytes = instance.modelSizeBytes;
			this.requiredNativeMemoryBytes = instance.requiredNativeMemoryBytes;
			this.runtimeNativeMemoryBytes = instance.runtimeNativeMemoryBytes;
			this.peakRuntimeNativeMemoryBytes = instance.peakRuntimeNativeMemoryBytes;

		}
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
		public final Builder requiredNativeMemoryBytes(String value) {
			this.requiredNativeMemoryBytes = value;
			return this;
		}

		/**
		 * The sum, across the nodes the deployment runs on, of the average memory of
		 * each node's inference process since it started. Unlike
		 * <code>required_native_memory_bytes</code>, which is an estimate, this is a
		 * measured value. It is returned only after the native process has reported a
		 * measurement.
		 * <p>
		 * API name: {@code runtime_native_memory_bytes}
		 */
		public final Builder runtimeNativeMemoryBytes(@Nullable String value) {
			this.runtimeNativeMemoryBytes = value;
			return this;
		}

		/**
		 * The sum, across the nodes the deployment runs on, of the peak native memory
		 * (resident set size) of each node's inference process since it started. It is
		 * returned only after the native process has reported a measurement.
		 * <p>
		 * API name: {@code peak_runtime_native_memory_bytes}
		 */
		public final Builder peakRuntimeNativeMemoryBytes(@Nullable String value) {
			this.peakRuntimeNativeMemoryBytes = value;
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelSizeStats}
	 */
	public static final JsonpDeserializer<TrainedModelSizeStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelSizeStats::setupTrainedModelSizeStatsDeserializer);

	protected static void setupTrainedModelSizeStatsDeserializer(ObjectDeserializer<TrainedModelSizeStats.Builder> op) {

		op.add(Builder::modelSizeBytes, JsonpDeserializer.stringDeserializer(), "model_size_bytes");
		op.add(Builder::requiredNativeMemoryBytes, JsonpDeserializer.stringDeserializer(),
				"required_native_memory_bytes");
		op.add(Builder::runtimeNativeMemoryBytes, JsonpDeserializer.stringDeserializer(),
				"runtime_native_memory_bytes");
		op.add(Builder::peakRuntimeNativeMemoryBytes, JsonpDeserializer.stringDeserializer(),
				"peak_runtime_native_memory_bytes");

	}

}
