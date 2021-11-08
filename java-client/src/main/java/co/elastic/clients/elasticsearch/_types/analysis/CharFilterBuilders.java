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
 * Builders for {@link CharFilter} variants.
 */
public class CharFilterBuilders {
	private CharFilterBuilders() {
	}

	/**
	 * Creates a builder for the {@link HtmlStripCharFilter html_strip}
	 * {@code CharFilter} variant.
	 */
	public static HtmlStripCharFilter.Builder htmlStrip() {
		return new HtmlStripCharFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link IcuNormalizationCharFilter icu_normalizer}
	 * {@code CharFilter} variant.
	 */
	public static IcuNormalizationCharFilter.Builder icuNormalizer() {
		return new IcuNormalizationCharFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link KuromojiIterationMarkCharFilter
	 * kuromoji_iteration_mark} {@code CharFilter} variant.
	 */
	public static KuromojiIterationMarkCharFilter.Builder kuromojiIterationMark() {
		return new KuromojiIterationMarkCharFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link MappingCharFilter mapping}
	 * {@code CharFilter} variant.
	 */
	public static MappingCharFilter.Builder mapping() {
		return new MappingCharFilter.Builder();
	}

	/**
	 * Creates a builder for the {@link PatternReplaceCharFilter pattern_replace}
	 * {@code CharFilter} variant.
	 */
	public static PatternReplaceCharFilter.Builder patternReplace() {
		return new PatternReplaceCharFilter.Builder();
	}

}
