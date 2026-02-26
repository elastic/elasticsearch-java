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

// typedef: _global.delete.Request

/**
 * Delete a document.
 * <p>
 * Remove a JSON document from the specified index.
 * <p>
 * NOTE: You cannot send deletion requests directly to a data stream. To delete
 * a document in a data stream, you must target the backing index containing the
 * document.
 * <p>
 * <strong>Optimistic concurrency control</strong>
 * <p>
 * Delete operations can be made conditional and only be performed if the last
 * modification to the document was assigned the sequence number and primary
 * term specified by the <code>if_seq_no</code> and <code>if_primary_term</code>
 * parameters. If a mismatch is detected, the operation will result in a
 * <code>VersionConflictException</code> and a status code of <code>409</code>.
 * <p>
 * <strong>Versioning</strong>
 * <p>
 * Each document indexed is versioned. When deleting a document, the version can
 * be specified to make sure the relevant document you are trying to delete is
 * actually being deleted and it has not changed in the meantime. Every write
 * operation run on a document, deletes included, causes its version to be
 * incremented. The version number of a deleted document remains available for a
 * short time after deletion to allow for control of concurrent operations. The
 * length of time for which a deleted document's version remains available is
 * determined by the <code>index.gc_deletes</code> index setting.
 * <p>
 * <strong>Routing</strong>
 * <p>
 * If routing is used during indexing, the routing value also needs to be
 * specified to delete a document.
 * <p>
 * If the <code>_routing</code> mapping is set to <code>required</code> and no
 * routing value is specified, the delete API throws a
 * <code>RoutingMissingException</code> and rejects the request.
 * <p>
 * For example:
 * 
 * <pre>
 * <code>DELETE /my-index-000001/_doc/1?routing=shard-1
 * </code>
 * </pre>
 * <p>
 * This request deletes the document with ID 1, but it is routed based on the
 * user. The document is not deleted if the correct routing is not specified.
 * <p>
 * <strong>Distributed</strong>
 * <p>
 * The delete operation gets hashed into a specific shard ID. It then gets
 * redirected into the primary shard within that ID group and replicated (if
 * needed) to shard replicas within that ID group.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.delete.Request">API
 *      specification</a>
 */

public class DeleteRequest extends RequestBase {
	private final String id;

	@Nullable
	private final Long ifPrimaryTerm;

	@Nullable
	private final Long ifSeqNo;

	private final String index;

	@Nullable
	private final Refresh refresh;

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

	// ---------------------------------------------------------------------------------------------

	private DeleteRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.ifPrimaryTerm = builder.ifPrimaryTerm;
		this.ifSeqNo = builder.ifSeqNo;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public static DeleteRequest of(Function<Builder, ObjectBuilder<DeleteRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A unique identifier for the document.
	 * <p>
	 * API name: {@code id}
	 */
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
	 * Required - The name of the target index.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
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
	 * A custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * The period to wait for active shards.
	 * <p>
	 * This parameter is useful for situations where the primary shard assigned to
	 * perform the delete operation might not be available when the delete operation
	 * runs. Some reasons for this might be that the primary shard is currently
	 * recovering from a store or undergoing relocation. By default, the delete
	 * operation will wait on the primary shard to become available for up to 1
	 * minute before failing and responding with an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * An explicit version number for concurrency control. It must match the current
	 * version of the document for the request to succeed.
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
	 * The minimum number of shard copies that must be active before proceeding with
	 * the operation. You can set it to <code>all</code> or any positive integer up
	 * to the total number of shards in the index
	 * (<code>number_of_replicas+1</code>). The default value of <code>1</code>
	 * means it waits for each primary shard to be active.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<DeleteRequest> {
		private String id;

		@Nullable
		private Long ifPrimaryTerm;

		@Nullable
		private Long ifSeqNo;

		private String index;

		@Nullable
		private Refresh refresh;

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

		public Builder() {
		}
		private Builder(DeleteRequest instance) {
			this.id = instance.id;
			this.ifPrimaryTerm = instance.ifPrimaryTerm;
			this.ifSeqNo = instance.ifSeqNo;
			this.index = instance.index;
			this.refresh = instance.refresh;
			this.routing = instance.routing;
			this.timeout = instance.timeout;
			this.version = instance.version;
			this.versionType = instance.versionType;
			this.waitForActiveShards = instance.waitForActiveShards;

		}
		/**
		 * Required - A unique identifier for the document.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this primary term.
		 * <p>
		 * API name: {@code if_primary_term}
		 */
		public final Builder ifPrimaryTerm(@Nullable Long value) {
			this.ifPrimaryTerm = value;
			return this;
		}

		/**
		 * Only perform the operation if the document has this sequence number.
		 * <p>
		 * API name: {@code if_seq_no}
		 */
		public final Builder ifSeqNo(@Nullable Long value) {
			this.ifSeqNo = value;
			return this;
		}

		/**
		 * Required - The name of the target index.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
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
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * A custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * The period to wait for active shards.
		 * <p>
		 * This parameter is useful for situations where the primary shard assigned to
		 * perform the delete operation might not be available when the delete operation
		 * runs. Some reasons for this might be that the primary shard is currently
		 * recovering from a store or undergoing relocation. By default, the delete
		 * operation will wait on the primary shard to become available for up to 1
		 * minute before failing and responding with an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for active shards.
		 * <p>
		 * This parameter is useful for situations where the primary shard assigned to
		 * perform the delete operation might not be available when the delete operation
		 * runs. Some reasons for this might be that the primary shard is currently
		 * recovering from a store or undergoing relocation. By default, the delete
		 * operation will wait on the primary shard to become available for up to 1
		 * minute before failing and responding with an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * An explicit version number for concurrency control. It must match the current
		 * version of the document for the request to succeed.
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

		/**
		 * The minimum number of shard copies that must be active before proceeding with
		 * the operation. You can set it to <code>all</code> or any positive integer up
		 * to the total number of shards in the index
		 * (<code>number_of_replicas+1</code>). The default value of <code>1</code>
		 * means it waits for each primary shard to be active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The minimum number of shard copies that must be active before proceeding with
		 * the operation. You can set it to <code>all</code> or any positive integer up
		 * to the total number of shards in the index
		 * (<code>number_of_replicas+1</code>). The default value of <code>1</code>
		 * means it waits for each primary shard to be active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRequest build() {
			_checkSingleUse();

			return new DeleteRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code delete}".
	 */
	public static final Endpoint<DeleteRequest, DeleteResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/delete",

			// Request method
			request -> {
				return "DELETE";

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
				if (request.routing != null) {
					params.put("routing", request.routing);
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
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteResponse._DESERIALIZER);
}
