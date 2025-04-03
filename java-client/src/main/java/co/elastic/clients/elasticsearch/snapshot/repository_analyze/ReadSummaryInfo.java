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
import java.lang.Integer;
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

// typedef: snapshot.repository_analyze.ReadSummaryInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.repository_analyze.ReadSummaryInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReadSummaryInfo implements JsonpSerializable {
	private final int count;

	private final Time maxWait;

	private final long maxWaitNanos;

	private final Time totalElapsed;

	private final long totalElapsedNanos;

	private final String totalSize;

	private final long totalSizeBytes;

	private final Time totalThrottled;

	private final long totalThrottledNanos;

	private final Time totalWait;

	private final long totalWaitNanos;

	// ---------------------------------------------------------------------------------------------

	private ReadSummaryInfo(Builder builder) {

		this.count = ApiTypeHelper.requireNonNullWithDefault(builder.count, this, "count", this.count());
		this.maxWait = ApiTypeHelper.requireNonNullWithDefault(builder.maxWait, this, "maxWait", this.maxWait());
		this.maxWaitNanos = ApiTypeHelper.requireNonNullWithDefault(builder.maxWaitNanos, this, "maxWaitNanos",
				this.maxWaitNanos());
		this.totalElapsed = ApiTypeHelper.requireNonNullWithDefault(builder.totalElapsed, this, "totalElapsed",
				this.totalElapsed());
		this.totalElapsedNanos = ApiTypeHelper.requireNonNullWithDefault(builder.totalElapsedNanos, this,
				"totalElapsedNanos", this.totalElapsedNanos());
		this.totalSize = ApiTypeHelper.requireNonNullWithDefault(builder.totalSize, this, "totalSize",
				this.totalSize());
		this.totalSizeBytes = ApiTypeHelper.requireNonNullWithDefault(builder.totalSizeBytes, this, "totalSizeBytes",
				this.totalSizeBytes());
		this.totalThrottled = ApiTypeHelper.requireNonNullWithDefault(builder.totalThrottled, this, "totalThrottled",
				this.totalThrottled());
		this.totalThrottledNanos = ApiTypeHelper.requireNonNullWithDefault(builder.totalThrottledNanos, this,
				"totalThrottledNanos", this.totalThrottledNanos());
		this.totalWait = ApiTypeHelper.requireNonNullWithDefault(builder.totalWait, this, "totalWait",
				this.totalWait());
		this.totalWaitNanos = ApiTypeHelper.requireNonNullWithDefault(builder.totalWaitNanos, this, "totalWaitNanos",
				this.totalWaitNanos());

	}

	public static ReadSummaryInfo of(Function<Builder, ObjectBuilder<ReadSummaryInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of read operations performed in the test.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - The maximum time spent waiting for the first byte of any read
	 * request to be received.
	 * <p>
	 * API name: {@code max_wait}
	 */
	public final Time maxWait() {
		return this.maxWait;
	}

	/**
	 * Required - The maximum time spent waiting for the first byte of any read
	 * request to be received, in nanoseconds.
	 * <p>
	 * API name: {@code max_wait_nanos}
	 */
	public final long maxWaitNanos() {
		return this.maxWaitNanos;
	}

	/**
	 * Required - The total elapsed time spent on reading blobs in the test.
	 * <p>
	 * API name: {@code total_elapsed}
	 */
	public final Time totalElapsed() {
		return this.totalElapsed;
	}

	/**
	 * Required - The total elapsed time spent on reading blobs in the test, in
	 * nanoseconds.
	 * <p>
	 * API name: {@code total_elapsed_nanos}
	 */
	public final long totalElapsedNanos() {
		return this.totalElapsedNanos;
	}

	/**
	 * Required - The total size of all the blobs or partial blobs read in the test.
	 * <p>
	 * API name: {@code total_size}
	 */
	public final String totalSize() {
		return this.totalSize;
	}

	/**
	 * Required - The total size of all the blobs or partial blobs read in the test,
	 * in bytes.
	 * <p>
	 * API name: {@code total_size_bytes}
	 */
	public final long totalSizeBytes() {
		return this.totalSizeBytes;
	}

	/**
	 * Required - The total time spent waiting due to the
	 * <code>max_restore_bytes_per_sec</code> or
	 * <code>indices.recovery.max_bytes_per_sec</code> throttles.
	 * <p>
	 * API name: {@code total_throttled}
	 */
	public final Time totalThrottled() {
		return this.totalThrottled;
	}

	/**
	 * Required - The total time spent waiting due to the
	 * <code>max_restore_bytes_per_sec</code> or
	 * <code>indices.recovery.max_bytes_per_sec</code> throttles, in nanoseconds.
	 * <p>
	 * API name: {@code total_throttled_nanos}
	 */
	public final long totalThrottledNanos() {
		return this.totalThrottledNanos;
	}

	/**
	 * Required - The total time spent waiting for the first byte of each read
	 * request to be received.
	 * <p>
	 * API name: {@code total_wait}
	 */
	public final Time totalWait() {
		return this.totalWait;
	}

	/**
	 * Required - The total time spent waiting for the first byte of each read
	 * request to be received, in nanoseconds.
	 * <p>
	 * API name: {@code total_wait_nanos}
	 */
	public final long totalWaitNanos() {
		return this.totalWaitNanos;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("max_wait");
		this.maxWait.serialize(generator, mapper);

		generator.writeKey("max_wait_nanos");
		generator.write(this.maxWaitNanos);

		generator.writeKey("total_elapsed");
		this.totalElapsed.serialize(generator, mapper);

		generator.writeKey("total_elapsed_nanos");
		generator.write(this.totalElapsedNanos);

		generator.writeKey("total_size");
		generator.write(this.totalSize);

		generator.writeKey("total_size_bytes");
		generator.write(this.totalSizeBytes);

		generator.writeKey("total_throttled");
		this.totalThrottled.serialize(generator, mapper);

		generator.writeKey("total_throttled_nanos");
		generator.write(this.totalThrottledNanos);

		generator.writeKey("total_wait");
		this.totalWait.serialize(generator, mapper);

		generator.writeKey("total_wait_nanos");
		generator.write(this.totalWaitNanos);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReadSummaryInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReadSummaryInfo> {
		private Integer count;

		private Time maxWait;

		private Long maxWaitNanos;

		private Time totalElapsed;

		private Long totalElapsedNanos;

		private String totalSize;

		private Long totalSizeBytes;

		private Time totalThrottled;

		private Long totalThrottledNanos;

		private Time totalWait;

		private Long totalWaitNanos;

		/**
		 * Required - The number of read operations performed in the test.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - The maximum time spent waiting for the first byte of any read
		 * request to be received.
		 * <p>
		 * API name: {@code max_wait}
		 */
		public final Builder maxWait(Time value) {
			this.maxWait = value;
			return this;
		}

		/**
		 * Required - The maximum time spent waiting for the first byte of any read
		 * request to be received.
		 * <p>
		 * API name: {@code max_wait}
		 */
		public final Builder maxWait(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.maxWait(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The maximum time spent waiting for the first byte of any read
		 * request to be received, in nanoseconds.
		 * <p>
		 * API name: {@code max_wait_nanos}
		 */
		public final Builder maxWaitNanos(long value) {
			this.maxWaitNanos = value;
			return this;
		}

		/**
		 * Required - The total elapsed time spent on reading blobs in the test.
		 * <p>
		 * API name: {@code total_elapsed}
		 */
		public final Builder totalElapsed(Time value) {
			this.totalElapsed = value;
			return this;
		}

		/**
		 * Required - The total elapsed time spent on reading blobs in the test.
		 * <p>
		 * API name: {@code total_elapsed}
		 */
		public final Builder totalElapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalElapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total elapsed time spent on reading blobs in the test, in
		 * nanoseconds.
		 * <p>
		 * API name: {@code total_elapsed_nanos}
		 */
		public final Builder totalElapsedNanos(long value) {
			this.totalElapsedNanos = value;
			return this;
		}

		/**
		 * Required - The total size of all the blobs or partial blobs read in the test.
		 * <p>
		 * API name: {@code total_size}
		 */
		public final Builder totalSize(String value) {
			this.totalSize = value;
			return this;
		}

		/**
		 * Required - The total size of all the blobs or partial blobs read in the test,
		 * in bytes.
		 * <p>
		 * API name: {@code total_size_bytes}
		 */
		public final Builder totalSizeBytes(long value) {
			this.totalSizeBytes = value;
			return this;
		}

		/**
		 * Required - The total time spent waiting due to the
		 * <code>max_restore_bytes_per_sec</code> or
		 * <code>indices.recovery.max_bytes_per_sec</code> throttles.
		 * <p>
		 * API name: {@code total_throttled}
		 */
		public final Builder totalThrottled(Time value) {
			this.totalThrottled = value;
			return this;
		}

		/**
		 * Required - The total time spent waiting due to the
		 * <code>max_restore_bytes_per_sec</code> or
		 * <code>indices.recovery.max_bytes_per_sec</code> throttles.
		 * <p>
		 * API name: {@code total_throttled}
		 */
		public final Builder totalThrottled(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalThrottled(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total time spent waiting due to the
		 * <code>max_restore_bytes_per_sec</code> or
		 * <code>indices.recovery.max_bytes_per_sec</code> throttles, in nanoseconds.
		 * <p>
		 * API name: {@code total_throttled_nanos}
		 */
		public final Builder totalThrottledNanos(long value) {
			this.totalThrottledNanos = value;
			return this;
		}

		/**
		 * Required - The total time spent waiting for the first byte of each read
		 * request to be received.
		 * <p>
		 * API name: {@code total_wait}
		 */
		public final Builder totalWait(Time value) {
			this.totalWait = value;
			return this;
		}

		/**
		 * Required - The total time spent waiting for the first byte of each read
		 * request to be received.
		 * <p>
		 * API name: {@code total_wait}
		 */
		public final Builder totalWait(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalWait(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total time spent waiting for the first byte of each read
		 * request to be received, in nanoseconds.
		 * <p>
		 * API name: {@code total_wait_nanos}
		 */
		public final Builder totalWaitNanos(long value) {
			this.totalWaitNanos = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReadSummaryInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReadSummaryInfo build() {
			_checkSingleUse();

			return new ReadSummaryInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReadSummaryInfo}
	 */
	public static final JsonpDeserializer<ReadSummaryInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReadSummaryInfo::setupReadSummaryInfoDeserializer);

	protected static void setupReadSummaryInfoDeserializer(ObjectDeserializer<ReadSummaryInfo.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::maxWait, Time._DESERIALIZER, "max_wait");
		op.add(Builder::maxWaitNanos, JsonpDeserializer.longDeserializer(), "max_wait_nanos");
		op.add(Builder::totalElapsed, Time._DESERIALIZER, "total_elapsed");
		op.add(Builder::totalElapsedNanos, JsonpDeserializer.longDeserializer(), "total_elapsed_nanos");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalSizeBytes, JsonpDeserializer.longDeserializer(), "total_size_bytes");
		op.add(Builder::totalThrottled, Time._DESERIALIZER, "total_throttled");
		op.add(Builder::totalThrottledNanos, JsonpDeserializer.longDeserializer(), "total_throttled_nanos");
		op.add(Builder::totalWait, Time._DESERIALIZER, "total_wait");
		op.add(Builder::totalWaitNanos, JsonpDeserializer.longDeserializer(), "total_wait_nanos");

	}

}
