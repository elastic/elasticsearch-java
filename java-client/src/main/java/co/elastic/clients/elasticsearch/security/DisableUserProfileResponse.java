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

// typedef: security.disable_user_profile.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.disable_user_profile.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DisableUserProfileResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private DisableUserProfileResponse(Builder builder) {
		super(builder);

	}

	public static DisableUserProfileResponse of(Function<Builder, ObjectBuilder<DisableUserProfileResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DisableUserProfileResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DisableUserProfileResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DisableUserProfileResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DisableUserProfileResponse build() {
			_checkSingleUse();

			return new DisableUserProfileResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DisableUserProfileResponse}
	 */
	public static final JsonpDeserializer<DisableUserProfileResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DisableUserProfileResponse::setupDisableUserProfileResponseDeserializer);

	protected static void setupDisableUserProfileResponseDeserializer(
			ObjectDeserializer<DisableUserProfileResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
