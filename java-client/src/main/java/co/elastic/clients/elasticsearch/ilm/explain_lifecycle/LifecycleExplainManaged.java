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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.LifecycleExplainManaged
@JsonpDeserializable
public final class LifecycleExplainManaged implements LifecycleExplainVariant, JsonpSerializable {
	private final String action;

	private final String actionTimeMillis;

	private final String age;

	@Nullable
	private final String failedStep;

	@Nullable
	private final Integer failedStepRetryCount;

	private final String index;

	@Nullable
	private final Boolean isAutoRetryableError;

	private final String lifecycleDateMillis;

	private final String phase;

	private final String phaseTimeMillis;

	private final String policy;

	private final String step;

	@Nullable
	private final Map<String, JsonData> stepInfo;

	private final String stepTimeMillis;

	private final LifecycleExplainPhaseExecution phaseExecution;

	// ---------------------------------------------------------------------------------------------

	public LifecycleExplainManaged(Builder builder) {

		this.action = Objects.requireNonNull(builder.action, "action");
		this.actionTimeMillis = Objects.requireNonNull(builder.actionTimeMillis, "action_time_millis");
		this.age = Objects.requireNonNull(builder.age, "age");
		this.failedStep = builder.failedStep;
		this.failedStepRetryCount = builder.failedStepRetryCount;
		this.index = Objects.requireNonNull(builder.index, "index");
		this.isAutoRetryableError = builder.isAutoRetryableError;
		this.lifecycleDateMillis = Objects.requireNonNull(builder.lifecycleDateMillis, "lifecycle_date_millis");
		this.phase = Objects.requireNonNull(builder.phase, "phase");
		this.phaseTimeMillis = Objects.requireNonNull(builder.phaseTimeMillis, "phase_time_millis");
		this.policy = Objects.requireNonNull(builder.policy, "policy");
		this.step = Objects.requireNonNull(builder.step, "step");
		this.stepInfo = ModelTypeHelper.unmodifiable(builder.stepInfo);
		this.stepTimeMillis = Objects.requireNonNull(builder.stepTimeMillis, "step_time_millis");
		this.phaseExecution = Objects.requireNonNull(builder.phaseExecution, "phase_execution");

	}

	public LifecycleExplainManaged(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link LifecycleExplain} variant type
	 */
	@Override
	public String _variantType() {
		return "true";
	}

