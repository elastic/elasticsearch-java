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

import co.elastic.clients.elasticsearch.watcher.ExecutionPhase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.stats.WatchRecordStats
@JsonpDeserializable
public class WatchRecordStats extends WatchRecordQueuedStats {
	private final ExecutionPhase executionPhase;

	private final String triggeredTime;

	private final List<String> executedActions;

	private final String watchId;

	private final String watchRecordId;

	// ---------------------------------------------------------------------------------------------

	private WatchRecordStats(Builder builder) {
		super(builder);

		this.executionPhase = ModelTypeHelper.requireNonNull(builder.executionPhase, this, "executionPhase");
		this.triggeredTime = ModelTypeHelper.requireNonNull(builder.triggeredTime, this, "triggeredTime");
		this.executedActions = ModelTypeHelper.unmodifiable(builder.executedActions);
		this.watchId = ModelTypeHelper.requireNonNull(builder.watchId, this, "watchId");
		this.watchRecordId = ModelTypeHelper.requireNonNull(builder.watchRecordId, this, "watchRecordId");

	}

	public static WatchRecordStats of(Function<Builder, ObjectBuilder<WatchRecordStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code execution_phase}
	 */
	public final ExecutionPhase executionPhase() {
		return this.executionPhase;
	}

	/**
	 * Required - API name: {@code triggered_time}
	 */
	public final String triggeredTime() {
		return this.triggeredTime;
	}

	/**
	 * API name: {@code executed_actions}
	 */
	public final List<String> executedActions() {
		return this.executedActions;
	}

	/**
	 * Required - API name: {@code watch_id}
	 */
	public final String watchId() {
		return this.watchId;
	}

	/**
	 * Required - API name: {@code watch_record_id}
	 */
	public final String watchRecordId() {
		return this.watchRecordId;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("execution_phase");
		this.executionPhase.serialize(generator, mapper);
		generator.writeKey("triggered_time");
		generator.write(this.triggeredTime);

		if (ModelTypeHelper.isDefined(this.executedActions)) {
			generator.writeKey("executed_actions");
			generator.writeStartArray();
			for (String item0 : this.executedActions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("watch_id");
		generator.write(this.watchId);

		generator.writeKey("watch_record_id");
		generator.write(this.watchRecordId);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchRecordStats}.
	 */
	public static class Builder extends WatchRecordQueuedStats.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WatchRecordStats> {
		private ExecutionPhase executionPhase;

		private String triggeredTime;

		@Nullable
		private List<String> executedActions;

		private String watchId;

		private String watchRecordId;

		/**
		 * Required - API name: {@code execution_phase}
		 */
		public final Builder executionPhase(ExecutionPhase value) {
			this.executionPhase = value;
			return this;
		}

		/**
		 * Required - API name: {@code triggered_time}
		 */
		public final Builder triggeredTime(String value) {
			this.triggeredTime = value;
			return this;
		}

		/**
		 * API name: {@code executed_actions}
		 */
		public final Builder executedActions(@Nullable List<String> value) {
			this.executedActions = value;
			return this;
		}

		/**
		 * API name: {@code executed_actions}
		 */
		public final Builder executedActions(String... value) {
			this.executedActions = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code watch_id}
		 */
		public final Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * Required - API name: {@code watch_record_id}
		 */
		public final Builder watchRecordId(String value) {
			this.watchRecordId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatchRecordStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchRecordStats build() {
			_checkSingleUse();

			return new WatchRecordStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchRecordStats}
	 */
	public static final JsonpDeserializer<WatchRecordStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatchRecordStats::setupWatchRecordStatsDeserializer, Builder::build);

	protected static void setupWatchRecordStatsDeserializer(DelegatingDeserializer<WatchRecordStats.Builder> op) {
		WatchRecordQueuedStats.setupWatchRecordQueuedStatsDeserializer(op);
		op.add(Builder::executionPhase, ExecutionPhase._DESERIALIZER, "execution_phase");
		op.add(Builder::triggeredTime, JsonpDeserializer.stringDeserializer(), "triggered_time");
		op.add(Builder::executedActions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"executed_actions");
		op.add(Builder::watchId, JsonpDeserializer.stringDeserializer(), "watch_id");
		op.add(Builder::watchRecordId, JsonpDeserializer.stringDeserializer(), "watch_record_id");

	}

}
