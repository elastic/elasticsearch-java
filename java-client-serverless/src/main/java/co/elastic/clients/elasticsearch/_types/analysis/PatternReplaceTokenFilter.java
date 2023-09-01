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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternReplaceTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PatternReplaceTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternReplaceTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Boolean all;

	@Nullable
	private final String flags;

	private final String pattern;

	@Nullable
	private final String replacement;

	// ---------------------------------------------------------------------------------------------

	private PatternReplaceTokenFilter(Builder builder) {
		super(builder);

		this.all = builder.all;
		this.flags = builder.flags;
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.replacement = builder.replacement;

	}

	public static PatternReplaceTokenFilter of(Function<Builder, ObjectBuilder<PatternReplaceTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.PatternReplace;
	}

	/**
	 * API name: {@code all}
	 */
	@Nullable
	public final Boolean all() {
		return this.all;
	}

	/**
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * API name: {@code replacement}
	 */
	@Nullable
	public final String replacement() {
		return this.replacement;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern_replace");
		super.serializeInternal(generator, mapper);
		if (this.all != null) {
			generator.writeKey("all");
			generator.write(this.all);

		}
		if (this.flags != null) {
			generator.writeKey("flags");
			generator.write(this.flags);

		}
		generator.writeKey("pattern");
		generator.write(this.pattern);

		if (this.replacement != null) {
			generator.writeKey("replacement");
			generator.write(this.replacement);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternReplaceTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternReplaceTokenFilter> {
		@Nullable
		private Boolean all;

		@Nullable
		private String flags;

		private String pattern;

		@Nullable
		private String replacement;

		/**
		 * API name: {@code all}
		 */
		public final Builder all(@Nullable Boolean value) {
			this.all = value;
			return this;
		}

		/**
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * API name: {@code replacement}
		 */
		public final Builder replacement(@Nullable String value) {
			this.replacement = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PatternReplaceTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternReplaceTokenFilter build() {
			_checkSingleUse();

			return new PatternReplaceTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternReplaceTokenFilter}
	 */
	public static final JsonpDeserializer<PatternReplaceTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PatternReplaceTokenFilter::setupPatternReplaceTokenFilterDeserializer);

	protected static void setupPatternReplaceTokenFilterDeserializer(
			ObjectDeserializer<PatternReplaceTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::all, JsonpDeserializer.booleanDeserializer(), "all");
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");

		op.ignore("type");
	}

}
