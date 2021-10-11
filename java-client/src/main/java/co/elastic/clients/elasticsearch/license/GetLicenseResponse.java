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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch.license.get.LicenseInformation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.get.Response
@JsonpDeserializable
public final class GetLicenseResponse implements JsonpSerializable {
	private final LicenseInformation license;

	// ---------------------------------------------------------------------------------------------

	public GetLicenseResponse(Builder builder) {

		this.license = Objects.requireNonNull(builder.license, "license");

	}

	public GetLicenseResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code license}
	 */
	public LicenseInformation license() {
		return this.license;
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

		generator.writeKey("license");
		this.license.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLicenseResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetLicenseResponse> {
		private LicenseInformation license;

		/**
		 * Required - API name: {@code license}
		 */
		public Builder license(LicenseInformation value) {
			this.license = value;
			return this;
		}

		/**
		 * Required - API name: {@code license}
		 */
		public Builder license(Function<LicenseInformation.Builder, ObjectBuilder<LicenseInformation>> fn) {
			return this.license(fn.apply(new LicenseInformation.Builder()).build());
		}

		/**
		 * Builds a {@link GetLicenseResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetLicenseResponse build() {

			return new GetLicenseResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetLicenseResponse}
	 */
	public static final JsonpDeserializer<GetLicenseResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetLicenseResponse::setupGetLicenseResponseDeserializer, Builder::build);

	protected static void setupGetLicenseResponseDeserializer(DelegatingDeserializer<GetLicenseResponse.Builder> op) {

		op.add(Builder::license, LicenseInformation._DESERIALIZER, "license");

	}

}
