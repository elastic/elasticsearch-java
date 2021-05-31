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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecurity
public final class NodeInfoXpackSecurity implements ToJsonp {
	private final NodeInfoXpackSecuritySsl http;

	private final String enabled;

	private final NodeInfoXpackSecuritySsl transport;

	@Nullable
	private final NodeInfoXpackSecurityAuthc authc;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoXpackSecurity(Builder builder) {

		this.http = Objects.requireNonNull(builder.http, "http");
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.transport = Objects.requireNonNull(builder.transport, "transport");
		this.authc = builder.authc;

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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("http");
		this.http.toJsonp(generator, mapper);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("transport");
		this.transport.toJsonp(generator, mapper);

		if (this.authc != null) {

			generator.writeKey("authc");
			this.authc.toJsonp(generator, mapper);

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
	 * Json parser for NodeInfoXpackSecurity
	 */
	public static final JsonpValueParser<NodeInfoXpackSecurity> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeInfoXpackSecurity::setupNodeInfoXpackSecurityParser);

	protected static void setupNodeInfoXpackSecurityParser(
			DelegatingJsonpValueParser<NodeInfoXpackSecurity.Builder> op) {

		op.add(Builder::http, NodeInfoXpackSecuritySsl.JSONP_PARSER, "http");
		op.add(Builder::enabled, JsonpValueParser.stringParser(), "enabled");
		op.add(Builder::transport, NodeInfoXpackSecuritySsl.JSONP_PARSER, "transport");
		op.add(Builder::authc, NodeInfoXpackSecurityAuthc.JSONP_PARSER, "authc");

	}

}
