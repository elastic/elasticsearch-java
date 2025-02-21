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

package co.elastic.clients.elasticsearch.cat.component_templates;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: cat.component_templates.ComponentTemplate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.component_templates.ComponentTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ComponentTemplate implements JsonpSerializable {
	private final String name;

	@Nullable
	private final String version;

	private final String aliasCount;

	private final String mappingCount;

	private final String settingsCount;

	private final String metadataCount;

	private final String includedIn;

	// ---------------------------------------------------------------------------------------------

	private ComponentTemplate(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.version = builder.version;
		this.aliasCount = ApiTypeHelper.requireNonNull(builder.aliasCount, this, "aliasCount");
		this.mappingCount = ApiTypeHelper.requireNonNull(builder.mappingCount, this, "mappingCount");
		this.settingsCount = ApiTypeHelper.requireNonNull(builder.settingsCount, this, "settingsCount");
		this.metadataCount = ApiTypeHelper.requireNonNull(builder.metadataCount, this, "metadataCount");
		this.includedIn = ApiTypeHelper.requireNonNull(builder.includedIn, this, "includedIn");

	}

	public static ComponentTemplate of(Function<Builder, ObjectBuilder<ComponentTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code alias_count}
	 */
	public final String aliasCount() {
		return this.aliasCount;
	}

	/**
	 * Required - API name: {@code mapping_count}
	 */
	public final String mappingCount() {
		return this.mappingCount;
	}

	/**
	 * Required - API name: {@code settings_count}
	 */
	public final String settingsCount() {
		return this.settingsCount;
	}

	/**
	 * Required - API name: {@code metadata_count}
	 */
	public final String metadataCount() {
		return this.metadataCount;
	}

	/**
	 * Required - API name: {@code included_in}
	 */
	public final String includedIn() {
		return this.includedIn;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		generator.writeKey("alias_count");
		generator.write(this.aliasCount);

		generator.writeKey("mapping_count");
		generator.write(this.mappingCount);

		generator.writeKey("settings_count");
		generator.write(this.settingsCount);

		generator.writeKey("metadata_count");
		generator.write(this.metadataCount);

		generator.writeKey("included_in");
		generator.write(this.includedIn);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ComponentTemplate> {
		private String name;

		@Nullable
		private String version;

		private String aliasCount;

		private String mappingCount;

		private String settingsCount;

		private String metadataCount;

		private String includedIn;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code alias_count}
		 */
		public final Builder aliasCount(String value) {
			this.aliasCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code mapping_count}
		 */
		public final Builder mappingCount(String value) {
			this.mappingCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings_count}
		 */
		public final Builder settingsCount(String value) {
			this.settingsCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code metadata_count}
		 */
		public final Builder metadataCount(String value) {
			this.metadataCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code included_in}
		 */
		public final Builder includedIn(String value) {
			this.includedIn = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ComponentTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplate build() {
			_checkSingleUse();

			return new ComponentTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ComponentTemplate}
	 */
	public static final JsonpDeserializer<ComponentTemplate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ComponentTemplate::setupComponentTemplateDeserializer);

	protected static void setupComponentTemplateDeserializer(ObjectDeserializer<ComponentTemplate.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::aliasCount, JsonpDeserializer.stringDeserializer(), "alias_count");
		op.add(Builder::mappingCount, JsonpDeserializer.stringDeserializer(), "mapping_count");
		op.add(Builder::settingsCount, JsonpDeserializer.stringDeserializer(), "settings_count");
		op.add(Builder::metadataCount, JsonpDeserializer.stringDeserializer(), "metadata_count");
		op.add(Builder::includedIn, JsonpDeserializer.stringDeserializer(), "included_in");

	}

}
