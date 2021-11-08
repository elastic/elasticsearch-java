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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.recovery.Request

public class RecoveryRequest extends RequestBase {
	@Nullable
	private final Boolean activeOnly;

	@Nullable
	private final Boolean detailed;

	private final List<String> index;

	// ---------------------------------------------------------------------------------------------

	private RecoveryRequest(Builder builder) {

		this.activeOnly = builder.activeOnly;
		this.detailed = builder.detailed;
		this.index = ModelTypeHelper.unmodifiable(builder.index);

	}

	public static RecoveryRequest of(Function<Builder, ObjectBuilder<RecoveryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Display only those recoveries that are currently on-going
	 * <p>
	 * API name: {@code active_only}
	 */
	@Nullable
	public final Boolean activeOnly() {
		return this.activeOnly;
	}

	/**
	 * Whether to display detailed information about shard recovery
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
	}

	/**
	 * A comma-separated list of index names; use <code>_all</code> or empty string
	 * to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RecoveryRequest> {
		@Nullable
		private Boolean activeOnly;

		@Nullable
		private Boolean detailed;

		@Nullable
		private List<String> index;

		/**
		 * Display only those recoveries that are currently on-going
		 * <p>
		 * API name: {@code active_only}
		 */
		public final Builder activeOnly(@Nullable Boolean value) {
			this.activeOnly = value;
			return this;
		}

		/**
		 * Whether to display detailed information about shard recovery
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link RecoveryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryRequest build() {
			_checkSingleUse();

			return new RecoveryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.recovery}".
	 */
	public static final Endpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_recovery");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_recovery");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.activeOnly != null) {
					params.put("active_only", String.valueOf(request.activeOnly));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, RecoveryResponse._DESERIALIZER);
}
