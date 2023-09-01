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
 * Builders for {@link CharFilterDefinition} variants.
 */
public class CharFilterDefinitionBuilders {
	private CharFilterDefinitionBuilders() {
	}

	/**
	 * Creates a builder for the {@link HtmlStripCharFilter html_strip}
	 * {@code CharFilterDefinition} variant.
	 */
	public static HtmlStripCharFilter.Builder htmlStrip() {
		return new HtmlStripCharFilter.Builder();
	}

	/**
	 * Creates a CharFilterDefinition of the {@link HtmlStripCharFilter html_strip}
	 * {@code CharFilterDefinition} variant.
	 */
	public static CharFilterDefinition htmlStrip(
			Function<HtmlStripCharFilter.Builder, ObjectBuilder<HtmlStripCharFilter>> fn) {
		CharFilterDefinition.Builder builder = new CharFilterDefinition.Builder();
		builder.htmlStrip(fn.apply(new HtmlStripCharFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IcuNormalizationCharFilter icu_normalizer}
	 * {@code CharFilterDefinition} variant.
	 */
	public static IcuNormalizationCharFilter.Builder icuNormalizer() {
		return new IcuNormalizationCharFilter.Builder();
	}

	/**
	 * Creates a CharFilterDefinition of the {@link IcuNormalizationCharFilter
	 * icu_normalizer} {@code CharFilterDefinition} variant.
	 */
	public static CharFilterDefinition icuNormalizer(
			Function<IcuNormalizationCharFilter.Builder, ObjectBuilder<IcuNormalizationCharFilter>> fn) {
		CharFilterDefinition.Builder builder = new CharFilterDefinition.Builder();
		builder.icuNormalizer(fn.apply(new IcuNormalizationCharFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link KuromojiIterationMarkCharFilter
	 * kuromoji_iteration_mark} {@code CharFilterDefinition} variant.
	 */
	public static KuromojiIterationMarkCharFilter.Builder kuromojiIterationMark() {
		return new KuromojiIterationMarkCharFilter.Builder();
	}

	/**
	 * Creates a CharFilterDefinition of the {@link KuromojiIterationMarkCharFilter
	 * kuromoji_iteration_mark} {@code CharFilterDefinition} variant.
	 */
	public static CharFilterDefinition kuromojiIterationMark(
			Function<KuromojiIterationMarkCharFilter.Builder, ObjectBuilder<KuromojiIterationMarkCharFilter>> fn) {
		CharFilterDefinition.Builder builder = new CharFilterDefinition.Builder();
		builder.kuromojiIterationMark(fn.apply(new KuromojiIterationMarkCharFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MappingCharFilter mapping}
	 * {@code CharFilterDefinition} variant.
	 */
	public static MappingCharFilter.Builder mapping() {
		return new MappingCharFilter.Builder();
	}

	/**
	 * Creates a CharFilterDefinition of the {@link MappingCharFilter mapping}
	 * {@code CharFilterDefinition} variant.
	 */
	public static CharFilterDefinition mapping(
			Function<MappingCharFilter.Builder, ObjectBuilder<MappingCharFilter>> fn) {
		CharFilterDefinition.Builder builder = new CharFilterDefinition.Builder();
		builder.mapping(fn.apply(new MappingCharFilter.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PatternReplaceCharFilter pattern_replace}
	 * {@code CharFilterDefinition} variant.
	 */
	public static PatternReplaceCharFilter.Builder patternReplace() {
		return new PatternReplaceCharFilter.Builder();
	}

	/**
	 * Creates a CharFilterDefinition of the {@link PatternReplaceCharFilter
	 * pattern_replace} {@code CharFilterDefinition} variant.
	 */
	public static CharFilterDefinition patternReplace(
			Function<PatternReplaceCharFilter.Builder, ObjectBuilder<PatternReplaceCharFilter>> fn) {
		CharFilterDefinition.Builder builder = new CharFilterDefinition.Builder();
		builder.patternReplace(fn.apply(new PatternReplaceCharFilter.Builder()).build());
		return builder.build();
	}

}
