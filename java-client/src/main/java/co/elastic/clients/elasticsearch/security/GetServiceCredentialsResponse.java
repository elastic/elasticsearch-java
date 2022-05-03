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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_service_credentials.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetServiceCredentialsResponse implements JsonpSerializable {
	private final String serviceAccount;

	private final int count;

	private final Map<String, Map<String, JsonData>> tokens;

	private final NodesCredentials nodesCredentials;

	// ---------------------------------------------------------------------------------------------

	private GetServiceCredentialsResponse(Builder builder) {

		this.serviceAccount = ApiTypeHelper.requireNonNull(builder.serviceAccount, this, "serviceAccount");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.tokens = ApiTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");
		this.nodesCredentials = ApiTypeHelper.requireNonNull(builder.nodesCredentials, this, "nodesCredentials");

	}

	public static GetServiceCredentialsResponse of(Function<Builder, ObjectBuilder<GetServiceCredentialsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code service_account}
	 */
	public final String serviceAccount() {
		return this.serviceAccount;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code tokens}
	 */
	public final Map<String, Map<String, JsonData>> tokens() {
		return this.tokens;
	}

	/**
	 * Required - Contains service account credentials collected from all nodes of
	 * the cluster
	 * <p>
	 * API name: {@code nodes_credentials}
	 */
	public final NodesCredentials nodesCredentials() {
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

		if (ApiTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, JsonData>> item0 : this.tokens.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, JsonData> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("nodes_credentials");
		this.nodesCredentials.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetServiceCredentialsResponse> {
		private String serviceAccount;

		private Integer count;

		private Map<String, Map<String, JsonData>> tokens;

		private NodesCredentials nodesCredentials;

		/**
		 * Required - API name: {@code service_account}
		 */
		public final Builder serviceAccount(String value) {
			this.serviceAccount = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>tokens</code>.
		 */
		public final Builder tokens(Map<String, Map<String, JsonData>> map) {
			this.tokens = _mapPutAll(this.tokens, map);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds an entry to <code>tokens</code>.
		 */
		public final Builder tokens(String key, Map<String, JsonData> value) {
			this.tokens = _mapPut(this.tokens, key, value);
			return this;
		}

		/**
		 * Required - Contains service account credentials collected from all nodes of
		 * the cluster
		 * <p>
		 * API name: {@code nodes_credentials}
		 */
		public final Builder nodesCredentials(NodesCredentials value) {
			this.nodesCredentials = value;
			return this;
		}

		/**
		 * Required - Contains service account credentials collected from all nodes of
		 * the cluster
		 * <p>
		 * API name: {@code nodes_credentials}
		 */
		public final Builder nodesCredentials(Function<NodesCredentials.Builder, ObjectBuilder<NodesCredentials>> fn) {
			return this.nodesCredentials(fn.apply(new NodesCredentials.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetServiceCredentialsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceCredentialsResponse build() {
			_checkSingleUse();

			return new GetServiceCredentialsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetServiceCredentialsResponse}
	 */
	public static final JsonpDeserializer<GetServiceCredentialsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetServiceCredentialsResponse::setupGetServiceCredentialsResponseDeserializer);

	protected static void setupGetServiceCredentialsResponseDeserializer(
			ObjectDeserializer<GetServiceCredentialsResponse.Builder> op) {

		op.add(Builder::serviceAccount, JsonpDeserializer.stringDeserializer(), "service_account");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::tokens, JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)), "tokens");
		op.add(Builder::nodesCredentials, NodesCredentials._DESERIALIZER, "nodes_credentials");

	}

}
