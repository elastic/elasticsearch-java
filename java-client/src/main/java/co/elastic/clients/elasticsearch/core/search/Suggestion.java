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

import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Suggest

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.Suggest">API
 *      specification</a>
 */

public class Suggestion<TDocument> implements TaggedUnion<Suggestion.Kind, SuggestionVariant>, JsonpSerializable {

	/**
	 * {@link Suggestion} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.search._types.Suggest">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Completion("completion"),

		Phrase("phrase"),

		Term("term"),

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
	private final SuggestionVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final SuggestionVariant _get() {
		return _value;
	}

	private final JsonpSerializer<TDocument> tDocumentSerializer = null;

	public Suggestion(SuggestionVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._suggestionKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Suggestion(Builder<TDocument> builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static <TDocument> Suggestion<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<Suggestion<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
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
	public CompletionSuggest<TDocument> completion() {
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
	public PhraseSuggest phrase() {
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
	public TermSuggest term() {
		return TaggedUnionUtils.get(this, Kind.Term);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder<TDocument> extends ObjectBuilderBase implements ObjectBuilder<Suggestion<TDocument>> {
		private Kind _kind;
		private SuggestionVariant _value;

		public ObjectBuilder<Suggestion<TDocument>> completion(CompletionSuggest<TDocument> v) {
			this._kind = Kind.Completion;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Suggestion<TDocument>> completion(
				Function<CompletionSuggest.Builder<TDocument>, ObjectBuilder<CompletionSuggest<TDocument>>> fn) {
			return this.completion(fn.apply(new CompletionSuggest.Builder<TDocument>()).build());
		}

		public ObjectBuilder<Suggestion<TDocument>> phrase(PhraseSuggest v) {
			this._kind = Kind.Phrase;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Suggestion<TDocument>> phrase(
				Function<PhraseSuggest.Builder, ObjectBuilder<PhraseSuggest>> fn) {
			return this.phrase(fn.apply(new PhraseSuggest.Builder()).build());
		}

		public ObjectBuilder<Suggestion<TDocument>> term(TermSuggest v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Suggestion<TDocument>> term(Function<TermSuggest.Builder, ObjectBuilder<TermSuggest>> fn) {
			return this.term(fn.apply(new TermSuggest.Builder()).build());
		}

		public Suggestion<TDocument> build() {
			_checkSingleUse();
			return new Suggestion<>(this);
		}

	}

	/**
	 * Create a JSON deserializer for Suggestion
	 */
	public static <TDocument> ExternallyTaggedUnion.TypedKeysDeserializer<Suggestion<TDocument>> createSuggestionDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		Map<String, JsonpDeserializer<? extends SuggestionVariant>> deserializers = new HashMap<>();
		deserializers.put("completion", CompletionSuggest.createCompletionSuggestDeserializer(tDocumentDeserializer));
		deserializers.put("phrase", PhraseSuggest._DESERIALIZER);
		deserializers.put("term", TermSuggest._DESERIALIZER);

		return new ExternallyTaggedUnion.Deserializer<Suggestion<TDocument>, SuggestionVariant>(deserializers,
				Suggestion::new).typedKeys();
	};

}
