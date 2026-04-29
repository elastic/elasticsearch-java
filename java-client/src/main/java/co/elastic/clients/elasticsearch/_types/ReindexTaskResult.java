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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;
import java.util.List;
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

// typedef: _types.ReindexTaskResult

/**
 * The final result of a completed reindex operation, as stored in the task
 * result. This is the serialized form of <code>BulkByScrollResponse</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.ReindexTaskResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReindexTaskResult implements JsonpSerializable {
	@Nullable
	private final Long batches;

	@Nullable
	private final Long created;

	@Nullable
	private final Long deleted;

	private final List<BulkIndexByScrollFailure> failures;

	@Nullable
	private final Long noops;

	@Nullable
	private final Float requestsPerSecond;

	@Nullable
	private final Retries retries;

	@Nullable
	private final Long throttledMillis;

	@Nullable
	private final Long throttledUntilMillis;

	@Nullable
	private final Boolean timedOut;

	@Nullable
	private final Long took;

	@Nullable
	private final Long total;

	@Nullable
	private final Long updated;

	@Nullable
	private final Long versionConflicts;

	// ---------------------------------------------------------------------------------------------

	private ReindexTaskResult(Builder builder) {

		this.batches = builder.batches;
		this.created = builder.created;
		this.deleted = builder.deleted;
		this.failures = ApiTypeHelper.unmodifiable(builder.failures);
		this.noops = builder.noops;
		this.requestsPerSecond = builder.requestsPerSecond;
		this.retries = builder.retries;
		this.throttledMillis = builder.throttledMillis;
		this.throttledUntilMillis = builder.throttledUntilMillis;
		this.timedOut = builder.timedOut;
		this.took = builder.took;
		this.total = builder.total;
		this.updated = builder.updated;
		this.versionConflicts = builder.versionConflicts;

	}

	public static ReindexTaskResult of(Function<Builder, ObjectBuilder<ReindexTaskResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The number of scroll responses pulled back by the reindex.
	 * <p>
	 * API name: {@code batches}
	 */
	@Nullable
	public final Long batches() {
		return this.batches;
	}

	/**
	 * The number of documents that were successfully created.
	 * <p>
	 * API name: {@code created}
	 */
	@Nullable
	public final Long created() {
		return this.created;
	}

	/**
	 * The number of documents that were successfully deleted.
	 * <p>
	 * API name: {@code deleted}
	 */
	@Nullable
	public final Long deleted() {
		return this.deleted;
	}

	/**
	 * Any failures encountered during the reindex. If non-empty, the reindex ended
	 * because of these failures.
	 * <p>
	 * API name: {@code failures}
	 */
	public final List<BulkIndexByScrollFailure> failures() {
		return this.failures;
	}

	/**
	 * The number of documents that were ignored because the script returned a
	 * <code>noop</code> value for <code>ctx.op</code>.
	 * <p>
	 * API name: {@code noops}
	 */
	@Nullable
	public final Long noops() {
		return this.noops;
	}

	/**
	 * The number of requests per second effectively executed during the reindex.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * The number of retries attempted by reindex.
	 * <p>
	 * API name: {@code retries}
	 */
	@Nullable
	public final Retries retries() {
		return this.retries;
	}

	/**
	 * Number of milliseconds the request slept to conform to
	 * <code>requests_per_second</code>.
	 * <p>
	 * API name: {@code throttled_millis}
	 */
	@Nullable
	public final Long throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * This field should always be equal to zero in a completed reindex result.
	 * <p>
	 * API name: {@code throttled_until_millis}
	 */
	@Nullable
	public final Long throttledUntilMillis() {
		return this.throttledUntilMillis;
	}

	/**
	 * Whether any of the requests executed during the reindex timed out.
	 * <p>
	 * API name: {@code timed_out}
	 */
	@Nullable
	public final Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * The total milliseconds the entire operation took.
	 * <p>
	 * API name: {@code took}
	 */
	@Nullable
	public final Long took() {
		return this.took;
	}

	/**
	 * The number of documents that were successfully processed.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final Long total() {
		return this.total;
	}

	/**
	 * The number of documents that were successfully updated.
	 * <p>
	 * API name: {@code updated}
	 */
	@Nullable
	public final Long updated() {
		return this.updated;
	}

	/**
	 * The number of version conflicts that occurred.
	 * <p>
	 * API name: {@code version_conflicts}
	 */
	@Nullable
	public final Long versionConflicts() {
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

		if (this.batches != null) {
			generator.writeKey("batches");
			generator.write(this.batches);

		}
		if (this.created != null) {
			generator.writeKey("created");
			generator.write(this.created);

		}
		if (this.deleted != null) {
			generator.writeKey("deleted");
			generator.write(this.deleted);

		}
		if (ApiTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (BulkIndexByScrollFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.noops != null) {
			generator.writeKey("noops");
			generator.write(this.noops);

		}
		if (this.requestsPerSecond != null) {
			generator.writeKey("requests_per_second");
			generator.write(this.requestsPerSecond);

		}
		if (this.retries != null) {
			generator.writeKey("retries");
			this.retries.serialize(generator, mapper);

		}
		if (this.throttledMillis != null) {
			generator.writeKey("throttled_millis");
			generator.write(this.throttledMillis);

		}
		if (this.throttledUntilMillis != null) {
			generator.writeKey("throttled_until_millis");
			generator.write(this.throttledUntilMillis);

		}
		if (this.timedOut != null) {
			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}
		if (this.took != null) {
			generator.writeKey("took");
			generator.write(this.took);

		}
		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}
		if (this.updated != null) {
			generator.writeKey("updated");
			generator.write(this.updated);

		}
		if (this.versionConflicts != null) {
			generator.writeKey("version_conflicts");
			generator.write(this.versionConflicts);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexTaskResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReindexTaskResult> {
		@Nullable
		private Long batches;

		@Nullable
		private Long created;

		@Nullable
		private Long deleted;

		@Nullable
		private List<BulkIndexByScrollFailure> failures;

		@Nullable
		private Long noops;

		@Nullable
		private Float requestsPerSecond;

		@Nullable
		private Retries retries;

		@Nullable
		private Long throttledMillis;

		@Nullable
		private Long throttledUntilMillis;

		@Nullable
		private Boolean timedOut;

		@Nullable
		private Long took;

		@Nullable
		private Long total;

		@Nullable
		private Long updated;

		@Nullable
		private Long versionConflicts;

		public Builder() {
		}
		private Builder(ReindexTaskResult instance) {
			this.batches = instance.batches;
			this.created = instance.created;
			this.deleted = instance.deleted;
			this.failures = instance.failures;
			this.noops = instance.noops;
			this.requestsPerSecond = instance.requestsPerSecond;
			this.retries = instance.retries;
			this.throttledMillis = instance.throttledMillis;
			this.throttledUntilMillis = instance.throttledUntilMillis;
			this.timedOut = instance.timedOut;
			this.took = instance.took;
			this.total = instance.total;
			this.updated = instance.updated;
			this.versionConflicts = instance.versionConflicts;

		}
		/**
		 * The number of scroll responses pulled back by the reindex.
		 * <p>
		 * API name: {@code batches}
		 */
		public final Builder batches(@Nullable Long value) {
			this.batches = value;
			return this;
		}

		/**
		 * The number of documents that were successfully created.
		 * <p>
		 * API name: {@code created}
		 */
		public final Builder created(@Nullable Long value) {
			this.created = value;
			return this;
		}

		/**
		 * The number of documents that were successfully deleted.
		 * <p>
		 * API name: {@code deleted}
		 */
		public final Builder deleted(@Nullable Long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Any failures encountered during the reindex. If non-empty, the reindex ended
		 * because of these failures.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>failures</code>.
		 */
		public final Builder failures(List<BulkIndexByScrollFailure> list) {
			this.failures = _listAddAll(this.failures, list);
			return this;
		}

		/**
		 * Any failures encountered during the reindex. If non-empty, the reindex ended
		 * because of these failures.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds one or more values to <code>failures</code>.
		 */
		public final Builder failures(BulkIndexByScrollFailure value, BulkIndexByScrollFailure... values) {
			this.failures = _listAdd(this.failures, value, values);
			return this;
		}

		/**
		 * Any failures encountered during the reindex. If non-empty, the reindex ended
		 * because of these failures.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds a value to <code>failures</code> using a builder lambda.
		 */
		public final Builder failures(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return failures(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		/**
		 * The number of documents that were ignored because the script returned a
		 * <code>noop</code> value for <code>ctx.op</code>.
		 * <p>
		 * API name: {@code noops}
		 */
		public final Builder noops(@Nullable Long value) {
			this.noops = value;
			return this;
		}

		/**
		 * The number of requests per second effectively executed during the reindex.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * The number of retries attempted by reindex.
		 * <p>
		 * API name: {@code retries}
		 */
		public final Builder retries(@Nullable Retries value) {
			this.retries = value;
			return this;
		}

		/**
		 * The number of retries attempted by reindex.
		 * <p>
		 * API name: {@code retries}
		 */
		public final Builder retries(Function<Retries.Builder, ObjectBuilder<Retries>> fn) {
			return this.retries(fn.apply(new Retries.Builder()).build());
		}

		/**
		 * Number of milliseconds the request slept to conform to
		 * <code>requests_per_second</code>.
		 * <p>
		 * API name: {@code throttled_millis}
		 */
		public final Builder throttledMillis(@Nullable Long value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * This field should always be equal to zero in a completed reindex result.
		 * <p>
		 * API name: {@code throttled_until_millis}
		 */
		public final Builder throttledUntilMillis(@Nullable Long value) {
			this.throttledUntilMillis = value;
			return this;
		}

		/**
		 * Whether any of the requests executed during the reindex timed out.
		 * <p>
		 * API name: {@code timed_out}
		 */
		public final Builder timedOut(@Nullable Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * The total milliseconds the entire operation took.
		 * <p>
		 * API name: {@code took}
		 */
		public final Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * The number of documents that were successfully processed.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable Long value) {
			this.total = value;
			return this;
		}

		/**
		 * The number of documents that were successfully updated.
		 * <p>
		 * API name: {@code updated}
		 */
		public final Builder updated(@Nullable Long value) {
			this.updated = value;
			return this;
		}

		/**
		 * The number of version conflicts that occurred.
		 * <p>
		 * API name: {@code version_conflicts}
		 */
		public final Builder versionConflicts(@Nullable Long value) {
			this.versionConflicts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReindexTaskResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexTaskResult build() {
			_checkSingleUse();

			return new ReindexTaskResult(this);
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
	 * Json deserializer for {@link ReindexTaskResult}
	 */
	public static final JsonpDeserializer<ReindexTaskResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ReindexTaskResult::setupReindexTaskResultDeserializer);

	protected static void setupReindexTaskResultDeserializer(ObjectDeserializer<ReindexTaskResult.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.longDeserializer(), "batches");
		op.add(Builder::created, JsonpDeserializer.longDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(BulkIndexByScrollFailure._DESERIALIZER),
				"failures");
		op.add(Builder::noops, JsonpDeserializer.longDeserializer(), "noops");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.floatDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries._DESERIALIZER, "retries");
		op.add(Builder::throttledMillis, JsonpDeserializer.longDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.longDeserializer(), "throttled_until_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.longDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.longDeserializer(), "version_conflicts");

	}

}
