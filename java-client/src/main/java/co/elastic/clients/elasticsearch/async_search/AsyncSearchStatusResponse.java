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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch.async_search.status.StatusResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: async_search.status.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#async_search.status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class AsyncSearchStatusResponse extends StatusResponseBase {
	// ---------------------------------------------------------------------------------------------

	private AsyncSearchStatusResponse(Builder builder) {
		super(builder);

	}

	public static AsyncSearchStatusResponse of(Function<Builder, ObjectBuilder<AsyncSearchStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncSearchStatusResponse}.
	 */

	public static class Builder extends StatusResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AsyncSearchStatusResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AsyncSearchStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsyncSearchStatusResponse build() {
			_checkSingleUse();

			return new AsyncSearchStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AsyncSearchStatusResponse}
	 */
	public static final JsonpDeserializer<AsyncSearchStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AsyncSearchStatusResponse::setupAsyncSearchStatusResponseDeserializer);

	protected static void setupAsyncSearchStatusResponseDeserializer(
			ObjectDeserializer<AsyncSearchStatusResponse.Builder> op) {
		StatusResponseBase.setupStatusResponseBaseDeserializer(op);

	}

}
