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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.PluginStats
@JsonpDeserializable
public final class PluginStats implements JsonpSerializable {
	private final String classname;

	private final String description;

	private final String elasticsearchVersion;

	private final List<String> extendedPlugins;

	private final boolean hasNativeController;

	private final String javaVersion;

	private final String name;

	private final String version;

	private final boolean licensed;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	public PluginStats(Builder builder) {

		this.classname = Objects.requireNonNull(builder.classname, "classname");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.elasticsearchVersion = Objects.requireNonNull(builder.elasticsearchVersion, "elasticsearch_version");
		this.extendedPlugins = Objects.requireNonNull(builder.extendedPlugins, "extended_plugins");
		this.hasNativeController = Objects.requireNonNull(builder.hasNativeController, "has_native_controller");
		this.javaVersion = Objects.requireNonNull(builder.javaVersion, "java_version");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.licensed = Objects.requireNonNull(builder.licensed, "licensed");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code classname}
	 */
	public String classname() {
		return this.classname;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code elasticsearch_version}
	 */
	public String elasticsearchVersion() {
		return this.elasticsearchVersion;
	}

	/**
	 * API name: {@code extended_plugins}
	 */
	public List<String> extendedPlugins() {
		return this.extendedPlugins;
	}

	/**
	 * API name: {@code has_native_controller}
	 */
	public boolean hasNativeController() {
		return this.hasNativeController;
	}

	/**
	 * API name: {@code java_version}
	 */
	public String javaVersion() {
		return this.javaVersion;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code licensed}
	 */
	public boolean licensed() {
		return this.licensed;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("extended_plugins");
		generator.writeStartArray();
		for (String item0 : this.extendedPlugins) {
			generator.write(item0);

		}
		generator.writeEnd();

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

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PluginStats}.
	 */
	public static class Builder implements ObjectBuilder<PluginStats> {
		private String classname;

		private String description;

		private String elasticsearchVersion;

		private List<String> extendedPlugins;

		private Boolean hasNativeController;

		private String javaVersion;

		private String name;

		private String version;

		private Boolean licensed;

		private String type;

		/**
		 * API name: {@code classname}
		 */
		public Builder classname(String value) {
			this.classname = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code elasticsearch_version}
		 */
		public Builder elasticsearchVersion(String value) {
			this.elasticsearchVersion = value;
			return this;
		}

		/**
		 * API name: {@code extended_plugins}
		 */
		public Builder extendedPlugins(List<String> value) {
			this.extendedPlugins = value;
			return this;
		}

		/**
		 * API name: {@code extended_plugins}
		 */
		public Builder extendedPlugins(String... value) {
			this.extendedPlugins = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #extendedPlugins(List)}, creating the list if needed.
		 */
		public Builder addExtendedPlugins(String value) {
			if (this.extendedPlugins == null) {
				this.extendedPlugins = new ArrayList<>();
			}
			this.extendedPlugins.add(value);
			return this;
		}

		/**
		 * API name: {@code has_native_controller}
		 */
		public Builder hasNativeController(boolean value) {
			this.hasNativeController = value;
			return this;
		}

		/**
		 * API name: {@code java_version}
		 */
		public Builder javaVersion(String value) {
			this.javaVersion = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code licensed}
		 */
		public Builder licensed(boolean value) {
			this.licensed = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link PluginStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PluginStats build() {

			return new PluginStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PluginStats}
	 */
	public static final JsonpDeserializer<PluginStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PluginStats::setupPluginStatsDeserializer, Builder::build);

	protected static void setupPluginStatsDeserializer(DelegatingDeserializer<PluginStats.Builder> op) {

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
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
