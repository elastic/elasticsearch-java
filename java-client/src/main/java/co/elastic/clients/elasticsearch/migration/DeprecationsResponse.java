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

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.elasticsearch.migration.deprecations.Deprecation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: migration.deprecations.Response
public final class DeprecationsResponse implements ToJsonp {
	private final List<Deprecation> clusterSettings;

	private final Map<String, List<Deprecation>> indexSettings;

	private final List<Deprecation> nodeSettings;

	private final List<Deprecation> mlSettings;

	// ---------------------------------------------------------------------------------------------

	protected DeprecationsResponse(Builder builder) {

		this.clusterSettings = Objects.requireNonNull(builder.clusterSettings, "cluster_settings");
		this.indexSettings = Objects.requireNonNull(builder.indexSettings, "index_settings");
		this.nodeSettings = Objects.requireNonNull(builder.nodeSettings, "node_settings");
		this.mlSettings = Objects.requireNonNull(builder.mlSettings, "ml_settings");

	}

	/**
	 * API name: {@code cluster_settings}
	 */
	public List<Deprecation> clusterSettings() {
		return this.clusterSettings;
	}

	/**
	 * API name: {@code index_settings}
	 */
	public Map<String, List<Deprecation>> indexSettings() {
		return this.indexSettings;
	}

	/**
	 * API name: {@code node_settings}
	 */
	public List<Deprecation> nodeSettings() {
		return this.nodeSettings;
	}

	/**
	 * API name: {@code ml_settings}
	 */
	public List<Deprecation> mlSettings() {
		return this.mlSettings;
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

		generator.writeKey("cluster_settings");
		generator.writeStartArray();
		for (Deprecation item0 : this.clusterSettings) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("index_settings");
		generator.writeStartObject();
		for (Map.Entry<String, List<Deprecation>> item0 : this.indexSettings.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (Deprecation item1 : item0.getValue()) {
				item1.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("node_settings");
		generator.writeStartArray();
		for (Deprecation item0 : this.nodeSettings) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("ml_settings");
		generator.writeStartArray();
		for (Deprecation item0 : this.mlSettings) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeprecationsResponse}.
	 */
	public static class Builder implements ObjectBuilder<DeprecationsResponse> {
		private List<Deprecation> clusterSettings;

		private Map<String, List<Deprecation>> indexSettings;

		private List<Deprecation> nodeSettings;

		private List<Deprecation> mlSettings;

		/**
		 * API name: {@code cluster_settings}
		 */
		public Builder clusterSettings(List<Deprecation> value) {
			this.clusterSettings = value;
			return this;
		}

		/**
		 * API name: {@code cluster_settings}
		 */
		public Builder clusterSettings(Deprecation... value) {
			this.clusterSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #clusterSettings(List)}, creating the list if needed.
		 */
		public Builder addClusterSettings(Deprecation value) {
			if (this.clusterSettings == null) {
				this.clusterSettings = new ArrayList<>();
			}
			this.clusterSettings.add(value);
			return this;
		}

		/**
		 * Set {@link #clusterSettings(List)} to a singleton list.
		 */
		public Builder clusterSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return this.clusterSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Add a value to {@link #clusterSettings(List)}, creating the list if needed.
		 */
		public Builder addClusterSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return this.addClusterSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * API name: {@code index_settings}
		 */
		public Builder indexSettings(Map<String, List<Deprecation>> value) {
			this.indexSettings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indexSettings(Map)}, creating the map if needed.
		 */
		public Builder putIndexSettings(String key, List<Deprecation> value) {
			if (this.indexSettings == null) {
				this.indexSettings = new HashMap<>();
			}
			this.indexSettings.put(key, value);
			return this;
		}

		/**
		 * API name: {@code node_settings}
		 */
		public Builder nodeSettings(List<Deprecation> value) {
			this.nodeSettings = value;
			return this;
		}

		/**
		 * API name: {@code node_settings}
		 */
		public Builder nodeSettings(Deprecation... value) {
			this.nodeSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeSettings(List)}, creating the list if needed.
		 */
		public Builder addNodeSettings(Deprecation value) {
			if (this.nodeSettings == null) {
				this.nodeSettings = new ArrayList<>();
			}
			this.nodeSettings.add(value);
			return this;
		}

		/**
		 * Set {@link #nodeSettings(List)} to a singleton list.
		 */
		public Builder nodeSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return this.nodeSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Add a value to {@link #nodeSettings(List)}, creating the list if needed.
		 */
		public Builder addNodeSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return this.addNodeSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * API name: {@code ml_settings}
		 */
		public Builder mlSettings(List<Deprecation> value) {
			this.mlSettings = value;
			return this;
		}

		/**
		 * API name: {@code ml_settings}
		 */
		public Builder mlSettings(Deprecation... value) {
			this.mlSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #mlSettings(List)}, creating the list if needed.
		 */
		public Builder addMlSettings(Deprecation value) {
			if (this.mlSettings == null) {
				this.mlSettings = new ArrayList<>();
			}
			this.mlSettings.add(value);
			return this;
		}

		/**
		 * Set {@link #mlSettings(List)} to a singleton list.
		 */
		public Builder mlSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return this.mlSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Add a value to {@link #mlSettings(List)}, creating the list if needed.
		 */
		public Builder addMlSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return this.addMlSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Builds a {@link DeprecationsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeprecationsResponse build() {

			return new DeprecationsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DeprecationsResponse
	 */
	public static final JsonpDeserializer<DeprecationsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DeprecationsResponse::setupDeprecationsResponseDeserializer);

	protected static void setupDeprecationsResponseDeserializer(
			DelegatingDeserializer<DeprecationsResponse.Builder> op) {

		op.add(Builder::clusterSettings, JsonpDeserializer.arrayDeserializer(Deprecation.DESERIALIZER),
				"cluster_settings");
		op.add(Builder::indexSettings,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation.DESERIALIZER)),
				"index_settings");
		op.add(Builder::nodeSettings, JsonpDeserializer.arrayDeserializer(Deprecation.DESERIALIZER), "node_settings");
		op.add(Builder::mlSettings, JsonpDeserializer.arrayDeserializer(Deprecation.DESERIALIZER), "ml_settings");

	}

}
