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
 * Reindex documents. Copies documents from a source to a destination. The
 * source can be any existing index, alias, or data stream. The destination must
 * differ from the source. For example, you cannot reindex a data stream into
 * itself.
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
		this.dest = ApiTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.maxDocs = builder.maxDocs;
		this.refresh = builder.refresh;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.requireAlias = builder.requireAlias;
		this.script = builder.script;
		this.scroll = builder.scroll;
		this.size = builder.size;
		this.slices = builder.slices;
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static ReindexRequest of(Function<Builder, ObjectBuilder<ReindexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Set to proceed to continue reindexing even if there are conflicts.
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
	 * The maximum number of documents to reindex.
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
	 * The throttle for this request in sub-requests per second. Defaults to no
	 * throttle.
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
	 * Specifies how long a consistent view of the index should be maintained for
	 * scrolled search.
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
	 * The number of slices this task should be divided into. Defaults to 1 slice,
	 * meaning the task isn’t sliced into subtasks.
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
	 * Period each indexing waits for automatic index creation, dynamic mapping
	 * updates, and waiting for active shards.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set to <code>all</code> or any positive integer up to the total
	 * number of shards in the index (<code>number_of_replicas+1</code>).
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
		 * Set to proceed to continue reindexing even if there are conflicts.
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
		 * The maximum number of documents to reindex.
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
		 * The throttle for this request in sub-requests per second. Defaults to no
		 * throttle.
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
		 * Specifies how long a consistent view of the index should be maintained for
		 * scrolled search.
		 * <p>
		 * API name: {@code scroll}
		 */
		public final Builder scroll(@Nullable Time value) {
			this.scroll = value;
			return this;
		}

		/**
		 * Specifies how long a consistent view of the index should be maintained for
		 * scrolled search.
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
		 * The number of slices this task should be divided into. Defaults to 1 slice,
		 * meaning the task isn’t sliced into subtasks.
		 * <p>
		 * API name: {@code slices}
		 */
		public final Builder slices(@Nullable Slices value) {
			this.slices = value;
			return this;
		}

		/**
		 * The number of slices this task should be divided into. Defaults to 1 slice,
		 * meaning the task isn’t sliced into subtasks.
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
		 * Period each indexing waits for automatic index creation, dynamic mapping
		 * updates, and waiting for active shards.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period each indexing waits for automatic index creation, dynamic mapping
		 * updates, and waiting for active shards.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>).
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to <code>all</code> or any positive integer up to the total
		 * number of shards in the index (<code>number_of_replicas+1</code>).
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
