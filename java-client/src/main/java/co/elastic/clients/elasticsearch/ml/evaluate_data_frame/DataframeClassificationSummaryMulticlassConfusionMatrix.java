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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryMulticlassConfusionMatrix
@JsonpDeserializable
public class DataframeClassificationSummaryMulticlassConfusionMatrix implements JsonpSerializable {
	private final List<ConfusionMatrixItem> confusionMatrix;

	private final int otherActualClassCount;

	// ---------------------------------------------------------------------------------------------

	private DataframeClassificationSummaryMulticlassConfusionMatrix(Builder builder) {

		this.confusionMatrix = ModelTypeHelper.unmodifiableRequired(builder.confusionMatrix, this, "confusionMatrix");
		this.otherActualClassCount = ModelTypeHelper.requireNonNull(builder.otherActualClassCount, this,
				"otherActualClassCount");

	}

	public static DataframeClassificationSummaryMulticlassConfusionMatrix of(
			Function<Builder, ObjectBuilder<DataframeClassificationSummaryMulticlassConfusionMatrix>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code confusion_matrix}
	 */
	public final List<ConfusionMatrixItem> confusionMatrix() {
		return this.confusionMatrix;
	}

	/**
	 * Required - API name: {@code other_actual_class_count}
	 */
	public final int otherActualClassCount() {
		return this.otherActualClassCount;
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

		if (ModelTypeHelper.isDefined(this.confusionMatrix)) {
			generator.writeKey("confusion_matrix");
			generator.writeStartArray();
			for (ConfusionMatrixItem item0 : this.confusionMatrix) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("other_actual_class_count");
		generator.write(this.otherActualClassCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryMulticlassConfusionMatrix}.
	 */
	public static class Builder extends ObjectBuilderBase
			implements
				ObjectBuilder<DataframeClassificationSummaryMulticlassConfusionMatrix> {
		private List<ConfusionMatrixItem> confusionMatrix;

		private Integer otherActualClassCount;

		/**
		 * Required - API name: {@code confusion_matrix}
		 */
		public final Builder confusionMatrix(List<ConfusionMatrixItem> value) {
			this.confusionMatrix = value;
			return this;
		}

		/**
		 * Required - API name: {@code confusion_matrix}
		 */
		public final Builder confusionMatrix(ConfusionMatrixItem... value) {
			this.confusionMatrix = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code confusion_matrix}
		 */
		@SafeVarargs
		public final Builder confusionMatrix(
				Function<ConfusionMatrixItem.Builder, ObjectBuilder<ConfusionMatrixItem>>... fns) {
			this.confusionMatrix = new ArrayList<>(fns.length);
			for (Function<ConfusionMatrixItem.Builder, ObjectBuilder<ConfusionMatrixItem>> fn : fns) {
				this.confusionMatrix.add(fn.apply(new ConfusionMatrixItem.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code other_actual_class_count}
		 */
		public final Builder otherActualClassCount(int value) {
			this.otherActualClassCount = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummaryMulticlassConfusionMatrix}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummaryMulticlassConfusionMatrix build() {
			_checkSingleUse();

			return new DataframeClassificationSummaryMulticlassConfusionMatrix(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for
	 * {@link DataframeClassificationSummaryMulticlassConfusionMatrix}
	 */
	public static final JsonpDeserializer<DataframeClassificationSummaryMulticlassConfusionMatrix> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeClassificationSummaryMulticlassConfusionMatrix::setupDataframeClassificationSummaryMulticlassConfusionMatrixDeserializer,
					Builder::build);

	protected static void setupDataframeClassificationSummaryMulticlassConfusionMatrixDeserializer(
			DelegatingDeserializer<DataframeClassificationSummaryMulticlassConfusionMatrix.Builder> op) {

		op.add(Builder::confusionMatrix, JsonpDeserializer.arrayDeserializer(ConfusionMatrixItem._DESERIALIZER),
				"confusion_matrix");
		op.add(Builder::otherActualClassCount, JsonpDeserializer.integerDeserializer(), "other_actual_class_count");

	}

}
