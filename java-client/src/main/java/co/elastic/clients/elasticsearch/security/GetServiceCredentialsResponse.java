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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.EmptyObject;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.Response
@JsonpDeserializable
public final class GetServiceCredentialsResponse implements JsonpSerializable {
	private final String serviceAccount;

	private final String nodeName;

	private final int count;

	private final Map<String, EmptyObject> tokens;

	private final Map<String, EmptyObject> fileTokens;

	// ---------------------------------------------------------------------------------------------

	public GetServiceCredentialsResponse(Builder builder) {

		this.serviceAccount = Objects.requireNonNull(builder.serviceAccount, "service_account");
		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.tokens = ModelTypeHelper.unmodifiableNonNull(builder.tokens, "tokens");
		this.fileTokens = ModelTypeHelper.unmodifiableNonNull(builder.fileTokens, "file_tokens");

	}

	public GetServiceCredentialsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code service_account}
	 */
	public String serviceAccount() {
		return this.serviceAccount;
	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code count}
	 */
	public int count() {
		return this.count;
	}

	/**
	 * API name: {@code tokens}
	 */
	public Map<String, EmptyObject> tokens() {
		return this.tokens;
	}

	/**
	 * API name: {@code file_tokens}
	 */
	public Map<String, EmptyObject> fileTokens() {
		return this.fileTokens;
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

		generator.writeKey("service_account");
		generator.write(this.serviceAccount);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("tokens");
		generator.writeStartObject();
		for (Map.Entry<String, EmptyObject> item0 : this.tokens.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("file_tokens");
		generator.writeStartObject();
		for (Map.Entry<String, EmptyObject> item0 : this.fileTokens.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetServiceCredentialsResponse> {
		private String serviceAccount;

		private String nodeName;

		private Integer count;

		private Map<String, EmptyObject> tokens;

		private Map<String, EmptyObject> fileTokens;

		/**
		 * API name: {@code service_account}
		 */
		public Builder serviceAccount(String value) {
			this.serviceAccount = value;
			return this;
		}

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(Map<String, EmptyObject> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #tokens(Map)}, creating the map if needed.
		 */
		public Builder putTokens(String key, EmptyObject value) {
			if (this.tokens == null) {
				this.tokens = new HashMap<>();
			}
			this.tokens.put(key, value);
			return this;
		}

		/**
		 * Set {@link #tokens(Map)} to a singleton map.
		 */
		public Builder tokens(String key, Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.tokens(Collections.singletonMap(key, fn.apply(new EmptyObject.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #tokens(Map)}, creating the map if needed.
		 */
		public Builder putTokens(String key, Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.putTokens(key, fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * API name: {@code file_tokens}
		 */
		public Builder fileTokens(Map<String, EmptyObject> value) {
			this.fileTokens = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fileTokens(Map)}, creating the map if needed.
		 */
		public Builder putFileTokens(String key, EmptyObject value) {
			if (this.fileTokens == null) {
				this.fileTokens = new HashMap<>();
			}
			this.fileTokens.put(key, value);
			return this;
		}

		/**
		 * Set {@link #fileTokens(Map)} to a singleton map.
		 */
		public Builder fileTokens(String key, Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.fileTokens(Collections.singletonMap(key, fn.apply(new EmptyObject.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #fileTokens(Map)}, creating the map if needed.
		 */
		public Builder putFileTokens(String key, Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.putFileTokens(key, fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * Builds a {@link GetServiceCredentialsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceCredentialsResponse build() {

			return new GetServiceCredentialsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetServiceCredentialsResponse}
	 */
	public static final JsonpDeserializer<GetServiceCredentialsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetServiceCredentialsResponse::setupGetServiceCredentialsResponseDeserializer,
			Builder::build);

	protected static void setupGetServiceCredentialsResponseDeserializer(
			DelegatingDeserializer<GetServiceCredentialsResponse.Builder> op) {

		op.add(Builder::serviceAccount, JsonpDeserializer.stringDeserializer(), "service_account");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::tokens, JsonpDeserializer.stringMapDeserializer(EmptyObject._DESERIALIZER), "tokens");
		op.add(Builder::fileTokens, JsonpDeserializer.stringMapDeserializer(EmptyObject._DESERIALIZER), "file_tokens");

	}

}
