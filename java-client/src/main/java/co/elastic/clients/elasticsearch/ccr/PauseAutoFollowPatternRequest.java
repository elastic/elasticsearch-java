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

package co.elastic.clients.elasticsearch.ccr;

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

// typedef: ccr.pause_auto_follow_pattern.Request

/**
 * Pauses an auto-follow pattern
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ccr.pause_auto_follow_pattern.Request">API
 *      specification</a>
 */

public class PauseAutoFollowPatternRequest extends RequestBase {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private PauseAutoFollowPatternRequest(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static PauseAutoFollowPatternRequest of(Function<Builder, ObjectBuilder<PauseAutoFollowPatternRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the auto follow pattern that should pause discovering
	 * new indices to follow.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PauseAutoFollowPatternRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PauseAutoFollowPatternRequest> {
		private String name;

		/**
		 * Required - The name of the auto follow pattern that should pause discovering
		 * new indices to follow.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PauseAutoFollowPatternRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PauseAutoFollowPatternRequest build() {
			_checkSingleUse();

			return new PauseAutoFollowPatternRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ccr.pause_auto_follow_pattern}".
	 */
	public static final Endpoint<PauseAutoFollowPatternRequest, PauseAutoFollowPatternResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ccr.pause_auto_follow_pattern",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ccr");
					buf.append("/auto_follow");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					buf.append("/pause");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, PauseAutoFollowPatternResponse._DESERIALIZER);
}
