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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.ConfusionMatrixPrediction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.ConfusionMatrixPrediction">API
 *      specification</a>
 */
@JsonpDeserializable
public class ConfusionMatrixPrediction implements JsonpSerializable {
	private final String predictedClass;

	private final int count;

	// ---------------------------------------------------------------------------------------------

	private ConfusionMatrixPrediction(Builder builder) {

		this.predictedClass = ApiTypeHelper.requireNonNull(builder.predictedClass, this, "predictedClass");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static ConfusionMatrixPrediction of(Function<Builder, ObjectBuilder<ConfusionMatrixPrediction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code predicted_class}
	 */
	public final String predictedClass() {
		return this.predictedClass;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
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

		generator.writeKey("predicted_class");
		generator.write(this.predictedClass);

		generator.writeKey("count");
		generator.write(this.count);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConfusionMatrixPrediction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ConfusionMatrixPrediction> {
		private String predictedClass;

		private Integer count;

		/**
		 * Required - API name: {@code predicted_class}
		 */
		public final Builder predictedClass(String value) {
			this.predictedClass = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConfusionMatrixPrediction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConfusionMatrixPrediction build() {
			_checkSingleUse();

			return new ConfusionMatrixPrediction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConfusionMatrixPrediction}
	 */
	public static final JsonpDeserializer<ConfusionMatrixPrediction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConfusionMatrixPrediction::setupConfusionMatrixPredictionDeserializer);

	protected static void setupConfusionMatrixPredictionDeserializer(
			ObjectDeserializer<ConfusionMatrixPrediction.Builder> op) {

		op.add(Builder::predictedClass, JsonpDeserializer.stringDeserializer(), "predicted_class");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");

	}

}
