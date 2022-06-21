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
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TermsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TermsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermsAggregation extends BucketAggregationBase implements AggregationVariant, PivotGroupByVariant {
	@Nullable
	private final TermsAggregationCollectMode collectMode;

	@Nullable
	private final TermsExclude exclude;

	@Nullable
	private final TermsAggregationExecutionHint executionHint;

	@Nullable
	private final String field;

	@Nullable
	private final TermsInclude include;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final FieldValue missing;

	@Nullable
	private final MissingOrder missingOrder;

	@Nullable
	private final Boolean missingBucket;

	@Nullable
	private final String valueType;

	private final List<NamedValue<SortOrder>> order;

	@Nullable
	private final Script script;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Boolean showTermDocCountError;

	@Nullable
	private final Integer size;

	@Nullable
	private final String format;

	// ---------------------------------------------------------------------------------------------

	private TermsAggregation(Builder builder) {
		super(builder);

		this.collectMode = builder.collectMode;
		this.exclude = builder.exclude;
		this.executionHint = builder.executionHint;
		this.field = builder.field;
		this.include = builder.include;
		this.minDocCount = builder.minDocCount;
		this.missing = builder.missing;
		this.missingOrder = builder.missingOrder;
		this.missingBucket = builder.missingBucket;
		this.valueType = builder.valueType;
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.script = builder.script;
		this.shardSize = builder.shardSize;
		this.showTermDocCountError = builder.showTermDocCountError;
		this.size = builder.size;
		this.format = builder.format;

	}

	public static TermsAggregation of(Function<Builder, ObjectBuilder<TermsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Terms;
	}

	/**
	 * PivotGroupBy variant kind.
	 */
	@Override
	public PivotGroupBy.Kind _pivotGroupByKind() {
		return PivotGroupBy.Kind.Terms;
	}

	/**
	 * API name: {@code collect_mode}
	 */
	@Nullable
	public final TermsAggregationCollectMode collectMode() {
		return this.collectMode;
	}

	/**
	 * API name: {@code exclude}
	 */
	@Nullable
	public final TermsExclude exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final TermsAggregationExecutionHint executionHint() {
		return this.executionHint;
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
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final FieldValue missing() {
		return this.missing;
	}

	/**
	 * API name: {@code missing_order}
	 */
	@Nullable
	public final MissingOrder missingOrder() {
		return this.missingOrder;
	}

	/**
	 * API name: {@code missing_bucket}
	 */
	@Nullable
	public final Boolean missingBucket() {
		return this.missingBucket;
	}

	/**
	 * API name: {@code value_type}
	 */
	@Nullable
	public final String valueType() {
		return this.valueType;
	}

	/**
	 * API name: {@code order}
	 */
	public final List<NamedValue<SortOrder>> order() {
		return this.order;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code show_term_doc_count_error}
	 */
	@Nullable
	public final Boolean showTermDocCountError() {
		return this.showTermDocCountError;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.collectMode != null) {
			generator.writeKey("collect_mode");
			this.collectMode.serialize(generator, mapper);
		}
		if (this.exclude != null) {
			generator.writeKey("exclude");
			this.exclude.serialize(generator, mapper);

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
			this.include.serialize(generator, mapper);

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);

		}
		if (this.missingOrder != null) {
			generator.writeKey("missing_order");
			this.missingOrder.serialize(generator, mapper);
		}
		if (this.missingBucket != null) {
			generator.writeKey("missing_bucket");
			generator.write(this.missingBucket);

		}
		if (this.valueType != null) {
			generator.writeKey("value_type");
			generator.write(this.valueType);

		}
		if (ApiTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (NamedValue<SortOrder> item0 : this.order) {
				generator.writeStartObject();
				generator.writeKey(item0.name());
				item0.value().serialize(generator, mapper);
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

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
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

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
		private TermsExclude exclude;

		@Nullable
		private TermsAggregationExecutionHint executionHint;

		@Nullable
		private String field;

		@Nullable
		private TermsInclude include;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private FieldValue missing;

		@Nullable
		private MissingOrder missingOrder;

		@Nullable
		private Boolean missingBucket;

		@Nullable
		private String valueType;

		@Nullable
		private List<NamedValue<SortOrder>> order;

		@Nullable
		private Script script;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Boolean showTermDocCountError;

		@Nullable
		private Integer size;

		@Nullable
		private String format;

		/**
		 * API name: {@code collect_mode}
		 */
		public final Builder collectMode(@Nullable TermsAggregationCollectMode value) {
			this.collectMode = value;
			return this;
		}

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
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable TermsAggregationExecutionHint value) {
			this.executionHint = value;
			return this;
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
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
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
		 * API name: {@code missing_order}
		 */
		public final Builder missingOrder(@Nullable MissingOrder value) {
			this.missingOrder = value;
			return this;
		}

		/**
		 * API name: {@code missing_bucket}
		 */
		public final Builder missingBucket(@Nullable Boolean value) {
			this.missingBucket = value;
			return this;
		}

		/**
		 * API name: {@code value_type}
		 */
		public final Builder valueType(@Nullable String value) {
			this.valueType = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>order</code>.
		 */
		public final Builder order(List<NamedValue<SortOrder>> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds one or more values to <code>order</code>.
		 */
		public final Builder order(NamedValue<SortOrder> value, NamedValue<SortOrder>... values) {
			this.order = _listAdd(this.order, value, values);
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code show_term_doc_count_error}
		 */
		public final Builder showTermDocCountError(@Nullable Boolean value) {
			this.showTermDocCountError = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
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
			_checkSingleUse();

			return new TermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsAggregation}
	 */
	public static final JsonpDeserializer<TermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsAggregation::setupTermsAggregationDeserializer);

	protected static void setupTermsAggregationDeserializer(ObjectDeserializer<TermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::collectMode, TermsAggregationCollectMode._DESERIALIZER, "collect_mode");
		op.add(Builder::exclude, TermsExclude._DESERIALIZER, "exclude");
		op.add(Builder::executionHint, TermsAggregationExecutionHint._DESERIALIZER, "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::include, TermsInclude._DESERIALIZER, "include");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::missing, FieldValue._DESERIALIZER, "missing");
		op.add(Builder::missingOrder, MissingOrder._DESERIALIZER, "missing_order");
		op.add(Builder::missingBucket, JsonpDeserializer.booleanDeserializer(), "missing_bucket");
		op.add(Builder::valueType, JsonpDeserializer.stringDeserializer(), "value_type");
		op.add(Builder::order,
				JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> SortOrder._DESERIALIZER)), "order");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::showTermDocCountError, JsonpDeserializer.booleanDeserializer(), "show_term_doc_count_error");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");

	}

}
