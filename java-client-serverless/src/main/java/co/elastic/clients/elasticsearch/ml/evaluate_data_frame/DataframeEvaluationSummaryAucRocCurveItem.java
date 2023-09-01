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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.evaluate_data_frame.DataframeEvaluationSummaryAucRocCurveItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeEvaluationSummaryAucRocCurveItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationSummaryAucRocCurveItem implements JsonpSerializable {
	private final double tpr;

	private final double fpr;

	private final double threshold;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationSummaryAucRocCurveItem(Builder builder) {

		this.tpr = ApiTypeHelper.requireNonNull(builder.tpr, this, "tpr");
		this.fpr = ApiTypeHelper.requireNonNull(builder.fpr, this, "fpr");
		this.threshold = ApiTypeHelper.requireNonNull(builder.threshold, this, "threshold");

	}

	public static DataframeEvaluationSummaryAucRocCurveItem of(
			Function<Builder, ObjectBuilder<DataframeEvaluationSummaryAucRocCurveItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code tpr}
	 */
	public final double tpr() {
		return this.tpr;
	}

	/**
	 * Required - API name: {@code fpr}
	 */
	public final double fpr() {
		return this.fpr;
	}

	/**
	 * Required - API name: {@code threshold}
	 */
	public final double threshold() {
		return this.threshold;
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

		generator.writeKey("tpr");
		generator.write(this.tpr);

		generator.writeKey("fpr");
		generator.write(this.fpr);

		generator.writeKey("threshold");
		generator.write(this.threshold);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationSummaryAucRocCurveItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeEvaluationSummaryAucRocCurveItem> {
		private Double tpr;

		private Double fpr;

		private Double threshold;

		/**
		 * Required - API name: {@code tpr}
		 */
		public final Builder tpr(double value) {
			this.tpr = value;
			return this;
		}

		/**
		 * Required - API name: {@code fpr}
		 */
		public final Builder fpr(double value) {
			this.fpr = value;
			return this;
		}

		/**
		 * Required - API name: {@code threshold}
		 */
		public final Builder threshold(double value) {
			this.threshold = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationSummaryAucRocCurveItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationSummaryAucRocCurveItem build() {
			_checkSingleUse();

			return new DataframeEvaluationSummaryAucRocCurveItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationSummaryAucRocCurveItem}
	 */
	public static final JsonpDeserializer<DataframeEvaluationSummaryAucRocCurveItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationSummaryAucRocCurveItem::setupDataframeEvaluationSummaryAucRocCurveItemDeserializer);

	protected static void setupDataframeEvaluationSummaryAucRocCurveItemDeserializer(
			ObjectDeserializer<DataframeEvaluationSummaryAucRocCurveItem.Builder> op) {

		op.add(Builder::tpr, JsonpDeserializer.doubleDeserializer(), "tpr");
		op.add(Builder::fpr, JsonpDeserializer.doubleDeserializer(), "fpr");
		op.add(Builder::threshold, JsonpDeserializer.doubleDeserializer(), "threshold");

	}

}
