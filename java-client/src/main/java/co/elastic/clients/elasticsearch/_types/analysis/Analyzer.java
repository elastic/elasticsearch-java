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

// typedef: _types.analysis.Analyzer
@JsonpDeserializable
public class Analyzer implements TaggedUnion<AnalyzerVariant>, JsonpSerializable {

	public static final String CUSTOM = "custom";
	public static final String DUTCH = "dutch";
	public static final String FINGERPRINT = "fingerprint";
	public static final String ICU_ANALYZER = "icu_analyzer";
	public static final String KEYWORD = "keyword";
	public static final String KUROMOJI = "kuromoji";
	public static final String LANGUAGE = "language";
	public static final String NORI = "nori";
	public static final String PATTERN = "pattern";
	public static final String SIMPLE = "simple";
	public static final String SNOWBALL = "snowball";
	public static final String STANDARD = "standard";
	public static final String STOP = "stop";
	public static final String WHITESPACE = "whitespace";

	// Tagged union implementation

	private final String _type;
	private final AnalyzerVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final AnalyzerVariant _get() {
		return _value;
	}

	public Analyzer(AnalyzerVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Analyzer(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Analyzer of(Function<Builder, ObjectBuilder<Analyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code custom} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code custom} kind.
	 */
	public CustomAnalyzer custom() {
		return TaggedUnionUtils.get(this, CUSTOM);
	}

	/**
	 * Get the {@code dutch} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dutch} kind.
	 */
	public DutchAnalyzer dutch() {
		return TaggedUnionUtils.get(this, DUTCH);
	}

	/**
	 * Get the {@code fingerprint} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fingerprint} kind.
	 */
	public FingerprintAnalyzer fingerprint() {
		return TaggedUnionUtils.get(this, FINGERPRINT);
	}

	/**
	 * Get the {@code icu_analyzer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_analyzer} kind.
	 */
	public IcuAnalyzer icuAnalyzer() {
		return TaggedUnionUtils.get(this, ICU_ANALYZER);
	}

	/**
	 * Get the {@code keyword} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword} kind.
	 */
	public KeywordAnalyzer keyword() {
		return TaggedUnionUtils.get(this, KEYWORD);
	}

	/**
	 * Get the {@code kuromoji} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji} kind.
	 */
	public KuromojiAnalyzer kuromoji() {
		return TaggedUnionUtils.get(this, KUROMOJI);
	}

	/**
	 * Get the {@code language} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code language} kind.
	 */
	public LanguageAnalyzer language() {
		return TaggedUnionUtils.get(this, LANGUAGE);
	}

	/**
	 * Get the {@code nori} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori} kind.
	 */
	public NoriAnalyzer nori() {
		return TaggedUnionUtils.get(this, NORI);
	}

	/**
	 * Get the {@code pattern} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pattern} kind.
	 */
	public PatternAnalyzer pattern() {
		return TaggedUnionUtils.get(this, PATTERN);
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public SimpleAnalyzer simple() {
		return TaggedUnionUtils.get(this, SIMPLE);
	}

	/**
	 * Get the {@code snowball} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code snowball} kind.
	 */
	public SnowballAnalyzer snowball() {
		return TaggedUnionUtils.get(this, SNOWBALL);
	}

	/**
	 * Get the {@code standard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code standard} kind.
	 */
	public StandardAnalyzer standard() {
		return TaggedUnionUtils.get(this, STANDARD);
	}

	/**
	 * Get the {@code stop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stop} kind.
	 */
	public StopAnalyzer stop() {
		return TaggedUnionUtils.get(this, STOP);
	}

	/**
	 * Get the {@code whitespace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code whitespace} kind.
	 */
	public WhitespaceAnalyzer whitespace() {
		return TaggedUnionUtils.get(this, WHITESPACE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Analyzer> {
		private String _type;
		private AnalyzerVariant _value;

		public Builder custom(CustomAnalyzer v) {
			this._type = CUSTOM;
			this._value = v;
			return this;
		}

		public Builder custom(Function<CustomAnalyzer.Builder, ObjectBuilder<CustomAnalyzer>> f) {
			return this.custom(f.apply(new CustomAnalyzer.Builder()).build());
		}

		public Builder dutch(DutchAnalyzer v) {
			this._type = DUTCH;
			this._value = v;
			return this;
		}

		public Builder dutch(Function<DutchAnalyzer.Builder, ObjectBuilder<DutchAnalyzer>> f) {
			return this.dutch(f.apply(new DutchAnalyzer.Builder()).build());
		}

		public Builder fingerprint(FingerprintAnalyzer v) {
			this._type = FINGERPRINT;
			this._value = v;
			return this;
		}

		public Builder fingerprint(Function<FingerprintAnalyzer.Builder, ObjectBuilder<FingerprintAnalyzer>> f) {
			return this.fingerprint(f.apply(new FingerprintAnalyzer.Builder()).build());
		}

		public Builder icuAnalyzer(IcuAnalyzer v) {
			this._type = ICU_ANALYZER;
			this._value = v;
			return this;
		}

		public Builder icuAnalyzer(Function<IcuAnalyzer.Builder, ObjectBuilder<IcuAnalyzer>> f) {
			return this.icuAnalyzer(f.apply(new IcuAnalyzer.Builder()).build());
		}

		public Builder keyword(KeywordAnalyzer v) {
			this._type = KEYWORD;
			this._value = v;
			return this;
		}

		public Builder keyword(Function<KeywordAnalyzer.Builder, ObjectBuilder<KeywordAnalyzer>> f) {
			return this.keyword(f.apply(new KeywordAnalyzer.Builder()).build());
		}

		public Builder kuromoji(KuromojiAnalyzer v) {
			this._type = KUROMOJI;
			this._value = v;
			return this;
		}

		public Builder kuromoji(Function<KuromojiAnalyzer.Builder, ObjectBuilder<KuromojiAnalyzer>> f) {
			return this.kuromoji(f.apply(new KuromojiAnalyzer.Builder()).build());
		}

		public Builder language(LanguageAnalyzer v) {
			this._type = LANGUAGE;
			this._value = v;
			return this;
		}

		public Builder language(Function<LanguageAnalyzer.Builder, ObjectBuilder<LanguageAnalyzer>> f) {
			return this.language(f.apply(new LanguageAnalyzer.Builder()).build());
		}

		public Builder nori(NoriAnalyzer v) {
			this._type = NORI;
			this._value = v;
			return this;
		}

		public Builder nori(Function<NoriAnalyzer.Builder, ObjectBuilder<NoriAnalyzer>> f) {
			return this.nori(f.apply(new NoriAnalyzer.Builder()).build());
		}

		public Builder pattern(PatternAnalyzer v) {
			this._type = PATTERN;
			this._value = v;
			return this;
		}

		public Builder pattern(Function<PatternAnalyzer.Builder, ObjectBuilder<PatternAnalyzer>> f) {
			return this.pattern(f.apply(new PatternAnalyzer.Builder()).build());
		}

		public Builder simple(SimpleAnalyzer v) {
			this._type = SIMPLE;
			this._value = v;
			return this;
		}

		public Builder simple(Function<SimpleAnalyzer.Builder, ObjectBuilder<SimpleAnalyzer>> f) {
			return this.simple(f.apply(new SimpleAnalyzer.Builder()).build());
		}

		public Builder snowball(SnowballAnalyzer v) {
			this._type = SNOWBALL;
			this._value = v;
			return this;
		}

		public Builder snowball(Function<SnowballAnalyzer.Builder, ObjectBuilder<SnowballAnalyzer>> f) {
			return this.snowball(f.apply(new SnowballAnalyzer.Builder()).build());
		}

		public Builder standard(StandardAnalyzer v) {
			this._type = STANDARD;
			this._value = v;
			return this;
		}

		public Builder standard(Function<StandardAnalyzer.Builder, ObjectBuilder<StandardAnalyzer>> f) {
			return this.standard(f.apply(new StandardAnalyzer.Builder()).build());
		}

		public Builder stop(StopAnalyzer v) {
			this._type = STOP;
			this._value = v;
			return this;
		}

		public Builder stop(Function<StopAnalyzer.Builder, ObjectBuilder<StopAnalyzer>> f) {
			return this.stop(f.apply(new StopAnalyzer.Builder()).build());
		}

		public Builder whitespace(WhitespaceAnalyzer v) {
			this._type = WHITESPACE;
			this._value = v;
			return this;
		}

		public Builder whitespace(Function<WhitespaceAnalyzer.Builder, ObjectBuilder<WhitespaceAnalyzer>> f) {
			return this.whitespace(f.apply(new WhitespaceAnalyzer.Builder()).build());
		}

		public Analyzer build() {
			_checkSingleUse();
			return new Analyzer(this);
		}

	}

	protected static void setupAnalyzerDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::custom, CustomAnalyzer._DESERIALIZER, "custom");
		op.add(Builder::dutch, DutchAnalyzer._DESERIALIZER, "dutch");
		op.add(Builder::fingerprint, FingerprintAnalyzer._DESERIALIZER, "fingerprint");
		op.add(Builder::icuAnalyzer, IcuAnalyzer._DESERIALIZER, "icu_analyzer");
		op.add(Builder::keyword, KeywordAnalyzer._DESERIALIZER, "keyword");
		op.add(Builder::kuromoji, KuromojiAnalyzer._DESERIALIZER, "kuromoji");
		op.add(Builder::language, LanguageAnalyzer._DESERIALIZER, "language");
		op.add(Builder::nori, NoriAnalyzer._DESERIALIZER, "nori");
		op.add(Builder::pattern, PatternAnalyzer._DESERIALIZER, "pattern");
		op.add(Builder::simple, SimpleAnalyzer._DESERIALIZER, "simple");
		op.add(Builder::snowball, SnowballAnalyzer._DESERIALIZER, "snowball");
		op.add(Builder::standard, StandardAnalyzer._DESERIALIZER, "standard");
		op.add(Builder::stop, StopAnalyzer._DESERIALIZER, "stop");
		op.add(Builder::whitespace, WhitespaceAnalyzer._DESERIALIZER, "whitespace");

		op.setTypeProperty("type");

	}

	public static final JsonpDeserializer<Analyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Analyzer::setupAnalyzerDeserializer, Builder::build);
}
