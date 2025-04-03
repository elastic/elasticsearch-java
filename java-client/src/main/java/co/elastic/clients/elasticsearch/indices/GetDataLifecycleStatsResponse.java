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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.get_data_lifecycle_stats.DataStreamStats;
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

// typedef: indices.get_data_lifecycle_stats.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_data_lifecycle_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetDataLifecycleStatsResponse implements JsonpSerializable {
	private final int dataStreamCount;

	private final List<DataStreamStats> dataStreams;

	@Nullable
	private final Long lastRunDurationInMillis;

	@Nullable
	private final Long timeBetweenStartsInMillis;

	// ---------------------------------------------------------------------------------------------

	private GetDataLifecycleStatsResponse(Builder builder) {

		this.dataStreamCount = ApiTypeHelper.requireNonNull(builder.dataStreamCount, this, "dataStreamCount", 0);
		this.dataStreams = ApiTypeHelper.unmodifiableRequired(builder.dataStreams, this, "dataStreams");
		this.lastRunDurationInMillis = builder.lastRunDurationInMillis;
		this.timeBetweenStartsInMillis = builder.timeBetweenStartsInMillis;

	}

	public static GetDataLifecycleStatsResponse of(Function<Builder, ObjectBuilder<GetDataLifecycleStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The count of data streams currently being managed by the data
	 * stream lifecycle.
	 * <p>
	 * API name: {@code data_stream_count}
	 */
	public final int dataStreamCount() {
		return this.dataStreamCount;
	}

	/**
	 * Required - Information about the data streams that are managed by the data
	 * stream lifecycle.
	 * <p>
	 * API name: {@code data_streams}
	 */
	public final List<DataStreamStats> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * The duration of the last data stream lifecycle execution.
	 * <p>
	 * API name: {@code last_run_duration_in_millis}
	 */
	@Nullable
	public final Long lastRunDurationInMillis() {
		return this.lastRunDurationInMillis;
	}

	/**
	 * The time that passed between the start of the last two data stream lifecycle
	 * executions. This value should amount approximately to
	 * <code>data_streams.lifecycle.poll_interval</code>.
	 * <p>
	 * API name: {@code time_between_starts_in_millis}
	 */
	@Nullable
	public final Long timeBetweenStartsInMillis() {
		return this.timeBetweenStartsInMillis;
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

		generator.writeKey("data_stream_count");
		generator.write(this.dataStreamCount);

		if (ApiTypeHelper.isDefined(this.dataStreams)) {
			generator.writeKey("data_streams");
			generator.writeStartArray();
			for (DataStreamStats item0 : this.dataStreams) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.lastRunDurationInMillis != null) {
			generator.writeKey("last_run_duration_in_millis");
			generator.write(this.lastRunDurationInMillis);

		}
		if (this.timeBetweenStartsInMillis != null) {
			generator.writeKey("time_between_starts_in_millis");
			generator.write(this.timeBetweenStartsInMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataLifecycleStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetDataLifecycleStatsResponse> {
		private Integer dataStreamCount;

		private List<DataStreamStats> dataStreams;

		@Nullable
		private Long lastRunDurationInMillis;

		@Nullable
		private Long timeBetweenStartsInMillis;

		/**
		 * Required - The count of data streams currently being managed by the data
		 * stream lifecycle.
		 * <p>
		 * API name: {@code data_stream_count}
		 */
		public final Builder dataStreamCount(int value) {
			this.dataStreamCount = value;
			return this;
		}

		/**
		 * Required - Information about the data streams that are managed by the data
		 * stream lifecycle.
		 * <p>
		 * API name: {@code data_streams}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(List<DataStreamStats> list) {
			this.dataStreams = _listAddAll(this.dataStreams, list);
			return this;
		}

		/**
		 * Required - Information about the data streams that are managed by the data
		 * stream lifecycle.
		 * <p>
		 * API name: {@code data_streams}
		 * <p>
		 * Adds one or more values to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(DataStreamStats value, DataStreamStats... values) {
			this.dataStreams = _listAdd(this.dataStreams, value, values);
			return this;
		}

		/**
		 * Required - Information about the data streams that are managed by the data
		 * stream lifecycle.
		 * <p>
		 * API name: {@code data_streams}
		 * <p>
		 * Adds a value to <code>dataStreams</code> using a builder lambda.
		 */
		public final Builder dataStreams(Function<DataStreamStats.Builder, ObjectBuilder<DataStreamStats>> fn) {
			return dataStreams(fn.apply(new DataStreamStats.Builder()).build());
		}

		/**
		 * The duration of the last data stream lifecycle execution.
		 * <p>
		 * API name: {@code last_run_duration_in_millis}
		 */
		public final Builder lastRunDurationInMillis(@Nullable Long value) {
			this.lastRunDurationInMillis = value;
			return this;
		}

		/**
		 * The time that passed between the start of the last two data stream lifecycle
		 * executions. This value should amount approximately to
		 * <code>data_streams.lifecycle.poll_interval</code>.
		 * <p>
		 * API name: {@code time_between_starts_in_millis}
		 */
		public final Builder timeBetweenStartsInMillis(@Nullable Long value) {
			this.timeBetweenStartsInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDataLifecycleStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataLifecycleStatsResponse build() {
			_checkSingleUse();

			return new GetDataLifecycleStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataLifecycleStatsResponse}
	 */
	public static final JsonpDeserializer<GetDataLifecycleStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDataLifecycleStatsResponse::setupGetDataLifecycleStatsResponseDeserializer);

	protected static void setupGetDataLifecycleStatsResponseDeserializer(
			ObjectDeserializer<GetDataLifecycleStatsResponse.Builder> op) {

		op.add(Builder::dataStreamCount, JsonpDeserializer.integerDeserializer(), "data_stream_count");
		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(DataStreamStats._DESERIALIZER),
				"data_streams");
		op.add(Builder::lastRunDurationInMillis, JsonpDeserializer.longDeserializer(), "last_run_duration_in_millis");
		op.add(Builder::timeBetweenStartsInMillis, JsonpDeserializer.longDeserializer(),
				"time_between_starts_in_millis");

	}

}
