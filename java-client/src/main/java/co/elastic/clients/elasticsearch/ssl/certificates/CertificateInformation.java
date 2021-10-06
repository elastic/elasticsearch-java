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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ssl.certificates.CertificateInformation
@JsonpDeserializable
public final class CertificateInformation implements JsonpSerializable {
	@Nullable
	private final String alias;

	private final String expiry;

	private final String format;

	private final boolean hasPrivateKey;

	private final String path;

	private final String serialNumber;

	private final String subjectDn;

	// ---------------------------------------------------------------------------------------------

	public CertificateInformation(Builder builder) {

		this.alias = builder.alias;
		this.expiry = Objects.requireNonNull(builder.expiry, "expiry");
		this.format = Objects.requireNonNull(builder.format, "format");
		this.hasPrivateKey = Objects.requireNonNull(builder.hasPrivateKey, "has_private_key");
		this.path = Objects.requireNonNull(builder.path, "path");
		this.serialNumber = Objects.requireNonNull(builder.serialNumber, "serial_number");
		this.subjectDn = Objects.requireNonNull(builder.subjectDn, "subject_dn");

	}

	public CertificateInformation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code alias}
	 */
	@Nullable
	public String alias() {
		return this.alias;
	}

	/**
	 * Required - API name: {@code expiry}
	 */
	public String expiry() {
		return this.expiry;
	}

	/**
	 * Required - API name: {@code format}
	 */
	public String format() {
		return this.format;
	}

	/**
	 * Required - API name: {@code has_private_key}
	 */
	public boolean hasPrivateKey() {
		return this.hasPrivateKey;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code serial_number}
	 */
	public String serialNumber() {
		return this.serialNumber;
	}

	/**
	 * Required - API name: {@code subject_dn}
	 */
	public String subjectDn() {
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
		generator.write(this.expiry);

		generator.writeKey("format");
		generator.write(this.format);

		generator.writeKey("has_private_key");
		generator.write(this.hasPrivateKey);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("serial_number");
		generator.write(this.serialNumber);

		generator.writeKey("subject_dn");
		generator.write(this.subjectDn);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CertificateInformation}.
	 */
	public static class Builder implements ObjectBuilder<CertificateInformation> {
		@Nullable
		private String alias;

		private String expiry;

		private String format;

		private Boolean hasPrivateKey;

		private String path;

		private String serialNumber;

		private String subjectDn;

		/**
		 * API name: {@code alias}
		 */
		public Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Required - API name: {@code expiry}
		 */
		public Builder expiry(String value) {
			this.expiry = value;
			return this;
		}

		/**
		 * Required - API name: {@code format}
		 */
		public Builder format(String value) {
			this.format = value;
			return this;
		}

		/**
		 * Required - API name: {@code has_private_key}
		 */
		public Builder hasPrivateKey(boolean value) {
			this.hasPrivateKey = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code serial_number}
		 */
		public Builder serialNumber(String value) {
			this.serialNumber = value;
			return this;
		}

		/**
		 * Required - API name: {@code subject_dn}
		 */
		public Builder subjectDn(String value) {
			this.subjectDn = value;
			return this;
		}

		/**
		 * Builds a {@link CertificateInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CertificateInformation build() {

			return new CertificateInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CertificateInformation}
	 */
	public static final JsonpDeserializer<CertificateInformation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CertificateInformation::setupCertificateInformationDeserializer, Builder::build);

	protected static void setupCertificateInformationDeserializer(
			DelegatingDeserializer<CertificateInformation.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::expiry, JsonpDeserializer.stringDeserializer(), "expiry");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::hasPrivateKey, JsonpDeserializer.booleanDeserializer(), "has_private_key");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::serialNumber, JsonpDeserializer.stringDeserializer(), "serial_number");
		op.add(Builder::subjectDn, JsonpDeserializer.stringDeserializer(), "subject_dn");

	}

}
