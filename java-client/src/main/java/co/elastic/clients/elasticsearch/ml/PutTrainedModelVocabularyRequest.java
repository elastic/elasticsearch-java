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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model_vocabulary.Request

/**
 * Creates a trained model vocabulary. This API is supported only for natural
 * language processing (NLP) models. The vocabulary is stored in the index as
 * described in <code>inference_config.*.vocabulary</code> of the trained model
 * definition.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.put_trained_model_vocabulary.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutTrainedModelVocabularyRequest extends RequestBase implements JsonpSerializable {
	private final List<String> merges;

	private final String modelId;

	private final List<String> vocabulary;

	// ---------------------------------------------------------------------------------------------

	private PutTrainedModelVocabularyRequest(Builder builder) {

		this.merges = ApiTypeHelper.unmodifiable(builder.merges);
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.vocabulary = ApiTypeHelper.unmodifiableRequired(builder.vocabulary, this, "vocabulary");

	}

	public static PutTrainedModelVocabularyRequest of(
			Function<Builder, ObjectBuilder<PutTrainedModelVocabularyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The optional model merges if required by the tokenizer.
	 * <p>
	 * API name: {@code merges}
	 */
	public final List<String> merges() {
		return this.merges;
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The model vocabulary, which must not be empty.
	 * <p>
	 * API name: {@code vocabulary}
	 */
	public final List<String> vocabulary() {
		return this.vocabulary;
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

		if (ApiTypeHelper.isDefined(this.merges)) {
			generator.writeKey("merges");
			generator.writeStartArray();
			for (String item0 : this.merges) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.vocabulary)) {
			generator.writeKey("vocabulary");
			generator.writeStartArray();
			for (String item0 : this.vocabulary) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelVocabularyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutTrainedModelVocabularyRequest> {
		@Nullable
		private List<String> merges;

		private String modelId;

		private List<String> vocabulary;

		/**
		 * The optional model merges if required by the tokenizer.
		 * <p>
		 * API name: {@code merges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>merges</code>.
		 */
		public final Builder merges(List<String> list) {
			this.merges = _listAddAll(this.merges, list);
			return this;
		}

		/**
		 * The optional model merges if required by the tokenizer.
		 * <p>
		 * API name: {@code merges}
		 * <p>
		 * Adds one or more values to <code>merges</code>.
		 */
		public final Builder merges(String value, String... values) {
			this.merges = _listAdd(this.merges, value, values);
			return this;
		}

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - The model vocabulary, which must not be empty.
		 * <p>
		 * API name: {@code vocabulary}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>vocabulary</code>.
		 */
		public final Builder vocabulary(List<String> list) {
			this.vocabulary = _listAddAll(this.vocabulary, list);
			return this;
		}

		/**
		 * Required - The model vocabulary, which must not be empty.
		 * <p>
		 * API name: {@code vocabulary}
		 * <p>
		 * Adds one or more values to <code>vocabulary</code>.
		 */
		public final Builder vocabulary(String value, String... values) {
			this.vocabulary = _listAdd(this.vocabulary, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelVocabularyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelVocabularyRequest build() {
			_checkSingleUse();

			return new PutTrainedModelVocabularyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTrainedModelVocabularyRequest}
	 */
	public static final JsonpDeserializer<PutTrainedModelVocabularyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutTrainedModelVocabularyRequest::setupPutTrainedModelVocabularyRequestDeserializer);

	protected static void setupPutTrainedModelVocabularyRequestDeserializer(
			ObjectDeserializer<PutTrainedModelVocabularyRequest.Builder> op) {

		op.add(Builder::merges, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "merges");
		op.add(Builder::vocabulary, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"vocabulary");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_trained_model_vocabulary}".
	 */
	public static final Endpoint<PutTrainedModelVocabularyRequest, PutTrainedModelVocabularyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_trained_model_vocabulary",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					buf.append("/vocabulary");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					params.put("modelId", request.modelId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutTrainedModelVocabularyResponse._DESERIALIZER);
}
