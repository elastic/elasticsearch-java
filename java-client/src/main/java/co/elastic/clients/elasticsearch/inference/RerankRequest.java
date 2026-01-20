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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
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

// typedef: inference.rerank.Request

/**
 * Perform reranking inference on the service.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.rerank.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RerankRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	private final List<String> input;

	private final String query;

	@Nullable
	private final Boolean returnDocuments;

	@Nullable
	private final JsonData taskSettings;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Integer topN;

	// ---------------------------------------------------------------------------------------------

	private RerankRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.input = ApiTypeHelper.unmodifiableRequired(builder.input, this, "input");
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.returnDocuments = builder.returnDocuments;
		this.taskSettings = builder.taskSettings;
		this.timeout = builder.timeout;
		this.topN = builder.topN;

	}

	public static RerankRequest of(Function<Builder, ObjectBuilder<RerankRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier for the inference endpoint.
	 * <p>
	 * API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Required - The documents to rank.
	 * <p>
	 * API name: {@code input}
	 */
	public final List<String> input() {
		return this.input;
	}

	/**
	 * Required - Query input.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * Include the document text in the response.
	 * <p>
	 * API name: {@code return_documents}
	 */
	@Nullable
	public final Boolean returnDocuments() {
		return this.returnDocuments;
	}

	/**
	 * Task settings for the individual inference request. These settings are
	 * specific to the task type you specified and override the task settings
	 * specified when initializing the service.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final JsonData taskSettings() {
		return this.taskSettings;
	}

	/**
	 * The amount of time to wait for the inference request to complete.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Limit the response to the top N documents.
	 * <p>
	 * API name: {@code top_n}
	 */
	@Nullable
	public final Integer topN() {
		return this.topN;
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

		if (ApiTypeHelper.isDefined(this.input)) {
			generator.writeKey("input");
			generator.writeStartArray();
			for (String item0 : this.input) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}
		if (this.taskSettings != null) {
			generator.writeKey("task_settings");
			this.taskSettings.serialize(generator, mapper);

		}
		if (this.topN != null) {
			generator.writeKey("top_n");
			generator.write(this.topN);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerankRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<RerankRequest> {
		private String inferenceId;

		private List<String> input;

		private String query;

		@Nullable
		private Boolean returnDocuments;

		@Nullable
		private JsonData taskSettings;

		@Nullable
		private Time timeout;

		@Nullable
		private Integer topN;

		public Builder() {
		}
		private Builder(RerankRequest instance) {
			this.inferenceId = instance.inferenceId;
			this.input = instance.input;
			this.query = instance.query;
			this.returnDocuments = instance.returnDocuments;
			this.taskSettings = instance.taskSettings;
			this.timeout = instance.timeout;
			this.topN = instance.topN;

		}
		/**
		 * Required - The unique identifier for the inference endpoint.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * Required - The documents to rank.
		 * <p>
		 * API name: {@code input}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>input</code>.
		 */
		public final Builder input(List<String> list) {
			this.input = _listAddAll(this.input, list);
			return this;
		}

		/**
		 * Required - The documents to rank.
		 * <p>
		 * API name: {@code input}
		 * <p>
		 * Adds one or more values to <code>input</code>.
		 */
		public final Builder input(String value, String... values) {
			this.input = _listAdd(this.input, value, values);
			return this;
		}

		/**
		 * Required - Query input.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * Include the document text in the response.
		 * <p>
		 * API name: {@code return_documents}
		 */
		public final Builder returnDocuments(@Nullable Boolean value) {
			this.returnDocuments = value;
			return this;
		}

		/**
		 * Task settings for the individual inference request. These settings are
		 * specific to the task type you specified and override the task settings
		 * specified when initializing the service.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable JsonData value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * The amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Limit the response to the top N documents.
		 * <p>
		 * API name: {@code top_n}
		 */
		public final Builder topN(@Nullable Integer value) {
			this.topN = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RerankRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerankRequest build() {
			_checkSingleUse();

			return new RerankRequest(this);
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
	 * Json deserializer for {@link RerankRequest}
	 */
	public static final JsonpDeserializer<RerankRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerankRequest::setupRerankRequestDeserializer);

	protected static void setupRerankRequestDeserializer(ObjectDeserializer<RerankRequest.Builder> op) {

		op.add(Builder::input, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "input");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");
		op.add(Builder::taskSettings, JsonData._DESERIALIZER, "task_settings");
		op.add(Builder::topN, JsonpDeserializer.integerDeserializer(), "top_n");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.rerank}".
	 */
	public static final Endpoint<RerankRequest, RerankResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.rerank",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _inferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _inferenceId;

				if (propsSet == (_inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/rerank");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _inferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _inferenceId;

				if (propsSet == (_inferenceId)) {
					params.put("inferenceId", request.inferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RerankResponse._DESERIALIZER);
}
