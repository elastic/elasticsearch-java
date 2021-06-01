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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.has_privileges.ApplicationPrivilegesCheck;
import co.elastic.clients.elasticsearch.security.has_privileges.IndexPrivilegesCheck;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges.Request
public final class HasPrivilegesRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String user;

	@Nullable
	private final List<ApplicationPrivilegesCheck> application;

	@Nullable
	private final List<String> cluster;

	@Nullable
	private final List<IndexPrivilegesCheck> index;

	// ---------------------------------------------------------------------------------------------

	protected HasPrivilegesRequest(Builder builder) {

		this.user = builder.user;
		this.application = builder.application;
		this.cluster = builder.cluster;
		this.index = builder.index;

	}

	/**
	 * API name: {@code user}
	 */
	@Nullable
	public String user() {
		return this.user;
	}

	/**
	 * API name: {@code application}
	 */
	@Nullable
	public List<ApplicationPrivilegesCheck> application() {
		return this.application;
	}

	/**
	 * API name: {@code cluster}
	 */
	@Nullable
	public List<String> cluster() {
		return this.cluster;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public List<IndexPrivilegesCheck> index() {
		return this.index;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.application != null) {

			generator.writeKey("application");
			generator.writeStartArray();
			for (ApplicationPrivilegesCheck item0 : this.application) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.cluster != null) {

			generator.writeKey("cluster");
			generator.writeStartArray();
			for (String item0 : this.cluster) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.writeStartArray();
			for (IndexPrivilegesCheck item0 : this.index) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasPrivilegesRequest}.
	 */
	public static class Builder implements ObjectBuilder<HasPrivilegesRequest> {
		@Nullable
		private String user;

		@Nullable
		private List<ApplicationPrivilegesCheck> application;

		@Nullable
		private List<String> cluster;

		@Nullable
		private List<IndexPrivilegesCheck> index;

		/**
		 * API name: {@code user}
		 */
		public Builder user(@Nullable String value) {
			this.user = value;
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		public Builder application(@Nullable List<ApplicationPrivilegesCheck> value) {
			this.application = value;
			return this;
		}

		/**
		 * API name: {@code application}
		 */
		public Builder application(ApplicationPrivilegesCheck... value) {
			this.application = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #application(List)}, creating the list if needed.
		 */
		public Builder addApplication(ApplicationPrivilegesCheck value) {
			if (this.application == null) {
				this.application = new ArrayList<>();
			}
			this.application.add(value);
			return this;
		}

		/**
		 * Set {@link #application(List)} to a singleton list.
		 */
		public Builder application(
				Function<ApplicationPrivilegesCheck.Builder, ObjectBuilder<ApplicationPrivilegesCheck>> fn) {
			return this.application(fn.apply(new ApplicationPrivilegesCheck.Builder()).build());
		}

		/**
		 * Add a value to {@link #application(List)}, creating the list if needed.
		 */
		public Builder addApplication(
				Function<ApplicationPrivilegesCheck.Builder, ObjectBuilder<ApplicationPrivilegesCheck>> fn) {
			return this.addApplication(fn.apply(new ApplicationPrivilegesCheck.Builder()).build());
		}

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(@Nullable List<String> value) {
			this.cluster = value;
			return this;
		}

		/**
		 * API name: {@code cluster}
		 */
		public Builder cluster(String... value) {
			this.cluster = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #cluster(List)}, creating the list if needed.
		 */
		public Builder addCluster(String value) {
			if (this.cluster == null) {
				this.cluster = new ArrayList<>();
			}
			this.cluster.add(value);
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<IndexPrivilegesCheck> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(IndexPrivilegesCheck... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(IndexPrivilegesCheck value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Set {@link #index(List)} to a singleton list.
		 */
		public Builder index(Function<IndexPrivilegesCheck.Builder, ObjectBuilder<IndexPrivilegesCheck>> fn) {
			return this.index(fn.apply(new IndexPrivilegesCheck.Builder()).build());
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(Function<IndexPrivilegesCheck.Builder, ObjectBuilder<IndexPrivilegesCheck>> fn) {
			return this.addIndex(fn.apply(new IndexPrivilegesCheck.Builder()).build());
		}

		/**
		 * Builds a {@link HasPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasPrivilegesRequest build() {

			return new HasPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for HasPrivilegesRequest
	 */
	public static final JsonpValueParser<HasPrivilegesRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, HasPrivilegesRequest::setupHasPrivilegesRequestParser);

	protected static void setupHasPrivilegesRequestParser(DelegatingJsonpValueParser<HasPrivilegesRequest.Builder> op) {

		op.add(Builder::application, JsonpValueParser.arrayParser(ApplicationPrivilegesCheck.JSONP_PARSER),
				"application");
		op.add(Builder::cluster, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "cluster");
		op.add(Builder::index, JsonpValueParser.arrayParser(IndexPrivilegesCheck.JSONP_PARSER), "index");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.has_privileges}".
	 */
	public static final Endpoint<HasPrivilegesRequest, HasPrivilegesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int user = 1 << 0;

				int propsSet = 0;

				if (request.user() != null)
					propsSet |= user;

				if (propsSet == (0 | 0 | 0))
					return "POST";
				if (propsSet == (0 | 0 | user | 0))
					return "POST";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int user = 1 << 0;

				int propsSet = 0;

				if (request.user() != null)
					propsSet |= user;

				if (propsSet == (0 | 0 | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/_has_privileges");
					return buf.toString();
				}
				if (propsSet == (0 | 0 | user | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					buf.append(request.user);
					buf.append("/_has_privileges");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, HasPrivilegesResponse.JSONP_PARSER);
}
