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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.IndicesOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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

// typedef: ml.put_datafeed.Request

/**
 * Instantiates a datafeed. Datafeeds retrieve data from Elasticsearch for
 * analysis by an anomaly detection job. You can associate only one datafeed
 * with each anomaly detection job. The datafeed contains a query that runs at a
 * defined interval (<code>frequency</code>). If you are concerned about delayed
 * data, you can add a delay
 * (<code>query_delay') at each interval. When Elasticsearch security features are enabled, your datafeed remembers which roles the user who created it had at the time of creation and runs the query using those same roles. If you provide secondary authorization headers, those credentials are used instead. You must use Kibana, this API, or the create anomaly detection jobs API to create a datafeed. Do not add a datafeed directly to the </code>.ml-config<code>index. Do not give users</code>write<code>privileges on the</code>.ml-config`
 * index.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.put_datafeed.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDatafeedRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final ChunkingConfig chunkingConfig;

	private final String datafeedId;

	@Nullable
	private final DelayedDataCheckConfig delayedDataCheckConfig;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Time frequency;

	private final Map<String, List<String>> headers;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> indices;

	@Nullable
	private final IndicesOptions indicesOptions;

	@Nullable
	private final String jobId;

	@Nullable
	private final Integer maxEmptySearches;

	@Nullable
	private final Query query;

	@Nullable
	private final Time queryDelay;

	private final Map<String, RuntimeField> runtimeMappings;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Integer scrollSize;

	// ---------------------------------------------------------------------------------------------

	private PutDatafeedRequest(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.allowNoIndices = builder.allowNoIndices;
		this.chunkingConfig = builder.chunkingConfig;
		this.datafeedId = ApiTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.delayedDataCheckConfig = builder.delayedDataCheckConfig;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.frequency = builder.frequency;
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.indicesOptions = builder.indicesOptions;
		this.jobId = builder.jobId;
		this.maxEmptySearches = builder.maxEmptySearches;
		this.query = builder.query;
		this.queryDelay = builder.queryDelay;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.scriptFields = ApiTypeHelper.unmodifiable(builder.scriptFields);
		this.scrollSize = builder.scrollSize;

	}

	public static PutDatafeedRequest of(Function<Builder, ObjectBuilder<PutDatafeedRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If set, the datafeed performs aggregation searches. Support for aggregations
	 * is limited and should be used only with low cardinality data.
	 * <p>
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * If true, wildcard indices expressions that resolve into no concrete indices
	 * are ignored. This includes the <code>_all</code> string or when no indices
	 * are specified.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Datafeeds might be required to search over long time periods, for several
	 * months or years. This search is split into time chunks in order to ensure the
	 * load on Elasticsearch is managed. Chunking configuration controls how the
	 * size of these time chunks are calculated; it is an advanced configuration
	 * option.
	 * <p>
	 * API name: {@code chunking_config}
	 */
	@Nullable
	public final ChunkingConfig chunkingConfig() {
		return this.chunkingConfig;
	}

	/**
	 * Required - A numerical character string that uniquely identifies the
	 * datafeed. This identifier can contain lowercase alphanumeric characters (a-z
	 * and 0-9), hyphens, and underscores. It must start and end with alphanumeric
	 * characters.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Specifies whether the datafeed checks for missing data and the size of the
	 * window. The datafeed can optionally search over indices that have already
	 * been read in an effort to determine whether any data has subsequently been
	 * added to the index. If missing data is found, it is a good indication that
	 * the <code>query_delay</code> is set too low and the data is being indexed
	 * after the datafeed has passed that moment in time. This check runs only on
	 * real-time datafeeds.
	 * <p>
	 * API name: {@code delayed_data_check_config}
	 */
	@Nullable
	public final DelayedDataCheckConfig delayedDataCheckConfig() {
		return this.delayedDataCheckConfig;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * The interval at which scheduled queries are made while the datafeed runs in
	 * real time. The default value is either the bucket span for short bucket
	 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
	 * When <code>frequency</code> is shorter than the bucket span, interim results
	 * for the last (partial) bucket are written then eventually overwritten by the
	 * full bucket results. If the datafeed uses aggregations, this value must be
	 * divisible by the interval of the date histogram aggregation.
	 * <p>
	 * API name: {@code frequency}
	 */
	@Nullable
	public final Time frequency() {
		return this.frequency;
	}

	/**
	 * API name: {@code headers}
	 */
	public final Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * If true, concrete, expanded, or aliased indices are ignored when frozen.
	 * <p>
	 * API name: {@code ignore_throttled}
	 * 
	 * @deprecated 7.16.0
	 */
	@Deprecated
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * If true, unavailable indices (missing or closed) are ignored.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * An array of index names. Wildcards are supported. If any of the indices are
	 * in remote clusters, the machine learning nodes must have the
	 * <code>remote_cluster_client</code> role.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Specifies index expansion options that are used during search
	 * <p>
	 * API name: {@code indices_options}
	 */
	@Nullable
	public final IndicesOptions indicesOptions() {
		return this.indicesOptions;
	}

	/**
	 * Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	@Nullable
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * If a real-time datafeed has never seen any data (including during any initial
	 * training period), it automatically stops and closes the associated job after
	 * this many real-time searches return no documents. In other words, it stops
	 * after <code>frequency</code> times <code>max_empty_searches</code> of
	 * real-time operation. If not set, a datafeed with no end time that sees no
	 * data remains started until it is explicitly stopped. By default, it is not
	 * set.
	 * <p>
	 * API name: {@code max_empty_searches}
	 */
	@Nullable
	public final Integer maxEmptySearches() {
		return this.maxEmptySearches;
	}

	/**
	 * The Elasticsearch query domain-specific language (DSL). This value
	 * corresponds to the query object in an Elasticsearch search POST body. All the
	 * options that are supported by Elasticsearch can be used, as this object is
	 * passed verbatim to Elasticsearch.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * The number of seconds behind real time that data is queried. For example, if
	 * data from 10:04 a.m. might not be searchable in Elasticsearch until 10:06
	 * a.m., set this property to 120 seconds. The default value is randomly
	 * selected between <code>60s</code> and <code>120s</code>. This randomness
	 * improves the query performance when there are multiple jobs running on the
	 * same node.
	 * <p>
	 * API name: {@code query_delay}
	 */
	@Nullable
	public final Time queryDelay() {
		return this.queryDelay;
	}

	/**
	 * Specifies runtime fields for the datafeed search.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Specifies scripts that evaluate custom expressions and returns script fields
	 * to the datafeed. The detector configuration objects in a job can contain
	 * functions that use these script fields.
	 * <p>
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * The size parameter that is used in Elasticsearch searches when the datafeed
	 * does not use aggregations. The maximum value is the value of
	 * <code>index.max_result_window</code>, which is 10,000 by default.
	 * <p>
	 * API name: {@code scroll_size}
	 */
	@Nullable
	public final Integer scrollSize() {
		return this.scrollSize;
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

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.chunkingConfig != null) {
			generator.writeKey("chunking_config");
			this.chunkingConfig.serialize(generator, mapper);

		}
		if (this.delayedDataCheckConfig != null) {
			generator.writeKey("delayed_data_check_config");
			this.delayedDataCheckConfig.serialize(generator, mapper);

		}
		if (this.frequency != null) {
			generator.writeKey("frequency");
			this.frequency.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.indicesOptions != null) {
			generator.writeKey("indices_options");
			this.indicesOptions.serialize(generator, mapper);

		}
		if (this.jobId != null) {
			generator.writeKey("job_id");
			generator.write(this.jobId);

		}
		if (this.maxEmptySearches != null) {
			generator.writeKey("max_empty_searches");
			generator.write(this.maxEmptySearches);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.queryDelay != null) {
			generator.writeKey("query_delay");
			this.queryDelay.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.scriptFields)) {
			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.scrollSize != null) {
			generator.writeKey("scroll_size");
			generator.write(this.scrollSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDatafeedRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutDatafeedRequest> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private ChunkingConfig chunkingConfig;

		private String datafeedId;

		@Nullable
		private DelayedDataCheckConfig delayedDataCheckConfig;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Time frequency;

		@Nullable
		private Map<String, List<String>> headers;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> indices;

		@Nullable
		private IndicesOptions indicesOptions;

		@Nullable
		private String jobId;

		@Nullable
		private Integer maxEmptySearches;

		@Nullable
		private Query query;

		@Nullable
		private Time queryDelay;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Integer scrollSize;

		/**
		 * If set, the datafeed performs aggregation searches. Support for aggregations
		 * is limited and should be used only with low cardinality data.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, Aggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * If set, the datafeed performs aggregation searches. Support for aggregations
		 * is limited and should be used only with low cardinality data.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, Aggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * If set, the datafeed performs aggregation searches. Support for aggregations
		 * is limited and should be used only with low cardinality data.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * If true, wildcard indices expressions that resolve into no concrete indices
		 * are ignored. This includes the <code>_all</code> string or when no indices
		 * are specified.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Datafeeds might be required to search over long time periods, for several
		 * months or years. This search is split into time chunks in order to ensure the
		 * load on Elasticsearch is managed. Chunking configuration controls how the
		 * size of these time chunks are calculated; it is an advanced configuration
		 * option.
		 * <p>
		 * API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(@Nullable ChunkingConfig value) {
			this.chunkingConfig = value;
			return this;
		}

		/**
		 * Datafeeds might be required to search over long time periods, for several
		 * months or years. This search is split into time chunks in order to ensure the
		 * load on Elasticsearch is managed. Chunking configuration controls how the
		 * size of these time chunks are calculated; it is an advanced configuration
		 * option.
		 * <p>
		 * API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(Function<ChunkingConfig.Builder, ObjectBuilder<ChunkingConfig>> fn) {
			return this.chunkingConfig(fn.apply(new ChunkingConfig.Builder()).build());
		}

		/**
		 * Required - A numerical character string that uniquely identifies the
		 * datafeed. This identifier can contain lowercase alphanumeric characters (a-z
		 * and 0-9), hyphens, and underscores. It must start and end with alphanumeric
		 * characters.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Specifies whether the datafeed checks for missing data and the size of the
		 * window. The datafeed can optionally search over indices that have already
		 * been read in an effort to determine whether any data has subsequently been
		 * added to the index. If missing data is found, it is a good indication that
		 * the <code>query_delay</code> is set too low and the data is being indexed
		 * after the datafeed has passed that moment in time. This check runs only on
		 * real-time datafeeds.
		 * <p>
		 * API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(@Nullable DelayedDataCheckConfig value) {
			this.delayedDataCheckConfig = value;
			return this;
		}

		/**
		 * Specifies whether the datafeed checks for missing data and the size of the
		 * window. The datafeed can optionally search over indices that have already
		 * been read in an effort to determine whether any data has subsequently been
		 * added to the index. If missing data is found, it is a good indication that
		 * the <code>query_delay</code> is set too low and the data is being indexed
		 * after the datafeed has passed that moment in time. This check runs only on
		 * real-time datafeeds.
		 * <p>
		 * API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(
				Function<DelayedDataCheckConfig.Builder, ObjectBuilder<DelayedDataCheckConfig>> fn) {
			return this.delayedDataCheckConfig(fn.apply(new DelayedDataCheckConfig.Builder()).build());
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values.
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
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values.
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
		 * The interval at which scheduled queries are made while the datafeed runs in
		 * real time. The default value is either the bucket span for short bucket
		 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
		 * When <code>frequency</code> is shorter than the bucket span, interim results
		 * for the last (partial) bucket are written then eventually overwritten by the
		 * full bucket results. If the datafeed uses aggregations, this value must be
		 * divisible by the interval of the date histogram aggregation.
		 * <p>
		 * API name: {@code frequency}
		 */
		public final Builder frequency(@Nullable Time value) {
			this.frequency = value;
			return this;
		}

		/**
		 * The interval at which scheduled queries are made while the datafeed runs in
		 * real time. The default value is either the bucket span for short bucket
		 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
		 * When <code>frequency</code> is shorter than the bucket span, interim results
		 * for the last (partial) bucket are written then eventually overwritten by the
		 * full bucket results. If the datafeed uses aggregations, this value must be
		 * divisible by the interval of the date histogram aggregation.
		 * <p>
		 * API name: {@code frequency}
		 */
		public final Builder frequency(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.frequency(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final Builder headers(Map<String, List<String>> map) {
			this.headers = _mapPutAll(this.headers, map);
			return this;
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final Builder headers(String key, List<String> value) {
			this.headers = _mapPut(this.headers, key, value);
			return this;
		}

		/**
		 * If true, concrete, expanded, or aliased indices are ignored when frozen.
		 * <p>
		 * API name: {@code ignore_throttled}
		 * 
		 * @deprecated 7.16.0
		 */
		@Deprecated
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * If true, unavailable indices (missing or closed) are ignored.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * An array of index names. Wildcards are supported. If any of the indices are
		 * in remote clusters, the machine learning nodes must have the
		 * <code>remote_cluster_client</code> role.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * An array of index names. Wildcards are supported. If any of the indices are
		 * in remote clusters, the machine learning nodes must have the
		 * <code>remote_cluster_client</code> role.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Specifies index expansion options that are used during search
		 * <p>
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(@Nullable IndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * Specifies index expansion options that are used during search
		 * <p>
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(Function<IndicesOptions.Builder, ObjectBuilder<IndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new IndicesOptions.Builder()).build());
		}

		/**
		 * Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * If a real-time datafeed has never seen any data (including during any initial
		 * training period), it automatically stops and closes the associated job after
		 * this many real-time searches return no documents. In other words, it stops
		 * after <code>frequency</code> times <code>max_empty_searches</code> of
		 * real-time operation. If not set, a datafeed with no end time that sees no
		 * data remains started until it is explicitly stopped. By default, it is not
		 * set.
		 * <p>
		 * API name: {@code max_empty_searches}
		 */
		public final Builder maxEmptySearches(@Nullable Integer value) {
			this.maxEmptySearches = value;
			return this;
		}

		/**
		 * The Elasticsearch query domain-specific language (DSL). This value
		 * corresponds to the query object in an Elasticsearch search POST body. All the
		 * options that are supported by Elasticsearch can be used, as this object is
		 * passed verbatim to Elasticsearch.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * The Elasticsearch query domain-specific language (DSL). This value
		 * corresponds to the query object in an Elasticsearch search POST body. All the
		 * options that are supported by Elasticsearch can be used, as this object is
		 * passed verbatim to Elasticsearch.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The number of seconds behind real time that data is queried. For example, if
		 * data from 10:04 a.m. might not be searchable in Elasticsearch until 10:06
		 * a.m., set this property to 120 seconds. The default value is randomly
		 * selected between <code>60s</code> and <code>120s</code>. This randomness
		 * improves the query performance when there are multiple jobs running on the
		 * same node.
		 * <p>
		 * API name: {@code query_delay}
		 */
		public final Builder queryDelay(@Nullable Time value) {
			this.queryDelay = value;
			return this;
		}

		/**
		 * The number of seconds behind real time that data is queried. For example, if
		 * data from 10:04 a.m. might not be searchable in Elasticsearch until 10:06
		 * a.m., set this property to 120 seconds. The default value is randomly
		 * selected between <code>60s</code> and <code>120s</code>. This randomness
		 * improves the query performance when there are multiple jobs running on the
		 * same node.
		 * <p>
		 * API name: {@code query_delay}
		 */
		public final Builder queryDelay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.queryDelay(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Specifies runtime fields for the datafeed search.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * Specifies runtime fields for the datafeed search.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * Specifies runtime fields for the datafeed search.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Specifies scripts that evaluate custom expressions and returns script fields
		 * to the datafeed. The detector configuration objects in a job can contain
		 * functions that use these script fields.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(Map<String, ScriptField> map) {
			this.scriptFields = _mapPutAll(this.scriptFields, map);
			return this;
		}

		/**
		 * Specifies scripts that evaluate custom expressions and returns script fields
		 * to the datafeed. The detector configuration objects in a job can contain
		 * functions that use these script fields.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(String key, ScriptField value) {
			this.scriptFields = _mapPut(this.scriptFields, key, value);
			return this;
		}

		/**
		 * Specifies scripts that evaluate custom expressions and returns script fields
		 * to the datafeed. The detector configuration objects in a job can contain
		 * functions that use these script fields.
		 * <p>
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code> using a builder lambda.
		 */
		public final Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return scriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * The size parameter that is used in Elasticsearch searches when the datafeed
		 * does not use aggregations. The maximum value is the value of
		 * <code>index.max_result_window</code>, which is 10,000 by default.
		 * <p>
		 * API name: {@code scroll_size}
		 */
		public final Builder scrollSize(@Nullable Integer value) {
			this.scrollSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDatafeedRequest build() {
			_checkSingleUse();

			return new PutDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDatafeedRequest}
	 */
	public static final JsonpDeserializer<PutDatafeedRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutDatafeedRequest::setupPutDatafeedRequestDeserializer);

	protected static void setupPutDatafeedRequestDeserializer(ObjectDeserializer<PutDatafeedRequest.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");
		op.add(Builder::chunkingConfig, ChunkingConfig._DESERIALIZER, "chunking_config");
		op.add(Builder::delayedDataCheckConfig, DelayedDataCheckConfig._DESERIALIZER, "delayed_data_check_config");
		op.add(Builder::frequency, Time._DESERIALIZER, "frequency");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "indices",
				"indexes");
		op.add(Builder::indicesOptions, IndicesOptions._DESERIALIZER, "indices_options");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxEmptySearches, JsonpDeserializer.integerDeserializer(), "max_empty_searches");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::queryDelay, Time._DESERIALIZER, "query_delay");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::scrollSize, JsonpDeserializer.integerDeserializer(), "scroll_size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_datafeed}".
	 */
	public static final Endpoint<PutDatafeedRequest, PutDatafeedResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_datafeed",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					params.put("datafeedId", request.datafeedId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutDatafeedResponse._DESERIALIZER);
}
