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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.JoinProperty

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.JoinProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class JoinProperty extends PropertyBase implements PropertyVariant {
	private final Map<String, List<String>> relations;

	@Nullable
	private final Boolean eagerGlobalOrdinals;

	// ---------------------------------------------------------------------------------------------

	private JoinProperty(Builder builder) {
		super(builder);

		this.relations = ApiTypeHelper.unmodifiable(builder.relations);
		this.eagerGlobalOrdinals = builder.eagerGlobalOrdinals;

	}

	public static JoinProperty of(Function<Builder, ObjectBuilder<JoinProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Join;
	}

	/**
	 * API name: {@code relations}
	 */
	public final Map<String, List<String>> relations() {
		return this.relations;
	}

	/**
	 * API name: {@code eager_global_ordinals}
	 */
	@Nullable
	public final Boolean eagerGlobalOrdinals() {
		return this.eagerGlobalOrdinals;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "join");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.relations)) {
			generator.writeKey("relations");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.relations.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.eagerGlobalOrdinals != null) {
			generator.writeKey("eager_global_ordinals");
			generator.write(this.eagerGlobalOrdinals);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JoinProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder> implements ObjectBuilder<JoinProperty> {
		@Nullable
		private Map<String, List<String>> relations;

		@Nullable
		private Boolean eagerGlobalOrdinals;

		/**
		 * API name: {@code relations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>relations</code>.
		 */
		public final Builder relations(Map<String, List<String>> map) {
			this.relations = _mapPutAll(this.relations, map);
			return this;
		}

		/**
		 * API name: {@code relations}
		 * <p>
		 * Adds an entry to <code>relations</code>.
		 */
		public final Builder relations(String key, List<String> value) {
			this.relations = _mapPut(this.relations, key, value);
			return this;
		}

		/**
		 * API name: {@code eager_global_ordinals}
		 */
		public final Builder eagerGlobalOrdinals(@Nullable Boolean value) {
			this.eagerGlobalOrdinals = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JoinProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JoinProperty build() {
			_checkSingleUse();

			return new JoinProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JoinProperty}
	 */
	public static final JsonpDeserializer<JoinProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JoinProperty::setupJoinPropertyDeserializer);

	protected static void setupJoinPropertyDeserializer(ObjectDeserializer<JoinProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::relations, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "relations");
		op.add(Builder::eagerGlobalOrdinals, JsonpDeserializer.booleanDeserializer(), "eager_global_ordinals");

		op.ignore("type");
	}

}
