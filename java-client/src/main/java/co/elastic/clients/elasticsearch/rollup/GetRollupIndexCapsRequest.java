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

package co.elastic.clients.elasticsearch.rollup;

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

// typedef: rollup.get_rollup_index_caps.Request

/**
 * Returns the rollup capabilities of all jobs inside of a rollup index (e.g.
 * the index where rollup data is stored).
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#rollup.get_rollup_index_caps.Request">API
 *      specification</a>
 */

public class GetRollupIndexCapsRequest extends RequestBase {
	private final String index;

	// ---------------------------------------------------------------------------------------------

	private GetRollupIndexCapsRequest(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");

	}

	public static GetRollupIndexCapsRequest of(Function<Builder, ObjectBuilder<GetRollupIndexCapsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The rollup index or index pattern to obtain rollup capabilities
	 * from.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRollupIndexCapsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetRollupIndexCapsRequest> {
		private String index;

		/**
		 * Required - The rollup index or index pattern to obtain rollup capabilities
		 * from.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRollupIndexCapsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRollupIndexCapsRequest build() {
			_checkSingleUse();

			return new GetRollupIndexCapsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.get_rollup_index_caps}".
	 */
	public static final Endpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/rollup.get_rollup_index_caps",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_rollup");
					buf.append("/data");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetRollupIndexCapsResponse._DESERIALIZER);
}
