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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisFeatureProcessorNGramEncoding
@JsonpDeserializable
public final class DataframeAnalysisFeatureProcessorNGramEncoding
		implements
			DataframeAnalysisFeatureProcessorVariant,
			JsonpSerializable {
	@Nullable
	private final String featurePrefix;

	private final String field;

	@Nullable
	private final Integer length;

	private final List<Integer> nGrams;

	@Nullable
	private final Integer start;

	@Nullable
	private final Boolean custom;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalysisFeatureProcessorNGramEncoding(Builder builder) {

		this.featurePrefix = builder.featurePrefix;
		this.field = Objects.requireNonNull(builder.field, "field");
		this.length = builder.length;
		this.nGrams = ModelTypeHelper.unmodifiableNonNull(builder.nGrams, "n_grams");
		this.start = builder.start;
		this.custom = builder.custom;

	}

	public DataframeAnalysisFeatureProcessorNGramEncoding(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link DataframeAnalysisFeatureProcessor} variant type
	 */
	@Override
	public String _variantType() {
		return "n_gram_encoding";
	}

	/**
	 * The feature name prefix. Defaults to ngram_&lt;start&gt;_&lt;length&gt;.
	 * <p>
	 * API name: {@code feature_prefix}
	 */
	@Nullable
	public String featurePrefix() {
		return this.featurePrefix;
	}

	/**
	 * Required - The name of the text field to encode.
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Specifies the length of the n-gram substring. Defaults to 50. Must be greater
	 * than 0.
	 * <p>
	 * API name: {@code length}
	 */
	@Nullable
	public Integer length() {
		return this.length;
	}

	/**
	 * Required - Specifies which n-grams to gather. It’s an array of integer values
	 * where the minimum value is 1, and a maximum value is 5.
	 * <p>
	 * API name: {@code n_grams}
	 */
	public List<Integer> nGrams() {
		return this.nGrams;
	}

	/**
	 * Specifies the zero-indexed start of the n-gram substring. Negative values are
	 * allowed for encoding n-grams of string suffixes. Defaults to 0.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public Integer start() {
		return this.start;
	}

	/**
	 * API name: {@code custom}
	 */
	@Nullable
	public Boolean custom() {
		return this.custom;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.featurePrefix != null) {

			generator.writeKey("feature_prefix");
			generator.write(this.featurePrefix);

		}

		generator.writeKey("field");
		generator.write(this.field);

		if (this.length != null) {

			generator.writeKey("length");
			generator.write(this.length);

		}

		generator.writeKey("n_grams");
		generator.writeStartArray();
		for (Integer item0 : this.nGrams) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.custom != null) {

			generator.writeKey("custom");
			generator.write(this.custom);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisFeatureProcessorNGramEncoding}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalysisFeatureProcessorNGramEncoding> {
		@Nullable
		private String featurePrefix;

		private String field;

		@Nullable
		private Integer length;

		private List<Integer> nGrams;

		@Nullable
		private Integer start;

		@Nullable
		private Boolean custom;

		/**
		 * The feature name prefix. Defaults to ngram_&lt;start&gt;_&lt;length&gt;.
		 * <p>
		 * API name: {@code feature_prefix}
		 */
		public Builder featurePrefix(@Nullable String value) {
			this.featurePrefix = value;
			return this;
		}

		/**
		 * Required - The name of the text field to encode.
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Specifies the length of the n-gram substring. Defaults to 50. Must be greater
		 * than 0.
		 * <p>
		 * API name: {@code length}
		 */
		public Builder length(@Nullable Integer value) {
			this.length = value;
			return this;
		}

		/**
		 * Required - Specifies which n-grams to gather. It’s an array of integer values
		 * where the minimum value is 1, and a maximum value is 5.
		 * <p>
		 * API name: {@code n_grams}
		 */
		public Builder nGrams(List<Integer> value) {
			this.nGrams = value;
			return this;
		}

		/**
		 * Required - Specifies which n-grams to gather. It’s an array of integer values
		 * where the minimum value is 1, and a maximum value is 5.
		 * <p>
		 * API name: {@code n_grams}
		 */
		public Builder nGrams(Integer... value) {
			this.nGrams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nGrams(List)}, creating the list if needed.
		 */
		public Builder addNGrams(Integer value) {
			if (this.nGrams == null) {
				this.nGrams = new ArrayList<>();
			}
			this.nGrams.add(value);
			return this;
		}

		/**
		 * Specifies the zero-indexed start of the n-gram substring. Negative values are
		 * allowed for encoding n-grams of string suffixes. Defaults to 0.
		 * <p>
		 * API name: {@code start}
		 */
		public Builder start(@Nullable Integer value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code custom}
		 */
		public Builder custom(@Nullable Boolean value) {
			this.custom = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisFeatureProcessorNGramEncoding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisFeatureProcessorNGramEncoding build() {

			return new DataframeAnalysisFeatureProcessorNGramEncoding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalysisFeatureProcessorNGramEncoding}
	 */
	public static final JsonpDeserializer<DataframeAnalysisFeatureProcessorNGramEncoding> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalysisFeatureProcessorNGramEncoding::setupDataframeAnalysisFeatureProcessorNGramEncodingDeserializer,
					Builder::build);

	protected static void setupDataframeAnalysisFeatureProcessorNGramEncodingDeserializer(
			DelegatingDeserializer<DataframeAnalysisFeatureProcessorNGramEncoding.Builder> op) {

		op.add(Builder::featurePrefix, JsonpDeserializer.stringDeserializer(), "feature_prefix");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::length, JsonpDeserializer.integerDeserializer(), "length");
		op.add(Builder::nGrams, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer()),
				"n_grams");
		op.add(Builder::start, JsonpDeserializer.integerDeserializer(), "start");
		op.add(Builder::custom, JsonpDeserializer.booleanDeserializer(), "custom");

	}

}
