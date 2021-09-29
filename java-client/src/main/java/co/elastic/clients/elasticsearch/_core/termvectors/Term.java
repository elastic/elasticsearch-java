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

package co.elastic.clients.elasticsearch._core.termvectors;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Term
@JsonpDeserializable
public final class Term implements JsonpSerializable {
	@Nullable
	private final Integer docFreq;

	@Nullable
	private final Double score;

	private final int termFreq;

	private final List<Token> tokens;

	@Nullable
	private final Integer ttf;

	// ---------------------------------------------------------------------------------------------

	public Term(Builder builder) {

		this.docFreq = builder.docFreq;
		this.score = builder.score;
		this.termFreq = Objects.requireNonNull(builder.termFreq, "term_freq");
		this.tokens = ModelTypeHelper.unmodifiableNonNull(builder.tokens, "tokens");
		this.ttf = builder.ttf;

	}

	public Term(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code doc_freq}
	 */
	@Nullable
	public Integer docFreq() {
		return this.docFreq;
	}

	/**
	 * API name: {@code score}
	 */
	@Nullable
	public Double score() {
		return this.score;
	}

	/**
	 * API name: {@code term_freq}
	 */
	public int termFreq() {
		return this.termFreq;
	}

	/**
	 * API name: {@code tokens}
	 */
	public List<Token> tokens() {
		return this.tokens;
	}

	/**
	 * API name: {@code ttf}
	 */
	@Nullable
	public Integer ttf() {
		return this.ttf;
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

		if (this.docFreq != null) {

			generator.writeKey("doc_freq");
			generator.write(this.docFreq);

		}
		if (this.score != null) {

			generator.writeKey("score");
			generator.write(this.score);

		}

		generator.writeKey("term_freq");
		generator.write(this.termFreq);

		generator.writeKey("tokens");
		generator.writeStartArray();
		for (Token item0 : this.tokens) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.ttf != null) {

			generator.writeKey("ttf");
			generator.write(this.ttf);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Term}.
	 */
	public static class Builder implements ObjectBuilder<Term> {
		@Nullable
		private Integer docFreq;

		@Nullable
		private Double score;

		private Integer termFreq;

		private List<Token> tokens;

		@Nullable
		private Integer ttf;

		/**
		 * API name: {@code doc_freq}
		 */
		public Builder docFreq(@Nullable Integer value) {
			this.docFreq = value;
			return this;
		}

		/**
		 * API name: {@code score}
		 */
		public Builder score(@Nullable Double value) {
			this.score = value;
			return this;
		}

		/**
		 * API name: {@code term_freq}
		 */
		public Builder termFreq(int value) {
			this.termFreq = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(List<Token> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(Token... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed. 4
		 */
		public Builder addTokens(Token value) {
			if (this.tokens == null) {
				this.tokens = new ArrayList<>();
			}
			this.tokens.add(value);
			return this;
		}

		/**
		 * Set {@link #tokens(List)} to a singleton list.
		 */
		public Builder tokens(Function<Token.Builder, ObjectBuilder<Token>> fn) {
			return this.tokens(fn.apply(new Token.Builder()).build());
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed. 5
		 */
		public Builder addTokens(Function<Token.Builder, ObjectBuilder<Token>> fn) {
			return this.addTokens(fn.apply(new Token.Builder()).build());
		}

		/**
		 * API name: {@code ttf}
		 */
		public Builder ttf(@Nullable Integer value) {
			this.ttf = value;
			return this;
		}

		/**
		 * Builds a {@link Term}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Term build() {

			return new Term(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Term}
	 */
	public static final JsonpDeserializer<Term> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Term::setupTermDeserializer, Builder::build);

	protected static void setupTermDeserializer(DelegatingDeserializer<Term.Builder> op) {

		op.add(Builder::docFreq, JsonpDeserializer.integerDeserializer(), "doc_freq");
		op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "score");
		op.add(Builder::termFreq, JsonpDeserializer.integerDeserializer(), "term_freq");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(Token._DESERIALIZER), "tokens");
		op.add(Builder::ttf, JsonpDeserializer.integerDeserializer(), "ttf");

	}

}
