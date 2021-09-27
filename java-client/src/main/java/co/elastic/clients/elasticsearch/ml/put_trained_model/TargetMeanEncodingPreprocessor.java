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

// typedef: ml.put_trained_model.TargetMeanEncodingPreprocessor
@JsonpDeserializable
public final class TargetMeanEncodingPreprocessor implements PreprocessorVariant, JsonpSerializable {
	private final String field;

	private final String featureName;

	private final Map<String, Double> targetMap;

	private final double defaultValue;

	// ---------------------------------------------------------------------------------------------

	public TargetMeanEncodingPreprocessor(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.featureName = Objects.requireNonNull(builder.featureName, "feature_name");
		this.targetMap = Objects.requireNonNull(builder.targetMap, "target_map");
		this.defaultValue = Objects.requireNonNull(builder.defaultValue, "default_value");

	}

	/**
	 * {@link Preprocessor} variant type
	 */
	@Override
	public String _variantType() {
		return "target_mean_encoding";
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
	 * API name: {@code target_map}
	 */
	public Map<String, Double> targetMap() {
		return this.targetMap;
	}

	/**
	 * API name: {@code default_value}
	 */
	public double defaultValue() {
		return this.defaultValue;
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

		generator.writeKey("target_map");
		generator.writeStartObject();
		for (Map.Entry<String, Double> item0 : this.targetMap.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("default_value");
		generator.write(this.defaultValue);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TargetMeanEncodingPreprocessor}.
	 */
	public static class Builder implements ObjectBuilder<TargetMeanEncodingPreprocessor> {
		private String field;

		private String featureName;

		private Map<String, Double> targetMap;

		private Double defaultValue;

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
		 * API name: {@code target_map}
		 */
		public Builder targetMap(Map<String, Double> value) {
			this.targetMap = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #targetMap(Map)}, creating the map if needed.
		 */
		public Builder putTargetMap(String key, Double value) {
			if (this.targetMap == null) {
				this.targetMap = new HashMap<>();
			}
			this.targetMap.put(key, value);
			return this;
		}

		/**
		 * API name: {@code default_value}
		 */
		public Builder defaultValue(double value) {
			this.defaultValue = value;
			return this;
		}

		/**
		 * Builds a {@link TargetMeanEncodingPreprocessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TargetMeanEncodingPreprocessor build() {

			return new TargetMeanEncodingPreprocessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TargetMeanEncodingPreprocessor}
	 */
	public static final JsonpDeserializer<TargetMeanEncodingPreprocessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TargetMeanEncodingPreprocessor::setupTargetMeanEncodingPreprocessorDeserializer,
					Builder::build);

	protected static void setupTargetMeanEncodingPreprocessorDeserializer(
			DelegatingDeserializer<TargetMeanEncodingPreprocessor.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::targetMap, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"target_map");
		op.add(Builder::defaultValue, JsonpDeserializer.doubleDeserializer(), "default_value");

	}

}
