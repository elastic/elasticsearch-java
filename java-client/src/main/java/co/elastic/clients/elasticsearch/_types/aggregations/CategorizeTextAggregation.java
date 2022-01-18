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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CategorizeTextAggregation

/**
 * A multi-bucket aggregation that groups semi-structured text into buckets.
 * Each text field is re-analyzed using a custom analyzer. The resulting tokens
 * are then categorized creating buckets of similarly formatted text values.
 * This aggregation works best with machine generated text like system logs.
 * Only the first 100 analyzed tokens are used to categorize the text.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CategorizeTextAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CategorizeTextAggregation extends AggregationBase implements AggregationVariant {
	private final String field;

	@Nullable
	private final Integer maxUniqueTokens;

	@Nullable
	private final Integer maxMatchedTokens;

	@Nullable
	private final Integer similarityThreshold;

	private final List<String> categorizationFilters;

	@Nullable
	private final CategorizeTextAnalyzer categorizationAnalyzer;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Integer size;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final Integer shardMinDocCount;

	// ---------------------------------------------------------------------------------------------

	private CategorizeTextAggregation(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.maxUniqueTokens = builder.maxUniqueTokens;
		this.maxMatchedTokens = builder.maxMatchedTokens;
		this.similarityThreshold = builder.similarityThreshold;
		this.categorizationFilters = ApiTypeHelper.unmodifiable(builder.categorizationFilters);
		this.categorizationAnalyzer = builder.categorizationAnalyzer;
		this.shardSize = builder.shardSize;
		this.size = builder.size;
		this.minDocCount = builder.minDocCount;
		this.shardMinDocCount = builder.shardMinDocCount;

	}

	public static CategorizeTextAggregation of(Function<Builder, ObjectBuilder<CategorizeTextAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.CategorizeText;
	}

	/**
	 * Required - The semi-structured text field to categorize.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The maximum number of unique tokens at any position up to max_matched_tokens.
	 * Must be larger than 1. Smaller values use less memory and create fewer
	 * categories. Larger values will use more memory and create narrower
	 * categories. Max allowed value is 100.
	 * <p>
	 * API name: {@code max_unique_tokens}
	 */
	@Nullable
	public final Integer maxUniqueTokens() {
		return this.maxUniqueTokens;
	}

	/**
	 * The maximum number of token positions to match on before attempting to merge
	 * categories. Larger values will use more memory and create narrower
	 * categories. Max allowed value is 100.
	 * <p>
	 * API name: {@code max_matched_tokens}
	 */
	@Nullable
	public final Integer maxMatchedTokens() {
		return this.maxMatchedTokens;
	}

	/**
	 * The minimum percentage of tokens that must match for text to be added to the
	 * category bucket. Must be between 1 and 100. The larger the value the narrower
	 * the categories. Larger values will increase memory usage and create narrower
	 * categories.
	 * <p>
	 * API name: {@code similarity_threshold}
	 */
	@Nullable
	public final Integer similarityThreshold() {
		return this.similarityThreshold;
	}

	/**
	 * This property expects an array of regular expressions. The expressions are
	 * used to filter out matching sequences from the categorization field values.
	 * You can use this functionality to fine tune the categorization by excluding
	 * sequences from consideration when categories are defined. For example, you
	 * can exclude SQL statements that appear in your log files. This property
	 * cannot be used at the same time as categorization_analyzer. If you only want
	 * to define simple regular expression filters that are applied prior to
	 * tokenization, setting this property is the easiest method. If you also want
	 * to customize the tokenizer or post-tokenization filtering, use the
	 * categorization_analyzer property instead and include the filters as
	 * pattern_replace character filters.
	 * <p>
	 * API name: {@code categorization_filters}
	 */
	public final List<String> categorizationFilters() {
		return this.categorizationFilters;
	}

	/**
	 * The categorization analyzer specifies how the text is analyzed and tokenized
	 * before being categorized. The syntax is very similar to that used to define
	 * the analyzer in the <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/8.0/indices-analyze.html">Analyze
	 * endpoint</a>. This property cannot be used at the same time as
	 * categorization_filters.
	 * <p>
	 * API name: {@code categorization_analyzer}
	 */
	@Nullable
	public final CategorizeTextAnalyzer categorizationAnalyzer() {
		return this.categorizationAnalyzer;
	}

	/**
	 * The number of categorization buckets to return from each shard before merging
	 * all the results.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * The number of buckets to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * The minimum number of documents for a bucket to be returned to the results.
	 * <p>
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * The minimum number of documents for a bucket to be returned from the shard
	 * before merging.
	 * <p>
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public final Integer shardMinDocCount() {
		return this.shardMinDocCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.maxUniqueTokens != null) {
			generator.writeKey("max_unique_tokens");
			generator.write(this.maxUniqueTokens);

		}
		if (this.maxMatchedTokens != null) {
			generator.writeKey("max_matched_tokens");
			generator.write(this.maxMatchedTokens);

		}
		if (this.similarityThreshold != null) {
			generator.writeKey("similarity_threshold");
			generator.write(this.similarityThreshold);

		}
		if (ApiTypeHelper.isDefined(this.categorizationFilters)) {
			generator.writeKey("categorization_filters");
			generator.writeStartArray();
			for (String item0 : this.categorizationFilters) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.categorizationAnalyzer != null) {
			generator.writeKey("categorization_analyzer");
			this.categorizationAnalyzer.serialize(generator, mapper);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.shardMinDocCount != null) {
			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CategorizeTextAggregation}.
	 */

	public static class Builder extends AggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CategorizeTextAggregation> {
		private String field;

		@Nullable
		private Integer maxUniqueTokens;

		@Nullable
		private Integer maxMatchedTokens;

		@Nullable
		private Integer similarityThreshold;

		@Nullable
		private List<String> categorizationFilters;

		@Nullable
		private CategorizeTextAnalyzer categorizationAnalyzer;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Integer size;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private Integer shardMinDocCount;

		/**
		 * Required - The semi-structured text field to categorize.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The maximum number of unique tokens at any position up to max_matched_tokens.
		 * Must be larger than 1. Smaller values use less memory and create fewer
		 * categories. Larger values will use more memory and create narrower
		 * categories. Max allowed value is 100.
		 * <p>
		 * API name: {@code max_unique_tokens}
		 */
		public final Builder maxUniqueTokens(@Nullable Integer value) {
			this.maxUniqueTokens = value;
			return this;
		}

		/**
		 * The maximum number of token positions to match on before attempting to merge
		 * categories. Larger values will use more memory and create narrower
		 * categories. Max allowed value is 100.
		 * <p>
		 * API name: {@code max_matched_tokens}
		 */
		public final Builder maxMatchedTokens(@Nullable Integer value) {
			this.maxMatchedTokens = value;
			return this;
		}

		/**
		 * The minimum percentage of tokens that must match for text to be added to the
		 * category bucket. Must be between 1 and 100. The larger the value the narrower
		 * the categories. Larger values will increase memory usage and create narrower
		 * categories.
		 * <p>
		 * API name: {@code similarity_threshold}
		 */
		public final Builder similarityThreshold(@Nullable Integer value) {
			this.similarityThreshold = value;
			return this;
		}

		/**
		 * This property expects an array of regular expressions. The expressions are
		 * used to filter out matching sequences from the categorization field values.
		 * You can use this functionality to fine tune the categorization by excluding
		 * sequences from consideration when categories are defined. For example, you
		 * can exclude SQL statements that appear in your log files. This property
		 * cannot be used at the same time as categorization_analyzer. If you only want
		 * to define simple regular expression filters that are applied prior to
		 * tokenization, setting this property is the easiest method. If you also want
		 * to customize the tokenizer or post-tokenization filtering, use the
		 * categorization_analyzer property instead and include the filters as
		 * pattern_replace character filters.
		 * <p>
		 * API name: {@code categorization_filters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>categorizationFilters</code>.
		 */
		public final Builder categorizationFilters(List<String> list) {
			this.categorizationFilters = _listAddAll(this.categorizationFilters, list);
			return this;
		}

		/**
		 * This property expects an array of regular expressions. The expressions are
		 * used to filter out matching sequences from the categorization field values.
		 * You can use this functionality to fine tune the categorization by excluding
		 * sequences from consideration when categories are defined. For example, you
		 * can exclude SQL statements that appear in your log files. This property
		 * cannot be used at the same time as categorization_analyzer. If you only want
		 * to define simple regular expression filters that are applied prior to
		 * tokenization, setting this property is the easiest method. If you also want
		 * to customize the tokenizer or post-tokenization filtering, use the
		 * categorization_analyzer property instead and include the filters as
		 * pattern_replace character filters.
		 * <p>
		 * API name: {@code categorization_filters}
		 * <p>
		 * Adds one or more values to <code>categorizationFilters</code>.
		 */
		public final Builder categorizationFilters(String value, String... values) {
			this.categorizationFilters = _listAdd(this.categorizationFilters, value, values);
			return this;
		}

		/**
		 * The categorization analyzer specifies how the text is analyzed and tokenized
		 * before being categorized. The syntax is very similar to that used to define
		 * the analyzer in the <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/8.0/indices-analyze.html">Analyze
		 * endpoint</a>. This property cannot be used at the same time as
		 * categorization_filters.
		 * <p>
		 * API name: {@code categorization_analyzer}
		 */
		public final Builder categorizationAnalyzer(@Nullable CategorizeTextAnalyzer value) {
			this.categorizationAnalyzer = value;
			return this;
		}

		/**
		 * The categorization analyzer specifies how the text is analyzed and tokenized
		 * before being categorized. The syntax is very similar to that used to define
		 * the analyzer in the <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/8.0/indices-analyze.html">Analyze
		 * endpoint</a>. This property cannot be used at the same time as
		 * categorization_filters.
		 * <p>
		 * API name: {@code categorization_analyzer}
		 */
		public final Builder categorizationAnalyzer(
				Function<CategorizeTextAnalyzer.Builder, ObjectBuilder<CategorizeTextAnalyzer>> fn) {
			return this.categorizationAnalyzer(fn.apply(new CategorizeTextAnalyzer.Builder()).build());
		}

		/**
		 * The number of categorization buckets to return from each shard before merging
		 * all the results.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * The number of buckets to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The minimum number of documents for a bucket to be returned to the results.
		 * <p>
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * The minimum number of documents for a bucket to be returned from the shard
		 * before merging.
		 * <p>
		 * API name: {@code shard_min_doc_count}
		 */
		public final Builder shardMinDocCount(@Nullable Integer value) {
			this.shardMinDocCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CategorizeTextAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CategorizeTextAggregation build() {
			_checkSingleUse();

			return new CategorizeTextAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CategorizeTextAggregation}
	 */
	public static final JsonpDeserializer<CategorizeTextAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CategorizeTextAggregation::setupCategorizeTextAggregationDeserializer);

	protected static void setupCategorizeTextAggregationDeserializer(
			ObjectDeserializer<CategorizeTextAggregation.Builder> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::maxUniqueTokens, JsonpDeserializer.integerDeserializer(), "max_unique_tokens");
		op.add(Builder::maxMatchedTokens, JsonpDeserializer.integerDeserializer(), "max_matched_tokens");
		op.add(Builder::similarityThreshold, JsonpDeserializer.integerDeserializer(), "similarity_threshold");
		op.add(Builder::categorizationFilters,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "categorization_filters");
		op.add(Builder::categorizationAnalyzer, CategorizeTextAnalyzer._DESERIALIZER, "categorization_analyzer");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.integerDeserializer(), "shard_min_doc_count");

	}

}
