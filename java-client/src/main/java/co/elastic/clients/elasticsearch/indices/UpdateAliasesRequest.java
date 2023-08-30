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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.update_aliases.Action;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.Request

/**
 * Adds a data stream or index to an alias.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.update_aliases.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateAliasesRequest extends RequestBase implements JsonpSerializable {
	private final List<Action> actions;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private UpdateAliasesRequest(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiable(builder.actions);
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public static UpdateAliasesRequest of(Function<Builder, ObjectBuilder<UpdateAliasesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Actions to perform.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<Action> actions() {
		return this.actions;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (Action item0 : this.actions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateAliasesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateAliasesRequest> {
		@Nullable
		private List<Action> actions;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Time timeout;

		/**
		 * Actions to perform.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<Action> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * Actions to perform.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(Action value, Action... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * Actions to perform.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds a value to <code>actions</code> using a builder lambda.
		 */
		public final Builder actions(Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return actions(fn.apply(new Action.Builder()).build());
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateAliasesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateAliasesRequest build() {
			_checkSingleUse();

			return new UpdateAliasesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateAliasesRequest}
	 */
	public static final JsonpDeserializer<UpdateAliasesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateAliasesRequest::setupUpdateAliasesRequestDeserializer);

	protected static void setupUpdateAliasesRequestDeserializer(ObjectDeserializer<UpdateAliasesRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(Action._DESERIALIZER), "actions");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.update_aliases}".
	 */
	public static final Endpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.update_aliases",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_aliases";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateAliasesResponse._DESERIALIZER);
}
