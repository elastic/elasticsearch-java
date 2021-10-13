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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr._types.ShardStats
@JsonpDeserializable
public final class ShardStats implements JsonpSerializable {
	private final long bytesRead;

	private final long failedReadRequests;

	private final long failedWriteRequests;

	@Nullable
	private final ErrorCause fatalException;

	private final long followerAliasesVersion;

	private final long followerGlobalCheckpoint;

	private final String followerIndex;

	private final long followerMappingVersion;

	private final int followerMaxSeqNo;

	private final long followerSettingsVersion;

	private final int lastRequestedSeqNo;

	private final long leaderGlobalCheckpoint;

	private final String leaderIndex;

	private final int leaderMaxSeqNo;

	private final long operationsRead;

	private final long operationsWritten;

	private final int outstandingReadRequests;

	private final int outstandingWriteRequests;

	private final List<ReadException> readExceptions;

	private final String remoteCluster;

	private final int shardId;

	private final long successfulReadRequests;

	private final long successfulWriteRequests;

	private final String timeSinceLastReadMillis;

	private final String totalReadRemoteExecTimeMillis;

	private final String totalReadTimeMillis;

	private final String totalWriteTimeMillis;

	private final long writeBufferOperationCount;

	private final String writeBufferSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public ShardStats(Builder builder) {

		this.bytesRead = Objects.requireNonNull(builder.bytesRead, "bytes_read");
		this.failedReadRequests = Objects.requireNonNull(builder.failedReadRequests, "failed_read_requests");
		this.failedWriteRequests = Objects.requireNonNull(builder.failedWriteRequests, "failed_write_requests");
		this.fatalException = builder.fatalException;
		this.followerAliasesVersion = Objects.requireNonNull(builder.followerAliasesVersion,
				"follower_aliases_version");
		this.followerGlobalCheckpoint = Objects.requireNonNull(builder.followerGlobalCheckpoint,
				"follower_global_checkpoint");
		this.followerIndex = Objects.requireNonNull(builder.followerIndex, "follower_index");
		this.followerMappingVersion = Objects.requireNonNull(builder.followerMappingVersion,
				"follower_mapping_version");
		this.followerMaxSeqNo = Objects.requireNonNull(builder.followerMaxSeqNo, "follower_max_seq_no");
		this.followerSettingsVersion = Objects.requireNonNull(builder.followerSettingsVersion,
				"follower_settings_version");
		this.lastRequestedSeqNo = Objects.requireNonNull(builder.lastRequestedSeqNo, "last_requested_seq_no");
		this.leaderGlobalCheckpoint = Objects.requireNonNull(builder.leaderGlobalCheckpoint,
				"leader_global_checkpoint");
		this.leaderIndex = Objects.requireNonNull(builder.leaderIndex, "leader_index");
		this.leaderMaxSeqNo = Objects.requireNonNull(builder.leaderMaxSeqNo, "leader_max_seq_no");
		this.operationsRead = Objects.requireNonNull(builder.operationsRead, "operations_read");
		this.operationsWritten = Objects.requireNonNull(builder.operationsWritten, "operations_written");
		this.outstandingReadRequests = Objects.requireNonNull(builder.outstandingReadRequests,
				"outstanding_read_requests");
		this.outstandingWriteRequests = Objects.requireNonNull(builder.outstandingWriteRequests,
				"outstanding_write_requests");
		this.readExceptions = ModelTypeHelper.unmodifiableNonNull(builder.readExceptions, "read_exceptions");
		this.remoteCluster = Objects.requireNonNull(builder.remoteCluster, "remote_cluster");
		this.shardId = Objects.requireNonNull(builder.shardId, "shard_id");
		this.successfulReadRequests = Objects.requireNonNull(builder.successfulReadRequests,
				"successful_read_requests");
		this.successfulWriteRequests = Objects.requireNonNull(builder.successfulWriteRequests,
				"successful_write_requests");
		this.timeSinceLastReadMillis = Objects.requireNonNull(builder.timeSinceLastReadMillis,
				"time_since_last_read_millis");
		this.totalReadRemoteExecTimeMillis = Objects.requireNonNull(builder.totalReadRemoteExecTimeMillis,
				"total_read_remote_exec_time_millis");
		this.totalReadTimeMillis = Objects.requireNonNull(builder.totalReadTimeMillis, "total_read_time_millis");
		this.totalWriteTimeMillis = Objects.requireNonNull(builder.totalWriteTimeMillis, "total_write_time_millis");
		this.writeBufferOperationCount = Objects.requireNonNull(builder.writeBufferOperationCount,
				"write_buffer_operation_count");
		this.writeBufferSizeInBytes = Objects.requireNonNull(builder.writeBufferSizeInBytes,
				"write_buffer_size_in_bytes");

	}

