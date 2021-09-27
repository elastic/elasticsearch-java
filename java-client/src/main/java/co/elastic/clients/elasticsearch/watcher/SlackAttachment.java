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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.SlackAttachment
@JsonpDeserializable
public final class SlackAttachment implements JsonpSerializable {
	@Nullable
	private final String authorIcon;

	@Nullable
	private final String authorLink;

	private final String authorName;

	@Nullable
	private final String color;

	@Nullable
	private final String fallback;

	@Nullable
	private final List<SlackAttachmentField> fields;

	@Nullable
	private final String footer;

	@Nullable
	private final String footerIcon;

	@Nullable
	private final String imageUrl;

	@Nullable
	private final String pretext;

	@Nullable
	private final String text;

	@Nullable
	private final String thumbUrl;

	private final String title;

	@Nullable
	private final String titleLink;

	@Nullable
	private final String ts;

	// ---------------------------------------------------------------------------------------------

	public SlackAttachment(Builder builder) {

		this.authorIcon = builder.authorIcon;
		this.authorLink = builder.authorLink;
		this.authorName = Objects.requireNonNull(builder.authorName, "author_name");
		this.color = builder.color;
		this.fallback = builder.fallback;
		this.fields = builder.fields;
		this.footer = builder.footer;
		this.footerIcon = builder.footerIcon;
		this.imageUrl = builder.imageUrl;
		this.pretext = builder.pretext;
		this.text = builder.text;
		this.thumbUrl = builder.thumbUrl;
		this.title = Objects.requireNonNull(builder.title, "title");
		this.titleLink = builder.titleLink;
		this.ts = builder.ts;

	}

	/**
	 * API name: {@code author_icon}
	 */
	@Nullable
	public String authorIcon() {
		return this.authorIcon;
	}

	/**
	 * API name: {@code author_link}
	 */
	@Nullable
	public String authorLink() {
		return this.authorLink;
	}

	/**
	 * API name: {@code author_name}
	 */
	public String authorName() {
		return this.authorName;
	}

	/**
	 * API name: {@code color}
	 */
	@Nullable
	public String color() {
		return this.color;
	}

	/**
	 * API name: {@code fallback}
	 */
	@Nullable
	public String fallback() {
		return this.fallback;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<SlackAttachmentField> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code footer}
	 */
	@Nullable
	public String footer() {
		return this.footer;
	}

	/**
	 * API name: {@code footer_icon}
	 */
	@Nullable
	public String footerIcon() {
		return this.footerIcon;
	}

	/**
	 * API name: {@code image_url}
	 */
	@Nullable
	public String imageUrl() {
		return this.imageUrl;
	}

