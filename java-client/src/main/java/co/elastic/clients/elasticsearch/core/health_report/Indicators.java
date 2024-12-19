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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.Indicators

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.Indicators">API
 *      specification</a>
 */
@JsonpDeserializable
public class Indicators implements JsonpSerializable {
	@Nullable
	private final MasterIsStableIndicator masterIsStable;

	@Nullable
	private final ShardsAvailabilityIndicator shardsAvailability;

	@Nullable
	private final DiskIndicator disk;

	@Nullable
	private final RepositoryIntegrityIndicator repositoryIntegrity;

	@Nullable
	private final DataStreamLifecycleIndicator dataStreamLifecycle;

	@Nullable
	private final IlmIndicator ilm;

	@Nullable
	private final SlmIndicator slm;

	@Nullable
	private final ShardsCapacityIndicator shardsCapacity;

	// ---------------------------------------------------------------------------------------------

	private Indicators(Builder builder) {

		this.masterIsStable = builder.masterIsStable;
		this.shardsAvailability = builder.shardsAvailability;
		this.disk = builder.disk;
		this.repositoryIntegrity = builder.repositoryIntegrity;
		this.dataStreamLifecycle = builder.dataStreamLifecycle;
		this.ilm = builder.ilm;
		this.slm = builder.slm;
		this.shardsCapacity = builder.shardsCapacity;

	}

	public static Indicators of(Function<Builder, ObjectBuilder<Indicators>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code master_is_stable}
	 */
	@Nullable
	public final MasterIsStableIndicator masterIsStable() {
		return this.masterIsStable;
	}

	/**
	 * API name: {@code shards_availability}
	 */
	@Nullable
	public final ShardsAvailabilityIndicator shardsAvailability() {
		return this.shardsAvailability;
	}

	/**
	 * API name: {@code disk}
	 */
	@Nullable
	public final DiskIndicator disk() {
		return this.disk;
	}

	/**
	 * API name: {@code repository_integrity}
	 */
	@Nullable
	public final RepositoryIntegrityIndicator repositoryIntegrity() {
		return this.repositoryIntegrity;
	}

	/**
	 * API name: {@code data_stream_lifecycle}
	 */
	@Nullable
	public final DataStreamLifecycleIndicator dataStreamLifecycle() {
		return this.dataStreamLifecycle;
	}

	/**
	 * API name: {@code ilm}
	 */
	@Nullable
	public final IlmIndicator ilm() {
		return this.ilm;
	}

	/**
	 * API name: {@code slm}
	 */
	@Nullable
	public final SlmIndicator slm() {
		return this.slm;
	}

