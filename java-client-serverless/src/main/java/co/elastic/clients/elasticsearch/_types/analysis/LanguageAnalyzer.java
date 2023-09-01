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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.LanguageAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.LanguageAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class LanguageAnalyzer implements AnalyzerVariant, JsonpSerializable {
	@Nullable
	private final String version;

	private final Language language;

	private final List<String> stemExclusion;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	private LanguageAnalyzer(Builder builder) {

		this.version = builder.version;
		this.language = ApiTypeHelper.requireNonNull(builder.language, this, "language");
		this.stemExclusion = ApiTypeHelper.unmodifiableRequired(builder.stemExclusion, this, "stemExclusion");
		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);
		this.stopwordsPath = builder.stopwordsPath;

	}

	public static LanguageAnalyzer of(Function<Builder, ObjectBuilder<LanguageAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Language;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code language}
	 */
	public final Language language() {
		return this.language;
	}

	/**
	 * Required - API name: {@code stem_exclusion}
	 */
	public final List<String> stemExclusion() {
		return this.stemExclusion;
	}

	/**
	 * API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
		return this.stopwords;
	}

	/**
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

		generator.write("type", "language");

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		generator.writeKey("language");
		this.language.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.stemExclusion)) {
			generator.writeKey("stem_exclusion");
			generator.writeStartArray();
			for (String item0 : this.stemExclusion) {
				generator.write(item0);

			}
			generator.writeEnd();

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
	 * Builder for {@link LanguageAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<LanguageAnalyzer> {
		@Nullable
		private String version;

		private Language language;

		private List<String> stemExclusion;

		@Nullable
		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code language}
		 */
		public final Builder language(Language value) {
			this.language = value;
			return this;
		}

		/**
		 * Required - API name: {@code stem_exclusion}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stemExclusion</code>.
		 */
		public final Builder stemExclusion(List<String> list) {
			this.stemExclusion = _listAddAll(this.stemExclusion, list);
			return this;
		}

		/**
		 * Required - API name: {@code stem_exclusion}
		 * <p>
		 * Adds one or more values to <code>stemExclusion</code>.
		 */
		public final Builder stemExclusion(String value, String... values) {
			this.stemExclusion = _listAdd(this.stemExclusion, value, values);
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stopwords</code>.
		 */
		public final Builder stopwords(List<String> list) {
			this.stopwords = _listAddAll(this.stopwords, list);
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 * <p>
		 * Adds one or more values to <code>stopwords</code>.
		 */
		public final Builder stopwords(String value, String... values) {
			this.stopwords = _listAdd(this.stopwords, value, values);
			return this;
		}

		/**
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
		 * Builds a {@link LanguageAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LanguageAnalyzer build() {
			_checkSingleUse();

			return new LanguageAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LanguageAnalyzer}
	 */
	public static final JsonpDeserializer<LanguageAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LanguageAnalyzer::setupLanguageAnalyzerDeserializer);

	protected static void setupLanguageAnalyzerDeserializer(ObjectDeserializer<LanguageAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::language, Language._DESERIALIZER, "language");
		op.add(Builder::stemExclusion, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stem_exclusion");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
