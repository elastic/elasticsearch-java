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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeEvaluationSummaryAucRocCurveItem
public final class DataframeEvaluationSummaryAucRocCurveItem implements JsonpSerializable {
	private final Number tpr;

	private final Number fpr;

	private final Number threshold;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationSummaryAucRocCurveItem(Builder builder) {

		this.tpr = Objects.requireNonNull(builder.tpr, "tpr");
		this.fpr = Objects.requireNonNull(builder.fpr, "fpr");
		this.threshold = Objects.requireNonNull(builder.threshold, "threshold");

	}

	/**
	 * API name: {@code tpr}
	 */
	public Number tpr() {
		return this.tpr;
	}

	/**
	 * API name: {@code fpr}
	 */
	public Number fpr() {
		return this.fpr;
	}

	/**
	 * API name: {@code threshold}
	 */
	public Number threshold() {
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
		generator.write(this.tpr.doubleValue());

		generator.writeKey("fpr");
		generator.write(this.fpr.doubleValue());

		generator.writeKey("threshold");
		generator.write(this.threshold.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationSummaryAucRocCurveItem}.
	 */
	public static class Builder implements ObjectBuilder<DataframeEvaluationSummaryAucRocCurveItem> {
		private Number tpr;

		private Number fpr;

		private Number threshold;

		/**
		 * API name: {@code tpr}
		 */
		public Builder tpr(Number value) {
			this.tpr = value;
			return this;
		}

		/**
		 * API name: {@code fpr}
		 */
		public Builder fpr(Number value) {
			this.fpr = value;
			return this;
		}

		/**
		 * API name: {@code threshold}
		 */
		public Builder threshold(Number value) {
			this.threshold = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationSummaryAucRocCurveItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationSummaryAucRocCurveItem build() {

			return new DataframeEvaluationSummaryAucRocCurveItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationSummaryAucRocCurveItem}
	 */
	public static final JsonpDeserializer<DataframeEvaluationSummaryAucRocCurveItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeEvaluationSummaryAucRocCurveItem::setupDataframeEvaluationSummaryAucRocCurveItemDeserializer);

	protected static void setupDataframeEvaluationSummaryAucRocCurveItemDeserializer(
			DelegatingDeserializer<DataframeEvaluationSummaryAucRocCurveItem.Builder> op) {

		op.add(Builder::tpr, JsonpDeserializer.numberDeserializer(), "tpr");
		op.add(Builder::fpr, JsonpDeserializer.numberDeserializer(), "fpr");
		op.add(Builder::threshold, JsonpDeserializer.numberDeserializer(), "threshold");

	}

}
