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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
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

// typedef: indices._types.IndexRoutingAllocation
@JsonpDeserializable
public final class IndexRoutingAllocation implements JsonpSerializable {
	@Nullable
	private final IndexRoutingAllocationOptions enable;

	@Nullable
	private final IndexRoutingAllocationInclude include;

	@Nullable
	private final IndexRoutingAllocationInitialRecovery initialRecovery;

	@Nullable
	private final IndexRoutingAllocationDisk disk;

	// ---------------------------------------------------------------------------------------------

	public IndexRoutingAllocation(Builder builder) {

		this.enable = builder.enable;
		this.include = builder.include;
		this.initialRecovery = builder.initialRecovery;
		this.disk = builder.disk;

	}

	public IndexRoutingAllocation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code enable}
	 */
	@Nullable
	public IndexRoutingAllocationOptions enable() {
		return this.enable;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public IndexRoutingAllocationInclude include() {
		return this.include;
	}

	/**
	 * API name: {@code initial_recovery}
	 */
	@Nullable
	public IndexRoutingAllocationInitialRecovery initialRecovery() {
		return this.initialRecovery;
	}

	/**
	 * API name: {@code disk}
	 */
	@Nullable
	public IndexRoutingAllocationDisk disk() {
		return this.disk;
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

		if (this.enable != null) {

			generator.writeKey("enable");
			this.enable.serialize(generator, mapper);
		}
		if (this.include != null) {

			generator.writeKey("include");
			this.include.serialize(generator, mapper);

		}
		if (this.initialRecovery != null) {

			generator.writeKey("initial_recovery");
			this.initialRecovery.serialize(generator, mapper);

		}
		if (this.disk != null) {

			generator.writeKey("disk");
			this.disk.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocation}.
	 */
	public static class Builder implements ObjectBuilder<IndexRoutingAllocation> {
		@Nullable
		private IndexRoutingAllocationOptions enable;

		@Nullable
		private IndexRoutingAllocationInclude include;

		@Nullable
		private IndexRoutingAllocationInitialRecovery initialRecovery;

		@Nullable
		private IndexRoutingAllocationDisk disk;

		/**
		 * API name: {@code enable}
		 */
		public Builder enable(@Nullable IndexRoutingAllocationOptions value) {
			this.enable = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(@Nullable IndexRoutingAllocationInclude value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(
				Function<IndexRoutingAllocationInclude.Builder, ObjectBuilder<IndexRoutingAllocationInclude>> fn) {
			return this.include(fn.apply(new IndexRoutingAllocationInclude.Builder()).build());
		}

		/**
		 * API name: {@code initial_recovery}
		 */
		public Builder initialRecovery(@Nullable IndexRoutingAllocationInitialRecovery value) {
			this.initialRecovery = value;
			return this;
		}

		/**
		 * API name: {@code initial_recovery}
		 */
		public Builder initialRecovery(
				Function<IndexRoutingAllocationInitialRecovery.Builder, ObjectBuilder<IndexRoutingAllocationInitialRecovery>> fn) {
			return this.initialRecovery(fn.apply(new IndexRoutingAllocationInitialRecovery.Builder()).build());
		}

		/**
		 * API name: {@code disk}
		 */
		public Builder disk(@Nullable IndexRoutingAllocationDisk value) {
			this.disk = value;
			return this;
		}

		/**
		 * API name: {@code disk}
		 */
		public Builder disk(
				Function<IndexRoutingAllocationDisk.Builder, ObjectBuilder<IndexRoutingAllocationDisk>> fn) {
			return this.disk(fn.apply(new IndexRoutingAllocationDisk.Builder()).build());
		}

		/**
		 * Builds a {@link IndexRoutingAllocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocation build() {

			return new IndexRoutingAllocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRoutingAllocation}
	 */
	public static final JsonpDeserializer<IndexRoutingAllocation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexRoutingAllocation::setupIndexRoutingAllocationDeserializer, Builder::build);

	protected static void setupIndexRoutingAllocationDeserializer(
			DelegatingDeserializer<IndexRoutingAllocation.Builder> op) {

		op.add(Builder::enable, IndexRoutingAllocationOptions._DESERIALIZER, "enable");
		op.add(Builder::include, IndexRoutingAllocationInclude._DESERIALIZER, "include");
		op.add(Builder::initialRecovery, IndexRoutingAllocationInitialRecovery._DESERIALIZER, "initial_recovery");
		op.add(Builder::disk, IndexRoutingAllocationDisk._DESERIALIZER, "disk");

	}

}
