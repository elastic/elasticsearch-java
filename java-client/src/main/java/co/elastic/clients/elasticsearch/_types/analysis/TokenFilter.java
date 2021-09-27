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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.TokenFilter
@JsonpDeserializable
public class TokenFilter implements TaggedUnion<JsonpSerializable>, JsonpSerializable {

	public static final String ASCIIFOLDING = "asciifolding";
	public static final String COMMON_GRAMS = "common_grams";
	public static final String CONDITION = "condition";
	public static final String DELIMITED_PAYLOAD = "delimited_payload";
	public static final String EDGE_NGRAM = "edge_ngram";
	public static final String ELISION = "elision";
	public static final String FINGERPRINT = "fingerprint";
	public static final String HUNSPELL = "hunspell";
	public static final String HYPHENATION_DECOMPOUNDER = "hyphenation_decompounder";
	public static final String KEEP_TYPES = "keep_types";
	public static final String KEEP = "keep";
	public static final String KEYWORD_MARKER = "keyword_marker";
	public static final String KSTEM = "kstem";
	public static final String LENGTH = "length";
	public static final String LIMIT = "limit";
	public static final String LOWERCASE = "lowercase";
	public static final String MULTIPLEXER = "multiplexer";
	public static final String NGRAM = "ngram";
	public static final String NORI_PART_OF_SPEECH = "nori_part_of_speech";
	public static final String PATTERN_CAPTURE = "pattern_capture";
	public static final String PATTERN_REPLACE = "pattern_replace";
	public static final String PORTER_STEM = "porter_stem";
	public static final String PREDICATE_TOKEN_FILTER = "predicate_token_filter";
	public static final String REMOVE_DUPLICATES = "remove_duplicates";
	public static final String REVERSE = "reverse";
	public static final String SHINGLE = "shingle";
	public static final String SNOWBALL = "snowball";
	public static final String STEMMER_OVERRIDE = "stemmer_override";
	public static final String STEMMER = "stemmer";
	public static final String STOP = "stop";
	public static final String SYNONYM_GRAPH = "synonym_graph";
	public static final String SYNONYM = "synonym";
	public static final String TRIM = "trim";
	public static final String TRUNCATE = "truncate";
	public static final String UNIQUE = "unique";
	public static final String UPPERCASE = "uppercase";
	public static final String WORD_DELIMITER_GRAPH = "word_delimiter_graph";
	public static final String WORD_DELIMITER = "word_delimiter";
	public static final String KUROMOJI_STEMMER = "kuromoji_stemmer";
	public static final String KUROMOJI_READINGFORM = "kuromoji_readingform";
	public static final String KUROMOJI_PART_OF_SPEECH = "kuromoji_part_of_speech";

	// Tagged union implementation

	private final String _type;
	private final JsonpSerializable _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public JsonpSerializable _get() {
		return _value;
	}

