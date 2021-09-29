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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecurity
@JsonpDeserializable
public final class NodeInfoXpackSecurity implements JsonpSerializable {
	private final NodeInfoXpackSecuritySsl http;

	private final String enabled;

	private final NodeInfoXpackSecuritySsl transport;

	@Nullable
	private final NodeInfoXpackSecurityAuthc authc;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoXpackSecurity(Builder builder) {

		this.http = Objects.requireNonNull(builder.http, "http");
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.transport = Objects.requireNonNull(builder.transport, "transport");
		this.authc = builder.authc;

	}

	public NodeInfoXpackSecurity(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code http}
	 */
	public NodeInfoXpackSecuritySsl http() {
		return this.http;
	}

	/**
	 * API name: {@code enabled}
	 */
	public String enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code transport}
	 */
	public NodeInfoXpackSecuritySsl transport() {
		return this.transport;
	}

	/**
	 * API name: {@code authc}
	 */
	@Nullable
	public NodeInfoXpackSecurityAuthc authc() {
		return this.authc;
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

		generator.writeKey("http");
		this.http.serialize(generator, mapper);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("transport");
		this.transport.serialize(generator, mapper);

		if (this.authc != null) {

			generator.writeKey("authc");
			this.authc.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurity}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackSecurity> {
		private NodeInfoXpackSecuritySsl http;

		private String enabled;

		private NodeInfoXpackSecuritySsl transport;

		@Nullable
		private NodeInfoXpackSecurityAuthc authc;

		/**
		 * API name: {@code http}
		 */
		public Builder http(NodeInfoXpackSecuritySsl value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(Function<NodeInfoXpackSecuritySsl.Builder, ObjectBuilder<NodeInfoXpackSecuritySsl>> fn) {
			return this.http(fn.apply(new NodeInfoXpackSecuritySsl.Builder()).build());
		}

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(String value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(NodeInfoXpackSecuritySsl value) {
			this.transport = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(
				Function<NodeInfoXpackSecuritySsl.Builder, ObjectBuilder<NodeInfoXpackSecuritySsl>> fn) {
			return this.transport(fn.apply(new NodeInfoXpackSecuritySsl.Builder()).build());
		}

		/**
		 * API name: {@code authc}
		 */
		public Builder authc(@Nullable NodeInfoXpackSecurityAuthc value) {
			this.authc = value;
			return this;
		}

		/**
		 * API name: {@code authc}
		 */
		public Builder authc(
				Function<NodeInfoXpackSecurityAuthc.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthc>> fn) {
			return this.authc(fn.apply(new NodeInfoXpackSecurityAuthc.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoXpackSecurity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecurity build() {

			return new NodeInfoXpackSecurity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackSecurity}
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecurity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackSecurity::setupNodeInfoXpackSecurityDeserializer, Builder::build);

	protected static void setupNodeInfoXpackSecurityDeserializer(
			DelegatingDeserializer<NodeInfoXpackSecurity.Builder> op) {

		op.add(Builder::http, NodeInfoXpackSecuritySsl._DESERIALIZER, "http");
		op.add(Builder::enabled, JsonpDeserializer.stringDeserializer(), "enabled");
		op.add(Builder::transport, NodeInfoXpackSecuritySsl._DESERIALIZER, "transport");
		op.add(Builder::authc, NodeInfoXpackSecurityAuthc._DESERIALIZER, "authc");

	}

}
