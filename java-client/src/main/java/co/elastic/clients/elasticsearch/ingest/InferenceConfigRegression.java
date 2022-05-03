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

package co.elastic.clients.elasticsearch.ingest;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.InferenceConfigRegression

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.InferenceConfigRegression">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceConfigRegression implements JsonpSerializable {
	private final String resultsField;

	// ---------------------------------------------------------------------------------------------

	private InferenceConfigRegression(Builder builder) {

		this.resultsField = ApiTypeHelper.requireNonNull(builder.resultsField, this, "resultsField");

	}

	public static InferenceConfigRegression of(Function<Builder, ObjectBuilder<InferenceConfigRegression>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code results_field}
	 */
	public final String resultsField() {
		return this.resultsField;
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

		generator.writeKey("results_field");
		generator.write(this.resultsField);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceConfigRegression}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InferenceConfigRegression> {
		private String resultsField;

		/**
		 * Required - API name: {@code results_field}
		 */
		public final Builder resultsField(String value) {
			this.resultsField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceConfigRegression}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceConfigRegression build() {
			_checkSingleUse();

			return new InferenceConfigRegression(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceConfigRegression}
	 */
	public static final JsonpDeserializer<InferenceConfigRegression> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceConfigRegression::setupInferenceConfigRegressionDeserializer);

	protected static void setupInferenceConfigRegressionDeserializer(
			ObjectDeserializer<InferenceConfigRegression.Builder> op) {

		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");

	}

}
