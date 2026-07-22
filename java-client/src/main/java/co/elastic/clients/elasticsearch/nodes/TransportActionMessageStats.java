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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.String;
import java.util.List;
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

// typedef: nodes._types.TransportActionMessageStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.TransportActionMessageStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransportActionMessageStats implements JsonpSerializable {
	private final long count;

	@Nullable
	private final String totalSize;

	private final long totalSizeInBytes;

	private final List<TransportMessageSizeHistogramBucket> histogram;

	// ---------------------------------------------------------------------------------------------

	private TransportActionMessageStats(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.totalSize = builder.totalSize;
		this.totalSizeInBytes = ApiTypeHelper.requireNonNull(builder.totalSizeInBytes, this, "totalSizeInBytes", 0);
		this.histogram = ApiTypeHelper.unmodifiableRequired(builder.histogram, this, "histogram");

	}

	public static TransportActionMessageStats of(Function<Builder, ObjectBuilder<TransportActionMessageStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of messages of this kind that the node has handled for
	 * this action.
	 * <p>
	 * API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * The cumulative size of the messages of this kind that the node has handled
	 * for this action.
	 * <p>
	 * API name: {@code total_size}
	 */
	@Nullable
	public final String totalSize() {
		return this.totalSize;
	}

	/**
	 * Required - The cumulative size, in bytes, of the messages of this kind that
	 * the node has handled for this action.
	 * <p>
	 * API name: {@code total_size_in_bytes}
	 */
	public final long totalSizeInBytes() {
		return this.totalSizeInBytes;
	}

	/**
	 * Required - The distribution of the sizes of the messages of this kind that
	 * the node has handled for this action, represented as a histogram.
	 * <p>
	 * API name: {@code histogram}
	 */
	public final List<TransportMessageSizeHistogramBucket> histogram() {
		return this.histogram;
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

		if (this.totalSize != null) {
			generator.writeKey("total_size");
			generator.write(this.totalSize);

		}
		generator.writeKey("total_size_in_bytes");
		generator.write(this.totalSizeInBytes);

		if (ApiTypeHelper.isDefined(this.histogram)) {
			generator.writeKey("histogram");
			generator.writeStartArray();
			for (TransportMessageSizeHistogramBucket item0 : this.histogram) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransportActionMessageStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransportActionMessageStats> {
		private Long count;

		@Nullable
		private String totalSize;

		private Long totalSizeInBytes;

		private List<TransportMessageSizeHistogramBucket> histogram;

		public Builder() {
		}
		private Builder(TransportActionMessageStats instance) {
			this.count = instance.count;
			this.totalSize = instance.totalSize;
			this.totalSizeInBytes = instance.totalSizeInBytes;
			this.histogram = instance.histogram;

		}
		/**
		 * Required - The number of messages of this kind that the node has handled for
		 * this action.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * The cumulative size of the messages of this kind that the node has handled
		 * for this action.
		 * <p>
		 * API name: {@code total_size}
		 */
		public final Builder totalSize(@Nullable String value) {
			this.totalSize = value;
			return this;
		}

		/**
		 * Required - The cumulative size, in bytes, of the messages of this kind that
		 * the node has handled for this action.
		 * <p>
		 * API name: {@code total_size_in_bytes}
		 */
		public final Builder totalSizeInBytes(long value) {
			this.totalSizeInBytes = value;
			return this;
		}

		/**
		 * Required - The distribution of the sizes of the messages of this kind that
		 * the node has handled for this action, represented as a histogram.
		 * <p>
		 * API name: {@code histogram}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>histogram</code>.
		 */
		public final Builder histogram(List<TransportMessageSizeHistogramBucket> list) {
			this.histogram = _listAddAll(this.histogram, list);
			return this;
		}

		/**
		 * Required - The distribution of the sizes of the messages of this kind that
		 * the node has handled for this action, represented as a histogram.
		 * <p>
		 * API name: {@code histogram}
		 * <p>
		 * Adds one or more values to <code>histogram</code>.
		 */
		public final Builder histogram(TransportMessageSizeHistogramBucket value,
				TransportMessageSizeHistogramBucket... values) {
			this.histogram = _listAdd(this.histogram, value, values);
			return this;
		}

		/**
		 * Required - The distribution of the sizes of the messages of this kind that
		 * the node has handled for this action, represented as a histogram.
		 * <p>
		 * API name: {@code histogram}
		 * <p>
		 * Adds a value to <code>histogram</code> using a builder lambda.
		 */
		public final Builder histogram(
				Function<TransportMessageSizeHistogramBucket.Builder, ObjectBuilder<TransportMessageSizeHistogramBucket>> fn) {
			return histogram(fn.apply(new TransportMessageSizeHistogramBucket.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransportActionMessageStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransportActionMessageStats build() {
			_checkSingleUse();

			return new TransportActionMessageStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransportActionMessageStats}
	 */
	public static final JsonpDeserializer<TransportActionMessageStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransportActionMessageStats::setupTransportActionMessageStatsDeserializer);

	protected static void setupTransportActionMessageStatsDeserializer(
			ObjectDeserializer<TransportActionMessageStats.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalSizeInBytes, JsonpDeserializer.longDeserializer(), "total_size_in_bytes");
		op.add(Builder::histogram,
				JsonpDeserializer.arrayDeserializer(TransportMessageSizeHistogramBucket._DESERIALIZER), "histogram");

	}

}
