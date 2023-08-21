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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.analysis.CharFilter;
import co.elastic.clients.elasticsearch._types.analysis.TokenFilter;
import co.elastic.clients.elasticsearch._types.analysis.Tokenizer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.Request

/**
 * Performs analysis on a text string and returns the resulting tokens.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.analyze.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnalyzeRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String analyzer;

	private final List<String> attributes;

	private final List<CharFilter> charFilter;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final String field;

	private final List<TokenFilter> filter;

	@Nullable
	private final String index;

	@Nullable
	private final String normalizer;

	private final List<String> text;

	@Nullable
	private final Tokenizer tokenizer;

	// ---------------------------------------------------------------------------------------------

	private AnalyzeRequest(Builder builder) {

		this.analyzer = builder.analyzer;
		this.attributes = ApiTypeHelper.unmodifiable(builder.attributes);
		this.charFilter = ApiTypeHelper.unmodifiable(builder.charFilter);
		this.explain = builder.explain;
		this.field = builder.field;
		this.filter = ApiTypeHelper.unmodifiable(builder.filter);
		this.index = builder.index;
		this.normalizer = builder.normalizer;
		this.text = ApiTypeHelper.unmodifiable(builder.text);
		this.tokenizer = builder.tokenizer;

	}

	public static AnalyzeRequest of(Function<Builder, ObjectBuilder<AnalyzeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name of the analyzer that should be applied to the provided
	 * <code>text</code>. This could be a built-in analyzer, or an analyzer that’s
	 * been configured in the index.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Array of token attributes used to filter the output of the
	 * <code>explain</code> parameter.
	 * <p>
	 * API name: {@code attributes}
	 */
	public final List<String> attributes() {
		return this.attributes;
	}

	/**
	 * Array of character filters used to preprocess characters before the
	 * tokenizer.
	 * <p>
	 * API name: {@code char_filter}
	 */
	public final List<CharFilter> charFilter() {
		return this.charFilter;
	}

	/**
	 * If <code>true</code>, the response includes token attributes and additional
	 * details.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * Field used to derive the analyzer. To use this parameter, you must specify an
	 * index. If specified, the <code>analyzer</code> parameter overrides this
	 * value.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * Array of token filters used to apply after the tokenizer.
	 * <p>
	 * API name: {@code filter}
	 */
	public final List<TokenFilter> filter() {
		return this.filter;
	}

	/**
	 * Index used to derive the analyzer. If specified, the <code>analyzer</code> or
	 * field parameter overrides this value. If no index is specified or the index
	 * does not have a default analyzer, the analyze API uses the standard analyzer.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Normalizer to use to convert text into a single token.
	 * <p>
	 * API name: {@code normalizer}
	 */
	@Nullable
	public final String normalizer() {
		return this.normalizer;
	}

	/**
	 * Text to analyze. If an array of strings is provided, it is analyzed as a
	 * multi-value field.
	 * <p>
	 * API name: {@code text}
	 */
	public final List<String> text() {
		return this.text;
	}

	/**
	 * Tokenizer to use to convert text into tokens.
	 * <p>
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public final Tokenizer tokenizer() {
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
		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartArray();
			for (String item0 : this.attributes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.charFilter)) {
			generator.writeKey("char_filter");
			generator.writeStartArray();
			for (CharFilter item0 : this.charFilter) {
				item0.serialize(generator, mapper);

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
		if (ApiTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (TokenFilter item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.normalizer != null) {
			generator.writeKey("normalizer");
			generator.write(this.normalizer);

		}
		if (ApiTypeHelper.isDefined(this.text)) {
			generator.writeKey("text");
			generator.writeStartArray();
			for (String item0 : this.text) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.tokenizer != null) {
			generator.writeKey("tokenizer");
			this.tokenizer.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<AnalyzeRequest> {
		@Nullable
		private String analyzer;

		@Nullable
		private List<String> attributes;

		@Nullable
		private List<CharFilter> charFilter;

		@Nullable
		private Boolean explain;

		@Nullable
		private String field;

		@Nullable
		private List<TokenFilter> filter;

		@Nullable
		private String index;

		@Nullable
		private String normalizer;

		@Nullable
		private List<String> text;

		@Nullable
		private Tokenizer tokenizer;

		/**
		 * The name of the analyzer that should be applied to the provided
		 * <code>text</code>. This could be a built-in analyzer, or an analyzer that’s
		 * been configured in the index.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Array of token attributes used to filter the output of the
		 * <code>explain</code> parameter.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>attributes</code>.
		 */
		public final Builder attributes(List<String> list) {
			this.attributes = _listAddAll(this.attributes, list);
			return this;
		}

		/**
		 * Array of token attributes used to filter the output of the
		 * <code>explain</code> parameter.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds one or more values to <code>attributes</code>.
		 */
		public final Builder attributes(String value, String... values) {
			this.attributes = _listAdd(this.attributes, value, values);
			return this;
		}

		/**
		 * Array of character filters used to preprocess characters before the
		 * tokenizer.
		 * <p>
		 * API name: {@code char_filter}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>charFilter</code>.
		 */
		public final Builder charFilter(List<CharFilter> list) {
			this.charFilter = _listAddAll(this.charFilter, list);
			return this;
		}

		/**
		 * Array of character filters used to preprocess characters before the
		 * tokenizer.
		 * <p>
		 * API name: {@code char_filter}
		 * <p>
		 * Adds one or more values to <code>charFilter</code>.
		 */
		public final Builder charFilter(CharFilter value, CharFilter... values) {
			this.charFilter = _listAdd(this.charFilter, value, values);
			return this;
		}

		/**
		 * Array of character filters used to preprocess characters before the
		 * tokenizer.
		 * <p>
		 * API name: {@code char_filter}
		 * <p>
		 * Adds a value to <code>charFilter</code> using a builder lambda.
		 */
		public final Builder charFilter(Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn) {
			return charFilter(fn.apply(new CharFilter.Builder()).build());
		}

		/**
		 * If <code>true</code>, the response includes token attributes and additional
		 * details.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Field used to derive the analyzer. To use this parameter, you must specify an
		 * index. If specified, the <code>analyzer</code> parameter overrides this
		 * value.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * Array of token filters used to apply after the tokenizer.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filter</code>.
		 */
		public final Builder filter(List<TokenFilter> list) {
			this.filter = _listAddAll(this.filter, list);
			return this;
		}

		/**
		 * Array of token filters used to apply after the tokenizer.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds one or more values to <code>filter</code>.
		 */
		public final Builder filter(TokenFilter value, TokenFilter... values) {
			this.filter = _listAdd(this.filter, value, values);
			return this;
		}

		/**
		 * Array of token filters used to apply after the tokenizer.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds a value to <code>filter</code> using a builder lambda.
		 */
		public final Builder filter(Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn) {
			return filter(fn.apply(new TokenFilter.Builder()).build());
		}

		/**
		 * Index used to derive the analyzer. If specified, the <code>analyzer</code> or
		 * field parameter overrides this value. If no index is specified or the index
		 * does not have a default analyzer, the analyze API uses the standard analyzer.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Normalizer to use to convert text into a single token.
		 * <p>
		 * API name: {@code normalizer}
		 */
		public final Builder normalizer(@Nullable String value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * Text to analyze. If an array of strings is provided, it is analyzed as a
		 * multi-value field.
		 * <p>
		 * API name: {@code text}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>text</code>.
		 */
		public final Builder text(List<String> list) {
			this.text = _listAddAll(this.text, list);
			return this;
		}

		/**
		 * Text to analyze. If an array of strings is provided, it is analyzed as a
		 * multi-value field.
		 * <p>
		 * API name: {@code text}
		 * <p>
		 * Adds one or more values to <code>text</code>.
		 */
		public final Builder text(String value, String... values) {
			this.text = _listAdd(this.text, value, values);
			return this;
		}

		/**
		 * Tokenizer to use to convert text into tokens.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(@Nullable Tokenizer value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * Tokenizer to use to convert text into tokens.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(Function<Tokenizer.Builder, ObjectBuilder<Tokenizer>> fn) {
			return this.tokenizer(fn.apply(new Tokenizer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnalyzeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeRequest build() {
			_checkSingleUse();

			return new AnalyzeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyzeRequest}
	 */
	public static final JsonpDeserializer<AnalyzeRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalyzeRequest::setupAnalyzeRequestDeserializer);

	protected static void setupAnalyzeRequestDeserializer(ObjectDeserializer<AnalyzeRequest.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::attributes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::charFilter, JsonpDeserializer.arrayDeserializer(CharFilter._DESERIALIZER), "char_filter");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(TokenFilter._DESERIALIZER), "filter");
		op.add(Builder::normalizer, JsonpDeserializer.stringDeserializer(), "normalizer");
		op.add(Builder::text, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "text");
		op.add(Builder::tokenizer, Tokenizer._DESERIALIZER, "tokenizer");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.analyze}".
	 */
	public static final Endpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.analyze",

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
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_analyze");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, AnalyzeResponse._DESERIALIZER);
}
