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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.query.Request

/**
 * Executes a SQL request
 * 
 * @see <a href="../doc-files/api-spec.html#sql.query.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean columnar;

	@Nullable
	private final String cursor;

	@Nullable
	private final Integer fetchSize;

	@Nullable
	private final Boolean fieldMultiValueLeniency;

	@Nullable
	private final Query filter;

	@Nullable
	private final String format;

	@Nullable
	private final Time pageTimeout;

	@Nullable
	private final String query;

	@Nullable
	private final Time requestTimeout;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private QueryRequest(Builder builder) {

		this.columnar = builder.columnar;
		this.cursor = builder.cursor;
		this.fetchSize = builder.fetchSize;
		this.fieldMultiValueLeniency = builder.fieldMultiValueLeniency;
		this.filter = builder.filter;
		this.format = builder.format;
		this.pageTimeout = builder.pageTimeout;
		this.query = builder.query;
		this.requestTimeout = builder.requestTimeout;
		this.timeZone = builder.timeZone;

	}

	public static QueryRequest of(Function<Builder, ObjectBuilder<QueryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code columnar}
	 */
	@Nullable
	public final Boolean columnar() {
		return this.columnar;
	}

	/**
	 * API name: {@code cursor}
	 */
	@Nullable
	public final String cursor() {
		return this.cursor;
	}

	/**
	 * The maximum number of rows (or entries) to return in one response
	 * <p>
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public final Integer fetchSize() {
		return this.fetchSize;
	}

	/**
	 * Throw an exception when encountering multiple values for a field (default) or
	 * be lenient and return the first value from the list (without any guarantees
	 * of what that will be - typically the first in natural ascending order).
	 * <p>
	 * API name: {@code field_multi_value_leniency}
	 */
	@Nullable
	public final Boolean fieldMultiValueLeniency() {
		return this.fieldMultiValueLeniency;
	}

	/**
	 * Optional Elasticsearch query DSL for additional filtering.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * a short version of the Accept header, e.g. json, yaml
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * The timeout before a pagination request fails.
	 * <p>
	 * API name: {@code page_timeout}
	 */
	@Nullable
	public final Time pageTimeout() {
		return this.pageTimeout;
	}

	/**
	 * SQL query to execute
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * The timeout before the request fails.
	 * <p>
	 * API name: {@code request_timeout}
	 */
	@Nullable
	public final Time requestTimeout() {
		return this.requestTimeout;
	}

	/**
	 * Time-zone in ISO 8601 used for executing the query on the server. More
	 * information available here.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
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

		if (this.columnar != null) {
			generator.writeKey("columnar");
			generator.write(this.columnar);

		}
		if (this.cursor != null) {
			generator.writeKey("cursor");
			generator.write(this.cursor);

		}
		if (this.fetchSize != null) {
			generator.writeKey("fetch_size");
			generator.write(this.fetchSize);

		}
		if (this.fieldMultiValueLeniency != null) {
			generator.writeKey("field_multi_value_leniency");
			generator.write(this.fieldMultiValueLeniency);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.pageTimeout != null) {
			generator.writeKey("page_timeout");
			this.pageTimeout.serialize(generator, mapper);

		}
		if (this.query != null) {
			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.requestTimeout != null) {
			generator.writeKey("request_timeout");
			this.requestTimeout.serialize(generator, mapper);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRequest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<QueryRequest> {
		@Nullable
		private Boolean columnar;

		@Nullable
		private String cursor;

		@Nullable
		private Integer fetchSize;

		@Nullable
		private Boolean fieldMultiValueLeniency;

		@Nullable
		private Query filter;

		@Nullable
		private String format;

		@Nullable
		private Time pageTimeout;

		@Nullable
		private String query;

		@Nullable
		private Time requestTimeout;

		@Nullable
		private String timeZone;

		/**
		 * API name: {@code columnar}
		 */
		public final Builder columnar(@Nullable Boolean value) {
			this.columnar = value;
			return this;
		}

		/**
		 * API name: {@code cursor}
		 */
		public final Builder cursor(@Nullable String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * The maximum number of rows (or entries) to return in one response
		 * <p>
		 * API name: {@code fetch_size}
		 */
		public final Builder fetchSize(@Nullable Integer value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * Throw an exception when encountering multiple values for a field (default) or
		 * be lenient and return the first value from the list (without any guarantees
		 * of what that will be - typically the first in natural ascending order).
		 * <p>
		 * API name: {@code field_multi_value_leniency}
		 */
		public final Builder fieldMultiValueLeniency(@Nullable Boolean value) {
			this.fieldMultiValueLeniency = value;
			return this;
		}

		/**
		 * Optional Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Optional Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * a short version of the Accept header, e.g. json, yaml
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * The timeout before a pagination request fails.
		 * <p>
		 * API name: {@code page_timeout}
		 */
		public final Builder pageTimeout(@Nullable Time value) {
			this.pageTimeout = value;
			return this;
		}

		/**
		 * The timeout before a pagination request fails.
		 * <p>
		 * API name: {@code page_timeout}
		 */
		public final Builder pageTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.pageTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * SQL query to execute
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * The timeout before the request fails.
		 * <p>
		 * API name: {@code request_timeout}
		 */
		public final Builder requestTimeout(@Nullable Time value) {
			this.requestTimeout = value;
			return this;
		}

		/**
		 * The timeout before the request fails.
		 * <p>
		 * API name: {@code request_timeout}
		 */
		public final Builder requestTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.requestTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Time-zone in ISO 8601 used for executing the query on the server. More
		 * information available here.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRequest build() {
			_checkSingleUse();

			return new QueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRequest}
	 */
	public static final JsonpDeserializer<QueryRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryRequest::setupQueryRequestDeserializer);

	protected static void setupQueryRequestDeserializer(ObjectDeserializer<QueryRequest.Builder> op) {

		op.add(Builder::columnar, JsonpDeserializer.booleanDeserializer(), "columnar");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::fetchSize, JsonpDeserializer.integerDeserializer(), "fetch_size");
		op.add(Builder::fieldMultiValueLeniency, JsonpDeserializer.booleanDeserializer(), "field_multi_value_leniency");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::pageTimeout, Time._DESERIALIZER, "page_timeout");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::requestTimeout, Time._DESERIALIZER, "request_timeout");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code sql.query}".
	 */
	public static final Endpoint<QueryRequest, QueryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/sql.query",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_sql";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.format != null) {
					params.put("format", request.format);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, QueryResponse._DESERIALIZER);
}
