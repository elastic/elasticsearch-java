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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.query.Request
public final class QueryRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String format;

	@Nullable
	private final Boolean columnar;

	@Nullable
	private final String cursor;

	@Nullable
	private final Number fetchSize;

	@Nullable
	private final QueryContainer filter;

	@Nullable
	private final String query;

	@Nullable
	private final JsonValue requestTimeout;

	@Nullable
	private final JsonValue pageTimeout;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Boolean fieldMultiValueLeniency;

	// ---------------------------------------------------------------------------------------------

	protected QueryRequest(Builder builder) {

		this.format = builder.format;
		this.columnar = builder.columnar;
		this.cursor = builder.cursor;
		this.fetchSize = builder.fetchSize;
		this.filter = builder.filter;
		this.query = builder.query;
		this.requestTimeout = builder.requestTimeout;
		this.pageTimeout = builder.pageTimeout;
		this.timeZone = builder.timeZone;
		this.fieldMultiValueLeniency = builder.fieldMultiValueLeniency;

	}

	/**
	 * a short version of the Accept header, e.g. json, yaml
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * API name: {@code columnar}
	 */
	@Nullable
	public Boolean columnar() {
		return this.columnar;
	}

	/**
	 * API name: {@code cursor}
	 */
	@Nullable
	public String cursor() {
		return this.cursor;
	}

	/**
	 * The maximum number of rows (or entries) to return in one response
	 * <p>
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public Number fetchSize() {
		return this.fetchSize;
	}

	/**
	 * Optional Elasticsearch query DSL for additional filtering.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
		return this.filter;
	}

	/**
	 * SQL query to execute
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public String query() {
		return this.query;
	}

	/**
	 * The timeout before the request fails.
	 * <p>
	 * API name: {@code request_timeout}
	 */
	@Nullable
	public JsonValue requestTimeout() {
		return this.requestTimeout;
	}

	/**
	 * The timeout before a pagination request fails.
	 * <p>
	 * API name: {@code page_timeout}
	 */
	@Nullable
	public JsonValue pageTimeout() {
		return this.pageTimeout;
	}

	/**
	 * Time-zone in ISO 8601 used for executing the query on the server. More
	 * information available here.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
		return this.timeZone;
	}

	/**
	 * Throw an exception when encountering multiple values for a field (default) or
	 * be lenient and return the first value from the list (without any guarantees
	 * of what that will be - typically the first in natural ascending order).
	 * <p>
	 * API name: {@code field_multi_value_leniency}
	 */
	@Nullable
	public Boolean fieldMultiValueLeniency() {
		return this.fieldMultiValueLeniency;
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
			generator.write(this.fetchSize.doubleValue());

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}
		if (this.query != null) {

			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.requestTimeout != null) {

			generator.writeKey("request_timeout");
			generator.write(this.requestTimeout);

		}
		if (this.pageTimeout != null) {

			generator.writeKey("page_timeout");
			generator.write(this.pageTimeout);

		}
		if (this.timeZone != null) {

			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.fieldMultiValueLeniency != null) {

			generator.writeKey("field_multi_value_leniency");
			generator.write(this.fieldMultiValueLeniency);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRequest}.
	 */
	public static class Builder implements ObjectBuilder<QueryRequest> {
		@Nullable
		private String format;

		@Nullable
		private Boolean columnar;

		@Nullable
		private String cursor;

		@Nullable
		private Number fetchSize;

		@Nullable
		private QueryContainer filter;

		@Nullable
		private String query;

		@Nullable
		private JsonValue requestTimeout;

		@Nullable
		private JsonValue pageTimeout;

		@Nullable
		private String timeZone;

		@Nullable
		private Boolean fieldMultiValueLeniency;

		/**
		 * a short version of the Accept header, e.g. json, yaml
		 * <p>
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code columnar}
		 */
		public Builder columnar(@Nullable Boolean value) {
			this.columnar = value;
			return this;
		}

		/**
		 * API name: {@code cursor}
		 */
		public Builder cursor(@Nullable String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * The maximum number of rows (or entries) to return in one response
		 * <p>
		 * API name: {@code fetch_size}
		 */
		public Builder fetchSize(@Nullable Number value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * Optional Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * Optional Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * SQL query to execute
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * The timeout before the request fails.
		 * <p>
		 * API name: {@code request_timeout}
		 */
		public Builder requestTimeout(@Nullable JsonValue value) {
			this.requestTimeout = value;
			return this;
		}

		/**
		 * The timeout before a pagination request fails.
		 * <p>
		 * API name: {@code page_timeout}
		 */
		public Builder pageTimeout(@Nullable JsonValue value) {
			this.pageTimeout = value;
			return this;
		}

		/**
		 * Time-zone in ISO 8601 used for executing the query on the server. More
		 * information available here.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * Throw an exception when encountering multiple values for a field (default) or
		 * be lenient and return the first value from the list (without any guarantees
		 * of what that will be - typically the first in natural ascending order).
		 * <p>
		 * API name: {@code field_multi_value_leniency}
		 */
		public Builder fieldMultiValueLeniency(@Nullable Boolean value) {
			this.fieldMultiValueLeniency = value;
			return this;
		}

		/**
		 * Builds a {@link QueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRequest build() {

			return new QueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for QueryRequest
	 */
	public static final JsonpDeserializer<QueryRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, QueryRequest::setupQueryRequestDeserializer);

	protected static void setupQueryRequestDeserializer(DelegatingDeserializer<QueryRequest.Builder> op) {

		op.add(Builder::columnar, JsonpDeserializer.booleanDeserializer(), "columnar");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::fetchSize, JsonpDeserializer.numberDeserializer(), "fetch_size");
		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::requestTimeout, JsonpDeserializer.jsonValueDeserializer(), "request_timeout");
		op.add(Builder::pageTimeout, JsonpDeserializer.jsonValueDeserializer(), "page_timeout");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::fieldMultiValueLeniency, JsonpDeserializer.booleanDeserializer(), "field_multi_value_leniency");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code sql.query}".
	 */
	public static final Endpoint<QueryRequest, QueryResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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

			}, Endpoint.Simple.emptyMap(), true, QueryResponse.DESERIALIZER);
}
