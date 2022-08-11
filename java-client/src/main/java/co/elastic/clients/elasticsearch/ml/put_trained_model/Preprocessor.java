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

// typedef: ml.put_trained_model.Preprocessor

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.Preprocessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class Preprocessor implements TaggedUnion<Preprocessor.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Preprocessor} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#ml.put_trained_model.Preprocessor">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		FrequencyEncoding("frequency_encoding"),

		OneHotEncoding("one_hot_encoding"),

		TargetMeanEncoding("target_mean_encoding"),

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

	public Preprocessor(PreprocessorVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._preprocessorKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Preprocessor(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Preprocessor of(Function<Builder, ObjectBuilder<Preprocessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code frequency_encoding}?
	 */
	public boolean isFrequencyEncoding() {
		return _kind == Kind.FrequencyEncoding;
	}

	/**
	 * Get the {@code frequency_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code frequency_encoding}
	 *             kind.
	 */
	public FrequencyEncodingPreprocessor frequencyEncoding() {
		return TaggedUnionUtils.get(this, Kind.FrequencyEncoding);
	}

	/**
	 * Is this variant instance of kind {@code one_hot_encoding}?
	 */
	public boolean isOneHotEncoding() {
		return _kind == Kind.OneHotEncoding;
	}

	/**
	 * Get the {@code one_hot_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code one_hot_encoding}
	 *             kind.
	 */
	public OneHotEncodingPreprocessor oneHotEncoding() {
		return TaggedUnionUtils.get(this, Kind.OneHotEncoding);
	}

	/**
	 * Is this variant instance of kind {@code target_mean_encoding}?
	 */
	public boolean isTargetMeanEncoding() {
		return _kind == Kind.TargetMeanEncoding;
	}

	/**
	 * Get the {@code target_mean_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code target_mean_encoding}
	 *             kind.
	 */
	public TargetMeanEncodingPreprocessor targetMeanEncoding() {
		return TaggedUnionUtils.get(this, Kind.TargetMeanEncoding);
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Preprocessor> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Preprocessor> frequencyEncoding(FrequencyEncodingPreprocessor v) {
			this._kind = Kind.FrequencyEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Preprocessor> frequencyEncoding(
				Function<FrequencyEncodingPreprocessor.Builder, ObjectBuilder<FrequencyEncodingPreprocessor>> fn) {
			return this.frequencyEncoding(fn.apply(new FrequencyEncodingPreprocessor.Builder()).build());
		}

		public ObjectBuilder<Preprocessor> oneHotEncoding(OneHotEncodingPreprocessor v) {
			this._kind = Kind.OneHotEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Preprocessor> oneHotEncoding(
				Function<OneHotEncodingPreprocessor.Builder, ObjectBuilder<OneHotEncodingPreprocessor>> fn) {
			return this.oneHotEncoding(fn.apply(new OneHotEncodingPreprocessor.Builder()).build());
		}

		public ObjectBuilder<Preprocessor> targetMeanEncoding(TargetMeanEncodingPreprocessor v) {
			this._kind = Kind.TargetMeanEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Preprocessor> targetMeanEncoding(
				Function<TargetMeanEncodingPreprocessor.Builder, ObjectBuilder<TargetMeanEncodingPreprocessor>> fn) {
			return this.targetMeanEncoding(fn.apply(new TargetMeanEncodingPreprocessor.Builder()).build());
		}

		public Preprocessor build() {
			_checkSingleUse();
			return new Preprocessor(this);
		}

	}

	protected static void setupPreprocessorDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::frequencyEncoding, FrequencyEncodingPreprocessor._DESERIALIZER, "frequency_encoding");
		op.add(Builder::oneHotEncoding, OneHotEncodingPreprocessor._DESERIALIZER, "one_hot_encoding");
		op.add(Builder::targetMeanEncoding, TargetMeanEncodingPreprocessor._DESERIALIZER, "target_mean_encoding");

	}

	public static final JsonpDeserializer<Preprocessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Preprocessor::setupPreprocessorDeserializer, Builder::build);
}
