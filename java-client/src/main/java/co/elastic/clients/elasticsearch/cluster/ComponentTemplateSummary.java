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
import co.elastic.clients.elasticsearch.indices.AliasDefinition;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ComponentTemplateSummary
public final class ComponentTemplateSummary implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> meta;

	@Nullable
	private final Number version;

	private final Map<String, IndexSettings> settings;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final Map<String, AliasDefinition> aliases;

	// ---------------------------------------------------------------------------------------------

	protected ComponentTemplateSummary(Builder builder) {

		this.meta = builder.meta;
		this.version = builder.version;
		this.settings = Objects.requireNonNull(builder.settings, "settings");
		this.mappings = builder.mappings;
		this.aliases = builder.aliases;

	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code settings}
	 */
	public Map<String, IndexSettings> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, AliasDefinition> aliases() {
		return this.aliases;
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

		if (this.meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}

		generator.writeKey("settings");
		generator.writeStartObject();
		for (Map.Entry<String, IndexSettings> item0 : this.settings.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.mappings != null) {

			generator.writeKey("mappings");
			this.mappings.toJsonp(generator, mapper);

		}
		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, AliasDefinition> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplateSummary}.
	 */
	public static class Builder implements ObjectBuilder<ComponentTemplateSummary> {
		@Nullable
		private Map<String, JsonValue> meta;

		@Nullable
		private Number version;

		private Map<String, IndexSettings> settings;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private Map<String, AliasDefinition> aliases;

		/**
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonValue> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonValue value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Map<String, IndexSettings> value) {
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
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable Map<String, AliasDefinition> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, AliasDefinition value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new AliasDefinition.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.putAliases(key, fn.apply(new AliasDefinition.Builder()).build());
		}

		/**
		 * Builds a {@link ComponentTemplateSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplateSummary build() {

			return new ComponentTemplateSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ComponentTemplateSummary
	 */
	public static final JsonpDeserializer<ComponentTemplateSummary> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ComponentTemplateSummary::setupComponentTemplateSummaryDeserializer);

	protected static void setupComponentTemplateSummaryDeserializer(
			DelegatingDeserializer<ComponentTemplateSummary.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"_meta");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(IndexSettings.DESERIALIZER), "settings");
		op.add(Builder::mappings, TypeMapping.DESERIALIZER, "mappings");
		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(AliasDefinition.DESERIALIZER), "aliases");

	}

}
