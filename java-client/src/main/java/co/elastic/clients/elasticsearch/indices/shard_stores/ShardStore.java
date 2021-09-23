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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.shard_stores.ShardStore
public final class ShardStore implements JsonpSerializable {
	private final ShardStoreAllocation allocation;

	private final String allocationId;

	private final Map<String, JsonData> attributes;

	private final String id;

	private final Number legacyVersion;

	private final String name;

	private final ShardStoreException storeException;

	private final String transportAddress;

	// ---------------------------------------------------------------------------------------------

	public ShardStore(Builder builder) {

		this.allocation = Objects.requireNonNull(builder.allocation, "allocation");
		this.allocationId = Objects.requireNonNull(builder.allocationId, "allocation_id");
		this.attributes = Objects.requireNonNull(builder.attributes, "attributes");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.legacyVersion = Objects.requireNonNull(builder.legacyVersion, "legacy_version");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.storeException = Objects.requireNonNull(builder.storeException, "store_exception");
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");

	}

	/**
	 * API name: {@code allocation}
	 */
	public ShardStoreAllocation allocation() {
		return this.allocation;
	}

	/**
	 * API name: {@code allocation_id}
	 */
	public String allocationId() {
		return this.allocationId;
	}

	/**
	 * API name: {@code attributes}
	 */
	public Map<String, JsonData> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code legacy_version}
	 */
	public Number legacyVersion() {
		return this.legacyVersion;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code store_exception}
	 */
	public ShardStoreException storeException() {
		return this.storeException;
	}

	/**
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
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

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("legacy_version");
		generator.write(this.legacyVersion.doubleValue());

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
	public static class Builder implements ObjectBuilder<ShardStore> {
		private ShardStoreAllocation allocation;

		private String allocationId;

		private Map<String, JsonData> attributes;

		private String id;

		private Number legacyVersion;

		private String name;

		private ShardStoreException storeException;

		private String transportAddress;

		/**
		 * API name: {@code allocation}
		 */
		public Builder allocation(ShardStoreAllocation value) {
			this.allocation = value;
			return this;
		}

		/**
		 * API name: {@code allocation_id}
		 */
		public Builder allocationId(String value) {
			this.allocationId = value;
			return this;
		}

		/**
		 * API name: {@code attributes}
		 */
		public Builder attributes(Map<String, JsonData> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #attributes(Map)}, creating the map if needed.
		 */
		public Builder putAttributes(String key, JsonData value) {
			if (this.attributes == null) {
				this.attributes = new HashMap<>();
			}
			this.attributes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code legacy_version}
		 */
		public Builder legacyVersion(Number value) {
			this.legacyVersion = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code store_exception}
		 */
		public Builder storeException(ShardStoreException value) {
			this.storeException = value;
			return this;
		}

		/**
		 * API name: {@code store_exception}
		 */
		public Builder storeException(Function<ShardStoreException.Builder, ObjectBuilder<ShardStoreException>> fn) {
			return this.storeException(fn.apply(new ShardStoreException.Builder()).build());
		}

		/**
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(String value) {
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

			return new ShardStore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStore}
	 */
	public static final JsonpDeserializer<ShardStore> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardStore::setupShardStoreDeserializer);

	protected static void setupShardStoreDeserializer(DelegatingDeserializer<ShardStore.Builder> op) {

		op.add(Builder::allocation, ShardStoreAllocation.DESERIALIZER, "allocation");
		op.add(Builder::allocationId, JsonpDeserializer.stringDeserializer(), "allocation_id");
		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "attributes");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::legacyVersion, JsonpDeserializer.numberDeserializer(), "legacy_version");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::storeException, ShardStoreException.DESERIALIZER, "store_exception");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");

	}

}
