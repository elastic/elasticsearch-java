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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.EmptyObject;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.aggregations.SignificantTextAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.SignificantTextAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class SignificantTextAggregation extends BucketAggregationBase implements AggregationVariant, JsonpSerializable {
	@Nullable
	private final Query backgroundFilter;

	@Nullable
	private final ChiSquareHeuristic chiSquare;

	@Nullable
	private final TermsExclude exclude;

	@Nullable
	private final TermsAggregationExecutionHint executionHint;

	@Nullable
	private final String field;

	@Nullable
	private final Boolean filterDuplicateText;

	@Nullable
	private final GoogleNormalizedDistanceHeuristic gnd;

	@Nullable
	private final TermsInclude include;

	@Nullable
	private final EmptyObject jlh;

	@Nullable
	private final Long minDocCount;

	@Nullable
	private final MutualInformationHeuristic mutualInformation;

	@Nullable
	private final PercentageScoreHeuristic percentage;

	@Nullable
	private final ScriptedHeuristic scriptHeuristic;

	@Nullable
	private final Long shardMinDocCount;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Integer size;

	private final List<String> sourceFields;

	// ---------------------------------------------------------------------------------------------

	private SignificantTextAggregation(Builder builder) {

		this.backgroundFilter = builder.backgroundFilter;
		this.chiSquare = builder.chiSquare;
		this.exclude = builder.exclude;
		this.executionHint = builder.executionHint;
		this.field = builder.field;
		this.filterDuplicateText = builder.filterDuplicateText;
		this.gnd = builder.gnd;
		this.include = builder.include;
		this.jlh = builder.jlh;
		this.minDocCount = builder.minDocCount;
		this.mutualInformation = builder.mutualInformation;
		this.percentage = builder.percentage;
		this.scriptHeuristic = builder.scriptHeuristic;
		this.shardMinDocCount = builder.shardMinDocCount;
		this.shardSize = builder.shardSize;
		this.size = builder.size;
		this.sourceFields = ApiTypeHelper.unmodifiable(builder.sourceFields);

	}

	public static SignificantTextAggregation of(Function<Builder, ObjectBuilder<SignificantTextAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.SignificantText;
	}

	/**
	 * A background filter that can be used to focus in on significant terms within
	 * a narrower context, instead of the entire index.
	 * <p>
	 * API name: {@code background_filter}
	 */
	@Nullable
	public final Query backgroundFilter() {
		return this.backgroundFilter;
	}

	/**
	 * Use Chi square, as described in &quot;Information Retrieval&quot;, Manning et
	 * al., Chapter 13.5.2, as the significance score.
	 * <p>
	 * API name: {@code chi_square}
	 */
	@Nullable
	public final ChiSquareHeuristic chiSquare() {
		return this.chiSquare;
	}

	/**
	 * Values to exclude.
	 * <p>
	 * API name: {@code exclude}
	 */
	@Nullable
	public final TermsExclude exclude() {
		return this.exclude;
	}

	/**
	 * Determines whether the aggregation will use field values directly or global
	 * ordinals.
	 * <p>
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final TermsAggregationExecutionHint executionHint() {
		return this.executionHint;
	}

	/**
	 * The field from which to return significant text.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * Whether to out duplicate text to deal with noisy data.
	 * <p>
	 * API name: {@code filter_duplicate_text}
	 */
	@Nullable
	public final Boolean filterDuplicateText() {
		return this.filterDuplicateText;
	}

	/**
	 * Use Google normalized distance as described in &quot;The Google Similarity
	 * Distance&quot;, Cilibrasi and Vitanyi, 2007, as the significance score.
	 * <p>
	 * API name: {@code gnd}
	 */
	@Nullable
	public final GoogleNormalizedDistanceHeuristic gnd() {
		return this.gnd;
	}

	/**
	 * Values to include.
	 * <p>
	 * API name: {@code include}
	 */
	@Nullable
	public final TermsInclude include() {
		return this.include;
	}

	/**
	 * Use JLH score as the significance score.
	 * <p>
	 * API name: {@code jlh}
	 */
	@Nullable
	public final EmptyObject jlh() {
		return this.jlh;
	}

	/**
	 * Only return values that are found in more than <code>min_doc_count</code>
	 * hits.
	 * <p>
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Long minDocCount() {
		return this.minDocCount;
	}

	/**
	 * Use mutual information as described in &quot;Information Retrieval&quot;,
	 * Manning et al., Chapter 13.5.1, as the significance score.
	 * <p>
	 * API name: {@code mutual_information}
	 */
	@Nullable
	public final MutualInformationHeuristic mutualInformation() {
		return this.mutualInformation;
	}

	/**
	 * A simple calculation of the number of documents in the foreground sample with
	 * a term divided by the number of documents in the background with the term.
	 * <p>
	 * API name: {@code percentage}
	 */
	@Nullable
	public final PercentageScoreHeuristic percentage() {
		return this.percentage;
	}

	/**
	 * Customized score, implemented via a script.
	 * <p>
	 * API name: {@code script_heuristic}
	 */
	@Nullable
	public final ScriptedHeuristic scriptHeuristic() {
		return this.scriptHeuristic;
	}

	/**
	 * Regulates the certainty a shard has if the values should actually be added to
	 * the candidate list or not with respect to the min_doc_count. Values will only
	 * be considered if their local shard frequency within the set is higher than
	 * the <code>shard_min_doc_count</code>.
	 * <p>
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public final Long shardMinDocCount() {
		return this.shardMinDocCount;
	}

	/**
	 * The number of candidate terms produced by each shard. By default,
	 * <code>shard_size</code> will be automatically estimated based on the number
	 * of shards and the <code>size</code> parameter.
	 * <p>
	 * API name: {@code shard_size}
	 */
	@Nullable
	public final Integer shardSize() {
		return this.shardSize;
	}

	/**
	 * The number of buckets returned out of the overall terms list.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Overrides the JSON <code>_source</code> fields from which text will be
	 * analyzed.
	 * <p>
	 * API name: {@code source_fields}
	 */
	public final List<String> sourceFields() {
		return this.sourceFields;
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

		if (this.backgroundFilter != null) {
			generator.writeKey("background_filter");
			this.backgroundFilter.serialize(generator, mapper);

		}
		if (this.chiSquare != null) {
			generator.writeKey("chi_square");
			this.chiSquare.serialize(generator, mapper);

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
		if (this.filterDuplicateText != null) {
			generator.writeKey("filter_duplicate_text");
			generator.write(this.filterDuplicateText);

		}
		if (this.gnd != null) {
			generator.writeKey("gnd");
			this.gnd.serialize(generator, mapper);

		}
		if (this.include != null) {
			generator.writeKey("include");
			this.include.serialize(generator, mapper);

		}
		if (this.jlh != null) {
			generator.writeKey("jlh");
			this.jlh.serialize(generator, mapper);

		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.mutualInformation != null) {
			generator.writeKey("mutual_information");
			this.mutualInformation.serialize(generator, mapper);

		}
		if (this.percentage != null) {
			generator.writeKey("percentage");
			this.percentage.serialize(generator, mapper);

		}
		if (this.scriptHeuristic != null) {
			generator.writeKey("script_heuristic");
			this.scriptHeuristic.serialize(generator, mapper);

		}
		if (this.shardMinDocCount != null) {
			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ApiTypeHelper.isDefined(this.sourceFields)) {
			generator.writeKey("source_fields");
			generator.writeStartArray();
			for (String item0 : this.sourceFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantTextAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SignificantTextAggregation> {
		@Nullable
		private Query backgroundFilter;

		@Nullable
		private ChiSquareHeuristic chiSquare;

		@Nullable
		private TermsExclude exclude;

		@Nullable
		private TermsAggregationExecutionHint executionHint;

		@Nullable
		private String field;

		@Nullable
		private Boolean filterDuplicateText;

		@Nullable
		private GoogleNormalizedDistanceHeuristic gnd;

		@Nullable
		private TermsInclude include;

		@Nullable
		private EmptyObject jlh;

		@Nullable
		private Long minDocCount;

		@Nullable
		private MutualInformationHeuristic mutualInformation;

		@Nullable
		private PercentageScoreHeuristic percentage;

		@Nullable
		private ScriptedHeuristic scriptHeuristic;

		@Nullable
		private Long shardMinDocCount;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Integer size;

		@Nullable
		private List<String> sourceFields;

		/**
		 * A background filter that can be used to focus in on significant terms within
		 * a narrower context, instead of the entire index.
		 * <p>
		 * API name: {@code background_filter}
		 */
		public final Builder backgroundFilter(@Nullable Query value) {
			this.backgroundFilter = value;
			return this;
		}

		/**
		 * A background filter that can be used to focus in on significant terms within
		 * a narrower context, instead of the entire index.
		 * <p>
		 * API name: {@code background_filter}
		 */
		public final Builder backgroundFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.backgroundFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Use Chi square, as described in &quot;Information Retrieval&quot;, Manning et
		 * al., Chapter 13.5.2, as the significance score.
		 * <p>
		 * API name: {@code chi_square}
		 */
		public final Builder chiSquare(@Nullable ChiSquareHeuristic value) {
			this.chiSquare = value;
			return this;
		}

		/**
		 * Use Chi square, as described in &quot;Information Retrieval&quot;, Manning et
		 * al., Chapter 13.5.2, as the significance score.
		 * <p>
		 * API name: {@code chi_square}
		 */
		public final Builder chiSquare(Function<ChiSquareHeuristic.Builder, ObjectBuilder<ChiSquareHeuristic>> fn) {
			return this.chiSquare(fn.apply(new ChiSquareHeuristic.Builder()).build());
		}

		/**
		 * Values to exclude.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(@Nullable TermsExclude value) {
			this.exclude = value;
			return this;
		}

		/**
		 * Values to exclude.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(Function<TermsExclude.Builder, ObjectBuilder<TermsExclude>> fn) {
			return this.exclude(fn.apply(new TermsExclude.Builder()).build());
		}

		/**
		 * Determines whether the aggregation will use field values directly or global
		 * ordinals.
		 * <p>
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable TermsAggregationExecutionHint value) {
			this.executionHint = value;
			return this;
		}

		/**
		 * The field from which to return significant text.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * Whether to out duplicate text to deal with noisy data.
		 * <p>
		 * API name: {@code filter_duplicate_text}
		 */
		public final Builder filterDuplicateText(@Nullable Boolean value) {
			this.filterDuplicateText = value;
			return this;
		}

		/**
		 * Use Google normalized distance as described in &quot;The Google Similarity
		 * Distance&quot;, Cilibrasi and Vitanyi, 2007, as the significance score.
		 * <p>
		 * API name: {@code gnd}
		 */
		public final Builder gnd(@Nullable GoogleNormalizedDistanceHeuristic value) {
			this.gnd = value;
			return this;
		}

		/**
		 * Use Google normalized distance as described in &quot;The Google Similarity
		 * Distance&quot;, Cilibrasi and Vitanyi, 2007, as the significance score.
		 * <p>
		 * API name: {@code gnd}
		 */
		public final Builder gnd(
				Function<GoogleNormalizedDistanceHeuristic.Builder, ObjectBuilder<GoogleNormalizedDistanceHeuristic>> fn) {
			return this.gnd(fn.apply(new GoogleNormalizedDistanceHeuristic.Builder()).build());
		}

		/**
		 * Values to include.
		 * <p>
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable TermsInclude value) {
			this.include = value;
			return this;
		}

		/**
		 * Values to include.
		 * <p>
		 * API name: {@code include}
		 */
		public final Builder include(Function<TermsInclude.Builder, ObjectBuilder<TermsInclude>> fn) {
			return this.include(fn.apply(new TermsInclude.Builder()).build());
		}

		/**
		 * Use JLH score as the significance score.
		 * <p>
		 * API name: {@code jlh}
		 */
		public final Builder jlh(@Nullable EmptyObject value) {
			this.jlh = value;
			return this;
		}

		/**
		 * Use JLH score as the significance score.
		 * <p>
		 * API name: {@code jlh}
		 */
		public final Builder jlh(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.jlh(fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * Only return values that are found in more than <code>min_doc_count</code>
		 * hits.
		 * <p>
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Long value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * Use mutual information as described in &quot;Information Retrieval&quot;,
		 * Manning et al., Chapter 13.5.1, as the significance score.
		 * <p>
		 * API name: {@code mutual_information}
		 */
		public final Builder mutualInformation(@Nullable MutualInformationHeuristic value) {
			this.mutualInformation = value;
			return this;
		}

		/**
		 * Use mutual information as described in &quot;Information Retrieval&quot;,
		 * Manning et al., Chapter 13.5.1, as the significance score.
		 * <p>
		 * API name: {@code mutual_information}
		 */
		public final Builder mutualInformation(
				Function<MutualInformationHeuristic.Builder, ObjectBuilder<MutualInformationHeuristic>> fn) {
			return this.mutualInformation(fn.apply(new MutualInformationHeuristic.Builder()).build());
		}

		/**
		 * A simple calculation of the number of documents in the foreground sample with
		 * a term divided by the number of documents in the background with the term.
		 * <p>
		 * API name: {@code percentage}
		 */
		public final Builder percentage(@Nullable PercentageScoreHeuristic value) {
			this.percentage = value;
			return this;
		}

		/**
		 * A simple calculation of the number of documents in the foreground sample with
		 * a term divided by the number of documents in the background with the term.
		 * <p>
		 * API name: {@code percentage}
		 */
		public final Builder percentage(
				Function<PercentageScoreHeuristic.Builder, ObjectBuilder<PercentageScoreHeuristic>> fn) {
			return this.percentage(fn.apply(new PercentageScoreHeuristic.Builder()).build());
		}

		/**
		 * Customized score, implemented via a script.
		 * <p>
		 * API name: {@code script_heuristic}
		 */
		public final Builder scriptHeuristic(@Nullable ScriptedHeuristic value) {
			this.scriptHeuristic = value;
			return this;
		}

		/**
		 * Customized score, implemented via a script.
		 * <p>
		 * API name: {@code script_heuristic}
		 */
		public final Builder scriptHeuristic(Function<ScriptedHeuristic.Builder, ObjectBuilder<ScriptedHeuristic>> fn) {
			return this.scriptHeuristic(fn.apply(new ScriptedHeuristic.Builder()).build());
		}

		/**
		 * Regulates the certainty a shard has if the values should actually be added to
		 * the candidate list or not with respect to the min_doc_count. Values will only
		 * be considered if their local shard frequency within the set is higher than
		 * the <code>shard_min_doc_count</code>.
		 * <p>
		 * API name: {@code shard_min_doc_count}
		 */
		public final Builder shardMinDocCount(@Nullable Long value) {
			this.shardMinDocCount = value;
			return this;
		}

		/**
		 * The number of candidate terms produced by each shard. By default,
		 * <code>shard_size</code> will be automatically estimated based on the number
		 * of shards and the <code>size</code> parameter.
		 * <p>
		 * API name: {@code shard_size}
		 */
		public final Builder shardSize(@Nullable Integer value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * The number of buckets returned out of the overall terms list.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Overrides the JSON <code>_source</code> fields from which text will be
		 * analyzed.
		 * <p>
		 * API name: {@code source_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sourceFields</code>.
		 */
		public final Builder sourceFields(List<String> list) {
			this.sourceFields = _listAddAll(this.sourceFields, list);
			return this;
		}

		/**
		 * Overrides the JSON <code>_source</code> fields from which text will be
		 * analyzed.
		 * <p>
		 * API name: {@code source_fields}
		 * <p>
		 * Adds one or more values to <code>sourceFields</code>.
		 */
		public final Builder sourceFields(String value, String... values) {
			this.sourceFields = _listAdd(this.sourceFields, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SignificantTextAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SignificantTextAggregation build() {
			_checkSingleUse();

			return new SignificantTextAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SignificantTextAggregation}
	 */
	public static final JsonpDeserializer<SignificantTextAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SignificantTextAggregation::setupSignificantTextAggregationDeserializer);

	protected static void setupSignificantTextAggregationDeserializer(
			ObjectDeserializer<SignificantTextAggregation.Builder> op) {

		op.add(Builder::backgroundFilter, Query._DESERIALIZER, "background_filter");
		op.add(Builder::chiSquare, ChiSquareHeuristic._DESERIALIZER, "chi_square");
		op.add(Builder::exclude, TermsExclude._DESERIALIZER, "exclude");
		op.add(Builder::executionHint, TermsAggregationExecutionHint._DESERIALIZER, "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::filterDuplicateText, JsonpDeserializer.booleanDeserializer(), "filter_duplicate_text");
		op.add(Builder::gnd, GoogleNormalizedDistanceHeuristic._DESERIALIZER, "gnd");
		op.add(Builder::include, TermsInclude._DESERIALIZER, "include");
		op.add(Builder::jlh, EmptyObject._DESERIALIZER, "jlh");
		op.add(Builder::minDocCount, JsonpDeserializer.longDeserializer(), "min_doc_count");
		op.add(Builder::mutualInformation, MutualInformationHeuristic._DESERIALIZER, "mutual_information");
		op.add(Builder::percentage, PercentageScoreHeuristic._DESERIALIZER, "percentage");
		op.add(Builder::scriptHeuristic, ScriptedHeuristic._DESERIALIZER, "script_heuristic");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.longDeserializer(), "shard_min_doc_count");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sourceFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"source_fields");

	}

}
