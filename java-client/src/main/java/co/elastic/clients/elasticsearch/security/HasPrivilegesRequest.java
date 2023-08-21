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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.has_privileges.ApplicationPrivilegesCheck;
import co.elastic.clients.elasticsearch.security.has_privileges.IndexPrivilegesCheck;
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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges.Request

/**
 * Determines whether the specified user has a specified list of privileges.
 * 
 * @see <a href="../doc-files/api-spec.html#security.has_privileges.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class HasPrivilegesRequest extends RequestBase implements JsonpSerializable {
	private final List<ApplicationPrivilegesCheck> application;

	private final List<String> cluster;

	private final List<IndexPrivilegesCheck> index;

	@Nullable
	private final String user;

	// ---------------------------------------------------------------------------------------------

	private HasPrivilegesRequest(Builder builder) {

		this.application = ApiTypeHelper.unmodifiable(builder.application);
		this.cluster = ApiTypeHelper.unmodifiable(builder.cluster);
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.user = builder.user;

	}

	public static HasPrivilegesRequest of(Function<Builder, ObjectBuilder<HasPrivilegesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code application}
	 */
	public final List<ApplicationPrivilegesCheck> application() {
		return this.application;
	}

	/**
	 * A list of the cluster privileges that you want to check.
	 * <p>
	 * API name: {@code cluster}
	 */
	public final List<String> cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code index}
	 */
	public final List<IndexPrivilegesCheck> index() {
		return this.index;
	}

	/**
	 * Username
	 * <p>
	 * API name: {@code user}
	 */
	@Nullable
	public final String user() {
		return this.user;
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

		if (ApiTypeHelper.isDefined(this.application)) {
			generator.writeKey("application");
			generator.writeStartArray();
			for (ApplicationPrivilegesCheck item0 : this.application) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (IndexPrivilegesCheck item0 : this.index) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasPrivilegesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HasPrivilegesRequest> {
		@Nullable
		private List<ApplicationPrivilegesCheck> application;

		@Nullable
		private List<String> cluster;

		@Nullable
		private List<IndexPrivilegesCheck> index;

		@Nullable
		private String user;

		/**
		 * API name: {@code application}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>application</code>.
		 */
		public final Builder application(List<ApplicationPrivilegesCheck> list) {
			this.application = _listAddAll(this.application, list);
			return this;
		}

		/**
		 * API name: {@code application}
		 * <p>
		 * Adds one or more values to <code>application</code>.
		 */
		public final Builder application(ApplicationPrivilegesCheck value, ApplicationPrivilegesCheck... values) {
			this.application = _listAdd(this.application, value, values);
			return this;
		}

		/**
		 * API name: {@code application}
		 * <p>
		 * Adds a value to <code>application</code> using a builder lambda.
		 */
		public final Builder application(
				Function<ApplicationPrivilegesCheck.Builder, ObjectBuilder<ApplicationPrivilegesCheck>> fn) {
			return application(fn.apply(new ApplicationPrivilegesCheck.Builder()).build());
		}

		/**
		 * A list of the cluster privileges that you want to check.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cluster</code>.
		 */
		public final Builder cluster(List<String> list) {
			this.cluster = _listAddAll(this.cluster, list);
			return this;
		}

		/**
		 * A list of the cluster privileges that you want to check.
		 * <p>
		 * API name: {@code cluster}
		 * <p>
		 * Adds one or more values to <code>cluster</code>.
		 */
		public final Builder cluster(String value, String... values) {
			this.cluster = _listAdd(this.cluster, value, values);
			return this;
		}

		/**
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<IndexPrivilegesCheck> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(IndexPrivilegesCheck value, IndexPrivilegesCheck... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * API name: {@code index}
		 * <p>
		 * Adds a value to <code>index</code> using a builder lambda.
		 */
		public final Builder index(Function<IndexPrivilegesCheck.Builder, ObjectBuilder<IndexPrivilegesCheck>> fn) {
			return index(fn.apply(new IndexPrivilegesCheck.Builder()).build());
		}

		/**
		 * Username
		 * <p>
		 * API name: {@code user}
		 */
		public final Builder user(@Nullable String value) {
			this.user = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HasPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasPrivilegesRequest build() {
			_checkSingleUse();

			return new HasPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HasPrivilegesRequest}
	 */
	public static final JsonpDeserializer<HasPrivilegesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HasPrivilegesRequest::setupHasPrivilegesRequestDeserializer);

	protected static void setupHasPrivilegesRequestDeserializer(ObjectDeserializer<HasPrivilegesRequest.Builder> op) {

		op.add(Builder::application, JsonpDeserializer.arrayDeserializer(ApplicationPrivilegesCheck._DESERIALIZER),
				"application");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"cluster");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(IndexPrivilegesCheck._DESERIALIZER), "index");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.has_privileges}".
	 */
	public static final Endpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.has_privileges",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _user = 1 << 0;

				int propsSet = 0;

				if (request.user() != null)
					propsSet |= _user;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/_has_privileges");
					return buf.toString();
				}
				if (propsSet == (_user)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.user, buf);
					buf.append("/_has_privileges");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _user = 1 << 0;

				int propsSet = 0;

				if (request.user() != null)
					propsSet |= _user;

				if (propsSet == 0) {
				}
				if (propsSet == (_user)) {
					params.put("user", request.user);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, HasPrivilegesResponse._DESERIALIZER);
}
