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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._types.BulkIndexByScrollFailure;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.update_by_query.Response
public final class UpdateByQueryResponse implements JsonpSerializable {
	@Nullable
	private final Number batches;

	@Nullable
	private final List<BulkIndexByScrollFailure> failures;

	@Nullable
	private final Number noops;

	@Nullable
	private final Number deleted;

	@Nullable
	private final Number requestsPerSecond;

	@Nullable
	private final Retries retries;

	@Nullable
	private final JsonValue task;

	@Nullable
	private final Boolean timedOut;

	@Nullable
	private final Number took;

	@Nullable
	private final Number total;

	@Nullable
	private final Number updated;

	@Nullable
	private final Number versionConflicts;

	@Nullable
	private final Number throttledMillis;

	@Nullable
	private final Number throttledUntilMillis;

	// ---------------------------------------------------------------------------------------------

	public UpdateByQueryResponse(Builder builder) {

		this.batches = builder.batches;
		this.failures = builder.failures;
		this.noops = builder.noops;
		this.deleted = builder.deleted;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.retries = builder.retries;
		this.task = builder.task;
		this.timedOut = builder.timedOut;
		this.took = builder.took;
		this.total = builder.total;
		this.updated = builder.updated;
		this.versionConflicts = builder.versionConflicts;
		this.throttledMillis = builder.throttledMillis;
		this.throttledUntilMillis = builder.throttledUntilMillis;

	}

	/**
	 * API name: {@code batches}
	 */
	@Nullable
	public Number batches() {
		return this.batches;
	}

	/**
	 * API name: {@code failures}
	 */
	@Nullable
	public List<BulkIndexByScrollFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code noops}
	 */
	@Nullable
	public Number noops() {
		return this.noops;
	}

	/**
	 * API name: {@code deleted}
	 */
	@Nullable
	public Number deleted() {
		return this.deleted;
	}

	/**
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public Number requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * API name: {@code retries}
	 */
	@Nullable
	public Retries retries() {
		return this.retries;
	}

	/**
	 * API name: {@code task}
	 */
	@Nullable
	public JsonValue task() {
		return this.task;
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
	@Nullable
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code updated}
	 */
	@Nullable
	public Number updated() {
		return this.updated;
	}

	/**
	 * API name: {@code version_conflicts}
	 */
	@Nullable
	public Number versionConflicts() {
		return this.versionConflicts;
	}

	/**
	 * API name: {@code throttled_millis}
	 */
	@Nullable
	public Number throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until_millis}
	 */
	@Nullable
	public Number throttledUntilMillis() {
		return this.throttledUntilMillis;
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

		if (this.batches != null) {

			generator.writeKey("batches");
			generator.write(this.batches.doubleValue());

		}
		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (BulkIndexByScrollFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.noops != null) {

			generator.writeKey("noops");
			generator.write(this.noops.doubleValue());

		}
		if (this.deleted != null) {

			generator.writeKey("deleted");
			generator.write(this.deleted.doubleValue());

		}
		if (this.requestsPerSecond != null) {

			generator.writeKey("requests_per_second");
			generator.write(this.requestsPerSecond.doubleValue());

		}
		if (this.retries != null) {

			generator.writeKey("retries");
			this.retries.serialize(generator, mapper);

		}
		if (this.task != null) {

			generator.writeKey("task");
			generator.write(this.task);

		}
		if (this.timedOut != null) {

			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}
		if (this.took != null) {

			generator.writeKey("took");
			generator.write(this.took.doubleValue());

		}
		if (this.total != null) {

			generator.writeKey("total");
			generator.write(this.total.doubleValue());

		}
		if (this.updated != null) {

			generator.writeKey("updated");
			generator.write(this.updated.doubleValue());

		}
		if (this.versionConflicts != null) {

			generator.writeKey("version_conflicts");
			generator.write(this.versionConflicts.doubleValue());

		}
		if (this.throttledMillis != null) {

			generator.writeKey("throttled_millis");
			generator.write(this.throttledMillis.doubleValue());

		}
		if (this.throttledUntilMillis != null) {

			generator.writeKey("throttled_until_millis");
			generator.write(this.throttledUntilMillis.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryResponse}.
	 */
	public static class Builder implements ObjectBuilder<UpdateByQueryResponse> {
		@Nullable
		private Number batches;

		@Nullable
		private List<BulkIndexByScrollFailure> failures;

		@Nullable
		private Number noops;

		@Nullable
		private Number deleted;

		@Nullable
		private Number requestsPerSecond;

		@Nullable
		private Retries retries;

		@Nullable
		private JsonValue task;

		@Nullable
		private Boolean timedOut;

		@Nullable
		private Number took;

		@Nullable
		private Number total;

		@Nullable
		private Number updated;

		@Nullable
		private Number versionConflicts;

		@Nullable
		private Number throttledMillis;

		@Nullable
		private Number throttledUntilMillis;

		/**
		 * API name: {@code batches}
		 */
		public Builder batches(@Nullable Number value) {
			this.batches = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(@Nullable List<BulkIndexByScrollFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(BulkIndexByScrollFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(BulkIndexByScrollFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return this.failures(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed.
		 */
		public Builder addFailures(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return this.addFailures(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		/**
		 * API name: {@code noops}
		 */
		public Builder noops(@Nullable Number value) {
			this.noops = value;
			return this;
		}

		/**
		 * API name: {@code deleted}
		 */
		public Builder deleted(@Nullable Number value) {
			this.deleted = value;
			return this;
		}

		/**
		 * API name: {@code requests_per_second}
		 */
		public Builder requestsPerSecond(@Nullable Number value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public Builder retries(@Nullable Retries value) {
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
		 * API name: {@code task}
		 */
		public Builder task(@Nullable JsonValue value) {
			this.task = value;
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
		public Builder total(@Nullable Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code updated}
		 */
		public Builder updated(@Nullable Number value) {
			this.updated = value;
			return this;
		}

		/**
		 * API name: {@code version_conflicts}
		 */
		public Builder versionConflicts(@Nullable Number value) {
			this.versionConflicts = value;
			return this;
		}

		/**
		 * API name: {@code throttled_millis}
		 */
		public Builder throttledMillis(@Nullable Number value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until_millis}
		 */
		public Builder throttledUntilMillis(@Nullable Number value) {
			this.throttledUntilMillis = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateByQueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryResponse build() {

			return new UpdateByQueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateByQueryResponse}
	 */
	public static final JsonpDeserializer<UpdateByQueryResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpdateByQueryResponse::setupUpdateByQueryResponseDeserializer);

	protected static void setupUpdateByQueryResponseDeserializer(
			DelegatingDeserializer<UpdateByQueryResponse.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.numberDeserializer(), "batches");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(BulkIndexByScrollFailure.DESERIALIZER),
				"failures");
		op.add(Builder::noops, JsonpDeserializer.numberDeserializer(), "noops");
		op.add(Builder::deleted, JsonpDeserializer.numberDeserializer(), "deleted");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.numberDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries.DESERIALIZER, "retries");
		op.add(Builder::task, JsonpDeserializer.jsonValueDeserializer(), "task");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.numberDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.numberDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.numberDeserializer(), "version_conflicts");
		op.add(Builder::throttledMillis, JsonpDeserializer.numberDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.numberDeserializer(), "throttled_until_millis");

	}

}
