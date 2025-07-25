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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: cluster.put_settings.Request

/**
 * Update the cluster settings.
 * <p>
 * Configure and update dynamic settings on a running cluster. You can also
 * configure dynamic settings locally on an unstarted or shut down node in
 * <code>elasticsearch.yml</code>.
 * <p>
 * Updates made with this API can be persistent, which apply across cluster
 * restarts, or transient, which reset after a cluster restart. You can also
 * reset transient or persistent settings by assigning them a null value.
 * <p>
 * If you configure the same setting using multiple methods, Elasticsearch
 * applies the settings in following order of precedence: 1) Transient setting;
 * 2) Persistent setting; 3) <code>elasticsearch.yml</code> setting; 4) Default
 * setting value. For example, you can apply a transient setting to override a
 * persistent setting or <code>elasticsearch.yml</code> setting. However, a
 * change to an <code>elasticsearch.yml</code> setting will not override a
 * defined transient or persistent setting.
 * <p>
 * TIP: In Elastic Cloud, use the user settings feature to configure all cluster
 * settings. This method automatically rejects unsafe settings that could break
 * your cluster. If you run Elasticsearch on your own hardware, use this API to
 * configure dynamic cluster settings. Only use <code>elasticsearch.yml</code>
 * for static cluster settings and node settings. The API doesn’t require a
 * restart and ensures a setting’s value is the same on all nodes.
 * <p>
 * WARNING: Transient cluster settings are no longer recommended. Use persistent
 * cluster settings instead. If a cluster becomes unstable, transient settings
 * can clear unexpectedly, resulting in a potentially undesired cluster
 * configuration.
 * 
 * @see <a href="../doc-files/api-spec.html#cluster.put_settings.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutClusterSettingsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Time masterTimeout;

	private final Map<String, JsonData> persistent;

	@Nullable
	private final Time timeout;

	private final Map<String, JsonData> transient_;

	// ---------------------------------------------------------------------------------------------

	private PutClusterSettingsRequest(Builder builder) {

		this.flatSettings = builder.flatSettings;
		this.masterTimeout = builder.masterTimeout;
		this.persistent = ApiTypeHelper.unmodifiable(builder.persistent);
		this.timeout = builder.timeout;
		this.transient_ = ApiTypeHelper.unmodifiable(builder.transient_);

	}

	public static PutClusterSettingsRequest of(Function<Builder, ObjectBuilder<PutClusterSettingsRequest>> fn) {
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
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The settings that persist after the cluster restarts.
	 * <p>
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
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The settings that do not persist after the cluster restarts.
	 * <p>
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

		if (ApiTypeHelper.isDefined(this.persistent)) {
			generator.writeKey("persistent");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.persistent.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.transient_)) {
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
	 * Builder for {@link PutClusterSettingsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutClusterSettingsRequest> {
		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Map<String, JsonData> persistent;

		@Nullable
		private Time timeout;

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
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The settings that persist after the cluster restarts.
		 * <p>
		 * API name: {@code persistent}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>persistent</code>.
		 */
		public final Builder persistent(Map<String, JsonData> map) {
			this.persistent = _mapPutAll(this.persistent, map);
			return this;
		}

		/**
		 * The settings that persist after the cluster restarts.
		 * <p>
		 * API name: {@code persistent}
		 * <p>
		 * Adds an entry to <code>persistent</code>.
		 */
		public final Builder persistent(String key, JsonData value) {
			this.persistent = _mapPut(this.persistent, key, value);
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The settings that do not persist after the cluster restarts.
		 * <p>
		 * API name: {@code transient}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>transient_</code>.
		 */
		public final Builder transient_(Map<String, JsonData> map) {
			this.transient_ = _mapPutAll(this.transient_, map);
			return this;
		}

		/**
		 * The settings that do not persist after the cluster restarts.
		 * <p>
		 * API name: {@code transient}
		 * <p>
		 * Adds an entry to <code>transient_</code>.
		 */
		public final Builder transient_(String key, JsonData value) {
			this.transient_ = _mapPut(this.transient_, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutClusterSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutClusterSettingsRequest build() {
			_checkSingleUse();

			return new PutClusterSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutClusterSettingsRequest}
	 */
	public static final JsonpDeserializer<PutClusterSettingsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutClusterSettingsRequest::setupPutClusterSettingsRequestDeserializer);

	protected static void setupPutClusterSettingsRequestDeserializer(
			ObjectDeserializer<PutClusterSettingsRequest.Builder> op) {

		op.add(Builder::persistent, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "persistent");
		op.add(Builder::transient_, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "transient");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.put_settings}".
	 */
	public static final Endpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cluster.put_settings",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_cluster/settings";

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
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutClusterSettingsResponse._DESERIALIZER);
}
