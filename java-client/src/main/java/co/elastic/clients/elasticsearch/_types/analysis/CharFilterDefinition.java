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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.CharFilterDefinition
// union type: InternalTag[tag=type]
@JsonpDeserializable
public class CharFilterDefinition implements TaggedUnion<CharFilterDefinitionVariant>, JsonpSerializable {

	public static final String HTML_STRIP = "html_strip";
	public static final String ICU_NORMALIZER = "icu_normalizer";
	public static final String KUROMOJI_ITERATION_MARK = "kuromoji_iteration_mark";
	public static final String MAPPING = "mapping";
	public static final String PATTERN_REPLACE = "pattern_replace";

	private final String _type;
	private final CharFilterDefinitionVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final CharFilterDefinitionVariant _get() {
		return _value;
	}

	public CharFilterDefinition(CharFilterDefinitionVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private CharFilterDefinition(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CharFilterDefinition of(Function<Builder, ObjectBuilder<CharFilterDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code html_strip}?
	 */
	public boolean _isHtmlStrip() {
		return HTML_STRIP.equals(_type());
	}

	/**
	 * Get the {@code html_strip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code html_strip} kind.
	 */
	public HtmlStripCharFilter htmlStrip() {
		return TaggedUnionUtils.get(this, HTML_STRIP);
	}

	/**
	 * Is this variant instance of kind {@code icu_normalizer}?
	 */
	public boolean _isIcuNormalizer() {
		return ICU_NORMALIZER.equals(_type());
	}

	/**
	 * Get the {@code icu_normalizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_normalizer} kind.
	 */
	public IcuNormalizationCharFilter icuNormalizer() {
		return TaggedUnionUtils.get(this, ICU_NORMALIZER);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_iteration_mark}?
	 */
	public boolean _isKuromojiIterationMark() {
		return KUROMOJI_ITERATION_MARK.equals(_type());
	}

	/**
	 * Get the {@code kuromoji_iteration_mark} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code kuromoji_iteration_mark} kind.
	 */
	public KuromojiIterationMarkCharFilter kuromojiIterationMark() {
		return TaggedUnionUtils.get(this, KUROMOJI_ITERATION_MARK);
	}

	/**
	 * Is this variant instance of kind {@code mapping}?
	 */
	public boolean _isMapping() {
		return MAPPING.equals(_type());
	}

	/**
	 * Get the {@code mapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code mapping} kind.
	 */
	public MappingCharFilter mapping() {
		return TaggedUnionUtils.get(this, MAPPING);
	}

	/**
	 * Is this variant instance of kind {@code pattern_replace}?
	 */
	public boolean _isPatternReplace() {
		return PATTERN_REPLACE.equals(_type());
	}

	/**
	 * Get the {@code pattern_replace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern_replace}
	 *             kind.
	 */
	public PatternReplaceCharFilter patternReplace() {
		return TaggedUnionUtils.get(this, PATTERN_REPLACE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CharFilterDefinition> {
		private String _type;
		private CharFilterDefinitionVariant _value;

		public Builder htmlStrip(HtmlStripCharFilter v) {
			this._type = HTML_STRIP;
			this._value = v;
			return this;
		}

		public Builder htmlStrip(Function<HtmlStripCharFilter.Builder, ObjectBuilder<HtmlStripCharFilter>> f) {
			return this.htmlStrip(f.apply(new HtmlStripCharFilter.Builder()).build());
		}

		public Builder icuNormalizer(IcuNormalizationCharFilter v) {
			this._type = ICU_NORMALIZER;
			this._value = v;
			return this;
		}

		public Builder icuNormalizer(
				Function<IcuNormalizationCharFilter.Builder, ObjectBuilder<IcuNormalizationCharFilter>> f) {
			return this.icuNormalizer(f.apply(new IcuNormalizationCharFilter.Builder()).build());
		}

		public Builder kuromojiIterationMark(KuromojiIterationMarkCharFilter v) {
			this._type = KUROMOJI_ITERATION_MARK;
			this._value = v;
			return this;
		}

		public Builder kuromojiIterationMark(
				Function<KuromojiIterationMarkCharFilter.Builder, ObjectBuilder<KuromojiIterationMarkCharFilter>> f) {
			return this.kuromojiIterationMark(f.apply(new KuromojiIterationMarkCharFilter.Builder()).build());
		}

		public Builder mapping(MappingCharFilter v) {
			this._type = MAPPING;
			this._value = v;
			return this;
		}

		public Builder mapping(Function<MappingCharFilter.Builder, ObjectBuilder<MappingCharFilter>> f) {
			return this.mapping(f.apply(new MappingCharFilter.Builder()).build());
		}

		public Builder patternReplace(PatternReplaceCharFilter v) {
			this._type = PATTERN_REPLACE;
			this._value = v;
			return this;
		}

		public Builder patternReplace(
				Function<PatternReplaceCharFilter.Builder, ObjectBuilder<PatternReplaceCharFilter>> f) {
			return this.patternReplace(f.apply(new PatternReplaceCharFilter.Builder()).build());
		}

		public CharFilterDefinition build() {
			_checkSingleUse();
			return new CharFilterDefinition(this);
		}

	}

	protected static void setupCharFilterDefinitionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::htmlStrip, HtmlStripCharFilter._DESERIALIZER, "html_strip");
		op.add(Builder::icuNormalizer, IcuNormalizationCharFilter._DESERIALIZER, "icu_normalizer");
		op.add(Builder::kuromojiIterationMark, KuromojiIterationMarkCharFilter._DESERIALIZER,
				"kuromoji_iteration_mark");
		op.add(Builder::mapping, MappingCharFilter._DESERIALIZER, "mapping");
		op.add(Builder::patternReplace, PatternReplaceCharFilter._DESERIALIZER, "pattern_replace");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<CharFilterDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CharFilterDefinition::setupCharFilterDefinitionDeserializer, Builder::build);
}
