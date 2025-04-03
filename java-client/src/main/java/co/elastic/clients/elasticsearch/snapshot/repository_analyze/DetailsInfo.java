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

package co.elastic.clients.elasticsearch.snapshot.repository_analyze;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Long;
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

// typedef: snapshot.repository_analyze.DetailsInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.repository_analyze.DetailsInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class DetailsInfo implements JsonpSerializable {
	private final BlobDetails blob;

	@Nullable
	private final Time overwriteElapsed;

	@Nullable
	private final Long overwriteElapsedNanos;

	private final Time writeElapsed;

	private final long writeElapsedNanos;

	private final Time writeThrottled;

	private final long writeThrottledNanos;

	private final SnapshotNodeInfo writerNode;

	// ---------------------------------------------------------------------------------------------

	private DetailsInfo(Builder builder) {

		this.blob = ApiTypeHelper.requireNonNull(builder.blob, this, "blob");
		this.overwriteElapsed = builder.overwriteElapsed;
		this.overwriteElapsedNanos = builder.overwriteElapsedNanos;
		this.writeElapsed = ApiTypeHelper.requireNonNull(builder.writeElapsed, this, "writeElapsed");
		this.writeElapsedNanos = ApiTypeHelper.requireNonNull(builder.writeElapsedNanos, this, "writeElapsedNanos", 0);
		this.writeThrottled = ApiTypeHelper.requireNonNull(builder.writeThrottled, this, "writeThrottled");
		this.writeThrottledNanos = ApiTypeHelper.requireNonNull(builder.writeThrottledNanos, this,
				"writeThrottledNanos", 0);
		this.writerNode = ApiTypeHelper.requireNonNull(builder.writerNode, this, "writerNode");

	}

	public static DetailsInfo of(Function<Builder, ObjectBuilder<DetailsInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A description of the blob that was written and read.
	 * <p>
	 * API name: {@code blob}
	 */
	public final BlobDetails blob() {
		return this.blob;
	}

	/**
	 * The elapsed time spent overwriting the blob. If the blob was not overwritten,
	 * this information is omitted.
	 * <p>
	 * API name: {@code overwrite_elapsed}
	 */
	@Nullable
	public final Time overwriteElapsed() {
		return this.overwriteElapsed;
	}

	/**
	 * The elapsed time spent overwriting the blob, in nanoseconds. If the blob was
	 * not overwritten, this information is omitted.
	 * <p>
	 * API name: {@code overwrite_elapsed_nanos}
	 */
	@Nullable
	public final Long overwriteElapsedNanos() {
		return this.overwriteElapsedNanos;
	}

	/**
	 * Required - The elapsed time spent writing the blob.
	 * <p>
	 * API name: {@code write_elapsed}
	 */
	public final Time writeElapsed() {
		return this.writeElapsed;
	}

	/**
	 * Required - The elapsed time spent writing the blob, in nanoseconds.
	 * <p>
	 * API name: {@code write_elapsed_nanos}
	 */
	public final long writeElapsedNanos() {
		return this.writeElapsedNanos;
	}

	/**
	 * Required - The length of time spent waiting for the
	 * <code>max_snapshot_bytes_per_sec</code> (or
	 * <code>indices.recovery.max_bytes_per_sec</code> if the recovery settings for
	 * managed services are set) throttle while writing the blob.
	 * <p>
	 * API name: {@code write_throttled}
	 */
	public final Time writeThrottled() {
		return this.writeThrottled;
	}

	/**
	 * Required - The length of time spent waiting for the
	 * <code>max_snapshot_bytes_per_sec</code> (or
	 * <code>indices.recovery.max_bytes_per_sec</code> if the recovery settings for
	 * managed services are set) throttle while writing the blob, in nanoseconds.
	 * <p>
	 * API name: {@code write_throttled_nanos}
	 */
	public final long writeThrottledNanos() {
		return this.writeThrottledNanos;
	}

	/**
	 * Required - The node which wrote the blob and coordinated the read operations.
	 * <p>
	 * API name: {@code writer_node}
	 */
	public final SnapshotNodeInfo writerNode() {
		return this.writerNode;
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

		generator.writeKey("blob");
		this.blob.serialize(generator, mapper);

		if (this.overwriteElapsed != null) {
			generator.writeKey("overwrite_elapsed");
			this.overwriteElapsed.serialize(generator, mapper);

		}
		if (this.overwriteElapsedNanos != null) {
			generator.writeKey("overwrite_elapsed_nanos");
			generator.write(this.overwriteElapsedNanos);

		}
		generator.writeKey("write_elapsed");
		this.writeElapsed.serialize(generator, mapper);

		generator.writeKey("write_elapsed_nanos");
		generator.write(this.writeElapsedNanos);

		generator.writeKey("write_throttled");
		this.writeThrottled.serialize(generator, mapper);

		generator.writeKey("write_throttled_nanos");
		generator.write(this.writeThrottledNanos);

		generator.writeKey("writer_node");
		this.writerNode.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DetailsInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DetailsInfo> {
		private BlobDetails blob;

		@Nullable
		private Time overwriteElapsed;

		@Nullable
		private Long overwriteElapsedNanos;

		private Time writeElapsed;

		private Long writeElapsedNanos;

		private Time writeThrottled;

		private Long writeThrottledNanos;

		private SnapshotNodeInfo writerNode;

		/**
		 * Required - A description of the blob that was written and read.
		 * <p>
		 * API name: {@code blob}
		 */
		public final Builder blob(BlobDetails value) {
			this.blob = value;
			return this;
		}

		/**
		 * Required - A description of the blob that was written and read.
		 * <p>
		 * API name: {@code blob}
		 */
		public final Builder blob(Function<BlobDetails.Builder, ObjectBuilder<BlobDetails>> fn) {
			return this.blob(fn.apply(new BlobDetails.Builder()).build());
		}

		/**
		 * The elapsed time spent overwriting the blob. If the blob was not overwritten,
		 * this information is omitted.
		 * <p>
		 * API name: {@code overwrite_elapsed}
		 */
		public final Builder overwriteElapsed(@Nullable Time value) {
			this.overwriteElapsed = value;
			return this;
		}

		/**
		 * The elapsed time spent overwriting the blob. If the blob was not overwritten,
		 * this information is omitted.
		 * <p>
		 * API name: {@code overwrite_elapsed}
		 */
		public final Builder overwriteElapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.overwriteElapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The elapsed time spent overwriting the blob, in nanoseconds. If the blob was
		 * not overwritten, this information is omitted.
		 * <p>
		 * API name: {@code overwrite_elapsed_nanos}
		 */
		public final Builder overwriteElapsedNanos(@Nullable Long value) {
			this.overwriteElapsedNanos = value;
			return this;
		}

		/**
		 * Required - The elapsed time spent writing the blob.
		 * <p>
		 * API name: {@code write_elapsed}
		 */
		public final Builder writeElapsed(Time value) {
			this.writeElapsed = value;
			return this;
		}

		/**
		 * Required - The elapsed time spent writing the blob.
		 * <p>
		 * API name: {@code write_elapsed}
		 */
		public final Builder writeElapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.writeElapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The elapsed time spent writing the blob, in nanoseconds.
		 * <p>
		 * API name: {@code write_elapsed_nanos}
		 */
		public final Builder writeElapsedNanos(long value) {
			this.writeElapsedNanos = value;
			return this;
		}

		/**
		 * Required - The length of time spent waiting for the
		 * <code>max_snapshot_bytes_per_sec</code> (or
		 * <code>indices.recovery.max_bytes_per_sec</code> if the recovery settings for
		 * managed services are set) throttle while writing the blob.
		 * <p>
		 * API name: {@code write_throttled}
		 */
		public final Builder writeThrottled(Time value) {
			this.writeThrottled = value;
			return this;
		}

		/**
		 * Required - The length of time spent waiting for the
		 * <code>max_snapshot_bytes_per_sec</code> (or
		 * <code>indices.recovery.max_bytes_per_sec</code> if the recovery settings for
		 * managed services are set) throttle while writing the blob.
		 * <p>
		 * API name: {@code write_throttled}
		 */
		public final Builder writeThrottled(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.writeThrottled(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The length of time spent waiting for the
		 * <code>max_snapshot_bytes_per_sec</code> (or
		 * <code>indices.recovery.max_bytes_per_sec</code> if the recovery settings for
		 * managed services are set) throttle while writing the blob, in nanoseconds.
		 * <p>
		 * API name: {@code write_throttled_nanos}
		 */
		public final Builder writeThrottledNanos(long value) {
			this.writeThrottledNanos = value;
			return this;
		}

		/**
		 * Required - The node which wrote the blob and coordinated the read operations.
		 * <p>
		 * API name: {@code writer_node}
		 */
		public final Builder writerNode(SnapshotNodeInfo value) {
			this.writerNode = value;
			return this;
		}

		/**
		 * Required - The node which wrote the blob and coordinated the read operations.
		 * <p>
		 * API name: {@code writer_node}
		 */
		public final Builder writerNode(Function<SnapshotNodeInfo.Builder, ObjectBuilder<SnapshotNodeInfo>> fn) {
			return this.writerNode(fn.apply(new SnapshotNodeInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DetailsInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DetailsInfo build() {
			_checkSingleUse();

			return new DetailsInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DetailsInfo}
	 */
	public static final JsonpDeserializer<DetailsInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DetailsInfo::setupDetailsInfoDeserializer);

	protected static void setupDetailsInfoDeserializer(ObjectDeserializer<DetailsInfo.Builder> op) {

		op.add(Builder::blob, BlobDetails._DESERIALIZER, "blob");
		op.add(Builder::overwriteElapsed, Time._DESERIALIZER, "overwrite_elapsed");
		op.add(Builder::overwriteElapsedNanos, JsonpDeserializer.longDeserializer(), "overwrite_elapsed_nanos");
		op.add(Builder::writeElapsed, Time._DESERIALIZER, "write_elapsed");
		op.add(Builder::writeElapsedNanos, JsonpDeserializer.longDeserializer(), "write_elapsed_nanos");
		op.add(Builder::writeThrottled, Time._DESERIALIZER, "write_throttled");
		op.add(Builder::writeThrottledNanos, JsonpDeserializer.longDeserializer(), "write_throttled_nanos");
		op.add(Builder::writerNode, SnapshotNodeInfo._DESERIALIZER, "writer_node");

	}

}
