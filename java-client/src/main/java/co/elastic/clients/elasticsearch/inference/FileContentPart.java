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

// typedef: inference._types.FileContentPart

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.FileContentPart">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileContentPart implements ContentObjectVariant, JsonpSerializable {
	private final FileContent file;

	// ---------------------------------------------------------------------------------------------

	private FileContentPart(Builder builder) {

		this.file = ApiTypeHelper.requireNonNull(builder.file, this, "file");

	}

	public static FileContentPart of(Function<Builder, ObjectBuilder<FileContentPart>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ContentObject variant kind.
	 */
	@Override
	public ContentObject.Kind _contentObjectKind() {
		return ContentObject.Kind.File;
	}

	/**
	 * Required - The file content.
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

		generator.write("type", "file");

		generator.writeKey("file");
		this.file.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileContentPart}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FileContentPart> {
		private FileContent file;

		public Builder() {
		}
		private Builder(FileContentPart instance) {
			this.file = instance.file;

		}
		/**
		 * Required - The file content.
		 * <p>
		 * API name: {@code file}
		 */
		public final Builder file(FileContent value) {
			this.file = value;
			return this;
		}

		/**
		 * Required - The file content.
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
		 * Builds a {@link FileContentPart}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileContentPart build() {
			_checkSingleUse();

			return new FileContentPart(this);
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
	 * Json deserializer for {@link FileContentPart}
	 */
	public static final JsonpDeserializer<FileContentPart> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FileContentPart::setupFileContentPartDeserializer);

	protected static void setupFileContentPartDeserializer(ObjectDeserializer<FileContentPart.Builder> op) {

		op.add(Builder::file, FileContent._DESERIALIZER, "file");

		op.ignore("type");
	}

}
