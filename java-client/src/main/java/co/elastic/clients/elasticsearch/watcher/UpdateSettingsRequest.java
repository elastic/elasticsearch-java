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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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

// typedef: watcher.update_settings.Request

/**
 * Update Watcher index settings.
 * <p>
 * Update settings for the Watcher internal index (<code>.watches</code>). Only
 * a subset of settings can be modified. This includes
 * <code>index.auto_expand_replicas</code>,
 * <code>index.number_of_replicas</code>,
 * <code>index.routing.allocation.exclude.*</code>,
 * <code>index.routing.allocation.include.*</code> and
 * <code>index.routing.allocation.require.*</code>. Modification of
 * <code>index.routing.allocation.include._tier_preference</code> is an
 * exception and is not allowed as the Watcher shards must always be in the
 * <code>data_content</code> tier.
 * 
 * @see <a href="../doc-files/api-spec.html#watcher.update_settings.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateSettingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String indexAutoExpandReplicas;

	@Nullable
	private final Integer indexNumberOfReplicas;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private UpdateSettingsRequest(Builder builder) {

		this.indexAutoExpandReplicas = builder.indexAutoExpandReplicas;
		this.indexNumberOfReplicas = builder.indexNumberOfReplicas;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public static UpdateSettingsRequest of(Function<Builder, ObjectBuilder<UpdateSettingsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code index.auto_expand_replicas}
	 */
	@Nullable
	public final String indexAutoExpandReplicas() {
		return this.indexAutoExpandReplicas;
	}

	/**
	 * API name: {@code index.number_of_replicas}
	 */
	@Nullable
	public final Integer indexNumberOfReplicas() {
		return this.indexNumberOfReplicas;
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The period to wait for a response. If no response is received before the
	 * timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (this.indexAutoExpandReplicas != null) {
			generator.writeKey("index.auto_expand_replicas");
			generator.write(this.indexAutoExpandReplicas);

		}
		if (this.indexNumberOfReplicas != null) {
			generator.writeKey("index.number_of_replicas");
			generator.write(this.indexNumberOfReplicas);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateSettingsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateSettingsRequest> {
		@Nullable
		private String indexAutoExpandReplicas;

		@Nullable
		private Integer indexNumberOfReplicas;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		/**
		 * API name: {@code index.auto_expand_replicas}
		 */
		public final Builder indexAutoExpandReplicas(@Nullable String value) {
			this.indexAutoExpandReplicas = value;
			return this;
		}

		/**
		 * API name: {@code index.number_of_replicas}
		 */
		public final Builder indexNumberOfReplicas(@Nullable Integer value) {
			this.indexNumberOfReplicas = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateSettingsRequest build() {
			_checkSingleUse();

			return new UpdateSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateSettingsRequest}
	 */
	public static final JsonpDeserializer<UpdateSettingsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateSettingsRequest::setupUpdateSettingsRequestDeserializer);

	protected static void setupUpdateSettingsRequestDeserializer(ObjectDeserializer<UpdateSettingsRequest.Builder> op) {

		op.add(Builder::indexAutoExpandReplicas, JsonpDeserializer.stringDeserializer(), "index.auto_expand_replicas");
		op.add(Builder::indexNumberOfReplicas, JsonpDeserializer.integerDeserializer(), "index.number_of_replicas");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.update_settings}".
	 */
	public static final Endpoint<UpdateSettingsRequest, UpdateSettingsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.update_settings",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_watcher/settings";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateSettingsResponse._DESERIALIZER);
}
