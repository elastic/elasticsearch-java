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
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.remote_info.ClusterRemoteSniffInfo
@JsonpDeserializable
public final class ClusterRemoteSniffInfo implements ClusterRemoteInfoVariant, JsonpSerializable {
	private final Boolean connected;

	private final Integer maxConnectionsPerCluster;

	private final Long numNodesConnected;

	private final String initialConnectTimeout;

	private final Boolean skipUnavailable;

	private final List<String> seeds;

	// ---------------------------------------------------------------------------------------------

	public ClusterRemoteSniffInfo(Builder builder) {

		this.connected = Objects.requireNonNull(builder.connected, "connected");
		this.maxConnectionsPerCluster = Objects.requireNonNull(builder.maxConnectionsPerCluster,
				"max_connections_per_cluster");
		this.numNodesConnected = Objects.requireNonNull(builder.numNodesConnected, "num_nodes_connected");
		this.initialConnectTimeout = Objects.requireNonNull(builder.initialConnectTimeout, "initial_connect_timeout");
		this.skipUnavailable = Objects.requireNonNull(builder.skipUnavailable, "skip_unavailable");
		this.seeds = Objects.requireNonNull(builder.seeds, "seeds");

	}

	/**
	 * {@link ClusterRemoteInfo} variant type
	 */
	@Override
	public String _variantType() {
		return "sniff";
	}

	/**
	 * API name: {@code connected}
	 */
	public Boolean connected() {
		return this.connected;
	}

	/**
	 * API name: {@code max_connections_per_cluster}
	 */
	public Integer maxConnectionsPerCluster() {
		return this.maxConnectionsPerCluster;
	}

	/**
	 * API name: {@code num_nodes_connected}
	 */
	public Long numNodesConnected() {
		return this.numNodesConnected;
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
	 * API name: {@code seeds}
	 */
	public List<String> seeds() {
		return this.seeds;
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

		generator.write("mode", "sniff");

		generator.writeKey("connected");
		generator.write(this.connected);

		generator.writeKey("max_connections_per_cluster");
		generator.write(this.maxConnectionsPerCluster);

		generator.writeKey("num_nodes_connected");
		generator.write(this.numNodesConnected);

		generator.writeKey("initial_connect_timeout");
		generator.write(this.initialConnectTimeout);

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

		generator.writeKey("seeds");
		generator.writeStartArray();
		for (String item0 : this.seeds) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterRemoteSniffInfo}.
	 */
	public static class Builder implements ObjectBuilder<ClusterRemoteSniffInfo> {
		private Boolean connected;

		private Integer maxConnectionsPerCluster;

		private Long numNodesConnected;

		private String initialConnectTimeout;

		private Boolean skipUnavailable;

		private List<String> seeds;

		/**
		 * API name: {@code connected}
		 */
		public Builder connected(Boolean value) {
			this.connected = value;
			return this;
		}

		/**
		 * API name: {@code max_connections_per_cluster}
		 */
		public Builder maxConnectionsPerCluster(Integer value) {
			this.maxConnectionsPerCluster = value;
			return this;
		}

		/**
		 * API name: {@code num_nodes_connected}
		 */
		public Builder numNodesConnected(Long value) {
			this.numNodesConnected = value;
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
		 * Builds a {@link ClusterRemoteSniffInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterRemoteSniffInfo build() {

			return new ClusterRemoteSniffInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterRemoteSniffInfo}
	 */
	public static final JsonpDeserializer<ClusterRemoteSniffInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterRemoteSniffInfo::setupClusterRemoteSniffInfoDeserializer, Builder::build);

	protected static void setupClusterRemoteSniffInfoDeserializer(
			DelegatingDeserializer<ClusterRemoteSniffInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::maxConnectionsPerCluster, JsonpDeserializer.integerDeserializer(),
				"max_connections_per_cluster");
		op.add(Builder::numNodesConnected, JsonpDeserializer.longDeserializer(), "num_nodes_connected");
		op.add(Builder::initialConnectTimeout, JsonpDeserializer.stringDeserializer(), "initial_connect_timeout");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::seeds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "seeds");

		op.ignore("mode");
	}

}
