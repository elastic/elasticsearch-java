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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

public class SuggestContainer extends TaggedUnion<SuggestContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		completion("completion"),

		phrase("phrase"),

		prefix("prefix"),

		regex("regex"),

		term("term"),

		text("text"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private SuggestContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link SuggestContainer} of a {@code completion} kind?
	 */
	public boolean isCompletion() {
		return is(Tag.completion);
	}

	/**
	 * Get the {@code completion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code completion} kind.
	 */
	public CompletionSuggester completion() {
		return get(Tag.completion);
	}

	/**
	 * Is this {@link SuggestContainer} of a {@code phrase} kind?
	 */
	public boolean isPhrase() {
		return is(Tag.phrase);
	}

	/**
	 * Get the {@code phrase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code phrase} kind.
	 */
	public PhraseSuggester phrase() {
		return get(Tag.phrase);
	}

	/**
	 * Is this {@link SuggestContainer} of a {@code prefix} kind?
	 */
	public boolean isPrefix() {
		return is(Tag.prefix);
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public String prefix() {
		return get(Tag.prefix);
	}

	/**
	 * Is this {@link SuggestContainer} of a {@code regex} kind?
	 */
	public boolean isRegex() {
		return is(Tag.regex);
	}

	/**
	 * Get the {@code regex} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regex} kind.
	 */
	public String regex() {
		return get(Tag.regex);
	}

	/**
	 * Is this {@link SuggestContainer} of a {@code term} kind?
	 */
	public boolean isTerm() {
		return is(Tag.term);
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermSuggester term() {
		return get(Tag.term);
	}

	/**
	 * Is this {@link SuggestContainer} of a {@code text} kind?
	 */
	public boolean isText() {
		return is(Tag.text);
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return get(Tag.text);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case prefix :
					generator.write(this.<String>get(Tag.prefix));

					break;
				case regex :
					generator.write(this.<String>get(Tag.regex));

					break;
				case text :
					generator.write(this.<String>get(Tag.text));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<SuggestContainer> completion(CompletionSuggester v) {
			this.$variant = v;
			this.$tag = Tag.completion;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SuggestContainer> completion(
				Function<CompletionSuggester.Builder, ObjectBuilder<CompletionSuggester>> f) {
			return this.completion(f.apply(new CompletionSuggester.Builder()).build());
		}

		public ObjectBuilder<SuggestContainer> phrase(PhraseSuggester v) {
			this.$variant = v;
			this.$tag = Tag.phrase;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SuggestContainer> phrase(
				Function<PhraseSuggester.Builder, ObjectBuilder<PhraseSuggester>> f) {
			return this.phrase(f.apply(new PhraseSuggester.Builder()).build());
		}

		public ObjectBuilder<SuggestContainer> prefix(String v) {
			this.$variant = v;
			this.$tag = Tag.prefix;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SuggestContainer> regex(String v) {
			this.$variant = v;
			this.$tag = Tag.regex;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SuggestContainer> term(TermSuggester v) {
			this.$variant = v;
			this.$tag = Tag.term;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SuggestContainer> term(Function<TermSuggester.Builder, ObjectBuilder<TermSuggester>> f) {
			return this.term(f.apply(new TermSuggester.Builder()).build());
		}

		public ObjectBuilder<SuggestContainer> text(String v) {
			this.$variant = v;
			this.$tag = Tag.text;
			return new ObjectBuilder.Constant<>(this.build());
		}

		protected SuggestContainer build() {
			return new SuggestContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<SuggestContainer> DESERIALIZER = JsonpDeserializer
			.lazy(SuggestContainer::buildDeserializer);

	private static JsonpDeserializer<SuggestContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::completion, CompletionSuggester.DESERIALIZER, "completion");
		op.add(Builder::phrase, PhraseSuggester.DESERIALIZER, "phrase");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::term, TermSuggester.DESERIALIZER, "term");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
