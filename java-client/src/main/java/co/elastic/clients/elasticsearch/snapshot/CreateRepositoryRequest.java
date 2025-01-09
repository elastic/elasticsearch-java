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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
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
import jakarta.json.stream.JsonParser;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
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

// typedef: snapshot.create_repository.Request

/**
 * Create or update a snapshot repository. IMPORTANT: If you are migrating
 * searchable snapshots, the repository name must be identical in the source and
 * destination clusters. To register a snapshot repository, the cluster's global
 * metadata must be writeable. Ensure there are no cluster blocks (for example,
 * <code>cluster.blocks.read_only</code> and
 * <code>clsuter.blocks.read_only_allow_delete</code> settings) that prevent
 * write access.
 * <p>
 * Several options for this API can be specified using a query parameter or a
 * request body parameter. If both parameters are specified, only the query
 * parameter is used.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.create_repository.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateRepositoryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time masterTimeout;

	private final String name;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean verify;

	private final Repository repository;

	// ---------------------------------------------------------------------------------------------

	private CreateRepositoryRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.timeout = builder.timeout;
		this.verify = builder.verify;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");

	}

	public static CreateRepositoryRequest of(Function<Builder, ObjectBuilder<CreateRepositoryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The name of the snapshot repository to register or update.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * The period to wait for a response from all relevant nodes in the cluster
	 * after updating the cluster metadata. If no response is received before the
	 * timeout expires, the cluster metadata update still applies but the response
	 * will indicate that it was not completely acknowledged. To indicate that the
	 * request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * If <code>true</code>, the request verifies the repository is functional on
	 * all master and data nodes in the cluster. If <code>false</code>, this
	 * verification is skipped. You can also perform this verification with the
	 * verify snapshot repository API.
	 * <p>
	 * API name: {@code verify}
	 */
	@Nullable
	public final Boolean verify() {
		return this.verify;
	}

	/**
	 * Required - Request body.
	 */
	public final Repository repository() {
		return this.repository;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.repository.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateRepositoryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CreateRepositoryRequest> {
		@Nullable
		private Time masterTimeout;

		private String name;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean verify;

		private Repository repository;

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The name of the snapshot repository to register or update.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * will indicate that it was not completely acknowledged. To indicate that the
		 * request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * will indicate that it was not completely acknowledged. To indicate that the
		 * request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request verifies the repository is functional on
		 * all master and data nodes in the cluster. If <code>false</code>, this
		 * verification is skipped. You can also perform this verification with the
		 * verify snapshot repository API.
		 * <p>
		 * API name: {@code verify}
		 */
		public final Builder verify(@Nullable Boolean value) {
			this.verify = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder repository(Repository value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder repository(Function<Repository.Builder, ObjectBuilder<Repository>> fn) {
			return this.repository(fn.apply(new Repository.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Repository value = (Repository) Repository._DESERIALIZER.deserialize(parser, mapper);
			return this.repository(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateRepositoryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateRepositoryRequest build() {
			_checkSingleUse();

			return new CreateRepositoryRequest(this);
		}
	}

	public static final JsonpDeserializer<CreateRepositoryRequest> _DESERIALIZER = createCreateRepositoryRequestDeserializer();
	protected static JsonpDeserializer<CreateRepositoryRequest> createCreateRepositoryRequestDeserializer() {

		JsonpDeserializer<Repository> valueDeserializer = Repository._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.repository(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.create_repository}".
	 */
	public static final Endpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.create_repository",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.verify != null) {
					params.put("verify", String.valueOf(request.verify));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CreateRepositoryResponse._DESERIALIZER);
}
