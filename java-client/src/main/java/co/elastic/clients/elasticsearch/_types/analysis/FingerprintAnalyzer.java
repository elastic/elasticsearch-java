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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.FingerprintAnalyzer
@JsonpDeserializable
public final class FingerprintAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final String version;

	private final int maxOutputSize;

	private final boolean preserveOriginal;

	private final String separator;

	private final List<String> stopwords;

	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	public FingerprintAnalyzer(Builder builder) {

		this.version = Objects.requireNonNull(builder.version, "version");
		this.maxOutputSize = Objects.requireNonNull(builder.maxOutputSize, "max_output_size");
		this.preserveOriginal = Objects.requireNonNull(builder.preserveOriginal, "preserve_original");
		this.separator = Objects.requireNonNull(builder.separator, "separator");
		this.stopwords = Objects.requireNonNull(builder.stopwords, "stopwords");
		this.stopwordsPath = Objects.requireNonNull(builder.stopwordsPath, "stopwords_path");

	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "fingerprint";
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code max_output_size}
	 */
	public int maxOutputSize() {
		return this.maxOutputSize;
	}

	/**
	 * API name: {@code preserve_original}
	 */
	public boolean preserveOriginal() {
		return this.preserveOriginal;
	}

	/**
	 * API name: {@code separator}
	 */
	public String separator() {
		return this.separator;
	}

	/**
	 * API name: {@code stopwords}
	 */
	public List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * API name: {@code stopwords_path}
	 */
	public String stopwordsPath() {
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

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("max_output_size");
		generator.write(this.maxOutputSize);

		generator.writeKey("preserve_original");
		generator.write(this.preserveOriginal);

		generator.writeKey("separator");
		generator.write(this.separator);

		generator.writeKey("stopwords");
		generator.writeStartArray();
		for (String item0 : this.stopwords) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("stopwords_path");
		generator.write(this.stopwordsPath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FingerprintAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<FingerprintAnalyzer> {
		private String version;

		private Integer maxOutputSize;

		private Boolean preserveOriginal;

		private String separator;

		private List<String> stopwords;

		private String stopwordsPath;

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code max_output_size}
		 */
		public Builder maxOutputSize(int value) {
			this.maxOutputSize = value;
			return this;
		}

		/**
		 * API name: {@code preserve_original}
		 */
		public Builder preserveOriginal(boolean value) {
			this.preserveOriginal = value;
			return this;
		}

		/**
		 * API name: {@code separator}
		 */
		public Builder separator(String value) {
			this.separator = value;
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 */
		public Builder stopwords(List<String> value) {
			this.stopwords = value;
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 */
		public Builder stopwords(String... value) {
			this.stopwords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stopwords(List)}, creating the list if needed.
		 */
		public Builder addStopwords(String value) {
			if (this.stopwords == null) {
				this.stopwords = new ArrayList<>();
			}
			this.stopwords.add(value);
			return this;
		}

		/**
		 * API name: {@code stopwords_path}
		 */
		public Builder stopwordsPath(String value) {
			this.stopwordsPath = value;
			return this;
		}

		/**
		 * Builds a {@link FingerprintAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FingerprintAnalyzer build() {

			return new FingerprintAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FingerprintAnalyzer}
	 */
	public static final JsonpDeserializer<FingerprintAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FingerprintAnalyzer::setupFingerprintAnalyzerDeserializer, Builder::build);

	protected static void setupFingerprintAnalyzerDeserializer(DelegatingDeserializer<FingerprintAnalyzer.Builder> op) {

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
