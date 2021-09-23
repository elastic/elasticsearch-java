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
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisFeatureProcessorFrequencyEncoding
public final class DataframeAnalysisFeatureProcessorFrequencyEncoding
		implements
			DataframeAnalysisFeatureProcessor,
			JsonpSerializable {
	private final String featureName;

	private final String field;

	private final Map<String, Number> frequencyMap;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalysisFeatureProcessorFrequencyEncoding(Builder builder) {

		this.featureName = Objects.requireNonNull(builder.featureName, "feature_name");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.frequencyMap = Objects.requireNonNull(builder.frequencyMap, "frequency_map");

	}

	/**
	 * {@link DataframeAnalysisFeatureProcessor} variant type
	 */
	@Override
	public String _type() {
		return "frequency_encoding";
	}

	/**
	 * The resulting feature name.
	 * <p>
	 * API name: {@code feature_name}
	 */
	public String featureName() {
		return this.featureName;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * The resulting frequency map for the field value. If the field value is
	 * missing from the frequency_map, the resulting value is 0.
	 * <p>
	 * API name: {@code frequency_map}
	 */
	public Map<String, Number> frequencyMap() {
		return this.frequencyMap;
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
		generator.writeStartObject(_type());

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("frequency_map");
		generator.writeStartObject();
		for (Map.Entry<String, Number> item0 : this.frequencyMap.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue().doubleValue());

		}
		generator.writeEnd();

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisFeatureProcessorFrequencyEncoding}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalysisFeatureProcessorFrequencyEncoding> {
		private String featureName;

		private String field;

		private Map<String, Number> frequencyMap;

		/**
		 * The resulting feature name.
		 * <p>
		 * API name: {@code feature_name}
		 */
		public Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The resulting frequency map for the field value. If the field value is
		 * missing from the frequency_map, the resulting value is 0.
		 * <p>
		 * API name: {@code frequency_map}
		 */
		public Builder frequencyMap(Map<String, Number> value) {
			this.frequencyMap = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #frequencyMap(Map)}, creating the map if needed.
		 */
		public Builder putFrequencyMap(String key, Number value) {
			if (this.frequencyMap == null) {
				this.frequencyMap = new HashMap<>();
			}
			this.frequencyMap.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisFeatureProcessorFrequencyEncoding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisFeatureProcessorFrequencyEncoding build() {

			return new DataframeAnalysisFeatureProcessorFrequencyEncoding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder, DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(
					DataframeAnalysisFeatureProcessorFrequencyEncoding::setupDataframeAnalysisFeatureProcessorFrequencyEncodingDeserializer);

	protected static void setupDataframeAnalysisFeatureProcessorFrequencyEncodingDeserializer(
			DelegatingDeserializer<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::frequencyMap, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"frequency_map");

	}

}
