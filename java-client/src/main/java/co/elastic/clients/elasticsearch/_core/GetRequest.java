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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.get.Request

public class GetRequest extends RequestBase {
	private final String id;

	private final String index;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final String routing;

	@Nullable
	private final JsonValue /* Union(internal.boolean | _types.Fields) */ source;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	public GetRequest(AbstractBuilder<?> builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.source = builder.source;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	/**
	 * Unique identifier of the document.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Name of the index that contains the document.
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Specifies the node or shard the operation should be performed on. Random by
	 * default.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Boolean) If true, the request is real-time as opposed to near-real-time.
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public Boolean realtime() {
		return this.realtime;
	}

	/**
	 * If true, Elasticsearch refreshes the affected shards to make this operation
	 * visible to search. If false, do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public Boolean refresh() {
		return this.refresh;
	}

	/**
	 * Target the specified primary shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * True or false to return the _source field or not, or a list of fields to
	 * return.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /* Union(internal.boolean | _types.Fields) */ source() {
		return this.source;
	}

	/**
	 * A comma-separated list of source fields to exclude in the response.
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A comma-separated list of source fields to include in the response.
	 * <p>
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * A comma-separated list of stored fields to return in the response
	 * <p>
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * Explicit version number for concurrency control. The specified version must
	 * match the current version of the document for the request to succeed.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * Specific version type: internal, external, external_gte.
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public VersionType versionType() {
		return this.versionType;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRequest}.
	 */
	public static class Builder extends GetRequest.AbstractBuilder<Builder> implements ObjectBuilder<GetRequest> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRequest build() {

			return new GetRequest(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String id;

		private String index;

		@Nullable
		private String preference;

		@Nullable
		private Boolean realtime;

		@Nullable
		private Boolean refresh;

		@Nullable
		private String routing;

		@Nullable
		private JsonValue /* Union(internal.boolean | _types.Fields) */ source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * Unique identifier of the document.
		 * <p>
		 * API name: {@code id}
		 */
		public BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Name of the index that contains the document.
		 * <p>
		 * API name: {@code index}
		 */
		public BuilderT index(String value) {
			this.index = value;
			return self();
		}

		/**
		 * Specifies the node or shard the operation should be performed on. Random by
		 * default.
		 * <p>
		 * API name: {@code preference}
		 */
		public BuilderT preference(@Nullable String value) {
			this.preference = value;
			return self();
		}

		/**
		 * Boolean) If true, the request is real-time as opposed to near-real-time.
		 * <p>
		 * API name: {@code realtime}
		 */
		public BuilderT realtime(@Nullable Boolean value) {
			this.realtime = value;
			return self();
		}

		/**
		 * If true, Elasticsearch refreshes the affected shards to make this operation
		 * visible to search. If false, do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public BuilderT refresh(@Nullable Boolean value) {
			this.refresh = value;
			return self();
		}

		/**
		 * Target the specified primary shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public BuilderT routing(@Nullable String value) {
			this.routing = value;
			return self();
		}

		/**
		 * True or false to return the _source field or not, or a list of fields to
		 * return.
		 * <p>
		 * API name: {@code _source}
		 */
		public BuilderT source(@Nullable JsonValue /* Union(internal.boolean | _types.Fields) */ value) {
			this.source = value;
			return self();
		}

		/**
		 * A comma-separated list of source fields to exclude in the response.
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public BuilderT sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return self();
		}

		/**
		 * A comma-separated list of source fields to exclude in the response.
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public BuilderT sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed. 4
		 */
		public BuilderT addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return self();
		}

		/**
		 * A comma-separated list of source fields to include in the response.
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public BuilderT sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return self();
		}

		/**
		 * A comma-separated list of source fields to include in the response.
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public BuilderT sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed. 4
		 */
		public BuilderT addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return self();
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public BuilderT storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return self();
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public BuilderT storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed. 4
		 */
		public BuilderT addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return self();
		}

		/**
		 * Explicit version number for concurrency control. The specified version must
		 * match the current version of the document for the request to succeed.
		 * <p>
		 * API name: {@code version}
		 */
		public BuilderT version(@Nullable Long value) {
			this.version = value;
			return self();
		}

		/**
		 * Specific version type: internal, external, external_gte.
		 * <p>
		 * API name: {@code version_type}
		 */
		public BuilderT versionType(@Nullable VersionType value) {
			this.versionType = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code get}".
	 */
	private static final SimpleEndpoint<GetRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				propsSet |= _id;
				propsSet |= _index;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_doc");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
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
				if (request.storedFields != null) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.toString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);

	/**
	 * Create an "{@code get}" endpoint.
	 */
	public static <TDocument> Endpoint<GetRequest, GetResponse<TDocument>, ElasticsearchError> createGetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(GetResponse.createGetResponseDeserializer(tDocumentDeserializer));
	}
}
