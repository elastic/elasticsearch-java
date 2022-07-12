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

package co.elastic.clients.elasticsearch.core.reindex_rethrottle;

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
import java.lang.Float;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex_rethrottle.ReindexStatus

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.reindex_rethrottle.ReindexStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReindexStatus implements JsonpSerializable {
	private final long batches;

	private final long created;

	private final long deleted;

	private final long noops;

	private final float requestsPerSecond;

	private final Retries retries;

	@Nullable
	private final Time throttled;

	private final long throttledMillis;

	@Nullable
	private final Time throttledUntil;

	private final long throttledUntilMillis;

	private final long total;

	private final long updated;

	private final long versionConflicts;

	// ---------------------------------------------------------------------------------------------

	private ReindexStatus(Builder builder) {

		this.batches = ApiTypeHelper.requireNonNull(builder.batches, this, "batches");
		this.created = ApiTypeHelper.requireNonNull(builder.created, this, "created");
		this.deleted = ApiTypeHelper.requireNonNull(builder.deleted, this, "deleted");
		this.noops = ApiTypeHelper.requireNonNull(builder.noops, this, "noops");
		this.requestsPerSecond = ApiTypeHelper.requireNonNull(builder.requestsPerSecond, this, "requestsPerSecond");
		this.retries = ApiTypeHelper.requireNonNull(builder.retries, this, "retries");
		this.throttled = builder.throttled;
		this.throttledMillis = ApiTypeHelper.requireNonNull(builder.throttledMillis, this, "throttledMillis");
		this.throttledUntil = builder.throttledUntil;
		this.throttledUntilMillis = ApiTypeHelper.requireNonNull(builder.throttledUntilMillis, this,
				"throttledUntilMillis");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.updated = ApiTypeHelper.requireNonNull(builder.updated, this, "updated");
		this.versionConflicts = ApiTypeHelper.requireNonNull(builder.versionConflicts, this, "versionConflicts");

	}

	public static ReindexStatus of(Function<Builder, ObjectBuilder<ReindexStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code batches}
	 */
	public final long batches() {
		return this.batches;
	}

	/**
	 * Required - API name: {@code created}
	 */
	public final long created() {
		return this.created;
	}

	/**
	 * Required - API name: {@code deleted}
	 */
	public final long deleted() {
		return this.deleted;
	}

	/**
	 * Required - API name: {@code noops}
	 */
	public final long noops() {
		return this.noops;
	}

	/**
	 * Required - API name: {@code requests_per_second}
	 */
	public final float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * Required - API name: {@code retries}
	 */
	public final Retries retries() {
		return this.retries;
	}

	/**
	 * API name: {@code throttled}
	 */
	@Nullable
	public final Time throttled() {
		return this.throttled;
	}

	/**
	 * Required - API name: {@code throttled_millis}
	 */
	public final long throttledMillis() {
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
	 * Required - API name: {@code throttled_until_millis}
	 */
	public final long throttledUntilMillis() {
		return this.throttledUntilMillis;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code updated}
	 */
	public final long updated() {
		return this.updated;
	}

	/**
	 * Required - API name: {@code version_conflicts}
	 */
	public final long versionConflicts() {
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("deleted");
		generator.write(this.deleted);

		generator.writeKey("noops");
		generator.write(this.noops);

		generator.writeKey("requests_per_second");
		generator.write(this.requestsPerSecond);

		generator.writeKey("retries");
		this.retries.serialize(generator, mapper);

		if (this.throttled != null) {
			generator.writeKey("throttled");
			this.throttled.serialize(generator, mapper);

		}
		generator.writeKey("throttled_millis");
		generator.write(this.throttledMillis);

		if (this.throttledUntil != null) {
			generator.writeKey("throttled_until");
			this.throttledUntil.serialize(generator, mapper);

		}
		generator.writeKey("throttled_until_millis");
		generator.write(this.throttledUntilMillis);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("updated");
		generator.write(this.updated);

		generator.writeKey("version_conflicts");
		generator.write(this.versionConflicts);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ReindexStatus> {
		private Long batches;

		private Long created;

		private Long deleted;

		private Long noops;

		private Float requestsPerSecond;

		private Retries retries;

		@Nullable
		private Time throttled;

		private Long throttledMillis;

		@Nullable
		private Time throttledUntil;

		private Long throttledUntilMillis;

		private Long total;

		private Long updated;

		private Long versionConflicts;

		/**
		 * Required - API name: {@code batches}
		 */
		public final Builder batches(long value) {
			this.batches = value;
			return this;
		}

		/**
		 * Required - API name: {@code created}
		 */
		public final Builder created(long value) {
			this.created = value;
			return this;
		}

		/**
		 * Required - API name: {@code deleted}
		 */
		public final Builder deleted(long value) {
			this.deleted = value;
			return this;
		}

		/**
		 * Required - API name: {@code noops}
		 */
		public final Builder noops(long value) {
			this.noops = value;
			return this;
		}

		/**
		 * Required - API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * Required - API name: {@code retries}
		 */
		public final Builder retries(Retries value) {
			this.retries = value;
			return this;
		}

		/**
		 * Required - API name: {@code retries}
		 */
		public final Builder retries(Function<Retries.Builder, ObjectBuilder<Retries>> fn) {
			return this.retries(fn.apply(new Retries.Builder()).build());
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
		 * Required - API name: {@code throttled_millis}
		 */
		public final Builder throttledMillis(long value) {
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
		 * Required - API name: {@code throttled_until_millis}
		 */
		public final Builder throttledUntilMillis(long value) {
			this.throttledUntilMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code updated}
		 */
		public final Builder updated(long value) {
			this.updated = value;
			return this;
		}

		/**
		 * Required - API name: {@code version_conflicts}
		 */
		public final Builder versionConflicts(long value) {
			this.versionConflicts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReindexStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexStatus build() {
			_checkSingleUse();

			return new ReindexStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexStatus}
	 */
	public static final JsonpDeserializer<ReindexStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexStatus::setupReindexStatusDeserializer);

	protected static void setupReindexStatusDeserializer(ObjectDeserializer<ReindexStatus.Builder> op) {

		op.add(Builder::batches, JsonpDeserializer.longDeserializer(), "batches");
		op.add(Builder::created, JsonpDeserializer.longDeserializer(), "created");
		op.add(Builder::deleted, JsonpDeserializer.longDeserializer(), "deleted");
		op.add(Builder::noops, JsonpDeserializer.longDeserializer(), "noops");
		op.add(Builder::requestsPerSecond, JsonpDeserializer.floatDeserializer(), "requests_per_second");
		op.add(Builder::retries, Retries._DESERIALIZER, "retries");
		op.add(Builder::throttled, Time._DESERIALIZER, "throttled");
		op.add(Builder::throttledMillis, JsonpDeserializer.longDeserializer(), "throttled_millis");
		op.add(Builder::throttledUntil, Time._DESERIALIZER, "throttled_until");
		op.add(Builder::throttledUntilMillis, JsonpDeserializer.longDeserializer(), "throttled_until_millis");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::updated, JsonpDeserializer.longDeserializer(), "updated");
		op.add(Builder::versionConflicts, JsonpDeserializer.longDeserializer(), "version_conflicts");

	}

}
