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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.put_alias.Request

/**
 * Adds a data stream or index to an alias.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.put_alias.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAliasRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Query filter;

	private final List<String> index;

	@Nullable
	private final String indexRouting;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final Time masterTimeout;

	private final String name;

	@Nullable
	private final String routing;

	@Nullable
	private final String searchRouting;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutAliasRequest(Builder builder) {

		this.filter = builder.filter;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.indexRouting = builder.indexRouting;
		this.isWriteIndex = builder.isWriteIndex;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;
		this.timeout = builder.timeout;

	}

	public static PutAliasRequest of(Function<Builder, ObjectBuilder<PutAliasRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query used to limit documents the alias can access.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * Required - Comma-separated list of data streams or indices to add. Supports
	 * wildcards (<code>*</code>). Wildcard patterns that match both data streams
	 * and indices return an error.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Value used to route indexing operations to a specific shard. If specified,
	 * this overwrites the <code>routing</code> value for indexing operations. Data
	 * stream aliases don’t support this parameter.
	 * <p>
	 * API name: {@code index_routing}
	 */
	@Nullable
	public final String indexRouting() {
		return this.indexRouting;
	}

	/**
	 * If <code>true</code>, sets the write index or data stream for the alias. If
	 * an alias points to multiple indices or data streams and
	 * <code>is_write_index</code> isn’t set, the alias rejects write requests. If
	 * an index alias points to one index and <code>is_write_index</code> isn’t set,
	 * the index automatically acts as the write index. Data stream aliases don’t
	 * automatically set a write data stream, even if the alias points to one data
	 * stream.
	 * <p>
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public final Boolean isWriteIndex() {
		return this.isWriteIndex;
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
	 * Required - Alias to update. If the alias doesn’t exist, the request creates
	 * it. Index alias names support date math.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Value used to route indexing and search operations to a specific shard. Data
	 * stream aliases don’t support this parameter.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Value used to route search operations to a specific shard. If specified, this
	 * overwrites the <code>routing</code> value for search operations. Data stream
	 * aliases don’t support this parameter.
	 * <p>
	 * API name: {@code search_routing}
	 */
	@Nullable
	public final String searchRouting() {
		return this.searchRouting;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.indexRouting != null) {
			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

		}
		if (this.isWriteIndex != null) {
			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.searchRouting != null) {
			generator.writeKey("search_routing");
			generator.write(this.searchRouting);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAliasRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutAliasRequest> {
		@Nullable
		private Query filter;

		private List<String> index;

		@Nullable
		private String indexRouting;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private Time masterTimeout;

		private String name;

		@Nullable
		private String routing;

		@Nullable
		private String searchRouting;

		@Nullable
		private Time timeout;

		/**
		 * Query used to limit documents the alias can access.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Query used to limit documents the alias can access.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - Comma-separated list of data streams or indices to add. Supports
		 * wildcards (<code>*</code>). Wildcard patterns that match both data streams
		 * and indices return an error.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams or indices to add. Supports
		 * wildcards (<code>*</code>). Wildcard patterns that match both data streams
		 * and indices return an error.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Value used to route indexing operations to a specific shard. If specified,
		 * this overwrites the <code>routing</code> value for indexing operations. Data
		 * stream aliases don’t support this parameter.
		 * <p>
		 * API name: {@code index_routing}
		 */
		public final Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * If <code>true</code>, sets the write index or data stream for the alias. If
		 * an alias points to multiple indices or data streams and
		 * <code>is_write_index</code> isn’t set, the alias rejects write requests. If
		 * an index alias points to one index and <code>is_write_index</code> isn’t set,
		 * the index automatically acts as the write index. Data stream aliases don’t
		 * automatically set a write data stream, even if the alias points to one data
		 * stream.
		 * <p>
		 * API name: {@code is_write_index}
		 */
		public final Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
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
		 * Required - Alias to update. If the alias doesn’t exist, the request creates
		 * it. Index alias names support date math.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Value used to route indexing and search operations to a specific shard. Data
		 * stream aliases don’t support this parameter.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Value used to route search operations to a specific shard. If specified, this
		 * overwrites the <code>routing</code> value for search operations. Data stream
		 * aliases don’t support this parameter.
		 * <p>
		 * API name: {@code search_routing}
		 */
		public final Builder searchRouting(@Nullable String value) {
			this.searchRouting = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAliasRequest build() {
			_checkSingleUse();

			return new PutAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAliasRequest}
	 */
	public static final JsonpDeserializer<PutAliasRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutAliasRequest::setupPutAliasRequestDeserializer);

	protected static void setupPutAliasRequestDeserializer(ObjectDeserializer<PutAliasRequest.Builder> op) {

		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_alias}".
	 */
	public static final Endpoint<PutAliasRequest, PutAliasResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_alias",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				propsSet |= _name;
				propsSet |= _index;

				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_alias");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_aliases");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				propsSet |= _name;
				propsSet |= _index;

				if (propsSet == (_index | _name)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					params.put("name", request.name);
				}
				if (propsSet == (_index | _name)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					params.put("name", request.name);
				}
				return params;
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

			}, SimpleEndpoint.emptyMap(), true, PutAliasResponse._DESERIALIZER);
}
