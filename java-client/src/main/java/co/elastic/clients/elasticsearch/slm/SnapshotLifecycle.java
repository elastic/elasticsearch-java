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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm._types.SnapshotLifecycle
@JsonpDeserializable
public class SnapshotLifecycle implements JsonpSerializable {
	@Nullable
	private final InProgress inProgress;

	@Nullable
	private final Invocation lastFailure;

	@Nullable
	private final Invocation lastSuccess;

	@Nullable
	private final String modifiedDate;

	private final String modifiedDateMillis;

	@Nullable
	private final String nextExecution;

	private final String nextExecutionMillis;

	private final Policy policy;

	private final long version;

	private final Statistics stats;

	// ---------------------------------------------------------------------------------------------

	private SnapshotLifecycle(Builder builder) {

		this.inProgress = builder.inProgress;
		this.lastFailure = builder.lastFailure;
		this.lastSuccess = builder.lastSuccess;
		this.modifiedDate = builder.modifiedDate;
		this.modifiedDateMillis = ModelTypeHelper.requireNonNull(builder.modifiedDateMillis, this,
				"modifiedDateMillis");
		this.nextExecution = builder.nextExecution;
		this.nextExecutionMillis = ModelTypeHelper.requireNonNull(builder.nextExecutionMillis, this,
				"nextExecutionMillis");
		this.policy = ModelTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");
		this.stats = ModelTypeHelper.requireNonNull(builder.stats, this, "stats");

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
	public final String modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * Required - API name: {@code modified_date_millis}
	 */
	public final String modifiedDateMillis() {
		return this.modifiedDateMillis;
	}

	/**
	 * API name: {@code next_execution}
	 */
	@Nullable
	public final String nextExecution() {
		return this.nextExecution;
	}

	/**
	 * Required - API name: {@code next_execution_millis}
	 */
	public final String nextExecutionMillis() {
		return this.nextExecutionMillis;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final Policy policy() {
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
			generator.write(this.modifiedDate);

		}
		generator.writeKey("modified_date_millis");
		generator.write(this.modifiedDateMillis);

		if (this.nextExecution != null) {
			generator.writeKey("next_execution");
			generator.write(this.nextExecution);

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotLifecycle}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SnapshotLifecycle> {
		@Nullable
		private InProgress inProgress;

		@Nullable
		private Invocation lastFailure;

		@Nullable
		private Invocation lastSuccess;

		@Nullable
		private String modifiedDate;

		private String modifiedDateMillis;

		@Nullable
		private String nextExecution;

		private String nextExecutionMillis;

		private Policy policy;

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
		public final Builder modifiedDate(@Nullable String value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code modified_date_millis}
		 */
		public final Builder modifiedDateMillis(String value) {
			this.modifiedDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code next_execution}
		 */
		public final Builder nextExecution(@Nullable String value) {
			this.nextExecution = value;
			return this;
		}

		/**
		 * Required - API name: {@code next_execution_millis}
		 */
		public final Builder nextExecutionMillis(String value) {
			this.nextExecutionMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(Policy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.policy(fn.apply(new Policy.Builder()).build());
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
			.lazy(Builder::new, SnapshotLifecycle::setupSnapshotLifecycleDeserializer, Builder::build);

	protected static void setupSnapshotLifecycleDeserializer(DelegatingDeserializer<SnapshotLifecycle.Builder> op) {

		op.add(Builder::inProgress, InProgress._DESERIALIZER, "in_progress");
		op.add(Builder::lastFailure, Invocation._DESERIALIZER, "last_failure");
		op.add(Builder::lastSuccess, Invocation._DESERIALIZER, "last_success");
		op.add(Builder::modifiedDate, JsonpDeserializer.stringDeserializer(), "modified_date");
		op.add(Builder::modifiedDateMillis, JsonpDeserializer.stringDeserializer(), "modified_date_millis");
		op.add(Builder::nextExecution, JsonpDeserializer.stringDeserializer(), "next_execution");
		op.add(Builder::nextExecutionMillis, JsonpDeserializer.stringDeserializer(), "next_execution_millis");
		op.add(Builder::policy, Policy._DESERIALIZER, "policy");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::stats, Statistics._DESERIALIZER, "stats");

	}

}
