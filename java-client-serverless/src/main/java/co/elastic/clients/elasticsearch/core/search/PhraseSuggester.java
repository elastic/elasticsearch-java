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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: _global.search._types.PhraseSuggester

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.PhraseSuggester">API
 *      specification</a>
 */
@JsonpDeserializable
public class PhraseSuggester extends SuggesterBase implements FieldSuggesterVariant {
	@Nullable
	private final PhraseSuggestCollate collate;

	@Nullable
	private final Double confidence;

	private final List<DirectGenerator> directGenerator;

	@Nullable
	private final Boolean forceUnigrams;

	@Nullable
	private final Integer gramSize;

	@Nullable
	private final PhraseSuggestHighlight highlight;

	@Nullable
	private final Double maxErrors;

	@Nullable
	private final Double realWordErrorLikelihood;

	@Nullable
	private final String separator;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final SmoothingModel smoothing;

	@Nullable
	private final String text;

	@Nullable
	private final Integer tokenLimit;

	// ---------------------------------------------------------------------------------------------

	private PhraseSuggester(Builder builder) {
		super(builder);

		this.collate = builder.collate;
		this.confidence = builder.confidence;
		this.directGenerator = ApiTypeHelper.unmodifiable(builder.directGenerator);
		this.forceUnigrams = builder.forceUnigrams;
		this.gramSize = builder.gramSize;
		this.highlight = builder.highlight;
		this.maxErrors = builder.maxErrors;
		this.realWordErrorLikelihood = builder.realWordErrorLikelihood;
		this.separator = builder.separator;
		this.shardSize = builder.shardSize;
		this.smoothing = builder.smoothing;
		this.text = builder.text;
		this.tokenLimit = builder.tokenLimit;

	}

