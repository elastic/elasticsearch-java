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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.FrequencyEncodingPreprocessor
@JsonpDeserializable
public final class FrequencyEncodingPreprocessor implements PreprocessorVariant, JsonpSerializable {
	private final String field;

	private final String featureName;

	private final Map<String, Double> frequencyMap;

	// ---------------------------------------------------------------------------------------------

	public FrequencyEncodingPreprocessor(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.featureName = Objects.requireNonNull(builder.featureName, "feature_name");
		this.frequencyMap = Objects.requireNonNull(builder.frequencyMap, "frequency_map");

	}

	/**
	 * {@link Preprocessor} variant type
	 */
	@Override
	public String _variantType() {
		return "frequency_encoding";
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code feature_name}
	 */
	public String featureName() {
		return this.featureName;
	}

	/**
	 * API name: {@code frequency_map}
	 */
	public Map<String, Double> frequencyMap() {
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("frequency_map");
		generator.writeStartObject();
		for (Map.Entry<String, Double> item0 : this.frequencyMap.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FrequencyEncodingPreprocessor}.
	 */
	public static class Builder implements ObjectBuilder<FrequencyEncodingPreprocessor> {
		private String field;

		private String featureName;

		private Map<String, Double> frequencyMap;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code feature_name}
		 */
		public Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * API name: {@code frequency_map}
		 */
		public Builder frequencyMap(Map<String, Double> value) {
			this.frequencyMap = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #frequencyMap(Map)}, creating the map if needed.
		 */
		public Builder putFrequencyMap(String key, Double value) {
			if (this.frequencyMap == null) {
				this.frequencyMap = new HashMap<>();
			}
			this.frequencyMap.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link FrequencyEncodingPreprocessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FrequencyEncodingPreprocessor build() {

			return new FrequencyEncodingPreprocessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FrequencyEncodingPreprocessor}
	 */
	public static final JsonpDeserializer<FrequencyEncodingPreprocessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, FrequencyEncodingPreprocessor::setupFrequencyEncodingPreprocessorDeserializer,
			Builder::build);

	protected static void setupFrequencyEncodingPreprocessorDeserializer(
			DelegatingDeserializer<FrequencyEncodingPreprocessor.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::frequencyMap, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"frequency_map");

	}

}
