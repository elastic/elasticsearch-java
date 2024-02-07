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

import co.elastic.clients.elasticsearch.watcher.ExecutionPhase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: watcher.stats.WatchRecordStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#watcher.stats.WatchRecordStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatchRecordStats extends WatchRecordQueuedStats {
	private final ExecutionPhase executionPhase;

	private final DateTime triggeredTime;

	private final List<String> executedActions;

	private final String watchId;

	private final String watchRecordId;

	// ---------------------------------------------------------------------------------------------

	private WatchRecordStats(Builder builder) {
		super(builder);

		this.executionPhase = ApiTypeHelper.requireNonNull(builder.executionPhase, this, "executionPhase");
		this.triggeredTime = ApiTypeHelper.requireNonNull(builder.triggeredTime, this, "triggeredTime");
		this.executedActions = ApiTypeHelper.unmodifiable(builder.executedActions);
		this.watchId = ApiTypeHelper.requireNonNull(builder.watchId, this, "watchId");
		this.watchRecordId = ApiTypeHelper.requireNonNull(builder.watchRecordId, this, "watchRecordId");

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
	public final DateTime triggeredTime() {
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
		this.triggeredTime.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.executedActions)) {
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

		private DateTime triggeredTime;

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
		public final Builder triggeredTime(DateTime value) {
			this.triggeredTime = value;
			return this;
		}

		/**
		 * API name: {@code executed_actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>executedActions</code>.
		 */
		public final Builder executedActions(List<String> list) {
			this.executedActions = _listAddAll(this.executedActions, list);
			return this;
		}

		/**
		 * API name: {@code executed_actions}
		 * <p>
		 * Adds one or more values to <code>executedActions</code>.
		 */
		public final Builder executedActions(String value, String... values) {
			this.executedActions = _listAdd(this.executedActions, value, values);
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
			WatchRecordStats::setupWatchRecordStatsDeserializer);

	protected static void setupWatchRecordStatsDeserializer(ObjectDeserializer<WatchRecordStats.Builder> op) {
		WatchRecordQueuedStats.setupWatchRecordQueuedStatsDeserializer(op);
		op.add(Builder::executionPhase, ExecutionPhase._DESERIALIZER, "execution_phase");
		op.add(Builder::triggeredTime, DateTime._DESERIALIZER, "triggered_time");
		op.add(Builder::executedActions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"executed_actions");
		op.add(Builder::watchId, JsonpDeserializer.stringDeserializer(), "watch_id");
		op.add(Builder::watchRecordId, JsonpDeserializer.stringDeserializer(), "watch_record_id");

	}

}
