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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.SlackAttachmentField
@JsonpDeserializable
public final class SlackAttachmentField implements JsonpSerializable {
	private final Boolean short_;

	private final String title;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	public SlackAttachmentField(Builder builder) {

		this.short_ = Objects.requireNonNull(builder.short_, "short");
		this.title = Objects.requireNonNull(builder.title, "title");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code short}
	 */
	public Boolean short_() {
		return this.short_;
	}

	/**
	 * API name: {@code title}
	 */
	public String title() {
		return this.title;
	}

	/**
	 * API name: {@code value}
	 */
	public String value() {
		return this.value;
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

		generator.writeKey("short");
		generator.write(this.short_);

		generator.writeKey("title");
		generator.write(this.title);

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlackAttachmentField}.
	 */
	public static class Builder implements ObjectBuilder<SlackAttachmentField> {
		private Boolean short_;

		private String title;

		private String value;

		/**
		 * API name: {@code short}
		 */
		public Builder short_(Boolean value) {
			this.short_ = value;
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
		 * API name: {@code value}
		 */
		public Builder value(String value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link SlackAttachmentField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackAttachmentField build() {

			return new SlackAttachmentField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackAttachmentField}
	 */
	public static final JsonpDeserializer<SlackAttachmentField> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SlackAttachmentField::setupSlackAttachmentFieldDeserializer, Builder::build);

	protected static void setupSlackAttachmentFieldDeserializer(
			DelegatingDeserializer<SlackAttachmentField.Builder> op) {

		op.add(Builder::short_, JsonpDeserializer.booleanDeserializer(), "short");
		op.add(Builder::title, JsonpDeserializer.stringDeserializer(), "title");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
