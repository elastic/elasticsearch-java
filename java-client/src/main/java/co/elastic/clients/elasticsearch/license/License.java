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

// typedef: license._types.License
public final class License implements JsonpSerializable {
	private final JsonValue expiryDateInMillis;

	private final JsonValue issueDateInMillis;

	private final String issuedTo;

	private final String issuer;

	@Nullable
	private final Number maxNodes;

	@Nullable
	private final Number maxResourceUnits;

	private final String signature;

	private final JsonValue startDateInMillis;

	private final LicenseType type;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	public License(Builder builder) {

		this.expiryDateInMillis = Objects.requireNonNull(builder.expiryDateInMillis, "expiry_date_in_millis");
		this.issueDateInMillis = Objects.requireNonNull(builder.issueDateInMillis, "issue_date_in_millis");
		this.issuedTo = Objects.requireNonNull(builder.issuedTo, "issued_to");
		this.issuer = Objects.requireNonNull(builder.issuer, "issuer");
		this.maxNodes = builder.maxNodes;
		this.maxResourceUnits = builder.maxResourceUnits;
		this.signature = Objects.requireNonNull(builder.signature, "signature");
		this.startDateInMillis = Objects.requireNonNull(builder.startDateInMillis, "start_date_in_millis");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.uid = Objects.requireNonNull(builder.uid, "uid");

	}

	/**
	 * API name: {@code expiry_date_in_millis}
	 */
	public JsonValue expiryDateInMillis() {
		return this.expiryDateInMillis;
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
	@Nullable
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
	 * API name: {@code signature}
	 */
	public String signature() {
		return this.signature;
	}

	/**
	 * API name: {@code start_date_in_millis}
	 */
	public JsonValue startDateInMillis() {
		return this.startDateInMillis;
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

		generator.writeKey("issue_date_in_millis");
		generator.write(this.issueDateInMillis);

		generator.writeKey("issued_to");
		generator.write(this.issuedTo);

		generator.writeKey("issuer");
		generator.write(this.issuer);

		if (this.maxNodes != null) {

			generator.writeKey("max_nodes");
			generator.write(this.maxNodes.doubleValue());

		}
		if (this.maxResourceUnits != null) {

			generator.writeKey("max_resource_units");
			generator.write(this.maxResourceUnits.doubleValue());

		}

		generator.writeKey("signature");
		generator.write(this.signature);

		generator.writeKey("start_date_in_millis");
		generator.write(this.startDateInMillis);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

		generator.writeKey("uid");
		generator.write(this.uid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link License}.
	 */
	public static class Builder implements ObjectBuilder<License> {
		private JsonValue expiryDateInMillis;

		private JsonValue issueDateInMillis;

		private String issuedTo;

		private String issuer;

		@Nullable
		private Number maxNodes;

		@Nullable
		private Number maxResourceUnits;

		private String signature;

		private JsonValue startDateInMillis;

		private LicenseType type;

		private String uid;

		/**
		 * API name: {@code expiry_date_in_millis}
		 */
		public Builder expiryDateInMillis(JsonValue value) {
			this.expiryDateInMillis = value;
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
		public Builder maxNodes(@Nullable Number value) {
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
		 * API name: {@code signature}
		 */
		public Builder signature(String value) {
			this.signature = value;
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
		 * Builds a {@link License}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public License build() {

			return new License(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link License}
	 */
	public static final JsonpDeserializer<License> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, License::setupLicenseDeserializer);

	protected static void setupLicenseDeserializer(DelegatingDeserializer<License.Builder> op) {

		op.add(Builder::expiryDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "expiry_date_in_millis");
		op.add(Builder::issueDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "issue_date_in_millis");
		op.add(Builder::issuedTo, JsonpDeserializer.stringDeserializer(), "issued_to");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::maxNodes, JsonpDeserializer.numberDeserializer(), "max_nodes");
		op.add(Builder::maxResourceUnits, JsonpDeserializer.numberDeserializer(), "max_resource_units");
		op.add(Builder::signature, JsonpDeserializer.stringDeserializer(), "signature");
		op.add(Builder::startDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "start_date_in_millis");
		op.add(Builder::type, LicenseType.DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");

	}

}
