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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _global.health_report.ShardsAvailabilityIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.ShardsAvailabilityIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsAvailabilityIndicatorDetails implements JsonpSerializable {
	private final long creatingPrimaries;

	private final long creatingReplicas;

	private final long initializingPrimaries;

	private final long initializingReplicas;

	private final long restartingPrimaries;

	private final long restartingReplicas;

	private final long startedPrimaries;

	private final long startedReplicas;

	private final long unassignedPrimaries;

	private final long unassignedReplicas;

	// ---------------------------------------------------------------------------------------------

	private ShardsAvailabilityIndicatorDetails(Builder builder) {

		this.creatingPrimaries = ApiTypeHelper.requireNonNull(builder.creatingPrimaries, this, "creatingPrimaries");
		this.creatingReplicas = ApiTypeHelper.requireNonNull(builder.creatingReplicas, this, "creatingReplicas");
		this.initializingPrimaries = ApiTypeHelper.requireNonNull(builder.initializingPrimaries, this,
				"initializingPrimaries");
		this.initializingReplicas = ApiTypeHelper.requireNonNull(builder.initializingReplicas, this,
				"initializingReplicas");
		this.restartingPrimaries = ApiTypeHelper.requireNonNull(builder.restartingPrimaries, this,
				"restartingPrimaries");
		this.restartingReplicas = ApiTypeHelper.requireNonNull(builder.restartingReplicas, this, "restartingReplicas");
		this.startedPrimaries = ApiTypeHelper.requireNonNull(builder.startedPrimaries, this, "startedPrimaries");
		this.startedReplicas = ApiTypeHelper.requireNonNull(builder.startedReplicas, this, "startedReplicas");
		this.unassignedPrimaries = ApiTypeHelper.requireNonNull(builder.unassignedPrimaries, this,
				"unassignedPrimaries");
		this.unassignedReplicas = ApiTypeHelper.requireNonNull(builder.unassignedReplicas, this, "unassignedReplicas");

	}

	public static ShardsAvailabilityIndicatorDetails of(
			Function<Builder, ObjectBuilder<ShardsAvailabilityIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code creating_primaries}
	 */
	public final long creatingPrimaries() {
		return this.creatingPrimaries;
	}

	/**
	 * Required - API name: {@code creating_replicas}
	 */
	public final long creatingReplicas() {
		return this.creatingReplicas;
	}

	/**
	 * Required - API name: {@code initializing_primaries}
	 */
	public final long initializingPrimaries() {
		return this.initializingPrimaries;
	}

	/**
	 * Required - API name: {@code initializing_replicas}
	 */
	public final long initializingReplicas() {
		return this.initializingReplicas;
	}

	/**
	 * Required - API name: {@code restarting_primaries}
	 */
	public final long restartingPrimaries() {
		return this.restartingPrimaries;
	}

	/**
	 * Required - API name: {@code restarting_replicas}
	 */
	public final long restartingReplicas() {
		return this.restartingReplicas;
	}

	/**
	 * Required - API name: {@code started_primaries}
	 */
	public final long startedPrimaries() {
		return this.startedPrimaries;
	}

	/**
	 * Required - API name: {@code started_replicas}
	 */
	public final long startedReplicas() {
		return this.startedReplicas;
	}

	/**
	 * Required - API name: {@code unassigned_primaries}
	 */
	public final long unassignedPrimaries() {
		return this.unassignedPrimaries;
	}

	/**
	 * Required - API name: {@code unassigned_replicas}
	 */
	public final long unassignedReplicas() {
		return this.unassignedReplicas;
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

		generator.writeKey("creating_primaries");
		generator.write(this.creatingPrimaries);

		generator.writeKey("creating_replicas");
		generator.write(this.creatingReplicas);

		generator.writeKey("initializing_primaries");
		generator.write(this.initializingPrimaries);

		generator.writeKey("initializing_replicas");
		generator.write(this.initializingReplicas);

		generator.writeKey("restarting_primaries");
		generator.write(this.restartingPrimaries);

		generator.writeKey("restarting_replicas");
		generator.write(this.restartingReplicas);

		generator.writeKey("started_primaries");
		generator.write(this.startedPrimaries);

		generator.writeKey("started_replicas");
		generator.write(this.startedReplicas);

		generator.writeKey("unassigned_primaries");
		generator.write(this.unassignedPrimaries);

		generator.writeKey("unassigned_replicas");
		generator.write(this.unassignedReplicas);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsAvailabilityIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ShardsAvailabilityIndicatorDetails> {
		private Long creatingPrimaries;

		private Long creatingReplicas;

		private Long initializingPrimaries;

		private Long initializingReplicas;

		private Long restartingPrimaries;

		private Long restartingReplicas;

		private Long startedPrimaries;

		private Long startedReplicas;

		private Long unassignedPrimaries;

		private Long unassignedReplicas;

		/**
		 * Required - API name: {@code creating_primaries}
		 */
		public final Builder creatingPrimaries(long value) {
			this.creatingPrimaries = value;
			return this;
		}

		/**
		 * Required - API name: {@code creating_replicas}
		 */
		public final Builder creatingReplicas(long value) {
			this.creatingReplicas = value;
			return this;
		}

		/**
		 * Required - API name: {@code initializing_primaries}
		 */
		public final Builder initializingPrimaries(long value) {
			this.initializingPrimaries = value;
			return this;
		}

		/**
		 * Required - API name: {@code initializing_replicas}
		 */
		public final Builder initializingReplicas(long value) {
			this.initializingReplicas = value;
			return this;
		}

		/**
		 * Required - API name: {@code restarting_primaries}
		 */
		public final Builder restartingPrimaries(long value) {
			this.restartingPrimaries = value;
			return this;
		}

		/**
		 * Required - API name: {@code restarting_replicas}
		 */
		public final Builder restartingReplicas(long value) {
			this.restartingReplicas = value;
			return this;
		}

		/**
		 * Required - API name: {@code started_primaries}
		 */
		public final Builder startedPrimaries(long value) {
			this.startedPrimaries = value;
			return this;
		}

		/**
		 * Required - API name: {@code started_replicas}
		 */
		public final Builder startedReplicas(long value) {
			this.startedReplicas = value;
			return this;
		}

		/**
		 * Required - API name: {@code unassigned_primaries}
		 */
		public final Builder unassignedPrimaries(long value) {
			this.unassignedPrimaries = value;
			return this;
		}

		/**
		 * Required - API name: {@code unassigned_replicas}
		 */
		public final Builder unassignedReplicas(long value) {
			this.unassignedReplicas = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsAvailabilityIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsAvailabilityIndicatorDetails build() {
			_checkSingleUse();

			return new ShardsAvailabilityIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsAvailabilityIndicatorDetails}
	 */
	public static final JsonpDeserializer<ShardsAvailabilityIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ShardsAvailabilityIndicatorDetails::setupShardsAvailabilityIndicatorDetailsDeserializer);

	protected static void setupShardsAvailabilityIndicatorDetailsDeserializer(
			ObjectDeserializer<ShardsAvailabilityIndicatorDetails.Builder> op) {

		op.add(Builder::creatingPrimaries, JsonpDeserializer.longDeserializer(), "creating_primaries");
		op.add(Builder::creatingReplicas, JsonpDeserializer.longDeserializer(), "creating_replicas");
		op.add(Builder::initializingPrimaries, JsonpDeserializer.longDeserializer(), "initializing_primaries");
		op.add(Builder::initializingReplicas, JsonpDeserializer.longDeserializer(), "initializing_replicas");
		op.add(Builder::restartingPrimaries, JsonpDeserializer.longDeserializer(), "restarting_primaries");
		op.add(Builder::restartingReplicas, JsonpDeserializer.longDeserializer(), "restarting_replicas");
		op.add(Builder::startedPrimaries, JsonpDeserializer.longDeserializer(), "started_primaries");
		op.add(Builder::startedReplicas, JsonpDeserializer.longDeserializer(), "started_replicas");
		op.add(Builder::unassignedPrimaries, JsonpDeserializer.longDeserializer(), "unassigned_primaries");
		op.add(Builder::unassignedReplicas, JsonpDeserializer.longDeserializer(), "unassigned_replicas");

	}

}
