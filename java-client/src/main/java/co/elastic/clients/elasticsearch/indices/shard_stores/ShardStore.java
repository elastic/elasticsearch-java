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
import co.elastic.clients.json.JsonData;
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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.shard_stores.ShardStore
@JsonpDeserializable
public class ShardStore implements JsonpSerializable {
	private final ShardStoreAllocation allocation;

	private final String allocationId;

	private final Map<String, JsonData> attributes;

	private final String id;

	private final long legacyVersion;

	private final String name;

	private final ShardStoreException storeException;

	private final String transportAddress;

	// ---------------------------------------------------------------------------------------------

	private ShardStore(Builder builder) {

		this.allocation = ModelTypeHelper.requireNonNull(builder.allocation, this, "allocation");
		this.allocationId = ModelTypeHelper.requireNonNull(builder.allocationId, this, "allocationId");
		this.attributes = ModelTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.legacyVersion = ModelTypeHelper.requireNonNull(builder.legacyVersion, this, "legacyVersion");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.storeException = ModelTypeHelper.requireNonNull(builder.storeException, this, "storeException");
		this.transportAddress = ModelTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");

	}

	public static ShardStore of(Function<Builder, ObjectBuilder<ShardStore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code allocation}
	 */
	public final ShardStoreAllocation allocation() {
		return this.allocation;
	}

	/**
	 * Required - API name: {@code allocation_id}
	 */
	public final String allocationId() {
		return this.allocationId;
	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final Map<String, JsonData> attributes() {
		return this.attributes;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code legacy_version}
	 */
	public final long legacyVersion() {
		return this.legacyVersion;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code store_exception}
	 */
	public final ShardStoreException storeException() {
		return this.storeException;
	}

	/**
	 * Required - API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
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

		generator.writeKey("allocation");
		this.allocation.serialize(generator, mapper);
		generator.writeKey("allocation_id");
		generator.write(this.allocationId);

		if (ModelTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("legacy_version");
		generator.write(this.legacyVersion);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("store_exception");
		this.storeException.serialize(generator, mapper);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStore}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardStore> {
		private ShardStoreAllocation allocation;

		private String allocationId;

		private Map<String, JsonData> attributes;

		private String id;

		private Long legacyVersion;

		private String name;

		private ShardStoreException storeException;

		private String transportAddress;

		/**
		 * Required - API name: {@code allocation}
		 */
		public final Builder allocation(ShardStoreAllocation value) {
			this.allocation = value;
			return this;
		}

		/**
		 * Required - API name: {@code allocation_id}
		 */
		public final Builder allocationId(String value) {
			this.allocationId = value;
			return this;
		}

		/**
		 * Required - API name: {@code attributes}
		 */
		public final Builder attributes(Map<String, JsonData> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code legacy_version}
		 */
		public final Builder legacyVersion(long value) {
			this.legacyVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code store_exception}
		 */
		public final Builder storeException(ShardStoreException value) {
			this.storeException = value;
			return this;
		}

		/**
		 * Required - API name: {@code store_exception}
		 */
		public final Builder storeException(
				Function<ShardStoreException.Builder, ObjectBuilder<ShardStoreException>> fn) {
			return this.storeException(fn.apply(new ShardStoreException.Builder()).build());
		}

		/**
		 * Required - API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
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
			ShardStore::setupShardStoreDeserializer, Builder::build);

	protected static void setupShardStoreDeserializer(DelegatingDeserializer<ShardStore.Builder> op) {

		op.add(Builder::allocation, ShardStoreAllocation._DESERIALIZER, "allocation");
		op.add(Builder::allocationId, JsonpDeserializer.stringDeserializer(), "allocation_id");
		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "attributes");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::legacyVersion, JsonpDeserializer.longDeserializer(), "legacy_version");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::storeException, ShardStoreException._DESERIALIZER, "store_exception");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");

	}

}
