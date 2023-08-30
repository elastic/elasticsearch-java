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

// typedef: indices._types.IndexTemplateSummary

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexTemplateSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexTemplateSummary implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final IndexSettings settings;

	@Nullable
	private final DataLifecycleWithRollover lifecycle;

	// ---------------------------------------------------------------------------------------------

	private IndexTemplateSummary(Builder builder) {

		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.mappings = builder.mappings;
		this.settings = builder.settings;
		this.lifecycle = builder.lifecycle;

	}

	public static IndexTemplateSummary of(Function<Builder, ObjectBuilder<IndexTemplateSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aliases to add. If the index template includes a <code>data_stream</code>
	 * object, these are data stream aliases. Otherwise, these are index aliases.
	 * Data stream aliases ignore the <code>index_routing</code>,
	 * <code>routing</code>, and <code>search_routing</code> options.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * Mapping for fields in the index. If specified, this mapping can include field
	 * names, field data types, and mapping parameters.
	 * <p>
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Configuration options for the index.
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public final IndexSettings settings() {
		return this.settings;
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
	 * Builder for {@link IndexTemplateSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexTemplateSummary> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private IndexSettings settings;

		@Nullable
		private DataLifecycleWithRollover lifecycle;

		/**
		 * Aliases to add. If the index template includes a <code>data_stream</code>
		 * object, these are data stream aliases. Otherwise, these are index aliases.
		 * Data stream aliases ignore the <code>index_routing</code>,
		 * <code>routing</code>, and <code>search_routing</code> options.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aliases</code>.
		 */
		public final Builder aliases(Map<String, Alias> map) {
			this.aliases = _mapPutAll(this.aliases, map);
			return this;
		}

		/**
		 * Aliases to add. If the index template includes a <code>data_stream</code>
		 * object, these are data stream aliases. Otherwise, these are index aliases.
		 * Data stream aliases ignore the <code>index_routing</code>,
		 * <code>routing</code>, and <code>search_routing</code> options.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code>.
		 */
		public final Builder aliases(String key, Alias value) {
			this.aliases = _mapPut(this.aliases, key, value);
			return this;
		}

		/**
		 * Aliases to add. If the index template includes a <code>data_stream</code>
		 * object, these are data stream aliases. Otherwise, these are index aliases.
		 * Data stream aliases ignore the <code>index_routing</code>,
		 * <code>routing</code>, and <code>search_routing</code> options.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return aliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * Mapping for fields in the index. If specified, this mapping can include field
		 * names, field data types, and mapping parameters.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Mapping for fields in the index. If specified, this mapping can include field
		 * names, field data types, and mapping parameters.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Configuration options for the index.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Configuration options for the index.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
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
			.lazy(Builder::new, IndexTemplateSummary::setupIndexTemplateSummaryDeserializer);

	protected static void setupIndexTemplateSummaryDeserializer(ObjectDeserializer<IndexTemplateSummary.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");
		op.add(Builder::lifecycle, DataLifecycleWithRollover._DESERIALIZER, "lifecycle");

	}

}
