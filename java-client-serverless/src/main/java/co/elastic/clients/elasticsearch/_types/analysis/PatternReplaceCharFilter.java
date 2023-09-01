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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternReplaceCharFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PatternReplaceCharFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternReplaceCharFilter extends CharFilterBase implements CharFilterDefinitionVariant {
	@Nullable
	private final String flags;

	private final String pattern;

	@Nullable
	private final String replacement;

	// ---------------------------------------------------------------------------------------------

	private PatternReplaceCharFilter(Builder builder) {
		super(builder);

		this.flags = builder.flags;
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.replacement = builder.replacement;

	}

	public static PatternReplaceCharFilter of(Function<Builder, ObjectBuilder<PatternReplaceCharFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * CharFilterDefinition variant kind.
	 */
	@Override
	public CharFilterDefinition.Kind _charFilterDefinitionKind() {
		return CharFilterDefinition.Kind.PatternReplace;
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
	 * Builder for {@link PatternReplaceCharFilter}.
	 */

	public static class Builder extends CharFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternReplaceCharFilter> {
		@Nullable
		private String flags;

		private String pattern;

		@Nullable
		private String replacement;

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
		 * Builds a {@link PatternReplaceCharFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternReplaceCharFilter build() {
			_checkSingleUse();

			return new PatternReplaceCharFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternReplaceCharFilter}
	 */
	public static final JsonpDeserializer<PatternReplaceCharFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PatternReplaceCharFilter::setupPatternReplaceCharFilterDeserializer);

	protected static void setupPatternReplaceCharFilterDeserializer(
			ObjectDeserializer<PatternReplaceCharFilter.Builder> op) {
		CharFilterBase.setupCharFilterBaseDeserializer(op);
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");

		op.ignore("type");
	}

}
