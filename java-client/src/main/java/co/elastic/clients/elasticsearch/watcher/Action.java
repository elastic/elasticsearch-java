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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.Transform;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
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

// typedef: watcher._types.Action

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.Action">API
 *      specification</a>
 */
@JsonpDeserializable
public class Action implements JsonpSerializable {
	@Nullable
	private final ActionType actionType;

	@Nullable
	private final Condition condition;

	@Nullable
	private final String foreach;

	@Nullable
	private final Integer maxIterations;

	@Nullable
	private final String name;

	@Nullable
	private final Time throttlePeriod;

	@Nullable
	private final Long throttlePeriodInMillis;

	@Nullable
	private final Transform transform;

	@Nullable
	private final IndexAction index;

	@Nullable
	private final LoggingAction logging;

	@Nullable
	private final EmailAction email;

	@Nullable
	private final PagerDutyAction pagerduty;

	@Nullable
	private final SlackAction slack;

	@Nullable
	private final WebhookAction webhook;

	// ---------------------------------------------------------------------------------------------

	private Action(Builder builder) {

		this.actionType = builder.actionType;
		this.condition = builder.condition;
		this.foreach = builder.foreach;
		this.maxIterations = builder.maxIterations;
		this.name = builder.name;
		this.throttlePeriod = builder.throttlePeriod;
		this.throttlePeriodInMillis = builder.throttlePeriodInMillis;
		this.transform = builder.transform;
		this.index = builder.index;
		this.logging = builder.logging;
		this.email = builder.email;
		this.pagerduty = builder.pagerduty;
		this.slack = builder.slack;
		this.webhook = builder.webhook;

	}

	public static Action of(Function<Builder, ObjectBuilder<Action>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code action_type}
	 */
	@Nullable
	public final ActionType actionType() {
		return this.actionType;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public final Condition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code foreach}
	 */
	@Nullable
	public final String foreach() {
		return this.foreach;
	}

