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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingAverageAggregation
// union type: InternalTag[tag=model]
@JsonpDeserializable
public class MovingAverageAggregation implements TaggedUnion<MovingAverageAggregationVariant>, JsonpSerializable {

	public static final String EWMA = "ewma";
	public static final String HOLT = "holt";
	public static final String HOLT_WINTERS = "holt_winters";
	public static final String LINEAR = "linear";
	public static final String SIMPLE = "simple";

	private final String _type;
	private final MovingAverageAggregationVariant _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final MovingAverageAggregationVariant _get() {
		return _value;
	}

	public MovingAverageAggregation(MovingAverageAggregationVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private MovingAverageAggregation(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static MovingAverageAggregation of(Function<Builder, ObjectBuilder<MovingAverageAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code ewma}?
	 */
	public boolean _isEwma() {
		return EWMA.equals(_type());
	}

	/**
	 * Get the {@code ewma} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ewma} kind.
	 */
	public EwmaMovingAverageAggregation ewma() {
		return TaggedUnionUtils.get(this, EWMA);
	}

	/**
	 * Is this variant instance of kind {@code holt}?
	 */
	public boolean _isHolt() {
		return HOLT.equals(_type());
	}

	/**
	 * Get the {@code holt} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code holt} kind.
	 */
	public HoltMovingAverageAggregation holt() {
		return TaggedUnionUtils.get(this, HOLT);
	}

	/**
	 * Is this variant instance of kind {@code holt_winters}?
	 */
	public boolean _isHoltWinters() {
		return HOLT_WINTERS.equals(_type());
	}

	/**
	 * Get the {@code holt_winters} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code holt_winters} kind.
	 */
	public HoltWintersMovingAverageAggregation holtWinters() {
		return TaggedUnionUtils.get(this, HOLT_WINTERS);
	}

	/**
	 * Is this variant instance of kind {@code linear}?
	 */
	public boolean _isLinear() {
		return LINEAR.equals(_type());
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public LinearMovingAverageAggregation linear() {
		return TaggedUnionUtils.get(this, LINEAR);
	}

	/**
	 * Is this variant instance of kind {@code simple}?
	 */
	public boolean _isSimple() {
		return SIMPLE.equals(_type());
	}

	/**
	 * Get the {@code simple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple} kind.
	 */
	public SimpleMovingAverageAggregation simple() {
		return TaggedUnionUtils.get(this, SIMPLE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MovingAverageAggregation> {
		private String _type;
		private MovingAverageAggregationVariant _value;

		public Builder ewma(EwmaMovingAverageAggregation v) {
			this._type = EWMA;
			this._value = v;
			return this;
		}

		public Builder ewma(
				Function<EwmaMovingAverageAggregation.Builder, ObjectBuilder<EwmaMovingAverageAggregation>> f) {
			return this.ewma(f.apply(new EwmaMovingAverageAggregation.Builder()).build());
		}

		public Builder holt(HoltMovingAverageAggregation v) {
			this._type = HOLT;
			this._value = v;
			return this;
		}

		public Builder holt(
				Function<HoltMovingAverageAggregation.Builder, ObjectBuilder<HoltMovingAverageAggregation>> f) {
			return this.holt(f.apply(new HoltMovingAverageAggregation.Builder()).build());
		}

		public Builder holtWinters(HoltWintersMovingAverageAggregation v) {
			this._type = HOLT_WINTERS;
			this._value = v;
			return this;
		}

		public Builder holtWinters(
				Function<HoltWintersMovingAverageAggregation.Builder, ObjectBuilder<HoltWintersMovingAverageAggregation>> f) {
			return this.holtWinters(f.apply(new HoltWintersMovingAverageAggregation.Builder()).build());
		}

		public Builder linear(LinearMovingAverageAggregation v) {
			this._type = LINEAR;
			this._value = v;
			return this;
		}

		public Builder linear(
				Function<LinearMovingAverageAggregation.Builder, ObjectBuilder<LinearMovingAverageAggregation>> f) {
			return this.linear(f.apply(new LinearMovingAverageAggregation.Builder()).build());
		}

		public Builder simple(SimpleMovingAverageAggregation v) {
			this._type = SIMPLE;
			this._value = v;
			return this;
		}

		public Builder simple(
				Function<SimpleMovingAverageAggregation.Builder, ObjectBuilder<SimpleMovingAverageAggregation>> f) {
			return this.simple(f.apply(new SimpleMovingAverageAggregation.Builder()).build());
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

		op.setTypeProperty("model");

	}

	public static final JsonpDeserializer<MovingAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingAverageAggregation::setupMovingAverageAggregationDeserializer, Builder::build);
}
