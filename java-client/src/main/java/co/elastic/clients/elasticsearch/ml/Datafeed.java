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
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
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

// typedef: ml._types.Datafeed

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Datafeed">API
 *      specification</a>
 */
@JsonpDeserializable
public class Datafeed implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final ChunkingConfig chunkingConfig;

	private final String datafeedId;

	@Nullable
	private final String frequency;

	private final List<String> indices;

	private final List<String> indexes;

	private final String jobId;

	@Nullable
	private final Integer maxEmptySearches;

	private final Query query;

	@Nullable
	private final String queryDelay;

	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final Integer scrollSize;

	private final DelayedDataCheckConfig delayedDataCheckConfig;

	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final IndicesOptions indicesOptions;

	// ---------------------------------------------------------------------------------------------

	private Datafeed(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.chunkingConfig = builder.chunkingConfig;
		this.datafeedId = ApiTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.frequency = builder.frequency;
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.indexes = ApiTypeHelper.unmodifiable(builder.indexes);
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.maxEmptySearches = builder.maxEmptySearches;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.queryDelay = builder.queryDelay;
		this.scriptFields = ApiTypeHelper.unmodifiable(builder.scriptFields);
		this.scrollSize = builder.scrollSize;
		this.delayedDataCheckConfig = ApiTypeHelper.requireNonNull(builder.delayedDataCheckConfig, this,
				"delayedDataCheckConfig");
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.indicesOptions = builder.indicesOptions;

	}

	public static Datafeed of(Function<Builder, ObjectBuilder<Datafeed>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code chunking_config}
	 */
	@Nullable
	public final ChunkingConfig chunkingConfig() {
		return this.chunkingConfig;
	}

	/**
	 * Required - API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code frequency}
	 */
	@Nullable
	public final String frequency() {
		return this.frequency;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code indexes}
	 */
	public final List<String> indexes() {
		return this.indexes;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code max_empty_searches}
	 */
	@Nullable
	public final Integer maxEmptySearches() {
		return this.maxEmptySearches;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final Query query() {
		return this.query;
	}

	/**
	 * API name: {@code query_delay}
	 */
	@Nullable
	public final String queryDelay() {
		return this.queryDelay;
	}

	/**
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code scroll_size}
	 */
	@Nullable
	public final Integer scrollSize() {
		return this.scrollSize;
	}

	/**
	 * Required - API name: {@code delayed_data_check_config}
	 */
	public final DelayedDataCheckConfig delayedDataCheckConfig() {
		return this.delayedDataCheckConfig;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * API name: {@code indices_options}
	 */
	@Nullable
	public final IndicesOptions indicesOptions() {
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
		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		if (this.frequency != null) {
			generator.writeKey("frequency");
			generator.write(this.frequency);

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indexes)) {
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
		generator.writeKey("delayed_data_check_config");
		this.delayedDataCheckConfig.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Datafeed> {
		@Nullable
		private Map<String, Aggregation> aggregations;

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
		private IndicesOptions indicesOptions;

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, Aggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, Aggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(@Nullable ChunkingConfig value) {
			this.chunkingConfig = value;
			return this;
		}

		/**
		 * API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(Function<ChunkingConfig.Builder, ObjectBuilder<ChunkingConfig>> fn) {
			return this.chunkingConfig(fn.apply(new ChunkingConfig.Builder()).build());
		}

		/**
		 * Required - API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code frequency}
		 */
		public final Builder frequency(@Nullable String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
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
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code max_empty_searches}
		 */
		public final Builder maxEmptySearches(@Nullable Integer value) {
			this.maxEmptySearches = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code query_delay}
		 */
		public final Builder queryDelay(@Nullable String value) {
			this.queryDelay = value;
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(Map<String, ScriptField> map) {
			this.scriptFields = _mapPutAll(this.scriptFields, map);
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code>.
		 */
		public final Builder scriptFields(String key, ScriptField value) {
			this.scriptFields = _mapPut(this.scriptFields, key, value);
			return this;
		}

		/**
		 * API name: {@code script_fields}
		 * <p>
		 * Adds an entry to <code>scriptFields</code> using a builder lambda.
		 */
		public final Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return scriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * API name: {@code scroll_size}
		 */
		public final Builder scrollSize(@Nullable Integer value) {
			this.scrollSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(DelayedDataCheckConfig value) {
			this.delayedDataCheckConfig = value;
			return this;
		}

		/**
		 * Required - API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(
				Function<DelayedDataCheckConfig.Builder, ObjectBuilder<DelayedDataCheckConfig>> fn) {
			return this.delayedDataCheckConfig(fn.apply(new DelayedDataCheckConfig.Builder()).build());
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(@Nullable IndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(Function<IndicesOptions.Builder, ObjectBuilder<IndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new IndicesOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Datafeed}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Datafeed build() {
			_checkSingleUse();

			return new Datafeed(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Datafeed}
	 */
	public static final JsonpDeserializer<Datafeed> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Datafeed::setupDatafeedDeserializer);

	protected static void setupDatafeedDeserializer(ObjectDeserializer<Datafeed.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
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
		op.add(Builder::indicesOptions, IndicesOptions._DESERIALIZER, "indices_options");

	}

}
