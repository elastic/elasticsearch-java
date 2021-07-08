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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: cluster.put_settings.Request
public final class PutSettingsRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final Map<String, JsonValue> persistent;

	@Nullable
	private final Map<String, JsonValue> transient_;

	// ---------------------------------------------------------------------------------------------

	protected PutSettingsRequest(Builder builder) {

		this.flatSettings = builder.flatSettings;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.persistent = builder.persistent;
		this.transient_ = builder.transient_;

	}

	/**
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code persistent}
	 */
	@Nullable
	public Map<String, JsonValue> persistent() {
		return this.persistent;
	}

	/**
	 * API name: {@code transient}
	 */
	@Nullable
	public Map<String, JsonValue> transient_() {
		return this.transient_;
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

		if (this.persistent != null) {

			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.transient_ != null) {

			generator.writeKey("transient");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.transient_.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSettingsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutSettingsRequest> {
		@Nullable
		private Boolean flatSettings;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private Map<String, JsonValue> persistent;

		@Nullable
		private Map<String, JsonValue> transient_;

		/**
		 * API name: {@code flat_settings}
		 */
		public Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code persistent}
		 */
		public Builder persistent(@Nullable Map<String, JsonValue> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #persistent(Map)}, creating the map if needed.
		 */
		public Builder putPersistent(String key, JsonValue value) {
			if (this.persistent == null) {
				this.persistent = new HashMap<>();
			}
			this.persistent.put(key, value);
			return this;
		}

		/**
		 * API name: {@code transient}
		 */
		public Builder transient_(@Nullable Map<String, JsonValue> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #transient_(Map)}, creating the map if needed.
		 */
		public Builder putTransient_(String key, JsonValue value) {
			if (this.transient_ == null) {
				this.transient_ = new HashMap<>();
			}
			this.transient_.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link PutSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSettingsRequest build() {

			return new PutSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutSettingsRequest
	 */
	public static final JsonpDeserializer<PutSettingsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutSettingsRequest::setupPutSettingsRequestDeserializer);

	protected static void setupPutSettingsRequestDeserializer(DelegatingDeserializer<PutSettingsRequest.Builder> op) {

		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"transient");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.put_settings}".
	 */
	public static final Endpoint<PutSettingsRequest, PutSettingsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_cluster/settings";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutSettingsResponse.DESERIALIZER);
}
