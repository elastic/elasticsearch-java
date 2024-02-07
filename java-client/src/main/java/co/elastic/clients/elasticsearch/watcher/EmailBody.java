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

// typedef: watcher._types.EmailBody

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.EmailBody">API
 *      specification</a>
 */
@JsonpDeserializable
public class EmailBody implements JsonpSerializable {
	@Nullable
	private final String html;

	@Nullable
	private final String text;

	// ---------------------------------------------------------------------------------------------

	private EmailBody(Builder builder) {

		this.html = builder.html;
		this.text = builder.text;

	}

	public static EmailBody of(Function<Builder, ObjectBuilder<EmailBody>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code html}
	 */
	@Nullable
	public final String html() {
		return this.html;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public final String text() {
		return this.text;
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

		if (this.html != null) {
			generator.writeKey("html");
			generator.write(this.html);

		}
		if (this.text != null) {
			generator.writeKey("text");
			generator.write(this.text);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EmailBody}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EmailBody> {
		@Nullable
		private String html;

		@Nullable
		private String text;

		/**
		 * API name: {@code html}
		 */
		public final Builder html(@Nullable String value) {
			this.html = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public final Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EmailBody}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EmailBody build() {
			_checkSingleUse();

			return new EmailBody(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EmailBody}
	 */
	public static final JsonpDeserializer<EmailBody> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EmailBody::setupEmailBodyDeserializer);

	protected static void setupEmailBodyDeserializer(ObjectDeserializer<EmailBody.Builder> op) {

		op.add(Builder::html, JsonpDeserializer.stringDeserializer(), "html");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

}
