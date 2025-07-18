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

// typedef: nodes._types.PressureMemory

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.PressureMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class PressureMemory implements JsonpSerializable {
	@Nullable
	private final String all;

	@Nullable
	private final Long allInBytes;

	@Nullable
	private final String combinedCoordinatingAndPrimary;

	@Nullable
	private final Long combinedCoordinatingAndPrimaryInBytes;

	@Nullable
	private final String coordinating;

	@Nullable
	private final Long coordinatingInBytes;

	@Nullable
	private final String primary;

	@Nullable
	private final Long primaryInBytes;

	@Nullable
	private final String replica;

	@Nullable
	private final Long replicaInBytes;

	@Nullable
	private final Long coordinatingRejections;

	@Nullable
	private final Long primaryRejections;

	@Nullable
	private final Long replicaRejections;

	@Nullable
	private final Long primaryDocumentRejections;

	@Nullable
	private final Long largeOperationRejections;

	// ---------------------------------------------------------------------------------------------

	private PressureMemory(Builder builder) {

		this.all = builder.all;
		this.allInBytes = builder.allInBytes;
		this.combinedCoordinatingAndPrimary = builder.combinedCoordinatingAndPrimary;
		this.combinedCoordinatingAndPrimaryInBytes = builder.combinedCoordinatingAndPrimaryInBytes;
		this.coordinating = builder.coordinating;
		this.coordinatingInBytes = builder.coordinatingInBytes;
		this.primary = builder.primary;
		this.primaryInBytes = builder.primaryInBytes;
		this.replica = builder.replica;
		this.replicaInBytes = builder.replicaInBytes;
		this.coordinatingRejections = builder.coordinatingRejections;
		this.primaryRejections = builder.primaryRejections;
		this.replicaRejections = builder.replicaRejections;
		this.primaryDocumentRejections = builder.primaryDocumentRejections;
		this.largeOperationRejections = builder.largeOperationRejections;

	}

	public static PressureMemory of(Function<Builder, ObjectBuilder<PressureMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Memory consumed by indexing requests in the coordinating, primary, or replica
	 * stage.
	 * <p>
	 * API name: {@code all}
	 */
	@Nullable
	public final String all() {
		return this.all;
	}

	/**
	 * Memory consumed, in bytes, by indexing requests in the coordinating, primary,
	 * or replica stage.
	 * <p>
	 * API name: {@code all_in_bytes}
	 */
	@Nullable
	public final Long allInBytes() {
		return this.allInBytes;
	}

	/**
	 * Memory consumed by indexing requests in the coordinating or primary stage.
	 * This value is not the sum of coordinating and primary as a node can reuse the
	 * coordinating memory if the primary stage is executed locally.
	 * <p>
	 * API name: {@code combined_coordinating_and_primary}
	 */
	@Nullable
	public final String combinedCoordinatingAndPrimary() {
		return this.combinedCoordinatingAndPrimary;
	}

	/**
	 * Memory consumed, in bytes, by indexing requests in the coordinating or
	 * primary stage. This value is not the sum of coordinating and primary as a
	 * node can reuse the coordinating memory if the primary stage is executed
	 * locally.
	 * <p>
	 * API name: {@code combined_coordinating_and_primary_in_bytes}
	 */
	@Nullable
	public final Long combinedCoordinatingAndPrimaryInBytes() {
		return this.combinedCoordinatingAndPrimaryInBytes;
	}

	/**
	 * Memory consumed by indexing requests in the coordinating stage.
	 * <p>
	 * API name: {@code coordinating}
	 */
	@Nullable
	public final String coordinating() {
		return this.coordinating;
	}

	/**
	 * Memory consumed, in bytes, by indexing requests in the coordinating stage.
	 * <p>
	 * API name: {@code coordinating_in_bytes}
	 */
	@Nullable
	public final Long coordinatingInBytes() {
		return this.coordinatingInBytes;
	}

	/**
	 * Memory consumed by indexing requests in the primary stage.
	 * <p>
	 * API name: {@code primary}
	 */
	@Nullable
	public final String primary() {
		return this.primary;
	}

	/**
	 * Memory consumed, in bytes, by indexing requests in the primary stage.
	 * <p>
	 * API name: {@code primary_in_bytes}
	 */
	@Nullable
	public final Long primaryInBytes() {
		return this.primaryInBytes;
	}

	/**
	 * Memory consumed by indexing requests in the replica stage.
	 * <p>
	 * API name: {@code replica}
	 */
	@Nullable
	public final String replica() {
		return this.replica;
	}

	/**
	 * Memory consumed, in bytes, by indexing requests in the replica stage.
	 * <p>
	 * API name: {@code replica_in_bytes}
	 */
	@Nullable
	public final Long replicaInBytes() {
		return this.replicaInBytes;
	}

	/**
	 * Number of indexing requests rejected in the coordinating stage.
	 * <p>
	 * API name: {@code coordinating_rejections}
	 */
	@Nullable
	public final Long coordinatingRejections() {
		return this.coordinatingRejections;
	}

	/**
	 * Number of indexing requests rejected in the primary stage.
	 * <p>
	 * API name: {@code primary_rejections}
	 */
	@Nullable
	public final Long primaryRejections() {
		return this.primaryRejections;
	}

	/**
	 * Number of indexing requests rejected in the replica stage.
	 * <p>
	 * API name: {@code replica_rejections}
	 */
	@Nullable
	public final Long replicaRejections() {
		return this.replicaRejections;
	}

	/**
	 * API name: {@code primary_document_rejections}
	 */
	@Nullable
	public final Long primaryDocumentRejections() {
		return this.primaryDocumentRejections;
	}

	/**
	 * API name: {@code large_operation_rejections}
	 */
	@Nullable
	public final Long largeOperationRejections() {
		return this.largeOperationRejections;
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

		if (this.all != null) {
			generator.writeKey("all");
			generator.write(this.all);

		}
		if (this.allInBytes != null) {
			generator.writeKey("all_in_bytes");
			generator.write(this.allInBytes);

		}
		if (this.combinedCoordinatingAndPrimary != null) {
			generator.writeKey("combined_coordinating_and_primary");
			generator.write(this.combinedCoordinatingAndPrimary);

		}
		if (this.combinedCoordinatingAndPrimaryInBytes != null) {
			generator.writeKey("combined_coordinating_and_primary_in_bytes");
			generator.write(this.combinedCoordinatingAndPrimaryInBytes);

		}
		if (this.coordinating != null) {
			generator.writeKey("coordinating");
			generator.write(this.coordinating);

		}
		if (this.coordinatingInBytes != null) {
			generator.writeKey("coordinating_in_bytes");
			generator.write(this.coordinatingInBytes);

		}
		if (this.primary != null) {
			generator.writeKey("primary");
			generator.write(this.primary);

		}
		if (this.primaryInBytes != null) {
			generator.writeKey("primary_in_bytes");
			generator.write(this.primaryInBytes);

		}
		if (this.replica != null) {
			generator.writeKey("replica");
			generator.write(this.replica);

		}
		if (this.replicaInBytes != null) {
			generator.writeKey("replica_in_bytes");
			generator.write(this.replicaInBytes);

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
		if (this.primaryDocumentRejections != null) {
			generator.writeKey("primary_document_rejections");
			generator.write(this.primaryDocumentRejections);

		}
		if (this.largeOperationRejections != null) {
			generator.writeKey("large_operation_rejections");
			generator.write(this.largeOperationRejections);

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
		private String all;

		@Nullable
		private Long allInBytes;

		@Nullable
		private String combinedCoordinatingAndPrimary;

		@Nullable
		private Long combinedCoordinatingAndPrimaryInBytes;

		@Nullable
		private String coordinating;

		@Nullable
		private Long coordinatingInBytes;

		@Nullable
		private String primary;

		@Nullable
		private Long primaryInBytes;

		@Nullable
		private String replica;

		@Nullable
		private Long replicaInBytes;

		@Nullable
		private Long coordinatingRejections;

		@Nullable
		private Long primaryRejections;

		@Nullable
		private Long replicaRejections;

		@Nullable
		private Long primaryDocumentRejections;

		@Nullable
		private Long largeOperationRejections;

		/**
		 * Memory consumed by indexing requests in the coordinating, primary, or replica
		 * stage.
		 * <p>
		 * API name: {@code all}
		 */
		public final Builder all(@Nullable String value) {
			this.all = value;
			return this;
		}

		/**
		 * Memory consumed, in bytes, by indexing requests in the coordinating, primary,
		 * or replica stage.
		 * <p>
		 * API name: {@code all_in_bytes}
		 */
		public final Builder allInBytes(@Nullable Long value) {
			this.allInBytes = value;
			return this;
		}

		/**
		 * Memory consumed by indexing requests in the coordinating or primary stage.
		 * This value is not the sum of coordinating and primary as a node can reuse the
		 * coordinating memory if the primary stage is executed locally.
		 * <p>
		 * API name: {@code combined_coordinating_and_primary}
		 */
		public final Builder combinedCoordinatingAndPrimary(@Nullable String value) {
			this.combinedCoordinatingAndPrimary = value;
			return this;
		}

		/**
		 * Memory consumed, in bytes, by indexing requests in the coordinating or
		 * primary stage. This value is not the sum of coordinating and primary as a
		 * node can reuse the coordinating memory if the primary stage is executed
		 * locally.
		 * <p>
		 * API name: {@code combined_coordinating_and_primary_in_bytes}
		 */
		public final Builder combinedCoordinatingAndPrimaryInBytes(@Nullable Long value) {
			this.combinedCoordinatingAndPrimaryInBytes = value;
			return this;
		}

		/**
		 * Memory consumed by indexing requests in the coordinating stage.
		 * <p>
		 * API name: {@code coordinating}
		 */
		public final Builder coordinating(@Nullable String value) {
			this.coordinating = value;
			return this;
		}

		/**
		 * Memory consumed, in bytes, by indexing requests in the coordinating stage.
		 * <p>
		 * API name: {@code coordinating_in_bytes}
		 */
		public final Builder coordinatingInBytes(@Nullable Long value) {
			this.coordinatingInBytes = value;
			return this;
		}

		/**
		 * Memory consumed by indexing requests in the primary stage.
		 * <p>
		 * API name: {@code primary}
		 */
		public final Builder primary(@Nullable String value) {
			this.primary = value;
			return this;
		}

		/**
		 * Memory consumed, in bytes, by indexing requests in the primary stage.
		 * <p>
		 * API name: {@code primary_in_bytes}
		 */
		public final Builder primaryInBytes(@Nullable Long value) {
			this.primaryInBytes = value;
			return this;
		}

		/**
		 * Memory consumed by indexing requests in the replica stage.
		 * <p>
		 * API name: {@code replica}
		 */
		public final Builder replica(@Nullable String value) {
			this.replica = value;
			return this;
		}

		/**
		 * Memory consumed, in bytes, by indexing requests in the replica stage.
		 * <p>
		 * API name: {@code replica_in_bytes}
		 */
		public final Builder replicaInBytes(@Nullable Long value) {
			this.replicaInBytes = value;
			return this;
		}

		/**
		 * Number of indexing requests rejected in the coordinating stage.
		 * <p>
		 * API name: {@code coordinating_rejections}
		 */
		public final Builder coordinatingRejections(@Nullable Long value) {
			this.coordinatingRejections = value;
			return this;
		}

		/**
		 * Number of indexing requests rejected in the primary stage.
		 * <p>
		 * API name: {@code primary_rejections}
		 */
		public final Builder primaryRejections(@Nullable Long value) {
			this.primaryRejections = value;
			return this;
		}

		/**
		 * Number of indexing requests rejected in the replica stage.
		 * <p>
		 * API name: {@code replica_rejections}
		 */
		public final Builder replicaRejections(@Nullable Long value) {
			this.replicaRejections = value;
			return this;
		}

		/**
		 * API name: {@code primary_document_rejections}
		 */
		public final Builder primaryDocumentRejections(@Nullable Long value) {
			this.primaryDocumentRejections = value;
			return this;
		}

		/**
		 * API name: {@code large_operation_rejections}
		 */
		public final Builder largeOperationRejections(@Nullable Long value) {
			this.largeOperationRejections = value;
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

		op.add(Builder::all, JsonpDeserializer.stringDeserializer(), "all");
		op.add(Builder::allInBytes, JsonpDeserializer.longDeserializer(), "all_in_bytes");
		op.add(Builder::combinedCoordinatingAndPrimary, JsonpDeserializer.stringDeserializer(),
				"combined_coordinating_and_primary");
		op.add(Builder::combinedCoordinatingAndPrimaryInBytes, JsonpDeserializer.longDeserializer(),
				"combined_coordinating_and_primary_in_bytes");
		op.add(Builder::coordinating, JsonpDeserializer.stringDeserializer(), "coordinating");
		op.add(Builder::coordinatingInBytes, JsonpDeserializer.longDeserializer(), "coordinating_in_bytes");
		op.add(Builder::primary, JsonpDeserializer.stringDeserializer(), "primary");
		op.add(Builder::primaryInBytes, JsonpDeserializer.longDeserializer(), "primary_in_bytes");
		op.add(Builder::replica, JsonpDeserializer.stringDeserializer(), "replica");
		op.add(Builder::replicaInBytes, JsonpDeserializer.longDeserializer(), "replica_in_bytes");
		op.add(Builder::coordinatingRejections, JsonpDeserializer.longDeserializer(), "coordinating_rejections");
		op.add(Builder::primaryRejections, JsonpDeserializer.longDeserializer(), "primary_rejections");
		op.add(Builder::replicaRejections, JsonpDeserializer.longDeserializer(), "replica_rejections");
		op.add(Builder::primaryDocumentRejections, JsonpDeserializer.longDeserializer(), "primary_document_rejections");
		op.add(Builder::largeOperationRejections, JsonpDeserializer.longDeserializer(), "large_operation_rejections");

	}

}
