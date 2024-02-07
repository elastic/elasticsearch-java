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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: license._types.License

/**
 *
 * @see <a href="../doc-files/api-spec.html#license._types.License">API
 *      specification</a>
 */
@JsonpDeserializable
public class License implements JsonpSerializable {
	private final long expiryDateInMillis;

	private final long issueDateInMillis;

	@Nullable
	private final Long startDateInMillis;

	private final String issuedTo;

	private final String issuer;

	@Nullable
	private final Long maxNodes;

	@Nullable
	private final Long maxResourceUnits;

	private final String signature;

	private final LicenseType type;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	private License(Builder builder) {

		this.expiryDateInMillis = ApiTypeHelper.requireNonNull(builder.expiryDateInMillis, this, "expiryDateInMillis");
		this.issueDateInMillis = ApiTypeHelper.requireNonNull(builder.issueDateInMillis, this, "issueDateInMillis");
		this.startDateInMillis = builder.startDateInMillis;
		this.issuedTo = ApiTypeHelper.requireNonNull(builder.issuedTo, this, "issuedTo");
		this.issuer = ApiTypeHelper.requireNonNull(builder.issuer, this, "issuer");
		this.maxNodes = builder.maxNodes;
		this.maxResourceUnits = builder.maxResourceUnits;
		this.signature = ApiTypeHelper.requireNonNull(builder.signature, this, "signature");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.uid = ApiTypeHelper.requireNonNull(builder.uid, this, "uid");

	}

	public static License of(Function<Builder, ObjectBuilder<License>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code expiry_date_in_millis}
	 */
	public final long expiryDateInMillis() {
		return this.expiryDateInMillis;
	}

	/**
	 * Required - API name: {@code issue_date_in_millis}
	 */
	public final long issueDateInMillis() {
		return this.issueDateInMillis;
	}

	/**
	 * API name: {@code start_date_in_millis}
	 */
	@Nullable
	public final Long startDateInMillis() {
		return this.startDateInMillis;
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
	 */
	@Nullable
	public final Long maxResourceUnits() {
		return this.maxResourceUnits;
	}

	/**
	 * Required - API name: {@code signature}
	 */
	public final String signature() {
		return this.signature;
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

		if (this.startDateInMillis != null) {
			generator.writeKey("start_date_in_millis");
			generator.write(this.startDateInMillis);

		}
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
			generator.write(this.maxResourceUnits);

		}
		generator.writeKey("signature");
		generator.write(this.signature);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("uid");
		generator.write(this.uid);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link License}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<License> {
		private Long expiryDateInMillis;

		private Long issueDateInMillis;

		@Nullable
		private Long startDateInMillis;

		private String issuedTo;

		private String issuer;

		@Nullable
		private Long maxNodes;

		@Nullable
		private Long maxResourceUnits;

		private String signature;

		private LicenseType type;

		private String uid;

		/**
		 * Required - API name: {@code expiry_date_in_millis}
		 */
		public final Builder expiryDateInMillis(long value) {
			this.expiryDateInMillis = value;
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
		 * API name: {@code start_date_in_millis}
		 */
		public final Builder startDateInMillis(@Nullable Long value) {
			this.startDateInMillis = value;
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
		 */
		public final Builder maxResourceUnits(@Nullable Long value) {
			this.maxResourceUnits = value;
			return this;
		}

		/**
		 * Required - API name: {@code signature}
		 */
		public final Builder signature(String value) {
			this.signature = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link License}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public License build() {
			_checkSingleUse();

			return new License(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link License}
	 */
	public static final JsonpDeserializer<License> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			License::setupLicenseDeserializer);

	protected static void setupLicenseDeserializer(ObjectDeserializer<License.Builder> op) {

		op.add(Builder::expiryDateInMillis, JsonpDeserializer.longDeserializer(), "expiry_date_in_millis");
		op.add(Builder::issueDateInMillis, JsonpDeserializer.longDeserializer(), "issue_date_in_millis");
		op.add(Builder::startDateInMillis, JsonpDeserializer.longDeserializer(), "start_date_in_millis");
		op.add(Builder::issuedTo, JsonpDeserializer.stringDeserializer(), "issued_to");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::maxNodes, JsonpDeserializer.longDeserializer(), "max_nodes");
		op.add(Builder::maxResourceUnits, JsonpDeserializer.longDeserializer(), "max_resource_units");
		op.add(Builder::signature, JsonpDeserializer.stringDeserializer(), "signature");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");

	}

}
