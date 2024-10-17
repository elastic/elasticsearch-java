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

package co.elastic.clients.elasticsearch.snapshot;

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

// typedef: snapshot._types.SnapshotShardFailure

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SnapshotShardFailure">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotShardFailure implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String nodeId;

	private final String reason;

	private final String shardId;

	private final String indexUuid;

	private final String status;

	// ---------------------------------------------------------------------------------------------

	private SnapshotShardFailure(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.nodeId = builder.nodeId;
		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.shardId = ApiTypeHelper.requireNonNull(builder.shardId, this, "shardId");
		this.indexUuid = ApiTypeHelper.requireNonNull(builder.indexUuid, this, "indexUuid");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static SnapshotShardFailure of(Function<Builder, ObjectBuilder<SnapshotShardFailure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code node_id}
	 */
	@Nullable
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - API name: {@code shard_id}
	 */
	public final String shardId() {
		return this.shardId;
	}

	/**
	 * Required - API name: {@code index_uuid}
	 */
	public final String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final String status() {
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

		if (this.nodeId != null) {
			generator.writeKey("node_id");
			generator.write(this.nodeId);

		}
		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("shard_id");
		generator.write(this.shardId);

		generator.writeKey("index_uuid");
		generator.write(this.indexUuid);

		generator.writeKey("status");
		generator.write(this.status);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotShardFailure}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SnapshotShardFailure> {
		private String index;

		@Nullable
		private String nodeId;

		private String reason;

		private String shardId;

		private String indexUuid;

		private String status;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_id}
		 */
		public final Builder shardId(String value) {
			this.shardId = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_uuid}
		 */
		public final Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(String value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotShardFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotShardFailure build() {
			_checkSingleUse();

			return new SnapshotShardFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotShardFailure}
	 */
	public static final JsonpDeserializer<SnapshotShardFailure> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotShardFailure::setupSnapshotShardFailureDeserializer);

	protected static void setupSnapshotShardFailureDeserializer(ObjectDeserializer<SnapshotShardFailure.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::shardId, JsonpDeserializer.stringDeserializer(), "shard_id");
		op.add(Builder::indexUuid, JsonpDeserializer.stringDeserializer(), "index_uuid");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");

	}

}
