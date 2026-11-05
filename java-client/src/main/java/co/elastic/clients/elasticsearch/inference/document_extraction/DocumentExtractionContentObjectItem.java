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

package co.elastic.clients.elasticsearch.inference.document_extraction;

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

// typedef: inference.document_extraction.DocumentExtractionContentObjectItem

/**
 * An object describing a single document to extract the content from.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.document_extraction.DocumentExtractionContentObjectItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocumentExtractionContentObjectItem implements JsonpSerializable {
	private final DocumentExtractionContentType type;

	@Nullable
	private final DocumentExtractionContentFormat format;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private DocumentExtractionContentObjectItem(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.format = builder.format;
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static DocumentExtractionContentObjectItem of(
			Function<Builder, ObjectBuilder<DocumentExtractionContentObjectItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of the document. Not all services and models support all
	 * types.
	 * <p>
	 * API name: {@code type}
	 */
	public final DocumentExtractionContentType type() {
		return this.type;
	}

	/**
	 * The format of the document. If not specified, this defaults to
	 * <code>base64</code> for <code>pdf</code> and <code>image</code>, and
	 * <code>url</code> for <code>html</code>. The <code>html</code> type supports
	 * <code>url</code> only. Not all services and models support all formats.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final DocumentExtractionContentFormat format() {
		return this.format;
	}

	/**
	 * Required - The value of the document. For the <code>base64</code> format,
	 * this must be a base64-encoded data URI, that is,
	 * &quot;data:content/type;base64,...&quot;. For the <code>url</code> format,
	 * this must be a URL that points to the document, that is, &quot;<a href=
	 * "https://example.com/document.pdf">https://example.com/document.pdf</a>&quot;.
	 * <p>
	 * API name: {@code value}
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

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.format != null) {
			generator.writeKey("format");
			this.format.serialize(generator, mapper);
		}
		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentExtractionContentObjectItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DocumentExtractionContentObjectItem> {
		private DocumentExtractionContentType type;

		@Nullable
		private DocumentExtractionContentFormat format;

		private String value;

		public Builder() {
		}
		private Builder(DocumentExtractionContentObjectItem instance) {
			this.type = instance.type;
			this.format = instance.format;
			this.value = instance.value;

		}
		/**
		 * Required - The type of the document. Not all services and models support all
		 * types.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(DocumentExtractionContentType value) {
			this.type = value;
			return this;
		}

		/**
		 * The format of the document. If not specified, this defaults to
		 * <code>base64</code> for <code>pdf</code> and <code>image</code>, and
		 * <code>url</code> for <code>html</code>. The <code>html</code> type supports
		 * <code>url</code> only. Not all services and models support all formats.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable DocumentExtractionContentFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * Required - The value of the document. For the <code>base64</code> format,
		 * this must be a base64-encoded data URI, that is,
		 * &quot;data:content/type;base64,...&quot;. For the <code>url</code> format,
		 * this must be a URL that points to the document, that is, &quot;<a href=
		 * "https://example.com/document.pdf">https://example.com/document.pdf</a>&quot;.
		 * <p>
		 * API name: {@code value}
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
		 * Builds a {@link DocumentExtractionContentObjectItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentExtractionContentObjectItem build() {
			_checkSingleUse();

			return new DocumentExtractionContentObjectItem(this);
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
	 * Json deserializer for {@link DocumentExtractionContentObjectItem}
	 */
	public static final JsonpDeserializer<DocumentExtractionContentObjectItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DocumentExtractionContentObjectItem::setupDocumentExtractionContentObjectItemDeserializer);

	protected static void setupDocumentExtractionContentObjectItemDeserializer(
			ObjectDeserializer<DocumentExtractionContentObjectItem.Builder> op) {

		op.add(Builder::type, DocumentExtractionContentType._DESERIALIZER, "type");
		op.add(Builder::format, DocumentExtractionContentFormat._DESERIALIZER, "format");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
