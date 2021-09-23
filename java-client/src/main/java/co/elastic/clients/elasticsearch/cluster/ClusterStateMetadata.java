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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateMetadata
public final class ClusterStateMetadata implements JsonpSerializable {
	private final String clusterUuid;

	private final Boolean clusterUuidCommitted;

	private final ClusterStateMetadataTemplate templates;

	@Nullable
	private final Map<String, ClusterStateBlockIndex> indices;

	private final ClusterStateMetadataIndexGraveyard indexGraveyard;

	private final ClusterStateMetadataClusterCoordination clusterCoordination;

	@Nullable
	private final ClusterStateIngest ingest;

	@Nullable
	private final Map<String, String> repositories;

	@Nullable
	private final Map<String, JsonData> componentTemplate;

	@Nullable
	private final Map<String, JsonData> indexTemplate;

	@Nullable
	private final ClusterStateIndexLifecycle indexLifecycle;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateMetadata(Builder builder) {

		this.clusterUuid = Objects.requireNonNull(builder.clusterUuid, "cluster_uuid");
		this.clusterUuidCommitted = Objects.requireNonNull(builder.clusterUuidCommitted, "cluster_uuid_committed");
		this.templates = Objects.requireNonNull(builder.templates, "templates");
		this.indices = builder.indices;
		this.indexGraveyard = Objects.requireNonNull(builder.indexGraveyard, "index-graveyard");
		this.clusterCoordination = Objects.requireNonNull(builder.clusterCoordination, "cluster_coordination");
		this.ingest = builder.ingest;
		this.repositories = builder.repositories;
		this.componentTemplate = builder.componentTemplate;
		this.indexTemplate = builder.indexTemplate;
		this.indexLifecycle = builder.indexLifecycle;

	}

	/**
	 * API name: {@code cluster_uuid}
	 */
	public String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * API name: {@code cluster_uuid_committed}
	 */
	public Boolean clusterUuidCommitted() {
		return this.clusterUuidCommitted;
	}

	/**
	 * API name: {@code templates}
	 */
	public ClusterStateMetadataTemplate templates() {
		return this.templates;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public Map<String, ClusterStateBlockIndex> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code index-graveyard}
	 */
	public ClusterStateMetadataIndexGraveyard indexGraveyard() {
		return this.indexGraveyard;
	}

	/**
	 * API name: {@code cluster_coordination}
	 */
	public ClusterStateMetadataClusterCoordination clusterCoordination() {
		return this.clusterCoordination;
	}

