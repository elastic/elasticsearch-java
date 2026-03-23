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

// typedef: inference._types.FileContent

/**
 *
 * @see <a href="../doc-files/api-spec.html#inference._types.FileContent">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileContent implements JsonpSerializable {
	private final String fileData;

	private final String filename;

	// ---------------------------------------------------------------------------------------------

	private FileContent(Builder builder) {

		this.fileData = ApiTypeHelper.requireNonNull(builder.fileData, this, "fileData");
		this.filename = ApiTypeHelper.requireNonNull(builder.filename, this, "filename");

	}

	public static FileContent of(Function<Builder, ObjectBuilder<FileContent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The base64 encoded file data
	 * <p>
	 * API name: {@code file_data}
	 */
	public final String fileData() {
		return this.fileData;
	}

	/**
	 * Required - The name of the file
	 * <p>
	 * API name: {@code filename}
	 */
	public final String filename() {
		return this.filename;
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

		generator.writeKey("file_data");
		generator.write(this.fileData);

		generator.writeKey("filename");
		generator.write(this.filename);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileContent}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FileContent> {
		private String fileData;

		private String filename;

		public Builder() {
		}
		private Builder(FileContent instance) {
			this.fileData = instance.fileData;
			this.filename = instance.filename;

		}
		/**
		 * Required - The base64 encoded file data
		 * <p>
		 * API name: {@code file_data}
		 */
		public final Builder fileData(String value) {
			this.fileData = value;
			return this;
		}

		/**
		 * Required - The name of the file
		 * <p>
		 * API name: {@code filename}
		 */
		public final Builder filename(String value) {
			this.filename = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FileContent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileContent build() {
			_checkSingleUse();

			return new FileContent(this);
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
	 * Json deserializer for {@link FileContent}
	 */
	public static final JsonpDeserializer<FileContent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FileContent::setupFileContentDeserializer);

	protected static void setupFileContentDeserializer(ObjectDeserializer<FileContent.Builder> op) {

		op.add(Builder::fileData, JsonpDeserializer.stringDeserializer(), "file_data");
		op.add(Builder::filename, JsonpDeserializer.stringDeserializer(), "filename");

	}

}
