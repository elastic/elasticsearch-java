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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.TextEmbedding

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.TextEmbedding">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextEmbedding implements QueryVectorBuilderVariant, JsonpSerializable {
	private final String modelId;

	private final String modelText;

	// ---------------------------------------------------------------------------------------------

	private TextEmbedding(Builder builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.modelText = ApiTypeHelper.requireNonNull(builder.modelText, this, "modelText");

	}

	public static TextEmbedding of(Function<Builder, ObjectBuilder<TextEmbedding>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * QueryVectorBuilder variant kind.
	 */
	@Override
	public QueryVectorBuilder.Kind _queryVectorBuilderKind() {
		return QueryVectorBuilder.Kind.TextEmbedding;
	}

	/**
	 * Required - API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - API name: {@code model_text}
	 */
	public final String modelText() {
		return this.modelText;
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

		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("model_text");
		generator.write(this.modelText);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TextEmbedding}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TextEmbedding> {
		private String modelId;

		private String modelText;

		/**
		 * Required - API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_text}
		 */
		public final Builder modelText(String value) {
			this.modelText = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TextEmbedding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextEmbedding build() {
			_checkSingleUse();

			return new TextEmbedding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TextEmbedding}
	 */
	public static final JsonpDeserializer<TextEmbedding> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TextEmbedding::setupTextEmbeddingDeserializer);

	protected static void setupTextEmbeddingDeserializer(ObjectDeserializer<TextEmbedding.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::modelText, JsonpDeserializer.stringDeserializer(), "model_text");

	}

}
