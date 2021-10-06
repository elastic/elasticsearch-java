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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.StopAnalyzer
@JsonpDeserializable
public final class StopAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final String version;

	private final List<String> stopwords;

	private final String stopwordsPath;

	// ---------------------------------------------------------------------------------------------

	public StopAnalyzer(Builder builder) {

		this.version = Objects.requireNonNull(builder.version, "version");
		this.stopwords = ModelTypeHelper.unmodifiableNonNull(builder.stopwords, "stopwords");
		this.stopwordsPath = Objects.requireNonNull(builder.stopwordsPath, "stopwords_path");

	}

	public StopAnalyzer(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "stop";
	}

	/**
	 * Required - API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code stopwords}
	 */
	public List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * Required - API name: {@code stopwords_path}
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

		generator.write("type", "stop");

		generator.writeKey("version");
		generator.write(this.version);

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
	 * Builder for {@link StopAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<StopAnalyzer> {
		private String version;

		private List<String> stopwords;

		private String stopwordsPath;

		/**
		 * Required - API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code stopwords}
		 */
		public Builder stopwords(List<String> value) {
			this.stopwords = value;
			return this;
		}

		/**
		 * Required - API name: {@code stopwords}
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
		 * Required - API name: {@code stopwords_path}
		 */
		public Builder stopwordsPath(String value) {
			this.stopwordsPath = value;
			return this;
		}

		/**
		 * Builds a {@link StopAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopAnalyzer build() {

			return new StopAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopAnalyzer}
	 */
	public static final JsonpDeserializer<StopAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StopAnalyzer::setupStopAnalyzerDeserializer, Builder::build);

	protected static void setupStopAnalyzerDeserializer(DelegatingDeserializer<StopAnalyzer.Builder> op) {

		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");

		op.ignore("type");
	}

}
