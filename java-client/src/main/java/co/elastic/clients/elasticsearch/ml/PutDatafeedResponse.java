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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_datafeed.Response
@JsonpDeserializable
public class PutDatafeedResponse implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	private final ChunkingConfig chunkingConfig;

	@Nullable
	private final DelayedDataCheckConfig delayedDataCheckConfig;

	private final String datafeedId;

	private final String frequency;

	private final List<String> indices;

	private final String jobId;

	@Nullable
	private final DatafeedIndicesOptions indicesOptions;

	private final int maxEmptySearches;

	private final Query query;

	private final String queryDelay;

	private final Map<String, RuntimeField> runtimeMappings;

	private final Map<String, ScriptField> scriptFields;

	private final int scrollSize;

	// ---------------------------------------------------------------------------------------------

	private PutDatafeedResponse(Builder builder) {

		this.aggregations = ModelTypeHelper.unmodifiableRequired(builder.aggregations, this, "aggregations");
		this.chunkingConfig = ModelTypeHelper.requireNonNull(builder.chunkingConfig, this, "chunkingConfig");
		this.delayedDataCheckConfig = builder.delayedDataCheckConfig;
		this.datafeedId = ModelTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.frequency = ModelTypeHelper.requireNonNull(builder.frequency, this, "frequency");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.indicesOptions = builder.indicesOptions;
		this.maxEmptySearches = ModelTypeHelper.requireNonNull(builder.maxEmptySearches, this, "maxEmptySearches");
		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");
		this.queryDelay = ModelTypeHelper.requireNonNull(builder.queryDelay, this, "queryDelay");
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.scrollSize = ModelTypeHelper.requireNonNull(builder.scrollSize, this, "scrollSize");

	}

	public static PutDatafeedResponse of(Function<Builder, ObjectBuilder<PutDatafeedResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
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
	 * Required - API name: {@code frequency}
	 */
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
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code indices_options}
	 */
	@Nullable
	public final DatafeedIndicesOptions indicesOptions() {
		return this.indicesOptions;
	}

	/**
	 * Required - API name: {@code max_empty_searches}
	 */
	public final int maxEmptySearches() {
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
	public final String queryDelay() {
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

		if (ModelTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("chunking_config");
		this.chunkingConfig.serialize(generator, mapper);

		if (this.delayedDataCheckConfig != null) {
			generator.writeKey("delayed_data_check_config");
			this.delayedDataCheckConfig.serialize(generator, mapper);

		}
		generator.writeKey("datafeed_id");
		generator.write(this.datafeedId);

		generator.writeKey("frequency");
		generator.write(this.frequency);

		if (ModelTypeHelper.isDefined(this.indices)) {
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
		generator.writeKey("max_empty_searches");
		generator.write(this.maxEmptySearches);

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		generator.writeKey("query_delay");
		generator.write(this.queryDelay);

		if (ModelTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.scriptFields)) {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDatafeedResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutDatafeedResponse> {
		private Map<String, Aggregation> aggregations;

		private ChunkingConfig chunkingConfig;

		@Nullable
		private DelayedDataCheckConfig delayedDataCheckConfig;

		private String datafeedId;

		private String frequency;

		private List<String> indices;

		private String jobId;

		@Nullable
		private DatafeedIndicesOptions indicesOptions;

		private Integer maxEmptySearches;

		private Query query;

		private String queryDelay;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		private Integer scrollSize;

		/**
		 * Required - API name: {@code aggregations}
		 */
		public final Builder aggregations(Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		public final Builder aggregations(
				Function<MapBuilder<String, Aggregation, Aggregation.Builder>, ObjectBuilder<Map<String, Aggregation>>> fn) {
			return aggregations(fn.apply(new MapBuilder<>(Aggregation.Builder::new)).build());
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
		 * Required - API name: {@code frequency}
		 */
		public final Builder frequency(String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(String... value) {
			this.indices = Arrays.asList(value);
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
		public final Builder indicesOptions(@Nullable DatafeedIndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(
				Function<DatafeedIndicesOptions.Builder, ObjectBuilder<DatafeedIndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new DatafeedIndicesOptions.Builder()).build());
		}

		/**
		 * Required - API name: {@code max_empty_searches}
		 */
		public final Builder maxEmptySearches(int value) {
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
		public final Builder queryDelay(String value) {
			this.queryDelay = value;
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 */
		public final Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		public final Builder runtimeMappings(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtimeMappings(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
		}

		/**
		 * API name: {@code script_fields}
		 */
		public final Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		public final Builder scriptFields(
				Function<MapBuilder<String, ScriptField, ScriptField.Builder>, ObjectBuilder<Map<String, ScriptField>>> fn) {
			return scriptFields(fn.apply(new MapBuilder<>(ScriptField.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code scroll_size}
		 */
		public final Builder scrollSize(int value) {
			this.scrollSize = value;
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
			.lazy(Builder::new, PutDatafeedResponse::setupPutDatafeedResponseDeserializer, Builder::build);

	protected static void setupPutDatafeedResponseDeserializer(DelegatingDeserializer<PutDatafeedResponse.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");
		op.add(Builder::chunkingConfig, ChunkingConfig._DESERIALIZER, "chunking_config");
		op.add(Builder::delayedDataCheckConfig, DelayedDataCheckConfig._DESERIALIZER, "delayed_data_check_config");
		op.add(Builder::datafeedId, JsonpDeserializer.stringDeserializer(), "datafeed_id");
		op.add(Builder::frequency, JsonpDeserializer.stringDeserializer(), "frequency");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::indicesOptions, DatafeedIndicesOptions._DESERIALIZER, "indices_options");
		op.add(Builder::maxEmptySearches, JsonpDeserializer.integerDeserializer(), "max_empty_searches");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::queryDelay, JsonpDeserializer.stringDeserializer(), "query_delay");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::scrollSize, JsonpDeserializer.integerDeserializer(), "scroll_size");

	}

}
