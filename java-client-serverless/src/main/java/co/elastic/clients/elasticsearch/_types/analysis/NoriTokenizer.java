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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.NoriTokenizer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.NoriTokenizer">API
 *      specification</a>
 */
@JsonpDeserializable
public class NoriTokenizer extends TokenizerBase implements TokenizerDefinitionVariant {
	@Nullable
	private final NoriDecompoundMode decompoundMode;

	@Nullable
	private final Boolean discardPunctuation;

	@Nullable
	private final String userDictionary;

	private final List<String> userDictionaryRules;

	// ---------------------------------------------------------------------------------------------

	private NoriTokenizer(Builder builder) {
		super(builder);

		this.decompoundMode = builder.decompoundMode;
		this.discardPunctuation = builder.discardPunctuation;
		this.userDictionary = builder.userDictionary;
		this.userDictionaryRules = ApiTypeHelper.unmodifiable(builder.userDictionaryRules);

	}

	public static NoriTokenizer of(Function<Builder, ObjectBuilder<NoriTokenizer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizerDefinition variant kind.
	 */
	@Override
	public TokenizerDefinition.Kind _tokenizerDefinitionKind() {
		return TokenizerDefinition.Kind.NoriTokenizer;
	}

	/**
	 * API name: {@code decompound_mode}
	 */
	@Nullable
	public final NoriDecompoundMode decompoundMode() {
		return this.decompoundMode;
	}

	/**
	 * API name: {@code discard_punctuation}
	 */
	@Nullable
	public final Boolean discardPunctuation() {
		return this.discardPunctuation;
	}

	/**
	 * API name: {@code user_dictionary}
	 */
	@Nullable
	public final String userDictionary() {
		return this.userDictionary;
	}

	/**
	 * API name: {@code user_dictionary_rules}
	 */
	public final List<String> userDictionaryRules() {
		return this.userDictionaryRules;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "nori_tokenizer");
		super.serializeInternal(generator, mapper);
		if (this.decompoundMode != null) {
			generator.writeKey("decompound_mode");
			this.decompoundMode.serialize(generator, mapper);
		}
		if (this.discardPunctuation != null) {
			generator.writeKey("discard_punctuation");
			generator.write(this.discardPunctuation);

		}
		if (this.userDictionary != null) {
			generator.writeKey("user_dictionary");
			generator.write(this.userDictionary);

		}
		if (ApiTypeHelper.isDefined(this.userDictionaryRules)) {
			generator.writeKey("user_dictionary_rules");
			generator.writeStartArray();
			for (String item0 : this.userDictionaryRules) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NoriTokenizer}.
	 */

	public static class Builder extends TokenizerBase.AbstractBuilder<Builder> implements ObjectBuilder<NoriTokenizer> {
		@Nullable
		private NoriDecompoundMode decompoundMode;

		@Nullable
		private Boolean discardPunctuation;

		@Nullable
		private String userDictionary;

		@Nullable
		private List<String> userDictionaryRules;

		/**
		 * API name: {@code decompound_mode}
		 */
		public final Builder decompoundMode(@Nullable NoriDecompoundMode value) {
			this.decompoundMode = value;
			return this;
		}

		/**
		 * API name: {@code discard_punctuation}
		 */
		public final Builder discardPunctuation(@Nullable Boolean value) {
			this.discardPunctuation = value;
			return this;
		}

		/**
		 * API name: {@code user_dictionary}
		 */
		public final Builder userDictionary(@Nullable String value) {
			this.userDictionary = value;
			return this;
		}

		/**
		 * API name: {@code user_dictionary_rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>userDictionaryRules</code>.
		 */
		public final Builder userDictionaryRules(List<String> list) {
			this.userDictionaryRules = _listAddAll(this.userDictionaryRules, list);
			return this;
		}

		/**
		 * API name: {@code user_dictionary_rules}
		 * <p>
		 * Adds one or more values to <code>userDictionaryRules</code>.
		 */
		public final Builder userDictionaryRules(String value, String... values) {
			this.userDictionaryRules = _listAdd(this.userDictionaryRules, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NoriTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NoriTokenizer build() {
			_checkSingleUse();

			return new NoriTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NoriTokenizer}
	 */
	public static final JsonpDeserializer<NoriTokenizer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NoriTokenizer::setupNoriTokenizerDeserializer);

	protected static void setupNoriTokenizerDeserializer(ObjectDeserializer<NoriTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::decompoundMode, NoriDecompoundMode._DESERIALIZER, "decompound_mode");
		op.add(Builder::discardPunctuation, JsonpDeserializer.booleanDeserializer(), "discard_punctuation");
		op.add(Builder::userDictionary, JsonpDeserializer.stringDeserializer(), "user_dictionary");
		op.add(Builder::userDictionaryRules,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "user_dictionary_rules");

		op.ignore("type");
	}

}
