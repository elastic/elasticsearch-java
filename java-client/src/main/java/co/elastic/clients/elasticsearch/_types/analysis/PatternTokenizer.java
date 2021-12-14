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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternTokenizer

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/analysis/tokenizers.ts#L97-L102">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	private final String flags;

	private final int group;

	private final String pattern;

	// ---------------------------------------------------------------------------------------------

	private PatternTokenizer(Builder builder) {
		super(builder);

		this.flags = ApiTypeHelper.requireNonNull(builder.flags, this, "flags");
		this.group = ApiTypeHelper.requireNonNull(builder.group, this, "group");
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");

	}

	public static PatternTokenizer of(Function<Builder, ObjectBuilder<PatternTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.Pattern;
	}

	/**
	 * Required - API name: {@code flags}
	 */
	public final String flags() {
		return this.flags;
	}

	/**
	 * Required - API name: {@code group}
	 */
	public final int group() {
		return this.group;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern");
		super.serializeInternal(generator, mapper);
		generator.writeKey("flags");
		generator.write(this.flags);

		generator.writeKey("group");
		generator.write(this.group);

		generator.writeKey("pattern");
		generator.write(this.pattern);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternTokenizer> {
		private String flags;

		private Integer group;

		private String pattern;

		/**
		 * Required - API name: {@code flags}
		 */
		public final Builder flags(String value) {
			this.flags = value;
			return this;
		}

		/**
		 * Required - API name: {@code group}
		 */
		public final Builder group(int value) {
			this.group = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PatternTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternTokenizer build() {
			_checkSingleUse();

			return new PatternTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternTokenizer}
	 */
	public static final JsonpDeserializer<PatternTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PatternTokenizer::setupPatternTokenizerDeserializer);

	protected static void setupPatternTokenizerDeserializer(ObjectDeserializer<PatternTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::group, JsonpDeserializer.integerDeserializer(), "group");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");

		op.ignore("type");
	}

}
