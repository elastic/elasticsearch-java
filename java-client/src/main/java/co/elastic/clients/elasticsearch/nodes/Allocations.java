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
import java.lang.Double;
import java.lang.Integer;
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

// typedef: nodes._types.Allocations

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Allocations">API
 *      specification</a>
 */
@JsonpDeserializable
public class Allocations implements JsonpSerializable {
	@Nullable
	private final Integer shards;

	@Nullable
	private final Integer undesiredShards;

	@Nullable
	private final Double forecastedIngestLoad;

	@Nullable
	private final String forecastedDiskUsage;

	@Nullable
	private final Long forecastedDiskUsageInBytes;

	@Nullable
	private final String currentDiskUsage;

	@Nullable
	private final Long currentDiskUsageInBytes;

	// ---------------------------------------------------------------------------------------------

	private Allocations(Builder builder) {

		this.shards = builder.shards;
		this.undesiredShards = builder.undesiredShards;
		this.forecastedIngestLoad = builder.forecastedIngestLoad;
		this.forecastedDiskUsage = builder.forecastedDiskUsage;
		this.forecastedDiskUsageInBytes = builder.forecastedDiskUsageInBytes;
		this.currentDiskUsage = builder.currentDiskUsage;
		this.currentDiskUsageInBytes = builder.currentDiskUsageInBytes;

	}

