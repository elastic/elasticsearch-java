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
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
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
import java.util.List;
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
 * Get SQL search results.
 * <p>
 * Run an SQL request.
 * 
 * @see <a href="../doc-files/api-spec.html#sql.query.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowPartialSearchResults;

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

	private final List<JsonData> params;

	@Nullable
	private final String projectRouting;

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

		this.allowPartialSearchResults = builder.allowPartialSearchResults;
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
		this.projectRouting = builder.projectRouting;
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
	 * If <code>true</code>, the response has partial results when there are shard
	 * request timeouts or shard failures. If <code>false</code>, the API returns an
	 * error with no partial results.
	 * <p>
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public final Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * The default catalog (cluster) for queries. If unspecified, the queries
	 * execute on the data in the local cluster only.
	 * <p>
	 * API name: {@code catalog}
	 */
	@Nullable
	public final String catalog() {
		return this.catalog;
	}

	/**
	 * If <code>true</code>, the results are in a columnar fashion: one row
	 * represents all the values of a certain column from the current page of
	 * results. The API supports this parameter only for CBOR, JSON, SMILE, and YAML
	 * responses.
	 * <p>
	 * API name: {@code columnar}
	 */
	@Nullable
	public final Boolean columnar() {
		return this.columnar;
	}

	/**
	 * The cursor used to retrieve a set of paginated results. If you specify a
	 * cursor, the API only uses the <code>columnar</code> and
	 * <code>time_zone</code> request body parameters. It ignores other request body
	 * parameters.
	 * <p>
	 * API name: {@code cursor}
	 */
	@Nullable
	public final String cursor() {
		return this.cursor;
	}

	/**
	 * The maximum number of rows (or entries) to return in one response.
	 * <p>
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public final Integer fetchSize() {
		return this.fetchSize;
	}

	/**
	 * If <code>false</code>, the API returns an exception when encountering
	 * multiple values for a field. If <code>true</code>, the API is lenient and
	 * returns the first value from the array with no guarantee of consistent
	 * results.
	 * <p>
	 * API name: {@code field_multi_value_leniency}
	 */
	@Nullable
	public final Boolean fieldMultiValueLeniency() {
		return this.fieldMultiValueLeniency;
	}

	/**
	 * The Elasticsearch query DSL for additional filtering.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * The format for the response. You can also specify a format using the
	 * <code>Accept</code> HTTP header. If you specify both this parameter and the
	 * <code>Accept</code> HTTP header, this parameter takes precedence.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final SqlFormat format() {
		return this.format;
	}

	/**
	 * If <code>true</code>, the search can run on frozen indices.
	 * <p>
	 * API name: {@code index_using_frozen}
	 */
	@Nullable
	public final Boolean indexUsingFrozen() {
		return this.indexUsingFrozen;
	}

	/**
	 * The retention period for an async or saved synchronous search.
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * If <code>true</code>, Elasticsearch stores synchronous searches if you also
	 * specify the <code>wait_for_completion_timeout</code> parameter. If
	 * <code>false</code>, Elasticsearch only stores async searches that don't
	 * finish before the <code>wait_for_completion_timeout</code>.
	 * <p>
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public final Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * The minimum retention period for the scroll cursor. After this time period, a
	 * pagination request might fail because the scroll cursor is no longer
	 * available. Subsequent scroll requests prolong the lifetime of the scroll
	 * cursor by the duration of <code>page_timeout</code> in the scroll request.
	 * <p>
	 * API name: {@code page_timeout}
	 */
	@Nullable
	public final Time pageTimeout() {
		return this.pageTimeout;
	}

	/**
	 * The values for parameters in the query.
	 * <p>
	 * API name: {@code params}
	 */
	public final List<JsonData> params() {
		return this.params;
	}

	/**
	 * Specifies a subset of projects to target for the search using project
	 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
	 * _alias tag and a single value (possibly wildcarded). Examples:
	 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
	 * only.
	 * <p>
	 * API name: {@code project_routing}
	 */
	@Nullable
	public final String projectRouting() {
		return this.projectRouting;
	}

	/**
	 * The SQL query to run.
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
	 * One or more runtime fields for the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * The ISO-8601 time zone ID for the search.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	/**
	 * The period to wait for complete results. It defaults to no timeout, meaning
	 * the request waits for complete search results. If the search doesn't finish
	 * within this period, the search becomes async.
	 * <p>
	 * To save a synchronous search, you must specify this parameter and the
	 * <code>keep_on_completion</code> parameter.
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

		if (this.allowPartialSearchResults != null) {
			generator.writeKey("allow_partial_search_results");
			generator.write(this.allowPartialSearchResults);

		}
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
			generator.writeStartArray();
			for (JsonData item0 : this.params) {
				item0.serialize(generator, mapper);

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
		private Boolean allowPartialSearchResults;

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
		private List<JsonData> params;

		@Nullable
		private String projectRouting;

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

		public Builder() {
		}
		private Builder(QueryRequest instance) {
			this.allowPartialSearchResults = instance.allowPartialSearchResults;
			this.catalog = instance.catalog;
			this.columnar = instance.columnar;
			this.cursor = instance.cursor;
			this.fetchSize = instance.fetchSize;
			this.fieldMultiValueLeniency = instance.fieldMultiValueLeniency;
			this.filter = instance.filter;
			this.format = instance.format;
			this.indexUsingFrozen = instance.indexUsingFrozen;
			this.keepAlive = instance.keepAlive;
			this.keepOnCompletion = instance.keepOnCompletion;
			this.pageTimeout = instance.pageTimeout;
			this.params = instance.params;
			this.projectRouting = instance.projectRouting;
			this.query = instance.query;
			this.requestTimeout = instance.requestTimeout;
			this.runtimeMappings = instance.runtimeMappings;
			this.timeZone = instance.timeZone;
			this.waitForCompletionTimeout = instance.waitForCompletionTimeout;

		}
		/**
		 * If <code>true</code>, the response has partial results when there are shard
		 * request timeouts or shard failures. If <code>false</code>, the API returns an
		 * error with no partial results.
		 * <p>
		 * API name: {@code allow_partial_search_results}
		 */
		public final Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * The default catalog (cluster) for queries. If unspecified, the queries
		 * execute on the data in the local cluster only.
		 * <p>
		 * API name: {@code catalog}
		 */
		public final Builder catalog(@Nullable String value) {
			this.catalog = value;
			return this;
		}

		/**
		 * If <code>true</code>, the results are in a columnar fashion: one row
		 * represents all the values of a certain column from the current page of
		 * results. The API supports this parameter only for CBOR, JSON, SMILE, and YAML
		 * responses.
		 * <p>
		 * API name: {@code columnar}
		 */
		public final Builder columnar(@Nullable Boolean value) {
			this.columnar = value;
			return this;
		}

		/**
		 * The cursor used to retrieve a set of paginated results. If you specify a
		 * cursor, the API only uses the <code>columnar</code> and
		 * <code>time_zone</code> request body parameters. It ignores other request body
		 * parameters.
		 * <p>
		 * API name: {@code cursor}
		 */
		public final Builder cursor(@Nullable String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * The maximum number of rows (or entries) to return in one response.
		 * <p>
		 * API name: {@code fetch_size}
		 */
		public final Builder fetchSize(@Nullable Integer value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * If <code>false</code>, the API returns an exception when encountering
		 * multiple values for a field. If <code>true</code>, the API is lenient and
		 * returns the first value from the array with no guarantee of consistent
		 * results.
		 * <p>
		 * API name: {@code field_multi_value_leniency}
		 */
		public final Builder fieldMultiValueLeniency(@Nullable Boolean value) {
			this.fieldMultiValueLeniency = value;
			return this;
		}

		/**
		 * The Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * The Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * The Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(QueryVariant value) {
			this.filter = value._toQuery();
			return this;
		}

		/**
		 * The format for the response. You can also specify a format using the
		 * <code>Accept</code> HTTP header. If you specify both this parameter and the
		 * <code>Accept</code> HTTP header, this parameter takes precedence.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable SqlFormat value) {
			this.format = value;
			return this;
		}

		/**
		 * If <code>true</code>, the search can run on frozen indices.
		 * <p>
		 * API name: {@code index_using_frozen}
		 */
		public final Builder indexUsingFrozen(@Nullable Boolean value) {
			this.indexUsingFrozen = value;
			return this;
		}

		/**
		 * The retention period for an async or saved synchronous search.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * The retention period for an async or saved synchronous search.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>true</code>, Elasticsearch stores synchronous searches if you also
		 * specify the <code>wait_for_completion_timeout</code> parameter. If
		 * <code>false</code>, Elasticsearch only stores async searches that don't
		 * finish before the <code>wait_for_completion_timeout</code>.
		 * <p>
		 * API name: {@code keep_on_completion}
		 */
		public final Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * The minimum retention period for the scroll cursor. After this time period, a
		 * pagination request might fail because the scroll cursor is no longer
		 * available. Subsequent scroll requests prolong the lifetime of the scroll
		 * cursor by the duration of <code>page_timeout</code> in the scroll request.
		 * <p>
		 * API name: {@code page_timeout}
		 */
		public final Builder pageTimeout(@Nullable Time value) {
			this.pageTimeout = value;
			return this;
		}

		/**
		 * The minimum retention period for the scroll cursor. After this time period, a
		 * pagination request might fail because the scroll cursor is no longer
		 * available. Subsequent scroll requests prolong the lifetime of the scroll
		 * cursor by the duration of <code>page_timeout</code> in the scroll request.
		 * <p>
		 * API name: {@code page_timeout}
		 */
		public final Builder pageTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.pageTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The values for parameters in the query.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>params</code>.
		 */
		public final Builder params(List<JsonData> list) {
			this.params = _listAddAll(this.params, list);
			return this;
		}

		/**
		 * The values for parameters in the query.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds one or more values to <code>params</code>.
		 */
		public final Builder params(JsonData value, JsonData... values) {
			this.params = _listAdd(this.params, value, values);
			return this;
		}

		/**
		 * Specifies a subset of projects to target for the search using project
		 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
		 * _alias tag and a single value (possibly wildcarded). Examples:
		 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
		 * only.
		 * <p>
		 * API name: {@code project_routing}
		 */
		public final Builder projectRouting(@Nullable String value) {
			this.projectRouting = value;
			return this;
		}

		/**
		 * The SQL query to run.
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
		 * One or more runtime fields for the search request. These fields take
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
		 * One or more runtime fields for the search request. These fields take
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
		 * One or more runtime fields for the search request. These fields take
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
		 * The ISO-8601 time zone ID for the search.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * The period to wait for complete results. It defaults to no timeout, meaning
		 * the request waits for complete search results. If the search doesn't finish
		 * within this period, the search becomes async.
		 * <p>
		 * To save a synchronous search, you must specify this parameter and the
		 * <code>keep_on_completion</code> parameter.
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable Time value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * The period to wait for complete results. It defaults to no timeout, meaning
		 * the request waits for complete search results. If the search doesn't finish
		 * within this period, the search becomes async.
		 * <p>
		 * To save a synchronous search, you must specify this parameter and the
		 * <code>keep_on_completion</code> parameter.
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRequest}
	 */
	public static final JsonpDeserializer<QueryRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryRequest::setupQueryRequestDeserializer);

	protected static void setupQueryRequestDeserializer(ObjectDeserializer<QueryRequest.Builder> op) {

		op.add(Builder::allowPartialSearchResults, JsonpDeserializer.booleanDeserializer(),
				"allow_partial_search_results");
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
		op.add(Builder::params, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "params");
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
				if (request.projectRouting != null) {
					params.put("project_routing", request.projectRouting);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, QueryResponse._DESERIALIZER);
}
