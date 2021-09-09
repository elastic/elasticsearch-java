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

package co.elastic.clients.elasticsearch.eql;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: eql.search.Request
public final class SearchRequest extends RequestBase implements ToJsonp {
	private final String index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final String query;

	@Nullable
	private final Boolean caseSensitive;

	@Nullable
	private final String eventCategoryField;

	@Nullable
	private final String tiebreakerField;

	@Nullable
	private final String timestampField;

	@Nullable
	private final Number fetchSize;

	@Nullable
	private final List<QueryContainer> filter;

	@Nullable
	private final JsonValue keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final JsonValue waitForCompletionTimeout;

	@Nullable
	private final JsonValue size;

	@Nullable
	private final List<JsonValue> fields;

	@Nullable
	private final JsonValue resultPosition;

	// ---------------------------------------------------------------------------------------------

	protected SearchRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = builder.expandWildcards;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.caseSensitive = builder.caseSensitive;
		this.eventCategoryField = builder.eventCategoryField;
		this.tiebreakerField = builder.tiebreakerField;
		this.timestampField = builder.timestampField;
		this.fetchSize = builder.fetchSize;
		this.filter = builder.filter;
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;
		this.size = builder.size;
		this.fields = builder.fields;
		this.resultPosition = builder.resultPosition;

	}

	/**
	 * The name of the index to scope the operation
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, missing or closed indices are not included in the response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * EQL query you wish to run.
	 * <p>
	 * API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code case_sensitive}
	 */
	@Nullable
	public Boolean caseSensitive() {
		return this.caseSensitive;
	}

	/**
	 * Field containing the event classification, such as process, file, or network.
	 * <p>
	 * API name: {@code event_category_field}
	 */
	@Nullable
	public String eventCategoryField() {
		return this.eventCategoryField;
	}

	/**
	 * Field used to sort hits with the same timestamp in ascending order
	 * <p>
	 * API name: {@code tiebreaker_field}
	 */
	@Nullable
	public String tiebreakerField() {
		return this.tiebreakerField;
	}

	/**
	 * Field containing event timestamp. Default &quot;@timestamp&quot;
	 * <p>
	 * API name: {@code timestamp_field}
	 */
	@Nullable
	public String timestampField() {
		return this.timestampField;
	}

	/**
	 * Maximum number of events to search at a time for sequence queries.
	 * <p>
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public Number fetchSize() {
		return this.fetchSize;
	}

	/**
	 * Query, written in Query DSL, used to filter the events on which the EQL query
	 * runs.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public List<QueryContainer> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public JsonValue keepAlive() {
		return this.keepAlive;
	}

	/**
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public JsonValue waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	/**
	 * For basic queries, the maximum number of matching events to return. Defaults
	 * to 10
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public JsonValue size() {
		return this.size;
	}

	/**
	 * Array of wildcard (*) patterns. The response returns values for field names
	 * matching these patterns in the fields property of each hit.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<JsonValue> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code result_position}
	 */
	@Nullable
	public JsonValue resultPosition() {
		return this.resultPosition;
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

		generator.writeKey("query");
		generator.write(this.query);

		if (this.caseSensitive != null) {

			generator.writeKey("case_sensitive");
			generator.write(this.caseSensitive);

		}
		if (this.eventCategoryField != null) {

			generator.writeKey("event_category_field");
			generator.write(this.eventCategoryField);

		}
		if (this.tiebreakerField != null) {

			generator.writeKey("tiebreaker_field");
			generator.write(this.tiebreakerField);

		}
		if (this.timestampField != null) {

			generator.writeKey("timestamp_field");
			generator.write(this.timestampField);

		}
		if (this.fetchSize != null) {

			generator.writeKey("fetch_size");
			generator.write(this.fetchSize.doubleValue());

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			generator.writeStartArray();
			for (QueryContainer item0 : this.filter) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.keepAlive != null) {

			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}
		if (this.keepOnCompletion != null) {

			generator.writeKey("keep_on_completion");
			generator.write(this.keepOnCompletion);

		}
		if (this.waitForCompletionTimeout != null) {

			generator.writeKey("wait_for_completion_timeout");
			generator.write(this.waitForCompletionTimeout);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (JsonValue item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.resultPosition != null) {

			generator.writeKey("result_position");
			generator.write(this.resultPosition);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchRequest}.
	 */
	public static class Builder implements ObjectBuilder<SearchRequest> {
		private String index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		private String query;

		@Nullable
		private Boolean caseSensitive;

		@Nullable
		private String eventCategoryField;

		@Nullable
		private String tiebreakerField;

		@Nullable
		private String timestampField;

		@Nullable
		private Number fetchSize;

		@Nullable
		private List<QueryContainer> filter;

		@Nullable
		private JsonValue keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private JsonValue waitForCompletionTimeout;

		@Nullable
		private JsonValue size;

		@Nullable
		private List<JsonValue> fields;

		@Nullable
		private JsonValue resultPosition;

		/**
		 * The name of the index to scope the operation
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * If true, missing or closed indices are not included in the response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * EQL query you wish to run.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code case_sensitive}
		 */
		public Builder caseSensitive(@Nullable Boolean value) {
			this.caseSensitive = value;
			return this;
		}

		/**
		 * Field containing the event classification, such as process, file, or network.
		 * <p>
		 * API name: {@code event_category_field}
		 */
		public Builder eventCategoryField(@Nullable String value) {
			this.eventCategoryField = value;
			return this;
		}

		/**
		 * Field used to sort hits with the same timestamp in ascending order
		 * <p>
		 * API name: {@code tiebreaker_field}
		 */
		public Builder tiebreakerField(@Nullable String value) {
			this.tiebreakerField = value;
			return this;
		}

		/**
		 * Field containing event timestamp. Default &quot;@timestamp&quot;
		 * <p>
		 * API name: {@code timestamp_field}
		 */
		public Builder timestampField(@Nullable String value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * Maximum number of events to search at a time for sequence queries.
		 * <p>
		 * API name: {@code fetch_size}
		 */
		public Builder fetchSize(@Nullable Number value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable List<QueryContainer> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(QueryContainer... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(QueryContainer value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * Set {@link #filter(List)} to a singleton list.
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.addFilter(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable JsonValue value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * API name: {@code keep_on_completion}
		 */
		public Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_completion_timeout}
		 */
		public Builder waitForCompletionTimeout(@Nullable JsonValue value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * For basic queries, the maximum number of matching events to return. Defaults
		 * to 10
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable JsonValue value) {
			this.size = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<JsonValue> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(JsonValue... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(JsonValue value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code result_position}
		 */
		public Builder resultPosition(@Nullable JsonValue value) {
			this.resultPosition = value;
			return this;
		}

		/**
		 * Builds a {@link SearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchRequest build() {

			return new SearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SearchRequest
	 */
	public static final JsonpDeserializer<SearchRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SearchRequest::setupSearchRequestDeserializer);

	protected static void setupSearchRequestDeserializer(DelegatingDeserializer<SearchRequest.Builder> op) {

		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::caseSensitive, JsonpDeserializer.booleanDeserializer(), "case_sensitive");
		op.add(Builder::eventCategoryField, JsonpDeserializer.stringDeserializer(), "event_category_field");
		op.add(Builder::tiebreakerField, JsonpDeserializer.stringDeserializer(), "tiebreaker_field");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::fetchSize, JsonpDeserializer.numberDeserializer(), "fetch_size");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(QueryContainer.DESERIALIZER), "filter");
		op.add(Builder::keepAlive, JsonpDeserializer.jsonValueDeserializer(), "keep_alive");
		op.add(Builder::keepOnCompletion, JsonpDeserializer.booleanDeserializer(), "keep_on_completion");
		op.add(Builder::waitForCompletionTimeout, JsonpDeserializer.jsonValueDeserializer(),
				"wait_for_completion_timeout");
		op.add(Builder::size, JsonpDeserializer.jsonValueDeserializer(), "size");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::resultPosition, JsonpDeserializer.jsonValueDeserializer(), "result_position");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code eql.search}".
	 */
	private static final Endpoint.Simple<SearchRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_eql");
					buf.append("/search");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code eql.search}" endpoint.
	 */
	public static <TEvent> Endpoint<SearchRequest, SearchResponse<TEvent>, ElasticsearchError> createSearchEndpoint(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ENDPOINT.withResponseDeserializer(SearchResponse.createSearchResponseDeserializer(tEventDeserializer));
	}
}
