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

import co.elastic.clients.json.JsonEnum;
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
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.analysis.Analyzer
// union type: InternalTag[tag=type]
@JsonpDeserializable
public class Analyzer implements TaggedUnion<Analyzer.Kind, AnalyzerVariant>, JsonpSerializable {

	/**
	 * {@link Analyzer} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Custom("custom"),

		Dutch("dutch"),

		Fingerprint("fingerprint"),

		IcuAnalyzer("icu_analyzer"),

		Keyword("keyword"),

		Kuromoji("kuromoji"),

		Language("language"),

		Nori("nori"),

		Pattern("pattern"),

		Simple("simple"),

		Snowball("snowball"),

		Standard("standard"),

		Stop("stop"),

		Whitespace("whitespace"),

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
	private final AnalyzerVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final AnalyzerVariant _get() {
		return _value;
	}

	public Analyzer(AnalyzerVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._analyzerKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Analyzer(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Analyzer of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
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

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Analyzer> {
		private Kind _kind;
		private AnalyzerVariant _value;

		public Builder custom(CustomAnalyzer v) {
			this._kind = Kind.Custom;
			this._value = v;
			return this;
		}

		public Builder custom(Consumer<CustomAnalyzer.Builder> fn) {
			CustomAnalyzer.Builder builder = new CustomAnalyzer.Builder();
			fn.accept(builder);
			return this.custom(builder.build());
		}

		public Builder dutch(DutchAnalyzer v) {
			this._kind = Kind.Dutch;
			this._value = v;
			return this;
		}

		public Builder dutch(Consumer<DutchAnalyzer.Builder> fn) {
			DutchAnalyzer.Builder builder = new DutchAnalyzer.Builder();
			fn.accept(builder);
			return this.dutch(builder.build());
		}

		public Builder fingerprint(FingerprintAnalyzer v) {
			this._kind = Kind.Fingerprint;
			this._value = v;
			return this;
		}

		public Builder fingerprint(Consumer<FingerprintAnalyzer.Builder> fn) {
			FingerprintAnalyzer.Builder builder = new FingerprintAnalyzer.Builder();
			fn.accept(builder);
			return this.fingerprint(builder.build());
		}

		public Builder icuAnalyzer(IcuAnalyzer v) {
			this._kind = Kind.IcuAnalyzer;
			this._value = v;
			return this;
		}

		public Builder icuAnalyzer(Consumer<IcuAnalyzer.Builder> fn) {
			IcuAnalyzer.Builder builder = new IcuAnalyzer.Builder();
			fn.accept(builder);
			return this.icuAnalyzer(builder.build());
		}

		public Builder keyword(KeywordAnalyzer v) {
			this._kind = Kind.Keyword;
			this._value = v;
			return this;
		}

		public Builder keyword(Consumer<KeywordAnalyzer.Builder> fn) {
			KeywordAnalyzer.Builder builder = new KeywordAnalyzer.Builder();
			fn.accept(builder);
			return this.keyword(builder.build());
		}

		public Builder kuromoji(KuromojiAnalyzer v) {
			this._kind = Kind.Kuromoji;
			this._value = v;
			return this;
		}

		public Builder kuromoji(Consumer<KuromojiAnalyzer.Builder> fn) {
			KuromojiAnalyzer.Builder builder = new KuromojiAnalyzer.Builder();
			fn.accept(builder);
			return this.kuromoji(builder.build());
		}

		public Builder language(LanguageAnalyzer v) {
			this._kind = Kind.Language;
			this._value = v;
			return this;
		}

		public Builder language(Consumer<LanguageAnalyzer.Builder> fn) {
			LanguageAnalyzer.Builder builder = new LanguageAnalyzer.Builder();
			fn.accept(builder);
			return this.language(builder.build());
		}

		public Builder nori(NoriAnalyzer v) {
			this._kind = Kind.Nori;
			this._value = v;
			return this;
		}

		public Builder nori(Consumer<NoriAnalyzer.Builder> fn) {
			NoriAnalyzer.Builder builder = new NoriAnalyzer.Builder();
			fn.accept(builder);
			return this.nori(builder.build());
		}

		public Builder pattern(PatternAnalyzer v) {
			this._kind = Kind.Pattern;
			this._value = v;
			return this;
		}

		public Builder pattern(Consumer<PatternAnalyzer.Builder> fn) {
			PatternAnalyzer.Builder builder = new PatternAnalyzer.Builder();
			fn.accept(builder);
			return this.pattern(builder.build());
		}

		public Builder simple(SimpleAnalyzer v) {
			this._kind = Kind.Simple;
			this._value = v;
			return this;
		}

		public Builder simple(Consumer<SimpleAnalyzer.Builder> fn) {
			SimpleAnalyzer.Builder builder = new SimpleAnalyzer.Builder();
			fn.accept(builder);
			return this.simple(builder.build());
		}

		public Builder snowball(SnowballAnalyzer v) {
			this._kind = Kind.Snowball;
			this._value = v;
			return this;
		}

		public Builder snowball(Consumer<SnowballAnalyzer.Builder> fn) {
			SnowballAnalyzer.Builder builder = new SnowballAnalyzer.Builder();
			fn.accept(builder);
			return this.snowball(builder.build());
		}

		public Builder standard(StandardAnalyzer v) {
			this._kind = Kind.Standard;
			this._value = v;
			return this;
		}

		public Builder standard(Consumer<StandardAnalyzer.Builder> fn) {
			StandardAnalyzer.Builder builder = new StandardAnalyzer.Builder();
			fn.accept(builder);
			return this.standard(builder.build());
		}

		public Builder stop(StopAnalyzer v) {
			this._kind = Kind.Stop;
			this._value = v;
			return this;
		}

		public Builder stop(Consumer<StopAnalyzer.Builder> fn) {
			StopAnalyzer.Builder builder = new StopAnalyzer.Builder();
			fn.accept(builder);
			return this.stop(builder.build());
		}

		public Builder whitespace(WhitespaceAnalyzer v) {
			this._kind = Kind.Whitespace;
			this._value = v;
			return this;
		}

		public Builder whitespace(Consumer<WhitespaceAnalyzer.Builder> fn) {
			WhitespaceAnalyzer.Builder builder = new WhitespaceAnalyzer.Builder();
			fn.accept(builder);
			return this.whitespace(builder.build());
		}

		public Analyzer build() {
			_checkSingleUse();
			return new Analyzer(this);
		}

	}

	protected static void setupAnalyzerDeserializer(ObjectDeserializer<Builder> op) {

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
