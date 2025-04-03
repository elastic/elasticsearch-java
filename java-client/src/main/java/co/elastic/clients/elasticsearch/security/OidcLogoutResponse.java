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

// typedef: security.oidc_logout.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.oidc_logout.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class OidcLogoutResponse implements JsonpSerializable {
	private final String redirect;

	// ---------------------------------------------------------------------------------------------

	private OidcLogoutResponse(Builder builder) {

		this.redirect = ApiTypeHelper.requireNonNull(builder.redirect, this, "redirect");

	}

	public static OidcLogoutResponse of(Function<Builder, ObjectBuilder<OidcLogoutResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A URI that points to the end session endpoint of the OpenID
	 * Connect Provider with all the parameters of the logout request as HTTP GET
	 * parameters.
	 * <p>
	 * API name: {@code redirect}
	 */
	public final String redirect() {
		return this.redirect;
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

		generator.writeKey("redirect");
		generator.write(this.redirect);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OidcLogoutResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OidcLogoutResponse> {
		private String redirect;

		/**
		 * Required - A URI that points to the end session endpoint of the OpenID
		 * Connect Provider with all the parameters of the logout request as HTTP GET
		 * parameters.
		 * <p>
		 * API name: {@code redirect}
		 */
		public final Builder redirect(String value) {
			this.redirect = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OidcLogoutResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OidcLogoutResponse build() {
			_checkSingleUse();

			return new OidcLogoutResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OidcLogoutResponse}
	 */
	public static final JsonpDeserializer<OidcLogoutResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OidcLogoutResponse::setupOidcLogoutResponseDeserializer);

	protected static void setupOidcLogoutResponseDeserializer(ObjectDeserializer<OidcLogoutResponse.Builder> op) {

		op.add(Builder::redirect, JsonpDeserializer.stringDeserializer(), "redirect");

	}

}
