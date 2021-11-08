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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ModelSnapshot
@JsonpDeserializable
public class ModelSnapshot implements JsonpSerializable {
	@Nullable
	private final String description;

	private final String jobId;

	private final int latestRecordTimeStamp;

	private final int latestResultTimeStamp;

	private final String minVersion;

	private final ModelSizeStats modelSizeStats;

	private final boolean retain;

	private final long snapshotDocCount;

	private final String snapshotId;

	private final int timestamp;

	// ---------------------------------------------------------------------------------------------

	private ModelSnapshot(Builder builder) {

		this.description = builder.description;
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.latestRecordTimeStamp = ModelTypeHelper.requireNonNull(builder.latestRecordTimeStamp, this,
				"latestRecordTimeStamp");
		this.latestResultTimeStamp = ModelTypeHelper.requireNonNull(builder.latestResultTimeStamp, this,
				"latestResultTimeStamp");
		this.minVersion = ModelTypeHelper.requireNonNull(builder.minVersion, this, "minVersion");
		this.modelSizeStats = ModelTypeHelper.requireNonNull(builder.modelSizeStats, this, "modelSizeStats");
		this.retain = ModelTypeHelper.requireNonNull(builder.retain, this, "retain");
		this.snapshotDocCount = ModelTypeHelper.requireNonNull(builder.snapshotDocCount, this, "snapshotDocCount");
		this.snapshotId = ModelTypeHelper.requireNonNull(builder.snapshotId, this, "snapshotId");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static ModelSnapshot of(Function<Builder, ObjectBuilder<ModelSnapshot>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An optional description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - A numerical character string that uniquely identifies the job that
	 * the snapshot was created for.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - The timestamp of the latest processed record.
	 * <p>
	 * API name: {@code latest_record_time_stamp}
	 */
	public final int latestRecordTimeStamp() {
		return this.latestRecordTimeStamp;
	}

	/**
	 * Required - The timestamp of the latest bucket result.
	 * <p>
	 * API name: {@code latest_result_time_stamp}
	 */
	public final int latestResultTimeStamp() {
		return this.latestResultTimeStamp;
	}

	/**
	 * Required - The minimum version required to be able to restore the model
	 * snapshot.
	 * <p>
	 * API name: {@code min_version}
	 */
	public final String minVersion() {
		return this.minVersion;
	}

	/**
	 * Required - Summary information describing the model.
	 * <p>
	 * API name: {@code model_size_stats}
	 */
	public final ModelSizeStats modelSizeStats() {
		return this.modelSizeStats;
	}

	/**
	 * Required - If true, this snapshot will not be deleted during automatic
	 * cleanup of snapshots older than model_snapshot_retention_days. However, this
	 * snapshot will be deleted when the job is deleted. The default value is false.
	 * <p>
	 * API name: {@code retain}
	 */
	public final boolean retain() {
		return this.retain;
	}

	/**
	 * Required - For internal use only.
	 * <p>
	 * API name: {@code snapshot_doc_count}
	 */
	public final long snapshotDocCount() {
		return this.snapshotDocCount;
	}

	/**
	 * Required - A numerical character string that uniquely identifies the model
	 * snapshot.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	public final String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * Required - The creation timestamp for the snapshot.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final int timestamp() {
		return this.timestamp;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("latest_record_time_stamp");
		generator.write(this.latestRecordTimeStamp);

		generator.writeKey("latest_result_time_stamp");
		generator.write(this.latestResultTimeStamp);

		generator.writeKey("min_version");
		generator.write(this.minVersion);

		generator.writeKey("model_size_stats");
		this.modelSizeStats.serialize(generator, mapper);

		generator.writeKey("retain");
		generator.write(this.retain);

		generator.writeKey("snapshot_doc_count");
		generator.write(this.snapshotDocCount);

		generator.writeKey("snapshot_id");
		generator.write(this.snapshotId);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelSnapshot}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ModelSnapshot> {
		@Nullable
		private String description;

		private String jobId;

		private Integer latestRecordTimeStamp;

		private Integer latestResultTimeStamp;

		private String minVersion;

		private ModelSizeStats modelSizeStats;

		private Boolean retain;

		private Long snapshotDocCount;

		private String snapshotId;

		private Integer timestamp;

		/**
		 * An optional description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - A numerical character string that uniquely identifies the job that
		 * the snapshot was created for.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - The timestamp of the latest processed record.
		 * <p>
		 * API name: {@code latest_record_time_stamp}
		 */
		public final Builder latestRecordTimeStamp(int value) {
			this.latestRecordTimeStamp = value;
			return this;
		}

		/**
		 * Required - The timestamp of the latest bucket result.
		 * <p>
		 * API name: {@code latest_result_time_stamp}
		 */
		public final Builder latestResultTimeStamp(int value) {
			this.latestResultTimeStamp = value;
			return this;
		}

		/**
		 * Required - The minimum version required to be able to restore the model
		 * snapshot.
		 * <p>
		 * API name: {@code min_version}
		 */
		public final Builder minVersion(String value) {
			this.minVersion = value;
			return this;
		}

		/**
		 * Required - Summary information describing the model.
		 * <p>
		 * API name: {@code model_size_stats}
		 */
		public final Builder modelSizeStats(ModelSizeStats value) {
			this.modelSizeStats = value;
			return this;
		}

		/**
		 * Required - Summary information describing the model.
		 * <p>
		 * API name: {@code model_size_stats}
		 */
		public final Builder modelSizeStats(Function<ModelSizeStats.Builder, ObjectBuilder<ModelSizeStats>> fn) {
			return this.modelSizeStats(fn.apply(new ModelSizeStats.Builder()).build());
		}

		/**
		 * Required - If true, this snapshot will not be deleted during automatic
		 * cleanup of snapshots older than model_snapshot_retention_days. However, this
		 * snapshot will be deleted when the job is deleted. The default value is false.
		 * <p>
		 * API name: {@code retain}
		 */
		public final Builder retain(boolean value) {
			this.retain = value;
			return this;
		}

		/**
		 * Required - For internal use only.
		 * <p>
		 * API name: {@code snapshot_doc_count}
		 */
		public final Builder snapshotDocCount(long value) {
			this.snapshotDocCount = value;
			return this;
		}

		/**
		 * Required - A numerical character string that uniquely identifies the model
		 * snapshot.
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public final Builder snapshotId(String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * Required - The creation timestamp for the snapshot.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(int value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ModelSnapshot}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelSnapshot build() {
			_checkSingleUse();

			return new ModelSnapshot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelSnapshot}
	 */
	public static final JsonpDeserializer<ModelSnapshot> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ModelSnapshot::setupModelSnapshotDeserializer, Builder::build);

	protected static void setupModelSnapshotDeserializer(DelegatingDeserializer<ModelSnapshot.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::latestRecordTimeStamp, JsonpDeserializer.integerDeserializer(), "latest_record_time_stamp");
		op.add(Builder::latestResultTimeStamp, JsonpDeserializer.integerDeserializer(), "latest_result_time_stamp");
		op.add(Builder::minVersion, JsonpDeserializer.stringDeserializer(), "min_version");
		op.add(Builder::modelSizeStats, ModelSizeStats._DESERIALIZER, "model_size_stats");
		op.add(Builder::retain, JsonpDeserializer.booleanDeserializer(), "retain");
		op.add(Builder::snapshotDocCount, JsonpDeserializer.longDeserializer(), "snapshot_doc_count");
		op.add(Builder::snapshotId, JsonpDeserializer.stringDeserializer(), "snapshot_id");
		op.add(Builder::timestamp, JsonpDeserializer.integerDeserializer(), "timestamp");

	}

}
