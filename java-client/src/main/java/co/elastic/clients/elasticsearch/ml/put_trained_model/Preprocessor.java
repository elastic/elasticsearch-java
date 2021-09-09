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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

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

public class Preprocessor extends TaggedUnion<Preprocessor.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		frequencyEncoding("frequency_encoding"),

		oneHotEncoding("one_hot_encoding"),

		targetMeanEncoding("target_mean_encoding"),

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

	private Preprocessor(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link Preprocessor} of a {@code frequency_encoding} kind?
	 */
	public boolean isFrequencyEncoding() {
		return is(Tag.frequencyEncoding);
	}

	/**
	 * Get the {@code frequency_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code frequency_encoding}
	 *             kind.
	 */
	public FrequencyEncodingPreprocessor frequencyEncoding() {
		return get(Tag.frequencyEncoding);
	}

	/**
	 * Is this {@link Preprocessor} of a {@code one_hot_encoding} kind?
	 */
	public boolean isOneHotEncoding() {
		return is(Tag.oneHotEncoding);
	}

	/**
	 * Get the {@code one_hot_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code one_hot_encoding}
	 *             kind.
	 */
	public OneHotEncodingPreprocessor oneHotEncoding() {
		return get(Tag.oneHotEncoding);
	}

	/**
	 * Is this {@link Preprocessor} of a {@code target_mean_encoding} kind?
	 */
	public boolean isTargetMeanEncoding() {
		return is(Tag.targetMeanEncoding);
	}

	/**
	 * Get the {@code target_mean_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code target_mean_encoding}
	 *             kind.
	 */
	public TargetMeanEncodingPreprocessor targetMeanEncoding() {
		return get(Tag.targetMeanEncoding);
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

		public ObjectBuilder<Preprocessor> frequencyEncoding(FrequencyEncodingPreprocessor v) {
			this.$variant = v;
			this.$tag = Tag.frequencyEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<Preprocessor> frequencyEncoding(
				Function<FrequencyEncodingPreprocessor.Builder, ObjectBuilder<FrequencyEncodingPreprocessor>> f) {
			return this.frequencyEncoding(f.apply(new FrequencyEncodingPreprocessor.Builder()).build());
		}

		public ObjectBuilder<Preprocessor> oneHotEncoding(OneHotEncodingPreprocessor v) {
			this.$variant = v;
			this.$tag = Tag.oneHotEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<Preprocessor> oneHotEncoding(
				Function<OneHotEncodingPreprocessor.Builder, ObjectBuilder<OneHotEncodingPreprocessor>> f) {
			return this.oneHotEncoding(f.apply(new OneHotEncodingPreprocessor.Builder()).build());
		}

		public ObjectBuilder<Preprocessor> targetMeanEncoding(TargetMeanEncodingPreprocessor v) {
			this.$variant = v;
			this.$tag = Tag.targetMeanEncoding;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<Preprocessor> targetMeanEncoding(
				Function<TargetMeanEncodingPreprocessor.Builder, ObjectBuilder<TargetMeanEncodingPreprocessor>> f) {
			return this.targetMeanEncoding(f.apply(new TargetMeanEncodingPreprocessor.Builder()).build());
		}

		protected Preprocessor build() {
			return new Preprocessor(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<Preprocessor> DESERIALIZER = JsonpDeserializer
			.lazy(Preprocessor::buildDeserializer);

	private static JsonpDeserializer<Preprocessor> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::frequencyEncoding, FrequencyEncodingPreprocessor.DESERIALIZER, "frequency_encoding");
		op.add(Builder::oneHotEncoding, OneHotEncodingPreprocessor.DESERIALIZER, "one_hot_encoding");
		op.add(Builder::targetMeanEncoding, TargetMeanEncodingPreprocessor.DESERIALIZER, "target_mean_encoding");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
