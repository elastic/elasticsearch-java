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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class SmoothingModelContainer extends TaggedUnion<SmoothingModelContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		laplace("laplace"),

		linearInterpolation("linear_interpolation"),

		stupidBackoff("stupid_backoff"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private SmoothingModelContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link SmoothingModelContainer} of a {@code laplace} kind?
	 */
	public boolean isLaplace() {
		return is(Tag.laplace);
	}

	/**
	 * Get the {@code laplace} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code laplace} kind.
	 */
	public LaplaceSmoothingModel laplace() {
		return get(Tag.laplace);
	}

	/**
	 * Is this {@link SmoothingModelContainer} of a {@code linear_interpolation}
	 * kind?
	 */
	public boolean isLinearInterpolation() {
		return is(Tag.linearInterpolation);
	}

	/**
	 * Get the {@code linear_interpolation} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear_interpolation}
	 *             kind.
	 */
	public LinearInterpolationSmoothingModel linearInterpolation() {
		return get(Tag.linearInterpolation);
	}

	/**
	 * Is this {@link SmoothingModelContainer} of a {@code stupid_backoff} kind?
	 */
	public boolean isStupidBackoff() {
		return is(Tag.stupidBackoff);
	}

	/**
	 * Get the {@code stupid_backoff} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stupid_backoff} kind.
	 */
	public StupidBackoffSmoothingModel stupidBackoff() {
		return get(Tag.stupidBackoff);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<SmoothingModelContainer> laplace(LaplaceSmoothingModel v) {
			this.$variant = v;
			this.$tag = Tag.laplace;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SmoothingModelContainer> laplace(
				Function<LaplaceSmoothingModel.Builder, ObjectBuilder<LaplaceSmoothingModel>> f) {
			return this.laplace(f.apply(new LaplaceSmoothingModel.Builder()).build());
		}

		public ObjectBuilder<SmoothingModelContainer> linearInterpolation(LinearInterpolationSmoothingModel v) {
			this.$variant = v;
			this.$tag = Tag.linearInterpolation;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SmoothingModelContainer> linearInterpolation(
				Function<LinearInterpolationSmoothingModel.Builder, ObjectBuilder<LinearInterpolationSmoothingModel>> f) {
			return this.linearInterpolation(f.apply(new LinearInterpolationSmoothingModel.Builder()).build());
		}

		public ObjectBuilder<SmoothingModelContainer> stupidBackoff(StupidBackoffSmoothingModel v) {
			this.$variant = v;
			this.$tag = Tag.stupidBackoff;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<SmoothingModelContainer> stupidBackoff(
				Function<StupidBackoffSmoothingModel.Builder, ObjectBuilder<StupidBackoffSmoothingModel>> f) {
			return this.stupidBackoff(f.apply(new StupidBackoffSmoothingModel.Builder()).build());
		}

		protected SmoothingModelContainer build() {
			return new SmoothingModelContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<SmoothingModelContainer> DESERIALIZER = JsonpDeserializer
			.lazy(SmoothingModelContainer::buildDeserializer);

	private static JsonpDeserializer<SmoothingModelContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::laplace, LaplaceSmoothingModel.DESERIALIZER, "laplace");
		op.add(Builder::linearInterpolation, LinearInterpolationSmoothingModel.DESERIALIZER, "linear_interpolation");
		op.add(Builder::stupidBackoff, StupidBackoffSmoothingModel.DESERIALIZER, "stupid_backoff");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
