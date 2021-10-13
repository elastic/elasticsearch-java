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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeEvaluationSummaryAucRoc
@JsonpDeserializable
public final class DataframeEvaluationSummaryAucRoc extends DataframeEvaluationValue {
	@Nullable
	private final List<DataframeEvaluationSummaryAucRocCurveItem> curve;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationSummaryAucRoc(Builder builder) {
		super(builder);

		this.curve = ModelTypeHelper.unmodifiable(builder.curve);

	}

	public DataframeEvaluationSummaryAucRoc(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code curve}
	 */
	@Nullable
	public List<DataframeEvaluationSummaryAucRocCurveItem> curve() {
		return this.curve;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.curve != null) {

			generator.writeKey("curve");
			generator.writeStartArray();
			for (DataframeEvaluationSummaryAucRocCurveItem item0 : this.curve) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationSummaryAucRoc}.
	 */
	public static class Builder extends DataframeEvaluationValue.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationSummaryAucRoc> {
		@Nullable
		private List<DataframeEvaluationSummaryAucRocCurveItem> curve;

		/**
		 * API name: {@code curve}
		 */
		public Builder curve(@Nullable List<DataframeEvaluationSummaryAucRocCurveItem> value) {
			this.curve = value;
			return this;
		}

		/**
		 * API name: {@code curve}
		 */
		public Builder curve(DataframeEvaluationSummaryAucRocCurveItem... value) {
			this.curve = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #curve(List)}, creating the list if needed.
		 */
		public Builder addCurve(DataframeEvaluationSummaryAucRocCurveItem value) {
			if (this.curve == null) {
				this.curve = new ArrayList<>();
			}
			this.curve.add(value);
			return this;
		}

		/**
		 * Set {@link #curve(List)} to a singleton list.
		 */
		public Builder curve(
				Function<DataframeEvaluationSummaryAucRocCurveItem.Builder, ObjectBuilder<DataframeEvaluationSummaryAucRocCurveItem>> fn) {
			return this.curve(fn.apply(new DataframeEvaluationSummaryAucRocCurveItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #curve(List)}, creating the list if needed.
		 */
		public Builder addCurve(
				Function<DataframeEvaluationSummaryAucRocCurveItem.Builder, ObjectBuilder<DataframeEvaluationSummaryAucRocCurveItem>> fn) {
			return this.addCurve(fn.apply(new DataframeEvaluationSummaryAucRocCurveItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationSummaryAucRoc}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationSummaryAucRoc build() {

			return new DataframeEvaluationSummaryAucRoc(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationSummaryAucRoc}
	 */
	public static final JsonpDeserializer<DataframeEvaluationSummaryAucRoc> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeEvaluationSummaryAucRoc::setupDataframeEvaluationSummaryAucRocDeserializer,
					Builder::build);

	protected static void setupDataframeEvaluationSummaryAucRocDeserializer(
			DelegatingDeserializer<DataframeEvaluationSummaryAucRoc.Builder> op) {
		DataframeEvaluationValue.setupDataframeEvaluationValueDeserializer(op);
		op.add(Builder::curve,
				JsonpDeserializer.arrayDeserializer(DataframeEvaluationSummaryAucRocCurveItem._DESERIALIZER), "curve");

	}

}
