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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Term
public final class Term implements JsonpSerializable {
	@Nullable
	private final Number docFreq;

	@Nullable
	private final Number score;

	private final Number termFreq;

	private final List<Token> tokens;

	@Nullable
	private final Number ttf;

	// ---------------------------------------------------------------------------------------------

	public Term(Builder builder) {

		this.docFreq = builder.docFreq;
		this.score = builder.score;
		this.termFreq = Objects.requireNonNull(builder.termFreq, "term_freq");
		this.tokens = Objects.requireNonNull(builder.tokens, "tokens");
		this.ttf = builder.ttf;

	}

	/**
	 * API name: {@code doc_freq}
	 */
	@Nullable
	public Number docFreq() {
		return this.docFreq;
	}

	/**
	 * API name: {@code score}
	 */
	@Nullable
	public Number score() {
		return this.score;
	}

	/**
	 * API name: {@code term_freq}
	 */
	public Number termFreq() {
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
	public Number ttf() {
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
			generator.write(this.docFreq.doubleValue());

		}
		if (this.score != null) {

			generator.writeKey("score");
			generator.write(this.score.doubleValue());

		}

		generator.writeKey("term_freq");
		generator.write(this.termFreq.doubleValue());

		generator.writeKey("tokens");
		generator.writeStartArray();
		for (Token item0 : this.tokens) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.ttf != null) {

			generator.writeKey("ttf");
			generator.write(this.ttf.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Term}.
	 */
	public static class Builder implements ObjectBuilder<Term> {
		@Nullable
		private Number docFreq;

		@Nullable
		private Number score;

		private Number termFreq;

		private List<Token> tokens;

		@Nullable
		private Number ttf;

		/**
		 * API name: {@code doc_freq}
		 */
		public Builder docFreq(@Nullable Number value) {
			this.docFreq = value;
			return this;
		}

		/**
		 * API name: {@code score}
		 */
		public Builder score(@Nullable Number value) {
			this.score = value;
			return this;
		}

		/**
		 * API name: {@code term_freq}
		 */
		public Builder termFreq(Number value) {
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
		 * Add a value to {@link #tokens(List)}, creating the list if needed.
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
		 * Add a value to {@link #tokens(List)}, creating the list if needed.
		 */
		public Builder addTokens(Function<Token.Builder, ObjectBuilder<Token>> fn) {
			return this.addTokens(fn.apply(new Token.Builder()).build());
		}

		/**
		 * API name: {@code ttf}
		 */
		public Builder ttf(@Nullable Number value) {
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
	public static final JsonpDeserializer<Term> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Term::setupTermDeserializer);

	protected static void setupTermDeserializer(DelegatingDeserializer<Term.Builder> op) {

		op.add(Builder::docFreq, JsonpDeserializer.numberDeserializer(), "doc_freq");
		op.add(Builder::score, JsonpDeserializer.numberDeserializer(), "score");
		op.add(Builder::termFreq, JsonpDeserializer.numberDeserializer(), "term_freq");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(Token.DESERIALIZER), "tokens");
		op.add(Builder::ttf, JsonpDeserializer.numberDeserializer(), "ttf");

	}

}
