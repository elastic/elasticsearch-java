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

// typedef: _types.analysis.CharFilterDefinition

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.CharFilterDefinition">API
 *      specification</a>
 */
@JsonpDeserializable
public class CharFilterDefinition implements OpenTaggedUnion<CharFilterDefinition.Kind, Object>, JsonpSerializable {

	/**
	 * {@link CharFilterDefinition} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.analysis.CharFilterDefinition">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		HtmlStrip("html_strip"),

		IcuNormalizer("icu_normalizer"),

		KuromojiIterationMark("kuromoji_iteration_mark"),

		Mapping("mapping"),

		PatternReplace("pattern_replace"),

		/** A custom {@code CharFilterDefinition} defined by a plugin */
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

	public CharFilterDefinition(CharFilterDefinitionVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._charFilterDefinitionKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private CharFilterDefinition(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static CharFilterDefinition of(Function<Builder, ObjectBuilder<CharFilterDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code CharFilterDefinition}, given its kind
	 * and some JSON data
	 */
	public CharFilterDefinition(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
	}

	/**
	 * Is this variant instance of kind {@code html_strip}?
	 */
	public boolean isHtmlStrip() {
		return _kind == Kind.HtmlStrip;
	}

	/**
	 * Get the {@code html_strip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code html_strip} kind.
	 */
	public HtmlStripCharFilter htmlStrip() {
		return TaggedUnionUtils.get(this, Kind.HtmlStrip);
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
	public IcuNormalizationCharFilter icuNormalizer() {
		return TaggedUnionUtils.get(this, Kind.IcuNormalizer);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_iteration_mark}?
	 */
	public boolean isKuromojiIterationMark() {
		return _kind == Kind.KuromojiIterationMark;
	}

	/**
	 * Get the {@code kuromoji_iteration_mark} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code kuromoji_iteration_mark} kind.
	 */
	public KuromojiIterationMarkCharFilter kuromojiIterationMark() {
		return TaggedUnionUtils.get(this, Kind.KuromojiIterationMark);
	}

	/**
	 * Is this variant instance of kind {@code mapping}?
	 */
	public boolean isMapping() {
		return _kind == Kind.Mapping;
	}

	/**
	 * Get the {@code mapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code mapping} kind.
	 */
	public MappingCharFilter mapping() {
		return TaggedUnionUtils.get(this, Kind.Mapping);
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
	public PatternReplaceCharFilter patternReplace() {
		return TaggedUnionUtils.get(this, Kind.PatternReplace);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code CharFilterDefinition} defined by a plugin?
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
				ObjectBuilder<CharFilterDefinition> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<CharFilterDefinition> htmlStrip(HtmlStripCharFilter v) {
			this._kind = Kind.HtmlStrip;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CharFilterDefinition> htmlStrip(
				Function<HtmlStripCharFilter.Builder, ObjectBuilder<HtmlStripCharFilter>> fn) {
			return this.htmlStrip(fn.apply(new HtmlStripCharFilter.Builder()).build());
		}

		public ObjectBuilder<CharFilterDefinition> icuNormalizer(IcuNormalizationCharFilter v) {
			this._kind = Kind.IcuNormalizer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CharFilterDefinition> icuNormalizer(
				Function<IcuNormalizationCharFilter.Builder, ObjectBuilder<IcuNormalizationCharFilter>> fn) {
			return this.icuNormalizer(fn.apply(new IcuNormalizationCharFilter.Builder()).build());
		}

		public ObjectBuilder<CharFilterDefinition> kuromojiIterationMark(KuromojiIterationMarkCharFilter v) {
			this._kind = Kind.KuromojiIterationMark;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CharFilterDefinition> kuromojiIterationMark(
				Function<KuromojiIterationMarkCharFilter.Builder, ObjectBuilder<KuromojiIterationMarkCharFilter>> fn) {
			return this.kuromojiIterationMark(fn.apply(new KuromojiIterationMarkCharFilter.Builder()).build());
		}

		public ObjectBuilder<CharFilterDefinition> mapping(MappingCharFilter v) {
			this._kind = Kind.Mapping;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CharFilterDefinition> mapping(
				Function<MappingCharFilter.Builder, ObjectBuilder<MappingCharFilter>> fn) {
			return this.mapping(fn.apply(new MappingCharFilter.Builder()).build());
		}

		public ObjectBuilder<CharFilterDefinition> patternReplace(PatternReplaceCharFilter v) {
			this._kind = Kind.PatternReplace;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CharFilterDefinition> patternReplace(
				Function<PatternReplaceCharFilter.Builder, ObjectBuilder<PatternReplaceCharFilter>> fn) {
			return this.patternReplace(fn.apply(new PatternReplaceCharFilter.Builder()).build());
		}

		/**
		 * Define this {@code CharFilterDefinition} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code CharFilterDefinition}. It is
		 *            converted internally to {@link JsonData}.
		 */
		public ObjectBuilder<CharFilterDefinition> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
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

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<CharFilterDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CharFilterDefinition::setupCharFilterDefinitionDeserializer, Builder::build);
}
