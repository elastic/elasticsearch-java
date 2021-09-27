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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks._types.Status
@JsonpDeserializable
public final class Status implements JsonpSerializable {
	private final Long batches;

	@Nullable
	private final String canceled;

	private final Long created;

	private final Long deleted;

	private final Long noops;

	@Nullable
	private final List<String> failures;

	private final Float requestsPerSecond;

	private final Retries retries;

	@Nullable
	private final String throttled;

	private final Long throttledMillis;

	@Nullable
	private final String throttledUntil;

	private final Long throttledUntilMillis;

	@Nullable
	private final Boolean timedOut;

	@Nullable
	private final Long took;

	private final Long total;

	private final Long updated;

	private final Long versionConflicts;

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
	public Long batches() {
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
	public Long created() {
		return this.created;
	}

	/**
	 * API name: {@code deleted}
	 */
	public Long deleted() {
		return this.deleted;
	}

	/**
	 * API name: {@code noops}
	 */
	public Long noops() {
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
	public Float requestsPerSecond() {
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
	public String throttled() {
		return this.throttled;
	}

	/**
	 * API name: {@code throttled_millis}
	 */
	public Long throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until}
	 */
	@Nullable
	public String throttledUntil() {
		return this.throttledUntil;
	}

	/**
	 * API name: {@code throttled_until_millis}
	 */
	public Long throttledUntilMillis() {
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
	public Long took() {
		return this.took;
	}

	/**
	 * API name: {@code total}
	 */
	public Long total() {
		return this.total;
	}

	/**
	 * API name: {@code updated}
	 */
	public Long updated() {
		return this.updated;
	}

	/**
	 * API name: {@code version_conflicts}
	 */
	public Long versionConflicts() {
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
		generator.write(this.batches);

		if (this.canceled != null) {

			generator.writeKey("canceled");
			generator.write(this.canceled);

		}

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("deleted");
		generator.write(this.deleted);

		generator.writeKey("noops");
		generator.write(this.noops);

		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (String item0 : this.failures) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("requests_per_second");
		generator.write(this.requestsPerSecond);

		generator.writeKey("retries");
		this.retries.serialize(generator, mapper);

		if (this.throttled != null) {

			generator.writeKey("throttled");
			generator.write(this.throttled);

		}

		generator.writeKey("throttled_millis");
		generator.write(this.throttledMillis);

		if (this.throttledUntil != null) {

			generator.writeKey("throttled_until");
			generator.write(this.throttledUntil);

		}

		generator.writeKey("throttled_until_millis");
		generator.write(this.throttledUntilMillis);

		if (this.timedOut != null) {

			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}
		if (this.took != null) {

			generator.writeKey("took");
			generator.write(this.took);

		}

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("updated");
		generator.write(this.updated);

		generator.writeKey("version_conflicts");
		generator.write(this.versionConflicts);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Status}.
	 */
	public static class Builder implements ObjectBuilder<Status> {
		private Long batches;

		@Nullable
		private String canceled;

		private Long created;

		private Long deleted;

		private Long noops;

		@Nullable
		private List<String> failures;

		private Float requestsPerSecond;

		private Retries retries;

		@Nullable
		private String throttled;

		private Long throttledMillis;

		@Nullable
		private String throttledUntil;

		private Long throttledUntilMillis;

		@Nullable
		private Boolean timedOut;

		@Nullable
		private Long took;

		private Long total;

		private Long updated;

		private Long versionConflicts;

		/**
		 * API name: {@code batches}
		 */
		public Builder batches(Long value) {
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
		public Builder created(Long value) {
			this.created = value;
			return this;
		}

		/**
		 * API name: {@code deleted}
		 */
		public Builder deleted(Long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * API name: {@code noops}
		 */
		public Builder noops(Long value) {
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
		public Builder requestsPerSecond(Float value) {
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
		public Builder throttled(@Nullable String value) {
			this.throttled = value;
			return this;
		}

		/**
		 * API name: {@code throttled_millis}
		 */
		public Builder throttledMillis(Long value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until}
		 */
		public Builder throttledUntil(@Nullable String value) {
			this.throttledUntil = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until_millis}
		 */
		public Builder throttledUntilMillis(Long value) {
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
		public Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Long value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code updated}
		 */
		public Builder updated(Long value) {
			this.updated = value;
			return this;
		}

		/**
		 * API name: {@code version_conflicts}
		 */
		public Builder versionConflicts(Long value) {
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
	public static final JsonpDeserializer<Status> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Status::setupStatusDeserializer, Builder::build);

	protected static void setupStatusDeserializer(DelegatingDeserializer<Status.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.longDeserializer(), "batches");
		op.add(Builder::canceled, JsonpDeserializer.stringDeserializer(), "canceled");
		op.add(Builder::created, JsonpDeserializer.longDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");
		op.add(Builder::noops, JsonpDeserializer.longDeserializer(), "noops");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"failures");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.floatDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries._DESERIALIZER, "retries");
		op.add(Builder::throttled, JsonpDeserializer.stringDeserializer(), "throttled");
		op.add(Builder::throttledMillis, JsonpDeserializer.longDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntil, JsonpDeserializer.stringDeserializer(), "throttled_until");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.longDeserializer(), "throttled_until_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.longDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.longDeserializer(), "version_conflicts");

	}

}
