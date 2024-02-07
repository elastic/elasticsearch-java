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
import java.lang.Boolean;
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

// typedef: watcher._types.SlackAttachmentField

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.SlackAttachmentField">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlackAttachmentField implements JsonpSerializable {
	private final boolean short_;

	private final String title;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private SlackAttachmentField(Builder builder) {

		this.short_ = ApiTypeHelper.requireNonNull(builder.short_, this, "short_");
		this.title = ApiTypeHelper.requireNonNull(builder.title, this, "title");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static SlackAttachmentField of(Function<Builder, ObjectBuilder<SlackAttachmentField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code short}
	 */
	public final boolean short_() {
		return this.short_;
	}

	/**
	 * Required - API name: {@code title}
	 */
	public final String title() {
		return this.title;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final String value() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlackAttachmentField}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SlackAttachmentField> {
		private Boolean short_;

		private String title;

		private String value;

		/**
		 * Required - API name: {@code short}
		 */
		public final Builder short_(boolean value) {
			this.short_ = value;
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
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlackAttachmentField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackAttachmentField build() {
			_checkSingleUse();

			return new SlackAttachmentField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackAttachmentField}
	 */
	public static final JsonpDeserializer<SlackAttachmentField> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SlackAttachmentField::setupSlackAttachmentFieldDeserializer);

	protected static void setupSlackAttachmentFieldDeserializer(ObjectDeserializer<SlackAttachmentField.Builder> op) {

		op.add(Builder::short_, JsonpDeserializer.booleanDeserializer(), "short");
		op.add(Builder::title, JsonpDeserializer.stringDeserializer(), "title");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
