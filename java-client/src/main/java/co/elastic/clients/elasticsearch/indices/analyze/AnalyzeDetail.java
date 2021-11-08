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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.AnalyzeDetail
@JsonpDeserializable
public class AnalyzeDetail implements JsonpSerializable {
	@Nullable
	private final AnalyzerDetail analyzer;

	private final List<CharFilterDetail> charfilters;

	private final boolean customAnalyzer;

	private final List<TokenDetail> tokenfilters;

	@Nullable
	private final TokenDetail tokenizer;

	// ---------------------------------------------------------------------------------------------

	private AnalyzeDetail(Builder builder) {

		this.analyzer = builder.analyzer;
		this.charfilters = ModelTypeHelper.unmodifiable(builder.charfilters);
		this.customAnalyzer = ModelTypeHelper.requireNonNull(builder.customAnalyzer, this, "customAnalyzer");
		this.tokenfilters = ModelTypeHelper.unmodifiable(builder.tokenfilters);
		this.tokenizer = builder.tokenizer;

	}

	public static AnalyzeDetail of(Function<Builder, ObjectBuilder<AnalyzeDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final AnalyzerDetail analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code charfilters}
	 */
	public final List<CharFilterDetail> charfilters() {
		return this.charfilters;
	}

	/**
	 * Required - API name: {@code custom_analyzer}
	 */
	public final boolean customAnalyzer() {
		return this.customAnalyzer;
	}

	/**
	 * API name: {@code tokenfilters}
	 */
	public final List<TokenDetail> tokenfilters() {
		return this.tokenfilters;
	}

	/**
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public final TokenDetail tokenizer() {
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
			this.analyzer.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.charfilters)) {
			generator.writeKey("charfilters");
			generator.writeStartArray();
			for (CharFilterDetail item0 : this.charfilters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("custom_analyzer");
		generator.write(this.customAnalyzer);

		if (ModelTypeHelper.isDefined(this.tokenfilters)) {
			generator.writeKey("tokenfilters");
			generator.writeStartArray();
			for (TokenDetail item0 : this.tokenfilters) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link AnalyzeDetail}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AnalyzeDetail> {
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
		public final Builder analyzer(@Nullable AnalyzerDetail value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(Function<AnalyzerDetail.Builder, ObjectBuilder<AnalyzerDetail>> fn) {
			return this.analyzer(fn.apply(new AnalyzerDetail.Builder()).build());
		}

		/**
		 * API name: {@code charfilters}
		 */
		public final Builder charfilters(@Nullable List<CharFilterDetail> value) {
			this.charfilters = value;
			return this;
		}

		/**
		 * API name: {@code charfilters}
		 */
		public final Builder charfilters(CharFilterDetail... value) {
			this.charfilters = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code charfilters}
		 */
		@SafeVarargs
		public final Builder charfilters(Function<CharFilterDetail.Builder, ObjectBuilder<CharFilterDetail>>... fns) {
			this.charfilters = new ArrayList<>(fns.length);
			for (Function<CharFilterDetail.Builder, ObjectBuilder<CharFilterDetail>> fn : fns) {
				this.charfilters.add(fn.apply(new CharFilterDetail.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code custom_analyzer}
		 */
		public final Builder customAnalyzer(boolean value) {
			this.customAnalyzer = value;
			return this;
		}

		/**
		 * API name: {@code tokenfilters}
		 */
		public final Builder tokenfilters(@Nullable List<TokenDetail> value) {
			this.tokenfilters = value;
			return this;
		}

		/**
		 * API name: {@code tokenfilters}
		 */
		public final Builder tokenfilters(TokenDetail... value) {
			this.tokenfilters = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code tokenfilters}
		 */
		@SafeVarargs
		public final Builder tokenfilters(Function<TokenDetail.Builder, ObjectBuilder<TokenDetail>>... fns) {
			this.tokenfilters = new ArrayList<>(fns.length);
			for (Function<TokenDetail.Builder, ObjectBuilder<TokenDetail>> fn : fns) {
				this.tokenfilters.add(fn.apply(new TokenDetail.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(@Nullable TokenDetail value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(Function<TokenDetail.Builder, ObjectBuilder<TokenDetail>> fn) {
			return this.tokenizer(fn.apply(new TokenDetail.Builder()).build());
		}

		/**
		 * Builds a {@link AnalyzeDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeDetail build() {
			_checkSingleUse();

			return new AnalyzeDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyzeDetail}
	 */
	public static final JsonpDeserializer<AnalyzeDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalyzeDetail::setupAnalyzeDetailDeserializer, Builder::build);

	protected static void setupAnalyzeDetailDeserializer(DelegatingDeserializer<AnalyzeDetail.Builder> op) {

		op.add(Builder::analyzer, AnalyzerDetail._DESERIALIZER, "analyzer");
		op.add(Builder::charfilters, JsonpDeserializer.arrayDeserializer(CharFilterDetail._DESERIALIZER),
				"charfilters");
		op.add(Builder::customAnalyzer, JsonpDeserializer.booleanDeserializer(), "custom_analyzer");
		op.add(Builder::tokenfilters, JsonpDeserializer.arrayDeserializer(TokenDetail._DESERIALIZER), "tokenfilters");
		op.add(Builder::tokenizer, TokenDetail._DESERIALIZER, "tokenizer");

	}

}
