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

import co.elastic.clients.json.JsonData;
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
import java.util.Map;
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

// typedef: inference._types.DocumentExtractionResult

/**
 * The document extraction result object representing the content extracted from
 * a single document.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.DocumentExtractionResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocumentExtractionResult implements JsonpSerializable {
	private final String content;

	private final String format;

	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	private DocumentExtractionResult(Builder builder) {

		this.content = ApiTypeHelper.requireNonNull(builder.content, this, "content");
		this.format = ApiTypeHelper.requireNonNull(builder.format, this, "format");
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

	}

	public static DocumentExtractionResult of(Function<Builder, ObjectBuilder<DocumentExtractionResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The content extracted from the document.
	 * <p>
	 * API name: {@code content}
	 */
	public final String content() {
		return this.content;
	}

	/**
	 * Required - The format of the extracted content, for example
	 * <code>markdown</code>.
	 * <p>
	 * API name: {@code format}
	 */
	public final String format() {
		return this.format;
	}

	/**
	 * Additional information about the document, such as its title. The available
	 * fields depend on the service and model.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
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

		generator.writeKey("content");
		generator.write(this.content);

		generator.writeKey("format");
		generator.write(this.format);

		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DocumentExtractionResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DocumentExtractionResult> {
		private String content;

		private String format;

		@Nullable
		private Map<String, JsonData> metadata;

		public Builder() {
		}
		private Builder(DocumentExtractionResult instance) {
			this.content = instance.content;
			this.format = instance.format;
			this.metadata = instance.metadata;

		}
		/**
		 * Required - The content extracted from the document.
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(String value) {
			this.content = value;
			return this;
		}

		/**
		 * Required - The format of the extracted content, for example
		 * <code>markdown</code>.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(String value) {
			this.format = value;
			return this;
		}

		/**
		 * Additional information about the document, such as its title. The available
		 * fields depend on the service and model.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Additional information about the document, such as its title. The available
		 * fields depend on the service and model.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DocumentExtractionResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentExtractionResult build() {
			_checkSingleUse();

			return new DocumentExtractionResult(this);
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
	 * Json deserializer for {@link DocumentExtractionResult}
	 */
	public static final JsonpDeserializer<DocumentExtractionResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DocumentExtractionResult::setupDocumentExtractionResultDeserializer);

	protected static void setupDocumentExtractionResultDeserializer(
			ObjectDeserializer<DocumentExtractionResult.Builder> op) {

		op.add(Builder::content, JsonpDeserializer.stringDeserializer(), "content");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");

	}

}
