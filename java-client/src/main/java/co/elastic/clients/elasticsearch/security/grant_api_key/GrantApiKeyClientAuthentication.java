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

package co.elastic.clients.elasticsearch.security.grant_api_key;

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

// typedef: security.grant_api_key.GrantApiKeyClientAuthentication

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.grant_api_key.GrantApiKeyClientAuthentication">API
 *      specification</a>
 */
@JsonpDeserializable
public class GrantApiKeyClientAuthentication implements JsonpSerializable {
	private final GrantApiKeyClientAuthenticationScheme scheme;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private GrantApiKeyClientAuthentication(Builder builder) {

		this.scheme = ApiTypeHelper.requireNonNull(builder.scheme, this, "scheme");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static GrantApiKeyClientAuthentication of(
			Function<Builder, ObjectBuilder<GrantApiKeyClientAuthentication>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The client authentication scheme.
	 * <p>
	 * API name: {@code scheme}
	 */
	public final GrantApiKeyClientAuthenticationScheme scheme() {
		return this.scheme;
	}

	/**
	 * Required - The client authentication value, which is what normally follows
	 * the scheme in the <code>ES-Client-Authentication</code> request header.
	 * <p>
	 * API name: {@code value}
	 */
	public final String value() {
		return this.value;
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

		generator.writeKey("scheme");
		this.scheme.serialize(generator, mapper);
		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GrantApiKeyClientAuthentication}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GrantApiKeyClientAuthentication> {
		private GrantApiKeyClientAuthenticationScheme scheme;

		private String value;

		public Builder() {
		}
		private Builder(GrantApiKeyClientAuthentication instance) {
			this.scheme = instance.scheme;
			this.value = instance.value;

		}
		/**
		 * Required - The client authentication scheme.
		 * <p>
		 * API name: {@code scheme}
		 */
		public final Builder scheme(GrantApiKeyClientAuthenticationScheme value) {
			this.scheme = value;
			return this;
		}

		/**
		 * Required - The client authentication value, which is what normally follows
		 * the scheme in the <code>ES-Client-Authentication</code> request header.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GrantApiKeyClientAuthentication}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GrantApiKeyClientAuthentication build() {
			_checkSingleUse();

			return new GrantApiKeyClientAuthentication(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GrantApiKeyClientAuthentication}
	 */
	public static final JsonpDeserializer<GrantApiKeyClientAuthentication> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GrantApiKeyClientAuthentication::setupGrantApiKeyClientAuthenticationDeserializer);

	protected static void setupGrantApiKeyClientAuthenticationDeserializer(
			ObjectDeserializer<GrantApiKeyClientAuthentication.Builder> op) {

		op.add(Builder::scheme, GrantApiKeyClientAuthenticationScheme._DESERIALIZER, "scheme");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
