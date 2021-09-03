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

package co.elastic.clients.elasticsearch.ssl;

import co.elastic.clients.elasticsearch.ssl.get_certificates.CertificateInformation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ssl.get_certificates.Response
public final class GetCertificatesResponse implements ToJsonp {
	private final List<CertificateInformation> value;

	// ---------------------------------------------------------------------------------------------

	protected GetCertificatesResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code value}
	 */
	public List<CertificateInformation> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (CertificateInformation item0 : this.value) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCertificatesResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetCertificatesResponse> {
		private List<CertificateInformation> value;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(List<CertificateInformation> value) {
			this.value = value;
			return this;
		}

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(CertificateInformation... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(CertificateInformation value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Set {@link #value(List)} to a singleton list.
		 */
		public Builder value(Function<CertificateInformation.Builder, ObjectBuilder<CertificateInformation>> fn) {
			return this.value(fn.apply(new CertificateInformation.Builder()).build());
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(Function<CertificateInformation.Builder, ObjectBuilder<CertificateInformation>> fn) {
			return this.addValue(fn.apply(new CertificateInformation.Builder()).build());
		}

		/**
		 * Builds a {@link GetCertificatesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCertificatesResponse build() {

			return new GetCertificatesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetCertificatesResponse
	 */
	public static final JsonpDeserializer<GetCertificatesResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetCertificatesResponse::setupGetCertificatesResponseDeserializer);

	protected static void setupGetCertificatesResponseDeserializer(
			DelegatingDeserializer<GetCertificatesResponse.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(CertificateInformation.DESERIALIZER), "value");

	}

}
