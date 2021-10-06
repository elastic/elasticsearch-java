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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_data_frame_analytics_stats.Response
@JsonpDeserializable
public final class GetDataFrameAnalyticsStatsResponse implements JsonpSerializable {
	private final long count;

	private final List<DataframeAnalytics> dataFrameAnalytics;

	// ---------------------------------------------------------------------------------------------

	public GetDataFrameAnalyticsStatsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.dataFrameAnalytics = ModelTypeHelper.unmodifiableNonNull(builder.dataFrameAnalytics,
				"data_frame_analytics");

	}

	public GetDataFrameAnalyticsStatsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Required - An array of objects that contain usage information for data frame
	 * analytics jobs, which are sorted by the id value in ascending order.
	 * <p>
	 * API name: {@code data_frame_analytics}
	 */
	public List<DataframeAnalytics> dataFrameAnalytics() {
		return this.dataFrameAnalytics;
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

		generator.writeKey("data_frame_analytics");
		generator.writeStartArray();
		for (DataframeAnalytics item0 : this.dataFrameAnalytics) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataFrameAnalyticsStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetDataFrameAnalyticsStatsResponse> {
		private Long count;

		private List<DataframeAnalytics> dataFrameAnalytics;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - An array of objects that contain usage information for data frame
		 * analytics jobs, which are sorted by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 */
		public Builder dataFrameAnalytics(List<DataframeAnalytics> value) {
			this.dataFrameAnalytics = value;
			return this;
		}

		/**
		 * Required - An array of objects that contain usage information for data frame
		 * analytics jobs, which are sorted by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 */
		public Builder dataFrameAnalytics(DataframeAnalytics... value) {
			this.dataFrameAnalytics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataFrameAnalytics(List)}, creating the list if
		 * needed.
		 */
		public Builder addDataFrameAnalytics(DataframeAnalytics value) {
			if (this.dataFrameAnalytics == null) {
				this.dataFrameAnalytics = new ArrayList<>();
			}
			this.dataFrameAnalytics.add(value);
			return this;
		}

		/**
		 * Set {@link #dataFrameAnalytics(List)} to a singleton list.
		 */
		public Builder dataFrameAnalytics(Function<DataframeAnalytics.Builder, ObjectBuilder<DataframeAnalytics>> fn) {
			return this.dataFrameAnalytics(fn.apply(new DataframeAnalytics.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataFrameAnalytics(List)}, creating the list if
		 * needed.
		 */
		public Builder addDataFrameAnalytics(
				Function<DataframeAnalytics.Builder, ObjectBuilder<DataframeAnalytics>> fn) {
			return this.addDataFrameAnalytics(fn.apply(new DataframeAnalytics.Builder()).build());
		}

		/**
		 * Builds a {@link GetDataFrameAnalyticsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataFrameAnalyticsStatsResponse build() {

			return new GetDataFrameAnalyticsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataFrameAnalyticsStatsResponse}
	 */
	public static final JsonpDeserializer<GetDataFrameAnalyticsStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDataFrameAnalyticsStatsResponse::setupGetDataFrameAnalyticsStatsResponseDeserializer,
					Builder::build);

	protected static void setupGetDataFrameAnalyticsStatsResponseDeserializer(
			DelegatingDeserializer<GetDataFrameAnalyticsStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::dataFrameAnalytics, JsonpDeserializer.arrayDeserializer(DataframeAnalytics._DESERIALIZER),
				"data_frame_analytics");

	}

}
