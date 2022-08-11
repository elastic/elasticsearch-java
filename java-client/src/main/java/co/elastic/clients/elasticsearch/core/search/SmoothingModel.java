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

package co.elastic.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.SmoothingModelContainer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.SmoothingModelContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class SmoothingModel implements TaggedUnion<SmoothingModel.Kind, Object>, JsonpSerializable {

	/**
	 * {@link SmoothingModel} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.search._types.SmoothingModelContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Laplace("laplace"),

		LinearInterpolation("linear_interpolation"),

		StupidBackoff("stupid_backoff"),

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

	public SmoothingModel(SmoothingModelVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._smoothingModelKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private SmoothingModel(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SmoothingModel of(Function<Builder, ObjectBuilder<SmoothingModel>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code laplace}?
	 */
	public boolean isLaplace() {
		return _kind == Kind.Laplace;
	}

	/**
	 * Get the {@code laplace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code laplace} kind.
	 */
	public LaplaceSmoothingModel laplace() {
		return TaggedUnionUtils.get(this, Kind.Laplace);
	}

	/**
	 * Is this variant instance of kind {@code linear_interpolation}?
	 */
	public boolean isLinearInterpolation() {
		return _kind == Kind.LinearInterpolation;
	}

	/**
	 * Get the {@code linear_interpolation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear_interpolation}
	 *             kind.
	 */
	public LinearInterpolationSmoothingModel linearInterpolation() {
		return TaggedUnionUtils.get(this, Kind.LinearInterpolation);
	}

	/**
	 * Is this variant instance of kind {@code stupid_backoff}?
	 */
	public boolean isStupidBackoff() {
		return _kind == Kind.StupidBackoff;
	}

	/**
	 * Get the {@code stupid_backoff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stupid_backoff} kind.
	 */
	public StupidBackoffSmoothingModel stupidBackoff() {
		return TaggedUnionUtils.get(this, Kind.StupidBackoff);
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SmoothingModel> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<SmoothingModel> laplace(LaplaceSmoothingModel v) {
			this._kind = Kind.Laplace;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SmoothingModel> laplace(
				Function<LaplaceSmoothingModel.Builder, ObjectBuilder<LaplaceSmoothingModel>> fn) {
			return this.laplace(fn.apply(new LaplaceSmoothingModel.Builder()).build());
		}

		public ObjectBuilder<SmoothingModel> linearInterpolation(LinearInterpolationSmoothingModel v) {
			this._kind = Kind.LinearInterpolation;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SmoothingModel> linearInterpolation(
				Function<LinearInterpolationSmoothingModel.Builder, ObjectBuilder<LinearInterpolationSmoothingModel>> fn) {
			return this.linearInterpolation(fn.apply(new LinearInterpolationSmoothingModel.Builder()).build());
		}

		public ObjectBuilder<SmoothingModel> stupidBackoff(StupidBackoffSmoothingModel v) {
			this._kind = Kind.StupidBackoff;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SmoothingModel> stupidBackoff(
				Function<StupidBackoffSmoothingModel.Builder, ObjectBuilder<StupidBackoffSmoothingModel>> fn) {
			return this.stupidBackoff(fn.apply(new StupidBackoffSmoothingModel.Builder()).build());
		}

		public SmoothingModel build() {
			_checkSingleUse();
			return new SmoothingModel(this);
		}

	}

	protected static void setupSmoothingModelDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::laplace, LaplaceSmoothingModel._DESERIALIZER, "laplace");
		op.add(Builder::linearInterpolation, LinearInterpolationSmoothingModel._DESERIALIZER, "linear_interpolation");
		op.add(Builder::stupidBackoff, StupidBackoffSmoothingModel._DESERIALIZER, "stupid_backoff");

	}

	public static final JsonpDeserializer<SmoothingModel> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SmoothingModel::setupSmoothingModelDeserializer, Builder::build);
}
