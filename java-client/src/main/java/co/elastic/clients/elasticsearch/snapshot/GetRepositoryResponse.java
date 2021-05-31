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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.base.AdditionalProperties;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;

// typedef: snapshot.get_repository.Response
public final class GetRepositoryResponse extends AdditionalProperties<String, Repository> {
	// ---------------------------------------------------------------------------------------------

	protected GetRepositoryResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRepositoryResponse}.
	 */
	public static class Builder extends AdditionalProperties.AbstractBuilder<String, Repository, Builder>
			implements
				ObjectBuilder<GetRepositoryResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRepositoryResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetRepositoryResponse
	 */
	public static final JsonpValueParser<GetRepositoryResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetRepositoryResponse::setupGetRepositoryResponseParser);

	protected static void setupGetRepositoryResponseParser(
			DelegatingJsonpValueParser<GetRepositoryResponse.Builder> op) {
		AdditionalProperties.setupAdditionalPropertiesParser(op, JsonpValueParser.stringParser(),
				Repository.JSONP_PARSER);

	}

}