	/**
	 * API name: {@code ingest}
	 */
	@Nullable
	public ClusterStateIngest ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code repositories}
	 */
	@Nullable
	public Map<String, String> repositories() {
		return this.repositories;
	}

	/**
	 * API name: {@code component_template}
	 */
	@Nullable
	public Map<String, JsonData> componentTemplate() {
		return this.componentTemplate;
	}

	/**
	 * API name: {@code index_template}
	 */
	@Nullable
	public Map<String, JsonData> indexTemplate() {
		return this.indexTemplate;
	}

	/**
	 * API name: {@code index_lifecycle}
	 */
	@Nullable
	public ClusterStateIndexLifecycle indexLifecycle() {
		return this.indexLifecycle;
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

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		generator.writeKey("cluster_uuid_committed");
		generator.write(this.clusterUuidCommitted);

		generator.writeKey("templates");
		this.templates.serialize(generator, mapper);

		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, ClusterStateBlockIndex> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("index-graveyard");
		this.indexGraveyard.serialize(generator, mapper);

		generator.writeKey("cluster_coordination");
		this.clusterCoordination.serialize(generator, mapper);

		if (this.ingest != null) {

			generator.writeKey("ingest");
			this.ingest.serialize(generator, mapper);

		}
		if (this.repositories != null) {

			generator.writeKey("repositories");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.repositories.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.componentTemplate != null) {

			generator.writeKey("component_template");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.componentTemplate.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.indexTemplate != null) {

			generator.writeKey("index_template");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.indexTemplate.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.indexLifecycle != null) {

			generator.writeKey("index_lifecycle");
			this.indexLifecycle.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateMetadata}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateMetadata> {
		private String clusterUuid;

		private Boolean clusterUuidCommitted;

		private ClusterStateMetadataTemplate templates;

		@Nullable
		private Map<String, ClusterStateBlockIndex> indices;

		private ClusterStateMetadataIndexGraveyard indexGraveyard;

		private ClusterStateMetadataClusterCoordination clusterCoordination;

		@Nullable
		private ClusterStateIngest ingest;

		@Nullable
		private Map<String, String> repositories;

		@Nullable
		private Map<String, JsonData> componentTemplate;

		@Nullable
		private Map<String, JsonData> indexTemplate;

		@Nullable
		private ClusterStateIndexLifecycle indexLifecycle;

		/**
		 * API name: {@code cluster_uuid}
		 */
		public Builder clusterUuid(String value) {
			this.clusterUuid = value;
			return this;
		}

		/**
		 * API name: {@code cluster_uuid_committed}
		 */
		public Builder clusterUuidCommitted(Boolean value) {
			this.clusterUuidCommitted = value;
			return this;
		}

		/**
		 * API name: {@code templates}
		 */
		public Builder templates(ClusterStateMetadataTemplate value) {
			this.templates = value;
			return this;
		}

		/**
		 * API name: {@code templates}
		 */
		public Builder templates(
				Function<ClusterStateMetadataTemplate.Builder, ObjectBuilder<ClusterStateMetadataTemplate>> fn) {
			return this.templates(fn.apply(new ClusterStateMetadataTemplate.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable Map<String, ClusterStateBlockIndex> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, ClusterStateBlockIndex value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key,
				Function<ClusterStateBlockIndex.Builder, ObjectBuilder<ClusterStateBlockIndex>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new ClusterStateBlockIndex.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key,
				Function<ClusterStateBlockIndex.Builder, ObjectBuilder<ClusterStateBlockIndex>> fn) {
			return this.putIndices(key, fn.apply(new ClusterStateBlockIndex.Builder()).build());
		}

		/**
		 * API name: {@code index-graveyard}
		 */
		public Builder indexGraveyard(ClusterStateMetadataIndexGraveyard value) {
			this.indexGraveyard = value;
			return this;
		}

		/**
		 * API name: {@code index-graveyard}
		 */
		public Builder indexGraveyard(
				Function<ClusterStateMetadataIndexGraveyard.Builder, ObjectBuilder<ClusterStateMetadataIndexGraveyard>> fn) {
			return this.indexGraveyard(fn.apply(new ClusterStateMetadataIndexGraveyard.Builder()).build());
		}

		/**
		 * API name: {@code cluster_coordination}
		 */
		public Builder clusterCoordination(ClusterStateMetadataClusterCoordination value) {
			this.clusterCoordination = value;
			return this;
		}

		/**
		 * API name: {@code cluster_coordination}
		 */
		public Builder clusterCoordination(
				Function<ClusterStateMetadataClusterCoordination.Builder, ObjectBuilder<ClusterStateMetadataClusterCoordination>> fn) {
			return this.clusterCoordination(fn.apply(new ClusterStateMetadataClusterCoordination.Builder()).build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(@Nullable ClusterStateIngest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Function<ClusterStateIngest.Builder, ObjectBuilder<ClusterStateIngest>> fn) {
			return this.ingest(fn.apply(new ClusterStateIngest.Builder()).build());
		}

		/**
		 * API name: {@code repositories}
		 */
		public Builder repositories(@Nullable Map<String, String> value) {
			this.repositories = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #repositories(Map)}, creating the map if needed.
		 */
		public Builder putRepositories(String key, String value) {
			if (this.repositories == null) {
				this.repositories = new HashMap<>();
			}
			this.repositories.put(key, value);
			return this;
		}

		/**
		 * API name: {@code component_template}
		 */
		public Builder componentTemplate(@Nullable Map<String, JsonData> value) {
			this.componentTemplate = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #componentTemplate(Map)}, creating the map if
		 * needed.
		 */
		public Builder putComponentTemplate(String key, JsonData value) {
			if (this.componentTemplate == null) {
				this.componentTemplate = new HashMap<>();
			}
			this.componentTemplate.put(key, value);
			return this;
		}

		/**
		 * API name: {@code index_template}
		 */
		public Builder indexTemplate(@Nullable Map<String, JsonData> value) {
			this.indexTemplate = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indexTemplate(Map)}, creating the map if needed.
		 */
		public Builder putIndexTemplate(String key, JsonData value) {
			if (this.indexTemplate == null) {
				this.indexTemplate = new HashMap<>();
			}
			this.indexTemplate.put(key, value);
			return this;
		}

		/**
		 * API name: {@code index_lifecycle}
		 */
		public Builder indexLifecycle(@Nullable ClusterStateIndexLifecycle value) {
			this.indexLifecycle = value;
			return this;
		}

		/**
		 * API name: {@code index_lifecycle}
		 */
		public Builder indexLifecycle(
				Function<ClusterStateIndexLifecycle.Builder, ObjectBuilder<ClusterStateIndexLifecycle>> fn) {
			return this.indexLifecycle(fn.apply(new ClusterStateIndexLifecycle.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterStateMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateMetadata build() {

			return new ClusterStateMetadata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateMetadata}
	 */
	public static final JsonpDeserializer<ClusterStateMetadata> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterStateMetadata::setupClusterStateMetadataDeserializer);

	protected static void setupClusterStateMetadataDeserializer(
			DelegatingDeserializer<ClusterStateMetadata.Builder> op) {

		op.add(Builder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(Builder::clusterUuidCommitted, JsonpDeserializer.booleanDeserializer(), "cluster_uuid_committed");
		op.add(Builder::templates, ClusterStateMetadataTemplate.DESERIALIZER, "templates");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(ClusterStateBlockIndex.DESERIALIZER),
				"indices");
		op.add(Builder::indexGraveyard, ClusterStateMetadataIndexGraveyard.DESERIALIZER, "index-graveyard");
		op.add(Builder::clusterCoordination, ClusterStateMetadataClusterCoordination.DESERIALIZER,
				"cluster_coordination");
		op.add(Builder::ingest, ClusterStateIngest.DESERIALIZER, "ingest");
		op.add(Builder::repositories, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"repositories");
		op.add(Builder::componentTemplate, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER),
				"component_template");
		op.add(Builder::indexTemplate, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER),
				"index_template");
		op.add(Builder::indexLifecycle, ClusterStateIndexLifecycle.DESERIALIZER, "index_lifecycle");

	}

}
