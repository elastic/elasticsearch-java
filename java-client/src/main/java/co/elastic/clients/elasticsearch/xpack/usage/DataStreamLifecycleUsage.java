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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
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

// typedef: xpack.usage.DataStreamLifecycleUsage

/**
 * Usage statistics for data stream lifecycle (DLM), reported by
 * <code>_xpack/usage</code> under <code>data_lifecycle</code>. Besides
 * <code>available</code> and <code>enabled</code>, all the following statistics
 * are only present when the feature is enabled.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.DataStreamLifecycleUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleUsage extends Base {
	@Nullable
	private final Long count;

	@Nullable
	private final Boolean defaultRolloverUsed;

	@Nullable
	private final DataStreamLifecycleRetentionStats dataRetention;

	@Nullable
	private final DataStreamLifecycleEffectiveRetentionStats effectiveRetention;

	@Nullable
	private final DataStreamLifecycleRetentionStats frozenAfter;

	@Nullable
	private final DataStreamLifecycleGlobalRetention globalRetention;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleUsage(Builder builder) {
		super(builder);

		this.count = builder.count;
		this.defaultRolloverUsed = builder.defaultRolloverUsed;
		this.dataRetention = builder.dataRetention;
		this.effectiveRetention = builder.effectiveRetention;
		this.frozenAfter = builder.frozenAfter;
		this.globalRetention = builder.globalRetention;

	}

	public static DataStreamLifecycleUsage of(Function<Builder, ObjectBuilder<DataStreamLifecycleUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of data streams that have a lifecycle configured.
	 * <p>
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * Whether the default rollover configuration is used by at least one data
	 * stream.
	 * <p>
	 * API name: {@code default_rollover_used}
	 */
	@Nullable
	public final Boolean defaultRolloverUsed() {
		return this.defaultRolloverUsed;
	}

	/**
	 * Statistics about the explicitly configured data retention across data
	 * streams.
	 * <p>
	 * API name: {@code data_retention}
	 */
	@Nullable
	public final DataStreamLifecycleRetentionStats dataRetention() {
		return this.dataRetention;
	}

	/**
	 * Statistics about the effective retention (configured or derived from global
	 * retention) across data streams.
	 * <p>
	 * API name: {@code effective_retention}
	 */
	@Nullable
	public final DataStreamLifecycleEffectiveRetentionStats effectiveRetention() {
		return this.effectiveRetention;
	}

	/**
	 * Statistics about the configured <code>frozen_after</code> (searchable
	 * snapshot) tier threshold across data streams.
	 * <p>
	 * API name: {@code frozen_after}
	 */
	@Nullable
	public final DataStreamLifecycleRetentionStats frozenAfter() {
		return this.frozenAfter;
	}

	/**
	 * Statistics about the cluster's global default and maximum retention settings.
	 * <p>
	 * API name: {@code global_retention}
	 */
	@Nullable
	public final DataStreamLifecycleGlobalRetention globalRetention() {
		return this.globalRetention;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.defaultRolloverUsed != null) {
			generator.writeKey("default_rollover_used");
			generator.write(this.defaultRolloverUsed);

		}
		if (this.dataRetention != null) {
			generator.writeKey("data_retention");
			this.dataRetention.serialize(generator, mapper);

		}
		if (this.effectiveRetention != null) {
			generator.writeKey("effective_retention");
			this.effectiveRetention.serialize(generator, mapper);

		}
		if (this.frozenAfter != null) {
			generator.writeKey("frozen_after");
			this.frozenAfter.serialize(generator, mapper);

		}
		if (this.globalRetention != null) {
			generator.writeKey("global_retention");
			this.globalRetention.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycleUsage}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleUsage> {
		@Nullable
		private Long count;

		@Nullable
		private Boolean defaultRolloverUsed;

		@Nullable
		private DataStreamLifecycleRetentionStats dataRetention;

		@Nullable
		private DataStreamLifecycleEffectiveRetentionStats effectiveRetention;

		@Nullable
		private DataStreamLifecycleRetentionStats frozenAfter;

		@Nullable
		private DataStreamLifecycleGlobalRetention globalRetention;

		public Builder() {
		}
		private Builder(DataStreamLifecycleUsage instance) {
			this.count = instance.count;
			this.defaultRolloverUsed = instance.defaultRolloverUsed;
			this.dataRetention = instance.dataRetention;
			this.effectiveRetention = instance.effectiveRetention;
			this.frozenAfter = instance.frozenAfter;
			this.globalRetention = instance.globalRetention;

		}
		/**
		 * The number of data streams that have a lifecycle configured.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * Whether the default rollover configuration is used by at least one data
		 * stream.
		 * <p>
		 * API name: {@code default_rollover_used}
		 */
		public final Builder defaultRolloverUsed(@Nullable Boolean value) {
			this.defaultRolloverUsed = value;
			return this;
		}

		/**
		 * Statistics about the explicitly configured data retention across data
		 * streams.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(@Nullable DataStreamLifecycleRetentionStats value) {
			this.dataRetention = value;
			return this;
		}

		/**
		 * Statistics about the explicitly configured data retention across data
		 * streams.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(
				Function<DataStreamLifecycleRetentionStats.Builder, ObjectBuilder<DataStreamLifecycleRetentionStats>> fn) {
			return this.dataRetention(fn.apply(new DataStreamLifecycleRetentionStats.Builder()).build());
		}

		/**
		 * Statistics about the effective retention (configured or derived from global
		 * retention) across data streams.
		 * <p>
		 * API name: {@code effective_retention}
		 */
		public final Builder effectiveRetention(@Nullable DataStreamLifecycleEffectiveRetentionStats value) {
			this.effectiveRetention = value;
			return this;
		}

		/**
		 * Statistics about the effective retention (configured or derived from global
		 * retention) across data streams.
		 * <p>
		 * API name: {@code effective_retention}
		 */
		public final Builder effectiveRetention(
				Function<DataStreamLifecycleEffectiveRetentionStats.Builder, ObjectBuilder<DataStreamLifecycleEffectiveRetentionStats>> fn) {
			return this.effectiveRetention(fn.apply(new DataStreamLifecycleEffectiveRetentionStats.Builder()).build());
		}

		/**
		 * Statistics about the configured <code>frozen_after</code> (searchable
		 * snapshot) tier threshold across data streams.
		 * <p>
		 * API name: {@code frozen_after}
		 */
		public final Builder frozenAfter(@Nullable DataStreamLifecycleRetentionStats value) {
			this.frozenAfter = value;
			return this;
		}

		/**
		 * Statistics about the configured <code>frozen_after</code> (searchable
		 * snapshot) tier threshold across data streams.
		 * <p>
		 * API name: {@code frozen_after}
		 */
		public final Builder frozenAfter(
				Function<DataStreamLifecycleRetentionStats.Builder, ObjectBuilder<DataStreamLifecycleRetentionStats>> fn) {
			return this.frozenAfter(fn.apply(new DataStreamLifecycleRetentionStats.Builder()).build());
		}

		/**
		 * Statistics about the cluster's global default and maximum retention settings.
		 * <p>
		 * API name: {@code global_retention}
		 */
		public final Builder globalRetention(@Nullable DataStreamLifecycleGlobalRetention value) {
			this.globalRetention = value;
			return this;
		}

		/**
		 * Statistics about the cluster's global default and maximum retention settings.
		 * <p>
		 * API name: {@code global_retention}
		 */
		public final Builder globalRetention(
				Function<DataStreamLifecycleGlobalRetention.Builder, ObjectBuilder<DataStreamLifecycleGlobalRetention>> fn) {
			return this.globalRetention(fn.apply(new DataStreamLifecycleGlobalRetention.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleUsage build() {
			_checkSingleUse();

			return new DataStreamLifecycleUsage(this);
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
	 * Json deserializer for {@link DataStreamLifecycleUsage}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleUsage> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamLifecycleUsage::setupDataStreamLifecycleUsageDeserializer);

	protected static void setupDataStreamLifecycleUsageDeserializer(
			ObjectDeserializer<DataStreamLifecycleUsage.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::defaultRolloverUsed, JsonpDeserializer.booleanDeserializer(), "default_rollover_used");
		op.add(Builder::dataRetention, DataStreamLifecycleRetentionStats._DESERIALIZER, "data_retention");
		op.add(Builder::effectiveRetention, DataStreamLifecycleEffectiveRetentionStats._DESERIALIZER,
				"effective_retention");
		op.add(Builder::frozenAfter, DataStreamLifecycleRetentionStats._DESERIALIZER, "frozen_after");
		op.add(Builder::globalRetention, DataStreamLifecycleGlobalRetention._DESERIALIZER, "global_retention");

	}

}
