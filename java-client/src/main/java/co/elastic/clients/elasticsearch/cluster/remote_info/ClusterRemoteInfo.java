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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.remote_info.ClusterRemoteInfo
public final class ClusterRemoteInfo implements ToJsonp {
	private final Boolean connected;

	private final JsonValue initialConnectTimeout;

	private final Number maxConnectionsPerCluster;

	private final Number numNodesConnected;

	private final List<String> seeds;

	private final Boolean skipUnavailable;

	// ---------------------------------------------------------------------------------------------

	protected ClusterRemoteInfo(Builder builder) {

		this.connected = Objects.requireNonNull(builder.connected, "connected");
		this.initialConnectTimeout = Objects.requireNonNull(builder.initialConnectTimeout, "initial_connect_timeout");
		this.maxConnectionsPerCluster = Objects.requireNonNull(builder.maxConnectionsPerCluster,
				"max_connections_per_cluster");
		this.numNodesConnected = Objects.requireNonNull(builder.numNodesConnected, "num_nodes_connected");
		this.seeds = Objects.requireNonNull(builder.seeds, "seeds");
		this.skipUnavailable = Objects.requireNonNull(builder.skipUnavailable, "skip_unavailable");

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
	public JsonValue initialConnectTimeout() {
		return this.initialConnectTimeout;
	}

	/**
	 * API name: {@code max_connections_per_cluster}
	 */
	public Number maxConnectionsPerCluster() {
		return this.maxConnectionsPerCluster;
	}

	/**
	 * API name: {@code num_nodes_connected}
	 */
	public Number numNodesConnected() {
		return this.numNodesConnected;
	}

	/**
	 * API name: {@code seeds}
	 */
	public List<String> seeds() {
		return this.seeds;
	}

	/**
	 * API name: {@code skip_unavailable}
	 */
	public Boolean skipUnavailable() {
		return this.skipUnavailable;
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

		generator.writeKey("connected");
		generator.write(this.connected);

		generator.writeKey("initial_connect_timeout");
		generator.write(this.initialConnectTimeout);

		generator.writeKey("max_connections_per_cluster");
		generator.write(this.maxConnectionsPerCluster.doubleValue());

		generator.writeKey("num_nodes_connected");
		generator.write(this.numNodesConnected.doubleValue());

		generator.writeKey("seeds");
		generator.writeStartArray();
		for (String item0 : this.seeds) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterRemoteInfo}.
	 */
	public static class Builder implements ObjectBuilder<ClusterRemoteInfo> {
		private Boolean connected;

		private JsonValue initialConnectTimeout;

		private Number maxConnectionsPerCluster;

		private Number numNodesConnected;

		private List<String> seeds;

		private Boolean skipUnavailable;

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
		public Builder initialConnectTimeout(JsonValue value) {
			this.initialConnectTimeout = value;
			return this;
		}

		/**
		 * API name: {@code max_connections_per_cluster}
		 */
		public Builder maxConnectionsPerCluster(Number value) {
			this.maxConnectionsPerCluster = value;
			return this;
		}

		/**
		 * API name: {@code num_nodes_connected}
		 */
		public Builder numNodesConnected(Number value) {
			this.numNodesConnected = value;
			return this;
		}

		/**
		 * API name: {@code seeds}
		 */
		public Builder seeds(List<String> value) {
			this.seeds = value;
			return this;
		}

		/**
		 * API name: {@code seeds}
		 */
		public Builder seeds(String... value) {
			this.seeds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #seeds(List)}, creating the list if needed.
		 */
		public Builder addSeeds(String value) {
			if (this.seeds == null) {
				this.seeds = new ArrayList<>();
			}
			this.seeds.add(value);
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
		 * Builds a {@link ClusterRemoteInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterRemoteInfo build() {

			return new ClusterRemoteInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterRemoteInfo
	 */
	public static final JsonpDeserializer<ClusterRemoteInfo> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterRemoteInfo::setupClusterRemoteInfoDeserializer);

	protected static void setupClusterRemoteInfoDeserializer(DelegatingDeserializer<ClusterRemoteInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::initialConnectTimeout, JsonpDeserializer.jsonValueDeserializer(), "initial_connect_timeout");
		op.add(Builder::maxConnectionsPerCluster, JsonpDeserializer.numberDeserializer(),
				"max_connections_per_cluster");
		op.add(Builder::numNodesConnected, JsonpDeserializer.numberDeserializer(), "num_nodes_connected");
		op.add(Builder::seeds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "seeds");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");

	}

}
