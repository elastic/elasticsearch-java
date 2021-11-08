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

import co.elastic.clients.elasticsearch.ssl.certificates.CertificateInformation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ssl.certificates.Response
@JsonpDeserializable
public class CertificatesResponse implements JsonpSerializable {
	private final List<CertificateInformation> valueBody;

	// ---------------------------------------------------------------------------------------------

	private CertificatesResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static CertificatesResponse of(Function<Builder, ObjectBuilder<CertificatesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<CertificateInformation> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (CertificateInformation item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CertificatesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CertificatesResponse> {
		private List<CertificateInformation> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(List<CertificateInformation> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(CertificateInformation... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		@SafeVarargs
		public final Builder valueBody(
				Function<CertificateInformation.Builder, ObjectBuilder<CertificateInformation>>... fns) {
			this.valueBody = new ArrayList<>(fns.length);
			for (Function<CertificateInformation.Builder, ObjectBuilder<CertificateInformation>> fn : fns) {
				this.valueBody.add(fn.apply(new CertificateInformation.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link CertificatesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CertificatesResponse build() {
			_checkSingleUse();

			return new CertificatesResponse(this);
		}
	}

	public static final JsonpDeserializer<CertificatesResponse> _DESERIALIZER = createCertificatesResponseDeserializer();
	protected static JsonpDeserializer<CertificatesResponse> createCertificatesResponseDeserializer() {

		JsonpDeserializer<List<CertificateInformation>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(CertificateInformation._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
