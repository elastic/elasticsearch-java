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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.CheckpointStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.CheckpointStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CheckpointStats implements JsonpSerializable {
	private final long checkpoint;

	@Nullable
	private final TransformProgress checkpointProgress;

	@Nullable
	private final DateTime timestamp;

	@Nullable
	private final Long timestampMillis;

	@Nullable
	private final DateTime timeUpperBound;

	@Nullable
	private final Long timeUpperBoundMillis;

	// ---------------------------------------------------------------------------------------------

	private CheckpointStats(Builder builder) {

		this.checkpoint = ApiTypeHelper.requireNonNull(builder.checkpoint, this, "checkpoint");
		this.checkpointProgress = builder.checkpointProgress;
		this.timestamp = builder.timestamp;
		this.timestampMillis = builder.timestampMillis;
		this.timeUpperBound = builder.timeUpperBound;
		this.timeUpperBoundMillis = builder.timeUpperBoundMillis;

	}

	public static CheckpointStats of(Function<Builder, ObjectBuilder<CheckpointStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code checkpoint}
	 */
	public final long checkpoint() {
		return this.checkpoint;
	}

	/**
	 * API name: {@code checkpoint_progress}
	 */
	@Nullable
	public final TransformProgress checkpointProgress() {
		return this.checkpointProgress;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final DateTime timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code timestamp_millis}
	 */
	@Nullable
	public final Long timestampMillis() {
		return this.timestampMillis;
	}

	/**
	 * API name: {@code time_upper_bound}
	 */
	@Nullable
	public final DateTime timeUpperBound() {
		return this.timeUpperBound;
	}

	/**
	 * API name: {@code time_upper_bound_millis}
	 */
	@Nullable
	public final Long timeUpperBoundMillis() {
		return this.timeUpperBoundMillis;
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

		generator.writeKey("checkpoint");
		generator.write(this.checkpoint);

		if (this.checkpointProgress != null) {
			generator.writeKey("checkpoint_progress");
			this.checkpointProgress.serialize(generator, mapper);

		}
		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			this.timestamp.serialize(generator, mapper);
		}
		if (this.timestampMillis != null) {
			generator.writeKey("timestamp_millis");
			generator.write(this.timestampMillis);

		}
		if (this.timeUpperBound != null) {
			generator.writeKey("time_upper_bound");
			this.timeUpperBound.serialize(generator, mapper);
		}
		if (this.timeUpperBoundMillis != null) {
			generator.writeKey("time_upper_bound_millis");
			generator.write(this.timeUpperBoundMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CheckpointStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CheckpointStats> {
		private Long checkpoint;

		@Nullable
		private TransformProgress checkpointProgress;

		@Nullable
		private DateTime timestamp;

		@Nullable
		private Long timestampMillis;

		@Nullable
		private DateTime timeUpperBound;

		@Nullable
		private Long timeUpperBoundMillis;

		/**
		 * Required - API name: {@code checkpoint}
		 */
		public final Builder checkpoint(long value) {
			this.checkpoint = value;
			return this;
		}

		/**
		 * API name: {@code checkpoint_progress}
		 */
		public final Builder checkpointProgress(@Nullable TransformProgress value) {
			this.checkpointProgress = value;
			return this;
		}

		/**
		 * API name: {@code checkpoint_progress}
		 */
		public final Builder checkpointProgress(
				Function<TransformProgress.Builder, ObjectBuilder<TransformProgress>> fn) {
			return this.checkpointProgress(fn.apply(new TransformProgress.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable DateTime value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code timestamp_millis}
		 */
		public final Builder timestampMillis(@Nullable Long value) {
			this.timestampMillis = value;
			return this;
		}

		/**
		 * API name: {@code time_upper_bound}
		 */
		public final Builder timeUpperBound(@Nullable DateTime value) {
			this.timeUpperBound = value;
			return this;
		}

		/**
		 * API name: {@code time_upper_bound_millis}
		 */
		public final Builder timeUpperBoundMillis(@Nullable Long value) {
			this.timeUpperBoundMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CheckpointStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CheckpointStats build() {
			_checkSingleUse();

			return new CheckpointStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CheckpointStats}
	 */
	public static final JsonpDeserializer<CheckpointStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CheckpointStats::setupCheckpointStatsDeserializer);

	protected static void setupCheckpointStatsDeserializer(ObjectDeserializer<CheckpointStats.Builder> op) {

		op.add(Builder::checkpoint, JsonpDeserializer.longDeserializer(), "checkpoint");
		op.add(Builder::checkpointProgress, TransformProgress._DESERIALIZER, "checkpoint_progress");
		op.add(Builder::timestamp, DateTime._DESERIALIZER, "timestamp");
		op.add(Builder::timestampMillis, JsonpDeserializer.longDeserializer(), "timestamp_millis");
		op.add(Builder::timeUpperBound, DateTime._DESERIALIZER, "time_upper_bound");
		op.add(Builder::timeUpperBoundMillis, JsonpDeserializer.longDeserializer(), "time_upper_bound_millis");

	}

}
