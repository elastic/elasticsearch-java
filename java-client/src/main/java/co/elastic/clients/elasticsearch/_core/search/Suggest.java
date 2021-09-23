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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SuggestContainer
public class Suggest extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String COMPLETION = "completion";
	public static final String PHRASE = "phrase";
	public static final String PREFIX = "prefix";
	public static final String REGEX = "regex";
	public static final String TERM = "term";
	public static final String TEXT = "text";

	private Suggest(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public CompletionSuggester completion() {
		return _get(COMPLETION);
	}

	/**
	 * Get the {@code phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phrase} kind.
	 */
	public PhraseSuggester phrase() {
		return _get(PHRASE);
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public String prefix() {
		return _get(PREFIX);
	}

	/**
	 * Get the {@code regex} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regex} kind.
	 */
	public String regex() {
		return _get(REGEX);
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermSuggester term() {
		return _get(TERM);
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return _get(TEXT);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case PREFIX :
					generator.write(this.<String>_get(PREFIX));

					break;
				case REGEX :
					generator.write(this.<String>_get(REGEX));

					break;
				case TEXT :
					generator.write(this.<String>_get(TEXT));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<Suggest> completion(CompletionSuggester v) {
			this.$variant = v;
			this.$tag = COMPLETION;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Suggest> completion(
				Function<CompletionSuggester.Builder, ObjectBuilder<CompletionSuggester>> f) {
			return this.completion(f.apply(new CompletionSuggester.Builder()).build());
		}

		public ObjectBuilder<Suggest> phrase(PhraseSuggester v) {
			this.$variant = v;
			this.$tag = PHRASE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Suggest> phrase(Function<PhraseSuggester.Builder, ObjectBuilder<PhraseSuggester>> f) {
			return this.phrase(f.apply(new PhraseSuggester.Builder()).build());
		}

		public ObjectBuilder<Suggest> prefix(String v) {
			this.$variant = v;
			this.$tag = PREFIX;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Suggest> regex(String v) {
			this.$variant = v;
			this.$tag = REGEX;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Suggest> term(TermSuggester v) {
			this.$variant = v;
			this.$tag = TERM;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Suggest> term(Function<TermSuggester.Builder, ObjectBuilder<TermSuggester>> f) {
			return this.term(f.apply(new TermSuggester.Builder()).build());
		}

		public ObjectBuilder<Suggest> text(String v) {
			this.$variant = v;
			this.$tag = TEXT;
			return ObjectBuilder.constant(this.build());
		}

		protected Suggest build() {
			return new Suggest(this);
		}

	}

	protected static void setupSuggestDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::completion, CompletionSuggester.DESERIALIZER, "completion");
		op.add(Builder::phrase, PhraseSuggester.DESERIALIZER, "phrase");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::term, TermSuggester.DESERIALIZER, "term");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<Suggest> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Suggest::setupSuggestDeserializer, Builder::build);
}
