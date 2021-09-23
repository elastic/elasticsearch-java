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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.elasticsearch._types.Retries;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks._types.Status
public final class Status implements JsonpSerializable {
	private final Number batches;

	@Nullable
	private final String canceled;

	private final Number created;

	private final Number deleted;

	private final Number noops;

	@Nullable
	private final List<String> failures;

	private final Number requestsPerSecond;

	private final Retries retries;

	@Nullable
	private final JsonValue throttled;

	private final Number throttledMillis;

	@Nullable
	private final JsonValue throttledUntil;

	private final Number throttledUntilMillis;

	@Nullable
	private final Boolean timedOut;

	@Nullable
	private final Number took;

	private final Number total;

	private final Number updated;

	private final Number versionConflicts;

	// ---------------------------------------------------------------------------------------------

	public Status(Builder builder) {

		this.batches = Objects.requireNonNull(builder.batches, "batches");
		this.canceled = builder.canceled;
		this.created = Objects.requireNonNull(builder.created, "created");
		this.deleted = Objects.requireNonNull(builder.deleted, "deleted");
		this.noops = Objects.requireNonNull(builder.noops, "noops");
		this.failures = builder.failures;
		this.requestsPerSecond = Objects.requireNonNull(builder.requestsPerSecond, "requests_per_second");
		this.retries = Objects.requireNonNull(builder.retries, "retries");
		this.throttled = builder.throttled;
		this.throttledMillis = Objects.requireNonNull(builder.throttledMillis, "throttled_millis");
		this.throttledUntil = builder.throttledUntil;
		this.throttledUntilMillis = Objects.requireNonNull(builder.throttledUntilMillis, "throttled_until_millis");
		this.timedOut = builder.timedOut;
		this.took = builder.took;
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
	 * API name: {@code canceled}
	 */
	@Nullable
	public String canceled() {
		return this.canceled;
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
	 * API name: {@code failures}
	 */
	@Nullable
	public List<String> failures() {
		return this.failures;
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
	 * API name: {@code throttled}
	 */
	@Nullable
	public JsonValue throttled() {
		return this.throttled;
	}

	/**
	 * API name: {@code throttled_millis}
	 */
	public Number throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until}
	 */
	@Nullable
	public JsonValue throttledUntil() {
		return this.throttledUntil;
	}

	/**
	 * API name: {@code throttled_until_millis}
	 */
	public Number throttledUntilMillis() {
		return this.throttledUntilMillis;
	}

	/**
	 * API name: {@code timed_out}
	 */
	@Nullable
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public Number took() {
		return this.took;
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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("batches");
		generator.write(this.batches.doubleValue());

		if (this.canceled != null) {

			generator.writeKey("canceled");
			generator.write(this.canceled);

		}

		generator.writeKey("created");
		generator.write(this.created.doubleValue());

		generator.writeKey("deleted");
		generator.write(this.deleted.doubleValue());

		generator.writeKey("noops");
		generator.write(this.noops.doubleValue());

		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (String item0 : this.failures) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("requests_per_second");
		generator.write(this.requestsPerSecond.doubleValue());

		generator.writeKey("retries");
		this.retries.serialize(generator, mapper);

		if (this.throttled != null) {

			generator.writeKey("throttled");
			generator.write(this.throttled);

		}

		generator.writeKey("throttled_millis");
		generator.write(this.throttledMillis.doubleValue());

		if (this.throttledUntil != null) {

			generator.writeKey("throttled_until");
			generator.write(this.throttledUntil);

		}

		generator.writeKey("throttled_until_millis");
		generator.write(this.throttledUntilMillis.doubleValue());

		if (this.timedOut != null) {

			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}
		if (this.took != null) {

			generator.writeKey("took");
			generator.write(this.took.doubleValue());

		}

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("updated");
		generator.write(this.updated.doubleValue());

		generator.writeKey("version_conflicts");
		generator.write(this.versionConflicts.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Status}.
	 */
	public static class Builder implements ObjectBuilder<Status> {
		private Number batches;

		@Nullable
		private String canceled;

		private Number created;

		private Number deleted;

		private Number noops;

		@Nullable
		private List<String> failures;

		private Number requestsPerSecond;

		private Retries retries;

		@Nullable
		private JsonValue throttled;

		private Number throttledMillis;

		@Nullable
		private JsonValue throttledUntil;

		private Number throttledUntilMillis;

		@Nullable
		private Boolean timedOut;

		@Nullable
		private Number took;

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
		 * API name: {@code canceled}
		 */
		public Builder canceled(@Nullable String value) {
			this.canceled = value;
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
		 * API name: {@code failures}
		 */
		public Builder failures(@Nullable List<String> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(String... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(String value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
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
		 * API name: {@code throttled}
		 */
		public Builder throttled(@Nullable JsonValue value) {
			this.throttled = value;
			return this;
		}

		/**
		 * API name: {@code throttled_millis}
		 */
		public Builder throttledMillis(Number value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until}
		 */
		public Builder throttledUntil(@Nullable JsonValue value) {
			this.throttledUntil = value;
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
		 * API name: {@code timed_out}
		 */
		public Builder timedOut(@Nullable Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(@Nullable Number value) {
			this.took = value;
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
		 * Builds a {@link Status}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Status build() {

			return new Status(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Status}
	 */
	public static final JsonpDeserializer<Status> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Status::setupStatusDeserializer);

	protected static void setupStatusDeserializer(DelegatingDeserializer<Status.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.numberDeserializer(), "batches");
		op.add(Builder::canceled, JsonpDeserializer.stringDeserializer(), "canceled");
		op.add(Builder::created, JsonpDeserializer.numberDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.numberDeserializer(), "deleted");
		op.add(Builder::noops, JsonpDeserializer.numberDeserializer(), "noops");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"failures");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.numberDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries.DESERIALIZER, "retries");
		op.add(Builder::throttled, JsonpDeserializer.jsonValueDeserializer(), "throttled");
		op.add(Builder::throttledMillis, JsonpDeserializer.numberDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntil, JsonpDeserializer.jsonValueDeserializer(), "throttled_until");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.numberDeserializer(), "throttled_until_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.numberDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.numberDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.numberDeserializer(), "version_conflicts");

	}

}
