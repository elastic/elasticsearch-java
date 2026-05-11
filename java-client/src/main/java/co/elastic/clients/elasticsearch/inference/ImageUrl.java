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

// typedef: inference._types.ImageUrl

/**
 *
 * @see <a href="../doc-files/api-spec.html#inference._types.ImageUrl">API
 *      specification</a>
 */
@JsonpDeserializable
public class ImageUrl implements JsonpSerializable {
	private final String url;

	@Nullable
	private final ImageUrlDetail detail;

	// ---------------------------------------------------------------------------------------------

	private ImageUrl(Builder builder) {

		this.url = ApiTypeHelper.requireNonNull(builder.url, this, "url");
		this.detail = builder.detail;

	}

	public static ImageUrl of(Function<Builder, ObjectBuilder<ImageUrl>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The base64 encoded image data as a data URI
	 * <p>
	 * API name: {@code url}
	 */
	public final String url() {
		return this.url;
	}

	/**
	 * Specifies the detail level of the image
	 * <p>
	 * API name: {@code detail}
	 */
	@Nullable
	public final ImageUrlDetail detail() {
		return this.detail;
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

		generator.writeKey("url");
		generator.write(this.url);

		if (this.detail != null) {
			generator.writeKey("detail");
			this.detail.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ImageUrl}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ImageUrl> {
		private String url;

		@Nullable
		private ImageUrlDetail detail;

		public Builder() {
		}
		private Builder(ImageUrl instance) {
			this.url = instance.url;
			this.detail = instance.detail;

		}
		/**
		 * Required - The base64 encoded image data as a data URI
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		/**
		 * Specifies the detail level of the image
		 * <p>
		 * API name: {@code detail}
		 */
		public final Builder detail(@Nullable ImageUrlDetail value) {
			this.detail = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ImageUrl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ImageUrl build() {
			_checkSingleUse();

			return new ImageUrl(this);
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
	 * Json deserializer for {@link ImageUrl}
	 */
	public static final JsonpDeserializer<ImageUrl> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ImageUrl::setupImageUrlDeserializer);

	protected static void setupImageUrlDeserializer(ObjectDeserializer<ImageUrl.Builder> op) {

		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::detail, ImageUrlDetail._DESERIALIZER, "detail");

	}

}