	public TokenFilter(TokenFilterVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private TokenFilter(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code asciifolding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code asciifolding} kind.
	 */
	public AsciiFoldingTokenFilter asciifolding() {
		return TaggedUnionUtils.get(this, ASCIIFOLDING);
	}

	/**
	 * Get the {@code common_grams} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code common_grams} kind.
	 */
	public CommonGramsTokenFilter commonGrams() {
		return TaggedUnionUtils.get(this, COMMON_GRAMS);
	}

	/**
	 * Get the {@code condition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code condition} kind.
	 */
	public ConditionTokenFilter condition() {
		return TaggedUnionUtils.get(this, CONDITION);
	}

	/**
	 * Get the {@code delimited_payload} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delimited_payload}
	 *             kind.
	 */
	public DelimitedPayloadTokenFilter delimitedPayload() {
		return TaggedUnionUtils.get(this, DELIMITED_PAYLOAD);
	}

	/**
	 * Get the {@code edge_ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code edge_ngram} kind.
	 */
	public EdgeNGramTokenFilter edgeNgram() {
		return TaggedUnionUtils.get(this, EDGE_NGRAM);
	}

	/**
	 * Get the {@code elision} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code elision} kind.
	 */
	public ElisionTokenFilter elision() {
		return TaggedUnionUtils.get(this, ELISION);
	}

	/**
	 * Get the {@code fingerprint} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fingerprint} kind.
	 */
	public FingerprintTokenFilter fingerprint() {
		return TaggedUnionUtils.get(this, FINGERPRINT);
	}

	/**
	 * Get the {@code hunspell} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hunspell} kind.
	 */
	public HunspellTokenFilter hunspell() {
		return TaggedUnionUtils.get(this, HUNSPELL);
	}

	/**
	 * Get the {@code hyphenation_decompounder} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code hyphenation_decompounder} kind.
	 */
	public HyphenationDecompounderTokenFilter hyphenationDecompounder() {
		return TaggedUnionUtils.get(this, HYPHENATION_DECOMPOUNDER);
	}

	/**
	 * Get the {@code keep_types} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keep_types} kind.
	 */
	public KeepTypesTokenFilter keepTypes() {
		return TaggedUnionUtils.get(this, KEEP_TYPES);
	}

	/**
	 * Get the {@code keep} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keep} kind.
	 */
	public KeepWordsTokenFilter keep() {
		return TaggedUnionUtils.get(this, KEEP);
	}

	/**
	 * Get the {@code keyword_marker} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword_marker} kind.
	 */
	public KeywordMarkerTokenFilter keywordMarker() {
		return TaggedUnionUtils.get(this, KEYWORD_MARKER);
	}

	/**
	 * Get the {@code kstem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kstem} kind.
	 */
	public KStemTokenFilter kstem() {
		return TaggedUnionUtils.get(this, KSTEM);
	}

	/**
	 * Get the {@code length} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code length} kind.
	 */
	public LengthTokenFilter length() {
		return TaggedUnionUtils.get(this, LENGTH);
	}

	/**
	 * Get the {@code limit} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code limit} kind.
	 */
	public LimitTokenCountTokenFilter limit() {
		return TaggedUnionUtils.get(this, LIMIT);
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseTokenFilter lowercase() {
		return TaggedUnionUtils.get(this, LOWERCASE);
	}

	/**
	 * Get the {@code multiplexer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multiplexer} kind.
	 */
	public MultiplexerTokenFilter multiplexer() {
		return TaggedUnionUtils.get(this, MULTIPLEXER);
	}

	/**
	 * Get the {@code ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ngram} kind.
	 */
	public NGramTokenFilter ngram() {
		return TaggedUnionUtils.get(this, NGRAM);
	}

	/**
	 * Get the {@code nori_part_of_speech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori_part_of_speech}
	 *             kind.
	 */
	public NoriPartOfSpeechTokenFilter noriPartOfSpeech() {
		return TaggedUnionUtils.get(this, NORI_PART_OF_SPEECH);
	}

	/**
	 * Get the {@code pattern_capture} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_capture}
	 *             kind.
	 */
	public PatternCaptureTokenFilter patternCapture() {
		return TaggedUnionUtils.get(this, PATTERN_CAPTURE);
	}

	/**
	 * Get the {@code pattern_replace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_replace}
	 *             kind.
	 */
	public PatternReplaceTokenFilter patternReplace() {
		return TaggedUnionUtils.get(this, PATTERN_REPLACE);
	}

	/**
	 * Get the {@code porter_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code porter_stem} kind.
	 */
	public PorterStemTokenFilter porterStem() {
		return TaggedUnionUtils.get(this, PORTER_STEM);
	}

	/**
	 * Get the {@code predicate_token_filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code predicate_token_filter} kind.
	 */
	public PredicateTokenFilter predicateTokenFilter() {
		return TaggedUnionUtils.get(this, PREDICATE_TOKEN_FILTER);
	}

	/**
	 * Get the {@code remove_duplicates} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove_duplicates}
	 *             kind.
	 */
	public RemoveDuplicatesTokenFilter removeDuplicates() {
		return TaggedUnionUtils.get(this, REMOVE_DUPLICATES);
	}

	/**
	 * Get the {@code reverse} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse} kind.
	 */
	public ReverseTokenFilter reverse() {
		return TaggedUnionUtils.get(this, REVERSE);
	}

	/**
	 * Get the {@code shingle} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shingle} kind.
	 */
	public ShingleTokenFilter shingle() {
		return TaggedUnionUtils.get(this, SHINGLE);
	}

	/**
	 * Get the {@code snowball} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code snowball} kind.
	 */
	public SnowballTokenFilter snowball() {
		return TaggedUnionUtils.get(this, SNOWBALL);
	}

	/**
	 * Get the {@code stemmer_override} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stemmer_override}
	 *             kind.
	 */
	public StemmerOverrideTokenFilter stemmerOverride() {
		return TaggedUnionUtils.get(this, STEMMER_OVERRIDE);
	}

	/**
	 * Get the {@code stemmer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stemmer} kind.
	 */
	public StemmerTokenFilter stemmer() {
		return TaggedUnionUtils.get(this, STEMMER);
	}

	/**
	 * Get the {@code stop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stop} kind.
	 */
	public StopTokenFilter stop() {
		return TaggedUnionUtils.get(this, STOP);
	}

	/**
	 * Get the {@code synonym_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code synonym_graph} kind.
	 */
	public SynonymGraphTokenFilter synonymGraph() {
		return TaggedUnionUtils.get(this, SYNONYM_GRAPH);
	}

	/**
	 * Get the {@code synonym} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code synonym} kind.
	 */
	public SynonymTokenFilter synonym() {
		return TaggedUnionUtils.get(this, SYNONYM);
	}

	/**
	 * Get the {@code trim} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trim} kind.
	 */
	public TrimTokenFilter trim() {
		return TaggedUnionUtils.get(this, TRIM);
	}

	/**
	 * Get the {@code truncate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code truncate} kind.
	 */
	public TruncateTokenFilter truncate() {
		return TaggedUnionUtils.get(this, TRUNCATE);
	}

	/**
	 * Get the {@code unique} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code unique} kind.
	 */
	public UniqueTokenFilter unique() {
		return TaggedUnionUtils.get(this, UNIQUE);
	}

	/**
	 * Get the {@code uppercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uppercase} kind.
	 */
	public UppercaseTokenFilter uppercase() {
		return TaggedUnionUtils.get(this, UPPERCASE);
	}

	/**
	 * Get the {@code word_delimiter_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code word_delimiter_graph}
	 *             kind.
	 */
	public WordDelimiterGraphTokenFilter wordDelimiterGraph() {
		return TaggedUnionUtils.get(this, WORD_DELIMITER_GRAPH);
	}

	/**
	 * Get the {@code word_delimiter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code word_delimiter} kind.
	 */
	public WordDelimiterTokenFilter wordDelimiter() {
		return TaggedUnionUtils.get(this, WORD_DELIMITER);
	}

	/**
	 * Get the {@code kuromoji_stemmer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_stemmer}
	 *             kind.
	 */
	public KuromojiStemmerTokenFilter kuromojiStemmer() {
		return TaggedUnionUtils.get(this, KUROMOJI_STEMMER);
	}

	/**
	 * Get the {@code kuromoji_readingform} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_readingform}
	 *             kind.
	 */
	public KuromojiReadingFormTokenFilter kuromojiReadingform() {
		return TaggedUnionUtils.get(this, KUROMOJI_READINGFORM);
	}

	/**
	 * Get the {@code kuromoji_part_of_speech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code kuromoji_part_of_speech} kind.
	 */
	public KuromojiPartOfSpeechTokenFilter kuromojiPartOfSpeech() {
		return TaggedUnionUtils.get(this, KUROMOJI_PART_OF_SPEECH);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		_value.serialize(generator, mapper);

	}

	public static class Builder {
		private String _type;
		private JsonpSerializable _value;

		public ObjectBuilder<TokenFilter> asciifolding(AsciiFoldingTokenFilter v) {
			this._type = ASCIIFOLDING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> asciifolding(
				Function<AsciiFoldingTokenFilter.Builder, ObjectBuilder<AsciiFoldingTokenFilter>> f) {
			return this.asciifolding(f.apply(new AsciiFoldingTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> commonGrams(CommonGramsTokenFilter v) {
			this._type = COMMON_GRAMS;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> commonGrams(
				Function<CommonGramsTokenFilter.Builder, ObjectBuilder<CommonGramsTokenFilter>> f) {
			return this.commonGrams(f.apply(new CommonGramsTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> condition(ConditionTokenFilter v) {
			this._type = CONDITION;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> condition(
				Function<ConditionTokenFilter.Builder, ObjectBuilder<ConditionTokenFilter>> f) {
			return this.condition(f.apply(new ConditionTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> delimitedPayload(DelimitedPayloadTokenFilter v) {
			this._type = DELIMITED_PAYLOAD;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> delimitedPayload(
				Function<DelimitedPayloadTokenFilter.Builder, ObjectBuilder<DelimitedPayloadTokenFilter>> f) {
			return this.delimitedPayload(f.apply(new DelimitedPayloadTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> edgeNgram(EdgeNGramTokenFilter v) {
			this._type = EDGE_NGRAM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> edgeNgram(
				Function<EdgeNGramTokenFilter.Builder, ObjectBuilder<EdgeNGramTokenFilter>> f) {
			return this.edgeNgram(f.apply(new EdgeNGramTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> elision(ElisionTokenFilter v) {
			this._type = ELISION;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> elision(
				Function<ElisionTokenFilter.Builder, ObjectBuilder<ElisionTokenFilter>> f) {
			return this.elision(f.apply(new ElisionTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> fingerprint(FingerprintTokenFilter v) {
			this._type = FINGERPRINT;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> fingerprint(
				Function<FingerprintTokenFilter.Builder, ObjectBuilder<FingerprintTokenFilter>> f) {
			return this.fingerprint(f.apply(new FingerprintTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> hunspell(HunspellTokenFilter v) {
			this._type = HUNSPELL;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> hunspell(
				Function<HunspellTokenFilter.Builder, ObjectBuilder<HunspellTokenFilter>> f) {
			return this.hunspell(f.apply(new HunspellTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> hyphenationDecompounder(HyphenationDecompounderTokenFilter v) {
			this._type = HYPHENATION_DECOMPOUNDER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> hyphenationDecompounder(
				Function<HyphenationDecompounderTokenFilter.Builder, ObjectBuilder<HyphenationDecompounderTokenFilter>> f) {
			return this.hyphenationDecompounder(f.apply(new HyphenationDecompounderTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> keepTypes(KeepTypesTokenFilter v) {
			this._type = KEEP_TYPES;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> keepTypes(
				Function<KeepTypesTokenFilter.Builder, ObjectBuilder<KeepTypesTokenFilter>> f) {
			return this.keepTypes(f.apply(new KeepTypesTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> keep(KeepWordsTokenFilter v) {
			this._type = KEEP;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> keep(
				Function<KeepWordsTokenFilter.Builder, ObjectBuilder<KeepWordsTokenFilter>> f) {
			return this.keep(f.apply(new KeepWordsTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> keywordMarker(KeywordMarkerTokenFilter v) {
			this._type = KEYWORD_MARKER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> keywordMarker(
				Function<KeywordMarkerTokenFilter.Builder, ObjectBuilder<KeywordMarkerTokenFilter>> f) {
			return this.keywordMarker(f.apply(new KeywordMarkerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> kstem(KStemTokenFilter v) {
			this._type = KSTEM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> kstem(Function<KStemTokenFilter.Builder, ObjectBuilder<KStemTokenFilter>> f) {
			return this.kstem(f.apply(new KStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> length(LengthTokenFilter v) {
			this._type = LENGTH;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> length(
				Function<LengthTokenFilter.Builder, ObjectBuilder<LengthTokenFilter>> f) {
			return this.length(f.apply(new LengthTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> limit(LimitTokenCountTokenFilter v) {
			this._type = LIMIT;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> limit(
				Function<LimitTokenCountTokenFilter.Builder, ObjectBuilder<LimitTokenCountTokenFilter>> f) {
			return this.limit(f.apply(new LimitTokenCountTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> lowercase(LowercaseTokenFilter v) {
			this._type = LOWERCASE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> lowercase(
				Function<LowercaseTokenFilter.Builder, ObjectBuilder<LowercaseTokenFilter>> f) {
			return this.lowercase(f.apply(new LowercaseTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> multiplexer(MultiplexerTokenFilter v) {
			this._type = MULTIPLEXER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> multiplexer(
				Function<MultiplexerTokenFilter.Builder, ObjectBuilder<MultiplexerTokenFilter>> f) {
			return this.multiplexer(f.apply(new MultiplexerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> ngram(NGramTokenFilter v) {
			this._type = NGRAM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> ngram(Function<NGramTokenFilter.Builder, ObjectBuilder<NGramTokenFilter>> f) {
			return this.ngram(f.apply(new NGramTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> noriPartOfSpeech(NoriPartOfSpeechTokenFilter v) {
			this._type = NORI_PART_OF_SPEECH;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> noriPartOfSpeech(
				Function<NoriPartOfSpeechTokenFilter.Builder, ObjectBuilder<NoriPartOfSpeechTokenFilter>> f) {
			return this.noriPartOfSpeech(f.apply(new NoriPartOfSpeechTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> patternCapture(PatternCaptureTokenFilter v) {
			this._type = PATTERN_CAPTURE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> patternCapture(
				Function<PatternCaptureTokenFilter.Builder, ObjectBuilder<PatternCaptureTokenFilter>> f) {
			return this.patternCapture(f.apply(new PatternCaptureTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> patternReplace(PatternReplaceTokenFilter v) {
			this._type = PATTERN_REPLACE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> patternReplace(
				Function<PatternReplaceTokenFilter.Builder, ObjectBuilder<PatternReplaceTokenFilter>> f) {
			return this.patternReplace(f.apply(new PatternReplaceTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> porterStem(PorterStemTokenFilter v) {
			this._type = PORTER_STEM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> porterStem(
				Function<PorterStemTokenFilter.Builder, ObjectBuilder<PorterStemTokenFilter>> f) {
			return this.porterStem(f.apply(new PorterStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> predicateTokenFilter(PredicateTokenFilter v) {
			this._type = PREDICATE_TOKEN_FILTER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> predicateTokenFilter(
				Function<PredicateTokenFilter.Builder, ObjectBuilder<PredicateTokenFilter>> f) {
			return this.predicateTokenFilter(f.apply(new PredicateTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> removeDuplicates(RemoveDuplicatesTokenFilter v) {
			this._type = REMOVE_DUPLICATES;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> removeDuplicates(
				Function<RemoveDuplicatesTokenFilter.Builder, ObjectBuilder<RemoveDuplicatesTokenFilter>> f) {
			return this.removeDuplicates(f.apply(new RemoveDuplicatesTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> reverse(ReverseTokenFilter v) {
			this._type = REVERSE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> reverse(
				Function<ReverseTokenFilter.Builder, ObjectBuilder<ReverseTokenFilter>> f) {
			return this.reverse(f.apply(new ReverseTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> shingle(ShingleTokenFilter v) {
			this._type = SHINGLE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> shingle(
				Function<ShingleTokenFilter.Builder, ObjectBuilder<ShingleTokenFilter>> f) {
			return this.shingle(f.apply(new ShingleTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> snowball(SnowballTokenFilter v) {
			this._type = SNOWBALL;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> snowball(
				Function<SnowballTokenFilter.Builder, ObjectBuilder<SnowballTokenFilter>> f) {
			return this.snowball(f.apply(new SnowballTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> stemmerOverride(StemmerOverrideTokenFilter v) {
			this._type = STEMMER_OVERRIDE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> stemmerOverride(
				Function<StemmerOverrideTokenFilter.Builder, ObjectBuilder<StemmerOverrideTokenFilter>> f) {
			return this.stemmerOverride(f.apply(new StemmerOverrideTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> stemmer(StemmerTokenFilter v) {
			this._type = STEMMER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> stemmer(
				Function<StemmerTokenFilter.Builder, ObjectBuilder<StemmerTokenFilter>> f) {
			return this.stemmer(f.apply(new StemmerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> stop(StopTokenFilter v) {
			this._type = STOP;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> stop(Function<StopTokenFilter.Builder, ObjectBuilder<StopTokenFilter>> f) {
			return this.stop(f.apply(new StopTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> synonymGraph(SynonymGraphTokenFilter v) {
			this._type = SYNONYM_GRAPH;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> synonymGraph(
				Function<SynonymGraphTokenFilter.Builder, ObjectBuilder<SynonymGraphTokenFilter>> f) {
			return this.synonymGraph(f.apply(new SynonymGraphTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> synonym(SynonymTokenFilter v) {
			this._type = SYNONYM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> synonym(
				Function<SynonymTokenFilter.Builder, ObjectBuilder<SynonymTokenFilter>> f) {
			return this.synonym(f.apply(new SynonymTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> trim(TrimTokenFilter v) {
			this._type = TRIM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> trim(Function<TrimTokenFilter.Builder, ObjectBuilder<TrimTokenFilter>> f) {
			return this.trim(f.apply(new TrimTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> truncate(TruncateTokenFilter v) {
			this._type = TRUNCATE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> truncate(
				Function<TruncateTokenFilter.Builder, ObjectBuilder<TruncateTokenFilter>> f) {
			return this.truncate(f.apply(new TruncateTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> unique(UniqueTokenFilter v) {
			this._type = UNIQUE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> unique(
				Function<UniqueTokenFilter.Builder, ObjectBuilder<UniqueTokenFilter>> f) {
			return this.unique(f.apply(new UniqueTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> uppercase(UppercaseTokenFilter v) {
			this._type = UPPERCASE;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> uppercase(
				Function<UppercaseTokenFilter.Builder, ObjectBuilder<UppercaseTokenFilter>> f) {
			return this.uppercase(f.apply(new UppercaseTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> wordDelimiterGraph(WordDelimiterGraphTokenFilter v) {
			this._type = WORD_DELIMITER_GRAPH;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> wordDelimiterGraph(
				Function<WordDelimiterGraphTokenFilter.Builder, ObjectBuilder<WordDelimiterGraphTokenFilter>> f) {
			return this.wordDelimiterGraph(f.apply(new WordDelimiterGraphTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> wordDelimiter(WordDelimiterTokenFilter v) {
			this._type = WORD_DELIMITER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> wordDelimiter(
				Function<WordDelimiterTokenFilter.Builder, ObjectBuilder<WordDelimiterTokenFilter>> f) {
			return this.wordDelimiter(f.apply(new WordDelimiterTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> kuromojiStemmer(KuromojiStemmerTokenFilter v) {
			this._type = KUROMOJI_STEMMER;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> kuromojiStemmer(
				Function<KuromojiStemmerTokenFilter.Builder, ObjectBuilder<KuromojiStemmerTokenFilter>> f) {
			return this.kuromojiStemmer(f.apply(new KuromojiStemmerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> kuromojiReadingform(KuromojiReadingFormTokenFilter v) {
			this._type = KUROMOJI_READINGFORM;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> kuromojiReadingform(
				Function<KuromojiReadingFormTokenFilter.Builder, ObjectBuilder<KuromojiReadingFormTokenFilter>> f) {
			return this.kuromojiReadingform(f.apply(new KuromojiReadingFormTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> kuromojiPartOfSpeech(KuromojiPartOfSpeechTokenFilter v) {
			this._type = KUROMOJI_PART_OF_SPEECH;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TokenFilter> kuromojiPartOfSpeech(
				Function<KuromojiPartOfSpeechTokenFilter.Builder, ObjectBuilder<KuromojiPartOfSpeechTokenFilter>> f) {
			return this.kuromojiPartOfSpeech(f.apply(new KuromojiPartOfSpeechTokenFilter.Builder()).build());
		}

		protected TokenFilter build() {
			return new TokenFilter(this);
		}

	}

	protected static void setupTokenFilterDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::asciifolding, AsciiFoldingTokenFilter._DESERIALIZER, "asciifolding");
		op.add(Builder::commonGrams, CommonGramsTokenFilter._DESERIALIZER, "common_grams");
		op.add(Builder::condition, ConditionTokenFilter._DESERIALIZER, "condition");
		op.add(Builder::delimitedPayload, DelimitedPayloadTokenFilter._DESERIALIZER, "delimited_payload");
		op.add(Builder::edgeNgram, EdgeNGramTokenFilter._DESERIALIZER, "edge_ngram");
		op.add(Builder::elision, ElisionTokenFilter._DESERIALIZER, "elision");
		op.add(Builder::fingerprint, FingerprintTokenFilter._DESERIALIZER, "fingerprint");
		op.add(Builder::hunspell, HunspellTokenFilter._DESERIALIZER, "hunspell");
		op.add(Builder::hyphenationDecompounder, HyphenationDecompounderTokenFilter._DESERIALIZER,
				"hyphenation_decompounder");
		op.add(Builder::keepTypes, KeepTypesTokenFilter._DESERIALIZER, "keep_types");
		op.add(Builder::keep, KeepWordsTokenFilter._DESERIALIZER, "keep");
		op.add(Builder::keywordMarker, KeywordMarkerTokenFilter._DESERIALIZER, "keyword_marker");
		op.add(Builder::kstem, KStemTokenFilter._DESERIALIZER, "kstem");
		op.add(Builder::length, LengthTokenFilter._DESERIALIZER, "length");
		op.add(Builder::limit, LimitTokenCountTokenFilter._DESERIALIZER, "limit");
		op.add(Builder::lowercase, LowercaseTokenFilter._DESERIALIZER, "lowercase");
		op.add(Builder::multiplexer, MultiplexerTokenFilter._DESERIALIZER, "multiplexer");
		op.add(Builder::ngram, NGramTokenFilter._DESERIALIZER, "ngram");
		op.add(Builder::noriPartOfSpeech, NoriPartOfSpeechTokenFilter._DESERIALIZER, "nori_part_of_speech");
		op.add(Builder::patternCapture, PatternCaptureTokenFilter._DESERIALIZER, "pattern_capture");
		op.add(Builder::patternReplace, PatternReplaceTokenFilter._DESERIALIZER, "pattern_replace");
		op.add(Builder::porterStem, PorterStemTokenFilter._DESERIALIZER, "porter_stem");
		op.add(Builder::predicateTokenFilter, PredicateTokenFilter._DESERIALIZER, "predicate_token_filter");
		op.add(Builder::removeDuplicates, RemoveDuplicatesTokenFilter._DESERIALIZER, "remove_duplicates");
		op.add(Builder::reverse, ReverseTokenFilter._DESERIALIZER, "reverse");
		op.add(Builder::shingle, ShingleTokenFilter._DESERIALIZER, "shingle");
		op.add(Builder::snowball, SnowballTokenFilter._DESERIALIZER, "snowball");
		op.add(Builder::stemmerOverride, StemmerOverrideTokenFilter._DESERIALIZER, "stemmer_override");
		op.add(Builder::stemmer, StemmerTokenFilter._DESERIALIZER, "stemmer");
		op.add(Builder::stop, StopTokenFilter._DESERIALIZER, "stop");
		op.add(Builder::synonymGraph, SynonymGraphTokenFilter._DESERIALIZER, "synonym_graph");
		op.add(Builder::synonym, SynonymTokenFilter._DESERIALIZER, "synonym");
		op.add(Builder::trim, TrimTokenFilter._DESERIALIZER, "trim");
		op.add(Builder::truncate, TruncateTokenFilter._DESERIALIZER, "truncate");
		op.add(Builder::unique, UniqueTokenFilter._DESERIALIZER, "unique");
		op.add(Builder::uppercase, UppercaseTokenFilter._DESERIALIZER, "uppercase");
		op.add(Builder::wordDelimiterGraph, WordDelimiterGraphTokenFilter._DESERIALIZER, "word_delimiter_graph");
		op.add(Builder::wordDelimiter, WordDelimiterTokenFilter._DESERIALIZER, "word_delimiter");
		op.add(Builder::kuromojiStemmer, KuromojiStemmerTokenFilter._DESERIALIZER, "kuromoji_stemmer");
		op.add(Builder::kuromojiReadingform, KuromojiReadingFormTokenFilter._DESERIALIZER, "kuromoji_readingform");
		op.add(Builder::kuromojiPartOfSpeech, KuromojiPartOfSpeechTokenFilter._DESERIALIZER, "kuromoji_part_of_speech");

		op.setTypeProperty("type");
	}

	public static final JsonpDeserializer<TokenFilter> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			TokenFilter::setupTokenFilterDeserializer, Builder::build);
}
