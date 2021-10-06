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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._core.search_shards.ShardStoreIndex;
import co.elastic.clients.elasticsearch._types.NodeAttributes;
import co.elastic.clients.elasticsearch._types.NodeShard;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search_shards.Response
@JsonpDeserializable
public final class SearchShardsResponse implements JsonpSerializable {
	private final Map<String, NodeAttributes> nodes;

	private final List<List<NodeShard>> shards;

	private final Map<String, ShardStoreIndex> indices;

	// ---------------------------------------------------------------------------------------------

	public SearchShardsResponse(Builder builder) {

		this.nodes = ModelTypeHelper.unmodifiableNonNull(builder.nodes, "nodes");
		this.shards = ModelTypeHelper.unmodifiableNonNull(builder.shards, "shards");
		this.indices = ModelTypeHelper.unmodifiableNonNull(builder.indices, "indices");

	}

	public SearchShardsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public Map<String, NodeAttributes> nodes() {
		return this.nodes;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public List<List<NodeShard>> shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public Map<String, ShardStoreIndex> indices() {
		return this.indices;
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

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, NodeAttributes> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("shards");
		generator.writeStartArray();
		for (List<NodeShard> item0 : this.shards) {
			generator.writeStartArray();
			for (NodeShard item1 : item0) {
				item1.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("indices");
		generator.writeStartObject();
		for (Map.Entry<String, ShardStoreIndex> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchShardsResponse}.
	 */
	public static class Builder implements ObjectBuilder<SearchShardsResponse> {
		private Map<String, NodeAttributes> nodes;

		private List<List<NodeShard>> shards;

		private Map<String, ShardStoreIndex> indices;

		/**
		 * Required - API name: {@code nodes}
		 */
		public Builder nodes(Map<String, NodeAttributes> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, NodeAttributes value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new NodeAttributes.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.putNodes(key, fn.apply(new NodeAttributes.Builder()).build());
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public Builder shards(List<List<NodeShard>> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public Builder shards(List<NodeShard>... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #shards(List)}, creating the list if needed.
		 */
		public Builder addShards(List<NodeShard> value) {
			if (this.shards == null) {
				this.shards = new ArrayList<>();
			}
			this.shards.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public Builder indices(Map<String, ShardStoreIndex> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, ShardStoreIndex value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<ShardStoreIndex.Builder, ObjectBuilder<ShardStoreIndex>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new ShardStoreIndex.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, Function<ShardStoreIndex.Builder, ObjectBuilder<ShardStoreIndex>> fn) {
			return this.putIndices(key, fn.apply(new ShardStoreIndex.Builder()).build());
		}

		/**
		 * Builds a {@link SearchShardsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchShardsResponse build() {

			return new SearchShardsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchShardsResponse}
	 */
	public static final JsonpDeserializer<SearchShardsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchShardsResponse::setupSearchShardsResponseDeserializer, Builder::build);

	protected static void setupSearchShardsResponseDeserializer(
			DelegatingDeserializer<SearchShardsResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(NodeAttributes._DESERIALIZER), "nodes");
		op.add(Builder::shards,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.arrayDeserializer(NodeShard._DESERIALIZER)),
				"shards");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(ShardStoreIndex._DESERIALIZER), "indices");

	}

}
