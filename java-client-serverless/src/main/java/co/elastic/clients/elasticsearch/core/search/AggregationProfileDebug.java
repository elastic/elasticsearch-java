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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationProfileDebug

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.AggregationProfileDebug">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregationProfileDebug implements JsonpSerializable {
	@Nullable
	private final Integer segmentsWithMultiValuedOrds;

	@Nullable
	private final String collectionStrategy;

	@Nullable
	private final Integer segmentsWithSingleValuedOrds;

	@Nullable
	private final Integer totalBuckets;

	@Nullable
	private final Integer builtBuckets;

	@Nullable
	private final String resultStrategy;

	@Nullable
	private final Boolean hasFilter;

	@Nullable
	private final String delegate;

	@Nullable
	private final AggregationProfileDebug delegateDebug;

	@Nullable
	private final Integer charsFetched;

	@Nullable
	private final Integer extractCount;

	@Nullable
	private final Integer extractNs;

	@Nullable
	private final Integer valuesFetched;

	@Nullable
	private final Integer collectAnalyzedNs;

	@Nullable
	private final Integer collectAnalyzedCount;

	@Nullable
	private final Integer survivingBuckets;

	@Nullable
	private final Integer ordinalsCollectorsUsed;

	@Nullable
	private final Integer ordinalsCollectorsOverheadTooHigh;

	@Nullable
	private final Integer stringHashingCollectorsUsed;

	@Nullable
	private final Integer numericCollectorsUsed;

	@Nullable
	private final Integer emptyCollectorsUsed;

	private final List<String> deferredAggregators;

	@Nullable
	private final Integer segmentsWithDocCountField;

	@Nullable
	private final Integer segmentsWithDeletedDocs;

	private final List<AggregationProfileDelegateDebugFilter> filters;

	@Nullable
	private final Integer segmentsCounted;

	@Nullable
	private final Integer segmentsCollected;

	@Nullable
	private final String mapReducer;

	// ---------------------------------------------------------------------------------------------

	private AggregationProfileDebug(Builder builder) {

		this.segmentsWithMultiValuedOrds = builder.segmentsWithMultiValuedOrds;
		this.collectionStrategy = builder.collectionStrategy;
		this.segmentsWithSingleValuedOrds = builder.segmentsWithSingleValuedOrds;
		this.totalBuckets = builder.totalBuckets;
		this.builtBuckets = builder.builtBuckets;
		this.resultStrategy = builder.resultStrategy;
		this.hasFilter = builder.hasFilter;
		this.delegate = builder.delegate;
		this.delegateDebug = builder.delegateDebug;
		this.charsFetched = builder.charsFetched;
		this.extractCount = builder.extractCount;
		this.extractNs = builder.extractNs;
		this.valuesFetched = builder.valuesFetched;
		this.collectAnalyzedNs = builder.collectAnalyzedNs;
		this.collectAnalyzedCount = builder.collectAnalyzedCount;
		this.survivingBuckets = builder.survivingBuckets;
		this.ordinalsCollectorsUsed = builder.ordinalsCollectorsUsed;
		this.ordinalsCollectorsOverheadTooHigh = builder.ordinalsCollectorsOverheadTooHigh;
		this.stringHashingCollectorsUsed = builder.stringHashingCollectorsUsed;
		this.numericCollectorsUsed = builder.numericCollectorsUsed;
		this.emptyCollectorsUsed = builder.emptyCollectorsUsed;
		this.deferredAggregators = ApiTypeHelper.unmodifiable(builder.deferredAggregators);
		this.segmentsWithDocCountField = builder.segmentsWithDocCountField;
		this.segmentsWithDeletedDocs = builder.segmentsWithDeletedDocs;
		this.filters = ApiTypeHelper.unmodifiable(builder.filters);
		this.segmentsCounted = builder.segmentsCounted;
		this.segmentsCollected = builder.segmentsCollected;
		this.mapReducer = builder.mapReducer;

	}

	public static AggregationProfileDebug of(Function<Builder, ObjectBuilder<AggregationProfileDebug>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code segments_with_multi_valued_ords}
	 */
	@Nullable
	public final Integer segmentsWithMultiValuedOrds() {
		return this.segmentsWithMultiValuedOrds;
	}

	/**
	 * API name: {@code collection_strategy}
	 */
	@Nullable
	public final String collectionStrategy() {
		return this.collectionStrategy;
	}

	/**
	 * API name: {@code segments_with_single_valued_ords}
	 */
	@Nullable
	public final Integer segmentsWithSingleValuedOrds() {
		return this.segmentsWithSingleValuedOrds;
	}

	/**
	 * API name: {@code total_buckets}
	 */
	@Nullable
	public final Integer totalBuckets() {
		return this.totalBuckets;
	}

	/**
	 * API name: {@code built_buckets}
	 */
	@Nullable
	public final Integer builtBuckets() {
		return this.builtBuckets;
	}

	/**
	 * API name: {@code result_strategy}
	 */
	@Nullable
	public final String resultStrategy() {
		return this.resultStrategy;
	}

	/**
	 * API name: {@code has_filter}
	 */
	@Nullable
	public final Boolean hasFilter() {
		return this.hasFilter;
	}

	/**
	 * API name: {@code delegate}
	 */
	@Nullable
	public final String delegate() {
		return this.delegate;
	}

	/**
	 * API name: {@code delegate_debug}
	 */
	@Nullable
	public final AggregationProfileDebug delegateDebug() {
		return this.delegateDebug;
	}

	/**
	 * API name: {@code chars_fetched}
	 */
	@Nullable
	public final Integer charsFetched() {
		return this.charsFetched;
	}

	/**
	 * API name: {@code extract_count}
	 */
	@Nullable
	public final Integer extractCount() {
		return this.extractCount;
	}

	/**
	 * API name: {@code extract_ns}
	 */
	@Nullable
	public final Integer extractNs() {
		return this.extractNs;
	}

	/**
	 * API name: {@code values_fetched}
	 */
	@Nullable
	public final Integer valuesFetched() {
		return this.valuesFetched;
	}

	/**
	 * API name: {@code collect_analyzed_ns}
	 */
	@Nullable
	public final Integer collectAnalyzedNs() {
		return this.collectAnalyzedNs;
	}

	/**
	 * API name: {@code collect_analyzed_count}
	 */
	@Nullable
	public final Integer collectAnalyzedCount() {
		return this.collectAnalyzedCount;
	}

	/**
	 * API name: {@code surviving_buckets}
	 */
	@Nullable
	public final Integer survivingBuckets() {
		return this.survivingBuckets;
	}

	/**
	 * API name: {@code ordinals_collectors_used}
	 */
	@Nullable
	public final Integer ordinalsCollectorsUsed() {
		return this.ordinalsCollectorsUsed;
	}

	/**
	 * API name: {@code ordinals_collectors_overhead_too_high}
	 */
	@Nullable
	public final Integer ordinalsCollectorsOverheadTooHigh() {
		return this.ordinalsCollectorsOverheadTooHigh;
	}

	/**
	 * API name: {@code string_hashing_collectors_used}
	 */
	@Nullable
	public final Integer stringHashingCollectorsUsed() {
		return this.stringHashingCollectorsUsed;
	}

	/**
	 * API name: {@code numeric_collectors_used}
	 */
	@Nullable
	public final Integer numericCollectorsUsed() {
		return this.numericCollectorsUsed;
	}

	/**
	 * API name: {@code empty_collectors_used}
	 */
	@Nullable
	public final Integer emptyCollectorsUsed() {
		return this.emptyCollectorsUsed;
	}

	/**
	 * API name: {@code deferred_aggregators}
	 */
	public final List<String> deferredAggregators() {
		return this.deferredAggregators;
	}

	/**
	 * API name: {@code segments_with_doc_count_field}
	 */
	@Nullable
	public final Integer segmentsWithDocCountField() {
		return this.segmentsWithDocCountField;
	}

	/**
	 * API name: {@code segments_with_deleted_docs}
	 */
	@Nullable
	public final Integer segmentsWithDeletedDocs() {
		return this.segmentsWithDeletedDocs;
	}

	/**
	 * API name: {@code filters}
	 */
	public final List<AggregationProfileDelegateDebugFilter> filters() {
		return this.filters;
	}

	/**
	 * API name: {@code segments_counted}
	 */
	@Nullable
	public final Integer segmentsCounted() {
		return this.segmentsCounted;
	}

	/**
	 * API name: {@code segments_collected}
	 */
	@Nullable
	public final Integer segmentsCollected() {
		return this.segmentsCollected;
	}

	/**
	 * API name: {@code map_reducer}
	 */
	@Nullable
	public final String mapReducer() {
		return this.mapReducer;
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

		if (this.segmentsWithMultiValuedOrds != null) {
			generator.writeKey("segments_with_multi_valued_ords");
			generator.write(this.segmentsWithMultiValuedOrds);

		}
		if (this.collectionStrategy != null) {
			generator.writeKey("collection_strategy");
			generator.write(this.collectionStrategy);

		}
		if (this.segmentsWithSingleValuedOrds != null) {
			generator.writeKey("segments_with_single_valued_ords");
			generator.write(this.segmentsWithSingleValuedOrds);

		}
		if (this.totalBuckets != null) {
			generator.writeKey("total_buckets");
			generator.write(this.totalBuckets);

		}
		if (this.builtBuckets != null) {
			generator.writeKey("built_buckets");
			generator.write(this.builtBuckets);

		}
		if (this.resultStrategy != null) {
			generator.writeKey("result_strategy");
			generator.write(this.resultStrategy);

		}
		if (this.hasFilter != null) {
			generator.writeKey("has_filter");
			generator.write(this.hasFilter);

		}
		if (this.delegate != null) {
			generator.writeKey("delegate");
			generator.write(this.delegate);

		}
		if (this.delegateDebug != null) {
			generator.writeKey("delegate_debug");
			this.delegateDebug.serialize(generator, mapper);

		}
		if (this.charsFetched != null) {
			generator.writeKey("chars_fetched");
			generator.write(this.charsFetched);

		}
		if (this.extractCount != null) {
			generator.writeKey("extract_count");
			generator.write(this.extractCount);

		}
		if (this.extractNs != null) {
			generator.writeKey("extract_ns");
			generator.write(this.extractNs);

		}
		if (this.valuesFetched != null) {
			generator.writeKey("values_fetched");
			generator.write(this.valuesFetched);

		}
		if (this.collectAnalyzedNs != null) {
			generator.writeKey("collect_analyzed_ns");
			generator.write(this.collectAnalyzedNs);

		}
		if (this.collectAnalyzedCount != null) {
			generator.writeKey("collect_analyzed_count");
			generator.write(this.collectAnalyzedCount);

		}
		if (this.survivingBuckets != null) {
			generator.writeKey("surviving_buckets");
			generator.write(this.survivingBuckets);

		}
		if (this.ordinalsCollectorsUsed != null) {
			generator.writeKey("ordinals_collectors_used");
			generator.write(this.ordinalsCollectorsUsed);

		}
		if (this.ordinalsCollectorsOverheadTooHigh != null) {
			generator.writeKey("ordinals_collectors_overhead_too_high");
			generator.write(this.ordinalsCollectorsOverheadTooHigh);

		}
		if (this.stringHashingCollectorsUsed != null) {
			generator.writeKey("string_hashing_collectors_used");
			generator.write(this.stringHashingCollectorsUsed);

		}
		if (this.numericCollectorsUsed != null) {
			generator.writeKey("numeric_collectors_used");
			generator.write(this.numericCollectorsUsed);

		}
		if (this.emptyCollectorsUsed != null) {
			generator.writeKey("empty_collectors_used");
			generator.write(this.emptyCollectorsUsed);

		}
		if (ApiTypeHelper.isDefined(this.deferredAggregators)) {
			generator.writeKey("deferred_aggregators");
			generator.writeStartArray();
			for (String item0 : this.deferredAggregators) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.segmentsWithDocCountField != null) {
			generator.writeKey("segments_with_doc_count_field");
			generator.write(this.segmentsWithDocCountField);

		}
		if (this.segmentsWithDeletedDocs != null) {
			generator.writeKey("segments_with_deleted_docs");
			generator.write(this.segmentsWithDeletedDocs);

		}
		if (ApiTypeHelper.isDefined(this.filters)) {
			generator.writeKey("filters");
			generator.writeStartArray();
			for (AggregationProfileDelegateDebugFilter item0 : this.filters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.segmentsCounted != null) {
			generator.writeKey("segments_counted");
			generator.write(this.segmentsCounted);

		}
		if (this.segmentsCollected != null) {
			generator.writeKey("segments_collected");
			generator.write(this.segmentsCollected);

		}
		if (this.mapReducer != null) {
			generator.writeKey("map_reducer");
			generator.write(this.mapReducer);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationProfileDebug}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AggregationProfileDebug> {
		@Nullable
		private Integer segmentsWithMultiValuedOrds;

		@Nullable
		private String collectionStrategy;

		@Nullable
		private Integer segmentsWithSingleValuedOrds;

		@Nullable
		private Integer totalBuckets;

		@Nullable
		private Integer builtBuckets;

		@Nullable
		private String resultStrategy;

		@Nullable
		private Boolean hasFilter;

		@Nullable
		private String delegate;

		@Nullable
		private AggregationProfileDebug delegateDebug;

		@Nullable
		private Integer charsFetched;

		@Nullable
		private Integer extractCount;

		@Nullable
		private Integer extractNs;

		@Nullable
		private Integer valuesFetched;

		@Nullable
		private Integer collectAnalyzedNs;

		@Nullable
		private Integer collectAnalyzedCount;

		@Nullable
		private Integer survivingBuckets;

		@Nullable
		private Integer ordinalsCollectorsUsed;

		@Nullable
		private Integer ordinalsCollectorsOverheadTooHigh;

		@Nullable
		private Integer stringHashingCollectorsUsed;

		@Nullable
		private Integer numericCollectorsUsed;

		@Nullable
		private Integer emptyCollectorsUsed;

		@Nullable
		private List<String> deferredAggregators;

		@Nullable
		private Integer segmentsWithDocCountField;

		@Nullable
		private Integer segmentsWithDeletedDocs;

		@Nullable
		private List<AggregationProfileDelegateDebugFilter> filters;

		@Nullable
		private Integer segmentsCounted;

		@Nullable
		private Integer segmentsCollected;

		@Nullable
		private String mapReducer;

		/**
		 * API name: {@code segments_with_multi_valued_ords}
		 */
		public final Builder segmentsWithMultiValuedOrds(@Nullable Integer value) {
			this.segmentsWithMultiValuedOrds = value;
			return this;
		}

		/**
		 * API name: {@code collection_strategy}
		 */
		public final Builder collectionStrategy(@Nullable String value) {
			this.collectionStrategy = value;
			return this;
		}

		/**
		 * API name: {@code segments_with_single_valued_ords}
		 */
		public final Builder segmentsWithSingleValuedOrds(@Nullable Integer value) {
			this.segmentsWithSingleValuedOrds = value;
			return this;
		}

		/**
		 * API name: {@code total_buckets}
		 */
		public final Builder totalBuckets(@Nullable Integer value) {
			this.totalBuckets = value;
			return this;
		}

		/**
		 * API name: {@code built_buckets}
		 */
		public final Builder builtBuckets(@Nullable Integer value) {
			this.builtBuckets = value;
			return this;
		}

		/**
		 * API name: {@code result_strategy}
		 */
		public final Builder resultStrategy(@Nullable String value) {
			this.resultStrategy = value;
			return this;
		}

		/**
		 * API name: {@code has_filter}
		 */
		public final Builder hasFilter(@Nullable Boolean value) {
			this.hasFilter = value;
			return this;
		}

		/**
		 * API name: {@code delegate}
		 */
		public final Builder delegate(@Nullable String value) {
			this.delegate = value;
			return this;
		}

		/**
		 * API name: {@code delegate_debug}
		 */
		public final Builder delegateDebug(@Nullable AggregationProfileDebug value) {
			this.delegateDebug = value;
			return this;
		}

		/**
		 * API name: {@code delegate_debug}
		 */
		public final Builder delegateDebug(
				Function<AggregationProfileDebug.Builder, ObjectBuilder<AggregationProfileDebug>> fn) {
			return this.delegateDebug(fn.apply(new AggregationProfileDebug.Builder()).build());
		}

		/**
		 * API name: {@code chars_fetched}
		 */
		public final Builder charsFetched(@Nullable Integer value) {
			this.charsFetched = value;
			return this;
		}

		/**
		 * API name: {@code extract_count}
		 */
		public final Builder extractCount(@Nullable Integer value) {
			this.extractCount = value;
			return this;
		}

		/**
		 * API name: {@code extract_ns}
		 */
		public final Builder extractNs(@Nullable Integer value) {
			this.extractNs = value;
			return this;
		}

		/**
		 * API name: {@code values_fetched}
		 */
		public final Builder valuesFetched(@Nullable Integer value) {
			this.valuesFetched = value;
			return this;
		}

		/**
		 * API name: {@code collect_analyzed_ns}
		 */
		public final Builder collectAnalyzedNs(@Nullable Integer value) {
			this.collectAnalyzedNs = value;
			return this;
		}

		/**
		 * API name: {@code collect_analyzed_count}
		 */
		public final Builder collectAnalyzedCount(@Nullable Integer value) {
			this.collectAnalyzedCount = value;
			return this;
		}

		/**
		 * API name: {@code surviving_buckets}
		 */
		public final Builder survivingBuckets(@Nullable Integer value) {
			this.survivingBuckets = value;
			return this;
		}

		/**
		 * API name: {@code ordinals_collectors_used}
		 */
		public final Builder ordinalsCollectorsUsed(@Nullable Integer value) {
			this.ordinalsCollectorsUsed = value;
			return this;
		}

		/**
		 * API name: {@code ordinals_collectors_overhead_too_high}
		 */
		public final Builder ordinalsCollectorsOverheadTooHigh(@Nullable Integer value) {
			this.ordinalsCollectorsOverheadTooHigh = value;
			return this;
		}

		/**
		 * API name: {@code string_hashing_collectors_used}
		 */
		public final Builder stringHashingCollectorsUsed(@Nullable Integer value) {
			this.stringHashingCollectorsUsed = value;
			return this;
		}

		/**
		 * API name: {@code numeric_collectors_used}
		 */
		public final Builder numericCollectorsUsed(@Nullable Integer value) {
			this.numericCollectorsUsed = value;
			return this;
		}

		/**
		 * API name: {@code empty_collectors_used}
		 */
		public final Builder emptyCollectorsUsed(@Nullable Integer value) {
			this.emptyCollectorsUsed = value;
			return this;
		}

		/**
		 * API name: {@code deferred_aggregators}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>deferredAggregators</code>.
		 */
		public final Builder deferredAggregators(List<String> list) {
			this.deferredAggregators = _listAddAll(this.deferredAggregators, list);
			return this;
		}

		/**
		 * API name: {@code deferred_aggregators}
		 * <p>
		 * Adds one or more values to <code>deferredAggregators</code>.
		 */
		public final Builder deferredAggregators(String value, String... values) {
			this.deferredAggregators = _listAdd(this.deferredAggregators, value, values);
			return this;
		}

		/**
		 * API name: {@code segments_with_doc_count_field}
		 */
		public final Builder segmentsWithDocCountField(@Nullable Integer value) {
			this.segmentsWithDocCountField = value;
			return this;
		}

		/**
		 * API name: {@code segments_with_deleted_docs}
		 */
		public final Builder segmentsWithDeletedDocs(@Nullable Integer value) {
			this.segmentsWithDeletedDocs = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filters</code>.
		 */
		public final Builder filters(List<AggregationProfileDelegateDebugFilter> list) {
			this.filters = _listAddAll(this.filters, list);
			return this;
		}

		/**
		 * API name: {@code filters}
		 * <p>
		 * Adds one or more values to <code>filters</code>.
		 */
		public final Builder filters(AggregationProfileDelegateDebugFilter value,
				AggregationProfileDelegateDebugFilter... values) {
			this.filters = _listAdd(this.filters, value, values);
			return this;
		}

		/**
		 * API name: {@code filters}
		 * <p>
		 * Adds a value to <code>filters</code> using a builder lambda.
		 */
		public final Builder filters(
				Function<AggregationProfileDelegateDebugFilter.Builder, ObjectBuilder<AggregationProfileDelegateDebugFilter>> fn) {
			return filters(fn.apply(new AggregationProfileDelegateDebugFilter.Builder()).build());
		}

		/**
		 * API name: {@code segments_counted}
		 */
		public final Builder segmentsCounted(@Nullable Integer value) {
			this.segmentsCounted = value;
			return this;
		}

		/**
		 * API name: {@code segments_collected}
		 */
		public final Builder segmentsCollected(@Nullable Integer value) {
			this.segmentsCollected = value;
			return this;
		}

		/**
		 * API name: {@code map_reducer}
		 */
		public final Builder mapReducer(@Nullable String value) {
			this.mapReducer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AggregationProfileDebug}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationProfileDebug build() {
			_checkSingleUse();

			return new AggregationProfileDebug(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationProfileDebug}
	 */
	public static final JsonpDeserializer<AggregationProfileDebug> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregationProfileDebug::setupAggregationProfileDebugDeserializer);

	protected static void setupAggregationProfileDebugDeserializer(
			ObjectDeserializer<AggregationProfileDebug.Builder> op) {

		op.add(Builder::segmentsWithMultiValuedOrds, JsonpDeserializer.integerDeserializer(),
				"segments_with_multi_valued_ords");
		op.add(Builder::collectionStrategy, JsonpDeserializer.stringDeserializer(), "collection_strategy");
		op.add(Builder::segmentsWithSingleValuedOrds, JsonpDeserializer.integerDeserializer(),
				"segments_with_single_valued_ords");
		op.add(Builder::totalBuckets, JsonpDeserializer.integerDeserializer(), "total_buckets");
		op.add(Builder::builtBuckets, JsonpDeserializer.integerDeserializer(), "built_buckets");
		op.add(Builder::resultStrategy, JsonpDeserializer.stringDeserializer(), "result_strategy");
		op.add(Builder::hasFilter, JsonpDeserializer.booleanDeserializer(), "has_filter");
		op.add(Builder::delegate, JsonpDeserializer.stringDeserializer(), "delegate");
		op.add(Builder::delegateDebug, AggregationProfileDebug._DESERIALIZER, "delegate_debug");
		op.add(Builder::charsFetched, JsonpDeserializer.integerDeserializer(), "chars_fetched");
		op.add(Builder::extractCount, JsonpDeserializer.integerDeserializer(), "extract_count");
		op.add(Builder::extractNs, JsonpDeserializer.integerDeserializer(), "extract_ns");
		op.add(Builder::valuesFetched, JsonpDeserializer.integerDeserializer(), "values_fetched");
		op.add(Builder::collectAnalyzedNs, JsonpDeserializer.integerDeserializer(), "collect_analyzed_ns");
		op.add(Builder::collectAnalyzedCount, JsonpDeserializer.integerDeserializer(), "collect_analyzed_count");
		op.add(Builder::survivingBuckets, JsonpDeserializer.integerDeserializer(), "surviving_buckets");
		op.add(Builder::ordinalsCollectorsUsed, JsonpDeserializer.integerDeserializer(), "ordinals_collectors_used");
		op.add(Builder::ordinalsCollectorsOverheadTooHigh, JsonpDeserializer.integerDeserializer(),
				"ordinals_collectors_overhead_too_high");
		op.add(Builder::stringHashingCollectorsUsed, JsonpDeserializer.integerDeserializer(),
				"string_hashing_collectors_used");
		op.add(Builder::numericCollectorsUsed, JsonpDeserializer.integerDeserializer(), "numeric_collectors_used");
		op.add(Builder::emptyCollectorsUsed, JsonpDeserializer.integerDeserializer(), "empty_collectors_used");
		op.add(Builder::deferredAggregators,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "deferred_aggregators");
		op.add(Builder::segmentsWithDocCountField, JsonpDeserializer.integerDeserializer(),
				"segments_with_doc_count_field");
		op.add(Builder::segmentsWithDeletedDocs, JsonpDeserializer.integerDeserializer(), "segments_with_deleted_docs");
		op.add(Builder::filters,
				JsonpDeserializer.arrayDeserializer(AggregationProfileDelegateDebugFilter._DESERIALIZER), "filters");
		op.add(Builder::segmentsCounted, JsonpDeserializer.integerDeserializer(), "segments_counted");
		op.add(Builder::segmentsCollected, JsonpDeserializer.integerDeserializer(), "segments_collected");
		op.add(Builder::mapReducer, JsonpDeserializer.stringDeserializer(), "map_reducer");

	}

}
