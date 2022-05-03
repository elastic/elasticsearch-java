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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryMulticlassConfusionMatrix

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeClassificationSummaryMulticlassConfusionMatrix">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeClassificationSummaryMulticlassConfusionMatrix implements JsonpSerializable {
	private final List<ConfusionMatrixItem> confusionMatrix;

	private final int otherActualClassCount;

	// ---------------------------------------------------------------------------------------------

	private DataframeClassificationSummaryMulticlassConfusionMatrix(Builder builder) {

		this.confusionMatrix = ApiTypeHelper.unmodifiableRequired(builder.confusionMatrix, this, "confusionMatrix");
		this.otherActualClassCount = ApiTypeHelper.requireNonNull(builder.otherActualClassCount, this,
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

		if (ApiTypeHelper.isDefined(this.confusionMatrix)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryMulticlassConfusionMatrix}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeClassificationSummaryMulticlassConfusionMatrix> {
		private List<ConfusionMatrixItem> confusionMatrix;

		private Integer otherActualClassCount;

		/**
		 * Required - API name: {@code confusion_matrix}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>confusionMatrix</code>.
		 */
		public final Builder confusionMatrix(List<ConfusionMatrixItem> list) {
			this.confusionMatrix = _listAddAll(this.confusionMatrix, list);
			return this;
		}

		/**
		 * Required - API name: {@code confusion_matrix}
		 * <p>
		 * Adds one or more values to <code>confusionMatrix</code>.
		 */
		public final Builder confusionMatrix(ConfusionMatrixItem value, ConfusionMatrixItem... values) {
			this.confusionMatrix = _listAdd(this.confusionMatrix, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code confusion_matrix}
		 * <p>
		 * Adds a value to <code>confusionMatrix</code> using a builder lambda.
		 */
		public final Builder confusionMatrix(
				Function<ConfusionMatrixItem.Builder, ObjectBuilder<ConfusionMatrixItem>> fn) {
			return confusionMatrix(fn.apply(new ConfusionMatrixItem.Builder()).build());
		}

		/**
		 * Required - API name: {@code other_actual_class_count}
		 */
		public final Builder otherActualClassCount(int value) {
			this.otherActualClassCount = value;
			return this;
		}

		@Override
		protected Builder self() {
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
					DataframeClassificationSummaryMulticlassConfusionMatrix::setupDataframeClassificationSummaryMulticlassConfusionMatrixDeserializer);

	protected static void setupDataframeClassificationSummaryMulticlassConfusionMatrixDeserializer(
			ObjectDeserializer<DataframeClassificationSummaryMulticlassConfusionMatrix.Builder> op) {

		op.add(Builder::confusionMatrix, JsonpDeserializer.arrayDeserializer(ConfusionMatrixItem._DESERIALIZER),
				"confusion_matrix");
		op.add(Builder::otherActualClassCount, JsonpDeserializer.integerDeserializer(), "other_actual_class_count");

	}

}
