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
import co.elastic.clients.elasticsearch._types.Conflicts;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.core.reindex.Source;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex.Request
@JsonpDeserializable
public final class ReindexRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Conflicts conflicts;

	@Nullable
	private final Destination dest;

	@Nullable
	private final Long maxDocs;

	@Nullable
	private final Boolean refresh;

	@Nullable
	private final Long requestsPerSecond;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final String scroll;

	@Nullable
	private final Long size;

	@Nullable
	private final Long slices;

	@Nullable
	private final Source source;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	public ReindexRequest(Builder builder) {

		this.conflicts = builder.conflicts;
		this.dest = builder.dest;
		this.maxDocs = builder.maxDocs;
		this.refresh = builder.refresh;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.requireAlias = builder.requireAlias;
		this.script = builder.script;
		this.scroll = builder.scroll;
		this.size = builder.size;
		this.slices = builder.slices;
		this.source = builder.source;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public ReindexRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code conflicts}
	 */
	@Nullable
	public Conflicts conflicts() {
		return this.conflicts;
	}

	/**
	 * API name: {@code dest}
	 */
	@Nullable
	public Destination dest() {
		return this.dest;
	}

	/**
	 * API name: {@code max_docs}
	 */
	@Nullable
	public Long maxDocs() {
		return this.maxDocs;
	}

	/**
	 * Should the affected indexes be refreshed?
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public Boolean refresh() {
		return this.refresh;
	}

	/**
	 * The throttle to set on this request in sub-requests per second. -1 means no
	 * throttle.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public Long requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * Control how long to keep the search context alive
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public String scroll() {
		return this.scroll;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Long size() {
		return this.size;
	}

	/**
	 * The number of slices this task should be divided into. Defaults to 1, meaning
	 * the task isn't sliced into subtasks. Can be set to <code>auto</code>.
	 * <p>
	 * API name: {@code slices}
	 */
	@Nullable
	public Long slices() {
		return this.slices;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public Source source() {
		return this.source;
	}

	/**
	 * Time each individual bulk request should wait for shards that are
	 * unavailable.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Sets the number of shard copies that must be active before proceeding with
	 * the reindex operation. Defaults to 1, meaning the primary shard only. Set to
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
	 * Should the request should block until the reindex is complete.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
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
		if (this.dest != null) {

			generator.writeKey("dest");
			this.dest.serialize(generator, mapper);

		}
		if (this.maxDocs != null) {

			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.source != null) {

			generator.writeKey("source");
			this.source.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexRequest}.
	 */
	public static class Builder implements ObjectBuilder<ReindexRequest> {
		@Nullable
		private Conflicts conflicts;

		@Nullable
		private Destination dest;

		@Nullable
		private Long maxDocs;

		@Nullable
		private Boolean refresh;

		@Nullable
		private Long requestsPerSecond;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private String scroll;

		@Nullable
		private Long size;

		@Nullable
		private Long slices;

		@Nullable
		private Source source;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * API name: {@code conflicts}
		 */
		public Builder conflicts(@Nullable Conflicts value) {
			this.conflicts = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(@Nullable Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * API name: {@code dest}
		 */
		public Builder dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * API name: {@code max_docs}
		 */
		public Builder maxDocs(@Nullable Long value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * Should the affected indexes be refreshed?
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable Boolean value) {
			this.refresh = value;
			return this;
		}

		/**
		 * The throttle to set on this request in sub-requests per second. -1 means no
		 * throttle.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public Builder requestsPerSecond(@Nullable Long value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * API name: {@code require_alias}
		 */
		public Builder requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * Control how long to keep the search context alive
		 * <p>
		 * API name: {@code scroll}
		 */
		public Builder scroll(@Nullable String value) {
			this.scroll = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Long value) {
			this.size = value;
			return this;
		}

		/**
		 * The number of slices this task should be divided into. Defaults to 1, meaning
		 * the task isn't sliced into subtasks. Can be set to <code>auto</code>.
		 * <p>
		 * API name: {@code slices}
		 */
		public Builder slices(@Nullable Long value) {
			this.slices = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(@Nullable Source value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * Time each individual bulk request should wait for shards that are
		 * unavailable.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Sets the number of shard copies that must be active before proceeding with
		 * the reindex operation. Defaults to 1, meaning the primary shard only. Set to
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
		 * Should the request should block until the reindex is complete.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * Builds a {@link ReindexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexRequest build() {

			return new ReindexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexRequest}
	 */
	public static final JsonpDeserializer<ReindexRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexRequest::setupReindexRequestDeserializer, Builder::build);

	protected static void setupReindexRequestDeserializer(DelegatingDeserializer<ReindexRequest.Builder> op) {

		op.add(Builder::conflicts, Conflicts._DESERIALIZER, "conflicts");
		op.add(Builder::dest, Destination._DESERIALIZER, "dest");
		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");
		op.add(Builder::source, Source._DESERIALIZER, "source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code reindex}".
	 */
	public static final Endpoint<ReindexRequest, ReindexResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_reindex";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.slices != null) {
					params.put("slices", String.valueOf(request.slices));
				}
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", String.valueOf(request.requestsPerSecond));
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll);
				}
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ReindexResponse._DESERIALIZER);
}
