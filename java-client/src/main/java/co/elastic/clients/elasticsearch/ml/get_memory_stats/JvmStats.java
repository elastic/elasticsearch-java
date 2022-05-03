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

package co.elastic.clients.elasticsearch.ml.get_memory_stats;

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

// typedef: ml.get_memory_stats.JvmStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.get_memory_stats.JvmStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class JvmStats implements JsonpSerializable {
	@Nullable
	private final String heapMax;

	private final int heapMaxInBytes;

	@Nullable
	private final String javaInference;

	private final int javaInferenceInBytes;

	@Nullable
	private final String javaInferenceMax;

	private final int javaInferenceMaxInBytes;

	// ---------------------------------------------------------------------------------------------

	private JvmStats(Builder builder) {

		this.heapMax = builder.heapMax;
		this.heapMaxInBytes = ApiTypeHelper.requireNonNull(builder.heapMaxInBytes, this, "heapMaxInBytes");
		this.javaInference = builder.javaInference;
		this.javaInferenceInBytes = ApiTypeHelper.requireNonNull(builder.javaInferenceInBytes, this,
				"javaInferenceInBytes");
		this.javaInferenceMax = builder.javaInferenceMax;
		this.javaInferenceMaxInBytes = ApiTypeHelper.requireNonNull(builder.javaInferenceMaxInBytes, this,
				"javaInferenceMaxInBytes");

	}

	public static JvmStats of(Function<Builder, ObjectBuilder<JvmStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Maximum amount of memory available for use by the heap.
	 * <p>
	 * API name: {@code heap_max}
	 */
	@Nullable
	public final String heapMax() {
		return this.heapMax;
	}

	/**
	 * Required - Maximum amount of memory, in bytes, available for use by the heap.
	 * <p>
	 * API name: {@code heap_max_in_bytes}
	 */
	public final int heapMaxInBytes() {
		return this.heapMaxInBytes;
	}

	/**
	 * Amount of Java heap currently being used for caching inference models.
	 * <p>
	 * API name: {@code java_inference}
	 */
	@Nullable
	public final String javaInference() {
		return this.javaInference;
	}

	/**
	 * Required - Amount of Java heap, in bytes, currently being used for caching
	 * inference models.
	 * <p>
	 * API name: {@code java_inference_in_bytes}
	 */
	public final int javaInferenceInBytes() {
		return this.javaInferenceInBytes;
	}

	/**
	 * Maximum amount of Java heap to be used for caching inference models.
	 * <p>
	 * API name: {@code java_inference_max}
	 */
	@Nullable
	public final String javaInferenceMax() {
		return this.javaInferenceMax;
	}

	/**
	 * Required - Maximum amount of Java heap, in bytes, to be used for caching
	 * inference models.
	 * <p>
	 * API name: {@code java_inference_max_in_bytes}
	 */
	public final int javaInferenceMaxInBytes() {
		return this.javaInferenceMaxInBytes;
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

		if (this.heapMax != null) {
			generator.writeKey("heap_max");
			generator.write(this.heapMax);

		}
		generator.writeKey("heap_max_in_bytes");
		generator.write(this.heapMaxInBytes);

		if (this.javaInference != null) {
			generator.writeKey("java_inference");
			generator.write(this.javaInference);

		}
		generator.writeKey("java_inference_in_bytes");
		generator.write(this.javaInferenceInBytes);

		if (this.javaInferenceMax != null) {
			generator.writeKey("java_inference_max");
			generator.write(this.javaInferenceMax);

		}
		generator.writeKey("java_inference_max_in_bytes");
		generator.write(this.javaInferenceMaxInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JvmStats> {
		@Nullable
		private String heapMax;

		private Integer heapMaxInBytes;

		@Nullable
		private String javaInference;

		private Integer javaInferenceInBytes;

		@Nullable
		private String javaInferenceMax;

		private Integer javaInferenceMaxInBytes;

		/**
		 * Maximum amount of memory available for use by the heap.
		 * <p>
		 * API name: {@code heap_max}
		 */
		public final Builder heapMax(@Nullable String value) {
			this.heapMax = value;
			return this;
		}

		/**
		 * Required - Maximum amount of memory, in bytes, available for use by the heap.
		 * <p>
		 * API name: {@code heap_max_in_bytes}
		 */
		public final Builder heapMaxInBytes(int value) {
			this.heapMaxInBytes = value;
			return this;
		}

		/**
		 * Amount of Java heap currently being used for caching inference models.
		 * <p>
		 * API name: {@code java_inference}
		 */
		public final Builder javaInference(@Nullable String value) {
			this.javaInference = value;
			return this;
		}

		/**
		 * Required - Amount of Java heap, in bytes, currently being used for caching
		 * inference models.
		 * <p>
		 * API name: {@code java_inference_in_bytes}
		 */
		public final Builder javaInferenceInBytes(int value) {
			this.javaInferenceInBytes = value;
			return this;
		}

		/**
		 * Maximum amount of Java heap to be used for caching inference models.
		 * <p>
		 * API name: {@code java_inference_max}
		 */
		public final Builder javaInferenceMax(@Nullable String value) {
			this.javaInferenceMax = value;
			return this;
		}

		/**
		 * Required - Maximum amount of Java heap, in bytes, to be used for caching
		 * inference models.
		 * <p>
		 * API name: {@code java_inference_max_in_bytes}
		 */
		public final Builder javaInferenceMaxInBytes(int value) {
			this.javaInferenceMaxInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JvmStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JvmStats build() {
			_checkSingleUse();

			return new JvmStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JvmStats}
	 */
	public static final JsonpDeserializer<JvmStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JvmStats::setupJvmStatsDeserializer);

	protected static void setupJvmStatsDeserializer(ObjectDeserializer<JvmStats.Builder> op) {

		op.add(Builder::heapMax, JsonpDeserializer.stringDeserializer(), "heap_max");
		op.add(Builder::heapMaxInBytes, JsonpDeserializer.integerDeserializer(), "heap_max_in_bytes");
		op.add(Builder::javaInference, JsonpDeserializer.stringDeserializer(), "java_inference");
		op.add(Builder::javaInferenceInBytes, JsonpDeserializer.integerDeserializer(), "java_inference_in_bytes");
		op.add(Builder::javaInferenceMax, JsonpDeserializer.stringDeserializer(), "java_inference_max");
		op.add(Builder::javaInferenceMaxInBytes, JsonpDeserializer.integerDeserializer(),
				"java_inference_max_in_bytes");

	}

}
