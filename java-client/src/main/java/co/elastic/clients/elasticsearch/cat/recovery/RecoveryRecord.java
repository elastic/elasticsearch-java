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

package co.elastic.clients.elasticsearch.cat.recovery;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cat.recovery.RecoveryRecord
public final class RecoveryRecord implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String shard;

	@Nullable
	private final String startTime;

	@Nullable
	private final String startTimeMillis;

	@Nullable
	private final String stopTime;

	@Nullable
	private final String stopTimeMillis;

	@Nullable
	private final String time;

	@Nullable
	private final String type;

	@Nullable
	private final String stage;

	@Nullable
	private final String sourceHost;

	@Nullable
	private final String sourceNode;

	@Nullable
	private final String targetHost;

	@Nullable
	private final String targetNode;

	@Nullable
	private final String repository;

	@Nullable
	private final String snapshot;

	@Nullable
	private final String files;

	@Nullable
	private final String filesRecovered;

	@Nullable
	private final JsonValue filesPercent;

	@Nullable
	private final String filesTotal;

	@Nullable
	private final String bytes;

	@Nullable
	private final String bytesRecovered;

	@Nullable
	private final JsonValue bytesPercent;

	@Nullable
	private final String bytesTotal;

	@Nullable
	private final String translogOps;

	@Nullable
	private final String translogOpsRecovered;

	@Nullable
	private final JsonValue translogOpsPercent;

	// ---------------------------------------------------------------------------------------------

	public RecoveryRecord(Builder builder) {

		this.index = builder.index;
		this.shard = builder.shard;
		this.startTime = builder.startTime;
		this.startTimeMillis = builder.startTimeMillis;
		this.stopTime = builder.stopTime;
		this.stopTimeMillis = builder.stopTimeMillis;
		this.time = builder.time;
		this.type = builder.type;
		this.stage = builder.stage;
		this.sourceHost = builder.sourceHost;
		this.sourceNode = builder.sourceNode;
		this.targetHost = builder.targetHost;
		this.targetNode = builder.targetNode;
		this.repository = builder.repository;
		this.snapshot = builder.snapshot;
		this.files = builder.files;
		this.filesRecovered = builder.filesRecovered;
		this.filesPercent = builder.filesPercent;
		this.filesTotal = builder.filesTotal;
		this.bytes = builder.bytes;
		this.bytesRecovered = builder.bytesRecovered;
		this.bytesPercent = builder.bytesPercent;
		this.bytesTotal = builder.bytesTotal;
		this.translogOps = builder.translogOps;
		this.translogOpsRecovered = builder.translogOpsRecovered;
		this.translogOpsPercent = builder.translogOpsPercent;

	}

	/**
	 * index name
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * shard name
	 * <p>
	 * API name: {@code shard}
	 */
	@Nullable
	public String shard() {
		return this.shard;
	}

	/**
	 * recovery start time
	 * <p>
	 * API name: {@code start_time}
	 */
	@Nullable
	public String startTime() {
		return this.startTime;
	}

	/**
	 * recovery start time in epoch milliseconds
	 * <p>
	 * API name: {@code start_time_millis}
	 */
	@Nullable
	public String startTimeMillis() {
		return this.startTimeMillis;
	}

	/**
	 * recovery stop time
	 * <p>
	 * API name: {@code stop_time}
	 */
	@Nullable
	public String stopTime() {
		return this.stopTime;
	}

	/**
	 * recovery stop time in epoch milliseconds
	 * <p>
	 * API name: {@code stop_time_millis}
	 */
	@Nullable
	public String stopTimeMillis() {
		return this.stopTimeMillis;
	}

	/**
	 * recovery time
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public String time() {
		return this.time;
	}

	/**
	 * recovery type
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * recovery stage
	 * <p>
	 * API name: {@code stage}
	 */
	@Nullable
	public String stage() {
		return this.stage;
	}

	/**
	 * source host
	 * <p>
	 * API name: {@code source_host}
	 */
	@Nullable
	public String sourceHost() {
		return this.sourceHost;
	}

	/**
	 * source node name
	 * <p>
	 * API name: {@code source_node}
	 */
	@Nullable
	public String sourceNode() {
		return this.sourceNode;
	}

	/**
	 * target host
	 * <p>
	 * API name: {@code target_host}
	 */
	@Nullable
	public String targetHost() {
		return this.targetHost;
	}

	/**
	 * target node name
	 * <p>
	 * API name: {@code target_node}
	 */
	@Nullable
	public String targetNode() {
		return this.targetNode;
	}

	/**
	 * repository
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * snapshot
	 * <p>
	 * API name: {@code snapshot}
	 */
	@Nullable
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * number of files to recover
	 * <p>
	 * API name: {@code files}
	 */
	@Nullable
	public String files() {
		return this.files;
	}

	/**
	 * files recovered
	 * <p>
	 * API name: {@code files_recovered}
	 */
	@Nullable
	public String filesRecovered() {
		return this.filesRecovered;
	}

	/**
	 * percent of files recovered
	 * <p>
	 * API name: {@code files_percent}
	 */
	@Nullable
	public JsonValue filesPercent() {
		return this.filesPercent;
	}

	/**
	 * total number of files
	 * <p>
	 * API name: {@code files_total}
	 */
	@Nullable
	public String filesTotal() {
		return this.filesTotal;
	}

	/**
	 * number of bytes to recover
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public String bytes() {
		return this.bytes;
	}

	/**
	 * bytes recovered
	 * <p>
	 * API name: {@code bytes_recovered}
	 */
	@Nullable
	public String bytesRecovered() {
		return this.bytesRecovered;
	}

	/**
	 * percent of bytes recovered
	 * <p>
	 * API name: {@code bytes_percent}
	 */
	@Nullable
	public JsonValue bytesPercent() {
		return this.bytesPercent;
	}

	/**
	 * total number of bytes
	 * <p>
	 * API name: {@code bytes_total}
	 */
	@Nullable
	public String bytesTotal() {
		return this.bytesTotal;
	}

	/**
	 * number of translog ops to recover
	 * <p>
	 * API name: {@code translog_ops}
	 */
	@Nullable
	public String translogOps() {
		return this.translogOps;
	}

	/**
	 * translog ops recovered
	 * <p>
	 * API name: {@code translog_ops_recovered}
	 */
	@Nullable
	public String translogOpsRecovered() {
		return this.translogOpsRecovered;
	}

	/**
	 * percent of translog ops recovered
	 * <p>
	 * API name: {@code translog_ops_percent}
	 */
	@Nullable
	public JsonValue translogOpsPercent() {
		return this.translogOpsPercent;
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

		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.shard != null) {

			generator.writeKey("shard");
			generator.write(this.shard);

		}
		if (this.startTime != null) {

			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.startTimeMillis != null) {

			generator.writeKey("start_time_millis");
			generator.write(this.startTimeMillis);

		}
		if (this.stopTime != null) {

			generator.writeKey("stop_time");
			generator.write(this.stopTime);

		}
		if (this.stopTimeMillis != null) {

			generator.writeKey("stop_time_millis");
			generator.write(this.stopTimeMillis);

		}
		if (this.time != null) {

			generator.writeKey("time");
			generator.write(this.time);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.stage != null) {

			generator.writeKey("stage");
			generator.write(this.stage);

		}
		if (this.sourceHost != null) {

			generator.writeKey("source_host");
			generator.write(this.sourceHost);

		}
		if (this.sourceNode != null) {

			generator.writeKey("source_node");
			generator.write(this.sourceNode);

		}
		if (this.targetHost != null) {

			generator.writeKey("target_host");
			generator.write(this.targetHost);

		}
		if (this.targetNode != null) {

			generator.writeKey("target_node");
			generator.write(this.targetNode);

		}
		if (this.repository != null) {

			generator.writeKey("repository");
			generator.write(this.repository);

		}
		if (this.snapshot != null) {

			generator.writeKey("snapshot");
			generator.write(this.snapshot);

		}
		if (this.files != null) {

			generator.writeKey("files");
			generator.write(this.files);

		}
		if (this.filesRecovered != null) {

			generator.writeKey("files_recovered");
			generator.write(this.filesRecovered);

		}
		if (this.filesPercent != null) {

			generator.writeKey("files_percent");
			generator.write(this.filesPercent);

		}
		if (this.filesTotal != null) {

			generator.writeKey("files_total");
			generator.write(this.filesTotal);

		}
		if (this.bytes != null) {

			generator.writeKey("bytes");
			generator.write(this.bytes);

		}
		if (this.bytesRecovered != null) {

			generator.writeKey("bytes_recovered");
			generator.write(this.bytesRecovered);

		}
		if (this.bytesPercent != null) {

			generator.writeKey("bytes_percent");
			generator.write(this.bytesPercent);

		}
		if (this.bytesTotal != null) {

			generator.writeKey("bytes_total");
			generator.write(this.bytesTotal);

		}
		if (this.translogOps != null) {

			generator.writeKey("translog_ops");
			generator.write(this.translogOps);

		}
		if (this.translogOpsRecovered != null) {

			generator.writeKey("translog_ops_recovered");
			generator.write(this.translogOpsRecovered);

		}
		if (this.translogOpsPercent != null) {

			generator.writeKey("translog_ops_percent");
			generator.write(this.translogOpsPercent);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryRecord}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryRecord> {
		@Nullable
		private String index;

		@Nullable
		private String shard;

		@Nullable
		private String startTime;

		@Nullable
		private String startTimeMillis;

		@Nullable
		private String stopTime;

		@Nullable
		private String stopTimeMillis;

		@Nullable
		private String time;

		@Nullable
		private String type;

		@Nullable
		private String stage;

		@Nullable
		private String sourceHost;

		@Nullable
		private String sourceNode;

		@Nullable
		private String targetHost;

		@Nullable
		private String targetNode;

		@Nullable
		private String repository;

		@Nullable
		private String snapshot;

		@Nullable
		private String files;

		@Nullable
		private String filesRecovered;

		@Nullable
		private JsonValue filesPercent;

		@Nullable
		private String filesTotal;

		@Nullable
		private String bytes;

		@Nullable
		private String bytesRecovered;

		@Nullable
		private JsonValue bytesPercent;

		@Nullable
		private String bytesTotal;

		@Nullable
		private String translogOps;

		@Nullable
		private String translogOpsRecovered;

		@Nullable
		private JsonValue translogOpsPercent;

		/**
		 * index name
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * shard name
		 * <p>
		 * API name: {@code shard}
		 */
		public Builder shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * recovery start time
		 * <p>
		 * API name: {@code start_time}
		 */
		public Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * recovery start time in epoch milliseconds
		 * <p>
		 * API name: {@code start_time_millis}
		 */
		public Builder startTimeMillis(@Nullable String value) {
			this.startTimeMillis = value;
			return this;
		}

		/**
		 * recovery stop time
		 * <p>
		 * API name: {@code stop_time}
		 */
		public Builder stopTime(@Nullable String value) {
			this.stopTime = value;
			return this;
		}

		/**
		 * recovery stop time in epoch milliseconds
		 * <p>
		 * API name: {@code stop_time_millis}
		 */
		public Builder stopTimeMillis(@Nullable String value) {
			this.stopTimeMillis = value;
			return this;
		}

		/**
		 * recovery time
		 * <p>
		 * API name: {@code time}
		 */
		public Builder time(@Nullable String value) {
			this.time = value;
			return this;
		}

		/**
		 * recovery type
		 * <p>
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * recovery stage
		 * <p>
		 * API name: {@code stage}
		 */
		public Builder stage(@Nullable String value) {
			this.stage = value;
			return this;
		}

		/**
		 * source host
		 * <p>
		 * API name: {@code source_host}
		 */
		public Builder sourceHost(@Nullable String value) {
			this.sourceHost = value;
			return this;
		}

		/**
		 * source node name
		 * <p>
		 * API name: {@code source_node}
		 */
		public Builder sourceNode(@Nullable String value) {
			this.sourceNode = value;
			return this;
		}

		/**
		 * target host
		 * <p>
		 * API name: {@code target_host}
		 */
		public Builder targetHost(@Nullable String value) {
			this.targetHost = value;
			return this;
		}

		/**
		 * target node name
		 * <p>
		 * API name: {@code target_node}
		 */
		public Builder targetNode(@Nullable String value) {
			this.targetNode = value;
			return this;
		}

		/**
		 * repository
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * snapshot
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(@Nullable String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * number of files to recover
		 * <p>
		 * API name: {@code files}
		 */
		public Builder files(@Nullable String value) {
			this.files = value;
			return this;
		}

		/**
		 * files recovered
		 * <p>
		 * API name: {@code files_recovered}
		 */
		public Builder filesRecovered(@Nullable String value) {
			this.filesRecovered = value;
			return this;
		}

		/**
		 * percent of files recovered
		 * <p>
		 * API name: {@code files_percent}
		 */
		public Builder filesPercent(@Nullable JsonValue value) {
			this.filesPercent = value;
			return this;
		}

		/**
		 * total number of files
		 * <p>
		 * API name: {@code files_total}
		 */
		public Builder filesTotal(@Nullable String value) {
			this.filesTotal = value;
			return this;
		}

		/**
		 * number of bytes to recover
		 * <p>
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable String value) {
			this.bytes = value;
			return this;
		}

		/**
		 * bytes recovered
		 * <p>
		 * API name: {@code bytes_recovered}
		 */
		public Builder bytesRecovered(@Nullable String value) {
			this.bytesRecovered = value;
			return this;
		}

		/**
		 * percent of bytes recovered
		 * <p>
		 * API name: {@code bytes_percent}
		 */
		public Builder bytesPercent(@Nullable JsonValue value) {
			this.bytesPercent = value;
			return this;
		}

		/**
		 * total number of bytes
		 * <p>
		 * API name: {@code bytes_total}
		 */
		public Builder bytesTotal(@Nullable String value) {
			this.bytesTotal = value;
			return this;
		}

		/**
		 * number of translog ops to recover
		 * <p>
		 * API name: {@code translog_ops}
		 */
		public Builder translogOps(@Nullable String value) {
			this.translogOps = value;
			return this;
		}

		/**
		 * translog ops recovered
		 * <p>
		 * API name: {@code translog_ops_recovered}
		 */
		public Builder translogOpsRecovered(@Nullable String value) {
			this.translogOpsRecovered = value;
			return this;
		}

		/**
		 * percent of translog ops recovered
		 * <p>
		 * API name: {@code translog_ops_percent}
		 */
		public Builder translogOpsPercent(@Nullable JsonValue value) {
			this.translogOpsPercent = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryRecord build() {

			return new RecoveryRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryRecord}
	 */
	public static final JsonpDeserializer<RecoveryRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RecoveryRecord::setupRecoveryRecordDeserializer);

	protected static void setupRecoveryRecordDeserializer(DelegatingDeserializer<RecoveryRecord.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "shard", "s", "sh");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time", "start");
		op.add(Builder::startTimeMillis, JsonpDeserializer.stringDeserializer(), "start_time_millis", "start_millis");
		op.add(Builder::stopTime, JsonpDeserializer.stringDeserializer(), "stop_time", "stop");
		op.add(Builder::stopTimeMillis, JsonpDeserializer.stringDeserializer(), "stop_time_millis", "stop_millis");
		op.add(Builder::time, JsonpDeserializer.stringDeserializer(), "time", "t", "ti");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type", "ty");
		op.add(Builder::stage, JsonpDeserializer.stringDeserializer(), "stage", "st");
		op.add(Builder::sourceHost, JsonpDeserializer.stringDeserializer(), "source_host", "shost");
		op.add(Builder::sourceNode, JsonpDeserializer.stringDeserializer(), "source_node", "snode");
		op.add(Builder::targetHost, JsonpDeserializer.stringDeserializer(), "target_host", "thost");
		op.add(Builder::targetNode, JsonpDeserializer.stringDeserializer(), "target_node", "tnode");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository", "rep");
		op.add(Builder::snapshot, JsonpDeserializer.stringDeserializer(), "snapshot", "snap");
		op.add(Builder::files, JsonpDeserializer.stringDeserializer(), "files", "f");
		op.add(Builder::filesRecovered, JsonpDeserializer.stringDeserializer(), "files_recovered", "fr");
		op.add(Builder::filesPercent, JsonpDeserializer.jsonValueDeserializer(), "files_percent", "fp");
		op.add(Builder::filesTotal, JsonpDeserializer.stringDeserializer(), "files_total", "tf");
		op.add(Builder::bytes, JsonpDeserializer.stringDeserializer(), "bytes", "b");
		op.add(Builder::bytesRecovered, JsonpDeserializer.stringDeserializer(), "bytes_recovered", "br");
		op.add(Builder::bytesPercent, JsonpDeserializer.jsonValueDeserializer(), "bytes_percent", "bp");
		op.add(Builder::bytesTotal, JsonpDeserializer.stringDeserializer(), "bytes_total", "tb");
		op.add(Builder::translogOps, JsonpDeserializer.stringDeserializer(), "translog_ops", "to");
		op.add(Builder::translogOpsRecovered, JsonpDeserializer.stringDeserializer(), "translog_ops_recovered", "tor");
		op.add(Builder::translogOpsPercent, JsonpDeserializer.jsonValueDeserializer(), "translog_ops_percent", "top");

	}

}
