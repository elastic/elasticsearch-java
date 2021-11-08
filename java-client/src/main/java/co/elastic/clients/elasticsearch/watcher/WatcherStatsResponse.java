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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.NodeStatistics;
import co.elastic.clients.elasticsearch.watcher.stats.WatcherNodeStats;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.stats.Response
@JsonpDeserializable
public class WatcherStatsResponse implements JsonpSerializable {
	private final NodeStatistics nodeStats;

	private final String clusterName;

	private final boolean manuallyStopped;

	private final List<WatcherNodeStats> stats;

	// ---------------------------------------------------------------------------------------------

	private WatcherStatsResponse(Builder builder) {

		this.nodeStats = ModelTypeHelper.requireNonNull(builder.nodeStats, this, "nodeStats");
		this.clusterName = ModelTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.manuallyStopped = ModelTypeHelper.requireNonNull(builder.manuallyStopped, this, "manuallyStopped");
		this.stats = ModelTypeHelper.unmodifiableRequired(builder.stats, this, "stats");

	}

	public static WatcherStatsResponse of(Function<Builder, ObjectBuilder<WatcherStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code _nodes}
	 */
	public final NodeStatistics nodeStats() {
		return this.nodeStats;
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code manually_stopped}
	 */
	public final boolean manuallyStopped() {
		return this.manuallyStopped;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final List<WatcherNodeStats> stats() {
		return this.stats;
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

		generator.writeKey("_nodes");
		this.nodeStats.serialize(generator, mapper);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("manually_stopped");
		generator.write(this.manuallyStopped);

		if (ModelTypeHelper.isDefined(this.stats)) {
			generator.writeKey("stats");
			generator.writeStartArray();
			for (WatcherNodeStats item0 : this.stats) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherStatsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WatcherStatsResponse> {
		private NodeStatistics nodeStats;

		private String clusterName;

		private Boolean manuallyStopped;

		private List<WatcherNodeStats> stats;

		/**
		 * Required - API name: {@code _nodes}
		 */
		public final Builder nodeStats(NodeStatistics value) {
			this.nodeStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code _nodes}
		 */
		public final Builder nodeStats(Function<NodeStatistics.Builder, ObjectBuilder<NodeStatistics>> fn) {
			return this.nodeStats(fn.apply(new NodeStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public final Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code manually_stopped}
		 */
		public final Builder manuallyStopped(boolean value) {
			this.manuallyStopped = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(List<WatcherNodeStats> value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(WatcherNodeStats... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		@SafeVarargs
		public final Builder stats(Function<WatcherNodeStats.Builder, ObjectBuilder<WatcherNodeStats>>... fns) {
			this.stats = new ArrayList<>(fns.length);
			for (Function<WatcherNodeStats.Builder, ObjectBuilder<WatcherNodeStats>> fn : fns) {
				this.stats.add(fn.apply(new WatcherNodeStats.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link WatcherStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherStatsResponse build() {
			_checkSingleUse();

			return new WatcherStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherStatsResponse}
	 */
	public static final JsonpDeserializer<WatcherStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WatcherStatsResponse::setupWatcherStatsResponseDeserializer, Builder::build);

	protected static void setupWatcherStatsResponseDeserializer(
			DelegatingDeserializer<WatcherStatsResponse.Builder> op) {

		op.add(Builder::nodeStats, NodeStatistics._DESERIALIZER, "_nodes");
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::manuallyStopped, JsonpDeserializer.booleanDeserializer(), "manually_stopped");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(WatcherNodeStats._DESERIALIZER), "stats");

	}

}
