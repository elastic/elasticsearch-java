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

package co.elastic.clients.elasticsearch.watcher.stats;

import co.elastic.clients.elasticsearch.watcher.ExecutionThreadPool;
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
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: watcher.stats.WatcherNodeStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#watcher.stats.WatcherNodeStats">API
 *      specification</a>
 */
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

		this.currentWatches = ApiTypeHelper.unmodifiable(builder.currentWatches);
		this.executionThreadPool = ApiTypeHelper.requireNonNull(builder.executionThreadPool, this,
				"executionThreadPool");
		this.queuedWatches = ApiTypeHelper.unmodifiable(builder.queuedWatches);
		this.watchCount = ApiTypeHelper.requireNonNull(builder.watchCount, this, "watchCount");
		this.watcherState = ApiTypeHelper.requireNonNull(builder.watcherState, this, "watcherState");
		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");

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

		if (ApiTypeHelper.isDefined(this.currentWatches)) {
			generator.writeKey("current_watches");
			generator.writeStartArray();
			for (WatchRecordStats item0 : this.currentWatches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("execution_thread_pool");
		this.executionThreadPool.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.queuedWatches)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherNodeStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WatcherNodeStats> {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>currentWatches</code>.
		 */
		public final Builder currentWatches(List<WatchRecordStats> list) {
			this.currentWatches = _listAddAll(this.currentWatches, list);
			return this;
		}

		/**
		 * API name: {@code current_watches}
		 * <p>
		 * Adds one or more values to <code>currentWatches</code>.
		 */
		public final Builder currentWatches(WatchRecordStats value, WatchRecordStats... values) {
			this.currentWatches = _listAdd(this.currentWatches, value, values);
			return this;
		}

		/**
		 * API name: {@code current_watches}
		 * <p>
		 * Adds a value to <code>currentWatches</code> using a builder lambda.
		 */
		public final Builder currentWatches(Function<WatchRecordStats.Builder, ObjectBuilder<WatchRecordStats>> fn) {
			return currentWatches(fn.apply(new WatchRecordStats.Builder()).build());
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queuedWatches</code>.
		 */
		public final Builder queuedWatches(List<WatchRecordQueuedStats> list) {
			this.queuedWatches = _listAddAll(this.queuedWatches, list);
			return this;
		}

		/**
		 * API name: {@code queued_watches}
		 * <p>
		 * Adds one or more values to <code>queuedWatches</code>.
		 */
		public final Builder queuedWatches(WatchRecordQueuedStats value, WatchRecordQueuedStats... values) {
			this.queuedWatches = _listAdd(this.queuedWatches, value, values);
			return this;
		}

		/**
		 * API name: {@code queued_watches}
		 * <p>
		 * Adds a value to <code>queuedWatches</code> using a builder lambda.
		 */
		public final Builder queuedWatches(
				Function<WatchRecordQueuedStats.Builder, ObjectBuilder<WatchRecordQueuedStats>> fn) {
			return queuedWatches(fn.apply(new WatchRecordQueuedStats.Builder()).build());
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

		@Override
		protected Builder self() {
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
			WatcherNodeStats::setupWatcherNodeStatsDeserializer);

	protected static void setupWatcherNodeStatsDeserializer(ObjectDeserializer<WatcherNodeStats.Builder> op) {

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
