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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
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

// typedef: indices.forcemerge.Request

/**
 * Force a merge. Perform the force merge operation on the shards of one or more
 * indices. For data streams, the API forces a merge on the shards of the
 * stream's backing indices.
 * <p>
 * Merging reduces the number of segments in each shard by merging some of them
 * together and also frees up the space used by deleted documents. Merging
 * normally happens automatically, but sometimes it is useful to trigger a merge
 * manually.
 * <p>
 * WARNING: We recommend force merging only a read-only index (meaning the index
 * is no longer receiving writes). When documents are updated or deleted, the
 * old version is not immediately removed but instead soft-deleted and marked
 * with a &quot;tombstone&quot;. These soft-deleted documents are automatically
 * cleaned up during regular segment merges. But force merge can cause very
 * large (greater than 5 GB) segments to be produced, which are not eligible for
 * regular merges. So the number of soft-deleted documents can then grow
 * rapidly, resulting in higher disk usage and worse search performance. If you
 * regularly force merge an index receiving writes, this can also make snapshots
 * more expensive, since the new documents can't be backed up incrementally.
 * <p>
 * <strong>Blocks during a force merge</strong>
 * <p>
 * Calls to this API block until the merge is complete (unless request contains
 * <code>wait_for_completion=false</code>). If the client connection is lost
 * before completion then the force merge process will continue in the
 * background. Any new requests to force merge the same indices will also block
 * until the ongoing force merge is complete.
 * <p>
 * <strong>Running force merge asynchronously</strong>
 * <p>
 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
 * performs some preflight checks, launches the request, and returns a task you
 * can use to get the status of the task. However, you can not cancel this task
 * as the force merge task is not cancelable. Elasticsearch creates a record of
 * this task as a document at <code>_tasks/&lt;task_id&gt;</code>. When you are
 * done with a task, you should delete the task document so Elasticsearch can
 * reclaim the space.
 * <p>
 * <strong>Force merging multiple indices</strong>
 * <p>
 * You can force merge multiple indices with a single request by targeting:
 * <ul>
 * <li>One or more data streams that contain multiple backing indices</li>
 * <li>Multiple indices</li>
 * <li>One or more aliases</li>
 * <li>All data streams and indices in a cluster</li>
 * </ul>
 * <p>
 * Each targeted shard is force-merged separately using the force_merge
 * threadpool. By default each node only has a single <code>force_merge</code>
 * thread which means that the shards on that node are force-merged one at a
 * time. If you expand the <code>force_merge</code> threadpool on a node then it
 * will force merge its shards in parallel
 * <p>
 * Force merge makes the storage for the shard being merged temporarily
 * increase, as it may require free space up to triple its size in case
 * <code>max_num_segments parameter</code> is set to <code>1</code>, to rewrite
 * all segments into a new one.
 * <p>
 * <strong>Data streams and time-based indices</strong>
 * <p>
 * Force-merging is useful for managing a data stream's older backing indices
 * and other time-based indices, particularly after a rollover. In these cases,
 * each index only receives indexing traffic for a certain period of time. Once
 * an index receive no more writes, its shards can be force-merged to a single
 * segment. This can be a good idea because single-segment shards can sometimes
 * use simpler and more efficient data structures to perform searches. For
 * example:
 * 
 * <pre>
 * <code>POST /.ds-my-data-stream-2099.03.07-000001/_forcemerge?max_num_segments=1
 * </code>
 * </pre>
 *
 * @see <a href="../doc-files/api-spec.html#indices.forcemerge.Request">API
 *      specification</a>
 */

public class ForcemergeRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean flush;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Long maxNumSegments;

	@Nullable
	private final Boolean onlyExpungeDeletes;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private ForcemergeRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.flush = builder.flush;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.maxNumSegments = builder.maxNumSegments;
		this.onlyExpungeDeletes = builder.onlyExpungeDeletes;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static ForcemergeRequest of(Function<Builder, ObjectBuilder<ForcemergeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Specify whether the index should be flushed after performing the operation
	 * (default: true)
	 * <p>
	 * API name: {@code flush}
	 */
	@Nullable
	public final Boolean flush() {
		return this.flush;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * A comma-separated list of index names; use <code>_all</code> or empty string
	 * to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * The number of segments the index should be merged into (default: dynamic)
	 * <p>
	 * API name: {@code max_num_segments}
	 */
	@Nullable
	public final Long maxNumSegments() {
		return this.maxNumSegments;
	}

	/**
	 * Specify whether the operation should only expunge deleted documents
	 * <p>
	 * API name: {@code only_expunge_deletes}
	 */
	@Nullable
	public final Boolean onlyExpungeDeletes() {
		return this.onlyExpungeDeletes;
	}

	/**
	 * Should the request wait until the force merge is completed.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForcemergeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ForcemergeRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean flush;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Long maxNumSegments;

		@Nullable
		private Boolean onlyExpungeDeletes;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * Specify whether the index should be flushed after performing the operation
		 * (default: true)
		 * <p>
		 * API name: {@code flush}
		 */
		public final Builder flush(@Nullable Boolean value) {
			this.flush = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
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
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
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
		 * The number of segments the index should be merged into (default: dynamic)
		 * <p>
		 * API name: {@code max_num_segments}
		 */
		public final Builder maxNumSegments(@Nullable Long value) {
			this.maxNumSegments = value;
			return this;
		}

		/**
		 * Specify whether the operation should only expunge deleted documents
		 * <p>
		 * API name: {@code only_expunge_deletes}
		 */
		public final Builder onlyExpungeDeletes(@Nullable Boolean value) {
			this.onlyExpungeDeletes = value;
			return this;
		}

		/**
		 * Should the request wait until the force merge is completed.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForcemergeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForcemergeRequest build() {
			_checkSingleUse();

			return new ForcemergeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.forcemerge}".
	 */
	public static final Endpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.forcemerge",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_forcemerge");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_forcemerge");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.flush != null) {
					params.put("flush", String.valueOf(request.flush));
				}
				if (request.onlyExpungeDeletes != null) {
					params.put("only_expunge_deletes", String.valueOf(request.onlyExpungeDeletes));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.maxNumSegments != null) {
					params.put("max_num_segments", String.valueOf(request.maxNumSegments));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ForcemergeResponse._DESERIALIZER);
}
