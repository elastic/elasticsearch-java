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

package co.elastic.clients.elasticsearch.synonyms;

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

// typedef: synonyms.get_synonym_rule.Request

/**
 * Retrieves a synonym rule from a synonym set
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#synonyms.get_synonym_rule.Request">API
 *      specification</a>
 */

public class GetSynonymRuleRequest extends RequestBase {
	private final String ruleId;

	private final String setId;

	// ---------------------------------------------------------------------------------------------

	private GetSynonymRuleRequest(Builder builder) {

		this.ruleId = ApiTypeHelper.requireNonNull(builder.ruleId, this, "ruleId");
		this.setId = ApiTypeHelper.requireNonNull(builder.setId, this, "setId");

	}

	public static GetSynonymRuleRequest of(Function<Builder, ObjectBuilder<GetSynonymRuleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The id of the synonym rule to retrieve
	 * <p>
	 * API name: {@code rule_id}
	 */
	public final String ruleId() {
		return this.ruleId;
	}

	/**
	 * Required - The id of the synonym set to retrieve the synonym rule from
	 * <p>
	 * API name: {@code set_id}
	 */
	public final String setId() {
		return this.setId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSynonymRuleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetSynonymRuleRequest> {
		private String ruleId;

		private String setId;

		/**
		 * Required - The id of the synonym rule to retrieve
		 * <p>
		 * API name: {@code rule_id}
		 */
		public final Builder ruleId(String value) {
			this.ruleId = value;
			return this;
		}

		/**
		 * Required - The id of the synonym set to retrieve the synonym rule from
		 * <p>
		 * API name: {@code set_id}
		 */
		public final Builder setId(String value) {
			this.setId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSynonymRuleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSynonymRuleRequest build() {
			_checkSingleUse();

			return new GetSynonymRuleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code synonyms.get_synonym_rule}".
	 */
	public static final Endpoint<GetSynonymRuleRequest, GetSynonymRuleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/synonyms.get_synonym_rule",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _ruleId = 1 << 0;
				final int _setId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _setId;

				if (propsSet == (_setId | _ruleId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_synonyms");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.setId, buf);
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
				final int _setId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _setId;

				if (propsSet == (_setId | _ruleId)) {
					params.put("setId", request.setId);
					params.put("ruleId", request.ruleId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetSynonymRuleResponse._DESERIALIZER);
}
