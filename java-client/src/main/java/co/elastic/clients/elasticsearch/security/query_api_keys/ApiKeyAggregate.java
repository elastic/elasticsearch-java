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

import co.elastic.clients.elasticsearch._types.aggregations.CardinalityAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.CompositeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.DateRangeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.DoubleTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.FilterAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.FiltersAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.LongTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.MissingAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.MultiTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.RangeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.StringTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.UnmappedTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.ValueCountAggregate;
import co.elastic.clients.json.ExternallyTaggedUnion;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.HashMap;
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

// typedef: security.query_api_keys.ApiKeyAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyAggregate">API
 *      specification</a>
 */

public class ApiKeyAggregate implements OpenTaggedUnion<ApiKeyAggregate.Kind, Object>, JsonpSerializable {

	/**
	 * {@link ApiKeyAggregate} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyAggregate">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Cardinality("cardinality"),

		Composite("composite"),

		DateRange("date_range"),

		Dterms("dterms"),

		Filter("filter"),

		Filters("filters"),

		Lterms("lterms"),

		Missing("missing"),

		MultiTerms("multi_terms"),

		Range("range"),

		Sterms("sterms"),

		Umterms("umterms"),

		ValueCount("value_count"),

		/** A custom {@code ApiKeyAggregate} defined by a plugin */
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

