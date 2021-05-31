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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.base.AdditionalProperties;
import co.elastic.clients.elasticsearch.rollup.get_rollup_index_capabilities.IndexCapabilities;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;

// typedef: rollup.get_rollup_index_capabilities.Response
public final class GetRollupIndexCapabilitiesResponse extends AdditionalProperties<String, IndexCapabilities> {
	// ---------------------------------------------------------------------------------------------

	protected GetRollupIndexCapabilitiesResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRollupIndexCapabilitiesResponse}.
	 */
	public static class Builder extends AdditionalProperties.AbstractBuilder<String, IndexCapabilities, Builder>
			implements
				ObjectBuilder<GetRollupIndexCapabilitiesResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRollupIndexCapabilitiesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRollupIndexCapabilitiesResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetRollupIndexCapabilitiesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetRollupIndexCapabilitiesResponse
	 */
	public static final JsonpValueParser<GetRollupIndexCapabilitiesResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new,
					GetRollupIndexCapabilitiesResponse::setupGetRollupIndexCapabilitiesResponseParser);

	protected static void setupGetRollupIndexCapabilitiesResponseParser(
			DelegatingJsonpValueParser<GetRollupIndexCapabilitiesResponse.Builder> op) {
		AdditionalProperties.setupAdditionalPropertiesParser(op, JsonpValueParser.stringParser(),
				IndexCapabilities.JSONP_PARSER);

	}

}
