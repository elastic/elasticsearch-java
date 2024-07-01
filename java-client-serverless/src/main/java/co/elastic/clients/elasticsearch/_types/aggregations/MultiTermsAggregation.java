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

import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
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

// typedef: _types.aggregations.MultiTermsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MultiTermsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiTermsAggregation extends BucketAggregationBase implements AggregationVariant, JsonpSerializable {
	@Nullable
	private final TermsAggregationCollectMode collectMode;

	private final List<NamedValue<SortOrder>> order;

	@Nullable
	private final Long minDocCount;

	@Nullable
	private final Long shardMinDocCount;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Boolean showTermDocCountError;

	@Nullable
	private final Integer size;

	private final List<MultiTermLookup> terms;

	// ---------------------------------------------------------------------------------------------

	private MultiTermsAggregation(Builder builder) {

		this.collectMode = builder.collectMode;
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.minDocCount = builder.minDocCount;
		this.shardMinDocCount = builder.shardMinDocCount;
		this.shardSize = builder.shardSize;
		this.showTermDocCountError = builder.showTermDocCountError;
		this.size = builder.size;
		this.terms = ApiTypeHelper.unmodifiableRequired(builder.terms, this, "terms");

	}

	public static MultiTermsAggregation of(Function<Builder, ObjectBuilder<MultiTermsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.MultiTerms;
	}

	/**
	 * Specifies the strategy for data collection.
	 * <p>
	 * API name: {@code collect_mode}
	 */
	@Nullable
	public final TermsAggregationCollectMode collectMode() {
		return this.collectMode;
	}

	/**
	 * Specifies the sort order of the buckets. Defaults to sorting by descending
	 * document count.
	 * <p>
	 * API name: {@code order}
	 */
	public final List<NamedValue<SortOrder>> order() {
		return this.order;
	}

	/**
	 * The minimum number of documents in a bucket for it to be returned.
	 * <p>
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Long minDocCount() {
		return this.minDocCount;
	}

	/**
	 * The minimum number of documents in a bucket on each shard for it to be
	 * returned.
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
	 * Calculates the doc count error on per term basis.
	 * <p>
	 * API name: {@code show_term_doc_count_error}
	 */
	@Nullable
	public final Boolean showTermDocCountError() {
		return this.showTermDocCountError;
	}

	/**
	 * The number of term buckets should be returned out of the overall terms list.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Required - The field from which to generate sets of terms.
	 * <p>
	 * API name: {@code terms}
	 */
	public final List<MultiTermLookup> terms() {
		return this.terms;
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

		if (this.collectMode != null) {
			generator.writeKey("collect_mode");
			this.collectMode.serialize(generator, mapper);
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
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.shardMinDocCount != null) {
			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount);

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
		if (ApiTypeHelper.isDefined(this.terms)) {
			generator.writeKey("terms");
			generator.writeStartArray();
			for (MultiTermLookup item0 : this.terms) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link MultiTermsAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiTermsAggregation> {
		@Nullable
		private TermsAggregationCollectMode collectMode;

		@Nullable
		private List<NamedValue<SortOrder>> order;

		@Nullable
		private Long minDocCount;

		@Nullable
		private Long shardMinDocCount;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Boolean showTermDocCountError;

		@Nullable
		private Integer size;

		private List<MultiTermLookup> terms;

		/**
		 * Specifies the strategy for data collection.
		 * <p>
		 * API name: {@code collect_mode}
		 */
		public final Builder collectMode(@Nullable TermsAggregationCollectMode value) {
			this.collectMode = value;
			return this;
		}

		/**
		 * Specifies the sort order of the buckets. Defaults to sorting by descending
		 * document count.
		 * <p>
		 * API name: {@code order}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>order</code>.
		 */
		public final Builder order(List<NamedValue<SortOrder>> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * Specifies the sort order of the buckets. Defaults to sorting by descending
		 * document count.
		 * <p>
		 * API name: {@code order}
		 * <p>
		 * Adds one or more values to <code>order</code>.
		 */
		public final Builder order(NamedValue<SortOrder> value, NamedValue<SortOrder>... values) {
			this.order = _listAdd(this.order, value, values);
			return this;
		}

		/**
		 * The minimum number of documents in a bucket for it to be returned.
		 * <p>
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Long value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * The minimum number of documents in a bucket on each shard for it to be
		 * returned.
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
		 * Calculates the doc count error on per term basis.
		 * <p>
		 * API name: {@code show_term_doc_count_error}
		 */
		public final Builder showTermDocCountError(@Nullable Boolean value) {
			this.showTermDocCountError = value;
			return this;
		}

		/**
		 * The number of term buckets should be returned out of the overall terms list.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - The field from which to generate sets of terms.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>terms</code>.
		 */
		public final Builder terms(List<MultiTermLookup> list) {
			this.terms = _listAddAll(this.terms, list);
			return this;
		}

		/**
		 * Required - The field from which to generate sets of terms.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds one or more values to <code>terms</code>.
		 */
		public final Builder terms(MultiTermLookup value, MultiTermLookup... values) {
			this.terms = _listAdd(this.terms, value, values);
			return this;
		}

		/**
		 * Required - The field from which to generate sets of terms.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds a value to <code>terms</code> using a builder lambda.
		 */
		public final Builder terms(Function<MultiTermLookup.Builder, ObjectBuilder<MultiTermLookup>> fn) {
			return terms(fn.apply(new MultiTermLookup.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermsAggregation build() {
			_checkSingleUse();

			return new MultiTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiTermsAggregation}
	 */
	public static final JsonpDeserializer<MultiTermsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultiTermsAggregation::setupMultiTermsAggregationDeserializer);

	protected static void setupMultiTermsAggregationDeserializer(ObjectDeserializer<MultiTermsAggregation.Builder> op) {

		op.add(Builder::collectMode, TermsAggregationCollectMode._DESERIALIZER, "collect_mode");
		op.add(Builder::order,
				JsonpDeserializer.arrayDeserializer(NamedValue.deserializer(() -> SortOrder._DESERIALIZER)), "order");
		op.add(Builder::minDocCount, JsonpDeserializer.longDeserializer(), "min_doc_count");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.longDeserializer(), "shard_min_doc_count");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::showTermDocCountError, JsonpDeserializer.booleanDeserializer(), "show_term_doc_count_error");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(MultiTermLookup._DESERIALIZER), "terms");

	}

}
