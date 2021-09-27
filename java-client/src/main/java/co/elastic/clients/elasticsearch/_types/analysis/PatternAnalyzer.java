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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.analysis.PatternAnalyzer
@JsonpDeserializable
public final class PatternAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final String version;

	private final String flags;

	private final boolean lowercase;

	private final String pattern;

	private final List<String> stopwords;

	// ---------------------------------------------------------------------------------------------

	public PatternAnalyzer(Builder builder) {

		this.version = Objects.requireNonNull(builder.version, "version");
		this.flags = Objects.requireNonNull(builder.flags, "flags");
		this.lowercase = Objects.requireNonNull(builder.lowercase, "lowercase");
		this.pattern = Objects.requireNonNull(builder.pattern, "pattern");
		this.stopwords = Objects.requireNonNull(builder.stopwords, "stopwords");

	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "pattern";
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code flags}
	 */
	public String flags() {
		return this.flags;
	}

	/**
	 * API name: {@code lowercase}
	 */
	public boolean lowercase() {
		return this.lowercase;
	}

	/**
	 * API name: {@code pattern}
	 */
	public String pattern() {
		return this.pattern;
	}

	/**
	 * API name: {@code stopwords}
	 */
	public List<String> stopwords() {
		return this.stopwords;
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

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("flags");
		generator.write(this.flags);

		generator.writeKey("lowercase");
		generator.write(this.lowercase);

		generator.writeKey("pattern");
		generator.write(this.pattern);

		generator.writeKey("stopwords");
		generator.writeStartArray();
		for (String item0 : this.stopwords) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<PatternAnalyzer> {
		private String version;

		private String flags;

		private Boolean lowercase;

		private String pattern;

		private List<String> stopwords;

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code flags}
		 */
		public Builder flags(String value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code lowercase}
		 */
		public Builder lowercase(boolean value) {
			this.lowercase = value;
			return this;
		}

		/**
		 * API name: {@code pattern}
		 */
		public Builder pattern(String value) {
			this.pattern = value;
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
		 * Builds a {@link PatternAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternAnalyzer build() {

			return new PatternAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternAnalyzer}
	 */
	public static final JsonpDeserializer<PatternAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PatternAnalyzer::setupPatternAnalyzerDeserializer, Builder::build);

	protected static void setupPatternAnalyzerDeserializer(DelegatingDeserializer<PatternAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::lowercase, JsonpDeserializer.booleanDeserializer(), "lowercase");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");

		op.ignore("type");
	}

}
