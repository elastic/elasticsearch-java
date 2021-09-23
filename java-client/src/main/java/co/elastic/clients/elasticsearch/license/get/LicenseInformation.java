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

package co.elastic.clients.elasticsearch.license.get;

import co.elastic.clients.elasticsearch.license.LicenseStatus;
import co.elastic.clients.elasticsearch.license.LicenseType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: license.get.LicenseInformation
public final class LicenseInformation implements JsonpSerializable {
	private final String expiryDate;

	private final JsonValue expiryDateInMillis;

	private final String issueDate;

	private final JsonValue issueDateInMillis;

	private final String issuedTo;

	private final String issuer;

	private final Number maxNodes;

	@Nullable
	private final Number maxResourceUnits;

	private final LicenseStatus status;

	private final LicenseType type;

	private final String uid;

	private final JsonValue startDateInMillis;

	// ---------------------------------------------------------------------------------------------

	public LicenseInformation(Builder builder) {

		this.expiryDate = Objects.requireNonNull(builder.expiryDate, "expiry_date");
		this.expiryDateInMillis = Objects.requireNonNull(builder.expiryDateInMillis, "expiry_date_in_millis");
		this.issueDate = Objects.requireNonNull(builder.issueDate, "issue_date");
		this.issueDateInMillis = Objects.requireNonNull(builder.issueDateInMillis, "issue_date_in_millis");
		this.issuedTo = Objects.requireNonNull(builder.issuedTo, "issued_to");
		this.issuer = Objects.requireNonNull(builder.issuer, "issuer");
		this.maxNodes = Objects.requireNonNull(builder.maxNodes, "max_nodes");
		this.maxResourceUnits = builder.maxResourceUnits;
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.uid = Objects.requireNonNull(builder.uid, "uid");
		this.startDateInMillis = Objects.requireNonNull(builder.startDateInMillis, "start_date_in_millis");

	}

	/**
	 * API name: {@code expiry_date}
	 */
	public String expiryDate() {
		return this.expiryDate;
	}

	/**
	 * API name: {@code expiry_date_in_millis}
	 */
	public JsonValue expiryDateInMillis() {
		return this.expiryDateInMillis;
	}

	/**
	 * API name: {@code issue_date}
	 */
	public String issueDate() {
		return this.issueDate;
	}

	/**
	 * API name: {@code issue_date_in_millis}
	 */
	public JsonValue issueDateInMillis() {
		return this.issueDateInMillis;
	}

	/**
	 * API name: {@code issued_to}
	 */
	public String issuedTo() {
		return this.issuedTo;
	}

	/**
	 * API name: {@code issuer}
	 */
	public String issuer() {
		return this.issuer;
	}

	/**
	 * API name: {@code max_nodes}
	 */
	public Number maxNodes() {
		return this.maxNodes;
	}

	/**
	 * API name: {@code max_resource_units}
	 */
	@Nullable
	public Number maxResourceUnits() {
		return this.maxResourceUnits;
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
	 * API name: {@code start_date_in_millis}
	 */
	public JsonValue startDateInMillis() {
		return this.startDateInMillis;
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

		generator.writeKey("expiry_date");
		generator.write(this.expiryDate);

		generator.writeKey("expiry_date_in_millis");
		generator.write(this.expiryDateInMillis);

		generator.writeKey("issue_date");
		generator.write(this.issueDate);

		generator.writeKey("issue_date_in_millis");
		generator.write(this.issueDateInMillis);

		generator.writeKey("issued_to");
		generator.write(this.issuedTo);

		generator.writeKey("issuer");
		generator.write(this.issuer);

		generator.writeKey("max_nodes");
		generator.write(this.maxNodes.doubleValue());

		if (this.maxResourceUnits != null) {

			generator.writeKey("max_resource_units");
			generator.write(this.maxResourceUnits.doubleValue());

		}

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

		generator.writeKey("uid");
		generator.write(this.uid);

		generator.writeKey("start_date_in_millis");
		generator.write(this.startDateInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LicenseInformation}.
	 */
	public static class Builder implements ObjectBuilder<LicenseInformation> {
		private String expiryDate;

		private JsonValue expiryDateInMillis;

		private String issueDate;

		private JsonValue issueDateInMillis;

		private String issuedTo;

		private String issuer;

		private Number maxNodes;

		@Nullable
		private Number maxResourceUnits;

		private LicenseStatus status;

		private LicenseType type;

		private String uid;

		private JsonValue startDateInMillis;

		/**
		 * API name: {@code expiry_date}
		 */
		public Builder expiryDate(String value) {
			this.expiryDate = value;
			return this;
		}

		/**
		 * API name: {@code expiry_date_in_millis}
		 */
		public Builder expiryDateInMillis(JsonValue value) {
			this.expiryDateInMillis = value;
			return this;
		}

		/**
		 * API name: {@code issue_date}
		 */
		public Builder issueDate(String value) {
			this.issueDate = value;
			return this;
		}

		/**
		 * API name: {@code issue_date_in_millis}
		 */
		public Builder issueDateInMillis(JsonValue value) {
			this.issueDateInMillis = value;
			return this;
		}

		/**
		 * API name: {@code issued_to}
		 */
		public Builder issuedTo(String value) {
			this.issuedTo = value;
			return this;
		}

		/**
		 * API name: {@code issuer}
		 */
		public Builder issuer(String value) {
			this.issuer = value;
			return this;
		}

		/**
		 * API name: {@code max_nodes}
		 */
		public Builder maxNodes(Number value) {
			this.maxNodes = value;
			return this;
		}

		/**
		 * API name: {@code max_resource_units}
		 */
		public Builder maxResourceUnits(@Nullable Number value) {
			this.maxResourceUnits = value;
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
		 * API name: {@code start_date_in_millis}
		 */
		public Builder startDateInMillis(JsonValue value) {
			this.startDateInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link LicenseInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LicenseInformation build() {

			return new LicenseInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LicenseInformation}
	 */
	public static final JsonpDeserializer<LicenseInformation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, LicenseInformation::setupLicenseInformationDeserializer);

	protected static void setupLicenseInformationDeserializer(DelegatingDeserializer<LicenseInformation.Builder> op) {

		op.add(Builder::expiryDate, JsonpDeserializer.stringDeserializer(), "expiry_date");
		op.add(Builder::expiryDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "expiry_date_in_millis");
		op.add(Builder::issueDate, JsonpDeserializer.stringDeserializer(), "issue_date");
		op.add(Builder::issueDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "issue_date_in_millis");
		op.add(Builder::issuedTo, JsonpDeserializer.stringDeserializer(), "issued_to");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::maxNodes, JsonpDeserializer.numberDeserializer(), "max_nodes");
		op.add(Builder::maxResourceUnits, JsonpDeserializer.numberDeserializer(), "max_resource_units");
		op.add(Builder::status, LicenseStatus.DESERIALIZER, "status");
		op.add(Builder::type, LicenseType.DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");
		op.add(Builder::startDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "start_date_in_millis");

	}

}
