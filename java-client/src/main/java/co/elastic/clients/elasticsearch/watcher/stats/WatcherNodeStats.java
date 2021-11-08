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

package co.elastic.clients.elasticsearch.watcher.stats;

import co.elastic.clients.elasticsearch.watcher.ExecutionThreadPool;
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
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.stats.WatcherNodeStats
@JsonpDeserializable
public class WatcherNodeStats implements JsonpSerializable {
	private final List<WatchRecordStats> currentWatches;

	private final ExecutionThreadPool executionThreadPool;

	private final List<WatchRecordQueuedStats> queuedWatches;

	private final long watchCount;

	private final WatcherState watcherState;

	private final String nodeId;

	// ---------------------------------------------------------------------------------------------

	private WatcherNodeStats(Builder builder) {

		this.currentWatches = ModelTypeHelper.unmodifiable(builder.currentWatches);
		this.executionThreadPool = ModelTypeHelper.requireNonNull(builder.executionThreadPool, this,
				"executionThreadPool");
		this.queuedWatches = ModelTypeHelper.unmodifiable(builder.queuedWatches);
		this.watchCount = ModelTypeHelper.requireNonNull(builder.watchCount, this, "watchCount");
		this.watcherState = ModelTypeHelper.requireNonNull(builder.watcherState, this, "watcherState");
		this.nodeId = ModelTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");

	}

	public static WatcherNodeStats of(Function<Builder, ObjectBuilder<WatcherNodeStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code current_watches}
	 */
	public final List<WatchRecordStats> currentWatches() {
		return this.currentWatches;
	}

	/**
	 * Required - API name: {@code execution_thread_pool}
	 */
	public final ExecutionThreadPool executionThreadPool() {
		return this.executionThreadPool;
	}

	/**
	 * API name: {@code queued_watches}
	 */
	public final List<WatchRecordQueuedStats> queuedWatches() {
		return this.queuedWatches;
	}

	/**
	 * Required - API name: {@code watch_count}
	 */
	public final long watchCount() {
		return this.watchCount;
	}

	/**
	 * Required - API name: {@code watcher_state}
	 */
	public final WatcherState watcherState() {
		return this.watcherState;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
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

		if (ModelTypeHelper.isDefined(this.currentWatches)) {
			generator.writeKey("current_watches");
			generator.writeStartArray();
			for (WatchRecordStats item0 : this.currentWatches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("execution_thread_pool");
		this.executionThreadPool.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.queuedWatches)) {
			generator.writeKey("queued_watches");
			generator.writeStartArray();
			for (WatchRecordQueuedStats item0 : this.queuedWatches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("watch_count");
		generator.write(this.watchCount);

		generator.writeKey("watcher_state");
		this.watcherState.serialize(generator, mapper);
		generator.writeKey("node_id");
		generator.write(this.nodeId);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherNodeStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WatcherNodeStats> {
		@Nullable
		private List<WatchRecordStats> currentWatches;

		private ExecutionThreadPool executionThreadPool;

		@Nullable
		private List<WatchRecordQueuedStats> queuedWatches;

		private Long watchCount;

		private WatcherState watcherState;

		private String nodeId;

		/**
		 * API name: {@code current_watches}
		 */
		public final Builder currentWatches(@Nullable List<WatchRecordStats> value) {
			this.currentWatches = value;
			return this;
		}

		/**
		 * API name: {@code current_watches}
		 */
		public final Builder currentWatches(WatchRecordStats... value) {
			this.currentWatches = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code current_watches}
		 */
		@SafeVarargs
		public final Builder currentWatches(
				Function<WatchRecordStats.Builder, ObjectBuilder<WatchRecordStats>>... fns) {
			this.currentWatches = new ArrayList<>(fns.length);
			for (Function<WatchRecordStats.Builder, ObjectBuilder<WatchRecordStats>> fn : fns) {
				this.currentWatches.add(fn.apply(new WatchRecordStats.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code execution_thread_pool}
		 */
		public final Builder executionThreadPool(ExecutionThreadPool value) {
			this.executionThreadPool = value;
			return this;
		}

		/**
		 * Required - API name: {@code execution_thread_pool}
		 */
		public final Builder executionThreadPool(
				Function<ExecutionThreadPool.Builder, ObjectBuilder<ExecutionThreadPool>> fn) {
			return this.executionThreadPool(fn.apply(new ExecutionThreadPool.Builder()).build());
		}

		/**
		 * API name: {@code queued_watches}
		 */
		public final Builder queuedWatches(@Nullable List<WatchRecordQueuedStats> value) {
			this.queuedWatches = value;
			return this;
		}

		/**
		 * API name: {@code queued_watches}
		 */
		public final Builder queuedWatches(WatchRecordQueuedStats... value) {
			this.queuedWatches = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code queued_watches}
		 */
		@SafeVarargs
		public final Builder queuedWatches(
				Function<WatchRecordQueuedStats.Builder, ObjectBuilder<WatchRecordQueuedStats>>... fns) {
			this.queuedWatches = new ArrayList<>(fns.length);
			for (Function<WatchRecordQueuedStats.Builder, ObjectBuilder<WatchRecordQueuedStats>> fn : fns) {
				this.queuedWatches.add(fn.apply(new WatchRecordQueuedStats.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code watch_count}
		 */
		public final Builder watchCount(long value) {
			this.watchCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code watcher_state}
		 */
		public final Builder watcherState(WatcherState value) {
			this.watcherState = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Builds a {@link WatcherNodeStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherNodeStats build() {
			_checkSingleUse();

			return new WatcherNodeStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherNodeStats}
	 */
	public static final JsonpDeserializer<WatcherNodeStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatcherNodeStats::setupWatcherNodeStatsDeserializer, Builder::build);

	protected static void setupWatcherNodeStatsDeserializer(DelegatingDeserializer<WatcherNodeStats.Builder> op) {

		op.add(Builder::currentWatches, JsonpDeserializer.arrayDeserializer(WatchRecordStats._DESERIALIZER),
				"current_watches");
		op.add(Builder::executionThreadPool, ExecutionThreadPool._DESERIALIZER, "execution_thread_pool");
		op.add(Builder::queuedWatches, JsonpDeserializer.arrayDeserializer(WatchRecordQueuedStats._DESERIALIZER),
				"queued_watches");
		op.add(Builder::watchCount, JsonpDeserializer.longDeserializer(), "watch_count");
		op.add(Builder::watcherState, WatcherState._DESERIALIZER, "watcher_state");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");

	}

}
