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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsAnalysis
@JsonpDeserializable
public final class IndexSettingsAnalysis implements JsonpSerializable {
	@Nullable
	private final Map<String, Analyzer> analyzer;

	@Nullable
	private final Map<String, CharFilter> charFilter;

	@Nullable
	private final Map<String, TokenFilter> filter;

	@Nullable
	private final Map<String, Normalizer> normalizer;

	// ---------------------------------------------------------------------------------------------

	public IndexSettingsAnalysis(Builder builder) {

		this.analyzer = builder.analyzer;
		this.charFilter = builder.charFilter;
		this.filter = builder.filter;
		this.normalizer = builder.normalizer;

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public Map<String, Analyzer> analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code char_filter}
	 */
	@Nullable
	public Map<String, CharFilter> charFilter() {
		return this.charFilter;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Map<String, TokenFilter> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code normalizer}
	 */
	@Nullable
	public Map<String, Normalizer> normalizer() {
		return this.normalizer;
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

		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, Analyzer> item0 : this.analyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.charFilter != null) {

			generator.writeKey("char_filter");
			generator.writeStartObject();
			for (Map.Entry<String, CharFilter> item0 : this.charFilter.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartObject();
			for (Map.Entry<String, TokenFilter> item0 : this.filter.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.normalizer != null) {

			generator.writeKey("normalizer");
			generator.writeStartObject();
			for (Map.Entry<String, Normalizer> item0 : this.normalizer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsAnalysis}.
	 */
	public static class Builder implements ObjectBuilder<IndexSettingsAnalysis> {
		@Nullable
		private Map<String, Analyzer> analyzer;

		@Nullable
		private Map<String, CharFilter> charFilter;

		@Nullable
		private Map<String, TokenFilter> filter;

		@Nullable
		private Map<String, Normalizer> normalizer;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable Map<String, Analyzer> value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #analyzer(Map)}, creating the map if needed.
		 */
		public Builder putAnalyzer(String key, Analyzer value) {
			if (this.analyzer == null) {
				this.analyzer = new HashMap<>();
			}
			this.analyzer.put(key, value);
			return this;
		}

		/**
		 * Set {@link #analyzer(Map)} to a singleton map.
		 */
		public Builder analyzer(String key, Function<Analyzer.Builder, ObjectBuilder<Analyzer>> fn) {
			return this.analyzer(Collections.singletonMap(key, fn.apply(new Analyzer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #analyzer(Map)}, creating the map if needed.
		 */
		public Builder putAnalyzer(String key, Function<Analyzer.Builder, ObjectBuilder<Analyzer>> fn) {
			return this.putAnalyzer(key, fn.apply(new Analyzer.Builder()).build());
		}

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(@Nullable Map<String, CharFilter> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #charFilter(Map)}, creating the map if needed.
		 */
		public Builder putCharFilter(String key, CharFilter value) {
			if (this.charFilter == null) {
				this.charFilter = new HashMap<>();
			}
			this.charFilter.put(key, value);
			return this;
		}

		/**
		 * Set {@link #charFilter(Map)} to a singleton map.
		 */
		public Builder charFilter(String key, Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return this.charFilter(Collections.singletonMap(key, fn.apply(new CharFilter.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #charFilter(Map)}, creating the map if needed.
		 */
		public Builder putCharFilter(String key, Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return this.putCharFilter(key, fn.apply(new CharFilter.Builder()).build());
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable Map<String, TokenFilter> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #filter(Map)}, creating the map if needed.
		 */
		public Builder putFilter(String key, TokenFilter value) {
			if (this.filter == null) {
				this.filter = new HashMap<>();
			}
			this.filter.put(key, value);
			return this;
		}

		/**
		 * Set {@link #filter(Map)} to a singleton map.
		 */
		public Builder filter(String key, Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return this.filter(Collections.singletonMap(key, fn.apply(new TokenFilter.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #filter(Map)}, creating the map if needed.
		 */
		public Builder putFilter(String key, Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return this.putFilter(key, fn.apply(new TokenFilter.Builder()).build());
		}

		/**
		 * API name: {@code normalizer}
		 */
		public Builder normalizer(@Nullable Map<String, Normalizer> value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #normalizer(Map)}, creating the map if needed.
		 */
		public Builder putNormalizer(String key, Normalizer value) {
			if (this.normalizer == null) {
				this.normalizer = new HashMap<>();
			}
			this.normalizer.put(key, value);
			return this;
		}

		/**
		 * Set {@link #normalizer(Map)} to a singleton map.
		 */
		public Builder normalizer(String key, Function<Normalizer.Builder, ObjectBuilder<Normalizer>> fn) {
			return this.normalizer(Collections.singletonMap(key, fn.apply(new Normalizer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #normalizer(Map)}, creating the map if needed.
		 */
		public Builder putNormalizer(String key, Function<Normalizer.Builder, ObjectBuilder<Normalizer>> fn) {
			return this.putNormalizer(key, fn.apply(new Normalizer.Builder()).build());
		}

		/**
		 * Builds a {@link IndexSettingsAnalysis}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsAnalysis build() {

			return new IndexSettingsAnalysis(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingsAnalysis}
	 */
	public static final JsonpDeserializer<IndexSettingsAnalysis> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsAnalysis::setupIndexSettingsAnalysisDeserializer, Builder::build);

	protected static void setupIndexSettingsAnalysisDeserializer(
			DelegatingDeserializer<IndexSettingsAnalysis.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringMapDeserializer(Analyzer._DESERIALIZER), "analyzer");
		op.add(Builder::charFilter, JsonpDeserializer.stringMapDeserializer(CharFilter._DESERIALIZER), "char_filter");
		op.add(Builder::filter, JsonpDeserializer.stringMapDeserializer(TokenFilter._DESERIALIZER), "filter");
		op.add(Builder::normalizer, JsonpDeserializer.stringMapDeserializer(Normalizer._DESERIALIZER), "normalizer");

	}

}