	public static PhraseSuggester of(Function<Builder, ObjectBuilder<PhraseSuggester>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * FieldSuggester variant kind.
	 */
	@Override
	public FieldSuggester.Kind _fieldSuggesterKind() {
		return FieldSuggester.Kind.Phrase;
	}

	/**
	 * Checks each suggestion against the specified query to prune suggestions for
	 * which no matching docs exist in the index.
	 * <p>
	 * API name: {@code collate}
	 */
	@Nullable
	public final PhraseSuggestCollate collate() {
		return this.collate;
	}

	/**
	 * Defines a factor applied to the input phrases score, which is used as a
	 * threshold for other suggest candidates. Only candidates that score higher
	 * than the threshold will be included in the result.
	 * <p>
	 * API name: {@code confidence}
	 */
	@Nullable
	public final Double confidence() {
		return this.confidence;
	}

	/**
	 * A list of candidate generators that produce a list of possible terms per term
	 * in the given text.
	 * <p>
	 * API name: {@code direct_generator}
	 */
	public final List<DirectGenerator> directGenerator() {
		return this.directGenerator;
	}

	/**
	 * API name: {@code force_unigrams}
	 */
	@Nullable
	public final Boolean forceUnigrams() {
		return this.forceUnigrams;
	}

	/**
	 * Sets max size of the n-grams (shingles) in the field. If the field doesn’t
	 * contain n-grams (shingles), this should be omitted or set to <code>1</code>.
	 * If the field uses a shingle filter, the <code>gram_size</code> is set to the
	 * <code>max_shingle_size</code> if not explicitly set.
	 * <p>
	 * API name: {@code gram_size}
	 */
	@Nullable
	public final Integer gramSize() {
		return this.gramSize;
	}

	/**
	 * Sets up suggestion highlighting. If not provided, no highlighted field is
	 * returned.
	 * <p>
	 * API name: {@code highlight}
	 */
	@Nullable
	public final PhraseSuggestHighlight highlight() {
		return this.highlight;
	}

	/**
	 * The maximum percentage of the terms considered to be misspellings in order to
	 * form a correction. This method accepts a float value in the range
	 * <code>[0..1)</code> as a fraction of the actual query terms or a number
	 * <code>&gt;=1</code> as an absolute number of query terms.
	 * <p>
	 * API name: {@code max_errors}
	 */
	@Nullable
	public final Double maxErrors() {
		return this.maxErrors;
	}

	/**
	 * The likelihood of a term being misspelled even if the term exists in the
	 * dictionary.
	 * <p>
	 * API name: {@code real_word_error_likelihood}
	 */
	@Nullable
	public final Double realWordErrorLikelihood() {
		return this.realWordErrorLikelihood;
	}

	/**
	 * The separator that is used to separate terms in the bigram field. If not set,
	 * the whitespace character is used as a separator.
	 * <p>
	 * API name: {@code separator}
	 */
	@Nullable
	public final String separator() {
		return this.separator;
	}

	/**
	 * Sets the maximum number of suggested terms to be retrieved from each
	 * individual shard.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * The smoothing model used to balance weight between infrequent grams (grams
	 * (shingles) are not existing in the index) and frequent grams (appear at least
	 * once in the index). The default model is Stupid Backoff.
	 * <p>
	 * API name: {@code smoothing}
	 */
	@Nullable
	public final SmoothingModel smoothing() {
		return this.smoothing;
	}

	/**
	 * The text/query to provide suggestions for.
	 * <p>
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
		return this.text;
	}

	/**
	 * API name: {@code token_limit}
	 */
	@Nullable
	public final Integer tokenLimit() {
		return this.tokenLimit;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.collate != null) {
			generator.writeKey("collate");
			this.collate.serialize(generator, mapper);

		}
		if (this.confidence != null) {
			generator.writeKey("confidence");
			generator.write(this.confidence);

		}
		if (ApiTypeHelper.isDefined(this.directGenerator)) {
			generator.writeKey("direct_generator");
			generator.writeStartArray();
			for (DirectGenerator item0 : this.directGenerator) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.forceUnigrams != null) {
			generator.writeKey("force_unigrams");
			generator.write(this.forceUnigrams);

		}
		if (this.gramSize != null) {
			generator.writeKey("gram_size");
			generator.write(this.gramSize);

		}
		if (this.highlight != null) {
			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (this.maxErrors != null) {
			generator.writeKey("max_errors");
			generator.write(this.maxErrors);

		}
		if (this.realWordErrorLikelihood != null) {
			generator.writeKey("real_word_error_likelihood");
			generator.write(this.realWordErrorLikelihood);

		}
		if (this.separator != null) {
			generator.writeKey("separator");
			generator.write(this.separator);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.smoothing != null) {
			generator.writeKey("smoothing");
			this.smoothing.serialize(generator, mapper);

		}
		if (this.text != null) {
			generator.writeKey("text");
			generator.write(this.text);

		}
		if (this.tokenLimit != null) {
			generator.writeKey("token_limit");
			generator.write(this.tokenLimit);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggester}.
	 */

	public static class Builder extends SuggesterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PhraseSuggester> {
		@Nullable
		private PhraseSuggestCollate collate;

		@Nullable
		private Double confidence;

		@Nullable
		private List<DirectGenerator> directGenerator;

		@Nullable
		private Boolean forceUnigrams;

		@Nullable
		private Integer gramSize;

		@Nullable
		private PhraseSuggestHighlight highlight;

		@Nullable
		private Double maxErrors;

		@Nullable
		private Double realWordErrorLikelihood;

		@Nullable
		private String separator;

		@Nullable
		private Integer shardSize;

		@Nullable
		private SmoothingModel smoothing;

		@Nullable
		private String text;

		@Nullable
		private Integer tokenLimit;

		/**
		 * Checks each suggestion against the specified query to prune suggestions for
		 * which no matching docs exist in the index.
		 * <p>
		 * API name: {@code collate}
		 */
		public final Builder collate(@Nullable PhraseSuggestCollate value) {
			this.collate = value;
			return this;
		}

		/**
		 * Checks each suggestion against the specified query to prune suggestions for
		 * which no matching docs exist in the index.
		 * <p>
		 * API name: {@code collate}
		 */
		public final Builder collate(Function<PhraseSuggestCollate.Builder, ObjectBuilder<PhraseSuggestCollate>> fn) {
			return this.collate(fn.apply(new PhraseSuggestCollate.Builder()).build());
		}

		/**
		 * Defines a factor applied to the input phrases score, which is used as a
		 * threshold for other suggest candidates. Only candidates that score higher
		 * than the threshold will be included in the result.
		 * <p>
		 * API name: {@code confidence}
		 */
		public final Builder confidence(@Nullable Double value) {
			this.confidence = value;
			return this;
		}

		/**
		 * A list of candidate generators that produce a list of possible terms per term
		 * in the given text.
		 * <p>
		 * API name: {@code direct_generator}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>directGenerator</code>.
		 */
		public final Builder directGenerator(List<DirectGenerator> list) {
			this.directGenerator = _listAddAll(this.directGenerator, list);
			return this;
		}

		/**
		 * A list of candidate generators that produce a list of possible terms per term
		 * in the given text.
		 * <p>
		 * API name: {@code direct_generator}
		 * <p>
		 * Adds one or more values to <code>directGenerator</code>.
		 */
		public final Builder directGenerator(DirectGenerator value, DirectGenerator... values) {
			this.directGenerator = _listAdd(this.directGenerator, value, values);
			return this;
		}

		/**
		 * A list of candidate generators that produce a list of possible terms per term
		 * in the given text.
		 * <p>
		 * API name: {@code direct_generator}
		 * <p>
		 * Adds a value to <code>directGenerator</code> using a builder lambda.
		 */
		public final Builder directGenerator(Function<DirectGenerator.Builder, ObjectBuilder<DirectGenerator>> fn) {
			return directGenerator(fn.apply(new DirectGenerator.Builder()).build());
		}

		/**
		 * API name: {@code force_unigrams}
		 */
		public final Builder forceUnigrams(@Nullable Boolean value) {
			this.forceUnigrams = value;
			return this;
		}

		/**
		 * Sets max size of the n-grams (shingles) in the field. If the field doesn’t
		 * contain n-grams (shingles), this should be omitted or set to <code>1</code>.
		 * If the field uses a shingle filter, the <code>gram_size</code> is set to the
		 * <code>max_shingle_size</code> if not explicitly set.
		 * <p>
		 * API name: {@code gram_size}
		 */
		public final Builder gramSize(@Nullable Integer value) {
			this.gramSize = value;
			return this;
		}

		/**
		 * Sets up suggestion highlighting. If not provided, no highlighted field is
		 * returned.
		 * <p>
		 * API name: {@code highlight}
		 */
		public final Builder highlight(@Nullable PhraseSuggestHighlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * Sets up suggestion highlighting. If not provided, no highlighted field is
		 * returned.
		 * <p>
		 * API name: {@code highlight}
		 */
		public final Builder highlight(
				Function<PhraseSuggestHighlight.Builder, ObjectBuilder<PhraseSuggestHighlight>> fn) {
			return this.highlight(fn.apply(new PhraseSuggestHighlight.Builder()).build());
		}

		/**
		 * The maximum percentage of the terms considered to be misspellings in order to
		 * form a correction. This method accepts a float value in the range
		 * <code>[0..1)</code> as a fraction of the actual query terms or a number
		 * <code>&gt;=1</code> as an absolute number of query terms.
		 * <p>
		 * API name: {@code max_errors}
		 */
		public final Builder maxErrors(@Nullable Double value) {
			this.maxErrors = value;
			return this;
		}

		/**
		 * The likelihood of a term being misspelled even if the term exists in the
		 * dictionary.
		 * <p>
		 * API name: {@code real_word_error_likelihood}
		 */
		public final Builder realWordErrorLikelihood(@Nullable Double value) {
			this.realWordErrorLikelihood = value;
			return this;
		}

		/**
		 * The separator that is used to separate terms in the bigram field. If not set,
		 * the whitespace character is used as a separator.
		 * <p>
		 * API name: {@code separator}
		 */
		public final Builder separator(@Nullable String value) {
			this.separator = value;
			return this;
		}

		/**
		 * Sets the maximum number of suggested terms to be retrieved from each
		 * individual shard.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * The smoothing model used to balance weight between infrequent grams (grams
		 * (shingles) are not existing in the index) and frequent grams (appear at least
		 * once in the index). The default model is Stupid Backoff.
		 * <p>
		 * API name: {@code smoothing}
		 */
		public final Builder smoothing(@Nullable SmoothingModel value) {
			this.smoothing = value;
			return this;
		}

		/**
		 * The smoothing model used to balance weight between infrequent grams (grams
		 * (shingles) are not existing in the index) and frequent grams (appear at least
		 * once in the index). The default model is Stupid Backoff.
		 * <p>
		 * API name: {@code smoothing}
		 */
		public final Builder smoothing(Function<SmoothingModel.Builder, ObjectBuilder<SmoothingModel>> fn) {
			return this.smoothing(fn.apply(new SmoothingModel.Builder()).build());
		}

		/**
		 * The text/query to provide suggestions for.
		 * <p>
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code token_limit}
		 */
		public final Builder tokenLimit(@Nullable Integer value) {
			this.tokenLimit = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggester build() {
			_checkSingleUse();

			return new PhraseSuggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggester}
	 */
	public static final JsonpDeserializer<PhraseSuggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PhraseSuggester::setupPhraseSuggesterDeserializer);

	protected static void setupPhraseSuggesterDeserializer(ObjectDeserializer<PhraseSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::collate, PhraseSuggestCollate._DESERIALIZER, "collate");
		op.add(Builder::confidence, JsonpDeserializer.doubleDeserializer(), "confidence");
		op.add(Builder::directGenerator, JsonpDeserializer.arrayDeserializer(DirectGenerator._DESERIALIZER),
				"direct_generator");
		op.add(Builder::forceUnigrams, JsonpDeserializer.booleanDeserializer(), "force_unigrams");
		op.add(Builder::gramSize, JsonpDeserializer.integerDeserializer(), "gram_size");
		op.add(Builder::highlight, PhraseSuggestHighlight._DESERIALIZER, "highlight");
		op.add(Builder::maxErrors, JsonpDeserializer.doubleDeserializer(), "max_errors");
		op.add(Builder::realWordErrorLikelihood, JsonpDeserializer.doubleDeserializer(), "real_word_error_likelihood");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::smoothing, SmoothingModel._DESERIALIZER, "smoothing");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::tokenLimit, JsonpDeserializer.integerDeserializer(), "token_limit");

	}

}
