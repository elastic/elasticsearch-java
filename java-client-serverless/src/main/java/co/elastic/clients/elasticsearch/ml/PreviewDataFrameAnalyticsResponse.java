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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_data_frame_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.preview_data_frame_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PreviewDataFrameAnalyticsResponse implements JsonpSerializable {
	private final List<Map<String, String>> featureValues;

	// ---------------------------------------------------------------------------------------------

	private PreviewDataFrameAnalyticsResponse(Builder builder) {

		this.featureValues = ApiTypeHelper.unmodifiableRequired(builder.featureValues, this, "featureValues");

	}

	public static PreviewDataFrameAnalyticsResponse of(
			Function<Builder, ObjectBuilder<PreviewDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An array of objects that contain feature name and value pairs. The
	 * features have been processed and indicate what will be sent to the model for
	 * training.
	 * <p>
	 * API name: {@code feature_values}
	 */
	public final List<Map<String, String>> featureValues() {
		return this.featureValues;
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

		if (ApiTypeHelper.isDefined(this.featureValues)) {
			generator.writeKey("feature_values");
			generator.writeStartArray();
			for (Map<String, String> item0 : this.featureValues) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, String> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

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
	 * Builder for {@link PreviewDataFrameAnalyticsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PreviewDataFrameAnalyticsResponse> {
		private List<Map<String, String>> featureValues;

		/**
		 * Required - An array of objects that contain feature name and value pairs. The
		 * features have been processed and indicate what will be sent to the model for
		 * training.
		 * <p>
		 * API name: {@code feature_values}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureValues</code>.
		 */
		public final Builder featureValues(List<Map<String, String>> list) {
			this.featureValues = _listAddAll(this.featureValues, list);
			return this;
		}

		/**
		 * Required - An array of objects that contain feature name and value pairs. The
		 * features have been processed and indicate what will be sent to the model for
		 * training.
		 * <p>
		 * API name: {@code feature_values}
		 * <p>
		 * Adds one or more values to <code>featureValues</code>.
		 */
		public final Builder featureValues(Map<String, String> value, Map<String, String>... values) {
			this.featureValues = _listAdd(this.featureValues, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PreviewDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new PreviewDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<PreviewDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PreviewDataFrameAnalyticsResponse::setupPreviewDataFrameAnalyticsResponseDeserializer);

	protected static void setupPreviewDataFrameAnalyticsResponseDeserializer(
			ObjectDeserializer<PreviewDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::featureValues,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())),
				"feature_values");

	}

}
