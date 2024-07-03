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

package co.elastic.clients.elasticsearch.query_rules;

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

// typedef: query_rules.delete_ruleset.Request

/**
 * Deletes a query ruleset.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#query_rules.delete_ruleset.Request">API
 *      specification</a>
 */

public class DeleteRulesetRequest extends RequestBase {
	private final String rulesetId;

	// ---------------------------------------------------------------------------------------------

	private DeleteRulesetRequest(Builder builder) {

		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");

	}

	public static DeleteRulesetRequest of(Function<Builder, ObjectBuilder<DeleteRulesetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the query ruleset to delete
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRulesetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteRulesetRequest> {
		private String rulesetId;

		/**
		 * Required - The unique identifier of the query ruleset to delete
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
		 * Builds a {@link DeleteRulesetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRulesetRequest build() {
			_checkSingleUse();

			return new DeleteRulesetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code query_rules.delete_ruleset}".
	 */
	public static final Endpoint<DeleteRulesetRequest, DeleteRulesetResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/query_rules.delete_ruleset",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _rulesetId = 1 << 0;

				int propsSet = 0;

				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query_rules");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.rulesetId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _rulesetId = 1 << 0;

				int propsSet = 0;

				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId)) {
					params.put("rulesetId", request.rulesetId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteRulesetResponse._DESERIALIZER);
}
