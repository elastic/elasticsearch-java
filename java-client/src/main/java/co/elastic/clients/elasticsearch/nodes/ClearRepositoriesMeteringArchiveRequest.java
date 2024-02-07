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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: nodes.clear_repositories_metering_archive.Request

/**
 * You can use this API to clear the archived repositories metering information
 * in the cluster.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes.clear_repositories_metering_archive.Request">API
 *      specification</a>
 */

public class ClearRepositoriesMeteringArchiveRequest extends RequestBase {
	private final long maxArchiveVersion;

	private final List<String> nodeId;

	// ---------------------------------------------------------------------------------------------

	private ClearRepositoriesMeteringArchiveRequest(Builder builder) {

		this.maxArchiveVersion = ApiTypeHelper.requireNonNull(builder.maxArchiveVersion, this, "maxArchiveVersion");
		this.nodeId = ApiTypeHelper.unmodifiableRequired(builder.nodeId, this, "nodeId");

	}

	public static ClearRepositoriesMeteringArchiveRequest of(
			Function<Builder, ObjectBuilder<ClearRepositoriesMeteringArchiveRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Specifies the maximum <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-repositories-metering-api.html#get-repositories-metering-api-response-body">archive_version</a>
	 * to be cleared from the archive.
	 * <p>
	 * API name: {@code max_archive_version}
	 */
	public final long maxArchiveVersion() {
		return this.maxArchiveVersion;
	}

	/**
	 * Required - Comma-separated list of node IDs or names used to limit returned
	 * information. All the nodes selective options are explained <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/cluster.html#cluster-nodes">here</a>.
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearRepositoriesMeteringArchiveRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ClearRepositoriesMeteringArchiveRequest> {
		private Long maxArchiveVersion;

		private List<String> nodeId;

		/**
		 * Required - Specifies the maximum <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-repositories-metering-api.html#get-repositories-metering-api-response-body">archive_version</a>
		 * to be cleared from the archive.
		 * <p>
		 * API name: {@code max_archive_version}
		 */
		public final Builder maxArchiveVersion(long value) {
			this.maxArchiveVersion = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of node IDs or names used to limit returned
		 * information. All the nodes selective options are explained <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/cluster.html#cluster-nodes">here</a>.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeId</code>.
		 */
		public final Builder nodeId(List<String> list) {
			this.nodeId = _listAddAll(this.nodeId, list);
			return this;
		}

		/**
		 * Required - Comma-separated list of node IDs or names used to limit returned
		 * information. All the nodes selective options are explained <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/cluster.html#cluster-nodes">here</a>.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds one or more values to <code>nodeId</code>.
		 */
		public final Builder nodeId(String value, String... values) {
			this.nodeId = _listAdd(this.nodeId, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClearRepositoriesMeteringArchiveRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearRepositoriesMeteringArchiveRequest build() {
			_checkSingleUse();

			return new ClearRepositoriesMeteringArchiveRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.clear_repositories_metering_archive}".
	 */
	public static final Endpoint<ClearRepositoriesMeteringArchiveRequest, ClearRepositoriesMeteringArchiveResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/nodes.clear_repositories_metering_archive",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _maxArchiveVersion = 1 << 0;
				final int _nodeId = 1 << 1;

				int propsSet = 0;

				propsSet |= _maxArchiveVersion;
				propsSet |= _nodeId;

				if (propsSet == (_nodeId | _maxArchiveVersion)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/_repositories_metering");
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.maxArchiveVersion), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _maxArchiveVersion = 1 << 0;
				final int _nodeId = 1 << 1;

				int propsSet = 0;

				propsSet |= _maxArchiveVersion;
				propsSet |= _nodeId;

				if (propsSet == (_nodeId | _maxArchiveVersion)) {
					params.put("nodeId", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
					params.put("maxArchiveVersion", String.valueOf(request.maxArchiveVersion));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ClearRepositoriesMeteringArchiveResponse._DESERIALIZER);
}
