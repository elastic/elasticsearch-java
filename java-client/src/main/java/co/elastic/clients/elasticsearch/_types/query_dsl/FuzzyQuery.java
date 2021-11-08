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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FuzzyQuery
@JsonpDeserializable
public class FuzzyQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final Integer maxExpansions;

	@Nullable
	private final Integer prefixLength;

	@Nullable
	private final String rewrite;

	@Nullable
	private final Boolean transpositions;

	@Nullable
	private final String fuzziness;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private FuzzyQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");

		this.maxExpansions = builder.maxExpansions;
		this.prefixLength = builder.prefixLength;
		this.rewrite = builder.rewrite;
		this.transpositions = builder.transpositions;
		this.fuzziness = builder.fuzziness;
		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static FuzzyQuery of(Function<Builder, ObjectBuilder<FuzzyQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "fuzzy";
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code max_expansions}
	 */
	@Nullable
	public final Integer maxExpansions() {
		return this.maxExpansions;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public final Integer prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code rewrite}
	 */
	@Nullable
	public final String rewrite() {
		return this.rewrite;
	}

	/**
	 * API name: {@code transpositions}
	 */
	@Nullable
	public final Boolean transpositions() {
		return this.transpositions;
	}

	/**
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public final String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final String value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (this.maxExpansions != null) {
			generator.writeKey("max_expansions");
			generator.write(this.maxExpansions);

		}
		if (this.prefixLength != null) {
			generator.writeKey("prefix_length");
			generator.write(this.prefixLength);

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

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FuzzyQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<FuzzyQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private Integer maxExpansions;

		@Nullable
		private Integer prefixLength;

		@Nullable
		private String rewrite;

		@Nullable
		private Boolean transpositions;

		@Nullable
		private String fuzziness;

		private String value;

		/**
		 * API name: {@code max_expansions}
		 */
		public final Builder maxExpansions(@Nullable Integer value) {
			this.maxExpansions = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public final Builder prefixLength(@Nullable Integer value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code rewrite}
		 */
		public final Builder rewrite(@Nullable String value) {
			this.rewrite = value;
			return this;
		}

		/**
		 * API name: {@code transpositions}
		 */
		public final Builder transpositions(@Nullable Boolean value) {
			this.transpositions = value;
			return this;
		}

		/**
		 * API name: {@code fuzziness}
		 */
		public final Builder fuzziness(@Nullable String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
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
			_checkSingleUse();

			return new FuzzyQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FuzzyQuery}
	 */
	public static final JsonpDeserializer<FuzzyQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FuzzyQuery::setupFuzzyQueryDeserializer, Builder::build);

	protected static void setupFuzzyQueryDeserializer(DelegatingDeserializer<FuzzyQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::maxExpansions, JsonpDeserializer.integerDeserializer(), "max_expansions");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::rewrite, JsonpDeserializer.stringDeserializer(), "rewrite");
		op.add(Builder::transpositions, JsonpDeserializer.booleanDeserializer(), "transpositions");
		op.add(Builder::fuzziness, JsonpDeserializer.stringDeserializer(), "fuzziness");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("value");

	}

}
