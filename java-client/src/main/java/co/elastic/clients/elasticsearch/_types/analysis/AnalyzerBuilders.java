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
	 * Creates a builder for the {@link DutchAnalyzer dutch} {@code Analyzer}
	 * variant.
	 */
	public static DutchAnalyzer.Builder dutch() {
		return new DutchAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link FingerprintAnalyzer fingerprint}
	 * {@code Analyzer} variant.
	 */
	public static FingerprintAnalyzer.Builder fingerprint() {
		return new FingerprintAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuAnalyzer icu_analyzer} {@code Analyzer}
	 * variant.
	 */
	public static IcuAnalyzer.Builder icuAnalyzer() {
		return new IcuAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link KeywordAnalyzer keyword} {@code Analyzer}
	 * variant.
	 */
	public static KeywordAnalyzer.Builder keyword() {
		return new KeywordAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link KuromojiAnalyzer kuromoji} {@code Analyzer}
	 * variant.
	 */
	public static KuromojiAnalyzer.Builder kuromoji() {
		return new KuromojiAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link LanguageAnalyzer language} {@code Analyzer}
	 * variant.
	 */
	public static LanguageAnalyzer.Builder language() {
		return new LanguageAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link NoriAnalyzer nori} {@code Analyzer} variant.
	 */
	public static NoriAnalyzer.Builder nori() {
		return new NoriAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link PatternAnalyzer pattern} {@code Analyzer}
	 * variant.
	 */
	public static PatternAnalyzer.Builder pattern() {
		return new PatternAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link SimpleAnalyzer simple} {@code Analyzer}
	 * variant.
	 */
	public static SimpleAnalyzer.Builder simple() {
		return new SimpleAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link SnowballAnalyzer snowball} {@code Analyzer}
	 * variant.
	 */
	public static SnowballAnalyzer.Builder snowball() {
		return new SnowballAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link StandardAnalyzer standard} {@code Analyzer}
	 * variant.
	 */
	public static StandardAnalyzer.Builder standard() {
		return new StandardAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link StopAnalyzer stop} {@code Analyzer} variant.
	 */
	public static StopAnalyzer.Builder stop() {
		return new StopAnalyzer.Builder();
	}

	/**
	 * Creates a builder for the {@link WhitespaceAnalyzer whitespace}
	 * {@code Analyzer} variant.
	 */
	public static WhitespaceAnalyzer.Builder whitespace() {
		return new WhitespaceAnalyzer.Builder();
	}

}
