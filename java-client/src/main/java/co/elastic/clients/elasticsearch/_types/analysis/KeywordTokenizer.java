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
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.KeywordTokenizer
@JsonpDeserializable
public final class KeywordTokenizer extends TokenizerBase implements TokenizerVariant {
	private final Integer bufferSize;

	// ---------------------------------------------------------------------------------------------

	public KeywordTokenizer(Builder builder) {
		super(builder);

		this.bufferSize = Objects.requireNonNull(builder.bufferSize, "buffer_size");

	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "keyword";
	}

	/**
	 * API name: {@code buffer_size}
	 */
	public Integer bufferSize() {
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
		 * API name: {@code buffer_size}
		 */
		public Builder bufferSize(Integer value) {
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

			return new KeywordTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeywordTokenizer}
	 */
	public static final JsonpDeserializer<KeywordTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KeywordTokenizer::setupKeywordTokenizerDeserializer, Builder::build);

	protected static void setupKeywordTokenizerDeserializer(DelegatingDeserializer<KeywordTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::bufferSize, JsonpDeserializer.integerDeserializer(), "buffer_size");

		op.ignore("type");
	}

}
