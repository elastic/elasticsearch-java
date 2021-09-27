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

// typedef: watcher._types.SlackDynamicAttachment
@JsonpDeserializable
public final class SlackDynamicAttachment implements JsonpSerializable {
	private final SlackAttachment attachmentTemplate;

	private final String listPath;

	// ---------------------------------------------------------------------------------------------

	public SlackDynamicAttachment(Builder builder) {

		this.attachmentTemplate = Objects.requireNonNull(builder.attachmentTemplate, "attachment_template");
		this.listPath = Objects.requireNonNull(builder.listPath, "list_path");

	}

	/**
	 * API name: {@code attachment_template}
	 */
	public SlackAttachment attachmentTemplate() {
		return this.attachmentTemplate;
	}

	/**
	 * API name: {@code list_path}
	 */
	public String listPath() {
		return this.listPath;
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

		generator.writeKey("attachment_template");
		this.attachmentTemplate.serialize(generator, mapper);

		generator.writeKey("list_path");
		generator.write(this.listPath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlackDynamicAttachment}.
	 */
	public static class Builder implements ObjectBuilder<SlackDynamicAttachment> {
		private SlackAttachment attachmentTemplate;

		private String listPath;

		/**
		 * API name: {@code attachment_template}
		 */
		public Builder attachmentTemplate(SlackAttachment value) {
			this.attachmentTemplate = value;
			return this;
		}

		/**
		 * API name: {@code attachment_template}
		 */
		public Builder attachmentTemplate(Function<SlackAttachment.Builder, ObjectBuilder<SlackAttachment>> fn) {
			return this.attachmentTemplate(fn.apply(new SlackAttachment.Builder()).build());
		}

		/**
		 * API name: {@code list_path}
		 */
		public Builder listPath(String value) {
			this.listPath = value;
			return this;
		}

		/**
		 * Builds a {@link SlackDynamicAttachment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackDynamicAttachment build() {

			return new SlackDynamicAttachment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackDynamicAttachment}
	 */
	public static final JsonpDeserializer<SlackDynamicAttachment> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SlackDynamicAttachment::setupSlackDynamicAttachmentDeserializer, Builder::build);

	protected static void setupSlackDynamicAttachmentDeserializer(
			DelegatingDeserializer<SlackDynamicAttachment.Builder> op) {

		op.add(Builder::attachmentTemplate, SlackAttachment._DESERIALIZER, "attachment_template");
		op.add(Builder::listPath, JsonpDeserializer.stringDeserializer(), "list_path");

	}

}
