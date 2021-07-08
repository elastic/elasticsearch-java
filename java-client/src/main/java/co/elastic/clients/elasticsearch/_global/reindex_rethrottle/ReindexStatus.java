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

package co.elastic.clients.elasticsearch._global.reindex_rethrottle;

import co.elastic.clients.elasticsearch._types.Retries;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex_rethrottle.ReindexStatus
public final class ReindexStatus implements ToJsonp {
	private final Number batches;

	private final Number created;

	private final Number deleted;

	private final Number noops;

	private final Number requestsPerSecond;

	private final Retries retries;

	private final Number throttledMillis;

	private final Number throttledUntilMillis;

	private final Number total;

	private final Number updated;

	private final Number versionConflicts;

	// ---------------------------------------------------------------------------------------------

	protected ReindexStatus(Builder builder) {

		this.batches = Objects.requireNonNull(builder.batches, "batches");
		this.created = Objects.requireNonNull(builder.created, "created");
		this.deleted = Objects.requireNonNull(builder.deleted, "deleted");
		this.noops = Objects.requireNonNull(builder.noops, "noops");
		this.requestsPerSecond = Objects.requireNonNull(builder.requestsPerSecond, "requests_per_second");
		this.retries = Objects.requireNonNull(builder.retries, "retries");
		this.throttledMillis = Objects.requireNonNull(builder.throttledMillis, "throttled_millis");
		this.throttledUntilMillis = Objects.requireNonNull(builder.throttledUntilMillis, "throttled_until_millis");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.updated = Objects.requireNonNull(builder.updated, "updated");
		this.versionConflicts = Objects.requireNonNull(builder.versionConflicts, "version_conflicts");

	}

	/**
	 * API name: {@code batches}
	 */
	public Number batches() {
		return this.batches;
	}

	/**
	 * API name: {@code created}
	 */
	public Number created() {
		return this.created;
	}

	/**
	 * API name: {@code deleted}
	 */
	public Number deleted() {
		return this.deleted;
	}

	/**
	 * API name: {@code noops}
	 */
	public Number noops() {
		return this.noops;
	}

	/**
	 * API name: {@code requests_per_second}
	 */
	public Number requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * API name: {@code retries}
	 */
	public Retries retries() {
		return this.retries;
	}

	/**
	 * API name: {@code throttled_millis}
	 */
	public Number throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until_millis}
	 */
	public Number throttledUntilMillis() {
		return this.throttledUntilMillis;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code updated}
	 */
	public Number updated() {
		return this.updated;
	}

	/**
	 * API name: {@code version_conflicts}
	 */
	public Number versionConflicts() {
		return this.versionConflicts;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("batches");
		generator.write(this.batches.doubleValue());

		generator.writeKey("created");
		generator.write(this.created.doubleValue());

		generator.writeKey("deleted");
		generator.write(this.deleted.doubleValue());

		generator.writeKey("noops");
		generator.write(this.noops.doubleValue());

		generator.writeKey("requests_per_second");
		generator.write(this.requestsPerSecond.doubleValue());

		generator.writeKey("retries");
		this.retries.toJsonp(generator, mapper);

		generator.writeKey("throttled_millis");
		generator.write(this.throttledMillis.doubleValue());

		generator.writeKey("throttled_until_millis");
		generator.write(this.throttledUntilMillis.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("updated");
		generator.write(this.updated.doubleValue());

		generator.writeKey("version_conflicts");
		generator.write(this.versionConflicts.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexStatus}.
	 */
	public static class Builder implements ObjectBuilder<ReindexStatus> {
		private Number batches;

		private Number created;

		private Number deleted;

		private Number noops;

		private Number requestsPerSecond;

		private Retries retries;

		private Number throttledMillis;

		private Number throttledUntilMillis;

		private Number total;

		private Number updated;

		private Number versionConflicts;

		/**
		 * API name: {@code batches}
		 */
		public Builder batches(Number value) {
			this.batches = value;
			return this;
		}

		/**
		 * API name: {@code created}
		 */
		public Builder created(Number value) {
			this.created = value;
			return this;
		}

		/**
		 * API name: {@code deleted}
		 */
		public Builder deleted(Number value) {
			this.deleted = value;
			return this;
		}

		/**
		 * API name: {@code noops}
		 */
		public Builder noops(Number value) {
			this.noops = value;
			return this;
		}

		/**
		 * API name: {@code requests_per_second}
		 */
		public Builder requestsPerSecond(Number value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public Builder retries(Retries value) {
			this.retries = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public Builder retries(Function<Retries.Builder, ObjectBuilder<Retries>> fn) {
			return this.retries(fn.apply(new Retries.Builder()).build());
		}

		/**
		 * API name: {@code throttled_millis}
		 */
		public Builder throttledMillis(Number value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until_millis}
		 */
		public Builder throttledUntilMillis(Number value) {
			this.throttledUntilMillis = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code updated}
		 */
		public Builder updated(Number value) {
			this.updated = value;
			return this;
		}

		/**
		 * API name: {@code version_conflicts}
		 */
		public Builder versionConflicts(Number value) {
			this.versionConflicts = value;
			return this;
		}

		/**
		 * Builds a {@link ReindexStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexStatus build() {

			return new ReindexStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ReindexStatus
	 */
	public static final JsonpDeserializer<ReindexStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ReindexStatus::setupReindexStatusDeserializer);

	protected static void setupReindexStatusDeserializer(DelegatingDeserializer<ReindexStatus.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.numberDeserializer(), "batches");
		op.add(Builder::created, JsonpDeserializer.numberDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.numberDeserializer(), "deleted");
		op.add(Builder::noops, JsonpDeserializer.numberDeserializer(), "noops");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.numberDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries.DESERIALIZER, "retries");
		op.add(Builder::throttledMillis, JsonpDeserializer.numberDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.numberDeserializer(), "throttled_until_millis");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.numberDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.numberDeserializer(), "version_conflicts");

	}

}
