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

package co.elastic.clients.elasticsearch.cat.plugins;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.plugins.PluginsRecord
public final class PluginsRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final String name;

	@Nullable
	private final String component;

	@Nullable
	private final String version;

	@Nullable
	private final String description;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected PluginsRecord(Builder builder) {

		this.id = builder.id;
		this.name = builder.name;
		this.component = builder.component;
		this.version = builder.version;
		this.description = builder.description;
		this.type = builder.type;

	}

	/**
	 * unique node id
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * node name
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * component
	 *
	 * API name: {@code component}
	 */
	@Nullable
	public String component() {
		return this.component;
	}

	/**
	 * component version
	 *
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * plugin details
	 *
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * plugin type
	 *
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.component != null) {

			generator.writeKey("component");
			generator.write(this.component);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PluginsRecord}.
	 */
	public static class Builder implements ObjectBuilder<PluginsRecord> {
		@Nullable
		private String id;

		@Nullable
		private String name;

		@Nullable
		private String component;

		@Nullable
		private String version;

		@Nullable
		private String description;

		@Nullable
		private String type;

		/**
		 * unique node id
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * node name
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * component
		 *
		 * API name: {@code component}
		 */
		public Builder component(@Nullable String value) {
			this.component = value;
			return this;
		}

		/**
		 * component version
		 *
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * plugin details
		 *
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * plugin type
		 *
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link PluginsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PluginsRecord build() {

			return new PluginsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PluginsRecord
	 */
	public static final JsonpValueParser<PluginsRecord> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PluginsRecord::setupPluginsRecordParser);

	protected static void setupPluginsRecordParser(DelegatingJsonpValueParser<PluginsRecord.Builder> op) {

		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::name, JsonpValueParser.stringParser(), "name", "n");
		op.add(Builder::component, JsonpValueParser.stringParser(), "component", "c");
		op.add(Builder::version, JsonpValueParser.stringParser(), "version", "v");
		op.add(Builder::description, JsonpValueParser.stringParser(), "description", "d");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type", "t");

	}

}
