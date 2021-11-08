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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_template.Template
@JsonpDeserializable
public class Template implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	private final TypeMapping mappings;

	private final Map<String, JsonData> settings;

	private final List<Overlapping> overlapping;

	// ---------------------------------------------------------------------------------------------

	private Template(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiableRequired(builder.aliases, this, "aliases");
		this.mappings = ModelTypeHelper.requireNonNull(builder.mappings, this, "mappings");
		this.settings = ModelTypeHelper.unmodifiableRequired(builder.settings, this, "settings");
		this.overlapping = ModelTypeHelper.unmodifiableRequired(builder.overlapping, this, "overlapping");

	}

	public static Template of(Function<Builder, ObjectBuilder<Template>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * Required - API name: {@code mappings}
	 */
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Required - API name: {@code overlapping}
	 */
	public final List<Overlapping> overlapping() {
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

		if (ModelTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.overlapping)) {
			generator.writeKey("overlapping");
			generator.writeStartArray();
			for (Overlapping item0 : this.overlapping) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Template}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Template> {
		private Map<String, Alias> aliases;

		private TypeMapping mappings;

		private Map<String, JsonData> settings;

		private List<Overlapping> overlapping;

		/**
		 * Required - API name: {@code aliases}
		 */
		public final Builder aliases(Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		public final Builder aliases(
				Function<MapBuilder<String, Alias, Alias.Builder>, ObjectBuilder<Map<String, Alias>>> fn) {
			return aliases(fn.apply(new MapBuilder<>(Alias.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code overlapping}
		 */
		public final Builder overlapping(List<Overlapping> value) {
			this.overlapping = value;
			return this;
		}

		/**
		 * Required - API name: {@code overlapping}
		 */
		public final Builder overlapping(Overlapping... value) {
			this.overlapping = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code overlapping}
		 */
		@SafeVarargs
		public final Builder overlapping(Function<Overlapping.Builder, ObjectBuilder<Overlapping>>... fns) {
			this.overlapping = new ArrayList<>(fns.length);
			for (Function<Overlapping.Builder, ObjectBuilder<Overlapping>> fn : fns) {
				this.overlapping.add(fn.apply(new Overlapping.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link Template}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Template build() {
			_checkSingleUse();

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
