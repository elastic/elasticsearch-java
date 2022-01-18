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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.Email

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.Email">API
 *      specification</a>
 */
@JsonpDeserializable
public class Email implements JsonpSerializable {
	private final List<String> bcc;

	@Nullable
	private final EmailBody body;

	private final List<String> cc;

	@Nullable
	private final String from;

	private final String id;

	@Nullable
	private final EmailPriority priority;

	private final List<String> replyTo;

	private final String sentDate;

	private final String subject;

	private final List<String> to;

	// ---------------------------------------------------------------------------------------------

	private Email(Builder builder) {

		this.bcc = ApiTypeHelper.unmodifiable(builder.bcc);
		this.body = builder.body;
		this.cc = ApiTypeHelper.unmodifiable(builder.cc);
		this.from = builder.from;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.priority = builder.priority;
		this.replyTo = ApiTypeHelper.unmodifiable(builder.replyTo);
		this.sentDate = ApiTypeHelper.requireNonNull(builder.sentDate, this, "sentDate");
		this.subject = ApiTypeHelper.requireNonNull(builder.subject, this, "subject");
		this.to = ApiTypeHelper.unmodifiableRequired(builder.to, this, "to");

	}

	public static Email of(Function<Builder, ObjectBuilder<Email>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code bcc}
	 */
	public final List<String> bcc() {
		return this.bcc;
	}

	/**
	 * API name: {@code body}
	 */
	@Nullable
	public final EmailBody body() {
		return this.body;
	}

	/**
	 * API name: {@code cc}
	 */
	public final List<String> cc() {
		return this.cc;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final String from() {
		return this.from;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public final EmailPriority priority() {
		return this.priority;
	}

	/**
	 * API name: {@code reply_to}
	 */
	public final List<String> replyTo() {
		return this.replyTo;
	}

	/**
	 * Required - API name: {@code sent_date}
	 */
	public final String sentDate() {
		return this.sentDate;
	}

	/**
	 * Required - API name: {@code subject}
	 */
	public final String subject() {
		return this.subject;
	}

	/**
	 * Required - API name: {@code to}
	 */
	public final List<String> to() {
		return this.to;
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

		if (ApiTypeHelper.isDefined(this.bcc)) {
			generator.writeKey("bcc");
			generator.writeStartArray();
			for (String item0 : this.bcc) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.body != null) {
			generator.writeKey("body");
			this.body.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.cc)) {
			generator.writeKey("cc");
			generator.writeStartArray();
			for (String item0 : this.cc) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		generator.writeKey("id");
		generator.write(this.id);

		if (this.priority != null) {
			generator.writeKey("priority");
			this.priority.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.replyTo)) {
			generator.writeKey("reply_to");
			generator.writeStartArray();
			for (String item0 : this.replyTo) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("sent_date");
		generator.write(this.sentDate);

		generator.writeKey("subject");
		generator.write(this.subject);

		if (ApiTypeHelper.isDefined(this.to)) {
			generator.writeKey("to");
			generator.writeStartArray();
			for (String item0 : this.to) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Email}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Email> {
		@Nullable
		private List<String> bcc;

		@Nullable
		private EmailBody body;

		@Nullable
		private List<String> cc;

		@Nullable
		private String from;

		private String id;

		@Nullable
		private EmailPriority priority;

		@Nullable
		private List<String> replyTo;

		private String sentDate;

		private String subject;

		private List<String> to;

		/**
		 * API name: {@code bcc}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>bcc</code>.
		 */
		public final Builder bcc(List<String> list) {
			this.bcc = _listAddAll(this.bcc, list);
			return this;
		}

		/**
		 * API name: {@code bcc}
		 * <p>
		 * Adds one or more values to <code>bcc</code>.
		 */
		public final Builder bcc(String value, String... values) {
			this.bcc = _listAdd(this.bcc, value, values);
			return this;
		}

		/**
		 * API name: {@code body}
		 */
		public final Builder body(@Nullable EmailBody value) {
			this.body = value;
			return this;
		}

		/**
		 * API name: {@code body}
		 */
		public final Builder body(Function<EmailBody.Builder, ObjectBuilder<EmailBody>> fn) {
			return this.body(fn.apply(new EmailBody.Builder()).build());
		}

		/**
		 * API name: {@code cc}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cc</code>.
		 */
		public final Builder cc(List<String> list) {
			this.cc = _listAddAll(this.cc, list);
			return this;
		}

		/**
		 * API name: {@code cc}
		 * <p>
		 * Adds one or more values to <code>cc</code>.
		 */
		public final Builder cc(String value, String... values) {
			this.cc = _listAdd(this.cc, value, values);
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable String value) {
			this.from = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable EmailPriority value) {
			this.priority = value;
			return this;
		}

		/**
		 * API name: {@code reply_to}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>replyTo</code>.
		 */
		public final Builder replyTo(List<String> list) {
			this.replyTo = _listAddAll(this.replyTo, list);
			return this;
		}

		/**
		 * API name: {@code reply_to}
		 * <p>
		 * Adds one or more values to <code>replyTo</code>.
		 */
		public final Builder replyTo(String value, String... values) {
			this.replyTo = _listAdd(this.replyTo, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code sent_date}
		 */
		public final Builder sentDate(String value) {
			this.sentDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code subject}
		 */
		public final Builder subject(String value) {
			this.subject = value;
			return this;
		}

		/**
		 * Required - API name: {@code to}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>to</code>.
		 */
		public final Builder to(List<String> list) {
			this.to = _listAddAll(this.to, list);
			return this;
		}

		/**
		 * Required - API name: {@code to}
		 * <p>
		 * Adds one or more values to <code>to</code>.
		 */
		public final Builder to(String value, String... values) {
			this.to = _listAdd(this.to, value, values);
			return this;
		}

		/**
		 * Builds a {@link Email}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Email build() {
			_checkSingleUse();

			return new Email(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Email}
	 */
	public static final JsonpDeserializer<Email> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Email::setupEmailDeserializer);

	protected static void setupEmailDeserializer(ObjectDeserializer<Email.Builder> op) {

		op.add(Builder::bcc, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "bcc");
		op.add(Builder::body, EmailBody._DESERIALIZER, "body");
		op.add(Builder::cc, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "cc");
		op.add(Builder::from, JsonpDeserializer.stringDeserializer(), "from");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::priority, EmailPriority._DESERIALIZER, "priority");
		op.add(Builder::replyTo, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reply_to");
		op.add(Builder::sentDate, JsonpDeserializer.stringDeserializer(), "sent_date");
		op.add(Builder::subject, JsonpDeserializer.stringDeserializer(), "subject");
		op.add(Builder::to, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "to");

	}

}
