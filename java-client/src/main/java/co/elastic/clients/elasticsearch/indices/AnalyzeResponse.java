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

import co.elastic.clients.elasticsearch.indices.analyze.AnalyzeDetail;
import co.elastic.clients.elasticsearch.indices.analyze.AnalyzeToken;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.Response
public final class AnalyzeResponse implements ToJsonp {
	@Nullable
	private final AnalyzeDetail detail;

	@Nullable
	private final List<AnalyzeToken> tokens;

	// ---------------------------------------------------------------------------------------------

	protected AnalyzeResponse(Builder builder) {

		this.detail = builder.detail;
		this.tokens = builder.tokens;

	}

	/**
	 * API name: {@code detail}
	 */
	@Nullable
	public AnalyzeDetail detail() {
		return this.detail;
	}

	/**
	 * API name: {@code tokens}
	 */
	@Nullable
	public List<AnalyzeToken> tokens() {
		return this.tokens;
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

		if (this.detail != null) {

			generator.writeKey("detail");
			this.detail.toJsonp(generator, mapper);

		}
		if (this.tokens != null) {

			generator.writeKey("tokens");
			generator.writeStartArray();
			for (AnalyzeToken item0 : this.tokens) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzeResponse}.
	 */
	public static class Builder implements ObjectBuilder<AnalyzeResponse> {
		@Nullable
		private AnalyzeDetail detail;

		@Nullable
		private List<AnalyzeToken> tokens;

		/**
		 * API name: {@code detail}
		 */
		public Builder detail(@Nullable AnalyzeDetail value) {
			this.detail = value;
			return this;
		}

		/**
		 * API name: {@code detail}
		 */
		public Builder detail(Function<AnalyzeDetail.Builder, ObjectBuilder<AnalyzeDetail>> fn) {
			return this.detail(fn.apply(new AnalyzeDetail.Builder()).build());
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(@Nullable List<AnalyzeToken> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public Builder tokens(AnalyzeToken... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed.
		 */
		public Builder addTokens(AnalyzeToken value) {
			if (this.tokens == null) {
				this.tokens = new ArrayList<>();
			}
			this.tokens.add(value);
			return this;
		}

		/**
		 * Set {@link #tokens(List)} to a singleton list.
		 */
		public Builder tokens(Function<AnalyzeToken.Builder, ObjectBuilder<AnalyzeToken>> fn) {
			return this.tokens(fn.apply(new AnalyzeToken.Builder()).build());
		}

		/**
		 * Add a value to {@link #tokens(List)}, creating the list if needed.
		 */
		public Builder addTokens(Function<AnalyzeToken.Builder, ObjectBuilder<AnalyzeToken>> fn) {
			return this.addTokens(fn.apply(new AnalyzeToken.Builder()).build());
		}

		/**
		 * Builds a {@link AnalyzeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeResponse build() {

			return new AnalyzeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AnalyzeResponse
	 */
	public static final JsonpDeserializer<AnalyzeResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalyzeResponse::setupAnalyzeResponseDeserializer);

	protected static void setupAnalyzeResponseDeserializer(DelegatingDeserializer<AnalyzeResponse.Builder> op) {

		op.add(Builder::detail, AnalyzeDetail.DESERIALIZER, "detail");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(AnalyzeToken.DESERIALIZER), "tokens");

	}

}
