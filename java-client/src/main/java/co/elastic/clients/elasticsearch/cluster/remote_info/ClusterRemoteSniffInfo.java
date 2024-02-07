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
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: cluster.remote_info.ClusterRemoteSniffInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.remote_info.ClusterRemoteSniffInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterRemoteSniffInfo implements ClusterRemoteInfoVariant, JsonpSerializable {
	private final boolean connected;

	private final int maxConnectionsPerCluster;

	private final long numNodesConnected;

	private final Time initialConnectTimeout;

	private final boolean skipUnavailable;

	private final List<String> seeds;

	// ---------------------------------------------------------------------------------------------

	private ClusterRemoteSniffInfo(Builder builder) {

		this.connected = ApiTypeHelper.requireNonNull(builder.connected, this, "connected");
		this.maxConnectionsPerCluster = ApiTypeHelper.requireNonNull(builder.maxConnectionsPerCluster, this,
				"maxConnectionsPerCluster");
		this.numNodesConnected = ApiTypeHelper.requireNonNull(builder.numNodesConnected, this, "numNodesConnected");
		this.initialConnectTimeout = ApiTypeHelper.requireNonNull(builder.initialConnectTimeout, this,
				"initialConnectTimeout");
		this.skipUnavailable = ApiTypeHelper.requireNonNull(builder.skipUnavailable, this, "skipUnavailable");
		this.seeds = ApiTypeHelper.unmodifiableRequired(builder.seeds, this, "seeds");

	}

	public static ClusterRemoteSniffInfo of(Function<Builder, ObjectBuilder<ClusterRemoteSniffInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ClusterRemoteInfo variant kind.
	 */
	@Override
	public ClusterRemoteInfo.Kind _clusterRemoteInfoKind() {
		return ClusterRemoteInfo.Kind.Sniff;
	}

	/**
	 * Required - API name: {@code connected}
	 */
	public final boolean connected() {
		return this.connected;
	}

	/**
	 * Required - API name: {@code max_connections_per_cluster}
	 */
	public final int maxConnectionsPerCluster() {
		return this.maxConnectionsPerCluster;
	}

	/**
	 * Required - API name: {@code num_nodes_connected}
	 */
	public final long numNodesConnected() {
		return this.numNodesConnected;
	}

	/**
	 * Required - API name: {@code initial_connect_timeout}
	 */
	public final Time initialConnectTimeout() {
		return this.initialConnectTimeout;
	}

	/**
	 * Required - API name: {@code skip_unavailable}
	 */
	public final boolean skipUnavailable() {
		return this.skipUnavailable;
	}

	/**
	 * Required - API name: {@code seeds}
	 */
	public final List<String> seeds() {
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
		this.initialConnectTimeout.serialize(generator, mapper);

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

		if (ApiTypeHelper.isDefined(this.seeds)) {
			generator.writeKey("seeds");
			generator.writeStartArray();
			for (String item0 : this.seeds) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterRemoteSniffInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterRemoteSniffInfo> {
		private Boolean connected;

		private Integer maxConnectionsPerCluster;

		private Long numNodesConnected;

		private Time initialConnectTimeout;

		private Boolean skipUnavailable;

		private List<String> seeds;

		/**
		 * Required - API name: {@code connected}
		 */
		public final Builder connected(boolean value) {
			this.connected = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_connections_per_cluster}
		 */
		public final Builder maxConnectionsPerCluster(int value) {
			this.maxConnectionsPerCluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_nodes_connected}
		 */
		public final Builder numNodesConnected(long value) {
			this.numNodesConnected = value;
			return this;
		}

		/**
		 * Required - API name: {@code initial_connect_timeout}
		 */
		public final Builder initialConnectTimeout(Time value) {
			this.initialConnectTimeout = value;
			return this;
		}

		/**
		 * Required - API name: {@code initial_connect_timeout}
		 */
		public final Builder initialConnectTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.initialConnectTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code skip_unavailable}
		 */
		public final Builder skipUnavailable(boolean value) {
			this.skipUnavailable = value;
			return this;
		}

		/**
		 * Required - API name: {@code seeds}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>seeds</code>.
		 */
		public final Builder seeds(List<String> list) {
			this.seeds = _listAddAll(this.seeds, list);
			return this;
		}

		/**
		 * Required - API name: {@code seeds}
		 * <p>
		 * Adds one or more values to <code>seeds</code>.
		 */
		public final Builder seeds(String value, String... values) {
			this.seeds = _listAdd(this.seeds, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterRemoteSniffInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterRemoteSniffInfo build() {
			_checkSingleUse();

			return new ClusterRemoteSniffInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterRemoteSniffInfo}
	 */
	public static final JsonpDeserializer<ClusterRemoteSniffInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterRemoteSniffInfo::setupClusterRemoteSniffInfoDeserializer);

	protected static void setupClusterRemoteSniffInfoDeserializer(
			ObjectDeserializer<ClusterRemoteSniffInfo.Builder> op) {

		op.add(Builder::connected, JsonpDeserializer.booleanDeserializer(), "connected");
		op.add(Builder::maxConnectionsPerCluster, JsonpDeserializer.integerDeserializer(),
				"max_connections_per_cluster");
		op.add(Builder::numNodesConnected, JsonpDeserializer.longDeserializer(), "num_nodes_connected");
		op.add(Builder::initialConnectTimeout, Time._DESERIALIZER, "initial_connect_timeout");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::seeds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "seeds");

		op.ignore("mode");
	}

}
