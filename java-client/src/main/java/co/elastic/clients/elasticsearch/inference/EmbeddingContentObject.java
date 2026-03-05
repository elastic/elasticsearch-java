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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.EmbeddingContentObject

/**
 * A wrapper object which contains the fields required to specify multimodal
 * inputs
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EmbeddingContentObject">API
 *      specification</a>
 */
@JsonpDeserializable
public class EmbeddingContentObject implements JsonpSerializable {
	private final EmbeddingContentObjectContents content;

	// ---------------------------------------------------------------------------------------------

	private EmbeddingContentObject(Builder builder) {

		this.content = ApiTypeHelper.requireNonNull(builder.content, this, "content");

	}

	public static EmbeddingContentObject of(Function<Builder, ObjectBuilder<EmbeddingContentObject>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An object containing the input data for the model to embed
	 * <p>
	 * API name: {@code content}
	 */
	public final EmbeddingContentObjectContents content() {
		return this.content;
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

		generator.writeKey("content");
		this.content.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EmbeddingContentObject}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EmbeddingContentObject> {
		private EmbeddingContentObjectContents content;

		public Builder() {
		}
		private Builder(EmbeddingContentObject instance) {
			this.content = instance.content;

		}
		/**
		 * Required - An object containing the input data for the model to embed
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(EmbeddingContentObjectContents value) {
			this.content = value;
			return this;
		}

		/**
		 * Required - An object containing the input data for the model to embed
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(
				Function<EmbeddingContentObjectContents.Builder, ObjectBuilder<EmbeddingContentObjectContents>> fn) {
			return this.content(fn.apply(new EmbeddingContentObjectContents.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EmbeddingContentObject}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EmbeddingContentObject build() {
			_checkSingleUse();

			return new EmbeddingContentObject(this);
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
	 * Json deserializer for {@link EmbeddingContentObject}
	 */
	public static final JsonpDeserializer<EmbeddingContentObject> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EmbeddingContentObject::setupEmbeddingContentObjectDeserializer);

	protected static void setupEmbeddingContentObjectDeserializer(
			ObjectDeserializer<EmbeddingContentObject.Builder> op) {

		op.add(Builder::content, EmbeddingContentObjectContents._DESERIALIZER, "content");

	}

}
