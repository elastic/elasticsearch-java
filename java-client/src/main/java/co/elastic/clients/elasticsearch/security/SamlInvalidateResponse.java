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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.saml_invalidate.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_invalidate.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlInvalidateResponse implements JsonpSerializable {
	private final int invalidated;

	private final String realm;

	private final String redirect;

	// ---------------------------------------------------------------------------------------------

	private SamlInvalidateResponse(Builder builder) {

		this.invalidated = ApiTypeHelper.requireNonNull(builder.invalidated, this, "invalidated");
		this.realm = ApiTypeHelper.requireNonNull(builder.realm, this, "realm");
		this.redirect = ApiTypeHelper.requireNonNull(builder.redirect, this, "redirect");

	}

	public static SamlInvalidateResponse of(Function<Builder, ObjectBuilder<SamlInvalidateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code invalidated}
	 */
	public final int invalidated() {
		return this.invalidated;
	}

	/**
	 * Required - API name: {@code realm}
	 */
	public final String realm() {
		return this.realm;
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

		generator.writeKey("invalidated");
		generator.write(this.invalidated);

		generator.writeKey("realm");
		generator.write(this.realm);

		generator.writeKey("redirect");
		generator.write(this.redirect);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlInvalidateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SamlInvalidateResponse> {
		private Integer invalidated;

		private String realm;

		private String redirect;

		/**
		 * Required - API name: {@code invalidated}
		 */
		public final Builder invalidated(int value) {
			this.invalidated = value;
			return this;
		}

		/**
		 * Required - API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

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
		 * Builds a {@link SamlInvalidateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlInvalidateResponse build() {
			_checkSingleUse();

			return new SamlInvalidateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlInvalidateResponse}
	 */
	public static final JsonpDeserializer<SamlInvalidateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlInvalidateResponse::setupSamlInvalidateResponseDeserializer);

	protected static void setupSamlInvalidateResponseDeserializer(
			ObjectDeserializer<SamlInvalidateResponse.Builder> op) {

		op.add(Builder::invalidated, JsonpDeserializer.integerDeserializer(), "invalidated");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::redirect, JsonpDeserializer.stringDeserializer(), "redirect");

	}

}
