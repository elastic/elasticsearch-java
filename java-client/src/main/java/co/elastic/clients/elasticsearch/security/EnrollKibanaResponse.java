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

import co.elastic.clients.elasticsearch.security.enroll_kibana.Token;
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

// typedef: security.enroll_kibana.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.enroll_kibana.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class EnrollKibanaResponse implements JsonpSerializable {
	private final Token token;

	private final String httpCa;

	// ---------------------------------------------------------------------------------------------

	private EnrollKibanaResponse(Builder builder) {

		this.token = ApiTypeHelper.requireNonNull(builder.token, this, "token");
		this.httpCa = ApiTypeHelper.requireNonNull(builder.httpCa, this, "httpCa");

	}

	public static EnrollKibanaResponse of(Function<Builder, ObjectBuilder<EnrollKibanaResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code token}
	 */
	public final Token token() {
		return this.token;
	}

	/**
	 * Required - API name: {@code http_ca}
	 */
	public final String httpCa() {
		return this.httpCa;
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

		generator.writeKey("token");
		this.token.serialize(generator, mapper);

		generator.writeKey("http_ca");
		generator.write(this.httpCa);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrollKibanaResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EnrollKibanaResponse> {
		private Token token;

		private String httpCa;

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(Token value) {
			this.token = value;
			return this;
		}

		/**
		 * Required - API name: {@code token}
		 */
		public final Builder token(Function<Token.Builder, ObjectBuilder<Token>> fn) {
			return this.token(fn.apply(new Token.Builder()).build());
		}

		/**
		 * Required - API name: {@code http_ca}
		 */
		public final Builder httpCa(String value) {
			this.httpCa = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrollKibanaResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrollKibanaResponse build() {
			_checkSingleUse();

			return new EnrollKibanaResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrollKibanaResponse}
	 */
	public static final JsonpDeserializer<EnrollKibanaResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EnrollKibanaResponse::setupEnrollKibanaResponseDeserializer);

	protected static void setupEnrollKibanaResponseDeserializer(ObjectDeserializer<EnrollKibanaResponse.Builder> op) {

		op.add(Builder::token, Token._DESERIALIZER, "token");
		op.add(Builder::httpCa, JsonpDeserializer.stringDeserializer(), "http_ca");

	}

}
