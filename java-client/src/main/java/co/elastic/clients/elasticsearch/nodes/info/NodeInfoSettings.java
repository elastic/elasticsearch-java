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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettings
@JsonpDeserializable
public class NodeInfoSettings implements JsonpSerializable {
	private final NodeInfoSettingsCluster cluster;

	private final NodeInfoSettingsNode node;

	private final NodeInfoPath path;

	@Nullable
	private final NodeInfoRepositories repositories;

	@Nullable
	private final NodeInfoDiscover discovery;

	@Nullable
	private final NodeInfoAction action;

	private final NodeInfoClient client;

	private final NodeInfoSettingsHttp http;

	@Nullable
	private final NodeInfoBootstrap bootstrap;

	private final NodeInfoSettingsTransport transport;

	@Nullable
	private final NodeInfoSettingsNetwork network;

	@Nullable
	private final NodeInfoXpack xpack;

	@Nullable
	private final NodeInfoScript script;

	@Nullable
	private final NodeInfoSearch search;

	@Nullable
	private final NodeInfoSettingsIngest ingest;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoSettings(Builder builder) {

		this.cluster = ModelTypeHelper.requireNonNull(builder.cluster, this, "cluster");
		this.node = ModelTypeHelper.requireNonNull(builder.node, this, "node");
		this.path = ModelTypeHelper.requireNonNull(builder.path, this, "path");
		this.repositories = builder.repositories;
		this.discovery = builder.discovery;
		this.action = builder.action;
		this.client = ModelTypeHelper.requireNonNull(builder.client, this, "client");
		this.http = ModelTypeHelper.requireNonNull(builder.http, this, "http");
		this.bootstrap = builder.bootstrap;
		this.transport = ModelTypeHelper.requireNonNull(builder.transport, this, "transport");
		this.network = builder.network;
		this.xpack = builder.xpack;
		this.script = builder.script;
		this.search = builder.search;
		this.ingest = builder.ingest;

	}

