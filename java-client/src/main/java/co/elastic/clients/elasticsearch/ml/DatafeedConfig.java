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

import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationContainer;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedConfig
public final class DatafeedConfig implements ToJsonp {
	@Nullable
	private final Map<String, AggregationContainer> aggregations;

	@Nullable
	private final Map<String, AggregationContainer> aggs;

	@Nullable
	private final ChunkingConfig chunkingConfig;

	@Nullable
	private final String datafeedId;

	@Nullable
	private final DelayedDataCheckConfig delayedDataCheckConfig;

	@Nullable
	private final String frequency;

	@Nullable
	private final List<String> indexes;

	private final List<String> indices;

	@Nullable
	private final DatafeedIndicesOptions indicesOptions;

	@Nullable
	private final String jobId;

	@Nullable
	private final Number maxEmptySearches;

	private final QueryContainer query;

	@Nullable
	private final String queryDelay;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Number scrollSize;

	// ---------------------------------------------------------------------------------------------

	protected DatafeedConfig(Builder builder) {

		this.aggregations = builder.aggregations;
		this.aggs = builder.aggs;
		this.chunkingConfig = builder.chunkingConfig;
		this.datafeedId = builder.datafeedId;
		this.delayedDataCheckConfig = builder.delayedDataCheckConfig;
		this.frequency = builder.frequency;
		this.indexes = builder.indexes;
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.indicesOptions = builder.indicesOptions;
		this.jobId = builder.jobId;
		this.maxEmptySearches = builder.maxEmptySearches;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.queryDelay = builder.queryDelay;
		this.runtimeMappings = builder.runtimeMappings;
		this.scriptFields = builder.scriptFields;
		this.scrollSize = builder.scrollSize;

	}

	/**
	 * If set, the datafeed performs aggregation searches. Support for aggregations
	 * is limited and should be used only with low cardinality data.
	 * <p>
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, AggregationContainer> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, AggregationContainer> aggs() {
		return this.aggs;
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
	public ChunkingConfig chunkingConfig() {
		return this.chunkingConfig;
	}

	/**
	 * A numerical character string that uniquely identifies the datafeed. This
	 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
	 * hyphens, and underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	@Nullable
	public String datafeedId() {
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
	public DelayedDataCheckConfig delayedDataCheckConfig() {
		return this.delayedDataCheckConfig;
	}

	/**
	 * The interval at which scheduled queries are made while the datafeed runs in
	 * real time. The default value is either the bucket span for short bucket
	 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
	 * For example: <code>150s</code>. When frequency is shorter than the bucket
	 * span, interim results for the last (partial) bucket are written then
	 * eventually overwritten by the full bucket results. If the datafeed uses
	 * aggregations, this value must be divisible by the interval of the date
	 * histogram aggregation.
	 * <p>
	 * API name: {@code frequency}
	 */
	@Nullable
	public String frequency() {
		return this.frequency;
	}

	/**
	 * API name: {@code indexes}
	 */
	@Nullable
	public List<String> indexes() {
		return this.indexes;
	}

	/**
	 * An array of index names. Wildcards are supported.
	 * <p>
	 * API name: {@code indices}
	 */
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * Specifies index expansion options that are used during search.
	 * <p>
	 * API name: {@code indices_options}
	 */
	@Nullable
	public DatafeedIndicesOptions indicesOptions() {
		return this.indicesOptions;
	}

