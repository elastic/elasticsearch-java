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
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: ml._types.Datafeed
@JsonpDeserializable
public final class Datafeed implements JsonpSerializable {
	@Nullable
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final Map<String, Aggregation> aggs;

	@Nullable
	private final ChunkingConfig chunkingConfig;

	private final String datafeedId;

	@Nullable
	private final String frequency;

	private final List<String> indices;

	@Nullable
	private final List<String> indexes;

	private final String jobId;

	@Nullable
	private final Integer maxEmptySearches;

	private final Query query;

	@Nullable
	private final String queryDelay;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Integer scrollSize;

	private final DelayedDataCheckConfig delayedDataCheckConfig;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final DatafeedIndicesOptions indicesOptions;

	// ---------------------------------------------------------------------------------------------

	public Datafeed(Builder builder) {

		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.aggs = ModelTypeHelper.unmodifiable(builder.aggs);
		this.chunkingConfig = builder.chunkingConfig;
		this.datafeedId = Objects.requireNonNull(builder.datafeedId, "datafeed_id");
		this.frequency = builder.frequency;
		this.indices = ModelTypeHelper.unmodifiableNonNull(builder.indices, "indices");
		this.indexes = ModelTypeHelper.unmodifiable(builder.indexes);
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.maxEmptySearches = builder.maxEmptySearches;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.queryDelay = builder.queryDelay;
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.scrollSize = builder.scrollSize;
		this.delayedDataCheckConfig = Objects.requireNonNull(builder.delayedDataCheckConfig,
				"delayed_data_check_config");
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);
		this.indicesOptions = builder.indicesOptions;

	}

	public Datafeed(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code chunking_config}
	 */
	@Nullable
	public ChunkingConfig chunkingConfig() {
		return this.chunkingConfig;
	}

	/**
	 * API name: {@code datafeed_id}
	 */
	public String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code frequency}
	 */
	@Nullable
	public String frequency() {
		return this.frequency;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code indexes}
	 */
	@Nullable
	public List<String> indexes() {
		return this.indexes;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code max_empty_searches}
	 */
	@Nullable
	public Integer maxEmptySearches() {
		return this.maxEmptySearches;
	}

	/**
	 * API name: {@code query}
	 */
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code query_delay}
	 */
	@Nullable
	public String queryDelay() {
		return this.queryDelay;
	}

	/**
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code scroll_size}
	 */
	@Nullable
	public Integer scrollSize() {
		return this.scrollSize;
	}

	/**
	 * API name: {@code delayed_data_check_config}
	 */
	public DelayedDataCheckConfig delayedDataCheckConfig() {
		return this.delayedDataCheckConfig;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	@Nullable
	public Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * API name: {@code indices_options}
	 */
	@Nullable
	public DatafeedIndicesOptions indicesOptions() {
		return this.indicesOptions;
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

		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.chunkingConfig != null) {

			generator.writeKey("chunking_config");
			this.chunkingConfig.serialize(generator, mapper);

		}

		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		if (this.frequency != null) {

			generator.writeKey("frequency");
			generator.write(this.frequency);

		}

		generator.writeKey("indices");
		generator.writeStartArray();
		for (String item0 : this.indices) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.indexes != null) {

			generator.writeKey("indexes");
			generator.writeStartArray();
			for (String item0 : this.indexes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("job_id");
		generator.write(this.jobId);

		if (this.maxEmptySearches != null) {

			generator.writeKey("max_empty_searches");
			generator.write(this.maxEmptySearches);

		}

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.queryDelay != null) {

			generator.writeKey("query_delay");
			generator.write(this.queryDelay);

		}
		if (this.scriptFields != null) {

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

		generator.writeKey("delayed_data_check_config");
		this.delayedDataCheckConfig.serialize(generator, mapper);

		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.indicesOptions != null) {

			generator.writeKey("indices_options");
			this.indicesOptions.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Datafeed}.
	 */
	public static class Builder implements ObjectBuilder<Datafeed> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Map<String, Aggregation> aggs;

		@Nullable
		private ChunkingConfig chunkingConfig;

		private String datafeedId;

		@Nullable
		private String frequency;

		private List<String> indices;

		@Nullable
		private List<String> indexes;

		private String jobId;

		@Nullable
		private Integer maxEmptySearches;

		private Query query;

		@Nullable
		private String queryDelay;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private Integer scrollSize;

		private DelayedDataCheckConfig delayedDataCheckConfig;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private DatafeedIndicesOptions indicesOptions;

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Aggregation value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Aggregation value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code chunking_config}
		 */
		public Builder chunkingConfig(@Nullable ChunkingConfig value) {
			this.chunkingConfig = value;
			return this;
		}

		/**
		 * API name: {@code chunking_config}
		 */
		public Builder chunkingConfig(Function<ChunkingConfig.Builder, ObjectBuilder<ChunkingConfig>> fn) {
			return this.chunkingConfig(fn.apply(new ChunkingConfig.Builder()).build());
		}

		/**
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code frequency}
		 */
		public Builder frequency(@Nullable String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed. 4
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
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
		 * Add a value to {@link #indexes(List)}, creating the list if needed. 4
		 */
		public Builder addIndexes(String value) {
			if (this.indexes == null) {
				this.indexes = new ArrayList<>();
			}
			this.indexes.add(value);
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code max_empty_searches}
		 */
		public Builder maxEmptySearches(@Nullable Integer value) {
			this.maxEmptySearches = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code query_delay}
		 */
		public Builder queryDelay(@Nullable String value) {
			this.queryDelay = value;
			return this;
		}

		/**
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
		 * API name: {@code scroll_size}
		 */
		public Builder scrollSize(@Nullable Integer value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * API name: {@code delayed_data_check_config}
		 */
		public Builder delayedDataCheckConfig(DelayedDataCheckConfig value) {
			this.delayedDataCheckConfig = value;
			return this;
		}

		/**
		 * API name: {@code delayed_data_check_config}
		 */
		public Builder delayedDataCheckConfig(
				Function<DelayedDataCheckConfig.Builder, ObjectBuilder<DelayedDataCheckConfig>> fn) {
			return this.delayedDataCheckConfig(fn.apply(new DelayedDataCheckConfig.Builder()).build());
		}

		/**
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
		 * API name: {@code indices_options}
		 */
		public Builder indicesOptions(@Nullable DatafeedIndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public Builder indicesOptions(
				Function<DatafeedIndicesOptions.Builder, ObjectBuilder<DatafeedIndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new DatafeedIndicesOptions.Builder()).build());
		}

		/**
		 * Builds a {@link Datafeed}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Datafeed build() {

			return new Datafeed(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Datafeed}
	 */
	public static final JsonpDeserializer<Datafeed> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Datafeed::setupDatafeedDeserializer, Builder::build);

	protected static void setupDatafeedDeserializer(DelegatingDeserializer<Datafeed.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");
		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
		op.add(Builder::chunkingConfig, ChunkingConfig._DESERIALIZER, "chunking_config");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::frequency, JsonpDeserializer.stringDeserializer(), "frequency");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indexes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indexes");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxEmptySearches, JsonpDeserializer.integerDeserializer(), "max_empty_searches");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::queryDelay, JsonpDeserializer.stringDeserializer(), "query_delay");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::scrollSize, JsonpDeserializer.integerDeserializer(), "scroll_size");
		op.add(Builder::delayedDataCheckConfig, DelayedDataCheckConfig._DESERIALIZER, "delayed_data_check_config");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::indicesOptions, DatafeedIndicesOptions._DESERIALIZER, "indices_options");

	}

}
