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

// typedef: security.enroll_node.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.enroll_node.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class EnrollNodeResponse implements JsonpSerializable {
	private final String httpCaKey;

	private final String httpCaCert;

	private final String transportCaCert;

	private final String transportKey;

	private final String transportCert;

	private final List<String> nodesAddresses;

	// ---------------------------------------------------------------------------------------------

	private EnrollNodeResponse(Builder builder) {

		this.httpCaKey = ApiTypeHelper.requireNonNull(builder.httpCaKey, this, "httpCaKey");
		this.httpCaCert = ApiTypeHelper.requireNonNull(builder.httpCaCert, this, "httpCaCert");
		this.transportCaCert = ApiTypeHelper.requireNonNull(builder.transportCaCert, this, "transportCaCert");
		this.transportKey = ApiTypeHelper.requireNonNull(builder.transportKey, this, "transportKey");
		this.transportCert = ApiTypeHelper.requireNonNull(builder.transportCert, this, "transportCert");
		this.nodesAddresses = ApiTypeHelper.unmodifiableRequired(builder.nodesAddresses, this, "nodesAddresses");

	}

	public static EnrollNodeResponse of(Function<Builder, ObjectBuilder<EnrollNodeResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code http_ca_key}
	 */
	public final String httpCaKey() {
		return this.httpCaKey;
	}

	/**
	 * Required - API name: {@code http_ca_cert}
	 */
	public final String httpCaCert() {
		return this.httpCaCert;
	}

	/**
	 * Required - API name: {@code transport_ca_cert}
	 */
	public final String transportCaCert() {
		return this.transportCaCert;
	}

	/**
	 * Required - API name: {@code transport_key}
	 */
	public final String transportKey() {
		return this.transportKey;
	}

	/**
	 * Required - API name: {@code transport_cert}
	 */
	public final String transportCert() {
		return this.transportCert;
	}

	/**
	 * Required - API name: {@code nodes_addresses}
	 */
	public final List<String> nodesAddresses() {
		return this.nodesAddresses;
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

		generator.writeKey("http_ca_key");
		generator.write(this.httpCaKey);

		generator.writeKey("http_ca_cert");
		generator.write(this.httpCaCert);

		generator.writeKey("transport_ca_cert");
		generator.write(this.transportCaCert);

		generator.writeKey("transport_key");
		generator.write(this.transportKey);

		generator.writeKey("transport_cert");
		generator.write(this.transportCert);

		if (ApiTypeHelper.isDefined(this.nodesAddresses)) {
			generator.writeKey("nodes_addresses");
			generator.writeStartArray();
			for (String item0 : this.nodesAddresses) {
				generator.write(item0);

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
	 * Builder for {@link EnrollNodeResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EnrollNodeResponse> {
		private String httpCaKey;

		private String httpCaCert;

		private String transportCaCert;

		private String transportKey;

		private String transportCert;

		private List<String> nodesAddresses;

		/**
		 * Required - API name: {@code http_ca_key}
		 */
		public final Builder httpCaKey(String value) {
			this.httpCaKey = value;
			return this;
		}

		/**
		 * Required - API name: {@code http_ca_cert}
		 */
		public final Builder httpCaCert(String value) {
			this.httpCaCert = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport_ca_cert}
		 */
		public final Builder transportCaCert(String value) {
			this.transportCaCert = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport_key}
		 */
		public final Builder transportKey(String value) {
			this.transportKey = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport_cert}
		 */
		public final Builder transportCert(String value) {
			this.transportCert = value;
			return this;
		}

		/**
		 * Required - API name: {@code nodes_addresses}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodesAddresses</code>.
		 */
		public final Builder nodesAddresses(List<String> list) {
			this.nodesAddresses = _listAddAll(this.nodesAddresses, list);
			return this;
		}

		/**
		 * Required - API name: {@code nodes_addresses}
		 * <p>
		 * Adds one or more values to <code>nodesAddresses</code>.
		 */
		public final Builder nodesAddresses(String value, String... values) {
			this.nodesAddresses = _listAdd(this.nodesAddresses, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrollNodeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrollNodeResponse build() {
			_checkSingleUse();

			return new EnrollNodeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrollNodeResponse}
	 */
	public static final JsonpDeserializer<EnrollNodeResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EnrollNodeResponse::setupEnrollNodeResponseDeserializer);

	protected static void setupEnrollNodeResponseDeserializer(ObjectDeserializer<EnrollNodeResponse.Builder> op) {

		op.add(Builder::httpCaKey, JsonpDeserializer.stringDeserializer(), "http_ca_key");
		op.add(Builder::httpCaCert, JsonpDeserializer.stringDeserializer(), "http_ca_cert");
		op.add(Builder::transportCaCert, JsonpDeserializer.stringDeserializer(), "transport_ca_cert");
		op.add(Builder::transportKey, JsonpDeserializer.stringDeserializer(), "transport_key");
		op.add(Builder::transportCert, JsonpDeserializer.stringDeserializer(), "transport_cert");
		op.add(Builder::nodesAddresses, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"nodes_addresses");

	}

}
