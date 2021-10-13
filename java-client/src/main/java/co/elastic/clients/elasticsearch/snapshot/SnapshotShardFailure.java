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

// typedef: snapshot._types.SnapshotShardFailure
@JsonpDeserializable
public final class SnapshotShardFailure implements JsonpSerializable {
	private final String index;

	private final String nodeId;

	private final String reason;

	private final String shardId;

	private final String status;

	// ---------------------------------------------------------------------------------------------

	public SnapshotShardFailure(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.shardId = Objects.requireNonNull(builder.shardId, "shard_id");
		this.status = Objects.requireNonNull(builder.status, "status");

	}

	public SnapshotShardFailure(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * Required - API name: {@code shard_id}
	 */
	public String shardId() {
		return this.shardId;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public String status() {
		return this.status;
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
		 * Required - API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_id}
		 */
		public Builder shardId(String value) {
			this.shardId = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
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
	 * Json deserializer for {@link SnapshotShardFailure}
	 */
	public static final JsonpDeserializer<SnapshotShardFailure> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotShardFailure::setupSnapshotShardFailureDeserializer, Builder::build);

	protected static void setupSnapshotShardFailureDeserializer(
			DelegatingDeserializer<SnapshotShardFailure.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::shardId, JsonpDeserializer.stringDeserializer(), "shard_id");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");

	}

}
