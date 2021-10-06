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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.CheckpointStats
@JsonpDeserializable
public final class CheckpointStats implements JsonpSerializable {
	private final long checkpoint;

	@Nullable
	private final TransformProgress checkpointProgress;

	@Nullable
	private final String timestamp;

	private final String timestampMillis;

	@Nullable
	private final String timeUpperBound;

	@Nullable
	private final String timeUpperBoundMillis;

	// ---------------------------------------------------------------------------------------------

	public CheckpointStats(Builder builder) {

		this.checkpoint = Objects.requireNonNull(builder.checkpoint, "checkpoint");
		this.checkpointProgress = builder.checkpointProgress;
		this.timestamp = builder.timestamp;
		this.timestampMillis = Objects.requireNonNull(builder.timestampMillis, "timestamp_millis");
		this.timeUpperBound = builder.timeUpperBound;
		this.timeUpperBoundMillis = builder.timeUpperBoundMillis;

	}

	public CheckpointStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code checkpoint}
	 */
	public long checkpoint() {
		return this.checkpoint;
	}

	/**
	 * API name: {@code checkpoint_progress}
	 */
	@Nullable
	public TransformProgress checkpointProgress() {
		return this.checkpointProgress;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code timestamp_millis}
	 */
	public String timestampMillis() {
		return this.timestampMillis;
	}

	/**
	 * API name: {@code time_upper_bound}
	 */
	@Nullable
	public String timeUpperBound() {
		return this.timeUpperBound;
	}

	/**
	 * API name: {@code time_upper_bound_millis}
	 */
	@Nullable
	public String timeUpperBoundMillis() {
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
			generator.write(this.timestamp);

		}

		generator.writeKey("timestamp_millis");
		generator.write(this.timestampMillis);

		if (this.timeUpperBound != null) {

			generator.writeKey("time_upper_bound");
			generator.write(this.timeUpperBound);

		}
		if (this.timeUpperBoundMillis != null) {

			generator.writeKey("time_upper_bound_millis");
			generator.write(this.timeUpperBoundMillis);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CheckpointStats}.
	 */
	public static class Builder implements ObjectBuilder<CheckpointStats> {
		private Long checkpoint;

		@Nullable
		private TransformProgress checkpointProgress;

		@Nullable
		private String timestamp;

		private String timestampMillis;

		@Nullable
		private String timeUpperBound;

		@Nullable
		private String timeUpperBoundMillis;

		/**
		 * Required - API name: {@code checkpoint}
		 */
		public Builder checkpoint(long value) {
			this.checkpoint = value;
			return this;
		}

		/**
		 * API name: {@code checkpoint_progress}
		 */
		public Builder checkpointProgress(@Nullable TransformProgress value) {
			this.checkpointProgress = value;
			return this;
		}

		/**
		 * API name: {@code checkpoint_progress}
		 */
		public Builder checkpointProgress(Function<TransformProgress.Builder, ObjectBuilder<TransformProgress>> fn) {
			return this.checkpointProgress(fn.apply(new TransformProgress.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(@Nullable String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp_millis}
		 */
		public Builder timestampMillis(String value) {
			this.timestampMillis = value;
			return this;
		}

		/**
		 * API name: {@code time_upper_bound}
		 */
		public Builder timeUpperBound(@Nullable String value) {
			this.timeUpperBound = value;
			return this;
		}

		/**
		 * API name: {@code time_upper_bound_millis}
		 */
		public Builder timeUpperBoundMillis(@Nullable String value) {
			this.timeUpperBoundMillis = value;
			return this;
		}

		/**
		 * Builds a {@link CheckpointStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CheckpointStats build() {

			return new CheckpointStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CheckpointStats}
	 */
	public static final JsonpDeserializer<CheckpointStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CheckpointStats::setupCheckpointStatsDeserializer, Builder::build);

	protected static void setupCheckpointStatsDeserializer(DelegatingDeserializer<CheckpointStats.Builder> op) {

		op.add(Builder::checkpoint, JsonpDeserializer.longDeserializer(), "checkpoint");
		op.add(Builder::checkpointProgress, TransformProgress._DESERIALIZER, "checkpoint_progress");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::timestampMillis, JsonpDeserializer.stringDeserializer(), "timestamp_millis");
		op.add(Builder::timeUpperBound, JsonpDeserializer.stringDeserializer(), "time_upper_bound");
		op.add(Builder::timeUpperBoundMillis, JsonpDeserializer.stringDeserializer(), "time_upper_bound_millis");

	}

}
