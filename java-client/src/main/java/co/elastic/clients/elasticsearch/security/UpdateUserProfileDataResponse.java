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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: security.update_user_profile_data.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.update_user_profile_data.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateUserProfileDataResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private UpdateUserProfileDataResponse(Builder builder) {
		super(builder);

	}

	public static UpdateUserProfileDataResponse of(Function<Builder, ObjectBuilder<UpdateUserProfileDataResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateUserProfileDataResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateUserProfileDataResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateUserProfileDataResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateUserProfileDataResponse build() {
			_checkSingleUse();

			return new UpdateUserProfileDataResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateUserProfileDataResponse}
	 */
	public static final JsonpDeserializer<UpdateUserProfileDataResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateUserProfileDataResponse::setupUpdateUserProfileDataResponseDeserializer);

	protected static void setupUpdateUserProfileDataResponseDeserializer(
			ObjectDeserializer<UpdateUserProfileDataResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
