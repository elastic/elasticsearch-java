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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.SuggestMode;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Float;
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

// typedef: _global.search._types.TermSuggester

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.TermSuggester">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermSuggester extends SuggesterBase implements FieldSuggesterVariant {
	@Nullable
	private final Boolean lowercaseTerms;

	@Nullable
	private final Integer maxEdits;

	@Nullable
	private final Integer maxInspections;

	@Nullable
	private final Float maxTermFreq;

	@Nullable
	private final Float minDocFreq;

	@Nullable
	private final Integer minWordLength;

	@Nullable
	private final Integer prefixLength;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final SuggestSort sort;

	@Nullable
	private final StringDistance stringDistance;

	@Nullable
	private final SuggestMode suggestMode;

	@Nullable
	private final String text;

	// ---------------------------------------------------------------------------------------------

	private TermSuggester(Builder builder) {
		super(builder);

		this.lowercaseTerms = builder.lowercaseTerms;
		this.maxEdits = builder.maxEdits;
		this.maxInspections = builder.maxInspections;
		this.maxTermFreq = builder.maxTermFreq;
		this.minDocFreq = builder.minDocFreq;
		this.minWordLength = builder.minWordLength;
		this.prefixLength = builder.prefixLength;
		this.shardSize = builder.shardSize;
		this.sort = builder.sort;
		this.stringDistance = builder.stringDistance;
		this.suggestMode = builder.suggestMode;
		this.text = builder.text;

	}

	public static TermSuggester of(Function<Builder, ObjectBuilder<TermSuggester>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * FieldSuggester variant kind.
	 */
	@Override
	public FieldSuggester.Kind _fieldSuggesterKind() {
		return FieldSuggester.Kind.Term;
	}

	/**
	 * API name: {@code lowercase_terms}
	 */
	@Nullable
	public final Boolean lowercaseTerms() {
		return this.lowercaseTerms;
	}

	/**
	 * The maximum edit distance candidate suggestions can have in order to be
	 * considered as a suggestion. Can only be <code>1</code> or <code>2</code>.
	 * <p>
	 * API name: {@code max_edits}
	 */
	@Nullable
	public final Integer maxEdits() {
		return this.maxEdits;
	}

	/**
	 * A factor that is used to multiply with the shard_size in order to inspect
	 * more candidate spelling corrections on the shard level. Can improve accuracy
	 * at the cost of performance.
	 * <p>
	 * API name: {@code max_inspections}
	 */
	@Nullable
	public final Integer maxInspections() {
		return this.maxInspections;
	}

	/**
	 * The maximum threshold in number of documents in which a suggest text token
	 * can exist in order to be included. Can be a relative percentage number (for
	 * example <code>0.4</code>) or an absolute number to represent document
	 * frequencies. If a value higher than 1 is specified, then fractional can not
	 * be specified.
	 * <p>
	 * API name: {@code max_term_freq}
	 */
	@Nullable
	public final Float maxTermFreq() {
		return this.maxTermFreq;
	}

	/**
	 * The minimal threshold in number of documents a suggestion should appear in.
	 * This can improve quality by only suggesting high frequency terms. Can be
	 * specified as an absolute number or as a relative percentage of number of
	 * documents. If a value higher than 1 is specified, then the number cannot be
	 * fractional.
	 * <p>
	 * API name: {@code min_doc_freq}
	 */
	@Nullable
	public final Float minDocFreq() {
		return this.minDocFreq;
	}

	/**
	 * The minimum length a suggest text term must have in order to be included.
	 * <p>
	 * API name: {@code min_word_length}
	 */
	@Nullable
	public final Integer minWordLength() {
		return this.minWordLength;
	}

	/**
	 * The number of minimal prefix characters that must match in order be a
	 * candidate for suggestions. Increasing this number improves spellcheck
	 * performance.
	 * <p>
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public final Integer prefixLength() {
		return this.prefixLength;
	}

	/**
	 * Sets the maximum number of suggestions to be retrieved from each individual
	 * shard.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * Defines how suggestions should be sorted per suggest text term.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final SuggestSort sort() {
		return this.sort;
	}

	/**
	 * The string distance implementation to use for comparing how similar suggested
	 * terms are.
	 * <p>
	 * API name: {@code string_distance}
	 */
	@Nullable
	public final StringDistance stringDistance() {
		return this.stringDistance;
	}

	/**
	 * Controls what suggestions are included or controls for what suggest text
	 * terms, suggestions should be suggested.
	 * <p>
	 * API name: {@code suggest_mode}
	 */
	@Nullable
	public final SuggestMode suggestMode() {
		return this.suggestMode;
	}

	/**
	 * The suggest text. Needs to be set globally or per suggestion.
	 * <p>
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
		return this.text;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.lowercaseTerms != null) {
			generator.writeKey("lowercase_terms");
			generator.write(this.lowercaseTerms);

		}
		if (this.maxEdits != null) {
			generator.writeKey("max_edits");
			generator.write(this.maxEdits);

		}
		if (this.maxInspections != null) {
			generator.writeKey("max_inspections");
			generator.write(this.maxInspections);

		}
		if (this.maxTermFreq != null) {
			generator.writeKey("max_term_freq");
			generator.write(this.maxTermFreq);

		}
		if (this.minDocFreq != null) {
			generator.writeKey("min_doc_freq");
			generator.write(this.minDocFreq);

		}
		if (this.minWordLength != null) {
			generator.writeKey("min_word_length");
			generator.write(this.minWordLength);

		}
		if (this.prefixLength != null) {
			generator.writeKey("prefix_length");
			generator.write(this.prefixLength);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.sort != null) {
			generator.writeKey("sort");
			this.sort.serialize(generator, mapper);
		}
		if (this.stringDistance != null) {
			generator.writeKey("string_distance");
			this.stringDistance.serialize(generator, mapper);
		}
		if (this.suggestMode != null) {
			generator.writeKey("suggest_mode");
			this.suggestMode.serialize(generator, mapper);
		}
		if (this.text != null) {
			generator.writeKey("text");
			generator.write(this.text);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermSuggester}.
	 */

	public static class Builder extends SuggesterBase.AbstractBuilder<Builder> implements ObjectBuilder<TermSuggester> {
		@Nullable
		private Boolean lowercaseTerms;

		@Nullable
		private Integer maxEdits;

		@Nullable
		private Integer maxInspections;

		@Nullable
		private Float maxTermFreq;

		@Nullable
		private Float minDocFreq;

		@Nullable
		private Integer minWordLength;

		@Nullable
		private Integer prefixLength;

		@Nullable
		private Integer shardSize;

		@Nullable
		private SuggestSort sort;

		@Nullable
		private StringDistance stringDistance;

		@Nullable
		private SuggestMode suggestMode;

		@Nullable
		private String text;

		/**
		 * API name: {@code lowercase_terms}
		 */
		public final Builder lowercaseTerms(@Nullable Boolean value) {
			this.lowercaseTerms = value;
			return this;
		}

		/**
		 * The maximum edit distance candidate suggestions can have in order to be
		 * considered as a suggestion. Can only be <code>1</code> or <code>2</code>.
		 * <p>
		 * API name: {@code max_edits}
		 */
		public final Builder maxEdits(@Nullable Integer value) {
			this.maxEdits = value;
			return this;
		}

		/**
		 * A factor that is used to multiply with the shard_size in order to inspect
		 * more candidate spelling corrections on the shard level. Can improve accuracy
		 * at the cost of performance.
		 * <p>
		 * API name: {@code max_inspections}
		 */
		public final Builder maxInspections(@Nullable Integer value) {
			this.maxInspections = value;
			return this;
		}

		/**
		 * The maximum threshold in number of documents in which a suggest text token
		 * can exist in order to be included. Can be a relative percentage number (for
		 * example <code>0.4</code>) or an absolute number to represent document
		 * frequencies. If a value higher than 1 is specified, then fractional can not
		 * be specified.
		 * <p>
		 * API name: {@code max_term_freq}
		 */
		public final Builder maxTermFreq(@Nullable Float value) {
			this.maxTermFreq = value;
			return this;
		}

		/**
		 * The minimal threshold in number of documents a suggestion should appear in.
		 * This can improve quality by only suggesting high frequency terms. Can be
		 * specified as an absolute number or as a relative percentage of number of
		 * documents. If a value higher than 1 is specified, then the number cannot be
		 * fractional.
		 * <p>
		 * API name: {@code min_doc_freq}
		 */
		public final Builder minDocFreq(@Nullable Float value) {
			this.minDocFreq = value;
			return this;
		}

		/**
		 * The minimum length a suggest text term must have in order to be included.
		 * <p>
		 * API name: {@code min_word_length}
		 */
		public final Builder minWordLength(@Nullable Integer value) {
			this.minWordLength = value;
			return this;
		}

		/**
		 * The number of minimal prefix characters that must match in order be a
		 * candidate for suggestions. Increasing this number improves spellcheck
		 * performance.
		 * <p>
		 * API name: {@code prefix_length}
		 */
		public final Builder prefixLength(@Nullable Integer value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * Sets the maximum number of suggestions to be retrieved from each individual
		 * shard.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * Defines how suggestions should be sorted per suggest text term.
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable SuggestSort value) {
			this.sort = value;
			return this;
		}

		/**
		 * The string distance implementation to use for comparing how similar suggested
		 * terms are.
		 * <p>
		 * API name: {@code string_distance}
		 */
		public final Builder stringDistance(@Nullable StringDistance value) {
			this.stringDistance = value;
			return this;
		}

		/**
		 * Controls what suggestions are included or controls for what suggest text
		 * terms, suggestions should be suggested.
		 * <p>
		 * API name: {@code suggest_mode}
		 */
		public final Builder suggestMode(@Nullable SuggestMode value) {
			this.suggestMode = value;
			return this;
		}

		/**
		 * The suggest text. Needs to be set globally or per suggestion.
		 * <p>
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermSuggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermSuggester build() {
			_checkSingleUse();

			return new TermSuggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermSuggester}
	 */
	public static final JsonpDeserializer<TermSuggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermSuggester::setupTermSuggesterDeserializer);

	protected static void setupTermSuggesterDeserializer(ObjectDeserializer<TermSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::lowercaseTerms, JsonpDeserializer.booleanDeserializer(), "lowercase_terms");
		op.add(Builder::maxEdits, JsonpDeserializer.integerDeserializer(), "max_edits");
		op.add(Builder::maxInspections, JsonpDeserializer.integerDeserializer(), "max_inspections");
		op.add(Builder::maxTermFreq, JsonpDeserializer.floatDeserializer(), "max_term_freq");
		op.add(Builder::minDocFreq, JsonpDeserializer.floatDeserializer(), "min_doc_freq");
		op.add(Builder::minWordLength, JsonpDeserializer.integerDeserializer(), "min_word_length");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::sort, SuggestSort._DESERIALIZER, "sort");
		op.add(Builder::stringDistance, StringDistance._DESERIALIZER, "string_distance");
		op.add(Builder::suggestMode, SuggestMode._DESERIALIZER, "suggest_mode");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

}
