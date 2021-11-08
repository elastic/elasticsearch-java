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

import co.elastic.clients.elasticsearch.security.get_service_accounts.RoleDescriptorWrapper;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;

// typedef: security.get_service_accounts.Response
@JsonpDeserializable
public class GetServiceAccountsResponse extends DictionaryResponse<String, RoleDescriptorWrapper> {
	// ---------------------------------------------------------------------------------------------

	private GetServiceAccountsResponse(Builder builder) {
		super(builder);

	}

	public static GetServiceAccountsResponse of(Function<Builder, ObjectBuilder<GetServiceAccountsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceAccountsResponse}.
	 */
	public static class Builder extends DictionaryResponse.AbstractBuilder<String, RoleDescriptorWrapper, Builder>
			implements
				ObjectBuilder<GetServiceAccountsResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetServiceAccountsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceAccountsResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetServiceAccountsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetServiceAccountsResponse}
	 */
	public static final JsonpDeserializer<GetServiceAccountsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetServiceAccountsResponse::setupGetServiceAccountsResponseDeserializer, Builder::build);

	protected static void setupGetServiceAccountsResponseDeserializer(
			DelegatingDeserializer<GetServiceAccountsResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				RoleDescriptorWrapper._DESERIALIZER);

	}

}