	/**
	 * API name: {@code shards_capacity}
	 */
	@Nullable
	public final ShardsCapacityIndicator shardsCapacity() {
		return this.shardsCapacity;
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

		if (this.masterIsStable != null) {
			generator.writeKey("master_is_stable");
			this.masterIsStable.serialize(generator, mapper);

		}
		if (this.shardsAvailability != null) {
			generator.writeKey("shards_availability");
			this.shardsAvailability.serialize(generator, mapper);

		}
		if (this.disk != null) {
			generator.writeKey("disk");
			this.disk.serialize(generator, mapper);

		}
		if (this.repositoryIntegrity != null) {
			generator.writeKey("repository_integrity");
			this.repositoryIntegrity.serialize(generator, mapper);

		}
		if (this.dataStreamLifecycle != null) {
			generator.writeKey("data_stream_lifecycle");
			this.dataStreamLifecycle.serialize(generator, mapper);

		}
		if (this.ilm != null) {
			generator.writeKey("ilm");
			this.ilm.serialize(generator, mapper);

		}
		if (this.slm != null) {
			generator.writeKey("slm");
			this.slm.serialize(generator, mapper);

		}
		if (this.shardsCapacity != null) {
			generator.writeKey("shards_capacity");
			this.shardsCapacity.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Indicators}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Indicators> {
		@Nullable
		private MasterIsStableIndicator masterIsStable;

		@Nullable
		private ShardsAvailabilityIndicator shardsAvailability;

		@Nullable
		private DiskIndicator disk;

		@Nullable
		private RepositoryIntegrityIndicator repositoryIntegrity;

		@Nullable
		private DataStreamLifecycleIndicator dataStreamLifecycle;

		@Nullable
		private IlmIndicator ilm;

		@Nullable
		private SlmIndicator slm;

		@Nullable
		private ShardsCapacityIndicator shardsCapacity;

		/**
		 * API name: {@code master_is_stable}
		 */
		public final Builder masterIsStable(@Nullable MasterIsStableIndicator value) {
			this.masterIsStable = value;
			return this;
		}

		/**
		 * API name: {@code master_is_stable}
		 */
		public final Builder masterIsStable(
				Function<MasterIsStableIndicator.Builder, ObjectBuilder<MasterIsStableIndicator>> fn) {
			return this.masterIsStable(fn.apply(new MasterIsStableIndicator.Builder()).build());
		}

		/**
		 * API name: {@code shards_availability}
		 */
		public final Builder shardsAvailability(@Nullable ShardsAvailabilityIndicator value) {
			this.shardsAvailability = value;
			return this;
		}

		/**
		 * API name: {@code shards_availability}
		 */
		public final Builder shardsAvailability(
				Function<ShardsAvailabilityIndicator.Builder, ObjectBuilder<ShardsAvailabilityIndicator>> fn) {
			return this.shardsAvailability(fn.apply(new ShardsAvailabilityIndicator.Builder()).build());
		}

		/**
		 * API name: {@code disk}
		 */
		public final Builder disk(@Nullable DiskIndicator value) {
			this.disk = value;
			return this;
		}

		/**
		 * API name: {@code disk}
		 */
		public final Builder disk(Function<DiskIndicator.Builder, ObjectBuilder<DiskIndicator>> fn) {
			return this.disk(fn.apply(new DiskIndicator.Builder()).build());
		}

		/**
		 * API name: {@code repository_integrity}
		 */
		public final Builder repositoryIntegrity(@Nullable RepositoryIntegrityIndicator value) {
			this.repositoryIntegrity = value;
			return this;
		}

		/**
		 * API name: {@code repository_integrity}
		 */
		public final Builder repositoryIntegrity(
				Function<RepositoryIntegrityIndicator.Builder, ObjectBuilder<RepositoryIntegrityIndicator>> fn) {
			return this.repositoryIntegrity(fn.apply(new RepositoryIntegrityIndicator.Builder()).build());
		}

		/**
		 * API name: {@code data_stream_lifecycle}
		 */
		public final Builder dataStreamLifecycle(@Nullable DataStreamLifecycleIndicator value) {
			this.dataStreamLifecycle = value;
			return this;
		}

		/**
		 * API name: {@code data_stream_lifecycle}
		 */
		public final Builder dataStreamLifecycle(
				Function<DataStreamLifecycleIndicator.Builder, ObjectBuilder<DataStreamLifecycleIndicator>> fn) {
			return this.dataStreamLifecycle(fn.apply(new DataStreamLifecycleIndicator.Builder()).build());
		}

		/**
		 * API name: {@code ilm}
		 */
		public final Builder ilm(@Nullable IlmIndicator value) {
			this.ilm = value;
			return this;
		}

		/**
		 * API name: {@code ilm}
		 */
		public final Builder ilm(Function<IlmIndicator.Builder, ObjectBuilder<IlmIndicator>> fn) {
			return this.ilm(fn.apply(new IlmIndicator.Builder()).build());
		}

		/**
		 * API name: {@code slm}
		 */
		public final Builder slm(@Nullable SlmIndicator value) {
			this.slm = value;
			return this;
		}

		/**
		 * API name: {@code slm}
		 */
		public final Builder slm(Function<SlmIndicator.Builder, ObjectBuilder<SlmIndicator>> fn) {
			return this.slm(fn.apply(new SlmIndicator.Builder()).build());
		}

		/**
		 * API name: {@code shards_capacity}
		 */
		public final Builder shardsCapacity(@Nullable ShardsCapacityIndicator value) {
			this.shardsCapacity = value;
			return this;
		}

		/**
		 * API name: {@code shards_capacity}
		 */
		public final Builder shardsCapacity(
				Function<ShardsCapacityIndicator.Builder, ObjectBuilder<ShardsCapacityIndicator>> fn) {
			return this.shardsCapacity(fn.apply(new ShardsCapacityIndicator.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Indicators}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Indicators build() {
			_checkSingleUse();

			return new Indicators(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Indicators}
	 */
	public static final JsonpDeserializer<Indicators> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Indicators::setupIndicatorsDeserializer);

	protected static void setupIndicatorsDeserializer(ObjectDeserializer<Indicators.Builder> op) {

		op.add(Builder::masterIsStable, MasterIsStableIndicator._DESERIALIZER, "master_is_stable");
		op.add(Builder::shardsAvailability, ShardsAvailabilityIndicator._DESERIALIZER, "shards_availability");
		op.add(Builder::disk, DiskIndicator._DESERIALIZER, "disk");
		op.add(Builder::repositoryIntegrity, RepositoryIntegrityIndicator._DESERIALIZER, "repository_integrity");
		op.add(Builder::dataStreamLifecycle, DataStreamLifecycleIndicator._DESERIALIZER, "data_stream_lifecycle");
		op.add(Builder::ilm, IlmIndicator._DESERIALIZER, "ilm");
		op.add(Builder::slm, SlmIndicator._DESERIALIZER, "slm");
		op.add(Builder::shardsCapacity, ShardsCapacityIndicator._DESERIALIZER, "shards_capacity");

	}

}
