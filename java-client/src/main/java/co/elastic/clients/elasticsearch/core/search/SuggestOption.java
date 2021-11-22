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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.search._types.SuggestOption
// union type: Union[]

public class SuggestOption<TDocument> implements TaggedUnion<SuggestOption.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Completion, Phrase, Term

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

	private final JsonpSerializer<TDocument> tDocumentSerializer = null;

	public SuggestOption(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private SuggestOption(Builder<TDocument> builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static <TDocument> SuggestOption<TDocument> of(Consumer<Builder<TDocument>> fn) {
		Builder<TDocument> builder = new Builder<>();
		fn.accept(builder);
		return builder.build();
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
	public CompletionSuggestOption<TDocument> completion() {
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
	public PhraseSuggestOption phrase() {
		return TaggedUnionUtils.get(this, Kind.Phrase);
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
	public TermSuggestOption term() {
		return TaggedUnionUtils.get(this, Kind.Term);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	public static class Builder<TDocument> extends ObjectBuilderBase
			implements
				ObjectBuilder<SuggestOption<TDocument>> {
		private Kind _kind;
		private Object _value;

		public Builder<TDocument> completion(CompletionSuggestOption<TDocument> v) {
			this._kind = Kind.Completion;
			this._value = v;
			return this;
		}

		public Builder<TDocument> completion(Consumer<CompletionSuggestOption.Builder<TDocument>> fn) {
			CompletionSuggestOption.Builder<TDocument> builder = new CompletionSuggestOption.Builder<TDocument>();
			fn.accept(builder);
			return this.completion(builder.build());
		}

		public Builder<TDocument> phrase(PhraseSuggestOption v) {
			this._kind = Kind.Phrase;
			this._value = v;
			return this;
		}

		public Builder<TDocument> phrase(Consumer<PhraseSuggestOption.Builder> fn) {
			PhraseSuggestOption.Builder builder = new PhraseSuggestOption.Builder();
			fn.accept(builder);
			return this.phrase(builder.build());
		}

		public Builder<TDocument> term(TermSuggestOption v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public Builder<TDocument> term(Consumer<TermSuggestOption.Builder> fn) {
			TermSuggestOption.Builder builder = new TermSuggestOption.Builder();
			fn.accept(builder);
			return this.term(builder.build());
		}

		public SuggestOption<TDocument> build() {
			_checkSingleUse();
			return new SuggestOption<>(this);
		}

	}

	public static <TDocument> JsonpDeserializer<SuggestOption<TDocument>> createSuggestOptionDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return new UnionDeserializer.Builder<SuggestOption<TDocument>, Kind, Object>(SuggestOption<TDocument>::new,
				false).addMember(Kind.Completion,
						CompletionSuggestOption.createCompletionSuggestOptionDeserializer(tDocumentDeserializer))
						.addMember(Kind.Phrase, PhraseSuggestOption._DESERIALIZER)
						.addMember(Kind.Term, TermSuggestOption._DESERIALIZER).build();
	}

}
