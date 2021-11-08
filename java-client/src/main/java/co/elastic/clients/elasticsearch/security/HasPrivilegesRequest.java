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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges.Request
@JsonpDeserializable
public class HasPrivilegesRequest extends RequestBase implements JsonpSerializable {
	private final List<ApplicationPrivilegesCheck> application;

	private final List<ClusterPrivilege> cluster;

	private final List<IndexPrivilegesCheck> index;

	@Nullable
	private final String user;

	// ---------------------------------------------------------------------------------------------

	private HasPrivilegesRequest(Builder builder) {

		this.application = ModelTypeHelper.unmodifiable(builder.application);
		this.cluster = ModelTypeHelper.unmodifiable(builder.cluster);
		this.index = ModelTypeHelper.unmodifiable(builder.index);
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
	 * API name: {@code cluster}
	 */
	public final List<ClusterPrivilege> cluster() {
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

		if (ModelTypeHelper.isDefined(this.application)) {
			generator.writeKey("application");
			generator.writeStartArray();
			for (ApplicationPrivilegesCheck item0 : this.application) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.cluster)) {
			generator.writeKey("cluster");
			generator.writeStartArray();
			for (ClusterPrivilege item0 : this.cluster) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.index)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HasPrivilegesRequest> {
		@Nullable
		private List<ApplicationPrivilegesCheck> application;

		@Nullable
		private List<ClusterPrivilege> cluster;

		@Nullable
		private List<IndexPrivilegesCheck> index;

		@Nullable
		private String user;

		/**
		 * API name: {@code application}
		 */
		public final Builder application(@Nullable List<ApplicationPrivilegesCheck> value) {
			this.application = value;
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		public final Builder application(ApplicationPrivilegesCheck... value) {
			this.application = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		@SafeVarargs
		public final Builder application(
				Function<ApplicationPrivilegesCheck.Builder, ObjectBuilder<ApplicationPrivilegesCheck>>... fns) {
			this.application = new ArrayList<>(fns.length);
			for (Function<ApplicationPrivilegesCheck.Builder, ObjectBuilder<ApplicationPrivilegesCheck>> fn : fns) {
				this.application.add(fn.apply(new ApplicationPrivilegesCheck.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code cluster}
		 */
		public final Builder cluster(@Nullable List<ClusterPrivilege> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * API name: {@code cluster}
		 */
		public final Builder cluster(ClusterPrivilege... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<IndexPrivilegesCheck> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(IndexPrivilegesCheck... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		@SafeVarargs
		public final Builder index(Function<IndexPrivilegesCheck.Builder, ObjectBuilder<IndexPrivilegesCheck>>... fns) {
			this.index = new ArrayList<>(fns.length);
			for (Function<IndexPrivilegesCheck.Builder, ObjectBuilder<IndexPrivilegesCheck>> fn : fns) {
				this.index.add(fn.apply(new IndexPrivilegesCheck.Builder()).build());
			}
			return this;
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
			.lazy(Builder::new, HasPrivilegesRequest::setupHasPrivilegesRequestDeserializer, Builder::build);

	protected static void setupHasPrivilegesRequestDeserializer(
			DelegatingDeserializer<HasPrivilegesRequest.Builder> op) {

		op.add(Builder::application, JsonpDeserializer.arrayDeserializer(ApplicationPrivilegesCheck._DESERIALIZER),
				"application");
		op.add(Builder::cluster, JsonpDeserializer.arrayDeserializer(ClusterPrivilege._DESERIALIZER), "cluster");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(IndexPrivilegesCheck._DESERIALIZER), "index");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.has_privileges}".
	 */
	public static final Endpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, HasPrivilegesResponse._DESERIALIZER);
}
