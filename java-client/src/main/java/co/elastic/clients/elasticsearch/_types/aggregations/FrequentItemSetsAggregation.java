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
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.FrequentItemSetsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.FrequentItemSetsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class FrequentItemSetsAggregation implements AggregationVariant, JsonpSerializable {
	private final List<FrequentItemSetsField> fields;

	@Nullable
	private final Integer minimumSetSize;

	@Nullable
	private final Double minimumSupport;

	@Nullable
	private final Integer size;

	@Nullable
	private final Query filter;

	// ---------------------------------------------------------------------------------------------

	private FrequentItemSetsAggregation(Builder builder) {

		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.minimumSetSize = builder.minimumSetSize;
		this.minimumSupport = builder.minimumSupport;
		this.size = builder.size;
		this.filter = builder.filter;

	}

	public static FrequentItemSetsAggregation of(Function<Builder, ObjectBuilder<FrequentItemSetsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.FrequentItemSets;
	}

	/**
	 * Required - Fields to analyze
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<FrequentItemSetsField> fields() {
		return this.fields;
	}

	/**
	 * The minimum size of one item set.
	 * <p>
	 * API name: {@code minimum_set_size}
	 */
	@Nullable
	public final Integer minimumSetSize() {
		return this.minimumSetSize;
	}

	/**
	 * The minimum support of one item set.
	 * <p>
	 * API name: {@code minimum_support}
	 */
	@Nullable
	public final Double minimumSupport() {
		return this.minimumSupport;
	}

	/**
	 * The number of top item sets to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Query that filters documents from analysis.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
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

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (FrequentItemSetsField item0 : this.fields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.minimumSetSize != null) {
			generator.writeKey("minimum_set_size");
			generator.write(this.minimumSetSize);

		}
		if (this.minimumSupport != null) {
			generator.writeKey("minimum_support");
			generator.write(this.minimumSupport);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FrequentItemSetsAggregation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FrequentItemSetsAggregation> {
		private List<FrequentItemSetsField> fields;

		@Nullable
		private Integer minimumSetSize;

		@Nullable
		private Double minimumSupport;

		@Nullable
		private Integer size;

		@Nullable
		private Query filter;

		/**
		 * Required - Fields to analyze
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<FrequentItemSetsField> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Required - Fields to analyze
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(FrequentItemSetsField value, FrequentItemSetsField... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Required - Fields to analyze
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds a value to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(Function<FrequentItemSetsField.Builder, ObjectBuilder<FrequentItemSetsField>> fn) {
			return fields(fn.apply(new FrequentItemSetsField.Builder()).build());
		}

		/**
		 * The minimum size of one item set.
		 * <p>
		 * API name: {@code minimum_set_size}
		 */
		public final Builder minimumSetSize(@Nullable Integer value) {
			this.minimumSetSize = value;
			return this;
		}

		/**
		 * The minimum support of one item set.
		 * <p>
		 * API name: {@code minimum_support}
		 */
		public final Builder minimumSupport(@Nullable Double value) {
			this.minimumSupport = value;
			return this;
		}

		/**
		 * The number of top item sets to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Query that filters documents from analysis.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Query that filters documents from analysis.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FrequentItemSetsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FrequentItemSetsAggregation build() {
			_checkSingleUse();

			return new FrequentItemSetsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FrequentItemSetsAggregation}
	 */
	public static final JsonpDeserializer<FrequentItemSetsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FrequentItemSetsAggregation::setupFrequentItemSetsAggregationDeserializer);

	protected static void setupFrequentItemSetsAggregationDeserializer(
			ObjectDeserializer<FrequentItemSetsAggregation.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(FrequentItemSetsField._DESERIALIZER), "fields");
		op.add(Builder::minimumSetSize, JsonpDeserializer.integerDeserializer(), "minimum_set_size");
		op.add(Builder::minimumSupport, JsonpDeserializer.doubleDeserializer(), "minimum_support");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");

	}

}
