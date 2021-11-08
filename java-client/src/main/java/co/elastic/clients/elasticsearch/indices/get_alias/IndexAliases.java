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

package co.elastic.clients.elasticsearch.indices.get_alias;

import co.elastic.clients.elasticsearch.indices.AliasDefinition;
import co.elastic.clients.json.DelegatingDeserializer;
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

// typedef: indices.get_alias.IndexAliases
@JsonpDeserializable
public class IndexAliases implements JsonpSerializable {
	private final Map<String, AliasDefinition> aliases;

	// ---------------------------------------------------------------------------------------------

	private IndexAliases(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiableRequired(builder.aliases, this, "aliases");

	}

	public static IndexAliases of(Function<Builder, ObjectBuilder<IndexAliases>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aliases}
	 */
	public final Map<String, AliasDefinition> aliases() {
		return this.aliases;
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
			for (Map.Entry<String, AliasDefinition> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexAliases}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexAliases> {
		private Map<String, AliasDefinition> aliases;

		/**
		 * Required - API name: {@code aliases}
		 */
		public final Builder aliases(Map<String, AliasDefinition> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new AliasDefinition.Builder()).build()));
		}

		public final Builder aliases(
				Function<MapBuilder<String, AliasDefinition, AliasDefinition.Builder>, ObjectBuilder<Map<String, AliasDefinition>>> fn) {
			return aliases(fn.apply(new MapBuilder<>(AliasDefinition.Builder::new)).build());
		}

		/**
		 * Builds a {@link IndexAliases}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexAliases build() {
			_checkSingleUse();

			return new IndexAliases(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexAliases}
	 */
	public static final JsonpDeserializer<IndexAliases> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexAliases::setupIndexAliasesDeserializer, Builder::build);

	protected static void setupIndexAliasesDeserializer(DelegatingDeserializer<IndexAliases.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(AliasDefinition._DESERIALIZER), "aliases");

	}

}
