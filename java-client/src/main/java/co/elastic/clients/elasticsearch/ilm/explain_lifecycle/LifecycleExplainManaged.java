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

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.LifecycleExplainManaged

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ilm.explain_lifecycle.LifecycleExplainManaged">API
 *      specification</a>
 */
@JsonpDeserializable
public class LifecycleExplainManaged implements LifecycleExplainVariant, JsonpSerializable {
	private final String action;

	private final String actionTimeMillis;

	private final Time age;

	@Nullable
	private final String failedStep;

	@Nullable
	private final Integer failedStepRetryCount;

	private final String index;

	@Nullable
	private final String indexCreationDateMillis;

	@Nullable
	private final Boolean isAutoRetryableError;

	private final String lifecycleDateMillis;

	private final String phase;

	private final String phaseTimeMillis;

	private final String policy;

	private final String step;

	private final Map<String, JsonData> stepInfo;

	private final String stepTimeMillis;

	private final LifecycleExplainPhaseExecution phaseExecution;

	@Nullable
	private final Time timeSinceIndexCreation;

	// ---------------------------------------------------------------------------------------------

	private LifecycleExplainManaged(Builder builder) {

		this.action = ApiTypeHelper.requireNonNull(builder.action, this, "action");
		this.actionTimeMillis = ApiTypeHelper.requireNonNull(builder.actionTimeMillis, this, "actionTimeMillis");
		this.age = ApiTypeHelper.requireNonNull(builder.age, this, "age");
		this.failedStep = builder.failedStep;
		this.failedStepRetryCount = builder.failedStepRetryCount;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.indexCreationDateMillis = builder.indexCreationDateMillis;
		this.isAutoRetryableError = builder.isAutoRetryableError;
		this.lifecycleDateMillis = ApiTypeHelper.requireNonNull(builder.lifecycleDateMillis, this,
				"lifecycleDateMillis");
		this.phase = ApiTypeHelper.requireNonNull(builder.phase, this, "phase");
		this.phaseTimeMillis = ApiTypeHelper.requireNonNull(builder.phaseTimeMillis, this, "phaseTimeMillis");
		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.step = ApiTypeHelper.requireNonNull(builder.step, this, "step");
		this.stepInfo = ApiTypeHelper.unmodifiable(builder.stepInfo);
		this.stepTimeMillis = ApiTypeHelper.requireNonNull(builder.stepTimeMillis, this, "stepTimeMillis");
		this.phaseExecution = ApiTypeHelper.requireNonNull(builder.phaseExecution, this, "phaseExecution");
		this.timeSinceIndexCreation = builder.timeSinceIndexCreation;

	}

	public static LifecycleExplainManaged of(Function<Builder, ObjectBuilder<LifecycleExplainManaged>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * LifecycleExplain variant kind.
	 */
	@Override
	public LifecycleExplain.Kind _lifecycleExplainKind() {
		return LifecycleExplain.Kind.True;
	}

	/**
	 * Required - API name: {@code action}
	 */
	public final String action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code action_time_millis}
	 */
	public final String actionTimeMillis() {
		return this.actionTimeMillis;
	}

	/**
	 * Required - API name: {@code age}
	 */
	public final Time age() {
		return this.age;
	}

	/**
	 * API name: {@code failed_step}
	 */
	@Nullable
	public final String failedStep() {
		return this.failedStep;
	}

	/**
	 * API name: {@code failed_step_retry_count}
	 */
	@Nullable
	public final Integer failedStepRetryCount() {
		return this.failedStepRetryCount;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code index_creation_date_millis}
	 */
	@Nullable
	public final String indexCreationDateMillis() {
		return this.indexCreationDateMillis;
	}

	/**
	 * API name: {@code is_auto_retryable_error}
	 */
	@Nullable
	public final Boolean isAutoRetryableError() {
		return this.isAutoRetryableError;
	}

	/**
	 * Required - API name: {@code lifecycle_date_millis}
	 */
	public final String lifecycleDateMillis() {
		return this.lifecycleDateMillis;
	}

