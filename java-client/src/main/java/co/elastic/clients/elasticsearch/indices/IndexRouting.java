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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexRouting

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.IndexRouting">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexRouting implements JsonpSerializable {
	@Nullable
	private final IndexRoutingAllocation allocation;

	@Nullable
	private final IndexRoutingRebalance rebalance;

	// ---------------------------------------------------------------------------------------------

	private IndexRouting(Builder builder) {

		this.allocation = builder.allocation;
		this.rebalance = builder.rebalance;

	}

	public static IndexRouting of(Function<Builder, ObjectBuilder<IndexRouting>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code allocation}
	 */
	@Nullable
	public final IndexRoutingAllocation allocation() {
		return this.allocation;
	}

	/**
	 * API name: {@code rebalance}
	 */
	@Nullable
	public final IndexRoutingRebalance rebalance() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRouting}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexRouting> {
		@Nullable
		private IndexRoutingAllocation allocation;

		@Nullable
		private IndexRoutingRebalance rebalance;

		/**
		 * API name: {@code allocation}
		 */
		public final Builder allocation(@Nullable IndexRoutingAllocation value) {
			this.allocation = value;
			return this;
		}

		/**
		 * API name: {@code allocation}
		 */
		public final Builder allocation(
				Function<IndexRoutingAllocation.Builder, ObjectBuilder<IndexRoutingAllocation>> fn) {
			return this.allocation(fn.apply(new IndexRoutingAllocation.Builder()).build());
		}

		/**
		 * API name: {@code rebalance}
		 */
		public final Builder rebalance(@Nullable IndexRoutingRebalance value) {
			this.rebalance = value;
			return this;
		}

		/**
		 * API name: {@code rebalance}
		 */
		public final Builder rebalance(
				Function<IndexRoutingRebalance.Builder, ObjectBuilder<IndexRoutingRebalance>> fn) {
			return this.rebalance(fn.apply(new IndexRoutingRebalance.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexRouting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRouting build() {
			_checkSingleUse();

			return new IndexRouting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRouting}
	 */
	public static final JsonpDeserializer<IndexRouting> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexRouting::setupIndexRoutingDeserializer);

	protected static void setupIndexRoutingDeserializer(ObjectDeserializer<IndexRouting.Builder> op) {

		op.add(Builder::allocation, IndexRoutingAllocation._DESERIALIZER, "allocation");
		op.add(Builder::rebalance, IndexRoutingRebalance._DESERIALIZER, "rebalance");

	}

}
