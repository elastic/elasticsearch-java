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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.TargetMeanEncodingPreprocessor

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.TargetMeanEncodingPreprocessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class TargetMeanEncodingPreprocessor implements PreprocessorVariant, JsonpSerializable {
	private final String field;

	private final String featureName;

	private final Map<String, Double> targetMap;

	private final double defaultValue;

	// ---------------------------------------------------------------------------------------------

	private TargetMeanEncodingPreprocessor(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.featureName = ApiTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.targetMap = ApiTypeHelper.unmodifiableRequired(builder.targetMap, this, "targetMap");
		this.defaultValue = ApiTypeHelper.requireNonNull(builder.defaultValue, this, "defaultValue");

	}

	public static TargetMeanEncodingPreprocessor of(
			Function<Builder, ObjectBuilder<TargetMeanEncodingPreprocessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Preprocessor variant kind.
	 */
	@Override
	public Preprocessor.Kind _preprocessorKind() {
		return Preprocessor.Kind.TargetMeanEncoding;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * Required - API name: {@code target_map}
	 */
	public final Map<String, Double> targetMap() {
		return this.targetMap;
	}

	/**
	 * Required - API name: {@code default_value}
	 */
	public final double defaultValue() {
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

		if (ApiTypeHelper.isDefined(this.targetMap)) {
			generator.writeKey("target_map");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.targetMap.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("default_value");
		generator.write(this.defaultValue);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TargetMeanEncodingPreprocessor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TargetMeanEncodingPreprocessor> {
		private String field;

		private String featureName;

		private Map<String, Double> targetMap;

		private Double defaultValue;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_map}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>targetMap</code>.
		 */
		public final Builder targetMap(Map<String, Double> map) {
			this.targetMap = _mapPutAll(this.targetMap, map);
			return this;
		}

		/**
		 * Required - API name: {@code target_map}
		 * <p>
		 * Adds an entry to <code>targetMap</code>.
		 */
		public final Builder targetMap(String key, Double value) {
			this.targetMap = _mapPut(this.targetMap, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(double value) {
			this.defaultValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TargetMeanEncodingPreprocessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TargetMeanEncodingPreprocessor build() {
			_checkSingleUse();

			return new TargetMeanEncodingPreprocessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TargetMeanEncodingPreprocessor}
	 */
	public static final JsonpDeserializer<TargetMeanEncodingPreprocessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TargetMeanEncodingPreprocessor::setupTargetMeanEncodingPreprocessorDeserializer);

	protected static void setupTargetMeanEncodingPreprocessorDeserializer(
			ObjectDeserializer<TargetMeanEncodingPreprocessor.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::targetMap, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"target_map");
		op.add(Builder::defaultValue, JsonpDeserializer.doubleDeserializer(), "default_value");

	}

}
