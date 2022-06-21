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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingAverageAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MovingAverageAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MovingAverageAggregation
		implements
			TaggedUnion<MovingAverageAggregation.Kind, MovingAverageAggregationVariant>,
			JsonpSerializable {

	/**
	 * {@link MovingAverageAggregation} variant kinds.
	 */
	/**
	 * {@link MovingAverageAggregation} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.aggregations.MovingAverageAggregation">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Ewma("ewma"),

		Holt("holt"),

		HoltWinters("holt_winters"),

		Linear("linear"),

		Simple("simple"),

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
	private final MovingAverageAggregationVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final MovingAverageAggregationVariant _get() {
		return _value;
	}

	public MovingAverageAggregation(MovingAverageAggregationVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._movingAverageAggregationKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private MovingAverageAggregation(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static MovingAverageAggregation of(Function<Builder, ObjectBuilder<MovingAverageAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code ewma}?
	 */
	public boolean isEwma() {
		return _kind == Kind.Ewma;
	}

	/**
	 * Get the {@code ewma} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ewma} kind.
	 */
	public EwmaMovingAverageAggregation ewma() {
		return TaggedUnionUtils.get(this, Kind.Ewma);
	}

	/**
	 * Is this variant instance of kind {@code holt}?
	 */
	public boolean isHolt() {
		return _kind == Kind.Holt;
	}

	/**
	 * Get the {@code holt} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code holt} kind.
	 */
	public HoltMovingAverageAggregation holt() {
		return TaggedUnionUtils.get(this, Kind.Holt);
	}

	/**
	 * Is this variant instance of kind {@code holt_winters}?
	 */
	public boolean isHoltWinters() {
		return _kind == Kind.HoltWinters;
	}

	/**
	 * Get the {@code holt_winters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code holt_winters} kind.
	 */
	public HoltWintersMovingAverageAggregation holtWinters() {
		return TaggedUnionUtils.get(this, Kind.HoltWinters);
	}

	/**
	 * Is this variant instance of kind {@code linear}?
	 */
	public boolean isLinear() {
		return _kind == Kind.Linear;
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public LinearMovingAverageAggregation linear() {
		return TaggedUnionUtils.get(this, Kind.Linear);
	}

	/**
	 * Is this variant instance of kind {@code simple}?
	 */
	public boolean isSimple() {
		return _kind == Kind.Simple;
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public SimpleMovingAverageAggregation simple() {
		return TaggedUnionUtils.get(this, Kind.Simple);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MovingAverageAggregation> {
		private Kind _kind;
		private MovingAverageAggregationVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<MovingAverageAggregation> ewma(EwmaMovingAverageAggregation v) {
			this._kind = Kind.Ewma;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> ewma(
				Function<EwmaMovingAverageAggregation.Builder, ObjectBuilder<EwmaMovingAverageAggregation>> fn) {
			return this.ewma(fn.apply(new EwmaMovingAverageAggregation.Builder()).build());
		}

		public ObjectBuilder<MovingAverageAggregation> holt(HoltMovingAverageAggregation v) {
			this._kind = Kind.Holt;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> holt(
				Function<HoltMovingAverageAggregation.Builder, ObjectBuilder<HoltMovingAverageAggregation>> fn) {
			return this.holt(fn.apply(new HoltMovingAverageAggregation.Builder()).build());
		}

		public ObjectBuilder<MovingAverageAggregation> holtWinters(HoltWintersMovingAverageAggregation v) {
			this._kind = Kind.HoltWinters;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> holtWinters(
				Function<HoltWintersMovingAverageAggregation.Builder, ObjectBuilder<HoltWintersMovingAverageAggregation>> fn) {
			return this.holtWinters(fn.apply(new HoltWintersMovingAverageAggregation.Builder()).build());
		}

		public ObjectBuilder<MovingAverageAggregation> linear(LinearMovingAverageAggregation v) {
			this._kind = Kind.Linear;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> linear(
				Function<LinearMovingAverageAggregation.Builder, ObjectBuilder<LinearMovingAverageAggregation>> fn) {
			return this.linear(fn.apply(new LinearMovingAverageAggregation.Builder()).build());
		}

		public ObjectBuilder<MovingAverageAggregation> simple(SimpleMovingAverageAggregation v) {
			this._kind = Kind.Simple;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MovingAverageAggregation> simple(
				Function<SimpleMovingAverageAggregation.Builder, ObjectBuilder<SimpleMovingAverageAggregation>> fn) {
			return this.simple(fn.apply(new SimpleMovingAverageAggregation.Builder()).build());
		}

		public MovingAverageAggregation build() {
			_checkSingleUse();
			return new MovingAverageAggregation(this);
		}

	}

	protected static void setupMovingAverageAggregationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::ewma, EwmaMovingAverageAggregation._DESERIALIZER, "ewma");
		op.add(Builder::holt, HoltMovingAverageAggregation._DESERIALIZER, "holt");
		op.add(Builder::holtWinters, HoltWintersMovingAverageAggregation._DESERIALIZER, "holt_winters");
		op.add(Builder::linear, LinearMovingAverageAggregation._DESERIALIZER, "linear");
		op.add(Builder::simple, SimpleMovingAverageAggregation._DESERIALIZER, "simple");

		op.setTypeProperty("model", null);

	}

	public static final JsonpDeserializer<MovingAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingAverageAggregation::setupMovingAverageAggregationDeserializer, Builder::build);
}
