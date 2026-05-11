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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: _types.analysis.PatternAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PatternAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternAnalyzer implements AnalyzerVariant, JsonpSerializable {
	@Nullable
	private final String version;

	@Nullable
	private final String flags;

	@Nullable
	private final Boolean lowercase;

	@Nullable
	private final String pattern;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	private PatternAnalyzer(Builder builder) {

		this.version = builder.version;
		this.flags = builder.flags;
		this.lowercase = builder.lowercase;
		this.pattern = builder.pattern;
		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);
		this.stopwordsPath = builder.stopwordsPath;

	}

	public static PatternAnalyzer of(Function<Builder, ObjectBuilder<PatternAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Pattern;
	}

	/**
	 * API name: {@code version}
	 * 
	 * @deprecated 7.14.0
	 */
	@Deprecated
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * Java regular expression flags. Flags should be pipe-separated, eg
	 * &quot;CASE_INSENSITIVE|COMMENTS&quot;.
	 * <p>
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * Should terms be lowercased or not. Defaults to <code>true</code>.
	 * <p>
	 * API name: {@code lowercase}
	 */
	@Nullable
	public final Boolean lowercase() {
		return this.lowercase;
	}

	/**
	 * A Java regular expression. Defaults to <code>\W+</code>.
	 * <p>
	 * API name: {@code pattern}
	 */
	@Nullable
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * A pre-defined stop words list like <code>_english_</code> or an array
	 * containing a list of stop words. Defaults to <code>_none_</code>.
	 * <p>
	 * API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * The path to a file containing stop words.
	 * <p>
	 * API name: {@code stopwords_path}
	 */
	@Nullable
	public final String stopwordsPath() {
		return this.stopwordsPath;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern");

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.flags != null) {
			generator.writeKey("flags");
			generator.write(this.flags);

		}
		if (this.lowercase != null) {
			generator.writeKey("lowercase");
			generator.write(this.lowercase);

		}
		if (this.pattern != null) {
			generator.writeKey("pattern");
			generator.write(this.pattern);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PatternAnalyzer> {
		@Nullable
		private String version;

		@Nullable
		private String flags;

		@Nullable
		private Boolean lowercase;

		@Nullable
		private String pattern;

		@Nullable
		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		public Builder() {
		}
		private Builder(PatternAnalyzer instance) {
			this.version = instance.version;
			this.flags = instance.flags;
			this.lowercase = instance.lowercase;
			this.pattern = instance.pattern;
			this.stopwords = instance.stopwords;
			this.stopwordsPath = instance.stopwordsPath;

		}
		/**
		 * API name: {@code version}
		 * 
		 * @deprecated 7.14.0
		 */
		@Deprecated
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * Java regular expression flags. Flags should be pipe-separated, eg
		 * &quot;CASE_INSENSITIVE|COMMENTS&quot;.
		 * <p>
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * Should terms be lowercased or not. Defaults to <code>true</code>.
		 * <p>
		 * API name: {@code lowercase}
		 */
		public final Builder lowercase(@Nullable Boolean value) {
			this.lowercase = value;
			return this;
		}

		/**
		 * A Java regular expression. Defaults to <code>\W+</code>.
		 * <p>
		 * API name: {@code pattern}
		 */
		public final Builder pattern(@Nullable String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * A pre-defined stop words list like <code>_english_</code> or an array
		 * containing a list of stop words. Defaults to <code>_none_</code>.
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
		 * A pre-defined stop words list like <code>_english_</code> or an array
		 * containing a list of stop words. Defaults to <code>_none_</code>.
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
		 * The path to a file containing stop words.
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
		 * Builds a {@link PatternAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternAnalyzer build() {
			_checkSingleUse();

			return new PatternAnalyzer(this);
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
	 * Json deserializer for {@link PatternAnalyzer}
	 */
	public static final JsonpDeserializer<PatternAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PatternAnalyzer::setupPatternAnalyzerDeserializer);

	protected static void setupPatternAnalyzerDeserializer(ObjectDeserializer<PatternAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::lowercase, JsonpDeserializer.booleanDeserializer(), "lowercase");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
