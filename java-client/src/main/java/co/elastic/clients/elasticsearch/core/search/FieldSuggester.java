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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.FieldSuggester

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.FieldSuggester">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldSuggester implements TaggedUnion<FieldSuggester.Kind, Object>, JsonpSerializable {

	/**
	 * {@link FieldSuggester} variant kinds.
	 */
	/**
	 * {@link FieldSuggester} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.search._types.FieldSuggester">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Completion("completion"),

		Phrase("phrase"),

		Prefix("prefix"),

		Regex("regex"),

		Term("term"),

		Text("text"),

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

	public FieldSuggester(FieldSuggesterVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._fieldSuggesterKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private FieldSuggester(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static FieldSuggester of(Function<Builder, ObjectBuilder<FieldSuggester>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code completion}?
	 */
	public boolean isCompletion() {
		return _kind == Kind.Completion;
	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public CompletionSuggester completion() {
		return TaggedUnionUtils.get(this, Kind.Completion);
	}

	/**
	 * Is this variant instance of kind {@code phrase}?
	 */
	public boolean isPhrase() {
		return _kind == Kind.Phrase;
	}

	/**
	 * Get the {@code phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phrase} kind.
	 */
	public PhraseSuggester phrase() {
		return TaggedUnionUtils.get(this, Kind.Phrase);
	}

	/**
	 * Is this variant instance of kind {@code prefix}?
	 */
	public boolean isPrefix() {
		return _kind == Kind.Prefix;
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public String prefix() {
		return TaggedUnionUtils.get(this, Kind.Prefix);
	}

	/**
	 * Is this variant instance of kind {@code regex}?
	 */
	public boolean isRegex() {
		return _kind == Kind.Regex;
	}

	/**
	 * Get the {@code regex} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regex} kind.
	 */
	public String regex() {
		return TaggedUnionUtils.get(this, Kind.Regex);
	}

	/**
	 * Is this variant instance of kind {@code term}?
	 */
	public boolean isTerm() {
		return _kind == Kind.Term;
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermSuggester term() {
		return TaggedUnionUtils.get(this, Kind.Term);
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean isText() {
		return _kind == Kind.Text;
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, Kind.Text);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Prefix :
					generator.write(((String) this._value));

					break;
				case Regex :
					generator.write(((String) this._value));

					break;
				case Text :
					generator.write(((String) this._value));

					break;
			}
		}

		generator.writeEnd();

	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldSuggester> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<FieldSuggester> completion(CompletionSuggester v) {
			this._kind = Kind.Completion;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldSuggester> completion(
				Function<CompletionSuggester.Builder, ObjectBuilder<CompletionSuggester>> fn) {
			return this.completion(fn.apply(new CompletionSuggester.Builder()).build());
		}

		public ObjectBuilder<FieldSuggester> phrase(PhraseSuggester v) {
			this._kind = Kind.Phrase;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldSuggester> phrase(
				Function<PhraseSuggester.Builder, ObjectBuilder<PhraseSuggester>> fn) {
			return this.phrase(fn.apply(new PhraseSuggester.Builder()).build());
		}

		public ObjectBuilder<FieldSuggester> prefix(String v) {
			this._kind = Kind.Prefix;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldSuggester> regex(String v) {
			this._kind = Kind.Regex;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldSuggester> term(TermSuggester v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldSuggester> term(Function<TermSuggester.Builder, ObjectBuilder<TermSuggester>> fn) {
			return this.term(fn.apply(new TermSuggester.Builder()).build());
		}

		public ObjectBuilder<FieldSuggester> text(String v) {
			this._kind = Kind.Text;
			this._value = v;
			return this;
		}

		public FieldSuggester build() {
			_checkSingleUse();
			return new FieldSuggester(this);
		}

	}

	protected static void setupFieldSuggesterDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::completion, CompletionSuggester._DESERIALIZER, "completion");
		op.add(Builder::phrase, PhraseSuggester._DESERIALIZER, "phrase");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::term, TermSuggester._DESERIALIZER, "term");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

	public static final JsonpDeserializer<FieldSuggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldSuggester::setupFieldSuggesterDeserializer, Builder::build);
}
