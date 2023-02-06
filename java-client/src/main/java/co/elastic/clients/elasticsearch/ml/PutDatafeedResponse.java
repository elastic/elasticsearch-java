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

// typedef: ml.put_datafeed.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.put_datafeed.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDatafeedResponse implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final DatafeedAuthorization authorization;

	private final ChunkingConfig chunkingConfig;

	@Nullable
	private final DelayedDataCheckConfig delayedDataCheckConfig;

	private final String datafeedId;

	@Nullable
	private final Time frequency;

	private final List<String> indices;

	private final String jobId;

	@Nullable
	private final IndicesOptions indicesOptions;

	@Nullable
	private final Integer maxEmptySearches;

	private final Query query;

	private final Time queryDelay;

	private final Map<String, RuntimeField> runtimeMappings;

	private final Map<String, ScriptField> scriptFields;

	private final int scrollSize;

	// ---------------------------------------------------------------------------------------------

	private PutDatafeedResponse(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.authorization = builder.authorization;
		this.chunkingConfig = ApiTypeHelper.requireNonNull(builder.chunkingConfig, this, "chunkingConfig");
		this.delayedDataCheckConfig = builder.delayedDataCheckConfig;
		this.datafeedId = ApiTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.frequency = builder.frequency;
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.indicesOptions = builder.indicesOptions;
		this.maxEmptySearches = builder.maxEmptySearches;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.queryDelay = ApiTypeHelper.requireNonNull(builder.queryDelay, this, "queryDelay");
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.scriptFields = ApiTypeHelper.unmodifiable(builder.scriptFields);
		this.scrollSize = ApiTypeHelper.requireNonNull(builder.scrollSize, this, "scrollSize");

	}

	public static PutDatafeedResponse of(Function<Builder, ObjectBuilder<PutDatafeedResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code authorization}
	 */
	@Nullable
	public final DatafeedAuthorization authorization() {
		return this.authorization;
	}

	/**
	 * Required - API name: {@code chunking_config}
	 */
	public final ChunkingConfig chunkingConfig() {
		return this.chunkingConfig;
	}

	/**
	 * API name: {@code delayed_data_check_config}
	 */
	@Nullable
	public final DelayedDataCheckConfig delayedDataCheckConfig() {
		return this.delayedDataCheckConfig;
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
	public final Time frequency() {
		return this.frequency;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code indices_options}
	 */
	@Nullable
	public final IndicesOptions indicesOptions() {
		return this.indicesOptions;
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
	 * Required - API name: {@code query_delay}
	 */
	public final Time queryDelay() {
		return this.queryDelay;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * API name: {@code script_fields}
	 */
	public final Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * Required - API name: {@code scroll_size}
	 */
	public final int scrollSize() {
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
		if (this.authorization != null) {
			generator.writeKey("authorization");
			this.authorization.serialize(generator, mapper);

		}
		generator.writeKey("chunking_config");
		this.chunkingConfig.serialize(generator, mapper);

		if (this.delayedDataCheckConfig != null) {
			generator.writeKey("delayed_data_check_config");
			this.delayedDataCheckConfig.serialize(generator, mapper);

		}
		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		if (this.frequency != null) {
			generator.writeKey("frequency");
			this.frequency.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("job_id");
		generator.write(this.jobId);

		if (this.indicesOptions != null) {
			generator.writeKey("indices_options");
			this.indicesOptions.serialize(generator, mapper);

		}
		if (this.maxEmptySearches != null) {
			generator.writeKey("max_empty_searches");
			generator.write(this.maxEmptySearches);

		}
		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		generator.writeKey("query_delay");
		this.queryDelay.serialize(generator, mapper);

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
		generator.writeKey("scroll_size");
		generator.write(this.scrollSize);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDatafeedResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PutDatafeedResponse> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private DatafeedAuthorization authorization;

		private ChunkingConfig chunkingConfig;

		@Nullable
		private DelayedDataCheckConfig delayedDataCheckConfig;

		private String datafeedId;

		@Nullable
		private Time frequency;

		private List<String> indices;

		private String jobId;

		@Nullable
		private IndicesOptions indicesOptions;

		@Nullable
		private Integer maxEmptySearches;

		private Query query;

		private Time queryDelay;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		private Integer scrollSize;

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
		 * API name: {@code authorization}
		 */
		public final Builder authorization(@Nullable DatafeedAuthorization value) {
			this.authorization = value;
			return this;
		}

		/**
		 * API name: {@code authorization}
		 */
		public final Builder authorization(
				Function<DatafeedAuthorization.Builder, ObjectBuilder<DatafeedAuthorization>> fn) {
			return this.authorization(fn.apply(new DatafeedAuthorization.Builder()).build());
		}

		/**
		 * Required - API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(ChunkingConfig value) {
			this.chunkingConfig = value;
			return this;
		}

		/**
		 * Required - API name: {@code chunking_config}
		 */
		public final Builder chunkingConfig(Function<ChunkingConfig.Builder, ObjectBuilder<ChunkingConfig>> fn) {
			return this.chunkingConfig(fn.apply(new ChunkingConfig.Builder()).build());
		}

		/**
		 * API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(@Nullable DelayedDataCheckConfig value) {
			this.delayedDataCheckConfig = value;
			return this;
		}

		/**
		 * API name: {@code delayed_data_check_config}
		 */
		public final Builder delayedDataCheckConfig(
				Function<DelayedDataCheckConfig.Builder, ObjectBuilder<DelayedDataCheckConfig>> fn) {
			return this.delayedDataCheckConfig(fn.apply(new DelayedDataCheckConfig.Builder()).build());
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
		public final Builder frequency(@Nullable Time value) {
			this.frequency = value;
			return this;
		}

		/**
		 * API name: {@code frequency}
		 */
		public final Builder frequency(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.frequency(fn.apply(new Time.Builder()).build());
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
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
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
		 * Required - API name: {@code query_delay}
		 */
		public final Builder queryDelay(Time value) {
			this.queryDelay = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_delay}
		 */
		public final Builder queryDelay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.queryDelay(fn.apply(new Time.Builder()).build());
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
		 * Required - API name: {@code scroll_size}
		 */
		public final Builder scrollSize(int value) {
			this.scrollSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDatafeedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDatafeedResponse build() {
			_checkSingleUse();

			return new PutDatafeedResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDatafeedResponse}
	 */
	public static final JsonpDeserializer<PutDatafeedResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutDatafeedResponse::setupPutDatafeedResponseDeserializer);

	protected static void setupPutDatafeedResponseDeserializer(ObjectDeserializer<PutDatafeedResponse.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");
		op.add(Builder::authorization, DatafeedAuthorization._DESERIALIZER, "authorization");
		op.add(Builder::chunkingConfig, ChunkingConfig._DESERIALIZER, "chunking_config");
		op.add(Builder::delayedDataCheckConfig, DelayedDataCheckConfig._DESERIALIZER, "delayed_data_check_config");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::frequency, Time._DESERIALIZER, "frequency");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::indicesOptions, IndicesOptions._DESERIALIZER, "indices_options");
		op.add(Builder::maxEmptySearches, JsonpDeserializer.integerDeserializer(), "max_empty_searches");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::queryDelay, Time._DESERIALIZER, "query_delay");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::scrollSize, JsonpDeserializer.integerDeserializer(), "scroll_size");

	}

}
