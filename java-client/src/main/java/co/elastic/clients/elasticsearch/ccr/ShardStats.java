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
import co.elastic.clients.util.ObjectBuilderBase;
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
public class ShardStats implements JsonpSerializable {
	private final long bytesRead;

	private final long failedReadRequests;

	private final long failedWriteRequests;

	@Nullable
	private final ErrorCause fatalException;

	private final long followerAliasesVersion;

	private final long followerGlobalCheckpoint;

	private final String followerIndex;

	private final long followerMappingVersion;

	private final long followerMaxSeqNo;

	private final long followerSettingsVersion;

	private final long lastRequestedSeqNo;

	private final long leaderGlobalCheckpoint;

	private final String leaderIndex;

	private final long leaderMaxSeqNo;

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

	private ShardStats(Builder builder) {

		this.bytesRead = ModelTypeHelper.requireNonNull(builder.bytesRead, this, "bytesRead");
		this.failedReadRequests = ModelTypeHelper.requireNonNull(builder.failedReadRequests, this,
				"failedReadRequests");
		this.failedWriteRequests = ModelTypeHelper.requireNonNull(builder.failedWriteRequests, this,
				"failedWriteRequests");
		this.fatalException = builder.fatalException;
		this.followerAliasesVersion = ModelTypeHelper.requireNonNull(builder.followerAliasesVersion, this,
				"followerAliasesVersion");
		this.followerGlobalCheckpoint = ModelTypeHelper.requireNonNull(builder.followerGlobalCheckpoint, this,
				"followerGlobalCheckpoint");
		this.followerIndex = ModelTypeHelper.requireNonNull(builder.followerIndex, this, "followerIndex");
		this.followerMappingVersion = ModelTypeHelper.requireNonNull(builder.followerMappingVersion, this,
				"followerMappingVersion");
		this.followerMaxSeqNo = ModelTypeHelper.requireNonNull(builder.followerMaxSeqNo, this, "followerMaxSeqNo");
		this.followerSettingsVersion = ModelTypeHelper.requireNonNull(builder.followerSettingsVersion, this,
				"followerSettingsVersion");
		this.lastRequestedSeqNo = ModelTypeHelper.requireNonNull(builder.lastRequestedSeqNo, this,
				"lastRequestedSeqNo");
		this.leaderGlobalCheckpoint = ModelTypeHelper.requireNonNull(builder.leaderGlobalCheckpoint, this,
				"leaderGlobalCheckpoint");
		this.leaderIndex = ModelTypeHelper.requireNonNull(builder.leaderIndex, this, "leaderIndex");
		this.leaderMaxSeqNo = ModelTypeHelper.requireNonNull(builder.leaderMaxSeqNo, this, "leaderMaxSeqNo");
		this.operationsRead = ModelTypeHelper.requireNonNull(builder.operationsRead, this, "operationsRead");
		this.operationsWritten = ModelTypeHelper.requireNonNull(builder.operationsWritten, this, "operationsWritten");
		this.outstandingReadRequests = ModelTypeHelper.requireNonNull(builder.outstandingReadRequests, this,
				"outstandingReadRequests");
		this.outstandingWriteRequests = ModelTypeHelper.requireNonNull(builder.outstandingWriteRequests, this,
				"outstandingWriteRequests");
		this.readExceptions = ModelTypeHelper.unmodifiableRequired(builder.readExceptions, this, "readExceptions");
		this.remoteCluster = ModelTypeHelper.requireNonNull(builder.remoteCluster, this, "remoteCluster");
		this.shardId = ModelTypeHelper.requireNonNull(builder.shardId, this, "shardId");
		this.successfulReadRequests = ModelTypeHelper.requireNonNull(builder.successfulReadRequests, this,
				"successfulReadRequests");
		this.successfulWriteRequests = ModelTypeHelper.requireNonNull(builder.successfulWriteRequests, this,
				"successfulWriteRequests");
		this.timeSinceLastReadMillis = ModelTypeHelper.requireNonNull(builder.timeSinceLastReadMillis, this,
				"timeSinceLastReadMillis");
		this.totalReadRemoteExecTimeMillis = ModelTypeHelper.requireNonNull(builder.totalReadRemoteExecTimeMillis, this,
				"totalReadRemoteExecTimeMillis");
		this.totalReadTimeMillis = ModelTypeHelper.requireNonNull(builder.totalReadTimeMillis, this,
				"totalReadTimeMillis");
		this.totalWriteTimeMillis = ModelTypeHelper.requireNonNull(builder.totalWriteTimeMillis, this,
				"totalWriteTimeMillis");
		this.writeBufferOperationCount = ModelTypeHelper.requireNonNull(builder.writeBufferOperationCount, this,
				"writeBufferOperationCount");
		this.writeBufferSizeInBytes = ModelTypeHelper.requireNonNull(builder.writeBufferSizeInBytes, this,
				"writeBufferSizeInBytes");

	}

