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

import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SignificantTextAggregation
public final class SignificantTextAggregation extends BucketAggregationBase {
	@Nullable
	private final QueryContainer backgroundFilter;

	@Nullable
	private final ChiSquareHeuristic chiSquare;

	@Nullable
	private final List<String> exclude;

	@Nullable
	private final JsonValue executionHint;

	@Nullable
	private final String field;

	@Nullable
	private final Boolean filterDuplicateText;

	@Nullable
	private final GoogleNormalizedDistanceHeuristic gnd;

	@Nullable
	private final List<String> include;

	@Nullable
	private final Number minDocCount;

	@Nullable
	private final MutualInformationHeuristic mutualInformation;

	@Nullable
	private final JsonValue percentage;

	@Nullable
	private final ScriptedHeuristic scriptHeuristic;

	@Nullable
	private final Number shardMinDocCount;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final Number size;

	@Nullable
	private final List<String> sourceFields;

	// ---------------------------------------------------------------------------------------------

	protected SignificantTextAggregation(Builder builder) {
		super(builder);
		this.backgroundFilter = builder.backgroundFilter;
		this.chiSquare = builder.chiSquare;
		this.exclude = builder.exclude;
		this.executionHint = builder.executionHint;
		this.field = builder.field;
		this.filterDuplicateText = builder.filterDuplicateText;
		this.gnd = builder.gnd;
		this.include = builder.include;
		this.minDocCount = builder.minDocCount;
		this.mutualInformation = builder.mutualInformation;
		this.percentage = builder.percentage;
		this.scriptHeuristic = builder.scriptHeuristic;
		this.shardMinDocCount = builder.shardMinDocCount;
		this.shardSize = builder.shardSize;
		this.size = builder.size;
		this.sourceFields = builder.sourceFields;

	}

	/**
	 * API name: {@code background_filter}
	 */
	@Nullable
	public QueryContainer backgroundFilter() {
		return this.backgroundFilter;
	}