	public static Allocations of(Function<Builder, ObjectBuilder<Allocations>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Number of shards allocated to the node.
	 * <p>
	 * API name: {@code shards}
	 */
	@Nullable
	public final Integer shards() {
		return this.shards;
	}

	/**
	 * Number of shards allocated to the node that are currently undesired.
	 * <p>
	 * API name: {@code undesired_shards}
	 */
	@Nullable
	public final Integer undesiredShards() {
		return this.undesiredShards;
	}

	/**
	 * Forecasted ingest load for the node.
	 * <p>
	 * API name: {@code forecasted_ingest_load}
	 */
	@Nullable
	public final Double forecastedIngestLoad() {
		return this.forecastedIngestLoad;
	}

	/**
	 * Forecasted disk usage for the node.
	 * <p>
	 * API name: {@code forecasted_disk_usage}
	 */
	@Nullable
	public final String forecastedDiskUsage() {
		return this.forecastedDiskUsage;
	}

	/**
	 * Forecasted disk usage, in bytes, for the node.
	 * <p>
	 * API name: {@code forecasted_disk_usage_in_bytes}
	 */
	@Nullable
	public final Long forecastedDiskUsageInBytes() {
		return this.forecastedDiskUsageInBytes;
	}

	/**
	 * Current disk usage for the node.
	 * <p>
	 * API name: {@code current_disk_usage}
	 */
	@Nullable
	public final String currentDiskUsage() {
		return this.currentDiskUsage;
	}

	/**
	 * Current disk usage, in bytes, for the node.
	 * <p>
	 * API name: {@code current_disk_usage_in_bytes}
	 */
	@Nullable
	public final Long currentDiskUsageInBytes() {
		return this.currentDiskUsageInBytes;
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

		if (this.shards != null) {
			generator.writeKey("shards");
			generator.write(this.shards);

		}
		if (this.undesiredShards != null) {
			generator.writeKey("undesired_shards");
			generator.write(this.undesiredShards);

		}
		if (this.forecastedIngestLoad != null) {
			generator.writeKey("forecasted_ingest_load");
			generator.write(this.forecastedIngestLoad);

		}
		if (this.forecastedDiskUsage != null) {
			generator.writeKey("forecasted_disk_usage");
			generator.write(this.forecastedDiskUsage);

		}
		if (this.forecastedDiskUsageInBytes != null) {
			generator.writeKey("forecasted_disk_usage_in_bytes");
			generator.write(this.forecastedDiskUsageInBytes);

		}
		if (this.currentDiskUsage != null) {
			generator.writeKey("current_disk_usage");
			generator.write(this.currentDiskUsage);

		}
		if (this.currentDiskUsageInBytes != null) {
			generator.writeKey("current_disk_usage_in_bytes");
			generator.write(this.currentDiskUsageInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Allocations}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Allocations> {
		@Nullable
		private Integer shards;

		@Nullable
		private Integer undesiredShards;

		@Nullable
		private Double forecastedIngestLoad;

		@Nullable
		private String forecastedDiskUsage;

		@Nullable
		private Long forecastedDiskUsageInBytes;

		@Nullable
		private String currentDiskUsage;

		@Nullable
		private Long currentDiskUsageInBytes;

		public Builder() {
		}
		private Builder(Allocations instance) {
			this.shards = instance.shards;
			this.undesiredShards = instance.undesiredShards;
			this.forecastedIngestLoad = instance.forecastedIngestLoad;
			this.forecastedDiskUsage = instance.forecastedDiskUsage;
			this.forecastedDiskUsageInBytes = instance.forecastedDiskUsageInBytes;
			this.currentDiskUsage = instance.currentDiskUsage;
			this.currentDiskUsageInBytes = instance.currentDiskUsageInBytes;

		}
		/**
		 * Number of shards allocated to the node.
		 * <p>
		 * API name: {@code shards}
		 */
		public final Builder shards(@Nullable Integer value) {
			this.shards = value;
			return this;
		}

		/**
		 * Number of shards allocated to the node that are currently undesired.
		 * <p>
		 * API name: {@code undesired_shards}
		 */
		public final Builder undesiredShards(@Nullable Integer value) {
			this.undesiredShards = value;
			return this;
		}

		/**
		 * Forecasted ingest load for the node.
		 * <p>
		 * API name: {@code forecasted_ingest_load}
		 */
		public final Builder forecastedIngestLoad(@Nullable Double value) {
			this.forecastedIngestLoad = value;
			return this;
		}

		/**
		 * Forecasted disk usage for the node.
		 * <p>
		 * API name: {@code forecasted_disk_usage}
		 */
		public final Builder forecastedDiskUsage(@Nullable String value) {
			this.forecastedDiskUsage = value;
			return this;
		}

		/**
		 * Forecasted disk usage, in bytes, for the node.
		 * <p>
		 * API name: {@code forecasted_disk_usage_in_bytes}
		 */
		public final Builder forecastedDiskUsageInBytes(@Nullable Long value) {
			this.forecastedDiskUsageInBytes = value;
			return this;
		}

		/**
		 * Current disk usage for the node.
		 * <p>
		 * API name: {@code current_disk_usage}
		 */
		public final Builder currentDiskUsage(@Nullable String value) {
			this.currentDiskUsage = value;
			return this;
		}

		/**
		 * Current disk usage, in bytes, for the node.
		 * <p>
		 * API name: {@code current_disk_usage_in_bytes}
		 */
		public final Builder currentDiskUsageInBytes(@Nullable Long value) {
			this.currentDiskUsageInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Allocations}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Allocations build() {
			_checkSingleUse();

			return new Allocations(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Allocations}
	 */
	public static final JsonpDeserializer<Allocations> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Allocations::setupAllocationsDeserializer);

	protected static void setupAllocationsDeserializer(ObjectDeserializer<Allocations.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.integerDeserializer(), "shards");
		op.add(Builder::undesiredShards, JsonpDeserializer.integerDeserializer(), "undesired_shards");
		op.add(Builder::forecastedIngestLoad, JsonpDeserializer.doubleDeserializer(), "forecasted_ingest_load");
		op.add(Builder::forecastedDiskUsage, JsonpDeserializer.stringDeserializer(), "forecasted_disk_usage");
		op.add(Builder::forecastedDiskUsageInBytes, JsonpDeserializer.longDeserializer(),
				"forecasted_disk_usage_in_bytes");
		op.add(Builder::currentDiskUsage, JsonpDeserializer.stringDeserializer(), "current_disk_usage");
		op.add(Builder::currentDiskUsageInBytes, JsonpDeserializer.longDeserializer(), "current_disk_usage_in_bytes");

	}

}
