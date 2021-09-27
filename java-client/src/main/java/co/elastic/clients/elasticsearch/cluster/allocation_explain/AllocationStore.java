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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.AllocationStore
@JsonpDeserializable
public final class AllocationStore implements JsonpSerializable {
	private final String allocationId;

	private final boolean found;

	private final boolean inSync;

	private final long matchingSizeInBytes;

	private final boolean matchingSyncId;

	private final String storeException;

	// ---------------------------------------------------------------------------------------------

	public AllocationStore(Builder builder) {

		this.allocationId = Objects.requireNonNull(builder.allocationId, "allocation_id");
		this.found = Objects.requireNonNull(builder.found, "found");
		this.inSync = Objects.requireNonNull(builder.inSync, "in_sync");
		this.matchingSizeInBytes = Objects.requireNonNull(builder.matchingSizeInBytes, "matching_size_in_bytes");
		this.matchingSyncId = Objects.requireNonNull(builder.matchingSyncId, "matching_sync_id");
		this.storeException = Objects.requireNonNull(builder.storeException, "store_exception");

	}

	/**
	 * API name: {@code allocation_id}
	 */
	public String allocationId() {
		return this.allocationId;
	}

	/**
	 * API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code in_sync}
	 */
	public boolean inSync() {
		return this.inSync;
	}

	/**
	 * API name: {@code matching_size_in_bytes}
	 */
	public long matchingSizeInBytes() {
		return this.matchingSizeInBytes;
	}

	/**
	 * API name: {@code matching_sync_id}
	 */
	public boolean matchingSyncId() {
		return this.matchingSyncId;
	}

	/**
	 * API name: {@code store_exception}
	 */
	public String storeException() {
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

		generator.writeKey("allocation_id");
		generator.write(this.allocationId);

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("in_sync");
		generator.write(this.inSync);

		generator.writeKey("matching_size_in_bytes");
		generator.write(this.matchingSizeInBytes);

		generator.writeKey("matching_sync_id");
		generator.write(this.matchingSyncId);

		generator.writeKey("store_exception");
		generator.write(this.storeException);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationStore}.
	 */
	public static class Builder implements ObjectBuilder<AllocationStore> {
		private String allocationId;

		private Boolean found;

		private Boolean inSync;

		private Long matchingSizeInBytes;

		private Boolean matchingSyncId;

		private String storeException;

		/**
		 * API name: {@code allocation_id}
		 */
		public Builder allocationId(String value) {
			this.allocationId = value;
			return this;
		}

		/**
		 * API name: {@code found}
		 */
		public Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code in_sync}
		 */
		public Builder inSync(boolean value) {
			this.inSync = value;
			return this;
		}

		/**
		 * API name: {@code matching_size_in_bytes}
		 */
		public Builder matchingSizeInBytes(long value) {
			this.matchingSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code matching_sync_id}
		 */
		public Builder matchingSyncId(boolean value) {
			this.matchingSyncId = value;
			return this;
		}

		/**
		 * API name: {@code store_exception}
		 */
		public Builder storeException(String value) {
			this.storeException = value;
			return this;
		}

		/**
		 * Builds a {@link AllocationStore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationStore build() {

			return new AllocationStore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllocationStore}
	 */
	public static final JsonpDeserializer<AllocationStore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AllocationStore::setupAllocationStoreDeserializer, Builder::build);

	protected static void setupAllocationStoreDeserializer(DelegatingDeserializer<AllocationStore.Builder> op) {

		op.add(Builder::allocationId, JsonpDeserializer.stringDeserializer(), "allocation_id");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::inSync, JsonpDeserializer.booleanDeserializer(), "in_sync");
		op.add(Builder::matchingSizeInBytes, JsonpDeserializer.longDeserializer(), "matching_size_in_bytes");
		op.add(Builder::matchingSyncId, JsonpDeserializer.booleanDeserializer(), "matching_sync_id");
		op.add(Builder::storeException, JsonpDeserializer.stringDeserializer(), "store_exception");

	}

}
