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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_data_frame_analytics_stats.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.get_data_frame_analytics_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetDataFrameAnalyticsStatsResponse implements JsonpSerializable {
	private final long count;

	private final List<DataframeAnalytics> dataFrameAnalytics;

	// ---------------------------------------------------------------------------------------------

	private GetDataFrameAnalyticsStatsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.dataFrameAnalytics = ApiTypeHelper.unmodifiableRequired(builder.dataFrameAnalytics, this,
				"dataFrameAnalytics");

	}

	public static GetDataFrameAnalyticsStatsResponse of(
			Function<Builder, ObjectBuilder<GetDataFrameAnalyticsStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - An array of objects that contain usage information for data frame
	 * analytics jobs, which are sorted by the id value in ascending order.
	 * <p>
	 * API name: {@code data_frame_analytics}
	 */
	public final List<DataframeAnalytics> dataFrameAnalytics() {
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

		if (ApiTypeHelper.isDefined(this.dataFrameAnalytics)) {
			generator.writeKey("data_frame_analytics");
			generator.writeStartArray();
			for (DataframeAnalytics item0 : this.dataFrameAnalytics) {
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
	 * Builder for {@link GetDataFrameAnalyticsStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetDataFrameAnalyticsStatsResponse> {
		private Long count;

		private List<DataframeAnalytics> dataFrameAnalytics;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - An array of objects that contain usage information for data frame
		 * analytics jobs, which are sorted by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataFrameAnalytics</code>.
		 */
		public final Builder dataFrameAnalytics(List<DataframeAnalytics> list) {
			this.dataFrameAnalytics = _listAddAll(this.dataFrameAnalytics, list);
			return this;
		}

		/**
		 * Required - An array of objects that contain usage information for data frame
		 * analytics jobs, which are sorted by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 * <p>
		 * Adds one or more values to <code>dataFrameAnalytics</code>.
		 */
		public final Builder dataFrameAnalytics(DataframeAnalytics value, DataframeAnalytics... values) {
			this.dataFrameAnalytics = _listAdd(this.dataFrameAnalytics, value, values);
			return this;
		}

		/**
		 * Required - An array of objects that contain usage information for data frame
		 * analytics jobs, which are sorted by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 * <p>
		 * Adds a value to <code>dataFrameAnalytics</code> using a builder lambda.
		 */
		public final Builder dataFrameAnalytics(
				Function<DataframeAnalytics.Builder, ObjectBuilder<DataframeAnalytics>> fn) {
			return dataFrameAnalytics(fn.apply(new DataframeAnalytics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDataFrameAnalyticsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataFrameAnalyticsStatsResponse build() {
			_checkSingleUse();

			return new GetDataFrameAnalyticsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataFrameAnalyticsStatsResponse}
	 */
	public static final JsonpDeserializer<GetDataFrameAnalyticsStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					GetDataFrameAnalyticsStatsResponse::setupGetDataFrameAnalyticsStatsResponseDeserializer);

	protected static void setupGetDataFrameAnalyticsStatsResponseDeserializer(
			ObjectDeserializer<GetDataFrameAnalyticsStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::dataFrameAnalytics, JsonpDeserializer.arrayDeserializer(DataframeAnalytics._DESERIALIZER),
				"data_frame_analytics");

	}

}
