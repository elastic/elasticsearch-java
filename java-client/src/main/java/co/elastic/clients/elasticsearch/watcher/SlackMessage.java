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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
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

// typedef: watcher._types.SlackMessage

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.SlackMessage">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlackMessage implements JsonpSerializable {
	private final List<SlackAttachment> attachments;

	@Nullable
	private final SlackDynamicAttachment dynamicAttachments;

	private final String from;

	@Nullable
	private final String icon;

	private final String text;

	private final List<String> to;

	// ---------------------------------------------------------------------------------------------

	private SlackMessage(Builder builder) {

		this.attachments = ApiTypeHelper.unmodifiableRequired(builder.attachments, this, "attachments");
		this.dynamicAttachments = builder.dynamicAttachments;
		this.from = ApiTypeHelper.requireNonNull(builder.from, this, "from");
		this.icon = builder.icon;
		this.text = ApiTypeHelper.requireNonNull(builder.text, this, "text");
		this.to = ApiTypeHelper.unmodifiableRequired(builder.to, this, "to");

	}

	public static SlackMessage of(Function<Builder, ObjectBuilder<SlackMessage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code attachments}
	 */
	public final List<SlackAttachment> attachments() {
		return this.attachments;
	}

	/**
	 * API name: {@code dynamic_attachments}
	 */
	@Nullable
	public final SlackDynamicAttachment dynamicAttachments() {
		return this.dynamicAttachments;
	}

	/**
	 * Required - API name: {@code from}
	 */
	public final String from() {
		return this.from;
	}

	/**
	 * API name: {@code icon}
	 */
	@Nullable
	public final String icon() {
		return this.icon;
	}

	/**
	 * Required - API name: {@code text}
	 */
	public final String text() {
		return this.text;
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

		if (ApiTypeHelper.isDefined(this.attachments)) {
			generator.writeKey("attachments");
			generator.writeStartArray();
			for (SlackAttachment item0 : this.attachments) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.dynamicAttachments != null) {
			generator.writeKey("dynamic_attachments");
			this.dynamicAttachments.serialize(generator, mapper);

		}
		generator.writeKey("from");
		generator.write(this.from);

		if (this.icon != null) {
			generator.writeKey("icon");
			generator.write(this.icon);

		}
		generator.writeKey("text");
		generator.write(this.text);

		if (ApiTypeHelper.isDefined(this.to)) {
			generator.writeKey("to");
			generator.writeStartArray();
			for (String item0 : this.to) {
				generator.write(item0);

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
	 * Builder for {@link SlackMessage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlackMessage> {
		private List<SlackAttachment> attachments;

		@Nullable
		private SlackDynamicAttachment dynamicAttachments;

		private String from;

		@Nullable
		private String icon;

		private String text;

		private List<String> to;

		/**
		 * Required - API name: {@code attachments}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>attachments</code>.
		 */
		public final Builder attachments(List<SlackAttachment> list) {
			this.attachments = _listAddAll(this.attachments, list);
			return this;
		}

		/**
		 * Required - API name: {@code attachments}
		 * <p>
		 * Adds one or more values to <code>attachments</code>.
		 */
		public final Builder attachments(SlackAttachment value, SlackAttachment... values) {
			this.attachments = _listAdd(this.attachments, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code attachments}
		 * <p>
		 * Adds a value to <code>attachments</code> using a builder lambda.
		 */
		public final Builder attachments(Function<SlackAttachment.Builder, ObjectBuilder<SlackAttachment>> fn) {
			return attachments(fn.apply(new SlackAttachment.Builder()).build());
		}

		/**
		 * API name: {@code dynamic_attachments}
		 */
		public final Builder dynamicAttachments(@Nullable SlackDynamicAttachment value) {
			this.dynamicAttachments = value;
			return this;
		}

		/**
		 * API name: {@code dynamic_attachments}
		 */
		public final Builder dynamicAttachments(
				Function<SlackDynamicAttachment.Builder, ObjectBuilder<SlackDynamicAttachment>> fn) {
			return this.dynamicAttachments(fn.apply(new SlackDynamicAttachment.Builder()).build());
		}

		/**
		 * Required - API name: {@code from}
		 */
		public final Builder from(String value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code icon}
		 */
		public final Builder icon(@Nullable String value) {
			this.icon = value;
			return this;
		}

		/**
		 * Required - API name: {@code text}
		 */
		public final Builder text(String value) {
			this.text = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlackMessage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackMessage build() {
			_checkSingleUse();

			return new SlackMessage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackMessage}
	 */
	public static final JsonpDeserializer<SlackMessage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlackMessage::setupSlackMessageDeserializer);

	protected static void setupSlackMessageDeserializer(ObjectDeserializer<SlackMessage.Builder> op) {

		op.add(Builder::attachments, JsonpDeserializer.arrayDeserializer(SlackAttachment._DESERIALIZER), "attachments");
		op.add(Builder::dynamicAttachments, SlackDynamicAttachment._DESERIALIZER, "dynamic_attachments");
		op.add(Builder::from, JsonpDeserializer.stringDeserializer(), "from");
		op.add(Builder::icon, JsonpDeserializer.stringDeserializer(), "icon");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::to, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "to");

	}

}
