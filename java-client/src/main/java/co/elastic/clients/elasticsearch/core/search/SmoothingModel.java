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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SmoothingModelContainer
@JsonpDeserializable
public class SmoothingModel implements TaggedUnion<Object>, JsonpSerializable {

	public static final String LAPLACE = "laplace";
	public static final String LINEAR_INTERPOLATION = "linear_interpolation";
	public static final String STUPID_BACKOFF = "stupid_backoff";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public SmoothingModel(SmoothingModelVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends SmoothingModelVariant> SmoothingModel(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private SmoothingModel(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public SmoothingModel(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code laplace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code laplace} kind.
	 */
	public LaplaceSmoothingModel laplace() {
		return TaggedUnionUtils.get(this, LAPLACE);
	}

	/**
	 * Get the {@code linear_interpolation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear_interpolation}
	 *             kind.
	 */
	public LinearInterpolationSmoothingModel linearInterpolation() {
		return TaggedUnionUtils.get(this, LINEAR_INTERPOLATION);
	}

	/**
	 * Get the {@code stupid_backoff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stupid_backoff} kind.
	 */
	public StupidBackoffSmoothingModel stupidBackoff() {
		return TaggedUnionUtils.get(this, STUPID_BACKOFF);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder implements ObjectBuilder<SmoothingModel> {
		private String _type;
		private Object _value;

		public Builder laplace(LaplaceSmoothingModel v) {
			this._type = LAPLACE;
			this._value = v;
			return this;
		}

		public Builder laplace(Function<LaplaceSmoothingModel.Builder, ObjectBuilder<LaplaceSmoothingModel>> f) {
			return this.laplace(f.apply(new LaplaceSmoothingModel.Builder()).build());
		}

		public Builder linearInterpolation(LinearInterpolationSmoothingModel v) {
			this._type = LINEAR_INTERPOLATION;
			this._value = v;
			return this;
		}

		public Builder linearInterpolation(
				Function<LinearInterpolationSmoothingModel.Builder, ObjectBuilder<LinearInterpolationSmoothingModel>> f) {
			return this.linearInterpolation(f.apply(new LinearInterpolationSmoothingModel.Builder()).build());
		}

		public Builder stupidBackoff(StupidBackoffSmoothingModel v) {
			this._type = STUPID_BACKOFF;
			this._value = v;
			return this;
		}

		public Builder stupidBackoff(
				Function<StupidBackoffSmoothingModel.Builder, ObjectBuilder<StupidBackoffSmoothingModel>> f) {
			return this.stupidBackoff(f.apply(new StupidBackoffSmoothingModel.Builder()).build());
		}

		public SmoothingModel build() {
			return new SmoothingModel(this);
		}

	}

	protected static void setupSmoothingModelDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::laplace, LaplaceSmoothingModel._DESERIALIZER, "laplace");
		op.add(Builder::linearInterpolation, LinearInterpolationSmoothingModel._DESERIALIZER, "linear_interpolation");
		op.add(Builder::stupidBackoff, StupidBackoffSmoothingModel._DESERIALIZER, "stupid_backoff");

	}

	public static final JsonpDeserializer<SmoothingModel> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			SmoothingModel::setupSmoothingModelDeserializer, Builder::build);
}
