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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.TokenDetail
@JsonpDeserializable
public final class TokenDetail implements JsonpSerializable {
	private final String name;

	private final List<ExplainAnalyzeToken> tokens;

	// ---------------------------------------------------------------------------------------------

	public TokenDetail(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.tokens = ModelTypeHelper.unmodifiableNonNull(builder.tokens, "tokens");

	}

	public TokenDetail(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code tokens}
	 */
	public List<ExplainAnalyzeToken> tokens() {
		return this.tokens;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("tokens");
		generator.writeStartArray();
		for (ExplainAnalyzeToken item0 : this.tokens) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TokenDetail}.
	 */
	public static class Builder implements ObjectBuilder<TokenDetail> {
		private String name;

		private List<ExplainAnalyzeToken> tokens;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(List<ExplainAnalyzeToken> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(ExplainAnalyzeToken... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed. 4
		 */
		public Builder addTokens(ExplainAnalyzeToken value) {
			if (this.tokens == null) {
				this.tokens = new ArrayList<>();
			}
			this.tokens.add(value);
			return this;
		}

		/**
		 * Set {@link #tokens(List)} to a singleton list.
		 */
		public Builder tokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
			return this.tokens(fn.apply(new ExplainAnalyzeToken.Builder()).build());
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed. 5
		 */
		public Builder addTokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
			return this.addTokens(fn.apply(new ExplainAnalyzeToken.Builder()).build());
		}

		/**
		 * Builds a {@link TokenDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TokenDetail build() {

			return new TokenDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TokenDetail}
	 */
	public static final JsonpDeserializer<TokenDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TokenDetail::setupTokenDetailDeserializer, Builder::build);

	protected static void setupTokenDetailDeserializer(DelegatingDeserializer<TokenDetail.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(ExplainAnalyzeToken._DESERIALIZER), "tokens");

	}

}
