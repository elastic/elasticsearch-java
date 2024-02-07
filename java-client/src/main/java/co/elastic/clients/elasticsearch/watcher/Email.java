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
import java.lang.String;
import java.util.List;
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

// typedef: watcher._types.Email

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.Email">API
 *      specification</a>
 */
@JsonpDeserializable
public class Email implements JsonpSerializable {
	@Nullable
	private final String id;

	private final List<String> bcc;

	@Nullable
	private final EmailBody body;

	private final List<String> cc;

	@Nullable
	private final String from;

	@Nullable
	private final EmailPriority priority;

	private final List<String> replyTo;

	@Nullable
	private final DateTime sentDate;

	private final String subject;

	private final List<String> to;

	private final Map<String, EmailAttachment> attachments;

	// ---------------------------------------------------------------------------------------------

	protected Email(AbstractBuilder<?> builder) {

		this.id = builder.id;
		this.bcc = ApiTypeHelper.unmodifiable(builder.bcc);
		this.body = builder.body;
		this.cc = ApiTypeHelper.unmodifiable(builder.cc);
		this.from = builder.from;
		this.priority = builder.priority;
		this.replyTo = ApiTypeHelper.unmodifiable(builder.replyTo);
		this.sentDate = builder.sentDate;
		this.subject = ApiTypeHelper.requireNonNull(builder.subject, this, "subject");
		this.to = ApiTypeHelper.unmodifiableRequired(builder.to, this, "to");
		this.attachments = ApiTypeHelper.unmodifiable(builder.attachments);

	}

	public static Email emailOf(Function<Builder, ObjectBuilder<Email>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
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
	 * API name: {@code sent_date}
	 */
	@Nullable
	public final DateTime sentDate() {
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
	 * API name: {@code attachments}
	 */
	public final Map<String, EmailAttachment> attachments() {
		return this.attachments;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
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
		if (this.sentDate != null) {
			generator.writeKey("sent_date");
			this.sentDate.serialize(generator, mapper);
		}
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
		if (ApiTypeHelper.isDefined(this.attachments)) {
			generator.writeKey("attachments");
			generator.writeStartObject();
			for (Map.Entry<String, EmailAttachment> item0 : this.attachments.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Email}.
	 */

	public static class Builder extends Email.AbstractBuilder<Builder> implements ObjectBuilder<Email> {
		@Override
		protected Builder self() {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String id;

		@Nullable
		private List<String> bcc;

		@Nullable
		private EmailBody body;

		@Nullable
		private List<String> cc;

		@Nullable
		private String from;

		@Nullable
		private EmailPriority priority;

		@Nullable
		private List<String> replyTo;

		@Nullable
		private DateTime sentDate;

		private String subject;

		private List<String> to;

		@Nullable
		private Map<String, EmailAttachment> attachments;

		/**
		 * API name: {@code id}
		 */
		public final BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * API name: {@code bcc}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>bcc</code>.
		 */
		public final BuilderT bcc(List<String> list) {
			this.bcc = _listAddAll(this.bcc, list);
			return self();
		}

		/**
		 * API name: {@code bcc}
		 * <p>
		 * Adds one or more values to <code>bcc</code>.
		 */
		public final BuilderT bcc(String value, String... values) {
			this.bcc = _listAdd(this.bcc, value, values);
			return self();
		}

		/**
		 * API name: {@code body}
		 */
		public final BuilderT body(@Nullable EmailBody value) {
			this.body = value;
			return self();
		}

		/**
		 * API name: {@code body}
		 */
		public final BuilderT body(Function<EmailBody.Builder, ObjectBuilder<EmailBody>> fn) {
			return this.body(fn.apply(new EmailBody.Builder()).build());
		}

		/**
		 * API name: {@code cc}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cc</code>.
		 */
		public final BuilderT cc(List<String> list) {
			this.cc = _listAddAll(this.cc, list);
			return self();
		}

		/**
		 * API name: {@code cc}
		 * <p>
		 * Adds one or more values to <code>cc</code>.
		 */
		public final BuilderT cc(String value, String... values) {
			this.cc = _listAdd(this.cc, value, values);
			return self();
		}

		/**
		 * API name: {@code from}
		 */
		public final BuilderT from(@Nullable String value) {
			this.from = value;
			return self();
		}

		/**
		 * API name: {@code priority}
		 */
		public final BuilderT priority(@Nullable EmailPriority value) {
			this.priority = value;
			return self();
		}

		/**
		 * API name: {@code reply_to}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>replyTo</code>.
		 */
		public final BuilderT replyTo(List<String> list) {
			this.replyTo = _listAddAll(this.replyTo, list);
			return self();
		}

		/**
		 * API name: {@code reply_to}
		 * <p>
		 * Adds one or more values to <code>replyTo</code>.
		 */
		public final BuilderT replyTo(String value, String... values) {
			this.replyTo = _listAdd(this.replyTo, value, values);
			return self();
		}

		/**
		 * API name: {@code sent_date}
		 */
		public final BuilderT sentDate(@Nullable DateTime value) {
			this.sentDate = value;
			return self();
		}

		/**
		 * Required - API name: {@code subject}
		 */
		public final BuilderT subject(String value) {
			this.subject = value;
			return self();
		}

		/**
		 * Required - API name: {@code to}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>to</code>.
		 */
		public final BuilderT to(List<String> list) {
			this.to = _listAddAll(this.to, list);
			return self();
		}

		/**
		 * Required - API name: {@code to}
		 * <p>
		 * Adds one or more values to <code>to</code>.
		 */
		public final BuilderT to(String value, String... values) {
			this.to = _listAdd(this.to, value, values);
			return self();
		}

		/**
		 * API name: {@code attachments}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attachments</code>.
		 */
		public final BuilderT attachments(Map<String, EmailAttachment> map) {
			this.attachments = _mapPutAll(this.attachments, map);
			return self();
		}

		/**
		 * API name: {@code attachments}
		 * <p>
		 * Adds an entry to <code>attachments</code>.
		 */
		public final BuilderT attachments(String key, EmailAttachment value) {
			this.attachments = _mapPut(this.attachments, key, value);
			return self();
		}

		/**
		 * API name: {@code attachments}
		 * <p>
		 * Adds an entry to <code>attachments</code> using a builder lambda.
		 */
		public final BuilderT attachments(String key,
				Function<EmailAttachment.Builder, ObjectBuilder<EmailAttachment>> fn) {
			return attachments(key, fn.apply(new EmailAttachment.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Email}
	 */
	public static final JsonpDeserializer<Email> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Email::setupEmailDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupEmailDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::bcc, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bcc");
		op.add(AbstractBuilder::body, EmailBody._DESERIALIZER, "body");
		op.add(AbstractBuilder::cc, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "cc");
		op.add(AbstractBuilder::from, JsonpDeserializer.stringDeserializer(), "from");
		op.add(AbstractBuilder::priority, EmailPriority._DESERIALIZER, "priority");
		op.add(AbstractBuilder::replyTo, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"reply_to");
		op.add(AbstractBuilder::sentDate, DateTime._DESERIALIZER, "sent_date");
		op.add(AbstractBuilder::subject, JsonpDeserializer.stringDeserializer(), "subject");
		op.add(AbstractBuilder::to, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "to");
		op.add(AbstractBuilder::attachments, JsonpDeserializer.stringMapDeserializer(EmailAttachment._DESERIALIZER),
				"attachments");

	}

}
