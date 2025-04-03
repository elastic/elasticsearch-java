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
import java.lang.Boolean;
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

// typedef: snapshot.repository_analyze.ReadBlobDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.repository_analyze.ReadBlobDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReadBlobDetails implements JsonpSerializable {
	@Nullable
	private final Boolean beforeWriteComplete;

	@Nullable
	private final Time elapsed;

	@Nullable
	private final Long elapsedNanos;

	@Nullable
	private final Time firstByteTime;

	private final long firstByteTimeNanos;

	private final boolean found;

	private final SnapshotNodeInfo node;

	@Nullable
	private final Time throttled;

	@Nullable
	private final Long throttledNanos;

	// ---------------------------------------------------------------------------------------------

	private ReadBlobDetails(Builder builder) {

		this.beforeWriteComplete = builder.beforeWriteComplete;
		this.elapsed = builder.elapsed;
		this.elapsedNanos = builder.elapsedNanos;
		this.firstByteTime = builder.firstByteTime;
		this.firstByteTimeNanos = ApiTypeHelper.requireNonNull(builder.firstByteTimeNanos, this, "firstByteTimeNanos",
				0);
		this.found = ApiTypeHelper.requireNonNull(builder.found, this, "found", false);
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.throttled = builder.throttled;
		this.throttledNanos = builder.throttledNanos;

	}

	public static ReadBlobDetails of(Function<Builder, ObjectBuilder<ReadBlobDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether the read operation may have started before the write
	 * operation was complete.
	 * <p>
	 * API name: {@code before_write_complete}
	 */
	@Nullable
	public final Boolean beforeWriteComplete() {
		return this.beforeWriteComplete;
	}

	/**
	 * The length of time spent reading the blob. If the blob was not found, this
	 * detail is omitted.
	 * <p>
	 * API name: {@code elapsed}
	 */
	@Nullable
	public final Time elapsed() {
		return this.elapsed;
	}

	/**
	 * The length of time spent reading the blob, in nanoseconds. If the blob was
	 * not found, this detail is omitted.
	 * <p>
	 * API name: {@code elapsed_nanos}
	 */
	@Nullable
	public final Long elapsedNanos() {
		return this.elapsedNanos;
	}

	/**
	 * The length of time waiting for the first byte of the read operation to be
	 * received. If the blob was not found, this detail is omitted.
	 * <p>
	 * API name: {@code first_byte_time}
	 */
	@Nullable
	public final Time firstByteTime() {
		return this.firstByteTime;
	}

	/**
	 * Required - The length of time waiting for the first byte of the read
	 * operation to be received, in nanoseconds. If the blob was not found, this
	 * detail is omitted.
	 * <p>
	 * API name: {@code first_byte_time_nanos}
	 */
	public final long firstByteTimeNanos() {
		return this.firstByteTimeNanos;
	}

	/**
	 * Required - Indicates whether the blob was found by the read operation. If the
	 * read was started before the write completed or the write was ended before
	 * completion, it might be false.
	 * <p>
	 * API name: {@code found}
	 */
	public final boolean found() {
		return this.found;
	}

	/**
	 * Required - The node that performed the read operation.
	 * <p>
	 * API name: {@code node}
	 */
	public final SnapshotNodeInfo node() {
		return this.node;
	}

	/**
	 * The length of time spent waiting due to the
	 * <code>max_restore_bytes_per_sec</code> or
	 * <code>indices.recovery.max_bytes_per_sec</code> throttles during the read of
	 * the blob. If the blob was not found, this detail is omitted.
	 * <p>
	 * API name: {@code throttled}
	 */
	@Nullable
	public final Time throttled() {
		return this.throttled;
	}

	/**
	 * The length of time spent waiting due to the
	 * <code>max_restore_bytes_per_sec</code> or
	 * <code>indices.recovery.max_bytes_per_sec</code> throttles during the read of
	 * the blob, in nanoseconds. If the blob was not found, this detail is omitted.
	 * <p>
	 * API name: {@code throttled_nanos}
	 */
	@Nullable
	public final Long throttledNanos() {
		return this.throttledNanos;
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

		if (this.beforeWriteComplete != null) {
			generator.writeKey("before_write_complete");
			generator.write(this.beforeWriteComplete);

		}
		if (this.elapsed != null) {
			generator.writeKey("elapsed");
			this.elapsed.serialize(generator, mapper);

		}
		if (this.elapsedNanos != null) {
			generator.writeKey("elapsed_nanos");
			generator.write(this.elapsedNanos);

		}
		if (this.firstByteTime != null) {
			generator.writeKey("first_byte_time");
			this.firstByteTime.serialize(generator, mapper);

		}
		generator.writeKey("first_byte_time_nanos");
		generator.write(this.firstByteTimeNanos);

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		if (this.throttled != null) {
			generator.writeKey("throttled");
			this.throttled.serialize(generator, mapper);

		}
		if (this.throttledNanos != null) {
			generator.writeKey("throttled_nanos");
			generator.write(this.throttledNanos);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReadBlobDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReadBlobDetails> {
		@Nullable
		private Boolean beforeWriteComplete;

		@Nullable
		private Time elapsed;

		@Nullable
		private Long elapsedNanos;

		@Nullable
		private Time firstByteTime;

		private Long firstByteTimeNanos;

		private Boolean found;

		private SnapshotNodeInfo node;

		@Nullable
		private Time throttled;

		@Nullable
		private Long throttledNanos;

		/**
		 * Indicates whether the read operation may have started before the write
		 * operation was complete.
		 * <p>
		 * API name: {@code before_write_complete}
		 */
		public final Builder beforeWriteComplete(@Nullable Boolean value) {
			this.beforeWriteComplete = value;
			return this;
		}

		/**
		 * The length of time spent reading the blob. If the blob was not found, this
		 * detail is omitted.
		 * <p>
		 * API name: {@code elapsed}
		 */
		public final Builder elapsed(@Nullable Time value) {
			this.elapsed = value;
			return this;
		}

		/**
		 * The length of time spent reading the blob. If the blob was not found, this
		 * detail is omitted.
		 * <p>
		 * API name: {@code elapsed}
		 */
		public final Builder elapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.elapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The length of time spent reading the blob, in nanoseconds. If the blob was
		 * not found, this detail is omitted.
		 * <p>
		 * API name: {@code elapsed_nanos}
		 */
		public final Builder elapsedNanos(@Nullable Long value) {
			this.elapsedNanos = value;
			return this;
		}

		/**
		 * The length of time waiting for the first byte of the read operation to be
		 * received. If the blob was not found, this detail is omitted.
		 * <p>
		 * API name: {@code first_byte_time}
		 */
		public final Builder firstByteTime(@Nullable Time value) {
			this.firstByteTime = value;
			return this;
		}

		/**
		 * The length of time waiting for the first byte of the read operation to be
		 * received. If the blob was not found, this detail is omitted.
		 * <p>
		 * API name: {@code first_byte_time}
		 */
		public final Builder firstByteTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.firstByteTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The length of time waiting for the first byte of the read
		 * operation to be received, in nanoseconds. If the blob was not found, this
		 * detail is omitted.
		 * <p>
		 * API name: {@code first_byte_time_nanos}
		 */
		public final Builder firstByteTimeNanos(long value) {
			this.firstByteTimeNanos = value;
			return this;
		}

		/**
		 * Required - Indicates whether the blob was found by the read operation. If the
		 * read was started before the write completed or the write was ended before
		 * completion, it might be false.
		 * <p>
		 * API name: {@code found}
		 */
		public final Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * Required - The node that performed the read operation.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(SnapshotNodeInfo value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - The node that performed the read operation.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(Function<SnapshotNodeInfo.Builder, ObjectBuilder<SnapshotNodeInfo>> fn) {
			return this.node(fn.apply(new SnapshotNodeInfo.Builder()).build());
		}

		/**
		 * The length of time spent waiting due to the
		 * <code>max_restore_bytes_per_sec</code> or
		 * <code>indices.recovery.max_bytes_per_sec</code> throttles during the read of
		 * the blob. If the blob was not found, this detail is omitted.
		 * <p>
		 * API name: {@code throttled}
		 */
		public final Builder throttled(@Nullable Time value) {
			this.throttled = value;
			return this;
		}

		/**
		 * The length of time spent waiting due to the
		 * <code>max_restore_bytes_per_sec</code> or
		 * <code>indices.recovery.max_bytes_per_sec</code> throttles during the read of
		 * the blob. If the blob was not found, this detail is omitted.
		 * <p>
		 * API name: {@code throttled}
		 */
		public final Builder throttled(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttled(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The length of time spent waiting due to the
		 * <code>max_restore_bytes_per_sec</code> or
		 * <code>indices.recovery.max_bytes_per_sec</code> throttles during the read of
		 * the blob, in nanoseconds. If the blob was not found, this detail is omitted.
		 * <p>
		 * API name: {@code throttled_nanos}
		 */
		public final Builder throttledNanos(@Nullable Long value) {
			this.throttledNanos = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReadBlobDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReadBlobDetails build() {
			_checkSingleUse();

			return new ReadBlobDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReadBlobDetails}
	 */
	public static final JsonpDeserializer<ReadBlobDetails> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReadBlobDetails::setupReadBlobDetailsDeserializer);

	protected static void setupReadBlobDetailsDeserializer(ObjectDeserializer<ReadBlobDetails.Builder> op) {

		op.add(Builder::beforeWriteComplete, JsonpDeserializer.booleanDeserializer(), "before_write_complete");
		op.add(Builder::elapsed, Time._DESERIALIZER, "elapsed");
		op.add(Builder::elapsedNanos, JsonpDeserializer.longDeserializer(), "elapsed_nanos");
		op.add(Builder::firstByteTime, Time._DESERIALIZER, "first_byte_time");
		op.add(Builder::firstByteTimeNanos, JsonpDeserializer.longDeserializer(), "first_byte_time_nanos");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::node, SnapshotNodeInfo._DESERIALIZER, "node");
		op.add(Builder::throttled, Time._DESERIALIZER, "throttled");
		op.add(Builder::throttledNanos, JsonpDeserializer.longDeserializer(), "throttled_nanos");

	}

}
