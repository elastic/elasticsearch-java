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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.Request
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
		this.attributes = ModelTypeHelper.unmodifiable(builder.attributes);
		this.charFilter = ModelTypeHelper.unmodifiable(builder.charFilter);
		this.explain = builder.explain;
		this.field = builder.field;
		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.index = builder.index;
		this.normalizer = builder.normalizer;
		this.text = ModelTypeHelper.unmodifiable(builder.text);
		this.tokenizer = builder.tokenizer;

	}

	public static AnalyzeRequest of(Function<Builder, ObjectBuilder<AnalyzeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code attributes}
	 */
	public final List<String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code char_filter}
	 */
	public final List<CharFilter> charFilter() {
		return this.charFilter;
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code filter}
	 */
	public final List<TokenFilter> filter() {
		return this.filter;
	}

	/**
	 * The name of the index to scope the operation
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code normalizer}
	 */
	@Nullable
	public final String normalizer() {
		return this.normalizer;
	}

	/**
	 * API name: {@code text}
	 */
	public final List<String> text() {
		return this.text;
	}

	/**
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
		if (ModelTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartArray();
			for (String item0 : this.attributes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.charFilter)) {
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
		if (ModelTypeHelper.isDefined(this.filter)) {
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
		if (ModelTypeHelper.isDefined(this.text)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AnalyzeRequest> {
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
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code attributes}
		 */
		public final Builder attributes(@Nullable List<String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * API name: {@code attributes}
		 */
		public final Builder attributes(String... value) {
			this.attributes = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(@Nullable List<CharFilter> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(CharFilter... value) {
			this.charFilter = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code char_filter}
		 */
		@SafeVarargs
		public final Builder charFilter(Function<CharFilter.Builder, ObjectBuilder<CharFilter>>... fns) {
			this.charFilter = new ArrayList<>(fns.length);
			for (Function<CharFilter.Builder, ObjectBuilder<CharFilter>> fn : fns) {
				this.charFilter.add(fn.apply(new CharFilter.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable List<TokenFilter> value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(TokenFilter... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		@SafeVarargs
		public final Builder filter(Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>>... fns) {
			this.filter = new ArrayList<>(fns.length);
			for (Function<TokenFilter.Builder, ObjectBuilder<TokenFilter>> fn : fns) {
				this.filter.add(fn.apply(new TokenFilter.Builder()).build());
			}
			return this;
		}

		/**
		 * The name of the index to scope the operation
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code normalizer}
		 */
		public final Builder normalizer(@Nullable String value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable List<String> value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public final Builder text(String... value) {
			this.text = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(@Nullable Tokenizer value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(Function<Tokenizer.Builder, ObjectBuilder<Tokenizer>> fn) {
			return this.tokenizer(fn.apply(new Tokenizer.Builder()).build());
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
			AnalyzeRequest::setupAnalyzeRequestDeserializer, Builder::build);

	protected static void setupAnalyzeRequestDeserializer(DelegatingDeserializer<AnalyzeRequest.Builder> op) {

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
	public static final Endpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, AnalyzeResponse._DESERIALIZER);
}
