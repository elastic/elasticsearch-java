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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ThrottleState
@JsonpDeserializable
public class ThrottleState implements JsonpSerializable {
	private final String reason;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	private ThrottleState(Builder builder) {

		this.reason = ModelTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static ThrottleState of(Function<Builder, ObjectBuilder<ThrottleState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final String timestamp() {
		return this.timestamp;
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

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThrottleState}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ThrottleState> {
		private String reason;

		private String timestamp;

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ThrottleState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThrottleState build() {
			_checkSingleUse();

			return new ThrottleState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ThrottleState}
	 */
	public static final JsonpDeserializer<ThrottleState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ThrottleState::setupThrottleStateDeserializer, Builder::build);

	protected static void setupThrottleStateDeserializer(DelegatingDeserializer<ThrottleState.Builder> op) {

		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
