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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: license.post_start_basic.Response
@JsonpDeserializable
public final class PostStartBasicResponse extends AcknowledgedResponseBase {
	private final Map<String, List<String>> acknowledge;

	private final boolean basicWasStarted;

	private final String errorMessage;

	// ---------------------------------------------------------------------------------------------

	public PostStartBasicResponse(Builder builder) {
		super(builder);

		this.acknowledge = Objects.requireNonNull(builder.acknowledge, "acknowledge");
		this.basicWasStarted = Objects.requireNonNull(builder.basicWasStarted, "basic_was_started");
		this.errorMessage = Objects.requireNonNull(builder.errorMessage, "error_message");

	}

	/**
	 * API name: {@code acknowledge}
	 */
	public Map<String, List<String>> acknowledge() {
		return this.acknowledge;
	}

	/**
	 * API name: {@code basic_was_started}
	 */
	public boolean basicWasStarted() {
		return this.basicWasStarted;
	}

	/**
	 * API name: {@code error_message}
	 */
	public String errorMessage() {
		return this.errorMessage;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("acknowledge");
		generator.writeStartObject();
		for (Map.Entry<String, List<String>> item0 : this.acknowledge.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (String item1 : item0.getValue()) {
				generator.write(item1);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("basic_was_started");
		generator.write(this.basicWasStarted);

		generator.writeKey("error_message");
		generator.write(this.errorMessage);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartBasicResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostStartBasicResponse> {
		private Map<String, List<String>> acknowledge;

		private Boolean basicWasStarted;

		private String errorMessage;

		/**
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(Map<String, List<String>> value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #acknowledge(Map)}, creating the map if needed.
		 */
		public Builder putAcknowledge(String key, List<String> value) {
			if (this.acknowledge == null) {
				this.acknowledge = new HashMap<>();
			}
			this.acknowledge.put(key, value);
			return this;
		}

		/**
		 * API name: {@code basic_was_started}
		 */
		public Builder basicWasStarted(boolean value) {
			this.basicWasStarted = value;
			return this;
		}

		/**
		 * API name: {@code error_message}
		 */
		public Builder errorMessage(String value) {
			this.errorMessage = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostStartBasicResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartBasicResponse build() {

			return new PostStartBasicResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostStartBasicResponse}
	 */
	public static final JsonpDeserializer<PostStartBasicResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PostStartBasicResponse::setupPostStartBasicResponseDeserializer, Builder::build);

	protected static void setupPostStartBasicResponseDeserializer(
			DelegatingDeserializer<PostStartBasicResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::acknowledge, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "acknowledge");
		op.add(Builder::basicWasStarted, JsonpDeserializer.booleanDeserializer(), "basic_was_started");
		op.add(Builder::errorMessage, JsonpDeserializer.stringDeserializer(), "error_message");

	}

}
