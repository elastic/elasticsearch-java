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

package co.elastic.clients.elasticsearch.query_rule;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
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

// typedef: query_rule.get.Request

/**
 * Returns the details about a query rule within a query ruleset
 * 
 * @see <a href="../doc-files/api-spec.html#query_rule.get.Request">API
 *      specification</a>
 */

public class GetQueryRuleRequest extends RequestBase {
	private final String ruleId;

	private final String rulesetId;

	// ---------------------------------------------------------------------------------------------

	private GetQueryRuleRequest(Builder builder) {

		this.ruleId = ApiTypeHelper.requireNonNull(builder.ruleId, this, "ruleId");
		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");

	}

	public static GetQueryRuleRequest of(Function<Builder, ObjectBuilder<GetQueryRuleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the query rule within the specified
	 * ruleset to retrieve
	 * <p>
	 * API name: {@code rule_id}
	 */
	public final String ruleId() {
		return this.ruleId;
	}

	/**
	 * Required - The unique identifier of the query ruleset containing the rule to
	 * retrieve
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetQueryRuleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetQueryRuleRequest> {
		private String ruleId;

		private String rulesetId;

		/**
		 * Required - The unique identifier of the query rule within the specified
		 * ruleset to retrieve
		 * <p>
		 * API name: {@code rule_id}
		 */
		public final Builder ruleId(String value) {
			this.ruleId = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the query ruleset containing the rule to
		 * retrieve
		 * <p>
		 * API name: {@code ruleset_id}
		 */
		public final Builder rulesetId(String value) {
			this.rulesetId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetQueryRuleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetQueryRuleRequest build() {
			_checkSingleUse();

			return new GetQueryRuleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code query_rule.get}".
	 */
	public static final Endpoint<GetQueryRuleRequest, GetQueryRuleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/query_rule.get",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _ruleId = 1 << 0;
				final int _rulesetId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId | _ruleId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query_rules");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.rulesetId, buf);
					buf.append("/_rule");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.ruleId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _ruleId = 1 << 0;
				final int _rulesetId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId | _ruleId)) {
					params.put("rulesetId", request.rulesetId);
					params.put("ruleId", request.ruleId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetQueryRuleResponse._DESERIALIZER);
}
