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
import java.lang.Long;
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

// typedef: watcher._types.SlackAttachment

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.SlackAttachment">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlackAttachment implements JsonpSerializable {
	@Nullable
	private final String authorIcon;

	@Nullable
	private final String authorLink;

	private final String authorName;

	@Nullable
	private final String color;

	@Nullable
	private final String fallback;

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
	private final Long ts;

	// ---------------------------------------------------------------------------------------------

	private SlackAttachment(Builder builder) {

		this.authorIcon = builder.authorIcon;
		this.authorLink = builder.authorLink;
		this.authorName = ApiTypeHelper.requireNonNull(builder.authorName, this, "authorName");
		this.color = builder.color;
		this.fallback = builder.fallback;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.footer = builder.footer;
		this.footerIcon = builder.footerIcon;
		this.imageUrl = builder.imageUrl;
		this.pretext = builder.pretext;
		this.text = builder.text;
		this.thumbUrl = builder.thumbUrl;
		this.title = ApiTypeHelper.requireNonNull(builder.title, this, "title");
		this.titleLink = builder.titleLink;
		this.ts = builder.ts;

	}

	public static SlackAttachment of(Function<Builder, ObjectBuilder<SlackAttachment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code author_icon}
	 */
	@Nullable
	public final String authorIcon() {
		return this.authorIcon;
	}

	/**
	 * API name: {@code author_link}
	 */
	@Nullable
	public final String authorLink() {
		return this.authorLink;
	}

	/**
	 * Required - API name: {@code author_name}
	 */
	public final String authorName() {
		return this.authorName;
	}

	/**
	 * API name: {@code color}
	 */
	@Nullable
	public final String color() {
		return this.color;
	}

	/**
	 * API name: {@code fallback}
	 */
	@Nullable
	public final String fallback() {
		return this.fallback;
	}

	/**
	 * API name: {@code fields}
	 */
	public final List<SlackAttachmentField> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code footer}
	 */
	@Nullable
	public final String footer() {
		return this.footer;
	}

	/**
	 * API name: {@code footer_icon}
	 */
	@Nullable
	public final String footerIcon() {
		return this.footerIcon;
	}

	/**
	 * API name: {@code image_url}
	 */
	@Nullable
	public final String imageUrl() {
		return this.imageUrl;
	}

	/**
	 * API name: {@code pretext}
	 */
	@Nullable
	public final String pretext() {
		return this.pretext;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
		return this.text;
	}

	/**
	 * API name: {@code thumb_url}
	 */
	@Nullable
	public final String thumbUrl() {
		return this.thumbUrl;
	}

	/**
	 * Required - API name: {@code title}
	 */
	public final String title() {
		return this.title;
	}

	/**
	 * API name: {@code title_link}
	 */
	@Nullable
	public final String titleLink() {
		return this.titleLink;
	}

	/**
	 * API name: {@code ts}
	 */
	@Nullable
	public final Long ts() {
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
		if (ApiTypeHelper.isDefined(this.fields)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlackAttachment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlackAttachment> {
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
		private Long ts;

		/**
		 * API name: {@code author_icon}
		 */
		public final Builder authorIcon(@Nullable String value) {
			this.authorIcon = value;
			return this;
		}

		/**
		 * API name: {@code author_link}
		 */
		public final Builder authorLink(@Nullable String value) {
			this.authorLink = value;
			return this;
		}

		/**
		 * Required - API name: {@code author_name}
		 */
		public final Builder authorName(String value) {
			this.authorName = value;
			return this;
		}

		/**
		 * API name: {@code color}
		 */
		public final Builder color(@Nullable String value) {
			this.color = value;
			return this;
		}

		/**
		 * API name: {@code fallback}
		 */
		public final Builder fallback(@Nullable String value) {
			this.fallback = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<SlackAttachmentField> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(SlackAttachmentField value, SlackAttachmentField... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds a value to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(Function<SlackAttachmentField.Builder, ObjectBuilder<SlackAttachmentField>> fn) {
			return fields(fn.apply(new SlackAttachmentField.Builder()).build());
		}

		/**
		 * API name: {@code footer}
		 */
		public final Builder footer(@Nullable String value) {
			this.footer = value;
			return this;
		}

		/**
		 * API name: {@code footer_icon}
		 */
		public final Builder footerIcon(@Nullable String value) {
			this.footerIcon = value;
			return this;
		}

		/**
		 * API name: {@code image_url}
		 */
		public final Builder imageUrl(@Nullable String value) {
			this.imageUrl = value;
			return this;
		}

		/**
		 * API name: {@code pretext}
		 */
		public final Builder pretext(@Nullable String value) {
			this.pretext = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code thumb_url}
		 */
		public final Builder thumbUrl(@Nullable String value) {
			this.thumbUrl = value;
			return this;
		}

		/**
		 * Required - API name: {@code title}
		 */
		public final Builder title(String value) {
			this.title = value;
			return this;
		}

		/**
		 * API name: {@code title_link}
		 */
		public final Builder titleLink(@Nullable String value) {
			this.titleLink = value;
			return this;
		}

		/**
		 * API name: {@code ts}
		 */
		public final Builder ts(@Nullable Long value) {
			this.ts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlackAttachment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackAttachment build() {
			_checkSingleUse();

			return new SlackAttachment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackAttachment}
	 */
	public static final JsonpDeserializer<SlackAttachment> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlackAttachment::setupSlackAttachmentDeserializer);

	protected static void setupSlackAttachmentDeserializer(ObjectDeserializer<SlackAttachment.Builder> op) {

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
		op.add(Builder::ts, JsonpDeserializer.longDeserializer(), "ts");

	}

}
