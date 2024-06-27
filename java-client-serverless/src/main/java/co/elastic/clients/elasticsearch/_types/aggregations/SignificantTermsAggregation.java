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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
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

// typedef: _types.aggregations.SignificantTermsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.SignificantTermsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class SignificantTermsAggregation extends BucketAggregationBase
		implements
			AggregationVariant,
			JsonpSerializable {
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

	// ---------------------------------------------------------------------------------------------

	private SignificantTermsAggregation(Builder builder) {

		this.backgroundFilter = builder.backgroundFilter;
		this.chiSquare = builder.chiSquare;
		this.exclude = builder.exclude;
		this.executionHint = builder.executionHint;
		this.field = builder.field;
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

	}

	public static SignificantTermsAggregation of(Function<Builder, ObjectBuilder<SignificantTermsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.SignificantTerms;
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
	 * Terms to exclude.
	 * <p>
	 * API name: {@code exclude}
	 */
	@Nullable
	public final TermsExclude exclude() {
		return this.exclude;
	}

	/**
	 * Mechanism by which the aggregation should be executed: using field values
	 * directly or using global ordinals.
	 * <p>
	 * API name: {@code execution_hint}
	 */
	@Nullable
	public final TermsAggregationExecutionHint executionHint() {
		return this.executionHint;
	}

	/**
	 * The field from which to return significant terms.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
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
	 * Terms to include.
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
	 * Only return terms that are found in more than <code>min_doc_count</code>
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
	 * Regulates the certainty a shard has if the term should actually be added to
	 * the candidate list or not with respect to the <code>min_doc_count</code>.
	 * Terms will only be considered if their local shard frequency within the set
	 * is higher than the <code>shard_min_doc_count</code>.
	 * <p>
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public final Long shardMinDocCount() {
		return this.shardMinDocCount;
	}

	/**
	 * Can be used to control the volumes of candidate terms produced by each shard.
	 * By default, <code>shard_size</code> will be automatically estimated based on
	 * the number of shards and the <code>size</code> parameter.
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantTermsAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SignificantTermsAggregation> {
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
		 * Terms to exclude.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(@Nullable TermsExclude value) {
			this.exclude = value;
			return this;
		}

		/**
		 * Terms to exclude.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(Function<TermsExclude.Builder, ObjectBuilder<TermsExclude>> fn) {
			return this.exclude(fn.apply(new TermsExclude.Builder()).build());
		}

		/**
		 * Mechanism by which the aggregation should be executed: using field values
		 * directly or using global ordinals.
		 * <p>
		 * API name: {@code execution_hint}
		 */
		public final Builder executionHint(@Nullable TermsAggregationExecutionHint value) {
			this.executionHint = value;
			return this;
		}

		/**
		 * The field from which to return significant terms.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
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
		 * Terms to include.
		 * <p>
		 * API name: {@code include}
		 */
		public final Builder include(@Nullable TermsInclude value) {
			this.include = value;
			return this;
		}

		/**
		 * Terms to include.
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
		 * Only return terms that are found in more than <code>min_doc_count</code>
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
		 * Regulates the certainty a shard has if the term should actually be added to
		 * the candidate list or not with respect to the <code>min_doc_count</code>.
		 * Terms will only be considered if their local shard frequency within the set
		 * is higher than the <code>shard_min_doc_count</code>.
		 * <p>
		 * API name: {@code shard_min_doc_count}
		 */
		public final Builder shardMinDocCount(@Nullable Long value) {
			this.shardMinDocCount = value;
			return this;
		}

		/**
		 * Can be used to control the volumes of candidate terms produced by each shard.
		 * By default, <code>shard_size</code> will be automatically estimated based on
		 * the number of shards and the <code>size</code> parameter.
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SignificantTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SignificantTermsAggregation build() {
			_checkSingleUse();

			return new SignificantTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SignificantTermsAggregation}
	 */
	public static final JsonpDeserializer<SignificantTermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SignificantTermsAggregation::setupSignificantTermsAggregationDeserializer);

	protected static void setupSignificantTermsAggregationDeserializer(
			ObjectDeserializer<SignificantTermsAggregation.Builder> op) {

		op.add(Builder::backgroundFilter, Query._DESERIALIZER, "background_filter");
		op.add(Builder::chiSquare, ChiSquareHeuristic._DESERIALIZER, "chi_square");
		op.add(Builder::exclude, TermsExclude._DESERIALIZER, "exclude");
		op.add(Builder::executionHint, TermsAggregationExecutionHint._DESERIALIZER, "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
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

	}

}
