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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Analyzer} variants.
 */
public class AnalyzerBuilders {
	private AnalyzerBuilders() {
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
