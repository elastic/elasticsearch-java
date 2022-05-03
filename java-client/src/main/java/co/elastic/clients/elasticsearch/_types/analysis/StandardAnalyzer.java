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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.StandardAnalyzer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.StandardAnalyzer">API
 *      specification</a>
 */
@JsonpDeserializable
public class StandardAnalyzer implements AnalyzerVariant, JsonpSerializable {
	@Nullable
	private final Integer maxTokenLength;

	private final List<String> stopwords;

	// ---------------------------------------------------------------------------------------------

	private StandardAnalyzer(Builder builder) {

		this.maxTokenLength = builder.maxTokenLength;
		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);

	}

	public static StandardAnalyzer of(Function<Builder, ObjectBuilder<StandardAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Standard;
	}

	/**
	 * API name: {@code max_token_length}
	 */
	@Nullable
	public final Integer maxTokenLength() {
		return this.maxTokenLength;
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

		generator.write("type", "standard");

		if (this.maxTokenLength != null) {
			generator.writeKey("max_token_length");
			generator.write(this.maxTokenLength);

		}
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
	 * Builder for {@link StandardAnalyzer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<StandardAnalyzer> {
		@Nullable
		private Integer maxTokenLength;

		@Nullable
		private List<String> stopwords;

		/**
		 * API name: {@code max_token_length}
		 */
		public final Builder maxTokenLength(@Nullable Integer value) {
			this.maxTokenLength = value;
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
		 * Builds a {@link StandardAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StandardAnalyzer build() {
			_checkSingleUse();

			return new StandardAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StandardAnalyzer}
	 */
	public static final JsonpDeserializer<StandardAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StandardAnalyzer::setupStandardAnalyzerDeserializer);

	protected static void setupStandardAnalyzerDeserializer(ObjectDeserializer<StandardAnalyzer.Builder> op) {

		op.add(Builder::maxTokenLength, JsonpDeserializer.integerDeserializer(), "max_token_length");
		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");

		op.ignore("type");
	}

}
