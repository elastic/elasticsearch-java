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

// typedef: indices._types.IndexRouting
public final class IndexRouting implements JsonpSerializable {
	@Nullable
	private final IndexRoutingAllocation allocation;

	@Nullable
	private final IndexRoutingRebalance rebalance;

	// ---------------------------------------------------------------------------------------------

	public IndexRouting(Builder builder) {

		this.allocation = builder.allocation;
		this.rebalance = builder.rebalance;

	}

	/**
	 * API name: {@code allocation}
	 */
	@Nullable
	public IndexRoutingAllocation allocation() {
		return this.allocation;
	}

	/**
	 * API name: {@code rebalance}
	 */
	@Nullable
	public IndexRoutingRebalance rebalance() {
		return this.rebalance;
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

		if (this.allocation != null) {

			generator.writeKey("allocation");
			this.allocation.serialize(generator, mapper);

		}
		if (this.rebalance != null) {

			generator.writeKey("rebalance");
			this.rebalance.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRouting}.
	 */
	public static class Builder implements ObjectBuilder<IndexRouting> {
		@Nullable
		private IndexRoutingAllocation allocation;

		@Nullable
		private IndexRoutingRebalance rebalance;

		/**
		 * API name: {@code allocation}
		 */
		public Builder allocation(@Nullable IndexRoutingAllocation value) {
			this.allocation = value;
			return this;
		}

		/**
		 * API name: {@code allocation}
		 */
		public Builder allocation(Function<IndexRoutingAllocation.Builder, ObjectBuilder<IndexRoutingAllocation>> fn) {
			return this.allocation(fn.apply(new IndexRoutingAllocation.Builder()).build());
		}

		/**
		 * API name: {@code rebalance}
		 */
		public Builder rebalance(@Nullable IndexRoutingRebalance value) {
			this.rebalance = value;
			return this;
		}

		/**
		 * API name: {@code rebalance}
		 */
		public Builder rebalance(Function<IndexRoutingRebalance.Builder, ObjectBuilder<IndexRoutingRebalance>> fn) {
			return this.rebalance(fn.apply(new IndexRoutingRebalance.Builder()).build());
		}

		/**
		 * Builds a {@link IndexRouting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRouting build() {

			return new IndexRouting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRouting}
	 */
	public static final JsonpDeserializer<IndexRouting> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexRouting::setupIndexRoutingDeserializer);

	protected static void setupIndexRoutingDeserializer(DelegatingDeserializer<IndexRouting.Builder> op) {

		op.add(Builder::allocation, IndexRoutingAllocation.DESERIALIZER, "allocation");
		op.add(Builder::rebalance, IndexRoutingRebalance.DESERIALIZER, "rebalance");

	}

}
