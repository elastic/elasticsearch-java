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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationOutlierDetectionMetrics
public final class DataframeEvaluationOutlierDetectionMetrics extends DataframeEvaluationMetrics {
	@Nullable
	private final Map<String, JsonData> confusionMatrix;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationOutlierDetectionMetrics(Builder builder) {
		super(builder);

		this.confusionMatrix = builder.confusionMatrix;

	}

	/**
	 * Accuracy of predictions (per-class and overall).
	 * <p>
	 * API name: {@code confusion_matrix}
	 */
	@Nullable
	public Map<String, JsonData> confusionMatrix() {
		return this.confusionMatrix;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.confusionMatrix != null) {

			generator.writeKey("confusion_matrix");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.confusionMatrix.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationOutlierDetectionMetrics}.
	 */
	public static class Builder extends DataframeEvaluationMetrics.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationOutlierDetectionMetrics> {
		@Nullable
		private Map<String, JsonData> confusionMatrix;

		/**
		 * Accuracy of predictions (per-class and overall).
		 * <p>
		 * API name: {@code confusion_matrix}
		 */
		public Builder confusionMatrix(@Nullable Map<String, JsonData> value) {
			this.confusionMatrix = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #confusionMatrix(Map)}, creating the map if needed.
		 */
		public Builder putConfusionMatrix(String key, JsonData value) {
			if (this.confusionMatrix == null) {
				this.confusionMatrix = new HashMap<>();
			}
			this.confusionMatrix.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationOutlierDetectionMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationOutlierDetectionMetrics build() {

			return new DataframeEvaluationOutlierDetectionMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationOutlierDetectionMetrics}
	 */
	public static final JsonpDeserializer<DataframeEvaluationOutlierDetectionMetrics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeEvaluationOutlierDetectionMetrics::setupDataframeEvaluationOutlierDetectionMetricsDeserializer);

	protected static void setupDataframeEvaluationOutlierDetectionMetricsDeserializer(
			DelegatingDeserializer<DataframeEvaluationOutlierDetectionMetrics.Builder> op) {
		DataframeEvaluationMetrics.setupDataframeEvaluationMetricsDeserializer(op);
		op.add(Builder::confusionMatrix, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER),
				"confusion_matrix");

	}

}
