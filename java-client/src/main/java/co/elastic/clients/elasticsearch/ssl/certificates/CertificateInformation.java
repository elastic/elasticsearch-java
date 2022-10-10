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

package co.elastic.clients.elasticsearch.ssl.certificates;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ssl.certificates.CertificateInformation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ssl.certificates.CertificateInformation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CertificateInformation implements JsonpSerializable {
	@Nullable
	private final String alias;

	private final DateTime expiry;

	private final String format;

	private final boolean hasPrivateKey;

	@Nullable
	private final String issuer;

	private final String path;

	private final String serialNumber;

	private final String subjectDn;

	// ---------------------------------------------------------------------------------------------

	private CertificateInformation(Builder builder) {

		this.alias = builder.alias;
		this.expiry = ApiTypeHelper.requireNonNull(builder.expiry, this, "expiry");
		this.format = ApiTypeHelper.requireNonNull(builder.format, this, "format");
		this.hasPrivateKey = ApiTypeHelper.requireNonNull(builder.hasPrivateKey, this, "hasPrivateKey");
		this.issuer = builder.issuer;
		this.path = ApiTypeHelper.requireNonNull(builder.path, this, "path");
		this.serialNumber = ApiTypeHelper.requireNonNull(builder.serialNumber, this, "serialNumber");
		this.subjectDn = ApiTypeHelper.requireNonNull(builder.subjectDn, this, "subjectDn");

	}

	public static CertificateInformation of(Function<Builder, ObjectBuilder<CertificateInformation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code alias}
	 */
	@Nullable
	public final String alias() {
		return this.alias;
	}

	/**
	 * Required - API name: {@code expiry}
	 */
	public final DateTime expiry() {
		return this.expiry;
	}

	/**
	 * Required - API name: {@code format}
	 */
	public final String format() {
		return this.format;
	}

	/**
	 * Required - API name: {@code has_private_key}
	 */
	public final boolean hasPrivateKey() {
		return this.hasPrivateKey;
	}

	/**
	 * API name: {@code issuer}
	 */
	@Nullable
	public final String issuer() {
		return this.issuer;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code serial_number}
	 */
	public final String serialNumber() {
		return this.serialNumber;
	}

	/**
	 * Required - API name: {@code subject_dn}
	 */
	public final String subjectDn() {
		return this.subjectDn;
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

		if (this.alias != null) {
			generator.writeKey("alias");
			generator.write(this.alias);

		}
		generator.writeKey("expiry");
		this.expiry.serialize(generator, mapper);
		generator.writeKey("format");
		generator.write(this.format);

		generator.writeKey("has_private_key");
		generator.write(this.hasPrivateKey);

		if (this.issuer != null) {
			generator.writeKey("issuer");
			generator.write(this.issuer);

		}
		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("serial_number");
		generator.write(this.serialNumber);

		generator.writeKey("subject_dn");
		generator.write(this.subjectDn);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CertificateInformation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CertificateInformation> {
		@Nullable
		private String alias;

		private DateTime expiry;

		private String format;

		private Boolean hasPrivateKey;

		@Nullable
		private String issuer;

		private String path;

		private String serialNumber;

		private String subjectDn;

		/**
		 * API name: {@code alias}
		 */
		public final Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Required - API name: {@code expiry}
		 */
		public final Builder expiry(DateTime value) {
			this.expiry = value;
			return this;
		}

		/**
		 * Required - API name: {@code format}
		 */
		public final Builder format(String value) {
			this.format = value;
			return this;
		}

		/**
		 * Required - API name: {@code has_private_key}
		 */
		public final Builder hasPrivateKey(boolean value) {
			this.hasPrivateKey = value;
			return this;
		}

		/**
		 * API name: {@code issuer}
		 */
		public final Builder issuer(@Nullable String value) {
			this.issuer = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code serial_number}
		 */
		public final Builder serialNumber(String value) {
			this.serialNumber = value;
			return this;
		}

		/**
		 * Required - API name: {@code subject_dn}
		 */
		public final Builder subjectDn(String value) {
			this.subjectDn = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CertificateInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CertificateInformation build() {
			_checkSingleUse();

			return new CertificateInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CertificateInformation}
	 */
	public static final JsonpDeserializer<CertificateInformation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CertificateInformation::setupCertificateInformationDeserializer);

	protected static void setupCertificateInformationDeserializer(
			ObjectDeserializer<CertificateInformation.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::expiry, DateTime._DESERIALIZER, "expiry");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::hasPrivateKey, JsonpDeserializer.booleanDeserializer(), "has_private_key");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::serialNumber, JsonpDeserializer.stringDeserializer(), "serial_number");
		op.add(Builder::subjectDn, JsonpDeserializer.stringDeserializer(), "subject_dn");

	}

}
