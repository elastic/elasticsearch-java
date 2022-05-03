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

// typedef: nodes._types.PressureMemory

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.PressureMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class PressureMemory implements JsonpSerializable {
	@Nullable
	private final Long combinedCoordinatingAndPrimaryInBytes;

	@Nullable
	private final Long coordinatingInBytes;

	@Nullable
	private final Long primaryInBytes;

	@Nullable
	private final Long replicaInBytes;

	@Nullable
	private final Long allInBytes;

	@Nullable
	private final Long coordinatingRejections;

	@Nullable
	private final Long primaryRejections;

	@Nullable
	private final Long replicaRejections;

	// ---------------------------------------------------------------------------------------------

	private PressureMemory(Builder builder) {

		this.combinedCoordinatingAndPrimaryInBytes = builder.combinedCoordinatingAndPrimaryInBytes;
		this.coordinatingInBytes = builder.coordinatingInBytes;
		this.primaryInBytes = builder.primaryInBytes;
		this.replicaInBytes = builder.replicaInBytes;
		this.allInBytes = builder.allInBytes;
		this.coordinatingRejections = builder.coordinatingRejections;
		this.primaryRejections = builder.primaryRejections;
		this.replicaRejections = builder.replicaRejections;

	}

	public static PressureMemory of(Function<Builder, ObjectBuilder<PressureMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code combined_coordinating_and_primary_in_bytes}
	 */
	@Nullable
	public final Long combinedCoordinatingAndPrimaryInBytes() {
		return this.combinedCoordinatingAndPrimaryInBytes;
	}

	/**
	 * API name: {@code coordinating_in_bytes}
	 */
	@Nullable
	public final Long coordinatingInBytes() {
		return this.coordinatingInBytes;
	}

	/**
	 * API name: {@code primary_in_bytes}
	 */
	@Nullable
	public final Long primaryInBytes() {
		return this.primaryInBytes;
	}

	/**
	 * API name: {@code replica_in_bytes}
	 */
	@Nullable
	public final Long replicaInBytes() {
		return this.replicaInBytes;
	}

	/**
	 * API name: {@code all_in_bytes}
	 */
	@Nullable
	public final Long allInBytes() {
		return this.allInBytes;
	}

	/**
	 * API name: {@code coordinating_rejections}
	 */
	@Nullable
	public final Long coordinatingRejections() {
		return this.coordinatingRejections;
	}

	/**
	 * API name: {@code primary_rejections}
	 */
	@Nullable
	public final Long primaryRejections() {
		return this.primaryRejections;
	}

	/**
	 * API name: {@code replica_rejections}
	 */
	@Nullable
	public final Long replicaRejections() {
		return this.replicaRejections;
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

		if (this.combinedCoordinatingAndPrimaryInBytes != null) {
			generator.writeKey("combined_coordinating_and_primary_in_bytes");
			generator.write(this.combinedCoordinatingAndPrimaryInBytes);

		}
		if (this.coordinatingInBytes != null) {
			generator.writeKey("coordinating_in_bytes");
			generator.write(this.coordinatingInBytes);

		}
		if (this.primaryInBytes != null) {
			generator.writeKey("primary_in_bytes");
			generator.write(this.primaryInBytes);

		}
		if (this.replicaInBytes != null) {
			generator.writeKey("replica_in_bytes");
			generator.write(this.replicaInBytes);

		}
		if (this.allInBytes != null) {
			generator.writeKey("all_in_bytes");
			generator.write(this.allInBytes);

		}
		if (this.coordinatingRejections != null) {
			generator.writeKey("coordinating_rejections");
			generator.write(this.coordinatingRejections);

		}
		if (this.primaryRejections != null) {
			generator.writeKey("primary_rejections");
			generator.write(this.primaryRejections);

		}
		if (this.replicaRejections != null) {
			generator.writeKey("replica_rejections");
			generator.write(this.replicaRejections);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PressureMemory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PressureMemory> {
		@Nullable
		private Long combinedCoordinatingAndPrimaryInBytes;

		@Nullable
		private Long coordinatingInBytes;

		@Nullable
		private Long primaryInBytes;

		@Nullable
		private Long replicaInBytes;

		@Nullable
		private Long allInBytes;

		@Nullable
		private Long coordinatingRejections;

		@Nullable
		private Long primaryRejections;

		@Nullable
		private Long replicaRejections;

		/**
		 * API name: {@code combined_coordinating_and_primary_in_bytes}
		 */
		public final Builder combinedCoordinatingAndPrimaryInBytes(@Nullable Long value) {
			this.combinedCoordinatingAndPrimaryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code coordinating_in_bytes}
		 */
		public final Builder coordinatingInBytes(@Nullable Long value) {
			this.coordinatingInBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_in_bytes}
		 */
		public final Builder primaryInBytes(@Nullable Long value) {
			this.primaryInBytes = value;
			return this;
		}

		/**
		 * API name: {@code replica_in_bytes}
		 */
		public final Builder replicaInBytes(@Nullable Long value) {
			this.replicaInBytes = value;
			return this;
		}

		/**
		 * API name: {@code all_in_bytes}
		 */
		public final Builder allInBytes(@Nullable Long value) {
			this.allInBytes = value;
			return this;
		}

		/**
		 * API name: {@code coordinating_rejections}
		 */
		public final Builder coordinatingRejections(@Nullable Long value) {
			this.coordinatingRejections = value;
			return this;
		}

		/**
		 * API name: {@code primary_rejections}
		 */
		public final Builder primaryRejections(@Nullable Long value) {
			this.primaryRejections = value;
			return this;
		}

		/**
		 * API name: {@code replica_rejections}
		 */
		public final Builder replicaRejections(@Nullable Long value) {
			this.replicaRejections = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PressureMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PressureMemory build() {
			_checkSingleUse();

			return new PressureMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PressureMemory}
	 */
	public static final JsonpDeserializer<PressureMemory> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PressureMemory::setupPressureMemoryDeserializer);

	protected static void setupPressureMemoryDeserializer(ObjectDeserializer<PressureMemory.Builder> op) {

		op.add(Builder::combinedCoordinatingAndPrimaryInBytes, JsonpDeserializer.longDeserializer(),
				"combined_coordinating_and_primary_in_bytes");
		op.add(Builder::coordinatingInBytes, JsonpDeserializer.longDeserializer(), "coordinating_in_bytes");
		op.add(Builder::primaryInBytes, JsonpDeserializer.longDeserializer(), "primary_in_bytes");
		op.add(Builder::replicaInBytes, JsonpDeserializer.longDeserializer(), "replica_in_bytes");
		op.add(Builder::allInBytes, JsonpDeserializer.longDeserializer(), "all_in_bytes");
		op.add(Builder::coordinatingRejections, JsonpDeserializer.longDeserializer(), "coordinating_rejections");
		op.add(Builder::primaryRejections, JsonpDeserializer.longDeserializer(), "primary_rejections");
		op.add(Builder::replicaRejections, JsonpDeserializer.longDeserializer(), "replica_rejections");

	}

}
