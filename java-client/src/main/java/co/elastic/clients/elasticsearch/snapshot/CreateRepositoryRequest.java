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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.create_repository.Request
@JsonpDeserializable
public class CreateRepositoryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String masterTimeout;

	private final String name;

	@Nullable
	private final Repository repository;

	private final RepositorySettings settings;

	@Nullable
	private final String timeout;

	private final String type;

	@Nullable
	private final Boolean verify;

	// ---------------------------------------------------------------------------------------------

	private CreateRepositoryRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.repository = builder.repository;
		this.settings = ModelTypeHelper.requireNonNull(builder.settings, this, "settings");
		this.timeout = builder.timeout;
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.verify = builder.verify;

	}

	public static CreateRepositoryRequest of(Function<Builder, ObjectBuilder<CreateRepositoryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code repository}
	 */
	@Nullable
	public final Repository repository() {
		return this.repository;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final RepositorySettings settings() {
		return this.settings;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Whether to verify the repository after creation
	 * <p>
	 * API name: {@code verify}
	 */
	@Nullable
	public final Boolean verify() {
		return this.verify;
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

		if (this.repository != null) {
			generator.writeKey("repository");
			this.repository.serialize(generator, mapper);

		}
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateRepositoryRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CreateRepositoryRequest> {
		@Nullable
		private String masterTimeout;

		private String name;

		@Nullable
		private Repository repository;

		private RepositorySettings settings;

		@Nullable
		private String timeout;

		private String type;

		@Nullable
		private Boolean verify;

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Required - A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code repository}
		 */
		public final Builder repository(@Nullable Repository value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code repository}
		 */
		public final Builder repository(Function<Repository.Builder, ObjectBuilder<Repository>> fn) {
			return this.repository(fn.apply(new Repository.Builder()).build());
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(RepositorySettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Function<RepositorySettings.Builder, ObjectBuilder<RepositorySettings>> fn) {
			return this.settings(fn.apply(new RepositorySettings.Builder()).build());
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Whether to verify the repository after creation
		 * <p>
		 * API name: {@code verify}
		 */
		public final Builder verify(@Nullable Boolean value) {
			this.verify = value;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateRepositoryRequest}
	 */
	public static final JsonpDeserializer<CreateRepositoryRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateRepositoryRequest::setupCreateRepositoryRequestDeserializer, Builder::build);

	protected static void setupCreateRepositoryRequestDeserializer(
			DelegatingDeserializer<CreateRepositoryRequest.Builder> op) {

		op.add(Builder::repository, Repository._DESERIALIZER, "repository");
		op.add(Builder::settings, RepositorySettings._DESERIALIZER, "settings");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.create_repository}".
	 */
	public static final Endpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.verify != null) {
					params.put("verify", String.valueOf(request.verify));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CreateRepositoryResponse._DESERIALIZER);
}
