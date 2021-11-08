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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
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
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class EqlSearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean caseSensitive;

	@Nullable
	private final String eventCategoryField;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Number fetchSize;

	private final List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> fields;

	private final List<Query> filter;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final String index;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final Boolean keepOnCompletion;

	private final String query;

	@Nullable
	private final ResultPosition resultPosition;

	@Nullable
	private final JsonValue /* Union(_types.float | _types.uint) */ size;

	@Nullable
	private final String tiebreakerField;

	@Nullable
	private final String timestampField;

	@Nullable
	private final String waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private EqlSearchRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.caseSensitive = builder.caseSensitive;
		this.eventCategoryField = builder.eventCategoryField;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.fetchSize = builder.fetchSize;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.keepAlive = builder.keepAlive;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");
		this.resultPosition = builder.resultPosition;
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
	public final List<ExpandWildcardOptions> expandWildcards() {
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
	public final List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> fields() {
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
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final String keepAlive() {
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
	 * For basic queries, the maximum number of matching events to return. Defaults
	 * to 10
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final JsonValue /* Union(_types.float | _types.uint) */ size() {
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
	public final String waitForCompletionTimeout() {
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
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */ item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.filter)) {
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
		generator.writeKey("query");
		generator.write(this.query);

		if (this.resultPosition != null) {
			generator.writeKey("result_position");
			this.resultPosition.serialize(generator, mapper);
		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

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
			generator.write(this.waitForCompletionTimeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlSearchRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EqlSearchRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean caseSensitive;

		@Nullable
		private String eventCategoryField;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Number fetchSize;

		@Nullable
		private List<JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */> fields;

		@Nullable
		private List<Query> filter;

		@Nullable
		private Boolean ignoreUnavailable;

		private String index;

		@Nullable
		private String keepAlive;

		@Nullable
		private Boolean keepOnCompletion;

		private String query;

		@Nullable
		private ResultPosition resultPosition;

		@Nullable
		private JsonValue /* Union(_types.float | _types.uint) */ size;

		@Nullable
		private String tiebreakerField;

		@Nullable
		private String timestampField;

		@Nullable
		private String waitForCompletionTimeout;

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
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
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
		 */
		public final Builder fields(
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
		public final Builder fields(JsonValue /* Union(_types.Field | eql.search.SearchFieldFormatted) */... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable List<Query> value) {
			this.filter = value;
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Query... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * Query, written in Query DSL, used to filter the events on which the EQL query
		 * runs.
		 * <p>
		 * API name: {@code filter}
		 */
		@SafeVarargs
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>>... fns) {
			this.filter = new ArrayList<>(fns.length);
			for (Function<Query.Builder, ObjectBuilder<Query>> fn : fns) {
				this.filter.add(fn.apply(new Query.Builder()).build());
			}
			return this;
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
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
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
		 * For basic queries, the maximum number of matching events to return. Defaults
		 * to 10
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable JsonValue /* Union(_types.float | _types.uint) */ value) {
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
		public final Builder waitForCompletionTimeout(@Nullable String value) {
			this.waitForCompletionTimeout = value;
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
			EqlSearchRequest::setupEqlSearchRequestDeserializer, Builder::build);

	protected static void setupEqlSearchRequestDeserializer(DelegatingDeserializer<EqlSearchRequest.Builder> op) {

		op.add(Builder::caseSensitive, JsonpDeserializer.booleanDeserializer(), "case_sensitive");
		op.add(Builder::eventCategoryField, JsonpDeserializer.stringDeserializer(), "event_category_field");
		op.add(Builder::fetchSize, JsonpDeserializer.numberDeserializer(), "fetch_size");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "filter");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive");
		op.add(Builder::keepOnCompletion, JsonpDeserializer.booleanDeserializer(), "keep_on_completion");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::resultPosition, ResultPosition._DESERIALIZER, "result_position");
		op.add(Builder::size, JsonpDeserializer.jsonValueDeserializer(), "size");
		op.add(Builder::tiebreakerField, JsonpDeserializer.stringDeserializer(), "tiebreaker_field");
		op.add(Builder::timestampField, JsonpDeserializer.stringDeserializer(), "timestamp_field");
		op.add(Builder::waitForCompletionTimeout, JsonpDeserializer.stringDeserializer(),
				"wait_for_completion_timeout");

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
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
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

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code eql.search}" endpoint.
	 */
	public static <TEvent> Endpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse> createSearchEndpoint(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(EqlSearchResponse.createEqlSearchResponseDeserializer(tEventDeserializer));
	}
}
