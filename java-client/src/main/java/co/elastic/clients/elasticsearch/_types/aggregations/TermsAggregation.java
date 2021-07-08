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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TermsAggregation
public final class TermsAggregation extends BucketAggregationBase {
	@Nullable
	private final JsonValue collectMode;

	@Nullable
	private final List<String> exclude;

	@Nullable
	private final JsonValue executionHint;

	@Nullable
	private final String field;

	@Nullable
	private final JsonValue include;

	@Nullable
	private final Number minDocCount;

	@Nullable
	private final JsonValue missing;

	@Nullable
	private final Boolean missingBucket;

	@Nullable
	private final String valueType;

	@Nullable
	private final JsonValue order;

	@Nullable
	private final JsonValue script;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final Boolean showTermDocCountError;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected TermsAggregation(Builder builder) {
		super(builder);
		this.collectMode = builder.collectMode;
		this.exclude = builder.exclude;
		this.executionHint = builder.executionHint;
		this.field = builder.field;
		this.include = builder.include;
		this.minDocCount = builder.minDocCount;
		this.missing = builder.missing;
		this.missingBucket = builder.missingBucket;
		this.valueType = builder.valueType;
		this.order = builder.order;
		this.script = builder.script;
		this.shardSize = builder.shardSize;
		this.showTermDocCountError = builder.showTermDocCountError;
		this.size = builder.size;

	}

	/**
	 * API name: {@code collect_mode}
	 */
	@Nullable
	public JsonValue collectMode() {
		return this.collectMode;
	}

	/**
	 * API name: {@code exclude}
	 */
	@Nullable
	public List<String> exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public JsonValue executionHint() {
		return this.executionHint;
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
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public Number minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public JsonValue missing() {
		return this.missing;
	}

	/**
	 * API name: {@code missing_bucket}
	 */
	@Nullable
	public Boolean missingBucket() {
		return this.missingBucket;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public String valueType() {
		return this.valueType;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public JsonValue order() {
		return this.order;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue script() {
		return this.script;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code show_term_doc_count_error}
	 */
	@Nullable
	public Boolean showTermDocCountError() {
		return this.showTermDocCountError;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.collectMode != null) {

			generator.writeKey("collect_mode");
			generator.write(this.collectMode);

		}
		if (this.exclude != null) {

			generator.writeKey("exclude");
			generator.writeStartArray();
			for (String item0 : this.exclude) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.executionHint != null) {

			generator.writeKey("execution_hint");
			generator.write(this.executionHint);

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.include != null) {

			generator.writeKey("include");
			generator.write(this.include);

		}
		if (this.minDocCount != null) {

			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount.doubleValue());

		}
		if (this.missing != null) {

			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.missingBucket != null) {

			generator.writeKey("missing_bucket");
			generator.write(this.missingBucket);

		}
		if (this.valueType != null) {

			generator.writeKey("value_type");
			generator.write(this.valueType);

		}
		if (this.order != null) {

			generator.writeKey("order");
			generator.write(this.order);

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

		}
		if (this.showTermDocCountError != null) {

			generator.writeKey("show_term_doc_count_error");
			generator.write(this.showTermDocCountError);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TermsAggregation> {
		@Nullable
		private JsonValue collectMode;

		@Nullable
		private List<String> exclude;

		@Nullable
		private JsonValue executionHint;

		@Nullable
		private String field;

		@Nullable
		private JsonValue include;

		@Nullable
		private Number minDocCount;

		@Nullable
		private JsonValue missing;

		@Nullable
		private Boolean missingBucket;

		@Nullable
		private String valueType;

		@Nullable
		private JsonValue order;

		@Nullable
		private JsonValue script;

		@Nullable
		private Number shardSize;

		@Nullable
		private Boolean showTermDocCountError;

		@Nullable
		private Number size;

		/**
		 * API name: {@code collect_mode}
		 */
		public Builder collectMode(@Nullable JsonValue value) {
			this.collectMode = value;
			return this;
		}

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
		 * API name: {@code execution_hint}
		 */
		public Builder executionHint(@Nullable JsonValue value) {
			this.executionHint = value;
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
		 * API name: {@code min_doc_count}
		 */
		public Builder minDocCount(@Nullable Number value) {
			this.minDocCount = value;
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
		 * API name: {@code missing_bucket}
		 */
		public Builder missingBucket(@Nullable Boolean value) {
			this.missingBucket = value;
			return this;
		}

		/**
		 * API name: {@code value_type}
		 */
		public Builder valueType(@Nullable String value) {
			this.valueType = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(@Nullable JsonValue value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Number value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code show_term_doc_count_error}
		 */
		public Builder showTermDocCountError(@Nullable Boolean value) {
			this.showTermDocCountError = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsAggregation build() {

			return new TermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TermsAggregation
	 */
	public static final JsonpDeserializer<TermsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TermsAggregation::setupTermsAggregationDeserializer);

	protected static void setupTermsAggregationDeserializer(DelegatingDeserializer<TermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::collectMode, JsonpDeserializer.jsonValueDeserializer(), "collect_mode");
		op.add(Builder::exclude, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::executionHint, JsonpDeserializer.jsonValueDeserializer(), "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::include, JsonpDeserializer.jsonValueDeserializer(), "include");
		op.add(Builder::minDocCount, JsonpDeserializer.numberDeserializer(), "min_doc_count");
		op.add(Builder::missing, JsonpDeserializer.jsonValueDeserializer(), "missing");
		op.add(Builder::missingBucket, JsonpDeserializer.booleanDeserializer(), "missing_bucket");
		op.add(Builder::valueType, JsonpDeserializer.stringDeserializer(), "value_type");
		op.add(Builder::order, JsonpDeserializer.jsonValueDeserializer(), "order");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");
		op.add(Builder::showTermDocCountError, JsonpDeserializer.booleanDeserializer(), "show_term_doc_count_error");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");

	}

}
