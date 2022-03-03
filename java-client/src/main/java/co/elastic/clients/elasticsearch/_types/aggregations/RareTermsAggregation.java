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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RareTermsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.RareTermsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RareTermsAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final TermsExclude exclude;

	@Nullable
	private final String field;

	@Nullable
	private final TermsInclude include;

	@Nullable
	private final Long maxDocCount;

	@Nullable
	private final FieldValue missing;

	@Nullable
	private final Double precision;

	@Nullable
	private final String valueType;

	// ---------------------------------------------------------------------------------------------

	private RareTermsAggregation(Builder builder) {
		super(builder);

		this.exclude = builder.exclude;
		this.field = builder.field;
		this.include = builder.include;
		this.maxDocCount = builder.maxDocCount;
		this.missing = builder.missing;
		this.precision = builder.precision;
		this.valueType = builder.valueType;

	}

	public static RareTermsAggregation of(Function<Builder, ObjectBuilder<RareTermsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.RareTerms;
	}

	/**
	 * API name: {@code exclude}
	 */
	@Nullable
	public final TermsExclude exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public final TermsInclude include() {
		return this.include;
	}

	/**
	 * API name: {@code max_doc_count}
	 */
	@Nullable
	public final Long maxDocCount() {
		return this.maxDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final FieldValue missing() {
		return this.missing;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final Double precision() {
		return this.precision;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public final String valueType() {
		return this.valueType;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.exclude != null) {
			generator.writeKey("exclude");
			this.exclude.serialize(generator, mapper);

		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.include != null) {
			generator.writeKey("include");
			this.include.serialize(generator, mapper);

		}
		if (this.maxDocCount != null) {
			generator.writeKey("max_doc_count");
			generator.write(this.maxDocCount);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);

		}
		if (this.precision != null) {
			generator.writeKey("precision");
			generator.write(this.precision);

		}
		if (this.valueType != null) {
			generator.writeKey("value_type");
			generator.write(this.valueType);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RareTermsAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RareTermsAggregation> {
		@Nullable
		private TermsExclude exclude;

		@Nullable
		private String field;

		@Nullable
		private TermsInclude include;

		@Nullable
		private Long maxDocCount;

		@Nullable
		private FieldValue missing;

		@Nullable
		private Double precision;

		@Nullable
		private String valueType;

		/**
		 * API name: {@code exclude}
		 */
		public final Builder exclude(@Nullable TermsExclude value) {
			this.exclude = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public final Builder exclude(Function<TermsExclude.Builder, ObjectBuilder<TermsExclude>> fn) {
			return this.exclude(fn.apply(new TermsExclude.Builder()).build());
		}

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable TermsInclude value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public final Builder include(Function<TermsInclude.Builder, ObjectBuilder<TermsInclude>> fn) {
			return this.include(fn.apply(new TermsInclude.Builder()).build());
		}

		/**
		 * API name: {@code max_doc_count}
		 */
		public final Builder maxDocCount(@Nullable Long value) {
			this.maxDocCount = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable FieldValue value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.missing(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(String value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(long value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(double value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(boolean value) {
			this.missing = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable Double value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code value_type}
		 */
		public final Builder valueType(@Nullable String value) {
			this.valueType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RareTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RareTermsAggregation build() {
			_checkSingleUse();

			return new RareTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RareTermsAggregation}
	 */
	public static final JsonpDeserializer<RareTermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RareTermsAggregation::setupRareTermsAggregationDeserializer);

	protected static void setupRareTermsAggregationDeserializer(ObjectDeserializer<RareTermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::exclude, TermsExclude._DESERIALIZER, "exclude");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::include, TermsInclude._DESERIALIZER, "include");
		op.add(Builder::maxDocCount, JsonpDeserializer.longDeserializer(), "max_doc_count");
		op.add(Builder::missing, FieldValue._DESERIALIZER, "missing");
		op.add(Builder::precision, JsonpDeserializer.doubleDeserializer(), "precision");
		op.add(Builder::valueType, JsonpDeserializer.stringDeserializer(), "value_type");

	}

}
