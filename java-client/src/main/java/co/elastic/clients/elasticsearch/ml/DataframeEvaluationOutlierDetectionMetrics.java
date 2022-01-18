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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationOutlierDetectionMetrics

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeEvaluationOutlierDetectionMetrics">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationOutlierDetectionMetrics extends DataframeEvaluationMetrics {
	private final Map<String, JsonData> confusionMatrix;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationOutlierDetectionMetrics(Builder builder) {
		super(builder);

		this.confusionMatrix = ApiTypeHelper.unmodifiable(builder.confusionMatrix);

	}

	public static DataframeEvaluationOutlierDetectionMetrics of(
			Function<Builder, ObjectBuilder<DataframeEvaluationOutlierDetectionMetrics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Accuracy of predictions (per-class and overall).
	 * <p>
	 * API name: {@code confusion_matrix}
	 */
	public final Map<String, JsonData> confusionMatrix() {
		return this.confusionMatrix;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.confusionMatrix)) {
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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>confusionMatrix</code>.
		 */
		public final Builder confusionMatrix(Map<String, JsonData> map) {
			this.confusionMatrix = _mapPutAll(this.confusionMatrix, map);
			return this;
		}

		/**
		 * Accuracy of predictions (per-class and overall).
		 * <p>
		 * API name: {@code confusion_matrix}
		 * <p>
		 * Adds an entry to <code>confusionMatrix</code>.
		 */
		public final Builder confusionMatrix(String key, JsonData value) {
			this.confusionMatrix = _mapPut(this.confusionMatrix, key, value);
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
			_checkSingleUse();

			return new DataframeEvaluationOutlierDetectionMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationOutlierDetectionMetrics}
	 */
	public static final JsonpDeserializer<DataframeEvaluationOutlierDetectionMetrics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationOutlierDetectionMetrics::setupDataframeEvaluationOutlierDetectionMetricsDeserializer);

	protected static void setupDataframeEvaluationOutlierDetectionMetricsDeserializer(
			ObjectDeserializer<DataframeEvaluationOutlierDetectionMetrics.Builder> op) {
		DataframeEvaluationMetrics.setupDataframeEvaluationMetricsDeserializer(op);
		op.add(Builder::confusionMatrix, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"confusion_matrix");

	}

}
