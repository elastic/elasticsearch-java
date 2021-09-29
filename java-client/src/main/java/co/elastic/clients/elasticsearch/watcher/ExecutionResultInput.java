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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultInput
@JsonpDeserializable
public final class ExecutionResultInput implements JsonpSerializable {
	private final Map<String, JsonData> payload;

	private final ActionStatusOptions status;

	private final InputType type;

	// ---------------------------------------------------------------------------------------------

	public ExecutionResultInput(Builder builder) {

		this.payload = ModelTypeHelper.unmodifiableNonNull(builder.payload, "payload");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	public ExecutionResultInput(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code payload}
	 */
	public Map<String, JsonData> payload() {
		return this.payload;
	}

	/**
	 * API name: {@code status}
	 */
	public ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public InputType type() {
		return this.type;
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

		generator.writeKey("payload");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.payload.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultInput}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionResultInput> {
		private Map<String, JsonData> payload;

		private ActionStatusOptions status;

		private InputType type;

		/**
		 * API name: {@code payload}
		 */
		public Builder payload(Map<String, JsonData> value) {
			this.payload = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #payload(Map)}, creating the map if needed.
		 */
		public Builder putPayload(String key, JsonData value) {
			if (this.payload == null) {
				this.payload = new HashMap<>();
			}
			this.payload.put(key, value);
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(InputType value) {
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
	 * Json deserializer for {@link ExecutionResultInput}
	 */
	public static final JsonpDeserializer<ExecutionResultInput> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultInput::setupExecutionResultInputDeserializer, Builder::build);

	protected static void setupExecutionResultInputDeserializer(
			DelegatingDeserializer<ExecutionResultInput.Builder> op) {

		op.add(Builder::payload, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "payload");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::type, InputType._DESERIALIZER, "type");

	}

}
