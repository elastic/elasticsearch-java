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

package co.elastic.clients.elasticsearch.shutdown;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.TimeUnit;
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

// typedef: shutdown.put_node.Request

/**
 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
 * Direct use is not supported.
 * 
 * @see <a href="../doc-files/api-spec.html#shutdown.put_node.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutNodeRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String allocationDelay;

	@Nullable
	private final TimeUnit masterTimeout;

	private final String nodeId;

	private final String reason;

	@Nullable
	private final String targetNodeName;

	@Nullable
	private final TimeUnit timeout;

	private final Type type;

	// ---------------------------------------------------------------------------------------------

	private PutNodeRequest(Builder builder) {

		this.allocationDelay = builder.allocationDelay;
		this.masterTimeout = builder.masterTimeout;
		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.targetNodeName = builder.targetNodeName;
		this.timeout = builder.timeout;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static PutNodeRequest of(Function<Builder, ObjectBuilder<PutNodeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Only valid if type is restart. Controls how long Elasticsearch will wait for
	 * the node to restart and join the cluster before reassigning its shards to
	 * other nodes. This works the same as delaying allocation with the
	 * index.unassigned.node_left.delayed_timeout setting. If you specify both a
	 * restart allocation delay and an index-level allocation delay, the longer of
	 * the two is used.
	 * <p>
	 * API name: {@code allocation_delay}
	 */
	@Nullable
	public final String allocationDelay() {
		return this.allocationDelay;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final TimeUnit masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The node id of node to be shut down
	 * <p>
	 * API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - A human-readable reason that the node is being shut down. This
	 * field provides information for other cluster operators; it does not affect
	 * the shut down process.
	 * <p>
	 * API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * Only valid if type is replace. Specifies the name of the node that is
	 * replacing the node being shut down. Shards from the shut down node are only
	 * allowed to be allocated to the target node, and no other data will be
	 * allocated to the target node. During relocation of data certain allocation
	 * rules are ignored, such as disk watermarks or user attribute filtering rules.
	 * <p>
	 * API name: {@code target_node_name}
	 */
	@Nullable
	public final String targetNodeName() {
		return this.targetNodeName;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final TimeUnit timeout() {
		return this.timeout;
	}

	/**
	 * Required - Valid values are restart, remove, or replace. Use restart when you
	 * need to temporarily shut down a node to perform an upgrade, make
	 * configuration changes, or perform other maintenance. Because the node is
	 * expected to rejoin the cluster, data is not migrated off of the node. Use
	 * remove when you need to permanently remove a node from the cluster. The node
	 * is not marked ready for shutdown until data is migrated off of the node Use
	 * replace to do a 1:1 replacement of a node with another node. Certain
	 * allocation decisions will be ignored (such as disk watermarks) in the
	 * interest of true replacement of the source node with the target node. During
	 * a replace-type shutdown, rollover and index creation may result in unassigned
	 * shards, and shrink may fail until the replacement is complete.
	 * <p>
	 * API name: {@code type}
	 */
	public final Type type() {
		return this.type;
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

		if (this.allocationDelay != null) {
			generator.writeKey("allocation_delay");
			generator.write(this.allocationDelay);

		}
		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.targetNodeName != null) {
			generator.writeKey("target_node_name");
			generator.write(this.targetNodeName);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutNodeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutNodeRequest> {
		@Nullable
		private String allocationDelay;

		@Nullable
		private TimeUnit masterTimeout;

		private String nodeId;

		private String reason;

		@Nullable
		private String targetNodeName;

		@Nullable
		private TimeUnit timeout;

		private Type type;

		/**
		 * Only valid if type is restart. Controls how long Elasticsearch will wait for
		 * the node to restart and join the cluster before reassigning its shards to
		 * other nodes. This works the same as delaying allocation with the
		 * index.unassigned.node_left.delayed_timeout setting. If you specify both a
		 * restart allocation delay and an index-level allocation delay, the longer of
		 * the two is used.
		 * <p>
		 * API name: {@code allocation_delay}
		 */
		public final Builder allocationDelay(@Nullable String value) {
			this.allocationDelay = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable TimeUnit value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Required - The node id of node to be shut down
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - A human-readable reason that the node is being shut down. This
		 * field provides information for other cluster operators; it does not affect
		 * the shut down process.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Only valid if type is replace. Specifies the name of the node that is
		 * replacing the node being shut down. Shards from the shut down node are only
		 * allowed to be allocated to the target node, and no other data will be
		 * allocated to the target node. During relocation of data certain allocation
		 * rules are ignored, such as disk watermarks or user attribute filtering rules.
		 * <p>
		 * API name: {@code target_node_name}
		 */
		public final Builder targetNodeName(@Nullable String value) {
			this.targetNodeName = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable TimeUnit value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Required - Valid values are restart, remove, or replace. Use restart when you
		 * need to temporarily shut down a node to perform an upgrade, make
		 * configuration changes, or perform other maintenance. Because the node is
		 * expected to rejoin the cluster, data is not migrated off of the node. Use
		 * remove when you need to permanently remove a node from the cluster. The node
		 * is not marked ready for shutdown until data is migrated off of the node Use
		 * replace to do a 1:1 replacement of a node with another node. Certain
		 * allocation decisions will be ignored (such as disk watermarks) in the
		 * interest of true replacement of the source node with the target node. During
		 * a replace-type shutdown, rollover and index creation may result in unassigned
		 * shards, and shrink may fail until the replacement is complete.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(Type value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutNodeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutNodeRequest build() {
			_checkSingleUse();

			return new PutNodeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutNodeRequest}
	 */
	public static final JsonpDeserializer<PutNodeRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutNodeRequest::setupPutNodeRequestDeserializer);

	protected static void setupPutNodeRequestDeserializer(ObjectDeserializer<PutNodeRequest.Builder> op) {

		op.add(Builder::allocationDelay, JsonpDeserializer.stringDeserializer(), "allocation_delay");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::targetNodeName, JsonpDeserializer.stringDeserializer(), "target_node_name");
		op.add(Builder::type, Type._DESERIALIZER, "type");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code shutdown.put_node}".
	 */
	public static final Endpoint<PutNodeRequest, PutNodeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/shutdown.put_node",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				propsSet |= _nodeId;

				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId, buf);
					buf.append("/shutdown");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				propsSet |= _nodeId;

				if (propsSet == (_nodeId)) {
					params.put("nodeId", request.nodeId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.jsonValue());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutNodeResponse._DESERIALIZER);
}
