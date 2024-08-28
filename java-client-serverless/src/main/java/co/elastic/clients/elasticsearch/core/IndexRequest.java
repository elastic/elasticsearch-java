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
import co.elastic.clients.elasticsearch._types.OpType;
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

// typedef: _global.index.Request

/**
 * Index a document. Adds a JSON document to the specified data stream or index
 * and makes it searchable. If the target is an index and the document already
 * exists, the request updates the document and increments its version.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.index.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexRequest<TDocument> extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	private final String index;

	@Nullable
	private final OpType opType;

	@Nullable
	private final String pipeline;

	@Nullable
	private final Refresh refresh;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final String routing;

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

	private IndexRequest(Builder<TDocument> builder) {

		this.id = builder.id;
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.opType = builder.opType;
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.requireAlias = builder.requireAlias;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.document = ApiTypeHelper.requireNonNull(builder.document, this, "document");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> IndexRequest<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Unique identifier for the document.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Only perform the operation if the document has this primary term.
	 * <p>
	 * API name: {@code if_primary_term}
	 */
	@Nullable
	public final Long ifPrimaryTerm() {
		return this.ifPrimaryTerm;
	}

	/**
	 * Only perform the operation if the document has this sequence number.
	 * <p>
	 * API name: {@code if_seq_no}
	 */
	@Nullable
	public final Long ifSeqNo() {
		return this.ifSeqNo;
	}

	/**
	 * Required - Name of the data stream or index to target.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Set to create to only index the document if it does not already exist (put if
	 * absent). If a document with the specified <code>_id</code> already exists,
	 * the indexing operation will fail. Same as using the
	 * <code>&lt;index&gt;/_create</code> endpoint. Valid values:
	 * <code>index</code>, <code>create</code>. If document id is specified, it
	 * defaults to <code>index</code>. Otherwise, it defaults to
	 * <code>create</code>.
	 * <p>
	 * API name: {@code op_type}
	 */
	@Nullable
	public final OpType opType() {
		return this.opType;
	}

	/**
	 * ID of the pipeline to use to preprocess incoming documents. If the index has
	 * a default ingest pipeline specified, then setting the value to
	 * <code>_none</code> disables the default ingest pipeline for this request. If
	 * a final pipeline is configured it will always run, regardless of the value of
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
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> do
	 * nothing with refreshes. Valid values: <code>true</code>, <code>false</code>,
	 * <code>wait_for</code>.
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
	 * Custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Period the request waits for the following operations: automatic index
	 * creation, dynamic mapping updates, waiting for active shards.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Explicit version number for concurrency control. The specified version must
	 * match the current version of the document for the request to succeed.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * Specific version type: <code>external</code>, <code>external_gte</code>.
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set to all or any positive integer up to the total number of
	 * shards in the index (<code>number_of_replicas+1</code>).
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
	 * Builder for {@link IndexRequest}.
	 */

	public static class Builder<TDocument> extends RequestBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<IndexRequest<TDocument>> {
		@Nullable
		private String id;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		private String index;

		@Nullable
		private OpType opType;

		@Nullable
		private String pipeline;

		@Nullable
		private Refresh refresh;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private String routing;

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
		 * Unique identifier for the document.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder<TDocument> id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this primary term.
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder<TDocument> ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this sequence number.
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder<TDocument> ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * Required - Name of the data stream or index to target.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Set to create to only index the document if it does not already exist (put if
		 * absent). If a document with the specified <code>_id</code> already exists,
		 * the indexing operation will fail. Same as using the
		 * <code>&lt;index&gt;/_create</code> endpoint. Valid values:
		 * <code>index</code>, <code>create</code>. If document id is specified, it
		 * defaults to <code>index</code>. Otherwise, it defaults to
		 * <code>create</code>.
		 * <p>
		 * API name: {@code op_type}
		 */
		public final Builder<TDocument> opType(@Nullable OpType value) {
			this.opType = value;
			return this;
		}

		/**
		 * ID of the pipeline to use to preprocess incoming documents. If the index has
		 * a default ingest pipeline specified, then setting the value to
		 * <code>_none</code> disables the default ingest pipeline for this request. If
		 * a final pipeline is configured it will always run, regardless of the value of
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
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> do
		 * nothing with refreshes. Valid values: <code>true</code>, <code>false</code>,
		 * <code>wait_for</code>.
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
		 * Custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Period the request waits for the following operations: automatic index
		 * creation, dynamic mapping updates, waiting for active shards.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument> timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period the request waits for the following operations: automatic index
		 * creation, dynamic mapping updates, waiting for active shards.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder<TDocument> timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Explicit version number for concurrency control. The specified version must
		 * match the current version of the document for the request to succeed.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Specific version type: <code>external</code>, <code>external_gte</code>.
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder<TDocument> versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to all or any positive integer up to the total number of
		 * shards in the index (<code>number_of_replicas+1</code>).
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder<TDocument> waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to all or any positive integer up to the total number of
		 * shards in the index (<code>number_of_replicas+1</code>).
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
		 * Builds a {@link IndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRequest<TDocument> build() {
			_checkSingleUse();

			return new IndexRequest<TDocument>(this);
		}
	}

	/**
	 * Json deserializer for {@link IndexRequest} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<IndexRequest<Object>> _DESERIALIZER = createIndexRequestDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.index.Request.TDocument"));

	public static <TDocument> JsonpDeserializer<IndexRequest<TDocument>> createIndexRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		JsonpDeserializer<TDocument> valueDeserializer = tDocumentDeserializer;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper, event) -> new Builder<TDocument>()
						.document(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code index}".
	 */
	public static final Endpoint<IndexRequest<?>, IndexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/index",

			// Request method
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_index | _id))
					return "PUT";
				if (propsSet == (_index))
					return "POST";
				throw SimpleEndpoint.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				if (request.id() != null)
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
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_doc");
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
				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_index | _id)) {
					params.put("index", request.index);
					params.put("id", request.id);
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.jsonValue());
				}
				if (request.ifPrimaryTerm != null) {
					params.put("if_primary_term", String.valueOf(request.ifPrimaryTerm));
				}
				if (request.ifSeqNo != null) {
					params.put("if_seq_no", String.valueOf(request.ifSeqNo));
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.opType != null) {
					params.put("op_type", request.opType.jsonValue());
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), r -> r.document(), IndexResponse._DESERIALIZER);
}
