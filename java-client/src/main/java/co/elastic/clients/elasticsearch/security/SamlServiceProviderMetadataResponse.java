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

// typedef: security.saml_service_provider_metadata.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_service_provider_metadata.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlServiceProviderMetadataResponse implements JsonpSerializable {
	private final String metadata;

	// ---------------------------------------------------------------------------------------------

	private SamlServiceProviderMetadataResponse(Builder builder) {

		this.metadata = ApiTypeHelper.requireNonNull(builder.metadata, this, "metadata");

	}

	public static SamlServiceProviderMetadataResponse of(
			Function<Builder, ObjectBuilder<SamlServiceProviderMetadataResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final String metadata() {
		return this.metadata;
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

		generator.writeKey("metadata");
		generator.write(this.metadata);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlServiceProviderMetadataResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SamlServiceProviderMetadataResponse> {
		private String metadata;

		/**
		 * Required - API name: {@code metadata}
		 */
		public final Builder metadata(String value) {
			this.metadata = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlServiceProviderMetadataResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlServiceProviderMetadataResponse build() {
			_checkSingleUse();

			return new SamlServiceProviderMetadataResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlServiceProviderMetadataResponse}
	 */
	public static final JsonpDeserializer<SamlServiceProviderMetadataResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					SamlServiceProviderMetadataResponse::setupSamlServiceProviderMetadataResponseDeserializer);

	protected static void setupSamlServiceProviderMetadataResponseDeserializer(
			ObjectDeserializer<SamlServiceProviderMetadataResponse.Builder> op) {

		op.add(Builder::metadata, JsonpDeserializer.stringDeserializer(), "metadata");

	}

}
