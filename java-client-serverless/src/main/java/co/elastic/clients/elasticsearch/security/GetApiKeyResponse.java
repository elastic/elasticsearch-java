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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_api_key.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.get_api_key.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetApiKeyResponse implements JsonpSerializable {
	private final List<ApiKey> apiKeys;

	// ---------------------------------------------------------------------------------------------

	private GetApiKeyResponse(Builder builder) {

		this.apiKeys = ApiTypeHelper.unmodifiableRequired(builder.apiKeys, this, "apiKeys");

	}

	public static GetApiKeyResponse of(Function<Builder, ObjectBuilder<GetApiKeyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code api_keys}
	 */
	public final List<ApiKey> apiKeys() {
		return this.apiKeys;
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

		if (ApiTypeHelper.isDefined(this.apiKeys)) {
			generator.writeKey("api_keys");
			generator.writeStartArray();
			for (ApiKey item0 : this.apiKeys) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetApiKeyResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetApiKeyResponse> {
		private List<ApiKey> apiKeys;

		/**
		 * Required - API name: {@code api_keys}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>apiKeys</code>.
		 */
		public final Builder apiKeys(List<ApiKey> list) {
			this.apiKeys = _listAddAll(this.apiKeys, list);
			return this;
		}

		/**
		 * Required - API name: {@code api_keys}
		 * <p>
		 * Adds one or more values to <code>apiKeys</code>.
		 */
		public final Builder apiKeys(ApiKey value, ApiKey... values) {
			this.apiKeys = _listAdd(this.apiKeys, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code api_keys}
		 * <p>
		 * Adds a value to <code>apiKeys</code> using a builder lambda.
		 */
		public final Builder apiKeys(Function<ApiKey.Builder, ObjectBuilder<ApiKey>> fn) {
			return apiKeys(fn.apply(new ApiKey.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetApiKeyResponse build() {
			_checkSingleUse();

			return new GetApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetApiKeyResponse}
	 */
	public static final JsonpDeserializer<GetApiKeyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetApiKeyResponse::setupGetApiKeyResponseDeserializer);

	protected static void setupGetApiKeyResponseDeserializer(ObjectDeserializer<GetApiKeyResponse.Builder> op) {

		op.add(Builder::apiKeys, JsonpDeserializer.arrayDeserializer(ApiKey._DESERIALIZER), "api_keys");

	}

}
