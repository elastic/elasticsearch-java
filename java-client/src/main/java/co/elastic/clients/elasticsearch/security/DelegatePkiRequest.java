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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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

// typedef: security.delegate_pki.Request

/**
 * Delegate PKI authentication.
 * <p>
 * This API implements the exchange of an X509Certificate chain for an
 * Elasticsearch access token. The certificate chain is validated, according to
 * RFC 5280, by sequentially considering the trust configuration of every
 * installed PKI realm that has <code>delegation.enabled</code> set to
 * <code>true</code>. A successfully trusted client certificate is also subject
 * to the validation of the subject distinguished name according to thw
 * <code>username_pattern</code> of the respective realm.
 * <p>
 * This API is called by smart and trusted proxies, such as Kibana, which
 * terminate the user's TLS session but still want to authenticate the user by
 * using a PKI realm—-​as if the user connected directly to Elasticsearch.
 * <p>
 * IMPORTANT: The association between the subject public key in the target
 * certificate and the corresponding private key is not validated. This is part
 * of the TLS authentication process and it is delegated to the proxy that calls
 * this API. The proxy is trusted to have performed the TLS authentication and
 * this API translates that authentication into an Elasticsearch access token.
 * 
 * @see <a href="../doc-files/api-spec.html#security.delegate_pki.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class DelegatePkiRequest extends RequestBase implements JsonpSerializable {
	private final List<String> x509CertificateChain;

	// ---------------------------------------------------------------------------------------------

	private DelegatePkiRequest(Builder builder) {

		this.x509CertificateChain = ApiTypeHelper.unmodifiableRequired(builder.x509CertificateChain, this,
				"x509CertificateChain");

	}

	public static DelegatePkiRequest of(Function<Builder, ObjectBuilder<DelegatePkiRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The X509Certificate chain, which is represented as an ordered
	 * string array. Each string in the array is a base64-encoded (Section 4 of
	 * RFC4648 - not base64url-encoded) of the certificate's DER encoding.
	 * <p>
	 * The first element is the target certificate that contains the subject
	 * distinguished name that is requesting access. This may be followed by
	 * additional certificates; each subsequent certificate is used to certify the
	 * previous one.
	 * <p>
	 * API name: {@code x509_certificate_chain}
	 */
	public final List<String> x509CertificateChain() {
		return this.x509CertificateChain;
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

		if (ApiTypeHelper.isDefined(this.x509CertificateChain)) {
			generator.writeKey("x509_certificate_chain");
			generator.writeStartArray();
			for (String item0 : this.x509CertificateChain) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DelegatePkiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DelegatePkiRequest> {
		private List<String> x509CertificateChain;

		/**
		 * Required - The X509Certificate chain, which is represented as an ordered
		 * string array. Each string in the array is a base64-encoded (Section 4 of
		 * RFC4648 - not base64url-encoded) of the certificate's DER encoding.
		 * <p>
		 * The first element is the target certificate that contains the subject
		 * distinguished name that is requesting access. This may be followed by
		 * additional certificates; each subsequent certificate is used to certify the
		 * previous one.
		 * <p>
		 * API name: {@code x509_certificate_chain}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>x509CertificateChain</code>.
		 */
		public final Builder x509CertificateChain(List<String> list) {
			this.x509CertificateChain = _listAddAll(this.x509CertificateChain, list);
			return this;
		}

		/**
		 * Required - The X509Certificate chain, which is represented as an ordered
		 * string array. Each string in the array is a base64-encoded (Section 4 of
		 * RFC4648 - not base64url-encoded) of the certificate's DER encoding.
		 * <p>
		 * The first element is the target certificate that contains the subject
		 * distinguished name that is requesting access. This may be followed by
		 * additional certificates; each subsequent certificate is used to certify the
		 * previous one.
		 * <p>
		 * API name: {@code x509_certificate_chain}
		 * <p>
		 * Adds one or more values to <code>x509CertificateChain</code>.
		 */
		public final Builder x509CertificateChain(String value, String... values) {
			this.x509CertificateChain = _listAdd(this.x509CertificateChain, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DelegatePkiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DelegatePkiRequest build() {
			_checkSingleUse();

			return new DelegatePkiRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DelegatePkiRequest}
	 */
	public static final JsonpDeserializer<DelegatePkiRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DelegatePkiRequest::setupDelegatePkiRequestDeserializer);

	protected static void setupDelegatePkiRequestDeserializer(ObjectDeserializer<DelegatePkiRequest.Builder> op) {

		op.add(Builder::x509CertificateChain,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "x509_certificate_chain");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delegate_pki}".
	 */
	public static final Endpoint<DelegatePkiRequest, DelegatePkiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.delegate_pki",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/delegate_pki";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, DelegatePkiResponse._DESERIALIZER);
}
