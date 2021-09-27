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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternReplaceTokenFilter
@JsonpDeserializable
public final class PatternReplaceTokenFilter extends TokenFilterBase implements CharFilterVariant, TokenFilterVariant {
	private final String flags;

	private final String pattern;

	private final String replacement;

	// ---------------------------------------------------------------------------------------------

	public PatternReplaceTokenFilter(Builder builder) {
		super(builder);

		this.flags = Objects.requireNonNull(builder.flags, "flags");
		this.pattern = Objects.requireNonNull(builder.pattern, "pattern");
		this.replacement = Objects.requireNonNull(builder.replacement, "replacement");

	}

	/**
	 * {@link CharFilter}, {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "pattern_replace";
	}

	/**
	 * API name: {@code flags}
	 */
	public String flags() {
		return this.flags;
	}

	/**
	 * API name: {@code pattern}
	 */
	public String pattern() {
		return this.pattern;
	}

	/**
	 * API name: {@code replacement}
	 */
	public String replacement() {
		return this.replacement;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern_replace");
		super.serializeInternal(generator, mapper);

		generator.writeKey("flags");
		generator.write(this.flags);

		generator.writeKey("pattern");
		generator.write(this.pattern);

		generator.writeKey("replacement");
		generator.write(this.replacement);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternReplaceTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternReplaceTokenFilter> {
		private String flags;

		private String pattern;

		private String replacement;

		/**
		 * API name: {@code flags}
		 */
		public Builder flags(String value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code pattern}
		 */
		public Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * API name: {@code replacement}
		 */
		public Builder replacement(String value) {
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

			return new PatternReplaceTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternReplaceTokenFilter}
	 */
	public static final JsonpDeserializer<PatternReplaceTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PatternReplaceTokenFilter::setupPatternReplaceTokenFilterDeserializer, Builder::build);

	protected static void setupPatternReplaceTokenFilterDeserializer(
			DelegatingDeserializer<PatternReplaceTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");

		op.ignore("type");
	}

}