	/**
	 * API name: {@code job_id}
	 */
	@Nullable
	public String jobId() {
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
	public Number maxEmptySearches() {
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
	public QueryContainer query() {
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
	public String queryDelay() {
		return this.queryDelay;
	}

	/**
	 * Specifies runtime fields for the datafeed search.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	@Nullable
	public Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Specifies scripts that evaluate custom expressions and returns script fields
	 * to the datafeed. The detector configuration objects in a job can contain
	 * functions that use these script fields.
	 * <p>
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
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
	public Number scrollSize() {
		return this.scrollSize;
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

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, AggregationContainer> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, AggregationContainer> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.chunkingConfig != null) {

			generator.writeKey("chunking_config");
			this.chunkingConfig.toJsonp(generator, mapper);

		}
		if (this.datafeedId != null) {

			generator.writeKey("datafeed_id");
			generator.write(this.datafeedId);

		}
		if (this.delayedDataCheckConfig != null) {

			generator.writeKey("delayed_data_check_config");
			this.delayedDataCheckConfig.toJsonp(generator, mapper);

		}
		if (this.frequency != null) {

			generator.writeKey("frequency");
			generator.write(this.frequency);

		}
		if (this.indexes != null) {

			generator.writeKey("indexes");
			generator.writeStartArray();
			for (String item0 : this.indexes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("indices");
		generator.writeStartArray();
		for (String item0 : this.indices) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.indicesOptions != null) {

			generator.writeKey("indices_options");
			this.indicesOptions.toJsonp(generator, mapper);

		}
		if (this.jobId != null) {

			generator.writeKey("job_id");
			generator.write(this.jobId);

		}
		if (this.maxEmptySearches != null) {

			generator.writeKey("max_empty_searches");
			generator.write(this.maxEmptySearches.doubleValue());

		}

		generator.writeKey("query");
		this.query.toJsonp(generator, mapper);

		if (this.queryDelay != null) {

			generator.writeKey("query_delay");
			generator.write(this.queryDelay);

		}
		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.scriptFields != null) {

			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.scrollSize != null) {

			generator.writeKey("scroll_size");
			generator.write(this.scrollSize.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedConfig}.
	 */
	public static class Builder implements ObjectBuilder<DatafeedConfig> {
		@Nullable
		private Map<String, AggregationContainer> aggregations;

		@Nullable
		private Map<String, AggregationContainer> aggs;

		@Nullable
		private ChunkingConfig chunkingConfig;

		@Nullable
		private String datafeedId;

		@Nullable
		private DelayedDataCheckConfig delayedDataCheckConfig;

		@Nullable
		private String frequency;

		@Nullable
		private List<String> indexes;

		private List<String> indices;

		@Nullable
		private DatafeedIndicesOptions indicesOptions;

		@Nullable
		private String jobId;

		@Nullable
		private Number maxEmptySearches;

		private QueryContainer query;

		@Nullable
		private String queryDelay;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Number scrollSize;

		/**
		 * If set, the datafeed performs aggregation searches. Support for aggregations
		 * is limited and should be used only with low cardinality data.
		 * <p>
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, AggregationContainer> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, AggregationContainer value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this
					.aggregations(Collections.singletonMap(key, fn.apply(new AggregationContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.putAggregations(key, fn.apply(new AggregationContainer.Builder()).build());
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, AggregationContainer> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, AggregationContainer value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new AggregationContainer.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key,
				Function<AggregationContainer.Builder, ObjectBuilder<AggregationContainer>> fn) {
			return this.putAggs(key, fn.apply(new AggregationContainer.Builder()).build());
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
		public Builder chunkingConfig(@Nullable ChunkingConfig value) {
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
		public Builder chunkingConfig(Function<ChunkingConfig.Builder, ObjectBuilder<ChunkingConfig>> fn) {
			return this.chunkingConfig(fn.apply(new ChunkingConfig.Builder()).build());
		}

		/**
		 * A numerical character string that uniquely identifies the datafeed. This
		 * identifier can contain lowercase alphanumeric characters (a-z and 0-9),
		 * hyphens, and underscores. It must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(@Nullable String value) {
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
		public Builder delayedDataCheckConfig(@Nullable DelayedDataCheckConfig value) {
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
		public Builder delayedDataCheckConfig(
				Function<DelayedDataCheckConfig.Builder, ObjectBuilder<DelayedDataCheckConfig>> fn) {
			return this.delayedDataCheckConfig(fn.apply(new DelayedDataCheckConfig.Builder()).build());
		}

		/**
		 * The interval at which scheduled queries are made while the datafeed runs in
		 * real time. The default value is either the bucket span for short bucket
		 * spans, or, for longer bucket spans, a sensible fraction of the bucket span.
		 * For example: <code>150s</code>. When frequency is shorter than the bucket
		 * span, interim results for the last (partial) bucket are written then
		 * eventually overwritten by the full bucket results. If the datafeed uses
		 * aggregations, this value must be divisible by the interval of the date
		 * histogram aggregation.
		 * <p>
		 * API name: {@code frequency}
		 */
		public Builder frequency(@Nullable String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * API name: {@code indexes}
		 */
		public Builder indexes(@Nullable List<String> value) {
			this.indexes = value;
			return this;
		}

		/**
		 * API name: {@code indexes}
		 */
		public Builder indexes(String... value) {
			this.indexes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexes(List)}, creating the list if needed.
		 */
		public Builder addIndexes(String value) {
			if (this.indexes == null) {
				this.indexes = new ArrayList<>();
			}
			this.indexes.add(value);
			return this;
		}

		/**
		 * An array of index names. Wildcards are supported.
		 * <p>
		 * API name: {@code indices}
		 */
		public Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * An array of index names. Wildcards are supported.
		 * <p>
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Specifies index expansion options that are used during search.
		 * <p>
		 * API name: {@code indices_options}
		 */
		public Builder indicesOptions(@Nullable DatafeedIndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * Specifies index expansion options that are used during search.
		 * <p>
		 * API name: {@code indices_options}
		 */
		public Builder indicesOptions(
				Function<DatafeedIndicesOptions.Builder, ObjectBuilder<DatafeedIndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new DatafeedIndicesOptions.Builder()).build());
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(@Nullable String value) {
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
		public Builder maxEmptySearches(@Nullable Number value) {
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
		public Builder query(QueryContainer value) {
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
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
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
		public Builder queryDelay(@Nullable String value) {
			this.queryDelay = value;
			return this;
		}

		/**
		 * Specifies runtime fields for the datafeed search.
		 * <p>
		 * API name: {@code runtime_mappings}
		 */
		public Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, RuntimeField value) {
			if (this.runtimeMappings == null) {
				this.runtimeMappings = new HashMap<>();
			}
			this.runtimeMappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Specifies scripts that evaluate custom expressions and returns script fields
		 * to the datafeed. The detector configuration objects in a job can contain
		 * functions that use these script fields.
		 * <p>
		 * API name: {@code script_fields}
		 */
		public Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, ScriptField value) {
			if (this.scriptFields == null) {
				this.scriptFields = new HashMap<>();
			}
			this.scriptFields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.putScriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * The size parameter that is used in Elasticsearch searches when the datafeed
		 * does not use aggregations. The maximum value is the value of
		 * <code>index.max_result_window</code>, which is 10,000 by default.
		 * <p>
		 * API name: {@code scroll_size}
		 */
		public Builder scrollSize(@Nullable Number value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * Builds a {@link DatafeedConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedConfig build() {

			return new DatafeedConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DatafeedConfig
	 */
	public static final JsonpDeserializer<DatafeedConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DatafeedConfig::setupDatafeedConfigDeserializer);

	protected static void setupDatafeedConfigDeserializer(DelegatingDeserializer<DatafeedConfig.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(AggregationContainer.DESERIALIZER),
				"aggregations");
		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(AggregationContainer.DESERIALIZER), "aggs");
		op.add(Builder::chunkingConfig, ChunkingConfig.DESERIALIZER, "chunking_config");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::delayedDataCheckConfig, DelayedDataCheckConfig.DESERIALIZER, "delayed_data_check_config");
		op.add(Builder::frequency, JsonpDeserializer.stringDeserializer(), "frequency");
		op.add(Builder::indexes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indexes");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indicesOptions, DatafeedIndicesOptions.DESERIALIZER, "indices_options");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxEmptySearches, JsonpDeserializer.numberDeserializer(), "max_empty_searches");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::queryDelay, JsonpDeserializer.stringDeserializer(), "query_delay");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField.DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField.DESERIALIZER),
				"script_fields");
		op.add(Builder::scrollSize, JsonpDeserializer.numberDeserializer(), "scroll_size");

	}

}
