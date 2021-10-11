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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.eql.search.ResultPosition;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
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
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: eql.search.Request
@JsonpDeserializable
public final class EqlSearchRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

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
	private final List<Query> filter;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final String waitForCompletionTimeout;

	@Nullable
	private final JsonValue /* Union(_types.float | _types.uint) */ size;

	@Nullable
	private final List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> fields;

	@Nullable
	private final ResultPosition resultPosition;

	// ---------------------------------------------------------------------------------------------

	public EqlSearchRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.caseSensitive = builder.caseSensitive;
		this.eventCategoryField = builder.eventCategoryField;
		this.tiebreakerField = builder.tiebreakerField;
		this.timestampField = builder.timestampField;
		this.fetchSize = builder.fetchSize;
		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;
		this.size = builder.size;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.resultPosition = builder.resultPosition;

	}

	public EqlSearchRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The name of the index to scope the operation
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
	public List<ExpandWildcardOptions> expandWildcards() {
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
	 * Required - EQL query you wish to run.
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
	public List<Query> filter() {
		return this.filter;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public String keepAlive() {
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
	public String waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	/**
	 * For basic queries, the maximum number of matching events to return. Defaults
	 * to 10
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public JsonValue /* Union(_types.float | _types.uint) */ size() {
		return this.size;
	}

	/**
	 * Array of wildcard (*) patterns. The response returns values for field names
	 * matching these patterns in the fields property of each hit.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code result_position}
	 */
	@Nullable
	public ResultPosition resultPosition() {
		return this.resultPosition;
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
			for (Query item0 : this.filter) {
				item0.serialize(generator, mapper);

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
			for (JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */ item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.resultPosition != null) {

			generator.writeKey("result_position");
			this.resultPosition.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlSearchRequest}.
	 */
	public static class Builder implements ObjectBuilder<EqlSearchRequest> {
		private String index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

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
		private List<Query> filter;

		@Nullable
		private String keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private String waitForCompletionTimeout;

		@Nullable
		private JsonValue /* Union(_types.float | _types.uint) */ size;

		@Nullable
		private List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> fields;

		@Nullable
		private ResultPosition resultPosition;

		/**
		 * Required - The name of the index to scope the operation
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
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed.
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
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
		 * Required - EQL query you wish to run.
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
		public Builder filter(@Nullable List<Query> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 */
		public Builder filter(Query... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Query value) {
			if (this.filter == null) {
				this.filter = new ArrayList<>();
			}
			this.filter.add(value);
			return this;
		}

		/**
		 * Set {@link #filter(List)} to a singleton list.
		 */
		public Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Add a value to {@link #filter(List)}, creating the list if needed.
		 */
		public Builder addFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.addFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable String value) {
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
		public Builder waitForCompletionTimeout(@Nullable String value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * For basic queries, the maximum number of matching events to return. Defaults
		 * to 10
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable JsonValue /* Union(_types.float | _types.uint) */ value) {
			this.size = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(
				@Nullable List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The response returns values for field names
		 * matching these patterns in the fields property of each hit.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */ value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code result_position}
		 */
		public Builder resultPosition(@Nullable ResultPosition value) {
			this.resultPosition = value;
			return this;
		}

		/**
		 * Builds a {@link EqlSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlSearchRequest build() {

			return new EqlSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlSearchRequest}
	 */
	public static final JsonpDeserializer<EqlSearchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlSearchRequest::setupEqlSearchRequestDeserializer, Builder::build);

	protected static void setupEqlSearchRequestDeserializer(DelegatingDeserializer<EqlSearchRequest.Builder> op) {

		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::caseSensitive, JsonpDeserializer.booleanDeserializer(), "case_sensitive");
		op.add(Builder::eventCategoryField, JsonpDeserializer.stringDeserializer(), "event_category_field");
		op.add(Builder::tiebreakerField, JsonpDeserializer.stringDeserializer(), "tiebreaker_field");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::fetchSize, JsonpDeserializer.numberDeserializer(), "fetch_size");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive");
		op.add(Builder::keepOnCompletion, JsonpDeserializer.booleanDeserializer(), "keep_on_completion");
		op.add(Builder::waitForCompletionTimeout, JsonpDeserializer.stringDeserializer(),
				"wait_for_completion_timeout");
		op.add(Builder::size, JsonpDeserializer.jsonValueDeserializer(), "size");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::resultPosition, ResultPosition._DESERIALIZER, "result_position");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code eql.search}".
	 */
	private static final SimpleEndpoint<EqlSearchRequest, Void> ENDPOINT = new SimpleEndpoint<>(
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
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_eql");
					buf.append("/search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code eql.search}" endpoint.
	 */
	public static <TEvent> Endpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ElasticsearchError> createSearchEndpoint(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(EqlSearchResponse.createEqlSearchResponseDeserializer(tEventDeserializer));
	}
}
