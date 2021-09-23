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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.ingest.simulate.Document;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.simulate.Request
public final class SimulateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean verbose;

	@Nullable
	private final List<Document> docs;

	@Nullable
	private final Pipeline pipeline;

	// ---------------------------------------------------------------------------------------------

	public SimulateRequest(Builder builder) {

		this.id = builder.id;
		this.verbose = builder.verbose;
		this.docs = builder.docs;
		this.pipeline = builder.pipeline;

	}

	/**
	 * Pipeline ID
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * Verbose mode. Display data output for each processor in executed pipeline
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public Boolean verbose() {
		return this.verbose;
	}

	/**
	 * API name: {@code docs}
	 */
	@Nullable
	public List<Document> docs() {
		return this.docs;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public Pipeline pipeline() {
		return this.pipeline;
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

		if (this.docs != null) {

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
	public static class Builder implements ObjectBuilder<SimulateRequest> {
		@Nullable
		private String id;

		@Nullable
		private Boolean verbose;

		@Nullable
		private List<Document> docs;

		@Nullable
		private Pipeline pipeline;

		/**
		 * Pipeline ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Verbose mode. Display data output for each processor in executed pipeline
		 * <p>
		 * API name: {@code verbose}
		 */
		public Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(@Nullable List<Document> value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(Document... value) {
			this.docs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder addDocs(Document value) {
			if (this.docs == null) {
				this.docs = new ArrayList<>();
			}
			this.docs.add(value);
			return this;
		}

		/**
		 * Set {@link #docs(List)} to a singleton list.
		 */
		public Builder docs(Function<Document.Builder, ObjectBuilder<Document>> fn) {
			return this.docs(fn.apply(new Document.Builder()).build());
		}

		/**
		 * Add a value to {@link #docs(List)}, creating the list if needed.
		 */
		public Builder addDocs(Function<Document.Builder, ObjectBuilder<Document>> fn) {
			return this.addDocs(fn.apply(new Document.Builder()).build());
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(@Nullable Pipeline value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return this.pipeline(fn.apply(new Pipeline.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateRequest build() {

			return new SimulateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateRequest}
	 */
	public static final JsonpDeserializer<SimulateRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SimulateRequest::setupSimulateRequestDeserializer);

	protected static void setupSimulateRequestDeserializer(DelegatingDeserializer<SimulateRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(Document.DESERIALIZER), "docs");
		op.add(Builder::pipeline, Pipeline.DESERIALIZER, "pipeline");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.simulate}".
	 */
	public static final Endpoint<SimulateRequest, SimulateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.id);
					buf.append("/_simulate");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, SimulateResponse.DESERIALIZER);
}
