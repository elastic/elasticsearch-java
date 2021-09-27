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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.elasticsearch.indices.rollover.RolloverConditions;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
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

// typedef: cluster._types.ClusterStateBlockIndex
@JsonpDeserializable
public final class ClusterStateBlockIndex implements JsonpSerializable {
	@Nullable
	private final String description;

	@Nullable
	private final Boolean retryable;

	@Nullable
	private final List<String> levels;

	@Nullable
	private final List<String> aliases;

	@Nullable
	private final Long aliasesVersion;

	@Nullable
	private final Long version;

	@Nullable
	private final Long mappingVersion;

	@Nullable
	private final Long settingsVersion;

	@Nullable
	private final Long routingNumShards;

	@Nullable
	private final String state;

	@Nullable
	private final Map<String, IndexSettings> settings;

	@Nullable
	private final Map<String, List<String>> inSyncAllocations;

	@Nullable
	private final Map<String, Integer> primaryTerms;

	@Nullable
	private final Map<String, TypeMapping> mappings;

	@Nullable
	private final Map<String, RolloverConditions> rolloverInfo;

	@Nullable
	private final Map<String, JsonData> timestampRange;

	@Nullable
	private final Boolean system;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateBlockIndex(Builder builder) {

		this.description = builder.description;
		this.retryable = builder.retryable;
		this.levels = builder.levels;
		this.aliases = builder.aliases;
		this.aliasesVersion = builder.aliasesVersion;
		this.version = builder.version;
		this.mappingVersion = builder.mappingVersion;
		this.settingsVersion = builder.settingsVersion;
		this.routingNumShards = builder.routingNumShards;
		this.state = builder.state;
		this.settings = builder.settings;
		this.inSyncAllocations = builder.inSyncAllocations;
		this.primaryTerms = builder.primaryTerms;
		this.mappings = builder.mappings;
		this.rolloverInfo = builder.rolloverInfo;
		this.timestampRange = builder.timestampRange;
		this.system = builder.system;

	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code retryable}
	 */
	@Nullable
	public Boolean retryable() {
		return this.retryable;
	}

	/**
	 * API name: {@code levels}
	 */
	@Nullable
	public List<String> levels() {
		return this.levels;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public List<String> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code aliases_version}
	 */
	@Nullable
	public Long aliasesVersion() {
		return this.aliasesVersion;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code mapping_version}
	 */
	@Nullable
	public Long mappingVersion() {
		return this.mappingVersion;
	}

	/**
	 * API name: {@code settings_version}
	 */
	@Nullable
	public Long settingsVersion() {
		return this.settingsVersion;
	}

	/**
	 * API name: {@code routing_num_shards}
	 */
	@Nullable
	public Long routingNumShards() {
		return this.routingNumShards;
	}

	/**
	 * API name: {@code state}
	 */
	@Nullable
	public String state() {
		return this.state;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, IndexSettings> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code in_sync_allocations}
	 */
	@Nullable
	public Map<String, List<String>> inSyncAllocations() {
		return this.inSyncAllocations;
	}

	/**
	 * API name: {@code primary_terms}
	 */
	@Nullable
	public Map<String, Integer> primaryTerms() {
		return this.primaryTerms;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public Map<String, TypeMapping> mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code rollover_info}
	 */
	@Nullable
	public Map<String, RolloverConditions> rolloverInfo() {
		return this.rolloverInfo;
	}

	/**
	 * API name: {@code timestamp_range}
	 */
	@Nullable
	public Map<String, JsonData> timestampRange() {
		return this.timestampRange;
	}

