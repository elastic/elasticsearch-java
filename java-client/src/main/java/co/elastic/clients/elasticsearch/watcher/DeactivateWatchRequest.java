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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher.deactivate_watch.Request

public final class DeactivateWatchRequest extends RequestBase {
	private final String watchId;

	// ---------------------------------------------------------------------------------------------

	public DeactivateWatchRequest(Builder builder) {

		this.watchId = Objects.requireNonNull(builder.watchId, "watch_id");

	}

	/**
	 * Watch ID
	 * <p>
	 * API name: {@code watch_id}
	 */
	public String watchId() {
		return this.watchId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeactivateWatchRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeactivateWatchRequest> {
		private String watchId;

		/**
		 * Watch ID
		 * <p>
		 * API name: {@code watch_id}
		 */
		public Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * Builds a {@link DeactivateWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeactivateWatchRequest build() {

			return new DeactivateWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.deactivate_watch}".
	 */
	public static final Endpoint<DeactivateWatchRequest, DeactivateWatchResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.watchId);
					buf.append("/_deactivate");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, DeactivateWatchResponse._DESERIALIZER);
}
