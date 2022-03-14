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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.Request

/**
 * Provides explanations for shard allocations in the cluster.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster.allocation_explain.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class AllocationExplainRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String currentNode;

	@Nullable
	private final Boolean includeDiskInfo;

	@Nullable
	private final Boolean includeYesDecisions;

	@Nullable
	private final String index;

	@Nullable
	private final Boolean primary;

	@Nullable
	private final Integer shard;

	// ---------------------------------------------------------------------------------------------

	private AllocationExplainRequest(Builder builder) {

		this.currentNode = builder.currentNode;
		this.includeDiskInfo = builder.includeDiskInfo;
		this.includeYesDecisions = builder.includeYesDecisions;
		this.index = builder.index;
		this.primary = builder.primary;
		this.shard = builder.shard;

	}

	public static AllocationExplainRequest of(Function<Builder, ObjectBuilder<AllocationExplainRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies the node ID or the name of the node to only explain a shard that is
	 * currently located on the specified node.
	 * <p>
	 * API name: {@code current_node}
	 */
	@Nullable
	public final String currentNode() {
		return this.currentNode;
	}

	/**
	 * If true, returns information about disk usage and shard sizes.
	 * <p>
	 * API name: {@code include_disk_info}
	 */
	@Nullable
	public final Boolean includeDiskInfo() {
		return this.includeDiskInfo;
	}

	/**
	 * If true, returns YES decisions in explanation.
	 * <p>
	 * API name: {@code include_yes_decisions}
	 */
	@Nullable
	public final Boolean includeYesDecisions() {
		return this.includeYesDecisions;
	}

	/**
	 * Specifies the name of the index that you would like an explanation for.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * If true, returns explanation for the primary shard for the given shard ID.
	 * <p>
	 * API name: {@code primary}
	 */
	@Nullable
	public final Boolean primary() {
		return this.primary;
	}

	/**
	 * Specifies the ID of the shard that you would like an explanation for.
	 * <p>
	 * API name: {@code shard}
	 */
	@Nullable
	public final Integer shard() {
		return this.shard;
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

		if (this.currentNode != null) {
			generator.writeKey("current_node");
			generator.write(this.currentNode);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.primary != null) {
			generator.writeKey("primary");
			generator.write(this.primary);

		}
		if (this.shard != null) {
			generator.writeKey("shard");
			generator.write(this.shard);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationExplainRequest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AllocationExplainRequest> {
		@Nullable
		private String currentNode;

		@Nullable
		private Boolean includeDiskInfo;

		@Nullable
		private Boolean includeYesDecisions;

		@Nullable
		private String index;

		@Nullable
		private Boolean primary;

		@Nullable
		private Integer shard;

		/**
		 * Specifies the node ID or the name of the node to only explain a shard that is
		 * currently located on the specified node.
		 * <p>
		 * API name: {@code current_node}
		 */
		public final Builder currentNode(@Nullable String value) {
			this.currentNode = value;
			return this;
		}

		/**
		 * If true, returns information about disk usage and shard sizes.
		 * <p>
		 * API name: {@code include_disk_info}
		 */
		public final Builder includeDiskInfo(@Nullable Boolean value) {
			this.includeDiskInfo = value;
			return this;
		}

		/**
		 * If true, returns YES decisions in explanation.
		 * <p>
		 * API name: {@code include_yes_decisions}
		 */
		public final Builder includeYesDecisions(@Nullable Boolean value) {
			this.includeYesDecisions = value;
			return this;
		}

		/**
		 * Specifies the name of the index that you would like an explanation for.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * If true, returns explanation for the primary shard for the given shard ID.
		 * <p>
		 * API name: {@code primary}
		 */
		public final Builder primary(@Nullable Boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * Specifies the ID of the shard that you would like an explanation for.
		 * <p>
		 * API name: {@code shard}
		 */
		public final Builder shard(@Nullable Integer value) {
			this.shard = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AllocationExplainRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationExplainRequest build() {
			_checkSingleUse();

			return new AllocationExplainRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationExplainRequest}
	 */
	public static final JsonpDeserializer<AllocationExplainRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AllocationExplainRequest::setupAllocationExplainRequestDeserializer);

	protected static void setupAllocationExplainRequestDeserializer(
			ObjectDeserializer<AllocationExplainRequest.Builder> op) {

		op.add(Builder::currentNode, JsonpDeserializer.stringDeserializer(), "current_node");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.allocation_explain}".
	 */
	public static final Endpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cluster.allocation_explain",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_cluster/allocation/explain";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.includeDiskInfo != null) {
					params.put("include_disk_info", String.valueOf(request.includeDiskInfo));
				}
				if (request.includeYesDecisions != null) {
					params.put("include_yes_decisions", String.valueOf(request.includeYesDecisions));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, AllocationExplainResponse._DESERIALIZER);
}
