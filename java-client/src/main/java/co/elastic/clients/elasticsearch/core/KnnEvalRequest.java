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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalQuerySource;
import co.elastic.clients.elasticsearch.core.knn_eval.KnnEvalSettings;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: _global.knn_eval.Request

/**
 * Evaluate kNN search settings.
 * <p>
 * Estimate the recall and cost of approximate kNN search configurations on a
 * <code>dense_vector</code> field against a more thorough baseline. The field
 * must use the <code>bbq_disk</code> index type, and must not be inside a
 * nested object.
 * <p>
 * Each <code>knn_settings</code> entry reports the mean recall of the
 * baseline's top <code>k</code>, not of relevance judgments, plus included and
 * excluded query counts and cost totals. A query is excluded from the mean
 * recall when the candidate finds a document scoring above the baseline's
 * lowest top <code>k</code> score. A baseline returning fewer than
 * <code>k</code> hits fails that query, because recall at <code>k</code> is
 * undefined. All configurations run against one point in time.
 * <p>
 * The default baseline uses a <code>visit_percentage</code> of 20 and a
 * <code>rescore_vector.oversample</code> of 100. An exact full-precision
 * baseline must be requested explicitly with <code>allow_exact_baseline</code>,
 * and is limited to 100 million vector-by-query comparisons.
 * <p>
 * The request is refused when the <code>search.knn_eval.enabled</code> cluster
 * setting or the <code>index.knn_eval.enabled</code> index setting is
 * <code>false</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.knn_eval.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnEvalRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowExactBaseline;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final KnnEvalSettings baseline;

	private final List<ExpandWildcard> expandWildcards;

	private final String field;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	private final int k;

	private final List<KnnEvalSettings> knnSettings;

	private final KnnEvalQuerySource querySource;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private KnnEvalRequest(Builder builder) {

		this.allowExactBaseline = builder.allowExactBaseline;
		this.allowNoIndices = builder.allowNoIndices;
		this.baseline = builder.baseline;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.k = ApiTypeHelper.requireNonNull(builder.k, this, "k", 0);
		this.knnSettings = ApiTypeHelper.unmodifiableRequired(builder.knnSettings, this, "knnSettings");
		this.querySource = ApiTypeHelper.requireNonNull(builder.querySource, this, "querySource");
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static KnnEvalRequest of(Function<Builder, ObjectBuilder<KnnEvalRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the <code>baseline</code> can be <code>exact</code>. An
	 * exact baseline compares every vector at full precision, and can severely slow
	 * down other searches.
	 * <p>
	 * API name: {@code allow_exact_baseline}
	 */
	@Nullable
	public final Boolean allowExactBaseline() {
		return this.allowExactBaseline;
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * The settings of the search that the <code>knn_settings</code> entries are
	 * compared with. If not specified, it uses a <code>visit_percentage</code> of
	 * 20 and a <code>rescore_vector.oversample</code> of 100.
	 * <p>
	 * API name: {@code baseline}
	 */
	@Nullable
	public final KnnEvalSettings baseline() {
		return this.baseline;
	}

	/**
	 * The type of index that wildcard patterns can match. It supports
	 * comma-separated values, such as <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Required - The <code>dense_vector</code> field to evaluate.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - A comma-separated list of index names to search.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Required - The number of nearest neighbors to compute the recall for, from 1
	 * to 1000.
	 * <p>
	 * API name: {@code k}
	 */
	public final int k() {
		return this.k;
	}

	/**
	 * Required - The kNN search settings to evaluate, from 1 to 32 unique entries.
	 * <p>
	 * API name: {@code knn_settings}
	 */
	public final List<KnnEvalSettings> knnSettings() {
		return this.knnSettings;
	}

	/**
	 * Required - The source of the query vectors.
	 * <p>
	 * API name: {@code query_source}
	 */
	public final KnnEvalQuerySource querySource() {
		return this.querySource;
	}

	/**
	 * If <code>true</code>, the request waits for the evaluation to complete. A
	 * large evaluation can run for minutes, and closing the connection, for example
	 * because of a client or proxy timeout, cancels it. If <code>false</code>, the
	 * request returns a task identifier, and stores the completed response for
	 * retrieval through the task management API.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
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

		if (this.allowExactBaseline != null) {
			generator.writeKey("allow_exact_baseline");
			generator.write(this.allowExactBaseline);

		}
		if (this.baseline != null) {
			generator.writeKey("baseline");
			this.baseline.serialize(generator, mapper);

		}
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("k");
		generator.write(this.k);

		if (ApiTypeHelper.isDefined(this.knnSettings)) {
			generator.writeKey("knn_settings");
			generator.writeStartArray();
			for (KnnEvalSettings item0 : this.knnSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("query_source");
		this.querySource.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnEvalRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<KnnEvalRequest> {
		@Nullable
		private Boolean allowExactBaseline;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private KnnEvalSettings baseline;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		private String field;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		private Integer k;

		private List<KnnEvalSettings> knnSettings;

		private KnnEvalQuerySource querySource;

		@Nullable
		private Boolean waitForCompletion;

		public Builder() {
		}
		private Builder(KnnEvalRequest instance) {
			this.allowExactBaseline = instance.allowExactBaseline;
			this.allowNoIndices = instance.allowNoIndices;
			this.baseline = instance.baseline;
			this.expandWildcards = instance.expandWildcards;
			this.field = instance.field;
			this.ignoreUnavailable = instance.ignoreUnavailable;
			this.index = instance.index;
			this.k = instance.k;
			this.knnSettings = instance.knnSettings;
			this.querySource = instance.querySource;
			this.waitForCompletion = instance.waitForCompletion;

		}
		/**
		 * If <code>true</code>, the <code>baseline</code> can be <code>exact</code>. An
		 * exact baseline compares every vector at full precision, and can severely slow
		 * down other searches.
		 * <p>
		 * API name: {@code allow_exact_baseline}
		 */
		public final Builder allowExactBaseline(@Nullable Boolean value) {
			this.allowExactBaseline = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * The settings of the search that the <code>knn_settings</code> entries are
		 * compared with. If not specified, it uses a <code>visit_percentage</code> of
		 * 20 and a <code>rescore_vector.oversample</code> of 100.
		 * <p>
		 * API name: {@code baseline}
		 */
		public final Builder baseline(@Nullable KnnEvalSettings value) {
			this.baseline = value;
			return this;
		}

		/**
		 * The settings of the search that the <code>knn_settings</code> entries are
		 * compared with. If not specified, it uses a <code>visit_percentage</code> of
		 * 20 and a <code>rescore_vector.oversample</code> of 100.
		 * <p>
		 * API name: {@code baseline}
		 */
		public final Builder baseline(Function<KnnEvalSettings.Builder, ObjectBuilder<KnnEvalSettings>> fn) {
			return this.baseline(fn.apply(new KnnEvalSettings.Builder()).build());
		}

		/**
		 * The type of index that wildcard patterns can match. It supports
		 * comma-separated values, such as <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * The type of index that wildcard patterns can match. It supports
		 * comma-separated values, such as <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * Required - The <code>dense_vector</code> field to evaluate.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to search.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to search.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Required - The number of nearest neighbors to compute the recall for, from 1
		 * to 1000.
		 * <p>
		 * API name: {@code k}
		 */
		public final Builder k(int value) {
			this.k = value;
			return this;
		}

		/**
		 * Required - The kNN search settings to evaluate, from 1 to 32 unique entries.
		 * <p>
		 * API name: {@code knn_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>knnSettings</code>.
		 */
		public final Builder knnSettings(List<KnnEvalSettings> list) {
			this.knnSettings = _listAddAll(this.knnSettings, list);
			return this;
		}

		/**
		 * Required - The kNN search settings to evaluate, from 1 to 32 unique entries.
		 * <p>
		 * API name: {@code knn_settings}
		 * <p>
		 * Adds one or more values to <code>knnSettings</code>.
		 */
		public final Builder knnSettings(KnnEvalSettings value, KnnEvalSettings... values) {
			this.knnSettings = _listAdd(this.knnSettings, value, values);
			return this;
		}

		/**
		 * Required - The kNN search settings to evaluate, from 1 to 32 unique entries.
		 * <p>
		 * API name: {@code knn_settings}
		 * <p>
		 * Adds a value to <code>knnSettings</code> using a builder lambda.
		 */
		public final Builder knnSettings(Function<KnnEvalSettings.Builder, ObjectBuilder<KnnEvalSettings>> fn) {
			return knnSettings(fn.apply(new KnnEvalSettings.Builder()).build());
		}

		/**
		 * Required - The source of the query vectors.
		 * <p>
		 * API name: {@code query_source}
		 */
		public final Builder querySource(KnnEvalQuerySource value) {
			this.querySource = value;
			return this;
		}

		/**
		 * Required - The source of the query vectors.
		 * <p>
		 * API name: {@code query_source}
		 */
		public final Builder querySource(Function<KnnEvalQuerySource.Builder, ObjectBuilder<KnnEvalQuerySource>> fn) {
			return this.querySource(fn.apply(new KnnEvalQuerySource.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request waits for the evaluation to complete. A
		 * large evaluation can run for minutes, and closing the connection, for example
		 * because of a client or proxy timeout, cancels it. If <code>false</code>, the
		 * request returns a task identifier, and stores the completed response for
		 * retrieval through the task management API.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnEvalRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnEvalRequest build() {
			_checkSingleUse();

			return new KnnEvalRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnEvalRequest}
	 */
	public static final JsonpDeserializer<KnnEvalRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnEvalRequest::setupKnnEvalRequestDeserializer);

	protected static void setupKnnEvalRequestDeserializer(ObjectDeserializer<KnnEvalRequest.Builder> op) {

		op.add(Builder::allowExactBaseline, JsonpDeserializer.booleanDeserializer(), "allow_exact_baseline");
		op.add(Builder::baseline, KnnEvalSettings._DESERIALIZER, "baseline");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::k, JsonpDeserializer.integerDeserializer(), "k");
		op.add(Builder::knnSettings, JsonpDeserializer.arrayDeserializer(KnnEvalSettings._DESERIALIZER),
				"knn_settings");
		op.add(Builder::querySource, KnnEvalQuerySource._DESERIALIZER, "query_source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code knn_eval}".
	 */
	public static final Endpoint<KnnEvalRequest, KnnEvalResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/knn_eval",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).filter(Objects::nonNull)
							.collect(Collectors.joining(",")), buf);
					buf.append("/_knn_eval");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).filter(Objects::nonNull)
							.collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards", request.expandWildcards.stream().map(v -> v.jsonValue())
							.filter(Objects::nonNull).collect(Collectors.joining(",")));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, KnnEvalResponse._DESERIALIZER);
}
