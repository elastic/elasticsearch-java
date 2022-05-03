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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.ClusterStateQueue

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.ClusterStateQueue">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterStateQueue implements JsonpSerializable {
	@Nullable
	private final Long total;

	@Nullable
	private final Long pending;

	@Nullable
	private final Long committed;

	// ---------------------------------------------------------------------------------------------

	private ClusterStateQueue(Builder builder) {

		this.total = builder.total;
		this.pending = builder.pending;
		this.committed = builder.committed;

	}

	public static ClusterStateQueue of(Function<Builder, ObjectBuilder<ClusterStateQueue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final Long total() {
		return this.total;
	}

	/**
	 * API name: {@code pending}
	 */
	@Nullable
	public final Long pending() {
		return this.pending;
	}

	/**
	 * API name: {@code committed}
	 */
	@Nullable
	public final Long committed() {
		return this.committed;
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

		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		if (this.pending != null) {
			generator.writeKey("pending");
			generator.write(this.pending);

		}
		if (this.committed != null) {
			generator.writeKey("committed");
			generator.write(this.committed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateQueue}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterStateQueue> {
		@Nullable
		private Long total;

		@Nullable
		private Long pending;

		@Nullable
		private Long committed;

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable Long value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code pending}
		 */
		public final Builder pending(@Nullable Long value) {
			this.pending = value;
			return this;
		}

		/**
		 * API name: {@code committed}
		 */
		public final Builder committed(@Nullable Long value) {
			this.committed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterStateQueue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateQueue build() {
			_checkSingleUse();

			return new ClusterStateQueue(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateQueue}
	 */
	public static final JsonpDeserializer<ClusterStateQueue> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStateQueue::setupClusterStateQueueDeserializer);

	protected static void setupClusterStateQueueDeserializer(ObjectDeserializer<ClusterStateQueue.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::pending, JsonpDeserializer.longDeserializer(), "pending");
		op.add(Builder::committed, JsonpDeserializer.longDeserializer(), "committed");

	}

}