	/**
	 * API name: {@code pretext}
	 */
	@Nullable
	public String pretext() {
		return this.pretext;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public String text() {
		return this.text;
	}

	/**
	 * API name: {@code thumb_url}
	 */
	@Nullable
	public String thumbUrl() {
		return this.thumbUrl;
	}

	/**
	 * API name: {@code title}
	 */
	public String title() {
		return this.title;
	}

	/**
	 * API name: {@code title_link}
	 */
	@Nullable
	public String titleLink() {
		return this.titleLink;
	}

	/**
	 * API name: {@code ts}
	 */
	@Nullable
	public String ts() {
		return this.ts;
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

		if (this.authorIcon != null) {

			generator.writeKey("author_icon");
			generator.write(this.authorIcon);

		}
		if (this.authorLink != null) {

			generator.writeKey("author_link");
			generator.write(this.authorLink);

		}

		generator.writeKey("author_name");
		generator.write(this.authorName);

		if (this.color != null) {

			generator.writeKey("color");
			generator.write(this.color);

		}
		if (this.fallback != null) {

			generator.writeKey("fallback");
			generator.write(this.fallback);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (SlackAttachmentField item0 : this.fields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.footer != null) {

			generator.writeKey("footer");
			generator.write(this.footer);

		}
		if (this.footerIcon != null) {

			generator.writeKey("footer_icon");
			generator.write(this.footerIcon);

		}
		if (this.imageUrl != null) {

			generator.writeKey("image_url");
			generator.write(this.imageUrl);

		}
		if (this.pretext != null) {

			generator.writeKey("pretext");
			generator.write(this.pretext);

		}
		if (this.text != null) {

			generator.writeKey("text");
			generator.write(this.text);

		}
		if (this.thumbUrl != null) {

			generator.writeKey("thumb_url");
			generator.write(this.thumbUrl);

		}

		generator.writeKey("title");
		generator.write(this.title);

		if (this.titleLink != null) {

			generator.writeKey("title_link");
			generator.write(this.titleLink);

		}
		if (this.ts != null) {

			generator.writeKey("ts");
			generator.write(this.ts);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlackAttachment}.
	 */
	public static class Builder implements ObjectBuilder<SlackAttachment> {
		@Nullable
		private String authorIcon;

		@Nullable
		private String authorLink;

		private String authorName;

		@Nullable
		private String color;

		@Nullable
		private String fallback;

		@Nullable
		private List<SlackAttachmentField> fields;

		@Nullable
		private String footer;

		@Nullable
		private String footerIcon;

		@Nullable
		private String imageUrl;

		@Nullable
		private String pretext;

		@Nullable
		private String text;

		@Nullable
		private String thumbUrl;

		private String title;

		@Nullable
		private String titleLink;

		@Nullable
		private String ts;

		/**
		 * API name: {@code author_icon}
		 */
		public Builder authorIcon(@Nullable String value) {
			this.authorIcon = value;
			return this;
		}

		/**
		 * API name: {@code author_link}
		 */
		public Builder authorLink(@Nullable String value) {
			this.authorLink = value;
			return this;
		}

		/**
		 * API name: {@code author_name}
		 */
		public Builder authorName(String value) {
			this.authorName = value;
			return this;
		}

		/**
		 * API name: {@code color}
		 */
		public Builder color(@Nullable String value) {
			this.color = value;
			return this;
		}

		/**
		 * API name: {@code fallback}
		 */
		public Builder fallback(@Nullable String value) {
			this.fallback = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<SlackAttachmentField> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(SlackAttachmentField... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(SlackAttachmentField value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Set {@link #fields(List)} to a singleton list.
		 */
		public Builder fields(Function<SlackAttachmentField.Builder, ObjectBuilder<SlackAttachmentField>> fn) {
			return this.fields(fn.apply(new SlackAttachmentField.Builder()).build());
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(Function<SlackAttachmentField.Builder, ObjectBuilder<SlackAttachmentField>> fn) {
			return this.addFields(fn.apply(new SlackAttachmentField.Builder()).build());
		}

		/**
		 * API name: {@code footer}
		 */
		public Builder footer(@Nullable String value) {
			this.footer = value;
			return this;
		}

		/**
		 * API name: {@code footer_icon}
		 */
		public Builder footerIcon(@Nullable String value) {
			this.footerIcon = value;
			return this;
		}

		/**
		 * API name: {@code image_url}
		 */
		public Builder imageUrl(@Nullable String value) {
			this.imageUrl = value;
			return this;
		}

		/**
		 * API name: {@code pretext}
		 */
		public Builder pretext(@Nullable String value) {
			this.pretext = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code thumb_url}
		 */
		public Builder thumbUrl(@Nullable String value) {
			this.thumbUrl = value;
			return this;
		}

		/**
		 * API name: {@code title}
		 */
		public Builder title(String value) {
			this.title = value;
			return this;
		}

		/**
		 * API name: {@code title_link}
		 */
		public Builder titleLink(@Nullable String value) {
			this.titleLink = value;
			return this;
		}

		/**
		 * API name: {@code ts}
		 */
		public Builder ts(@Nullable String value) {
			this.ts = value;
			return this;
		}

		/**
		 * Builds a {@link SlackAttachment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackAttachment build() {

			return new SlackAttachment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackAttachment}
	 */
	public static final JsonpDeserializer<SlackAttachment> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlackAttachment::setupSlackAttachmentDeserializer, Builder::build);

	protected static void setupSlackAttachmentDeserializer(DelegatingDeserializer<SlackAttachment.Builder> op) {

		op.add(Builder::authorIcon, JsonpDeserializer.stringDeserializer(), "author_icon");
		op.add(Builder::authorLink, JsonpDeserializer.stringDeserializer(), "author_link");
		op.add(Builder::authorName, JsonpDeserializer.stringDeserializer(), "author_name");
		op.add(Builder::color, JsonpDeserializer.stringDeserializer(), "color");
		op.add(Builder::fallback, JsonpDeserializer.stringDeserializer(), "fallback");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(SlackAttachmentField._DESERIALIZER), "fields");
		op.add(Builder::footer, JsonpDeserializer.stringDeserializer(), "footer");
		op.add(Builder::footerIcon, JsonpDeserializer.stringDeserializer(), "footer_icon");
		op.add(Builder::imageUrl, JsonpDeserializer.stringDeserializer(), "image_url");
		op.add(Builder::pretext, JsonpDeserializer.stringDeserializer(), "pretext");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::thumbUrl, JsonpDeserializer.stringDeserializer(), "thumb_url");
		op.add(Builder::title, JsonpDeserializer.stringDeserializer(), "title");
		op.add(Builder::titleLink, JsonpDeserializer.stringDeserializer(), "title_link");
		op.add(Builder::ts, JsonpDeserializer.stringDeserializer(), "ts");

	}

}
