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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: watcher.ack_watch.Request

public final class AckWatchRequest extends RequestBase {
	@Nullable
	private final List<String> actionId;

	private final String watchId;

	// ---------------------------------------------------------------------------------------------

	public AckWatchRequest(Builder builder) {

		this.actionId = ModelTypeHelper.unmodifiable(builder.actionId);
		this.watchId = Objects.requireNonNull(builder.watchId, "watch_id");

	}

	public AckWatchRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of the action ids to be acked
	 * <p>
	 * API name: {@code action_id}
	 */
	@Nullable
	public List<String> actionId() {
		return this.actionId;
	}

	/**
	 * Required - Watch ID
	 * <p>
	 * API name: {@code watch_id}
	 */
	public String watchId() {
		return this.watchId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AckWatchRequest}.
	 */
	public static class Builder implements ObjectBuilder<AckWatchRequest> {
		@Nullable
		private List<String> actionId;

		private String watchId;

		/**
		 * A comma-separated list of the action ids to be acked
		 * <p>
		 * API name: {@code action_id}
		 */
		public Builder actionId(@Nullable List<String> value) {
			this.actionId = value;
			return this;
		}

		/**
		 * A comma-separated list of the action ids to be acked
		 * <p>
		 * API name: {@code action_id}
		 */
		public Builder actionId(String... value) {
			this.actionId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actionId(List)}, creating the list if needed.
		 */
		public Builder addActionId(String value) {
			if (this.actionId == null) {
				this.actionId = new ArrayList<>();
			}
			this.actionId.add(value);
			return this;
		}

		/**
		 * Required - Watch ID
		 * <p>
		 * API name: {@code watch_id}
		 */
		public Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * Builds a {@link AckWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AckWatchRequest build() {

			return new AckWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.ack_watch}".
	 */
	public static final Endpoint<AckWatchRequest, AckWatchResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _watchId = 1 << 0;
				final int _actionId = 1 << 1;

				int propsSet = 0;

				propsSet |= _watchId;
				if (request.actionId() != null)
					propsSet |= _actionId;

				if (propsSet == (_watchId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.watchId, buf);
					buf.append("/_ack");
					return buf.toString();
				}
				if (propsSet == (_watchId | _actionId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.watchId, buf);
					buf.append("/_ack");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.actionId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, AckWatchResponse._DESERIALIZER);
}
