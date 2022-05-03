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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

	private final int maxOutputSize;

	private final boolean preserveOriginal;

	private final String separator;

	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	private FingerprintAnalyzer(Builder builder) {

		this.version = builder.version;
		this.maxOutputSize = ApiTypeHelper.requireNonNull(builder.maxOutputSize, this, "maxOutputSize");
		this.preserveOriginal = ApiTypeHelper.requireNonNull(builder.preserveOriginal, this, "preserveOriginal");
		this.separator = ApiTypeHelper.requireNonNull(builder.separator, this, "separator");
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
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code max_output_size}
	 */
	public final int maxOutputSize() {
		return this.maxOutputSize;
	}

	/**
	 * Required - API name: {@code preserve_original}
	 */
	public final boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	/**
	 * Required - API name: {@code separator}
	 */
	public final String separator() {
		return this.separator;
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

		generator.write("type", "fingerprint");

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		generator.writeKey("max_output_size");
		generator.write(this.maxOutputSize);

		generator.writeKey("preserve_original");
		generator.write(this.preserveOriginal);

		generator.writeKey("separator");
		generator.write(this.separator);

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

		private Integer maxOutputSize;

		private Boolean preserveOriginal;

		private String separator;

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
		 * Required - API name: {@code max_output_size}
		 */
		public final Builder maxOutputSize(int value) {
			this.maxOutputSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code preserve_original}
		 */
		public final Builder preserveOriginal(boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		/**
		 * Required - API name: {@code separator}
		 */
		public final Builder separator(String value) {
			this.separator = value;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FingerprintAnalyzer}
	 */
	public static final JsonpDeserializer<FingerprintAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FingerprintAnalyzer::setupFingerprintAnalyzerDeserializer);

	protected static void setupFingerprintAnalyzerDeserializer(ObjectDeserializer<FingerprintAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::maxOutputSize, JsonpDeserializer.integerDeserializer(), "max_output_size");
		op.add(Builder::preserveOriginal, JsonpDeserializer.booleanDeserializer(), "preserve_original");
		op.add(Builder::separator, JsonpDeserializer.stringDeserializer(), "separator");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