	/**
	 * Required - API name: {@code action}
	 */
	public String action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code action_time_millis}
	 */
	public String actionTimeMillis() {
		return this.actionTimeMillis;
	}

	/**
	 * Required - API name: {@code age}
	 */
	public String age() {
		return this.age;
	}

	/**
	 * API name: {@code failed_step}
	 */
	@Nullable
	public String failedStep() {
		return this.failedStep;
	}

	/**
	 * API name: {@code failed_step_retry_count}
	 */
	@Nullable
	public Integer failedStepRetryCount() {
		return this.failedStepRetryCount;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code is_auto_retryable_error}
	 */
	@Nullable
	public Boolean isAutoRetryableError() {
		return this.isAutoRetryableError;
	}

	/**
	 * Required - API name: {@code lifecycle_date_millis}
	 */
	public String lifecycleDateMillis() {
		return this.lifecycleDateMillis;
	}

	/**
	 * Required - API name: {@code phase}
	 */
	public String phase() {
		return this.phase;
	}

	/**
	 * Required - API name: {@code phase_time_millis}
	 */
	public String phaseTimeMillis() {
		return this.phaseTimeMillis;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public String policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code step}
	 */
	public String step() {
		return this.step;
	}

	/**
	 * API name: {@code step_info}
	 */
	@Nullable
	public Map<String, JsonData> stepInfo() {
		return this.stepInfo;
	}

	/**
	 * Required - API name: {@code step_time_millis}
	 */
	public String stepTimeMillis() {
		return this.stepTimeMillis;
	}

	/**
	 * Required - API name: {@code phase_execution}
	 */
	public LifecycleExplainPhaseExecution phaseExecution() {
		return this.phaseExecution;
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
		generator.write(this.age);

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

		if (this.stepInfo != null) {

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LifecycleExplainManaged}.
	 */
	public static class Builder implements ObjectBuilder<LifecycleExplainManaged> {
		private String action;

		private String actionTimeMillis;

		private String age;

		@Nullable
		private String failedStep;

		@Nullable
		private Integer failedStepRetryCount;

		private String index;

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

		/**
		 * Required - API name: {@code action}
		 */
		public Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * Required - API name: {@code action_time_millis}
		 */
		public Builder actionTimeMillis(String value) {
			this.actionTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code age}
		 */
		public Builder age(String value) {
			this.age = value;
			return this;
		}

		/**
		 * API name: {@code failed_step}
		 */
		public Builder failedStep(@Nullable String value) {
			this.failedStep = value;
			return this;
		}

		/**
		 * API name: {@code failed_step_retry_count}
		 */
		public Builder failedStepRetryCount(@Nullable Integer value) {
			this.failedStepRetryCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code is_auto_retryable_error}
		 */
		public Builder isAutoRetryableError(@Nullable Boolean value) {
			this.isAutoRetryableError = value;
			return this;
		}

		/**
		 * Required - API name: {@code lifecycle_date_millis}
		 */
		public Builder lifecycleDateMillis(String value) {
			this.lifecycleDateMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase}
		 */
		public Builder phase(String value) {
			this.phase = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase_time_millis}
		 */
		public Builder phaseTimeMillis(String value) {
			this.phaseTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy}
		 */
		public Builder policy(String value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code step}
		 */
		public Builder step(String value) {
			this.step = value;
			return this;
		}

		/**
		 * API name: {@code step_info}
		 */
		public Builder stepInfo(@Nullable Map<String, JsonData> value) {
			this.stepInfo = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #stepInfo(Map)}, creating the map if needed.
		 */
		public Builder putStepInfo(String key, JsonData value) {
			if (this.stepInfo == null) {
				this.stepInfo = new HashMap<>();
			}
			this.stepInfo.put(key, value);
			return this;
		}

		/**
		 * Required - API name: {@code step_time_millis}
		 */
		public Builder stepTimeMillis(String value) {
			this.stepTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase_execution}
		 */
		public Builder phaseExecution(LifecycleExplainPhaseExecution value) {
			this.phaseExecution = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase_execution}
		 */
		public Builder phaseExecution(
				Function<LifecycleExplainPhaseExecution.Builder, ObjectBuilder<LifecycleExplainPhaseExecution>> fn) {
			return this.phaseExecution(fn.apply(new LifecycleExplainPhaseExecution.Builder()).build());
		}

		/**
		 * Builds a {@link LifecycleExplainManaged}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LifecycleExplainManaged build() {

			return new LifecycleExplainManaged(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LifecycleExplainManaged}
	 */
	public static final JsonpDeserializer<LifecycleExplainManaged> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LifecycleExplainManaged::setupLifecycleExplainManagedDeserializer, Builder::build);

	protected static void setupLifecycleExplainManagedDeserializer(
			DelegatingDeserializer<LifecycleExplainManaged.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::actionTimeMillis, JsonpDeserializer.stringDeserializer(), "action_time_millis");
		op.add(Builder::age, JsonpDeserializer.stringDeserializer(), "age");
		op.add(Builder::failedStep, JsonpDeserializer.stringDeserializer(), "failed_step");
		op.add(Builder::failedStepRetryCount, JsonpDeserializer.integerDeserializer(), "failed_step_retry_count");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::isAutoRetryableError, JsonpDeserializer.booleanDeserializer(), "is_auto_retryable_error");
		op.add(Builder::lifecycleDateMillis, JsonpDeserializer.stringDeserializer(), "lifecycle_date_millis");
		op.add(Builder::phase, JsonpDeserializer.stringDeserializer(), "phase");
		op.add(Builder::phaseTimeMillis, JsonpDeserializer.stringDeserializer(), "phase_time_millis");
		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::step, JsonpDeserializer.stringDeserializer(), "step");
		op.add(Builder::stepInfo, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "step_info");
		op.add(Builder::stepTimeMillis, JsonpDeserializer.stringDeserializer(), "step_time_millis");
		op.add(Builder::phaseExecution, LifecycleExplainPhaseExecution._DESERIALIZER, "phase_execution");

		op.ignore("managed");
	}

}
