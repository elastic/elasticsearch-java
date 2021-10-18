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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: slm.get_lifecycle.Request

public final class GetLifecycleRequest extends RequestBase {
	@Nullable
	private final List<String> policyId;

	// ---------------------------------------------------------------------------------------------

	public GetLifecycleRequest(Builder builder) {

		this.policyId = ModelTypeHelper.unmodifiable(builder.policyId);

	}

	public GetLifecycleRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Comma-separated list of snapshot lifecycle policies to retrieve
	 * <p>
	 * API name: {@code policy_id}
	 */
	@Nullable
	public List<String> policyId() {
		return this.policyId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLifecycleRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetLifecycleRequest> {
		@Nullable
		private List<String> policyId;

		/**
		 * Comma-separated list of snapshot lifecycle policies to retrieve
		 * <p>
		 * API name: {@code policy_id}
		 */
		public Builder policyId(@Nullable List<String> value) {
			this.policyId = value;
			return this;
		}

		/**
		 * Comma-separated list of snapshot lifecycle policies to retrieve
		 * <p>
		 * API name: {@code policy_id}
		 */
		public Builder policyId(String... value) {
			this.policyId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #policyId(List)}, creating the list if needed.
		 */
		public Builder addPolicyId(String value) {
			if (this.policyId == null) {
				this.policyId = new ArrayList<>();
			}
			this.policyId.add(value);
			return this;
		}

		/**
		 * Builds a {@link GetLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetLifecycleRequest build() {

			return new GetLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code slm.get_lifecycle}".
	 */
	public static final Endpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _policyId = 1 << 0;

				int propsSet = 0;

				if (request.policyId() != null)
					propsSet |= _policyId;

				if (propsSet == (_policyId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_slm");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.policyId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_slm");
					buf.append("/policy");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetLifecycleResponse._DESERIALIZER);
}
