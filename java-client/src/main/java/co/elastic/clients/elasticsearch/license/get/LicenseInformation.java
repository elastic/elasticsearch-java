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

package co.elastic.clients.elasticsearch.license.get;

import co.elastic.clients.elasticsearch.license.LicenseStatus;
import co.elastic.clients.elasticsearch.license.LicenseType;
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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: license.get.LicenseInformation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#license.get.LicenseInformation">API
 *      specification</a>
 */
@JsonpDeserializable
public class LicenseInformation implements JsonpSerializable {
	@Nullable
	private final DateTime expiryDate;

	@Nullable
	private final Long expiryDateInMillis;

	private final DateTime issueDate;

	private final long issueDateInMillis;

	private final String issuedTo;

	private final String issuer;

	@Nullable
	private final Long maxNodes;

	@Nullable
	private final Integer maxResourceUnits;

	private final LicenseStatus status;

	private final LicenseType type;

	private final String uid;

	private final long startDateInMillis;

	// ---------------------------------------------------------------------------------------------

	private LicenseInformation(Builder builder) {

		this.expiryDate = builder.expiryDate;
		this.expiryDateInMillis = builder.expiryDateInMillis;
		this.issueDate = ApiTypeHelper.requireNonNull(builder.issueDate, this, "issueDate");
		this.issueDateInMillis = ApiTypeHelper.requireNonNull(builder.issueDateInMillis, this, "issueDateInMillis");
		this.issuedTo = ApiTypeHelper.requireNonNull(builder.issuedTo, this, "issuedTo");
		this.issuer = ApiTypeHelper.requireNonNull(builder.issuer, this, "issuer");
		this.maxNodes = builder.maxNodes;
		this.maxResourceUnits = builder.maxResourceUnits;
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.uid = ApiTypeHelper.requireNonNull(builder.uid, this, "uid");
		this.startDateInMillis = ApiTypeHelper.requireNonNull(builder.startDateInMillis, this, "startDateInMillis");

	}

	public static LicenseInformation of(Function<Builder, ObjectBuilder<LicenseInformation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code expiry_date}
	 */
	@Nullable
	public final DateTime expiryDate() {
		return this.expiryDate;
	}

	/**
	 * API name: {@code expiry_date_in_millis}
	 */
	@Nullable
	public final Long expiryDateInMillis() {
		return this.expiryDateInMillis;
	}

	/**
	 * Required - API name: {@code issue_date}
	 */
	public final DateTime issueDate() {
		return this.issueDate;
	}

	/**
	 * Required - API name: {@code issue_date_in_millis}
	 */
	public final long issueDateInMillis() {
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
	 * API name: {@code max_nodes}
	 */
	@Nullable
	public final Long maxNodes() {
		return this.maxNodes;
	}

	/**
	 * API name: {@code max_resource_units}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
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
	public final long startDateInMillis() {
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

		if (this.expiryDate != null) {
			generator.writeKey("expiry_date");
			this.expiryDate.serialize(generator, mapper);
		}
		if (this.expiryDateInMillis != null) {
			generator.writeKey("expiry_date_in_millis");
			generator.write(this.expiryDateInMillis);

		}
		generator.writeKey("issue_date");
		this.issueDate.serialize(generator, mapper);
		generator.writeKey("issue_date_in_millis");
		generator.write(this.issueDateInMillis);

		generator.writeKey("issued_to");
		generator.write(this.issuedTo);

		generator.writeKey("issuer");
		generator.write(this.issuer);

		if (this.maxNodes != null) {
			generator.writeKey("max_nodes");
			generator.write(this.maxNodes);

		}
		if (this.maxResourceUnits != null) {
			generator.writeKey("max_resource_units");
			JsonpUtils.serializeIntOrNull(generator, this.maxResourceUnits, 0);
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LicenseInformation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LicenseInformation> {
		@Nullable
		private DateTime expiryDate;

		@Nullable
		private Long expiryDateInMillis;

		private DateTime issueDate;

		private Long issueDateInMillis;

		private String issuedTo;

		private String issuer;

		@Nullable
		private Long maxNodes;

		@Nullable
		private Integer maxResourceUnits;

		private LicenseStatus status;

		private LicenseType type;

		private String uid;

		private Long startDateInMillis;

		/**
		 * API name: {@code expiry_date}
		 */
		public final Builder expiryDate(@Nullable DateTime value) {
			this.expiryDate = value;
			return this;
		}

		/**
		 * API name: {@code expiry_date_in_millis}
		 */
		public final Builder expiryDateInMillis(@Nullable Long value) {
			this.expiryDateInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code issue_date}
		 */
		public final Builder issueDate(DateTime value) {
			this.issueDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code issue_date_in_millis}
		 */
		public final Builder issueDateInMillis(long value) {
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
		 * API name: {@code max_nodes}
		 */
		public final Builder maxNodes(@Nullable Long value) {
			this.maxNodes = value;
			return this;
		}

		/**
		 * API name: {@code max_resource_units}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
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
		public final Builder startDateInMillis(long value) {
			this.startDateInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			.lazy(Builder::new, LicenseInformation::setupLicenseInformationDeserializer);

	protected static void setupLicenseInformationDeserializer(ObjectDeserializer<LicenseInformation.Builder> op) {

		op.add(Builder::expiryDate, DateTime._DESERIALIZER, "expiry_date");
		op.add(Builder::expiryDateInMillis, JsonpDeserializer.longDeserializer(), "expiry_date_in_millis");
		op.add(Builder::issueDate, DateTime._DESERIALIZER, "issue_date");
		op.add(Builder::issueDateInMillis, JsonpDeserializer.longDeserializer(), "issue_date_in_millis");
		op.add(Builder::issuedTo, JsonpDeserializer.stringDeserializer(), "issued_to");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::maxNodes, JsonpDeserializer.longDeserializer(), "max_nodes");
		op.add(Builder::maxResourceUnits, JsonpDeserializer.intOrNullDeserializer(0), "max_resource_units");
		op.add(Builder::status, LicenseStatus._DESERIALIZER, "status");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");
		op.add(Builder::startDateInMillis, JsonpDeserializer.longDeserializer(), "start_date_in_millis");

	}

}
