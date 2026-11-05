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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalFailure;
import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalQuerySourceSummary;
import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalReportedSettings;
import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalResult;
import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalVectorOpsKind;
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
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _global.knn_eval.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.knn_eval.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalResponse implements JsonpSerializable {
	@Nullable
	private final KnnEvalQuerySourceSummary querySource;

	@Nullable
	private final KnnEvalReportedSettings baseline;

	@Nullable
	private final Long baselineTookMs;

	@Nullable
	private final Long baselineVectorOps;

	@Nullable
	private final KnnEvalVectorOpsKind baselineVectorOpsKind;

	private final List<KnnEvalResult> results;

	private final Map<String, KnnEvalFailure> failures;

	@Nullable
	private final String task;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalResponse(Builder builder) {

		this.querySource = builder.querySource;
		this.baseline = builder.baseline;
		this.baselineTookMs = builder.baselineTookMs;
		this.baselineVectorOps = builder.baselineVectorOps;
		this.baselineVectorOpsKind = builder.baselineVectorOpsKind;
		this.results = ApiTypeHelper.unmodifiable(builder.results);
		this.failures = ApiTypeHelper.unmodifiable(builder.failures);
		this.task = builder.task;

	}

	public static KnnEvalResponse of(Function<Builder, ObjectBuilder<KnnEvalResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The source of the query vectors. Not returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code query_source}
	 */
	@Nullable
	public final KnnEvalQuerySourceSummary querySource() {
		return this.querySource;
	}

	/**
	 * The settings of the baseline search. Not returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code baseline}
	 */
	@Nullable
	public final KnnEvalReportedSettings baseline() {
		return this.baseline;
	}

	/**
	 * The time the baseline searches took, in milliseconds. Not returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code baseline_took_ms}
	 */
	@Nullable
	public final Long baselineTookMs() {
		return this.baselineTookMs;
	}

	/**
	 * The number of vector operations of the baseline searches. Not returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code baseline_vector_ops}
	 */
	@Nullable
	public final Long baselineVectorOps() {
		return this.baselineVectorOps;
	}

	/**
	 * What <code>baseline_vector_ops</code> counts. Not returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code baseline_vector_ops_kind}
	 */
	@Nullable
	public final KnnEvalVectorOpsKind baselineVectorOpsKind() {
		return this.baselineVectorOpsKind;
	}

	/**
	 * The results of each <code>knn_settings</code> entry, in the order of the
	 * request. Not returned when <code>wait_for_completion</code> is
	 * <code>false</code>.
	 * <p>
	 * API name: {@code results}
	 */
	public final List<KnnEvalResult> results() {
		return this.results;
	}

	/**
	 * The queries that failed, by query identifier. Not returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code failures}
	 */
	public final Map<String, KnnEvalFailure> failures() {
		return this.failures;
	}

	/**
	 * The identifier of the task that runs the evaluation. Only returned when
	 * <code>wait_for_completion</code> is <code>false</code>.
	 * <p>
	 * API name: {@code task}
	 */
	@Nullable
	public final String task() {
		return this.task;
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

		if (this.querySource != null) {
			generator.writeKey("query_source");
			this.querySource.serialize(generator, mapper);

		}
		if (this.baseline != null) {
			generator.writeKey("baseline");
			this.baseline.serialize(generator, mapper);

		}
		if (this.baselineTookMs != null) {
			generator.writeKey("baseline_took_ms");
			generator.write(this.baselineTookMs);

		}
		if (this.baselineVectorOps != null) {
			generator.writeKey("baseline_vector_ops");
			generator.write(this.baselineVectorOps);

		}
		if (this.baselineVectorOpsKind != null) {
			generator.writeKey("baseline_vector_ops_kind");
			this.baselineVectorOpsKind.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.results)) {
			generator.writeKey("results");
			generator.writeStartArray();
			for (KnnEvalResult item0 : this.results) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartObject();
			for (Map.Entry<String, KnnEvalFailure> item0 : this.failures.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.task != null) {
			generator.writeKey("task");
			generator.write(this.task);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<KnnEvalResponse> {
		@Nullable
		private KnnEvalQuerySourceSummary querySource;

		@Nullable
		private KnnEvalReportedSettings baseline;

		@Nullable
		private Long baselineTookMs;

		@Nullable
		private Long baselineVectorOps;

		@Nullable
		private KnnEvalVectorOpsKind baselineVectorOpsKind;

		@Nullable
		private List<KnnEvalResult> results;

		@Nullable
		private Map<String, KnnEvalFailure> failures;

		@Nullable
		private String task;

		/**
		 * The source of the query vectors. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code query_source}
		 */
		public final Builder querySource(@Nullable KnnEvalQuerySourceSummary value) {
			this.querySource = value;
			return this;
		}

		/**
		 * The source of the query vectors. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code query_source}
		 */
		public final Builder querySource(
				Function<KnnEvalQuerySourceSummary.Builder, ObjectBuilder<KnnEvalQuerySourceSummary>> fn) {
			return this.querySource(fn.apply(new KnnEvalQuerySourceSummary.Builder()).build());
		}

		/**
		 * The settings of the baseline search. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code baseline}
		 */
		public final Builder baseline(@Nullable KnnEvalReportedSettings value) {
			this.baseline = value;
			return this;
		}

		/**
		 * The settings of the baseline search. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code baseline}
		 */
		public final Builder baseline(
				Function<KnnEvalReportedSettings.Builder, ObjectBuilder<KnnEvalReportedSettings>> fn) {
			return this.baseline(fn.apply(new KnnEvalReportedSettings.Builder()).build());
		}

		/**
		 * The time the baseline searches took, in milliseconds. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code baseline_took_ms}
		 */
		public final Builder baselineTookMs(@Nullable Long value) {
			this.baselineTookMs = value;
			return this;
		}

		/**
		 * The number of vector operations of the baseline searches. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code baseline_vector_ops}
		 */
		public final Builder baselineVectorOps(@Nullable Long value) {
			this.baselineVectorOps = value;
			return this;
		}

		/**
		 * What <code>baseline_vector_ops</code> counts. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code baseline_vector_ops_kind}
		 */
		public final Builder baselineVectorOpsKind(@Nullable KnnEvalVectorOpsKind value) {
			this.baselineVectorOpsKind = value;
			return this;
		}

		/**
		 * The results of each <code>knn_settings</code> entry, in the order of the
		 * request. Not returned when <code>wait_for_completion</code> is
		 * <code>false</code>.
		 * <p>
		 * API name: {@code results}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>results</code>.
		 */
		public final Builder results(List<KnnEvalResult> list) {
			this.results = _listAddAll(this.results, list);
			return this;
		}

		/**
		 * The results of each <code>knn_settings</code> entry, in the order of the
		 * request. Not returned when <code>wait_for_completion</code> is
		 * <code>false</code>.
		 * <p>
		 * API name: {@code results}
		 * <p>
		 * Adds one or more values to <code>results</code>.
		 */
		public final Builder results(KnnEvalResult value, KnnEvalResult... values) {
			this.results = _listAdd(this.results, value, values);
			return this;
		}

		/**
		 * The results of each <code>knn_settings</code> entry, in the order of the
		 * request. Not returned when <code>wait_for_completion</code> is
		 * <code>false</code>.
		 * <p>
		 * API name: {@code results}
		 * <p>
		 * Adds a value to <code>results</code> using a builder lambda.
		 */
		public final Builder results(Function<KnnEvalResult.Builder, ObjectBuilder<KnnEvalResult>> fn) {
			return results(fn.apply(new KnnEvalResult.Builder()).build());
		}

		/**
		 * The queries that failed, by query identifier. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>failures</code>.
		 */
		public final Builder failures(Map<String, KnnEvalFailure> map) {
			this.failures = _mapPutAll(this.failures, map);
			return this;
		}

		/**
		 * The queries that failed, by query identifier. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds an entry to <code>failures</code>.
		 */
		public final Builder failures(String key, KnnEvalFailure value) {
			this.failures = _mapPut(this.failures, key, value);
			return this;
		}

		/**
		 * The queries that failed, by query identifier. Not returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds an entry to <code>failures</code> using a builder lambda.
		 */
		public final Builder failures(String key, Function<KnnEvalFailure.Builder, ObjectBuilder<KnnEvalFailure>> fn) {
			return failures(key, fn.apply(new KnnEvalFailure.Builder()).build());
		}

		/**
		 * The identifier of the task that runs the evaluation. Only returned when
		 * <code>wait_for_completion</code> is <code>false</code>.
		 * <p>
		 * API name: {@code task}
		 */
		public final Builder task(@Nullable String value) {
			this.task = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalResponse build() {
			_checkSingleUse();

			return new KnnEvalResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnEvalResponse}
	 */
	public static final JsonpDeserializer<KnnEvalResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnEvalResponse::setupKnnEvalResponseDeserializer);

	protected static void setupKnnEvalResponseDeserializer(ObjectDeserializer<KnnEvalResponse.Builder> op) {

		op.add(Builder::querySource, KnnEvalQuerySourceSummary._DESERIALIZER, "query_source");
		op.add(Builder::baseline, KnnEvalReportedSettings._DESERIALIZER, "baseline");
		op.add(Builder::baselineTookMs, JsonpDeserializer.longDeserializer(), "baseline_took_ms");
		op.add(Builder::baselineVectorOps, JsonpDeserializer.longDeserializer(), "baseline_vector_ops");
		op.add(Builder::baselineVectorOpsKind, KnnEvalVectorOpsKind._DESERIALIZER, "baseline_vector_ops_kind");
		op.add(Builder::results, JsonpDeserializer.arrayDeserializer(KnnEvalResult._DESERIALIZER), "results");
		op.add(Builder::failures, JsonpDeserializer.stringMapDeserializer(KnnEvalFailure._DESERIALIZER), "failures");
		op.add(Builder::task, JsonpDeserializer.stringDeserializer(), "task");

	}

}
