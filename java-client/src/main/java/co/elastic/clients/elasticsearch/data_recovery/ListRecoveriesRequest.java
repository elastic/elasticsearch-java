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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
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

// typedef: data_recovery.list_recoveries.Request

/**
 * List recoveries.
 * <p>
 * List the recoveries that were started with the start recovery API, including
 * those that have finished. This API is intended for internal operator use.
 * Recoveries are ordered by start time, and the most recent are returned first
 * by default. To retrieve further pages, pass the start time and identifier of
 * the last recovery of a page as <code>search_after_started_at</code> and
 * <code>search_after_recovery_id</code>.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.list_recoveries.Request">API
 *      specification</a>
 */

public class ListRecoveriesRequest extends RequestBase {
	@Nullable
	private final SortOrder order;

	@Nullable
	private final String searchAfterRecoveryId;

	@Nullable
	private final DateTime searchAfterStartedAt;

	@Nullable
	private final Integer size;

	@Nullable
	private final DateTime startedAtGte;

	@Nullable
	private final DateTime startedAtLt;

	private final List<RecoveryRunStatus> status;

	// ---------------------------------------------------------------------------------------------

	private ListRecoveriesRequest(Builder builder) {

		this.order = builder.order;
		this.searchAfterRecoveryId = builder.searchAfterRecoveryId;
		this.searchAfterStartedAt = builder.searchAfterStartedAt;
		this.size = builder.size;
		this.startedAtGte = builder.startedAtGte;
		this.startedAtLt = builder.startedAtLt;
		this.status = ApiTypeHelper.unmodifiable(builder.status);

	}

