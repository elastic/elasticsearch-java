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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsAnalysis
@JsonpDeserializable
public class IndexSettingsAnalysis implements JsonpSerializable {
	private final Map<String, Analyzer> analyzer;

	private final Map<String, CharFilter> charFilter;

	private final Map<String, TokenFilter> filter;

	private final Map<String, Normalizer> normalizer;

	private final Map<String, Tokenizer> tokenizer;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsAnalysis(Builder builder) {

		this.analyzer = ModelTypeHelper.unmodifiable(builder.analyzer);
		this.charFilter = ModelTypeHelper.unmodifiable(builder.charFilter);
		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.normalizer = ModelTypeHelper.unmodifiable(builder.normalizer);
		this.tokenizer = ModelTypeHelper.unmodifiable(builder.tokenizer);

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

		if (ModelTypeHelper.isDefined(this.analyzer)) {
			generator.writeKey("analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, Analyzer> item0 : this.analyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.charFilter)) {
			generator.writeKey("char_filter");
			generator.writeStartObject();
			for (Map.Entry<String, CharFilter> item0 : this.charFilter.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartObject();
			for (Map.Entry<String, TokenFilter> item0 : this.filter.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.normalizer)) {
			generator.writeKey("normalizer");
			generator.writeStartObject();
			for (Map.Entry<String, Normalizer> item0 : this.normalizer.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.tokenizer)) {
			generator.writeKey("tokenizer");
			generator.writeStartObject();
			for (Map.Entry<String, Tokenizer> item0 : this.tokenizer.entrySet()) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexSettingsAnalysis> {
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
		 */
		public final Builder analyzer(@Nullable Map<String, Analyzer> value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Set {@link #analyzer(Map)} to a singleton map.
		 */
		public Builder analyzer(String key, Function<Analyzer.Builder, ObjectBuilder<Analyzer>> fn) {
			return this.analyzer(Collections.singletonMap(key, fn.apply(new Analyzer.Builder()).build()));
		}

		public final Builder analyzer(
				Function<MapBuilder<String, Analyzer, Analyzer.Builder>, ObjectBuilder<Map<String, Analyzer>>> fn) {
			return analyzer(fn.apply(new MapBuilder<>(Analyzer.Builder::new)).build());
		}

		/**
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(@Nullable Map<String, CharFilter> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * Set {@link #charFilter(Map)} to a singleton map.
		 */
		public Builder charFilter(String key, Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return this.charFilter(Collections.singletonMap(key, fn.apply(new CharFilter.Builder()).build()));
		}

		public final Builder charFilter(
				Function<MapBuilder<String, CharFilter, CharFilter.Builder>, ObjectBuilder<Map<String, CharFilter>>> fn) {
			return charFilter(fn.apply(new MapBuilder<>(CharFilter.Builder::new)).build());
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Map<String, TokenFilter> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Set {@link #filter(Map)} to a singleton map.
		 */
		public Builder filter(String key, Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return this.filter(Collections.singletonMap(key, fn.apply(new TokenFilter.Builder()).build()));
		}

		public final Builder filter(
				Function<MapBuilder<String, TokenFilter, TokenFilter.Builder>, ObjectBuilder<Map<String, TokenFilter>>> fn) {
			return filter(fn.apply(new MapBuilder<>(TokenFilter.Builder::new)).build());
		}

		/**
		 * API name: {@code normalizer}
		 */
		public final Builder normalizer(@Nullable Map<String, Normalizer> value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * Set {@link #normalizer(Map)} to a singleton map.
		 */
		public Builder normalizer(String key, Function<Normalizer.Builder, ObjectBuilder<Normalizer>> fn) {
			return this.normalizer(Collections.singletonMap(key, fn.apply(new Normalizer.Builder()).build()));
		}

		public final Builder normalizer(
				Function<MapBuilder<String, Normalizer, Normalizer.Builder>, ObjectBuilder<Map<String, Normalizer>>> fn) {
			return normalizer(fn.apply(new MapBuilder<>(Normalizer.Builder::new)).build());
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(@Nullable Map<String, Tokenizer> value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * Set {@link #tokenizer(Map)} to a singleton map.
		 */
		public Builder tokenizer(String key, Function<Tokenizer.Builder, ObjectBuilder<Tokenizer>> fn) {
			return this.tokenizer(Collections.singletonMap(key, fn.apply(new Tokenizer.Builder()).build()));
		}

		public final Builder tokenizer(
				Function<MapBuilder<String, Tokenizer, Tokenizer.Builder>, ObjectBuilder<Map<String, Tokenizer>>> fn) {
			return tokenizer(fn.apply(new MapBuilder<>(Tokenizer.Builder::new)).build());
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
			.lazy(Builder::new, IndexSettingsAnalysis::setupIndexSettingsAnalysisDeserializer, Builder::build);

	protected static void setupIndexSettingsAnalysisDeserializer(
			DelegatingDeserializer<IndexSettingsAnalysis.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringMapDeserializer(Analyzer._DESERIALIZER), "analyzer");
		op.add(Builder::charFilter, JsonpDeserializer.stringMapDeserializer(CharFilter._DESERIALIZER), "char_filter");
		op.add(Builder::filter, JsonpDeserializer.stringMapDeserializer(TokenFilter._DESERIALIZER), "filter");
		op.add(Builder::normalizer, JsonpDeserializer.stringMapDeserializer(Normalizer._DESERIALIZER), "normalizer");
		op.add(Builder::tokenizer, JsonpDeserializer.stringMapDeserializer(Tokenizer._DESERIALIZER), "tokenizer");

	}

}
