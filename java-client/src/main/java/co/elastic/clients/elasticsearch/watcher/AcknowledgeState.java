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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.AcknowledgeState
@JsonpDeserializable
public final class AcknowledgeState implements JsonpSerializable {
	private final AcknowledgementOptions state;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	public AcknowledgeState(Builder builder) {

		this.state = Objects.requireNonNull(builder.state, "state");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	public AcknowledgeState(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code state}
	 */
	public AcknowledgementOptions state() {
		return this.state;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
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

		generator.writeKey("state");
		this.state.serialize(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AcknowledgeState}.
	 */
	public static class Builder implements ObjectBuilder<AcknowledgeState> {
		private AcknowledgementOptions state;

		private String timestamp;

		/**
		 * API name: {@code state}
		 */
		public Builder state(AcknowledgementOptions value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link AcknowledgeState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AcknowledgeState build() {

			return new AcknowledgeState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AcknowledgeState}
	 */
	public static final JsonpDeserializer<AcknowledgeState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AcknowledgeState::setupAcknowledgeStateDeserializer, Builder::build);

	protected static void setupAcknowledgeStateDeserializer(DelegatingDeserializer<AcknowledgeState.Builder> op) {

		op.add(Builder::state, AcknowledgementOptions._DESERIALIZER, "state");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
