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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.PluginStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.PluginStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class PluginStats implements JsonpSerializable {
	private final String classname;

	private final String description;

	private final String elasticsearchVersion;

	private final List<String> extendedPlugins;

	private final boolean hasNativeController;

	private final String javaVersion;

	private final String name;

	private final String version;

	private final boolean licensed;

	// ---------------------------------------------------------------------------------------------

	private PluginStats(Builder builder) {

		this.classname = ApiTypeHelper.requireNonNull(builder.classname, this, "classname");
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.elasticsearchVersion = ApiTypeHelper.requireNonNull(builder.elasticsearchVersion, this,
				"elasticsearchVersion");
		this.extendedPlugins = ApiTypeHelper.unmodifiableRequired(builder.extendedPlugins, this, "extendedPlugins");
		this.hasNativeController = ApiTypeHelper.requireNonNull(builder.hasNativeController, this,
				"hasNativeController");
		this.javaVersion = ApiTypeHelper.requireNonNull(builder.javaVersion, this, "javaVersion");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.licensed = ApiTypeHelper.requireNonNull(builder.licensed, this, "licensed");

	}

	public static PluginStats of(Function<Builder, ObjectBuilder<PluginStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code classname}
	 */
	public final String classname() {
		return this.classname;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code elasticsearch_version}
	 */
	public final String elasticsearchVersion() {
		return this.elasticsearchVersion;
	}

	/**
	 * Required - API name: {@code extended_plugins}
	 */
	public final List<String> extendedPlugins() {
		return this.extendedPlugins;
	}

	/**
	 * Required - API name: {@code has_native_controller}
	 */
	public final boolean hasNativeController() {
		return this.hasNativeController;
	}

	/**
	 * Required - API name: {@code java_version}
	 */
	public final String javaVersion() {
		return this.javaVersion;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code licensed}
	 */
	public final boolean licensed() {
		return this.licensed;
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

		generator.writeKey("classname");
		generator.write(this.classname);

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("elasticsearch_version");
		generator.write(this.elasticsearchVersion);

		if (ApiTypeHelper.isDefined(this.extendedPlugins)) {
			generator.writeKey("extended_plugins");
			generator.writeStartArray();
			for (String item0 : this.extendedPlugins) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("has_native_controller");
		generator.write(this.hasNativeController);

		generator.writeKey("java_version");
		generator.write(this.javaVersion);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("licensed");
		generator.write(this.licensed);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PluginStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PluginStats> {
		private String classname;

		private String description;

		private String elasticsearchVersion;

		private List<String> extendedPlugins;

		private Boolean hasNativeController;

		private String javaVersion;

		private String name;

		private String version;

		private Boolean licensed;

		/**
		 * Required - API name: {@code classname}
		 */
		public final Builder classname(String value) {
			this.classname = value;
			return this;
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code elasticsearch_version}
		 */
		public final Builder elasticsearchVersion(String value) {
			this.elasticsearchVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code extended_plugins}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>extendedPlugins</code>.
		 */
		public final Builder extendedPlugins(List<String> list) {
			this.extendedPlugins = _listAddAll(this.extendedPlugins, list);
			return this;
		}

		/**
		 * Required - API name: {@code extended_plugins}
		 * <p>
		 * Adds one or more values to <code>extendedPlugins</code>.
		 */
		public final Builder extendedPlugins(String value, String... values) {
			this.extendedPlugins = _listAdd(this.extendedPlugins, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code has_native_controller}
		 */
		public final Builder hasNativeController(boolean value) {
			this.hasNativeController = value;
			return this;
		}

		/**
		 * Required - API name: {@code java_version}
		 */
		public final Builder javaVersion(String value) {
			this.javaVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code licensed}
		 */
		public final Builder licensed(boolean value) {
			this.licensed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PluginStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PluginStats build() {
			_checkSingleUse();

			return new PluginStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PluginStats}
	 */
	public static final JsonpDeserializer<PluginStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PluginStats::setupPluginStatsDeserializer);

	protected static void setupPluginStatsDeserializer(ObjectDeserializer<PluginStats.Builder> op) {

		op.add(Builder::classname, JsonpDeserializer.stringDeserializer(), "classname");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::elasticsearchVersion, JsonpDeserializer.stringDeserializer(), "elasticsearch_version");
		op.add(Builder::extendedPlugins, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"extended_plugins");
		op.add(Builder::hasNativeController, JsonpDeserializer.booleanDeserializer(), "has_native_controller");
		op.add(Builder::javaVersion, JsonpDeserializer.stringDeserializer(), "java_version");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::licensed, JsonpDeserializer.booleanDeserializer(), "licensed");

	}

}
