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

import co.elastic.clients.elasticsearch.security.get_service_credentials.NodesCredentials;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.Response
@JsonpDeserializable
public final class GetServiceCredentialsResponse implements JsonpSerializable {
	private final String serviceAccount;

	private final Integer count;

	private final Map<String, Map<String, JsonData>> tokens;

	private final NodesCredentials nodesCredentials;

	// ---------------------------------------------------------------------------------------------

	public GetServiceCredentialsResponse(Builder builder) {

		this.serviceAccount = Objects.requireNonNull(builder.serviceAccount, "service_account");
		this.count = Objects.requireNonNull(builder.count, "count");
		this.tokens = Objects.requireNonNull(builder.tokens, "tokens");
		this.nodesCredentials = Objects.requireNonNull(builder.nodesCredentials, "nodes_credentials");

	}

	/**
	 * API name: {@code service_account}
	 */
	public String serviceAccount() {
		return this.serviceAccount;
	}

	/**
	 * API name: {@code count}
	 */
	public Integer count() {
		return this.count;
	}

	/**
	 * API name: {@code tokens}
	 */
	public Map<String, Map<String, JsonData>> tokens() {
		return this.tokens;
	}

	/**
	 * Contains service account credentials collected from all nodes of the cluster
	 * <p>
	 * API name: {@code nodes_credentials}
	 */
	public NodesCredentials nodesCredentials() {
		return this.nodesCredentials;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("tokens");
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, JsonData>> item0 : this.tokens.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item1 : item0.getValue().entrySet()) {
				generator.writeKey(item1.getKey());
				item1.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("nodes_credentials");
		this.nodesCredentials.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetServiceCredentialsResponse> {
		private String serviceAccount;

		private Integer count;

		private Map<String, Map<String, JsonData>> tokens;

		private NodesCredentials nodesCredentials;

		/**
		 * API name: {@code service_account}
		 */
		public Builder serviceAccount(String value) {
			this.serviceAccount = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Integer value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(Map<String, Map<String, JsonData>> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #tokens(Map)}, creating the map if needed.
		 */
		public Builder putTokens(String key, Map<String, JsonData> value) {
			if (this.tokens == null) {
				this.tokens = new HashMap<>();
			}
			this.tokens.put(key, value);
			return this;
		}

		/**
		 * Contains service account credentials collected from all nodes of the cluster
		 * <p>
		 * API name: {@code nodes_credentials}
		 */
		public Builder nodesCredentials(NodesCredentials value) {
			this.nodesCredentials = value;
			return this;
		}

		/**
		 * Contains service account credentials collected from all nodes of the cluster
		 * <p>
		 * API name: {@code nodes_credentials}
		 */
		public Builder nodesCredentials(Function<NodesCredentials.Builder, ObjectBuilder<NodesCredentials>> fn) {
			return this.nodesCredentials(fn.apply(new NodesCredentials.Builder()).build());
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
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::tokens, JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)), "tokens");
		op.add(Builder::nodesCredentials, NodesCredentials._DESERIALIZER, "nodes_credentials");

	}

}
