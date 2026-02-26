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

package co.elastic.clients.elasticsearch.cluster.remote_info;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Integer;
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

// typedef: cluster.remote_info.ClusterRemoteProxyInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.remote_info.ClusterRemoteProxyInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterRemoteProxyInfo implements ClusterRemoteInfoVariant, JsonpSerializable {
	private final boolean connected;

	private final Time initialConnectTimeout;

	private final boolean skipUnavailable;

	private final String proxyAddress;

	private final String serverName;

	private final int numProxySocketsConnected;

	private final int maxProxySocketConnections;

	@Nullable
	private final String clusterCredentials;

	// ---------------------------------------------------------------------------------------------

	private ClusterRemoteProxyInfo(Builder builder) {

		this.connected = ApiTypeHelper.requireNonNull(builder.connected, this, "connected", false);
		this.initialConnectTimeout = ApiTypeHelper.requireNonNull(builder.initialConnectTimeout, this,
				"initialConnectTimeout");
		this.skipUnavailable = ApiTypeHelper.requireNonNull(builder.skipUnavailable, this, "skipUnavailable", false);
		this.proxyAddress = ApiTypeHelper.requireNonNull(builder.proxyAddress, this, "proxyAddress");
		this.serverName = ApiTypeHelper.requireNonNull(builder.serverName, this, "serverName");
		this.numProxySocketsConnected = ApiTypeHelper.requireNonNull(builder.numProxySocketsConnected, this,
				"numProxySocketsConnected", 0);
		this.maxProxySocketConnections = ApiTypeHelper.requireNonNull(builder.maxProxySocketConnections, this,
				"maxProxySocketConnections", 0);
		this.clusterCredentials = builder.clusterCredentials;

	}

	public static ClusterRemoteProxyInfo of(Function<Builder, ObjectBuilder<ClusterRemoteProxyInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ClusterRemoteInfo variant kind.
	 */
	@Override
	public ClusterRemoteInfo.Kind _clusterRemoteInfoKind() {
		return ClusterRemoteInfo.Kind.Proxy;
	}

	/**
	 * Required - If it is <code>true</code>, there is at least one open connection
	 * to the remote cluster. If it is <code>false</code>, it means that the cluster
	 * no longer has an open connection to the remote cluster. It does not
	 * necessarily mean that the remote cluster is down or unavailable, just that at
	 * some point a connection was lost.
	 * <p>
	 * API name: {@code connected}
	 */
	public final boolean connected() {
		return this.connected;
	}

	/**
	 * Required - The initial connect timeout for remote cluster connections.
	 * <p>
	 * API name: {@code initial_connect_timeout}
	 */
	public final Time initialConnectTimeout() {
		return this.initialConnectTimeout;
	}

	/**
	 * Required - If <code>true</code>, cross-cluster search skips the remote
	 * cluster when its nodes are unavailable during the search and ignores errors
	 * returned by the remote cluster.
	 * <p>
	 * API name: {@code skip_unavailable}
	 */
	public final boolean skipUnavailable() {
		return this.skipUnavailable;
	}

	/**
	 * Required - The address for remote connections when proxy mode is configured.
	 * <p>
	 * API name: {@code proxy_address}
	 */
	public final String proxyAddress() {
		return this.proxyAddress;
	}

	/**
	 * Required - API name: {@code server_name}
	 */
	public final String serverName() {
		return this.serverName;
	}

	/**
	 * Required - The number of open socket connections to the remote cluster when
	 * proxy mode is configured.
	 * <p>
	 * API name: {@code num_proxy_sockets_connected}
	 */
	public final int numProxySocketsConnected() {
		return this.numProxySocketsConnected;
	}

	/**
	 * Required - The maximum number of socket connections to the remote cluster
	 * when proxy mode is configured.
	 * <p>
	 * API name: {@code max_proxy_socket_connections}
	 */
	public final int maxProxySocketConnections() {
		return this.maxProxySocketConnections;
	}

	/**
	 * This field is present and has a value of <code>::es_redacted::</code> only
	 * when the remote cluster is configured with the API key based model.
	 * Otherwise, the field is not present.
	 * <p>
	 * API name: {@code cluster_credentials}
	 */
	@Nullable
	public final String clusterCredentials() {
		return this.clusterCredentials;
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
		this.initialConnectTimeout.serialize(generator, mapper);

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

		if (this.clusterCredentials != null) {
			generator.writeKey("cluster_credentials");
			generator.write(this.clusterCredentials);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterRemoteProxyInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterRemoteProxyInfo> {
		private Boolean connected;

		private Time initialConnectTimeout;

		private Boolean skipUnavailable;

		private String proxyAddress;

		private String serverName;

		private Integer numProxySocketsConnected;

		private Integer maxProxySocketConnections;

		@Nullable
		private String clusterCredentials;

		public Builder() {
		}
		private Builder(ClusterRemoteProxyInfo instance) {
			this.connected = instance.connected;
			this.initialConnectTimeout = instance.initialConnectTimeout;
			this.skipUnavailable = instance.skipUnavailable;
			this.proxyAddress = instance.proxyAddress;
			this.serverName = instance.serverName;
			this.numProxySocketsConnected = instance.numProxySocketsConnected;
			this.maxProxySocketConnections = instance.maxProxySocketConnections;
			this.clusterCredentials = instance.clusterCredentials;

		}
		/**
		 * Required - If it is <code>true</code>, there is at least one open connection
		 * to the remote cluster. If it is <code>false</code>, it means that the cluster
		 * no longer has an open connection to the remote cluster. It does not
		 * necessarily mean that the remote cluster is down or unavailable, just that at
		 * some point a connection was lost.
		 * <p>
		 * API name: {@code connected}
		 */
		public final Builder connected(boolean value) {
			this.connected = value;
			return this;
		}

		/**
		 * Required - The initial connect timeout for remote cluster connections.
		 * <p>
		 * API name: {@code initial_connect_timeout}
		 */
		public final Builder initialConnectTimeout(Time value) {
			this.initialConnectTimeout = value;
			return this;
		}

		/**
		 * Required - The initial connect timeout for remote cluster connections.
		 * <p>
		 * API name: {@code initial_connect_timeout}
		 */
		public final Builder initialConnectTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.initialConnectTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - If <code>true</code>, cross-cluster search skips the remote
		 * cluster when its nodes are unavailable during the search and ignores errors
		 * returned by the remote cluster.
		 * <p>
		 * API name: {@code skip_unavailable}
		 */
		public final Builder skipUnavailable(boolean value) {
			this.skipUnavailable = value;
			return this;
		}

		/**
		 * Required - The address for remote connections when proxy mode is configured.
		 * <p>
		 * API name: {@code proxy_address}
		 */
		public final Builder proxyAddress(String value) {
			this.proxyAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code server_name}
		 */
		public final Builder serverName(String value) {
			this.serverName = value;
			return this;
		}

		/**
		 * Required - The number of open socket connections to the remote cluster when
		 * proxy mode is configured.
		 * <p>
		 * API name: {@code num_proxy_sockets_connected}
		 */
		public final Builder numProxySocketsConnected(int value) {
			this.numProxySocketsConnected = value;
			return this;
		}

		/**
		 * Required - The maximum number of socket connections to the remote cluster
		 * when proxy mode is configured.
		 * <p>
		 * API name: {@code max_proxy_socket_connections}
		 */
		public final Builder maxProxySocketConnections(int value) {
			this.maxProxySocketConnections = value;
			return this;
		}

		/**
		 * This field is present and has a value of <code>::es_redacted::</code> only
		 * when the remote cluster is configured with the API key based model.
		 * Otherwise, the field is not present.
		 * <p>
		 * API name: {@code cluster_credentials}
		 */
		public final Builder clusterCredentials(@Nullable String value) {
			this.clusterCredentials = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterRemoteProxyInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterRemoteProxyInfo build() {
			_checkSingleUse();

			return new ClusterRemoteProxyInfo(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterRemoteProxyInfo}
	 */
	public static final JsonpDeserializer<ClusterRemoteProxyInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterRemoteProxyInfo::setupClusterRemoteProxyInfoDeserializer);

	protected static void setupClusterRemoteProxyInfoDeserializer(
			ObjectDeserializer<ClusterRemoteProxyInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::initialConnectTimeout, Time._DESERIALIZER, "initial_connect_timeout");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::proxyAddress, JsonpDeserializer.stringDeserializer(), "proxy_address");
		op.add(Builder::serverName, JsonpDeserializer.stringDeserializer(), "server_name");
		op.add(Builder::numProxySocketsConnected, JsonpDeserializer.integerDeserializer(),
				"num_proxy_sockets_connected");
		op.add(Builder::maxProxySocketConnections, JsonpDeserializer.integerDeserializer(),
				"max_proxy_socket_connections");
		op.add(Builder::clusterCredentials, JsonpDeserializer.stringDeserializer(), "cluster_credentials");

		op.ignore("mode");
	}

}
