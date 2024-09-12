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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

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

/**
 * Builders for {@link Analyzer} variants.
 */
public class AnalyzerBuilders {
	private AnalyzerBuilders() {
	}

	/**
	 * Creates a builder for the {@link ArabicAnalyzer arabic} {@code Analyzer}
	 * variant.
	 */
	public static ArabicAnalyzer.Builder arabic() {
		return new ArabicAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link ArabicAnalyzer arabic} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer arabic(Function<ArabicAnalyzer.Builder, ObjectBuilder<ArabicAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.arabic(fn.apply(new ArabicAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ArmenianAnalyzer armenian} {@code Analyzer}
	 * variant.
	 */
	public static ArmenianAnalyzer.Builder armenian() {
		return new ArmenianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link ArmenianAnalyzer armenian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer armenian(Function<ArmenianAnalyzer.Builder, ObjectBuilder<ArmenianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.armenian(fn.apply(new ArmenianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BasqueAnalyzer basque} {@code Analyzer}
	 * variant.
	 */
	public static BasqueAnalyzer.Builder basque() {
		return new BasqueAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link BasqueAnalyzer basque} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer basque(Function<BasqueAnalyzer.Builder, ObjectBuilder<BasqueAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.basque(fn.apply(new BasqueAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BengaliAnalyzer bengali} {@code Analyzer}
	 * variant.
	 */
	public static BengaliAnalyzer.Builder bengali() {
		return new BengaliAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link BengaliAnalyzer bengali} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer bengali(Function<BengaliAnalyzer.Builder, ObjectBuilder<BengaliAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.bengali(fn.apply(new BengaliAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BrazilianAnalyzer brazilian}
	 * {@code Analyzer} variant.
	 */
	public static BrazilianAnalyzer.Builder brazilian() {
		return new BrazilianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link BrazilianAnalyzer brazilian}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer brazilian(Function<BrazilianAnalyzer.Builder, ObjectBuilder<BrazilianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.brazilian(fn.apply(new BrazilianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BulgarianAnalyzer bulgarian}
	 * {@code Analyzer} variant.
	 */
	public static BulgarianAnalyzer.Builder bulgarian() {
		return new BulgarianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link BulgarianAnalyzer bulgarian}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer bulgarian(Function<BulgarianAnalyzer.Builder, ObjectBuilder<BulgarianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.bulgarian(fn.apply(new BulgarianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CatalanAnalyzer catalan} {@code Analyzer}
	 * variant.
	 */
	public static CatalanAnalyzer.Builder catalan() {
		return new CatalanAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link CatalanAnalyzer catalan} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer catalan(Function<CatalanAnalyzer.Builder, ObjectBuilder<CatalanAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.catalan(fn.apply(new CatalanAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ChineseAnalyzer chinese} {@code Analyzer}
	 * variant.
	 */
	public static ChineseAnalyzer.Builder chinese() {
		return new ChineseAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link ChineseAnalyzer chinese} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer chinese(Function<ChineseAnalyzer.Builder, ObjectBuilder<ChineseAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.chinese(fn.apply(new ChineseAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CjkAnalyzer cjk} {@code Analyzer} variant.
	 */
	public static CjkAnalyzer.Builder cjk() {
		return new CjkAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link CjkAnalyzer cjk} {@code Analyzer} variant.
	 */
	public static Analyzer cjk(Function<CjkAnalyzer.Builder, ObjectBuilder<CjkAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.cjk(fn.apply(new CjkAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CustomAnalyzer custom} {@code Analyzer}
	 * variant.
	 */
	public static CustomAnalyzer.Builder custom() {
		return new CustomAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link CustomAnalyzer custom} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer custom(Function<CustomAnalyzer.Builder, ObjectBuilder<CustomAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.custom(fn.apply(new CustomAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CzechAnalyzer czech} {@code Analyzer}
	 * variant.
	 */
	public static CzechAnalyzer.Builder czech() {
		return new CzechAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link CzechAnalyzer czech} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer czech(Function<CzechAnalyzer.Builder, ObjectBuilder<CzechAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.czech(fn.apply(new CzechAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DanishAnalyzer danish} {@code Analyzer}
	 * variant.
	 */
	public static DanishAnalyzer.Builder danish() {
		return new DanishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link DanishAnalyzer danish} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer danish(Function<DanishAnalyzer.Builder, ObjectBuilder<DanishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.danish(fn.apply(new DanishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DutchAnalyzer dutch} {@code Analyzer}
	 * variant.
	 */
	public static DutchAnalyzer.Builder dutch() {
		return new DutchAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link DutchAnalyzer dutch} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer dutch(Function<DutchAnalyzer.Builder, ObjectBuilder<DutchAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.dutch(fn.apply(new DutchAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link EnglishAnalyzer english} {@code Analyzer}
	 * variant.
	 */
	public static EnglishAnalyzer.Builder english() {
		return new EnglishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link EnglishAnalyzer english} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer english(Function<EnglishAnalyzer.Builder, ObjectBuilder<EnglishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.english(fn.apply(new EnglishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link EstonianAnalyzer estonian} {@code Analyzer}
	 * variant.
	 */
	public static EstonianAnalyzer.Builder estonian() {
		return new EstonianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link EstonianAnalyzer estonian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer estonian(Function<EstonianAnalyzer.Builder, ObjectBuilder<EstonianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.estonian(fn.apply(new EstonianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FingerprintAnalyzer fingerprint}
	 * {@code Analyzer} variant.
	 */
	public static FingerprintAnalyzer.Builder fingerprint() {
		return new FingerprintAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link FingerprintAnalyzer fingerprint}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer fingerprint(Function<FingerprintAnalyzer.Builder, ObjectBuilder<FingerprintAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.fingerprint(fn.apply(new FingerprintAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FinnishAnalyzer finnish} {@code Analyzer}
	 * variant.
	 */
	public static FinnishAnalyzer.Builder finnish() {
		return new FinnishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link FinnishAnalyzer finnish} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer finnish(Function<FinnishAnalyzer.Builder, ObjectBuilder<FinnishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.finnish(fn.apply(new FinnishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FrenchAnalyzer french} {@code Analyzer}
	 * variant.
	 */
	public static FrenchAnalyzer.Builder french() {
		return new FrenchAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link FrenchAnalyzer french} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer french(Function<FrenchAnalyzer.Builder, ObjectBuilder<FrenchAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.french(fn.apply(new FrenchAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GalicianAnalyzer galician} {@code Analyzer}
	 * variant.
	 */
	public static GalicianAnalyzer.Builder galician() {
		return new GalicianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link GalicianAnalyzer galician} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer galician(Function<GalicianAnalyzer.Builder, ObjectBuilder<GalicianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.galician(fn.apply(new GalicianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GermanAnalyzer german} {@code Analyzer}
	 * variant.
	 */
	public static GermanAnalyzer.Builder german() {
		return new GermanAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link GermanAnalyzer german} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer german(Function<GermanAnalyzer.Builder, ObjectBuilder<GermanAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.german(fn.apply(new GermanAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GreekAnalyzer greek} {@code Analyzer}
	 * variant.
	 */
	public static GreekAnalyzer.Builder greek() {
		return new GreekAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link GreekAnalyzer greek} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer greek(Function<GreekAnalyzer.Builder, ObjectBuilder<GreekAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.greek(fn.apply(new GreekAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HindiAnalyzer hindi} {@code Analyzer}
	 * variant.
	 */
	public static HindiAnalyzer.Builder hindi() {
		return new HindiAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link HindiAnalyzer hindi} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer hindi(Function<HindiAnalyzer.Builder, ObjectBuilder<HindiAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.hindi(fn.apply(new HindiAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HungarianAnalyzer hungarian}
	 * {@code Analyzer} variant.
	 */
	public static HungarianAnalyzer.Builder hungarian() {
		return new HungarianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link HungarianAnalyzer hungarian}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer hungarian(Function<HungarianAnalyzer.Builder, ObjectBuilder<HungarianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.hungarian(fn.apply(new HungarianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuAnalyzer icu_analyzer} {@code Analyzer}
	 * variant.
	 */
	public static IcuAnalyzer.Builder icuAnalyzer() {
		return new IcuAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link IcuAnalyzer icu_analyzer} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer icuAnalyzer(Function<IcuAnalyzer.Builder, ObjectBuilder<IcuAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.icuAnalyzer(fn.apply(new IcuAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IndonesianAnalyzer indonesian}
	 * {@code Analyzer} variant.
	 */
	public static IndonesianAnalyzer.Builder indonesian() {
		return new IndonesianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link IndonesianAnalyzer indonesian}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer indonesian(Function<IndonesianAnalyzer.Builder, ObjectBuilder<IndonesianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.indonesian(fn.apply(new IndonesianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IrishAnalyzer irish} {@code Analyzer}
	 * variant.
	 */
	public static IrishAnalyzer.Builder irish() {
		return new IrishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link IrishAnalyzer irish} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer irish(Function<IrishAnalyzer.Builder, ObjectBuilder<IrishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.irish(fn.apply(new IrishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ItalianAnalyzer italian} {@code Analyzer}
	 * variant.
	 */
	public static ItalianAnalyzer.Builder italian() {
		return new ItalianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link ItalianAnalyzer italian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer italian(Function<ItalianAnalyzer.Builder, ObjectBuilder<ItalianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.italian(fn.apply(new ItalianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KeywordAnalyzer keyword} {@code Analyzer}
	 * variant.
	 */
	public static KeywordAnalyzer.Builder keyword() {
		return new KeywordAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link KeywordAnalyzer keyword} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer keyword(Function<KeywordAnalyzer.Builder, ObjectBuilder<KeywordAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.keyword(fn.apply(new KeywordAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KuromojiAnalyzer kuromoji} {@code Analyzer}
	 * variant.
	 */
	public static KuromojiAnalyzer.Builder kuromoji() {
		return new KuromojiAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link KuromojiAnalyzer kuromoji} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer kuromoji(Function<KuromojiAnalyzer.Builder, ObjectBuilder<KuromojiAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.kuromoji(fn.apply(new KuromojiAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LanguageAnalyzer language} {@code Analyzer}
	 * variant.
	 */
	public static LanguageAnalyzer.Builder language() {
		return new LanguageAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link LanguageAnalyzer language} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer language(Function<LanguageAnalyzer.Builder, ObjectBuilder<LanguageAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.language(fn.apply(new LanguageAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LatvianAnalyzer latvian} {@code Analyzer}
	 * variant.
	 */
	public static LatvianAnalyzer.Builder latvian() {
		return new LatvianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link LatvianAnalyzer latvian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer latvian(Function<LatvianAnalyzer.Builder, ObjectBuilder<LatvianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.latvian(fn.apply(new LatvianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LithuanianAnalyzer lithuanian}
	 * {@code Analyzer} variant.
	 */
	public static LithuanianAnalyzer.Builder lithuanian() {
		return new LithuanianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link LithuanianAnalyzer lithuanian}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer lithuanian(Function<LithuanianAnalyzer.Builder, ObjectBuilder<LithuanianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.lithuanian(fn.apply(new LithuanianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NoriAnalyzer nori} {@code Analyzer} variant.
	 */
	public static NoriAnalyzer.Builder nori() {
		return new NoriAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link NoriAnalyzer nori} {@code Analyzer} variant.
	 */
	public static Analyzer nori(Function<NoriAnalyzer.Builder, ObjectBuilder<NoriAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.nori(fn.apply(new NoriAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NorwegianAnalyzer norwegian}
	 * {@code Analyzer} variant.
	 */
	public static NorwegianAnalyzer.Builder norwegian() {
		return new NorwegianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link NorwegianAnalyzer norwegian}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer norwegian(Function<NorwegianAnalyzer.Builder, ObjectBuilder<NorwegianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.norwegian(fn.apply(new NorwegianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PatternAnalyzer pattern} {@code Analyzer}
	 * variant.
	 */
	public static PatternAnalyzer.Builder pattern() {
		return new PatternAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link PatternAnalyzer pattern} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer pattern(Function<PatternAnalyzer.Builder, ObjectBuilder<PatternAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.pattern(fn.apply(new PatternAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PersianAnalyzer persian} {@code Analyzer}
	 * variant.
	 */
	public static PersianAnalyzer.Builder persian() {
		return new PersianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link PersianAnalyzer persian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer persian(Function<PersianAnalyzer.Builder, ObjectBuilder<PersianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.persian(fn.apply(new PersianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PortugueseAnalyzer portuguese}
	 * {@code Analyzer} variant.
	 */
	public static PortugueseAnalyzer.Builder portuguese() {
		return new PortugueseAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link PortugueseAnalyzer portuguese}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer portuguese(Function<PortugueseAnalyzer.Builder, ObjectBuilder<PortugueseAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.portuguese(fn.apply(new PortugueseAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RomanianAnalyzer romanian} {@code Analyzer}
	 * variant.
	 */
	public static RomanianAnalyzer.Builder romanian() {
		return new RomanianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link RomanianAnalyzer romanian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer romanian(Function<RomanianAnalyzer.Builder, ObjectBuilder<RomanianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.romanian(fn.apply(new RomanianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RussianAnalyzer russian} {@code Analyzer}
	 * variant.
	 */
	public static RussianAnalyzer.Builder russian() {
		return new RussianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link RussianAnalyzer russian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer russian(Function<RussianAnalyzer.Builder, ObjectBuilder<RussianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.russian(fn.apply(new RussianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SerbianAnalyzer serbian} {@code Analyzer}
	 * variant.
	 */
	public static SerbianAnalyzer.Builder serbian() {
		return new SerbianAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link SerbianAnalyzer serbian} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer serbian(Function<SerbianAnalyzer.Builder, ObjectBuilder<SerbianAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.serbian(fn.apply(new SerbianAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleAnalyzer simple} {@code Analyzer}
	 * variant.
	 */
	public static SimpleAnalyzer.Builder simple() {
		return new SimpleAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link SimpleAnalyzer simple} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer simple(Function<SimpleAnalyzer.Builder, ObjectBuilder<SimpleAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.simple(fn.apply(new SimpleAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SnowballAnalyzer snowball} {@code Analyzer}
	 * variant.
	 */
	public static SnowballAnalyzer.Builder snowball() {
		return new SnowballAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link SnowballAnalyzer snowball} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer snowball(Function<SnowballAnalyzer.Builder, ObjectBuilder<SnowballAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.snowball(fn.apply(new SnowballAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SoraniAnalyzer sorani} {@code Analyzer}
	 * variant.
	 */
	public static SoraniAnalyzer.Builder sorani() {
		return new SoraniAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link SoraniAnalyzer sorani} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer sorani(Function<SoraniAnalyzer.Builder, ObjectBuilder<SoraniAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.sorani(fn.apply(new SoraniAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanishAnalyzer spanish} {@code Analyzer}
	 * variant.
	 */
	public static SpanishAnalyzer.Builder spanish() {
		return new SpanishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link SpanishAnalyzer spanish} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer spanish(Function<SpanishAnalyzer.Builder, ObjectBuilder<SpanishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.spanish(fn.apply(new SpanishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StandardAnalyzer standard} {@code Analyzer}
	 * variant.
	 */
	public static StandardAnalyzer.Builder standard() {
		return new StandardAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link StandardAnalyzer standard} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer standard(Function<StandardAnalyzer.Builder, ObjectBuilder<StandardAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.standard(fn.apply(new StandardAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StopAnalyzer stop} {@code Analyzer} variant.
	 */
	public static StopAnalyzer.Builder stop() {
		return new StopAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link StopAnalyzer stop} {@code Analyzer} variant.
	 */
	public static Analyzer stop(Function<StopAnalyzer.Builder, ObjectBuilder<StopAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.stop(fn.apply(new StopAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SwedishAnalyzer swedish} {@code Analyzer}
	 * variant.
	 */
	public static SwedishAnalyzer.Builder swedish() {
		return new SwedishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link SwedishAnalyzer swedish} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer swedish(Function<SwedishAnalyzer.Builder, ObjectBuilder<SwedishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.swedish(fn.apply(new SwedishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ThaiAnalyzer thai} {@code Analyzer} variant.
	 */
	public static ThaiAnalyzer.Builder thai() {
		return new ThaiAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link ThaiAnalyzer thai} {@code Analyzer} variant.
	 */
	public static Analyzer thai(Function<ThaiAnalyzer.Builder, ObjectBuilder<ThaiAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.thai(fn.apply(new ThaiAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TurkishAnalyzer turkish} {@code Analyzer}
	 * variant.
	 */
	public static TurkishAnalyzer.Builder turkish() {
		return new TurkishAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link TurkishAnalyzer turkish} {@code Analyzer}
	 * variant.
	 */
	public static Analyzer turkish(Function<TurkishAnalyzer.Builder, ObjectBuilder<TurkishAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.turkish(fn.apply(new TurkishAnalyzer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WhitespaceAnalyzer whitespace}
	 * {@code Analyzer} variant.
	 */
	public static WhitespaceAnalyzer.Builder whitespace() {
		return new WhitespaceAnalyzer.Builder();
	}

	/**
	 * Creates a Analyzer of the {@link WhitespaceAnalyzer whitespace}
	 * {@code Analyzer} variant.
	 */
	public static Analyzer whitespace(Function<WhitespaceAnalyzer.Builder, ObjectBuilder<WhitespaceAnalyzer>> fn) {
		Analyzer.Builder builder = new Analyzer.Builder();
		builder.whitespace(fn.apply(new WhitespaceAnalyzer.Builder()).build());
		return builder.build();
	}

}
