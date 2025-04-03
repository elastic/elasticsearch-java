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

// typedef: snapshot.repository_analyze.WriteSummaryInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#snapshot.repository_analyze.WriteSummaryInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class WriteSummaryInfo implements JsonpSerializable {
	private final int count;

	private final Time totalElapsed;

	private final long totalElapsedNanos;

	private final String totalSize;

	private final long totalSizeBytes;

	private final Time totalThrottled;

	private final long totalThrottledNanos;

	// ---------------------------------------------------------------------------------------------

	private WriteSummaryInfo(Builder builder) {

		this.count = ApiTypeHelper.requireNonNullWithDefault(builder.count, this, "count", this.count());
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

	}

	public static WriteSummaryInfo of(Function<Builder, ObjectBuilder<WriteSummaryInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of write operations performed in the test.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - The total elapsed time spent on writing blobs in the test.
	 * <p>
	 * API name: {@code total_elapsed}
	 */
	public final Time totalElapsed() {
		return this.totalElapsed;
	}

	/**
	 * Required - The total elapsed time spent on writing blobs in the test, in
	 * nanoseconds.
	 * <p>
	 * API name: {@code total_elapsed_nanos}
	 */
	public final long totalElapsedNanos() {
		return this.totalElapsedNanos;
	}

	/**
	 * Required - The total size of all the blobs written in the test.
	 * <p>
	 * API name: {@code total_size}
	 */
	public final String totalSize() {
		return this.totalSize;
	}

	/**
	 * Required - The total size of all the blobs written in the test, in bytes.
	 * <p>
	 * API name: {@code total_size_bytes}
	 */
	public final long totalSizeBytes() {
		return this.totalSizeBytes;
	}

	/**
	 * Required - The total time spent waiting due to the
	 * <code>max_snapshot_bytes_per_sec</code> throttle.
	 * <p>
	 * API name: {@code total_throttled}
	 */
	public final Time totalThrottled() {
		return this.totalThrottled;
	}

	/**
	 * Required - The total time spent waiting due to the
	 * <code>max_snapshot_bytes_per_sec</code> throttle, in nanoseconds.
	 * <p>
	 * API name: {@code total_throttled_nanos}
	 */
	public final long totalThrottledNanos() {
		return this.totalThrottledNanos;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WriteSummaryInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WriteSummaryInfo> {
		private Integer count;

		private Time totalElapsed;

		private Long totalElapsedNanos;

		private String totalSize;

		private Long totalSizeBytes;

		private Time totalThrottled;

		private Long totalThrottledNanos;

		/**
		 * Required - The number of write operations performed in the test.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - The total elapsed time spent on writing blobs in the test.
		 * <p>
		 * API name: {@code total_elapsed}
		 */
		public final Builder totalElapsed(Time value) {
			this.totalElapsed = value;
			return this;
		}

		/**
		 * Required - The total elapsed time spent on writing blobs in the test.
		 * <p>
		 * API name: {@code total_elapsed}
		 */
		public final Builder totalElapsed(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalElapsed(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total elapsed time spent on writing blobs in the test, in
		 * nanoseconds.
		 * <p>
		 * API name: {@code total_elapsed_nanos}
		 */
		public final Builder totalElapsedNanos(long value) {
			this.totalElapsedNanos = value;
			return this;
		}

		/**
		 * Required - The total size of all the blobs written in the test.
		 * <p>
		 * API name: {@code total_size}
		 */
		public final Builder totalSize(String value) {
			this.totalSize = value;
			return this;
		}

		/**
		 * Required - The total size of all the blobs written in the test, in bytes.
		 * <p>
		 * API name: {@code total_size_bytes}
		 */
		public final Builder totalSizeBytes(long value) {
			this.totalSizeBytes = value;
			return this;
		}

		/**
		 * Required - The total time spent waiting due to the
		 * <code>max_snapshot_bytes_per_sec</code> throttle.
		 * <p>
		 * API name: {@code total_throttled}
		 */
		public final Builder totalThrottled(Time value) {
			this.totalThrottled = value;
			return this;
		}

		/**
		 * Required - The total time spent waiting due to the
		 * <code>max_snapshot_bytes_per_sec</code> throttle.
		 * <p>
		 * API name: {@code total_throttled}
		 */
		public final Builder totalThrottled(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalThrottled(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total time spent waiting due to the
		 * <code>max_snapshot_bytes_per_sec</code> throttle, in nanoseconds.
		 * <p>
		 * API name: {@code total_throttled_nanos}
		 */
		public final Builder totalThrottledNanos(long value) {
			this.totalThrottledNanos = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WriteSummaryInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WriteSummaryInfo build() {
			_checkSingleUse();

			return new WriteSummaryInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WriteSummaryInfo}
	 */
	public static final JsonpDeserializer<WriteSummaryInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WriteSummaryInfo::setupWriteSummaryInfoDeserializer);

	protected static void setupWriteSummaryInfoDeserializer(ObjectDeserializer<WriteSummaryInfo.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::totalElapsed, Time._DESERIALIZER, "total_elapsed");
		op.add(Builder::totalElapsedNanos, JsonpDeserializer.longDeserializer(), "total_elapsed_nanos");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalSizeBytes, JsonpDeserializer.longDeserializer(), "total_size_bytes");
		op.add(Builder::totalThrottled, Time._DESERIALIZER, "total_throttled");
		op.add(Builder::totalThrottledNanos, JsonpDeserializer.longDeserializer(), "total_throttled_nanos");

	}

}
