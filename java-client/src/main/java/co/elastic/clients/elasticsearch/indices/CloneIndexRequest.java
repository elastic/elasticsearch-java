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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
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
import java.lang.String;
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

// typedef: indices.clone.Request

/**
 * Clone an index. Clone an existing index into a new index. Each original
 * primary shard is cloned into a new primary shard in the new index.
 * <p>
 * IMPORTANT: Elasticsearch does not apply index templates to the resulting
 * index. The API also does not copy index metadata from the original index.
 * Index metadata includes aliases, index lifecycle management phase
 * definitions, and cross-cluster replication (CCR) follower information. For
 * example, if you clone a CCR follower index, the resulting clone will not be a
 * follower index.
 * <p>
 * The clone API copies most index settings from the source index to the
 * resulting index, with the exception of <code>index.number_of_replicas</code>
 * and <code>index.auto_expand_replicas</code>. To set the number of replicas in
 * the resulting index, configure these settings in the clone request.
 * <p>
 * Cloning works as follows:
 * <ul>
 * <li>First, it creates a new target index with the same definition as the
 * source index.</li>
 * <li>Then it hard-links segments from the source index into the target index.
 * If the file system does not support hard-linking, all segments are copied
 * into the new index, which is a much more time consuming process.</li>
 * <li>Finally, it recovers the target index as though it were a closed index
 * which had just been re-opened.</li>
 * </ul>
 * <p>
 * IMPORTANT: Indices can only be cloned if they meet the following
 * requirements:
 * <ul>
 * <li>The index must be marked as read-only and have a cluster health status of
 * green.</li>
 * <li>The target index must not exist.</li>
 * <li>The source index must have the same number of primary shards as the
 * target index.</li>
 * <li>The node handling the clone process must have sufficient free disk space
 * to accommodate a second copy of the existing index.</li>
 * </ul>
 * <p>
 * The current write index on a data stream cannot be cloned. In order to clone
 * the current write index, the data stream must first be rolled over so that a
 * new write index is created and then the previous write index can be cloned.
 * <p>
 * NOTE: Mappings cannot be specified in the <code>_clone</code> request. The
 * mappings of the source index will be used for the target index.
 * <p>
 * <strong>Monitor the cloning process</strong>
 * <p>
 * The cloning process can be monitored with the cat recovery API or the cluster
 * health API can be used to wait until all primary shards have been allocated
 * by setting the <code>wait_for_status</code> parameter to <code>yellow</code>.
 * <p>
 * The <code>_clone</code> API returns as soon as the target index has been
 * added to the cluster state, before any shards have been allocated. At this
 * point, all shards are in the state unassigned. If, for any reason, the target
 * index can't be allocated, its primary shard will remain unassigned until it
 * can be allocated on that node.
 * <p>
 * Once the primary shard is allocated, it moves to state initializing, and the
 * clone process begins. When the clone operation completes, the shard will
 * become active. At that point, Elasticsearch will try to allocate any replicas
 * and may decide to relocate the primary shard to another node.
 * <p>
 * <strong>Wait for active shards</strong>
 * <p>
 * Because the clone operation creates a new index to clone the shards to, the
 * wait for active shards setting on index creation applies to the clone index
 * action as well.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.clone.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CloneIndexRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	private final String index;

	@Nullable
	private final Time masterTimeout;

	private final Map<String, JsonData> settings;

	private final String target;

	@Nullable
	private final Time timeout;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	private CloneIndexRequest(Builder builder) {

		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.index = ApiTypeHelper.requireNonNullWithDefault(builder.index, this, "index", this.index());
		this.masterTimeout = builder.masterTimeout;
		this.settings = ApiTypeHelper.unmodifiable(builder.settings);
		this.target = ApiTypeHelper.requireNonNullWithDefault(builder.target, this, "target", this.target());
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public static CloneIndexRequest of(Function<Builder, ObjectBuilder<CloneIndexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aliases for the resulting index.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * Required - Name of the source index to clone.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Configuration options for the target index.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Required - Name of the target index to create.
	 * <p>
	 * API name: {@code target}
	 */
	public final String target() {
		return this.target;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set to <code>all</code> or any positive integer up to the total
	 * number of shards in the index (<code>number_of_replicas+1</code>).
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
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

		if (ApiTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloneIndexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CloneIndexRequest> {
		@Nullable
		private Map<String, Alias> aliases;

		private String index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Map<String, JsonData> settings;

		private String target;

		@Nullable
		private Time timeout;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		/**
		 * Aliases for the resulting index.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aliases</code>.
		 */
		public final Builder aliases(Map<String, Alias> map) {
			this.aliases = _mapPutAll(this.aliases, map);
			return this;
		}

		/**
		 * Aliases for the resulting index.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code>.
		 */
		public final Builder aliases(String key, Alias value) {
			this.aliases = _mapPut(this.aliases, key, value);
			return this;
		}

		/**
		 * Aliases for the resulting index.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return aliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * Required - Name of the source index to clone.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Configuration options for the target index.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Configuration options for the target index.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		/**
		 * Required - Name of the target index to create.
		 * <p>
		 * API name: {@code target}
		 */
		public final Builder target(String value) {
			this.target = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>).
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>).
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CloneIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloneIndexRequest build() {
			_checkSingleUse();

			return new CloneIndexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloneIndexRequest}
	 */
	public static final JsonpDeserializer<CloneIndexRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CloneIndexRequest::setupCloneIndexRequestDeserializer);

	protected static void setupCloneIndexRequestDeserializer(ObjectDeserializer<CloneIndexRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.clone}".
	 */
	public static final Endpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.clone",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _target = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _target;

				if (propsSet == (_index | _target)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_clone");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.target, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;
				final int _target = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _target;

				if (propsSet == (_index | _target)) {
					params.put("index", request.index);
					params.put("target", request.target);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CloneIndexResponse._DESERIALIZER);
}
