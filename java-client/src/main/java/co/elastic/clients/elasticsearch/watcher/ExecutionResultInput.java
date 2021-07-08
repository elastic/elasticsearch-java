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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultInput
public final class ExecutionResultInput implements ToJsonp {
	private final Map<String, JsonValue> payload;

	private final JsonValue status;

	private final JsonValue type;

	// ---------------------------------------------------------------------------------------------

	protected ExecutionResultInput(Builder builder) {

		this.payload = Objects.requireNonNull(builder.payload, "payload");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code payload}
	 */
	public Map<String, JsonValue> payload() {
		return this.payload;
	}

	/**
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("payload");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.payload.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultInput}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionResultInput> {
		private Map<String, JsonValue> payload;

		private JsonValue status;

		private JsonValue type;

		/**
		 * API name: {@code payload}
		 */
		public Builder payload(Map<String, JsonValue> value) {
			this.payload = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #payload(Map)}, creating the map if needed.
		 */
		public Builder putPayload(String key, JsonValue value) {
			if (this.payload == null) {
				this.payload = new HashMap<>();
			}
			this.payload.put(key, value);
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultInput build() {

			return new ExecutionResultInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExecutionResultInput
	 */
	public static final JsonpDeserializer<ExecutionResultInput> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExecutionResultInput::setupExecutionResultInputDeserializer);

	protected static void setupExecutionResultInputDeserializer(
			DelegatingDeserializer<ExecutionResultInput.Builder> op) {

		op.add(Builder::payload, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"payload");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");

	}

}
