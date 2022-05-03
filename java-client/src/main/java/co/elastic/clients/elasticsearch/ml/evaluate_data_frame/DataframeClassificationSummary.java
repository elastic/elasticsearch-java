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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeClassificationSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeClassificationSummary implements JsonpSerializable {
	@Nullable
	private final DataframeEvaluationSummaryAucRoc aucRoc;

	@Nullable
	private final DataframeClassificationSummaryAccuracy accuracy;

	@Nullable
	private final DataframeClassificationSummaryMulticlassConfusionMatrix multiclassConfusionMatrix;

	@Nullable
	private final DataframeClassificationSummaryPrecision precision;

	@Nullable
	private final DataframeClassificationSummaryRecall recall;

	// ---------------------------------------------------------------------------------------------

	private DataframeClassificationSummary(Builder builder) {

		this.aucRoc = builder.aucRoc;
		this.accuracy = builder.accuracy;
		this.multiclassConfusionMatrix = builder.multiclassConfusionMatrix;
		this.precision = builder.precision;
		this.recall = builder.recall;

	}

	public static DataframeClassificationSummary of(
			Function<Builder, ObjectBuilder<DataframeClassificationSummary>> fn) {
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
	 * API name: {@code accuracy}
	 */
	@Nullable
	public final DataframeClassificationSummaryAccuracy accuracy() {
		return this.accuracy;
	}

	/**
	 * API name: {@code multiclass_confusion_matrix}
	 */
	@Nullable
	public final DataframeClassificationSummaryMulticlassConfusionMatrix multiclassConfusionMatrix() {
		return this.multiclassConfusionMatrix;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final DataframeClassificationSummaryPrecision precision() {
		return this.precision;
	}

	/**
	 * API name: {@code recall}
	 */
	@Nullable
	public final DataframeClassificationSummaryRecall recall() {
		return this.recall;
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
		if (this.accuracy != null) {
			generator.writeKey("accuracy");
			this.accuracy.serialize(generator, mapper);

		}
		if (this.multiclassConfusionMatrix != null) {
			generator.writeKey("multiclass_confusion_matrix");
			this.multiclassConfusionMatrix.serialize(generator, mapper);

		}
		if (this.precision != null) {
			generator.writeKey("precision");
			this.precision.serialize(generator, mapper);

		}
		if (this.recall != null) {
			generator.writeKey("recall");
			this.recall.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeClassificationSummary> {
		@Nullable
		private DataframeEvaluationSummaryAucRoc aucRoc;

		@Nullable
		private DataframeClassificationSummaryAccuracy accuracy;

		@Nullable
		private DataframeClassificationSummaryMulticlassConfusionMatrix multiclassConfusionMatrix;

		@Nullable
		private DataframeClassificationSummaryPrecision precision;

		@Nullable
		private DataframeClassificationSummaryRecall recall;

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
		 * API name: {@code accuracy}
		 */
		public final Builder accuracy(@Nullable DataframeClassificationSummaryAccuracy value) {
			this.accuracy = value;
			return this;
		}

		/**
		 * API name: {@code accuracy}
		 */
		public final Builder accuracy(
				Function<DataframeClassificationSummaryAccuracy.Builder, ObjectBuilder<DataframeClassificationSummaryAccuracy>> fn) {
			return this.accuracy(fn.apply(new DataframeClassificationSummaryAccuracy.Builder()).build());
		}

		/**
		 * API name: {@code multiclass_confusion_matrix}
		 */
		public final Builder multiclassConfusionMatrix(
				@Nullable DataframeClassificationSummaryMulticlassConfusionMatrix value) {
			this.multiclassConfusionMatrix = value;
			return this;
		}

		/**
		 * API name: {@code multiclass_confusion_matrix}
		 */
		public final Builder multiclassConfusionMatrix(
				Function<DataframeClassificationSummaryMulticlassConfusionMatrix.Builder, ObjectBuilder<DataframeClassificationSummaryMulticlassConfusionMatrix>> fn) {
			return this.multiclassConfusionMatrix(
					fn.apply(new DataframeClassificationSummaryMulticlassConfusionMatrix.Builder()).build());
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable DataframeClassificationSummaryPrecision value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(
				Function<DataframeClassificationSummaryPrecision.Builder, ObjectBuilder<DataframeClassificationSummaryPrecision>> fn) {
			return this.precision(fn.apply(new DataframeClassificationSummaryPrecision.Builder()).build());
		}

		/**
		 * API name: {@code recall}
		 */
		public final Builder recall(@Nullable DataframeClassificationSummaryRecall value) {
			this.recall = value;
			return this;
		}

		/**
		 * API name: {@code recall}
		 */
		public final Builder recall(
				Function<DataframeClassificationSummaryRecall.Builder, ObjectBuilder<DataframeClassificationSummaryRecall>> fn) {
			return this.recall(fn.apply(new DataframeClassificationSummaryRecall.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummary build() {
			_checkSingleUse();

			return new DataframeClassificationSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeClassificationSummary}
	 */
	public static final JsonpDeserializer<DataframeClassificationSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeClassificationSummary::setupDataframeClassificationSummaryDeserializer);

	protected static void setupDataframeClassificationSummaryDeserializer(
			ObjectDeserializer<DataframeClassificationSummary.Builder> op) {

		op.add(Builder::aucRoc, DataframeEvaluationSummaryAucRoc._DESERIALIZER, "auc_roc");
		op.add(Builder::accuracy, DataframeClassificationSummaryAccuracy._DESERIALIZER, "accuracy");
		op.add(Builder::multiclassConfusionMatrix,
				DataframeClassificationSummaryMulticlassConfusionMatrix._DESERIALIZER, "multiclass_confusion_matrix");
		op.add(Builder::precision, DataframeClassificationSummaryPrecision._DESERIALIZER, "precision");
		op.add(Builder::recall, DataframeClassificationSummaryRecall._DESERIALIZER, "recall");

	}

}
