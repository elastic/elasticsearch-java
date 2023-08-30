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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexState

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.IndexState">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexState implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final IndexSettings settings;

	@Nullable
	private final IndexSettings defaults;

	@Nullable
	private final String dataStream;

	@Nullable
	private final DataLifecycle lifecycle;

	// ---------------------------------------------------------------------------------------------

	private IndexState(Builder builder) {

		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.mappings = builder.mappings;
		this.settings = builder.settings;
		this.defaults = builder.defaults;
		this.dataStream = builder.dataStream;
		this.lifecycle = builder.lifecycle;

	}

	public static IndexState of(Function<Builder, ObjectBuilder<IndexState>> fn) {
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
	@Nullable
	public final IndexSettings settings() {
		return this.settings;
	}

	/**
	 * Default settings, included when the request's <code>include_default</code> is
	 * <code>true</code>.
	 * <p>
	 * API name: {@code defaults}
	 */
	@Nullable
	public final IndexSettings defaults() {
		return this.defaults;
	}

	/**
	 * API name: {@code data_stream}
	 */
	@Nullable
	public final String dataStream() {
		return this.dataStream;
	}

	/**
	 * Data lifecycle applicable if this is a data stream.
	 * <p>
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public final DataLifecycle lifecycle() {
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

		if (ApiTypeHelper.isDefined(this.aliases)) {
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
		if (this.settings != null) {
			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}
		if (this.defaults != null) {
			generator.writeKey("defaults");
			this.defaults.serialize(generator, mapper);

		}
		if (this.dataStream != null) {
			generator.writeKey("data_stream");
			generator.write(this.dataStream);

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
	 * Builder for {@link IndexState}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexState> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private IndexSettings settings;

		@Nullable
		private IndexSettings defaults;

		@Nullable
		private String dataStream;

		@Nullable
		private DataLifecycle lifecycle;

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aliases</code>.
		 */
		public final Builder aliases(Map<String, Alias> map) {
			this.aliases = _mapPutAll(this.aliases, map);
			return this;
		}

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code>.
		 */
		public final Builder aliases(String key, Alias value) {
			this.aliases = _mapPut(this.aliases, key, value);
			return this;
		}

		/**
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return aliases(key, fn.apply(new Alias.Builder()).build());
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
		public final Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Default settings, included when the request's <code>include_default</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code defaults}
		 */
		public final Builder defaults(@Nullable IndexSettings value) {
			this.defaults = value;
			return this;
		}

		/**
		 * Default settings, included when the request's <code>include_default</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code defaults}
		 */
		public final Builder defaults(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.defaults(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(@Nullable String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * Data lifecycle applicable if this is a data stream.
		 * <p>
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(@Nullable DataLifecycle value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * Data lifecycle applicable if this is a data stream.
		 * <p>
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(Function<DataLifecycle.Builder, ObjectBuilder<DataLifecycle>> fn) {
			return this.lifecycle(fn.apply(new DataLifecycle.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexState build() {
			_checkSingleUse();

			return new IndexState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexState}
	 */
	public static final JsonpDeserializer<IndexState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexState::setupIndexStateDeserializer);

	protected static void setupIndexStateDeserializer(ObjectDeserializer<IndexState.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");
		op.add(Builder::defaults, IndexSettings._DESERIALIZER, "defaults");
		op.add(Builder::dataStream, JsonpDeserializer.stringDeserializer(), "data_stream");
		op.add(Builder::lifecycle, DataLifecycle._DESERIALIZER, "lifecycle");

	}

}
