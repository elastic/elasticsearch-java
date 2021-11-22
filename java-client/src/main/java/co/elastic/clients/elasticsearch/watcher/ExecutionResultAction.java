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
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionResultAction
@JsonpDeserializable
public class ExecutionResultAction implements JsonpSerializable {
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

	private ExecutionResultAction(Builder builder) {

		this.email = builder.email;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = builder.index;
		this.logging = builder.logging;
		this.pagerduty = builder.pagerduty;
		this.reason = builder.reason;
		this.slack = builder.slack;
		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.webhook = builder.webhook;

	}

	public static ExecutionResultAction of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public final EmailResult email() {
		return this.email;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final IndexResult index() {
		return this.index;
	}

	/**
	 * API name: {@code logging}
	 */
	@Nullable
	public final LoggingResult logging() {
		return this.logging;
	}

	/**
	 * API name: {@code pagerduty}
	 */
	@Nullable
	public final PagerDutyResult pagerduty() {
		return this.pagerduty;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code slack}
	 */
	@Nullable
	public final SlackResult slack() {
		return this.slack;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final ActionType type() {
		return this.type;
	}

	/**
	 * API name: {@code webhook}
	 */
	@Nullable
	public final WebhookResult webhook() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecutionResultAction> {
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
		public final Builder email(@Nullable EmailResult value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code email}
		 */
		public final Builder email(Consumer<EmailResult.Builder> fn) {
			EmailResult.Builder builder = new EmailResult.Builder();
			fn.accept(builder);
			return this.email(builder.build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable IndexResult value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(Consumer<IndexResult.Builder> fn) {
			IndexResult.Builder builder = new IndexResult.Builder();
			fn.accept(builder);
			return this.index(builder.build());
		}

		/**
		 * API name: {@code logging}
		 */
		public final Builder logging(@Nullable LoggingResult value) {
			this.logging = value;
			return this;
		}

		/**
		 * API name: {@code logging}
		 */
		public final Builder logging(Consumer<LoggingResult.Builder> fn) {
			LoggingResult.Builder builder = new LoggingResult.Builder();
			fn.accept(builder);
			return this.logging(builder.build());
		}

		/**
		 * API name: {@code pagerduty}
		 */
		public final Builder pagerduty(@Nullable PagerDutyResult value) {
			this.pagerduty = value;
			return this;
		}

		/**
		 * API name: {@code pagerduty}
		 */
		public final Builder pagerduty(Consumer<PagerDutyResult.Builder> fn) {
			PagerDutyResult.Builder builder = new PagerDutyResult.Builder();
			fn.accept(builder);
			return this.pagerduty(builder.build());
		}

		/**
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code slack}
		 */
		public final Builder slack(@Nullable SlackResult value) {
			this.slack = value;
			return this;
		}

		/**
		 * API name: {@code slack}
		 */
		public final Builder slack(Consumer<SlackResult.Builder> fn) {
			SlackResult.Builder builder = new SlackResult.Builder();
			fn.accept(builder);
			return this.slack(builder.build());
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(ActionType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public final Builder webhook(@Nullable WebhookResult value) {
			this.webhook = value;
			return this;
		}

		/**
		 * API name: {@code webhook}
		 */
		public final Builder webhook(Consumer<WebhookResult.Builder> fn) {
			WebhookResult.Builder builder = new WebhookResult.Builder();
			fn.accept(builder);
			return this.webhook(builder.build());
		}

		/**
		 * Builds a {@link ExecutionResultAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultAction build() {
			_checkSingleUse();

			return new ExecutionResultAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResultAction}
	 */
	public static final JsonpDeserializer<ExecutionResultAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultAction::setupExecutionResultActionDeserializer);

	protected static void setupExecutionResultActionDeserializer(ObjectDeserializer<ExecutionResultAction.Builder> op) {

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
