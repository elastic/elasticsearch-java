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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.StoredScript;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.put_script.Request

/**
 * Creates or updates a script.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.put_script.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutScriptRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String context;

	private final String id;

	@Nullable
	private final Time masterTimeout;

	private final StoredScript script;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutScriptRequest(Builder builder) {

		this.context = builder.context;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.masterTimeout = builder.masterTimeout;
		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");
		this.timeout = builder.timeout;

	}

	public static PutScriptRequest of(Function<Builder, ObjectBuilder<PutScriptRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Script context
	 * <p>
	 * API name: {@code context}
	 */
	@Nullable
	public final String context() {
		return this.context;
	}

	/**
	 * Required - Script ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final StoredScript script() {
		return this.script;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutScriptRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutScriptRequest> {
		@Nullable
		private String context;

		private String id;

		@Nullable
		private Time masterTimeout;

		private StoredScript script;

		@Nullable
		private Time timeout;

		/**
		 * Script context
		 * <p>
		 * API name: {@code context}
		 */
		public final Builder context(@Nullable String value) {
			this.context = value;
			return this;
		}

		/**
		 * Required - Script ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(StoredScript value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Function<StoredScript.Builder, ObjectBuilder<StoredScript>> fn) {
			return this.script(fn.apply(new StoredScript.Builder()).build());
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutScriptRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutScriptRequest build() {
			_checkSingleUse();

			return new PutScriptRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutScriptRequest}
	 */
	public static final JsonpDeserializer<PutScriptRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutScriptRequest::setupPutScriptRequestDeserializer);

	protected static void setupPutScriptRequestDeserializer(ObjectDeserializer<PutScriptRequest.Builder> op) {

		op.add(Builder::script, StoredScript._DESERIALIZER, "script");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code put_script}".
	 */
	public static final Endpoint<PutScriptRequest, PutScriptResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/put_script",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _context = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				if (request.context() != null)
					propsSet |= _context;
				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				if (propsSet == (_id | _context)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_scripts");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.context, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _context = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				if (request.context() != null)
					propsSet |= _context;
				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				if (propsSet == (_id | _context)) {
					params.put("id", request.id);
					params.put("context", request.context);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutScriptResponse._DESERIALIZER);
}
