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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
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

// typedef: _types.analysis.TokenFilterDefinition

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.TokenFilterDefinition">API
 *      specification</a>
 */
@JsonpDeserializable
public class TokenFilterDefinition implements OpenTaggedUnion<TokenFilterDefinition.Kind, Object>, JsonpSerializable {

	/**
	 * {@link TokenFilterDefinition} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.analysis.TokenFilterDefinition">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Apostrophe("apostrophe"),

		ArabicNormalization("arabic_normalization"),

		ArabicStem("arabic_stem"),

		Asciifolding("asciifolding"),

		BengaliNormalization("bengali_normalization"),

		BrazilianStem("brazilian_stem"),

		CjkBigram("cjk_bigram"),

		CjkWidth("cjk_width"),

		Classic("classic"),

		CommonGrams("common_grams"),

		Condition("condition"),

		CzechStem("czech_stem"),

		DecimalDigit("decimal_digit"),

		DelimitedPayload("delimited_payload"),

		DictionaryDecompounder("dictionary_decompounder"),

		DutchStem("dutch_stem"),

		EdgeNgram("edge_ngram"),

		Elision("elision"),

		Fingerprint("fingerprint"),

		FlattenGraph("flatten_graph"),

		FrenchStem("french_stem"),

		GermanNormalization("german_normalization"),

		GermanStem("german_stem"),

		HindiNormalization("hindi_normalization"),

		Hunspell("hunspell"),

		HyphenationDecompounder("hyphenation_decompounder"),

		IcuCollation("icu_collation"),

		IcuFolding("icu_folding"),

		IcuNormalizer("icu_normalizer"),

		IcuTransform("icu_transform"),

		IndicNormalization("indic_normalization"),

		JaStop("ja_stop"),

		Kstem("kstem"),

		KeepTypes("keep_types"),

		Keep("keep"),

		KeywordMarker("keyword_marker"),

		KeywordRepeat("keyword_repeat"),

		KuromojiPartOfSpeech("kuromoji_part_of_speech"),

		KuromojiReadingform("kuromoji_readingform"),

		KuromojiStemmer("kuromoji_stemmer"),

		Length("length"),

		Limit("limit"),

		Lowercase("lowercase"),

		MinHash("min_hash"),

		Multiplexer("multiplexer"),

		Ngram("ngram"),

		NoriPartOfSpeech("nori_part_of_speech"),

		PatternCapture("pattern_capture"),

		PatternReplace("pattern_replace"),

		PersianNormalization("persian_normalization"),

		PersianStem("persian_stem"),

		Phonetic("phonetic"),

		PorterStem("porter_stem"),

		PredicateTokenFilter("predicate_token_filter"),

		RemoveDuplicates("remove_duplicates"),

		Reverse("reverse"),

		RussianStem("russian_stem"),

		ScandinavianFolding("scandinavian_folding"),

		ScandinavianNormalization("scandinavian_normalization"),

		SerbianNormalization("serbian_normalization"),

		Shingle("shingle"),

		Snowball("snowball"),

		SoraniNormalization("sorani_normalization"),

		StemmerOverride("stemmer_override"),

		Stemmer("stemmer"),

		Stop("stop"),

		SynonymGraph("synonym_graph"),

		Synonym("synonym"),

		Trim("trim"),

		Truncate("truncate"),

		Unique("unique"),

		Uppercase("uppercase"),

		WordDelimiterGraph("word_delimiter_graph"),

		WordDelimiter("word_delimiter"),

		/** A custom {@code TokenFilterDefinition} defined by a plugin */
		_Custom(null)

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public TokenFilterDefinition(TokenFilterDefinitionVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._tokenFilterDefinitionKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private TokenFilterDefinition(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static TokenFilterDefinition of(Function<Builder, ObjectBuilder<TokenFilterDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code TokenFilterDefinition}, given its kind
	 * and some JSON data
	 */
	public TokenFilterDefinition(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
	}

	/**
	 * Is this variant instance of kind {@code apostrophe}?
	 */
	public boolean isApostrophe() {
		return _kind == Kind.Apostrophe;
	}

	/**
	 * Get the {@code apostrophe} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code apostrophe} kind.
	 */
	public ApostropheTokenFilter apostrophe() {
		return TaggedUnionUtils.get(this, Kind.Apostrophe);
	}

	/**
	 * Is this variant instance of kind {@code arabic_normalization}?
	 */
	public boolean isArabicNormalization() {
		return _kind == Kind.ArabicNormalization;
	}

	/**
	 * Get the {@code arabic_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code arabic_normalization}
	 *             kind.
	 */
	public ArabicNormalizationTokenFilter arabicNormalization() {
		return TaggedUnionUtils.get(this, Kind.ArabicNormalization);
	}

	/**
	 * Is this variant instance of kind {@code arabic_stem}?
	 */
	public boolean isArabicStem() {
		return _kind == Kind.ArabicStem;
	}

	/**
	 * Get the {@code arabic_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code arabic_stem} kind.
	 */
	public ArabicStemTokenFilter arabicStem() {
		return TaggedUnionUtils.get(this, Kind.ArabicStem);
	}

	/**
	 * Is this variant instance of kind {@code asciifolding}?
	 */
	public boolean isAsciifolding() {
		return _kind == Kind.Asciifolding;
	}

	/**
	 * Get the {@code asciifolding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code asciifolding} kind.
	 */
	public AsciiFoldingTokenFilter asciifolding() {
		return TaggedUnionUtils.get(this, Kind.Asciifolding);
	}

	/**
	 * Is this variant instance of kind {@code bengali_normalization}?
	 */
	public boolean isBengaliNormalization() {
		return _kind == Kind.BengaliNormalization;
	}

	/**
	 * Get the {@code bengali_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code bengali_normalization} kind.
	 */
	public BengaliNormalizationTokenFilter bengaliNormalization() {
		return TaggedUnionUtils.get(this, Kind.BengaliNormalization);
	}

	/**
	 * Is this variant instance of kind {@code brazilian_stem}?
	 */
	public boolean isBrazilianStem() {
		return _kind == Kind.BrazilianStem;
	}

	/**
	 * Get the {@code brazilian_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code brazilian_stem} kind.
	 */
	public BrazilianStemTokenFilter brazilianStem() {
		return TaggedUnionUtils.get(this, Kind.BrazilianStem);
	}

	/**
	 * Is this variant instance of kind {@code cjk_bigram}?
	 */
	public boolean isCjkBigram() {
		return _kind == Kind.CjkBigram;
	}

	/**
	 * Get the {@code cjk_bigram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cjk_bigram} kind.
	 */
	public CjkBigramTokenFilter cjkBigram() {
		return TaggedUnionUtils.get(this, Kind.CjkBigram);
	}

	/**
	 * Is this variant instance of kind {@code cjk_width}?
	 */
	public boolean isCjkWidth() {
		return _kind == Kind.CjkWidth;
	}

	/**
	 * Get the {@code cjk_width} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cjk_width} kind.
	 */
	public CjkWidthTokenFilter cjkWidth() {
		return TaggedUnionUtils.get(this, Kind.CjkWidth);
	}

	/**
	 * Is this variant instance of kind {@code classic}?
	 */
	public boolean isClassic() {
		return _kind == Kind.Classic;
	}

	/**
	 * Get the {@code classic} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classic} kind.
	 */
	public ClassicTokenFilter classic() {
		return TaggedUnionUtils.get(this, Kind.Classic);
	}

	/**
	 * Is this variant instance of kind {@code common_grams}?
	 */
	public boolean isCommonGrams() {
		return _kind == Kind.CommonGrams;
	}

	/**
	 * Get the {@code common_grams} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code common_grams} kind.
	 */
	public CommonGramsTokenFilter commonGrams() {
		return TaggedUnionUtils.get(this, Kind.CommonGrams);
	}

	/**
	 * Is this variant instance of kind {@code condition}?
	 */
	public boolean isCondition() {
		return _kind == Kind.Condition;
	}

	/**
	 * Get the {@code condition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code condition} kind.
	 */
	public ConditionTokenFilter condition() {
		return TaggedUnionUtils.get(this, Kind.Condition);
	}

	/**
	 * Is this variant instance of kind {@code czech_stem}?
	 */
	public boolean isCzechStem() {
		return _kind == Kind.CzechStem;
	}

	/**
	 * Get the {@code czech_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code czech_stem} kind.
	 */
	public CzechStemTokenFilter czechStem() {
		return TaggedUnionUtils.get(this, Kind.CzechStem);
	}

	/**
	 * Is this variant instance of kind {@code decimal_digit}?
	 */
	public boolean isDecimalDigit() {
		return _kind == Kind.DecimalDigit;
	}

	/**
	 * Get the {@code decimal_digit} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code decimal_digit} kind.
	 */
	public DecimalDigitTokenFilter decimalDigit() {
		return TaggedUnionUtils.get(this, Kind.DecimalDigit);
	}

	/**
	 * Is this variant instance of kind {@code delimited_payload}?
	 */
	public boolean isDelimitedPayload() {
		return _kind == Kind.DelimitedPayload;
	}

	/**
	 * Get the {@code delimited_payload} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delimited_payload}
	 *             kind.
	 */
	public DelimitedPayloadTokenFilter delimitedPayload() {
		return TaggedUnionUtils.get(this, Kind.DelimitedPayload);
	}

	/**
	 * Is this variant instance of kind {@code dictionary_decompounder}?
	 */
	public boolean isDictionaryDecompounder() {
		return _kind == Kind.DictionaryDecompounder;
	}

	/**
	 * Get the {@code dictionary_decompounder} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code dictionary_decompounder} kind.
	 */
	public DictionaryDecompounderTokenFilter dictionaryDecompounder() {
		return TaggedUnionUtils.get(this, Kind.DictionaryDecompounder);
	}

	/**
	 * Is this variant instance of kind {@code dutch_stem}?
	 */
	public boolean isDutchStem() {
		return _kind == Kind.DutchStem;
	}

	/**
	 * Get the {@code dutch_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dutch_stem} kind.
	 */
	public DutchStemTokenFilter dutchStem() {
		return TaggedUnionUtils.get(this, Kind.DutchStem);
	}

	/**
	 * Is this variant instance of kind {@code edge_ngram}?
	 */
	public boolean isEdgeNgram() {
		return _kind == Kind.EdgeNgram;
	}

	/**
	 * Get the {@code edge_ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code edge_ngram} kind.
	 */
	public EdgeNGramTokenFilter edgeNgram() {
		return TaggedUnionUtils.get(this, Kind.EdgeNgram);
	}

	/**
	 * Is this variant instance of kind {@code elision}?
	 */
	public boolean isElision() {
		return _kind == Kind.Elision;
	}

	/**
	 * Get the {@code elision} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code elision} kind.
	 */
	public ElisionTokenFilter elision() {
		return TaggedUnionUtils.get(this, Kind.Elision);
	}

	/**
	 * Is this variant instance of kind {@code fingerprint}?
	 */
	public boolean isFingerprint() {
		return _kind == Kind.Fingerprint;
	}

	/**
	 * Get the {@code fingerprint} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fingerprint} kind.
	 */
	public FingerprintTokenFilter fingerprint() {
		return TaggedUnionUtils.get(this, Kind.Fingerprint);
	}

	/**
	 * Is this variant instance of kind {@code flatten_graph}?
	 */
	public boolean isFlattenGraph() {
		return _kind == Kind.FlattenGraph;
	}

	/**
	 * Get the {@code flatten_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code flatten_graph} kind.
	 */
	public FlattenGraphTokenFilter flattenGraph() {
		return TaggedUnionUtils.get(this, Kind.FlattenGraph);
	}

	/**
	 * Is this variant instance of kind {@code french_stem}?
	 */
	public boolean isFrenchStem() {
		return _kind == Kind.FrenchStem;
	}

	/**
	 * Get the {@code french_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code french_stem} kind.
	 */
	public FrenchStemTokenFilter frenchStem() {
		return TaggedUnionUtils.get(this, Kind.FrenchStem);
	}

	/**
	 * Is this variant instance of kind {@code german_normalization}?
	 */
	public boolean isGermanNormalization() {
		return _kind == Kind.GermanNormalization;
	}

	/**
	 * Get the {@code german_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code german_normalization}
	 *             kind.
	 */
	public GermanNormalizationTokenFilter germanNormalization() {
		return TaggedUnionUtils.get(this, Kind.GermanNormalization);
	}

	/**
	 * Is this variant instance of kind {@code german_stem}?
	 */
	public boolean isGermanStem() {
		return _kind == Kind.GermanStem;
	}

	/**
	 * Get the {@code german_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code german_stem} kind.
	 */
	public GermanStemTokenFilter germanStem() {
		return TaggedUnionUtils.get(this, Kind.GermanStem);
	}

	/**
	 * Is this variant instance of kind {@code hindi_normalization}?
	 */
	public boolean isHindiNormalization() {
		return _kind == Kind.HindiNormalization;
	}

	/**
	 * Get the {@code hindi_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hindi_normalization}
	 *             kind.
	 */
	public HindiNormalizationTokenFilter hindiNormalization() {
		return TaggedUnionUtils.get(this, Kind.HindiNormalization);
	}

	/**
	 * Is this variant instance of kind {@code hunspell}?
	 */
	public boolean isHunspell() {
		return _kind == Kind.Hunspell;
	}

	/**
	 * Get the {@code hunspell} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hunspell} kind.
	 */
	public HunspellTokenFilter hunspell() {
		return TaggedUnionUtils.get(this, Kind.Hunspell);
	}

	/**
	 * Is this variant instance of kind {@code hyphenation_decompounder}?
	 */
	public boolean isHyphenationDecompounder() {
		return _kind == Kind.HyphenationDecompounder;
	}

	/**
	 * Get the {@code hyphenation_decompounder} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code hyphenation_decompounder} kind.
	 */
	public HyphenationDecompounderTokenFilter hyphenationDecompounder() {
		return TaggedUnionUtils.get(this, Kind.HyphenationDecompounder);
	}

	/**
	 * Is this variant instance of kind {@code icu_collation}?
	 */
	public boolean isIcuCollation() {
		return _kind == Kind.IcuCollation;
	}

	/**
	 * Get the {@code icu_collation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_collation} kind.
	 */
	public IcuCollationTokenFilter icuCollation() {
		return TaggedUnionUtils.get(this, Kind.IcuCollation);
	}

	/**
	 * Is this variant instance of kind {@code icu_folding}?
	 */
	public boolean isIcuFolding() {
		return _kind == Kind.IcuFolding;
	}

	/**
	 * Get the {@code icu_folding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_folding} kind.
	 */
	public IcuFoldingTokenFilter icuFolding() {
		return TaggedUnionUtils.get(this, Kind.IcuFolding);
	}

	/**
	 * Is this variant instance of kind {@code icu_normalizer}?
	 */
	public boolean isIcuNormalizer() {
		return _kind == Kind.IcuNormalizer;
	}

	/**
	 * Get the {@code icu_normalizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_normalizer} kind.
	 */
	public IcuNormalizationTokenFilter icuNormalizer() {
		return TaggedUnionUtils.get(this, Kind.IcuNormalizer);
	}

	/**
	 * Is this variant instance of kind {@code icu_transform}?
	 */
	public boolean isIcuTransform() {
		return _kind == Kind.IcuTransform;
	}

	/**
	 * Get the {@code icu_transform} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_transform} kind.
	 */
	public IcuTransformTokenFilter icuTransform() {
		return TaggedUnionUtils.get(this, Kind.IcuTransform);
	}

	/**
	 * Is this variant instance of kind {@code indic_normalization}?
	 */
	public boolean isIndicNormalization() {
		return _kind == Kind.IndicNormalization;
	}

	/**
	 * Get the {@code indic_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code indic_normalization}
	 *             kind.
	 */
	public IndicNormalizationTokenFilter indicNormalization() {
		return TaggedUnionUtils.get(this, Kind.IndicNormalization);
	}

	/**
	 * Is this variant instance of kind {@code ja_stop}?
	 */
	public boolean isJaStop() {
		return _kind == Kind.JaStop;
	}

	/**
	 * Get the {@code ja_stop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ja_stop} kind.
	 */
	public JaStopTokenFilter jaStop() {
		return TaggedUnionUtils.get(this, Kind.JaStop);
	}

	/**
	 * Is this variant instance of kind {@code kstem}?
	 */
	public boolean isKstem() {
		return _kind == Kind.Kstem;
	}

	/**
	 * Get the {@code kstem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kstem} kind.
	 */
	public KStemTokenFilter kstem() {
		return TaggedUnionUtils.get(this, Kind.Kstem);
	}

	/**
	 * Is this variant instance of kind {@code keep_types}?
	 */
	public boolean isKeepTypes() {
		return _kind == Kind.KeepTypes;
	}

	/**
	 * Get the {@code keep_types} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keep_types} kind.
	 */
	public KeepTypesTokenFilter keepTypes() {
		return TaggedUnionUtils.get(this, Kind.KeepTypes);
	}

	/**
	 * Is this variant instance of kind {@code keep}?
	 */
	public boolean isKeep() {
		return _kind == Kind.Keep;
	}

	/**
	 * Get the {@code keep} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keep} kind.
	 */
	public KeepWordsTokenFilter keep() {
		return TaggedUnionUtils.get(this, Kind.Keep);
	}

	/**
	 * Is this variant instance of kind {@code keyword_marker}?
	 */
	public boolean isKeywordMarker() {
		return _kind == Kind.KeywordMarker;
	}

	/**
	 * Get the {@code keyword_marker} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword_marker} kind.
	 */
	public KeywordMarkerTokenFilter keywordMarker() {
		return TaggedUnionUtils.get(this, Kind.KeywordMarker);
	}

	/**
	 * Is this variant instance of kind {@code keyword_repeat}?
	 */
	public boolean isKeywordRepeat() {
		return _kind == Kind.KeywordRepeat;
	}

	/**
	 * Get the {@code keyword_repeat} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword_repeat} kind.
	 */
	public KeywordRepeatTokenFilter keywordRepeat() {
		return TaggedUnionUtils.get(this, Kind.KeywordRepeat);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_part_of_speech}?
	 */
	public boolean isKuromojiPartOfSpeech() {
		return _kind == Kind.KuromojiPartOfSpeech;
	}

	/**
	 * Get the {@code kuromoji_part_of_speech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code kuromoji_part_of_speech} kind.
	 */
	public KuromojiPartOfSpeechTokenFilter kuromojiPartOfSpeech() {
		return TaggedUnionUtils.get(this, Kind.KuromojiPartOfSpeech);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_readingform}?
	 */
	public boolean isKuromojiReadingform() {
		return _kind == Kind.KuromojiReadingform;
	}

	/**
	 * Get the {@code kuromoji_readingform} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_readingform}
	 *             kind.
	 */
	public KuromojiReadingFormTokenFilter kuromojiReadingform() {
		return TaggedUnionUtils.get(this, Kind.KuromojiReadingform);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_stemmer}?
	 */
	public boolean isKuromojiStemmer() {
		return _kind == Kind.KuromojiStemmer;
	}

	/**
	 * Get the {@code kuromoji_stemmer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_stemmer}
	 *             kind.
	 */
	public KuromojiStemmerTokenFilter kuromojiStemmer() {
		return TaggedUnionUtils.get(this, Kind.KuromojiStemmer);
	}

	/**
	 * Is this variant instance of kind {@code length}?
	 */
	public boolean isLength() {
		return _kind == Kind.Length;
	}

	/**
	 * Get the {@code length} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code length} kind.
	 */
	public LengthTokenFilter length() {
		return TaggedUnionUtils.get(this, Kind.Length);
	}

	/**
	 * Is this variant instance of kind {@code limit}?
	 */
	public boolean isLimit() {
		return _kind == Kind.Limit;
	}

	/**
	 * Get the {@code limit} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code limit} kind.
	 */
	public LimitTokenCountTokenFilter limit() {
		return TaggedUnionUtils.get(this, Kind.Limit);
	}

	/**
	 * Is this variant instance of kind {@code lowercase}?
	 */
	public boolean isLowercase() {
		return _kind == Kind.Lowercase;
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseTokenFilter lowercase() {
		return TaggedUnionUtils.get(this, Kind.Lowercase);
	}

	/**
	 * Is this variant instance of kind {@code min_hash}?
	 */
	public boolean isMinHash() {
		return _kind == Kind.MinHash;
	}

	/**
	 * Get the {@code min_hash} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code min_hash} kind.
	 */
	public MinHashTokenFilter minHash() {
		return TaggedUnionUtils.get(this, Kind.MinHash);
	}

	/**
	 * Is this variant instance of kind {@code multiplexer}?
	 */
	public boolean isMultiplexer() {
		return _kind == Kind.Multiplexer;
	}

	/**
	 * Get the {@code multiplexer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multiplexer} kind.
	 */
	public MultiplexerTokenFilter multiplexer() {
		return TaggedUnionUtils.get(this, Kind.Multiplexer);
	}

	/**
	 * Is this variant instance of kind {@code ngram}?
	 */
	public boolean isNgram() {
		return _kind == Kind.Ngram;
	}

	/**
	 * Get the {@code ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ngram} kind.
	 */
	public NGramTokenFilter ngram() {
		return TaggedUnionUtils.get(this, Kind.Ngram);
	}

	/**
	 * Is this variant instance of kind {@code nori_part_of_speech}?
	 */
	public boolean isNoriPartOfSpeech() {
		return _kind == Kind.NoriPartOfSpeech;
	}

	/**
	 * Get the {@code nori_part_of_speech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori_part_of_speech}
	 *             kind.
	 */
	public NoriPartOfSpeechTokenFilter noriPartOfSpeech() {
		return TaggedUnionUtils.get(this, Kind.NoriPartOfSpeech);
	}

	/**
	 * Is this variant instance of kind {@code pattern_capture}?
	 */
	public boolean isPatternCapture() {
		return _kind == Kind.PatternCapture;
	}

	/**
	 * Get the {@code pattern_capture} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_capture}
	 *             kind.
	 */
	public PatternCaptureTokenFilter patternCapture() {
		return TaggedUnionUtils.get(this, Kind.PatternCapture);
	}

	/**
	 * Is this variant instance of kind {@code pattern_replace}?
	 */
	public boolean isPatternReplace() {
		return _kind == Kind.PatternReplace;
	}

	/**
	 * Get the {@code pattern_replace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_replace}
	 *             kind.
	 */
	public PatternReplaceTokenFilter patternReplace() {
		return TaggedUnionUtils.get(this, Kind.PatternReplace);
	}

	/**
	 * Is this variant instance of kind {@code persian_normalization}?
	 */
	public boolean isPersianNormalization() {
		return _kind == Kind.PersianNormalization;
	}

	/**
	 * Get the {@code persian_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code persian_normalization} kind.
	 */
	public PersianNormalizationTokenFilter persianNormalization() {
		return TaggedUnionUtils.get(this, Kind.PersianNormalization);
	}

	/**
	 * Is this variant instance of kind {@code persian_stem}?
	 */
	public boolean isPersianStem() {
		return _kind == Kind.PersianStem;
	}

	/**
	 * Get the {@code persian_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code persian_stem} kind.
	 */
	public PersianStemTokenFilter persianStem() {
		return TaggedUnionUtils.get(this, Kind.PersianStem);
	}

	/**
	 * Is this variant instance of kind {@code phonetic}?
	 */
	public boolean isPhonetic() {
		return _kind == Kind.Phonetic;
	}

	/**
	 * Get the {@code phonetic} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phonetic} kind.
	 */
	public PhoneticTokenFilter phonetic() {
		return TaggedUnionUtils.get(this, Kind.Phonetic);
	}

	/**
	 * Is this variant instance of kind {@code porter_stem}?
	 */
	public boolean isPorterStem() {
		return _kind == Kind.PorterStem;
	}

	/**
	 * Get the {@code porter_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code porter_stem} kind.
	 */
	public PorterStemTokenFilter porterStem() {
		return TaggedUnionUtils.get(this, Kind.PorterStem);
	}

	/**
	 * Is this variant instance of kind {@code predicate_token_filter}?
	 */
	public boolean isPredicateTokenFilter() {
		return _kind == Kind.PredicateTokenFilter;
	}

	/**
	 * Get the {@code predicate_token_filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code predicate_token_filter} kind.
	 */
	public PredicateTokenFilter predicateTokenFilter() {
		return TaggedUnionUtils.get(this, Kind.PredicateTokenFilter);
	}

	/**
	 * Is this variant instance of kind {@code remove_duplicates}?
	 */
	public boolean isRemoveDuplicates() {
		return _kind == Kind.RemoveDuplicates;
	}

	/**
	 * Get the {@code remove_duplicates} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove_duplicates}
	 *             kind.
	 */
	public RemoveDuplicatesTokenFilter removeDuplicates() {
		return TaggedUnionUtils.get(this, Kind.RemoveDuplicates);
	}

	/**
	 * Is this variant instance of kind {@code reverse}?
	 */
	public boolean isReverse() {
		return _kind == Kind.Reverse;
	}

	/**
	 * Get the {@code reverse} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code reverse} kind.
	 */
	public ReverseTokenFilter reverse() {
		return TaggedUnionUtils.get(this, Kind.Reverse);
	}

	/**
	 * Is this variant instance of kind {@code russian_stem}?
	 */
	public boolean isRussianStem() {
		return _kind == Kind.RussianStem;
	}

	/**
	 * Get the {@code russian_stem} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code russian_stem} kind.
	 */
	public RussianStemTokenFilter russianStem() {
		return TaggedUnionUtils.get(this, Kind.RussianStem);
	}

	/**
	 * Is this variant instance of kind {@code scandinavian_folding}?
	 */
	public boolean isScandinavianFolding() {
		return _kind == Kind.ScandinavianFolding;
	}

	/**
	 * Get the {@code scandinavian_folding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code scandinavian_folding}
	 *             kind.
	 */
	public ScandinavianFoldingTokenFilter scandinavianFolding() {
		return TaggedUnionUtils.get(this, Kind.ScandinavianFolding);
	}

	/**
	 * Is this variant instance of kind {@code scandinavian_normalization}?
	 */
	public boolean isScandinavianNormalization() {
		return _kind == Kind.ScandinavianNormalization;
	}

	/**
	 * Get the {@code scandinavian_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code scandinavian_normalization} kind.
	 */
	public ScandinavianNormalizationTokenFilter scandinavianNormalization() {
		return TaggedUnionUtils.get(this, Kind.ScandinavianNormalization);
	}

	/**
	 * Is this variant instance of kind {@code serbian_normalization}?
	 */
	public boolean isSerbianNormalization() {
		return _kind == Kind.SerbianNormalization;
	}

	/**
	 * Get the {@code serbian_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code serbian_normalization} kind.
	 */
	public SerbianNormalizationTokenFilter serbianNormalization() {
		return TaggedUnionUtils.get(this, Kind.SerbianNormalization);
	}

	/**
	 * Is this variant instance of kind {@code shingle}?
	 */
	public boolean isShingle() {
		return _kind == Kind.Shingle;
	}

	/**
	 * Get the {@code shingle} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code shingle} kind.
	 */
	public ShingleTokenFilter shingle() {
		return TaggedUnionUtils.get(this, Kind.Shingle);
	}

	/**
	 * Is this variant instance of kind {@code snowball}?
	 */
	public boolean isSnowball() {
		return _kind == Kind.Snowball;
	}

	/**
	 * Get the {@code snowball} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code snowball} kind.
	 */
	public SnowballTokenFilter snowball() {
		return TaggedUnionUtils.get(this, Kind.Snowball);
	}

	/**
	 * Is this variant instance of kind {@code sorani_normalization}?
	 */
	public boolean isSoraniNormalization() {
		return _kind == Kind.SoraniNormalization;
	}

	/**
	 * Get the {@code sorani_normalization} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sorani_normalization}
	 *             kind.
	 */
	public SoraniNormalizationTokenFilter soraniNormalization() {
		return TaggedUnionUtils.get(this, Kind.SoraniNormalization);
	}

	/**
	 * Is this variant instance of kind {@code stemmer_override}?
	 */
	public boolean isStemmerOverride() {
		return _kind == Kind.StemmerOverride;
	}

	/**
	 * Get the {@code stemmer_override} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stemmer_override}
	 *             kind.
	 */
	public StemmerOverrideTokenFilter stemmerOverride() {
		return TaggedUnionUtils.get(this, Kind.StemmerOverride);
	}

	/**
	 * Is this variant instance of kind {@code stemmer}?
	 */
	public boolean isStemmer() {
		return _kind == Kind.Stemmer;
	}

	/**
	 * Get the {@code stemmer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stemmer} kind.
	 */
	public StemmerTokenFilter stemmer() {
		return TaggedUnionUtils.get(this, Kind.Stemmer);
	}

	/**
	 * Is this variant instance of kind {@code stop}?
	 */
	public boolean isStop() {
		return _kind == Kind.Stop;
	}

	/**
	 * Get the {@code stop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stop} kind.
	 */
	public StopTokenFilter stop() {
		return TaggedUnionUtils.get(this, Kind.Stop);
	}

	/**
	 * Is this variant instance of kind {@code synonym_graph}?
	 */
	public boolean isSynonymGraph() {
		return _kind == Kind.SynonymGraph;
	}

	/**
	 * Get the {@code synonym_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code synonym_graph} kind.
	 */
	public SynonymGraphTokenFilter synonymGraph() {
		return TaggedUnionUtils.get(this, Kind.SynonymGraph);
	}

	/**
	 * Is this variant instance of kind {@code synonym}?
	 */
	public boolean isSynonym() {
		return _kind == Kind.Synonym;
	}

	/**
	 * Get the {@code synonym} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code synonym} kind.
	 */
	public SynonymTokenFilter synonym() {
		return TaggedUnionUtils.get(this, Kind.Synonym);
	}

	/**
	 * Is this variant instance of kind {@code trim}?
	 */
	public boolean isTrim() {
		return _kind == Kind.Trim;
	}

	/**
	 * Get the {@code trim} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trim} kind.
	 */
	public TrimTokenFilter trim() {
		return TaggedUnionUtils.get(this, Kind.Trim);
	}

	/**
	 * Is this variant instance of kind {@code truncate}?
	 */
	public boolean isTruncate() {
		return _kind == Kind.Truncate;
	}

	/**
	 * Get the {@code truncate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code truncate} kind.
	 */
	public TruncateTokenFilter truncate() {
		return TaggedUnionUtils.get(this, Kind.Truncate);
	}

	/**
	 * Is this variant instance of kind {@code unique}?
	 */
	public boolean isUnique() {
		return _kind == Kind.Unique;
	}

	/**
	 * Get the {@code unique} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code unique} kind.
	 */
	public UniqueTokenFilter unique() {
		return TaggedUnionUtils.get(this, Kind.Unique);
	}

	/**
	 * Is this variant instance of kind {@code uppercase}?
	 */
	public boolean isUppercase() {
		return _kind == Kind.Uppercase;
	}

	/**
	 * Get the {@code uppercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uppercase} kind.
	 */
	public UppercaseTokenFilter uppercase() {
		return TaggedUnionUtils.get(this, Kind.Uppercase);
	}

	/**
	 * Is this variant instance of kind {@code word_delimiter_graph}?
	 */
	public boolean isWordDelimiterGraph() {
		return _kind == Kind.WordDelimiterGraph;
	}

	/**
	 * Get the {@code word_delimiter_graph} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code word_delimiter_graph}
	 *             kind.
	 */
	public WordDelimiterGraphTokenFilter wordDelimiterGraph() {
		return TaggedUnionUtils.get(this, Kind.WordDelimiterGraph);
	}

	/**
	 * Is this variant instance of kind {@code word_delimiter}?
	 */
	public boolean isWordDelimiter() {
		return _kind == Kind.WordDelimiter;
	}

	/**
	 * Get the {@code word_delimiter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code word_delimiter} kind.
	 */
	public WordDelimiterTokenFilter wordDelimiter() {
		return TaggedUnionUtils.get(this, Kind.WordDelimiter);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code TokenFilterDefinition} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TokenFilterDefinition> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<TokenFilterDefinition> apostrophe(ApostropheTokenFilter v) {
			this._kind = Kind.Apostrophe;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> apostrophe(
				Function<ApostropheTokenFilter.Builder, ObjectBuilder<ApostropheTokenFilter>> fn) {
			return this.apostrophe(fn.apply(new ApostropheTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> arabicNormalization(ArabicNormalizationTokenFilter v) {
			this._kind = Kind.ArabicNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> arabicNormalization(
				Function<ArabicNormalizationTokenFilter.Builder, ObjectBuilder<ArabicNormalizationTokenFilter>> fn) {
			return this.arabicNormalization(fn.apply(new ArabicNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> arabicStem(ArabicStemTokenFilter v) {
			this._kind = Kind.ArabicStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> arabicStem(
				Function<ArabicStemTokenFilter.Builder, ObjectBuilder<ArabicStemTokenFilter>> fn) {
			return this.arabicStem(fn.apply(new ArabicStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> asciifolding(AsciiFoldingTokenFilter v) {
			this._kind = Kind.Asciifolding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> asciifolding(
				Function<AsciiFoldingTokenFilter.Builder, ObjectBuilder<AsciiFoldingTokenFilter>> fn) {
			return this.asciifolding(fn.apply(new AsciiFoldingTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> bengaliNormalization(BengaliNormalizationTokenFilter v) {
			this._kind = Kind.BengaliNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> bengaliNormalization(
				Function<BengaliNormalizationTokenFilter.Builder, ObjectBuilder<BengaliNormalizationTokenFilter>> fn) {
			return this.bengaliNormalization(fn.apply(new BengaliNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> brazilianStem(BrazilianStemTokenFilter v) {
			this._kind = Kind.BrazilianStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> brazilianStem(
				Function<BrazilianStemTokenFilter.Builder, ObjectBuilder<BrazilianStemTokenFilter>> fn) {
			return this.brazilianStem(fn.apply(new BrazilianStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> cjkBigram(CjkBigramTokenFilter v) {
			this._kind = Kind.CjkBigram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> cjkBigram(
				Function<CjkBigramTokenFilter.Builder, ObjectBuilder<CjkBigramTokenFilter>> fn) {
			return this.cjkBigram(fn.apply(new CjkBigramTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> cjkWidth(CjkWidthTokenFilter v) {
			this._kind = Kind.CjkWidth;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> cjkWidth(
				Function<CjkWidthTokenFilter.Builder, ObjectBuilder<CjkWidthTokenFilter>> fn) {
			return this.cjkWidth(fn.apply(new CjkWidthTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> classic(ClassicTokenFilter v) {
			this._kind = Kind.Classic;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> classic(
				Function<ClassicTokenFilter.Builder, ObjectBuilder<ClassicTokenFilter>> fn) {
			return this.classic(fn.apply(new ClassicTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> commonGrams(CommonGramsTokenFilter v) {
			this._kind = Kind.CommonGrams;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> commonGrams(
				Function<CommonGramsTokenFilter.Builder, ObjectBuilder<CommonGramsTokenFilter>> fn) {
			return this.commonGrams(fn.apply(new CommonGramsTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> condition(ConditionTokenFilter v) {
			this._kind = Kind.Condition;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> condition(
				Function<ConditionTokenFilter.Builder, ObjectBuilder<ConditionTokenFilter>> fn) {
			return this.condition(fn.apply(new ConditionTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> czechStem(CzechStemTokenFilter v) {
			this._kind = Kind.CzechStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> czechStem(
				Function<CzechStemTokenFilter.Builder, ObjectBuilder<CzechStemTokenFilter>> fn) {
			return this.czechStem(fn.apply(new CzechStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> decimalDigit(DecimalDigitTokenFilter v) {
			this._kind = Kind.DecimalDigit;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> decimalDigit(
				Function<DecimalDigitTokenFilter.Builder, ObjectBuilder<DecimalDigitTokenFilter>> fn) {
			return this.decimalDigit(fn.apply(new DecimalDigitTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> delimitedPayload(DelimitedPayloadTokenFilter v) {
			this._kind = Kind.DelimitedPayload;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> delimitedPayload(
				Function<DelimitedPayloadTokenFilter.Builder, ObjectBuilder<DelimitedPayloadTokenFilter>> fn) {
			return this.delimitedPayload(fn.apply(new DelimitedPayloadTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> dictionaryDecompounder(DictionaryDecompounderTokenFilter v) {
			this._kind = Kind.DictionaryDecompounder;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> dictionaryDecompounder(
				Function<DictionaryDecompounderTokenFilter.Builder, ObjectBuilder<DictionaryDecompounderTokenFilter>> fn) {
			return this.dictionaryDecompounder(fn.apply(new DictionaryDecompounderTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> dutchStem(DutchStemTokenFilter v) {
			this._kind = Kind.DutchStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> dutchStem(
				Function<DutchStemTokenFilter.Builder, ObjectBuilder<DutchStemTokenFilter>> fn) {
			return this.dutchStem(fn.apply(new DutchStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> edgeNgram(EdgeNGramTokenFilter v) {
			this._kind = Kind.EdgeNgram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> edgeNgram(
				Function<EdgeNGramTokenFilter.Builder, ObjectBuilder<EdgeNGramTokenFilter>> fn) {
			return this.edgeNgram(fn.apply(new EdgeNGramTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> elision(ElisionTokenFilter v) {
			this._kind = Kind.Elision;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> elision(
				Function<ElisionTokenFilter.Builder, ObjectBuilder<ElisionTokenFilter>> fn) {
			return this.elision(fn.apply(new ElisionTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> fingerprint(FingerprintTokenFilter v) {
			this._kind = Kind.Fingerprint;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> fingerprint(
				Function<FingerprintTokenFilter.Builder, ObjectBuilder<FingerprintTokenFilter>> fn) {
			return this.fingerprint(fn.apply(new FingerprintTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> flattenGraph(FlattenGraphTokenFilter v) {
			this._kind = Kind.FlattenGraph;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> flattenGraph(
				Function<FlattenGraphTokenFilter.Builder, ObjectBuilder<FlattenGraphTokenFilter>> fn) {
			return this.flattenGraph(fn.apply(new FlattenGraphTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> frenchStem(FrenchStemTokenFilter v) {
			this._kind = Kind.FrenchStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> frenchStem(
				Function<FrenchStemTokenFilter.Builder, ObjectBuilder<FrenchStemTokenFilter>> fn) {
			return this.frenchStem(fn.apply(new FrenchStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> germanNormalization(GermanNormalizationTokenFilter v) {
			this._kind = Kind.GermanNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> germanNormalization(
				Function<GermanNormalizationTokenFilter.Builder, ObjectBuilder<GermanNormalizationTokenFilter>> fn) {
			return this.germanNormalization(fn.apply(new GermanNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> germanStem(GermanStemTokenFilter v) {
			this._kind = Kind.GermanStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> germanStem(
				Function<GermanStemTokenFilter.Builder, ObjectBuilder<GermanStemTokenFilter>> fn) {
			return this.germanStem(fn.apply(new GermanStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> hindiNormalization(HindiNormalizationTokenFilter v) {
			this._kind = Kind.HindiNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> hindiNormalization(
				Function<HindiNormalizationTokenFilter.Builder, ObjectBuilder<HindiNormalizationTokenFilter>> fn) {
			return this.hindiNormalization(fn.apply(new HindiNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> hunspell(HunspellTokenFilter v) {
			this._kind = Kind.Hunspell;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> hunspell(
				Function<HunspellTokenFilter.Builder, ObjectBuilder<HunspellTokenFilter>> fn) {
			return this.hunspell(fn.apply(new HunspellTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> hyphenationDecompounder(HyphenationDecompounderTokenFilter v) {
			this._kind = Kind.HyphenationDecompounder;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> hyphenationDecompounder(
				Function<HyphenationDecompounderTokenFilter.Builder, ObjectBuilder<HyphenationDecompounderTokenFilter>> fn) {
			return this.hyphenationDecompounder(fn.apply(new HyphenationDecompounderTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> icuCollation(IcuCollationTokenFilter v) {
			this._kind = Kind.IcuCollation;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> icuCollation(
				Function<IcuCollationTokenFilter.Builder, ObjectBuilder<IcuCollationTokenFilter>> fn) {
			return this.icuCollation(fn.apply(new IcuCollationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> icuFolding(IcuFoldingTokenFilter v) {
			this._kind = Kind.IcuFolding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> icuFolding(
				Function<IcuFoldingTokenFilter.Builder, ObjectBuilder<IcuFoldingTokenFilter>> fn) {
			return this.icuFolding(fn.apply(new IcuFoldingTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> icuNormalizer(IcuNormalizationTokenFilter v) {
			this._kind = Kind.IcuNormalizer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> icuNormalizer(
				Function<IcuNormalizationTokenFilter.Builder, ObjectBuilder<IcuNormalizationTokenFilter>> fn) {
			return this.icuNormalizer(fn.apply(new IcuNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> icuTransform(IcuTransformTokenFilter v) {
			this._kind = Kind.IcuTransform;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> icuTransform(
				Function<IcuTransformTokenFilter.Builder, ObjectBuilder<IcuTransformTokenFilter>> fn) {
			return this.icuTransform(fn.apply(new IcuTransformTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> indicNormalization(IndicNormalizationTokenFilter v) {
			this._kind = Kind.IndicNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> indicNormalization(
				Function<IndicNormalizationTokenFilter.Builder, ObjectBuilder<IndicNormalizationTokenFilter>> fn) {
			return this.indicNormalization(fn.apply(new IndicNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> jaStop(JaStopTokenFilter v) {
			this._kind = Kind.JaStop;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> jaStop(
				Function<JaStopTokenFilter.Builder, ObjectBuilder<JaStopTokenFilter>> fn) {
			return this.jaStop(fn.apply(new JaStopTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> kstem(KStemTokenFilter v) {
			this._kind = Kind.Kstem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> kstem(
				Function<KStemTokenFilter.Builder, ObjectBuilder<KStemTokenFilter>> fn) {
			return this.kstem(fn.apply(new KStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> keepTypes(KeepTypesTokenFilter v) {
			this._kind = Kind.KeepTypes;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> keepTypes(
				Function<KeepTypesTokenFilter.Builder, ObjectBuilder<KeepTypesTokenFilter>> fn) {
			return this.keepTypes(fn.apply(new KeepTypesTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> keep(KeepWordsTokenFilter v) {
			this._kind = Kind.Keep;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> keep(
				Function<KeepWordsTokenFilter.Builder, ObjectBuilder<KeepWordsTokenFilter>> fn) {
			return this.keep(fn.apply(new KeepWordsTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> keywordMarker(KeywordMarkerTokenFilter v) {
			this._kind = Kind.KeywordMarker;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> keywordMarker(
				Function<KeywordMarkerTokenFilter.Builder, ObjectBuilder<KeywordMarkerTokenFilter>> fn) {
			return this.keywordMarker(fn.apply(new KeywordMarkerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> keywordRepeat(KeywordRepeatTokenFilter v) {
			this._kind = Kind.KeywordRepeat;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> keywordRepeat(
				Function<KeywordRepeatTokenFilter.Builder, ObjectBuilder<KeywordRepeatTokenFilter>> fn) {
			return this.keywordRepeat(fn.apply(new KeywordRepeatTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> kuromojiPartOfSpeech(KuromojiPartOfSpeechTokenFilter v) {
			this._kind = Kind.KuromojiPartOfSpeech;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> kuromojiPartOfSpeech(
				Function<KuromojiPartOfSpeechTokenFilter.Builder, ObjectBuilder<KuromojiPartOfSpeechTokenFilter>> fn) {
			return this.kuromojiPartOfSpeech(fn.apply(new KuromojiPartOfSpeechTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> kuromojiReadingform(KuromojiReadingFormTokenFilter v) {
			this._kind = Kind.KuromojiReadingform;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> kuromojiReadingform(
				Function<KuromojiReadingFormTokenFilter.Builder, ObjectBuilder<KuromojiReadingFormTokenFilter>> fn) {
			return this.kuromojiReadingform(fn.apply(new KuromojiReadingFormTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> kuromojiStemmer(KuromojiStemmerTokenFilter v) {
			this._kind = Kind.KuromojiStemmer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> kuromojiStemmer(
				Function<KuromojiStemmerTokenFilter.Builder, ObjectBuilder<KuromojiStemmerTokenFilter>> fn) {
			return this.kuromojiStemmer(fn.apply(new KuromojiStemmerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> length(LengthTokenFilter v) {
			this._kind = Kind.Length;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> length(
				Function<LengthTokenFilter.Builder, ObjectBuilder<LengthTokenFilter>> fn) {
			return this.length(fn.apply(new LengthTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> limit(LimitTokenCountTokenFilter v) {
			this._kind = Kind.Limit;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> limit(
				Function<LimitTokenCountTokenFilter.Builder, ObjectBuilder<LimitTokenCountTokenFilter>> fn) {
			return this.limit(fn.apply(new LimitTokenCountTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> lowercase(LowercaseTokenFilter v) {
			this._kind = Kind.Lowercase;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> lowercase(
				Function<LowercaseTokenFilter.Builder, ObjectBuilder<LowercaseTokenFilter>> fn) {
			return this.lowercase(fn.apply(new LowercaseTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> minHash(MinHashTokenFilter v) {
			this._kind = Kind.MinHash;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> minHash(
				Function<MinHashTokenFilter.Builder, ObjectBuilder<MinHashTokenFilter>> fn) {
			return this.minHash(fn.apply(new MinHashTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> multiplexer(MultiplexerTokenFilter v) {
			this._kind = Kind.Multiplexer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> multiplexer(
				Function<MultiplexerTokenFilter.Builder, ObjectBuilder<MultiplexerTokenFilter>> fn) {
			return this.multiplexer(fn.apply(new MultiplexerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> ngram(NGramTokenFilter v) {
			this._kind = Kind.Ngram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> ngram(
				Function<NGramTokenFilter.Builder, ObjectBuilder<NGramTokenFilter>> fn) {
			return this.ngram(fn.apply(new NGramTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> noriPartOfSpeech(NoriPartOfSpeechTokenFilter v) {
			this._kind = Kind.NoriPartOfSpeech;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> noriPartOfSpeech(
				Function<NoriPartOfSpeechTokenFilter.Builder, ObjectBuilder<NoriPartOfSpeechTokenFilter>> fn) {
			return this.noriPartOfSpeech(fn.apply(new NoriPartOfSpeechTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> patternCapture(PatternCaptureTokenFilter v) {
			this._kind = Kind.PatternCapture;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> patternCapture(
				Function<PatternCaptureTokenFilter.Builder, ObjectBuilder<PatternCaptureTokenFilter>> fn) {
			return this.patternCapture(fn.apply(new PatternCaptureTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> patternReplace(PatternReplaceTokenFilter v) {
			this._kind = Kind.PatternReplace;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> patternReplace(
				Function<PatternReplaceTokenFilter.Builder, ObjectBuilder<PatternReplaceTokenFilter>> fn) {
			return this.patternReplace(fn.apply(new PatternReplaceTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> persianNormalization(PersianNormalizationTokenFilter v) {
			this._kind = Kind.PersianNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> persianNormalization(
				Function<PersianNormalizationTokenFilter.Builder, ObjectBuilder<PersianNormalizationTokenFilter>> fn) {
			return this.persianNormalization(fn.apply(new PersianNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> persianStem(PersianStemTokenFilter v) {
			this._kind = Kind.PersianStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> persianStem(
				Function<PersianStemTokenFilter.Builder, ObjectBuilder<PersianStemTokenFilter>> fn) {
			return this.persianStem(fn.apply(new PersianStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> phonetic(PhoneticTokenFilter v) {
			this._kind = Kind.Phonetic;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> phonetic(
				Function<PhoneticTokenFilter.Builder, ObjectBuilder<PhoneticTokenFilter>> fn) {
			return this.phonetic(fn.apply(new PhoneticTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> porterStem(PorterStemTokenFilter v) {
			this._kind = Kind.PorterStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> porterStem(
				Function<PorterStemTokenFilter.Builder, ObjectBuilder<PorterStemTokenFilter>> fn) {
			return this.porterStem(fn.apply(new PorterStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> predicateTokenFilter(PredicateTokenFilter v) {
			this._kind = Kind.PredicateTokenFilter;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> predicateTokenFilter(
				Function<PredicateTokenFilter.Builder, ObjectBuilder<PredicateTokenFilter>> fn) {
			return this.predicateTokenFilter(fn.apply(new PredicateTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> removeDuplicates(RemoveDuplicatesTokenFilter v) {
			this._kind = Kind.RemoveDuplicates;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> removeDuplicates(
				Function<RemoveDuplicatesTokenFilter.Builder, ObjectBuilder<RemoveDuplicatesTokenFilter>> fn) {
			return this.removeDuplicates(fn.apply(new RemoveDuplicatesTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> reverse(ReverseTokenFilter v) {
			this._kind = Kind.Reverse;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> reverse(
				Function<ReverseTokenFilter.Builder, ObjectBuilder<ReverseTokenFilter>> fn) {
			return this.reverse(fn.apply(new ReverseTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> russianStem(RussianStemTokenFilter v) {
			this._kind = Kind.RussianStem;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> russianStem(
				Function<RussianStemTokenFilter.Builder, ObjectBuilder<RussianStemTokenFilter>> fn) {
			return this.russianStem(fn.apply(new RussianStemTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> scandinavianFolding(ScandinavianFoldingTokenFilter v) {
			this._kind = Kind.ScandinavianFolding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> scandinavianFolding(
				Function<ScandinavianFoldingTokenFilter.Builder, ObjectBuilder<ScandinavianFoldingTokenFilter>> fn) {
			return this.scandinavianFolding(fn.apply(new ScandinavianFoldingTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> scandinavianNormalization(ScandinavianNormalizationTokenFilter v) {
			this._kind = Kind.ScandinavianNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> scandinavianNormalization(
				Function<ScandinavianNormalizationTokenFilter.Builder, ObjectBuilder<ScandinavianNormalizationTokenFilter>> fn) {
			return this.scandinavianNormalization(fn.apply(new ScandinavianNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> serbianNormalization(SerbianNormalizationTokenFilter v) {
			this._kind = Kind.SerbianNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> serbianNormalization(
				Function<SerbianNormalizationTokenFilter.Builder, ObjectBuilder<SerbianNormalizationTokenFilter>> fn) {
			return this.serbianNormalization(fn.apply(new SerbianNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> shingle(ShingleTokenFilter v) {
			this._kind = Kind.Shingle;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> shingle(
				Function<ShingleTokenFilter.Builder, ObjectBuilder<ShingleTokenFilter>> fn) {
			return this.shingle(fn.apply(new ShingleTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> snowball(SnowballTokenFilter v) {
			this._kind = Kind.Snowball;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> snowball(
				Function<SnowballTokenFilter.Builder, ObjectBuilder<SnowballTokenFilter>> fn) {
			return this.snowball(fn.apply(new SnowballTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> soraniNormalization(SoraniNormalizationTokenFilter v) {
			this._kind = Kind.SoraniNormalization;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> soraniNormalization(
				Function<SoraniNormalizationTokenFilter.Builder, ObjectBuilder<SoraniNormalizationTokenFilter>> fn) {
			return this.soraniNormalization(fn.apply(new SoraniNormalizationTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> stemmerOverride(StemmerOverrideTokenFilter v) {
			this._kind = Kind.StemmerOverride;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> stemmerOverride(
				Function<StemmerOverrideTokenFilter.Builder, ObjectBuilder<StemmerOverrideTokenFilter>> fn) {
			return this.stemmerOverride(fn.apply(new StemmerOverrideTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> stemmer(StemmerTokenFilter v) {
			this._kind = Kind.Stemmer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> stemmer(
				Function<StemmerTokenFilter.Builder, ObjectBuilder<StemmerTokenFilter>> fn) {
			return this.stemmer(fn.apply(new StemmerTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> stop(StopTokenFilter v) {
			this._kind = Kind.Stop;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> stop(
				Function<StopTokenFilter.Builder, ObjectBuilder<StopTokenFilter>> fn) {
			return this.stop(fn.apply(new StopTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> synonymGraph(SynonymGraphTokenFilter v) {
			this._kind = Kind.SynonymGraph;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> synonymGraph(
				Function<SynonymGraphTokenFilter.Builder, ObjectBuilder<SynonymGraphTokenFilter>> fn) {
			return this.synonymGraph(fn.apply(new SynonymGraphTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> synonym(SynonymTokenFilter v) {
			this._kind = Kind.Synonym;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> synonym(
				Function<SynonymTokenFilter.Builder, ObjectBuilder<SynonymTokenFilter>> fn) {
			return this.synonym(fn.apply(new SynonymTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> trim(TrimTokenFilter v) {
			this._kind = Kind.Trim;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> trim(
				Function<TrimTokenFilter.Builder, ObjectBuilder<TrimTokenFilter>> fn) {
			return this.trim(fn.apply(new TrimTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> truncate(TruncateTokenFilter v) {
			this._kind = Kind.Truncate;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> truncate(
				Function<TruncateTokenFilter.Builder, ObjectBuilder<TruncateTokenFilter>> fn) {
			return this.truncate(fn.apply(new TruncateTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> unique(UniqueTokenFilter v) {
			this._kind = Kind.Unique;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> unique(
				Function<UniqueTokenFilter.Builder, ObjectBuilder<UniqueTokenFilter>> fn) {
			return this.unique(fn.apply(new UniqueTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> uppercase(UppercaseTokenFilter v) {
			this._kind = Kind.Uppercase;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> uppercase(
				Function<UppercaseTokenFilter.Builder, ObjectBuilder<UppercaseTokenFilter>> fn) {
			return this.uppercase(fn.apply(new UppercaseTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> wordDelimiterGraph(WordDelimiterGraphTokenFilter v) {
			this._kind = Kind.WordDelimiterGraph;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> wordDelimiterGraph(
				Function<WordDelimiterGraphTokenFilter.Builder, ObjectBuilder<WordDelimiterGraphTokenFilter>> fn) {
			return this.wordDelimiterGraph(fn.apply(new WordDelimiterGraphTokenFilter.Builder()).build());
		}

		public ObjectBuilder<TokenFilterDefinition> wordDelimiter(WordDelimiterTokenFilter v) {
			this._kind = Kind.WordDelimiter;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilterDefinition> wordDelimiter(
				Function<WordDelimiterTokenFilter.Builder, ObjectBuilder<WordDelimiterTokenFilter>> fn) {
			return this.wordDelimiter(fn.apply(new WordDelimiterTokenFilter.Builder()).build());
		}

		/**
		 * Define this {@code TokenFilterDefinition} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code TokenFilterDefinition}. It is
		 *            converted internally to {@link JsonData}.
		 */
		public ObjectBuilder<TokenFilterDefinition> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public TokenFilterDefinition build() {
			_checkSingleUse();
			return new TokenFilterDefinition(this);
		}

	}

	protected static void setupTokenFilterDefinitionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::apostrophe, ApostropheTokenFilter._DESERIALIZER, "apostrophe");
		op.add(Builder::arabicNormalization, ArabicNormalizationTokenFilter._DESERIALIZER, "arabic_normalization");
		op.add(Builder::arabicStem, ArabicStemTokenFilter._DESERIALIZER, "arabic_stem");
		op.add(Builder::asciifolding, AsciiFoldingTokenFilter._DESERIALIZER, "asciifolding");
		op.add(Builder::bengaliNormalization, BengaliNormalizationTokenFilter._DESERIALIZER, "bengali_normalization");
		op.add(Builder::brazilianStem, BrazilianStemTokenFilter._DESERIALIZER, "brazilian_stem");
		op.add(Builder::cjkBigram, CjkBigramTokenFilter._DESERIALIZER, "cjk_bigram");
		op.add(Builder::cjkWidth, CjkWidthTokenFilter._DESERIALIZER, "cjk_width");
		op.add(Builder::classic, ClassicTokenFilter._DESERIALIZER, "classic");
		op.add(Builder::commonGrams, CommonGramsTokenFilter._DESERIALIZER, "common_grams");
		op.add(Builder::condition, ConditionTokenFilter._DESERIALIZER, "condition");
		op.add(Builder::czechStem, CzechStemTokenFilter._DESERIALIZER, "czech_stem");
		op.add(Builder::decimalDigit, DecimalDigitTokenFilter._DESERIALIZER, "decimal_digit");
		op.add(Builder::delimitedPayload, DelimitedPayloadTokenFilter._DESERIALIZER, "delimited_payload");
		op.add(Builder::dictionaryDecompounder, DictionaryDecompounderTokenFilter._DESERIALIZER,
				"dictionary_decompounder");
		op.add(Builder::dutchStem, DutchStemTokenFilter._DESERIALIZER, "dutch_stem");
		op.add(Builder::edgeNgram, EdgeNGramTokenFilter._DESERIALIZER, "edge_ngram");
		op.add(Builder::elision, ElisionTokenFilter._DESERIALIZER, "elision");
		op.add(Builder::fingerprint, FingerprintTokenFilter._DESERIALIZER, "fingerprint");
		op.add(Builder::flattenGraph, FlattenGraphTokenFilter._DESERIALIZER, "flatten_graph");
		op.add(Builder::frenchStem, FrenchStemTokenFilter._DESERIALIZER, "french_stem");
		op.add(Builder::germanNormalization, GermanNormalizationTokenFilter._DESERIALIZER, "german_normalization");
		op.add(Builder::germanStem, GermanStemTokenFilter._DESERIALIZER, "german_stem");
		op.add(Builder::hindiNormalization, HindiNormalizationTokenFilter._DESERIALIZER, "hindi_normalization");
		op.add(Builder::hunspell, HunspellTokenFilter._DESERIALIZER, "hunspell");
		op.add(Builder::hyphenationDecompounder, HyphenationDecompounderTokenFilter._DESERIALIZER,
				"hyphenation_decompounder");
		op.add(Builder::icuCollation, IcuCollationTokenFilter._DESERIALIZER, "icu_collation");
		op.add(Builder::icuFolding, IcuFoldingTokenFilter._DESERIALIZER, "icu_folding");
		op.add(Builder::icuNormalizer, IcuNormalizationTokenFilter._DESERIALIZER, "icu_normalizer");
		op.add(Builder::icuTransform, IcuTransformTokenFilter._DESERIALIZER, "icu_transform");
		op.add(Builder::indicNormalization, IndicNormalizationTokenFilter._DESERIALIZER, "indic_normalization");
		op.add(Builder::jaStop, JaStopTokenFilter._DESERIALIZER, "ja_stop");
		op.add(Builder::kstem, KStemTokenFilter._DESERIALIZER, "kstem");
		op.add(Builder::keepTypes, KeepTypesTokenFilter._DESERIALIZER, "keep_types");
		op.add(Builder::keep, KeepWordsTokenFilter._DESERIALIZER, "keep");
		op.add(Builder::keywordMarker, KeywordMarkerTokenFilter._DESERIALIZER, "keyword_marker");
		op.add(Builder::keywordRepeat, KeywordRepeatTokenFilter._DESERIALIZER, "keyword_repeat");
		op.add(Builder::kuromojiPartOfSpeech, KuromojiPartOfSpeechTokenFilter._DESERIALIZER, "kuromoji_part_of_speech");
		op.add(Builder::kuromojiReadingform, KuromojiReadingFormTokenFilter._DESERIALIZER, "kuromoji_readingform");
		op.add(Builder::kuromojiStemmer, KuromojiStemmerTokenFilter._DESERIALIZER, "kuromoji_stemmer");
		op.add(Builder::length, LengthTokenFilter._DESERIALIZER, "length");
		op.add(Builder::limit, LimitTokenCountTokenFilter._DESERIALIZER, "limit");
		op.add(Builder::lowercase, LowercaseTokenFilter._DESERIALIZER, "lowercase");
		op.add(Builder::minHash, MinHashTokenFilter._DESERIALIZER, "min_hash");
		op.add(Builder::multiplexer, MultiplexerTokenFilter._DESERIALIZER, "multiplexer");
		op.add(Builder::ngram, NGramTokenFilter._DESERIALIZER, "ngram");
		op.add(Builder::noriPartOfSpeech, NoriPartOfSpeechTokenFilter._DESERIALIZER, "nori_part_of_speech");
		op.add(Builder::patternCapture, PatternCaptureTokenFilter._DESERIALIZER, "pattern_capture");
		op.add(Builder::patternReplace, PatternReplaceTokenFilter._DESERIALIZER, "pattern_replace");
		op.add(Builder::persianNormalization, PersianNormalizationTokenFilter._DESERIALIZER, "persian_normalization");
		op.add(Builder::persianStem, PersianStemTokenFilter._DESERIALIZER, "persian_stem");
		op.add(Builder::phonetic, PhoneticTokenFilter._DESERIALIZER, "phonetic");
		op.add(Builder::porterStem, PorterStemTokenFilter._DESERIALIZER, "porter_stem");
		op.add(Builder::predicateTokenFilter, PredicateTokenFilter._DESERIALIZER, "predicate_token_filter");
		op.add(Builder::removeDuplicates, RemoveDuplicatesTokenFilter._DESERIALIZER, "remove_duplicates");
		op.add(Builder::reverse, ReverseTokenFilter._DESERIALIZER, "reverse");
		op.add(Builder::russianStem, RussianStemTokenFilter._DESERIALIZER, "russian_stem");
		op.add(Builder::scandinavianFolding, ScandinavianFoldingTokenFilter._DESERIALIZER, "scandinavian_folding");
		op.add(Builder::scandinavianNormalization, ScandinavianNormalizationTokenFilter._DESERIALIZER,
				"scandinavian_normalization");
		op.add(Builder::serbianNormalization, SerbianNormalizationTokenFilter._DESERIALIZER, "serbian_normalization");
		op.add(Builder::shingle, ShingleTokenFilter._DESERIALIZER, "shingle");
		op.add(Builder::snowball, SnowballTokenFilter._DESERIALIZER, "snowball");
		op.add(Builder::soraniNormalization, SoraniNormalizationTokenFilter._DESERIALIZER, "sorani_normalization");
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

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<TokenFilterDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenFilterDefinition::setupTokenFilterDefinitionDeserializer, Builder::build);
}
