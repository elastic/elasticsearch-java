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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/security/get_service_credentials/GetServiceCredentialsResponse.ts#L24-L32">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetServiceCredentialsResponse implements JsonpSerializable {
	private final String serviceAccount;

	private final String nodeName;

	private final int count;

	private final Map<String, EmptyObject> tokens;

	private final Map<String, EmptyObject> fileTokens;

	// ---------------------------------------------------------------------------------------------

	private GetServiceCredentialsResponse(Builder builder) {

		this.serviceAccount = ApiTypeHelper.requireNonNull(builder.serviceAccount, this, "serviceAccount");
		this.nodeName = ApiTypeHelper.requireNonNull(builder.nodeName, this, "nodeName");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.tokens = ApiTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");
		this.fileTokens = ApiTypeHelper.unmodifiableRequired(builder.fileTokens, this, "fileTokens");

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
	 * Required - API name: {@code node_name}
	 */
	public final String nodeName() {
		return this.nodeName;
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
	public final Map<String, EmptyObject> tokens() {
		return this.tokens;
	}

	/**
	 * Required - API name: {@code file_tokens}
	 */
	public final Map<String, EmptyObject> fileTokens() {
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

		if (ApiTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartObject();
			for (Map.Entry<String, EmptyObject> item0 : this.tokens.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.fileTokens)) {
			generator.writeKey("file_tokens");
			generator.writeStartObject();
			for (Map.Entry<String, EmptyObject> item0 : this.fileTokens.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetServiceCredentialsResponse> {
		private String serviceAccount;

		private String nodeName;

		private Integer count;

		private Map<String, EmptyObject> tokens;

		private Map<String, EmptyObject> fileTokens;

		/**
		 * Required - API name: {@code service_account}
		 */
		public final Builder serviceAccount(String value) {
			this.serviceAccount = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_name}
		 */
		public final Builder nodeName(String value) {
			this.nodeName = value;
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
		public final Builder tokens(Map<String, EmptyObject> map) {
			this.tokens = _mapPutAll(this.tokens, map);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds an entry to <code>tokens</code>.
		 */
		public final Builder tokens(String key, EmptyObject value) {
			this.tokens = _mapPut(this.tokens, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 * <p>
		 * Adds an entry to <code>tokens</code> using a builder lambda.
		 */
		public final Builder tokens(String key, Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return tokens(key, fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * Required - API name: {@code file_tokens}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fileTokens</code>.
		 */
		public final Builder fileTokens(Map<String, EmptyObject> map) {
			this.fileTokens = _mapPutAll(this.fileTokens, map);
			return this;
		}

		/**
		 * Required - API name: {@code file_tokens}
		 * <p>
		 * Adds an entry to <code>fileTokens</code>.
		 */
		public final Builder fileTokens(String key, EmptyObject value) {
			this.fileTokens = _mapPut(this.fileTokens, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code file_tokens}
		 * <p>
		 * Adds an entry to <code>fileTokens</code> using a builder lambda.
		 */
		public final Builder fileTokens(String key, Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return fileTokens(key, fn.apply(new EmptyObject.Builder()).build());
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
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::tokens, JsonpDeserializer.stringMapDeserializer(EmptyObject._DESERIALIZER), "tokens");
		op.add(Builder::fileTokens, JsonpDeserializer.stringMapDeserializer(EmptyObject._DESERIALIZER), "file_tokens");

	}

}