	public static ListRecoveriesRequest of(Function<Builder, ObjectBuilder<ListRecoveriesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The order of the recoveries by start time.
	 * <p>
	 * API name: {@code order}
	 */
	@Nullable
	public final SortOrder order() {
		return this.order;
	}

	/**
	 * Return only recoveries after this identifier in the sort order for recoveries
	 * with the same start time, to retrieve the next page. It must be provided
	 * together with <code>search_after_started_at</code>.
	 * <p>
	 * API name: {@code search_after_recovery_id}
	 */
	@Nullable
	public final String searchAfterRecoveryId() {
		return this.searchAfterRecoveryId;
	}

	/**
	 * Return only recoveries after this start time in the sort order, to retrieve
	 * the next page. It must be provided together with
	 * <code>search_after_recovery_id</code>.
	 * <p>
	 * API name: {@code search_after_started_at}
	 */
	@Nullable
	public final DateTime searchAfterStartedAt() {
		return this.searchAfterStartedAt;
	}

	/**
	 * The maximum number of recoveries to return. The value must be between 1 and
	 * 1000.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Return only recoveries that started at or after this time, as an ISO-8601
	 * timestamp.
	 * <p>
	 * API name: {@code started_at_gte}
	 */
	@Nullable
	public final DateTime startedAtGte() {
		return this.startedAtGte;
	}

	/**
	 * Return only recoveries that started before this time, as an ISO-8601
	 * timestamp. It must not be earlier than <code>started_at_gte</code>.
	 * <p>
	 * API name: {@code started_at_lt}
	 */
	@Nullable
	public final DateTime startedAtLt() {
		return this.startedAtLt;
	}

	/**
	 * A comma-separated list of statuses. Return only recoveries with one of these
	 * statuses. By default, recoveries with any status are returned.
	 * <p>
	 * API name: {@code status}
	 */
	public final List<RecoveryRunStatus> status() {
		return this.status;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListRecoveriesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ListRecoveriesRequest> {
		@Nullable
		private SortOrder order;

		@Nullable
		private String searchAfterRecoveryId;

		@Nullable
		private DateTime searchAfterStartedAt;

		@Nullable
		private Integer size;

		@Nullable
		private DateTime startedAtGte;

		@Nullable
		private DateTime startedAtLt;

		@Nullable
		private List<RecoveryRunStatus> status;

		public Builder() {
		}
		private Builder(ListRecoveriesRequest instance) {
			this.order = instance.order;
			this.searchAfterRecoveryId = instance.searchAfterRecoveryId;
			this.searchAfterStartedAt = instance.searchAfterStartedAt;
			this.size = instance.size;
			this.startedAtGte = instance.startedAtGte;
			this.startedAtLt = instance.startedAtLt;
			this.status = instance.status;

		}
		/**
		 * The order of the recoveries by start time.
		 * <p>
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable SortOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * Return only recoveries after this identifier in the sort order for recoveries
		 * with the same start time, to retrieve the next page. It must be provided
		 * together with <code>search_after_started_at</code>.
		 * <p>
		 * API name: {@code search_after_recovery_id}
		 */
		public final Builder searchAfterRecoveryId(@Nullable String value) {
			this.searchAfterRecoveryId = value;
			return this;
		}

		/**
		 * Return only recoveries after this start time in the sort order, to retrieve
		 * the next page. It must be provided together with
		 * <code>search_after_recovery_id</code>.
		 * <p>
		 * API name: {@code search_after_started_at}
		 */
		public final Builder searchAfterStartedAt(@Nullable DateTime value) {
			this.searchAfterStartedAt = value;
			return this;
		}

		/**
		 * The maximum number of recoveries to return. The value must be between 1 and
		 * 1000.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Return only recoveries that started at or after this time, as an ISO-8601
		 * timestamp.
		 * <p>
		 * API name: {@code started_at_gte}
		 */
		public final Builder startedAtGte(@Nullable DateTime value) {
			this.startedAtGte = value;
			return this;
		}

		/**
		 * Return only recoveries that started before this time, as an ISO-8601
		 * timestamp. It must not be earlier than <code>started_at_gte</code>.
		 * <p>
		 * API name: {@code started_at_lt}
		 */
		public final Builder startedAtLt(@Nullable DateTime value) {
			this.startedAtLt = value;
			return this;
		}

		/**
		 * A comma-separated list of statuses. Return only recoveries with one of these
		 * statuses. By default, recoveries with any status are returned.
		 * <p>
		 * API name: {@code status}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>status</code>.
		 */
		public final Builder status(List<RecoveryRunStatus> list) {
			this.status = _listAddAll(this.status, list);
			return this;
		}

		/**
		 * A comma-separated list of statuses. Return only recoveries with one of these
		 * statuses. By default, recoveries with any status are returned.
		 * <p>
		 * API name: {@code status}
		 * <p>
		 * Adds one or more values to <code>status</code>.
		 */
		public final Builder status(RecoveryRunStatus value, RecoveryRunStatus... values) {
			this.status = _listAdd(this.status, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListRecoveriesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListRecoveriesRequest build() {
			_checkSingleUse();

			return new ListRecoveriesRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code data_recovery.list_recoveries}".
	 */
	public static final Endpoint<ListRecoveriesRequest, ListRecoveriesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/data_recovery.list_recoveries",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_data_recovery/recoveries";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.startedAtGte != null) {
					params.put("started_at_gte", request.startedAtGte.toString());
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.searchAfterRecoveryId != null) {
					params.put("search_after_recovery_id", request.searchAfterRecoveryId);
				}
				if (request.searchAfterStartedAt != null) {
					params.put("search_after_started_at", request.searchAfterStartedAt.toString());
				}
				if (request.startedAtLt != null) {
					params.put("started_at_lt", request.startedAtLt.toString());
				}
				if (request.order != null) {
					params.put("order", request.order.jsonValue());
				}
				if (ApiTypeHelper.isDefined(request.status)) {
					params.put("status", request.status.stream().map(v -> v.jsonValue()).filter(Objects::nonNull)
							.collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ListRecoveriesResponse._DESERIALIZER);
}
