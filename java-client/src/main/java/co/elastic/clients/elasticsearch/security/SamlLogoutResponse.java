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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.saml_logout.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.saml_logout.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlLogoutResponse implements JsonpSerializable {
	private final String redirect;

	// ---------------------------------------------------------------------------------------------

	private SamlLogoutResponse(Builder builder) {

		this.redirect = ApiTypeHelper.requireNonNull(builder.redirect, this, "redirect");

	}

	public static SamlLogoutResponse of(Function<Builder, ObjectBuilder<SamlLogoutResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code redirect}
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
	 * Builder for {@link SamlLogoutResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SamlLogoutResponse> {
		private String redirect;

		/**
		 * Required - API name: {@code redirect}
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
		 * Builds a {@link SamlLogoutResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlLogoutResponse build() {
			_checkSingleUse();

			return new SamlLogoutResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlLogoutResponse}
	 */
	public static final JsonpDeserializer<SamlLogoutResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlLogoutResponse::setupSamlLogoutResponseDeserializer);

	protected static void setupSamlLogoutResponseDeserializer(ObjectDeserializer<SamlLogoutResponse.Builder> op) {

		op.add(Builder::redirect, JsonpDeserializer.stringDeserializer(), "redirect");

	}

}
