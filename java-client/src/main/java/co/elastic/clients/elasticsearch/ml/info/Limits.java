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

package co.elastic.clients.elasticsearch.ml.info;

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

// typedef: ml.info.Limits

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.info.Limits">API
 *      specification</a>
 */
@JsonpDeserializable
public class Limits implements JsonpSerializable {
	@Nullable
	private final Integer maxSingleMlNodeProcessors;

	@Nullable
	private final Integer totalMlProcessors;

	@Nullable
	private final String maxModelMemoryLimit;

	@Nullable
	private final String effectiveMaxModelMemoryLimit;

	private final String totalMlMemory;

	// ---------------------------------------------------------------------------------------------

	private Limits(Builder builder) {

		this.maxSingleMlNodeProcessors = builder.maxSingleMlNodeProcessors;
		this.totalMlProcessors = builder.totalMlProcessors;
		this.maxModelMemoryLimit = builder.maxModelMemoryLimit;
		this.effectiveMaxModelMemoryLimit = builder.effectiveMaxModelMemoryLimit;
		this.totalMlMemory = ApiTypeHelper.requireNonNull(builder.totalMlMemory, this, "totalMlMemory");

	}

	public static Limits of(Function<Builder, ObjectBuilder<Limits>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_single_ml_node_processors}
	 */
	@Nullable
	public final Integer maxSingleMlNodeProcessors() {
		return this.maxSingleMlNodeProcessors;
	}

	/**
	 * API name: {@code total_ml_processors}
	 */
	@Nullable
	public final Integer totalMlProcessors() {
		return this.totalMlProcessors;
	}

	/**
	 * API name: {@code max_model_memory_limit}
	 */
	@Nullable
	public final String maxModelMemoryLimit() {
		return this.maxModelMemoryLimit;
	}

	/**
	 * API name: {@code effective_max_model_memory_limit}
	 */
	@Nullable
	public final String effectiveMaxModelMemoryLimit() {
		return this.effectiveMaxModelMemoryLimit;
	}

	/**
	 * Required - API name: {@code total_ml_memory}
	 */
	public final String totalMlMemory() {
		return this.totalMlMemory;
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

		if (this.maxSingleMlNodeProcessors != null) {
			generator.writeKey("max_single_ml_node_processors");
			generator.write(this.maxSingleMlNodeProcessors);

		}
		if (this.totalMlProcessors != null) {
			generator.writeKey("total_ml_processors");
			generator.write(this.totalMlProcessors);

		}
		if (this.maxModelMemoryLimit != null) {
			generator.writeKey("max_model_memory_limit");
			generator.write(this.maxModelMemoryLimit);

		}
		if (this.effectiveMaxModelMemoryLimit != null) {
			generator.writeKey("effective_max_model_memory_limit");
			generator.write(this.effectiveMaxModelMemoryLimit);

		}
		generator.writeKey("total_ml_memory");
		generator.write(this.totalMlMemory);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Limits}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Limits> {
		@Nullable
		private Integer maxSingleMlNodeProcessors;

		@Nullable
		private Integer totalMlProcessors;

		@Nullable
		private String maxModelMemoryLimit;

		@Nullable
		private String effectiveMaxModelMemoryLimit;

		private String totalMlMemory;

		public Builder() {
		}
		private Builder(Limits instance) {
			this.maxSingleMlNodeProcessors = instance.maxSingleMlNodeProcessors;
			this.totalMlProcessors = instance.totalMlProcessors;
			this.maxModelMemoryLimit = instance.maxModelMemoryLimit;
			this.effectiveMaxModelMemoryLimit = instance.effectiveMaxModelMemoryLimit;
			this.totalMlMemory = instance.totalMlMemory;

		}
		/**
		 * API name: {@code max_single_ml_node_processors}
		 */
		public final Builder maxSingleMlNodeProcessors(@Nullable Integer value) {
			this.maxSingleMlNodeProcessors = value;
			return this;
		}

		/**
		 * API name: {@code total_ml_processors}
		 */
		public final Builder totalMlProcessors(@Nullable Integer value) {
			this.totalMlProcessors = value;
			return this;
		}

		/**
		 * API name: {@code max_model_memory_limit}
		 */
		public final Builder maxModelMemoryLimit(@Nullable String value) {
			this.maxModelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code effective_max_model_memory_limit}
		 */
		public final Builder effectiveMaxModelMemoryLimit(@Nullable String value) {
			this.effectiveMaxModelMemoryLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_ml_memory}
		 */
		public final Builder totalMlMemory(String value) {
			this.totalMlMemory = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Limits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Limits build() {
			_checkSingleUse();

			return new Limits(this);
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
	 * Json deserializer for {@link Limits}
	 */
	public static final JsonpDeserializer<Limits> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Limits::setupLimitsDeserializer);

	protected static void setupLimitsDeserializer(ObjectDeserializer<Limits.Builder> op) {

		op.add(Builder::maxSingleMlNodeProcessors, JsonpDeserializer.integerDeserializer(),
				"max_single_ml_node_processors");
		op.add(Builder::totalMlProcessors, JsonpDeserializer.integerDeserializer(), "total_ml_processors");
		op.add(Builder::maxModelMemoryLimit, JsonpDeserializer.stringDeserializer(), "max_model_memory_limit");
		op.add(Builder::effectiveMaxModelMemoryLimit, JsonpDeserializer.stringDeserializer(),
				"effective_max_model_memory_limit");
		op.add(Builder::totalMlMemory, JsonpDeserializer.stringDeserializer(), "total_ml_memory");

	}

}
