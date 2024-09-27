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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.sql.query.SqlFormat;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
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
	private final String catalog;

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
	private final SqlFormat format;

	@Nullable
	private final Boolean indexUsingFrozen;

	@Nullable
	private final Time keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final Time pageTimeout;

	private final Map<String, JsonData> params;

	@Nullable
	private final String query;

	@Nullable
	private final Time requestTimeout;

	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Time waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private QueryRequest(Builder builder) {

		this.catalog = builder.catalog;
		this.columnar = builder.columnar;
		this.cursor = builder.cursor;
		this.fetchSize = builder.fetchSize;
		this.fieldMultiValueLeniency = builder.fieldMultiValueLeniency;
		this.filter = builder.filter;
		this.format = builder.format;
		this.indexUsingFrozen = builder.indexUsingFrozen;
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.pageTimeout = builder.pageTimeout;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.query = builder.query;
		this.requestTimeout = builder.requestTimeout;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.timeZone = builder.timeZone;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	public static QueryRequest of(Function<Builder, ObjectBuilder<QueryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Default catalog (cluster) for queries. If unspecified, the queries execute on
	 * the data in the local cluster only.
	 * <p>
	 * API name: {@code catalog}
	 */
	@Nullable
	public final String catalog() {
		return this.catalog;
	}

	/**
	 * If true, the results in a columnar fashion: one row represents all the values
	 * of a certain column from the current page of results.
	 * <p>
	 * API name: {@code columnar}
	 */
	@Nullable
	public final Boolean columnar() {
		return this.columnar;
	}

	/**
	 * Cursor used to retrieve a set of paginated results. If you specify a cursor,
	 * the API only uses the <code>columnar</code> and <code>time_zone</code>
	 * request body parameters. It ignores other request body parameters.
	 * <p>
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
	 * Elasticsearch query DSL for additional filtering.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * Format for the response.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final SqlFormat format() {
		return this.format;
	}

	/**
	 * If true, the search can run on frozen indices. Defaults to false.
	 * <p>
	 * API name: {@code index_using_frozen}
	 */
	@Nullable
	public final Boolean indexUsingFrozen() {
		return this.indexUsingFrozen;
	}

	/**
	 * Retention period for an async or saved synchronous search.
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * If true, Elasticsearch stores synchronous searches if you also specify the
	 * wait_for_completion_timeout parameter. If false, Elasticsearch only stores
	 * async searches that don’t finish before the wait_for_completion_timeout.
	 * <p>
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public final Boolean keepOnCompletion() {
		return this.keepOnCompletion;
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
	 * Values for parameters in the query.
	 * <p>
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * SQL query to run.
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
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * ISO-8601 time zone ID for the search.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	/**
	 * Period to wait for complete results. Defaults to no timeout, meaning the
	 * request waits for complete search results. If the search doesn’t finish
	 * within this period, the search becomes async.
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public final Time waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
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

		if (this.catalog != null) {
			generator.writeKey("catalog");
			generator.write(this.catalog);

		}
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
		if (this.indexUsingFrozen != null) {
			generator.writeKey("index_using_frozen");
			generator.write(this.indexUsingFrozen);

		}
		if (this.keepAlive != null) {
			generator.writeKey("keep_alive");
			this.keepAlive.serialize(generator, mapper);

		}
		if (this.keepOnCompletion != null) {
			generator.writeKey("keep_on_completion");
			generator.write(this.keepOnCompletion);

		}
		if (this.pageTimeout != null) {
			generator.writeKey("page_timeout");
			this.pageTimeout.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.requestTimeout != null) {
			generator.writeKey("request_timeout");
			this.requestTimeout.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.waitForCompletionTimeout != null) {
			generator.writeKey("wait_for_completion_timeout");
			this.waitForCompletionTimeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<QueryRequest> {
		@Nullable
		private String catalog;

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
		private SqlFormat format;

		@Nullable
		private Boolean indexUsingFrozen;

		@Nullable
		private Time keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private Time pageTimeout;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private String query;

		@Nullable
		private Time requestTimeout;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private String timeZone;

		@Nullable
		private Time waitForCompletionTimeout;

		/**
		 * Default catalog (cluster) for queries. If unspecified, the queries execute on
		 * the data in the local cluster only.
		 * <p>
		 * API name: {@code catalog}
		 */
		public final Builder catalog(@Nullable String value) {
			this.catalog = value;
			return this;
		}

		/**
		 * If true, the results in a columnar fashion: one row represents all the values
		 * of a certain column from the current page of results.
		 * <p>
		 * API name: {@code columnar}
		 */
		public final Builder columnar(@Nullable Boolean value) {
			this.columnar = value;
			return this;
		}

		/**
		 * Cursor used to retrieve a set of paginated results. If you specify a cursor,
		 * the API only uses the <code>columnar</code> and <code>time_zone</code>
		 * request body parameters. It ignores other request body parameters.
		 * <p>
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
		 * Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Format for the response.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable SqlFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * If true, the search can run on frozen indices. Defaults to false.
		 * <p>
		 * API name: {@code index_using_frozen}
		 */
		public final Builder indexUsingFrozen(@Nullable Boolean value) {
			this.indexUsingFrozen = value;
			return this;
		}

		/**
		 * Retention period for an async or saved synchronous search.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Retention period for an async or saved synchronous search.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If true, Elasticsearch stores synchronous searches if you also specify the
		 * wait_for_completion_timeout parameter. If false, Elasticsearch only stores
		 * async searches that don’t finish before the wait_for_completion_timeout.
		 * <p>
		 * API name: {@code keep_on_completion}
		 */
		public final Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
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
		 * Values for parameters in the query.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * Values for parameters in the query.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * SQL query to run.
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
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * ISO-8601 time zone ID for the search.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * Period to wait for complete results. Defaults to no timeout, meaning the
		 * request waits for complete search results. If the search doesn’t finish
		 * within this period, the search becomes async.
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable Time value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Period to wait for complete results. Defaults to no timeout, meaning the
		 * request waits for complete search results. If the search doesn’t finish
		 * within this period, the search becomes async.
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.waitForCompletionTimeout(fn.apply(new Time.Builder()).build());
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

		op.add(Builder::catalog, JsonpDeserializer.stringDeserializer(), "catalog");
		op.add(Builder::columnar, JsonpDeserializer.booleanDeserializer(), "columnar");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::fetchSize, JsonpDeserializer.integerDeserializer(), "fetch_size");
		op.add(Builder::fieldMultiValueLeniency, JsonpDeserializer.booleanDeserializer(), "field_multi_value_leniency");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::indexUsingFrozen, JsonpDeserializer.booleanDeserializer(), "index_using_frozen");
		op.add(Builder::keepAlive, Time._DESERIALIZER, "keep_alive");
		op.add(Builder::keepOnCompletion, JsonpDeserializer.booleanDeserializer(), "keep_on_completion");
		op.add(Builder::pageTimeout, Time._DESERIALIZER, "page_timeout");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::requestTimeout, Time._DESERIALIZER, "request_timeout");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::waitForCompletionTimeout, Time._DESERIALIZER, "wait_for_completion_timeout");

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

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.format != null) {
					params.put("format", request.format.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, QueryResponse._DESERIALIZER);
}
