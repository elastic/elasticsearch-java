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
import java.lang.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryPrecision
@JsonpDeserializable
public class DataframeClassificationSummaryPrecision implements JsonpSerializable {
	private final List<DataframeEvaluationClass> classes;

	private final double avgPrecision;

	// ---------------------------------------------------------------------------------------------

	private DataframeClassificationSummaryPrecision(Builder builder) {

		this.classes = ModelTypeHelper.unmodifiableRequired(builder.classes, this, "classes");
		this.avgPrecision = ModelTypeHelper.requireNonNull(builder.avgPrecision, this, "avgPrecision");

	}

	public static DataframeClassificationSummaryPrecision of(
			Function<Builder, ObjectBuilder<DataframeClassificationSummaryPrecision>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code classes}
	 */
	public final List<DataframeEvaluationClass> classes() {
		return this.classes;
	}

	/**
	 * Required - API name: {@code avg_precision}
	 */
	public final double avgPrecision() {
		return this.avgPrecision;
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

		if (ModelTypeHelper.isDefined(this.classes)) {
			generator.writeKey("classes");
			generator.writeStartArray();
			for (DataframeEvaluationClass item0 : this.classes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("avg_precision");
		generator.write(this.avgPrecision);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryPrecision}.
	 */
	public static class Builder extends ObjectBuilderBase
			implements
				ObjectBuilder<DataframeClassificationSummaryPrecision> {
		private List<DataframeEvaluationClass> classes;

		private Double avgPrecision;

		/**
		 * Required - API name: {@code classes}
		 */
		public final Builder classes(List<DataframeEvaluationClass> value) {
			this.classes = value;
			return this;
		}

		/**
		 * Required - API name: {@code classes}
		 */
		public final Builder classes(DataframeEvaluationClass... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code classes}
		 */
		@SafeVarargs
		public final Builder classes(
				Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>>... fns) {
			this.classes = new ArrayList<>(fns.length);
			for (Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn : fns) {
				this.classes.add(fn.apply(new DataframeEvaluationClass.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code avg_precision}
		 */
		public final Builder avgPrecision(double value) {
			this.avgPrecision = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummaryPrecision}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummaryPrecision build() {
			_checkSingleUse();

			return new DataframeClassificationSummaryPrecision(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeClassificationSummaryPrecision}
	 */
	public static final JsonpDeserializer<DataframeClassificationSummaryPrecision> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeClassificationSummaryPrecision::setupDataframeClassificationSummaryPrecisionDeserializer,
					Builder::build);

	protected static void setupDataframeClassificationSummaryPrecisionDeserializer(
			DelegatingDeserializer<DataframeClassificationSummaryPrecision.Builder> op) {

		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(DataframeEvaluationClass._DESERIALIZER),
				"classes");
		op.add(Builder::avgPrecision, JsonpDeserializer.doubleDeserializer(), "avg_precision");

	}

}
