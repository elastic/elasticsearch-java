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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeEvaluationClass

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeEvaluationClass">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeEvaluationClass extends DataframeEvaluationValue {
	private final String className;

	// ---------------------------------------------------------------------------------------------

	private DataframeEvaluationClass(Builder builder) {
		super(builder);

		this.className = ApiTypeHelper.requireNonNull(builder.className, this, "className");

	}

	public static DataframeEvaluationClass of(Function<Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code class_name}
	 */
	public final String className() {
		return this.className;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("class_name");
		generator.write(this.className);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationClass}.
	 */

	public static class Builder extends DataframeEvaluationValue.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationClass> {
		private String className;

		/**
		 * Required - API name: {@code class_name}
		 */
		public final Builder className(String value) {
			this.className = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationClass}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationClass build() {
			_checkSingleUse();

			return new DataframeEvaluationClass(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationClass}
	 */
	public static final JsonpDeserializer<DataframeEvaluationClass> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeEvaluationClass::setupDataframeEvaluationClassDeserializer);

	protected static void setupDataframeEvaluationClassDeserializer(
			ObjectDeserializer<DataframeEvaluationClass.Builder> op) {
		DataframeEvaluationValue.setupDataframeEvaluationValueDeserializer(op);
		op.add(Builder::className, JsonpDeserializer.stringDeserializer(), "class_name");

	}

}
