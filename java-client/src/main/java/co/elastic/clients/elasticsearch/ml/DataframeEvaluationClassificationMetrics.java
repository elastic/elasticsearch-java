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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationClassificationMetrics
public final class DataframeEvaluationClassificationMetrics extends DataframeEvaluationMetrics {
	@Nullable
	private final Map<String, JsonValue> accuracy;

	@Nullable
	private final Map<String, JsonValue> multiclassConfusionMatrix;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationClassificationMetrics(Builder builder) {
		super(builder);
		this.accuracy = builder.accuracy;
		this.multiclassConfusionMatrix = builder.multiclassConfusionMatrix;

	}

	/**
	 * Accuracy of predictions (per-class and overall).
	 *
	 * API name: {@code accuracy}
	 */
	@Nullable
	public Map<String, JsonValue> accuracy() {
		return this.accuracy;
	}

	/**
	 * Multiclass confusion matrix.
	 *
	 * API name: {@code multiclass_confusion_matrix}
	 */
	@Nullable
	public Map<String, JsonValue> multiclassConfusionMatrix() {
		return this.multiclassConfusionMatrix;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.accuracy != null) {

			generator.writeKey("accuracy");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.accuracy.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.multiclassConfusionMatrix != null) {

			generator.writeKey("multiclass_confusion_matrix");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.multiclassConfusionMatrix.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationClassificationMetrics}.
	 */
	public static class Builder extends DataframeEvaluationMetrics.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationClassificationMetrics> {
		@Nullable
		private Map<String, JsonValue> accuracy;

		@Nullable
		private Map<String, JsonValue> multiclassConfusionMatrix;

		/**
		 * Accuracy of predictions (per-class and overall).
		 *
		 * API name: {@code accuracy}
		 */
		public Builder accuracy(@Nullable Map<String, JsonValue> value) {
			this.accuracy = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #accuracy(Map)}, creating the map if needed.
		 */
		public Builder putAccuracy(String key, JsonValue value) {
			if (this.accuracy == null) {
				this.accuracy = new HashMap<>();
			}
			this.accuracy.put(key, value);
			return this;
		}

		/**
		 * Multiclass confusion matrix.
		 *
		 * API name: {@code multiclass_confusion_matrix}
		 */
		public Builder multiclassConfusionMatrix(@Nullable Map<String, JsonValue> value) {
			this.multiclassConfusionMatrix = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #multiclassConfusionMatrix(Map)}, creating the map
		 * if needed.
		 */
		public Builder putMulticlassConfusionMatrix(String key, JsonValue value) {
			if (this.multiclassConfusionMatrix == null) {
				this.multiclassConfusionMatrix = new HashMap<>();
			}
			this.multiclassConfusionMatrix.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationClassificationMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationClassificationMetrics build() {

			return new DataframeEvaluationClassificationMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DataframeEvaluationClassificationMetrics
	 */
	public static final JsonpValueParser<DataframeEvaluationClassificationMetrics> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					DataframeEvaluationClassificationMetrics::setupDataframeEvaluationClassificationMetricsParser);

	protected static void setupDataframeEvaluationClassificationMetricsParser(
			DelegatingJsonpValueParser<DataframeEvaluationClassificationMetrics.Builder> op) {
		DataframeEvaluationMetrics.setupDataframeEvaluationMetricsParser(op);
		op.add(Builder::accuracy, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "accuracy");
		op.add(Builder::multiclassConfusionMatrix, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()),
				"multiclass_confusion_matrix");

	}

}
