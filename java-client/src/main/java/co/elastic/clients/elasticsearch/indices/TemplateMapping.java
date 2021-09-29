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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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

// typedef: indices._types.TemplateMapping
@JsonpDeserializable
public final class TemplateMapping implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	private final List<String> indexPatterns;

	private final TypeMapping mappings;

	private final int order;

	private final Map<String, JsonData> settings;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	public TemplateMapping(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiableNonNull(builder.aliases, "aliases");
		this.indexPatterns = ModelTypeHelper.unmodifiableNonNull(builder.indexPatterns, "index_patterns");
		this.mappings = Objects.requireNonNull(builder.mappings, "mappings");
		this.order = Objects.requireNonNull(builder.order, "order");
		this.settings = ModelTypeHelper.unmodifiableNonNull(builder.settings, "settings");
		this.version = builder.version;

	}

	public TemplateMapping(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code aliases}
	 */
	public Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code index_patterns}
	 */
	public List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * API name: {@code mappings}
	 */
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code order}
	 */
	public int order() {
		return this.order;
	}

	/**
	 * API name: {@code settings}
	 */
	public Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
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

		generator.writeKey("aliases");
		generator.writeStartObject();
		for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("index_patterns");
		generator.writeStartArray();
		for (String item0 : this.indexPatterns) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		generator.writeKey("order");
		generator.write(this.order);

		generator.writeKey("settings");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TemplateMapping}.
	 */
	public static class Builder implements ObjectBuilder<TemplateMapping> {
		private Map<String, Alias> aliases;

		private List<String> indexPatterns;

		private TypeMapping mappings;

		private Integer order;

		private Map<String, JsonData> settings;

		@Nullable
		private Long version;

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Alias value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.putAliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indexPatterns(List)}, creating the list if needed. 4
		 */
		public Builder addIndexPatterns(String value) {
			if (this.indexPatterns == null) {
				this.indexPatterns = new ArrayList<>();
			}
			this.indexPatterns.add(value);
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(TypeMapping value) {
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
		 * API name: {@code order}
		 */
		public Builder order(int value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonData value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
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
		 * Builds a {@link TemplateMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TemplateMapping build() {

			return new TemplateMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TemplateMapping}
	 */
	public static final JsonpDeserializer<TemplateMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TemplateMapping::setupTemplateMappingDeserializer, Builder::build);

	protected static void setupTemplateMappingDeserializer(DelegatingDeserializer<TemplateMapping.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::order, JsonpDeserializer.integerDeserializer(), "order");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
