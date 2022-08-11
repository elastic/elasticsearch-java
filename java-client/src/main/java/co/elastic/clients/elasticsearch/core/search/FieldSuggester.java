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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.OpenTaggedUnion;
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
public class FieldSuggester implements OpenTaggedUnion<FieldSuggester.Kind, Object>, JsonpSerializable {

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

		Term("term"),

		/** A custom {@code FieldSuggester} defined by a plugin */
		_Custom(null)

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

	@Nullable
	private final String prefix;

	@Nullable
	private final String regex;

	@Nullable
	private final String text;

	public FieldSuggester(FieldSuggesterVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._fieldSuggesterKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

		this.prefix = null;
		this.regex = null;
		this.text = null;

	}

	private FieldSuggester(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

		this.prefix = builder.prefix;
		this.regex = builder.regex;
		this.text = builder.text;

	}

	public static FieldSuggester of(Function<Builder, ObjectBuilder<FieldSuggester>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code prefix}
	 */
	@Nullable
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * API name: {@code regex}
	 */
	@Nullable
	public final String regex() {
		return this.regex;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
		return this.text;
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

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code FieldSuggester} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		if (this.prefix != null) {
			generator.writeKey("prefix");
			generator.write(this.prefix);

		}
		if (this.regex != null) {
			generator.writeKey("regex");
			generator.write(this.regex);

		}
		if (this.text != null) {
			generator.writeKey("text");
			generator.write(this.text);

		}

		generator.writeKey(_kind == Kind._Custom ? _customKind : _kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Nullable
		private String prefix;

		@Nullable
		private String regex;

		@Nullable
		private String text;

		/**
		 * API name: {@code prefix}
		 */
		public final Builder prefix(@Nullable String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * API name: {@code regex}
		 */
		public final Builder regex(@Nullable String value) {
			this.regex = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder completion(CompletionSuggester v) {
			this._kind = Kind.Completion;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder completion(
				Function<CompletionSuggester.Builder, ObjectBuilder<CompletionSuggester>> fn) {
			return this.completion(fn.apply(new CompletionSuggester.Builder()).build());
		}

		public ContainerBuilder phrase(PhraseSuggester v) {
			this._kind = Kind.Phrase;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder phrase(Function<PhraseSuggester.Builder, ObjectBuilder<PhraseSuggester>> fn) {
			return this.phrase(fn.apply(new PhraseSuggester.Builder()).build());
		}

		public ContainerBuilder term(TermSuggester v) {
			this._kind = Kind.Term;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder term(Function<TermSuggester.Builder, ObjectBuilder<TermSuggester>> fn) {
			return this.term(fn.apply(new TermSuggester.Builder()).build());
		}

		/**
		 * Define this {@code FieldSuggester} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code FieldSuggester}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ContainerBuilder _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return new ContainerBuilder();
		}

		protected FieldSuggester build() {
			_checkSingleUse();
			return new FieldSuggester(this);
		}

		public class ContainerBuilder implements ObjectBuilder<FieldSuggester> {

			/**
			 * API name: {@code prefix}
			 */
			public final ContainerBuilder prefix(@Nullable String value) {
				Builder.this.prefix = value;
				return this;
			}

			/**
			 * API name: {@code regex}
			 */
			public final ContainerBuilder regex(@Nullable String value) {
				Builder.this.regex = value;
				return this;
			}

			/**
			 * API name: {@code text}
			 */
			public final ContainerBuilder text(@Nullable String value) {
				Builder.this.text = value;
				return this;
			}

			public FieldSuggester build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupFieldSuggesterDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::completion, CompletionSuggester._DESERIALIZER, "completion");
		op.add(Builder::phrase, PhraseSuggester._DESERIALIZER, "phrase");
		op.add(Builder::term, TermSuggester._DESERIALIZER, "term");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

	public static final JsonpDeserializer<FieldSuggester> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldSuggester::setupFieldSuggesterDeserializer, Builder::build);
}
