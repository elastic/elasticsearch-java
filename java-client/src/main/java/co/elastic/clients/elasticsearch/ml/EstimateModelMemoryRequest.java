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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.estimate_model_memory.Request
@JsonpDeserializable
public final class EstimateModelMemoryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final AnalysisConfig analysisConfig;

	@Nullable
	private final Map<String, Long> maxBucketCardinality;

	@Nullable
	private final Map<String, Long> overallCardinality;

	// ---------------------------------------------------------------------------------------------

	public EstimateModelMemoryRequest(Builder builder) {

		this.analysisConfig = builder.analysisConfig;
		this.maxBucketCardinality = builder.maxBucketCardinality;
		this.overallCardinality = builder.overallCardinality;

	}

	/**
	 * API name: {@code analysis_config}
	 */
	@Nullable
	public AnalysisConfig analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * API name: {@code max_bucket_cardinality}
	 */
	@Nullable
	public Map<String, Long> maxBucketCardinality() {
		return this.maxBucketCardinality;
	}

	/**
	 * API name: {@code overall_cardinality}
	 */
	@Nullable
	public Map<String, Long> overallCardinality() {
		return this.overallCardinality;
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

		if (this.analysisConfig != null) {

			generator.writeKey("analysis_config");
			this.analysisConfig.serialize(generator, mapper);

		}
		if (this.maxBucketCardinality != null) {

			generator.writeKey("max_bucket_cardinality");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.maxBucketCardinality.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.overallCardinality != null) {

			generator.writeKey("overall_cardinality");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.overallCardinality.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EstimateModelMemoryRequest}.
	 */
	public static class Builder implements ObjectBuilder<EstimateModelMemoryRequest> {
		@Nullable
		private AnalysisConfig analysisConfig;

		@Nullable
		private Map<String, Long> maxBucketCardinality;

		@Nullable
		private Map<String, Long> overallCardinality;

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(@Nullable AnalysisConfig value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(Function<AnalysisConfig.Builder, ObjectBuilder<AnalysisConfig>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfig.Builder()).build());
		}

		/**
		 * API name: {@code max_bucket_cardinality}
		 */
		public Builder maxBucketCardinality(@Nullable Map<String, Long> value) {
			this.maxBucketCardinality = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #maxBucketCardinality(Map)}, creating the map if
		 * needed.
		 */
		public Builder putMaxBucketCardinality(String key, Long value) {
			if (this.maxBucketCardinality == null) {
				this.maxBucketCardinality = new HashMap<>();
			}
			this.maxBucketCardinality.put(key, value);
			return this;
		}

		/**
		 * API name: {@code overall_cardinality}
		 */
		public Builder overallCardinality(@Nullable Map<String, Long> value) {
			this.overallCardinality = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #overallCardinality(Map)}, creating the map if
		 * needed.
		 */
		public Builder putOverallCardinality(String key, Long value) {
			if (this.overallCardinality == null) {
				this.overallCardinality = new HashMap<>();
			}
			this.overallCardinality.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link EstimateModelMemoryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EstimateModelMemoryRequest build() {

			return new EstimateModelMemoryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EstimateModelMemoryRequest}
	 */
	public static final JsonpDeserializer<EstimateModelMemoryRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, EstimateModelMemoryRequest::setupEstimateModelMemoryRequestDeserializer, Builder::build);

	protected static void setupEstimateModelMemoryRequestDeserializer(
			DelegatingDeserializer<EstimateModelMemoryRequest.Builder> op) {

		op.add(Builder::analysisConfig, AnalysisConfig._DESERIALIZER, "analysis_config");
		op.add(Builder::maxBucketCardinality,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"max_bucket_cardinality");
		op.add(Builder::overallCardinality,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()), "overall_cardinality");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.estimate_model_memory}".
	 */
	public static final Endpoint<EstimateModelMemoryRequest, EstimateModelMemoryResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/anomaly_detectors/_estimate_model_memory";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, EstimateModelMemoryResponse._DESERIALIZER);
}
