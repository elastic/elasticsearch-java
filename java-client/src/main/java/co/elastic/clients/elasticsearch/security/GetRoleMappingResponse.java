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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.base.AdditionalProperties;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;

// typedef: security.get_role_mapping.Response
public final class GetRoleMappingResponse extends AdditionalProperties<String, RoleMapping> {
	// ---------------------------------------------------------------------------------------------

	protected GetRoleMappingResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRoleMappingResponse}.
	 */
	public static class Builder extends AdditionalProperties.AbstractBuilder<String, RoleMapping, Builder>
			implements
				ObjectBuilder<GetRoleMappingResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRoleMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRoleMappingResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetRoleMappingResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetRoleMappingResponse
	 */
	public static final JsonpValueParser<GetRoleMappingResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetRoleMappingResponse::setupGetRoleMappingResponseParser);

	protected static void setupGetRoleMappingResponseParser(
			DelegatingJsonpValueParser<GetRoleMappingResponse.Builder> op) {
		AdditionalProperties.setupAdditionalPropertiesParser(op, JsonpValueParser.stringParser(),
				RoleMapping.JSONP_PARSER);

	}

}
