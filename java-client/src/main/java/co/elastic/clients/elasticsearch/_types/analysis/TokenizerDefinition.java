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

// typedef: _types.analysis.TokenizerDefinition
// union type: InternalTag[tag=type]
@JsonpDeserializable
public class TokenizerDefinition
		implements
			TaggedUnion<TokenizerDefinition.Kind, TokenizerDefinitionVariant>,
			JsonpSerializable {

	/**
	 * {@link TokenizerDefinition} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		CharGroup("char_group"),

		EdgeNgram("edge_ngram"),

		IcuTokenizer("icu_tokenizer"),

		Keyword("keyword"),

		KuromojiTokenizer("kuromoji_tokenizer"),

		Letter("letter"),

		Lowercase("lowercase"),

		Ngram("ngram"),

		NoriTokenizer("nori_tokenizer"),

		PathHierarchy("path_hierarchy"),

		Pattern("pattern"),

		Standard("standard"),

		UaxUrlEmail("uax_url_email"),

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
	private final TokenizerDefinitionVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final TokenizerDefinitionVariant _get() {
		return _value;
	}

	public TokenizerDefinition(TokenizerDefinitionVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._tokenizerDefinitionKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TokenizerDefinition(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TokenizerDefinition of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code char_group}?
	 */
	public boolean isCharGroup() {
		return _kind == Kind.CharGroup;
	}

	/**
	 * Get the {@code char_group} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code char_group} kind.
	 */
	public CharGroupTokenizer charGroup() {
		return TaggedUnionUtils.get(this, Kind.CharGroup);
	}

	/**
	 * Is this variant instance of kind {@code edge_ngram}?
	 */
	public boolean isEdgeNgram() {
		return _kind == Kind.EdgeNgram;
	}

	/**
	 * Get the {@code edge_ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code edge_ngram} kind.
	 */
	public EdgeNGramTokenizer edgeNgram() {
		return TaggedUnionUtils.get(this, Kind.EdgeNgram);
	}

	/**
	 * Is this variant instance of kind {@code icu_tokenizer}?
	 */
	public boolean isIcuTokenizer() {
		return _kind == Kind.IcuTokenizer;
	}

	/**
	 * Get the {@code icu_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code icu_tokenizer} kind.
	 */
	public IcuTokenizer icuTokenizer() {
		return TaggedUnionUtils.get(this, Kind.IcuTokenizer);
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
	public KeywordTokenizer keyword() {
		return TaggedUnionUtils.get(this, Kind.Keyword);
	}

	/**
	 * Is this variant instance of kind {@code kuromoji_tokenizer}?
	 */
	public boolean isKuromojiTokenizer() {
		return _kind == Kind.KuromojiTokenizer;
	}

	/**
	 * Get the {@code kuromoji_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kuromoji_tokenizer}
	 *             kind.
	 */
	public KuromojiTokenizer kuromojiTokenizer() {
		return TaggedUnionUtils.get(this, Kind.KuromojiTokenizer);
	}

	/**
	 * Is this variant instance of kind {@code letter}?
	 */
	public boolean isLetter() {
		return _kind == Kind.Letter;
	}

	/**
	 * Get the {@code letter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code letter} kind.
	 */
	public LetterTokenizer letter() {
		return TaggedUnionUtils.get(this, Kind.Letter);
	}

	/**
	 * Is this variant instance of kind {@code lowercase}?
	 */
	public boolean isLowercase() {
		return _kind == Kind.Lowercase;
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseTokenizer lowercase() {
		return TaggedUnionUtils.get(this, Kind.Lowercase);
	}

	/**
	 * Is this variant instance of kind {@code ngram}?
	 */
	public boolean isNgram() {
		return _kind == Kind.Ngram;
	}

	/**
	 * Get the {@code ngram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ngram} kind.
	 */
	public NGramTokenizer ngram() {
		return TaggedUnionUtils.get(this, Kind.Ngram);
	}

	/**
	 * Is this variant instance of kind {@code nori_tokenizer}?
	 */
	public boolean isNoriTokenizer() {
		return _kind == Kind.NoriTokenizer;
	}

	/**
	 * Get the {@code nori_tokenizer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code nori_tokenizer} kind.
	 */
	public NoriTokenizer noriTokenizer() {
		return TaggedUnionUtils.get(this, Kind.NoriTokenizer);
	}

	/**
	 * Is this variant instance of kind {@code path_hierarchy}?
	 */
	public boolean isPathHierarchy() {
		return _kind == Kind.PathHierarchy;
	}

	/**
	 * Get the {@code path_hierarchy} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code path_hierarchy} kind.
	 */
	public PathHierarchyTokenizer pathHierarchy() {
		return TaggedUnionUtils.get(this, Kind.PathHierarchy);
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
	public PatternTokenizer pattern() {
		return TaggedUnionUtils.get(this, Kind.Pattern);
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
	public StandardTokenizer standard() {
		return TaggedUnionUtils.get(this, Kind.Standard);
	}

	/**
	 * Is this variant instance of kind {@code uax_url_email}?
	 */
	public boolean isUaxUrlEmail() {
		return _kind == Kind.UaxUrlEmail;
	}

	/**
	 * Get the {@code uax_url_email} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uax_url_email} kind.
	 */
	public UaxEmailUrlTokenizer uaxUrlEmail() {
		return TaggedUnionUtils.get(this, Kind.UaxUrlEmail);
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
	public WhitespaceTokenizer whitespace() {
		return TaggedUnionUtils.get(this, Kind.Whitespace);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TokenizerDefinition> {
		private Kind _kind;
		private TokenizerDefinitionVariant _value;

		public ObjectBuilder<TokenizerDefinition> charGroup(CharGroupTokenizer v) {
			this._kind = Kind.CharGroup;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> charGroup(Consumer<CharGroupTokenizer.Builder> fn) {
			CharGroupTokenizer.Builder builder = new CharGroupTokenizer.Builder();
			fn.accept(builder);
			return this.charGroup(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> edgeNgram(EdgeNGramTokenizer v) {
			this._kind = Kind.EdgeNgram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> edgeNgram(Consumer<EdgeNGramTokenizer.Builder> fn) {
			EdgeNGramTokenizer.Builder builder = new EdgeNGramTokenizer.Builder();
			fn.accept(builder);
			return this.edgeNgram(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> icuTokenizer(IcuTokenizer v) {
			this._kind = Kind.IcuTokenizer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> icuTokenizer(Consumer<IcuTokenizer.Builder> fn) {
			IcuTokenizer.Builder builder = new IcuTokenizer.Builder();
			fn.accept(builder);
			return this.icuTokenizer(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> keyword(KeywordTokenizer v) {
			this._kind = Kind.Keyword;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> keyword(Consumer<KeywordTokenizer.Builder> fn) {
			KeywordTokenizer.Builder builder = new KeywordTokenizer.Builder();
			fn.accept(builder);
			return this.keyword(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> kuromojiTokenizer(KuromojiTokenizer v) {
			this._kind = Kind.KuromojiTokenizer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> kuromojiTokenizer(Consumer<KuromojiTokenizer.Builder> fn) {
			KuromojiTokenizer.Builder builder = new KuromojiTokenizer.Builder();
			fn.accept(builder);
			return this.kuromojiTokenizer(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> letter(LetterTokenizer v) {
			this._kind = Kind.Letter;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> letter(Consumer<LetterTokenizer.Builder> fn) {
			LetterTokenizer.Builder builder = new LetterTokenizer.Builder();
			fn.accept(builder);
			return this.letter(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> lowercase(LowercaseTokenizer v) {
			this._kind = Kind.Lowercase;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> lowercase(Consumer<LowercaseTokenizer.Builder> fn) {
			LowercaseTokenizer.Builder builder = new LowercaseTokenizer.Builder();
			fn.accept(builder);
			return this.lowercase(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> ngram(NGramTokenizer v) {
			this._kind = Kind.Ngram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> ngram(Consumer<NGramTokenizer.Builder> fn) {
			NGramTokenizer.Builder builder = new NGramTokenizer.Builder();
			fn.accept(builder);
			return this.ngram(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> noriTokenizer(NoriTokenizer v) {
			this._kind = Kind.NoriTokenizer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> noriTokenizer(Consumer<NoriTokenizer.Builder> fn) {
			NoriTokenizer.Builder builder = new NoriTokenizer.Builder();
			fn.accept(builder);
			return this.noriTokenizer(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> pathHierarchy(PathHierarchyTokenizer v) {
			this._kind = Kind.PathHierarchy;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> pathHierarchy(Consumer<PathHierarchyTokenizer.Builder> fn) {
			PathHierarchyTokenizer.Builder builder = new PathHierarchyTokenizer.Builder();
			fn.accept(builder);
			return this.pathHierarchy(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> pattern(PatternTokenizer v) {
			this._kind = Kind.Pattern;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> pattern(Consumer<PatternTokenizer.Builder> fn) {
			PatternTokenizer.Builder builder = new PatternTokenizer.Builder();
			fn.accept(builder);
			return this.pattern(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> standard(StandardTokenizer v) {
			this._kind = Kind.Standard;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> standard(Consumer<StandardTokenizer.Builder> fn) {
			StandardTokenizer.Builder builder = new StandardTokenizer.Builder();
			fn.accept(builder);
			return this.standard(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> uaxUrlEmail(UaxEmailUrlTokenizer v) {
			this._kind = Kind.UaxUrlEmail;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> uaxUrlEmail(Consumer<UaxEmailUrlTokenizer.Builder> fn) {
			UaxEmailUrlTokenizer.Builder builder = new UaxEmailUrlTokenizer.Builder();
			fn.accept(builder);
			return this.uaxUrlEmail(builder.build());
		}

		public ObjectBuilder<TokenizerDefinition> whitespace(WhitespaceTokenizer v) {
			this._kind = Kind.Whitespace;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenizerDefinition> whitespace(Consumer<WhitespaceTokenizer.Builder> fn) {
			WhitespaceTokenizer.Builder builder = new WhitespaceTokenizer.Builder();
			fn.accept(builder);
			return this.whitespace(builder.build());
		}

		public TokenizerDefinition build() {
			_checkSingleUse();
			return new TokenizerDefinition(this);
		}

	}

	protected static void setupTokenizerDefinitionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::charGroup, CharGroupTokenizer._DESERIALIZER, "char_group");
		op.add(Builder::edgeNgram, EdgeNGramTokenizer._DESERIALIZER, "edge_ngram");
		op.add(Builder::icuTokenizer, IcuTokenizer._DESERIALIZER, "icu_tokenizer");
		op.add(Builder::keyword, KeywordTokenizer._DESERIALIZER, "keyword");
		op.add(Builder::kuromojiTokenizer, KuromojiTokenizer._DESERIALIZER, "kuromoji_tokenizer");
		op.add(Builder::letter, LetterTokenizer._DESERIALIZER, "letter");
		op.add(Builder::lowercase, LowercaseTokenizer._DESERIALIZER, "lowercase");
		op.add(Builder::ngram, NGramTokenizer._DESERIALIZER, "ngram");
		op.add(Builder::noriTokenizer, NoriTokenizer._DESERIALIZER, "nori_tokenizer");
		op.add(Builder::pathHierarchy, PathHierarchyTokenizer._DESERIALIZER, "path_hierarchy");
		op.add(Builder::pattern, PatternTokenizer._DESERIALIZER, "pattern");
		op.add(Builder::standard, StandardTokenizer._DESERIALIZER, "standard");
		op.add(Builder::uaxUrlEmail, UaxEmailUrlTokenizer._DESERIALIZER, "uax_url_email");
		op.add(Builder::whitespace, WhitespaceTokenizer._DESERIALIZER, "whitespace");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<TokenizerDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenizerDefinition::setupTokenizerDefinitionDeserializer, Builder::build);
}
