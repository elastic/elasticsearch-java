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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.analyze.Request
public final class AnalyzeRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String analyzer;

	@Nullable
	private final List<String> attributes;

	@Nullable
	private final List<JsonValue> charFilter;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final String field;

	@Nullable
	private final List<JsonValue> filter;

	@Nullable
	private final String normalizer;

	@Nullable
	private final List<String> text;

	@Nullable
	private final JsonValue tokenizer;

	// ---------------------------------------------------------------------------------------------

	public AnalyzeRequest(Builder builder) {

		this.index = builder.index;
		this.analyzer = builder.analyzer;
		this.attributes = builder.attributes;
		this.charFilter = builder.charFilter;
		this.explain = builder.explain;
		this.field = builder.field;
		this.filter = builder.filter;
		this.normalizer = builder.normalizer;
		this.text = builder.text;
		this.tokenizer = builder.tokenizer;

	}

	/**
	 * The name of the index to scope the operation
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code attributes}
	 */
	@Nullable
	public List<String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code char_filter}
	 */
	@Nullable
	public List<JsonValue> charFilter() {
		return this.charFilter;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public List<JsonValue> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code normalizer}
	 */
	@Nullable
	public String normalizer() {
		return this.normalizer;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public List<String> text() {
		return this.text;
	}

	/**
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

		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.attributes != null) {

			generator.writeKey("attributes");
			generator.writeStartArray();
			for (String item0 : this.attributes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.charFilter != null) {

			generator.writeKey("char_filter");
			generator.writeStartArray();
			for (JsonValue item0 : this.charFilter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.explain != null) {

			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartArray();
			for (JsonValue item0 : this.filter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.normalizer != null) {

			generator.writeKey("normalizer");
			generator.write(this.normalizer);

		}
		if (this.text != null) {

			generator.writeKey("text");
			generator.writeStartArray();
			for (String item0 : this.text) {
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
	 * Builder for {@link AnalyzeRequest}.
	 */
	public static class Builder implements ObjectBuilder<AnalyzeRequest> {
		@Nullable
		private String index;

		@Nullable
		private String analyzer;

		@Nullable
		private List<String> attributes;

		@Nullable
		private List<JsonValue> charFilter;

		@Nullable
		private Boolean explain;

		@Nullable
		private String field;

		@Nullable
		private List<JsonValue> filter;

		@Nullable
		private String normalizer;

		@Nullable
		private List<String> text;

		@Nullable
		private JsonValue tokenizer;

		/**
		 * The name of the index to scope the operation
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code attributes}
		 */
		public Builder attributes(@Nullable List<String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * API name: {@code attributes}
		 */
		public Builder attributes(String... value) {
			this.attributes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #attributes(List)}, creating the list if needed.
		 */
		public Builder addAttributes(String value) {
			if (this.attributes == null) {
				this.attributes = new ArrayList<>();
			}
			this.attributes.add(value);
			return this;
		}

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
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable List<JsonValue> value) {
			this.filter = value;
			return this;
		}

		/**
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
		 * API name: {@code normalizer}
		 */
		public Builder normalizer(@Nullable String value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public Builder text(@Nullable List<String> value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public Builder text(String... value) {
			this.text = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #text(List)}, creating the list if needed.
		 */
		public Builder addText(String value) {
			if (this.text == null) {
				this.text = new ArrayList<>();
			}
			this.text.add(value);
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(@Nullable JsonValue value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * Builds a {@link AnalyzeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeRequest build() {

			return new AnalyzeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyzeRequest}
	 */
	public static final JsonpDeserializer<AnalyzeRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalyzeRequest::setupAnalyzeRequestDeserializer);

	protected static void setupAnalyzeRequestDeserializer(DelegatingDeserializer<AnalyzeRequest.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::attributes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::charFilter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"char_filter");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"filter");
		op.add(Builder::normalizer, JsonpDeserializer.stringDeserializer(), "normalizer");
		op.add(Builder::text, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "text");
		op.add(Builder::tokenizer, JsonpDeserializer.jsonValueDeserializer(), "tokenizer");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.analyze}".
	 */
	public static final Endpoint<AnalyzeRequest, AnalyzeResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_analyze");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_analyze");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, AnalyzeResponse.DESERIALIZER);
}