	/**
	 * Required - API name: {@code phase}
	 */
	public final String phase() {
		return this.phase;
	}

	/**
	 * Required - API name: {@code phase_time_millis}
	 */
	public final String phaseTimeMillis() {
		return this.phaseTimeMillis;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final String policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code step}
	 */
	public final String step() {
		return this.step;
	}

	/**
	 * API name: {@code step_info}
	 */
	public final Map<String, JsonData> stepInfo() {
		return this.stepInfo;
	}

	/**
	 * Required - API name: {@code step_time_millis}
	 */
	public final String stepTimeMillis() {
		return this.stepTimeMillis;
	}

	/**
	 * Required - API name: {@code phase_execution}
	 */
	public final LifecycleExplainPhaseExecution phaseExecution() {
		return this.phaseExecution;
	}

	/**
	 * API name: {@code time_since_index_creation}
	 */
	@Nullable
	public final Time timeSinceIndexCreation() {
		return this.timeSinceIndexCreation;
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

		generator.write("managed", "true");

		generator.writeKey("action");
		generator.write(this.action);

		generator.writeKey("action_time_millis");
		generator.write(this.actionTimeMillis);

		generator.writeKey("age");
		this.age.serialize(generator, mapper);

		if (this.failedStep != null) {
			generator.writeKey("failed_step");
			generator.write(this.failedStep);

		}
		if (this.failedStepRetryCount != null) {
			generator.writeKey("failed_step_retry_count");
			generator.write(this.failedStepRetryCount);

		}
		generator.writeKey("index");
		generator.write(this.index);

		if (this.indexCreationDateMillis != null) {
			generator.writeKey("index_creation_date_millis");
			generator.write(this.indexCreationDateMillis);

		}
		if (this.isAutoRetryableError != null) {
			generator.writeKey("is_auto_retryable_error");
			generator.write(this.isAutoRetryableError);

		}
		generator.writeKey("lifecycle_date_millis");
		generator.write(this.lifecycleDateMillis);

		generator.writeKey("phase");
		generator.write(this.phase);

		generator.writeKey("phase_time_millis");
		generator.write(this.phaseTimeMillis);

		generator.writeKey("policy");
		generator.write(this.policy);

		generator.writeKey("step");
		generator.write(this.step);

		if (ApiTypeHelper.isDefined(this.stepInfo)) {
			generator.writeKey("step_info");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.stepInfo.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("step_time_millis");
		generator.write(this.stepTimeMillis);

		generator.writeKey("phase_execution");
		this.phaseExecution.serialize(generator, mapper);

		if (this.timeSinceIndexCreation != null) {
			generator.writeKey("time_since_index_creation");
			this.timeSinceIndexCreation.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LifecycleExplainManaged}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LifecycleExplainManaged> {
		private String action;

		private String actionTimeMillis;

		private Time age;

		@Nullable
		private String failedStep;

		@Nullable
		private Integer failedStepRetryCount;

		private String index;

		@Nullable
		private String indexCreationDateMillis;

		@Nullable
		private Boolean isAutoRetryableError;

		private String lifecycleDateMillis;

		private String phase;

		private String phaseTimeMillis;

		private String policy;

		private String step;

		@Nullable
		private Map<String, JsonData> stepInfo;

		private String stepTimeMillis;

		private LifecycleExplainPhaseExecution phaseExecution;

		@Nullable
		private Time timeSinceIndexCreation;

		/**
		 * Required - API name: {@code action}
		 */
		public final Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * Required - API name: {@code action_time_millis}
		 */
		public final Builder actionTimeMillis(String value) {
			this.actionTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code age}
		 */
		public final Builder age(Time value) {
			this.age = value;
			return this;
		}

		/**
		 * Required - API name: {@code age}
		 */
		public final Builder age(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.age(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code failed_step}
		 */
		public final Builder failedStep(@Nullable String value) {
			this.failedStep = value;
			return this;
		}

		/**
		 * API name: {@code failed_step_retry_count}
		 */
		public final Builder failedStepRetryCount(@Nullable Integer value) {
			this.failedStepRetryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index_creation_date_millis}
		 */
		public final Builder indexCreationDateMillis(@Nullable String value) {
			this.indexCreationDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code is_auto_retryable_error}
		 */
		public final Builder isAutoRetryableError(@Nullable Boolean value) {
			this.isAutoRetryableError = value;
			return this;
		}

		/**
		 * Required - API name: {@code lifecycle_date_millis}
		 */
		public final Builder lifecycleDateMillis(String value) {
			this.lifecycleDateMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase}
		 */
		public final Builder phase(String value) {
			this.phase = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase_time_millis}
		 */
		public final Builder phaseTimeMillis(String value) {
			this.phaseTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(String value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code step}
		 */
		public final Builder step(String value) {
			this.step = value;
			return this;
		}

		/**
		 * API name: {@code step_info}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>stepInfo</code>.
		 */
		public final Builder stepInfo(Map<String, JsonData> map) {
			this.stepInfo = _mapPutAll(this.stepInfo, map);
			return this;
		}

		/**
		 * API name: {@code step_info}
		 * <p>
		 * Adds an entry to <code>stepInfo</code>.
		 */
		public final Builder stepInfo(String key, JsonData value) {
			this.stepInfo = _mapPut(this.stepInfo, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code step_time_millis}
		 */
		public final Builder stepTimeMillis(String value) {
			this.stepTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase_execution}
		 */
		public final Builder phaseExecution(LifecycleExplainPhaseExecution value) {
			this.phaseExecution = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase_execution}
		 */
		public final Builder phaseExecution(
				Function<LifecycleExplainPhaseExecution.Builder, ObjectBuilder<LifecycleExplainPhaseExecution>> fn) {
			return this.phaseExecution(fn.apply(new LifecycleExplainPhaseExecution.Builder()).build());
		}

		/**
		 * API name: {@code time_since_index_creation}
		 */
		public final Builder timeSinceIndexCreation(@Nullable Time value) {
			this.timeSinceIndexCreation = value;
			return this;
		}

		/**
		 * API name: {@code time_since_index_creation}
		 */
		public final Builder timeSinceIndexCreation(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeSinceIndexCreation(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LifecycleExplainManaged}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LifecycleExplainManaged build() {
			_checkSingleUse();

			return new LifecycleExplainManaged(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LifecycleExplainManaged}
	 */
	public static final JsonpDeserializer<LifecycleExplainManaged> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LifecycleExplainManaged::setupLifecycleExplainManagedDeserializer);

	protected static void setupLifecycleExplainManagedDeserializer(
			ObjectDeserializer<LifecycleExplainManaged.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::actionTimeMillis, JsonpDeserializer.stringDeserializer(), "action_time_millis");
		op.add(Builder::age, Time._DESERIALIZER, "age");
		op.add(Builder::failedStep, JsonpDeserializer.stringDeserializer(), "failed_step");
		op.add(Builder::failedStepRetryCount, JsonpDeserializer.integerDeserializer(), "failed_step_retry_count");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indexCreationDateMillis, JsonpDeserializer.stringDeserializer(), "index_creation_date_millis");
		op.add(Builder::isAutoRetryableError, JsonpDeserializer.booleanDeserializer(), "is_auto_retryable_error");
		op.add(Builder::lifecycleDateMillis, JsonpDeserializer.stringDeserializer(), "lifecycle_date_millis");
		op.add(Builder::phase, JsonpDeserializer.stringDeserializer(), "phase");
		op.add(Builder::phaseTimeMillis, JsonpDeserializer.stringDeserializer(), "phase_time_millis");
		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::step, JsonpDeserializer.stringDeserializer(), "step");
		op.add(Builder::stepInfo, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "step_info");
		op.add(Builder::stepTimeMillis, JsonpDeserializer.stringDeserializer(), "step_time_millis");
		op.add(Builder::phaseExecution, LifecycleExplainPhaseExecution._DESERIALIZER, "phase_execution");
		op.add(Builder::timeSinceIndexCreation, Time._DESERIALIZER, "time_since_index_creation");

		op.ignore("managed");
	}

}
