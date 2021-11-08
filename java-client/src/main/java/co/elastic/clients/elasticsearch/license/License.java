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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license._types.License
@JsonpDeserializable
public class License implements JsonpSerializable {
	private final String expiryDateInMillis;

	private final String issueDateInMillis;

	private final String issuedTo;

	private final String issuer;

	@Nullable
	private final Long maxNodes;

	@Nullable
	private final Long maxResourceUnits;

	private final String signature;

	private final String startDateInMillis;

	private final LicenseType type;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	private License(Builder builder) {

		this.expiryDateInMillis = ModelTypeHelper.requireNonNull(builder.expiryDateInMillis, this,
				"expiryDateInMillis");
		this.issueDateInMillis = ModelTypeHelper.requireNonNull(builder.issueDateInMillis, this, "issueDateInMillis");
		this.issuedTo = ModelTypeHelper.requireNonNull(builder.issuedTo, this, "issuedTo");
		this.issuer = ModelTypeHelper.requireNonNull(builder.issuer, this, "issuer");
		this.maxNodes = builder.maxNodes;
		this.maxResourceUnits = builder.maxResourceUnits;
		this.signature = ModelTypeHelper.requireNonNull(builder.signature, this, "signature");
		this.startDateInMillis = ModelTypeHelper.requireNonNull(builder.startDateInMillis, this, "startDateInMillis");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.uid = ModelTypeHelper.requireNonNull(builder.uid, this, "uid");

	}

	public static License of(Function<Builder, ObjectBuilder<License>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code expiry_date_in_millis}
	 */
	public final String expiryDateInMillis() {
		return this.expiryDateInMillis;
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
	 * Required - API name: {@code start_date_in_millis}
	 */
	public final String startDateInMillis() {
		return this.startDateInMillis;
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<License> {
		private String expiryDateInMillis;

		private String issueDateInMillis;

		private String issuedTo;

		private String issuer;

		@Nullable
		private Long maxNodes;

		@Nullable
		private Long maxResourceUnits;

		private String signature;

		private String startDateInMillis;

		private LicenseType type;

		private String uid;

		/**
		 * Required - API name: {@code expiry_date_in_millis}
		 */
		public final Builder expiryDateInMillis(String value) {
			this.expiryDateInMillis = value;
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
		 * Required - API name: {@code start_date_in_millis}
		 */
		public final Builder startDateInMillis(String value) {
			this.startDateInMillis = value;
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
			License::setupLicenseDeserializer, Builder::build);

	protected static void setupLicenseDeserializer(DelegatingDeserializer<License.Builder> op) {

		op.add(Builder::expiryDateInMillis, JsonpDeserializer.stringDeserializer(), "expiry_date_in_millis");
		op.add(Builder::issueDateInMillis, JsonpDeserializer.stringDeserializer(), "issue_date_in_millis");
		op.add(Builder::issuedTo, JsonpDeserializer.stringDeserializer(), "issued_to");
		op.add(Builder::issuer, JsonpDeserializer.stringDeserializer(), "issuer");
		op.add(Builder::maxNodes, JsonpDeserializer.longDeserializer(), "max_nodes");
		op.add(Builder::maxResourceUnits, JsonpDeserializer.longDeserializer(), "max_resource_units");
		op.add(Builder::signature, JsonpDeserializer.stringDeserializer(), "signature");
		op.add(Builder::startDateInMillis, JsonpDeserializer.stringDeserializer(), "start_date_in_millis");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");

	}

}