	public static ShardStats of(Function<Builder, ObjectBuilder<ShardStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bytes_read}
	 */
	public final long bytesRead() {
		return this.bytesRead;
	}

	/**
	 * Required - API name: {@code failed_read_requests}
	 */
	public final long failedReadRequests() {
		return this.failedReadRequests;
	}

	/**
	 * Required - API name: {@code failed_write_requests}
	 */
	public final long failedWriteRequests() {
		return this.failedWriteRequests;
	}

	/**
	 * API name: {@code fatal_exception}
	 */
	@Nullable
	public final ErrorCause fatalException() {
		return this.fatalException;
	}

	/**
	 * Required - API name: {@code follower_aliases_version}
	 */
	public final long followerAliasesVersion() {
		return this.followerAliasesVersion;
	}

	/**
	 * Required - API name: {@code follower_global_checkpoint}
	 */
	public final long followerGlobalCheckpoint() {
		return this.followerGlobalCheckpoint;
	}

	/**
	 * Required - API name: {@code follower_index}
	 */
	public final String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * Required - API name: {@code follower_mapping_version}
	 */
	public final long followerMappingVersion() {
		return this.followerMappingVersion;
	}

	/**
	 * Required - API name: {@code follower_max_seq_no}
	 */
	public final long followerMaxSeqNo() {
		return this.followerMaxSeqNo;
	}

	/**
	 * Required - API name: {@code follower_settings_version}
	 */
	public final long followerSettingsVersion() {
		return this.followerSettingsVersion;
	}

	/**
	 * Required - API name: {@code last_requested_seq_no}
	 */
	public final long lastRequestedSeqNo() {
		return this.lastRequestedSeqNo;
	}

	/**
	 * Required - API name: {@code leader_global_checkpoint}
	 */
	public final long leaderGlobalCheckpoint() {
		return this.leaderGlobalCheckpoint;
	}

	/**
	 * Required - API name: {@code leader_index}
	 */
	public final String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * Required - API name: {@code leader_max_seq_no}
	 */
	public final long leaderMaxSeqNo() {
		return this.leaderMaxSeqNo;
	}

	/**
	 * Required - API name: {@code operations_read}
	 */
	public final long operationsRead() {
		return this.operationsRead;
	}

	/**
	 * Required - API name: {@code operations_written}
	 */
	public final long operationsWritten() {
		return this.operationsWritten;
	}

	/**
	 * Required - API name: {@code outstanding_read_requests}
	 */
	public final int outstandingReadRequests() {
		return this.outstandingReadRequests;
	}

	/**
	 * Required - API name: {@code outstanding_write_requests}
	 */
	public final int outstandingWriteRequests() {
		return this.outstandingWriteRequests;
	}

	/**
	 * Required - API name: {@code read_exceptions}
	 */
	public final List<ReadException> readExceptions() {
		return this.readExceptions;
	}

	/**
	 * Required - API name: {@code remote_cluster}
	 */
	public final String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Required - API name: {@code shard_id}
	 */
	public final int shardId() {
		return this.shardId;
	}

	/**
	 * Required - API name: {@code successful_read_requests}
	 */
	public final long successfulReadRequests() {
		return this.successfulReadRequests;
	}

	/**
	 * Required - API name: {@code successful_write_requests}
	 */
	public final long successfulWriteRequests() {
		return this.successfulWriteRequests;
	}

	/**
	 * Required - API name: {@code time_since_last_read_millis}
	 */
	public final String timeSinceLastReadMillis() {
		return this.timeSinceLastReadMillis;
	}

	/**
	 * Required - API name: {@code total_read_remote_exec_time_millis}
	 */
	public final String totalReadRemoteExecTimeMillis() {
		return this.totalReadRemoteExecTimeMillis;
	}

	/**
	 * Required - API name: {@code total_read_time_millis}
	 */
	public final String totalReadTimeMillis() {
		return this.totalReadTimeMillis;
	}

	/**
	 * Required - API name: {@code total_write_time_millis}
	 */
	public final String totalWriteTimeMillis() {
		return this.totalWriteTimeMillis;
	}

	/**
	 * Required - API name: {@code write_buffer_operation_count}
	 */
	public final long writeBufferOperationCount() {
		return this.writeBufferOperationCount;
	}

