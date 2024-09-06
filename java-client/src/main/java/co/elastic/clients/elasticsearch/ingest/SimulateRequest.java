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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.ingest.simulate.Document;
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

// typedef: ingest.simulate.Request

/**
 * Executes an ingest pipeline against a set of provided documents.
 * 
 * @see <a href="../doc-files/api-spec.html#ingest.simulate.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateRequest extends RequestBase implements JsonpSerializable {
	private final List<Document> docs;

	@Nullable
	private final String id;

	@Nullable
	private final Pipeline pipeline;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	private SimulateRequest(Builder builder) {

		this.docs = ApiTypeHelper.unmodifiableRequired(builder.docs, this, "docs");
		this.id = builder.id;
		this.pipeline = builder.pipeline;
		this.verbose = builder.verbose;

	}

	public static SimulateRequest of(Function<Builder, ObjectBuilder<SimulateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Sample documents to test in the pipeline.
	 * <p>
	 * API name: {@code docs}
	 */
	public final List<Document> docs() {
		return this.docs;
	}

	/**
	 * Pipeline to test. If you don’t specify a <code>pipeline</code> in the request
	 * body, this parameter is required.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Pipeline to test. If you don’t specify the <code>pipeline</code> request path
	 * parameter, this parameter is required. If you specify both this and the
	 * request path parameter, the API only uses the request path parameter.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final Pipeline pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code>, the response includes output data for each processor in
	 * the executed pipeline.
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public final Boolean verbose() {
		return this.verbose;
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

		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (Document item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			this.pipeline.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<SimulateRequest> {
		private List<Document> docs;

		@Nullable
		private String id;

		@Nullable
		private Pipeline pipeline;

		@Nullable
		private Boolean verbose;

		/**
		 * Required - Sample documents to test in the pipeline.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<Document> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * Required - Sample documents to test in the pipeline.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(Document value, Document... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * Required - Sample documents to test in the pipeline.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<Document.Builder, ObjectBuilder<Document>> fn) {
			return docs(fn.apply(new Document.Builder()).build());
		}

		/**
		 * Pipeline to test. If you don’t specify a <code>pipeline</code> in the request
		 * body, this parameter is required.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Pipeline to test. If you don’t specify the <code>pipeline</code> request path
		 * parameter, this parameter is required. If you specify both this and the
		 * request path parameter, the API only uses the request path parameter.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable Pipeline value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * Pipeline to test. If you don’t specify the <code>pipeline</code> request path
		 * parameter, this parameter is required. If you specify both this and the
		 * request path parameter, the API only uses the request path parameter.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return this.pipeline(fn.apply(new Pipeline.Builder()).build());
		}

		/**
		 * If <code>true</code>, the response includes output data for each processor in
		 * the executed pipeline.
		 * <p>
		 * API name: {@code verbose}
		 */
		public final Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateRequest build() {
			_checkSingleUse();

			return new SimulateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateRequest}
	 */
	public static final JsonpDeserializer<SimulateRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SimulateRequest::setupSimulateRequestDeserializer);

	protected static void setupSimulateRequestDeserializer(ObjectDeserializer<SimulateRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Document._DESERIALIZER), "docs");
		op.add(Builder::pipeline, Pipeline._DESERIALIZER, "pipeline");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.simulate}".
	 */
	public static final Endpoint<SimulateRequest, SimulateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.simulate",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					buf.append("/_simulate");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_simulate");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == 0) {
				}
				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, SimulateResponse._DESERIALIZER);
}
