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

import co.elastic.clients.json.JsonData;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisFeatureProcessorTargetMeanEncoding

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisFeatureProcessorTargetMeanEncoding">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysisFeatureProcessorTargetMeanEncoding
		implements
			DataframeAnalysisFeatureProcessorVariant,
			JsonpSerializable {
	private final int defaultValue;

	private final String featureName;

	private final String field;

	private final Map<String, JsonData> targetMap;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalysisFeatureProcessorTargetMeanEncoding(Builder builder) {

		this.defaultValue = ApiTypeHelper.requireNonNull(builder.defaultValue, this, "defaultValue");
		this.featureName = ApiTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.targetMap = ApiTypeHelper.unmodifiableRequired(builder.targetMap, this, "targetMap");

	}

	public static DataframeAnalysisFeatureProcessorTargetMeanEncoding of(
			Function<Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeAnalysisFeatureProcessor variant kind.
	 */
	@Override
	public DataframeAnalysisFeatureProcessor.Kind _dataframeAnalysisFeatureProcessorKind() {
		return DataframeAnalysisFeatureProcessor.Kind.TargetMeanEncoding;
	}

	/**
	 * Required - The default value if field value is not found in the target_map.
	 * <p>
	 * API name: {@code default_value}
	 */
	public final int defaultValue() {
		return this.defaultValue;
	}

	/**
	 * Required - The resulting feature name.
	 * <p>
	 * API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * Required - The name of the field to encode.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - The field value to target mean transition map.
	 * <p>
	 * API name: {@code target_map}
	 */
	public final Map<String, JsonData> targetMap() {
		return this.targetMap;
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

		generator.writeKey("default_value");
		generator.write(this.defaultValue);

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.targetMap)) {
			generator.writeKey("target_map");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.targetMap.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisFeatureProcessorTargetMeanEncoding}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding> {
		private Integer defaultValue;

		private String featureName;

		private String field;

		private Map<String, JsonData> targetMap;

		/**
		 * Required - The default value if field value is not found in the target_map.
		 * <p>
		 * API name: {@code default_value}
		 */
		public final Builder defaultValue(int value) {
			this.defaultValue = value;
			return this;
		}

		/**
		 * Required - The resulting feature name.
		 * <p>
		 * API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * Required - The name of the field to encode.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - The field value to target mean transition map.
		 * <p>
		 * API name: {@code target_map}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>targetMap</code>.
		 */
		public final Builder targetMap(Map<String, JsonData> map) {
			this.targetMap = _mapPutAll(this.targetMap, map);
			return this;
		}

		/**
		 * Required - The field value to target mean transition map.
		 * <p>
		 * API name: {@code target_map}
		 * <p>
		 * Adds an entry to <code>targetMap</code>.
		 */
		public final Builder targetMap(String key, JsonData value) {
			this.targetMap = _mapPut(this.targetMap, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisFeatureProcessorTargetMeanEncoding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisFeatureProcessorTargetMeanEncoding build() {
			_checkSingleUse();

			return new DataframeAnalysisFeatureProcessorTargetMeanEncoding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for
	 * {@link DataframeAnalysisFeatureProcessorTargetMeanEncoding}
	 */
	public static final JsonpDeserializer<DataframeAnalysisFeatureProcessorTargetMeanEncoding> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalysisFeatureProcessorTargetMeanEncoding::setupDataframeAnalysisFeatureProcessorTargetMeanEncodingDeserializer);

	protected static void setupDataframeAnalysisFeatureProcessorTargetMeanEncodingDeserializer(
			ObjectDeserializer<DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder> op) {

		op.add(Builder::defaultValue, JsonpDeserializer.integerDeserializer(), "default_value");
		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::targetMap, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "target_map");

	}

}
