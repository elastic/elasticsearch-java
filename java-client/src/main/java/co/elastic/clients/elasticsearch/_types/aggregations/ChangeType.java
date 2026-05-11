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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
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

// typedef: _types.aggregations.ChangeType

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ChangeType">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChangeType implements TaggedUnion<ChangeType.Kind, Object>, JsonpSerializable {

	/**
	 * {@link ChangeType} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.aggregations.ChangeType">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Dip("dip"),

		DistributionChange("distribution_change"),

		Indeterminable("indeterminable"),

		NonStationary("non_stationary"),

		Spike("spike"),

		Stationary("stationary"),

		StepChange("step_change"),

		TrendChange("trend_change"),

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

	public ChangeType(ChangeTypeVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._changeTypeKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private ChangeType(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ChangeType of(Function<Builder, ObjectBuilder<ChangeType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code dip}?
	 */
	public boolean isDip() {
		return _kind == Kind.Dip;
	}

	/**
	 * Get the {@code dip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dip} kind.
	 */
	public Dip dip() {
		return TaggedUnionUtils.get(this, Kind.Dip);
	}

	/**
	 * Is this variant instance of kind {@code distribution_change}?
	 */
	public boolean isDistributionChange() {
		return _kind == Kind.DistributionChange;
	}

	/**
	 * Get the {@code distribution_change} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code distribution_change}
	 *             kind.
	 */
	public DistributionChange distributionChange() {
		return TaggedUnionUtils.get(this, Kind.DistributionChange);
	}

	/**
	 * Is this variant instance of kind {@code indeterminable}?
	 */
	public boolean isIndeterminable() {
		return _kind == Kind.Indeterminable;
	}

	/**
	 * Get the {@code indeterminable} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code indeterminable} kind.
	 */
	public Indeterminable indeterminable() {
		return TaggedUnionUtils.get(this, Kind.Indeterminable);
	}

	/**
	 * Is this variant instance of kind {@code non_stationary}?
	 */
	public boolean isNonStationary() {
		return _kind == Kind.NonStationary;
	}

	/**
	 * Get the {@code non_stationary} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code non_stationary} kind.
	 */
	public NonStationary nonStationary() {
		return TaggedUnionUtils.get(this, Kind.NonStationary);
	}

	/**
	 * Is this variant instance of kind {@code spike}?
	 */
	public boolean isSpike() {
		return _kind == Kind.Spike;
	}

	/**
	 * Get the {@code spike} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code spike} kind.
	 */
	public Spike spike() {
		return TaggedUnionUtils.get(this, Kind.Spike);
	}

	/**
	 * Is this variant instance of kind {@code stationary}?
	 */
	public boolean isStationary() {
		return _kind == Kind.Stationary;
	}

	/**
	 * Get the {@code stationary} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stationary} kind.
	 */
	public Stationary stationary() {
		return TaggedUnionUtils.get(this, Kind.Stationary);
	}

	/**
	 * Is this variant instance of kind {@code step_change}?
	 */
	public boolean isStepChange() {
		return _kind == Kind.StepChange;
	}

	/**
	 * Get the {@code step_change} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code step_change} kind.
	 */
	public StepChange stepChange() {
		return TaggedUnionUtils.get(this, Kind.StepChange);
	}

	/**
	 * Is this variant instance of kind {@code trend_change}?
	 */
	public boolean isTrendChange() {
		return _kind == Kind.TrendChange;
	}

	/**
	 * Get the {@code trend_change} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trend_change} kind.
	 */
	public TrendChange trendChange() {
		return TaggedUnionUtils.get(this, Kind.TrendChange);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ChangeType> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<ChangeType> dip(Dip v) {
			this._kind = Kind.Dip;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> dip(Function<Dip.Builder, ObjectBuilder<Dip>> fn) {
			return this.dip(fn.apply(new Dip.Builder()).build());
		}

		public ObjectBuilder<ChangeType> distributionChange(DistributionChange v) {
			this._kind = Kind.DistributionChange;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> distributionChange(
				Function<DistributionChange.Builder, ObjectBuilder<DistributionChange>> fn) {
			return this.distributionChange(fn.apply(new DistributionChange.Builder()).build());
		}

		public ObjectBuilder<ChangeType> indeterminable(Indeterminable v) {
			this._kind = Kind.Indeterminable;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> indeterminable(
				Function<Indeterminable.Builder, ObjectBuilder<Indeterminable>> fn) {
			return this.indeterminable(fn.apply(new Indeterminable.Builder()).build());
		}

		public ObjectBuilder<ChangeType> nonStationary(NonStationary v) {
			this._kind = Kind.NonStationary;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> nonStationary(
				Function<NonStationary.Builder, ObjectBuilder<NonStationary>> fn) {
			return this.nonStationary(fn.apply(new NonStationary.Builder()).build());
		}

		public ObjectBuilder<ChangeType> spike(Spike v) {
			this._kind = Kind.Spike;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> spike(Function<Spike.Builder, ObjectBuilder<Spike>> fn) {
			return this.spike(fn.apply(new Spike.Builder()).build());
		}

		public ObjectBuilder<ChangeType> stationary(Stationary v) {
			this._kind = Kind.Stationary;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> stationary(Function<Stationary.Builder, ObjectBuilder<Stationary>> fn) {
			return this.stationary(fn.apply(new Stationary.Builder()).build());
		}

		public ObjectBuilder<ChangeType> stepChange(StepChange v) {
			this._kind = Kind.StepChange;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> stepChange(Function<StepChange.Builder, ObjectBuilder<StepChange>> fn) {
			return this.stepChange(fn.apply(new StepChange.Builder()).build());
		}

		public ObjectBuilder<ChangeType> trendChange(TrendChange v) {
			this._kind = Kind.TrendChange;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ChangeType> trendChange(Function<TrendChange.Builder, ObjectBuilder<TrendChange>> fn) {
			return this.trendChange(fn.apply(new TrendChange.Builder()).build());
		}

		public ChangeType build() {
			_checkSingleUse();
			return new ChangeType(this);
		}

	}

	protected static void setupChangeTypeDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::dip, Dip._DESERIALIZER, "dip");
		op.add(Builder::distributionChange, DistributionChange._DESERIALIZER, "distribution_change");
		op.add(Builder::indeterminable, Indeterminable._DESERIALIZER, "indeterminable");
		op.add(Builder::nonStationary, NonStationary._DESERIALIZER, "non_stationary");
		op.add(Builder::spike, Spike._DESERIALIZER, "spike");
		op.add(Builder::stationary, Stationary._DESERIALIZER, "stationary");
		op.add(Builder::stepChange, StepChange._DESERIALIZER, "step_change");
		op.add(Builder::trendChange, TrendChange._DESERIALIZER, "trend_change");

	}

	public static final JsonpDeserializer<ChangeType> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ChangeType::setupChangeTypeDeserializer, Builder::build);
}
