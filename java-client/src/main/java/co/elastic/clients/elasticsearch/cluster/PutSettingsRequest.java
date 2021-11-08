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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.put_settings.Request
@JsonpDeserializable
public class PutSettingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final String masterTimeout;

	private final Map<String, JsonData> persistent;

	@Nullable
	private final String timeout;

	private final Map<String, JsonData> transient_;

	// ---------------------------------------------------------------------------------------------

	private PutSettingsRequest(Builder builder) {

		this.flatSettings = builder.flatSettings;
		this.masterTimeout = builder.masterTimeout;
		this.persistent = ModelTypeHelper.unmodifiable(builder.persistent);
		this.timeout = builder.timeout;
		this.transient_ = ModelTypeHelper.unmodifiable(builder.transient_);

	}

	public static PutSettingsRequest of(Function<Builder, ObjectBuilder<PutSettingsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Return settings in flat format (default: false)
	 * <p>
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public final Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code persistent}
	 */
	public final Map<String, JsonData> persistent() {
		return this.persistent;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code transient}
	 */
	public final Map<String, JsonData> transient_() {
		return this.transient_;
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

		if (ModelTypeHelper.isDefined(this.persistent)) {
			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.transient_)) {
			generator.writeKey("transient");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.transient_.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSettingsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutSettingsRequest> {
		@Nullable
		private Boolean flatSettings;

		@Nullable
		private String masterTimeout;

		@Nullable
		private Map<String, JsonData> persistent;

		@Nullable
		private String timeout;

		@Nullable
		private Map<String, JsonData> transient_;

		/**
		 * Return settings in flat format (default: false)
		 * <p>
		 * API name: {@code flat_settings}
		 */
		public final Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code persistent}
		 */
		public final Builder persistent(@Nullable Map<String, JsonData> value) {
			this.persistent = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code transient}
		 */
		public final Builder transient_(@Nullable Map<String, JsonData> value) {
			this.transient_ = value;
			return this;
		}

		/**
		 * Builds a {@link PutSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSettingsRequest build() {
			_checkSingleUse();

			return new PutSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutSettingsRequest}
	 */
	public static final JsonpDeserializer<PutSettingsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutSettingsRequest::setupPutSettingsRequestDeserializer, Builder::build);

	protected static void setupPutSettingsRequestDeserializer(DelegatingDeserializer<PutSettingsRequest.Builder> op) {

		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "transient");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.put_settings}".
	 */
	public static final Endpoint<PutSettingsRequest, PutSettingsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutSettingsResponse._DESERIALIZER);
}
