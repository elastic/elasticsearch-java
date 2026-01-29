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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
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

// typedef: _global.terms_enum.Request

/**
 * Get terms in an index.
 * <p>
 * Discover terms that match a partial string in an index. This API is designed
 * for low-latency look-ups used in auto-complete scenarios. <blockquote>
 * <p>
 * info The terms enum API may return terms from deleted documents. Deleted
 * documents are initially only marked as deleted. It is not until their
 * segments are merged that documents are actually deleted. Until that happens,
 * the terms enum API will return terms from these documents.
 * </p>
 * </blockquote>
 *
 * @see <a href="../doc-files/api-spec.html#_global.terms_enum.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermsEnumRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean caseInsensitive;

	private final String field;

	private final String index;

	@Nullable
	private final Query indexFilter;

	@Nullable
	private final String searchAfter;

	@Nullable
	private final Integer size;

	@Nullable
	private final String string;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private TermsEnumRequest(Builder builder) {

		this.caseInsensitive = builder.caseInsensitive;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.indexFilter = builder.indexFilter;
		this.searchAfter = builder.searchAfter;
		this.size = builder.size;
		this.string = builder.string;
		this.timeout = builder.timeout;

	}

	public static TermsEnumRequest of(Function<Builder, ObjectBuilder<TermsEnumRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * When <code>true</code>, the provided search string is matched against index
	 * terms without case sensitivity.
	 * <p>
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public final Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	/**
	 * Required - The string to match at the start of indexed terms. If not
	 * provided, all terms in the field are considered.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - A comma-separated list of data streams, indices, and index aliases
	 * to search. Wildcard (<code>*</code>) expressions are supported. To search all
	 * data streams or indices, omit this parameter or use <code>*</code> or
	 * <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Filter an index shard if the provided query rewrites to
	 * <code>match_none</code>.
	 * <p>
	 * API name: {@code index_filter}
	 */
	@Nullable
	public final Query indexFilter() {
		return this.indexFilter;
	}

	/**
	 * The string after which terms in the index should be returned. It allows for a
	 * form of pagination if the last result from one request is passed as the
	 * <code>search_after</code> parameter for a subsequent request.
	 * <p>
	 * API name: {@code search_after}
	 */
	@Nullable
	public final String searchAfter() {
		return this.searchAfter;
	}

	/**
	 * The number of matching terms to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * The string to match at the start of indexed terms. If it is not provided, all
	 * terms in the field are considered. <blockquote>
	 * <p>
	 * info The prefix string cannot be larger than the largest possible keyword
	 * value, which is Lucene's term byte-length limit of 32766.
	 * </p>
	 * </blockquote>
	 * <p>
	 * API name: {@code string}
	 */
	@Nullable
	public final String string() {
		return this.string;
	}

	/**
	 * The maximum length of time to spend collecting results. If the timeout is
	 * exceeded the <code>complete</code> flag set to <code>false</code> in the
	 * response and the results may be partial or empty.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (this.caseInsensitive != null) {
			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.indexFilter != null) {
			generator.writeKey("index_filter");
			this.indexFilter.serialize(generator, mapper);

		}
		if (this.searchAfter != null) {
			generator.writeKey("search_after");
			generator.write(this.searchAfter);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.string != null) {
			generator.writeKey("string");
			generator.write(this.string);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsEnumRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TermsEnumRequest> {
		@Nullable
		private Boolean caseInsensitive;

		private String field;

		private String index;

		@Nullable
		private Query indexFilter;

		@Nullable
		private String searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private String string;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(TermsEnumRequest instance) {
			this.caseInsensitive = instance.caseInsensitive;
			this.field = instance.field;
			this.index = instance.index;
			this.indexFilter = instance.indexFilter;
			this.searchAfter = instance.searchAfter;
			this.size = instance.size;
			this.string = instance.string;
			this.timeout = instance.timeout;

		}
		/**
		 * When <code>true</code>, the provided search string is matched against index
		 * terms without case sensitivity.
		 * <p>
		 * API name: {@code case_insensitive}
		 */
		public final Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		/**
		 * Required - The string to match at the start of indexed terms. If not
		 * provided, all terms in the field are considered.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of data streams, indices, and index aliases
		 * to search. Wildcard (<code>*</code>) expressions are supported. To search all
		 * data streams or indices, omit this parameter or use <code>*</code> or
		 * <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Filter an index shard if the provided query rewrites to
		 * <code>match_none</code>.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(@Nullable Query value) {
			this.indexFilter = value;
			return this;
		}

		/**
		 * Filter an index shard if the provided query rewrites to
		 * <code>match_none</code>.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.indexFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Filter an index shard if the provided query rewrites to
		 * <code>match_none</code>.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(QueryVariant value) {
			this.indexFilter = value._toQuery();
			return this;
		}

		/**
		 * The string after which terms in the index should be returned. It allows for a
		 * form of pagination if the last result from one request is passed as the
		 * <code>search_after</code> parameter for a subsequent request.
		 * <p>
		 * API name: {@code search_after}
		 */
		public final Builder searchAfter(@Nullable String value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * The number of matching terms to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * The string to match at the start of indexed terms. If it is not provided, all
		 * terms in the field are considered. <blockquote>
		 * <p>
		 * info The prefix string cannot be larger than the largest possible keyword
		 * value, which is Lucene's term byte-length limit of 32766.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code string}
		 */
		public final Builder string(@Nullable String value) {
			this.string = value;
			return this;
		}

		/**
		 * The maximum length of time to spend collecting results. If the timeout is
		 * exceeded the <code>complete</code> flag set to <code>false</code> in the
		 * response and the results may be partial or empty.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The maximum length of time to spend collecting results. If the timeout is
		 * exceeded the <code>complete</code> flag set to <code>false</code> in the
		 * response and the results may be partial or empty.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermsEnumRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsEnumRequest build() {
			_checkSingleUse();

			return new TermsEnumRequest(this);
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
	 * Json deserializer for {@link TermsEnumRequest}
	 */
	public static final JsonpDeserializer<TermsEnumRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsEnumRequest::setupTermsEnumRequestDeserializer);

	protected static void setupTermsEnumRequestDeserializer(ObjectDeserializer<TermsEnumRequest.Builder> op) {

		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::indexFilter, Query._DESERIALIZER, "index_filter");
		op.add(Builder::searchAfter, JsonpDeserializer.stringDeserializer(), "search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::string, JsonpDeserializer.stringDeserializer(), "string");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code terms_enum}".
	 */
	public static final Endpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/terms_enum",

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
					buf.append("/_terms_enum");
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
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, TermsEnumResponse._DESERIALIZER);
}
