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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.shard_stores.IndicesShardStores;
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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.shard_stores.Response
@JsonpDeserializable
public final class ShardStoresResponse implements JsonpSerializable {
	private final Map<String, IndicesShardStores> indices;

	// ---------------------------------------------------------------------------------------------

	public ShardStoresResponse(Builder builder) {

		this.indices = ModelTypeHelper.unmodifiableNonNull(builder.indices, "indices");

	}

	public ShardStoresResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public Map<String, IndicesShardStores> indices() {
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

		generator.writeKey("indices");
		generator.writeStartObject();
		for (Map.Entry<String, IndicesShardStores> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStoresResponse}.
	 */
	public static class Builder implements ObjectBuilder<ShardStoresResponse> {
		private Map<String, IndicesShardStores> indices;

		/**
		 * Required - API name: {@code indices}
		 */
		public Builder indices(Map<String, IndicesShardStores> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, IndicesShardStores value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<IndicesShardStores.Builder, ObjectBuilder<IndicesShardStores>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new IndicesShardStores.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key,
				Function<IndicesShardStores.Builder, ObjectBuilder<IndicesShardStores>> fn) {
			return this.putIndices(key, fn.apply(new IndicesShardStores.Builder()).build());
		}

		/**
		 * Builds a {@link ShardStoresResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStoresResponse build() {

			return new ShardStoresResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStoresResponse}
	 */
	public static final JsonpDeserializer<ShardStoresResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardStoresResponse::setupShardStoresResponseDeserializer, Builder::build);

	protected static void setupShardStoresResponseDeserializer(DelegatingDeserializer<ShardStoresResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndicesShardStores._DESERIALIZER), "indices");

	}

}
