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
import co.elastic.clients.util.ObjectBuilder;
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
public final class DataframeClassificationSummaryMulticlassConfusionMatrix implements JsonpSerializable {
	private final List<ConfusionMatrixItem> confusionMatrix;

	private final int otherActualClassCount;

	// ---------------------------------------------------------------------------------------------

	public DataframeClassificationSummaryMulticlassConfusionMatrix(Builder builder) {

		this.confusionMatrix = Objects.requireNonNull(builder.confusionMatrix, "confusion_matrix");
		this.otherActualClassCount = Objects.requireNonNull(builder.otherActualClassCount, "other_actual_class_count");

	}

	/**
	 * API name: {@code confusion_matrix}
	 */
	public List<ConfusionMatrixItem> confusionMatrix() {
		return this.confusionMatrix;
	}

	/**
	 * API name: {@code other_actual_class_count}
	 */
	public int otherActualClassCount() {
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

		generator.writeKey("confusion_matrix");
		generator.writeStartArray();
		for (ConfusionMatrixItem item0 : this.confusionMatrix) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("other_actual_class_count");
		generator.write(this.otherActualClassCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryMulticlassConfusionMatrix}.
	 */
	public static class Builder implements ObjectBuilder<DataframeClassificationSummaryMulticlassConfusionMatrix> {
		private List<ConfusionMatrixItem> confusionMatrix;

		private Integer otherActualClassCount;

		/**
		 * API name: {@code confusion_matrix}
		 */
		public Builder confusionMatrix(List<ConfusionMatrixItem> value) {
			this.confusionMatrix = value;
			return this;
		}

		/**
		 * API name: {@code confusion_matrix}
		 */
		public Builder confusionMatrix(ConfusionMatrixItem... value) {
			this.confusionMatrix = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #confusionMatrix(List)}, creating the list if needed.
		 */
		public Builder addConfusionMatrix(ConfusionMatrixItem value) {
			if (this.confusionMatrix == null) {
				this.confusionMatrix = new ArrayList<>();
			}
			this.confusionMatrix.add(value);
			return this;
		}

		/**
		 * Set {@link #confusionMatrix(List)} to a singleton list.
		 */
		public Builder confusionMatrix(Function<ConfusionMatrixItem.Builder, ObjectBuilder<ConfusionMatrixItem>> fn) {
			return this.confusionMatrix(fn.apply(new ConfusionMatrixItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #confusionMatrix(List)}, creating the list if needed.
		 */
		public Builder addConfusionMatrix(
				Function<ConfusionMatrixItem.Builder, ObjectBuilder<ConfusionMatrixItem>> fn) {
			return this.addConfusionMatrix(fn.apply(new ConfusionMatrixItem.Builder()).build());
		}

		/**
		 * API name: {@code other_actual_class_count}
		 */
		public Builder otherActualClassCount(int value) {
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
