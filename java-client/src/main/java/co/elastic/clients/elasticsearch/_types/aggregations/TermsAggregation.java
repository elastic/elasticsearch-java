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

import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TermsAggregation
@JsonpDeserializable
public final class TermsAggregation extends BucketAggregationBase
		implements
			AggregationVariant,
			PivotGroupByVariant,
			CompositeAggregationSourceVariant {
	@Nullable
	private final TermsAggregationCollectMode collectMode;

	@Nullable
	private final List<String> exclude;

	@Nullable
	private final TermsAggregationExecutionHint executionHint;

	@Nullable
	private final String field;

	@Nullable
	private final JsonValue /* Union(Array<internal.string> | _types.aggregations.TermsInclude) */ include;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final String missing;

	@Nullable
	private final Boolean missingBucket;

	@Nullable
	private final String valueType;

	@Nullable
	private final JsonValue /* _types.aggregations.TermsAggregationOrder */ order;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Boolean showTermDocCountError;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	public TermsAggregation(Builder builder) {
		super(builder);

		this.collectMode = builder.collectMode;
		this.exclude = ModelTypeHelper.unmodifiable(builder.exclude);
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

	public TermsAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation}, {@link PivotGroupBy}, {@link CompositeAggregationSource}
	 * variant type
	 */
	@Override
	public String _variantType() {
		return "terms";
	}

	/**
	 * API name: {@code collect_mode}
	 */
	@Nullable
	public TermsAggregationCollectMode collectMode() {
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
	public TermsAggregationExecutionHint executionHint() {
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
	public JsonValue /* Union(Array<internal.string> | _types.aggregations.TermsInclude) */ include() {
		return this.include;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public String missing() {
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
	public JsonValue /* _types.aggregations.TermsAggregationOrder */ order() {
		return this.order;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Integer shardSize() {
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
	public Integer size() {
		return this.size;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.collectMode != null) {

			generator.writeKey("collect_mode");
			this.collectMode.serialize(generator, mapper);
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
			this.executionHint.serialize(generator, mapper);
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
			generator.write(this.minDocCount);

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
			generator.write(this.shardSize);

		}
		if (this.showTermDocCountError != null) {

			generator.writeKey("show_term_doc_count_error");
			generator.write(this.showTermDocCountError);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

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
		private TermsAggregationCollectMode collectMode;

		@Nullable
		private List<String> exclude;

		@Nullable
		private TermsAggregationExecutionHint executionHint;

		@Nullable
		private String field;

		@Nullable
		private JsonValue /* Union(Array<internal.string> | _types.aggregations.TermsInclude) */ include;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private String missing;

		@Nullable
		private Boolean missingBucket;

		@Nullable
		private String valueType;

		@Nullable
		private JsonValue /* _types.aggregations.TermsAggregationOrder */ order;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Boolean showTermDocCountError;

		@Nullable
		private Integer size;

		/**
		 * API name: {@code collect_mode}
		 */
		public Builder collectMode(@Nullable TermsAggregationCollectMode value) {
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
		 * Add a value to {@link #exclude(List)}, creating the list if needed. 4
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
		public Builder executionHint(@Nullable TermsAggregationExecutionHint value) {
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
		public Builder include(
				@Nullable JsonValue /* Union(Array<internal.string> | _types.aggregations.TermsInclude) */ value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public Builder missing(@Nullable String value) {
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
		public Builder order(@Nullable JsonValue /* _types.aggregations.TermsAggregationOrder */ value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Integer value) {
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
		public Builder size(@Nullable Integer value) {
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
	 * Json deserializer for {@link TermsAggregation}
	 */
	public static final JsonpDeserializer<TermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsAggregation::setupTermsAggregationDeserializer, Builder::build);

	protected static void setupTermsAggregationDeserializer(DelegatingDeserializer<TermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::collectMode, TermsAggregationCollectMode._DESERIALIZER, "collect_mode");
		op.add(Builder::exclude, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::executionHint, TermsAggregationExecutionHint._DESERIALIZER, "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::include, JsonpDeserializer.jsonValueDeserializer(), "include");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::missing, JsonpDeserializer.stringDeserializer(), "missing");
		op.add(Builder::missingBucket, JsonpDeserializer.booleanDeserializer(), "missing_bucket");
		op.add(Builder::valueType, JsonpDeserializer.stringDeserializer(), "value_type");
		op.add(Builder::order, JsonpDeserializer.jsonValueDeserializer(), "order");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::showTermDocCountError, JsonpDeserializer.booleanDeserializer(), "show_term_doc_count_error");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
