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

import co.elastic.clients.elasticsearch._types.ErrorCause;
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

// typedef: watcher._types.ExecutionResultAction

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultAction">API
 *      specification</a>
 */
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

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultAction(Builder builder) {

		this.email = builder.email;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = builder.index;
		this.logging = builder.logging;
		this.pagerduty = builder.pagerduty;
		this.reason = builder.reason;
		this.slack = builder.slack;
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.webhook = builder.webhook;
		this.error = builder.error;

	}

	public static ExecutionResultAction of(Function<Builder, ObjectBuilder<ExecutionResultAction>> fn) {
		return fn.apply(new Builder()).build();
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
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecutionResultAction> {
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

		@Nullable
		private ErrorCause error;

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
		public final Builder email(Function<EmailResult.Builder, ObjectBuilder<EmailResult>> fn) {
			return this.email(fn.apply(new EmailResult.Builder()).build());
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
		public final Builder index(Function<IndexResult.Builder, ObjectBuilder<IndexResult>> fn) {
			return this.index(fn.apply(new IndexResult.Builder()).build());
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
		public final Builder logging(Function<LoggingResult.Builder, ObjectBuilder<LoggingResult>> fn) {
			return this.logging(fn.apply(new LoggingResult.Builder()).build());
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
		public final Builder pagerduty(Function<PagerDutyResult.Builder, ObjectBuilder<PagerDutyResult>> fn) {
			return this.pagerduty(fn.apply(new PagerDutyResult.Builder()).build());
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
		public final Builder slack(Function<SlackResult.Builder, ObjectBuilder<SlackResult>> fn) {
			return this.slack(fn.apply(new SlackResult.Builder()).build());
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
		public final Builder webhook(Function<WebhookResult.Builder, ObjectBuilder<WebhookResult>> fn) {
			return this.webhook(fn.apply(new WebhookResult.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
