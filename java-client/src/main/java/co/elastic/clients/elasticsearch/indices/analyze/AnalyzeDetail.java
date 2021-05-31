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

package co.elastic.clients.elasticsearch.indices.analyze;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.AnalyzeDetail
public final class AnalyzeDetail implements ToJsonp {
	@Nullable
	private final AnalyzerDetail analyzer;

	@Nullable
	private final List<CharFilterDetail> charfilters;

	private final Boolean customAnalyzer;

	@Nullable
	private final List<TokenDetail> tokenfilters;

	@Nullable
	private final TokenDetail tokenizer;

	// ---------------------------------------------------------------------------------------------

	protected AnalyzeDetail(Builder builder) {

		this.analyzer = builder.analyzer;
		this.charfilters = builder.charfilters;
		this.customAnalyzer = Objects.requireNonNull(builder.customAnalyzer, "custom_analyzer");
		this.tokenfilters = builder.tokenfilters;
		this.tokenizer = builder.tokenizer;

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public AnalyzerDetail analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code charfilters}
	 */
	@Nullable
	public List<CharFilterDetail> charfilters() {
		return this.charfilters;
	}

	/**
	 * API name: {@code custom_analyzer}
	 */
	public Boolean customAnalyzer() {
		return this.customAnalyzer;
	}

	/**
	 * API name: {@code tokenfilters}
	 */
	@Nullable
	public List<TokenDetail> tokenfilters() {
		return this.tokenfilters;
	}

	/**
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public TokenDetail tokenizer() {
		return this.tokenizer;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			this.analyzer.toJsonp(generator, mapper);

		}
		if (this.charfilters != null) {

			generator.writeKey("charfilters");
			generator.writeStartArray();
			for (CharFilterDetail item0 : this.charfilters) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("custom_analyzer");
		generator.write(this.customAnalyzer);

		if (this.tokenfilters != null) {

			generator.writeKey("tokenfilters");
			generator.writeStartArray();
			for (TokenDetail item0 : this.tokenfilters) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tokenizer != null) {

			generator.writeKey("tokenizer");
			this.tokenizer.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzeDetail}.
	 */
	public static class Builder implements ObjectBuilder<AnalyzeDetail> {
		@Nullable
		private AnalyzerDetail analyzer;

		@Nullable
		private List<CharFilterDetail> charfilters;

		private Boolean customAnalyzer;

		@Nullable
		private List<TokenDetail> tokenfilters;

		@Nullable
		private TokenDetail tokenizer;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable AnalyzerDetail value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(Function<AnalyzerDetail.Builder, ObjectBuilder<AnalyzerDetail>> fn) {
			return this.analyzer(fn.apply(new AnalyzerDetail.Builder()).build());
		}

		/**
		 * API name: {@code charfilters}
		 */
		public Builder charfilters(@Nullable List<CharFilterDetail> value) {
			this.charfilters = value;
			return this;
		}

		/**
		 * API name: {@code charfilters}
		 */
		public Builder charfilters(CharFilterDetail... value) {
			this.charfilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #charfilters(List)}, creating the list if needed.
		 */
		public Builder addCharfilters(CharFilterDetail value) {
			if (this.charfilters == null) {
				this.charfilters = new ArrayList<>();
			}
			this.charfilters.add(value);
			return this;
		}

		/**
		 * Set {@link #charfilters(List)} to a singleton list.
		 */
		public Builder charfilters(Function<CharFilterDetail.Builder, ObjectBuilder<CharFilterDetail>> fn) {
			return this.charfilters(fn.apply(new CharFilterDetail.Builder()).build());
		}

		/**
		 * Add a value to {@link #charfilters(List)}, creating the list if needed.
		 */
		public Builder addCharfilters(Function<CharFilterDetail.Builder, ObjectBuilder<CharFilterDetail>> fn) {
			return this.addCharfilters(fn.apply(new CharFilterDetail.Builder()).build());
		}

		/**
		 * API name: {@code custom_analyzer}
		 */
		public Builder customAnalyzer(Boolean value) {
			this.customAnalyzer = value;
			return this;
		}

		/**
		 * API name: {@code tokenfilters}
		 */
		public Builder tokenfilters(@Nullable List<TokenDetail> value) {
			this.tokenfilters = value;
			return this;
		}

		/**
		 * API name: {@code tokenfilters}
		 */
		public Builder tokenfilters(TokenDetail... value) {
			this.tokenfilters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokenfilters(List)}, creating the list if needed.
		 */
		public Builder addTokenfilters(TokenDetail value) {
			if (this.tokenfilters == null) {
				this.tokenfilters = new ArrayList<>();
			}
			this.tokenfilters.add(value);
			return this;
		}

		/**
		 * Set {@link #tokenfilters(List)} to a singleton list.
		 */
		public Builder tokenfilters(Function<TokenDetail.Builder, ObjectBuilder<TokenDetail>> fn) {
			return this.tokenfilters(fn.apply(new TokenDetail.Builder()).build());
		}

		/**
		 * Add a value to {@link #tokenfilters(List)}, creating the list if needed.
		 */
		public Builder addTokenfilters(Function<TokenDetail.Builder, ObjectBuilder<TokenDetail>> fn) {
			return this.addTokenfilters(fn.apply(new TokenDetail.Builder()).build());
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(@Nullable TokenDetail value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public Builder tokenizer(Function<TokenDetail.Builder, ObjectBuilder<TokenDetail>> fn) {
			return this.tokenizer(fn.apply(new TokenDetail.Builder()).build());
		}

		/**
		 * Builds a {@link AnalyzeDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeDetail build() {

			return new AnalyzeDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for AnalyzeDetail
	 */
	public static final JsonpValueParser<AnalyzeDetail> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, AnalyzeDetail::setupAnalyzeDetailParser);

	protected static void setupAnalyzeDetailParser(DelegatingJsonpValueParser<AnalyzeDetail.Builder> op) {

		op.add(Builder::analyzer, AnalyzerDetail.JSONP_PARSER, "analyzer");
		op.add(Builder::charfilters, JsonpValueParser.arrayParser(CharFilterDetail.JSONP_PARSER), "charfilters");
		op.add(Builder::customAnalyzer, JsonpValueParser.booleanParser(), "custom_analyzer");
		op.add(Builder::tokenfilters, JsonpValueParser.arrayParser(TokenDetail.JSONP_PARSER), "tokenfilters");
		op.add(Builder::tokenizer, TokenDetail.JSONP_PARSER, "tokenizer");

	}

}
