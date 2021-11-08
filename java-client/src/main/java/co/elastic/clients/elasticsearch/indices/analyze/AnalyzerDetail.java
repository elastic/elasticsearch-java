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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.analyze.AnalyzerDetail
@JsonpDeserializable
public class AnalyzerDetail implements JsonpSerializable {
	private final String name;

	private final List<ExplainAnalyzeToken> tokens;

	// ---------------------------------------------------------------------------------------------

	private AnalyzerDetail(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.tokens = ModelTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");

	}

	public static AnalyzerDetail of(Function<Builder, ObjectBuilder<AnalyzerDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code tokens}
	 */
	public final List<ExplainAnalyzeToken> tokens() {
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

		if (ModelTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartArray();
			for (ExplainAnalyzeToken item0 : this.tokens) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyzerDetail}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AnalyzerDetail> {
		private String name;

		private List<ExplainAnalyzeToken> tokens;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		public final Builder tokens(List<ExplainAnalyzeToken> value) {
			this.tokens = value;
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		public final Builder tokens(ExplainAnalyzeToken... value) {
			this.tokens = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code tokens}
		 */
		@SafeVarargs
		public final Builder tokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>>... fns) {
			this.tokens = new ArrayList<>(fns.length);
			for (Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn : fns) {
				this.tokens.add(fn.apply(new ExplainAnalyzeToken.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link AnalyzerDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyzerDetail build() {
			_checkSingleUse();

			return new AnalyzerDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyzerDetail}
	 */
	public static final JsonpDeserializer<AnalyzerDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnalyzerDetail::setupAnalyzerDetailDeserializer, Builder::build);

	protected static void setupAnalyzerDetailDeserializer(DelegatingDeserializer<AnalyzerDetail.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(ExplainAnalyzeToken._DESERIALIZER), "tokens");

	}

}
