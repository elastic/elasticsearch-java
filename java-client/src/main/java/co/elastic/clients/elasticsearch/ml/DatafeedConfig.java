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

import co.elastic.clients.elasticsearch._types.IndicesOptions;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DatafeedConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatafeedConfig implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final ChunkingConfig chunkingConfig;

	@Nullable
	private final String datafeedId;

	@Nullable
	private final DelayedDataCheckConfig delayedDataCheckConfig;

	@Nullable
	private final Time frequency;

	private final List<String> indexes;

	private final List<String> indices;

	@Nullable
	private final IndicesOptions indicesOptions;

	@Nullable
	private final String jobId;

	@Nullable
	private final Integer maxEmptySearches;

	private final Query query;

	@Nullable
	private final Time queryDelay;

	private final Map<String, List<RuntimeField>> runtimeMappings;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Integer scrollSize;

	// ---------------------------------------------------------------------------------------------

	private DatafeedConfig(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.chunkingConfig = builder.chunkingConfig;
		this.datafeedId = builder.datafeedId;
		this.delayedDataCheckConfig = builder.delayedDataCheckConfig;
		this.frequency = builder.frequency;
		this.indexes = ApiTypeHelper.unmodifiable(builder.indexes);
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.indicesOptions = builder.indicesOptions;
		this.jobId = builder.jobId;
		this.maxEmptySearches = builder.maxEmptySearches;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.queryDelay = builder.queryDelay;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.scriptFields = ApiTypeHelper.unmodifiable(builder.scriptFields);
		this.scrollSize = builder.scrollSize;

	}

	public static DatafeedConfig of(Function<Builder, ObjectBuilder<DatafeedConfig>> fn) {
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
	 * Datafeeds might be required to search over long time periods, for several
	 * months or years. This search is split into time chunks in order to ensure the
	 * load on Elasticsearch is managed. Chunking configuration controls how the
	 * size of these time chunks are calculated and is an advanced configuration
	 * option.
	 * <p>
	 * API name: {@code chunking_config}
	 */
	@Nullable
	public final ChunkingConfig chunkingConfig() {
		return this.chunkingConfig;
	}

	/**
	 * A numerical character string that uniquely identifies the datafeed. This
	 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
	 * hyphens, and underscores. It must start and end with alphanumeric characters.
	 * The default value is the job identifier.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Specifies whether the datafeed checks for missing data and the size of the
	 * window. The datafeed can optionally search over indices that have already
	 * been read in an effort to determine whether any data has subsequently been
	 * added to the index. If missing data is found, it is a good indication that
	 * the <code>query_delay</code> option is set too low and the data is being
	 * indexed after the datafeed has passed that moment in time. This check runs
	 * only on real-time datafeeds.
	 * <p>
	 * API name: {@code delayed_data_check_config}
	 */
	@Nullable
	public final DelayedDataCheckConfig delayedDataCheckConfig() {
		return this.delayedDataCheckConfig;
	}

	/**
	 * The interval at which scheduled queries are made while the datafeed runs in
	 * real time. The default value is either the bucket span for short bucket
	 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
	 * For example: <code>150s</code>. When <code>frequency</code> is shorter than
	 * the bucket span, interim results for the last (partial) bucket are written
	 * then eventually overwritten by the full bucket results. If the datafeed uses
	 * aggregations, this value must be divisible by the interval of the date
	 * histogram aggregation.
	 * <p>
	 * API name: {@code frequency}
	 */
	@Nullable
	public final Time frequency() {
		return this.frequency;
	}

	/**
	 * API name: {@code indexes}
	 */
	public final List<String> indexes() {
		return this.indexes;
	}

	/**
	 * Required - An array of index names. Wildcards are supported. If any indices
	 * are in remote clusters, the machine learning nodes must have the
	 * <code>remote_cluster_client</code> role.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Specifies index expansion options that are used during search.
	 * <p>
	 * API name: {@code indices_options}
	 */
	@Nullable
	public final IndicesOptions indicesOptions() {
		return this.indicesOptions;
	}

	/**
	 * API name: {@code job_id}
	 */
	@Nullable
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * If a real-time datafeed has never seen any data (including during any initial
	 * training period) then it will automatically stop itself and close its
	 * associated job after this many real-time searches that return no documents.
	 * In other words, it will stop after <code>frequency</code> times
	 * <code>max_empty_searches</code> of real-time operation. If not set then a
	 * datafeed with no end time that sees no data will remain started until it is
	 * explicitly stopped.
	 * <p>
	 * API name: {@code max_empty_searches}
	 */
	@Nullable
	public final Integer maxEmptySearches() {
		return this.maxEmptySearches;
	}

	/**
	 * Required - The Elasticsearch query domain-specific language (DSL). This value
	 * corresponds to the query object in an Elasticsearch search POST body. All the
	 * options that are supported by Elasticsearch can be used, as this object is
	 * passed verbatim to Elasticsearch.
	 * <p>
	 * API name: {@code query}
	 */
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
	public final Map<String, List<RuntimeField>> runtimeMappings() {
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
		if (this.datafeedId != null) {
			generator.writeKey("datafeed_id");
			generator.write(this.datafeedId);

		}
		if (this.delayedDataCheckConfig != null) {
			generator.writeKey("delayed_data_check_config");
			this.delayedDataCheckConfig.serialize(generator, mapper);

		}
		if (this.frequency != null) {
			generator.writeKey("frequency");
			this.frequency.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indexes)) {
			generator.writeKey("indexes");
			generator.writeStartArray();
			for (String item0 : this.indexes) {
				generator.write(item0);

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
		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.queryDelay != null) {
			generator.writeKey("query_delay");
			this.queryDelay.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, List<RuntimeField>> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (RuntimeField item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DatafeedConfig> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private ChunkingConfig chunkingConfig;

		@Nullable
		private String datafeedId;

		@Nullable
		private DelayedDataCheckConfig delayedDataCheckConfig;

		@Nullable
		private Time frequency;

		@Nullable
		private List<String> indexes;

		private List<String> indices;

		@Nullable
		private IndicesOptions indicesOptions;

		@Nullable
		private String jobId;

		@Nullable
		private Integer maxEmptySearches;

		private Query query;

		@Nullable
		private Time queryDelay;

		@Nullable
		private Map<String, List<RuntimeField>> runtimeMappings;

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
		 * Datafeeds might be required to search over long time periods, for several
		 * months or years. This search is split into time chunks in order to ensure the
		 * load on Elasticsearch is managed. Chunking configuration controls how the
		 * size of these time chunks are calculated and is an advanced configuration
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
		 * size of these time chunks are calculated and is an advanced configuration
		 * option.
		 * <p>
		 * API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(Function<ChunkingConfig.Builder, ObjectBuilder<ChunkingConfig>> fn) {
			return this.chunkingConfig(fn.apply(new ChunkingConfig.Builder()).build());
		}

		/**
		 * A numerical character string that uniquely identifies the datafeed. This
		 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
		 * hyphens, and underscores. It must start and end with alphanumeric characters.
		 * The default value is the job identifier.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(@Nullable String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Specifies whether the datafeed checks for missing data and the size of the
		 * window. The datafeed can optionally search over indices that have already
		 * been read in an effort to determine whether any data has subsequently been
		 * added to the index. If missing data is found, it is a good indication that
		 * the <code>query_delay</code> option is set too low and the data is being
		 * indexed after the datafeed has passed that moment in time. This check runs
		 * only on real-time datafeeds.
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
		 * the <code>query_delay</code> option is set too low and the data is being
		 * indexed after the datafeed has passed that moment in time. This check runs
		 * only on real-time datafeeds.
		 * <p>
		 * API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(
				Function<DelayedDataCheckConfig.Builder, ObjectBuilder<DelayedDataCheckConfig>> fn) {
			return this.delayedDataCheckConfig(fn.apply(new DelayedDataCheckConfig.Builder()).build());
		}

		/**
		 * The interval at which scheduled queries are made while the datafeed runs in
		 * real time. The default value is either the bucket span for short bucket
		 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
		 * For example: <code>150s</code>. When <code>frequency</code> is shorter than
		 * the bucket span, interim results for the last (partial) bucket are written
		 * then eventually overwritten by the full bucket results. If the datafeed uses
		 * aggregations, this value must be divisible by the interval of the date
		 * histogram aggregation.
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
		 * For example: <code>150s</code>. When <code>frequency</code> is shorter than
		 * the bucket span, interim results for the last (partial) bucket are written
		 * then eventually overwritten by the full bucket results. If the datafeed uses
		 * aggregations, this value must be divisible by the interval of the date
		 * histogram aggregation.
		 * <p>
		 * API name: {@code frequency}
		 */
		public final Builder frequency(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.frequency(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code indexes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexes</code>.
		 */
		public final Builder indexes(List<String> list) {
			this.indexes = _listAddAll(this.indexes, list);
			return this;
		}

		/**
		 * API name: {@code indexes}
		 * <p>
		 * Adds one or more values to <code>indexes</code>.
		 */
		public final Builder indexes(String value, String... values) {
			this.indexes = _listAdd(this.indexes, value, values);
			return this;
		}

		/**
		 * Required - An array of index names. Wildcards are supported. If any indices
		 * are in remote clusters, the machine learning nodes must have the
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
		 * Required - An array of index names. Wildcards are supported. If any indices
		 * are in remote clusters, the machine learning nodes must have the
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
		 * Specifies index expansion options that are used during search.
		 * <p>
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(@Nullable IndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * Specifies index expansion options that are used during search.
		 * <p>
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(Function<IndicesOptions.Builder, ObjectBuilder<IndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new IndicesOptions.Builder()).build());
		}

		/**
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * If a real-time datafeed has never seen any data (including during any initial
		 * training period) then it will automatically stop itself and close its
		 * associated job after this many real-time searches that return no documents.
		 * In other words, it will stop after <code>frequency</code> times
		 * <code>max_empty_searches</code> of real-time operation. If not set then a
		 * datafeed with no end time that sees no data will remain started until it is
		 * explicitly stopped.
		 * <p>
		 * API name: {@code max_empty_searches}
		 */
		public final Builder maxEmptySearches(@Nullable Integer value) {
			this.maxEmptySearches = value;
			return this;
		}

		/**
		 * Required - The Elasticsearch query domain-specific language (DSL). This value
		 * corresponds to the query object in an Elasticsearch search POST body. All the
		 * options that are supported by Elasticsearch can be used, as this object is
		 * passed verbatim to Elasticsearch.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - The Elasticsearch query domain-specific language (DSL). This value
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
		public final Builder runtimeMappings(Map<String, List<RuntimeField>> map) {
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
		public final Builder runtimeMappings(String key, List<RuntimeField> value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
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
		 * Builds a {@link DatafeedConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedConfig build() {
			_checkSingleUse();

			return new DatafeedConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedConfig}
	 */
	public static final JsonpDeserializer<DatafeedConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DatafeedConfig::setupDatafeedConfigDeserializer);

	protected static void setupDatafeedConfigDeserializer(ObjectDeserializer<DatafeedConfig.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::chunkingConfig, ChunkingConfig._DESERIALIZER, "chunking_config");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::delayedDataCheckConfig, DelayedDataCheckConfig._DESERIALIZER, "delayed_data_check_config");
		op.add(Builder::frequency, Time._DESERIALIZER, "frequency");
		op.add(Builder::indexes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indexes");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indicesOptions, IndicesOptions._DESERIALIZER, "indices_options");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxEmptySearches, JsonpDeserializer.integerDeserializer(), "max_empty_searches");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::queryDelay, Time._DESERIALIZER, "query_delay");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(RuntimeField._DESERIALIZER)), "runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::scrollSize, JsonpDeserializer.integerDeserializer(), "scroll_size");

	}

}
