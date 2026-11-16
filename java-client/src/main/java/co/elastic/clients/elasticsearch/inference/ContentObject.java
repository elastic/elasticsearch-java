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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
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

// typedef: inference._types.ContentObject

/**
 * One part of a chat message. The <code>type</code> field selects which
 * property is present. Not all services and models support content types other
 * than <code>text</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.ContentObject">API
 *      specification</a>
 */
@JsonpDeserializable
public class ContentObject implements TaggedUnion<ContentObject.Kind, ContentObjectVariant>, JsonpSerializable {

	/**
	 * {@link ContentObject} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#inference._types.ContentObject">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		File("file"),

		ImageUrl("image_url"),

		Text("text"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final ContentObjectVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final ContentObjectVariant _get() {
		return _value;
	}

	public ContentObject(ContentObjectVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._contentObjectKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private ContentObject(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ContentObject of(Function<Builder, ObjectBuilder<ContentObject>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code file}?
	 */
	public boolean isFile() {
		return _kind == Kind.File;
	}

	/**
	 * Get the {@code file} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code file} kind.
	 */
	public FileContentPart file() {
		return TaggedUnionUtils.get(this, Kind.File);
	}

	/**
	 * Is this variant instance of kind {@code image_url}?
	 */
	public boolean isImageUrl() {
		return _kind == Kind.ImageUrl;
	}

	/**
	 * Get the {@code image_url} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code image_url} kind.
	 */
	public ImageUrlContent imageUrl() {
		return TaggedUnionUtils.get(this, Kind.ImageUrl);
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean isText() {
		return _kind == Kind.Text;
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public TextContent text() {
		return TaggedUnionUtils.get(this, Kind.Text);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ContentObject> {
		private Kind _kind;
		private ContentObjectVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<ContentObject> file(FileContentPart v) {
			this._kind = Kind.File;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ContentObject> file(Function<FileContentPart.Builder, ObjectBuilder<FileContentPart>> fn) {
			return this.file(fn.apply(new FileContentPart.Builder()).build());
		}

		public ObjectBuilder<ContentObject> imageUrl(ImageUrlContent v) {
			this._kind = Kind.ImageUrl;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ContentObject> imageUrl(
				Function<ImageUrlContent.Builder, ObjectBuilder<ImageUrlContent>> fn) {
			return this.imageUrl(fn.apply(new ImageUrlContent.Builder()).build());
		}

		public ObjectBuilder<ContentObject> text(TextContent v) {
			this._kind = Kind.Text;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ContentObject> text(Function<TextContent.Builder, ObjectBuilder<TextContent>> fn) {
			return this.text(fn.apply(new TextContent.Builder()).build());
		}

		public ContentObject build() {
			_checkSingleUse();
			return new ContentObject(this);
		}

	}

	protected static void setupContentObjectDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::file, FileContentPart._DESERIALIZER, "file");
		op.add(Builder::imageUrl, ImageUrlContent._DESERIALIZER, "image_url");
		op.add(Builder::text, TextContent._DESERIALIZER, "text");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<ContentObject> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ContentObject::setupContentObjectDeserializer, Builder::build);
}
