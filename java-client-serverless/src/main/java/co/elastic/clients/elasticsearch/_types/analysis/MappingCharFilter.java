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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.MappingCharFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.MappingCharFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class MappingCharFilter extends CharFilterBase implements CharFilterDefinitionVariant {
	private final List<String> mappings;

	@Nullable
	private final String mappingsPath;

	// ---------------------------------------------------------------------------------------------

	private MappingCharFilter(Builder builder) {
		super(builder);

		this.mappings = ApiTypeHelper.unmodifiable(builder.mappings);
		this.mappingsPath = builder.mappingsPath;

	}

	public static MappingCharFilter of(Function<Builder, ObjectBuilder<MappingCharFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * CharFilterDefinition variant kind.
	 */
	@Override
	public CharFilterDefinition.Kind _charFilterDefinitionKind() {
		return CharFilterDefinition.Kind.Mapping;
	}

	/**
	 * API name: {@code mappings}
	 */
	public final List<String> mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code mappings_path}
	 */
	@Nullable
	public final String mappingsPath() {
		return this.mappingsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "mapping");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.mappings)) {
			generator.writeKey("mappings");
			generator.writeStartArray();
			for (String item0 : this.mappings) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.mappingsPath != null) {
			generator.writeKey("mappings_path");
			generator.write(this.mappingsPath);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MappingCharFilter}.
	 */

	public static class Builder extends CharFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MappingCharFilter> {
		@Nullable
		private List<String> mappings;

		@Nullable
		private String mappingsPath;

		/**
		 * API name: {@code mappings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>mappings</code>.
		 */
		public final Builder mappings(List<String> list) {
			this.mappings = _listAddAll(this.mappings, list);
			return this;
		}

		/**
		 * API name: {@code mappings}
		 * <p>
		 * Adds one or more values to <code>mappings</code>.
		 */
		public final Builder mappings(String value, String... values) {
			this.mappings = _listAdd(this.mappings, value, values);
			return this;
		}

		/**
		 * API name: {@code mappings_path}
		 */
		public final Builder mappingsPath(@Nullable String value) {
			this.mappingsPath = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MappingCharFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MappingCharFilter build() {
			_checkSingleUse();

			return new MappingCharFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MappingCharFilter}
	 */
	public static final JsonpDeserializer<MappingCharFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MappingCharFilter::setupMappingCharFilterDeserializer);

	protected static void setupMappingCharFilterDeserializer(ObjectDeserializer<MappingCharFilter.Builder> op) {
		CharFilterBase.setupCharFilterBaseDeserializer(op);
		op.add(Builder::mappings, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"mappings");
		op.add(Builder::mappingsPath, JsonpDeserializer.stringDeserializer(), "mappings_path");

		op.ignore("type");
	}

}
