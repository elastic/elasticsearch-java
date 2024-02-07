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

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
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

// typedef: ilm.explain_lifecycle.LifecycleExplainManaged

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ilm.explain_lifecycle.LifecycleExplainManaged">API
 *      specification</a>
 */
@JsonpDeserializable
public class LifecycleExplainManaged implements LifecycleExplainVariant, JsonpSerializable {
	@Nullable
	private final String action;

	@Nullable
	private final DateTime actionTime;

	@Nullable
	private final Long actionTimeMillis;

	@Nullable
	private final Time age;

	@Nullable
	private final String failedStep;

	@Nullable
	private final Integer failedStepRetryCount;

	@Nullable
	private final String index;

	@Nullable
	private final DateTime indexCreationDate;

	@Nullable
	private final Long indexCreationDateMillis;

	@Nullable
	private final Boolean isAutoRetryableError;

	@Nullable
	private final DateTime lifecycleDate;

	@Nullable
	private final Long lifecycleDateMillis;

	private final String phase;

	@Nullable
	private final DateTime phaseTime;

	@Nullable
	private final Long phaseTimeMillis;

	private final String policy;

	@Nullable
	private final String step;

	private final Map<String, JsonData> stepInfo;

	@Nullable
	private final DateTime stepTime;

	@Nullable
	private final Long stepTimeMillis;

	@Nullable
	private final LifecycleExplainPhaseExecution phaseExecution;

	@Nullable
	private final Time timeSinceIndexCreation;

	// ---------------------------------------------------------------------------------------------

	private LifecycleExplainManaged(Builder builder) {

		this.action = builder.action;
		this.actionTime = builder.actionTime;
		this.actionTimeMillis = builder.actionTimeMillis;
		this.age = builder.age;
		this.failedStep = builder.failedStep;
		this.failedStepRetryCount = builder.failedStepRetryCount;
		this.index = builder.index;
		this.indexCreationDate = builder.indexCreationDate;
		this.indexCreationDateMillis = builder.indexCreationDateMillis;
		this.isAutoRetryableError = builder.isAutoRetryableError;
		this.lifecycleDate = builder.lifecycleDate;
		this.lifecycleDateMillis = builder.lifecycleDateMillis;
		this.phase = ApiTypeHelper.requireNonNull(builder.phase, this, "phase");
		this.phaseTime = builder.phaseTime;
		this.phaseTimeMillis = builder.phaseTimeMillis;
		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.step = builder.step;
		this.stepInfo = ApiTypeHelper.unmodifiable(builder.stepInfo);
		this.stepTime = builder.stepTime;
		this.stepTimeMillis = builder.stepTimeMillis;
		this.phaseExecution = builder.phaseExecution;
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
	 * API name: {@code action}
	 */
	@Nullable
	public final String action() {
		return this.action;
	}

	/**
	 * API name: {@code action_time}
	 */
	@Nullable
	public final DateTime actionTime() {
		return this.actionTime;
	}

	/**
	 * API name: {@code action_time_millis}
	 */
	@Nullable
	public final Long actionTimeMillis() {
		return this.actionTimeMillis;
	}

	/**
	 * API name: {@code age}
	 */
	@Nullable
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
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code index_creation_date}
	 */
	@Nullable
	public final DateTime indexCreationDate() {
		return this.indexCreationDate;
	}

