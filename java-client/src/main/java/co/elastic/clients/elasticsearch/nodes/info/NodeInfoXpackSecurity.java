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

// typedef: nodes.info.NodeInfoXpackSecurity

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.info.NodeInfoXpackSecurity">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoXpackSecurity implements JsonpSerializable {
	private final NodeInfoXpackSecuritySsl http;

	private final String enabled;

	@Nullable
	private final NodeInfoXpackSecuritySsl transport;

	@Nullable
	private final NodeInfoXpackSecurityAuthc authc;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoXpackSecurity(Builder builder) {

		this.http = ApiTypeHelper.requireNonNull(builder.http, this, "http");
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.transport = builder.transport;
		this.authc = builder.authc;

	}

	public static NodeInfoXpackSecurity of(Function<Builder, ObjectBuilder<NodeInfoXpackSecurity>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code http}
	 */
	public final NodeInfoXpackSecuritySsl http() {
		return this.http;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final String enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code transport}
	 */
	@Nullable
	public final NodeInfoXpackSecuritySsl transport() {
		return this.transport;
	}

	/**
	 * API name: {@code authc}
	 */
	@Nullable
	public final NodeInfoXpackSecurityAuthc authc() {
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

		if (this.transport != null) {
			generator.writeKey("transport");
			this.transport.serialize(generator, mapper);

		}
		if (this.authc != null) {
			generator.writeKey("authc");
			this.authc.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecurity}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NodeInfoXpackSecurity> {
		private NodeInfoXpackSecuritySsl http;

		private String enabled;

		@Nullable
		private NodeInfoXpackSecuritySsl transport;

		@Nullable
		private NodeInfoXpackSecurityAuthc authc;

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(NodeInfoXpackSecuritySsl value) {
			this.http = value;
			return this;
		}

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(
				Function<NodeInfoXpackSecuritySsl.Builder, ObjectBuilder<NodeInfoXpackSecuritySsl>> fn) {
			return this.http(fn.apply(new NodeInfoXpackSecuritySsl.Builder()).build());
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(String value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public final Builder transport(@Nullable NodeInfoXpackSecuritySsl value) {
			this.transport = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public final Builder transport(
				Function<NodeInfoXpackSecuritySsl.Builder, ObjectBuilder<NodeInfoXpackSecuritySsl>> fn) {
			return this.transport(fn.apply(new NodeInfoXpackSecuritySsl.Builder()).build());
		}

		/**
		 * API name: {@code authc}
		 */
		public final Builder authc(@Nullable NodeInfoXpackSecurityAuthc value) {
			this.authc = value;
			return this;
		}

		/**
		 * API name: {@code authc}
		 */
		public final Builder authc(
				Function<NodeInfoXpackSecurityAuthc.Builder, ObjectBuilder<NodeInfoXpackSecurityAuthc>> fn) {
			return this.authc(fn.apply(new NodeInfoXpackSecurityAuthc.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackSecurity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecurity build() {
			_checkSingleUse();

			return new NodeInfoXpackSecurity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackSecurity}
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecurity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackSecurity::setupNodeInfoXpackSecurityDeserializer);

	protected static void setupNodeInfoXpackSecurityDeserializer(ObjectDeserializer<NodeInfoXpackSecurity.Builder> op) {

		op.add(Builder::http, NodeInfoXpackSecuritySsl._DESERIALIZER, "http");
		op.add(Builder::enabled, JsonpDeserializer.stringDeserializer(), "enabled");
		op.add(Builder::transport, NodeInfoXpackSecuritySsl._DESERIALIZER, "transport");
		op.add(Builder::authc, NodeInfoXpackSecurityAuthc._DESERIALIZER, "authc");

	}

}
