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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.CharGroupTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.CharGroupTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class CharGroupTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	private final List<String> tokenizeOnChars;

	@Nullable
	private final Integer maxTokenLength;

	// ---------------------------------------------------------------------------------------------

	private CharGroupTokenizer(Builder builder) {
		super(builder);

		this.tokenizeOnChars = ApiTypeHelper.unmodifiableRequired(builder.tokenizeOnChars, this, "tokenizeOnChars");
		this.maxTokenLength = builder.maxTokenLength;

	}

	public static CharGroupTokenizer of(Function<Builder, ObjectBuilder<CharGroupTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.CharGroup;
	}

	/**
	 * Required - API name: {@code tokenize_on_chars}
	 */
	public final List<String> tokenizeOnChars() {
		return this.tokenizeOnChars;
	}

	/**
	 * API name: {@code max_token_length}
	 */
	@Nullable
	public final Integer maxTokenLength() {
		return this.maxTokenLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "char_group");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.tokenizeOnChars)) {
			generator.writeKey("tokenize_on_chars");
			generator.writeStartArray();
			for (String item0 : this.tokenizeOnChars) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.maxTokenLength != null) {
			generator.writeKey("max_token_length");
			generator.write(this.maxTokenLength);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharGroupTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CharGroupTokenizer> {
		private List<String> tokenizeOnChars;

		@Nullable
		private Integer maxTokenLength;

		/**
		 * Required - API name: {@code tokenize_on_chars}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tokenizeOnChars</code>.
		 */
		public final Builder tokenizeOnChars(List<String> list) {
			this.tokenizeOnChars = _listAddAll(this.tokenizeOnChars, list);
			return this;
		}

		/**
		 * Required - API name: {@code tokenize_on_chars}
		 * <p>
		 * Adds one or more values to <code>tokenizeOnChars</code>.
		 */
		public final Builder tokenizeOnChars(String value, String... values) {
			this.tokenizeOnChars = _listAdd(this.tokenizeOnChars, value, values);
			return this;
		}

		/**
		 * API name: {@code max_token_length}
		 */
		public final Builder maxTokenLength(@Nullable Integer value) {
			this.maxTokenLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CharGroupTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CharGroupTokenizer build() {
			_checkSingleUse();

			return new CharGroupTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CharGroupTokenizer}
	 */
	public static final JsonpDeserializer<CharGroupTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CharGroupTokenizer::setupCharGroupTokenizerDeserializer);

	protected static void setupCharGroupTokenizerDeserializer(ObjectDeserializer<CharGroupTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::tokenizeOnChars, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"tokenize_on_chars");
		op.add(Builder::maxTokenLength, JsonpDeserializer.integerDeserializer(), "max_token_length");

		op.ignore("type");
	}

}
