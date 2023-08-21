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

// typedef: ingest.simulate.Request

/**
 * Allows to simulate a pipeline with example documents.
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

		this.docs = ApiTypeHelper.unmodifiable(builder.docs);
		this.id = builder.id;
		this.pipeline = builder.pipeline;
		this.verbose = builder.verbose;

	}

	public static SimulateRequest of(Function<Builder, ObjectBuilder<SimulateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code docs}
	 */
	public final List<Document> docs() {
		return this.docs;
	}

	/**
	 * Pipeline ID
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final Pipeline pipeline() {
		return this.pipeline;
	}

	/**
	 * Verbose mode. Display data output for each processor in executed pipeline
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
		@Nullable
		private List<Document> docs;

		@Nullable
		private String id;

		@Nullable
		private Pipeline pipeline;

		@Nullable
		private Boolean verbose;

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<Document> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(Document value, Document... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<Document.Builder, ObjectBuilder<Document>> fn) {
			return docs(fn.apply(new Document.Builder()).build());
		}

		/**
		 * Pipeline ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable Pipeline value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return this.pipeline(fn.apply(new Pipeline.Builder()).build());
		}

		/**
		 * Verbose mode. Display data output for each processor in executed pipeline
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
