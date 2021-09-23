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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.AnalysisMemoryLimit
public final class AnalysisMemoryLimit implements JsonpSerializable {
	private final String modelMemoryLimit;

	// ---------------------------------------------------------------------------------------------

	public AnalysisMemoryLimit(Builder builder) {

		this.modelMemoryLimit = Objects.requireNonNull(builder.modelMemoryLimit, "model_memory_limit");

	}

	/**
	 * Limits can be applied for the resources required to hold the mathematical
	 * models in memory. These limits are approximate and can be set per job. They
	 * do not control the memory used by other processes, for example the
	 * Elasticsearch Java processes.
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
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

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalysisMemoryLimit}.
	 */
	public static class Builder implements ObjectBuilder<AnalysisMemoryLimit> {
		private String modelMemoryLimit;

		/**
		 * Limits can be applied for the resources required to hold the mathematical
		 * models in memory. These limits are approximate and can be set per job. They
		 * do not control the memory used by other processes, for example the
		 * Elasticsearch Java processes.
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Builds a {@link AnalysisMemoryLimit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalysisMemoryLimit build() {

			return new AnalysisMemoryLimit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalysisMemoryLimit}
	 */
	public static final JsonpDeserializer<AnalysisMemoryLimit> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalysisMemoryLimit::setupAnalysisMemoryLimitDeserializer);

	protected static void setupAnalysisMemoryLimitDeserializer(DelegatingDeserializer<AnalysisMemoryLimit.Builder> op) {

		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");

	}

}
