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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.SlackMessage
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

		this.attachments = ModelTypeHelper.unmodifiableRequired(builder.attachments, this, "attachments");
		this.dynamicAttachments = builder.dynamicAttachments;
		this.from = ModelTypeHelper.requireNonNull(builder.from, this, "from");
		this.icon = builder.icon;
		this.text = ModelTypeHelper.requireNonNull(builder.text, this, "text");
		this.to = ModelTypeHelper.unmodifiableRequired(builder.to, this, "to");

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

		if (ModelTypeHelper.isDefined(this.attachments)) {
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

		if (ModelTypeHelper.isDefined(this.to)) {
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
	 * Builder for {@link SlackMessage}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SlackMessage> {
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
		 */
		public final Builder attachments(List<SlackAttachment> value) {
			this.attachments = value;
			return this;
		}

		/**
		 * Required - API name: {@code attachments}
		 */
		public final Builder attachments(SlackAttachment... value) {
			this.attachments = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code attachments}
		 */
		@SafeVarargs
		public final Builder attachments(Function<SlackAttachment.Builder, ObjectBuilder<SlackAttachment>>... fns) {
			this.attachments = new ArrayList<>(fns.length);
			for (Function<SlackAttachment.Builder, ObjectBuilder<SlackAttachment>> fn : fns) {
				this.attachments.add(fn.apply(new SlackAttachment.Builder()).build());
			}
			return this;
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
		 */
		public final Builder to(List<String> value) {
			this.to = value;
			return this;
		}

		/**
		 * Required - API name: {@code to}
		 */
		public final Builder to(String... value) {
			this.to = Arrays.asList(value);
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
			SlackMessage::setupSlackMessageDeserializer, Builder::build);

	protected static void setupSlackMessageDeserializer(DelegatingDeserializer<SlackMessage.Builder> op) {

		op.add(Builder::attachments, JsonpDeserializer.arrayDeserializer(SlackAttachment._DESERIALIZER), "attachments");
		op.add(Builder::dynamicAttachments, SlackDynamicAttachment._DESERIALIZER, "dynamic_attachments");
		op.add(Builder::from, JsonpDeserializer.stringDeserializer(), "from");
		op.add(Builder::icon, JsonpDeserializer.stringDeserializer(), "icon");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::to, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "to");

	}

}
