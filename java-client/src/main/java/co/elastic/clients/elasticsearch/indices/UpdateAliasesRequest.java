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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.update_aliases.IndicesUpdateAliasBulk;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.Request
@JsonpDeserializable
public final class UpdateAliasesRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	@Nullable
	private final List<IndicesUpdateAliasBulk> actions;

	// ---------------------------------------------------------------------------------------------

	public UpdateAliasesRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.actions = ModelTypeHelper.unmodifiable(builder.actions);

	}

	public UpdateAliasesRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Request timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code actions}
	 */
	@Nullable
	public List<IndicesUpdateAliasBulk> actions() {
		return this.actions;
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

		if (this.actions != null) {

			generator.writeKey("actions");
			generator.writeStartArray();
			for (IndicesUpdateAliasBulk item0 : this.actions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateAliasesRequest}.
	 */
	public static class Builder implements ObjectBuilder<UpdateAliasesRequest> {
		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		@Nullable
		private List<IndicesUpdateAliasBulk> actions;

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Request timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(@Nullable List<IndicesUpdateAliasBulk> value) {
			this.actions = value;
			return this;
		}

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(IndicesUpdateAliasBulk... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(IndicesUpdateAliasBulk value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * Set {@link #actions(List)} to a singleton list.
		 */
		public Builder actions(Function<IndicesUpdateAliasBulk.Builder, ObjectBuilder<IndicesUpdateAliasBulk>> fn) {
			return this.actions(fn.apply(new IndicesUpdateAliasBulk.Builder()).build());
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(Function<IndicesUpdateAliasBulk.Builder, ObjectBuilder<IndicesUpdateAliasBulk>> fn) {
			return this.addActions(fn.apply(new IndicesUpdateAliasBulk.Builder()).build());
		}

		/**
		 * Builds a {@link UpdateAliasesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateAliasesRequest build() {

			return new UpdateAliasesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateAliasesRequest}
	 */
	public static final JsonpDeserializer<UpdateAliasesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateAliasesRequest::setupUpdateAliasesRequestDeserializer, Builder::build);

	protected static void setupUpdateAliasesRequestDeserializer(
			DelegatingDeserializer<UpdateAliasesRequest.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(IndicesUpdateAliasBulk._DESERIALIZER), "actions");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.update_aliases}".
	 */
	public static final Endpoint<UpdateAliasesRequest, UpdateAliasesResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_aliases";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, UpdateAliasesResponse._DESERIALIZER);
}
