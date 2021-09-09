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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.TransformContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.Action
public final class Action implements ToJsonp {
	@Nullable
	private final JsonValue actionType;

	@Nullable
	private final ConditionContainer condition;

	@Nullable
	private final String foreach;

	@Nullable
	private final Number maxIterations;

	@Nullable
	private final String name;

	@Nullable
	private final JsonValue throttlePeriod;

	@Nullable
	private final JsonValue throttlePeriodInMillis;

	@Nullable
	private final TransformContainer transform;

	@Nullable
	private final Index index;

	@Nullable
	private final Logging logging;

	@Nullable
	private final ActionWebhook webhook;

	// ---------------------------------------------------------------------------------------------

	protected Action(Builder builder) {

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
		this.webhook = builder.webhook;

	}

	/**
	 * API name: {@code action_type}
	 */
	@Nullable
	public JsonValue actionType() {
		return this.actionType;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public ConditionContainer condition() {
		return this.condition;
	}

	/**
	 * API name: {@code foreach}
	 */
	@Nullable
	public String foreach() {
		return this.foreach;
	}

	/**
	 * API name: {@code max_iterations}
	 */
	@Nullable
	public Number maxIterations() {
		return this.maxIterations;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public JsonValue throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * API name: {@code throttle_period_in_millis}
	 */
	@Nullable
	public JsonValue throttlePeriodInMillis() {
		return this.throttlePeriodInMillis;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public TransformContainer transform() {
		return this.transform;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public Index index() {
		return this.index;
	}

	/**
	 * API name: {@code logging}
	 */
	@Nullable
	public Logging logging() {
		return this.logging;
	}

	/**
	 * API name: {@code webhook}
	 */
	@Nullable
	public ActionWebhook webhook() {
		return this.webhook;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.actionType != null) {

			generator.writeKey("action_type");
			generator.write(this.actionType);

		}
		if (this.condition != null) {

			generator.writeKey("condition");
			this.condition.toJsonp(generator, mapper);

		}
		if (this.foreach != null) {

			generator.writeKey("foreach");
			generator.write(this.foreach);

		}
		if (this.maxIterations != null) {

			generator.writeKey("max_iterations");
			generator.write(this.maxIterations.doubleValue());

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.throttlePeriod != null) {

			generator.writeKey("throttle_period");
			generator.write(this.throttlePeriod);

		}
		if (this.throttlePeriodInMillis != null) {

			generator.writeKey("throttle_period_in_millis");
			generator.write(this.throttlePeriodInMillis);

		}
		if (this.transform != null) {

			generator.writeKey("transform");
			this.transform.toJsonp(generator, mapper);

		}
		if (this.index != null) {

			generator.writeKey("index");
			this.index.toJsonp(generator, mapper);

		}
		if (this.logging != null) {

			generator.writeKey("logging");
			this.logging.toJsonp(generator, mapper);

		}
		if (this.webhook != null) {

			generator.writeKey("webhook");
			this.webhook.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Action}.
	 */
	public static class Builder implements ObjectBuilder<Action> {
		@Nullable
		private JsonValue actionType;

		@Nullable
		private ConditionContainer condition;

		@Nullable
		private String foreach;

		@Nullable
		private Number maxIterations;

		@Nullable
		private String name;

		@Nullable
		private JsonValue throttlePeriod;

		@Nullable
		private JsonValue throttlePeriodInMillis;

		@Nullable
		private TransformContainer transform;

		@Nullable
		private Index index;

		@Nullable
		private Logging logging;

		@Nullable
		private ActionWebhook webhook;

		/**
		 * API name: {@code action_type}
		 */
		public Builder actionType(@Nullable JsonValue value) {
			this.actionType = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(@Nullable ConditionContainer value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(Function<ConditionContainer.Builder, ObjectBuilder<ConditionContainer>> fn) {
			return this.condition(fn.apply(new ConditionContainer.Builder()).build());
		}

		/**
		 * API name: {@code foreach}
		 */
		public Builder foreach(@Nullable String value) {
			this.foreach = value;
			return this;
		}

		/**
		 * API name: {@code max_iterations}
		 */
		public Builder maxIterations(@Nullable Number value) {
			this.maxIterations = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public Builder throttlePeriod(@Nullable JsonValue value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * API name: {@code throttle_period_in_millis}
		 */
		public Builder throttlePeriodInMillis(@Nullable JsonValue value) {
			this.throttlePeriodInMillis = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(@Nullable TransformContainer value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<TransformContainer.Builder, ObjectBuilder<TransformContainer>> fn) {
			return this.transform(fn.apply(new TransformContainer.Builder()).build());
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable Index value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(Function<Index.Builder, ObjectBuilder<Index>> fn) {
			return this.index(fn.apply(new Index.Builder()).build());
		}

		/**
		 * API name: {@code logging}
		 */
		public Builder logging(@Nullable Logging value) {
			this.logging = value;
			return this;
		}

		/**
		 * API name: {@code logging}
		 */
		public Builder logging(Function<Logging.Builder, ObjectBuilder<Logging>> fn) {
			return this.logging(fn.apply(new Logging.Builder()).build());
		}

		/**
		 * API name: {@code webhook}
		 */
		public Builder webhook(@Nullable ActionWebhook value) {
			this.webhook = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public Builder webhook(Function<ActionWebhook.Builder, ObjectBuilder<ActionWebhook>> fn) {
			return this.webhook(fn.apply(new ActionWebhook.Builder()).build());
		}

		/**
		 * Builds a {@link Action}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Action build() {

			return new Action(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Action
	 */
	public static final JsonpDeserializer<Action> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Action::setupActionDeserializer);

	protected static void setupActionDeserializer(DelegatingDeserializer<Action.Builder> op) {

		op.add(Builder::actionType, JsonpDeserializer.jsonValueDeserializer(), "action_type");
		op.add(Builder::condition, ConditionContainer.DESERIALIZER, "condition");
		op.add(Builder::foreach, JsonpDeserializer.stringDeserializer(), "foreach");
		op.add(Builder::maxIterations, JsonpDeserializer.numberDeserializer(), "max_iterations");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::throttlePeriod, JsonpDeserializer.jsonValueDeserializer(), "throttle_period");
		op.add(Builder::throttlePeriodInMillis, JsonpDeserializer.jsonValueDeserializer(), "throttle_period_in_millis");
		op.add(Builder::transform, TransformContainer.DESERIALIZER, "transform");
		op.add(Builder::index, Index.DESERIALIZER, "index");
		op.add(Builder::logging, Logging.DESERIALIZER, "logging");
		op.add(Builder::webhook, ActionWebhook.DESERIALIZER, "webhook");

	}

}
