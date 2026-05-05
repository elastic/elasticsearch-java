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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.analysis.StopTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.StopTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class StopTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	@Nullable
	private final Boolean ignoreCase;

	@Nullable
	private final Boolean removeTrailing;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	private StopTokenFilter(Builder builder) {
		super(builder);

		this.ignoreCase = builder.ignoreCase;
		this.removeTrailing = builder.removeTrailing;
		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);
		this.stopwordsPath = builder.stopwordsPath;

	}

	public static StopTokenFilter of(Function<Builder, ObjectBuilder<StopTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Stop;
	}

	/**
	 * If <code>true</code>, stop word matching is case insensitive. For example, if
	 * <code>true</code>, a stop word of the matches and removes <code>The</code>,
	 * <code>THE</code>, or <code>the</code>. Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code ignore_case}
	 */
	@Nullable
	public final Boolean ignoreCase() {
		return this.ignoreCase;
	}

	/**
	 * If <code>true</code>, the last token of a stream is removed if it’s a stop
	 * word. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code remove_trailing}
	 */
	@Nullable
	public final Boolean removeTrailing() {
		return this.removeTrailing;
	}

	/**
	 * Language value, such as <code>_arabic_</code> or <code>_thai_</code>.
	 * Defaults to <code>_english_</code>.
	 * <p>
	 * API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * Path to a file that contains a list of stop words to remove. This path must
	 * be absolute or relative to the <code>config</code> location, and the file
	 * must be UTF-8 encoded. Each stop word in the file must be separated by a line
	 * break.
	 * <p>
	 * API name: {@code stopwords_path}
	 */
	@Nullable
	public final String stopwordsPath() {
		return this.stopwordsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "stop");
		super.serializeInternal(generator, mapper);
		if (this.ignoreCase != null) {
			generator.writeKey("ignore_case");
			generator.write(this.ignoreCase);

		}
		if (this.removeTrailing != null) {
			generator.writeKey("remove_trailing");
			generator.write(this.removeTrailing);

		}
		if (ApiTypeHelper.isDefined(this.stopwords)) {
			generator.writeKey("stopwords");
			generator.writeStartArray();
			for (String item0 : this.stopwords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.stopwordsPath != null) {
			generator.writeKey("stopwords_path");
			generator.write(this.stopwordsPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StopTokenFilter> {
		@Nullable
		private Boolean ignoreCase;

		@Nullable
		private Boolean removeTrailing;

		@Nullable
		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		public Builder() {
		}
		private Builder(StopTokenFilter instance) {
			this.ignoreCase = instance.ignoreCase;
			this.removeTrailing = instance.removeTrailing;
			this.stopwords = instance.stopwords;
			this.stopwordsPath = instance.stopwordsPath;

		}
		/**
		 * If <code>true</code>, stop word matching is case insensitive. For example, if
		 * <code>true</code>, a stop word of the matches and removes <code>The</code>,
		 * <code>THE</code>, or <code>the</code>. Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code ignore_case}
		 */
		public final Builder ignoreCase(@Nullable Boolean value) {
			this.ignoreCase = value;
			return this;
		}

		/**
		 * If <code>true</code>, the last token of a stream is removed if it’s a stop
		 * word. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code remove_trailing}
		 */
		public final Builder removeTrailing(@Nullable Boolean value) {
			this.removeTrailing = value;
			return this;
		}

		/**
		 * Language value, such as <code>_arabic_</code> or <code>_thai_</code>.
		 * Defaults to <code>_english_</code>.
		 * <p>
		 * API name: {@code stopwords}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stopwords</code>.
		 */
		public final Builder stopwords(List<String> list) {
			this.stopwords = _listAddAll(this.stopwords, list);
			return this;
		}

		/**
		 * Language value, such as <code>_arabic_</code> or <code>_thai_</code>.
		 * Defaults to <code>_english_</code>.
		 * <p>
		 * API name: {@code stopwords}
		 * <p>
		 * Adds one or more values to <code>stopwords</code>.
		 */
		public final Builder stopwords(String value, String... values) {
			this.stopwords = _listAdd(this.stopwords, value, values);
			return this;
		}

		/**
		 * Path to a file that contains a list of stop words to remove. This path must
		 * be absolute or relative to the <code>config</code> location, and the file
		 * must be UTF-8 encoded. Each stop word in the file must be separated by a line
		 * break.
		 * <p>
		 * API name: {@code stopwords_path}
		 */
		public final Builder stopwordsPath(@Nullable String value) {
			this.stopwordsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StopTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopTokenFilter build() {
			_checkSingleUse();

			return new StopTokenFilter(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopTokenFilter}
	 */
	public static final JsonpDeserializer<StopTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StopTokenFilter::setupStopTokenFilterDeserializer);

	protected static void setupStopTokenFilterDeserializer(ObjectDeserializer<StopTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::ignoreCase, JsonpDeserializer.booleanDeserializer(), "ignore_case");
		op.add(Builder::removeTrailing, JsonpDeserializer.booleanDeserializer(), "remove_trailing");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
