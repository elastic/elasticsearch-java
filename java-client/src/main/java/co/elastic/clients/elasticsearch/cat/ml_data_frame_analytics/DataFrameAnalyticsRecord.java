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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_data_frame_analytics.DataFrameAnalyticsRecord
@JsonpDeserializable
public final class DataFrameAnalyticsRecord implements JsonpSerializable {
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

	public DataFrameAnalyticsRecord(Builder builder) {

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

	public DataFrameAnalyticsRecord(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * the id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * analysis type
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * job creation time
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public String createTime() {
		return this.createTime;
	}

	/**
	 * the version of Elasticsearch when the analytics was created
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * source index
	 * <p>
	 * API name: {@code source_index}
	 */
	@Nullable
	public String sourceIndex() {
		return this.sourceIndex;
	}

	/**
	 * destination index
	 * <p>
	 * API name: {@code dest_index}
	 */
	@Nullable
	public String destIndex() {
		return this.destIndex;
	}

	/**
	 * description
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * model memory limit
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * job state
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public String state() {
		return this.state;
	}

	/**
	 * failure reason
	 * <p>
	 * API name: {@code failure_reason}
	 */
	@Nullable
	public String failureReason() {
		return this.failureReason;
	}

	/**
	 * progress
	 * <p>
	 * API name: {@code progress}
	 */
	@Nullable
	public String progress() {
		return this.progress;
	}

	/**
	 * why the job is or is not assigned to a node
	 * <p>
	 * API name: {@code assignment_explanation}
	 */
	@Nullable
	public String assignmentExplanation() {
		return this.assignmentExplanation;
	}

	/**
	 * id of the assigned node
	 * <p>
	 * API name: {@code node.id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * name of the assigned node
	 * <p>
	 * API name: {@code node.name}
	 */
	@Nullable
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * ephemeral id of the assigned node
	 * <p>
	 * API name: {@code node.ephemeral_id}
	 */
	@Nullable
	public String nodeEphemeralId() {
		return this.nodeEphemeralId;
	}

	/**
	 * network address of the assigned node
	 * <p>
	 * API name: {@code node.address}
	 */
	@Nullable
	public String nodeAddress() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataFrameAnalyticsRecord}.
	 */
	public static class Builder implements ObjectBuilder<DataFrameAnalyticsRecord> {
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
		 * the id
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * analysis type
		 * <p>
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * job creation time
		 * <p>
		 * API name: {@code create_time}
		 */
		public Builder createTime(@Nullable String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * the version of Elasticsearch when the analytics was created
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * source index
		 * <p>
		 * API name: {@code source_index}
		 */
		public Builder sourceIndex(@Nullable String value) {
			this.sourceIndex = value;
			return this;
		}

		/**
		 * destination index
		 * <p>
		 * API name: {@code dest_index}
		 */
		public Builder destIndex(@Nullable String value) {
			this.destIndex = value;
			return this;
		}

		/**
		 * description
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * model memory limit
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * job state
		 * <p>
		 * API name: {@code state}
		 */
		public Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * failure reason
		 * <p>
		 * API name: {@code failure_reason}
		 */
		public Builder failureReason(@Nullable String value) {
			this.failureReason = value;
			return this;
		}

		/**
		 * progress
		 * <p>
		 * API name: {@code progress}
		 */
		public Builder progress(@Nullable String value) {
			this.progress = value;
			return this;
		}

		/**
		 * why the job is or is not assigned to a node
		 * <p>
		 * API name: {@code assignment_explanation}
		 */
		public Builder assignmentExplanation(@Nullable String value) {
			this.assignmentExplanation = value;
			return this;
		}

		/**
		 * id of the assigned node
		 * <p>
		 * API name: {@code node.id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * name of the assigned node
		 * <p>
		 * API name: {@code node.name}
		 */
		public Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * ephemeral id of the assigned node
		 * <p>
		 * API name: {@code node.ephemeral_id}
		 */
		public Builder nodeEphemeralId(@Nullable String value) {
			this.nodeEphemeralId = value;
			return this;
		}

		/**
		 * network address of the assigned node
		 * <p>
		 * API name: {@code node.address}
		 */
		public Builder nodeAddress(@Nullable String value) {
			this.nodeAddress = value;
			return this;
		}

		/**
		 * Builds a {@link DataFrameAnalyticsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataFrameAnalyticsRecord build() {

			return new DataFrameAnalyticsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataFrameAnalyticsRecord}
	 */
	public static final JsonpDeserializer<DataFrameAnalyticsRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataFrameAnalyticsRecord::setupDataFrameAnalyticsRecordDeserializer, Builder::build);

	protected static void setupDataFrameAnalyticsRecordDeserializer(
			DelegatingDeserializer<DataFrameAnalyticsRecord.Builder> op) {

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
