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

// typedef: _types.analysis.Analyzer

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.analysis.Analyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Analyzer implements OpenTaggedUnion<Analyzer.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Analyzer} variant kinds.
	 * 
	 * @see <a href="../../doc-files/api-spec.html#_types.analysis.Analyzer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Arabic("arabic"),

		Armenian("armenian"),

		Basque("basque"),

		Bengali("bengali"),

		Brazilian("brazilian"),

		Bulgarian("bulgarian"),

		Catalan("catalan"),

		Chinese("chinese"),

		Cjk("cjk"),

		Custom("custom"),

		Czech("czech"),

		Danish("danish"),

		Dutch("dutch"),

		English("english"),

		Estonian("estonian"),

		Fingerprint("fingerprint"),

		Finnish("finnish"),

		French("french"),

		Galician("galician"),

		German("german"),

		Greek("greek"),

		Hindi("hindi"),

		Hungarian("hungarian"),

		IcuAnalyzer("icu_analyzer"),

		Indonesian("indonesian"),

		Irish("irish"),

		Italian("italian"),

		Keyword("keyword"),

		Kuromoji("kuromoji"),

		Language("language"),

		Latvian("latvian"),

		Lithuanian("lithuanian"),

		Nori("nori"),

		Norwegian("norwegian"),

		Pattern("pattern"),

		Persian("persian"),

		Portuguese("portuguese"),

		Romanian("romanian"),

		Russian("russian"),

		Serbian("serbian"),

		Simple("simple"),

		Snowball("snowball"),

		Sorani("sorani"),

		Spanish("spanish"),

		Standard("standard"),

		Stop("stop"),

		Swedish("swedish"),

		Thai("thai"),

		Turkish("turkish"),

		Whitespace("whitespace"),

		/** A custom {@code Analyzer} defined by a plugin */
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

	public Analyzer(AnalyzerVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._analyzerKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private Analyzer(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static Analyzer of(Function<Builder, ObjectBuilder<Analyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code Analyzer}, given its kind and some JSON
	 * data
	 */
	public Analyzer(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
	}

	/**
	 * Is this variant instance of kind {@code arabic}?
	 */
	public boolean isArabic() {
		return _kind == Kind.Arabic;
	}

	/**
	 * Get the {@code arabic} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code arabic} kind.
	 */
	public ArabicAnalyzer arabic() {
		return TaggedUnionUtils.get(this, Kind.Arabic);
	}

	/**
	 * Is this variant instance of kind {@code armenian}?
	 */
	public boolean isArmenian() {
		return _kind == Kind.Armenian;
	}

	/**
	 * Get the {@code armenian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code armenian} kind.
	 */
	public ArmenianAnalyzer armenian() {
		return TaggedUnionUtils.get(this, Kind.Armenian);
	}

	/**
	 * Is this variant instance of kind {@code basque}?
	 */
	public boolean isBasque() {
		return _kind == Kind.Basque;
	}

	/**
	 * Get the {@code basque} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code basque} kind.
	 */
	public BasqueAnalyzer basque() {
		return TaggedUnionUtils.get(this, Kind.Basque);
	}

	/**
	 * Is this variant instance of kind {@code bengali}?
	 */
	public boolean isBengali() {
		return _kind == Kind.Bengali;
	}

	/**
	 * Get the {@code bengali} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bengali} kind.
	 */
	public BengaliAnalyzer bengali() {
		return TaggedUnionUtils.get(this, Kind.Bengali);
	}

	/**
	 * Is this variant instance of kind {@code brazilian}?
	 */
	public boolean isBrazilian() {
		return _kind == Kind.Brazilian;
	}

	/**
	 * Get the {@code brazilian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code brazilian} kind.
	 */
	public BrazilianAnalyzer brazilian() {
		return TaggedUnionUtils.get(this, Kind.Brazilian);
	}

	/**
	 * Is this variant instance of kind {@code bulgarian}?
	 */
	public boolean isBulgarian() {
		return _kind == Kind.Bulgarian;
	}

	/**
	 * Get the {@code bulgarian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bulgarian} kind.
	 */
	public BulgarianAnalyzer bulgarian() {
		return TaggedUnionUtils.get(this, Kind.Bulgarian);
	}

	/**
	 * Is this variant instance of kind {@code catalan}?
	 */
	public boolean isCatalan() {
		return _kind == Kind.Catalan;
	}

	/**
	 * Get the {@code catalan} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code catalan} kind.
	 */
	public CatalanAnalyzer catalan() {
		return TaggedUnionUtils.get(this, Kind.Catalan);
	}

	/**
	 * Is this variant instance of kind {@code chinese}?
	 */
	public boolean isChinese() {
		return _kind == Kind.Chinese;
	}

	/**
	 * Get the {@code chinese} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chinese} kind.
	 */
	public ChineseAnalyzer chinese() {
		return TaggedUnionUtils.get(this, Kind.Chinese);
	}

	/**
	 * Is this variant instance of kind {@code cjk}?
	 */
	public boolean isCjk() {
		return _kind == Kind.Cjk;
	}

	/**
	 * Get the {@code cjk} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cjk} kind.
	 */
	public CjkAnalyzer cjk() {
		return TaggedUnionUtils.get(this, Kind.Cjk);
	}

	/**
	 * Is this variant instance of kind {@code custom}?
	 */
	public boolean isCustom() {
		return _kind == Kind.Custom;
	}

	/**
	 * Get the {@code custom} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code custom} kind.
	 */
	public CustomAnalyzer custom() {
		return TaggedUnionUtils.get(this, Kind.Custom);
	}

	/**
	 * Is this variant instance of kind {@code czech}?
	 */
	public boolean isCzech() {
		return _kind == Kind.Czech;
	}

	/**
	 * Get the {@code czech} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code czech} kind.
	 */
	public CzechAnalyzer czech() {
		return TaggedUnionUtils.get(this, Kind.Czech);
	}

	/**
	 * Is this variant instance of kind {@code danish}?
	 */
	public boolean isDanish() {
		return _kind == Kind.Danish;
	}

	/**
	 * Get the {@code danish} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code danish} kind.
	 */
	public DanishAnalyzer danish() {
		return TaggedUnionUtils.get(this, Kind.Danish);
	}

	/**
	 * Is this variant instance of kind {@code dutch}?
	 */
	public boolean isDutch() {
		return _kind == Kind.Dutch;
	}

	/**
	 * Get the {@code dutch} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dutch} kind.
	 */
	public DutchAnalyzer dutch() {
		return TaggedUnionUtils.get(this, Kind.Dutch);
	}

	/**
	 * Is this variant instance of kind {@code english}?
	 */
	public boolean isEnglish() {
		return _kind == Kind.English;
	}

	/**
	 * Get the {@code english} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code english} kind.
	 */
	public EnglishAnalyzer english() {
		return TaggedUnionUtils.get(this, Kind.English);
	}

	/**
	 * Is this variant instance of kind {@code estonian}?
	 */
	public boolean isEstonian() {
		return _kind == Kind.Estonian;
	}

	/**
	 * Get the {@code estonian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code estonian} kind.
	 */
	public EstonianAnalyzer estonian() {
		return TaggedUnionUtils.get(this, Kind.Estonian);
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
	public FingerprintAnalyzer fingerprint() {
		return TaggedUnionUtils.get(this, Kind.Fingerprint);
	}

	/**
	 * Is this variant instance of kind {@code finnish}?
	 */
	public boolean isFinnish() {
		return _kind == Kind.Finnish;
	}

	/**
	 * Get the {@code finnish} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code finnish} kind.
	 */
	public FinnishAnalyzer finnish() {
		return TaggedUnionUtils.get(this, Kind.Finnish);
	}

	/**
	 * Is this variant instance of kind {@code french}?
	 */
	public boolean isFrench() {
		return _kind == Kind.French;
	}

	/**
	 * Get the {@code french} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code french} kind.
	 */
	public FrenchAnalyzer french() {
		return TaggedUnionUtils.get(this, Kind.French);
	}

	/**
	 * Is this variant instance of kind {@code galician}?
	 */
	public boolean isGalician() {
		return _kind == Kind.Galician;
	}

	/**
	 * Get the {@code galician} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code galician} kind.
	 */
	public GalicianAnalyzer galician() {
		return TaggedUnionUtils.get(this, Kind.Galician);
	}

	/**
	 * Is this variant instance of kind {@code german}?
	 */
	public boolean isGerman() {
		return _kind == Kind.German;
	}

	/**
	 * Get the {@code german} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code german} kind.
	 */
	public GermanAnalyzer german() {
		return TaggedUnionUtils.get(this, Kind.German);
	}

	/**
	 * Is this variant instance of kind {@code greek}?
	 */
	public boolean isGreek() {
		return _kind == Kind.Greek;
	}

	/**
	 * Get the {@code greek} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code greek} kind.
	 */
	public GreekAnalyzer greek() {
		return TaggedUnionUtils.get(this, Kind.Greek);
	}

	/**
	 * Is this variant instance of kind {@code hindi}?
	 */
	public boolean isHindi() {
		return _kind == Kind.Hindi;
	}

	/**
	 * Get the {@code hindi} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hindi} kind.
	 */
	public HindiAnalyzer hindi() {
		return TaggedUnionUtils.get(this, Kind.Hindi);
	}

	/**
	 * Is this variant instance of kind {@code hungarian}?
	 */
	public boolean isHungarian() {
		return _kind == Kind.Hungarian;
	}

	/**
	 * Get the {@code hungarian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hungarian} kind.
	 */
	public HungarianAnalyzer hungarian() {
		return TaggedUnionUtils.get(this, Kind.Hungarian);
	}

	/**
	 * Is this variant instance of kind {@code icu_analyzer}?
	 */
	public boolean isIcuAnalyzer() {
		return _kind == Kind.IcuAnalyzer;
	}

	/**
	 * Get the {@code icu_analyzer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_analyzer} kind.
	 */
	public IcuAnalyzer icuAnalyzer() {
		return TaggedUnionUtils.get(this, Kind.IcuAnalyzer);
	}

	/**
	 * Is this variant instance of kind {@code indonesian}?
	 */
	public boolean isIndonesian() {
		return _kind == Kind.Indonesian;
	}

	/**
	 * Get the {@code indonesian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code indonesian} kind.
	 */
	public IndonesianAnalyzer indonesian() {
		return TaggedUnionUtils.get(this, Kind.Indonesian);
	}

	/**
	 * Is this variant instance of kind {@code irish}?
	 */
	public boolean isIrish() {
		return _kind == Kind.Irish;
	}

	/**
	 * Get the {@code irish} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code irish} kind.
	 */
	public IrishAnalyzer irish() {
		return TaggedUnionUtils.get(this, Kind.Irish);
	}

	/**
	 * Is this variant instance of kind {@code italian}?
	 */
	public boolean isItalian() {
		return _kind == Kind.Italian;
	}

	/**
	 * Get the {@code italian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code italian} kind.
	 */
	public ItalianAnalyzer italian() {
		return TaggedUnionUtils.get(this, Kind.Italian);
	}

	/**
	 * Is this variant instance of kind {@code keyword}?
	 */
	public boolean isKeyword() {
		return _kind == Kind.Keyword;
	}

	/**
	 * Get the {@code keyword} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword} kind.
	 */
	public KeywordAnalyzer keyword() {
		return TaggedUnionUtils.get(this, Kind.Keyword);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji}?
	 */
	public boolean isKuromoji() {
		return _kind == Kind.Kuromoji;
	}

	/**
	 * Get the {@code kuromoji} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji} kind.
	 */
	public KuromojiAnalyzer kuromoji() {
		return TaggedUnionUtils.get(this, Kind.Kuromoji);
	}

	/**
	 * Is this variant instance of kind {@code language}?
	 */
	public boolean isLanguage() {
		return _kind == Kind.Language;
	}

	/**
	 * Get the {@code language} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code language} kind.
	 */
	public LanguageAnalyzer language() {
		return TaggedUnionUtils.get(this, Kind.Language);
	}

	/**
	 * Is this variant instance of kind {@code latvian}?
	 */
	public boolean isLatvian() {
		return _kind == Kind.Latvian;
	}

	/**
	 * Get the {@code latvian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code latvian} kind.
	 */
	public LatvianAnalyzer latvian() {
		return TaggedUnionUtils.get(this, Kind.Latvian);
	}

	/**
	 * Is this variant instance of kind {@code lithuanian}?
	 */
	public boolean isLithuanian() {
		return _kind == Kind.Lithuanian;
	}

	/**
	 * Get the {@code lithuanian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lithuanian} kind.
	 */
	public LithuanianAnalyzer lithuanian() {
		return TaggedUnionUtils.get(this, Kind.Lithuanian);
	}

	/**
	 * Is this variant instance of kind {@code nori}?
	 */
	public boolean isNori() {
		return _kind == Kind.Nori;
	}

	/**
	 * Get the {@code nori} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori} kind.
	 */
	public NoriAnalyzer nori() {
		return TaggedUnionUtils.get(this, Kind.Nori);
	}

	/**
	 * Is this variant instance of kind {@code norwegian}?
	 */
	public boolean isNorwegian() {
		return _kind == Kind.Norwegian;
	}

	/**
	 * Get the {@code norwegian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code norwegian} kind.
	 */
	public NorwegianAnalyzer norwegian() {
		return TaggedUnionUtils.get(this, Kind.Norwegian);
	}

	/**
	 * Is this variant instance of kind {@code pattern}?
	 */
	public boolean isPattern() {
		return _kind == Kind.Pattern;
	}

	/**
	 * Get the {@code pattern} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern} kind.
	 */
	public PatternAnalyzer pattern() {
		return TaggedUnionUtils.get(this, Kind.Pattern);
	}

	/**
	 * Is this variant instance of kind {@code persian}?
	 */
	public boolean isPersian() {
		return _kind == Kind.Persian;
	}

	/**
	 * Get the {@code persian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code persian} kind.
	 */
	public PersianAnalyzer persian() {
		return TaggedUnionUtils.get(this, Kind.Persian);
	}

	/**
	 * Is this variant instance of kind {@code portuguese}?
	 */
	public boolean isPortuguese() {
		return _kind == Kind.Portuguese;
	}

	/**
	 * Get the {@code portuguese} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code portuguese} kind.
	 */
	public PortugueseAnalyzer portuguese() {
		return TaggedUnionUtils.get(this, Kind.Portuguese);
	}

	/**
	 * Is this variant instance of kind {@code romanian}?
	 */
	public boolean isRomanian() {
		return _kind == Kind.Romanian;
	}

	/**
	 * Get the {@code romanian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code romanian} kind.
	 */
	public RomanianAnalyzer romanian() {
		return TaggedUnionUtils.get(this, Kind.Romanian);
	}

	/**
	 * Is this variant instance of kind {@code russian}?
	 */
	public boolean isRussian() {
		return _kind == Kind.Russian;
	}

	/**
	 * Get the {@code russian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code russian} kind.
	 */
	public RussianAnalyzer russian() {
		return TaggedUnionUtils.get(this, Kind.Russian);
	}

	/**
	 * Is this variant instance of kind {@code serbian}?
	 */
	public boolean isSerbian() {
		return _kind == Kind.Serbian;
	}

	/**
	 * Get the {@code serbian} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code serbian} kind.
	 */
	public SerbianAnalyzer serbian() {
		return TaggedUnionUtils.get(this, Kind.Serbian);
	}

	/**
	 * Is this variant instance of kind {@code simple}?
	 */
	public boolean isSimple() {
		return _kind == Kind.Simple;
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public SimpleAnalyzer simple() {
		return TaggedUnionUtils.get(this, Kind.Simple);
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
	public SnowballAnalyzer snowball() {
		return TaggedUnionUtils.get(this, Kind.Snowball);
	}

	/**
	 * Is this variant instance of kind {@code sorani}?
	 */
	public boolean isSorani() {
		return _kind == Kind.Sorani;
	}

	/**
	 * Get the {@code sorani} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sorani} kind.
	 */
	public SoraniAnalyzer sorani() {
		return TaggedUnionUtils.get(this, Kind.Sorani);
	}

	/**
	 * Is this variant instance of kind {@code spanish}?
	 */
	public boolean isSpanish() {
		return _kind == Kind.Spanish;
	}

	/**
	 * Get the {@code spanish} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code spanish} kind.
	 */
	public SpanishAnalyzer spanish() {
		return TaggedUnionUtils.get(this, Kind.Spanish);
	}

	/**
	 * Is this variant instance of kind {@code standard}?
	 */
	public boolean isStandard() {
		return _kind == Kind.Standard;
	}

	/**
	 * Get the {@code standard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code standard} kind.
	 */
	public StandardAnalyzer standard() {
		return TaggedUnionUtils.get(this, Kind.Standard);
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
	public StopAnalyzer stop() {
		return TaggedUnionUtils.get(this, Kind.Stop);
	}

	/**
	 * Is this variant instance of kind {@code swedish}?
	 */
	public boolean isSwedish() {
		return _kind == Kind.Swedish;
	}

	/**
	 * Get the {@code swedish} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code swedish} kind.
	 */
	public SwedishAnalyzer swedish() {
		return TaggedUnionUtils.get(this, Kind.Swedish);
	}

	/**
	 * Is this variant instance of kind {@code thai}?
	 */
	public boolean isThai() {
		return _kind == Kind.Thai;
	}

	/**
	 * Get the {@code thai} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code thai} kind.
	 */
	public ThaiAnalyzer thai() {
		return TaggedUnionUtils.get(this, Kind.Thai);
	}

	/**
	 * Is this variant instance of kind {@code turkish}?
	 */
	public boolean isTurkish() {
		return _kind == Kind.Turkish;
	}

	/**
	 * Get the {@code turkish} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code turkish} kind.
	 */
	public TurkishAnalyzer turkish() {
		return TaggedUnionUtils.get(this, Kind.Turkish);
	}

	/**
	 * Is this variant instance of kind {@code whitespace}?
	 */
	public boolean isWhitespace() {
		return _kind == Kind.Whitespace;
	}

	/**
	 * Get the {@code whitespace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code whitespace} kind.
	 */
	public WhitespaceAnalyzer whitespace() {
		return TaggedUnionUtils.get(this, Kind.Whitespace);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code Analyzer} defined by a plugin?
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Analyzer> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Analyzer> arabic(ArabicAnalyzer v) {
			this._kind = Kind.Arabic;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> arabic(Function<ArabicAnalyzer.Builder, ObjectBuilder<ArabicAnalyzer>> fn) {
			return this.arabic(fn.apply(new ArabicAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> armenian(ArmenianAnalyzer v) {
			this._kind = Kind.Armenian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> armenian(
				Function<ArmenianAnalyzer.Builder, ObjectBuilder<ArmenianAnalyzer>> fn) {
			return this.armenian(fn.apply(new ArmenianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> basque(BasqueAnalyzer v) {
			this._kind = Kind.Basque;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> basque(Function<BasqueAnalyzer.Builder, ObjectBuilder<BasqueAnalyzer>> fn) {
			return this.basque(fn.apply(new BasqueAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> bengali(BengaliAnalyzer v) {
			this._kind = Kind.Bengali;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> bengali(Function<BengaliAnalyzer.Builder, ObjectBuilder<BengaliAnalyzer>> fn) {
			return this.bengali(fn.apply(new BengaliAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> brazilian(BrazilianAnalyzer v) {
			this._kind = Kind.Brazilian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> brazilian(
				Function<BrazilianAnalyzer.Builder, ObjectBuilder<BrazilianAnalyzer>> fn) {
			return this.brazilian(fn.apply(new BrazilianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> bulgarian(BulgarianAnalyzer v) {
			this._kind = Kind.Bulgarian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> bulgarian(
				Function<BulgarianAnalyzer.Builder, ObjectBuilder<BulgarianAnalyzer>> fn) {
			return this.bulgarian(fn.apply(new BulgarianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> catalan(CatalanAnalyzer v) {
			this._kind = Kind.Catalan;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> catalan(Function<CatalanAnalyzer.Builder, ObjectBuilder<CatalanAnalyzer>> fn) {
			return this.catalan(fn.apply(new CatalanAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> chinese(ChineseAnalyzer v) {
			this._kind = Kind.Chinese;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> chinese(Function<ChineseAnalyzer.Builder, ObjectBuilder<ChineseAnalyzer>> fn) {
			return this.chinese(fn.apply(new ChineseAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> cjk(CjkAnalyzer v) {
			this._kind = Kind.Cjk;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> cjk(Function<CjkAnalyzer.Builder, ObjectBuilder<CjkAnalyzer>> fn) {
			return this.cjk(fn.apply(new CjkAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> custom(CustomAnalyzer v) {
			this._kind = Kind.Custom;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> custom(Function<CustomAnalyzer.Builder, ObjectBuilder<CustomAnalyzer>> fn) {
			return this.custom(fn.apply(new CustomAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> czech(CzechAnalyzer v) {
			this._kind = Kind.Czech;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> czech(Function<CzechAnalyzer.Builder, ObjectBuilder<CzechAnalyzer>> fn) {
			return this.czech(fn.apply(new CzechAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> danish(DanishAnalyzer v) {
			this._kind = Kind.Danish;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> danish(Function<DanishAnalyzer.Builder, ObjectBuilder<DanishAnalyzer>> fn) {
			return this.danish(fn.apply(new DanishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> dutch(DutchAnalyzer v) {
			this._kind = Kind.Dutch;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> dutch(Function<DutchAnalyzer.Builder, ObjectBuilder<DutchAnalyzer>> fn) {
			return this.dutch(fn.apply(new DutchAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> english(EnglishAnalyzer v) {
			this._kind = Kind.English;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> english(Function<EnglishAnalyzer.Builder, ObjectBuilder<EnglishAnalyzer>> fn) {
			return this.english(fn.apply(new EnglishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> estonian(EstonianAnalyzer v) {
			this._kind = Kind.Estonian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> estonian(
				Function<EstonianAnalyzer.Builder, ObjectBuilder<EstonianAnalyzer>> fn) {
			return this.estonian(fn.apply(new EstonianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> fingerprint(FingerprintAnalyzer v) {
			this._kind = Kind.Fingerprint;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> fingerprint(
				Function<FingerprintAnalyzer.Builder, ObjectBuilder<FingerprintAnalyzer>> fn) {
			return this.fingerprint(fn.apply(new FingerprintAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> finnish(FinnishAnalyzer v) {
			this._kind = Kind.Finnish;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> finnish(Function<FinnishAnalyzer.Builder, ObjectBuilder<FinnishAnalyzer>> fn) {
			return this.finnish(fn.apply(new FinnishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> french(FrenchAnalyzer v) {
			this._kind = Kind.French;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> french(Function<FrenchAnalyzer.Builder, ObjectBuilder<FrenchAnalyzer>> fn) {
			return this.french(fn.apply(new FrenchAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> galician(GalicianAnalyzer v) {
			this._kind = Kind.Galician;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> galician(
				Function<GalicianAnalyzer.Builder, ObjectBuilder<GalicianAnalyzer>> fn) {
			return this.galician(fn.apply(new GalicianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> german(GermanAnalyzer v) {
			this._kind = Kind.German;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> german(Function<GermanAnalyzer.Builder, ObjectBuilder<GermanAnalyzer>> fn) {
			return this.german(fn.apply(new GermanAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> greek(GreekAnalyzer v) {
			this._kind = Kind.Greek;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> greek(Function<GreekAnalyzer.Builder, ObjectBuilder<GreekAnalyzer>> fn) {
			return this.greek(fn.apply(new GreekAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> hindi(HindiAnalyzer v) {
			this._kind = Kind.Hindi;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> hindi(Function<HindiAnalyzer.Builder, ObjectBuilder<HindiAnalyzer>> fn) {
			return this.hindi(fn.apply(new HindiAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> hungarian(HungarianAnalyzer v) {
			this._kind = Kind.Hungarian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> hungarian(
				Function<HungarianAnalyzer.Builder, ObjectBuilder<HungarianAnalyzer>> fn) {
			return this.hungarian(fn.apply(new HungarianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> icuAnalyzer(IcuAnalyzer v) {
			this._kind = Kind.IcuAnalyzer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> icuAnalyzer(Function<IcuAnalyzer.Builder, ObjectBuilder<IcuAnalyzer>> fn) {
			return this.icuAnalyzer(fn.apply(new IcuAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> indonesian(IndonesianAnalyzer v) {
			this._kind = Kind.Indonesian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> indonesian(
				Function<IndonesianAnalyzer.Builder, ObjectBuilder<IndonesianAnalyzer>> fn) {
			return this.indonesian(fn.apply(new IndonesianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> irish(IrishAnalyzer v) {
			this._kind = Kind.Irish;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> irish(Function<IrishAnalyzer.Builder, ObjectBuilder<IrishAnalyzer>> fn) {
			return this.irish(fn.apply(new IrishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> italian(ItalianAnalyzer v) {
			this._kind = Kind.Italian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> italian(Function<ItalianAnalyzer.Builder, ObjectBuilder<ItalianAnalyzer>> fn) {
			return this.italian(fn.apply(new ItalianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> keyword(KeywordAnalyzer v) {
			this._kind = Kind.Keyword;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> keyword(Function<KeywordAnalyzer.Builder, ObjectBuilder<KeywordAnalyzer>> fn) {
			return this.keyword(fn.apply(new KeywordAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> kuromoji(KuromojiAnalyzer v) {
			this._kind = Kind.Kuromoji;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> kuromoji(
				Function<KuromojiAnalyzer.Builder, ObjectBuilder<KuromojiAnalyzer>> fn) {
			return this.kuromoji(fn.apply(new KuromojiAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> language(LanguageAnalyzer v) {
			this._kind = Kind.Language;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> language(
				Function<LanguageAnalyzer.Builder, ObjectBuilder<LanguageAnalyzer>> fn) {
			return this.language(fn.apply(new LanguageAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> latvian(LatvianAnalyzer v) {
			this._kind = Kind.Latvian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> latvian(Function<LatvianAnalyzer.Builder, ObjectBuilder<LatvianAnalyzer>> fn) {
			return this.latvian(fn.apply(new LatvianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> lithuanian(LithuanianAnalyzer v) {
			this._kind = Kind.Lithuanian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> lithuanian(
				Function<LithuanianAnalyzer.Builder, ObjectBuilder<LithuanianAnalyzer>> fn) {
			return this.lithuanian(fn.apply(new LithuanianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> nori(NoriAnalyzer v) {
			this._kind = Kind.Nori;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> nori(Function<NoriAnalyzer.Builder, ObjectBuilder<NoriAnalyzer>> fn) {
			return this.nori(fn.apply(new NoriAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> norwegian(NorwegianAnalyzer v) {
			this._kind = Kind.Norwegian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> norwegian(
				Function<NorwegianAnalyzer.Builder, ObjectBuilder<NorwegianAnalyzer>> fn) {
			return this.norwegian(fn.apply(new NorwegianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> pattern(PatternAnalyzer v) {
			this._kind = Kind.Pattern;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> pattern(Function<PatternAnalyzer.Builder, ObjectBuilder<PatternAnalyzer>> fn) {
			return this.pattern(fn.apply(new PatternAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> persian(PersianAnalyzer v) {
			this._kind = Kind.Persian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> persian(Function<PersianAnalyzer.Builder, ObjectBuilder<PersianAnalyzer>> fn) {
			return this.persian(fn.apply(new PersianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> portuguese(PortugueseAnalyzer v) {
			this._kind = Kind.Portuguese;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> portuguese(
				Function<PortugueseAnalyzer.Builder, ObjectBuilder<PortugueseAnalyzer>> fn) {
			return this.portuguese(fn.apply(new PortugueseAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> romanian(RomanianAnalyzer v) {
			this._kind = Kind.Romanian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> romanian(
				Function<RomanianAnalyzer.Builder, ObjectBuilder<RomanianAnalyzer>> fn) {
			return this.romanian(fn.apply(new RomanianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> russian(RussianAnalyzer v) {
			this._kind = Kind.Russian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> russian(Function<RussianAnalyzer.Builder, ObjectBuilder<RussianAnalyzer>> fn) {
			return this.russian(fn.apply(new RussianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> serbian(SerbianAnalyzer v) {
			this._kind = Kind.Serbian;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> serbian(Function<SerbianAnalyzer.Builder, ObjectBuilder<SerbianAnalyzer>> fn) {
			return this.serbian(fn.apply(new SerbianAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> simple(SimpleAnalyzer v) {
			this._kind = Kind.Simple;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> simple(Function<SimpleAnalyzer.Builder, ObjectBuilder<SimpleAnalyzer>> fn) {
			return this.simple(fn.apply(new SimpleAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> snowball(SnowballAnalyzer v) {
			this._kind = Kind.Snowball;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> snowball(
				Function<SnowballAnalyzer.Builder, ObjectBuilder<SnowballAnalyzer>> fn) {
			return this.snowball(fn.apply(new SnowballAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> sorani(SoraniAnalyzer v) {
			this._kind = Kind.Sorani;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> sorani(Function<SoraniAnalyzer.Builder, ObjectBuilder<SoraniAnalyzer>> fn) {
			return this.sorani(fn.apply(new SoraniAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> spanish(SpanishAnalyzer v) {
			this._kind = Kind.Spanish;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> spanish(Function<SpanishAnalyzer.Builder, ObjectBuilder<SpanishAnalyzer>> fn) {
			return this.spanish(fn.apply(new SpanishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> standard(StandardAnalyzer v) {
			this._kind = Kind.Standard;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> standard(
				Function<StandardAnalyzer.Builder, ObjectBuilder<StandardAnalyzer>> fn) {
			return this.standard(fn.apply(new StandardAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> stop(StopAnalyzer v) {
			this._kind = Kind.Stop;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> stop(Function<StopAnalyzer.Builder, ObjectBuilder<StopAnalyzer>> fn) {
			return this.stop(fn.apply(new StopAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> swedish(SwedishAnalyzer v) {
			this._kind = Kind.Swedish;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> swedish(Function<SwedishAnalyzer.Builder, ObjectBuilder<SwedishAnalyzer>> fn) {
			return this.swedish(fn.apply(new SwedishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> thai(ThaiAnalyzer v) {
			this._kind = Kind.Thai;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> thai(Function<ThaiAnalyzer.Builder, ObjectBuilder<ThaiAnalyzer>> fn) {
			return this.thai(fn.apply(new ThaiAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> turkish(TurkishAnalyzer v) {
			this._kind = Kind.Turkish;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> turkish(Function<TurkishAnalyzer.Builder, ObjectBuilder<TurkishAnalyzer>> fn) {
			return this.turkish(fn.apply(new TurkishAnalyzer.Builder()).build());
		}

		public ObjectBuilder<Analyzer> whitespace(WhitespaceAnalyzer v) {
			this._kind = Kind.Whitespace;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Analyzer> whitespace(
				Function<WhitespaceAnalyzer.Builder, ObjectBuilder<WhitespaceAnalyzer>> fn) {
			return this.whitespace(fn.apply(new WhitespaceAnalyzer.Builder()).build());
		}

		/**
		 * Define this {@code Analyzer} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code Analyzer}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<Analyzer> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public Analyzer build() {
			_checkSingleUse();
			return new Analyzer(this);
		}

	}

	protected static void setupAnalyzerDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::arabic, ArabicAnalyzer._DESERIALIZER, "arabic");
		op.add(Builder::armenian, ArmenianAnalyzer._DESERIALIZER, "armenian");
		op.add(Builder::basque, BasqueAnalyzer._DESERIALIZER, "basque");
		op.add(Builder::bengali, BengaliAnalyzer._DESERIALIZER, "bengali");
		op.add(Builder::brazilian, BrazilianAnalyzer._DESERIALIZER, "brazilian");
		op.add(Builder::bulgarian, BulgarianAnalyzer._DESERIALIZER, "bulgarian");
		op.add(Builder::catalan, CatalanAnalyzer._DESERIALIZER, "catalan");
		op.add(Builder::chinese, ChineseAnalyzer._DESERIALIZER, "chinese");
		op.add(Builder::cjk, CjkAnalyzer._DESERIALIZER, "cjk");
		op.add(Builder::custom, CustomAnalyzer._DESERIALIZER, "custom");
		op.add(Builder::czech, CzechAnalyzer._DESERIALIZER, "czech");
		op.add(Builder::danish, DanishAnalyzer._DESERIALIZER, "danish");
		op.add(Builder::dutch, DutchAnalyzer._DESERIALIZER, "dutch");
		op.add(Builder::english, EnglishAnalyzer._DESERIALIZER, "english");
		op.add(Builder::estonian, EstonianAnalyzer._DESERIALIZER, "estonian");
		op.add(Builder::fingerprint, FingerprintAnalyzer._DESERIALIZER, "fingerprint");
		op.add(Builder::finnish, FinnishAnalyzer._DESERIALIZER, "finnish");
		op.add(Builder::french, FrenchAnalyzer._DESERIALIZER, "french");
		op.add(Builder::galician, GalicianAnalyzer._DESERIALIZER, "galician");
		op.add(Builder::german, GermanAnalyzer._DESERIALIZER, "german");
		op.add(Builder::greek, GreekAnalyzer._DESERIALIZER, "greek");
		op.add(Builder::hindi, HindiAnalyzer._DESERIALIZER, "hindi");
		op.add(Builder::hungarian, HungarianAnalyzer._DESERIALIZER, "hungarian");
		op.add(Builder::icuAnalyzer, IcuAnalyzer._DESERIALIZER, "icu_analyzer");
		op.add(Builder::indonesian, IndonesianAnalyzer._DESERIALIZER, "indonesian");
		op.add(Builder::irish, IrishAnalyzer._DESERIALIZER, "irish");
		op.add(Builder::italian, ItalianAnalyzer._DESERIALIZER, "italian");
		op.add(Builder::keyword, KeywordAnalyzer._DESERIALIZER, "keyword");
		op.add(Builder::kuromoji, KuromojiAnalyzer._DESERIALIZER, "kuromoji");
		op.add(Builder::language, LanguageAnalyzer._DESERIALIZER, "language");
		op.add(Builder::latvian, LatvianAnalyzer._DESERIALIZER, "latvian");
		op.add(Builder::lithuanian, LithuanianAnalyzer._DESERIALIZER, "lithuanian");
		op.add(Builder::nori, NoriAnalyzer._DESERIALIZER, "nori");
		op.add(Builder::norwegian, NorwegianAnalyzer._DESERIALIZER, "norwegian");
		op.add(Builder::pattern, PatternAnalyzer._DESERIALIZER, "pattern");
		op.add(Builder::persian, PersianAnalyzer._DESERIALIZER, "persian");
		op.add(Builder::portuguese, PortugueseAnalyzer._DESERIALIZER, "portuguese");
		op.add(Builder::romanian, RomanianAnalyzer._DESERIALIZER, "romanian");
		op.add(Builder::russian, RussianAnalyzer._DESERIALIZER, "russian");
		op.add(Builder::serbian, SerbianAnalyzer._DESERIALIZER, "serbian");
		op.add(Builder::simple, SimpleAnalyzer._DESERIALIZER, "simple");
		op.add(Builder::snowball, SnowballAnalyzer._DESERIALIZER, "snowball");
		op.add(Builder::sorani, SoraniAnalyzer._DESERIALIZER, "sorani");
		op.add(Builder::spanish, SpanishAnalyzer._DESERIALIZER, "spanish");
		op.add(Builder::standard, StandardAnalyzer._DESERIALIZER, "standard");
		op.add(Builder::stop, StopAnalyzer._DESERIALIZER, "stop");
		op.add(Builder::swedish, SwedishAnalyzer._DESERIALIZER, "swedish");
		op.add(Builder::thai, ThaiAnalyzer._DESERIALIZER, "thai");
		op.add(Builder::turkish, TurkishAnalyzer._DESERIALIZER, "turkish");
		op.add(Builder::whitespace, WhitespaceAnalyzer._DESERIALIZER, "whitespace");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", "custom");

	}

	public static final JsonpDeserializer<Analyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Analyzer::setupAnalyzerDeserializer, Builder::build);
}