	public static NodeInfoSettings of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code cluster}
	 */
	public final NodeInfoSettingsCluster cluster() {
		return this.cluster;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final NodeInfoSettingsNode node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public final NodeInfoPath path() {
		return this.path;
	}

	/**
	 * API name: {@code repositories}
	 */
	@Nullable
	public final NodeInfoRepositories repositories() {
		return this.repositories;
	}

	/**
	 * API name: {@code discovery}
	 */
	@Nullable
	public final NodeInfoDiscover discovery() {
		return this.discovery;
	}

	/**
	 * API name: {@code action}
	 */
	@Nullable
	public final NodeInfoAction action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code client}
	 */
	public final NodeInfoClient client() {
		return this.client;
	}

	/**
	 * Required - API name: {@code http}
	 */
	public final NodeInfoSettingsHttp http() {
		return this.http;
	}

	/**
	 * API name: {@code bootstrap}
	 */
	@Nullable
	public final NodeInfoBootstrap bootstrap() {
		return this.bootstrap;
	}

	/**
	 * Required - API name: {@code transport}
	 */
	public final NodeInfoSettingsTransport transport() {
		return this.transport;
	}

	/**
	 * API name: {@code network}
	 */
	@Nullable
	public final NodeInfoSettingsNetwork network() {
		return this.network;
	}

	/**
	 * API name: {@code xpack}
	 */
	@Nullable
	public final NodeInfoXpack xpack() {
		return this.xpack;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final NodeInfoScript script() {
		return this.script;
	}

	/**
	 * API name: {@code search}
	 */
	@Nullable
	public final NodeInfoSearch search() {
		return this.search;
	}

	/**
	 * API name: {@code ingest}
	 */
	@Nullable
	public final NodeInfoSettingsIngest ingest() {
		return this.ingest;
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

		generator.writeKey("cluster");
		this.cluster.serialize(generator, mapper);

		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		generator.writeKey("path");
		this.path.serialize(generator, mapper);

		if (this.repositories != null) {
			generator.writeKey("repositories");
			this.repositories.serialize(generator, mapper);

		}
		if (this.discovery != null) {
			generator.writeKey("discovery");
			this.discovery.serialize(generator, mapper);

		}
		if (this.action != null) {
			generator.writeKey("action");
			this.action.serialize(generator, mapper);

		}
		generator.writeKey("client");
		this.client.serialize(generator, mapper);

		generator.writeKey("http");
		this.http.serialize(generator, mapper);

		if (this.bootstrap != null) {
			generator.writeKey("bootstrap");
			this.bootstrap.serialize(generator, mapper);

		}
		generator.writeKey("transport");
		this.transport.serialize(generator, mapper);

		if (this.network != null) {
			generator.writeKey("network");
			this.network.serialize(generator, mapper);

		}
		if (this.xpack != null) {
			generator.writeKey("xpack");
			this.xpack.serialize(generator, mapper);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.search != null) {
			generator.writeKey("search");
			this.search.serialize(generator, mapper);

		}
		if (this.ingest != null) {
			generator.writeKey("ingest");
			this.ingest.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettings}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeInfoSettings> {
		private NodeInfoSettingsCluster cluster;

		private NodeInfoSettingsNode node;

		private NodeInfoPath path;

		@Nullable
		private NodeInfoRepositories repositories;

		@Nullable
		private NodeInfoDiscover discovery;

		@Nullable
		private NodeInfoAction action;

		private NodeInfoClient client;

		private NodeInfoSettingsHttp http;

		@Nullable
		private NodeInfoBootstrap bootstrap;

		private NodeInfoSettingsTransport transport;

		@Nullable
		private NodeInfoSettingsNetwork network;

		@Nullable
		private NodeInfoXpack xpack;

		@Nullable
		private NodeInfoScript script;

		@Nullable
		private NodeInfoSearch search;

		@Nullable
		private NodeInfoSettingsIngest ingest;

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(NodeInfoSettingsCluster value) {
			this.cluster = value;
			return this;
		}

		/**
		 * Required - API name: {@code cluster}
		 */
		public final Builder cluster(Consumer<NodeInfoSettingsCluster.Builder> fn) {
			NodeInfoSettingsCluster.Builder builder = new NodeInfoSettingsCluster.Builder();
			fn.accept(builder);
			return this.cluster(builder.build());
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(NodeInfoSettingsNode value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(Consumer<NodeInfoSettingsNode.Builder> fn) {
			NodeInfoSettingsNode.Builder builder = new NodeInfoSettingsNode.Builder();
			fn.accept(builder);
			return this.node(builder.build());
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(NodeInfoPath value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public final Builder path(Consumer<NodeInfoPath.Builder> fn) {
			NodeInfoPath.Builder builder = new NodeInfoPath.Builder();
			fn.accept(builder);
			return this.path(builder.build());
		}

		/**
		 * API name: {@code repositories}
		 */
		public final Builder repositories(@Nullable NodeInfoRepositories value) {
			this.repositories = value;
			return this;
		}

		/**
		 * API name: {@code repositories}
		 */
		public final Builder repositories(Consumer<NodeInfoRepositories.Builder> fn) {
			NodeInfoRepositories.Builder builder = new NodeInfoRepositories.Builder();
			fn.accept(builder);
			return this.repositories(builder.build());
		}

		/**
		 * API name: {@code discovery}
		 */
		public final Builder discovery(@Nullable NodeInfoDiscover value) {
			this.discovery = value;
			return this;
		}

		/**
		 * API name: {@code discovery}
		 */
		public final Builder discovery(Consumer<NodeInfoDiscover.Builder> fn) {
			NodeInfoDiscover.Builder builder = new NodeInfoDiscover.Builder();
			fn.accept(builder);
			return this.discovery(builder.build());
		}

		/**
		 * API name: {@code action}
		 */
		public final Builder action(@Nullable NodeInfoAction value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code action}
		 */
		public final Builder action(Consumer<NodeInfoAction.Builder> fn) {
			NodeInfoAction.Builder builder = new NodeInfoAction.Builder();
			fn.accept(builder);
			return this.action(builder.build());
		}

		/**
		 * Required - API name: {@code client}
		 */
		public final Builder client(NodeInfoClient value) {
			this.client = value;
			return this;
		}

		/**
		 * Required - API name: {@code client}
		 */
		public final Builder client(Consumer<NodeInfoClient.Builder> fn) {
			NodeInfoClient.Builder builder = new NodeInfoClient.Builder();
			fn.accept(builder);
			return this.client(builder.build());
		}

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(NodeInfoSettingsHttp value) {
			this.http = value;
			return this;
		}

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(Consumer<NodeInfoSettingsHttp.Builder> fn) {
			NodeInfoSettingsHttp.Builder builder = new NodeInfoSettingsHttp.Builder();
			fn.accept(builder);
			return this.http(builder.build());
		}

		/**
		 * API name: {@code bootstrap}
		 */
		public final Builder bootstrap(@Nullable NodeInfoBootstrap value) {
			this.bootstrap = value;
			return this;
		}

		/**
		 * API name: {@code bootstrap}
		 */
		public final Builder bootstrap(Consumer<NodeInfoBootstrap.Builder> fn) {
			NodeInfoBootstrap.Builder builder = new NodeInfoBootstrap.Builder();
			fn.accept(builder);
			return this.bootstrap(builder.build());
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(NodeInfoSettingsTransport value) {
			this.transport = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(Consumer<NodeInfoSettingsTransport.Builder> fn) {
			NodeInfoSettingsTransport.Builder builder = new NodeInfoSettingsTransport.Builder();
			fn.accept(builder);
			return this.transport(builder.build());
		}

		/**
		 * API name: {@code network}
		 */
		public final Builder network(@Nullable NodeInfoSettingsNetwork value) {
			this.network = value;
			return this;
		}

		/**
		 * API name: {@code network}
		 */
		public final Builder network(Consumer<NodeInfoSettingsNetwork.Builder> fn) {
			NodeInfoSettingsNetwork.Builder builder = new NodeInfoSettingsNetwork.Builder();
			fn.accept(builder);
			return this.network(builder.build());
		}

		/**
		 * API name: {@code xpack}
		 */
		public final Builder xpack(@Nullable NodeInfoXpack value) {
			this.xpack = value;
			return this;
		}

		/**
		 * API name: {@code xpack}
		 */
		public final Builder xpack(Consumer<NodeInfoXpack.Builder> fn) {
			NodeInfoXpack.Builder builder = new NodeInfoXpack.Builder();
			fn.accept(builder);
			return this.xpack(builder.build());
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable NodeInfoScript value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Consumer<NodeInfoScript.Builder> fn) {
			NodeInfoScript.Builder builder = new NodeInfoScript.Builder();
			fn.accept(builder);
			return this.script(builder.build());
		}

		/**
		 * API name: {@code search}
		 */
		public final Builder search(@Nullable NodeInfoSearch value) {
			this.search = value;
			return this;
		}

		/**
		 * API name: {@code search}
		 */
		public final Builder search(Consumer<NodeInfoSearch.Builder> fn) {
			NodeInfoSearch.Builder builder = new NodeInfoSearch.Builder();
			fn.accept(builder);
			return this.search(builder.build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public final Builder ingest(@Nullable NodeInfoSettingsIngest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public final Builder ingest(Consumer<NodeInfoSettingsIngest.Builder> fn) {
			NodeInfoSettingsIngest.Builder builder = new NodeInfoSettingsIngest.Builder();
			fn.accept(builder);
			return this.ingest(builder.build());
		}

		/**
		 * Builds a {@link NodeInfoSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettings build() {
			_checkSingleUse();

			return new NodeInfoSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettings}
	 */
	public static final JsonpDeserializer<NodeInfoSettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoSettings::setupNodeInfoSettingsDeserializer);

	protected static void setupNodeInfoSettingsDeserializer(ObjectDeserializer<NodeInfoSettings.Builder> op) {

		op.add(Builder::cluster, NodeInfoSettingsCluster._DESERIALIZER, "cluster");
		op.add(Builder::node, NodeInfoSettingsNode._DESERIALIZER, "node");
		op.add(Builder::path, NodeInfoPath._DESERIALIZER, "path");
		op.add(Builder::repositories, NodeInfoRepositories._DESERIALIZER, "repositories");
		op.add(Builder::discovery, NodeInfoDiscover._DESERIALIZER, "discovery");
		op.add(Builder::action, NodeInfoAction._DESERIALIZER, "action");
		op.add(Builder::client, NodeInfoClient._DESERIALIZER, "client");
		op.add(Builder::http, NodeInfoSettingsHttp._DESERIALIZER, "http");
		op.add(Builder::bootstrap, NodeInfoBootstrap._DESERIALIZER, "bootstrap");
		op.add(Builder::transport, NodeInfoSettingsTransport._DESERIALIZER, "transport");
		op.add(Builder::network, NodeInfoSettingsNetwork._DESERIALIZER, "network");
		op.add(Builder::xpack, NodeInfoXpack._DESERIALIZER, "xpack");
		op.add(Builder::script, NodeInfoScript._DESERIALIZER, "script");
		op.add(Builder::search, NodeInfoSearch._DESERIALIZER, "search");
		op.add(Builder::ingest, NodeInfoSettingsIngest._DESERIALIZER, "ingest");

	}

}
