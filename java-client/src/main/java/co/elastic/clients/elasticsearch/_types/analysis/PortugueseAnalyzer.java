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

// typedef: _types.analysis.PortugueseAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PortugueseAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class PortugueseAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final List<String> stopwords;

	@Nullable
	private final String stopwordsPath;

	private final List<String> stemExclusion;

	// ---------------------------------------------------------------------------------------------

	private PortugueseAnalyzer(Builder builder) {

		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);
		this.stopwordsPath = builder.stopwordsPath;
		this.stemExclusion = ApiTypeHelper.unmodifiable(builder.stemExclusion);

	}

	public static PortugueseAnalyzer of(Function<Builder, ObjectBuilder<PortugueseAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Portuguese;
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
	 * API name: {@code stem_exclusion}
	 */
	public final List<String> stemExclusion() {
		return this.stemExclusion;
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

		generator.write("type", "portuguese");

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
		if (ApiTypeHelper.isDefined(this.stemExclusion)) {
			generator.writeKey("stem_exclusion");
			generator.writeStartArray();
			for (String item0 : this.stemExclusion) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PortugueseAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PortugueseAnalyzer> {
		@Nullable
		private List<String> stopwords;

		@Nullable
		private String stopwordsPath;

		@Nullable
		private List<String> stemExclusion;

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

		/**
		 * API name: {@code stem_exclusion}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stemExclusion</code>.
		 */
		public final Builder stemExclusion(List<String> list) {
			this.stemExclusion = _listAddAll(this.stemExclusion, list);
			return this;
		}

		/**
		 * API name: {@code stem_exclusion}
		 * <p>
		 * Adds one or more values to <code>stemExclusion</code>.
		 */
		public final Builder stemExclusion(String value, String... values) {
			this.stemExclusion = _listAdd(this.stemExclusion, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PortugueseAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PortugueseAnalyzer build() {
			_checkSingleUse();

			return new PortugueseAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PortugueseAnalyzer}
	 */
	public static final JsonpDeserializer<PortugueseAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PortugueseAnalyzer::setupPortugueseAnalyzerDeserializer);

	protected static void setupPortugueseAnalyzerDeserializer(ObjectDeserializer<PortugueseAnalyzer.Builder> op) {

		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");
		op.add(Builder::stopwordsPath, JsonpDeserializer.stringDeserializer(), "stopwords_path");
		op.add(Builder::stemExclusion, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stem_exclusion");

		op.ignore("type");
	}

}
