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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultAction
@JsonpDeserializable
public final class ExecutionResultAction implements JsonpSerializable {
	@Nullable
	private final EmailResult email;

	private final String id;

	@Nullable
	private final IndexResult index;

	@Nullable
	private final LoggingResult logging;

	@Nullable
	private final PagerDutyResult pagerduty;

	@Nullable
	private final String reason;

	@Nullable
	private final SlackResult slack;

	private final ActionStatusOptions status;

	private final ActionType type;

	@Nullable
	private final WebhookResult webhook;

	// ---------------------------------------------------------------------------------------------

	public ExecutionResultAction(Builder builder) {

		this.email = builder.email;
		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = builder.index;
		this.logging = builder.logging;
		this.pagerduty = builder.pagerduty;
		this.reason = builder.reason;
		this.slack = builder.slack;
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.webhook = builder.webhook;

	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public EmailResult email() {
		return this.email;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public IndexResult index() {
		return this.index;
	}

	/**
	 * API name: {@code logging}
	 */
	@Nullable
	public LoggingResult logging() {
		return this.logging;
	}

	/**
	 * API name: {@code pagerduty}
	 */
	@Nullable
	public PagerDutyResult pagerduty() {
		return this.pagerduty;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code slack}
	 */
	@Nullable
	public SlackResult slack() {
		return this.slack;
	}

	/**
	 * API name: {@code status}
	 */
	public ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public ActionType type() {
		return this.type;
	}

	/**
	 * API name: {@code webhook}
	 */
	@Nullable
	public WebhookResult webhook() {
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

		if (this.email != null) {

			generator.writeKey("email");
			this.email.serialize(generator, mapper);

		}

		generator.writeKey("id");
		generator.write(this.id);

		if (this.index != null) {

			generator.writeKey("index");
			this.index.serialize(generator, mapper);

		}
		if (this.logging != null) {

			generator.writeKey("logging");
			this.logging.serialize(generator, mapper);

		}
		if (this.pagerduty != null) {

			generator.writeKey("pagerduty");
			this.pagerduty.serialize(generator, mapper);

		}
		if (this.reason != null) {

			generator.writeKey("reason");
			generator.write(this.reason);

		}
		if (this.slack != null) {

			generator.writeKey("slack");
			this.slack.serialize(generator, mapper);

		}

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.webhook != null) {

			generator.writeKey("webhook");
			this.webhook.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultAction}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionResultAction> {
		@Nullable
		private EmailResult email;

		private String id;

		@Nullable
		private IndexResult index;

		@Nullable
		private LoggingResult logging;

		@Nullable
		private PagerDutyResult pagerduty;

		@Nullable
		private String reason;

		@Nullable
		private SlackResult slack;

		private ActionStatusOptions status;

		private ActionType type;

		@Nullable
		private WebhookResult webhook;

		/**
		 * API name: {@code email}
		 */
		public Builder email(@Nullable EmailResult value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code email}
		 */
		public Builder email(Function<EmailResult.Builder, ObjectBuilder<EmailResult>> fn) {
			return this.email(fn.apply(new EmailResult.Builder()).build());
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable IndexResult value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(Function<IndexResult.Builder, ObjectBuilder<IndexResult>> fn) {
			return this.index(fn.apply(new IndexResult.Builder()).build());
		}

		/**
		 * API name: {@code logging}
		 */
		public Builder logging(@Nullable LoggingResult value) {
			this.logging = value;
			return this;
		}

		/**
		 * API name: {@code logging}
		 */
		public Builder logging(Function<LoggingResult.Builder, ObjectBuilder<LoggingResult>> fn) {
			return this.logging(fn.apply(new LoggingResult.Builder()).build());
		}

		/**
		 * API name: {@code pagerduty}
		 */
		public Builder pagerduty(@Nullable PagerDutyResult value) {
			this.pagerduty = value;
			return this;
		}

		/**
		 * API name: {@code pagerduty}
		 */
		public Builder pagerduty(Function<PagerDutyResult.Builder, ObjectBuilder<PagerDutyResult>> fn) {
			return this.pagerduty(fn.apply(new PagerDutyResult.Builder()).build());
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code slack}
		 */
		public Builder slack(@Nullable SlackResult value) {
			this.slack = value;
			return this;
		}

		/**
		 * API name: {@code slack}
		 */
		public Builder slack(Function<SlackResult.Builder, ObjectBuilder<SlackResult>> fn) {
			return this.slack(fn.apply(new SlackResult.Builder()).build());
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(ActionType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public Builder webhook(@Nullable WebhookResult value) {
			this.webhook = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public Builder webhook(Function<WebhookResult.Builder, ObjectBuilder<WebhookResult>> fn) {
			return this.webhook(fn.apply(new WebhookResult.Builder()).build());
		}

		/**
		 * Builds a {@link ExecutionResultAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultAction build() {

			return new ExecutionResultAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResultAction}
	 */
	public static final JsonpDeserializer<ExecutionResultAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultAction::setupExecutionResultActionDeserializer, Builder::build);

	protected static void setupExecutionResultActionDeserializer(
			DelegatingDeserializer<ExecutionResultAction.Builder> op) {

		op.add(Builder::email, EmailResult._DESERIALIZER, "email");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, IndexResult._DESERIALIZER, "index");
		op.add(Builder::logging, LoggingResult._DESERIALIZER, "logging");
		op.add(Builder::pagerduty, PagerDutyResult._DESERIALIZER, "pagerduty");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::slack, SlackResult._DESERIALIZER, "slack");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::type, ActionType._DESERIALIZER, "type");
		op.add(Builder::webhook, WebhookResult._DESERIALIZER, "webhook");

	}

}
