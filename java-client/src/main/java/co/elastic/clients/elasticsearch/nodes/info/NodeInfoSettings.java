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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettings
public final class NodeInfoSettings implements JsonpSerializable {
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

	public NodeInfoSettings(Builder builder) {

		this.cluster = Objects.requireNonNull(builder.cluster, "cluster");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.path = Objects.requireNonNull(builder.path, "path");
		this.repositories = builder.repositories;
		this.discovery = builder.discovery;
		this.action = builder.action;
		this.client = Objects.requireNonNull(builder.client, "client");
		this.http = Objects.requireNonNull(builder.http, "http");
		this.bootstrap = builder.bootstrap;
		this.transport = Objects.requireNonNull(builder.transport, "transport");
		this.network = builder.network;
		this.xpack = builder.xpack;
		this.script = builder.script;
		this.search = builder.search;
		this.ingest = builder.ingest;

	}

	/**
	 * API name: {@code cluster}
	 */
	public NodeInfoSettingsCluster cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code node}
	 */
	public NodeInfoSettingsNode node() {
		return this.node;
	}

	/**
	 * API name: {@code path}
	 */
	public NodeInfoPath path() {
		return this.path;
	}

	/**
	 * API name: {@code repositories}
	 */
	@Nullable
	public NodeInfoRepositories repositories() {
		return this.repositories;
	}

	/**
	 * API name: {@code discovery}
	 */
	@Nullable
	public NodeInfoDiscover discovery() {
		return this.discovery;
	}

	/**
	 * API name: {@code action}
	 */
	@Nullable
	public NodeInfoAction action() {
		return this.action;
	}

	/**
	 * API name: {@code client}
	 */
	public NodeInfoClient client() {
		return this.client;
	}

	/**
	 * API name: {@code http}
	 */
	public NodeInfoSettingsHttp http() {
		return this.http;
	}

	/**
	 * API name: {@code bootstrap}
	 */
	@Nullable
	public NodeInfoBootstrap bootstrap() {
		return this.bootstrap;
	}

	/**
	 * API name: {@code transport}
	 */
	public NodeInfoSettingsTransport transport() {
		return this.transport;
	}

	/**
	 * API name: {@code network}
	 */
	@Nullable
	public NodeInfoSettingsNetwork network() {
		return this.network;
	}

	/**
	 * API name: {@code xpack}
	 */
	@Nullable
	public NodeInfoXpack xpack() {
		return this.xpack;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public NodeInfoScript script() {
		return this.script;
	}

	/**
	 * API name: {@code search}
	 */
	@Nullable
	public NodeInfoSearch search() {
		return this.search;
	}

	/**
	 * API name: {@code ingest}
	 */
	@Nullable
	public NodeInfoSettingsIngest ingest() {
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
	public static class Builder implements ObjectBuilder<NodeInfoSettings> {
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
		 * API name: {@code cluster}
		 */
		public Builder cluster(NodeInfoSettingsCluster value) {
			this.cluster = value;
			return this;
		}

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(Function<NodeInfoSettingsCluster.Builder, ObjectBuilder<NodeInfoSettingsCluster>> fn) {
			return this.cluster(fn.apply(new NodeInfoSettingsCluster.Builder()).build());
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(NodeInfoSettingsNode value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(Function<NodeInfoSettingsNode.Builder, ObjectBuilder<NodeInfoSettingsNode>> fn) {
			return this.node(fn.apply(new NodeInfoSettingsNode.Builder()).build());
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(NodeInfoPath value) {
			this.path = value;
			return this;
		}

		/**
		 * API name: {@code path}
		 */
		public Builder path(Function<NodeInfoPath.Builder, ObjectBuilder<NodeInfoPath>> fn) {
			return this.path(fn.apply(new NodeInfoPath.Builder()).build());
		}

		/**
		 * API name: {@code repositories}
		 */
		public Builder repositories(@Nullable NodeInfoRepositories value) {
			this.repositories = value;
			return this;
		}

		/**
		 * API name: {@code repositories}
		 */
		public Builder repositories(Function<NodeInfoRepositories.Builder, ObjectBuilder<NodeInfoRepositories>> fn) {
			return this.repositories(fn.apply(new NodeInfoRepositories.Builder()).build());
		}

		/**
		 * API name: {@code discovery}
		 */
		public Builder discovery(@Nullable NodeInfoDiscover value) {
			this.discovery = value;
			return this;
		}

		/**
		 * API name: {@code discovery}
		 */
		public Builder discovery(Function<NodeInfoDiscover.Builder, ObjectBuilder<NodeInfoDiscover>> fn) {
			return this.discovery(fn.apply(new NodeInfoDiscover.Builder()).build());
		}

		/**
		 * API name: {@code action}
		 */
		public Builder action(@Nullable NodeInfoAction value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code action}
		 */
		public Builder action(Function<NodeInfoAction.Builder, ObjectBuilder<NodeInfoAction>> fn) {
			return this.action(fn.apply(new NodeInfoAction.Builder()).build());
		}

		/**
		 * API name: {@code client}
		 */
		public Builder client(NodeInfoClient value) {
			this.client = value;
			return this;
		}

		/**
		 * API name: {@code client}
		 */
		public Builder client(Function<NodeInfoClient.Builder, ObjectBuilder<NodeInfoClient>> fn) {
			return this.client(fn.apply(new NodeInfoClient.Builder()).build());
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(NodeInfoSettingsHttp value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(Function<NodeInfoSettingsHttp.Builder, ObjectBuilder<NodeInfoSettingsHttp>> fn) {
			return this.http(fn.apply(new NodeInfoSettingsHttp.Builder()).build());
		}

		/**
		 * API name: {@code bootstrap}
		 */
		public Builder bootstrap(@Nullable NodeInfoBootstrap value) {
			this.bootstrap = value;
			return this;
		}

		/**
		 * API name: {@code bootstrap}
		 */
		public Builder bootstrap(Function<NodeInfoBootstrap.Builder, ObjectBuilder<NodeInfoBootstrap>> fn) {
			return this.bootstrap(fn.apply(new NodeInfoBootstrap.Builder()).build());
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(NodeInfoSettingsTransport value) {
			this.transport = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(
				Function<NodeInfoSettingsTransport.Builder, ObjectBuilder<NodeInfoSettingsTransport>> fn) {
			return this.transport(fn.apply(new NodeInfoSettingsTransport.Builder()).build());
		}

		/**
		 * API name: {@code network}
		 */
		public Builder network(@Nullable NodeInfoSettingsNetwork value) {
			this.network = value;
			return this;
		}

		/**
		 * API name: {@code network}
		 */
		public Builder network(Function<NodeInfoSettingsNetwork.Builder, ObjectBuilder<NodeInfoSettingsNetwork>> fn) {
			return this.network(fn.apply(new NodeInfoSettingsNetwork.Builder()).build());
		}

		/**
		 * API name: {@code xpack}
		 */
		public Builder xpack(@Nullable NodeInfoXpack value) {
			this.xpack = value;
			return this;
		}

		/**
		 * API name: {@code xpack}
		 */
		public Builder xpack(Function<NodeInfoXpack.Builder, ObjectBuilder<NodeInfoXpack>> fn) {
			return this.xpack(fn.apply(new NodeInfoXpack.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable NodeInfoScript value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(Function<NodeInfoScript.Builder, ObjectBuilder<NodeInfoScript>> fn) {
			return this.script(fn.apply(new NodeInfoScript.Builder()).build());
		}

		/**
		 * API name: {@code search}
		 */
		public Builder search(@Nullable NodeInfoSearch value) {
			this.search = value;
			return this;
		}

		/**
		 * API name: {@code search}
		 */
		public Builder search(Function<NodeInfoSearch.Builder, ObjectBuilder<NodeInfoSearch>> fn) {
			return this.search(fn.apply(new NodeInfoSearch.Builder()).build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(@Nullable NodeInfoSettingsIngest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Function<NodeInfoSettingsIngest.Builder, ObjectBuilder<NodeInfoSettingsIngest>> fn) {
			return this.ingest(fn.apply(new NodeInfoSettingsIngest.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettings build() {

			return new NodeInfoSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSettings}
	 */
	public static final JsonpDeserializer<NodeInfoSettings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSettings::setupNodeInfoSettingsDeserializer);

	protected static void setupNodeInfoSettingsDeserializer(DelegatingDeserializer<NodeInfoSettings.Builder> op) {

		op.add(Builder::cluster, NodeInfoSettingsCluster.DESERIALIZER, "cluster");
		op.add(Builder::node, NodeInfoSettingsNode.DESERIALIZER, "node");
		op.add(Builder::path, NodeInfoPath.DESERIALIZER, "path");
		op.add(Builder::repositories, NodeInfoRepositories.DESERIALIZER, "repositories");
		op.add(Builder::discovery, NodeInfoDiscover.DESERIALIZER, "discovery");
		op.add(Builder::action, NodeInfoAction.DESERIALIZER, "action");
		op.add(Builder::client, NodeInfoClient.DESERIALIZER, "client");
		op.add(Builder::http, NodeInfoSettingsHttp.DESERIALIZER, "http");
		op.add(Builder::bootstrap, NodeInfoBootstrap.DESERIALIZER, "bootstrap");
		op.add(Builder::transport, NodeInfoSettingsTransport.DESERIALIZER, "transport");
		op.add(Builder::network, NodeInfoSettingsNetwork.DESERIALIZER, "network");
		op.add(Builder::xpack, NodeInfoXpack.DESERIALIZER, "xpack");
		op.add(Builder::script, NodeInfoScript.DESERIALIZER, "script");
		op.add(Builder::search, NodeInfoSearch.DESERIALIZER, "search");
		op.add(Builder::ingest, NodeInfoSettingsIngest.DESERIALIZER, "ingest");

	}

}
