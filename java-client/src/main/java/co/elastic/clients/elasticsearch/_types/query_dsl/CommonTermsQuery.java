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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.CommonTermsQuery
public final class CommonTermsQuery extends QueryBase {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Number cutoffFrequency;

	@Nullable
	private final JsonValue highFreqOperator;

	@Nullable
	private final JsonValue lowFreqOperator;

	@Nullable
	private final JsonValue minimumShouldMatch;

	private final String query;

	// ---------------------------------------------------------------------------------------------

	protected CommonTermsQuery(Builder builder) {
		super(builder);
		this.analyzer = builder.analyzer;
		this.cutoffFrequency = builder.cutoffFrequency;
		this.highFreqOperator = builder.highFreqOperator;
		this.lowFreqOperator = builder.lowFreqOperator;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.query = Objects.requireNonNull(builder.query, "query");

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code cutoff_frequency}
	 */
	@Nullable
	public Number cutoffFrequency() {
		return this.cutoffFrequency;
	}

	/**
	 * API name: {@code high_freq_operator}
	 */
	@Nullable
	public JsonValue highFreqOperator() {
		return this.highFreqOperator;
	}

	/**
	 * API name: {@code low_freq_operator}
	 */
	@Nullable
	public JsonValue lowFreqOperator() {
		return this.lowFreqOperator;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public JsonValue minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.cutoffFrequency != null) {

			generator.writeKey("cutoff_frequency");
			generator.write(this.cutoffFrequency.doubleValue());

		}
		if (this.highFreqOperator != null) {

			generator.writeKey("high_freq_operator");
			generator.write(this.highFreqOperator);

		}
		if (this.lowFreqOperator != null) {

			generator.writeKey("low_freq_operator");
			generator.write(this.lowFreqOperator);

		}
		if (this.minimumShouldMatch != null) {

			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}

		generator.writeKey("query");
		generator.write(this.query);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommonTermsQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<CommonTermsQuery> {
		@Nullable
		private String analyzer;

		@Nullable
		private Number cutoffFrequency;

		@Nullable
		private JsonValue highFreqOperator;

		@Nullable
		private JsonValue lowFreqOperator;

		@Nullable
		private JsonValue minimumShouldMatch;

		private String query;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code cutoff_frequency}
		 */
		public Builder cutoffFrequency(@Nullable Number value) {
			this.cutoffFrequency = value;
			return this;
		}

		/**
		 * API name: {@code high_freq_operator}
		 */
		public Builder highFreqOperator(@Nullable JsonValue value) {
			this.highFreqOperator = value;
			return this;
		}

		/**
		 * API name: {@code low_freq_operator}
		 */
		public Builder lowFreqOperator(@Nullable JsonValue value) {
			this.lowFreqOperator = value;
			return this;
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public Builder minimumShouldMatch(@Nullable JsonValue value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CommonTermsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommonTermsQuery build() {

			return new CommonTermsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CommonTermsQuery
	 */
	public static final JsonpDeserializer<CommonTermsQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CommonTermsQuery::setupCommonTermsQueryDeserializer);

	protected static void setupCommonTermsQueryDeserializer(DelegatingDeserializer<CommonTermsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::cutoffFrequency, JsonpDeserializer.numberDeserializer(), "cutoff_frequency");
		op.add(Builder::highFreqOperator, JsonpDeserializer.jsonValueDeserializer(), "high_freq_operator");
		op.add(Builder::lowFreqOperator, JsonpDeserializer.jsonValueDeserializer(), "low_freq_operator");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");

	}

}
