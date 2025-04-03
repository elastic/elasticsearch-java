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

import co.elastic.clients.elasticsearch._types.Conflicts;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.Slices;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.core.reindex.Source;
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
import java.lang.Float;
import java.lang.Long;
import java.util.Collections;
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

// typedef: _global.reindex.Request

/**
 * Reindex documents.
 * <p>
 * Copy documents from a source to a destination. You can copy all documents to
 * the destination index or reindex a subset of the documents. The source can be
 * any existing index, alias, or data stream. The destination must differ from
 * the source. For example, you cannot reindex a data stream into itself.
 * <p>
 * IMPORTANT: Reindex requires <code>_source</code> to be enabled for all
 * documents in the source. The destination should be configured as wanted
 * before calling the reindex API. Reindex does not copy the settings from the
 * source or its associated template. Mappings, shard counts, and replicas, for
 * example, must be configured ahead of time.
 * <p>
 * If the Elasticsearch security features are enabled, you must have the
 * following security privileges:
 * <ul>
 * <li>The <code>read</code> index privilege for the source data stream, index,
 * or alias.</li>
 * <li>The <code>write</code> index privilege for the destination data stream,
 * index, or index alias.</li>
 * <li>To automatically create a data stream or index with a reindex API
 * request, you must have the <code>auto_configure</code>,
 * <code>create_index</code>, or <code>manage</code> index privilege for the
 * destination data stream, index, or alias.</li>
 * <li>If reindexing from a remote cluster, the <code>source.remote.user</code>
 * must have the <code>monitor</code> cluster privilege and the
 * <code>read</code> index privilege for the source data stream, index, or
 * alias.</li>
 * </ul>
 * <p>
 * If reindexing from a remote cluster, you must explicitly allow the remote
 * host in the <code>reindex.remote.whitelist</code> setting. Automatic data
 * stream creation requires a matching index template with data stream enabled.
 * <p>
 * The <code>dest</code> element can be configured like the index API to control
 * optimistic concurrency control. Omitting <code>version_type</code> or setting
 * it to <code>internal</code> causes Elasticsearch to blindly dump documents
 * into the destination, overwriting any that happen to have the same ID.
 * <p>
 * Setting <code>version_type</code> to <code>external</code> causes
 * Elasticsearch to preserve the <code>version</code> from the source, create
 * any documents that are missing, and update any documents that have an older
 * version in the destination than they do in the source.
 * <p>
 * Setting <code>op_type</code> to <code>create</code> causes the reindex API to
 * create only missing documents in the destination. All existing documents will
 * cause a version conflict.
 * <p>
 * IMPORTANT: Because data streams are append-only, any reindex request to a
 * destination data stream must have an <code>op_type</code> of
 * <code>create</code>. A reindex can only add new documents to a destination
 * data stream. It cannot update existing documents in a destination data
 * stream.
 * <p>
 * By default, version conflicts abort the reindex process. To continue
 * reindexing if there are conflicts, set the <code>conflicts</code> request
 * body property to <code>proceed</code>. In this case, the response includes a
 * count of the version conflicts that were encountered. Note that the handling
 * of other error types is unaffected by the <code>conflicts</code> property.
 * Additionally, if you opt to count version conflicts, the operation could
 * attempt to reindex more documents from the source than <code>max_docs</code>
 * until it has successfully indexed <code>max_docs</code> documents into the
 * target or it has gone through every document in the source query.
 * <p>
 * NOTE: The reindex API makes no effort to handle ID collisions. The last
 * document written will &quot;win&quot; but the order isn't usually predictable
 * so it is not a good idea to rely on this behavior. Instead, make sure that
 * IDs are unique by using a script.
 * <p>
 * <strong>Running reindex asynchronously</strong>
 * <p>
 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
 * performs some preflight checks, launches the request, and returns a task you
 * can use to cancel or get the status of the task. Elasticsearch creates a
 * record of this task as a document at <code>_tasks/&lt;task_id&gt;</code>.
 * <p>
 * <strong>Reindex from multiple sources</strong>
 * <p>
 * If you have many sources to reindex it is generally better to reindex them
 * one at a time rather than using a glob pattern to pick up multiple sources.
 * That way you can resume the process if there are any errors by removing the
 * partially completed source and starting over. It also makes parallelizing the
 * process fairly simple: split the list of sources to reindex and run each list
 * in parallel.
 * <p>
 * For example, you can use a bash script like this:
 * 
 * <pre>
 * <code>for index in i1 i2 i3 i4 i5; do
 *   curl -HContent-Type:application/json -XPOST localhost:9200/_reindex?pretty -d'{
 *     &quot;source&quot;: {
 *       &quot;index&quot;: &quot;'$index'&quot;
 *     },
 *     &quot;dest&quot;: {
 *       &quot;index&quot;: &quot;'$index'-reindexed&quot;
 *     }
 *   }'
 * done
 * </code>
 * </pre>
 * <p>
 * <strong>Throttling</strong>
 * <p>
 * Set <code>requests_per_second</code> to any positive decimal number
 * (<code>1.4</code>, <code>6</code>, <code>1000</code>, for example) to
 * throttle the rate at which reindex issues batches of index operations.
 * Requests are throttled by padding each batch with a wait time. To turn off
 * throttling, set <code>requests_per_second</code> to <code>-1</code>.
 * <p>
 * The throttling is done by waiting between batches so that the scroll that
 * reindex uses internally can be given a timeout that takes into account the
 * padding. The padding time is the difference between the batch size divided by
 * the <code>requests_per_second</code> and the time spent writing. By default
 * the batch size is <code>1000</code>, so if <code>requests_per_second</code>
 * is set to <code>500</code>:
 * 
 * <pre>
 * <code>target_time = 1000 / 500 per second = 2 seconds
 * wait_time = target_time - write_time = 2 seconds - .5 seconds = 1.5 seconds
 * </code>
 * </pre>
 * <p>
 * Since the batch is issued as a single bulk request, large batch sizes cause
 * Elasticsearch to create many requests and then wait for a while before
 * starting the next set. This is &quot;bursty&quot; instead of
 * &quot;smooth&quot;.
 * <p>
 * <strong>Slicing</strong>
 * <p>
 * Reindex supports sliced scroll to parallelize the reindexing process. This
 * parallelization can improve efficiency and provide a convenient way to break
 * the request down into smaller parts.
 * <p>
 * NOTE: Reindexing from remote clusters does not support manual or automatic
 * slicing.
 * <p>
 * You can slice a reindex request manually by providing a slice ID and total
 * number of slices to each request. You can also let reindex automatically
 * parallelize by using sliced scroll to slice on <code>_id</code>. The
 * <code>slices</code> parameter specifies the number of slices to use.
 * <p>
 * Adding <code>slices</code> to the reindex request just automates the manual
 * process, creating sub-requests which means it has some quirks:
 * <ul>
 * <li>You can see these requests in the tasks API. These sub-requests are
 * &quot;child&quot; tasks of the task for the request with slices.</li>
 * <li>Fetching the status of the task for the request with <code>slices</code>
 * only contains the status of completed slices.</li>
 * <li>These sub-requests are individually addressable for things like
 * cancellation and rethrottling.</li>
 * <li>Rethrottling the request with <code>slices</code> will rethrottle the
 * unfinished sub-request proportionally.</li>
 * <li>Canceling the request with <code>slices</code> will cancel each
 * sub-request.</li>
 * <li>Due to the nature of <code>slices</code>, each sub-request won't get a
 * perfectly even portion of the documents. All documents will be addressed, but
 * some slices may be larger than others. Expect larger slices to have a more
 * even distribution.</li>
 * <li>Parameters like <code>requests_per_second</code> and
 * <code>max_docs</code> on a request with <code>slices</code> are distributed
 * proportionally to each sub-request. Combine that with the previous point
 * about distribution being uneven and you should conclude that using
 * <code>max_docs</code> with <code>slices</code> might not result in exactly
 * <code>max_docs</code> documents being reindexed.</li>
 * <li>Each sub-request gets a slightly different snapshot of the source, though
 * these are all taken at approximately the same time.</li>
 * </ul>
 * <p>
 * If slicing automatically, setting <code>slices</code> to <code>auto</code>
 * will choose a reasonable number for most indices. If slicing manually or
 * otherwise tuning automatic slicing, use the following guidelines.
 * <p>
 * Query performance is most efficient when the number of slices is equal to the
 * number of shards in the index. If that number is large (for example,
 * <code>500</code>), choose a lower number as too many slices will hurt
 * performance. Setting slices higher than the number of shards generally does
 * not improve efficiency and adds overhead.
 * <p>
 * Indexing performance scales linearly across available resources with the
 * number of slices.
 * <p>
 * Whether query or indexing performance dominates the runtime depends on the
 * documents being reindexed and cluster resources.
 * <p>
 * <strong>Modify documents during reindexing</strong>
 * <p>
 * Like <code>_update_by_query</code>, reindex operations support a script that
 * modifies the document. Unlike <code>_update_by_query</code>, the script is
 * allowed to modify the document's metadata.
 * <p>
 * Just as in <code>_update_by_query</code>, you can set <code>ctx.op</code> to
 * change the operation that is run on the destination. For example, set
 * <code>ctx.op</code> to <code>noop</code> if your script decides that the
 * document doesn’t have to be indexed in the destination. This &quot;no
 * operation&quot; will be reported in the <code>noop</code> counter in the
 * response body. Set <code>ctx.op</code> to <code>delete</code> if your script
 * decides that the document must be deleted from the destination. The deletion
 * will be reported in the <code>deleted</code> counter in the response body.
 * Setting <code>ctx.op</code> to anything else will return an error, as will
 * setting any other field in <code>ctx</code>.
 * <p>
 * Think of the possibilities! Just be careful; you are able to change:
 * <ul>
 * <li><code>_id</code></li>
 * <li><code>_index</code></li>
 * <li><code>_version</code></li>
 * <li><code>_routing</code></li>
 * </ul>
 * <p>
 * Setting <code>_version</code> to <code>null</code> or clearing it from the
 * <code>ctx</code> map is just like not sending the version in an indexing
 * request. It will cause the document to be overwritten in the destination
 * regardless of the version on the target or the version type you use in the
 * reindex API.
 * <p>
 * <strong>Reindex from remote</strong>
 * <p>
 * Reindex supports reindexing from a remote Elasticsearch cluster. The
 * <code>host</code> parameter must contain a scheme, host, port, and optional
 * path. The <code>username</code> and <code>password</code> parameters are
 * optional and when they are present the reindex operation will connect to the
 * remote Elasticsearch node using basic authentication. Be sure to use HTTPS
 * when using basic authentication or the password will be sent in plain text.
 * There are a range of settings available to configure the behavior of the
 * HTTPS connection.
 * <p>
 * When using Elastic Cloud, it is also possible to authenticate against the
 * remote cluster through the use of a valid API key. Remote hosts must be
 * explicitly allowed with the <code>reindex.remote.whitelist</code> setting. It
 * can be set to a comma delimited list of allowed remote host and port
 * combinations. Scheme is ignored; only the host and port are used. For
 * example:
 * 
 * <pre>
 * <code>reindex.remote.whitelist: [otherhost:9200, another:9200, 127.0.10.*:9200, localhost:*&quot;]
 * </code>
 * </pre>
 * <p>
 * The list of allowed hosts must be configured on any nodes that will
 * coordinate the reindex. This feature should work with remote clusters of any
 * version of Elasticsearch. This should enable you to upgrade from any version
 * of Elasticsearch to the current version by reindexing from a cluster of the
 * old version.
 * <p>
 * WARNING: Elasticsearch does not support forward compatibility across major
 * versions. For example, you cannot reindex from a 7.x cluster into a 6.x
 * cluster.
 * <p>
 * To enable queries sent to older versions of Elasticsearch, the
 * <code>query</code> parameter is sent directly to the remote host without
 * validation or modification.
 * <p>
 * NOTE: Reindexing from remote clusters does not support manual or automatic
 * slicing.
 * <p>
 * Reindexing from a remote server uses an on-heap buffer that defaults to a
 * maximum size of 100mb. If the remote index includes very large documents
 * you'll need to use a smaller batch size. It is also possible to set the
 * socket read timeout on the remote connection with the
 * <code>socket_timeout</code> field and the connection timeout with the
 * <code>connect_timeout</code> field. Both default to 30 seconds.
 * <p>
 * <strong>Configuring SSL parameters</strong>
 * <p>
 * Reindex from remote supports configurable SSL settings. These must be
 * specified in the <code>elasticsearch.yml</code> file, with the exception of
 * the secure settings, which you add in the Elasticsearch keystore. It is not
 * possible to configure SSL in the body of the reindex request.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.reindex.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReindexRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Conflicts conflicts;

	private final Destination dest;

	@Nullable
	private final Long maxDocs;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final Float requestsPerSecond;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final Script script;

	@Nullable
	private final Time scroll;

	@Nullable
	private final Long size;

	@Nullable
	private final Slices slices;

	private final Source source;

	@Nullable
	private final Time timeout;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private ReindexRequest(Builder builder) {

		this.conflicts = builder.conflicts;
		this.dest = ApiTypeHelper.requireNonNullWithDefault(builder.dest, this, "dest", this.dest());
		this.maxDocs = builder.maxDocs;
		this.refresh = builder.refresh;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.requireAlias = builder.requireAlias;
		this.script = builder.script;
		this.scroll = builder.scroll;
		this.size = builder.size;
		this.slices = builder.slices;
		this.source = ApiTypeHelper.requireNonNullWithDefault(builder.source, this, "source", this.source());
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static ReindexRequest of(Function<Builder, ObjectBuilder<ReindexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether to continue reindexing even when there are conflicts.
	 * <p>
	 * API name: {@code conflicts}
	 */
	@Nullable
	public final Conflicts conflicts() {
		return this.conflicts;
	}

	/**
	 * Required - The destination you are copying to.
	 * <p>
	 * API name: {@code dest}
	 */
	public final Destination dest() {
		return this.dest;
	}

	/**
	 * The maximum number of documents to reindex. By default, all documents are
	 * reindexed. If it is a value less then or equal to <code>scroll_size</code>, a
	 * scroll will not be used to retrieve the results for the operation.
	 * <p>
	 * If <code>conflicts</code> is set to <code>proceed</code>, the reindex
	 * operation could attempt to reindex more documents from the source than
	 * <code>max_docs</code> until it has successfully indexed <code>max_docs</code>
	 * documents into the target or it has gone through every document in the source
	 * query.
	 * <p>
	 * API name: {@code max_docs}
	 */
	@Nullable
	public final Long maxDocs() {
		return this.maxDocs;
	}

	/**
	 * If <code>true</code>, the request refreshes affected shards to make this
	 * operation visible to search.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Boolean refresh() {
		return this.refresh;
	}

	/**
	 * The throttle for this request in sub-requests per second. By default, there
	 * is no throttle.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Float requestsPerSecond() {
		return this.requestsPerSecond;
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
	 * The script to run to update the document source or metadata when reindexing.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * The period of time that a consistent view of the index should be maintained
	 * for scrolled search.
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public final Time scroll() {
		return this.scroll;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Long size() {
		return this.size;
	}

	/**
	 * The number of slices this task should be divided into. It defaults to one
	 * slice, which means the task isn't sliced into subtasks.
	 * <p>
	 * Reindex supports sliced scroll to parallelize the reindexing process. This
	 * parallelization can improve efficiency and provide a convenient way to break
	 * the request down into smaller parts.
	 * <p>
	 * NOTE: Reindexing from remote clusters does not support manual or automatic
	 * slicing.
	 * <p>
	 * If set to <code>auto</code>, Elasticsearch chooses the number of slices to
	 * use. This setting will use one slice per shard, up to a certain limit. If
	 * there are multiple sources, it will choose the number of slices based on the
	 * index or backing index with the smallest number of shards.
	 * <p>
	 * API name: {@code slices}
	 */
	@Nullable
	public final Slices slices() {
		return this.slices;
	}

	/**
	 * Required - The source you are copying from.
	 * <p>
	 * API name: {@code source}
	 */
	public final Source source() {
		return this.source;
	}

	/**
	 * The period each indexing waits for automatic index creation, dynamic mapping
	 * updates, and waiting for active shards. By default, Elasticsearch waits for
	 * at least one minute before failing. The actual wait time could be longer,
	 * particularly when multiple waits occur.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set it to <code>all</code> or any positive integer up to the total
	 * number of shards in the index (<code>number_of_replicas+1</code>). The
	 * default value is one, which means it waits for each primary shard to be
	 * active.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * If <code>true</code>, the request blocks until the operation is complete.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
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

		if (this.conflicts != null) {
			generator.writeKey("conflicts");
			this.conflicts.serialize(generator, mapper);
		}
		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		if (this.maxDocs != null) {
			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		generator.writeKey("source");
		this.source.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ReindexRequest> {
		@Nullable
		private Conflicts conflicts;

		private Destination dest;

		@Nullable
		private Long maxDocs;

		@Nullable
		private Boolean refresh;

		@Nullable
		private Float requestsPerSecond;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private Script script;

		@Nullable
		private Time scroll;

		@Nullable
		private Long size;

		@Nullable
		private Slices slices;

		private Source source;

		@Nullable
		private Time timeout;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Indicates whether to continue reindexing even when there are conflicts.
		 * <p>
		 * API name: {@code conflicts}
		 */
		public final Builder conflicts(@Nullable Conflicts value) {
			this.conflicts = value;
			return this;
		}

		/**
		 * Required - The destination you are copying to.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - The destination you are copying to.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * The maximum number of documents to reindex. By default, all documents are
		 * reindexed. If it is a value less then or equal to <code>scroll_size</code>, a
		 * scroll will not be used to retrieve the results for the operation.
		 * <p>
		 * If <code>conflicts</code> is set to <code>proceed</code>, the reindex
		 * operation could attempt to reindex more documents from the source than
		 * <code>max_docs</code> until it has successfully indexed <code>max_docs</code>
		 * documents into the target or it has gone through every document in the source
		 * query.
		 * <p>
		 * API name: {@code max_docs}
		 */
		public final Builder maxDocs(@Nullable Long value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request refreshes affected shards to make this
		 * operation visible to search.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * The throttle for this request in sub-requests per second. By default, there
		 * is no throttle.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * If <code>true</code>, the destination must be an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final Builder requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * The script to run to update the document source or metadata when reindexing.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * The script to run to update the document source or metadata when reindexing.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * The period of time that a consistent view of the index should be maintained
		 * for scrolled search.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(@Nullable Time value) {
			this.scroll = value;
			return this;
		}

		/**
		 * The period of time that a consistent view of the index should be maintained
		 * for scrolled search.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.scroll(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Long value) {
			this.size = value;
			return this;
		}

		/**
		 * The number of slices this task should be divided into. It defaults to one
		 * slice, which means the task isn't sliced into subtasks.
		 * <p>
		 * Reindex supports sliced scroll to parallelize the reindexing process. This
		 * parallelization can improve efficiency and provide a convenient way to break
		 * the request down into smaller parts.
		 * <p>
		 * NOTE: Reindexing from remote clusters does not support manual or automatic
		 * slicing.
		 * <p>
		 * If set to <code>auto</code>, Elasticsearch chooses the number of slices to
		 * use. This setting will use one slice per shard, up to a certain limit. If
		 * there are multiple sources, it will choose the number of slices based on the
		 * index or backing index with the smallest number of shards.
		 * <p>
		 * API name: {@code slices}
		 */
		public final Builder slices(@Nullable Slices value) {
			this.slices = value;
			return this;
		}

		/**
		 * The number of slices this task should be divided into. It defaults to one
		 * slice, which means the task isn't sliced into subtasks.
		 * <p>
		 * Reindex supports sliced scroll to parallelize the reindexing process. This
		 * parallelization can improve efficiency and provide a convenient way to break
		 * the request down into smaller parts.
		 * <p>
		 * NOTE: Reindexing from remote clusters does not support manual or automatic
		 * slicing.
		 * <p>
		 * If set to <code>auto</code>, Elasticsearch chooses the number of slices to
		 * use. This setting will use one slice per shard, up to a certain limit. If
		 * there are multiple sources, it will choose the number of slices based on the
		 * index or backing index with the smallest number of shards.
		 * <p>
		 * API name: {@code slices}
		 */
		public final Builder slices(Function<Slices.Builder, ObjectBuilder<Slices>> fn) {
			return this.slices(fn.apply(new Slices.Builder()).build());
		}

		/**
		 * Required - The source you are copying from.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Source value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - The source you are copying from.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * The period each indexing waits for automatic index creation, dynamic mapping
		 * updates, and waiting for active shards. By default, Elasticsearch waits for
		 * at least one minute before failing. The actual wait time could be longer,
		 * particularly when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period each indexing waits for automatic index creation, dynamic mapping
		 * updates, and waiting for active shards. By default, Elasticsearch waits for
		 * at least one minute before failing. The actual wait time could be longer,
		 * particularly when multiple waits occur.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set it to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>). The
		 * default value is one, which means it waits for each primary shard to be
		 * active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set it to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>). The
		 * default value is one, which means it waits for each primary shard to be
		 * active.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request blocks until the operation is complete.
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
		 * Builds a {@link ReindexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexRequest build() {
			_checkSingleUse();

			return new ReindexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexRequest}
	 */
	public static final JsonpDeserializer<ReindexRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexRequest::setupReindexRequestDeserializer);

	protected static void setupReindexRequestDeserializer(ObjectDeserializer<ReindexRequest.Builder> op) {

		op.add(Builder::conflicts, Conflicts._DESERIALIZER, "conflicts");
		op.add(Builder::dest, Destination._DESERIALIZER, "dest");
		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");
		op.add(Builder::source, Source._DESERIALIZER, "source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code reindex}".
	 */
	public static final Endpoint<ReindexRequest, ReindexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/reindex",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_reindex";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.slices != null) {
					params.put("slices", request.slices._toJsonString());
				}
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", String.valueOf(request.requestsPerSecond));
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll._toJsonString());
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ReindexResponse._DESERIALIZER);
}
