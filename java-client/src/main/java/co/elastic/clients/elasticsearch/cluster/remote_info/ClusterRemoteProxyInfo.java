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

package co.elastic.clients.elasticsearch.cluster.remote_info;

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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.remote_info.ClusterRemoteProxyInfo
@JsonpDeserializable
public final class ClusterRemoteProxyInfo implements ClusterRemoteInfoVariant, JsonpSerializable {
	private final Boolean connected;

	private final String initialConnectTimeout;

	private final Boolean skipUnavailable;

	private final String proxyAddress;

	private final String serverName;

	private final Integer numProxySocketsConnected;

	private final Integer maxProxySocketConnections;

	// ---------------------------------------------------------------------------------------------

	public ClusterRemoteProxyInfo(Builder builder) {

		this.connected = Objects.requireNonNull(builder.connected, "connected");
		this.initialConnectTimeout = Objects.requireNonNull(builder.initialConnectTimeout, "initial_connect_timeout");
		this.skipUnavailable = Objects.requireNonNull(builder.skipUnavailable, "skip_unavailable");
		this.proxyAddress = Objects.requireNonNull(builder.proxyAddress, "proxy_address");
		this.serverName = Objects.requireNonNull(builder.serverName, "server_name");
		this.numProxySocketsConnected = Objects.requireNonNull(builder.numProxySocketsConnected,
				"num_proxy_sockets_connected");
		this.maxProxySocketConnections = Objects.requireNonNull(builder.maxProxySocketConnections,
				"max_proxy_socket_connections");

	}

	/**
	 * {@link ClusterRemoteInfo} variant type
	 */
	@Override
	public String _variantType() {
		return "proxy";
	}

	/**
	 * API name: {@code connected}
	 */
	public Boolean connected() {
		return this.connected;
	}

	/**
	 * API name: {@code initial_connect_timeout}
	 */
	public String initialConnectTimeout() {
		return this.initialConnectTimeout;
	}

	/**
	 * API name: {@code skip_unavailable}
	 */
	public Boolean skipUnavailable() {
		return this.skipUnavailable;
	}

	/**
	 * API name: {@code proxy_address}
	 */
	public String proxyAddress() {
		return this.proxyAddress;
	}

	/**
	 * API name: {@code server_name}
	 */
	public String serverName() {
		return this.serverName;
	}

	/**
	 * API name: {@code num_proxy_sockets_connected}
	 */
	public Integer numProxySocketsConnected() {
		return this.numProxySocketsConnected;
	}

	/**
	 * API name: {@code max_proxy_socket_connections}
	 */
	public Integer maxProxySocketConnections() {
		return this.maxProxySocketConnections;
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

		generator.write("mode", "proxy");

		generator.writeKey("connected");
		generator.write(this.connected);

		generator.writeKey("initial_connect_timeout");
		generator.write(this.initialConnectTimeout);

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

		generator.writeKey("proxy_address");
		generator.write(this.proxyAddress);

		generator.writeKey("server_name");
		generator.write(this.serverName);

		generator.writeKey("num_proxy_sockets_connected");
		generator.write(this.numProxySocketsConnected);

		generator.writeKey("max_proxy_socket_connections");
		generator.write(this.maxProxySocketConnections);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterRemoteProxyInfo}.
	 */
	public static class Builder implements ObjectBuilder<ClusterRemoteProxyInfo> {
		private Boolean connected;

		private String initialConnectTimeout;

		private Boolean skipUnavailable;

		private String proxyAddress;

		private String serverName;

		private Integer numProxySocketsConnected;

		private Integer maxProxySocketConnections;

		/**
		 * API name: {@code connected}
		 */
		public Builder connected(Boolean value) {
			this.connected = value;
			return this;
		}

		/**
		 * API name: {@code initial_connect_timeout}
		 */
		public Builder initialConnectTimeout(String value) {
			this.initialConnectTimeout = value;
			return this;
		}

		/**
		 * API name: {@code skip_unavailable}
		 */
		public Builder skipUnavailable(Boolean value) {
			this.skipUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code proxy_address}
		 */
		public Builder proxyAddress(String value) {
			this.proxyAddress = value;
			return this;
		}

		/**
		 * API name: {@code server_name}
		 */
		public Builder serverName(String value) {
			this.serverName = value;
			return this;
		}

		/**
		 * API name: {@code num_proxy_sockets_connected}
		 */
		public Builder numProxySocketsConnected(Integer value) {
			this.numProxySocketsConnected = value;
			return this;
		}

		/**
		 * API name: {@code max_proxy_socket_connections}
		 */
		public Builder maxProxySocketConnections(Integer value) {
			this.maxProxySocketConnections = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterRemoteProxyInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterRemoteProxyInfo build() {

			return new ClusterRemoteProxyInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterRemoteProxyInfo}
	 */
	public static final JsonpDeserializer<ClusterRemoteProxyInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterRemoteProxyInfo::setupClusterRemoteProxyInfoDeserializer, Builder::build);

	protected static void setupClusterRemoteProxyInfoDeserializer(
			DelegatingDeserializer<ClusterRemoteProxyInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::initialConnectTimeout, JsonpDeserializer.stringDeserializer(), "initial_connect_timeout");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::proxyAddress, JsonpDeserializer.stringDeserializer(), "proxy_address");
		op.add(Builder::serverName, JsonpDeserializer.stringDeserializer(), "server_name");
		op.add(Builder::numProxySocketsConnected, JsonpDeserializer.integerDeserializer(),
				"num_proxy_sockets_connected");
		op.add(Builder::maxProxySocketConnections, JsonpDeserializer.integerDeserializer(),
				"max_proxy_socket_connections");

		op.ignore("mode");
	}

}
