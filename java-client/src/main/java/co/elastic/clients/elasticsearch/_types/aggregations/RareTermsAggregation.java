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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RareTermsAggregation
public final class RareTermsAggregation extends BucketAggregationBase {
	@Nullable
	private final List<String> exclude;

	@Nullable
	private final String field;

	@Nullable
	private final JsonValue include;

	@Nullable
	private final Number maxDocCount;

	@Nullable
	private final JsonValue missing;

	@Nullable
	private final Number precision;

	@Nullable
	private final String valueType;

	// ---------------------------------------------------------------------------------------------

	protected RareTermsAggregation(Builder builder) {
		super(builder);
		this.exclude = builder.exclude;
		this.field = builder.field;
		this.include = builder.include;
		this.maxDocCount = builder.maxDocCount;
		this.missing = builder.missing;
		this.precision = builder.precision;
		this.valueType = builder.valueType;

	}

	/**
	 * API name: {@code exclude}
	 */
	@Nullable
	public List<String> exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public JsonValue include() {
		return this.include;
	}

	/**
	 * API name: {@code max_doc_count}
	 */
	@Nullable
	public Number maxDocCount() {
		return this.maxDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public JsonValue missing() {
		return this.missing;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public Number precision() {
		return this.precision;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public String valueType() {
		return this.valueType;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.exclude != null) {

			generator.writeKey("exclude");
			generator.writeStartArray();
			for (String item0 : this.exclude) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.include != null) {

			generator.writeKey("include");
			generator.write(this.include);

		}
		if (this.maxDocCount != null) {

			generator.writeKey("max_doc_count");
			generator.write(this.maxDocCount.doubleValue());

		}
		if (this.missing != null) {

			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.precision != null) {

			generator.writeKey("precision");
			generator.write(this.precision.doubleValue());

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
		private List<String> exclude;

		@Nullable
		private String field;

		@Nullable
		private JsonValue include;

		@Nullable
		private Number maxDocCount;

		@Nullable
		private JsonValue missing;

		@Nullable
		private Number precision;

		@Nullable
		private String valueType;

		/**
		 * API name: {@code exclude}
		 */
		public Builder exclude(@Nullable List<String> value) {
			this.exclude = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public Builder exclude(String... value) {
			this.exclude = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #exclude(List)}, creating the list if needed.
		 */
		public Builder addExclude(String value) {
			if (this.exclude == null) {
				this.exclude = new ArrayList<>();
			}
			this.exclude.add(value);
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(@Nullable JsonValue value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code max_doc_count}
		 */
		public Builder maxDocCount(@Nullable Number value) {
			this.maxDocCount = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public Builder missing(@Nullable JsonValue value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public Builder precision(@Nullable Number value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code value_type}
		 */
		public Builder valueType(@Nullable String value) {
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

			return new RareTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RareTermsAggregation
	 */
	public static final JsonpDeserializer<RareTermsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RareTermsAggregation::setupRareTermsAggregationDeserializer);

	protected static void setupRareTermsAggregationDeserializer(
			DelegatingDeserializer<RareTermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::exclude, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::include, JsonpDeserializer.jsonValueDeserializer(), "include");
		op.add(Builder::maxDocCount, JsonpDeserializer.numberDeserializer(), "max_doc_count");
		op.add(Builder::missing, JsonpDeserializer.jsonValueDeserializer(), "missing");
		op.add(Builder::precision, JsonpDeserializer.numberDeserializer(), "precision");
		op.add(Builder::valueType, JsonpDeserializer.stringDeserializer(), "value_type");

	}

}
