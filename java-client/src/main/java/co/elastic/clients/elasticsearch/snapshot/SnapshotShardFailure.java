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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot._types.SnapshotShardFailure
public final class SnapshotShardFailure implements ToJsonp {
	private final String index;

	private final String nodeId;

	private final String reason;

	private final String shardId;

	private final String status;

	// ---------------------------------------------------------------------------------------------

	protected SnapshotShardFailure(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.shardId = Objects.requireNonNull(builder.shardId, "shard_id");
		this.status = Objects.requireNonNull(builder.status, "status");

	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code shard_id}
	 */
	public String shardId() {
		return this.shardId;
	}

	/**
	 * API name: {@code status}
	 */
	public String status() {
		return this.status;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("shard_id");
		generator.write(this.shardId);

		generator.writeKey("status");
		generator.write(this.status);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotShardFailure}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotShardFailure> {
		private String index;

		private String nodeId;

		private String reason;

		private String shardId;

		private String status;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code shard_id}
		 */
		public Builder shardId(String value) {
			this.shardId = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(String value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link SnapshotShardFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotShardFailure build() {

			return new SnapshotShardFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for SnapshotShardFailure
	 */
	public static final JsonpValueParser<SnapshotShardFailure> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, SnapshotShardFailure::setupSnapshotShardFailureParser);

	protected static void setupSnapshotShardFailureParser(DelegatingJsonpValueParser<SnapshotShardFailure.Builder> op) {

		op.add(Builder::index, JsonpValueParser.stringParser(), "index");
		op.add(Builder::nodeId, JsonpValueParser.stringParser(), "node_id");
		op.add(Builder::reason, JsonpValueParser.stringParser(), "reason");
		op.add(Builder::shardId, JsonpValueParser.stringParser(), "shard_id");
		op.add(Builder::status, JsonpValueParser.stringParser(), "status");

	}

}
