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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _types.analysis.SimplePatternSplitTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.SimplePatternSplitTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimplePatternSplitTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	@Nullable
	private final String pattern;

	// ---------------------------------------------------------------------------------------------

	private SimplePatternSplitTokenizer(Builder builder) {
		super(builder);

		this.pattern = builder.pattern;

	}

	public static SimplePatternSplitTokenizer of(Function<Builder, ObjectBuilder<SimplePatternSplitTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.SimplePatternSplit;
	}

	/**
	 * API name: {@code pattern}
	 */
	@Nullable
	public final String pattern() {
		return this.pattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "simple_pattern_split");
		super.serializeInternal(generator, mapper);
		if (this.pattern != null) {
			generator.writeKey("pattern");
			generator.write(this.pattern);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimplePatternSplitTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SimplePatternSplitTokenizer> {
		@Nullable
		private String pattern;

		/**
		 * API name: {@code pattern}
		 */
		public final Builder pattern(@Nullable String value) {
			this.pattern = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimplePatternSplitTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimplePatternSplitTokenizer build() {
			_checkSingleUse();

			return new SimplePatternSplitTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimplePatternSplitTokenizer}
	 */
	public static final JsonpDeserializer<SimplePatternSplitTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimplePatternSplitTokenizer::setupSimplePatternSplitTokenizerDeserializer);

	protected static void setupSimplePatternSplitTokenizerDeserializer(
			ObjectDeserializer<SimplePatternSplitTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");

		op.ignore("type");
	}

}