	/**
	 * API name: {@code max_iterations}
	 */
	@Nullable
	public final Integer maxIterations() {
		return this.maxIterations;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public final Time throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * API name: {@code throttle_period_in_millis}
	 */
	@Nullable
	public final Long throttlePeriodInMillis() {
		return this.throttlePeriodInMillis;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public final Transform transform() {
		return this.transform;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final IndexAction index() {
		return this.index;
	}

	/**
	 * API name: {@code logging}
	 */
	@Nullable
	public final LoggingAction logging() {
		return this.logging;
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public final EmailAction email() {
		return this.email;
	}

	/**
	 * API name: {@code pagerduty}
	 */
	@Nullable
	public final PagerDutyAction pagerduty() {
		return this.pagerduty;
	}

	/**
	 * API name: {@code slack}
	 */
	@Nullable
	public final SlackAction slack() {
		return this.slack;
	}

	/**
	 * API name: {@code webhook}
	 */
	@Nullable
	public final WebhookAction webhook() {
		return this.webhook;
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

		if (this.actionType != null) {
			generator.writeKey("action_type");
			this.actionType.serialize(generator, mapper);
		}
		if (this.condition != null) {
			generator.writeKey("condition");
			this.condition.serialize(generator, mapper);

		}
		if (this.foreach != null) {
			generator.writeKey("foreach");
			generator.write(this.foreach);

		}
		if (this.maxIterations != null) {
			generator.writeKey("max_iterations");
			generator.write(this.maxIterations);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.throttlePeriod != null) {
			generator.writeKey("throttle_period");
			this.throttlePeriod.serialize(generator, mapper);

		}
		if (this.throttlePeriodInMillis != null) {
			generator.writeKey("throttle_period_in_millis");
			generator.write(this.throttlePeriodInMillis);

		}
		if (this.transform != null) {
			generator.writeKey("transform");
			this.transform.serialize(generator, mapper);

		}
		if (this.index != null) {
			generator.writeKey("index");
			this.index.serialize(generator, mapper);

		}
		if (this.logging != null) {
			generator.writeKey("logging");
			this.logging.serialize(generator, mapper);

		}
		if (this.email != null) {
			generator.writeKey("email");
			this.email.serialize(generator, mapper);

		}
		if (this.pagerduty != null) {
			generator.writeKey("pagerduty");
			this.pagerduty.serialize(generator, mapper);

		}
		if (this.slack != null) {
			generator.writeKey("slack");
			this.slack.serialize(generator, mapper);

		}
		if (this.webhook != null) {
			generator.writeKey("webhook");
			this.webhook.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Action}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Action> {
		@Nullable
		private ActionType actionType;

		@Nullable
		private Condition condition;

		@Nullable
		private String foreach;

		@Nullable
		private Integer maxIterations;

		@Nullable
		private String name;

		@Nullable
		private Time throttlePeriod;

		@Nullable
		private Long throttlePeriodInMillis;

		@Nullable
		private Transform transform;

		@Nullable
		private IndexAction index;

		@Nullable
		private LoggingAction logging;

		@Nullable
		private EmailAction email;

		@Nullable
		private PagerDutyAction pagerduty;

		@Nullable
		private SlackAction slack;

		@Nullable
		private WebhookAction webhook;

		/**
		 * API name: {@code action_type}
		 */
		public final Builder actionType(@Nullable ActionType value) {
			this.actionType = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(@Nullable Condition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(Function<Condition.Builder, ObjectBuilder<Condition>> fn) {
			return this.condition(fn.apply(new Condition.Builder()).build());
		}

		/**
		 * API name: {@code foreach}
		 */
		public final Builder foreach(@Nullable String value) {
			this.foreach = value;
			return this;
		}

		/**
		 * API name: {@code max_iterations}
		 */
		public final Builder maxIterations(@Nullable Integer value) {
			this.maxIterations = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(@Nullable Time value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public final Builder throttlePeriod(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttlePeriod(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code throttle_period_in_millis}
		 */
		public final Builder throttlePeriodInMillis(@Nullable Long value) {
			this.throttlePeriodInMillis = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(@Nullable Transform value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return this.transform(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable IndexAction value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(Function<IndexAction.Builder, ObjectBuilder<IndexAction>> fn) {
			return this.index(fn.apply(new IndexAction.Builder()).build());
		}

		/**
		 * API name: {@code logging}
		 */
		public final Builder logging(@Nullable LoggingAction value) {
			this.logging = value;
			return this;
		}

		/**
		 * API name: {@code logging}
		 */
		public final Builder logging(Function<LoggingAction.Builder, ObjectBuilder<LoggingAction>> fn) {
			return this.logging(fn.apply(new LoggingAction.Builder()).build());
		}

		/**
		 * API name: {@code email}
		 */
		public final Builder email(@Nullable EmailAction value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code email}
		 */
		public final Builder email(Function<EmailAction.Builder, ObjectBuilder<EmailAction>> fn) {
			return this.email(fn.apply(new EmailAction.Builder()).build());
		}

		/**
		 * API name: {@code pagerduty}
		 */
		public final Builder pagerduty(@Nullable PagerDutyAction value) {
			this.pagerduty = value;
			return this;
		}

		/**
		 * API name: {@code pagerduty}
		 */
		public final Builder pagerduty(Function<PagerDutyAction.Builder, ObjectBuilder<PagerDutyAction>> fn) {
			return this.pagerduty(fn.apply(new PagerDutyAction.Builder()).build());
		}

		/**
		 * API name: {@code slack}
		 */
		public final Builder slack(@Nullable SlackAction value) {
			this.slack = value;
			return this;
		}

		/**
		 * API name: {@code slack}
		 */
		public final Builder slack(Function<SlackAction.Builder, ObjectBuilder<SlackAction>> fn) {
			return this.slack(fn.apply(new SlackAction.Builder()).build());
		}

		/**
		 * API name: {@code webhook}
		 */
		public final Builder webhook(@Nullable WebhookAction value) {
			this.webhook = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public final Builder webhook(Function<WebhookAction.Builder, ObjectBuilder<WebhookAction>> fn) {
			return this.webhook(fn.apply(new WebhookAction.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Action}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Action build() {
			_checkSingleUse();

			return new Action(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Action}
	 */
	public static final JsonpDeserializer<Action> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Action::setupActionDeserializer);

	protected static void setupActionDeserializer(ObjectDeserializer<Action.Builder> op) {

		op.add(Builder::actionType, ActionType._DESERIALIZER, "action_type");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::foreach, JsonpDeserializer.stringDeserializer(), "foreach");
		op.add(Builder::maxIterations, JsonpDeserializer.integerDeserializer(), "max_iterations");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::throttlePeriod, Time._DESERIALIZER, "throttle_period");
		op.add(Builder::throttlePeriodInMillis, JsonpDeserializer.longDeserializer(), "throttle_period_in_millis");
		op.add(Builder::transform, Transform._DESERIALIZER, "transform");
		op.add(Builder::index, IndexAction._DESERIALIZER, "index");
		op.add(Builder::logging, LoggingAction._DESERIALIZER, "logging");
		op.add(Builder::email, EmailAction._DESERIALIZER, "email");
		op.add(Builder::pagerduty, PagerDutyAction._DESERIALIZER, "pagerduty");
		op.add(Builder::slack, SlackAction._DESERIALIZER, "slack");
		op.add(Builder::webhook, WebhookAction._DESERIALIZER, "webhook");

	}

}
