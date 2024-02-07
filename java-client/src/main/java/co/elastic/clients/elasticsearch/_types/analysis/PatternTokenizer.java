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
import java.lang.Integer;
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

// typedef: _types.analysis.PatternTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PatternTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	@Nullable
	private final String flags;

	@Nullable
	private final Integer group;

	@Nullable
	private final String pattern;

	// ---------------------------------------------------------------------------------------------

	private PatternTokenizer(Builder builder) {
		super(builder);

		this.flags = builder.flags;
		this.group = builder.group;
		this.pattern = builder.pattern;

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
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * API name: {@code group}
	 */
	@Nullable
	public final Integer group() {
		return this.group;
	}

	/**
	 * API name: {@code pattern}
	 */
	@Nullable
	public final String pattern() {
		return this.pattern;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern");
		super.serializeInternal(generator, mapper);
		if (this.flags != null) {
			generator.writeKey("flags");
			generator.write(this.flags);

		}
		if (this.group != null) {
			generator.writeKey("group");
			generator.write(this.group);

		}
		if (this.pattern != null) {
			generator.writeKey("pattern");
			generator.write(this.pattern);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternTokenizer> {
		@Nullable
		private String flags;

		@Nullable
		private Integer group;

		@Nullable
		private String pattern;

		/**
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code group}
		 */
		public final Builder group(@Nullable Integer value) {
			this.group = value;
			return this;
		}

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