	public ShardStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code bytes_read}
	 */
	public long bytesRead() {
		return this.bytesRead;
	}

	/**
	 * Required - API name: {@code failed_read_requests}
	 */
	public long failedReadRequests() {
		return this.failedReadRequests;
	}

	/**
	 * Required - API name: {@code failed_write_requests}
	 */
	public long failedWriteRequests() {
		return this.failedWriteRequests;
	}

	/**
	 * API name: {@code fatal_exception}
	 */
	@Nullable
	public ErrorCause fatalException() {
		return this.fatalException;
	}

	/**
	 * Required - API name: {@code follower_aliases_version}
	 */
	public long followerAliasesVersion() {
		return this.followerAliasesVersion;
	}

	/**
	 * Required - API name: {@code follower_global_checkpoint}
	 */
	public long followerGlobalCheckpoint() {
		return this.followerGlobalCheckpoint;
	}

	/**
	 * Required - API name: {@code follower_index}
	 */
	public String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * Required - API name: {@code follower_mapping_version}
	 */
	public long followerMappingVersion() {
		return this.followerMappingVersion;
	}

	/**
	 * Required - API name: {@code follower_max_seq_no}
	 */
	public int followerMaxSeqNo() {
		return this.followerMaxSeqNo;
	}

	/**
	 * Required - API name: {@code follower_settings_version}
	 */
	public long followerSettingsVersion() {
		return this.followerSettingsVersion;
	}

	/**
	 * Required - API name: {@code last_requested_seq_no}
	 */
	public int lastRequestedSeqNo() {
		return this.lastRequestedSeqNo;
	}

	/**
	 * Required - API name: {@code leader_global_checkpoint}
	 */
	public long leaderGlobalCheckpoint() {
		return this.leaderGlobalCheckpoint;
	}

	/**
	 * Required - API name: {@code leader_index}
	 */
	public String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * Required - API name: {@code leader_max_seq_no}
	 */
	public int leaderMaxSeqNo() {
		return this.leaderMaxSeqNo;
	}

	/**
	 * Required - API name: {@code operations_read}
	 */
	public long operationsRead() {
		return this.operationsRead;
	}

	/**
	 * Required - API name: {@code operations_written}
	 */
	public long operationsWritten() {
		return this.operationsWritten;
	}

	/**
	 * Required - API name: {@code outstanding_read_requests}
	 */
	public int outstandingReadRequests() {
		return this.outstandingReadRequests;
	}

	/**
	 * Required - API name: {@code outstanding_write_requests}
	 */
	public int outstandingWriteRequests() {
		return this.outstandingWriteRequests;
	}

	/**
	 * Required - API name: {@code read_exceptions}
	 */
	public List<ReadException> readExceptions() {
		return this.readExceptions;
	}

	/**
	 * Required - API name: {@code remote_cluster}
	 */
	public String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Required - API name: {@code shard_id}
	 */
	public int shardId() {
		return this.shardId;
	}

	/**
	 * Required - API name: {@code successful_read_requests}
	 */
	public long successfulReadRequests() {
		return this.successfulReadRequests;
	}

	/**
	 * Required - API name: {@code successful_write_requests}
	 */
	public long successfulWriteRequests() {
		return this.successfulWriteRequests;
	}

	/**
	 * Required - API name: {@code time_since_last_read_millis}
	 */
	public String timeSinceLastReadMillis() {
		return this.timeSinceLastReadMillis;
	}

	/**
	 * Required - API name: {@code total_read_remote_exec_time_millis}
	 */
	public String totalReadRemoteExecTimeMillis() {
		return this.totalReadRemoteExecTimeMillis;
	}

	/**
	 * Required - API name: {@code total_read_time_millis}
	 */
	public String totalReadTimeMillis() {
		return this.totalReadTimeMillis;
	}

	/**
	 * Required - API name: {@code total_write_time_millis}
	 */
	public String totalWriteTimeMillis() {
		return this.totalWriteTimeMillis;
	}

	/**
	 * Required - API name: {@code write_buffer_operation_count}
	 */
	public long writeBufferOperationCount() {
		return this.writeBufferOperationCount;
	}

	/**
	 * Required - API name: {@code write_buffer_size_in_bytes}
	 */
	public String writeBufferSizeInBytes() {
		return this.writeBufferSizeInBytes;
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

		generator.writeKey("bytes_read");
		generator.write(this.bytesRead);

		generator.writeKey("failed_read_requests");
		generator.write(this.failedReadRequests);

		generator.writeKey("failed_write_requests");
		generator.write(this.failedWriteRequests);

		if (this.fatalException != null) {

			generator.writeKey("fatal_exception");
			this.fatalException.serialize(generator, mapper);

		}

		generator.writeKey("follower_aliases_version");
		generator.write(this.followerAliasesVersion);

		generator.writeKey("follower_global_checkpoint");
		generator.write(this.followerGlobalCheckpoint);

		generator.writeKey("follower_index");
		generator.write(this.followerIndex);

		generator.writeKey("follower_mapping_version");
		generator.write(this.followerMappingVersion);

		generator.writeKey("follower_max_seq_no");
		generator.write(this.followerMaxSeqNo);

		generator.writeKey("follower_settings_version");
		generator.write(this.followerSettingsVersion);

		generator.writeKey("last_requested_seq_no");
		generator.write(this.lastRequestedSeqNo);

		generator.writeKey("leader_global_checkpoint");
		generator.write(this.leaderGlobalCheckpoint);

		generator.writeKey("leader_index");
		generator.write(this.leaderIndex);

		generator.writeKey("leader_max_seq_no");
		generator.write(this.leaderMaxSeqNo);

		generator.writeKey("operations_read");
		generator.write(this.operationsRead);

		generator.writeKey("operations_written");
		generator.write(this.operationsWritten);

		generator.writeKey("outstanding_read_requests");
		generator.write(this.outstandingReadRequests);

		generator.writeKey("outstanding_write_requests");
		generator.write(this.outstandingWriteRequests);

		generator.writeKey("read_exceptions");
		generator.writeStartArray();
		for (ReadException item0 : this.readExceptions) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		generator.writeKey("shard_id");
		generator.write(this.shardId);

		generator.writeKey("successful_read_requests");
		generator.write(this.successfulReadRequests);

		generator.writeKey("successful_write_requests");
		generator.write(this.successfulWriteRequests);

		generator.writeKey("time_since_last_read_millis");
		generator.write(this.timeSinceLastReadMillis);

		generator.writeKey("total_read_remote_exec_time_millis");
		generator.write(this.totalReadRemoteExecTimeMillis);

		generator.writeKey("total_read_time_millis");
		generator.write(this.totalReadTimeMillis);

		generator.writeKey("total_write_time_millis");
		generator.write(this.totalWriteTimeMillis);

		generator.writeKey("write_buffer_operation_count");
		generator.write(this.writeBufferOperationCount);

		generator.writeKey("write_buffer_size_in_bytes");
		generator.write(this.writeBufferSizeInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardStats> {
		private Long bytesRead;

		private Long failedReadRequests;

		private Long failedWriteRequests;

		@Nullable
		private ErrorCause fatalException;

		private Long followerAliasesVersion;

		private Long followerGlobalCheckpoint;

		private String followerIndex;

		private Long followerMappingVersion;

		private Integer followerMaxSeqNo;

		private Long followerSettingsVersion;

		private Integer lastRequestedSeqNo;

		private Long leaderGlobalCheckpoint;

		private String leaderIndex;

		private Integer leaderMaxSeqNo;

		private Long operationsRead;

		private Long operationsWritten;

		private Integer outstandingReadRequests;

		private Integer outstandingWriteRequests;

		private List<ReadException> readExceptions;

		private String remoteCluster;

		private Integer shardId;

		private Long successfulReadRequests;

		private Long successfulWriteRequests;

		private String timeSinceLastReadMillis;

		private String totalReadRemoteExecTimeMillis;

		private String totalReadTimeMillis;

		private String totalWriteTimeMillis;

		private Long writeBufferOperationCount;

		private String writeBufferSizeInBytes;

		/**
		 * Required - API name: {@code bytes_read}
		 */
		public Builder bytesRead(long value) {
			this.bytesRead = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_read_requests}
		 */
		public Builder failedReadRequests(long value) {
			this.failedReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_write_requests}
		 */
		public Builder failedWriteRequests(long value) {
			this.failedWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code fatal_exception}
		 */
		public Builder fatalException(@Nullable ErrorCause value) {
			this.fatalException = value;
			return this;
		}

		/**
		 * API name: {@code fatal_exception}
		 */
		public Builder fatalException(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.fatalException(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code follower_aliases_version}
		 */
		public Builder followerAliasesVersion(long value) {
			this.followerAliasesVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_global_checkpoint}
		 */
		public Builder followerGlobalCheckpoint(long value) {
			this.followerGlobalCheckpoint = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_index}
		 */
		public Builder followerIndex(String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_mapping_version}
		 */
		public Builder followerMappingVersion(long value) {
			this.followerMappingVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_max_seq_no}
		 */
		public Builder followerMaxSeqNo(int value) {
			this.followerMaxSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_settings_version}
		 */
		public Builder followerSettingsVersion(long value) {
			this.followerSettingsVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code last_requested_seq_no}
		 */
		public Builder lastRequestedSeqNo(int value) {
			this.lastRequestedSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_global_checkpoint}
		 */
		public Builder leaderGlobalCheckpoint(long value) {
			this.leaderGlobalCheckpoint = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_index}
		 */
		public Builder leaderIndex(String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_max_seq_no}
		 */
		public Builder leaderMaxSeqNo(int value) {
			this.leaderMaxSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code operations_read}
		 */
		public Builder operationsRead(long value) {
			this.operationsRead = value;
			return this;
		}

		/**
		 * Required - API name: {@code operations_written}
		 */
		public Builder operationsWritten(long value) {
			this.operationsWritten = value;
			return this;
		}

		/**
		 * Required - API name: {@code outstanding_read_requests}
		 */
		public Builder outstandingReadRequests(int value) {
			this.outstandingReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code outstanding_write_requests}
		 */
		public Builder outstandingWriteRequests(int value) {
			this.outstandingWriteRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code read_exceptions}
		 */
		public Builder readExceptions(List<ReadException> value) {
			this.readExceptions = value;
			return this;
		}

		/**
		 * Required - API name: {@code read_exceptions}
		 */
		public Builder readExceptions(ReadException... value) {
			this.readExceptions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #readExceptions(List)}, creating the list if needed.
		 */
		public Builder addReadExceptions(ReadException value) {
			if (this.readExceptions == null) {
				this.readExceptions = new ArrayList<>();
			}
			this.readExceptions.add(value);
			return this;
		}

		/**
		 * Set {@link #readExceptions(List)} to a singleton list.
		 */
		public Builder readExceptions(Function<ReadException.Builder, ObjectBuilder<ReadException>> fn) {
			return this.readExceptions(fn.apply(new ReadException.Builder()).build());
		}

		/**
		 * Add a value to {@link #readExceptions(List)}, creating the list if needed.
		 */
		public Builder addReadExceptions(Function<ReadException.Builder, ObjectBuilder<ReadException>> fn) {
			return this.addReadExceptions(fn.apply(new ReadException.Builder()).build());
		}

		/**
		 * Required - API name: {@code remote_cluster}
		 */
		public Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_id}
		 */
		public Builder shardId(int value) {
			this.shardId = value;
			return this;
		}

		/**
		 * Required - API name: {@code successful_read_requests}
		 */
		public Builder successfulReadRequests(long value) {
			this.successfulReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code successful_write_requests}
		 */
		public Builder successfulWriteRequests(long value) {
			this.successfulWriteRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_since_last_read_millis}
		 */
		public Builder timeSinceLastReadMillis(String value) {
			this.timeSinceLastReadMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_read_remote_exec_time_millis}
		 */
		public Builder totalReadRemoteExecTimeMillis(String value) {
			this.totalReadRemoteExecTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_read_time_millis}
		 */
		public Builder totalReadTimeMillis(String value) {
			this.totalReadTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_write_time_millis}
		 */
		public Builder totalWriteTimeMillis(String value) {
			this.totalWriteTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code write_buffer_operation_count}
		 */
		public Builder writeBufferOperationCount(long value) {
			this.writeBufferOperationCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code write_buffer_size_in_bytes}
		 */
		public Builder writeBufferSizeInBytes(String value) {
			this.writeBufferSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link ShardStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStats build() {

			return new ShardStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStats}
	 */
	public static final JsonpDeserializer<ShardStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStats::setupShardStatsDeserializer, Builder::build);

	protected static void setupShardStatsDeserializer(DelegatingDeserializer<ShardStats.Builder> op) {

		op.add(Builder::bytesRead, JsonpDeserializer.longDeserializer(), "bytes_read");
		op.add(Builder::failedReadRequests, JsonpDeserializer.longDeserializer(), "failed_read_requests");
		op.add(Builder::failedWriteRequests, JsonpDeserializer.longDeserializer(), "failed_write_requests");
		op.add(Builder::fatalException, ErrorCause._DESERIALIZER, "fatal_exception");
		op.add(Builder::followerAliasesVersion, JsonpDeserializer.longDeserializer(), "follower_aliases_version");
		op.add(Builder::followerGlobalCheckpoint, JsonpDeserializer.longDeserializer(), "follower_global_checkpoint");
		op.add(Builder::followerIndex, JsonpDeserializer.stringDeserializer(), "follower_index");
		op.add(Builder::followerMappingVersion, JsonpDeserializer.longDeserializer(), "follower_mapping_version");
		op.add(Builder::followerMaxSeqNo, JsonpDeserializer.integerDeserializer(), "follower_max_seq_no");
		op.add(Builder::followerSettingsVersion, JsonpDeserializer.longDeserializer(), "follower_settings_version");
		op.add(Builder::lastRequestedSeqNo, JsonpDeserializer.integerDeserializer(), "last_requested_seq_no");
		op.add(Builder::leaderGlobalCheckpoint, JsonpDeserializer.longDeserializer(), "leader_global_checkpoint");
		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::leaderMaxSeqNo, JsonpDeserializer.integerDeserializer(), "leader_max_seq_no");
		op.add(Builder::operationsRead, JsonpDeserializer.longDeserializer(), "operations_read");
		op.add(Builder::operationsWritten, JsonpDeserializer.longDeserializer(), "operations_written");
		op.add(Builder::outstandingReadRequests, JsonpDeserializer.integerDeserializer(), "outstanding_read_requests");
		op.add(Builder::outstandingWriteRequests, JsonpDeserializer.integerDeserializer(),
				"outstanding_write_requests");
		op.add(Builder::readExceptions, JsonpDeserializer.arrayDeserializer(ReadException._DESERIALIZER),
				"read_exceptions");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::shardId, JsonpDeserializer.integerDeserializer(), "shard_id");
		op.add(Builder::successfulReadRequests, JsonpDeserializer.longDeserializer(), "successful_read_requests");
		op.add(Builder::successfulWriteRequests, JsonpDeserializer.longDeserializer(), "successful_write_requests");
		op.add(Builder::timeSinceLastReadMillis, JsonpDeserializer.stringDeserializer(), "time_since_last_read_millis");
		op.add(Builder::totalReadRemoteExecTimeMillis, JsonpDeserializer.stringDeserializer(),
				"total_read_remote_exec_time_millis");
		op.add(Builder::totalReadTimeMillis, JsonpDeserializer.stringDeserializer(), "total_read_time_millis");
		op.add(Builder::totalWriteTimeMillis, JsonpDeserializer.stringDeserializer(), "total_write_time_millis");
		op.add(Builder::writeBufferOperationCount, JsonpDeserializer.longDeserializer(),
				"write_buffer_operation_count");
		op.add(Builder::writeBufferSizeInBytes, JsonpDeserializer.stringDeserializer(), "write_buffer_size_in_bytes");

	}

}
