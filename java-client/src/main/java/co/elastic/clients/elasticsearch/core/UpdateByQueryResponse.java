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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.BulkIndexByScrollFailure;
import co.elastic.clients.elasticsearch._types.Retries;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.update_by_query.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.update_by_query.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateByQueryResponse implements JsonpSerializable {
	@Nullable
	private final Long batches;

	private final List<BulkIndexByScrollFailure> failures;

	@Nullable
	private final Long noops;

	@Nullable
	private final Long deleted;

	@Nullable
	private final Float requestsPerSecond;

	@Nullable
	private final Retries retries;

	@Nullable
	private final String task;

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

	@Nullable
	private final Time throttled;

	@Nullable
	private final Long throttledMillis;

	@Nullable
	private final Time throttledUntil;

	@Nullable
	private final Long throttledUntilMillis;

	// ---------------------------------------------------------------------------------------------

	private UpdateByQueryResponse(Builder builder) {

		this.batches = builder.batches;
		this.failures = ApiTypeHelper.unmodifiable(builder.failures);
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
		this.throttled = builder.throttled;
		this.throttledMillis = builder.throttledMillis;
		this.throttledUntil = builder.throttledUntil;
		this.throttledUntilMillis = builder.throttledUntilMillis;

	}

	public static UpdateByQueryResponse of(Function<Builder, ObjectBuilder<UpdateByQueryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code batches}
	 */
	@Nullable
	public final Long batches() {
		return this.batches;
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<BulkIndexByScrollFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code noops}
	 */
	@Nullable
	public final Long noops() {
		return this.noops;
	}

	/**
	 * API name: {@code deleted}
	 */
	@Nullable
	public final Long deleted() {
		return this.deleted;
	}

	/**
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * API name: {@code retries}
	 */
	@Nullable
	public final Retries retries() {
		return this.retries;
	}

	/**
	 * API name: {@code task}
	 */
	@Nullable
	public final String task() {
		return this.task;
	}

	/**
	 * API name: {@code timed_out}
	 */
	@Nullable
	public final Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * API name: {@code took}
	 */
	@Nullable
	public final Long took() {
		return this.took;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final Long total() {
		return this.total;
	}

	/**
	 * API name: {@code updated}
	 */
	@Nullable
	public final Long updated() {
		return this.updated;
	}

	/**
	 * API name: {@code version_conflicts}
	 */
	@Nullable
	public final Long versionConflicts() {
		return this.versionConflicts;
	}

	/**
	 * API name: {@code throttled}
	 */
	@Nullable
	public final Time throttled() {
		return this.throttled;
	}

	/**
	 * API name: {@code throttled_millis}
	 */
	@Nullable
	public final Long throttledMillis() {
		return this.throttledMillis;
	}

	/**
	 * API name: {@code throttled_until}
	 */
	@Nullable
	public final Time throttledUntil() {
		return this.throttledUntil;
	}

	/**
	 * API name: {@code throttled_until_millis}
	 */
	@Nullable
	public final Long throttledUntilMillis() {
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
			generator.write(this.batches);

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
		if (this.deleted != null) {
			generator.writeKey("deleted");
			generator.write(this.deleted);

		}
		if (this.requestsPerSecond != null) {
			generator.writeKey("requests_per_second");
			generator.write(this.requestsPerSecond);

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
		if (this.throttled != null) {
			generator.writeKey("throttled");
			this.throttled.serialize(generator, mapper);

		}
		if (this.throttledMillis != null) {
			generator.writeKey("throttled_millis");
			generator.write(this.throttledMillis);

		}
		if (this.throttledUntil != null) {
			generator.writeKey("throttled_until");
			this.throttledUntil.serialize(generator, mapper);

		}
		if (this.throttledUntilMillis != null) {
			generator.writeKey("throttled_until_millis");
			generator.write(this.throttledUntilMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpdateByQueryResponse> {
		@Nullable
		private Long batches;

		@Nullable
		private List<BulkIndexByScrollFailure> failures;

		@Nullable
		private Long noops;

		@Nullable
		private Long deleted;

		@Nullable
		private Float requestsPerSecond;

		@Nullable
		private Retries retries;

		@Nullable
		private String task;

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

		@Nullable
		private Time throttled;

		@Nullable
		private Long throttledMillis;

		@Nullable
		private Time throttledUntil;

		@Nullable
		private Long throttledUntilMillis;

		/**
		 * API name: {@code batches}
		 */
		public final Builder batches(@Nullable Long value) {
			this.batches = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>failures</code>.
		 */
		public final Builder failures(List<BulkIndexByScrollFailure> list) {
			this.failures = _listAddAll(this.failures, list);
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds one or more values to <code>failures</code>.
		 */
		public final Builder failures(BulkIndexByScrollFailure value, BulkIndexByScrollFailure... values) {
			this.failures = _listAdd(this.failures, value, values);
			return this;
		}

		/**
		 * API name: {@code failures}
		 * <p>
		 * Adds a value to <code>failures</code> using a builder lambda.
		 */
		public final Builder failures(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return failures(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		/**
		 * API name: {@code noops}
		 */
		public final Builder noops(@Nullable Long value) {
			this.noops = value;
			return this;
		}

		/**
		 * API name: {@code deleted}
		 */
		public final Builder deleted(@Nullable Long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public final Builder retries(@Nullable Retries value) {
			this.retries = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public final Builder retries(Function<Retries.Builder, ObjectBuilder<Retries>> fn) {
			return this.retries(fn.apply(new Retries.Builder()).build());
		}

		/**
		 * API name: {@code task}
		 */
		public final Builder task(@Nullable String value) {
			this.task = value;
			return this;
		}

		/**
		 * API name: {@code timed_out}
		 */
		public final Builder timedOut(@Nullable Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public final Builder took(@Nullable Long value) {
			this.took = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable Long value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code updated}
		 */
		public final Builder updated(@Nullable Long value) {
			this.updated = value;
			return this;
		}

		/**
		 * API name: {@code version_conflicts}
		 */
		public final Builder versionConflicts(@Nullable Long value) {
			this.versionConflicts = value;
			return this;
		}

		/**
		 * API name: {@code throttled}
		 */
		public final Builder throttled(@Nullable Time value) {
			this.throttled = value;
			return this;
		}

		/**
		 * API name: {@code throttled}
		 */
		public final Builder throttled(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttled(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code throttled_millis}
		 */
		public final Builder throttledMillis(@Nullable Long value) {
			this.throttledMillis = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until}
		 */
		public final Builder throttledUntil(@Nullable Time value) {
			this.throttledUntil = value;
			return this;
		}

		/**
		 * API name: {@code throttled_until}
		 */
		public final Builder throttledUntil(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttledUntil(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code throttled_until_millis}
		 */
		public final Builder throttledUntilMillis(@Nullable Long value) {
			this.throttledUntilMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateByQueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryResponse build() {
			_checkSingleUse();

			return new UpdateByQueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateByQueryResponse}
	 */
	public static final JsonpDeserializer<UpdateByQueryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateByQueryResponse::setupUpdateByQueryResponseDeserializer);

	protected static void setupUpdateByQueryResponseDeserializer(ObjectDeserializer<UpdateByQueryResponse.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.longDeserializer(), "batches");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(BulkIndexByScrollFailure._DESERIALIZER),
				"failures");
		op.add(Builder::noops, JsonpDeserializer.longDeserializer(), "noops");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.floatDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries._DESERIALIZER, "retries");
		op.add(Builder::task, JsonpDeserializer.stringDeserializer(), "task");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.longDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.longDeserializer(), "version_conflicts");
		op.add(Builder::throttled, Time._DESERIALIZER, "throttled");
		op.add(Builder::throttledMillis, JsonpDeserializer.longDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntil, Time._DESERIALIZER, "throttled_until");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.longDeserializer(), "throttled_until_millis");

	}

}