	/**
	 * API name: {@code chi_square}
	 */
	@Nullable
	public ChiSquareHeuristic chiSquare() {
		return this.chiSquare;
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
	 * API name: {@code filter_duplicate_text}
	 */
	@Nullable
	public Boolean filterDuplicateText() {
		return this.filterDuplicateText;
	}

	/**
	 * API name: {@code gnd}
	 */
	@Nullable
	public GoogleNormalizedDistanceHeuristic gnd() {
		return this.gnd;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public List<String> include() {
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
	 * API name: {@code mutual_information}
	 */
	@Nullable
	public MutualInformationHeuristic mutualInformation() {
		return this.mutualInformation;
	}

	/**
	 * API name: {@code percentage}
	 */
	@Nullable
	public JsonValue percentage() {
		return this.percentage;
	}

	/**
	 * API name: {@code script_heuristic}
	 */
	@Nullable
	public ScriptedHeuristic scriptHeuristic() {
		return this.scriptHeuristic;
	}

	/**
	 * API name: {@code shard_min_doc_count}
	 */
	@Nullable
	public Number shardMinDocCount() {
		return this.shardMinDocCount;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code source_fields}
	 */
	@Nullable
	public List<String> sourceFields() {
		return this.sourceFields;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.backgroundFilter != null) {

			generator.writeKey("background_filter");
			this.backgroundFilter.toJsonp(generator, mapper);

		}
		if (this.chiSquare != null) {

			generator.writeKey("chi_square");
			this.chiSquare.toJsonp(generator, mapper);

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
		if (this.filterDuplicateText != null) {

			generator.writeKey("filter_duplicate_text");
			generator.write(this.filterDuplicateText);

		}
		if (this.gnd != null) {

			generator.writeKey("gnd");
			this.gnd.toJsonp(generator, mapper);

		}
		if (this.include != null) {

			generator.writeKey("include");
			generator.writeStartArray();
			for (String item0 : this.include) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.minDocCount != null) {

			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount.doubleValue());

		}
		if (this.mutualInformation != null) {

			generator.writeKey("mutual_information");
			this.mutualInformation.toJsonp(generator, mapper);

		}
		if (this.percentage != null) {

			generator.writeKey("percentage");
			generator.write(this.percentage);

		}
		if (this.scriptHeuristic != null) {

			generator.writeKey("script_heuristic");
			this.scriptHeuristic.toJsonp(generator, mapper);

		}
		if (this.shardMinDocCount != null) {

			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount.doubleValue());

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.sourceFields != null) {

			generator.writeKey("source_fields");
			generator.writeStartArray();
			for (String item0 : this.sourceFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantTextAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SignificantTextAggregation> {
		@Nullable
		private QueryContainer backgroundFilter;

		@Nullable
		private ChiSquareHeuristic chiSquare;

		@Nullable
		private List<String> exclude;

		@Nullable
		private JsonValue executionHint;

		@Nullable
		private String field;

		@Nullable
		private Boolean filterDuplicateText;

		@Nullable
		private GoogleNormalizedDistanceHeuristic gnd;

		@Nullable
		private List<String> include;

		@Nullable
		private Number minDocCount;

		@Nullable
		private MutualInformationHeuristic mutualInformation;

		@Nullable
		private JsonValue percentage;

		@Nullable
		private ScriptedHeuristic scriptHeuristic;

		@Nullable
		private Number shardMinDocCount;

		@Nullable
		private Number shardSize;

		@Nullable
		private Number size;

		@Nullable
		private List<String> sourceFields;

		/**
		 * API name: {@code background_filter}
		 */
		public Builder backgroundFilter(@Nullable QueryContainer value) {
			this.backgroundFilter = value;
			return this;
		}

		/**
		 * API name: {@code background_filter}
		 */
		public Builder backgroundFilter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.backgroundFilter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code chi_square}
		 */
		public Builder chiSquare(@Nullable ChiSquareHeuristic value) {
			this.chiSquare = value;
			return this;
		}

		/**
		 * API name: {@code chi_square}
		 */
		public Builder chiSquare(Function<ChiSquareHeuristic.Builder, ObjectBuilder<ChiSquareHeuristic>> fn) {
			return this.chiSquare(fn.apply(new ChiSquareHeuristic.Builder()).build());
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
		 * API name: {@code filter_duplicate_text}
		 */
		public Builder filterDuplicateText(@Nullable Boolean value) {
			this.filterDuplicateText = value;
			return this;
		}

		/**
		 * API name: {@code gnd}
		 */
		public Builder gnd(@Nullable GoogleNormalizedDistanceHeuristic value) {
			this.gnd = value;
			return this;
		}

		/**
		 * API name: {@code gnd}
		 */
		public Builder gnd(
				Function<GoogleNormalizedDistanceHeuristic.Builder, ObjectBuilder<GoogleNormalizedDistanceHeuristic>> fn) {
			return this.gnd(fn.apply(new GoogleNormalizedDistanceHeuristic.Builder()).build());
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(@Nullable List<String> value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(String... value) {
			this.include = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #include(List)}, creating the list if needed.
		 */
		public Builder addInclude(String value) {
			if (this.include == null) {
				this.include = new ArrayList<>();
			}
			this.include.add(value);
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
		 * API name: {@code mutual_information}
		 */
		public Builder mutualInformation(@Nullable MutualInformationHeuristic value) {
			this.mutualInformation = value;
			return this;
		}

		/**
		 * API name: {@code mutual_information}
		 */
		public Builder mutualInformation(
				Function<MutualInformationHeuristic.Builder, ObjectBuilder<MutualInformationHeuristic>> fn) {
			return this.mutualInformation(fn.apply(new MutualInformationHeuristic.Builder()).build());
		}

		/**
		 * API name: {@code percentage}
		 */
		public Builder percentage(@Nullable JsonValue value) {
			this.percentage = value;
			return this;
		}

		/**
		 * API name: {@code script_heuristic}
		 */
		public Builder scriptHeuristic(@Nullable ScriptedHeuristic value) {
			this.scriptHeuristic = value;
			return this;
		}

		/**
		 * API name: {@code script_heuristic}
		 */
		public Builder scriptHeuristic(Function<ScriptedHeuristic.Builder, ObjectBuilder<ScriptedHeuristic>> fn) {
			return this.scriptHeuristic(fn.apply(new ScriptedHeuristic.Builder()).build());
		}

		/**
		 * API name: {@code shard_min_doc_count}
		 */
		public Builder shardMinDocCount(@Nullable Number value) {
			this.shardMinDocCount = value;
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
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code source_fields}
		 */
		public Builder sourceFields(@Nullable List<String> value) {
			this.sourceFields = value;
			return this;
		}

		/**
		 * API name: {@code source_fields}
		 */
		public Builder sourceFields(String... value) {
			this.sourceFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceFields(List)}, creating the list if needed.
		 */
		public Builder addSourceFields(String value) {
			if (this.sourceFields == null) {
				this.sourceFields = new ArrayList<>();
			}
			this.sourceFields.add(value);
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

			return new SignificantTextAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SignificantTextAggregation
	 */
	public static final JsonpDeserializer<SignificantTextAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SignificantTextAggregation::setupSignificantTextAggregationDeserializer);

	protected static void setupSignificantTextAggregationDeserializer(
			DelegatingDeserializer<SignificantTextAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::backgroundFilter, QueryContainer.DESERIALIZER, "background_filter");
		op.add(Builder::chiSquare, ChiSquareHeuristic.DESERIALIZER, "chi_square");
		op.add(Builder::exclude, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"exclude");
		op.add(Builder::executionHint, JsonpDeserializer.jsonValueDeserializer(), "execution_hint");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::filterDuplicateText, JsonpDeserializer.booleanDeserializer(), "filter_duplicate_text");
		op.add(Builder::gnd, GoogleNormalizedDistanceHeuristic.DESERIALIZER, "gnd");
		op.add(Builder::include, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"include");
		op.add(Builder::minDocCount, JsonpDeserializer.numberDeserializer(), "min_doc_count");
		op.add(Builder::mutualInformation, MutualInformationHeuristic.DESERIALIZER, "mutual_information");
		op.add(Builder::percentage, JsonpDeserializer.jsonValueDeserializer(), "percentage");
		op.add(Builder::scriptHeuristic, ScriptedHeuristic.DESERIALIZER, "script_heuristic");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.numberDeserializer(), "shard_min_doc_count");
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::sourceFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"source_fields");

	}

}
