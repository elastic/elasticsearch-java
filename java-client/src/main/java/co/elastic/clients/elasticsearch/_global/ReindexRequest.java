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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._global.reindex.Destination;
import co.elastic.clients.elasticsearch._global.reindex.Source;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex.Request
public final class ReindexRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final Boolean refresh;

	@Nullable
	private final Number requestsPerSecond;

	@Nullable
	private final JsonValue scroll;

	@Nullable
	private final Number slices;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final Boolean waitForCompletion;

	@Nullable
	private final Boolean requireAlias;

	@Nullable
	private final JsonValue conflicts;

	@Nullable
	private final Destination dest;

	@Nullable
	private final Number maxDocs;

	@Nullable
	private final JsonValue script;

	@Nullable
	private final Number size;

	@Nullable
	private final Source source;

	// ---------------------------------------------------------------------------------------------

	protected ReindexRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.scroll = builder.scroll;
		this.slices = builder.slices;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForCompletion = builder.waitForCompletion;
		this.requireAlias = builder.requireAlias;
		this.conflicts = builder.conflicts;
		this.dest = builder.dest;
		this.maxDocs = builder.maxDocs;
		this.script = builder.script;
		this.size = builder.size;
		this.source = builder.source;

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
	public Number requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * Control how long to keep the search context alive
	 * <p>
	 * API name: {@code scroll}
	 */
	@Nullable
	public JsonValue scroll() {
		return this.scroll;
	}

	/**
	 * The number of slices this task should be divided into. Defaults to 1, meaning
	 * the task isn't sliced into subtasks. Can be set to <code>auto</code>.
	 * <p>
	 * API name: {@code slices}
	 */
	@Nullable
	public Number slices() {
		return this.slices;
	}

	/**
	 * Time each individual bulk request should wait for shards that are
	 * unavailable.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
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
	public JsonValue waitForActiveShards() {
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
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	/**
	 * API name: {@code conflicts}
	 */
	@Nullable
	public JsonValue conflicts() {
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
	public Number maxDocs() {
		return this.maxDocs;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue script() {
		return this.script;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public Source source() {
		return this.source;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.conflicts != null) {

			generator.writeKey("conflicts");
			generator.write(this.conflicts);

		}
		if (this.dest != null) {

			generator.writeKey("dest");
			this.dest.toJsonp(generator, mapper);

		}
		if (this.maxDocs != null) {

			generator.writeKey("max_docs");
			generator.write(this.maxDocs.doubleValue());

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.source != null) {

			generator.writeKey("source");
			this.source.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexRequest}.
	 */
	public static class Builder implements ObjectBuilder<ReindexRequest> {
		@Nullable
		private Boolean refresh;

		@Nullable
		private Number requestsPerSecond;

		@Nullable
		private JsonValue scroll;

		@Nullable
		private Number slices;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private Boolean waitForCompletion;

		@Nullable
		private Boolean requireAlias;

		@Nullable
		private JsonValue conflicts;

		@Nullable
		private Destination dest;

		@Nullable
		private Number maxDocs;

		@Nullable
		private JsonValue script;

		@Nullable
		private Number size;

		@Nullable
		private Source source;

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
		public Builder requestsPerSecond(@Nullable Number value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * Control how long to keep the search context alive
		 * <p>
		 * API name: {@code scroll}
		 */
		public Builder scroll(@Nullable JsonValue value) {
			this.scroll = value;
			return this;
		}

		/**
		 * The number of slices this task should be divided into. Defaults to 1, meaning
		 * the task isn't sliced into subtasks. Can be set to <code>auto</code>.
		 * <p>
		 * API name: {@code slices}
		 */
		public Builder slices(@Nullable Number value) {
			this.slices = value;
			return this;
		}

		/**
		 * Time each individual bulk request should wait for shards that are
		 * unavailable.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
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
		public Builder waitForActiveShards(@Nullable JsonValue value) {
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
		 * API name: {@code require_alias}
		 */
		public Builder requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return this;
		}

		/**
		 * API name: {@code conflicts}
		 */
		public Builder conflicts(@Nullable JsonValue value) {
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
		public Builder maxDocs(@Nullable Number value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
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
	 * Json deserializer for ReindexRequest
	 */
	public static final JsonpDeserializer<ReindexRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReindexRequest::setupReindexRequestDeserializer);

	protected static void setupReindexRequestDeserializer(DelegatingDeserializer<ReindexRequest.Builder> op) {

		op.add(Builder::conflicts, JsonpDeserializer.jsonValueDeserializer(), "conflicts");
		op.add(Builder::dest, Destination.DESERIALIZER, "dest");
		op.add(Builder::maxDocs, JsonpDeserializer.numberDeserializer(), "max_docs");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::source, Source.DESERIALIZER, "source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code reindex}".
	 */
	public static final Endpoint<ReindexRequest, ReindexResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
				if (request.refresh != null) {
					params.put("refresh", String.valueOf(request.refresh));
				}
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", request.requestsPerSecond.toString());
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll.toString());
				}
				if (request.slices != null) {
					params.put("slices", request.slices.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.requireAlias != null) {
					params.put("require_alias", String.valueOf(request.requireAlias));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, ReindexResponse.DESERIALIZER);
}
