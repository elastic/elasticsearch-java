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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.DataframeAnalysisFeatureProcessor
@JsonpDeserializable
public class DataframeAnalysisFeatureProcessor implements TaggedUnion<Object>, JsonpSerializable {

	public static final String FREQUENCY_ENCODING = "frequency_encoding";
	public static final String MULTI_ENCODING = "multi_encoding";
	public static final String N_GRAM_ENCODING = "n_gram_encoding";
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

	public DataframeAnalysisFeatureProcessor(DataframeAnalysisFeatureProcessorVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private DataframeAnalysisFeatureProcessor(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code frequency_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code frequency_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorFrequencyEncoding frequencyEncoding() {
		return TaggedUnionUtils.get(this, FREQUENCY_ENCODING);
	}

	/**
	 * Get the {@code multi_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_encoding} kind.
	 */
	public DataframeAnalysisFeatureProcessorMultiEncoding multiEncoding() {
		return TaggedUnionUtils.get(this, MULTI_ENCODING);
	}

	/**
	 * Get the {@code n_gram_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code n_gram_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorNGramEncoding nGramEncoding() {
		return TaggedUnionUtils.get(this, N_GRAM_ENCODING);
	}

	/**
	 * Get the {@code one_hot_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code one_hot_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorOneHotEncoding oneHotEncoding() {
		return TaggedUnionUtils.get(this, ONE_HOT_ENCODING);
	}

	/**
	 * Get the {@code target_mean_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code target_mean_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorTargetMeanEncoding targetMeanEncoding() {
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

	public static class Builder {
		private String _type;
		private Object _value;

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				DataframeAnalysisFeatureProcessorFrequencyEncoding v) {
			this._type = FREQUENCY_ENCODING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				Function<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorFrequencyEncoding>> f) {
			return this.frequencyEncoding(
					f.apply(new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				DataframeAnalysisFeatureProcessorMultiEncoding v) {
			this._type = MULTI_ENCODING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				Function<DataframeAnalysisFeatureProcessorMultiEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding>> f) {
			return this.multiEncoding(f.apply(new DataframeAnalysisFeatureProcessorMultiEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				DataframeAnalysisFeatureProcessorNGramEncoding v) {
			this._type = N_GRAM_ENCODING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				Function<DataframeAnalysisFeatureProcessorNGramEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorNGramEncoding>> f) {
			return this.nGramEncoding(f.apply(new DataframeAnalysisFeatureProcessorNGramEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				DataframeAnalysisFeatureProcessorOneHotEncoding v) {
			this._type = ONE_HOT_ENCODING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				Function<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorOneHotEncoding>> f) {
			return this.oneHotEncoding(f.apply(new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				DataframeAnalysisFeatureProcessorTargetMeanEncoding v) {
			this._type = TARGET_MEAN_ENCODING;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				Function<DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding>> f) {
			return this.targetMeanEncoding(
					f.apply(new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder()).build());
		}

		protected DataframeAnalysisFeatureProcessor build() {
			return new DataframeAnalysisFeatureProcessor(this);
		}

	}

	protected static void setupDataframeAnalysisFeatureProcessorDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::frequencyEncoding, DataframeAnalysisFeatureProcessorFrequencyEncoding._DESERIALIZER,
				"frequency_encoding");
		op.add(Builder::multiEncoding, DataframeAnalysisFeatureProcessorMultiEncoding._DESERIALIZER, "multi_encoding");
		op.add(Builder::nGramEncoding, DataframeAnalysisFeatureProcessorNGramEncoding._DESERIALIZER, "n_gram_encoding");
		op.add(Builder::oneHotEncoding, DataframeAnalysisFeatureProcessorOneHotEncoding._DESERIALIZER,
				"one_hot_encoding");
		op.add(Builder::targetMeanEncoding, DataframeAnalysisFeatureProcessorTargetMeanEncoding._DESERIALIZER,
				"target_mean_encoding");

	}

	public static final JsonpDeserializer<DataframeAnalysisFeatureProcessor> _DESERIALIZER = JsonpDeserializer.lazy(
			Builder::new, DataframeAnalysisFeatureProcessor::setupDataframeAnalysisFeatureProcessorDeserializer,
			Builder::build);
}
