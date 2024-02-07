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

// typedef: watcher._types.HttpEmailAttachment

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.HttpEmailAttachment">API
 *      specification</a>
 */
@JsonpDeserializable
public class HttpEmailAttachment implements EmailAttachmentVariant, JsonpSerializable {
	@Nullable
	private final String contentType;

	@Nullable
	private final Boolean inline;

	@Nullable
	private final HttpInputRequestDefinition request;

	// ---------------------------------------------------------------------------------------------

	private HttpEmailAttachment(Builder builder) {

		this.contentType = builder.contentType;
		this.inline = builder.inline;
		this.request = builder.request;

	}

	public static HttpEmailAttachment of(Function<Builder, ObjectBuilder<HttpEmailAttachment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * EmailAttachment variant kind.
	 */
	@Override
	public EmailAttachment.Kind _emailAttachmentKind() {
		return EmailAttachment.Kind.Http;
	}

	/**
	 * API name: {@code content_type}
	 */
	@Nullable
	public final String contentType() {
		return this.contentType;
	}

	/**
	 * API name: {@code inline}
	 */
	@Nullable
	public final Boolean inline() {
		return this.inline;
	}

	/**
	 * API name: {@code request}
	 */
	@Nullable
	public final HttpInputRequestDefinition request() {
		return this.request;
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

		if (this.contentType != null) {
			generator.writeKey("content_type");
			generator.write(this.contentType);

		}
		if (this.inline != null) {
			generator.writeKey("inline");
			generator.write(this.inline);

		}
		if (this.request != null) {
			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpEmailAttachment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<HttpEmailAttachment> {
		@Nullable
		private String contentType;

		@Nullable
		private Boolean inline;

		@Nullable
		private HttpInputRequestDefinition request;

		/**
		 * API name: {@code content_type}
		 */
		public final Builder contentType(@Nullable String value) {
			this.contentType = value;
			return this;
		}

		/**
		 * API name: {@code inline}
		 */
		public final Builder inline(@Nullable Boolean value) {
			this.inline = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable HttpInputRequestDefinition value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(
				Function<HttpInputRequestDefinition.Builder, ObjectBuilder<HttpInputRequestDefinition>> fn) {
			return this.request(fn.apply(new HttpInputRequestDefinition.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HttpEmailAttachment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpEmailAttachment build() {
			_checkSingleUse();

			return new HttpEmailAttachment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpEmailAttachment}
	 */
	public static final JsonpDeserializer<HttpEmailAttachment> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HttpEmailAttachment::setupHttpEmailAttachmentDeserializer);

	protected static void setupHttpEmailAttachmentDeserializer(ObjectDeserializer<HttpEmailAttachment.Builder> op) {

		op.add(Builder::contentType, JsonpDeserializer.stringDeserializer(), "content_type");
		op.add(Builder::inline, JsonpDeserializer.booleanDeserializer(), "inline");
		op.add(Builder::request, HttpInputRequestDefinition._DESERIALIZER, "request");

	}

}
