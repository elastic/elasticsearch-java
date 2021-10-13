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

// typedef: ml.put_trained_model.Preprocessor
@JsonpDeserializable
public class Preprocessor implements TaggedUnion<Object>, JsonpSerializable {

	public static final String FREQUENCY_ENCODING = "frequency_encoding";
	public static final String ONE_HOT_ENCODING = "one_hot_encoding";
	public static final String TARGET_MEAN_ENCODING = "target_mean_encoding";

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

	public Preprocessor(PreprocessorVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends PreprocessorVariant> Preprocessor(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private Preprocessor(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public Preprocessor(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code frequency_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code frequency_encoding}
	 *             kind.
	 */
	public FrequencyEncodingPreprocessor frequencyEncoding() {
		return TaggedUnionUtils.get(this, FREQUENCY_ENCODING);
	}

	/**
	 * Get the {@code one_hot_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code one_hot_encoding}
	 *             kind.
	 */
	public OneHotEncodingPreprocessor oneHotEncoding() {
		return TaggedUnionUtils.get(this, ONE_HOT_ENCODING);
	}

	/**
	 * Get the {@code target_mean_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code target_mean_encoding}
	 *             kind.
	 */
	public TargetMeanEncodingPreprocessor targetMeanEncoding() {
		return TaggedUnionUtils.get(this, TARGET_MEAN_ENCODING);
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

	public static class Builder implements ObjectBuilder<Preprocessor> {
		private String _type;
		private Object _value;

		public Builder frequencyEncoding(FrequencyEncodingPreprocessor v) {
			this._type = FREQUENCY_ENCODING;
			this._value = v;
			return this;
		}

		public Builder frequencyEncoding(
				Function<FrequencyEncodingPreprocessor.Builder, ObjectBuilder<FrequencyEncodingPreprocessor>> f) {
			return this.frequencyEncoding(f.apply(new FrequencyEncodingPreprocessor.Builder()).build());
		}

		public Builder oneHotEncoding(OneHotEncodingPreprocessor v) {
			this._type = ONE_HOT_ENCODING;
			this._value = v;
			return this;
		}

		public Builder oneHotEncoding(
				Function<OneHotEncodingPreprocessor.Builder, ObjectBuilder<OneHotEncodingPreprocessor>> f) {
			return this.oneHotEncoding(f.apply(new OneHotEncodingPreprocessor.Builder()).build());
		}

		public Builder targetMeanEncoding(TargetMeanEncodingPreprocessor v) {
			this._type = TARGET_MEAN_ENCODING;
			this._value = v;
			return this;
		}

		public Builder targetMeanEncoding(
				Function<TargetMeanEncodingPreprocessor.Builder, ObjectBuilder<TargetMeanEncodingPreprocessor>> f) {
			return this.targetMeanEncoding(f.apply(new TargetMeanEncodingPreprocessor.Builder()).build());
		}

		public Preprocessor build() {
			return new Preprocessor(this);
		}

	}

	protected static void setupPreprocessorDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::frequencyEncoding, FrequencyEncodingPreprocessor._DESERIALIZER, "frequency_encoding");
		op.add(Builder::oneHotEncoding, OneHotEncodingPreprocessor._DESERIALIZER, "one_hot_encoding");
		op.add(Builder::targetMeanEncoding, TargetMeanEncodingPreprocessor._DESERIALIZER, "target_mean_encoding");

	}

	public static final JsonpDeserializer<Preprocessor> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Preprocessor::setupPreprocessorDeserializer, Builder::build);
}
