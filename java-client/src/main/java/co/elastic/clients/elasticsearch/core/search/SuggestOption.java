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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SuggestOption
// union type: Union[]

public class SuggestOption<TDocument> implements TaggedUnion<Object>, JsonpSerializable {

	public static final String COMPLETION = "completion";
	public static final String PHRASE = "phrase";
	public static final String TERM = "term";

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private final JsonpSerializer<TDocument> tDocumentSerializer = null;

	public SuggestOption(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private SuggestOption(Builder<TDocument> builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static <TDocument> SuggestOption<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<SuggestOption<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public CompletionSuggestOption<TDocument> completion() {
		return TaggedUnionUtils.get(this, COMPLETION);
	}

	/**
	 * Get the {@code phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phrase} kind.
	 */
	public PhraseSuggestOption phrase() {
		return TaggedUnionUtils.get(this, PHRASE);
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermSuggestOption term() {
		return TaggedUnionUtils.get(this, TERM);
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
		private String _type;
		private Object _value;

		public Builder<TDocument> completion(CompletionSuggestOption<TDocument> v) {
			this._type = COMPLETION;
			this._value = v;
			return this;
		}

		public Builder<TDocument> completion(
				Function<CompletionSuggestOption.Builder<TDocument>, ObjectBuilder<CompletionSuggestOption<TDocument>>> f) {
			return this.completion(f.apply(new CompletionSuggestOption.Builder<TDocument>()).build());
		}

		public Builder<TDocument> phrase(PhraseSuggestOption v) {
			this._type = PHRASE;
			this._value = v;
			return this;
		}

		public Builder<TDocument> phrase(Function<PhraseSuggestOption.Builder, ObjectBuilder<PhraseSuggestOption>> f) {
			return this.phrase(f.apply(new PhraseSuggestOption.Builder()).build());
		}

		public Builder<TDocument> term(TermSuggestOption v) {
			this._type = TERM;
			this._value = v;
			return this;
		}

		public Builder<TDocument> term(Function<TermSuggestOption.Builder, ObjectBuilder<TermSuggestOption>> f) {
			return this.term(f.apply(new TermSuggestOption.Builder()).build());
		}

		public SuggestOption<TDocument> build() {
			_checkSingleUse();
			return new SuggestOption<>(this);
		}

	}

	public static <TDocument> JsonpDeserializer<SuggestOption<TDocument>> createSuggestOptionDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return new UnionDeserializer.Builder<>(SuggestOption<TDocument>::new, false)
				.addMember("completion",
						CompletionSuggestOption.createCompletionSuggestOptionDeserializer(tDocumentDeserializer))
				.addMember("phrase", PhraseSuggestOption._DESERIALIZER)
				.addMember("term", TermSuggestOption._DESERIALIZER).build();
	}

}
