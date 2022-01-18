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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.KeywordTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.KeywordTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class KeywordTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	private final int bufferSize;

	// ---------------------------------------------------------------------------------------------

	private KeywordTokenizer(Builder builder) {
		super(builder);

		this.bufferSize = ApiTypeHelper.requireNonNull(builder.bufferSize, this, "bufferSize");

	}

	public static KeywordTokenizer of(Function<Builder, ObjectBuilder<KeywordTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.Keyword;
	}

	/**
	 * Required - API name: {@code buffer_size}
	 */
	public final int bufferSize() {
		return this.bufferSize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keyword");
		super.serializeInternal(generator, mapper);
		generator.writeKey("buffer_size");
		generator.write(this.bufferSize);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeywordTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeywordTokenizer> {
		private Integer bufferSize;

		/**
		 * Required - API name: {@code buffer_size}
		 */
		public final Builder bufferSize(int value) {
			this.bufferSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeywordTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeywordTokenizer build() {
			_checkSingleUse();

			return new KeywordTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeywordTokenizer}
	 */
	public static final JsonpDeserializer<KeywordTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KeywordTokenizer::setupKeywordTokenizerDeserializer);

	protected static void setupKeywordTokenizerDeserializer(ObjectDeserializer<KeywordTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::bufferSize, JsonpDeserializer.integerDeserializer(), "buffer_size");

		op.ignore("type");
	}

}
