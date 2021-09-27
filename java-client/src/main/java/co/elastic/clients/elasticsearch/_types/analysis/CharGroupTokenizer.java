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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.CharGroupTokenizer
@JsonpDeserializable
public final class CharGroupTokenizer extends TokenizerBase implements TokenizerVariant {
	private final List<String> tokenizeOnChars;

	// ---------------------------------------------------------------------------------------------

	public CharGroupTokenizer(Builder builder) {
		super(builder);

		this.tokenizeOnChars = Objects.requireNonNull(builder.tokenizeOnChars, "tokenize_on_chars");

	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "char_group";
	}

	/**
	 * API name: {@code tokenize_on_chars}
	 */
	public List<String> tokenizeOnChars() {
		return this.tokenizeOnChars;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "char_group");
		super.serializeInternal(generator, mapper);

		generator.writeKey("tokenize_on_chars");
		generator.writeStartArray();
		for (String item0 : this.tokenizeOnChars) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CharGroupTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CharGroupTokenizer> {
		private List<String> tokenizeOnChars;

		/**
		 * API name: {@code tokenize_on_chars}
		 */
		public Builder tokenizeOnChars(List<String> value) {
			this.tokenizeOnChars = value;
			return this;
		}

		/**
		 * API name: {@code tokenize_on_chars}
		 */
		public Builder tokenizeOnChars(String... value) {
			this.tokenizeOnChars = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokenizeOnChars(List)}, creating the list if needed.
		 */
		public Builder addTokenizeOnChars(String value) {
			if (this.tokenizeOnChars == null) {
				this.tokenizeOnChars = new ArrayList<>();
			}
			this.tokenizeOnChars.add(value);
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

			return new CharGroupTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CharGroupTokenizer}
	 */
	public static final JsonpDeserializer<CharGroupTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CharGroupTokenizer::setupCharGroupTokenizerDeserializer, Builder::build);

	protected static void setupCharGroupTokenizerDeserializer(DelegatingDeserializer<CharGroupTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::tokenizeOnChars, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"tokenize_on_chars");

		op.ignore("type");
	}

}
