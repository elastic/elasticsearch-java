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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.ContentObject

/**
 * An object style representation of a single portion of a conversation.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.ContentObject">API
 *      specification</a>
 */
@JsonpDeserializable
public class ContentObject implements JsonpSerializable {
	private final ContentType type;

	private final String text;

	private final ImageUrl imageUrl;

	private final FileContent file;

	// ---------------------------------------------------------------------------------------------

	private ContentObject(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.text = ApiTypeHelper.requireNonNull(builder.text, this, "text");
		this.imageUrl = ApiTypeHelper.requireNonNull(builder.imageUrl, this, "imageUrl");
		this.file = ApiTypeHelper.requireNonNull(builder.file, this, "file");

	}

	public static ContentObject of(Function<Builder, ObjectBuilder<ContentObject>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of content. Must be one of <code>text</code>,
	 * <code>image_url</code> or <code>file</code>. Not all services/models support
	 * content types other than &quot;text&quot;
	 * <p>
	 * API name: {@code type}
	 */
	public final ContentType type() {
		return this.type;
	}

	/**
	 * Required - The text content. Only applicable for the <code>text</code> type
	 * <p>
	 * API name: {@code text}
	 */
	public final String text() {
		return this.text;
	}

	/**
	 * Required - The image content. Only applicable for the <code>image_url</code>
	 * type
	 * <p>
	 * API name: {@code image_url}
	 */
	public final ImageUrl imageUrl() {
		return this.imageUrl;
	}

	/**
	 * Required - The file content. Only applicable for the <code>file</code> type
	 * <p>
	 * API name: {@code file}
	 */
	public final FileContent file() {
		return this.file;
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

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("text");
		generator.write(this.text);

		generator.writeKey("image_url");
		this.imageUrl.serialize(generator, mapper);

		generator.writeKey("file");
		this.file.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ContentObject}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ContentObject> {
		private ContentType type;

		private String text;

		private ImageUrl imageUrl;

		private FileContent file;

		public Builder() {
		}
		private Builder(ContentObject instance) {
			this.type = instance.type;
			this.text = instance.text;
			this.imageUrl = instance.imageUrl;
			this.file = instance.file;

		}
		/**
		 * Required - The type of content. Must be one of <code>text</code>,
		 * <code>image_url</code> or <code>file</code>. Not all services/models support
		 * content types other than &quot;text&quot;
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(ContentType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - The text content. Only applicable for the <code>text</code> type
		 * <p>
		 * API name: {@code text}
		 */
		public final Builder text(String value) {
			this.text = value;
			return this;
		}

		/**
		 * Required - The image content. Only applicable for the <code>image_url</code>
		 * type
		 * <p>
		 * API name: {@code image_url}
		 */
		public final Builder imageUrl(ImageUrl value) {
			this.imageUrl = value;
			return this;
		}

		/**
		 * Required - The image content. Only applicable for the <code>image_url</code>
		 * type
		 * <p>
		 * API name: {@code image_url}
		 */
		public final Builder imageUrl(Function<ImageUrl.Builder, ObjectBuilder<ImageUrl>> fn) {
			return this.imageUrl(fn.apply(new ImageUrl.Builder()).build());
		}

		/**
		 * Required - The file content. Only applicable for the <code>file</code> type
		 * <p>
		 * API name: {@code file}
		 */
		public final Builder file(FileContent value) {
			this.file = value;
			return this;
		}

		/**
		 * Required - The file content. Only applicable for the <code>file</code> type
		 * <p>
		 * API name: {@code file}
		 */
		public final Builder file(Function<FileContent.Builder, ObjectBuilder<FileContent>> fn) {
			return this.file(fn.apply(new FileContent.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ContentObject}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ContentObject build() {
			_checkSingleUse();

			return new ContentObject(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ContentObject}
	 */
	public static final JsonpDeserializer<ContentObject> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ContentObject::setupContentObjectDeserializer);

	protected static void setupContentObjectDeserializer(ObjectDeserializer<ContentObject.Builder> op) {

		op.add(Builder::type, ContentType._DESERIALIZER, "type");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::imageUrl, ImageUrl._DESERIALIZER, "image_url");
		op.add(Builder::file, FileContent._DESERIALIZER, "file");

	}

}
