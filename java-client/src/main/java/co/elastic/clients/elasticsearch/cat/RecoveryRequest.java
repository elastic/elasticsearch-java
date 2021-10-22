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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.recovery.Request

public final class RecoveryRequest extends CatRequestBase {
	@Nullable
	private final Boolean activeOnly;

	@Nullable
	private final Bytes bytes;

	@Nullable
	private final Boolean detailed;

	@Nullable
	private final List<String> index;

	// ---------------------------------------------------------------------------------------------

	public RecoveryRequest(Builder builder) {

		this.activeOnly = builder.activeOnly;
		this.bytes = builder.bytes;
		this.detailed = builder.detailed;
		this.index = ModelTypeHelper.unmodifiable(builder.index);

	}

	public RecoveryRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * If <code>true</code>, the response only includes ongoing shard recoveries
	 * <p>
	 * API name: {@code active_only}
	 */
	@Nullable
	public Boolean activeOnly() {
		return this.activeOnly;
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public Bytes bytes() {
		return this.bytes;
	}

	/**
	 * If <code>true</code>, the response includes detailed information about shard
	 * recoveries
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public Boolean detailed() {
		return this.detailed;
	}

	/**
	 * Comma-separated list or wildcard expression of index names to limit the
	 * returned information
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryRequest}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryRequest> {
		@Nullable
		private Boolean activeOnly;

		@Nullable
		private Bytes bytes;

		@Nullable
		private Boolean detailed;

		@Nullable
		private List<String> index;

		/**
		 * If <code>true</code>, the response only includes ongoing shard recoveries
		 * <p>
		 * API name: {@code active_only}
		 */
		public Builder activeOnly(@Nullable Boolean value) {
			this.activeOnly = value;
			return this;
		}

		/**
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes detailed information about shard
		 * recoveries
		 * <p>
		 * API name: {@code detailed}
		 */
		public Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expression of index names to limit the
		 * returned information
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Comma-separated list or wildcard expression of index names to limit the
		 * returned information
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Builds a {@link RecoveryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryRequest build() {

			return new RecoveryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.recovery}".
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

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/recovery");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/recovery");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.activeOnly != null) {
					params.put("active_only", String.valueOf(request.activeOnly));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, RecoveryResponse._DESERIALIZER);
}
