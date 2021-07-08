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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.elasticsearch._global.rank_eval.RankEvalMetricDetail;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.Response
public final class RankEvalResponse implements ToJsonp {
	private final Number metricScore;

	private final Map<String, RankEvalMetricDetail> details;

	private final Map<String, JsonValue> failures;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalResponse(Builder builder) {

		this.metricScore = Objects.requireNonNull(builder.metricScore, "metric_score");
		this.details = Objects.requireNonNull(builder.details, "details");
		this.failures = Objects.requireNonNull(builder.failures, "failures");

	}

	/**
	 * The overall evaluation quality calculated by the defined metric
	 *
	 * API name: {@code metric_score}
	 */
	public Number metricScore() {
		return this.metricScore;
	}

	/**
	 * The details section contains one entry for every query in the original
	 * requests section, keyed by the search request id
	 *
	 * API name: {@code details}
	 */
	public Map<String, RankEvalMetricDetail> details() {
		return this.details;
	}

	/**
	 * API name: {@code failures}
	 */
	public Map<String, JsonValue> failures() {
		return this.failures;
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

		generator.writeKey("metric_score");
		generator.write(this.metricScore.doubleValue());

		generator.writeKey("details");
		generator.writeStartObject();
		for (Map.Entry<String, RankEvalMetricDetail> item0 : this.details.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("failures");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.failures.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalResponse}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalResponse> {
		private Number metricScore;

		private Map<String, RankEvalMetricDetail> details;

		private Map<String, JsonValue> failures;

		/**
		 * The overall evaluation quality calculated by the defined metric
		 *
		 * API name: {@code metric_score}
		 */
		public Builder metricScore(Number value) {
			this.metricScore = value;
			return this;
		}

		/**
		 * The details section contains one entry for every query in the original
		 * requests section, keyed by the search request id
		 *
		 * API name: {@code details}
		 */
		public Builder details(Map<String, RankEvalMetricDetail> value) {
			this.details = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #details(Map)}, creating the map if needed.
		 */
		public Builder putDetails(String key, RankEvalMetricDetail value) {
			if (this.details == null) {
				this.details = new HashMap<>();
			}
			this.details.put(key, value);
			return this;
		}

		/**
		 * Set {@link #details(Map)} to a singleton map.
		 */
		public Builder details(String key,
				Function<RankEvalMetricDetail.Builder, ObjectBuilder<RankEvalMetricDetail>> fn) {
			return this.details(Collections.singletonMap(key, fn.apply(new RankEvalMetricDetail.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #details(Map)}, creating the map if needed.
		 */
		public Builder putDetails(String key,
				Function<RankEvalMetricDetail.Builder, ObjectBuilder<RankEvalMetricDetail>> fn) {
			return this.putDetails(key, fn.apply(new RankEvalMetricDetail.Builder()).build());
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(Map<String, JsonValue> value) {
			this.failures = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #failures(Map)}, creating the map if needed.
		 */
		public Builder putFailures(String key, JsonValue value) {
			if (this.failures == null) {
				this.failures = new HashMap<>();
			}
			this.failures.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link RankEvalResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalResponse build() {

			return new RankEvalResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RankEvalResponse
	 */
	public static final JsonpDeserializer<RankEvalResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RankEvalResponse::setupRankEvalResponseDeserializer);

	protected static void setupRankEvalResponseDeserializer(DelegatingDeserializer<RankEvalResponse.Builder> op) {

		op.add(Builder::metricScore, JsonpDeserializer.numberDeserializer(), "metric_score");
		op.add(Builder::details, JsonpDeserializer.stringMapDeserializer(RankEvalMetricDetail.DESERIALIZER), "details");
		op.add(Builder::failures, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"failures");

	}

}
