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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.Request

public class ExplainLifecycleRequest extends RequestBase {
	private final String index;

	@Nullable
	private final Boolean onlyErrors;

	@Nullable
	private final Boolean onlyManaged;

	// ---------------------------------------------------------------------------------------------

	private ExplainLifecycleRequest(Builder builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.onlyErrors = builder.onlyErrors;
		this.onlyManaged = builder.onlyManaged;

	}

	public static ExplainLifecycleRequest of(Function<Builder, ObjectBuilder<ExplainLifecycleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the index to explain
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * filters the indices included in the response to ones in an ILM error state,
	 * implies only_managed
	 * <p>
	 * API name: {@code only_errors}
	 */
	@Nullable
	public final Boolean onlyErrors() {
		return this.onlyErrors;
	}

	/**
	 * filters the indices included in the response to ones managed by ILM
	 * <p>
	 * API name: {@code only_managed}
	 */
	@Nullable
	public final Boolean onlyManaged() {
		return this.onlyManaged;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainLifecycleRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExplainLifecycleRequest> {
		private String index;

		@Nullable
		private Boolean onlyErrors;

		@Nullable
		private Boolean onlyManaged;

		/**
		 * Required - The name of the index to explain
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * filters the indices included in the response to ones in an ILM error state,
		 * implies only_managed
		 * <p>
		 * API name: {@code only_errors}
		 */
		public final Builder onlyErrors(@Nullable Boolean value) {
			this.onlyErrors = value;
			return this;
		}

		/**
		 * filters the indices included in the response to ones managed by ILM
		 * <p>
		 * API name: {@code only_managed}
		 */
		public final Builder onlyManaged(@Nullable Boolean value) {
			this.onlyManaged = value;
			return this;
		}

		/**
		 * Builds a {@link ExplainLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainLifecycleRequest build() {
			_checkSingleUse();

			return new ExplainLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.explain_lifecycle}".
	 */
	public static final Endpoint<ExplainLifecycleRequest, ExplainLifecycleResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_ilm");
					buf.append("/explain");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.onlyErrors != null) {
					params.put("only_errors", String.valueOf(request.onlyErrors));
				}
				if (request.onlyManaged != null) {
					params.put("only_managed", String.valueOf(request.onlyManaged));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ExplainLifecycleResponse._DESERIALIZER);
}
