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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: nodes._types.RepositorySnapshotStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.RepositorySnapshotStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositorySnapshotStats implements JsonpSerializable {
	@Nullable
	private final Time totalReadThrottledTime;

	@Nullable
	private final Time totalWriteThrottledTime;

	private final long totalReadThrottledTimeNanos;

	private final long totalWriteThrottledTimeNanos;

	private final long shardSnapshotsStarted;

	private final long shardSnapshotsCompleted;

	private final long shardSnapshotsInProgress;

	private final long uploadedBlobs;

	@Nullable
	private final String uploadedSize;

	private final long uploadedSizeInBytes;

	@Nullable
	private final Time totalUploadTime;

	private final long totalUploadTimeInMillis;

	@Nullable
	private final Time totalReadTime;

	private final long totalReadTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private RepositorySnapshotStats(Builder builder) {

		this.totalReadThrottledTime = builder.totalReadThrottledTime;
		this.totalWriteThrottledTime = builder.totalWriteThrottledTime;
		this.totalReadThrottledTimeNanos = ApiTypeHelper.requireNonNull(builder.totalReadThrottledTimeNanos, this,
				"totalReadThrottledTimeNanos", 0);
		this.totalWriteThrottledTimeNanos = ApiTypeHelper.requireNonNull(builder.totalWriteThrottledTimeNanos, this,
				"totalWriteThrottledTimeNanos", 0);
		this.shardSnapshotsStarted = ApiTypeHelper.requireNonNull(builder.shardSnapshotsStarted, this,
				"shardSnapshotsStarted", 0);
		this.shardSnapshotsCompleted = ApiTypeHelper.requireNonNull(builder.shardSnapshotsCompleted, this,
				"shardSnapshotsCompleted", 0);
		this.shardSnapshotsInProgress = ApiTypeHelper.requireNonNull(builder.shardSnapshotsInProgress, this,
				"shardSnapshotsInProgress", 0);
		this.uploadedBlobs = ApiTypeHelper.requireNonNull(builder.uploadedBlobs, this, "uploadedBlobs", 0);
		this.uploadedSize = builder.uploadedSize;
		this.uploadedSizeInBytes = ApiTypeHelper.requireNonNull(builder.uploadedSizeInBytes, this,
				"uploadedSizeInBytes", 0);
		this.totalUploadTime = builder.totalUploadTime;
		this.totalUploadTimeInMillis = ApiTypeHelper.requireNonNull(builder.totalUploadTimeInMillis, this,
				"totalUploadTimeInMillis", 0);
		this.totalReadTime = builder.totalReadTime;
		this.totalReadTimeInMillis = ApiTypeHelper.requireNonNull(builder.totalReadTimeInMillis, this,
				"totalReadTimeInMillis", 0);

	}

	public static RepositorySnapshotStats of(Function<Builder, ObjectBuilder<RepositorySnapshotStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The cumulative time spent throttling read operations for this repository.
	 * <p>
	 * API name: {@code total_read_throttled_time}
	 */
	@Nullable
	public final Time totalReadThrottledTime() {
		return this.totalReadThrottledTime;
	}

	/**
	 * The cumulative time spent throttling write operations for this repository.
	 * <p>
	 * API name: {@code total_write_throttled_time}
	 */
	@Nullable
	public final Time totalWriteThrottledTime() {
		return this.totalWriteThrottledTime;
	}

	/**
	 * Required - The cumulative time, in nanoseconds, spent throttling read
	 * operations for this repository.
	 * <p>
	 * API name: {@code total_read_throttled_time_nanos}
	 */
	public final long totalReadThrottledTimeNanos() {
		return this.totalReadThrottledTimeNanos;
	}

	/**
	 * Required - The cumulative time, in nanoseconds, spent throttling write
	 * operations for this repository.
	 * <p>
	 * API name: {@code total_write_throttled_time_nanos}
	 */
	public final long totalWriteThrottledTimeNanos() {
		return this.totalWriteThrottledTimeNanos;
	}

	/**
	 * Required - The number of shard snapshots started for this repository.
	 * <p>
	 * API name: {@code shard_snapshots_started}
	 */
	public final long shardSnapshotsStarted() {
		return this.shardSnapshotsStarted;
	}

	/**
	 * Required - The number of shard snapshots completed for this repository.
	 * <p>
	 * API name: {@code shard_snapshots_completed}
	 */
	public final long shardSnapshotsCompleted() {
		return this.shardSnapshotsCompleted;
	}

	/**
	 * Required - The number of shard snapshots currently in progress for this
	 * repository.
	 * <p>
	 * API name: {@code shard_snapshots_in_progress}
	 */
	public final long shardSnapshotsInProgress() {
		return this.shardSnapshotsInProgress;
	}

	/**
	 * Required - The number of blobs uploaded to this repository.
	 * <p>
	 * API name: {@code uploaded_blobs}
	 */
	public final long uploadedBlobs() {
		return this.uploadedBlobs;
	}

	/**
	 * The cumulative size of the blobs uploaded to this repository.
	 * <p>
	 * API name: {@code uploaded_size}
	 */
	@Nullable
	public final String uploadedSize() {
		return this.uploadedSize;
	}

	/**
	 * Required - The cumulative size, in bytes, of the blobs uploaded to this
	 * repository.
	 * <p>
	 * API name: {@code uploaded_size_in_bytes}
	 */
	public final long uploadedSizeInBytes() {
		return this.uploadedSizeInBytes;
	}

	/**
	 * The cumulative time spent uploading blobs to this repository.
	 * <p>
	 * API name: {@code total_upload_time}
	 */
	@Nullable
	public final Time totalUploadTime() {
		return this.totalUploadTime;
	}

	/**
	 * Required - The cumulative time, in milliseconds, spent uploading blobs to
	 * this repository.
	 * <p>
	 * API name: {@code total_upload_time_in_millis}
	 */
	public final long totalUploadTimeInMillis() {
		return this.totalUploadTimeInMillis;
	}

	/**
	 * The cumulative time spent reading blobs while uploading to this repository.
	 * <p>
	 * API name: {@code total_read_time}
	 */
	@Nullable
	public final Time totalReadTime() {
		return this.totalReadTime;
	}

	/**
	 * Required - The cumulative time, in milliseconds, spent reading blobs while
	 * uploading to this repository.
	 * <p>
	 * API name: {@code total_read_time_in_millis}
	 */
	public final long totalReadTimeInMillis() {
		return this.totalReadTimeInMillis;
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

		if (this.totalReadThrottledTime != null) {
			generator.writeKey("total_read_throttled_time");
			this.totalReadThrottledTime.serialize(generator, mapper);

		}
		if (this.totalWriteThrottledTime != null) {
			generator.writeKey("total_write_throttled_time");
			this.totalWriteThrottledTime.serialize(generator, mapper);

		}
		generator.writeKey("total_read_throttled_time_nanos");
		generator.write(this.totalReadThrottledTimeNanos);

		generator.writeKey("total_write_throttled_time_nanos");
		generator.write(this.totalWriteThrottledTimeNanos);

		generator.writeKey("shard_snapshots_started");
		generator.write(this.shardSnapshotsStarted);

		generator.writeKey("shard_snapshots_completed");
		generator.write(this.shardSnapshotsCompleted);

		generator.writeKey("shard_snapshots_in_progress");
		generator.write(this.shardSnapshotsInProgress);

		generator.writeKey("uploaded_blobs");
		generator.write(this.uploadedBlobs);

		if (this.uploadedSize != null) {
			generator.writeKey("uploaded_size");
			generator.write(this.uploadedSize);

		}
		generator.writeKey("uploaded_size_in_bytes");
		generator.write(this.uploadedSizeInBytes);

		if (this.totalUploadTime != null) {
			generator.writeKey("total_upload_time");
			this.totalUploadTime.serialize(generator, mapper);

		}
		generator.writeKey("total_upload_time_in_millis");
		generator.write(this.totalUploadTimeInMillis);

		if (this.totalReadTime != null) {
			generator.writeKey("total_read_time");
			this.totalReadTime.serialize(generator, mapper);

		}
		generator.writeKey("total_read_time_in_millis");
		generator.write(this.totalReadTimeInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositorySnapshotStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositorySnapshotStats> {
		@Nullable
		private Time totalReadThrottledTime;

		@Nullable
		private Time totalWriteThrottledTime;

		private Long totalReadThrottledTimeNanos;

		private Long totalWriteThrottledTimeNanos;

		private Long shardSnapshotsStarted;

		private Long shardSnapshotsCompleted;

		private Long shardSnapshotsInProgress;

		private Long uploadedBlobs;

		@Nullable
		private String uploadedSize;

		private Long uploadedSizeInBytes;

		@Nullable
		private Time totalUploadTime;

		private Long totalUploadTimeInMillis;

		@Nullable
		private Time totalReadTime;

		private Long totalReadTimeInMillis;

		public Builder() {
		}
		private Builder(RepositorySnapshotStats instance) {
			this.totalReadThrottledTime = instance.totalReadThrottledTime;
			this.totalWriteThrottledTime = instance.totalWriteThrottledTime;
			this.totalReadThrottledTimeNanos = instance.totalReadThrottledTimeNanos;
			this.totalWriteThrottledTimeNanos = instance.totalWriteThrottledTimeNanos;
			this.shardSnapshotsStarted = instance.shardSnapshotsStarted;
			this.shardSnapshotsCompleted = instance.shardSnapshotsCompleted;
			this.shardSnapshotsInProgress = instance.shardSnapshotsInProgress;
			this.uploadedBlobs = instance.uploadedBlobs;
			this.uploadedSize = instance.uploadedSize;
			this.uploadedSizeInBytes = instance.uploadedSizeInBytes;
			this.totalUploadTime = instance.totalUploadTime;
			this.totalUploadTimeInMillis = instance.totalUploadTimeInMillis;
			this.totalReadTime = instance.totalReadTime;
			this.totalReadTimeInMillis = instance.totalReadTimeInMillis;

		}
		/**
		 * The cumulative time spent throttling read operations for this repository.
		 * <p>
		 * API name: {@code total_read_throttled_time}
		 */
		public final Builder totalReadThrottledTime(@Nullable Time value) {
			this.totalReadThrottledTime = value;
			return this;
		}

		/**
		 * The cumulative time spent throttling read operations for this repository.
		 * <p>
		 * API name: {@code total_read_throttled_time}
		 */
		public final Builder totalReadThrottledTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalReadThrottledTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative time spent throttling write operations for this repository.
		 * <p>
		 * API name: {@code total_write_throttled_time}
		 */
		public final Builder totalWriteThrottledTime(@Nullable Time value) {
			this.totalWriteThrottledTime = value;
			return this;
		}

		/**
		 * The cumulative time spent throttling write operations for this repository.
		 * <p>
		 * API name: {@code total_write_throttled_time}
		 */
		public final Builder totalWriteThrottledTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalWriteThrottledTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The cumulative time, in nanoseconds, spent throttling read
		 * operations for this repository.
		 * <p>
		 * API name: {@code total_read_throttled_time_nanos}
		 */
		public final Builder totalReadThrottledTimeNanos(long value) {
			this.totalReadThrottledTimeNanos = value;
			return this;
		}

		/**
		 * Required - The cumulative time, in nanoseconds, spent throttling write
		 * operations for this repository.
		 * <p>
		 * API name: {@code total_write_throttled_time_nanos}
		 */
		public final Builder totalWriteThrottledTimeNanos(long value) {
			this.totalWriteThrottledTimeNanos = value;
			return this;
		}

		/**
		 * Required - The number of shard snapshots started for this repository.
		 * <p>
		 * API name: {@code shard_snapshots_started}
		 */
		public final Builder shardSnapshotsStarted(long value) {
			this.shardSnapshotsStarted = value;
			return this;
		}

		/**
		 * Required - The number of shard snapshots completed for this repository.
		 * <p>
		 * API name: {@code shard_snapshots_completed}
		 */
		public final Builder shardSnapshotsCompleted(long value) {
			this.shardSnapshotsCompleted = value;
			return this;
		}

		/**
		 * Required - The number of shard snapshots currently in progress for this
		 * repository.
		 * <p>
		 * API name: {@code shard_snapshots_in_progress}
		 */
		public final Builder shardSnapshotsInProgress(long value) {
			this.shardSnapshotsInProgress = value;
			return this;
		}

		/**
		 * Required - The number of blobs uploaded to this repository.
		 * <p>
		 * API name: {@code uploaded_blobs}
		 */
		public final Builder uploadedBlobs(long value) {
			this.uploadedBlobs = value;
			return this;
		}

		/**
		 * The cumulative size of the blobs uploaded to this repository.
		 * <p>
		 * API name: {@code uploaded_size}
		 */
		public final Builder uploadedSize(@Nullable String value) {
			this.uploadedSize = value;
			return this;
		}

		/**
		 * Required - The cumulative size, in bytes, of the blobs uploaded to this
		 * repository.
		 * <p>
		 * API name: {@code uploaded_size_in_bytes}
		 */
		public final Builder uploadedSizeInBytes(long value) {
			this.uploadedSizeInBytes = value;
			return this;
		}

		/**
		 * The cumulative time spent uploading blobs to this repository.
		 * <p>
		 * API name: {@code total_upload_time}
		 */
		public final Builder totalUploadTime(@Nullable Time value) {
			this.totalUploadTime = value;
			return this;
		}

		/**
		 * The cumulative time spent uploading blobs to this repository.
		 * <p>
		 * API name: {@code total_upload_time}
		 */
		public final Builder totalUploadTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalUploadTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The cumulative time, in milliseconds, spent uploading blobs to
		 * this repository.
		 * <p>
		 * API name: {@code total_upload_time_in_millis}
		 */
		public final Builder totalUploadTimeInMillis(long value) {
			this.totalUploadTimeInMillis = value;
			return this;
		}

		/**
		 * The cumulative time spent reading blobs while uploading to this repository.
		 * <p>
		 * API name: {@code total_read_time}
		 */
		public final Builder totalReadTime(@Nullable Time value) {
			this.totalReadTime = value;
			return this;
		}

		/**
		 * The cumulative time spent reading blobs while uploading to this repository.
		 * <p>
		 * API name: {@code total_read_time}
		 */
		public final Builder totalReadTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalReadTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The cumulative time, in milliseconds, spent reading blobs while
		 * uploading to this repository.
		 * <p>
		 * API name: {@code total_read_time_in_millis}
		 */
		public final Builder totalReadTimeInMillis(long value) {
			this.totalReadTimeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositorySnapshotStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositorySnapshotStats build() {
			_checkSingleUse();

			return new RepositorySnapshotStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositorySnapshotStats}
	 */
	public static final JsonpDeserializer<RepositorySnapshotStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositorySnapshotStats::setupRepositorySnapshotStatsDeserializer);

	protected static void setupRepositorySnapshotStatsDeserializer(
			ObjectDeserializer<RepositorySnapshotStats.Builder> op) {

		op.add(Builder::totalReadThrottledTime, Time._DESERIALIZER, "total_read_throttled_time");
		op.add(Builder::totalWriteThrottledTime, Time._DESERIALIZER, "total_write_throttled_time");
		op.add(Builder::totalReadThrottledTimeNanos, JsonpDeserializer.longDeserializer(),
				"total_read_throttled_time_nanos");
		op.add(Builder::totalWriteThrottledTimeNanos, JsonpDeserializer.longDeserializer(),
				"total_write_throttled_time_nanos");
		op.add(Builder::shardSnapshotsStarted, JsonpDeserializer.longDeserializer(), "shard_snapshots_started");
		op.add(Builder::shardSnapshotsCompleted, JsonpDeserializer.longDeserializer(), "shard_snapshots_completed");
		op.add(Builder::shardSnapshotsInProgress, JsonpDeserializer.longDeserializer(), "shard_snapshots_in_progress");
		op.add(Builder::uploadedBlobs, JsonpDeserializer.longDeserializer(), "uploaded_blobs");
		op.add(Builder::uploadedSize, JsonpDeserializer.stringDeserializer(), "uploaded_size");
		op.add(Builder::uploadedSizeInBytes, JsonpDeserializer.longDeserializer(), "uploaded_size_in_bytes");
		op.add(Builder::totalUploadTime, Time._DESERIALIZER, "total_upload_time");
		op.add(Builder::totalUploadTimeInMillis, JsonpDeserializer.longDeserializer(), "total_upload_time_in_millis");
		op.add(Builder::totalReadTime, Time._DESERIALIZER, "total_read_time");
		op.add(Builder::totalReadTimeInMillis, JsonpDeserializer.longDeserializer(), "total_read_time_in_millis");

	}

}
