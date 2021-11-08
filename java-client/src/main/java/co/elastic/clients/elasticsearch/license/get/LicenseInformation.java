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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.get.LicenseInformation
@JsonpDeserializable
public class LicenseInformation implements JsonpSerializable {
	private final String expiryDate;

	private final String expiryDateInMillis;

	private final String issueDate;

	private final String issueDateInMillis;

	private final String issuedTo;

	private final String issuer;

	private final long maxNodes;

	@Nullable
	private final Integer maxResourceUnits;

	private final LicenseStatus status;

	private final LicenseType type;

	private final String uid;

	private final String startDateInMillis;

	// ---------------------------------------------------------------------------------------------

	private LicenseInformation(Builder builder) {

		this.expiryDate = ModelTypeHelper.requireNonNull(builder.expiryDate, this, "expiryDate");
		this.expiryDateInMillis = ModelTypeHelper.requireNonNull(builder.expiryDateInMillis, this,
				"expiryDateInMillis");
		this.issueDate = ModelTypeHelper.requireNonNull(builder.issueDate, this, "issueDate");
		this.issueDateInMillis = ModelTypeHelper.requireNonNull(builder.issueDateInMillis, this, "issueDateInMillis");
		this.issuedTo = ModelTypeHelper.requireNonNull(builder.issuedTo, this, "issuedTo");
		this.issuer = ModelTypeHelper.requireNonNull(builder.issuer, this, "issuer");
		this.maxNodes = ModelTypeHelper.requireNonNull(builder.maxNodes, this, "maxNodes");
		this.maxResourceUnits = builder.maxResourceUnits;
		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.uid = ModelTypeHelper.requireNonNull(builder.uid, this, "uid");
		this.startDateInMillis = ModelTypeHelper.requireNonNull(builder.startDateInMillis, this, "startDateInMillis");

	}

	public static LicenseInformation of(Function<Builder, ObjectBuilder<LicenseInformation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code expiry_date}
	 */
	public final String expiryDate() {
		return this.expiryDate;
	}

	/**
	 * Required - API name: {@code expiry_date_in_millis}
	 */
	public final String expiryDateInMillis() {
		return this.expiryDateInMillis;
	}

	/**
	 * Required - API name: {@code issue_date}
	 */
	public final String issueDate() {
		return this.issueDate;
	}

	/**
	 * Required - API name: {@code issue_date_in_millis}
	 */
	public final String issueDateInMillis() {
		return this.issueDateInMillis;
	}

	/**
	 * Required - API name: {@code issued_to}
	 */
	public final String issuedTo() {
		return this.issuedTo;
	}

	/**
	 * Required - API name: {@code issuer}
	 */
	public final String issuer() {
		return this.issuer;
	}

	/**
	 * Required - API name: {@code max_nodes}
	 */
	public final long maxNodes() {
		return this.maxNodes;
	}

	/**
	 * API name: {@code max_resource_units}
	 */
	@Nullable
	public final Integer maxResourceUnits() {
		return this.maxResourceUnits;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final LicenseStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final LicenseType type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code uid}
	 */
	public final String uid() {
		return this.uid;
	}

	/**
	 * Required - API name: {@code start_date_in_millis}
	 */
	public final String startDateInMillis() {
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
		generator.write(this.maxNodes);

		if (this.maxResourceUnits != null) {
			generator.writeKey("max_resource_units");
			generator.write(this.maxResourceUnits);

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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LicenseInformation> {
		private String expiryDate;

		private String expiryDateInMillis;

		private String issueDate;

		private String issueDateInMillis;

		private String issuedTo;

		private String issuer;

		private Long maxNodes;

		@Nullable
		private Integer maxResourceUnits;

		private LicenseStatus status;

		private LicenseType type;

		private String uid;

		private String startDateInMillis;

		/**
		 * Required - API name: {@code expiry_date}
		 */
		public final Builder expiryDate(String value) {
			this.expiryDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code expiry_date_in_millis}
		 */
		public final Builder expiryDateInMillis(String value) {
			this.expiryDateInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code issue_date}
		 */
		public final Builder issueDate(String value) {
			this.issueDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code issue_date_in_millis}
		 */
		public final Builder issueDateInMillis(String value) {
			this.issueDateInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code issued_to}
		 */
		public final Builder issuedTo(String value) {
			this.issuedTo = value;
			return this;
		}

		/**
		 * Required - API name: {@code issuer}
		 */
		public final Builder issuer(String value) {
			this.issuer = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_nodes}
		 */
		public final Builder maxNodes(long value) {
			this.maxNodes = value;
			return this;
		}

		/**
		 * API name: {@code max_resource_units}
		 */
		public final Builder maxResourceUnits(@Nullable Integer value) {
			this.maxResourceUnits = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(LicenseStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(LicenseType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code uid}
		 */
		public final Builder uid(String value) {
			this.uid = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_date_in_millis}
		 */
		public final Builder startDateInMillis(String value) {
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
			_checkSingleUse();

			return new LicenseInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LicenseInformation}
	 */
	public static final JsonpDeserializer<LicenseInformation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LicenseInformation::setupLicenseInformationDeserializer, Builder::build);

	protected static void setupLicenseInformationDeserializer(DelegatingDeserializer<LicenseInformation.Builder> op) {

		op.add(Builder::expiryDate, JsonpDeserializer.stringDeserializer(), "expiry_date");
		op.add(Builder::expiryDateInMillis, JsonpDeserializer.stringDeserializer(), "expiry_date_in_millis");
		op.add(Builder::issueDate, JsonpDeserializer.stringDeserializer(), "issue_date");
		op.add(Builder::issueDateInMillis, JsonpDeserializer.stringDeserializer(), "issue_date_in_millis");
		op.add(Builder::issuedTo, JsonpDeserializer.stringDeserializer(), "issued_to");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::maxNodes, JsonpDeserializer.longDeserializer(), "max_nodes");
		op.add(Builder::maxResourceUnits, JsonpDeserializer.integerDeserializer(), "max_resource_units");
		op.add(Builder::status, LicenseStatus._DESERIALIZER, "status");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");
		op.add(Builder::startDateInMillis, JsonpDeserializer.stringDeserializer(), "start_date_in_millis");

	}

}
