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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.CategorizationAnalyzer
public final class CategorizationAnalyzer implements JsonpSerializable {
	@Nullable
	private final List<JsonValue> charFilter;

	@Nullable
	private final List<JsonValue> filter;

	@Nullable
	private final JsonValue tokenizer;

	// ---------------------------------------------------------------------------------------------

	public CategorizationAnalyzer(Builder builder) {

		this.charFilter = builder.charFilter;
		this.filter = builder.filter;
		this.tokenizer = builder.tokenizer;

	}

	/**
	 * API name: {@code char_filter}
	 */
	@Nullable
	public List<JsonValue> charFilter() {
		return this.charFilter;
	}

	/**
	 * One or more character filters. In addition to the built-in character filters,
	 * other plugins can provide more character filters. If this property is not
	 * specified, no character filters are applied prior to categorization. If you
	 * are customizing some other aspect of the analyzer and you need to achieve the
	 * equivalent of <code>categorization_filters</code> (which are not permitted
	 * when some other aspect of the analyzer is customized), add them here as
	 * pattern replace character filters.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public List<JsonValue> filter() {
		return this.filter;
	}

	/**
	 * One or more token filters. In addition to the built-in token filters, other
	 * plugins can provide more token filters. If this property is not specified, no
	 * token filters are applied prior to categorization.
	 * <p>
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public JsonValue tokenizer() {
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

		if (this.charFilter != null) {

			generator.writeKey("char_filter");
			generator.writeStartArray();
			for (JsonValue item0 : this.charFilter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartArray();
			for (JsonValue item0 : this.filter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.tokenizer != null) {

			generator.writeKey("tokenizer");
			generator.write(this.tokenizer);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CategorizationAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<CategorizationAnalyzer> {
		@Nullable
		private List<JsonValue> charFilter;

		@Nullable
		private List<JsonValue> filter;

		@Nullable
		private JsonValue tokenizer;

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(@Nullable List<JsonValue> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		public Builder charFilter(JsonValue... value) {
			this.charFilter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #charFilter(List)}, creating the list if needed.
		 */
		public Builder addCharFilter(JsonValue value) {
			if (this.charFilter == null) {
				this.charFilter = new ArrayList<>();
			}
			this.charFilter.add(value);
			return this;
		}

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable List<JsonValue> value) {
			this.filter = value;
			return this;
		}

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(JsonValue... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(JsonValue value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * One or more token filters. In addition to the built-in token filters, other
		 * plugins can provide more token filters. If this property is not specified, no
		 * token filters are applied prior to categorization.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(@Nullable JsonValue value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * Builds a {@link CategorizationAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CategorizationAnalyzer build() {

			return new CategorizationAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CategorizationAnalyzer}
	 */
	public static final JsonpDeserializer<CategorizationAnalyzer> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CategorizationAnalyzer::setupCategorizationAnalyzerDeserializer);

	protected static void setupCategorizationAnalyzerDeserializer(
			DelegatingDeserializer<CategorizationAnalyzer.Builder> op) {

		op.add(Builder::charFilter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"char_filter");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"filter");
		op.add(Builder::tokenizer, JsonpDeserializer.jsonValueDeserializer(), "tokenizer");

	}

}
