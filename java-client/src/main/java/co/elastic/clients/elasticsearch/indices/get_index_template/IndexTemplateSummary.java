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

package co.elastic.clients.elasticsearch.indices.get_index_template;

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
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_index_template.IndexTemplateSummary
@JsonpDeserializable
public class IndexTemplateSummary implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	@Nullable
	private final TypeMapping mappings;

	private final Map<String, JsonData> settings;

	// ---------------------------------------------------------------------------------------------

	private IndexTemplateSummary(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.mappings = builder.mappings;
		this.settings = ModelTypeHelper.unmodifiable(builder.settings);

	}

	public static IndexTemplateSummary of(Function<Builder, ObjectBuilder<IndexTemplateSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
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
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexTemplateSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexTemplateSummary> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private Map<String, JsonData> settings;

		/**
		 * API name: {@code aliases}
		 */
		public final Builder aliases(@Nullable Map<String, Alias> value) {
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
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Builds a {@link IndexTemplateSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexTemplateSummary build() {
			_checkSingleUse();

			return new IndexTemplateSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexTemplateSummary}
	 */
	public static final JsonpDeserializer<IndexTemplateSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexTemplateSummary::setupIndexTemplateSummaryDeserializer, Builder::build);

	protected static void setupIndexTemplateSummaryDeserializer(
			DelegatingDeserializer<IndexTemplateSummary.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

}
