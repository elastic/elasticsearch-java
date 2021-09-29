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

package co.elastic.clients.elasticsearch.ml.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.info.Limits
@JsonpDeserializable
public final class Limits implements JsonpSerializable {
	@Nullable
	private final String maxModelMemoryLimit;

	private final String effectiveMaxModelMemoryLimit;

	private final String totalMlMemory;

	// ---------------------------------------------------------------------------------------------

	public Limits(Builder builder) {

		this.maxModelMemoryLimit = builder.maxModelMemoryLimit;
		this.effectiveMaxModelMemoryLimit = Objects.requireNonNull(builder.effectiveMaxModelMemoryLimit,
				"effective_max_model_memory_limit");
		this.totalMlMemory = Objects.requireNonNull(builder.totalMlMemory, "total_ml_memory");

	}

	public Limits(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code max_model_memory_limit}
	 */
	@Nullable
	public String maxModelMemoryLimit() {
		return this.maxModelMemoryLimit;
	}

	/**
	 * API name: {@code effective_max_model_memory_limit}
	 */
	public String effectiveMaxModelMemoryLimit() {
		return this.effectiveMaxModelMemoryLimit;
	}

	/**
	 * API name: {@code total_ml_memory}
	 */
	public String totalMlMemory() {
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

		if (this.maxModelMemoryLimit != null) {

			generator.writeKey("max_model_memory_limit");
			generator.write(this.maxModelMemoryLimit);

		}

		generator.writeKey("effective_max_model_memory_limit");
		generator.write(this.effectiveMaxModelMemoryLimit);

		generator.writeKey("total_ml_memory");
		generator.write(this.totalMlMemory);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Limits}.
	 */
	public static class Builder implements ObjectBuilder<Limits> {
		@Nullable
		private String maxModelMemoryLimit;

		private String effectiveMaxModelMemoryLimit;

		private String totalMlMemory;

		/**
		 * API name: {@code max_model_memory_limit}
		 */
		public Builder maxModelMemoryLimit(@Nullable String value) {
			this.maxModelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code effective_max_model_memory_limit}
		 */
		public Builder effectiveMaxModelMemoryLimit(String value) {
			this.effectiveMaxModelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code total_ml_memory}
		 */
		public Builder totalMlMemory(String value) {
			this.totalMlMemory = value;
			return this;
		}

		/**
		 * Builds a {@link Limits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Limits build() {

			return new Limits(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Limits}
	 */
	public static final JsonpDeserializer<Limits> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Limits::setupLimitsDeserializer, Builder::build);

	protected static void setupLimitsDeserializer(DelegatingDeserializer<Limits.Builder> op) {

		op.add(Builder::maxModelMemoryLimit, JsonpDeserializer.stringDeserializer(), "max_model_memory_limit");
		op.add(Builder::effectiveMaxModelMemoryLimit, JsonpDeserializer.stringDeserializer(),
				"effective_max_model_memory_limit");
		op.add(Builder::totalMlMemory, JsonpDeserializer.stringDeserializer(), "total_ml_memory");

	}

}