	/**
	 * API name: {@code index_creation_date_millis}
	 */
	@Nullable
	public final Long indexCreationDateMillis() {
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
	 * API name: {@code lifecycle_date}
	 */
	@Nullable
	public final DateTime lifecycleDate() {
		return this.lifecycleDate;
	}

	/**
	 * API name: {@code lifecycle_date_millis}
	 */
	@Nullable
	public final Long lifecycleDateMillis() {
		return this.lifecycleDateMillis;
	}

	/**
	 * Required - API name: {@code phase}
	 */
	public final String phase() {
		return this.phase;
	}

	/**
	 * API name: {@code phase_time}
	 */
	@Nullable
	public final DateTime phaseTime() {
		return this.phaseTime;
	}

	/**
	 * API name: {@code phase_time_millis}
	 */
	@Nullable
	public final Long phaseTimeMillis() {
		return this.phaseTimeMillis;
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final String policy() {
		return this.policy;
	}

	/**
	 * API name: {@code step}
	 */
	@Nullable
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
	 * API name: {@code step_time}
	 */
	@Nullable
	public final DateTime stepTime() {
		return this.stepTime;
	}

	/**
	 * API name: {@code step_time_millis}
	 */
	@Nullable
	public final Long stepTimeMillis() {
		return this.stepTimeMillis;
	}

	/**
	 * API name: {@code phase_execution}
	 */
	@Nullable
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

		if (this.action != null) {
			generator.writeKey("action");
			generator.write(this.action);

		}
		if (this.actionTime != null) {
			generator.writeKey("action_time");
			this.actionTime.serialize(generator, mapper);
		}
		if (this.actionTimeMillis != null) {
			generator.writeKey("action_time_millis");
			generator.write(this.actionTimeMillis);

		}
		if (this.age != null) {
			generator.writeKey("age");
			this.age.serialize(generator, mapper);

		}
		if (this.failedStep != null) {
			generator.writeKey("failed_step");
			generator.write(this.failedStep);

		}
		if (this.failedStepRetryCount != null) {
			generator.writeKey("failed_step_retry_count");
			generator.write(this.failedStepRetryCount);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.indexCreationDate != null) {
			generator.writeKey("index_creation_date");
			this.indexCreationDate.serialize(generator, mapper);
		}
		if (this.indexCreationDateMillis != null) {
			generator.writeKey("index_creation_date_millis");
			generator.write(this.indexCreationDateMillis);

		}
		if (this.isAutoRetryableError != null) {
			generator.writeKey("is_auto_retryable_error");
			generator.write(this.isAutoRetryableError);

		}
		if (this.lifecycleDate != null) {
			generator.writeKey("lifecycle_date");
			this.lifecycleDate.serialize(generator, mapper);
		}
		if (this.lifecycleDateMillis != null) {
			generator.writeKey("lifecycle_date_millis");
			generator.write(this.lifecycleDateMillis);

		}
		generator.writeKey("phase");
		generator.write(this.phase);

		if (this.phaseTime != null) {
			generator.writeKey("phase_time");
			this.phaseTime.serialize(generator, mapper);
		}
		if (this.phaseTimeMillis != null) {
			generator.writeKey("phase_time_millis");
			generator.write(this.phaseTimeMillis);

		}
		generator.writeKey("policy");
		generator.write(this.policy);

		if (this.step != null) {
			generator.writeKey("step");
			generator.write(this.step);

		}
		if (ApiTypeHelper.isDefined(this.stepInfo)) {
			generator.writeKey("step_info");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.stepInfo.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.stepTime != null) {
			generator.writeKey("step_time");
			this.stepTime.serialize(generator, mapper);
		}
		if (this.stepTimeMillis != null) {
			generator.writeKey("step_time_millis");
			generator.write(this.stepTimeMillis);

		}
		if (this.phaseExecution != null) {
			generator.writeKey("phase_execution");
			this.phaseExecution.serialize(generator, mapper);

		}
		if (this.timeSinceIndexCreation != null) {
			generator.writeKey("time_since_index_creation");
			this.timeSinceIndexCreation.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LifecycleExplainManaged}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LifecycleExplainManaged> {
		@Nullable
		private String action;

		@Nullable
		private DateTime actionTime;

		@Nullable
		private Long actionTimeMillis;

		@Nullable
		private Time age;

		@Nullable
		private String failedStep;

		@Nullable
		private Integer failedStepRetryCount;

		@Nullable
		private String index;

		@Nullable
		private DateTime indexCreationDate;

		@Nullable
		private Long indexCreationDateMillis;

		@Nullable
		private Boolean isAutoRetryableError;

		@Nullable
		private DateTime lifecycleDate;

		@Nullable
		private Long lifecycleDateMillis;

		private String phase;

		@Nullable
		private DateTime phaseTime;

		@Nullable
		private Long phaseTimeMillis;

		private String policy;

		@Nullable
		private String step;

		@Nullable
		private Map<String, JsonData> stepInfo;

		@Nullable
		private DateTime stepTime;

		@Nullable
		private Long stepTimeMillis;

		@Nullable
		private LifecycleExplainPhaseExecution phaseExecution;

		@Nullable
		private Time timeSinceIndexCreation;

		/**
		 * API name: {@code action}
		 */
		public final Builder action(@Nullable String value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code action_time}
		 */
		public final Builder actionTime(@Nullable DateTime value) {
			this.actionTime = value;
			return this;
		}

		/**
		 * API name: {@code action_time_millis}
		 */
		public final Builder actionTimeMillis(@Nullable Long value) {
			this.actionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code age}
		 */
		public final Builder age(@Nullable Time value) {
			this.age = value;
			return this;
		}

		/**
		 * API name: {@code age}
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
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index_creation_date}
		 */
		public final Builder indexCreationDate(@Nullable DateTime value) {
			this.indexCreationDate = value;
			return this;
		}

		/**
		 * API name: {@code index_creation_date_millis}
		 */
		public final Builder indexCreationDateMillis(@Nullable Long value) {
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
		 * API name: {@code lifecycle_date}
		 */
		public final Builder lifecycleDate(@Nullable DateTime value) {
			this.lifecycleDate = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle_date_millis}
		 */
		public final Builder lifecycleDateMillis(@Nullable Long value) {
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
		 * API name: {@code phase_time}
		 */
		public final Builder phaseTime(@Nullable DateTime value) {
			this.phaseTime = value;
			return this;
		}

		/**
		 * API name: {@code phase_time_millis}
		 */
		public final Builder phaseTimeMillis(@Nullable Long value) {
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
		 * API name: {@code step}
		 */
		public final Builder step(@Nullable String value) {
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
		 * API name: {@code step_time}
		 */
		public final Builder stepTime(@Nullable DateTime value) {
			this.stepTime = value;
			return this;
		}

		/**
		 * API name: {@code step_time_millis}
		 */
		public final Builder stepTimeMillis(@Nullable Long value) {
			this.stepTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code phase_execution}
		 */
		public final Builder phaseExecution(@Nullable LifecycleExplainPhaseExecution value) {
			this.phaseExecution = value;
			return this;
		}

		/**
		 * API name: {@code phase_execution}
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
		op.add(Builder::actionTime, DateTime._DESERIALIZER, "action_time");
		op.add(Builder::actionTimeMillis, JsonpDeserializer.longDeserializer(), "action_time_millis");
		op.add(Builder::age, Time._DESERIALIZER, "age");
		op.add(Builder::failedStep, JsonpDeserializer.stringDeserializer(), "failed_step");
		op.add(Builder::failedStepRetryCount, JsonpDeserializer.integerDeserializer(), "failed_step_retry_count");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indexCreationDate, DateTime._DESERIALIZER, "index_creation_date");
		op.add(Builder::indexCreationDateMillis, JsonpDeserializer.longDeserializer(), "index_creation_date_millis");
		op.add(Builder::isAutoRetryableError, JsonpDeserializer.booleanDeserializer(), "is_auto_retryable_error");
		op.add(Builder::lifecycleDate, DateTime._DESERIALIZER, "lifecycle_date");
		op.add(Builder::lifecycleDateMillis, JsonpDeserializer.longDeserializer(), "lifecycle_date_millis");
		op.add(Builder::phase, JsonpDeserializer.stringDeserializer(), "phase");
		op.add(Builder::phaseTime, DateTime._DESERIALIZER, "phase_time");
		op.add(Builder::phaseTimeMillis, JsonpDeserializer.longDeserializer(), "phase_time_millis");
		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::step, JsonpDeserializer.stringDeserializer(), "step");
		op.add(Builder::stepInfo, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "step_info");
		op.add(Builder::stepTime, DateTime._DESERIALIZER, "step_time");
		op.add(Builder::stepTimeMillis, JsonpDeserializer.longDeserializer(), "step_time_millis");
		op.add(Builder::phaseExecution, LifecycleExplainPhaseExecution._DESERIALIZER, "phase_execution");
		op.add(Builder::timeSinceIndexCreation, Time._DESERIALIZER, "time_since_index_creation");

		op.ignore("managed");
	}

}
