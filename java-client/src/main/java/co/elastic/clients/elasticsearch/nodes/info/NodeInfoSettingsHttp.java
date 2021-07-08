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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsHttp
public final class NodeInfoSettingsHttp implements ToJsonp {
	private final JsonValue type;

	@Nullable
	private final String type_default;

	@Nullable
	private final JsonValue compression;

	@Nullable
	private final JsonValue port;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSettingsHttp(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.type_default = builder.type_default;
		this.compression = builder.compression;
		this.port = builder.port;

	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
		return this.type;
	}

	/**
	 * API name: {@code type.default}
	 */
	@Nullable
	public String type_default() {
		return this.type_default;
	}

	/**
	 * API name: {@code compression}
	 */
	@Nullable
	public JsonValue compression() {
		return this.compression;
	}

	/**
	 * API name: {@code port}
	 */
	@Nullable
	public JsonValue port() {
		return this.port;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.type_default != null) {

			generator.writeKey("type.default");
			generator.write(this.type_default);

		}
		if (this.compression != null) {

			generator.writeKey("compression");
			generator.write(this.compression);

		}
		if (this.port != null) {

			generator.writeKey("port");
			generator.write(this.port);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsHttp}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsHttp> {
		private JsonValue type;

		@Nullable
		private String type_default;

		@Nullable
		private JsonValue compression;

		@Nullable
		private JsonValue port;

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type.default}
		 */
		public Builder type_default(@Nullable String value) {
			this.type_default = value;
			return this;
		}

		/**
		 * API name: {@code compression}
		 */
		public Builder compression(@Nullable JsonValue value) {
			this.compression = value;
			return this;
		}

		/**
		 * API name: {@code port}
		 */
		public Builder port(@Nullable JsonValue value) {
			this.port = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsHttp}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsHttp build() {

			return new NodeInfoSettingsHttp(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoSettingsHttp
	 */
	public static final JsonpDeserializer<NodeInfoSettingsHttp> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSettingsHttp::setupNodeInfoSettingsHttpDeserializer);

	protected static void setupNodeInfoSettingsHttpDeserializer(
			DelegatingDeserializer<NodeInfoSettingsHttp.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");
		op.add(Builder::type_default, JsonpDeserializer.stringDeserializer(), "type.default");
		op.add(Builder::compression, JsonpDeserializer.jsonValueDeserializer(), "compression");
		op.add(Builder::port, JsonpDeserializer.jsonValueDeserializer(), "port");

	}

}
