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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.FieldAndFormat;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.eql.search.ResultPosition;
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
import java.lang.Number;
import java.lang.String;
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

// typedef: eql.search.Request

/**
 * Returns results matching a query expressed in Event Query Language (EQL)
 * 
 * @see <a href="../doc-files/api-spec.html#eql.search.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class EqlSearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean caseSensitive;

	@Nullable
	private final String eventCategoryField;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Number fetchSize;

	private final List<FieldAndFormat> fields;

	private final List<Query> filter;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Time keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	private final String query;

	@Nullable
	private final ResultPosition resultPosition;

	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final Number size;

	@Nullable
	private final String tiebreakerField;

	@Nullable
	private final String timestampField;

	@Nullable
	private final Time waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private EqlSearchRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.caseSensitive = builder.caseSensitive;
		this.eventCategoryField = builder.eventCategoryField;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.fetchSize = builder.fetchSize;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.filter = ApiTypeHelper.unmodifiable(builder.filter);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.resultPosition = builder.resultPosition;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);
		this.size = builder.size;
		this.tiebreakerField = builder.tiebreakerField;
		this.timestampField = builder.timestampField;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	public static EqlSearchRequest of(Function<Builder, ObjectBuilder<EqlSearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code case_sensitive}
	 */
	@Nullable
	public final Boolean caseSensitive() {
		return this.caseSensitive;
	}

	/**
	 * Field containing the event classification, such as process, file, or network.
	 * <p>
	 * API name: {@code event_category_field}
	 */
	@Nullable
	public final String eventCategoryField() {
		return this.eventCategoryField;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Maximum number of events to search at a time for sequence queries.
	 * <p>
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public final Number fetchSize() {
		return this.fetchSize;
	}

	/**
	 * Array of wildcard (*) patterns. The response returns values for field names
	 * matching these patterns in the fields property of each hit.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<FieldAndFormat> fields() {
		return this.fields;
	}

	/**
	 * Query, written in Query DSL, used to filter the events on which the EQL query
	 * runs.
	 * <p>
	 * API name: {@code filter}
	 */
	public final List<Query> filter() {
		return this.filter;
	}

	/**
	 * If true, missing or closed indices are not included in the response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - The name of the index to scope the operation
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public final Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * Required - EQL query you wish to run.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * API name: {@code result_position}
	 */
	@Nullable
	public final ResultPosition resultPosition() {
		return this.resultPosition;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * For basic queries, the maximum number of matching events to return. Defaults
	 * to 10
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Number size() {
		return this.size;
	}

	/**
	 * Field used to sort hits with the same timestamp in ascending order
	 * <p>
	 * API name: {@code tiebreaker_field}
	 */
	@Nullable
	public final String tiebreakerField() {
		return this.tiebreakerField;
	}

	/**
	 * Field containing event timestamp. Default &quot;@timestamp&quot;
	 * <p>
	 * API name: {@code timestamp_field}
	 */
	@Nullable
	public final String timestampField() {
		return this.timestampField;
	}

	/**
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

		if (this.caseSensitive != null) {
			generator.writeKey("case_sensitive");
			generator.write(this.caseSensitive);

		}
		if (this.eventCategoryField != null) {
			generator.writeKey("event_category_field");
			generator.write(this.eventCategoryField);

		}
		if (this.fetchSize != null) {
			generator.writeKey("fetch_size");
			generator.write(this.fetchSize.doubleValue());

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.fields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (Query item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.keepAlive != null) {
			generator.writeKey("keep_alive");
			this.keepAlive.serialize(generator, mapper);

		}
		if (this.keepOnCompletion != null) {
			generator.writeKey("keep_on_completion");
			generator.write(this.keepOnCompletion);

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.resultPosition != null) {
			generator.writeKey("result_position");
			this.resultPosition.serialize(generator, mapper);
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
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.tiebreakerField != null) {
			generator.writeKey("tiebreaker_field");
			generator.write(this.tiebreakerField);

		}
		if (this.timestampField != null) {
			generator.writeKey("timestamp_field");
			generator.write(this.timestampField);

		}
		if (this.waitForCompletionTimeout != null) {
			generator.writeKey("wait_for_completion_timeout");
			this.waitForCompletionTimeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlSearchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<EqlSearchRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean caseSensitive;

		@Nullable
		private String eventCategoryField;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Number fetchSize;

		@Nullable
		private List<FieldAndFormat> fields;

		@Nullable
		private List<Query> filter;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		@Nullable
		private Time keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		private String query;

		@Nullable
		private ResultPosition resultPosition;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private Number size;

		@Nullable
		private String tiebreakerField;

		@Nullable
		private String timestampField;

		@Nullable
		private Time waitForCompletionTimeout;

		/**
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code case_sensitive}
		 */
		public final Builder caseSensitive(@Nullable Boolean value) {
			this.caseSensitive = value;
			return this;
		}

		/**
		 * Field containing the event classification, such as process, file, or network.
		 * <p>
		 * API name: {@code event_category_field}
		 */
		public final Builder eventCategoryField(@Nullable String value) {
			this.eventCategoryField = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * Maximum number of events to search at a time for sequence queries.
		 * <p>
		 * API name: {@code fetch_size}
		 */
		public final Builder fetchSize(@Nullable Number value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<FieldAndFormat> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(FieldAndFormat value, FieldAndFormat... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds a value to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(Function<FieldAndFormat.Builder, ObjectBuilder<FieldAndFormat>> fn) {
			return fields(fn.apply(new FieldAndFormat.Builder()).build());
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filter</code>.
		 */
		public final Builder filter(List<Query> list) {
			this.filter = _listAddAll(this.filter, list);
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds one or more values to <code>filter</code>.
		 */
		public final Builder filter(Query value, Query... values) {
			this.filter = _listAdd(this.filter, value, values);
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 * <p>
		 * Adds a value to <code>filter</code> using a builder lambda.
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * If true, missing or closed indices are not included in the response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Required - The name of the index to scope the operation
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - The name of the index to scope the operation
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code keep_on_completion}
		 */
		public final Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * Required - EQL query you wish to run.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code result_position}
		 */
		public final Builder resultPosition(@Nullable ResultPosition value) {
			this.resultPosition = value;
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, RuntimeField> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, RuntimeField value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		/**
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code> using a builder lambda.
		 */
		public final Builder runtimeMappings(String key,
				Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return runtimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * For basic queries, the maximum number of matching events to return. Defaults
		 * to 10
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * Field used to sort hits with the same timestamp in ascending order
		 * <p>
		 * API name: {@code tiebreaker_field}
		 */
		public final Builder tiebreakerField(@Nullable String value) {
			this.tiebreakerField = value;
			return this;
		}

		/**
		 * Field containing event timestamp. Default &quot;@timestamp&quot;
		 * <p>
		 * API name: {@code timestamp_field}
		 */
		public final Builder timestampField(@Nullable String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable Time value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
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
		 * Builds a {@link EqlSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlSearchRequest build() {
			_checkSingleUse();

			return new EqlSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlSearchRequest}
	 */
	public static final JsonpDeserializer<EqlSearchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlSearchRequest::setupEqlSearchRequestDeserializer);

	protected static void setupEqlSearchRequestDeserializer(ObjectDeserializer<EqlSearchRequest.Builder> op) {

		op.add(Builder::caseSensitive, JsonpDeserializer.booleanDeserializer(), "case_sensitive");
		op.add(Builder::eventCategoryField, JsonpDeserializer.stringDeserializer(), "event_category_field");
		op.add(Builder::fetchSize, JsonpDeserializer.numberDeserializer(), "fetch_size");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER), "fields");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(Builder::keepAlive, Time._DESERIALIZER, "keep_alive");
		op.add(Builder::keepOnCompletion, JsonpDeserializer.booleanDeserializer(), "keep_on_completion");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::resultPosition, ResultPosition._DESERIALIZER, "result_position");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::tiebreakerField, JsonpDeserializer.stringDeserializer(), "tiebreaker_field");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::waitForCompletionTimeout, Time._DESERIALIZER, "wait_for_completion_timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code eql.search}".
	 */
	public static final SimpleEndpoint<EqlSearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/eql.search",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_eql");
					buf.append("/search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, EqlSearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code eql.search}" endpoint.
	 */
	public static <TEvent> Endpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse> createSearchEndpoint(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return _ENDPOINT
				.withResponseDeserializer(EqlSearchResponse.createEqlSearchResponseDeserializer(tEventDeserializer));
	}
}