	/**
	 * API name: {@code system}
	 */
	@Nullable
	public Boolean system() {
		return this.system;
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

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.retryable != null) {

			generator.writeKey("retryable");
			generator.write(this.retryable);

		}
		if (this.levels != null) {

			generator.writeKey("levels");
			generator.writeStartArray();
			for (String item0 : this.levels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartArray();
			for (String item0 : this.aliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.aliasesVersion != null) {

			generator.writeKey("aliases_version");
			generator.write(this.aliasesVersion);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.mappingVersion != null) {

			generator.writeKey("mapping_version");
			generator.write(this.mappingVersion);

		}
		if (this.settingsVersion != null) {

			generator.writeKey("settings_version");
			generator.write(this.settingsVersion);

		}
		if (this.routingNumShards != null) {

			generator.writeKey("routing_num_shards");
			generator.write(this.routingNumShards);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, IndexSettings> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.inSyncAllocations != null) {

			generator.writeKey("in_sync_allocations");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.inSyncAllocations.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (String item1 : item0.getValue()) {
					generator.write(item1);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.primaryTerms != null) {

			generator.writeKey("primary_terms");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.primaryTerms.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {

			generator.writeKey("mappings");
			generator.writeStartObject();
			for (Map.Entry<String, TypeMapping> item0 : this.mappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.rolloverInfo != null) {

			generator.writeKey("rollover_info");
			generator.writeStartObject();
			for (Map.Entry<String, RolloverConditions> item0 : this.rolloverInfo.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.timestampRange != null) {

			generator.writeKey("timestamp_range");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.timestampRange.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.system != null) {

			generator.writeKey("system");
			generator.write(this.system);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateBlockIndex}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateBlockIndex> {
		@Nullable
		private String description;

		@Nullable
		private Boolean retryable;

		@Nullable
		private List<String> levels;

		@Nullable
		private List<String> aliases;

		@Nullable
		private Long aliasesVersion;

		@Nullable
		private Long version;

		@Nullable
		private Long mappingVersion;

		@Nullable
		private Long settingsVersion;

		@Nullable
		private Long routingNumShards;

		@Nullable
		private String state;

		@Nullable
		private Map<String, IndexSettings> settings;

		@Nullable
		private Map<String, List<String>> inSyncAllocations;

		@Nullable
		private Map<String, Integer> primaryTerms;

		@Nullable
		private Map<String, TypeMapping> mappings;

		@Nullable
		private Map<String, RolloverConditions> rolloverInfo;

		@Nullable
		private Map<String, JsonData> timestampRange;

		@Nullable
		private Boolean system;

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code retryable}
		 */
		public Builder retryable(@Nullable Boolean value) {
			this.retryable = value;
			return this;
		}

		/**
		 * API name: {@code levels}
		 */
		public Builder levels(@Nullable List<String> value) {
			this.levels = value;
			return this;
		}

		/**
		 * API name: {@code levels}
		 */
		public Builder levels(String... value) {
			this.levels = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #levels(List)}, creating the list if needed.
		 */
		public Builder addLevels(String value) {
			if (this.levels == null) {
				this.levels = new ArrayList<>();
			}
			this.levels.add(value);
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable List<String> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(String... value) {
			this.aliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #aliases(List)}, creating the list if needed.
		 */
		public Builder addAliases(String value) {
			if (this.aliases == null) {
				this.aliases = new ArrayList<>();
			}
			this.aliases.add(value);
			return this;
		}

		/**
		 * API name: {@code aliases_version}
		 */
		public Builder aliasesVersion(@Nullable Long value) {
			this.aliasesVersion = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code mapping_version}
		 */
		public Builder mappingVersion(@Nullable Long value) {
			this.mappingVersion = value;
			return this;
		}

		/**
		 * API name: {@code settings_version}
		 */
		public Builder settingsVersion(@Nullable Long value) {
			this.settingsVersion = value;
			return this;
		}

		/**
		 * API name: {@code routing_num_shards}
		 */
		public Builder routingNumShards(@Nullable Long value) {
			this.routingNumShards = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, IndexSettings> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, IndexSettings value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #settings(Map)} to a singleton map.
		 */
		public Builder settings(String key, Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(Collections.singletonMap(key, fn.apply(new IndexSettings.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.putSettings(key, fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * API name: {@code in_sync_allocations}
		 */
		public Builder inSyncAllocations(@Nullable Map<String, List<String>> value) {
			this.inSyncAllocations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #inSyncAllocations(Map)}, creating the map if
		 * needed.
		 */
		public Builder putInSyncAllocations(String key, List<String> value) {
			if (this.inSyncAllocations == null) {
				this.inSyncAllocations = new HashMap<>();
			}
			this.inSyncAllocations.put(key, value);
			return this;
		}

		/**
		 * API name: {@code primary_terms}
		 */
		public Builder primaryTerms(@Nullable Map<String, Integer> value) {
			this.primaryTerms = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #primaryTerms(Map)}, creating the map if needed.
		 */
		public Builder putPrimaryTerms(String key, Integer value) {
			if (this.primaryTerms == null) {
				this.primaryTerms = new HashMap<>();
			}
			this.primaryTerms.put(key, value);
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable Map<String, TypeMapping> value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #mappings(Map)}, creating the map if needed.
		 */
		public Builder putMappings(String key, TypeMapping value) {
			if (this.mappings == null) {
				this.mappings = new HashMap<>();
			}
			this.mappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #mappings(Map)} to a singleton map.
		 */
		public Builder mappings(String key, Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(Collections.singletonMap(key, fn.apply(new TypeMapping.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #mappings(Map)}, creating the map if needed.
		 */
		public Builder putMappings(String key, Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.putMappings(key, fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code rollover_info}
		 */
		public Builder rolloverInfo(@Nullable Map<String, RolloverConditions> value) {
			this.rolloverInfo = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #rolloverInfo(Map)}, creating the map if needed.
		 */
		public Builder putRolloverInfo(String key, RolloverConditions value) {
			if (this.rolloverInfo == null) {
				this.rolloverInfo = new HashMap<>();
			}
			this.rolloverInfo.put(key, value);
			return this;
		}

		/**
		 * Set {@link #rolloverInfo(Map)} to a singleton map.
		 */
		public Builder rolloverInfo(String key,
				Function<RolloverConditions.Builder, ObjectBuilder<RolloverConditions>> fn) {
			return this.rolloverInfo(Collections.singletonMap(key, fn.apply(new RolloverConditions.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #rolloverInfo(Map)}, creating the map if needed.
		 */
		public Builder putRolloverInfo(String key,
				Function<RolloverConditions.Builder, ObjectBuilder<RolloverConditions>> fn) {
			return this.putRolloverInfo(key, fn.apply(new RolloverConditions.Builder()).build());
		}

		/**
		 * API name: {@code timestamp_range}
		 */
		public Builder timestampRange(@Nullable Map<String, JsonData> value) {
			this.timestampRange = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #timestampRange(Map)}, creating the map if needed.
		 */
		public Builder putTimestampRange(String key, JsonData value) {
			if (this.timestampRange == null) {
				this.timestampRange = new HashMap<>();
			}
			this.timestampRange.put(key, value);
			return this;
		}

		/**
		 * API name: {@code system}
		 */
		public Builder system(@Nullable Boolean value) {
			this.system = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterStateBlockIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateBlockIndex build() {

			return new ClusterStateBlockIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateBlockIndex}
	 */
	public static final JsonpDeserializer<ClusterStateBlockIndex> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStateBlockIndex::setupClusterStateBlockIndexDeserializer, Builder::build);

	protected static void setupClusterStateBlockIndexDeserializer(
			DelegatingDeserializer<ClusterStateBlockIndex.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::retryable, JsonpDeserializer.booleanDeserializer(), "retryable");
		op.add(Builder::levels, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "levels");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::aliasesVersion, JsonpDeserializer.longDeserializer(), "aliases_version");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::mappingVersion, JsonpDeserializer.longDeserializer(), "mapping_version");
		op.add(Builder::settingsVersion, JsonpDeserializer.longDeserializer(), "settings_version");
		op.add(Builder::routingNumShards, JsonpDeserializer.longDeserializer(), "routing_num_shards");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(IndexSettings._DESERIALIZER), "settings");
		op.add(Builder::inSyncAllocations,
				JsonpDeserializer.stringMapDeserializer(
						JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())),
				"in_sync_allocations");
		op.add(Builder::primaryTerms, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"primary_terms");
		op.add(Builder::mappings, JsonpDeserializer.stringMapDeserializer(TypeMapping._DESERIALIZER), "mappings");
		op.add(Builder::rolloverInfo, JsonpDeserializer.stringMapDeserializer(RolloverConditions._DESERIALIZER),
				"rollover_info");
		op.add(Builder::timestampRange, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"timestamp_range");
		op.add(Builder::system, JsonpDeserializer.booleanDeserializer(), "system");

	}

}
