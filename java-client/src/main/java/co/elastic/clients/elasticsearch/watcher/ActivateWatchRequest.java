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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher.activate_watch.Request

/**
 * Activates a currently inactive watch.
 * 
 * @see <a href="../doc-files/api-spec.html#watcher.activate_watch.Request">API
 *      specification</a>
 */

public class ActivateWatchRequest extends RequestBase {
	private final String watchId;

	// ---------------------------------------------------------------------------------------------

	private ActivateWatchRequest(Builder builder) {

		this.watchId = ApiTypeHelper.requireNonNull(builder.watchId, this, "watchId");

	}

	public static ActivateWatchRequest of(Function<Builder, ObjectBuilder<ActivateWatchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Watch ID
	 * <p>
	 * API name: {@code watch_id}
	 */
	public final String watchId() {
		return this.watchId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActivateWatchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ActivateWatchRequest> {
		private String watchId;

		/**
		 * Required - Watch ID
		 * <p>
		 * API name: {@code watch_id}
		 */
		public final Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ActivateWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActivateWatchRequest build() {
			_checkSingleUse();

			return new ActivateWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.activate_watch}".
	 */
	public static final Endpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.activate_watch",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _watchId = 1 << 0;

				int propsSet = 0;

				propsSet |= _watchId;

				if (propsSet == (_watchId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.watchId, buf);
					buf.append("/_activate");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ActivateWatchResponse._DESERIALIZER);
}
