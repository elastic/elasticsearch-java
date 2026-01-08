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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.search.SourceConfigParam;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
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

// typedef: _global.get.Request

/**
 * Get a document by its ID.
 * <p>
 * Get a document and its source or stored fields from an index.
 * <p>
 * By default, this API is realtime and is not affected by the refresh rate of
 * the index (when data will become visible for search). In the case where
 * stored fields are requested with the <code>stored_fields</code> parameter and
 * the document has been updated but is not yet refreshed, the API will have to
 * parse and analyze the source to extract the stored fields. To turn off
 * realtime behavior, set the <code>realtime</code> parameter to false.
 * <p>
 * <strong>Source filtering</strong>
 * <p>
 * By default, the API returns the contents of the <code>_source</code> field
 * unless you have used the <code>stored_fields</code> parameter or the
 * <code>_source</code> field is turned off. You can turn off
 * <code>_source</code> retrieval by using the <code>_source</code> parameter:
 * 
 * <pre>
 * <code>GET my-index-000001/_doc/0?_source=false
 * </code>
 * </pre>
 * <p>
 * If you only need one or two fields from the <code>_source</code>, use the
 * <code>_source_includes</code> or <code>_source_excludes</code> parameters to
 * include or filter out particular fields. This can be helpful with large
 * documents where partial retrieval can save on network overhead Both
 * parameters take a comma separated list of fields or wildcard expressions. For
 * example:
 * 
 * <pre>
 * <code>GET my-index-000001/_doc/0?_source_includes=*.id&amp;_source_excludes=entities
 * </code>
 * </pre>
 * <p>
 * If you only want to specify includes, you can use a shorter notation:
 * 
 * <pre>
 * <code>GET my-index-000001/_doc/0?_source=*.id
 * </code>
 * </pre>
 * <p>
 * <strong>Routing</strong>
 * <p>
 * If routing is used during indexing, the routing value also needs to be
 * specified to retrieve a document. For example:
 * 
 * <pre>
 * <code>GET my-index-000001/_doc/2?routing=user1
 * </code>
 * </pre>
 * <p>
 * This request gets the document with ID 2, but it is routed based on the user.
 * The document is not fetched if the correct routing is not specified.
 * <p>
 * <strong>Distributed</strong>
 * <p>
 * The GET operation is hashed into a specific shard ID. It is then redirected
 * to one of the replicas within that shard ID and returns the result. The
 * replicas are the primary shard and its replicas within that shard ID group.
 * This means that the more replicas you have, the better your GET scaling will
 * be.
 * <p>
 * <strong>Versioning support</strong>
 * <p>
 * You can use the <code>version</code> parameter to retrieve the document only
 * if its current version is equal to the specified one.
 * <p>
 * Internally, Elasticsearch has marked the old document as deleted and added an
 * entirely new document. The old version of the document doesn't disappear
 * immediately, although you won't be able to access it. Elasticsearch cleans up
 * deleted documents in the background as you continue to index more data.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.get.Request">API
 *      specification</a>
 */

public class GetRequest extends RequestBase {
	@Nullable
	private final SourceConfigParam source;

	@Nullable
	private final Boolean sourceExcludeVectors;

	private final List<String> sourceExcludes;

	private final List<String> sourceIncludes;

	@Nullable
	private final Boolean forceSyntheticSource;

	private final String id;

	private final String index;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final Boolean refresh;

	private final List<String> routing;

