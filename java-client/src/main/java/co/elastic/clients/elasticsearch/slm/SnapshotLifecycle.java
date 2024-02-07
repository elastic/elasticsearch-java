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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: slm._types.SnapshotLifecycle

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm._types.SnapshotLifecycle">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotLifecycle implements JsonpSerializable {
	@Nullable
	private final InProgress inProgress;

	@Nullable
	private final Invocation lastFailure;

	@Nullable
	private final Invocation lastSuccess;

	@Nullable
	private final DateTime modifiedDate;

	private final long modifiedDateMillis;

	@Nullable
	private final DateTime nextExecution;

	private final long nextExecutionMillis;

	private final SlmPolicy policy;

	private final long version;

	private final Statistics stats;

	// ---------------------------------------------------------------------------------------------

	private SnapshotLifecycle(Builder builder) {

		this.inProgress = builder.inProgress;
		this.lastFailure = builder.lastFailure;
		this.lastSuccess = builder.lastSuccess;
		this.modifiedDate = builder.modifiedDate;
		this.modifiedDateMillis = ApiTypeHelper.requireNonNull(builder.modifiedDateMillis, this, "modifiedDateMillis");
		this.nextExecution = builder.nextExecution;
		this.nextExecutionMillis = ApiTypeHelper.requireNonNull(builder.nextExecutionMillis, this,
				"nextExecutionMillis");
		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");

	}

	public static SnapshotLifecycle of(Function<Builder, ObjectBuilder<SnapshotLifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code in_progress}
	 */
	@Nullable
	public final InProgress inProgress() {
		return this.inProgress;
	}

	/**
	 * API name: {@code last_failure}
	 */
	@Nullable
	public final Invocation lastFailure() {
		return this.lastFailure;
	}

	/**
	 * API name: {@code last_success}
	 */
	@Nullable
	public final Invocation lastSuccess() {
		return this.lastSuccess;
	}

	/**
	 * API name: {@code modified_date}
	 */
	@Nullable
	public final DateTime modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * Required - API name: {@code modified_date_millis}
	 */
	public final long modifiedDateMillis() {
		return this.modifiedDateMillis;
	}

	/**
	 * API name: {@code next_execution}
	 */
	@Nullable
	public final DateTime nextExecution() {
		return this.nextExecution;
	}

	/**
	 * Required - API name: {@code next_execution_millis}
	 */
	public final long nextExecutionMillis() {
		return this.nextExecutionMillis;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final SlmPolicy policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final Statistics stats() {
		return this.stats;
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

		if (this.inProgress != null) {
			generator.writeKey("in_progress");
			this.inProgress.serialize(generator, mapper);

		}
		if (this.lastFailure != null) {
			generator.writeKey("last_failure");
			this.lastFailure.serialize(generator, mapper);

		}
		if (this.lastSuccess != null) {
			generator.writeKey("last_success");
			this.lastSuccess.serialize(generator, mapper);

		}
		if (this.modifiedDate != null) {
			generator.writeKey("modified_date");
			this.modifiedDate.serialize(generator, mapper);
		}
		generator.writeKey("modified_date_millis");
		generator.write(this.modifiedDateMillis);

		if (this.nextExecution != null) {
			generator.writeKey("next_execution");
			this.nextExecution.serialize(generator, mapper);
		}
		generator.writeKey("next_execution_millis");
		generator.write(this.nextExecutionMillis);

		generator.writeKey("policy");
		this.policy.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotLifecycle}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SnapshotLifecycle> {
		@Nullable
		private InProgress inProgress;

		@Nullable
		private Invocation lastFailure;

		@Nullable
		private Invocation lastSuccess;

		@Nullable
		private DateTime modifiedDate;

		private Long modifiedDateMillis;

		@Nullable
		private DateTime nextExecution;

		private Long nextExecutionMillis;

		private SlmPolicy policy;

		private Long version;

		private Statistics stats;

		/**
		 * API name: {@code in_progress}
		 */
		public final Builder inProgress(@Nullable InProgress value) {
			this.inProgress = value;
			return this;
		}

		/**
		 * API name: {@code in_progress}
		 */
		public final Builder inProgress(Function<InProgress.Builder, ObjectBuilder<InProgress>> fn) {
			return this.inProgress(fn.apply(new InProgress.Builder()).build());
		}

		/**
		 * API name: {@code last_failure}
		 */
		public final Builder lastFailure(@Nullable Invocation value) {
			this.lastFailure = value;
			return this;
		}

		/**
		 * API name: {@code last_failure}
		 */
		public final Builder lastFailure(Function<Invocation.Builder, ObjectBuilder<Invocation>> fn) {
			return this.lastFailure(fn.apply(new Invocation.Builder()).build());
		}

		/**
		 * API name: {@code last_success}
		 */
		public final Builder lastSuccess(@Nullable Invocation value) {
			this.lastSuccess = value;
			return this;
		}

		/**
		 * API name: {@code last_success}
		 */
		public final Builder lastSuccess(Function<Invocation.Builder, ObjectBuilder<Invocation>> fn) {
			return this.lastSuccess(fn.apply(new Invocation.Builder()).build());
		}

		/**
		 * API name: {@code modified_date}
		 */
		public final Builder modifiedDate(@Nullable DateTime value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code modified_date_millis}
		 */
		public final Builder modifiedDateMillis(long value) {
			this.modifiedDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code next_execution}
		 */
		public final Builder nextExecution(@Nullable DateTime value) {
			this.nextExecution = value;
			return this;
		}

		/**
		 * Required - API name: {@code next_execution_millis}
		 */
		public final Builder nextExecutionMillis(long value) {
			this.nextExecutionMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(SlmPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(Function<SlmPolicy.Builder, ObjectBuilder<SlmPolicy>> fn) {
			return this.policy(fn.apply(new SlmPolicy.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Statistics value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<Statistics.Builder, ObjectBuilder<Statistics>> fn) {
			return this.stats(fn.apply(new Statistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotLifecycle build() {
			_checkSingleUse();

			return new SnapshotLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotLifecycle}
	 */
	public static final JsonpDeserializer<SnapshotLifecycle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotLifecycle::setupSnapshotLifecycleDeserializer);

	protected static void setupSnapshotLifecycleDeserializer(ObjectDeserializer<SnapshotLifecycle.Builder> op) {

		op.add(Builder::inProgress, InProgress._DESERIALIZER, "in_progress");
		op.add(Builder::lastFailure, Invocation._DESERIALIZER, "last_failure");
		op.add(Builder::lastSuccess, Invocation._DESERIALIZER, "last_success");
		op.add(Builder::modifiedDate, DateTime._DESERIALIZER, "modified_date");
		op.add(Builder::modifiedDateMillis, JsonpDeserializer.longDeserializer(), "modified_date_millis");
		op.add(Builder::nextExecution, DateTime._DESERIALIZER, "next_execution");
		op.add(Builder::nextExecutionMillis, JsonpDeserializer.longDeserializer(), "next_execution_millis");
		op.add(Builder::policy, SlmPolicy._DESERIALIZER, "policy");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::stats, Statistics._DESERIALIZER, "stats");

	}

}
