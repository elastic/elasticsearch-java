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

package co.elastic.clients.elasticsearch.indices.shard_stores;

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
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.shard_stores.IndicesShardStores
@JsonpDeserializable
public class IndicesShardStores implements JsonpSerializable {
	private final Map<String, ShardStoreWrapper> shards;

	// ---------------------------------------------------------------------------------------------

	private IndicesShardStores(Builder builder) {

		this.shards = ModelTypeHelper.unmodifiableRequired(builder.shards, this, "shards");

	}

	public static IndicesShardStores of(Function<Builder, ObjectBuilder<IndicesShardStores>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final Map<String, ShardStoreWrapper> shards() {
		return this.shards;
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

		if (ModelTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, ShardStoreWrapper> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesShardStores}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndicesShardStores> {
		private Map<String, ShardStoreWrapper> shards;

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(Map<String, ShardStoreWrapper> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key, Function<ShardStoreWrapper.Builder, ObjectBuilder<ShardStoreWrapper>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new ShardStoreWrapper.Builder()).build()));
		}

		public final Builder shards(
				Function<MapBuilder<String, ShardStoreWrapper, ShardStoreWrapper.Builder>, ObjectBuilder<Map<String, ShardStoreWrapper>>> fn) {
			return shards(fn.apply(new MapBuilder<>(ShardStoreWrapper.Builder::new)).build());
		}

		/**
		 * Builds a {@link IndicesShardStores}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesShardStores build() {
			_checkSingleUse();

			return new IndicesShardStores(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesShardStores}
	 */
	public static final JsonpDeserializer<IndicesShardStores> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesShardStores::setupIndicesShardStoresDeserializer, Builder::build);

	protected static void setupIndicesShardStoresDeserializer(DelegatingDeserializer<IndicesShardStores.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(ShardStoreWrapper._DESERIALIZER), "shards");

	}

}
