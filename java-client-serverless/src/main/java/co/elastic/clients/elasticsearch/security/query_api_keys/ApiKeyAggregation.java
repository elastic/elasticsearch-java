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

package co.elastic.clients.elasticsearch.security.query_api_keys;

import co.elastic.clients.elasticsearch._types.aggregations.CardinalityAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.CompositeAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.DateRangeAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.MissingAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.RangeAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.TermsAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.ValueCountAggregation;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
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

// typedef: security.query_api_keys.ApiKeyAggregationContainer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyAggregationContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApiKeyAggregation implements OpenTaggedUnion<ApiKeyAggregation.Kind, Object>, JsonpSerializable {

	/**
	 * {@link ApiKeyAggregation} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyAggregationContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Cardinality("cardinality"),

		Composite("composite"),

		DateRange("date_range"),

		Filter("filter"),

		Filters("filters"),

		Missing("missing"),

		Range("range"),

		Terms("terms"),

		ValueCount("value_count"),

		/** A custom {@code ApiKeyAggregation} defined by a plugin */
		_Custom(null)

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private final Map<String, ApiKeyAggregation> aggregations;

	private final Map<String, JsonData> meta;

	public ApiKeyAggregation(ApiKeyAggregationVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._apiKeyAggregationKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

		this.aggregations = null;
		this.meta = null;

	}

	private ApiKeyAggregation(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);

	}

	public static ApiKeyAggregation of(Function<Builder, ObjectBuilder<ApiKeyAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
	 * <p>
	 * API name: {@code aggregations}
	 */
	public final Map<String, ApiKeyAggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Is this variant instance of kind {@code cardinality}?
	 */
	public boolean isCardinality() {
		return _kind == Kind.Cardinality;
	}

	/**
	 * Get the {@code cardinality} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cardinality} kind.
	 */
	public CardinalityAggregation cardinality() {
		return TaggedUnionUtils.get(this, Kind.Cardinality);
	}

	/**
	 * Is this variant instance of kind {@code composite}?
	 */
	public boolean isComposite() {
		return _kind == Kind.Composite;
	}

	/**
	 * Get the {@code composite} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code composite} kind.
	 */
	public CompositeAggregation composite() {
		return TaggedUnionUtils.get(this, Kind.Composite);
	}

	/**
	 * Is this variant instance of kind {@code date_range}?
	 */
	public boolean isDateRange() {
		return _kind == Kind.DateRange;
	}

	/**
	 * Get the {@code date_range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_range} kind.
	 */
	public DateRangeAggregation dateRange() {
		return TaggedUnionUtils.get(this, Kind.DateRange);
	}

	/**
	 * Is this variant instance of kind {@code filter}?
	 */
	public boolean isFilter() {
		return _kind == Kind.Filter;
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public ApiKeyQuery filter() {
		return TaggedUnionUtils.get(this, Kind.Filter);
	}

	/**
	 * Is this variant instance of kind {@code filters}?
	 */
	public boolean isFilters() {
		return _kind == Kind.Filters;
	}

	/**
	 * Get the {@code filters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filters} kind.
	 */
	public ApiKeyFiltersAggregation filters() {
		return TaggedUnionUtils.get(this, Kind.Filters);
	}

	/**
	 * Is this variant instance of kind {@code missing}?
	 */
	public boolean isMissing() {
		return _kind == Kind.Missing;
	}

	/**
	 * Get the {@code missing} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code missing} kind.
	 */
	public MissingAggregation missing() {
		return TaggedUnionUtils.get(this, Kind.Missing);
	}

	/**
	 * Is this variant instance of kind {@code range}?
	 */
	public boolean isRange() {
		return _kind == Kind.Range;
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeAggregation range() {
		return TaggedUnionUtils.get(this, Kind.Range);
	}

	/**
	 * Is this variant instance of kind {@code terms}?
	 */
	public boolean isTerms() {
		return _kind == Kind.Terms;
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsAggregation terms() {
		return TaggedUnionUtils.get(this, Kind.Terms);
	}

	/**
	 * Is this variant instance of kind {@code value_count}?
	 */
	public boolean isValueCount() {
		return _kind == Kind.ValueCount;
	}

	/**
	 * Get the {@code value_count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value_count} kind.
	 */
	public ValueCountAggregation valueCount() {
		return TaggedUnionUtils.get(this, Kind.ValueCount);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code ApiKeyAggregation} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, ApiKeyAggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey(_kind == Kind._Custom ? _customKind : _kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ApiKeyAggregation> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Nullable
		private Map<String, ApiKeyAggregation> aggregations;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, ApiKeyAggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, ApiKeyAggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key,
				Function<ApiKeyAggregation.Builder, ObjectBuilder<ApiKeyAggregation>> fn) {
			return aggregations(key, fn.apply(new ApiKeyAggregation.Builder()).build());
		}

		/**
		 * API name: {@code meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder cardinality(CardinalityAggregation v) {
			this._kind = Kind.Cardinality;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder cardinality(
				Function<CardinalityAggregation.Builder, ObjectBuilder<CardinalityAggregation>> fn) {
			return this.cardinality(fn.apply(new CardinalityAggregation.Builder()).build());
		}

		public ContainerBuilder composite(CompositeAggregation v) {
			this._kind = Kind.Composite;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder composite(
				Function<CompositeAggregation.Builder, ObjectBuilder<CompositeAggregation>> fn) {
			return this.composite(fn.apply(new CompositeAggregation.Builder()).build());
		}

		public ContainerBuilder dateRange(DateRangeAggregation v) {
			this._kind = Kind.DateRange;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder dateRange(
				Function<DateRangeAggregation.Builder, ObjectBuilder<DateRangeAggregation>> fn) {
			return this.dateRange(fn.apply(new DateRangeAggregation.Builder()).build());
		}

		public ContainerBuilder filter(ApiKeyQuery v) {
			this._kind = Kind.Filter;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder filter(Function<ApiKeyQuery.Builder, ObjectBuilder<ApiKeyQuery>> fn) {
			return this.filter(fn.apply(new ApiKeyQuery.Builder()).build());
		}

		public ContainerBuilder filters(ApiKeyFiltersAggregation v) {
			this._kind = Kind.Filters;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder filters(
				Function<ApiKeyFiltersAggregation.Builder, ObjectBuilder<ApiKeyFiltersAggregation>> fn) {
			return this.filters(fn.apply(new ApiKeyFiltersAggregation.Builder()).build());
		}

		public ContainerBuilder missing(MissingAggregation v) {
			this._kind = Kind.Missing;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder missing(Function<MissingAggregation.Builder, ObjectBuilder<MissingAggregation>> fn) {
			return this.missing(fn.apply(new MissingAggregation.Builder()).build());
		}

		public ContainerBuilder range(RangeAggregation v) {
			this._kind = Kind.Range;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder range(Function<RangeAggregation.Builder, ObjectBuilder<RangeAggregation>> fn) {
			return this.range(fn.apply(new RangeAggregation.Builder()).build());
		}

		public ContainerBuilder terms(TermsAggregation v) {
			this._kind = Kind.Terms;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
			return this.terms(fn.apply(new TermsAggregation.Builder()).build());
		}

		public ContainerBuilder valueCount(ValueCountAggregation v) {
			this._kind = Kind.ValueCount;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder valueCount(
				Function<ValueCountAggregation.Builder, ObjectBuilder<ValueCountAggregation>> fn) {
			return this.valueCount(fn.apply(new ValueCountAggregation.Builder()).build());
		}

		/**
		 * Define this {@code ApiKeyAggregation} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code ApiKeyAggregation}. It is
		 *            converted internally to {@link JsonData}.
		 */
		public ContainerBuilder _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return new ContainerBuilder();
		}

		public ApiKeyAggregation build() {
			_checkSingleUse();
			return new ApiKeyAggregation(this);
		}

		public class ContainerBuilder implements ObjectBuilder<ApiKeyAggregation> {

			/**
			 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
			 * <p>
			 * API name: {@code aggregations}
			 * <p>
			 * Adds all entries of <code>map</code> to <code>aggregations</code>.
			 */
			public final ContainerBuilder aggregations(Map<String, ApiKeyAggregation> map) {
				Builder.this.aggregations = _mapPutAll(Builder.this.aggregations, map);
				return this;
			}

			/**
			 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
			 * <p>
			 * API name: {@code aggregations}
			 * <p>
			 * Adds an entry to <code>aggregations</code>.
			 */
			public final ContainerBuilder aggregations(String key, ApiKeyAggregation value) {
				Builder.this.aggregations = _mapPut(Builder.this.aggregations, key, value);
				return this;
			}

			/**
			 * Sub-aggregations for this aggregation. Only applies to bucket aggregations.
			 * <p>
			 * API name: {@code aggregations}
			 * <p>
			 * Adds an entry to <code>aggregations</code> using a builder lambda.
			 */
			public final ContainerBuilder aggregations(String key,
					Function<ApiKeyAggregation.Builder, ObjectBuilder<ApiKeyAggregation>> fn) {
				return aggregations(key, fn.apply(new ApiKeyAggregation.Builder()).build());
			}

			/**
			 * API name: {@code meta}
			 * <p>
			 * Adds all entries of <code>map</code> to <code>meta</code>.
			 */
			public final ContainerBuilder meta(Map<String, JsonData> map) {
				Builder.this.meta = _mapPutAll(Builder.this.meta, map);
				return this;
			}

			/**
			 * API name: {@code meta}
			 * <p>
			 * Adds an entry to <code>meta</code>.
			 */
			public final ContainerBuilder meta(String key, JsonData value) {
				Builder.this.meta = _mapPut(Builder.this.meta, key, value);
				return this;
			}

			public ApiKeyAggregation build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupApiKeyAggregationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(ApiKeyAggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "meta");
		op.add(Builder::cardinality, CardinalityAggregation._DESERIALIZER, "cardinality");
		op.add(Builder::composite, CompositeAggregation._DESERIALIZER, "composite");
		op.add(Builder::dateRange, DateRangeAggregation._DESERIALIZER, "date_range");
		op.add(Builder::filter, ApiKeyQuery._DESERIALIZER, "filter");
		op.add(Builder::filters, ApiKeyFiltersAggregation._DESERIALIZER, "filters");
		op.add(Builder::missing, MissingAggregation._DESERIALIZER, "missing");
		op.add(Builder::range, RangeAggregation._DESERIALIZER, "range");
		op.add(Builder::terms, TermsAggregation._DESERIALIZER, "terms");
		op.add(Builder::valueCount, ValueCountAggregation._DESERIALIZER, "value_count");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

	public static final JsonpDeserializer<ApiKeyAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApiKeyAggregation::setupApiKeyAggregationDeserializer, Builder::build);
}
