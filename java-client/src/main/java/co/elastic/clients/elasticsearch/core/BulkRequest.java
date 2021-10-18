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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.bulk.Operation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.bulk.Request

public final class BulkRequest extends RequestBase implements NdJsonpSerializable, JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final String pipeline;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	@Nullable
	private final String routing;

	@Nullable
	private final JsonValue /* Union(_types.Fields | internal.boolean) */ source;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	@Nullable
	private final Boolean requireAlias;

	private final List<Operation> operations;

	// ---------------------------------------------------------------------------------------------

	public BulkRequest(Builder builder) {

		this.index = builder.index;
		this.type = builder.type;
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.source = builder.source;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.requireAlias = builder.requireAlias;
		this.operations = ModelTypeHelper.unmodifiableNonNull(builder.operations, "_value_body");

	}

	public BulkRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	@Override
	public Iterator<?> _serializables() {
		return this.operations.iterator();
	}
	/**
	 * Default index for items which don't provide one
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * Default document type for items which don't provide one
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * The pipeline id to preprocess incoming documents with
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code> then refresh the affected shards to make this operation
	 * visible to search, if <code>wait_for</code> then wait for a refresh to make
	 * this operation visible to search, if <code>false</code> (the default) then do
	 * nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * True or false to return the _source field or not, or default list of fields
	 * to return, can be overridden on each sub-request
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /* Union(_types.Fields | internal.boolean) */ source() {
		return this.source;
	}

	/**
	 * Default list of fields to exclude from the returned _source field, can be
	 * overridden on each sub-request
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * Default list of fields to extract and return from the _source field, can be
	 * overridden on each sub-request
	 * <p>
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Sets the number of shard copies that must be active before proceeding with
	 * the bulk operation. Defaults to 1, meaning the primary shard only. Set to
	 * <code>all</code> for all shard copies, otherwise set to any non-negative
	 * value less than or equal to the total number of copies for the shard (number
	 * of replicas + 1)
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Sets require_alias for all incoming documents. Defaults to unset (false)
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public List<Operation> operations() {
		return this.operations;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (Operation item0 : this.operations) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkRequest}.
	 */
	public static class Builder implements ObjectBuilder<BulkRequest> {
		@Nullable
		private String index;

		@Nullable
		private String type;

		@Nullable
		private String pipeline;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private String routing;

		@Nullable
		private JsonValue /* Union(_types.Fields | internal.boolean) */ source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		@Nullable
		private Boolean requireAlias;

		private List<Operation> operations;

		/**
		 * Default index for items which don't provide one
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Default document type for items which don't provide one
		 * <p>
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * The pipeline id to preprocess incoming documents with
		 * <p>
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * If <code>true</code> then refresh the affected shards to make this operation
		 * visible to search, if <code>wait_for</code> then wait for a refresh to make
		 * this operation visible to search, if <code>false</code> (the default) then do
		 * nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * True or false to return the _source field or not, or default list of fields
		 * to return, can be overridden on each sub-request
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable JsonValue /* Union(_types.Fields | internal.boolean) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * Default list of fields to exclude from the returned _source field, can be
		 * overridden on each sub-request
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * Default list of fields to exclude from the returned _source field, can be
		 * overridden on each sub-request
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return this;
		}

		/**
		 * Default list of fields to extract and return from the _source field, can be
		 * overridden on each sub-request
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * Default list of fields to extract and return from the _source field, can be
		 * overridden on each sub-request
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Sets the number of shard copies that must be active before proceeding with
		 * the bulk operation. Defaults to 1, meaning the primary shard only. Set to
		 * <code>all</code> for all shard copies, otherwise set to any non-negative
		 * value less than or equal to the total number of copies for the shard (number
		 * of replicas + 1)
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Sets require_alias for all incoming documents. Defaults to unset (false)
		 * <p>
		 * API name: {@code require_alias}
		 */
		public Builder requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder operations(List<Operation> value) {
			this.operations = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder operations(Operation... value) {
			this.operations = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #operations(List)}, creating the list if needed.
		 */
		public Builder addOperations(Operation value) {
			if (this.operations == null) {
				this.operations = new ArrayList<>();
			}
			this.operations.add(value);
			return this;
		}

		/**
		 * Set {@link #operations(List)} to a singleton list.
		 */
		public Builder operations(Function<Operation.Builder, ObjectBuilder<Operation>> fn) {
			return this.operations(fn.apply(new Operation.Builder()).build());
		}

		/**
		 * Add a value to {@link #operations(List)}, creating the list if needed.
		 */
		public Builder addOperations(Function<Operation.Builder, ObjectBuilder<Operation>> fn) {
			return this.addOperations(fn.apply(new Operation.Builder()).build());
		}

		/**
		 * Builds a {@link BulkRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkRequest build() {

			return new BulkRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code bulk}".
	 */
	public static final Endpoint<BulkRequest, BulkResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_bulk");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_bulk");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.type, buf);
					buf.append("/_bulk");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.source != null) {
					params.put("_source", JsonpUtils.toString(request.source));
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, BulkResponse._DESERIALIZER);
}
