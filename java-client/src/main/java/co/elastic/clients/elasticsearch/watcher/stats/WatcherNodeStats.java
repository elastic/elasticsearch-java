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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.stats.WatcherNodeStats
public final class WatcherNodeStats implements JsonpSerializable {
	@Nullable
	private final List<WatchRecordStats> currentWatches;

	private final ExecutionThreadPool executionThreadPool;

	@Nullable
	private final List<WatchRecordQueuedStats> queuedWatches;

	private final Number watchCount;

	private final WatcherState watcherState;

	private final String nodeId;

	// ---------------------------------------------------------------------------------------------

	public WatcherNodeStats(Builder builder) {

		this.currentWatches = builder.currentWatches;
		this.executionThreadPool = Objects.requireNonNull(builder.executionThreadPool, "execution_thread_pool");
		this.queuedWatches = builder.queuedWatches;
		this.watchCount = Objects.requireNonNull(builder.watchCount, "watch_count");
		this.watcherState = Objects.requireNonNull(builder.watcherState, "watcher_state");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");

	}

	/**
	 * API name: {@code current_watches}
	 */
	@Nullable
	public List<WatchRecordStats> currentWatches() {
		return this.currentWatches;
	}

	/**
	 * API name: {@code execution_thread_pool}
	 */
	public ExecutionThreadPool executionThreadPool() {
		return this.executionThreadPool;
	}

	/**
	 * API name: {@code queued_watches}
	 */
	@Nullable
	public List<WatchRecordQueuedStats> queuedWatches() {
		return this.queuedWatches;
	}

	/**
	 * API name: {@code watch_count}
	 */
	public Number watchCount() {
		return this.watchCount;
	}

	/**
	 * API name: {@code watcher_state}
	 */
	public WatcherState watcherState() {
		return this.watcherState;
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
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

		if (this.currentWatches != null) {

			generator.writeKey("current_watches");
			generator.writeStartArray();
			for (WatchRecordStats item0 : this.currentWatches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("execution_thread_pool");
		this.executionThreadPool.serialize(generator, mapper);

		if (this.queuedWatches != null) {

			generator.writeKey("queued_watches");
			generator.writeStartArray();
			for (WatchRecordQueuedStats item0 : this.queuedWatches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("watch_count");
		generator.write(this.watchCount.doubleValue());

		generator.writeKey("watcher_state");
		this.watcherState.serialize(generator, mapper);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherNodeStats}.
	 */
	public static class Builder implements ObjectBuilder<WatcherNodeStats> {
		@Nullable
		private List<WatchRecordStats> currentWatches;

		private ExecutionThreadPool executionThreadPool;

		@Nullable
		private List<WatchRecordQueuedStats> queuedWatches;

		private Number watchCount;

		private WatcherState watcherState;

		private String nodeId;

		/**
		 * API name: {@code current_watches}
		 */
		public Builder currentWatches(@Nullable List<WatchRecordStats> value) {
			this.currentWatches = value;
			return this;
		}

		/**
		 * API name: {@code current_watches}
		 */
		public Builder currentWatches(WatchRecordStats... value) {
			this.currentWatches = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #currentWatches(List)}, creating the list if needed.
		 */
		public Builder addCurrentWatches(WatchRecordStats value) {
			if (this.currentWatches == null) {
				this.currentWatches = new ArrayList<>();
			}
			this.currentWatches.add(value);
			return this;
		}

		/**
		 * Set {@link #currentWatches(List)} to a singleton list.
		 */
		public Builder currentWatches(Function<WatchRecordStats.Builder, ObjectBuilder<WatchRecordStats>> fn) {
			return this.currentWatches(fn.apply(new WatchRecordStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #currentWatches(List)}, creating the list if needed.
		 */
		public Builder addCurrentWatches(Function<WatchRecordStats.Builder, ObjectBuilder<WatchRecordStats>> fn) {
			return this.addCurrentWatches(fn.apply(new WatchRecordStats.Builder()).build());
		}

		/**
		 * API name: {@code execution_thread_pool}
		 */
		public Builder executionThreadPool(ExecutionThreadPool value) {
			this.executionThreadPool = value;
			return this;
		}

		/**
		 * API name: {@code execution_thread_pool}
		 */
		public Builder executionThreadPool(
				Function<ExecutionThreadPool.Builder, ObjectBuilder<ExecutionThreadPool>> fn) {
			return this.executionThreadPool(fn.apply(new ExecutionThreadPool.Builder()).build());
		}

		/**
		 * API name: {@code queued_watches}
		 */
		public Builder queuedWatches(@Nullable List<WatchRecordQueuedStats> value) {
			this.queuedWatches = value;
			return this;
		}

		/**
		 * API name: {@code queued_watches}
		 */
		public Builder queuedWatches(WatchRecordQueuedStats... value) {
			this.queuedWatches = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #queuedWatches(List)}, creating the list if needed.
		 */
		public Builder addQueuedWatches(WatchRecordQueuedStats value) {
			if (this.queuedWatches == null) {
				this.queuedWatches = new ArrayList<>();
			}
			this.queuedWatches.add(value);
			return this;
		}

		/**
		 * Set {@link #queuedWatches(List)} to a singleton list.
		 */
		public Builder queuedWatches(
				Function<WatchRecordQueuedStats.Builder, ObjectBuilder<WatchRecordQueuedStats>> fn) {
			return this.queuedWatches(fn.apply(new WatchRecordQueuedStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #queuedWatches(List)}, creating the list if needed.
		 */
		public Builder addQueuedWatches(
				Function<WatchRecordQueuedStats.Builder, ObjectBuilder<WatchRecordQueuedStats>> fn) {
			return this.addQueuedWatches(fn.apply(new WatchRecordQueuedStats.Builder()).build());
		}

		/**
		 * API name: {@code watch_count}
		 */
		public Builder watchCount(Number value) {
			this.watchCount = value;
			return this;
		}

		/**
		 * API name: {@code watcher_state}
		 */
		public Builder watcherState(WatcherState value) {
			this.watcherState = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
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

			return new WatcherNodeStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherNodeStats}
	 */
	public static final JsonpDeserializer<WatcherNodeStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatcherNodeStats::setupWatcherNodeStatsDeserializer);

	protected static void setupWatcherNodeStatsDeserializer(DelegatingDeserializer<WatcherNodeStats.Builder> op) {

		op.add(Builder::currentWatches, JsonpDeserializer.arrayDeserializer(WatchRecordStats.DESERIALIZER),
				"current_watches");
		op.add(Builder::executionThreadPool, ExecutionThreadPool.DESERIALIZER, "execution_thread_pool");
		op.add(Builder::queuedWatches, JsonpDeserializer.arrayDeserializer(WatchRecordQueuedStats.DESERIALIZER),
				"queued_watches");
		op.add(Builder::watchCount, JsonpDeserializer.numberDeserializer(), "watch_count");
		op.add(Builder::watcherState, WatcherState.DESERIALIZER, "watcher_state");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");

	}

}
