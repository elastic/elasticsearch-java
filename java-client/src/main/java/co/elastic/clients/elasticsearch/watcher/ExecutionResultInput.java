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

import co.elastic.clients.json.JsonData;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultInput

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultInput">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResultInput implements JsonpSerializable {
	private final Map<String, JsonData> payload;

	private final ActionStatusOptions status;

	private final InputType type;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultInput(Builder builder) {

		this.payload = ApiTypeHelper.unmodifiableRequired(builder.payload, this, "payload");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static ExecutionResultInput of(Function<Builder, ObjectBuilder<ExecutionResultInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code payload}
	 */
	public final Map<String, JsonData> payload() {
		return this.payload;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final InputType type() {
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

		if (ApiTypeHelper.isDefined(this.payload)) {
			generator.writeKey("payload");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.payload.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultInput}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecutionResultInput> {
		private Map<String, JsonData> payload;

		private ActionStatusOptions status;

		private InputType type;

		/**
		 * Required - API name: {@code payload}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>payload</code>.
		 */
		public final Builder payload(Map<String, JsonData> map) {
			this.payload = _mapPutAll(this.payload, map);
			return this;
		}

		/**
		 * Required - API name: {@code payload}
		 * <p>
		 * Adds an entry to <code>payload</code>.
		 */
		public final Builder payload(String key, JsonData value) {
			this.payload = _mapPut(this.payload, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(InputType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultInput build() {
			_checkSingleUse();

			return new ExecutionResultInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResultInput}
	 */
	public static final JsonpDeserializer<ExecutionResultInput> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultInput::setupExecutionResultInputDeserializer);

	protected static void setupExecutionResultInputDeserializer(ObjectDeserializer<ExecutionResultInput.Builder> op) {

		op.add(Builder::payload, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "payload");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::type, InputType._DESERIALIZER, "type");

	}

}
