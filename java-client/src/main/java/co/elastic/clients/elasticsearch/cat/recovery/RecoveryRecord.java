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

package co.elastic.clients.elasticsearch.cat.recovery;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.DateTime;
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

// typedef: cat.recovery.RecoveryRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.recovery.RecoveryRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoveryRecord implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String shard;

	@Nullable
	private final DateTime startTime;

	@Nullable
	private final Long startTimeMillis;

	@Nullable
	private final DateTime stopTime;

	@Nullable
	private final Long stopTimeMillis;

	@Nullable
	private final Time time;

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
	private final String filesPercent;

	@Nullable
	private final String filesTotal;

	@Nullable
	private final String bytes;

	@Nullable
	private final String bytesRecovered;

	@Nullable
	private final String bytesPercent;

	@Nullable
	private final String bytesTotal;

	@Nullable
	private final String translogOps;

	@Nullable
	private final String translogOpsRecovered;

	@Nullable
	private final String translogOpsPercent;

	// ---------------------------------------------------------------------------------------------

	private RecoveryRecord(Builder builder) {

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

	public static RecoveryRecord of(Function<Builder, ObjectBuilder<RecoveryRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The index name.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * The shard name.
	 * <p>
	 * API name: {@code shard}
	 */
	@Nullable
	public final String shard() {
		return this.shard;
	}

	/**
	 * The recovery start time.
	 * <p>
	 * API name: {@code start_time}
	 */
	@Nullable
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * The recovery start time in epoch milliseconds.
	 * <p>
	 * API name: {@code start_time_millis}
	 */
	@Nullable
	public final Long startTimeMillis() {
		return this.startTimeMillis;
	}

	/**
	 * The recovery stop time.
	 * <p>
	 * API name: {@code stop_time}
	 */
	@Nullable
	public final DateTime stopTime() {
		return this.stopTime;
	}

	/**
	 * The recovery stop time in epoch milliseconds.
	 * <p>
	 * API name: {@code stop_time_millis}
	 */
	@Nullable
	public final Long stopTimeMillis() {
		return this.stopTimeMillis;
	}

	/**
	 * The recovery time.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final Time time() {
		return this.time;
	}

	/**
	 * The recovery type.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * The recovery stage.
	 * <p>
	 * API name: {@code stage}
	 */
	@Nullable
	public final String stage() {
		return this.stage;
	}

	/**
	 * The source host.
	 * <p>
	 * API name: {@code source_host}
	 */
	@Nullable
	public final String sourceHost() {
		return this.sourceHost;
	}

	/**
	 * The source node name.
	 * <p>
	 * API name: {@code source_node}
	 */
	@Nullable
	public final String sourceNode() {
		return this.sourceNode;
	}

	/**
	 * The target host.
	 * <p>
	 * API name: {@code target_host}
	 */
	@Nullable
	public final String targetHost() {
		return this.targetHost;
	}

	/**
	 * The target node name.
	 * <p>
	 * API name: {@code target_node}
	 */
	@Nullable
	public final String targetNode() {
		return this.targetNode;
	}

	/**
	 * The repository name.
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public final String repository() {
		return this.repository;
	}

	/**
	 * The snapshot name.
	 * <p>
	 * API name: {@code snapshot}
	 */
	@Nullable
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * The number of files to recover.
	 * <p>
	 * API name: {@code files}
	 */
	@Nullable
	public final String files() {
		return this.files;
	}

	/**
	 * The files recovered.
	 * <p>
	 * API name: {@code files_recovered}
	 */
	@Nullable
	public final String filesRecovered() {
		return this.filesRecovered;
	}

	/**
	 * The ratio of files recovered.
	 * <p>
	 * API name: {@code files_percent}
	 */
	@Nullable
	public final String filesPercent() {
		return this.filesPercent;
	}

	/**
	 * The total number of files.
	 * <p>
	 * API name: {@code files_total}
	 */
	@Nullable
	public final String filesTotal() {
		return this.filesTotal;
	}

	/**
	 * The number of bytes to recover.
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final String bytes() {
		return this.bytes;
	}

	/**
	 * The bytes recovered.
	 * <p>
	 * API name: {@code bytes_recovered}
	 */
	@Nullable
	public final String bytesRecovered() {
		return this.bytesRecovered;
	}

	/**
	 * The ratio of bytes recovered.
	 * <p>
	 * API name: {@code bytes_percent}
	 */
	@Nullable
	public final String bytesPercent() {
		return this.bytesPercent;
	}

	/**
	 * The total number of bytes.
	 * <p>
	 * API name: {@code bytes_total}
	 */
	@Nullable
	public final String bytesTotal() {
		return this.bytesTotal;
	}

	/**
	 * The number of translog operations to recover.
	 * <p>
	 * API name: {@code translog_ops}
	 */
	@Nullable
	public final String translogOps() {
		return this.translogOps;
	}

	/**
	 * The translog operations recovered.
	 * <p>
	 * API name: {@code translog_ops_recovered}
	 */
	@Nullable
	public final String translogOpsRecovered() {
		return this.translogOpsRecovered;
	}

	/**
	 * The ratio of translog operations recovered.
	 * <p>
	 * API name: {@code translog_ops_percent}
	 */
	@Nullable
	public final String translogOpsPercent() {
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
			this.startTime.serialize(generator, mapper);
		}
		if (this.startTimeMillis != null) {
			generator.writeKey("start_time_millis");
			generator.write(this.startTimeMillis);

		}
		if (this.stopTime != null) {
			generator.writeKey("stop_time");
			this.stopTime.serialize(generator, mapper);
		}
		if (this.stopTimeMillis != null) {
			generator.writeKey("stop_time_millis");
			generator.write(this.stopTimeMillis);

		}
		if (this.time != null) {
			generator.writeKey("time");
			this.time.serialize(generator, mapper);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RecoveryRecord> {
		@Nullable
		private String index;

		@Nullable
		private String shard;

		@Nullable
		private DateTime startTime;

		@Nullable
		private Long startTimeMillis;

		@Nullable
		private DateTime stopTime;

		@Nullable
		private Long stopTimeMillis;

		@Nullable
		private Time time;

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
		private String filesPercent;

		@Nullable
		private String filesTotal;

		@Nullable
		private String bytes;

		@Nullable
		private String bytesRecovered;

		@Nullable
		private String bytesPercent;

		@Nullable
		private String bytesTotal;

		@Nullable
		private String translogOps;

		@Nullable
		private String translogOpsRecovered;

		@Nullable
		private String translogOpsPercent;

		/**
		 * The index name.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * The shard name.
		 * <p>
		 * API name: {@code shard}
		 */
		public final Builder shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * The recovery start time.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable DateTime value) {
			this.startTime = value;
			return this;
		}

		/**
		 * The recovery start time in epoch milliseconds.
		 * <p>
		 * API name: {@code start_time_millis}
		 */
		public final Builder startTimeMillis(@Nullable Long value) {
			this.startTimeMillis = value;
			return this;
		}

		/**
		 * The recovery stop time.
		 * <p>
		 * API name: {@code stop_time}
		 */
		public final Builder stopTime(@Nullable DateTime value) {
			this.stopTime = value;
			return this;
		}

		/**
		 * The recovery stop time in epoch milliseconds.
		 * <p>
		 * API name: {@code stop_time_millis}
		 */
		public final Builder stopTimeMillis(@Nullable Long value) {
			this.stopTimeMillis = value;
			return this;
		}

		/**
		 * The recovery time.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable Time value) {
			this.time = value;
			return this;
		}

		/**
		 * The recovery time.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.time(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The recovery type.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * The recovery stage.
		 * <p>
		 * API name: {@code stage}
		 */
		public final Builder stage(@Nullable String value) {
			this.stage = value;
			return this;
		}

		/**
		 * The source host.
		 * <p>
		 * API name: {@code source_host}
		 */
		public final Builder sourceHost(@Nullable String value) {
			this.sourceHost = value;
			return this;
		}

		/**
		 * The source node name.
		 * <p>
		 * API name: {@code source_node}
		 */
		public final Builder sourceNode(@Nullable String value) {
			this.sourceNode = value;
			return this;
		}

		/**
		 * The target host.
		 * <p>
		 * API name: {@code target_host}
		 */
		public final Builder targetHost(@Nullable String value) {
			this.targetHost = value;
			return this;
		}

		/**
		 * The target node name.
		 * <p>
		 * API name: {@code target_node}
		 */
		public final Builder targetNode(@Nullable String value) {
			this.targetNode = value;
			return this;
		}

		/**
		 * The repository name.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * The snapshot name.
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(@Nullable String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * The number of files to recover.
		 * <p>
		 * API name: {@code files}
		 */
		public final Builder files(@Nullable String value) {
			this.files = value;
			return this;
		}

		/**
		 * The files recovered.
		 * <p>
		 * API name: {@code files_recovered}
		 */
		public final Builder filesRecovered(@Nullable String value) {
			this.filesRecovered = value;
			return this;
		}

		/**
		 * The ratio of files recovered.
		 * <p>
		 * API name: {@code files_percent}
		 */
		public final Builder filesPercent(@Nullable String value) {
			this.filesPercent = value;
			return this;
		}

		/**
		 * The total number of files.
		 * <p>
		 * API name: {@code files_total}
		 */
		public final Builder filesTotal(@Nullable String value) {
			this.filesTotal = value;
			return this;
		}

		/**
		 * The number of bytes to recover.
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable String value) {
			this.bytes = value;
			return this;
		}

		/**
		 * The bytes recovered.
		 * <p>
		 * API name: {@code bytes_recovered}
		 */
		public final Builder bytesRecovered(@Nullable String value) {
			this.bytesRecovered = value;
			return this;
		}

		/**
		 * The ratio of bytes recovered.
		 * <p>
		 * API name: {@code bytes_percent}
		 */
		public final Builder bytesPercent(@Nullable String value) {
			this.bytesPercent = value;
			return this;
		}

		/**
		 * The total number of bytes.
		 * <p>
		 * API name: {@code bytes_total}
		 */
		public final Builder bytesTotal(@Nullable String value) {
			this.bytesTotal = value;
			return this;
		}

		/**
		 * The number of translog operations to recover.
		 * <p>
		 * API name: {@code translog_ops}
		 */
		public final Builder translogOps(@Nullable String value) {
			this.translogOps = value;
			return this;
		}

		/**
		 * The translog operations recovered.
		 * <p>
		 * API name: {@code translog_ops_recovered}
		 */
		public final Builder translogOpsRecovered(@Nullable String value) {
			this.translogOpsRecovered = value;
			return this;
		}

		/**
		 * The ratio of translog operations recovered.
		 * <p>
		 * API name: {@code translog_ops_percent}
		 */
		public final Builder translogOpsPercent(@Nullable String value) {
			this.translogOpsPercent = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryRecord build() {
			_checkSingleUse();

			return new RecoveryRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryRecord}
	 */
	public static final JsonpDeserializer<RecoveryRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryRecord::setupRecoveryRecordDeserializer);

	protected static void setupRecoveryRecordDeserializer(ObjectDeserializer<RecoveryRecord.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "shard", "s", "sh");
		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time", "start");
		op.add(Builder::startTimeMillis, JsonpDeserializer.longDeserializer(), "start_time_millis", "start_millis");
		op.add(Builder::stopTime, DateTime._DESERIALIZER, "stop_time", "stop");
		op.add(Builder::stopTimeMillis, JsonpDeserializer.longDeserializer(), "stop_time_millis", "stop_millis");
		op.add(Builder::time, Time._DESERIALIZER, "time", "t", "ti");
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
		op.add(Builder::filesPercent, JsonpDeserializer.stringDeserializer(), "files_percent", "fp");
		op.add(Builder::filesTotal, JsonpDeserializer.stringDeserializer(), "files_total", "tf");
		op.add(Builder::bytes, JsonpDeserializer.stringDeserializer(), "bytes", "b");
		op.add(Builder::bytesRecovered, JsonpDeserializer.stringDeserializer(), "bytes_recovered", "br");
		op.add(Builder::bytesPercent, JsonpDeserializer.stringDeserializer(), "bytes_percent", "bp");
		op.add(Builder::bytesTotal, JsonpDeserializer.stringDeserializer(), "bytes_total", "tb");
		op.add(Builder::translogOps, JsonpDeserializer.stringDeserializer(), "translog_ops", "to");
		op.add(Builder::translogOpsRecovered, JsonpDeserializer.stringDeserializer(), "translog_ops_recovered", "tor");
		op.add(Builder::translogOpsPercent, JsonpDeserializer.stringDeserializer(), "translog_ops_percent", "top");

	}

}
