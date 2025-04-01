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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.aggregations.AggregationRange

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.AggregationRange">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregationRange
		implements
			TaggedUnion<AggregationRange.Kind, AggregationRangeVariant>,
			JsonpSerializable {

	/**
	 * {@link AggregationRange} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.aggregations.AggregationRange">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Date("date"),

		Number("number"),

		Term("term"),

		Untyped("untyped"),

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
	private final AggregationRangeVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final AggregationRangeVariant _get() {
		return _value;
	}

	public AggregationRange(AggregationRangeVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._aggregationRangeKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private AggregationRange(Kind kind, AggregationRangeVariant value) {
		this._kind = kind;
		this._value = value;
	}

	private AggregationRange(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static AggregationRange of(Function<Builder, ObjectBuilder<AggregationRange>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code date}?
	 */
	public boolean isDate() {
		return _kind == Kind.Date;
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateAggregationRange date() {
		return TaggedUnionUtils.get(this, Kind.Date);
	}

	/**
	 * Is this variant instance of kind {@code number}?
	 */
	public boolean isNumber() {
		return _kind == Kind.Number;
	}

	/**
	 * Get the {@code number} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code number} kind.
	 */
	public NumberAggregationRange number() {
		return TaggedUnionUtils.get(this, Kind.Number);
	}

	/**
	 * Is this variant instance of kind {@code term}?
	 */
	public boolean isTerm() {
		return _kind == Kind.Term;
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermAggregationRange term() {
		return TaggedUnionUtils.get(this, Kind.Term);
	}

	/**
	 * Is this variant instance of kind {@code untyped}?
	 */
	public boolean isUntyped() {
		return _kind == Kind.Untyped;
	}

	/**
	 * Get the {@code untyped} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code untyped} kind.
	 */
	public UntypedAggregationRange untyped() {
		return TaggedUnionUtils.get(this, Kind.Untyped);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AggregationRange> {
		private Kind _kind;
		private AggregationRangeVariant _value;

		public ObjectBuilder<AggregationRange> date(DateAggregationRange v) {
			this._kind = Kind.Date;
			this._value = v;
			return this;
		}

		public ObjectBuilder<AggregationRange> date(
				Function<DateAggregationRange.Builder, ObjectBuilder<DateAggregationRange>> fn) {
			return this.date(fn.apply(new DateAggregationRange.Builder()).build());
		}

		public ObjectBuilder<AggregationRange> number(NumberAggregationRange v) {
			this._kind = Kind.Number;
			this._value = v;
			return this;
		}

		public ObjectBuilder<AggregationRange> number(
				Function<NumberAggregationRange.Builder, ObjectBuilder<NumberAggregationRange>> fn) {
			return this.number(fn.apply(new NumberAggregationRange.Builder()).build());
		}

		public ObjectBuilder<AggregationRange> term(TermAggregationRange v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public ObjectBuilder<AggregationRange> term(
				Function<TermAggregationRange.Builder, ObjectBuilder<TermAggregationRange>> fn) {
			return this.term(fn.apply(new TermAggregationRange.Builder()).build());
		}

		public ObjectBuilder<AggregationRange> untyped(UntypedAggregationRange v) {
			this._kind = Kind.Untyped;
			this._value = v;
			return this;
		}

		public ObjectBuilder<AggregationRange> untyped(
				Function<UntypedAggregationRange.Builder, ObjectBuilder<UntypedAggregationRange>> fn) {
			return this.untyped(fn.apply(new UntypedAggregationRange.Builder()).build());
		}

		public AggregationRange build() {
			_checkSingleUse();
			return new AggregationRange(this);
		}

	}

	private static JsonpDeserializer<AggregationRange> buildAggregationRangeDeserializer() {
		return new UnionDeserializer.Builder<AggregationRange, Kind, AggregationRangeVariant>(AggregationRange::new,
				false).addMember(Kind.Untyped, UntypedAggregationRange._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<AggregationRange> _DESERIALIZER = JsonpDeserializer
			.lazy(AggregationRange::buildAggregationRangeDeserializer);
}
