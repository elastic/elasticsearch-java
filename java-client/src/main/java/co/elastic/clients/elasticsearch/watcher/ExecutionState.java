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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: watcher._types.ExecutionState

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.ExecutionState">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionState implements JsonpSerializable {
	private final boolean successful;

	private final DateTime timestamp;

	@Nullable
	private final String reason;

	// ---------------------------------------------------------------------------------------------

	private ExecutionState(Builder builder) {

		this.successful = ApiTypeHelper.requireNonNull(builder.successful, this, "successful");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.reason = builder.reason;

	}

	public static ExecutionState of(Function<Builder, ObjectBuilder<ExecutionState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code successful}
	 */
	public final boolean successful() {
		return this.successful;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final DateTime timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
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

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("timestamp");
		this.timestamp.serialize(generator, mapper);
		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionState}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ExecutionState> {
		private Boolean successful;

		private DateTime timestamp;

		@Nullable
		private String reason;

		/**
		 * Required - API name: {@code successful}
		 */
		public final Builder successful(boolean value) {
			this.successful = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(DateTime value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionState build() {
			_checkSingleUse();

			return new ExecutionState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionState}
	 */
	public static final JsonpDeserializer<ExecutionState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExecutionState::setupExecutionStateDeserializer);

	protected static void setupExecutionStateDeserializer(ObjectDeserializer<ExecutionState.Builder> op) {

		op.add(Builder::successful, JsonpDeserializer.booleanDeserializer(), "successful");
		op.add(Builder::timestamp, DateTime._DESERIALIZER, "timestamp");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");

	}

}
