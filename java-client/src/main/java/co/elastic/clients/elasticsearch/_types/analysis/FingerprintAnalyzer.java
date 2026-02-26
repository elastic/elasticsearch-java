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
import java.lang.Integer;
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

// typedef: _types.analysis.FingerprintAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.FingerprintAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class FingerprintAnalyzer implements AnalyzerVariant, JsonpSerializable {
	@Nullable
	private final String version;

	@Nullable
	private final Integer maxOutputSize;

	@Nullable
	private final String separator;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	private FingerprintAnalyzer(Builder builder) {

		this.version = builder.version;
		this.maxOutputSize = builder.maxOutputSize;
		this.separator = builder.separator;
		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);
		this.stopwordsPath = builder.stopwordsPath;

	}

	public static FingerprintAnalyzer of(Function<Builder, ObjectBuilder<FingerprintAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Fingerprint;
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
	 * The maximum token size to emit. Tokens larger than this size will be
	 * discarded. Defaults to <code>255</code>
	 * <p>
	 * API name: {@code max_output_size}
	 */
	@Nullable
	public final Integer maxOutputSize() {
		return this.maxOutputSize;
	}

	/**
	 * The character to use to concatenate the terms. Defaults to a space.
	 * <p>
	 * API name: {@code separator}
	 */
	@Nullable
	public final String separator() {
		return this.separator;
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

		generator.write("type", "fingerprint");

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.maxOutputSize != null) {
			generator.writeKey("max_output_size");
			generator.write(this.maxOutputSize);

		}
		if (this.separator != null) {
			generator.writeKey("separator");
			generator.write(this.separator);

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
	 * Builder for {@link FingerprintAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FingerprintAnalyzer> {
		@Nullable
		private String version;

		@Nullable
		private Integer maxOutputSize;

		@Nullable
		private String separator;

		@Nullable
		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		public Builder() {
		}
		private Builder(FingerprintAnalyzer instance) {
			this.version = instance.version;
			this.maxOutputSize = instance.maxOutputSize;
			this.separator = instance.separator;
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
		 * The maximum token size to emit. Tokens larger than this size will be
		 * discarded. Defaults to <code>255</code>
		 * <p>
		 * API name: {@code max_output_size}
		 */
		public final Builder maxOutputSize(@Nullable Integer value) {
			this.maxOutputSize = value;
			return this;
		}

		/**
		 * The character to use to concatenate the terms. Defaults to a space.
		 * <p>
		 * API name: {@code separator}
		 */
		public final Builder separator(@Nullable String value) {
			this.separator = value;
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
		 * Builds a {@link FingerprintAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FingerprintAnalyzer build() {
			_checkSingleUse();

			return new FingerprintAnalyzer(this);
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
	 * Json deserializer for {@link FingerprintAnalyzer}
	 */
	public static final JsonpDeserializer<FingerprintAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FingerprintAnalyzer::setupFingerprintAnalyzerDeserializer);

	protected static void setupFingerprintAnalyzerDeserializer(ObjectDeserializer<FingerprintAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::maxOutputSize, JsonpDeserializer.integerDeserializer(), "max_output_size");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
