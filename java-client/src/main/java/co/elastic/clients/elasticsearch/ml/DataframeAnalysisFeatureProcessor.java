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

// typedef: ml._types.DataframeAnalysisFeatureProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisFeatureProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysisFeatureProcessor
		implements
			TaggedUnion<DataframeAnalysisFeatureProcessor.Kind, Object>,
			JsonpSerializable {

	/**
	 * {@link DataframeAnalysisFeatureProcessor} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisFeatureProcessor">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		FrequencyEncoding("frequency_encoding"),

		MultiEncoding("multi_encoding"),

		NGramEncoding("n_gram_encoding"),

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

	public DataframeAnalysisFeatureProcessor(DataframeAnalysisFeatureProcessorVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._dataframeAnalysisFeatureProcessorKind(), this,
				"<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DataframeAnalysisFeatureProcessor(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DataframeAnalysisFeatureProcessor of(
			Function<Builder, ObjectBuilder<DataframeAnalysisFeatureProcessor>> fn) {
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
	public DataframeAnalysisFeatureProcessorFrequencyEncoding frequencyEncoding() {
		return TaggedUnionUtils.get(this, Kind.FrequencyEncoding);
	}

	/**
	 * Is this variant instance of kind {@code multi_encoding}?
	 */
	public boolean isMultiEncoding() {
		return _kind == Kind.MultiEncoding;
	}

	/**
	 * Get the {@code multi_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multi_encoding} kind.
	 */
	public DataframeAnalysisFeatureProcessorMultiEncoding multiEncoding() {
		return TaggedUnionUtils.get(this, Kind.MultiEncoding);
	}

	/**
	 * Is this variant instance of kind {@code n_gram_encoding}?
	 */
	public boolean isNGramEncoding() {
		return _kind == Kind.NGramEncoding;
	}

	/**
	 * Get the {@code n_gram_encoding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code n_gram_encoding}
	 *             kind.
	 */
	public DataframeAnalysisFeatureProcessorNGramEncoding nGramEncoding() {
		return TaggedUnionUtils.get(this, Kind.NGramEncoding);
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
	public DataframeAnalysisFeatureProcessorOneHotEncoding oneHotEncoding() {
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
	public DataframeAnalysisFeatureProcessorTargetMeanEncoding targetMeanEncoding() {
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalysisFeatureProcessor> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				DataframeAnalysisFeatureProcessorFrequencyEncoding v) {
			this._kind = Kind.FrequencyEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> frequencyEncoding(
				Function<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorFrequencyEncoding>> fn) {
			return this.frequencyEncoding(
					fn.apply(new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				DataframeAnalysisFeatureProcessorMultiEncoding v) {
			this._kind = Kind.MultiEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> multiEncoding(
				Function<DataframeAnalysisFeatureProcessorMultiEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding>> fn) {
			return this.multiEncoding(fn.apply(new DataframeAnalysisFeatureProcessorMultiEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				DataframeAnalysisFeatureProcessorNGramEncoding v) {
			this._kind = Kind.NGramEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> nGramEncoding(
				Function<DataframeAnalysisFeatureProcessorNGramEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorNGramEncoding>> fn) {
			return this.nGramEncoding(fn.apply(new DataframeAnalysisFeatureProcessorNGramEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				DataframeAnalysisFeatureProcessorOneHotEncoding v) {
			this._kind = Kind.OneHotEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> oneHotEncoding(
				Function<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorOneHotEncoding>> fn) {
			return this.oneHotEncoding(fn.apply(new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder()).build());
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				DataframeAnalysisFeatureProcessorTargetMeanEncoding v) {
			this._kind = Kind.TargetMeanEncoding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DataframeAnalysisFeatureProcessor> targetMeanEncoding(
				Function<DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding>> fn) {
			return this.targetMeanEncoding(
					fn.apply(new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder()).build());
		}

		public DataframeAnalysisFeatureProcessor build() {
			_checkSingleUse();
			return new DataframeAnalysisFeatureProcessor(this);
		}

	}

	protected static void setupDataframeAnalysisFeatureProcessorDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::frequencyEncoding, DataframeAnalysisFeatureProcessorFrequencyEncoding._DESERIALIZER,
				"frequency_encoding");
		op.add(Builder::multiEncoding, DataframeAnalysisFeatureProcessorMultiEncoding._DESERIALIZER, "multi_encoding");
		op.add(Builder::nGramEncoding, DataframeAnalysisFeatureProcessorNGramEncoding._DESERIALIZER, "n_gram_encoding");
		op.add(Builder::oneHotEncoding, DataframeAnalysisFeatureProcessorOneHotEncoding._DESERIALIZER,
				"one_hot_encoding");
		op.add(Builder::targetMeanEncoding, DataframeAnalysisFeatureProcessorTargetMeanEncoding._DESERIALIZER,
				"target_mean_encoding");

	}

	public static final JsonpDeserializer<DataframeAnalysisFeatureProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalysisFeatureProcessor::setupDataframeAnalysisFeatureProcessorDeserializer,
					Builder::build);
}
