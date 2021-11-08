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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.Response
@JsonpDeserializable
public class AnalyzeResponse implements JsonpSerializable {
	@Nullable
	private final AnalyzeDetail detail;

	private final List<AnalyzeToken> tokens;

	// ---------------------------------------------------------------------------------------------

	private AnalyzeResponse(Builder builder) {

		this.detail = builder.detail;
		this.tokens = ModelTypeHelper.unmodifiable(builder.tokens);

	}

	public static AnalyzeResponse of(Function<Builder, ObjectBuilder<AnalyzeResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code detail}
	 */
	@Nullable
	public final AnalyzeDetail detail() {
		return this.detail;
	}

	/**
	 * API name: {@code tokens}
	 */
	public final List<AnalyzeToken> tokens() {
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

		if (this.detail != null) {
			generator.writeKey("detail");
			this.detail.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartArray();
			for (AnalyzeToken item0 : this.tokens) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzeResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AnalyzeResponse> {
		@Nullable
		private AnalyzeDetail detail;

		@Nullable
		private List<AnalyzeToken> tokens;

		/**
		 * API name: {@code detail}
		 */
		public final Builder detail(@Nullable AnalyzeDetail value) {
			this.detail = value;
			return this;
		}

		/**
		 * API name: {@code detail}
		 */
		public final Builder detail(Function<AnalyzeDetail.Builder, ObjectBuilder<AnalyzeDetail>> fn) {
			return this.detail(fn.apply(new AnalyzeDetail.Builder()).build());
		}

		/**
		 * API name: {@code tokens}
		 */
		public final Builder tokens(@Nullable List<AnalyzeToken> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		public final Builder tokens(AnalyzeToken... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code tokens}
		 */
		@SafeVarargs
		public final Builder tokens(Function<AnalyzeToken.Builder, ObjectBuilder<AnalyzeToken>>... fns) {
			this.tokens = new ArrayList<>(fns.length);
			for (Function<AnalyzeToken.Builder, ObjectBuilder<AnalyzeToken>> fn : fns) {
				this.tokens.add(fn.apply(new AnalyzeToken.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link AnalyzeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzeResponse build() {
			_checkSingleUse();

			return new AnalyzeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyzeResponse}
	 */
	public static final JsonpDeserializer<AnalyzeResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalyzeResponse::setupAnalyzeResponseDeserializer, Builder::build);

	protected static void setupAnalyzeResponseDeserializer(DelegatingDeserializer<AnalyzeResponse.Builder> op) {

		op.add(Builder::detail, AnalyzeDetail._DESERIALIZER, "detail");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(AnalyzeToken._DESERIALIZER), "tokens");

	}

}
