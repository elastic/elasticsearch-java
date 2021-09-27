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

package co.elastic.clients.elasticsearch.xpack.info;

import co.elastic.clients.elasticsearch.license.LicenseStatus;
import co.elastic.clients.elasticsearch.license.LicenseType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.info.MinimalLicenseInformation
@JsonpDeserializable
public final class MinimalLicenseInformation implements JsonpSerializable {
	private final String expiryDateInMillis;

	private final LicenseType mode;

	private final LicenseStatus status;

	private final LicenseType type;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	public MinimalLicenseInformation(Builder builder) {

		this.expiryDateInMillis = Objects.requireNonNull(builder.expiryDateInMillis, "expiry_date_in_millis");
		this.mode = Objects.requireNonNull(builder.mode, "mode");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.uid = Objects.requireNonNull(builder.uid, "uid");

	}

	/**
	 * API name: {@code expiry_date_in_millis}
	 */
	public String expiryDateInMillis() {
		return this.expiryDateInMillis;
	}

	/**
	 * API name: {@code mode}
	 */
	public LicenseType mode() {
		return this.mode;
	}

	/**
	 * API name: {@code status}
	 */
	public LicenseStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public LicenseType type() {
		return this.type;
	}

	/**
	 * API name: {@code uid}
	 */
	public String uid() {
		return this.uid;
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

		generator.writeKey("expiry_date_in_millis");
		generator.write(this.expiryDateInMillis);

		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

		generator.writeKey("uid");
		generator.write(this.uid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MinimalLicenseInformation}.
	 */
	public static class Builder implements ObjectBuilder<MinimalLicenseInformation> {
		private String expiryDateInMillis;

		private LicenseType mode;

		private LicenseStatus status;

		private LicenseType type;

		private String uid;

		/**
		 * API name: {@code expiry_date_in_millis}
		 */
		public Builder expiryDateInMillis(String value) {
			this.expiryDateInMillis = value;
			return this;
		}

		/**
		 * API name: {@code mode}
		 */
		public Builder mode(LicenseType value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(LicenseStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(LicenseType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code uid}
		 */
		public Builder uid(String value) {
			this.uid = value;
			return this;
		}

		/**
		 * Builds a {@link MinimalLicenseInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MinimalLicenseInformation build() {

			return new MinimalLicenseInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MinimalLicenseInformation}
	 */
	public static final JsonpDeserializer<MinimalLicenseInformation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MinimalLicenseInformation::setupMinimalLicenseInformationDeserializer, Builder::build);

	protected static void setupMinimalLicenseInformationDeserializer(
			DelegatingDeserializer<MinimalLicenseInformation.Builder> op) {

		op.add(Builder::expiryDateInMillis, JsonpDeserializer.stringDeserializer(), "expiry_date_in_millis");
		op.add(Builder::mode, LicenseType._DESERIALIZER, "mode");
		op.add(Builder::status, LicenseStatus._DESERIALIZER, "status");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");

	}

}
