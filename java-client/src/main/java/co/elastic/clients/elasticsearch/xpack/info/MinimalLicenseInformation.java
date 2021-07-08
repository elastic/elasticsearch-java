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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.info.MinimalLicenseInformation
public final class MinimalLicenseInformation implements ToJsonp {
	private final JsonValue expiryDateInMillis;

	private final JsonValue mode;

	private final JsonValue status;

	private final JsonValue type;

	private final String uid;

	// ---------------------------------------------------------------------------------------------

	protected MinimalLicenseInformation(Builder builder) {

		this.expiryDateInMillis = Objects.requireNonNull(builder.expiryDateInMillis, "expiry_date_in_millis");
		this.mode = Objects.requireNonNull(builder.mode, "mode");
		this.status = Objects.requireNonNull(builder.status, "status");
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
	 * API name: {@code mode}
	 */
	public JsonValue mode() {
		return this.mode;
	}

	/**
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("expiry_date_in_millis");
		generator.write(this.expiryDateInMillis);

		generator.writeKey("mode");
		generator.write(this.mode);

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("uid");
		generator.write(this.uid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MinimalLicenseInformation}.
	 */
	public static class Builder implements ObjectBuilder<MinimalLicenseInformation> {
		private JsonValue expiryDateInMillis;

		private JsonValue mode;

		private JsonValue status;

		private JsonValue type;

		private String uid;

		/**
		 * API name: {@code expiry_date_in_millis}
		 */
		public Builder expiryDateInMillis(JsonValue value) {
			this.expiryDateInMillis = value;
			return this;
		}

		/**
		 * API name: {@code mode}
		 */
		public Builder mode(JsonValue value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
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
	 * Json deserializer for MinimalLicenseInformation
	 */
	public static final JsonpDeserializer<MinimalLicenseInformation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MinimalLicenseInformation::setupMinimalLicenseInformationDeserializer);

	protected static void setupMinimalLicenseInformationDeserializer(
			DelegatingDeserializer<MinimalLicenseInformation.Builder> op) {

		op.add(Builder::expiryDateInMillis, JsonpDeserializer.jsonValueDeserializer(), "expiry_date_in_millis");
		op.add(Builder::mode, JsonpDeserializer.jsonValueDeserializer(), "mode");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");
		op.add(Builder::uid, JsonpDeserializer.stringDeserializer(), "uid");

	}

}
