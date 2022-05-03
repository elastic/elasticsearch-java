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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.IndexingPressureMemorySummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.IndexingPressureMemorySummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexingPressureMemorySummary implements JsonpSerializable {
	private final long allInBytes;

	private final long combinedCoordinatingAndPrimaryInBytes;

	private final long coordinatingInBytes;

	@Nullable
	private final Long coordinatingRejections;

	private final long primaryInBytes;

	@Nullable
	private final Long primaryRejections;

	private final long replicaInBytes;

	@Nullable
	private final Long replicaRejections;

	// ---------------------------------------------------------------------------------------------

	private IndexingPressureMemorySummary(Builder builder) {

		this.allInBytes = ApiTypeHelper.requireNonNull(builder.allInBytes, this, "allInBytes");
		this.combinedCoordinatingAndPrimaryInBytes = ApiTypeHelper.requireNonNull(
				builder.combinedCoordinatingAndPrimaryInBytes, this, "combinedCoordinatingAndPrimaryInBytes");
		this.coordinatingInBytes = ApiTypeHelper.requireNonNull(builder.coordinatingInBytes, this,
				"coordinatingInBytes");
		this.coordinatingRejections = builder.coordinatingRejections;
		this.primaryInBytes = ApiTypeHelper.requireNonNull(builder.primaryInBytes, this, "primaryInBytes");
		this.primaryRejections = builder.primaryRejections;
		this.replicaInBytes = ApiTypeHelper.requireNonNull(builder.replicaInBytes, this, "replicaInBytes");
		this.replicaRejections = builder.replicaRejections;

	}

	public static IndexingPressureMemorySummary of(Function<Builder, ObjectBuilder<IndexingPressureMemorySummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code all_in_bytes}
	 */
	public final long allInBytes() {
		return this.allInBytes;
	}

	/**
	 * Required - API name: {@code combined_coordinating_and_primary_in_bytes}
	 */
	public final long combinedCoordinatingAndPrimaryInBytes() {
		return this.combinedCoordinatingAndPrimaryInBytes;
	}

	/**
	 * Required - API name: {@code coordinating_in_bytes}
	 */
	public final long coordinatingInBytes() {
		return this.coordinatingInBytes;
	}

	/**
	 * API name: {@code coordinating_rejections}
	 */
	@Nullable
	public final Long coordinatingRejections() {
		return this.coordinatingRejections;
	}

	/**
	 * Required - API name: {@code primary_in_bytes}
	 */
	public final long primaryInBytes() {
		return this.primaryInBytes;
	}

	/**
	 * API name: {@code primary_rejections}
	 */
	@Nullable
	public final Long primaryRejections() {
		return this.primaryRejections;
	}

	/**
	 * Required - API name: {@code replica_in_bytes}
	 */
	public final long replicaInBytes() {
		return this.replicaInBytes;
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

		generator.writeKey("all_in_bytes");
		generator.write(this.allInBytes);

		generator.writeKey("combined_coordinating_and_primary_in_bytes");
		generator.write(this.combinedCoordinatingAndPrimaryInBytes);

		generator.writeKey("coordinating_in_bytes");
		generator.write(this.coordinatingInBytes);

		if (this.coordinatingRejections != null) {
			generator.writeKey("coordinating_rejections");
			generator.write(this.coordinatingRejections);

		}
		generator.writeKey("primary_in_bytes");
		generator.write(this.primaryInBytes);

		if (this.primaryRejections != null) {
			generator.writeKey("primary_rejections");
			generator.write(this.primaryRejections);

		}
		generator.writeKey("replica_in_bytes");
		generator.write(this.replicaInBytes);

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
	 * Builder for {@link IndexingPressureMemorySummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexingPressureMemorySummary> {
		private Long allInBytes;

		private Long combinedCoordinatingAndPrimaryInBytes;

		private Long coordinatingInBytes;

		@Nullable
		private Long coordinatingRejections;

		private Long primaryInBytes;

		@Nullable
		private Long primaryRejections;

		private Long replicaInBytes;

		@Nullable
		private Long replicaRejections;

		/**
		 * Required - API name: {@code all_in_bytes}
		 */
		public final Builder allInBytes(long value) {
			this.allInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code combined_coordinating_and_primary_in_bytes}
		 */
		public final Builder combinedCoordinatingAndPrimaryInBytes(long value) {
			this.combinedCoordinatingAndPrimaryInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code coordinating_in_bytes}
		 */
		public final Builder coordinatingInBytes(long value) {
			this.coordinatingInBytes = value;
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
		 * Required - API name: {@code primary_in_bytes}
		 */
		public final Builder primaryInBytes(long value) {
			this.primaryInBytes = value;
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
		 * Required - API name: {@code replica_in_bytes}
		 */
		public final Builder replicaInBytes(long value) {
			this.replicaInBytes = value;
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
		 * Builds a {@link IndexingPressureMemorySummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexingPressureMemorySummary build() {
			_checkSingleUse();

			return new IndexingPressureMemorySummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexingPressureMemorySummary}
	 */
	public static final JsonpDeserializer<IndexingPressureMemorySummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexingPressureMemorySummary::setupIndexingPressureMemorySummaryDeserializer);

	protected static void setupIndexingPressureMemorySummaryDeserializer(
			ObjectDeserializer<IndexingPressureMemorySummary.Builder> op) {

		op.add(Builder::allInBytes, JsonpDeserializer.longDeserializer(), "all_in_bytes");
		op.add(Builder::combinedCoordinatingAndPrimaryInBytes, JsonpDeserializer.longDeserializer(),
				"combined_coordinating_and_primary_in_bytes");
		op.add(Builder::coordinatingInBytes, JsonpDeserializer.longDeserializer(), "coordinating_in_bytes");
		op.add(Builder::coordinatingRejections, JsonpDeserializer.longDeserializer(), "coordinating_rejections");
		op.add(Builder::primaryInBytes, JsonpDeserializer.longDeserializer(), "primary_in_bytes");
		op.add(Builder::primaryRejections, JsonpDeserializer.longDeserializer(), "primary_rejections");
		op.add(Builder::replicaInBytes, JsonpDeserializer.longDeserializer(), "replica_in_bytes");
		op.add(Builder::replicaRejections, JsonpDeserializer.longDeserializer(), "replica_rejections");

	}

}
