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
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
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

// typedef: _global.create.Request

/**
 * Create a new document in the index.
 * <p>
 * You can index a new JSON document with the <code>/&lt;target&gt;/_doc/</code>
 * or <code>/&lt;target&gt;/_create/&lt;_id&gt;</code> APIs Using
 * <code>_create</code> guarantees that the document is indexed only if it does
 * not already exist. It returns a 409 response when a document with a same ID
 * already exists in the index. To update an existing document, you must use the
 * <code>/&lt;target&gt;/_doc/</code> API.
 * <p>
 * If the Elasticsearch security features are enabled, you must have the
 * following index privileges for the target data stream, index, or index alias:
 * <ul>
 * <li>To add a document using the
 * <code>PUT /&lt;target&gt;/_create/&lt;_id&gt;</code> or
 * <code>POST /&lt;target&gt;/_create/&lt;_id&gt;</code> request formats, you
 * must have the <code>create_doc</code>, <code>create</code>,
 * <code>index</code>, or <code>write</code> index privilege.</li>
 * <li>To automatically create a data stream or index with this API request, you
 * must have the <code>auto_configure</code>, <code>create_index</code>, or
 * <code>manage</code> index privilege.</li>
 * </ul>
 * <p>
 * Automatic data stream creation requires a matching index template with data
 * stream enabled.
 * <p>
 * <strong>Automatically create data streams and indices</strong>
 * <p>
 * If the request's target doesn't exist and matches an index template with a
 * <code>data_stream</code> definition, the index operation automatically
 * creates the data stream.
 * <p>
 * If the target doesn't exist and doesn't match a data stream template, the
 * operation automatically creates the index and applies any matching index
 * templates.
 * <p>
 * NOTE: Elasticsearch includes several built-in index templates. To avoid
 * naming collisions with these templates, refer to index pattern documentation.
 * <p>
 * If no mapping exists, the index operation creates a dynamic mapping. By
 * default, new fields and objects are automatically added to the mapping if
 * needed.
 * <p>
 * Automatic index creation is controlled by the
 * <code>action.auto_create_index</code> setting. If it is <code>true</code>,
 * any index can be created automatically. You can modify this setting to
 * explicitly allow or block automatic creation of indices that match specified
 * patterns or set it to <code>false</code> to turn off automatic index creation
 * entirely. Specify a comma-separated list of patterns you want to allow or
 * prefix each pattern with <code>+</code> or <code>-</code> to indicate whether
 * it should be allowed or blocked. When a list is specified, the default
 * behaviour is to disallow.
 * <p>
 * NOTE: The <code>action.auto_create_index</code> setting affects the automatic
 * creation of indices only. It does not affect the creation of data streams.
 * <p>
 * <strong>Routing</strong>
 * <p>
 * By default, shard placement — or routing — is controlled by using a hash of
 * the document's ID value. For more explicit control, the value fed into the
 * hash function used by the router can be directly specified on a per-operation
 * basis using the <code>routing</code> parameter.
 * <p>
 * When setting up explicit mapping, you can also use the <code>_routing</code>
 * field to direct the index operation to extract the routing value from the
 * document itself. This does come at the (very minimal) cost of an additional
 * document parsing pass. If the <code>_routing</code> mapping is defined and
 * set to be required, the index operation will fail if no routing value is
 * provided or extracted.
 * <p>
 * NOTE: Data streams do not support custom routing unless they were created
 * with the <code>allow_custom_routing</code> setting enabled in the template.
 * <p>
 * <strong>Distributed</strong>
 * <p>
 * The index operation is directed to the primary shard based on its route and
 * performed on the actual node containing this shard. After the primary shard
 * completes the operation, if needed, the update is distributed to applicable
 * replicas.
 * <p>
 * <strong>Active shards</strong>
 * <p>
 * To improve the resiliency of writes to the system, indexing operations can be
 * configured to wait for a certain number of active shard copies before
 * proceeding with the operation. If the requisite number of active shard copies
 * are not available, then the write operation must wait and retry, until either
 * the requisite shard copies have started or a timeout occurs. By default,
 * write operations only wait for the primary shards to be active before
 * proceeding (that is to say <code>wait_for_active_shards</code> is
 * <code>1</code>). This default can be overridden in the index settings
 * dynamically by setting <code>index.write.wait_for_active_shards</code>. To
 * alter this behavior per operation, use the
 * <code>wait_for_active_shards request</code> parameter.
 * <p>
 * Valid values are all or any positive integer up to the total number of
 * configured copies per shard in the index (which is
 * <code>number_of_replicas</code>+1). Specifying a negative value or a number
 * greater than the number of shard copies will throw an error.
 * <p>
 * For example, suppose you have a cluster of three nodes, A, B, and C and you
 * create an index index with the number of replicas set to 3 (resulting in 4
 * shard copies, one more copy than there are nodes). If you attempt an indexing
 * operation, by default the operation will only ensure the primary copy of each
 * shard is available before proceeding. This means that even if B and C went
 * down and A hosted the primary shard copies, the indexing operation would
 * still proceed with only one copy of the data. If
 * <code>wait_for_active_shards</code> is set on the request to <code>3</code>
 * (and all three nodes are up), the indexing operation will require 3 active
 * shard copies before proceeding. This requirement should be met because there
 * are 3 active nodes in the cluster, each one holding a copy of the shard.
 * However, if you set <code>wait_for_active_shards</code> to <code>all</code>
 * (or to <code>4</code>, which is the same in this situation), the indexing
 * operation will not proceed as you do not have all 4 copies of each shard
 * active in the index. The operation will timeout unless a new node is brought
 * up in the cluster to host the fourth copy of the shard.
 * <p>
 * It is important to note that this setting greatly reduces the chances of the
 * write operation not writing to the requisite number of shard copies, but it
 * does not completely eliminate the possibility, because this check occurs
 * before the write operation starts. After the write operation is underway, it
 * is still possible for replication to fail on any number of shard copies but
 * still succeed on the primary. The <code>_shards</code> section of the API
 * response reveals the number of shard copies on which replication succeeded
 * and failed.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.create.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateRequest<TDocument> extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final Boolean includeSourceOnError;

	private final String index;

	@Nullable
	private final String pipeline;

	@Nullable
	private final Refresh refresh;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Boolean requireDataStream;

	private final List<String> routing;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	private final TDocument document;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private CreateRequest(Builder<TDocument> builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.includeSourceOnError = builder.includeSourceOnError;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.requireAlias = builder.requireAlias;
		this.requireDataStream = builder.requireDataStream;
		this.routing = ApiTypeHelper.unmodifiable(builder.routing);
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.document = ApiTypeHelper.requireNonNull(builder.document, this, "document");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> CreateRequest<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<CreateRequest<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - A unique identifier for the document. To automatically generate a
	 * document ID, use the <code>POST /&lt;target&gt;/_doc/</code> request format.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * True or false if to include the document source in the error message in case
	 * of parsing errors.
	 * <p>
	 * API name: {@code include_source_on_error}
	 */
	@Nullable
	public final Boolean includeSourceOnError() {
		return this.includeSourceOnError;
	}

	/**
	 * Required - The name of the data stream or index to target. If the target
	 * doesn't exist and matches the name or wildcard (<code>*</code>) pattern of an
	 * index template with a <code>data_stream</code> definition, this request
	 * creates the data stream. If the target doesn't exist and doesn’t match a data
	 * stream template, this request creates the index.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * The ID of the pipeline to use to preprocess incoming documents. If the index
	 * has a default ingest pipeline specified, setting the value to
	 * <code>_none</code> turns off the default ingest pipeline for this request. If
	 * a final pipeline is configured, it will always run regardless of the value of
	 * this parameter.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code>, Elasticsearch refreshes the affected shards to make
	 * this operation visible to search. If <code>wait_for</code>, it waits for a
	 * refresh to make this operation visible to search. If <code>false</code>, it
	 * does nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * If <code>true</code>, the destination must be an index alias.
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * If <code>true</code>, the request's actions must target a data stream
	 * (existing or to be created).
	 * <p>
	 * API name: {@code require_data_stream}
	 */
	@Nullable
	public final Boolean requireDataStream() {
		return this.requireDataStream;
	}

	/**
	 * A custom value that is used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	public final List<String> routing() {
		return this.routing;
	}

	/**
	 * The period the request waits for the following operations: automatic index
	 * creation, dynamic mapping updates, waiting for active shards. Elasticsearch
	 * waits for at least the specified timeout period before failing. The actual
	 * wait time could be longer, particularly when multiple waits occur.
	 * <p>
	 * This parameter is useful for situations where the primary shard assigned to
	 * perform the operation might not be available when the operation runs. Some
	 * reasons for this might be that the primary shard is currently recovering from
	 * a gateway or undergoing relocation. By default, the operation will wait on
	 * the primary shard to become available for at least 1 minute before failing
	 * and responding with an error. The actual wait time could be longer,
	 * particularly when multiple waits occur.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The explicit version number for concurrency control. It must be a
	 * non-negative long number.
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

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. You can set it to <code>all</code> or any positive integer up to
	 * the total number of shards in the index (<code>number_of_replicas+1</code>).
	 * The default value of <code>1</code> means it waits for each primary shard to
	 * be active.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Required - Request body.
	 */
	public final TDocument document() {
		return this.document;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		JsonpUtils.serialize(this.document, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateRequest}.
	 */

	public static class Builder<TDocument> extends RequestBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<CreateRequest<TDocument>> {
		private String id;

		@Nullable
		private Boolean includeSourceOnError;

		private String index;

		@Nullable
		private String pipeline;

		@Nullable
		private Refresh refresh;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Boolean requireDataStream;

		@Nullable
		private List<String> routing;

		@Nullable
		private Time timeout;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		private TDocument document;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - A unique identifier for the document. To automatically generate a
		 * document ID, use the <code>POST /&lt;target&gt;/_doc/</code> request format.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * True or false if to include the document source in the error message in case
		 * of parsing errors.
		 * <p>
		 * API name: {@code include_source_on_error}
		 */
		public final Builder<TDocument> includeSourceOnError(@Nullable Boolean value) {
			this.includeSourceOnError = value;
			return this;
		}

		/**
		 * Required - The name of the data stream or index to target. If the target
		 * doesn't exist and matches the name or wildcard (<code>*</code>) pattern of an
		 * index template with a <code>data_stream</code> definition, this request
		 * creates the data stream. If the target doesn't exist and doesn’t match a data
		 * stream template, this request creates the index.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The ID of the pipeline to use to preprocess incoming documents. If the index
		 * has a default ingest pipeline specified, setting the value to
		 * <code>_none</code> turns off the default ingest pipeline for this request. If
		 * a final pipeline is configured, it will always run regardless of the value of
		 * this parameter.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder<TDocument> pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * If <code>true</code>, Elasticsearch refreshes the affected shards to make
		 * this operation visible to search. If <code>wait_for</code>, it waits for a
		 * refresh to make this operation visible to search. If <code>false</code>, it
		 * does nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder<TDocument> refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * If <code>true</code>, the destination must be an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final Builder<TDocument> requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request's actions must target a data stream
		 * (existing or to be created).
		 * <p>
		 * API name: {@code require_data_stream}
		 */
		public final Builder<TDocument> requireDataStream(@Nullable Boolean value) {
			this.requireDataStream = value;
			return this;
		}

		/**
		 * A custom value that is used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>routing</code>.
		 */
		public final Builder<TDocument> routing(List<String> list) {
			this.routing = _listAddAll(this.routing, list);
			return this;
		}

		/**
		 * A custom value that is used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 * <p>
		 * Adds one or more values to <code>routing</code>.
		 */
		public final Builder<TDocument> routing(String value, String... values) {
			this.routing = _listAdd(this.routing, value, values);
			return this;
		}

		/**
		 * The period the request waits for the following operations: automatic index
		 * creation, dynamic mapping updates, waiting for active shards. Elasticsearch
		 * waits for at least the specified timeout period before failing. The actual
		 * wait time could be longer, particularly when multiple waits occur.
		 * <p>
		 * This parameter is useful for situations where the primary shard assigned to
		 * perform the operation might not be available when the operation runs. Some
		 * reasons for this might be that the primary shard is currently recovering from
		 * a gateway or undergoing relocation. By default, the operation will wait on
		 * the primary shard to become available for at least 1 minute before failing
		 * and responding with an error. The actual wait time could be longer,
		 * particularly when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument> timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period the request waits for the following operations: automatic index
		 * creation, dynamic mapping updates, waiting for active shards. Elasticsearch
		 * waits for at least the specified timeout period before failing. The actual
		 * wait time could be longer, particularly when multiple waits occur.
		 * <p>
		 * This parameter is useful for situations where the primary shard assigned to
		 * perform the operation might not be available when the operation runs. Some
		 * reasons for this might be that the primary shard is currently recovering from
		 * a gateway or undergoing relocation. By default, the operation will wait on
		 * the primary shard to become available for at least 1 minute before failing
		 * and responding with an error. The actual wait time could be longer,
		 * particularly when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument> timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The explicit version number for concurrency control. It must be a
		 * non-negative long number.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * The version type.
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder<TDocument> versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. You can set it to <code>all</code> or any positive integer up to
		 * the total number of shards in the index (<code>number_of_replicas+1</code>).
		 * The default value of <code>1</code> means it waits for each primary shard to
		 * be active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder<TDocument> waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. You can set it to <code>all</code> or any positive integer up to
		 * the total number of shards in the index (<code>number_of_replicas+1</code>).
		 * The default value of <code>1</code> means it waits for each primary shard to
		 * be active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder<TDocument> waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		/**
		 * Required - Request body.
		 */
		public final Builder<TDocument> document(TDocument value) {
			this.document = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		public Builder<TDocument> withJson(JsonParser parser, JsonpMapper mapper) {
			JsonpDeserializer<JsonData> tDocumentDeserializer = JsonData._DESERIALIZER;

			@SuppressWarnings("unchecked")
			TDocument value = (TDocument) tDocumentDeserializer.deserialize(parser, mapper);
			return this.document(value);
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link CreateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateRequest<TDocument> build() {
			_checkSingleUse();

			return new CreateRequest<TDocument>(this);
		}
	}

	/**
	 * Json deserializer for {@link CreateRequest} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<CreateRequest<Object>> _DESERIALIZER = createCreateRequestDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.create.Request.TDocument"));

	public static <TDocument> JsonpDeserializer<CreateRequest<TDocument>> createCreateRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		JsonpDeserializer<TDocument> valueDeserializer = tDocumentDeserializer;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper, event) -> new Builder<TDocument>()
						.document(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code create}".
	 */
	public static final Endpoint<CreateRequest<?>, CreateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/create",

			// Request method
			request -> {
				return "PUT";

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
					buf.append("/_create");
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
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (ApiTypeHelper.isDefined(request.routing)) {
					params.put("routing", request.routing.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeSourceOnError != null) {
					params.put("include_source_on_error", String.valueOf(request.includeSourceOnError));
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.jsonValue());
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.requireDataStream != null) {
					params.put("require_data_stream", String.valueOf(request.requireDataStream));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), r -> r.document(), CreateResponse._DESERIALIZER);
}
