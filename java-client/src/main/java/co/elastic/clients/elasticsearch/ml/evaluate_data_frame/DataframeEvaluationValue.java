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

// typedef: ml.evaluate_data_frame.DataframeEvaluationValue

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeEvaluationValue">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationValue implements JsonpSerializable {
	private final double value;

	// ---------------------------------------------------------------------------------------------

	protected DataframeEvaluationValue(AbstractBuilder<?> builder) {

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static DataframeEvaluationValue dataframeEvaluationValueOf(
			Function<Builder, ObjectBuilder<DataframeEvaluationValue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final double value() {
		return this.value;
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

		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationValue}.
	 */

	public static class Builder extends DataframeEvaluationValue.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationValue> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationValue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationValue build() {
			_checkSingleUse();

			return new DataframeEvaluationValue(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private Double value;

		/**
		 * Required - API name: {@code value}
		 */
		public final BuilderT value(double value) {
			this.value = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationValue}
	 */
	public static final JsonpDeserializer<DataframeEvaluationValue> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeEvaluationValue::setupDataframeEvaluationValueDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDataframeEvaluationValueDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::value, JsonpDeserializer.doubleDeserializer(), "value");

	}

}