	/**
	 * Required - API name: {@code write_buffer_size_in_bytes}
	 */
	public final String writeBufferSizeInBytes() {
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

		if (ModelTypeHelper.isDefined(this.readExceptions)) {
			generator.writeKey("read_exceptions");
			generator.writeStartArray();
			for (ReadException item0 : this.readExceptions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardStats> {
		private Long bytesRead;

		private Long failedReadRequests;

		private Long failedWriteRequests;

		@Nullable
		private ErrorCause fatalException;

		private Long followerAliasesVersion;

		private Long followerGlobalCheckpoint;

		private String followerIndex;

		private Long followerMappingVersion;

		private Long followerMaxSeqNo;

		private Long followerSettingsVersion;

		private Long lastRequestedSeqNo;

		private Long leaderGlobalCheckpoint;

		private String leaderIndex;

		private Long leaderMaxSeqNo;

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
		public final Builder bytesRead(long value) {
			this.bytesRead = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_read_requests}
		 */
		public final Builder failedReadRequests(long value) {
			this.failedReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_write_requests}
		 */
		public final Builder failedWriteRequests(long value) {
			this.failedWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code fatal_exception}
		 */
		public final Builder fatalException(@Nullable ErrorCause value) {
			this.fatalException = value;
			return this;
		}

		/**
		 * API name: {@code fatal_exception}
		 */
		public final Builder fatalException(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.fatalException(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code follower_aliases_version}
		 */
		public final Builder followerAliasesVersion(long value) {
			this.followerAliasesVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_global_checkpoint}
		 */
		public final Builder followerGlobalCheckpoint(long value) {
			this.followerGlobalCheckpoint = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_index}
		 */
		public final Builder followerIndex(String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_mapping_version}
		 */
		public final Builder followerMappingVersion(long value) {
			this.followerMappingVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_max_seq_no}
		 */
		public final Builder followerMaxSeqNo(long value) {
			this.followerMaxSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_settings_version}
		 */
		public final Builder followerSettingsVersion(long value) {
			this.followerSettingsVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code last_requested_seq_no}
		 */
		public final Builder lastRequestedSeqNo(long value) {
			this.lastRequestedSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_global_checkpoint}
		 */
		public final Builder leaderGlobalCheckpoint(long value) {
			this.leaderGlobalCheckpoint = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_index}
		 */
		public final Builder leaderIndex(String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code leader_max_seq_no}
		 */
		public final Builder leaderMaxSeqNo(long value) {
			this.leaderMaxSeqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code operations_read}
		 */
		public final Builder operationsRead(long value) {
			this.operationsRead = value;
			return this;
		}

		/**
		 * Required - API name: {@code operations_written}
		 */
		public final Builder operationsWritten(long value) {
			this.operationsWritten = value;
			return this;
		}

		/**
		 * Required - API name: {@code outstanding_read_requests}
		 */
		public final Builder outstandingReadRequests(int value) {
			this.outstandingReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code outstanding_write_requests}
		 */
		public final Builder outstandingWriteRequests(int value) {
			this.outstandingWriteRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code read_exceptions}
		 */
		public final Builder readExceptions(List<ReadException> value) {
			this.readExceptions = value;
			return this;
		}

		/**
		 * Required - API name: {@code read_exceptions}
		 */
		public final Builder readExceptions(ReadException... value) {
			this.readExceptions = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code read_exceptions}
		 */
		@SafeVarargs
		public final Builder readExceptions(Function<ReadException.Builder, ObjectBuilder<ReadException>>... fns) {
			this.readExceptions = new ArrayList<>(fns.length);
			for (Function<ReadException.Builder, ObjectBuilder<ReadException>> fn : fns) {
				this.readExceptions.add(fn.apply(new ReadException.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code remote_cluster}
		 */
		public final Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_id}
		 */
		public final Builder shardId(int value) {
			this.shardId = value;
			return this;
		}

		/**
		 * Required - API name: {@code successful_read_requests}
		 */
		public final Builder successfulReadRequests(long value) {
			this.successfulReadRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code successful_write_requests}
		 */
		public final Builder successfulWriteRequests(long value) {
			this.successfulWriteRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_since_last_read_millis}
		 */
		public final Builder timeSinceLastReadMillis(String value) {
			this.timeSinceLastReadMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_read_remote_exec_time_millis}
		 */
		public final Builder totalReadRemoteExecTimeMillis(String value) {
			this.totalReadRemoteExecTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_read_time_millis}
		 */
		public final Builder totalReadTimeMillis(String value) {
			this.totalReadTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_write_time_millis}
		 */
		public final Builder totalWriteTimeMillis(String value) {
			this.totalWriteTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code write_buffer_operation_count}
		 */
		public final Builder writeBufferOperationCount(long value) {
			this.writeBufferOperationCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code write_buffer_size_in_bytes}
		 */
		public final Builder writeBufferSizeInBytes(String value) {
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
			_checkSingleUse();

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
		op.add(Builder::followerMaxSeqNo, JsonpDeserializer.longDeserializer(), "follower_max_seq_no");
		op.add(Builder::followerSettingsVersion, JsonpDeserializer.longDeserializer(), "follower_settings_version");
		op.add(Builder::lastRequestedSeqNo, JsonpDeserializer.longDeserializer(), "last_requested_seq_no");
		op.add(Builder::leaderGlobalCheckpoint, JsonpDeserializer.longDeserializer(), "leader_global_checkpoint");
		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::leaderMaxSeqNo, JsonpDeserializer.longDeserializer(), "leader_max_seq_no");
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
