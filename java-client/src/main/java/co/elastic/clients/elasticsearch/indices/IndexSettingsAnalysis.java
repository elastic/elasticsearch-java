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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsAnalysis
public final class IndexSettingsAnalysis implements JsonpSerializable {
	@Nullable
	private final Map<String, JsonValue> analyzer;

	@Nullable
	private final Map<String, JsonValue> charFilter;

	@Nullable
	private final Map<String, JsonValue> filter;

	@Nullable
	private final Map<String, JsonValue> normalizer;

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
	public Map<String, JsonValue> analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code char_filter}
	 */
	@Nullable
	public Map<String, JsonValue> charFilter() {
		return this.charFilter;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Map<String, JsonValue> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code normalizer}
	 */
	@Nullable
	public Map<String, JsonValue> normalizer() {
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
			for (Map.Entry<String, JsonValue> item0 : this.analyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.charFilter != null) {

			generator.writeKey("char_filter");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.charFilter.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.filter.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.normalizer != null) {

			generator.writeKey("normalizer");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.normalizer.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
		private Map<String, JsonValue> analyzer;

		@Nullable
		private Map<String, JsonValue> charFilter;

		@Nullable
		private Map<String, JsonValue> filter;

		@Nullable
		private Map<String, JsonValue> normalizer;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable Map<String, JsonValue> value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #analyzer(Map)}, creating the map if needed.
		 */
		public Builder putAnalyzer(String key, JsonValue value) {
			if (this.analyzer == null) {
				this.analyzer = new HashMap<>();
			}
			this.analyzer.put(key, value);
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(@Nullable Map<String, JsonValue> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #charFilter(Map)}, creating the map if needed.
		 */
		public Builder putCharFilter(String key, JsonValue value) {
			if (this.charFilter == null) {
				this.charFilter = new HashMap<>();
			}
			this.charFilter.put(key, value);
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable Map<String, JsonValue> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #filter(Map)}, creating the map if needed.
		 */
		public Builder putFilter(String key, JsonValue value) {
			if (this.filter == null) {
				this.filter = new HashMap<>();
			}
			this.filter.put(key, value);
			return this;
		}

		/**
		 * API name: {@code normalizer}
		 */
		public Builder normalizer(@Nullable Map<String, JsonValue> value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #normalizer(Map)}, creating the map if needed.
		 */
		public Builder putNormalizer(String key, JsonValue value) {
			if (this.normalizer == null) {
				this.normalizer = new HashMap<>();
			}
			this.normalizer.put(key, value);
			return this;
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
	public static final JsonpDeserializer<IndexSettingsAnalysis> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexSettingsAnalysis::setupIndexSettingsAnalysisDeserializer);

	protected static void setupIndexSettingsAnalysisDeserializer(
			DelegatingDeserializer<IndexSettingsAnalysis.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"analyzer");
		op.add(Builder::charFilter, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"char_filter");
		op.add(Builder::filter, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"filter");
		op.add(Builder::normalizer, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"normalizer");

	}

}
