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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_data_frame_analytics.Response
@JsonpDeserializable
public final class PreviewDataFrameAnalyticsResponse implements JsonpSerializable {
	private final List<Map<String, String>> featureValues;

	// ---------------------------------------------------------------------------------------------

	public PreviewDataFrameAnalyticsResponse(Builder builder) {

		this.featureValues = ModelTypeHelper.unmodifiableNonNull(builder.featureValues, "feature_values");

	}

	public PreviewDataFrameAnalyticsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * An array of objects that contain feature name and value pairs. The features
	 * have been processed and indicate what will be sent to the model for training.
	 * <p>
	 * API name: {@code feature_values}
	 */
	public List<Map<String, String>> featureValues() {
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

		generator.writeKey("feature_values");
		generator.writeStartArray();
		for (Map<String, String> item0 : this.featureValues) {
			generator.writeStartObject();
			for (Map.Entry<String, String> item1 : item0.entrySet()) {
				generator.writeKey(item1.getKey());
				generator.write(item1.getValue());

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PreviewDataFrameAnalyticsResponse}.
	 */
	public static class Builder implements ObjectBuilder<PreviewDataFrameAnalyticsResponse> {
		private List<Map<String, String>> featureValues;

		/**
		 * An array of objects that contain feature name and value pairs. The features
		 * have been processed and indicate what will be sent to the model for training.
		 * <p>
		 * API name: {@code feature_values}
		 */
		public Builder featureValues(List<Map<String, String>> value) {
			this.featureValues = value;
			return this;
		}

		/**
		 * An array of objects that contain feature name and value pairs. The features
		 * have been processed and indicate what will be sent to the model for training.
		 * <p>
		 * API name: {@code feature_values}
		 */
		public Builder featureValues(Map<String, String>... value) {
			this.featureValues = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #featureValues(List)}, creating the list if needed. 4
		 */
		public Builder addFeatureValues(Map<String, String> value) {
			if (this.featureValues == null) {
				this.featureValues = new ArrayList<>();
			}
			this.featureValues.add(value);
			return this;
		}

		/**
		 * Builds a {@link PreviewDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PreviewDataFrameAnalyticsResponse build() {

			return new PreviewDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PreviewDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<PreviewDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PreviewDataFrameAnalyticsResponse::setupPreviewDataFrameAnalyticsResponseDeserializer,
					Builder::build);

	protected static void setupPreviewDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<PreviewDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::featureValues,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer())),
				"feature_values");

	}

}
