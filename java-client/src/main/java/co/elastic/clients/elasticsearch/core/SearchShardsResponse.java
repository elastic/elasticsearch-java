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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.NodeAttributes;
import co.elastic.clients.elasticsearch._types.NodeShard;
import co.elastic.clients.elasticsearch.core.search_shards.ShardStoreIndex;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search_shards.Response
@JsonpDeserializable
public class SearchShardsResponse implements JsonpSerializable {
	private final Map<String, NodeAttributes> nodes;

	private final List<List<NodeShard>> shards;

	private final Map<String, ShardStoreIndex> indices;

	// ---------------------------------------------------------------------------------------------

	private SearchShardsResponse(Builder builder) {

		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");
		this.shards = ModelTypeHelper.unmodifiableRequired(builder.shards, this, "shards");
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static SearchShardsResponse of(Function<Builder, ObjectBuilder<SearchShardsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, NodeAttributes> nodes() {
		return this.nodes;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final List<List<NodeShard>> shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, ShardStoreIndex> indices() {
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

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, NodeAttributes> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartArray();
			for (List<NodeShard> item0 : this.shards) {
				generator.writeStartArray();
				if (item0 != null) {
					for (NodeShard item1 : item0) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, ShardStoreIndex> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchShardsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SearchShardsResponse> {
		private Map<String, NodeAttributes> nodes;

		private List<List<NodeShard>> shards;

		private Map<String, ShardStoreIndex> indices;

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, NodeAttributes> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new NodeAttributes.Builder()).build()));
		}

		public final Builder nodes(
				Function<MapBuilder<String, NodeAttributes, NodeAttributes.Builder>, ObjectBuilder<Map<String, NodeAttributes>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(NodeAttributes.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(List<List<NodeShard>> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(List<NodeShard>... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(Map<String, ShardStoreIndex> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<ShardStoreIndex.Builder, ObjectBuilder<ShardStoreIndex>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new ShardStoreIndex.Builder()).build()));
		}

		public final Builder indices(
				Function<MapBuilder<String, ShardStoreIndex, ShardStoreIndex.Builder>, ObjectBuilder<Map<String, ShardStoreIndex>>> fn) {
			return indices(fn.apply(new MapBuilder<>(ShardStoreIndex.Builder::new)).build());
		}

		/**
		 * Builds a {@link SearchShardsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchShardsResponse build() {
			_checkSingleUse();

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
