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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch.inference.EmbeddingContentFormat;
import co.elastic.clients.elasticsearch.inference.EmbeddingContentType;
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

// typedef: _types.InferenceString

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.InferenceString">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceString implements JsonpSerializable {
	private final EmbeddingContentType type;

	@Nullable
	private final EmbeddingContentFormat format;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private InferenceString(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.format = builder.format;
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static InferenceString of(Function<Builder, ObjectBuilder<InferenceString>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of data that the value represents.
	 * <p>
	 * API name: {@code type}
	 */
	public final EmbeddingContentType type() {
		return this.type;
	}

	/**
	 * The format of the data. If null, the default data format for the given type
	 * is used.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final EmbeddingContentFormat format() {
		return this.format;
	}

	/**
	 * Required - String which may be raw text, or the string representation of some
	 * other data such as an image in base64.
	 * <p>
	 * API name: {@code value}
	 */
	public final String value() {
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

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.format != null) {
			generator.writeKey("format");
			this.format.serialize(generator, mapper);
		}
		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceString}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<InferenceString> {
		private EmbeddingContentType type;

		@Nullable
		private EmbeddingContentFormat format;

		private String value;

		public Builder() {
		}
		private Builder(InferenceString instance) {
			this.type = instance.type;
			this.format = instance.format;
			this.value = instance.value;

		}
		/**
		 * Required - The type of data that the value represents.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(EmbeddingContentType value) {
			this.type = value;
			return this;
		}

		/**
		 * The format of the data. If null, the default data format for the given type
		 * is used.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable EmbeddingContentFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * Required - String which may be raw text, or the string representation of some
		 * other data such as an image in base64.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceString}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceString build() {
			_checkSingleUse();

			return new InferenceString(this);
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
	 * Json deserializer for {@link InferenceString}
	 */
	public static final JsonpDeserializer<InferenceString> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InferenceString::setupInferenceStringDeserializer);

	protected static void setupInferenceStringDeserializer(ObjectDeserializer<InferenceString.Builder> op) {

		op.add(Builder::type, EmbeddingContentType._DESERIALIZER, "type");
		op.add(Builder::format, EmbeddingContentFormat._DESERIALIZER, "format");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
