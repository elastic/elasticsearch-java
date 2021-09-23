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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest.processor_grok.Response
public final class ProcessorGrokResponse implements JsonpSerializable {
	private final Map<String, String> patterns;

	// ---------------------------------------------------------------------------------------------

	public ProcessorGrokResponse(Builder builder) {

		this.patterns = Objects.requireNonNull(builder.patterns, "patterns");

	}

	/**
	 * API name: {@code patterns}
	 */
	public Map<String, String> patterns() {
		return this.patterns;
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

		generator.writeKey("patterns");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.patterns.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ProcessorGrokResponse}.
	 */
	public static class Builder implements ObjectBuilder<ProcessorGrokResponse> {
		private Map<String, String> patterns;

		/**
		 * API name: {@code patterns}
		 */
		public Builder patterns(Map<String, String> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #patterns(Map)}, creating the map if needed.
		 */
		public Builder putPatterns(String key, String value) {
			if (this.patterns == null) {
				this.patterns = new HashMap<>();
			}
			this.patterns.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ProcessorGrokResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ProcessorGrokResponse build() {

			return new ProcessorGrokResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ProcessorGrokResponse}
	 */
	public static final JsonpDeserializer<ProcessorGrokResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ProcessorGrokResponse::setupProcessorGrokResponseDeserializer);

	protected static void setupProcessorGrokResponseDeserializer(
			DelegatingDeserializer<ProcessorGrokResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"patterns");

	}

}
