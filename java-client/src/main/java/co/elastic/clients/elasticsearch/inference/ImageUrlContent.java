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

// typedef: inference._types.ImageUrlContent

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ImageUrlContent">API
 *      specification</a>
 */
@JsonpDeserializable
public class ImageUrlContent implements ContentObjectVariant, JsonpSerializable {
	private final ImageUrl imageUrl;

	// ---------------------------------------------------------------------------------------------

	private ImageUrlContent(Builder builder) {

		this.imageUrl = ApiTypeHelper.requireNonNull(builder.imageUrl, this, "imageUrl");

	}

	public static ImageUrlContent of(Function<Builder, ObjectBuilder<ImageUrlContent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ContentObject variant kind.
	 */
	@Override
	public ContentObject.Kind _contentObjectKind() {
		return ContentObject.Kind.ImageUrl;
	}

	/**
	 * Required - The image content.
	 * <p>
	 * API name: {@code image_url}
	 */
	public final ImageUrl imageUrl() {
		return this.imageUrl;
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

		generator.write("type", "image_url");

		generator.writeKey("image_url");
		this.imageUrl.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ImageUrlContent}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ImageUrlContent> {
		private ImageUrl imageUrl;

		public Builder() {
		}
		private Builder(ImageUrlContent instance) {
			this.imageUrl = instance.imageUrl;

		}
		/**
		 * Required - The image content.
		 * <p>
		 * API name: {@code image_url}
		 */
		public final Builder imageUrl(ImageUrl value) {
			this.imageUrl = value;
			return this;
		}

		/**
		 * Required - The image content.
		 * <p>
		 * API name: {@code image_url}
		 */
		public final Builder imageUrl(Function<ImageUrl.Builder, ObjectBuilder<ImageUrl>> fn) {
			return this.imageUrl(fn.apply(new ImageUrl.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ImageUrlContent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ImageUrlContent build() {
			_checkSingleUse();

			return new ImageUrlContent(this);
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
	 * Json deserializer for {@link ImageUrlContent}
	 */
	public static final JsonpDeserializer<ImageUrlContent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ImageUrlContent::setupImageUrlContentDeserializer);

	protected static void setupImageUrlContentDeserializer(ObjectDeserializer<ImageUrlContent.Builder> op) {

		op.add(Builder::imageUrl, ImageUrl._DESERIALIZER, "image_url");

		op.ignore("type");
	}

}
