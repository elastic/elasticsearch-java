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

package co.elastic.clients.elasticsearch.indices.simulate_template;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.indices.Alias;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_template.Template
@JsonpDeserializable
public final class Template implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	private final TypeMapping mappings;

	private final Map<String, JsonData> settings;

	private final List<Overlapping> overlapping;

	// ---------------------------------------------------------------------------------------------

	public Template(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiableNonNull(builder.aliases, "aliases");
		this.mappings = Objects.requireNonNull(builder.mappings, "mappings");
		this.settings = ModelTypeHelper.unmodifiableNonNull(builder.settings, "settings");
		this.overlapping = ModelTypeHelper.unmodifiableNonNull(builder.overlapping, "overlapping");

	}

	public Template(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code aliases}
	 */
	public Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Required - API name: {@code overlapping}
	 */
	public List<Overlapping> overlapping() {
		return this.overlapping;
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

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		generator.writeKey("settings");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("overlapping");
		generator.writeStartArray();
		for (Overlapping item0 : this.overlapping) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Template}.
	 */
	public static class Builder implements ObjectBuilder<Template> {
		private Map<String, Alias> aliases;

		private TypeMapping mappings;

		private Map<String, JsonData> settings;

		private List<Overlapping> overlapping;

		/**
		 * Required - API name: {@code aliases}
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
		 * Required - API name: {@code mappings}
		 */
		public Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Required - API name: {@code settings}
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
		 * Required - API name: {@code overlapping}
		 */
		public Builder overlapping(List<Overlapping> value) {
			this.overlapping = value;
			return this;
		}

		/**
		 * Required - API name: {@code overlapping}
		 */
		public Builder overlapping(Overlapping... value) {
			this.overlapping = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #overlapping(List)}, creating the list if needed.
		 */
		public Builder addOverlapping(Overlapping value) {
			if (this.overlapping == null) {
				this.overlapping = new ArrayList<>();
			}
			this.overlapping.add(value);
			return this;
		}

		/**
		 * Set {@link #overlapping(List)} to a singleton list.
		 */
		public Builder overlapping(Function<Overlapping.Builder, ObjectBuilder<Overlapping>> fn) {
			return this.overlapping(fn.apply(new Overlapping.Builder()).build());
		}

		/**
		 * Add a value to {@link #overlapping(List)}, creating the list if needed.
		 */
		public Builder addOverlapping(Function<Overlapping.Builder, ObjectBuilder<Overlapping>> fn) {
			return this.addOverlapping(fn.apply(new Overlapping.Builder()).build());
		}

		/**
		 * Builds a {@link Template}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Template build() {

			return new Template(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Template}
	 */
	public static final JsonpDeserializer<Template> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Template::setupTemplateDeserializer, Builder::build);

	protected static void setupTemplateDeserializer(DelegatingDeserializer<Template.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");
		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(Overlapping._DESERIALIZER), "overlapping");

	}

}
