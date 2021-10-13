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

// typedef: _types.analysis.CharFilter
@JsonpDeserializable
public class CharFilter implements TaggedUnion<JsonpSerializable>, JsonpSerializable {

	public static final String HTML_STRIP = "html_strip";
	public static final String MAPPING = "mapping";
	public static final String PATTERN_REPLACE = "pattern_replace";

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

	public CharFilter(CharFilterVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends CharFilterVariant> CharFilter(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private CharFilter(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public CharFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
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
	 * Get the {@code mapping} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code mapping} kind.
	 */
	public MappingCharFilter mapping() {
		return TaggedUnionUtils.get(this, MAPPING);
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

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		_value.serialize(generator, mapper);

	}

	public static class Builder implements ObjectBuilder<CharFilter> {
		private String _type;
		private JsonpSerializable _value;

		public Builder htmlStrip(HtmlStripCharFilter v) {
			this._type = HTML_STRIP;
			this._value = v;
			return this;
		}

		public Builder htmlStrip(Function<HtmlStripCharFilter.Builder, ObjectBuilder<HtmlStripCharFilter>> f) {
			return this.htmlStrip(f.apply(new HtmlStripCharFilter.Builder()).build());
		}

		public Builder mapping(MappingCharFilter v) {
			this._type = MAPPING;
			this._value = v;
			return this;
		}

		public Builder mapping(Function<MappingCharFilter.Builder, ObjectBuilder<MappingCharFilter>> f) {
			return this.mapping(f.apply(new MappingCharFilter.Builder()).build());
		}

		public Builder patternReplace(PatternReplaceTokenFilter v) {
			this._type = PATTERN_REPLACE;
			this._value = v;
			return this;
		}

		public Builder patternReplace(
				Function<PatternReplaceTokenFilter.Builder, ObjectBuilder<PatternReplaceTokenFilter>> f) {
			return this.patternReplace(f.apply(new PatternReplaceTokenFilter.Builder()).build());
		}

		public CharFilter build() {
			return new CharFilter(this);
		}

	}

	protected static void setupCharFilterDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::htmlStrip, HtmlStripCharFilter._DESERIALIZER, "html_strip");
		op.add(Builder::mapping, MappingCharFilter._DESERIALIZER, "mapping");
		op.add(Builder::patternReplace, PatternReplaceTokenFilter._DESERIALIZER, "pattern_replace");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<CharFilter> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			CharFilter::setupCharFilterDeserializer, Builder::build);
}
