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

import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiTermsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MultiTermsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultiTermsAggregation extends BucketAggregationBase implements AggregationVariant {
	private final List<MultiTermLookup> terms;

	@Nullable
	private final Integer size;

	@Nullable
	private final Integer shardSize;

	@Nullable
	private final Boolean showTermDocCountError;

	private final List<Map<String, SortOrder>> order;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final TermsAggregationCollectMode collectMode;

	@Nullable
	private final Long shardMinDocCount;

	// ---------------------------------------------------------------------------------------------

	private MultiTermsAggregation(Builder builder) {
		super(builder);

		this.terms = ApiTypeHelper.unmodifiableRequired(builder.terms, this, "terms");
		this.size = builder.size;
		this.shardSize = builder.shardSize;
		this.showTermDocCountError = builder.showTermDocCountError;
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.minDocCount = builder.minDocCount;
		this.collectMode = builder.collectMode;
		this.shardMinDocCount = builder.shardMinDocCount;

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
	 * Required - API name: {@code terms}
	 */
	public final List<MultiTermLookup> terms() {
		return this.terms;
	}


	@Nullable
	public final Integer size() {
		return this.size;
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
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public final Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code collect_mode}
	 */
	@Nullable
	public final TermsAggregationCollectMode collectMode() {
		return this.collectMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.terms)) {
			generator.writeKey("terms");
			generator.writeStartArray();
			for (MultiTermLookup item0 : this.terms) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.shardSize != null) {
			generator.writeKey("shard_size");
			generator.write(this.shardSize);
		}
		if (this.showTermDocCountError != null) {
			generator.writeKey("show_term_doc_count_error");
			generator.write(this.showTermDocCountError);
		}
		if (this.minDocCount != null) {
			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);
		}
		if (this.collectMode != null) {
			generator.writeKey("collect_mode");
			this.collectMode.serialize(generator, mapper);
		}
		if (this.shardMinDocCount != null) {
			generator.writeKey("shard_min_doc_count");
			generator.write(this.shardMinDocCount);
		}
		if (ApiTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (Map<String, SortOrder> item0 : this.order) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, SortOrder> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);
					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermsAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiTermsAggregation> {
		private List<MultiTermLookup> terms;

		@Nullable
		private Integer size;

		@Nullable
		private Integer shardSize;

		@Nullable
		private Boolean showTermDocCountError;

		@Nullable
		private List<Map<String, SortOrder>> order;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private TermsAggregationCollectMode collectMode;

		@Nullable
		private Long shardMinDocCount;
		/**
		 * Required - API name: {@code terms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>terms</code>.
		 */
		public final Builder terms(List<MultiTermLookup> list) {
			this.terms = _listAddAll(this.terms, list);
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 * <p>
		 * Adds one or more values to <code>terms</code>.
		 */
		public final Builder terms(MultiTermLookup value, MultiTermLookup... values) {
			this.terms = _listAdd(this.terms, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code terms}
		 * <p>
		 * Adds a value to <code>terms</code> using a builder lambda.
		 */
		public final Builder terms(Function<MultiTermLookup.Builder, ObjectBuilder<MultiTermLookup>> fn) {
			return terms(fn.apply(new MultiTermLookup.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		@Nullable
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
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
		 * API name: {@code order}
		 * <p>
		 */
		public final Builder order(List<Map<String, SortOrder>> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public final Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code collect_mode}
		 */
		public final Builder collectMode(@Nullable TermsAggregationCollectMode value) {
			this.collectMode = value;
			return this;
		}

		/**
		 * API name: {@code shard_min_doc_count}
		 */
		public final Builder shardMinDocCount(@Nullable Long value) {
			this.shardMinDocCount = value;
			return this;
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
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(MultiTermLookup._DESERIALIZER), "terms");
		op.add(Builder::shardSize, JsonpDeserializer.integerDeserializer(), "shard_size");
		op.add(Builder::showTermDocCountError, JsonpDeserializer.booleanDeserializer(), "show_term_doc_count_error");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::order, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringMapDeserializer(SortOrder._DESERIALIZER)),
				"order");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::collectMode, TermsAggregationCollectMode._DESERIALIZER, "collect_mode");
		op.add(Builder::shardMinDocCount, JsonpDeserializer.longDeserializer(), "shard_min_doc_count");

	}

}
