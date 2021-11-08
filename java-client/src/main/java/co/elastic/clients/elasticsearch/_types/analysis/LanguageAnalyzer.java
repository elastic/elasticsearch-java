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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.LanguageAnalyzer
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
		this.language = ModelTypeHelper.requireNonNull(builder.language, this, "language");
		this.stemExclusion = ModelTypeHelper.unmodifiableRequired(builder.stemExclusion, this, "stemExclusion");
		this.stopwords = ModelTypeHelper.unmodifiable(builder.stopwords);
		this.stopwordsPath = builder.stopwordsPath;

	}

	public static LanguageAnalyzer of(Function<Builder, ObjectBuilder<LanguageAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "language";
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
		if (ModelTypeHelper.isDefined(this.stemExclusion)) {
			generator.writeKey("stem_exclusion");
			generator.writeStartArray();
			for (String item0 : this.stemExclusion) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.stopwords)) {
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
	 * Builder for {@link LanguageAnalyzer}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LanguageAnalyzer> {
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
		 */
		public final Builder stemExclusion(List<String> value) {
			this.stemExclusion = value;
			return this;
		}

		/**
		 * Required - API name: {@code stem_exclusion}
		 */
		public final Builder stemExclusion(String... value) {
			this.stemExclusion = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 */
		public final Builder stopwords(@Nullable List<String> value) {
			this.stopwords = value;
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 */
		public final Builder stopwords(String... value) {
			this.stopwords = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code stopwords_path}
		 */
		public final Builder stopwordsPath(@Nullable String value) {
			this.stopwordsPath = value;
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
			LanguageAnalyzer::setupLanguageAnalyzerDeserializer, Builder::build);

	protected static void setupLanguageAnalyzerDeserializer(DelegatingDeserializer<LanguageAnalyzer.Builder> op) {

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