	private final List<String> storedFields;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	private GetRequest(Builder builder) {

		this.source = builder.source;
		this.sourceExcludeVectors = builder.sourceExcludeVectors;
		this.sourceExcludes = ApiTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ApiTypeHelper.unmodifiable(builder.sourceIncludes);
		this.forceSyntheticSource = builder.forceSyntheticSource;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.refresh = builder.refresh;
		this.routing = ApiTypeHelper.unmodifiable(builder.routing);
		this.storedFields = ApiTypeHelper.unmodifiable(builder.storedFields);
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	public static GetRequest of(Function<Builder, ObjectBuilder<GetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether to return the <code>_source</code> field (<code>true</code>
	 * or <code>false</code>) or lists the fields to return.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfigParam source() {
		return this.source;
	}

	/**
	 * Whether vectors should be excluded from _source
	 * <p>
	 * API name: {@code _source_exclude_vectors}
	 */
	@Nullable
	public final Boolean sourceExcludeVectors() {
		return this.sourceExcludeVectors;
	}

	/**
	 * A comma-separated list of source fields to exclude from the response. You can
	 * also use this parameter to exclude fields from the subset specified in
	 * <code>_source_includes</code> query parameter. If the <code>_source</code>
	 * parameter is <code>false</code>, this parameter is ignored.
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	public final List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A comma-separated list of source fields to include in the response. If this
	 * parameter is specified, only these source fields are returned. You can
	 * exclude fields from this subset using the <code>_source_excludes</code> query
	 * parameter. If the <code>_source</code> parameter is <code>false</code>, this
	 * parameter is ignored.
	 * <p>
	 * API name: {@code _source_includes}
	 */
	public final List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * Indicates whether the request forces synthetic <code>_source</code>. Use this
	 * parameter to test if the mapping supports synthetic <code>_source</code> and
	 * to get a sense of the worst case performance. Fetches with this parameter
	 * enabled will be slower than enabling synthetic source natively in the index.
	 * <p>
	 * API name: {@code force_synthetic_source}
	 */
	@Nullable
	public final Boolean forceSyntheticSource() {
		return this.forceSyntheticSource;
	}

	/**
	 * Required - A unique document identifier.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The name of the index that contains the document.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * The node or shard the operation should be performed on. By default, the
	 * operation is randomized between the shard replicas.
	 * <p>
	 * If it is set to <code>_local</code>, the operation will prefer to be run on a
	 * local allocated shard when possible. If it is set to a custom value, the
	 * value is used to guarantee that the same shards will be used for the same
	 * custom value. This can help with &quot;jumping values&quot; when hitting
	 * different shards in different refresh states. A sample value can be something
	 * like the web session ID or the user name.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * If <code>true</code>, the request is real-time as opposed to near-real-time.
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public final Boolean realtime() {
		return this.realtime;
	}

	/**
	 * If <code>true</code>, the request refreshes the relevant shards before
	 * retrieving the document. Setting it to <code>true</code> should be done after
	 * careful thought and verification that this does not cause a heavy load on the
	 * system (and slow down indexing).
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Boolean refresh() {
		return this.refresh;
	}

	/**
	 * A custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	public final List<String> routing() {
		return this.routing;
	}

	/**
	 * A comma-separated list of stored fields to return as part of a hit. If no
	 * fields are specified, no stored fields are included in the response. If this
	 * field is specified, the <code>_source</code> parameter defaults to
	 * <code>false</code>. Only leaf fields can be retrieved with the
	 * <code>stored_fields</code> option. Object fields can't be returned; if
	 * specified, the request fails.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * The version number for concurrency control. It must match the current version
	 * of the document for the request to succeed.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * The version type.
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<GetRequest> {
		@Nullable
		private SourceConfigParam source;

		@Nullable
		private Boolean sourceExcludeVectors;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private Boolean forceSyntheticSource;

		private String id;

		private String index;

		@Nullable
		private String preference;

		@Nullable
		private Boolean realtime;

		@Nullable
		private Boolean refresh;

		@Nullable
		private List<String> routing;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * Indicates whether to return the <code>_source</code> field (<code>true</code>
		 * or <code>false</code>) or lists the fields to return.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfigParam value) {
			this.source = value;
			return this;
		}

		/**
		 * Indicates whether to return the <code>_source</code> field (<code>true</code>
		 * or <code>false</code>) or lists the fields to return.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Function<SourceConfigParam.Builder, ObjectBuilder<SourceConfigParam>> fn) {
			return this.source(fn.apply(new SourceConfigParam.Builder()).build());
		}

		/**
		 * Whether vectors should be excluded from _source
		 * <p>
		 * API name: {@code _source_exclude_vectors}
		 */
		public final Builder sourceExcludeVectors(@Nullable Boolean value) {
			this.sourceExcludeVectors = value;
			return this;
		}

		/**
		 * A comma-separated list of source fields to exclude from the response. You can
		 * also use this parameter to exclude fields from the subset specified in
		 * <code>_source_includes</code> query parameter. If the <code>_source</code>
		 * parameter is <code>false</code>, this parameter is ignored.
		 * <p>
		 * API name: {@code _source_excludes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sourceExcludes</code>.
		 */
		public final Builder sourceExcludes(List<String> list) {
			this.sourceExcludes = _listAddAll(this.sourceExcludes, list);
			return this;
		}

		/**
		 * A comma-separated list of source fields to exclude from the response. You can
		 * also use this parameter to exclude fields from the subset specified in
		 * <code>_source_includes</code> query parameter. If the <code>_source</code>
		 * parameter is <code>false</code>, this parameter is ignored.
		 * <p>
		 * API name: {@code _source_excludes}
		 * <p>
		 * Adds one or more values to <code>sourceExcludes</code>.
		 */
		public final Builder sourceExcludes(String value, String... values) {
			this.sourceExcludes = _listAdd(this.sourceExcludes, value, values);
			return this;
		}

		/**
		 * A comma-separated list of source fields to include in the response. If this
		 * parameter is specified, only these source fields are returned. You can
		 * exclude fields from this subset using the <code>_source_excludes</code> query
		 * parameter. If the <code>_source</code> parameter is <code>false</code>, this
		 * parameter is ignored.
		 * <p>
		 * API name: {@code _source_includes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sourceIncludes</code>.
		 */
		public final Builder sourceIncludes(List<String> list) {
			this.sourceIncludes = _listAddAll(this.sourceIncludes, list);
			return this;
		}

		/**
		 * A comma-separated list of source fields to include in the response. If this
		 * parameter is specified, only these source fields are returned. You can
		 * exclude fields from this subset using the <code>_source_excludes</code> query
		 * parameter. If the <code>_source</code> parameter is <code>false</code>, this
		 * parameter is ignored.
		 * <p>
		 * API name: {@code _source_includes}
		 * <p>
		 * Adds one or more values to <code>sourceIncludes</code>.
		 */
		public final Builder sourceIncludes(String value, String... values) {
			this.sourceIncludes = _listAdd(this.sourceIncludes, value, values);
			return this;
		}

		/**
		 * Indicates whether the request forces synthetic <code>_source</code>. Use this
		 * parameter to test if the mapping supports synthetic <code>_source</code> and
		 * to get a sense of the worst case performance. Fetches with this parameter
		 * enabled will be slower than enabling synthetic source natively in the index.
		 * <p>
		 * API name: {@code force_synthetic_source}
		 */
		public final Builder forceSyntheticSource(@Nullable Boolean value) {
			this.forceSyntheticSource = value;
			return this;
		}

		/**
		 * Required - A unique document identifier.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The name of the index that contains the document.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The node or shard the operation should be performed on. By default, the
		 * operation is randomized between the shard replicas.
		 * <p>
		 * If it is set to <code>_local</code>, the operation will prefer to be run on a
		 * local allocated shard when possible. If it is set to a custom value, the
		 * value is used to guarantee that the same shards will be used for the same
		 * custom value. This can help with &quot;jumping values&quot; when hitting
		 * different shards in different refresh states. A sample value can be something
		 * like the web session ID or the user name.
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request is real-time as opposed to near-real-time.
		 * <p>
		 * API name: {@code realtime}
		 */
		public final Builder realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request refreshes the relevant shards before
		 * retrieving the document. Setting it to <code>true</code> should be done after
		 * careful thought and verification that this does not cause a heavy load on the
		 * system (and slow down indexing).
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * A custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>routing</code>.
		 */
		public final Builder routing(List<String> list) {
			this.routing = _listAddAll(this.routing, list);
			return this;
		}

		/**
		 * A custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds one or more values to <code>routing</code>.
		 */
		public final Builder routing(String value, String... values) {
			this.routing = _listAdd(this.routing, value, values);
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return as part of a hit. If no
		 * fields are specified, no stored fields are included in the response. If this
		 * field is specified, the <code>_source</code> parameter defaults to
		 * <code>false</code>. Only leaf fields can be retrieved with the
		 * <code>stored_fields</code> option. Object fields can't be returned; if
		 * specified, the request fails.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>storedFields</code>.
		 */
		public final Builder storedFields(List<String> list) {
			this.storedFields = _listAddAll(this.storedFields, list);
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return as part of a hit. If no
		 * fields are specified, no stored fields are included in the response. If this
		 * field is specified, the <code>_source</code> parameter defaults to
		 * <code>false</code>. Only leaf fields can be retrieved with the
		 * <code>stored_fields</code> option. Object fields can't be returned; if
		 * specified, the request fails.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds one or more values to <code>storedFields</code>.
		 */
		public final Builder storedFields(String value, String... values) {
			this.storedFields = _listAdd(this.storedFields, value, values);
			return this;
		}

		/**
		 * The version number for concurrency control. It must match the current version
		 * of the document for the request to succeed.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * The version type.
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

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
			_checkSingleUse();

			return new GetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code get}".
	 */
	public static final SimpleEndpoint<GetRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/get",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _id;

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _id;

				if (propsSet == (_index | _id)) {
					params.put("index", request.index);
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.routing)) {
					params.put("routing", request.routing.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.jsonValue());
				}
				if (request.sourceExcludeVectors != null) {
					params.put("_source_exclude_vectors", String.valueOf(request.sourceExcludeVectors));
				}
				if (ApiTypeHelper.isDefined(request.storedFields)) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.source != null) {
					params.put("_source", request.source._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.sourceExcludes)) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.forceSyntheticSource != null) {
					params.put("force_synthetic_source", String.valueOf(request.forceSyntheticSource));
				}
				if (ApiTypeHelper.isDefined(request.sourceIncludes)) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetResponse._DESERIALIZER);

	/**
	 * Create an "{@code get}" endpoint.
	 */
	public static <TDocument> Endpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> createGetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT.withResponseDeserializer(GetResponse.createGetResponseDeserializer(tDocumentDeserializer));
	}
}
