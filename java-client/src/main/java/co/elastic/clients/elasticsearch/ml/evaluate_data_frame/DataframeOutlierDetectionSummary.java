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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeOutlierDetectionSummary
@JsonpDeserializable
public class DataframeOutlierDetectionSummary implements JsonpSerializable {
	@Nullable
	private final DataframeEvaluationSummaryAucRoc aucRoc;

	private final Map<String, Double> precision;

	private final Map<String, Double> recall;

	private final Map<String, ConfusionMatrixThreshold> confusionMatrix;

	// ---------------------------------------------------------------------------------------------

	private DataframeOutlierDetectionSummary(Builder builder) {

		this.aucRoc = builder.aucRoc;
		this.precision = ModelTypeHelper.unmodifiable(builder.precision);
		this.recall = ModelTypeHelper.unmodifiable(builder.recall);
		this.confusionMatrix = ModelTypeHelper.unmodifiable(builder.confusionMatrix);

	}

	public static DataframeOutlierDetectionSummary of(
			Function<Builder, ObjectBuilder<DataframeOutlierDetectionSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code auc_roc}
	 */
	@Nullable
	public final DataframeEvaluationSummaryAucRoc aucRoc() {
		return this.aucRoc;
	}

	/**
	 * API name: {@code precision}
	 */
	public final Map<String, Double> precision() {
		return this.precision;
	}

	/**
	 * API name: {@code recall}
	 */
	public final Map<String, Double> recall() {
		return this.recall;
	}

	/**
	 * API name: {@code confusion_matrix}
	 */
	public final Map<String, ConfusionMatrixThreshold> confusionMatrix() {
		return this.confusionMatrix;
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

		if (this.aucRoc != null) {
			generator.writeKey("auc_roc");
			this.aucRoc.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.precision)) {
			generator.writeKey("precision");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.precision.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.recall)) {
			generator.writeKey("recall");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.recall.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.confusionMatrix)) {
			generator.writeKey("confusion_matrix");
			generator.writeStartObject();
			for (Map.Entry<String, ConfusionMatrixThreshold> item0 : this.confusionMatrix.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeOutlierDetectionSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataframeOutlierDetectionSummary> {
		@Nullable
		private DataframeEvaluationSummaryAucRoc aucRoc;

		@Nullable
		private Map<String, Double> precision;

		@Nullable
		private Map<String, Double> recall;

		@Nullable
		private Map<String, ConfusionMatrixThreshold> confusionMatrix;

		/**
		 * API name: {@code auc_roc}
		 */
		public final Builder aucRoc(@Nullable DataframeEvaluationSummaryAucRoc value) {
			this.aucRoc = value;
			return this;
		}

		/**
		 * API name: {@code auc_roc}
		 */
		public final Builder aucRoc(
				Function<DataframeEvaluationSummaryAucRoc.Builder, ObjectBuilder<DataframeEvaluationSummaryAucRoc>> fn) {
			return this.aucRoc(fn.apply(new DataframeEvaluationSummaryAucRoc.Builder()).build());
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable Map<String, Double> value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code recall}
		 */
		public final Builder recall(@Nullable Map<String, Double> value) {
			this.recall = value;
			return this;
		}

		/**
		 * API name: {@code confusion_matrix}
		 */
		public final Builder confusionMatrix(@Nullable Map<String, ConfusionMatrixThreshold> value) {
			this.confusionMatrix = value;
			return this;
		}

		/**
		 * Set {@link #confusionMatrix(Map)} to a singleton map.
		 */
		public Builder confusionMatrix(String key,
				Function<ConfusionMatrixThreshold.Builder, ObjectBuilder<ConfusionMatrixThreshold>> fn) {
			return this.confusionMatrix(
					Collections.singletonMap(key, fn.apply(new ConfusionMatrixThreshold.Builder()).build()));
		}

		public final Builder confusionMatrix(
				Function<MapBuilder<String, ConfusionMatrixThreshold, ConfusionMatrixThreshold.Builder>, ObjectBuilder<Map<String, ConfusionMatrixThreshold>>> fn) {
			return confusionMatrix(fn.apply(new MapBuilder<>(ConfusionMatrixThreshold.Builder::new)).build());
		}

		/**
		 * Builds a {@link DataframeOutlierDetectionSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeOutlierDetectionSummary build() {
			_checkSingleUse();

			return new DataframeOutlierDetectionSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeOutlierDetectionSummary}
	 */
	public static final JsonpDeserializer<DataframeOutlierDetectionSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeOutlierDetectionSummary::setupDataframeOutlierDetectionSummaryDeserializer,
					Builder::build);

	protected static void setupDataframeOutlierDetectionSummaryDeserializer(
			DelegatingDeserializer<DataframeOutlierDetectionSummary.Builder> op) {

		op.add(Builder::aucRoc, DataframeEvaluationSummaryAucRoc._DESERIALIZER, "auc_roc");
		op.add(Builder::precision, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"precision");
		op.add(Builder::recall, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"recall");
		op.add(Builder::confusionMatrix,
				JsonpDeserializer.stringMapDeserializer(ConfusionMatrixThreshold._DESERIALIZER), "confusion_matrix");

	}

}
