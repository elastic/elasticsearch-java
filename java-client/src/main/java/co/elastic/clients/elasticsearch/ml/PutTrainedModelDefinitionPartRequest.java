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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model_definition_part.Request

/**
 * Creates part of a trained model definition.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.put_trained_model_definition_part.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutTrainedModelDefinitionPartRequest extends RequestBase implements JsonpSerializable {
	private final String definition;

	private final String modelId;

	private final int part;

	private final long totalDefinitionLength;

	private final int totalParts;

	// ---------------------------------------------------------------------------------------------

	private PutTrainedModelDefinitionPartRequest(Builder builder) {

		this.definition = ApiTypeHelper.requireNonNull(builder.definition, this, "definition");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.part = ApiTypeHelper.requireNonNull(builder.part, this, "part");
		this.totalDefinitionLength = ApiTypeHelper.requireNonNull(builder.totalDefinitionLength, this,
				"totalDefinitionLength");
		this.totalParts = ApiTypeHelper.requireNonNull(builder.totalParts, this, "totalParts");

	}

	public static PutTrainedModelDefinitionPartRequest of(
			Function<Builder, ObjectBuilder<PutTrainedModelDefinitionPartRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The definition part for the model. Must be a base64 encoded
	 * string.
	 * <p>
	 * API name: {@code definition}
	 */
	public final String definition() {
		return this.definition;
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
	 * Required - The definition part number. When the definition is loaded for
	 * inference the definition parts are streamed in the order of their part
	 * number. The first part must be <code>0</code> and the final part must be
	 * <code>total_parts - 1</code>.
	 * <p>
	 * API name: {@code part}
	 */
	public final int part() {
		return this.part;
	}

	/**
	 * Required - The total uncompressed definition length in bytes. Not base64
	 * encoded.
	 * <p>
	 * API name: {@code total_definition_length}
	 */
	public final long totalDefinitionLength() {
		return this.totalDefinitionLength;
	}

	/**
	 * Required - The total number of parts that will be uploaded. Must be greater
	 * than 0.
	 * <p>
	 * API name: {@code total_parts}
	 */
	public final int totalParts() {
		return this.totalParts;
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

		generator.writeKey("definition");
		generator.write(this.definition);

		generator.writeKey("total_definition_length");
		generator.write(this.totalDefinitionLength);

		generator.writeKey("total_parts");
		generator.write(this.totalParts);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelDefinitionPartRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutTrainedModelDefinitionPartRequest> {
		private String definition;

		private String modelId;

		private Integer part;

		private Long totalDefinitionLength;

		private Integer totalParts;

		/**
		 * Required - The definition part for the model. Must be a base64 encoded
		 * string.
		 * <p>
		 * API name: {@code definition}
		 */
		public final Builder definition(String value) {
			this.definition = value;
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
		 * Required - The definition part number. When the definition is loaded for
		 * inference the definition parts are streamed in the order of their part
		 * number. The first part must be <code>0</code> and the final part must be
		 * <code>total_parts - 1</code>.
		 * <p>
		 * API name: {@code part}
		 */
		public final Builder part(int value) {
			this.part = value;
			return this;
		}

		/**
		 * Required - The total uncompressed definition length in bytes. Not base64
		 * encoded.
		 * <p>
		 * API name: {@code total_definition_length}
		 */
		public final Builder totalDefinitionLength(long value) {
			this.totalDefinitionLength = value;
			return this;
		}

		/**
		 * Required - The total number of parts that will be uploaded. Must be greater
		 * than 0.
		 * <p>
		 * API name: {@code total_parts}
		 */
		public final Builder totalParts(int value) {
			this.totalParts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelDefinitionPartRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelDefinitionPartRequest build() {
			_checkSingleUse();

			return new PutTrainedModelDefinitionPartRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTrainedModelDefinitionPartRequest}
	 */
	public static final JsonpDeserializer<PutTrainedModelDefinitionPartRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					PutTrainedModelDefinitionPartRequest::setupPutTrainedModelDefinitionPartRequestDeserializer);

	protected static void setupPutTrainedModelDefinitionPartRequestDeserializer(
			ObjectDeserializer<PutTrainedModelDefinitionPartRequest.Builder> op) {

		op.add(Builder::definition, JsonpDeserializer.stringDeserializer(), "definition");
		op.add(Builder::totalDefinitionLength, JsonpDeserializer.longDeserializer(), "total_definition_length");
		op.add(Builder::totalParts, JsonpDeserializer.integerDeserializer(), "total_parts");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_trained_model_definition_part}".
	 */
	public static final Endpoint<PutTrainedModelDefinitionPartRequest, PutTrainedModelDefinitionPartResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_trained_model_definition_part",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _part = 1 << 0;
				final int _modelId = 1 << 1;

				int propsSet = 0;

				propsSet |= _part;
				propsSet |= _modelId;

				if (propsSet == (_modelId | _part)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					buf.append("/definition");
					buf.append("/");
					SimpleEndpoint.pathEncode(String.valueOf(request.part), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _part = 1 << 0;
				final int _modelId = 1 << 1;

				int propsSet = 0;

				propsSet |= _part;
				propsSet |= _modelId;

				if (propsSet == (_modelId | _part)) {
					params.put("modelId", request.modelId);
					params.put("part", String.valueOf(request.part));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutTrainedModelDefinitionPartResponse._DESERIALIZER);
}
