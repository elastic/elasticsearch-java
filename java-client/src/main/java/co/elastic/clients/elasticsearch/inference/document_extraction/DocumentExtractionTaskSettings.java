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

// typedef: inference.document_extraction.DocumentExtractionTaskSettings

/**
 * Task settings for the <code>document_extraction</code> task type of the
 * <code>elastic</code> service. They can be set when creating the inference
 * endpoint and overridden per request. Request values take precedence, and
 * <code>parameters</code> are merged per key.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.document_extraction.DocumentExtractionTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class DocumentExtractionTaskSettings implements JsonpSerializable {
	@Nullable
	private final DocumentExtractionOutputFormat outputFormat;

	private final Map<String, JsonData> parameters;

	// ---------------------------------------------------------------------------------------------

	private DocumentExtractionTaskSettings(Builder builder) {

		this.outputFormat = builder.outputFormat;
		this.parameters = ApiTypeHelper.unmodifiable(builder.parameters);

	}

	public static DocumentExtractionTaskSettings of(
			Function<Builder, ObjectBuilder<DocumentExtractionTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The output format of the extracted content. Only <code>markdown</code> is
	 * supported.
	 * <p>
	 * API name: {@code output_format}
	 */
	@Nullable
	public final DocumentExtractionOutputFormat outputFormat() {
		return this.outputFormat;
	}

	/**
	 * A free-form object of extraction options that is forwarded to the Elastic
	 * Inference Service as-is. The accepted parameters are defined by the Elastic
	 * Inference Service.
	 * <p>
	 * API name: {@code parameters}
	 */
	public final Map<String, JsonData> parameters() {
		return this.parameters;
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

		if (this.outputFormat != null) {
			generator.writeKey("output_format");
			this.outputFormat.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.parameters)) {
			generator.writeKey("parameters");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.parameters.entrySet()) {
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
	 * Builder for {@link DocumentExtractionTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DocumentExtractionTaskSettings> {
		@Nullable
		private DocumentExtractionOutputFormat outputFormat;

		@Nullable
		private Map<String, JsonData> parameters;

		public Builder() {
		}
		private Builder(DocumentExtractionTaskSettings instance) {
			this.outputFormat = instance.outputFormat;
			this.parameters = instance.parameters;

		}
		/**
		 * The output format of the extracted content. Only <code>markdown</code> is
		 * supported.
		 * <p>
		 * API name: {@code output_format}
		 */
		public final Builder outputFormat(@Nullable DocumentExtractionOutputFormat value) {
			this.outputFormat = value;
			return this;
		}

		/**
		 * A free-form object of extraction options that is forwarded to the Elastic
		 * Inference Service as-is. The accepted parameters are defined by the Elastic
		 * Inference Service.
		 * <p>
		 * API name: {@code parameters}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>parameters</code>.
		 */
		public final Builder parameters(Map<String, JsonData> map) {
			this.parameters = _mapPutAll(this.parameters, map);
			return this;
		}

		/**
		 * A free-form object of extraction options that is forwarded to the Elastic
		 * Inference Service as-is. The accepted parameters are defined by the Elastic
		 * Inference Service.
		 * <p>
		 * API name: {@code parameters}
		 * <p>
		 * Adds an entry to <code>parameters</code>.
		 */
		public final Builder parameters(String key, JsonData value) {
			this.parameters = _mapPut(this.parameters, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DocumentExtractionTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DocumentExtractionTaskSettings build() {
			_checkSingleUse();

			return new DocumentExtractionTaskSettings(this);
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
	 * Json deserializer for {@link DocumentExtractionTaskSettings}
	 */
	public static final JsonpDeserializer<DocumentExtractionTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DocumentExtractionTaskSettings::setupDocumentExtractionTaskSettingsDeserializer);

	protected static void setupDocumentExtractionTaskSettingsDeserializer(
			ObjectDeserializer<DocumentExtractionTaskSettings.Builder> op) {

		op.add(Builder::outputFormat, DocumentExtractionOutputFormat._DESERIALIZER, "output_format");
		op.add(Builder::parameters, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "parameters");

	}

}
