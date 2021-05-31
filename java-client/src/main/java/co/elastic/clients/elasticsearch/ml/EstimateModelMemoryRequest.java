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
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.estimate_model_memory.Request
public final class EstimateModelMemoryRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final AnalysisConfig analysisConfig;

	@Nullable
	private final Map<String, Number> maxBucketCardinality;

	@Nullable
	private final Map<String, Number> overallCardinality;

	// ---------------------------------------------------------------------------------------------

	protected EstimateModelMemoryRequest(Builder builder) {

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
	public Map<String, Number> maxBucketCardinality() {
		return this.maxBucketCardinality;
	}

	/**
	 * API name: {@code overall_cardinality}
	 */
	@Nullable
	public Map<String, Number> overallCardinality() {
		return this.overallCardinality;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.analysisConfig != null) {

			generator.writeKey("analysis_config");
			this.analysisConfig.toJsonp(generator, mapper);

		}
		if (this.maxBucketCardinality != null) {

			generator.writeKey("max_bucket_cardinality");
			generator.writeStartObject();
			for (Map.Entry<String, Number> item0 : this.maxBucketCardinality.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue().doubleValue());

			}
			generator.writeEnd();

		}
		if (this.overallCardinality != null) {

			generator.writeKey("overall_cardinality");
			generator.writeStartObject();
			for (Map.Entry<String, Number> item0 : this.overallCardinality.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue().doubleValue());

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
		private Map<String, Number> maxBucketCardinality;

		@Nullable
		private Map<String, Number> overallCardinality;

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
		public Builder maxBucketCardinality(@Nullable Map<String, Number> value) {
			this.maxBucketCardinality = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #maxBucketCardinality(Map)}, creating the map if
		 * needed.
		 */
		public Builder putMaxBucketCardinality(String key, Number value) {
			if (this.maxBucketCardinality == null) {
				this.maxBucketCardinality = new HashMap<>();
			}
			this.maxBucketCardinality.put(key, value);
			return this;
		}

		/**
		 * API name: {@code overall_cardinality}
		 */
		public Builder overallCardinality(@Nullable Map<String, Number> value) {
			this.overallCardinality = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #overallCardinality(Map)}, creating the map if
		 * needed.
		 */
		public Builder putOverallCardinality(String key, Number value) {
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
	 * Json parser for EstimateModelMemoryRequest
	 */
	public static final JsonpValueParser<EstimateModelMemoryRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, EstimateModelMemoryRequest::setupEstimateModelMemoryRequestParser);

	protected static void setupEstimateModelMemoryRequestParser(
			DelegatingJsonpValueParser<EstimateModelMemoryRequest.Builder> op) {

		op.add(Builder::analysisConfig, AnalysisConfig.JSONP_PARSER, "analysis_config");
		op.add(Builder::maxBucketCardinality, JsonpValueParser.stringMapParser(JsonpValueParser.numberParser()),
				"max_bucket_cardinality");
		op.add(Builder::overallCardinality, JsonpValueParser.stringMapParser(JsonpValueParser.numberParser()),
				"overall_cardinality");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.estimate_model_memory}".
	 */
	public static final Endpoint<EstimateModelMemoryRequest, EstimateModelMemoryResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_ml");
				buf.append("/anomaly_detectors");
				buf.append("/_estimate_model_memory");
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, EstimateModelMemoryResponse.JSONP_PARSER);
}
