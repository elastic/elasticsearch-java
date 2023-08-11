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

package co.elastic.clients.elasticsearch.cat.ml_data_frame_analytics;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_data_frame_analytics.DataFrameAnalyticsRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.ml_data_frame_analytics.DataFrameAnalyticsRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataFrameAnalyticsRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String type;

	@Nullable
	private final String createTime;

	@Nullable
	private final String version;

	@Nullable
	private final String sourceIndex;

	@Nullable
	private final String destIndex;

	@Nullable
	private final String description;

	@Nullable
	private final String modelMemoryLimit;

	@Nullable
	private final String state;

	@Nullable
	private final String failureReason;

	@Nullable
	private final String progress;

	@Nullable
	private final String assignmentExplanation;

	@Nullable
	private final String nodeId;

	@Nullable
	private final String nodeName;

	@Nullable
	private final String nodeEphemeralId;

	@Nullable
	private final String nodeAddress;

	// ---------------------------------------------------------------------------------------------

	private DataFrameAnalyticsRecord(Builder builder) {

		this.id = builder.id;
		this.type = builder.type;
		this.createTime = builder.createTime;
		this.version = builder.version;
		this.sourceIndex = builder.sourceIndex;
		this.destIndex = builder.destIndex;
		this.description = builder.description;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.state = builder.state;
		this.failureReason = builder.failureReason;
		this.progress = builder.progress;
		this.assignmentExplanation = builder.assignmentExplanation;
		this.nodeId = builder.nodeId;
		this.nodeName = builder.nodeName;
		this.nodeEphemeralId = builder.nodeEphemeralId;
		this.nodeAddress = builder.nodeAddress;

	}

	public static DataFrameAnalyticsRecord of(Function<Builder, ObjectBuilder<DataFrameAnalyticsRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The identifier for the job.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The type of analysis that the job performs.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * The time when the job was created.
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public final String createTime() {
		return this.createTime;
	}

	/**
	 * The version of Elasticsearch when the job was created.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * The name of the source index.
	 * <p>
	 * API name: {@code source_index}
	 */
	@Nullable
	public final String sourceIndex() {
		return this.sourceIndex;
	}

	/**
	 * The name of the destination index.
	 * <p>
	 * API name: {@code dest_index}
	 */
	@Nullable
	public final String destIndex() {
		return this.destIndex;
	}

	/**
	 * A description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The approximate maximum amount of memory resources that are permitted for the
	 * job.
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * The current status of the job.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final String state() {
		return this.state;
	}

	/**
	 * Messages about the reason why the job failed.
	 * <p>
	 * API name: {@code failure_reason}
	 */
	@Nullable
	public final String failureReason() {
		return this.failureReason;
	}

	/**
	 * The progress report for the job by phase.
	 * <p>
	 * API name: {@code progress}
	 */
	@Nullable
	public final String progress() {
		return this.progress;
	}

	/**
	 * Messages related to the selection of a node.
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public final String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * The unique identifier of the assigned node.
	 * <p>
	 * API name: {@code node.id}
	 */
	@Nullable
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * The name of the assigned node.
	 * <p>
	 * API name: {@code node.name}
	 */
	@Nullable
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * The ephemeral identifier of the assigned node.
	 * <p>
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public final String nodeEphemeralId() {
		return this.nodeEphemeralId;
	}

	/**
	 * The network address of the assigned node.
	 * <p>
	 * API name: {@code node.address}
	 */
	@Nullable
	public final String nodeAddress() {
		return this.nodeAddress;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.createTime != null) {
			generator.writeKey("create_time");
			generator.write(this.createTime);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.sourceIndex != null) {
			generator.writeKey("source_index");
			generator.write(this.sourceIndex);

		}
		if (this.destIndex != null) {
			generator.writeKey("dest_index");
			generator.write(this.destIndex);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelMemoryLimit != null) {
			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}
		if (this.state != null) {
			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.failureReason != null) {
			generator.writeKey("failure_reason");
			generator.write(this.failureReason);

		}
		if (this.progress != null) {
			generator.writeKey("progress");
			generator.write(this.progress);

		}
		if (this.assignmentExplanation != null) {
			generator.writeKey("assignment_explanation");
			generator.write(this.assignmentExplanation);

		}
		if (this.nodeId != null) {
			generator.writeKey("node.id");
			generator.write(this.nodeId);

		}
		if (this.nodeName != null) {
			generator.writeKey("node.name");
			generator.write(this.nodeName);

		}
		if (this.nodeEphemeralId != null) {
			generator.writeKey("node.ephemeral_id");
			generator.write(this.nodeEphemeralId);

		}
		if (this.nodeAddress != null) {
			generator.writeKey("node.address");
			generator.write(this.nodeAddress);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataFrameAnalyticsRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataFrameAnalyticsRecord> {
		@Nullable
		private String id;

		@Nullable
		private String type;

		@Nullable
		private String createTime;

		@Nullable
		private String version;

		@Nullable
		private String sourceIndex;

		@Nullable
		private String destIndex;

		@Nullable
		private String description;

		@Nullable
		private String modelMemoryLimit;

		@Nullable
		private String state;

		@Nullable
		private String failureReason;

		@Nullable
		private String progress;

		@Nullable
		private String assignmentExplanation;

		@Nullable
		private String nodeId;

		@Nullable
		private String nodeName;

		@Nullable
		private String nodeEphemeralId;

		@Nullable
		private String nodeAddress;

		/**
		 * The identifier for the job.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The type of analysis that the job performs.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * The time when the job was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * The version of Elasticsearch when the job was created.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * The name of the source index.
		 * <p>
		 * API name: {@code source_index}
		 */
		public final Builder sourceIndex(@Nullable String value) {
			this.sourceIndex = value;
			return this;
		}

		/**
		 * The name of the destination index.
		 * <p>
		 * API name: {@code dest_index}
		 */
		public final Builder destIndex(@Nullable String value) {
			this.destIndex = value;
			return this;
		}

		/**
		 * A description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The approximate maximum amount of memory resources that are permitted for the
		 * job.
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * The current status of the job.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * Messages about the reason why the job failed.
		 * <p>
		 * API name: {@code failure_reason}
		 */
		public final Builder failureReason(@Nullable String value) {
			this.failureReason = value;
			return this;
		}

		/**
		 * The progress report for the job by phase.
		 * <p>
		 * API name: {@code progress}
		 */
		public final Builder progress(@Nullable String value) {
			this.progress = value;
			return this;
		}

		/**
		 * Messages related to the selection of a node.
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public final Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * The unique identifier of the assigned node.
		 * <p>
		 * API name: {@code node.id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * The name of the assigned node.
		 * <p>
		 * API name: {@code node.name}
		 */
		public final Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * The ephemeral identifier of the assigned node.
		 * <p>
		 * API name: {@code node.ephemeral_id}
		 */
		public final Builder nodeEphemeralId(@Nullable String value) {
			this.nodeEphemeralId = value;
			return this;
		}

		/**
		 * The network address of the assigned node.
		 * <p>
		 * API name: {@code node.address}
		 */
		public final Builder nodeAddress(@Nullable String value) {
			this.nodeAddress = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataFrameAnalyticsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataFrameAnalyticsRecord build() {
			_checkSingleUse();

			return new DataFrameAnalyticsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataFrameAnalyticsRecord}
	 */
	public static final JsonpDeserializer<DataFrameAnalyticsRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataFrameAnalyticsRecord::setupDataFrameAnalyticsRecordDeserializer);

	protected static void setupDataFrameAnalyticsRecordDeserializer(
			ObjectDeserializer<DataFrameAnalyticsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type", "t");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time", "ct", "createTime");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::sourceIndex, JsonpDeserializer.stringDeserializer(), "source_index", "si", "sourceIndex");
		op.add(Builder::destIndex, JsonpDeserializer.stringDeserializer(), "dest_index", "di", "destIndex");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description", "d");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit", "mml",
				"modelMemoryLimit");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state", "s");
		op.add(Builder::failureReason, JsonpDeserializer.stringDeserializer(), "failure_reason", "fr", "failureReason");
		op.add(Builder::progress, JsonpDeserializer.stringDeserializer(), "progress", "p");
		op.add(Builder::assignmentExplanation, JsonpDeserializer.stringDeserializer(), "assignment_explanation", "ae",
				"assignmentExplanation");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node.id", "ni", "nodeId");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node.name", "nn", "nodeName");
		op.add(Builder::nodeEphemeralId, JsonpDeserializer.stringDeserializer(), "node.ephemeral_id", "ne",
				"nodeEphemeralId");
		op.add(Builder::nodeAddress, JsonpDeserializer.stringDeserializer(), "node.address", "na", "nodeAddress");

	}

}
