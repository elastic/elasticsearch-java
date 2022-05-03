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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

	private final String pattern;

	private final List<String> stopwords;

	// ---------------------------------------------------------------------------------------------

	private PatternAnalyzer(Builder builder) {

		this.version = builder.version;
		this.flags = builder.flags;
		this.lowercase = builder.lowercase;
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);

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
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * API name: {@code lowercase}
	 */
	@Nullable
	public final Boolean lowercase() {
		return this.lowercase;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
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
		generator.writeKey("pattern");
		generator.write(this.pattern);

		if (ApiTypeHelper.isDefined(this.stopwords)) {
			generator.writeKey("stopwords");
			generator.writeStartArray();
			for (String item0 : this.stopwords) {
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
	 * Builder for {@link PatternAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PatternAnalyzer> {
		@Nullable
		private String version;

		@Nullable
		private String flags;

		@Nullable
		private Boolean lowercase;

		private String pattern;

		@Nullable
		private List<String> stopwords;

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * API name: {@code lowercase}
		 */
		public final Builder lowercase(@Nullable Boolean value) {
			this.lowercase = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
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

		op.ignore("type");
	}

}
