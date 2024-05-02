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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: connector.sync_job_list.Request

/**
 * Lists connector sync jobs.
 * 
 * @see <a href="../doc-files/api-spec.html#connector.sync_job_list.Request">API
 *      specification</a>
 */

public class SyncJobListRequest extends RequestBase {
	@Nullable
	private final String connectorId;

	@Nullable
	private final Integer from;

	private final List<SyncJobType> jobType;

	@Nullable
	private final Integer size;

	@Nullable
	private final SyncStatus status;

	// ---------------------------------------------------------------------------------------------

	private SyncJobListRequest(Builder builder) {

		this.connectorId = builder.connectorId;
		this.from = builder.from;
		this.jobType = ApiTypeHelper.unmodifiable(builder.jobType);
		this.size = builder.size;
		this.status = builder.status;

	}

	public static SyncJobListRequest of(Function<Builder, ObjectBuilder<SyncJobListRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A connector id to fetch connector sync jobs for
	 * <p>
	 * API name: {@code connector_id}
	 */
	@Nullable
	public final String connectorId() {
		return this.connectorId;
	}

	/**
	 * Starting offset (default: 0)
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * A comma-separated list of job types to fetch the sync jobs for
	 * <p>
	 * API name: {@code job_type}
	 */
	public final List<SyncJobType> jobType() {
		return this.jobType;
	}

	/**
	 * Specifies a max number of results to get
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * A sync job status to fetch connector sync jobs for
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final SyncStatus status() {
		return this.status;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncJobListRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SyncJobListRequest> {
		@Nullable
		private String connectorId;

		@Nullable
		private Integer from;

		@Nullable
		private List<SyncJobType> jobType;

		@Nullable
		private Integer size;

		@Nullable
		private SyncStatus status;

		/**
		 * A connector id to fetch connector sync jobs for
		 * <p>
		 * API name: {@code connector_id}
		 */
		public final Builder connectorId(@Nullable String value) {
			this.connectorId = value;
			return this;
		}

		/**
		 * Starting offset (default: 0)
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * A comma-separated list of job types to fetch the sync jobs for
		 * <p>
		 * API name: {@code job_type}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jobType</code>.
		 */
		public final Builder jobType(List<SyncJobType> list) {
			this.jobType = _listAddAll(this.jobType, list);
			return this;
		}

		/**
		 * A comma-separated list of job types to fetch the sync jobs for
		 * <p>
		 * API name: {@code job_type}
		 * <p>
		 * Adds one or more values to <code>jobType</code>.
		 */
		public final Builder jobType(SyncJobType value, SyncJobType... values) {
			this.jobType = _listAdd(this.jobType, value, values);
			return this;
		}

		/**
		 * Specifies a max number of results to get
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * A sync job status to fetch connector sync jobs for
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable SyncStatus value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncJobListRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncJobListRequest build() {
			_checkSingleUse();

			return new SyncJobListRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.sync_job_list}".
	 */
	public static final Endpoint<SyncJobListRequest, SyncJobListResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.sync_job_list",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_connector/_sync_job";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.jobType)) {
					params.put("job_type",
							request.jobType.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.connectorId != null) {
					params.put("connector_id", request.connectorId);
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.status != null) {
					params.put("status", request.status.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, SyncJobListResponse._DESERIALIZER);
}
