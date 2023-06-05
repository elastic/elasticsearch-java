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
import co.elastic.clients.elasticsearch.indices.DataLifecycleWithRollover;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.json.JsonData;
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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ComponentTemplateSummary

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster._types.ComponentTemplateSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class ComponentTemplateSummary implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final Long version;

	private final Map<String, IndexSettings> settings;

	@Nullable
	private final TypeMapping mappings;

	private final Map<String, AliasDefinition> aliases;

	@Nullable
	private final DataLifecycleWithRollover lifecycle;

	// ---------------------------------------------------------------------------------------------

	private ComponentTemplateSummary(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.version = builder.version;
		this.settings = ApiTypeHelper.unmodifiable(builder.settings);
		this.mappings = builder.mappings;
		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.lifecycle = builder.lifecycle;

	}

	public static ComponentTemplateSummary of(Function<Builder, ObjectBuilder<ComponentTemplateSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * API name: {@code settings}
	 */
	public final Map<String, IndexSettings> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code aliases}
	 */
	public final Map<String, AliasDefinition> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public final DataLifecycleWithRollover lifecycle() {
		return this.lifecycle;
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

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, IndexSettings> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, AliasDefinition> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.lifecycle != null) {
			generator.writeKey("lifecycle");
			this.lifecycle.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplateSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ComponentTemplateSummary> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Long version;

		@Nullable
		private Map<String, IndexSettings> settings;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private Map<String, AliasDefinition> aliases;

		@Nullable
		private DataLifecycleWithRollover lifecycle;

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, IndexSettings> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, IndexSettings value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		/**
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code> using a builder lambda.
		 */
		public final Builder settings(String key, Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return settings(key, fn.apply(new IndexSettings.Builder()).build());
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
		 * API name: {@code aliases}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aliases</code>.
		 */
		public final Builder aliases(Map<String, AliasDefinition> map) {
			this.aliases = _mapPutAll(this.aliases, map);
			return this;
		}

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code>.
		 */
		public final Builder aliases(String key, AliasDefinition value) {
			this.aliases = _mapPut(this.aliases, key, value);
			return this;
		}

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return aliases(key, fn.apply(new AliasDefinition.Builder()).build());
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(@Nullable DataLifecycleWithRollover value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(
				Function<DataLifecycleWithRollover.Builder, ObjectBuilder<DataLifecycleWithRollover>> fn) {
			return this.lifecycle(fn.apply(new DataLifecycleWithRollover.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ComponentTemplateSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplateSummary build() {
			_checkSingleUse();

			return new ComponentTemplateSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ComponentTemplateSummary}
	 */
	public static final JsonpDeserializer<ComponentTemplateSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ComponentTemplateSummary::setupComponentTemplateSummaryDeserializer);

	protected static void setupComponentTemplateSummaryDeserializer(
			ObjectDeserializer<ComponentTemplateSummary.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(IndexSettings._DESERIALIZER), "settings");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(AliasDefinition._DESERIALIZER), "aliases");
		op.add(Builder::lifecycle, DataLifecycleWithRollover._DESERIALIZER, "lifecycle");

	}

}
