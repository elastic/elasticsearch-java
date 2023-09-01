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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.analysis.Analyzer;
import co.elastic.clients.elasticsearch._types.analysis.CharFilter;
import co.elastic.clients.elasticsearch._types.analysis.Normalizer;
import co.elastic.clients.elasticsearch._types.analysis.TokenFilter;
import co.elastic.clients.elasticsearch._types.analysis.Tokenizer;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsAnalysis

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingsAnalysis">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingsAnalysis implements JsonpSerializable {
	private final Map<String, Analyzer> analyzer;

	private final Map<String, CharFilter> charFilter;

	private final Map<String, TokenFilter> filter;

	private final Map<String, Normalizer> normalizer;

	private final Map<String, Tokenizer> tokenizer;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsAnalysis(Builder builder) {

		this.analyzer = ApiTypeHelper.unmodifiable(builder.analyzer);
		this.charFilter = ApiTypeHelper.unmodifiable(builder.charFilter);
		this.filter = ApiTypeHelper.unmodifiable(builder.filter);
		this.normalizer = ApiTypeHelper.unmodifiable(builder.normalizer);
		this.tokenizer = ApiTypeHelper.unmodifiable(builder.tokenizer);

	}

	public static IndexSettingsAnalysis of(Function<Builder, ObjectBuilder<IndexSettingsAnalysis>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code analyzer}
	 */
	public final Map<String, Analyzer> analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code char_filter}
	 */
	public final Map<String, CharFilter> charFilter() {
		return this.charFilter;
	}

	/**
	 * API name: {@code filter}
	 */
	public final Map<String, TokenFilter> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code normalizer}
	 */
	public final Map<String, Normalizer> normalizer() {
		return this.normalizer;
	}

	/**
	 * API name: {@code tokenizer}
	 */
	public final Map<String, Tokenizer> tokenizer() {
		return this.tokenizer;
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

		if (ApiTypeHelper.isDefined(this.analyzer)) {
			generator.writeKey("analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, Analyzer> item0 : this.analyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.charFilter)) {
			generator.writeKey("char_filter");
			generator.writeStartObject();
			for (Map.Entry<String, CharFilter> item0 : this.charFilter.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartObject();
			for (Map.Entry<String, TokenFilter> item0 : this.filter.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.normalizer)) {
			generator.writeKey("normalizer");
			generator.writeStartObject();
			for (Map.Entry<String, Normalizer> item0 : this.normalizer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.tokenizer)) {
			generator.writeKey("tokenizer");
			generator.writeStartObject();
			for (Map.Entry<String, Tokenizer> item0 : this.tokenizer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link IndexSettingsAnalysis}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingsAnalysis> {
		@Nullable
		private Map<String, Analyzer> analyzer;

		@Nullable
		private Map<String, CharFilter> charFilter;

		@Nullable
		private Map<String, TokenFilter> filter;

		@Nullable
		private Map<String, Normalizer> normalizer;

		@Nullable
		private Map<String, Tokenizer> tokenizer;

		/**
		 * API name: {@code analyzer}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>analyzer</code>.
		 */
		public final Builder analyzer(Map<String, Analyzer> map) {
			this.analyzer = _mapPutAll(this.analyzer, map);
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 * <p>
		 * Adds an entry to <code>analyzer</code>.
		 */
		public final Builder analyzer(String key, Analyzer value) {
			this.analyzer = _mapPut(this.analyzer, key, value);
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 * <p>
		 * Adds an entry to <code>analyzer</code> using a builder lambda.
		 */
		public final Builder analyzer(String key, Function<Analyzer.Builder, ObjectBuilder<Analyzer>> fn) {
			return analyzer(key, fn.apply(new Analyzer.Builder()).build());
		}

		/**
		 * API name: {@code char_filter}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>charFilter</code>.
		 */
		public final Builder charFilter(Map<String, CharFilter> map) {
			this.charFilter = _mapPutAll(this.charFilter, map);
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 * <p>
		 * Adds an entry to <code>charFilter</code>.
		 */
		public final Builder charFilter(String key, CharFilter value) {
			this.charFilter = _mapPut(this.charFilter, key, value);
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 * <p>
		 * Adds an entry to <code>charFilter</code> using a builder lambda.
		 */
		public final Builder charFilter(String key, Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return charFilter(key, fn.apply(new CharFilter.Builder()).build());
		}

		/**
		 * API name: {@code filter}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>filter</code>.
		 */
		public final Builder filter(Map<String, TokenFilter> map) {
			this.filter = _mapPutAll(this.filter, map);
			return this;
		}

		/**
		 * API name: {@code filter}
		 * <p>
		 * Adds an entry to <code>filter</code>.
		 */
		public final Builder filter(String key, TokenFilter value) {
			this.filter = _mapPut(this.filter, key, value);
			return this;
		}

		/**
		 * API name: {@code filter}
		 * <p>
		 * Adds an entry to <code>filter</code> using a builder lambda.
		 */
		public final Builder filter(String key, Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return filter(key, fn.apply(new TokenFilter.Builder()).build());
		}

		/**
		 * API name: {@code normalizer}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>normalizer</code>.
		 */
		public final Builder normalizer(Map<String, Normalizer> map) {
			this.normalizer = _mapPutAll(this.normalizer, map);
			return this;
		}

		/**
		 * API name: {@code normalizer}
		 * <p>
		 * Adds an entry to <code>normalizer</code>.
		 */
		public final Builder normalizer(String key, Normalizer value) {
			this.normalizer = _mapPut(this.normalizer, key, value);
			return this;
		}

		/**
		 * API name: {@code normalizer}
		 * <p>
		 * Adds an entry to <code>normalizer</code> using a builder lambda.
		 */
		public final Builder normalizer(String key, Function<Normalizer.Builder, ObjectBuilder<Normalizer>> fn) {
			return normalizer(key, fn.apply(new Normalizer.Builder()).build());
		}

		/**
		 * API name: {@code tokenizer}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>tokenizer</code>.
		 */
		public final Builder tokenizer(Map<String, Tokenizer> map) {
			this.tokenizer = _mapPutAll(this.tokenizer, map);
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 * <p>
		 * Adds an entry to <code>tokenizer</code>.
		 */
		public final Builder tokenizer(String key, Tokenizer value) {
			this.tokenizer = _mapPut(this.tokenizer, key, value);
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 * <p>
		 * Adds an entry to <code>tokenizer</code> using a builder lambda.
		 */
		public final Builder tokenizer(String key, Function<Tokenizer.Builder, ObjectBuilder<Tokenizer>> fn) {
			return tokenizer(key, fn.apply(new Tokenizer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsAnalysis}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsAnalysis build() {
			_checkSingleUse();

			return new IndexSettingsAnalysis(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingsAnalysis}
	 */
	public static final JsonpDeserializer<IndexSettingsAnalysis> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsAnalysis::setupIndexSettingsAnalysisDeserializer);

	protected static void setupIndexSettingsAnalysisDeserializer(ObjectDeserializer<IndexSettingsAnalysis.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringMapDeserializer(Analyzer._DESERIALIZER), "analyzer");
		op.add(Builder::charFilter, JsonpDeserializer.stringMapDeserializer(CharFilter._DESERIALIZER), "char_filter");
		op.add(Builder::filter, JsonpDeserializer.stringMapDeserializer(TokenFilter._DESERIALIZER), "filter");
		op.add(Builder::normalizer, JsonpDeserializer.stringMapDeserializer(Normalizer._DESERIALIZER), "normalizer");
		op.add(Builder::tokenizer, JsonpDeserializer.stringMapDeserializer(Tokenizer._DESERIALIZER), "tokenizer");

	}

}