	public ApiKeyAggregate(ApiKeyAggregateVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._apiKeyAggregateKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private ApiKeyAggregate(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static ApiKeyAggregate of(Function<Builder, ObjectBuilder<ApiKeyAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code ApiKeyAggregate}, given its kind and
	 * some JSON data
	 */
	public ApiKeyAggregate(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
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
	public CardinalityAggregate cardinality() {
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
	public CompositeAggregate composite() {
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
	public DateRangeAggregate dateRange() {
		return TaggedUnionUtils.get(this, Kind.DateRange);
	}

	/**
	 * Is this variant instance of kind {@code dterms}?
	 */
	public boolean isDterms() {
		return _kind == Kind.Dterms;
	}

	/**
	 * Get the {@code dterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dterms} kind.
	 */
	public DoubleTermsAggregate dterms() {
		return TaggedUnionUtils.get(this, Kind.Dterms);
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
	public FilterAggregate filter() {
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
	public FiltersAggregate filters() {
		return TaggedUnionUtils.get(this, Kind.Filters);
	}

	/**
	 * Is this variant instance of kind {@code lterms}?
	 */
	public boolean isLterms() {
		return _kind == Kind.Lterms;
	}

	/**
	 * Get the {@code lterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lterms} kind.
	 */
	public LongTermsAggregate lterms() {
		return TaggedUnionUtils.get(this, Kind.Lterms);
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
	public MissingAggregate missing() {
		return TaggedUnionUtils.get(this, Kind.Missing);
	}

	/**
	 * Is this variant instance of kind {@code multi_terms}?
	 */
	public boolean isMultiTerms() {
		return _kind == Kind.MultiTerms;
	}

	/**
	 * Get the {@code multi_terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_terms} kind.
	 */
	public MultiTermsAggregate multiTerms() {
		return TaggedUnionUtils.get(this, Kind.MultiTerms);
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
	public RangeAggregate range() {
		return TaggedUnionUtils.get(this, Kind.Range);
	}

	/**
	 * Is this variant instance of kind {@code sterms}?
	 */
	public boolean isSterms() {
		return _kind == Kind.Sterms;
	}

	/**
	 * Get the {@code sterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sterms} kind.
	 */
	public StringTermsAggregate sterms() {
		return TaggedUnionUtils.get(this, Kind.Sterms);
	}

	/**
	 * Is this variant instance of kind {@code umterms}?
	 */
	public boolean isUmterms() {
		return _kind == Kind.Umterms;
	}

	/**
	 * Get the {@code umterms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code umterms} kind.
	 */
	public UnmappedTermsAggregate umterms() {
		return TaggedUnionUtils.get(this, Kind.Umterms);
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
	public ValueCountAggregate valueCount() {
		return TaggedUnionUtils.get(this, Kind.ValueCount);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code ApiKeyAggregate} defined by a plugin?
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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ApiKeyAggregate> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		public ObjectBuilder<ApiKeyAggregate> cardinality(CardinalityAggregate v) {
			this._kind = Kind.Cardinality;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> cardinality(
				Function<CardinalityAggregate.Builder, ObjectBuilder<CardinalityAggregate>> fn) {
			return this.cardinality(fn.apply(new CardinalityAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> composite(CompositeAggregate v) {
			this._kind = Kind.Composite;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> composite(
				Function<CompositeAggregate.Builder, ObjectBuilder<CompositeAggregate>> fn) {
			return this.composite(fn.apply(new CompositeAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> dateRange(DateRangeAggregate v) {
			this._kind = Kind.DateRange;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> dateRange(
				Function<DateRangeAggregate.Builder, ObjectBuilder<DateRangeAggregate>> fn) {
			return this.dateRange(fn.apply(new DateRangeAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> dterms(DoubleTermsAggregate v) {
			this._kind = Kind.Dterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> dterms(
				Function<DoubleTermsAggregate.Builder, ObjectBuilder<DoubleTermsAggregate>> fn) {
			return this.dterms(fn.apply(new DoubleTermsAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> filter(FilterAggregate v) {
			this._kind = Kind.Filter;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> filter(
				Function<FilterAggregate.Builder, ObjectBuilder<FilterAggregate>> fn) {
			return this.filter(fn.apply(new FilterAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> filters(FiltersAggregate v) {
			this._kind = Kind.Filters;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> filters(
				Function<FiltersAggregate.Builder, ObjectBuilder<FiltersAggregate>> fn) {
			return this.filters(fn.apply(new FiltersAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> lterms(LongTermsAggregate v) {
			this._kind = Kind.Lterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> lterms(
				Function<LongTermsAggregate.Builder, ObjectBuilder<LongTermsAggregate>> fn) {
			return this.lterms(fn.apply(new LongTermsAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> missing(MissingAggregate v) {
			this._kind = Kind.Missing;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> missing(
				Function<MissingAggregate.Builder, ObjectBuilder<MissingAggregate>> fn) {
			return this.missing(fn.apply(new MissingAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> multiTerms(MultiTermsAggregate v) {
			this._kind = Kind.MultiTerms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> multiTerms(
				Function<MultiTermsAggregate.Builder, ObjectBuilder<MultiTermsAggregate>> fn) {
			return this.multiTerms(fn.apply(new MultiTermsAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> range(RangeAggregate v) {
			this._kind = Kind.Range;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> range(
				Function<RangeAggregate.Builder, ObjectBuilder<RangeAggregate>> fn) {
			return this.range(fn.apply(new RangeAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> sterms(StringTermsAggregate v) {
			this._kind = Kind.Sterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> sterms(
				Function<StringTermsAggregate.Builder, ObjectBuilder<StringTermsAggregate>> fn) {
			return this.sterms(fn.apply(new StringTermsAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> umterms(UnmappedTermsAggregate v) {
			this._kind = Kind.Umterms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> umterms(
				Function<UnmappedTermsAggregate.Builder, ObjectBuilder<UnmappedTermsAggregate>> fn) {
			return this.umterms(fn.apply(new UnmappedTermsAggregate.Builder()).build());
		}

		public ObjectBuilder<ApiKeyAggregate> valueCount(ValueCountAggregate v) {
			this._kind = Kind.ValueCount;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyAggregate> valueCount(
				Function<ValueCountAggregate.Builder, ObjectBuilder<ValueCountAggregate>> fn) {
			return this.valueCount(fn.apply(new ValueCountAggregate.Builder()).build());
		}

		/**
		 * Define this {@code ApiKeyAggregate} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code ApiKeyAggregate}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<ApiKeyAggregate> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public ApiKeyAggregate build() {
			_checkSingleUse();
			return new ApiKeyAggregate(this);
		}

	}

	public static final ExternallyTaggedUnion.TypedKeysDeserializer<ApiKeyAggregate> _TYPED_KEYS_DESERIALIZER;

	static {
		Map<String, JsonpDeserializer<? extends ApiKeyAggregateVariant>> deserializers = new HashMap<>();
		deserializers.put("cardinality", CardinalityAggregate._DESERIALIZER);
		deserializers.put("composite", CompositeAggregate._DESERIALIZER);
		deserializers.put("date_range", DateRangeAggregate._DESERIALIZER);
		deserializers.put("dterms", DoubleTermsAggregate._DESERIALIZER);
		deserializers.put("filter", FilterAggregate._DESERIALIZER);
		deserializers.put("filters", FiltersAggregate._DESERIALIZER);
		deserializers.put("lterms", LongTermsAggregate._DESERIALIZER);
		deserializers.put("missing", MissingAggregate._DESERIALIZER);
		deserializers.put("multi_terms", MultiTermsAggregate._DESERIALIZER);
		deserializers.put("range", RangeAggregate._DESERIALIZER);
		deserializers.put("sterms", StringTermsAggregate._DESERIALIZER);
		deserializers.put("umterms", UnmappedTermsAggregate._DESERIALIZER);
		deserializers.put("value_count", ValueCountAggregate._DESERIALIZER);

		_TYPED_KEYS_DESERIALIZER = new ExternallyTaggedUnion.Deserializer<>(deserializers, ApiKeyAggregate::new,
				ApiKeyAggregate::new).typedKeys();
	}
}
