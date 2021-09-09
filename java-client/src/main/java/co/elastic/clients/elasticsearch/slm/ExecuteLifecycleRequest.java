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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: slm.execute_lifecycle.Request
public final class ExecuteLifecycleRequest extends RequestBase {
	private final String policyId;

	// ---------------------------------------------------------------------------------------------

	protected ExecuteLifecycleRequest(Builder builder) {

		this.policyId = Objects.requireNonNull(builder.policyId, "policy_id");

	}

	/**
	 * The id of the snapshot lifecycle policy to be executed
	 * <p>
	 * API name: {@code policy_id}
	 */
	public String policyId() {
		return this.policyId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteLifecycleRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExecuteLifecycleRequest> {
		private String policyId;

		/**
		 * The id of the snapshot lifecycle policy to be executed
		 * <p>
		 * API name: {@code policy_id}
		 */
		public Builder policyId(String value) {
			this.policyId = value;
			return this;
		}

		/**
		 * Builds a {@link ExecuteLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteLifecycleRequest build() {

			return new ExecuteLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code slm.execute_lifecycle}".
	 */
	public static final Endpoint<ExecuteLifecycleRequest, ExecuteLifecycleResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

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
					buf.append(request.policyId);
					buf.append("/_execute");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, ExecuteLifecycleResponse.DESERIALIZER);
}
