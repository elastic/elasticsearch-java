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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.mget.MultiGetOperation;
import co.elastic.clients.elasticsearch.core.search.SourceConfigParam;
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

// typedef: _global.mget.Request

/**
 * Allows to get multiple documents in one request.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.mget.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MgetRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final SourceConfigParam source;

	private final List<String> sourceExcludes;

	private final List<String> sourceIncludes;

	private final List<MultiGetOperation> docs;

	private final List<String> ids;

	@Nullable
	private final String index;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final String routing;

	private final List<String> storedFields;

	// ---------------------------------------------------------------------------------------------

	private MgetRequest(Builder builder) {

		this.source = builder.source;
		this.sourceExcludes = ApiTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ApiTypeHelper.unmodifiable(builder.sourceIncludes);
		this.docs = ApiTypeHelper.unmodifiable(builder.docs);
		this.ids = ApiTypeHelper.unmodifiable(builder.ids);
		this.index = builder.index;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.storedFields = ApiTypeHelper.unmodifiable(builder.storedFields);

	}

	public static MgetRequest of(Function<Builder, ObjectBuilder<MgetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * True or false to return the <code>_source</code> field or not, or a list of
	 * fields to return.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfigParam source() {
		return this.source;
	}

	/**
	 * A comma-separated list of source fields to exclude from the response. You can
	 * also use this parameter to exclude fields from the subset specified in
	 * <code>_source_includes</code> query parameter.
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
	 * The documents you want to retrieve. Required if no index is specified in the
	 * request URI.
	 * <p>
	 * API name: {@code docs}
	 */
	public final List<MultiGetOperation> docs() {
		return this.docs;
	}

	/**
	 * The IDs of the documents you want to retrieve. Allowed when the index is
	 * specified in the request URI.
	 * <p>
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * Name of the index to retrieve documents from when <code>ids</code> are
	 * specified, or when a document in the <code>docs</code> array does not specify
	 * an index.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Specifies the node or shard the operation should be performed on. Random by
	 * default.
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
	 * If <code>true</code>, the request refreshes relevant shards before retrieving
	 * documents.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Boolean refresh() {
		return this.refresh;
	}

	/**
	 * Custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * If <code>true</code>, retrieves the document fields stored in the index
	 * rather than the document <code>_source</code>.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
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

		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (MultiGetOperation item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MgetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<MgetRequest> {
		@Nullable
		private SourceConfigParam source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private List<MultiGetOperation> docs;

		@Nullable
		private List<String> ids;

		@Nullable
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
		private List<String> storedFields;

		/**
		 * True or false to return the <code>_source</code> field or not, or a list of
		 * fields to return.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfigParam value) {
			this.source = value;
			return this;
		}

		/**
		 * True or false to return the <code>_source</code> field or not, or a list of
		 * fields to return.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Function<SourceConfigParam.Builder, ObjectBuilder<SourceConfigParam>> fn) {
			return this.source(fn.apply(new SourceConfigParam.Builder()).build());
		}

		/**
		 * A comma-separated list of source fields to exclude from the response. You can
		 * also use this parameter to exclude fields from the subset specified in
		 * <code>_source_includes</code> query parameter.
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
		 * <code>_source_includes</code> query parameter.
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
		 * The documents you want to retrieve. Required if no index is specified in the
		 * request URI.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<MultiGetOperation> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * The documents you want to retrieve. Required if no index is specified in the
		 * request URI.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(MultiGetOperation value, MultiGetOperation... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * The documents you want to retrieve. Required if no index is specified in the
		 * request URI.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<MultiGetOperation.Builder, ObjectBuilder<MultiGetOperation>> fn) {
			return docs(fn.apply(new MultiGetOperation.Builder()).build());
		}

		/**
		 * The IDs of the documents you want to retrieve. Allowed when the index is
		 * specified in the request URI.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * The IDs of the documents you want to retrieve. Allowed when the index is
		 * specified in the request URI.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * Name of the index to retrieve documents from when <code>ids</code> are
		 * specified, or when a document in the <code>docs</code> array does not specify
		 * an index.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Specifies the node or shard the operation should be performed on. Random by
		 * default.
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
		 * If <code>true</code>, the request refreshes relevant shards before retrieving
		 * documents.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * If <code>true</code>, retrieves the document fields stored in the index
		 * rather than the document <code>_source</code>.
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
		 * If <code>true</code>, retrieves the document fields stored in the index
		 * rather than the document <code>_source</code>.
		 * <p>
		 * API name: {@code stored_fields}
		 * <p>
		 * Adds one or more values to <code>storedFields</code>.
		 */
		public final Builder storedFields(String value, String... values) {
			this.storedFields = _listAdd(this.storedFields, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MgetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MgetRequest build() {
			_checkSingleUse();

			return new MgetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MgetRequest}
	 */
	public static final JsonpDeserializer<MgetRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MgetRequest::setupMgetRequestDeserializer);

	protected static void setupMgetRequestDeserializer(ObjectDeserializer<MgetRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(MultiGetOperation._DESERIALIZER), "docs");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code mget}".
	 */
	public static final SimpleEndpoint<MgetRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/mget",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_mget");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_mget");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
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
				if (ApiTypeHelper.isDefined(request.sourceIncludes)) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, MgetResponse._DESERIALIZER);

	/**
	 * Create an "{@code mget}" endpoint.
	 */
	public static <TDocument> Endpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> createMgetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT.withResponseDeserializer(MgetResponse.createMgetResponseDeserializer(tDocumentDeserializer));
	}
}
