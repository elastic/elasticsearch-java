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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryRecall

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeClassificationSummaryRecall">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeClassificationSummaryRecall implements JsonpSerializable {
	private final List<DataframeEvaluationClass> classes;

	private final double avgRecall;

	// ---------------------------------------------------------------------------------------------

	private DataframeClassificationSummaryRecall(Builder builder) {

		this.classes = ApiTypeHelper.unmodifiableRequired(builder.classes, this, "classes");
		this.avgRecall = ApiTypeHelper.requireNonNull(builder.avgRecall, this, "avgRecall");

	}

	public static DataframeClassificationSummaryRecall of(
			Function<Builder, ObjectBuilder<DataframeClassificationSummaryRecall>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code classes}
	 */
	public final List<DataframeEvaluationClass> classes() {
		return this.classes;
	}

	/**
	 * Required - API name: {@code avg_recall}
	 */
	public final double avgRecall() {
		return this.avgRecall;
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

		if (ApiTypeHelper.isDefined(this.classes)) {
			generator.writeKey("classes");
			generator.writeStartArray();
			for (DataframeEvaluationClass item0 : this.classes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("avg_recall");
		generator.write(this.avgRecall);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryRecall}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeClassificationSummaryRecall> {
		private List<DataframeEvaluationClass> classes;

		private Double avgRecall;

		/**
		 * Required - API name: {@code classes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>classes</code>.
		 */
		public final Builder classes(List<DataframeEvaluationClass> list) {
			this.classes = _listAddAll(this.classes, list);
			return this;
		}

		/**
		 * Required - API name: {@code classes}
		 * <p>
		 * Adds one or more values to <code>classes</code>.
		 */
		public final Builder classes(DataframeEvaluationClass value, DataframeEvaluationClass... values) {
			this.classes = _listAdd(this.classes, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code classes}
		 * <p>
		 * Adds a value to <code>classes</code> using a builder lambda.
		 */
		public final Builder classes(
				Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return classes(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * Required - API name: {@code avg_recall}
		 */
		public final Builder avgRecall(double value) {
			this.avgRecall = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummaryRecall}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummaryRecall build() {
			_checkSingleUse();

			return new DataframeClassificationSummaryRecall(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeClassificationSummaryRecall}
	 */
	public static final JsonpDeserializer<DataframeClassificationSummaryRecall> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeClassificationSummaryRecall::setupDataframeClassificationSummaryRecallDeserializer);

	protected static void setupDataframeClassificationSummaryRecallDeserializer(
			ObjectDeserializer<DataframeClassificationSummaryRecall.Builder> op) {

		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(DataframeEvaluationClass._DESERIALIZER),
				"classes");
		op.add(Builder::avgRecall, JsonpDeserializer.doubleDeserializer(), "avg_recall");

	}

}
