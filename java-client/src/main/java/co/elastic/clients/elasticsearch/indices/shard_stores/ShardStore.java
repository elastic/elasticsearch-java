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

package co.elastic.clients.elasticsearch.indices.shard_stores;

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

// typedef: indices.shard_stores.ShardStore

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.shard_stores.ShardStore">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardStore implements JsonpSerializable {
	private final String nodeId;

	private final ShardStoreNode node;

	private final ShardStoreAllocation allocation;

	@Nullable
	private final String allocationId;

	@Nullable
	private final ShardStoreException storeException;

	// ---------------------------------------------------------------------------------------------

	private ShardStore(Builder builder) {

		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");

		this.allocation = ApiTypeHelper.requireNonNull(builder.allocation, this, "allocation");
		this.allocationId = builder.allocationId;
		this.storeException = builder.storeException;

	}

	public static ShardStore of(Function<Builder, ObjectBuilder<ShardStore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required -
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required -
	 */
	public final ShardStoreNode node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code allocation}
	 */
	public final ShardStoreAllocation allocation() {
		return this.allocation;
	}

	/**
	 * API name: {@code allocation_id}
	 */
	@Nullable
	public final String allocationId() {
		return this.allocationId;
	}

	/**
	 * API name: {@code store_exception}
	 */
	@Nullable
	public final ShardStoreException storeException() {
		return this.storeException;
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
		generator.writeKey(this.nodeId);
		this.node.serialize(generator, mapper);

		generator.writeKey("allocation");
		this.allocation.serialize(generator, mapper);
		if (this.allocationId != null) {
			generator.writeKey("allocation_id");
			generator.write(this.allocationId);

		}
		if (this.storeException != null) {
			generator.writeKey("store_exception");
			this.storeException.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStore}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardStore> {
		private String nodeId;

		private ShardStoreNode node;

		/**
		 * Required -
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder node(ShardStoreNode value) {
			this.node = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder node(Function<ShardStoreNode.Builder, ObjectBuilder<ShardStoreNode>> fn) {
			return this.node(fn.apply(new ShardStoreNode.Builder()).build());
		}

		private ShardStoreAllocation allocation;

		@Nullable
		private String allocationId;

		@Nullable
		private ShardStoreException storeException;

		/**
		 * Required - API name: {@code allocation}
		 */
		public final Builder allocation(ShardStoreAllocation value) {
			this.allocation = value;
			return this;
		}

		/**
		 * API name: {@code allocation_id}
		 */
		public final Builder allocationId(@Nullable String value) {
			this.allocationId = value;
			return this;
		}

		/**
		 * API name: {@code store_exception}
		 */
		public final Builder storeException(@Nullable ShardStoreException value) {
			this.storeException = value;
			return this;
		}

		/**
		 * API name: {@code store_exception}
		 */
		public final Builder storeException(
				Function<ShardStoreException.Builder, ObjectBuilder<ShardStoreException>> fn) {
			return this.storeException(fn.apply(new ShardStoreException.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardStore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStore build() {
			_checkSingleUse();

			return new ShardStore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStore}
	 */
	public static final JsonpDeserializer<ShardStore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStore::setupShardStoreDeserializer);

	protected static void setupShardStoreDeserializer(ObjectDeserializer<ShardStore.Builder> op) {

		op.add(Builder::allocation, ShardStoreAllocation._DESERIALIZER, "allocation");
		op.add(Builder::allocationId, JsonpDeserializer.stringDeserializer(), "allocation_id");
		op.add(Builder::storeException, ShardStoreException._DESERIALIZER, "store_exception");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.nodeId(name);
			builder.node(ShardStoreNode._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
