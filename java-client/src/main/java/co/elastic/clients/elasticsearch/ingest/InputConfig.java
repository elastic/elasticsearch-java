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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ingest._types.InputConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.InputConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class InputConfig implements JsonpSerializable {
	private final String inputField;

	private final String outputField;

	// ---------------------------------------------------------------------------------------------

	private InputConfig(Builder builder) {

		this.inputField = ApiTypeHelper.requireNonNull(builder.inputField, this, "inputField");
		this.outputField = ApiTypeHelper.requireNonNull(builder.outputField, this, "outputField");

	}

	public static InputConfig of(Function<Builder, ObjectBuilder<InputConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code input_field}
	 */
	public final String inputField() {
		return this.inputField;
	}

	/**
	 * Required - API name: {@code output_field}
	 */
	public final String outputField() {
		return this.outputField;
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

		generator.writeKey("input_field");
		generator.write(this.inputField);

		generator.writeKey("output_field");
		generator.write(this.outputField);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InputConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InputConfig> {
		private String inputField;

		private String outputField;

		public Builder() {
		}
		private Builder(InputConfig instance) {
			this.inputField = instance.inputField;
			this.outputField = instance.outputField;

		}
		/**
		 * Required - API name: {@code input_field}
		 */
		public final Builder inputField(String value) {
			this.inputField = value;
			return this;
		}

		/**
		 * Required - API name: {@code output_field}
		 */
		public final Builder outputField(String value) {
			this.outputField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InputConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InputConfig build() {
			_checkSingleUse();

			return new InputConfig(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InputConfig}
	 */
	public static final JsonpDeserializer<InputConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InputConfig::setupInputConfigDeserializer);

	protected static void setupInputConfigDeserializer(ObjectDeserializer<InputConfig.Builder> op) {

		op.add(Builder::inputField, JsonpDeserializer.stringDeserializer(), "input_field");
		op.add(Builder::outputField, JsonpDeserializer.stringDeserializer(), "output_field");

	}

}
