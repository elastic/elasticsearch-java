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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.nodes.Http;
import co.elastic.clients.elasticsearch.nodes.Ingest;
import co.elastic.clients.elasticsearch.nodes.Scripting;
import co.elastic.clients.elasticsearch.nodes.ThreadCount;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.info.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cluster.info.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterInfoResponse implements JsonpSerializable {
	private final String clusterName;

	@Nullable
	private final Http http;

	@Nullable
	private final Ingest ingest;

	private final Map<String, ThreadCount> threadPool;

	@Nullable
	private final Scripting script;

	// ---------------------------------------------------------------------------------------------

	private ClusterInfoResponse(Builder builder) {

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.http = builder.http;
		this.ingest = builder.ingest;
		this.threadPool = ApiTypeHelper.unmodifiable(builder.threadPool);
		this.script = builder.script;

	}

	public static ClusterInfoResponse of(Function<Builder, ObjectBuilder<ClusterInfoResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code http}
	 */
	@Nullable
	public final Http http() {
		return this.http;
	}

	/**
	 * API name: {@code ingest}
	 */
	@Nullable
	public final Ingest ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code thread_pool}
	 */
	public final Map<String, ThreadCount> threadPool() {
		return this.threadPool;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Scripting script() {
		return this.script;
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

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		if (this.http != null) {
			generator.writeKey("http");
			this.http.serialize(generator, mapper);

		}
		if (this.ingest != null) {
			generator.writeKey("ingest");
			this.ingest.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.threadPool)) {
			generator.writeKey("thread_pool");
			generator.writeStartObject();
			for (Map.Entry<String, ThreadCount> item0 : this.threadPool.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterInfoResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterInfoResponse> {
		private String clusterName;

		@Nullable
		private Http http;

		@Nullable
		private Ingest ingest;

		@Nullable
		private Map<String, ThreadCount> threadPool;

		@Nullable
		private Scripting script;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public final Builder http(@Nullable Http value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public final Builder http(Function<Http.Builder, ObjectBuilder<Http>> fn) {
			return this.http(fn.apply(new Http.Builder()).build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public final Builder ingest(@Nullable Ingest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public final Builder ingest(Function<Ingest.Builder, ObjectBuilder<Ingest>> fn) {
			return this.ingest(fn.apply(new Ingest.Builder()).build());
		}

		/**
		 * API name: {@code thread_pool}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>threadPool</code>.
		 */
		public final Builder threadPool(Map<String, ThreadCount> map) {
			this.threadPool = _mapPutAll(this.threadPool, map);
			return this;
		}

		/**
		 * API name: {@code thread_pool}
		 * <p>
		 * Adds an entry to <code>threadPool</code>.
		 */
		public final Builder threadPool(String key, ThreadCount value) {
			this.threadPool = _mapPut(this.threadPool, key, value);
			return this;
		}

		/**
		 * API name: {@code thread_pool}
		 * <p>
		 * Adds an entry to <code>threadPool</code> using a builder lambda.
		 */
		public final Builder threadPool(String key, Function<ThreadCount.Builder, ObjectBuilder<ThreadCount>> fn) {
			return threadPool(key, fn.apply(new ThreadCount.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Scripting value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Scripting.Builder, ObjectBuilder<Scripting>> fn) {
			return this.script(fn.apply(new Scripting.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterInfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterInfoResponse build() {
			_checkSingleUse();

			return new ClusterInfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterInfoResponse}
	 */
	public static final JsonpDeserializer<ClusterInfoResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterInfoResponse::setupClusterInfoResponseDeserializer);

	protected static void setupClusterInfoResponseDeserializer(ObjectDeserializer<ClusterInfoResponse.Builder> op) {

		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::http, Http._DESERIALIZER, "http");
		op.add(Builder::ingest, Ingest._DESERIALIZER, "ingest");
		op.add(Builder::threadPool, JsonpDeserializer.stringMapDeserializer(ThreadCount._DESERIALIZER), "thread_pool");
		op.add(Builder::script, Scripting._DESERIALIZER, "script");

	}

}
