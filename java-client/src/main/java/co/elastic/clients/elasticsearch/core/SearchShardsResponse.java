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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.NodeShard;
import co.elastic.clients.elasticsearch.core.search_shards.SearchShardsNodeAttributes;
import co.elastic.clients.elasticsearch.core.search_shards.ShardStoreIndex;
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
import java.util.List;
import java.util.Map;
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

// typedef: _global.search_shards.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#_global.search_shards.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchShardsResponse implements JsonpSerializable {
	private final Map<String, SearchShardsNodeAttributes> nodes;

	private final List<List<NodeShard>> shards;

	private final Map<String, ShardStoreIndex> indices;

	// ---------------------------------------------------------------------------------------------

	private SearchShardsResponse(Builder builder) {

		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");
		this.shards = ApiTypeHelper.unmodifiableRequired(builder.shards, this, "shards");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static SearchShardsResponse of(Function<Builder, ObjectBuilder<SearchShardsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, SearchShardsNodeAttributes> nodes() {
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

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, SearchShardsNodeAttributes> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.shards)) {
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
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, ShardStoreIndex> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link SearchShardsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchShardsResponse> {
		private Map<String, SearchShardsNodeAttributes> nodes;

		private List<List<NodeShard>> shards;

		private Map<String, ShardStoreIndex> indices;

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final Builder nodes(Map<String, SearchShardsNodeAttributes> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final Builder nodes(String key, SearchShardsNodeAttributes value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(String key,
				Function<SearchShardsNodeAttributes.Builder, ObjectBuilder<SearchShardsNodeAttributes>> fn) {
			return nodes(key, fn.apply(new SearchShardsNodeAttributes.Builder()).build());
		}

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>shards</code>.
		 */
		public final Builder shards(List<List<NodeShard>> list) {
			this.shards = _listAddAll(this.shards, list);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds one or more values to <code>shards</code>.
		 */
		public final Builder shards(List<NodeShard> value, List<NodeShard>... values) {
			this.shards = _listAdd(this.shards, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indices</code>.
		 */
		public final Builder indices(Map<String, ShardStoreIndex> map) {
			this.indices = _mapPutAll(this.indices, map);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code>.
		 */
		public final Builder indices(String key, ShardStoreIndex value) {
			this.indices = _mapPut(this.indices, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(String key, Function<ShardStoreIndex.Builder, ObjectBuilder<ShardStoreIndex>> fn) {
			return indices(key, fn.apply(new ShardStoreIndex.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
			.lazy(Builder::new, SearchShardsResponse::setupSearchShardsResponseDeserializer);

	protected static void setupSearchShardsResponseDeserializer(ObjectDeserializer<SearchShardsResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(SearchShardsNodeAttributes._DESERIALIZER),
				"nodes");
		op.add(Builder::shards,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.arrayDeserializer(NodeShard._DESERIALIZER)),
				"shards");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(ShardStoreIndex._DESERIALIZER), "indices");

	}

}
