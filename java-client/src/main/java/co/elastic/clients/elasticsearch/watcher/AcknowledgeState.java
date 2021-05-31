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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.AcknowledgeState
public final class AcknowledgeState implements ToJsonp {
	private final JsonValue state;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	protected AcknowledgeState(Builder builder) {

		this.state = Objects.requireNonNull(builder.state, "state");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * API name: {@code state}
	 */
	public JsonValue state() {
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AcknowledgeState}.
	 */
	public static class Builder implements ObjectBuilder<AcknowledgeState> {
		private JsonValue state;

		private String timestamp;

		/**
		 * API name: {@code state}
		 */
		public Builder state(JsonValue value) {
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
	 * Json parser for AcknowledgeState
	 */
	public static final JsonpValueParser<AcknowledgeState> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, AcknowledgeState::setupAcknowledgeStateParser);

	protected static void setupAcknowledgeStateParser(DelegatingJsonpValueParser<AcknowledgeState.Builder> op) {

		op.add(Builder::state, JsonpValueParser.jsonValueParser(), "state");
		op.add(Builder::timestamp, JsonpValueParser.stringParser(), "timestamp");

	}

}
