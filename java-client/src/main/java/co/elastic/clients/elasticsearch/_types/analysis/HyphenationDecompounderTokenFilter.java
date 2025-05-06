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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _types.analysis.HyphenationDecompounderTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.HyphenationDecompounderTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class HyphenationDecompounderTokenFilter extends CompoundWordTokenFilterBase
		implements
			TokenFilterDefinitionVariant {
	private final String hyphenationPatternsPath;

	@Nullable
	private final Boolean noSubMatches;

	@Nullable
	private final Boolean noOverlappingMatches;

	// ---------------------------------------------------------------------------------------------

	private HyphenationDecompounderTokenFilter(Builder builder) {
		super(builder);

		this.hyphenationPatternsPath = ApiTypeHelper.requireNonNull(builder.hyphenationPatternsPath, this,
				"hyphenationPatternsPath");
		this.noSubMatches = builder.noSubMatches;
		this.noOverlappingMatches = builder.noOverlappingMatches;

	}

	public static HyphenationDecompounderTokenFilter of(
			Function<Builder, ObjectBuilder<HyphenationDecompounderTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.HyphenationDecompounder;
	}

	/**
	 * Required - Path to an Apache FOP (Formatting Objects Processor) XML
	 * hyphenation pattern file. This path must be absolute or relative to the
	 * <code>config</code> location. Only FOP v1.2 compatible files are supported.
	 * <p>
	 * API name: {@code hyphenation_patterns_path}
	 */
	public final String hyphenationPatternsPath() {
		return this.hyphenationPatternsPath;
	}

	/**
	 * If <code>true</code>, do not match sub tokens in tokens that are in the word
	 * list. Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code no_sub_matches}
	 */
	@Nullable
	public final Boolean noSubMatches() {
		return this.noSubMatches;
	}

	/**
	 * If <code>true</code>, do not allow overlapping tokens. Defaults to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code no_overlapping_matches}
	 */
	@Nullable
	public final Boolean noOverlappingMatches() {
		return this.noOverlappingMatches;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "hyphenation_decompounder");
		super.serializeInternal(generator, mapper);
		generator.writeKey("hyphenation_patterns_path");
		generator.write(this.hyphenationPatternsPath);

		if (this.noSubMatches != null) {
			generator.writeKey("no_sub_matches");
			generator.write(this.noSubMatches);

		}
		if (this.noOverlappingMatches != null) {
			generator.writeKey("no_overlapping_matches");
			generator.write(this.noOverlappingMatches);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HyphenationDecompounderTokenFilter}.
	 */

	public static class Builder extends CompoundWordTokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HyphenationDecompounderTokenFilter> {
		private String hyphenationPatternsPath;

		@Nullable
		private Boolean noSubMatches;

		@Nullable
		private Boolean noOverlappingMatches;

		/**
		 * Required - Path to an Apache FOP (Formatting Objects Processor) XML
		 * hyphenation pattern file. This path must be absolute or relative to the
		 * <code>config</code> location. Only FOP v1.2 compatible files are supported.
		 * <p>
		 * API name: {@code hyphenation_patterns_path}
		 */
		public final Builder hyphenationPatternsPath(String value) {
			this.hyphenationPatternsPath = value;
			return this;
		}

		/**
		 * If <code>true</code>, do not match sub tokens in tokens that are in the word
		 * list. Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code no_sub_matches}
		 */
		public final Builder noSubMatches(@Nullable Boolean value) {
			this.noSubMatches = value;
			return this;
		}

		/**
		 * If <code>true</code>, do not allow overlapping tokens. Defaults to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code no_overlapping_matches}
		 */
		public final Builder noOverlappingMatches(@Nullable Boolean value) {
			this.noOverlappingMatches = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HyphenationDecompounderTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HyphenationDecompounderTokenFilter build() {
			_checkSingleUse();

			return new HyphenationDecompounderTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HyphenationDecompounderTokenFilter}
	 */
	public static final JsonpDeserializer<HyphenationDecompounderTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					HyphenationDecompounderTokenFilter::setupHyphenationDecompounderTokenFilterDeserializer);

	protected static void setupHyphenationDecompounderTokenFilterDeserializer(
			ObjectDeserializer<HyphenationDecompounderTokenFilter.Builder> op) {
		CompoundWordTokenFilterBase.setupCompoundWordTokenFilterBaseDeserializer(op);
		op.add(Builder::hyphenationPatternsPath, JsonpDeserializer.stringDeserializer(), "hyphenation_patterns_path");
		op.add(Builder::noSubMatches, JsonpDeserializer.booleanDeserializer(), "no_sub_matches");
		op.add(Builder::noOverlappingMatches, JsonpDeserializer.booleanDeserializer(), "no_overlapping_matches");

		op.ignore("type");
	}

}
