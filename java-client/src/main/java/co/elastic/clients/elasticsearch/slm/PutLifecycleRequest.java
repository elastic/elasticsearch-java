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

package co.elastic.clients.elasticsearch.slm;

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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm.put_lifecycle.Request
@JsonpDeserializable
public class PutLifecycleRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Configuration config;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String name;

	private final String policyId;

	@Nullable
	private final String repository;

	@Nullable
	private final Retention retention;

	@Nullable
	private final String schedule;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private PutLifecycleRequest(Builder builder) {

		this.config = builder.config;
		this.masterTimeout = builder.masterTimeout;
		this.name = builder.name;
		this.policyId = ModelTypeHelper.requireNonNull(builder.policyId, this, "policyId");
		this.repository = builder.repository;
		this.retention = builder.retention;
		this.schedule = builder.schedule;
		this.timeout = builder.timeout;

	}

	public static PutLifecycleRequest of(Function<Builder, ObjectBuilder<PutLifecycleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Configuration for each snapshot created by the policy.
	 * <p>
	 * API name: {@code config}
	 */
	@Nullable
	public final Configuration config() {
		return this.config;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Name automatically assigned to each snapshot created by the policy. Date math
	 * is supported. To prevent conflicting snapshot names, a UUID is automatically
	 * appended to each snapshot name.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * Required - ID for the snapshot lifecycle policy you want to create or update.
	 * <p>
	 * API name: {@code policy_id}
	 */
	public final String policyId() {
		return this.policyId;
	}

	/**
	 * Repository used to store snapshots created by this policy. This repository
	 * must exist prior to the policy’s creation. You can create a repository using
	 * the snapshot repository API.
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public final String repository() {
		return this.repository;
	}

	/**
	 * Retention rules used to retain and delete snapshots created by the policy.
	 * <p>
	 * API name: {@code retention}
	 */
	@Nullable
	public final Retention retention() {
		return this.retention;
	}

	/**
	 * Periodic or absolute schedule at which the policy creates snapshots. SLM
	 * applies schedule changes immediately.
	 * <p>
	 * API name: {@code schedule}
	 */
	@Nullable
	public final String schedule() {
		return this.schedule;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
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

		if (this.config != null) {
			generator.writeKey("config");
			this.config.serialize(generator, mapper);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.repository != null) {
			generator.writeKey("repository");
			generator.write(this.repository);

		}
		if (this.retention != null) {
			generator.writeKey("retention");
			this.retention.serialize(generator, mapper);

		}
		if (this.schedule != null) {
			generator.writeKey("schedule");
			generator.write(this.schedule);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutLifecycleRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutLifecycleRequest> {
		@Nullable
		private Configuration config;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String name;

		private String policyId;

		@Nullable
		private String repository;

		@Nullable
		private Retention retention;

		@Nullable
		private String schedule;

		@Nullable
		private String timeout;

		/**
		 * Configuration for each snapshot created by the policy.
		 * <p>
		 * API name: {@code config}
		 */
		public final Builder config(@Nullable Configuration value) {
			this.config = value;
			return this;
		}

		/**
		 * Configuration for each snapshot created by the policy.
		 * <p>
		 * API name: {@code config}
		 */
		public final Builder config(Function<Configuration.Builder, ObjectBuilder<Configuration>> fn) {
			return this.config(fn.apply(new Configuration.Builder()).build());
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Name automatically assigned to each snapshot created by the policy. Date math
		 * is supported. To prevent conflicting snapshot names, a UUID is automatically
		 * appended to each snapshot name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - ID for the snapshot lifecycle policy you want to create or update.
		 * <p>
		 * API name: {@code policy_id}
		 */
		public final Builder policyId(String value) {
			this.policyId = value;
			return this;
		}

		/**
		 * Repository used to store snapshots created by this policy. This repository
		 * must exist prior to the policy’s creation. You can create a repository using
		 * the snapshot repository API.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Retention rules used to retain and delete snapshots created by the policy.
		 * <p>
		 * API name: {@code retention}
		 */
		public final Builder retention(@Nullable Retention value) {
			this.retention = value;
			return this;
		}

		/**
		 * Retention rules used to retain and delete snapshots created by the policy.
		 * <p>
		 * API name: {@code retention}
		 */
		public final Builder retention(Function<Retention.Builder, ObjectBuilder<Retention>> fn) {
			return this.retention(fn.apply(new Retention.Builder()).build());
		}

		/**
		 * Periodic or absolute schedule at which the policy creates snapshots. SLM
		 * applies schedule changes immediately.
		 * <p>
		 * API name: {@code schedule}
		 */
		public final Builder schedule(@Nullable String value) {
			this.schedule = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link PutLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutLifecycleRequest build() {
			_checkSingleUse();

			return new PutLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutLifecycleRequest}
	 */
	public static final JsonpDeserializer<PutLifecycleRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutLifecycleRequest::setupPutLifecycleRequestDeserializer, Builder::build);

	protected static void setupPutLifecycleRequestDeserializer(DelegatingDeserializer<PutLifecycleRequest.Builder> op) {

		op.add(Builder::config, Configuration._DESERIALIZER, "config");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::retention, Retention._DESERIALIZER, "retention");
		op.add(Builder::schedule, JsonpDeserializer.stringDeserializer(), "schedule");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code slm.put_lifecycle}".
	 */
	public static final Endpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _policyId = 1 << 0;

				int propsSet = 0;

				propsSet |= _policyId;

				if (propsSet == (_policyId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_slm");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.policyId, buf);
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
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutLifecycleResponse._DESERIALIZER);
}
