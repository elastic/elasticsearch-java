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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FuzzyQuery
public final class FuzzyQuery extends QueryBase {
	@Nullable
	private final Number maxExpansions;

	@Nullable
	private final Number prefixLength;

	@Nullable
	private final String rewrite;

	@Nullable
	private final Boolean transpositions;

	@Nullable
	private final JsonValue fuzziness;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	protected FuzzyQuery(Builder builder) {
		super(builder);
		this.maxExpansions = builder.maxExpansions;
		this.prefixLength = builder.prefixLength;
		this.rewrite = builder.rewrite;
		this.transpositions = builder.transpositions;
		this.fuzziness = builder.fuzziness;
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code max_expansions}
	 */
	@Nullable
	public Number maxExpansions() {
		return this.maxExpansions;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public Number prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code rewrite}
	 */
	@Nullable
	public String rewrite() {
		return this.rewrite;
	}

	/**
	 * API name: {@code transpositions}
	 */
	@Nullable
	public Boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public JsonValue fuzziness() {
		return this.fuzziness;
	}

	/**
	 * API name: {@code value}
	 */
	public String value() {
		return this.value;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.maxExpansions != null) {

			generator.writeKey("max_expansions");
			generator.write(this.maxExpansions.doubleValue());

		}
		if (this.prefixLength != null) {

			generator.writeKey("prefix_length");
			generator.write(this.prefixLength.doubleValue());

		}
		if (this.rewrite != null) {

			generator.writeKey("rewrite");
			generator.write(this.rewrite);

		}
		if (this.transpositions != null) {

			generator.writeKey("transpositions");
			generator.write(this.transpositions);

		}
		if (this.fuzziness != null) {

			generator.writeKey("fuzziness");
			generator.write(this.fuzziness);

		}

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FuzzyQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<FuzzyQuery> {
		@Nullable
		private Number maxExpansions;

		@Nullable
		private Number prefixLength;

		@Nullable
		private String rewrite;

		@Nullable
		private Boolean transpositions;

		@Nullable
		private JsonValue fuzziness;

		private String value;

		/**
		 * API name: {@code max_expansions}
		 */
		public Builder maxExpansions(@Nullable Number value) {
			this.maxExpansions = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public Builder prefixLength(@Nullable Number value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code rewrite}
		 */
		public Builder rewrite(@Nullable String value) {
			this.rewrite = value;
			return this;
		}

		/**
		 * API name: {@code transpositions}
		 */
		public Builder transpositions(@Nullable Boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * API name: {@code fuzziness}
		 */
		public Builder fuzziness(@Nullable JsonValue value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FuzzyQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FuzzyQuery build() {

			return new FuzzyQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FuzzyQuery
	 */
	public static final JsonpDeserializer<FuzzyQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FuzzyQuery::setupFuzzyQueryDeserializer);

	protected static void setupFuzzyQueryDeserializer(DelegatingDeserializer<FuzzyQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::maxExpansions, JsonpDeserializer.numberDeserializer(), "max_expansions");
		op.add(Builder::prefixLength, JsonpDeserializer.numberDeserializer(), "prefix_length");
		op.add(Builder::rewrite, JsonpDeserializer.stringDeserializer(), "rewrite");
		op.add(Builder::transpositions, JsonpDeserializer.booleanDeserializer(), "transpositions");
		op.add(Builder::fuzziness, JsonpDeserializer.jsonValueDeserializer(), "fuzziness");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
