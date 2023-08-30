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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Operator;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.validate_query.Request

/**
 * Validates a potentially expensive query without executing it.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.validate_query.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class ValidateQueryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allShards;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Operator defaultOperator;

	@Nullable
	private final String df;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final String q;

	@Nullable
	private final Query query;

	@Nullable
	private final Boolean rewrite;

	// ---------------------------------------------------------------------------------------------

	private ValidateQueryRequest(Builder builder) {

		this.allShards = builder.allShards;
		this.allowNoIndices = builder.allowNoIndices;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.analyzer = builder.analyzer;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.explain = builder.explain;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.lenient = builder.lenient;
		this.q = builder.q;
		this.query = builder.query;
		this.rewrite = builder.rewrite;

	}

	public static ValidateQueryRequest of(Function<Builder, ObjectBuilder<ValidateQueryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the validation is executed on all shards instead of one
	 * random shard per index.
	 * <p>
	 * API name: {@code all_shards}
	 */
	@Nullable
	public final Boolean allShards() {
		return this.allShards;
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * If <code>true</code>, wildcard and prefix queries are analyzed.
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public final Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * Analyzer to use for the query string. This parameter can only be used when
	 * the <code>q</code> query string parameter is specified.
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * The default operator for query string query: <code>AND</code> or
	 * <code>OR</code>.
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public final Operator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * Field to use as default where no field prefix is given in the query string.
	 * This parameter can only be used when the <code>q</code> query string
	 * parameter is specified.
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public final String df() {
		return this.df;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as
	 * <code>open,hidden</code>. Valid values are: <code>all</code>,
	 * <code>open</code>, <code>closed</code>, <code>hidden</code>,
	 * <code>none</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>true</code>, the response returns detailed information if an error
	 * has occurred.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Comma-separated list of data streams, indices, and aliases to search.
	 * Supports wildcards (<code>*</code>). To search all data streams or indices,
	 * omit this parameter or use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * If <code>true</code>, format-based query failures (such as providing text to
	 * a numeric field) in the query string will be ignored.
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public final Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Query in the Lucene query string syntax.
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public final String q() {
		return this.q;
	}

	/**
	 * Query in the Lucene query string syntax.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * If <code>true</code>, returns a more detailed explanation showing the actual
	 * Lucene query that will be executed.
	 * <p>
	 * API name: {@code rewrite}
	 */
	@Nullable
	public final Boolean rewrite() {
		return this.rewrite;
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

		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateQueryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ValidateQueryRequest> {
		@Nullable
		private Boolean allShards;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private String analyzer;

		@Nullable
		private Operator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean explain;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean lenient;

		@Nullable
		private String q;

		@Nullable
		private Query query;

		@Nullable
		private Boolean rewrite;

		/**
		 * If <code>true</code>, the validation is executed on all shards instead of one
		 * random shard per index.
		 * <p>
		 * API name: {@code all_shards}
		 */
		public final Builder allShards(@Nullable Boolean value) {
			this.allShards = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * If <code>true</code>, wildcard and prefix queries are analyzed.
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public final Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * Analyzer to use for the query string. This parameter can only be used when
		 * the <code>q</code> query string parameter is specified.
		 * <p>
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * The default operator for query string query: <code>AND</code> or
		 * <code>OR</code>.
		 * <p>
		 * API name: {@code default_operator}
		 */
		public final Builder defaultOperator(@Nullable Operator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * Field to use as default where no field prefix is given in the query string.
		 * This parameter can only be used when the <code>q</code> query string
		 * parameter is specified.
		 * <p>
		 * API name: {@code df}
		 */
		public final Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>. Valid values are: <code>all</code>,
		 * <code>open</code>, <code>closed</code>, <code>hidden</code>,
		 * <code>none</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>. Valid values are: <code>all</code>,
		 * <code>open</code>, <code>closed</code>, <code>hidden</code>,
		 * <code>none</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the response returns detailed information if an error
		 * has occurred.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and aliases to search.
		 * Supports wildcards (<code>*</code>). To search all data streams or indices,
		 * omit this parameter or use <code>*</code> or <code>_all</code>.
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
		 * Comma-separated list of data streams, indices, and aliases to search.
		 * Supports wildcards (<code>*</code>). To search all data streams or indices,
		 * omit this parameter or use <code>*</code> or <code>_all</code>.
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
		 * If <code>true</code>, format-based query failures (such as providing text to
		 * a numeric field) in the query string will be ignored.
		 * <p>
		 * API name: {@code lenient}
		 */
		public final Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax.
		 * <p>
		 * API name: {@code q}
		 */
		public final Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * If <code>true</code>, returns a more detailed explanation showing the actual
		 * Lucene query that will be executed.
		 * <p>
		 * API name: {@code rewrite}
		 */
		public final Builder rewrite(@Nullable Boolean value) {
			this.rewrite = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ValidateQueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateQueryRequest build() {
			_checkSingleUse();

			return new ValidateQueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValidateQueryRequest}
	 */
	public static final JsonpDeserializer<ValidateQueryRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ValidateQueryRequest::setupValidateQueryRequestDeserializer);

	protected static void setupValidateQueryRequestDeserializer(ObjectDeserializer<ValidateQueryRequest.Builder> op) {

		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.validate_query}".
	 */
	public static final Endpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.validate_query",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_validate");
					buf.append("/query");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_validate");
					buf.append("/query");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.explain != null) {
					params.put("explain", String.valueOf(request.explain));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.jsonValue());
				}
				if (request.allShards != null) {
					params.put("all_shards", String.valueOf(request.allShards));
				}
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
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.rewrite != null) {
					params.put("rewrite", String.valueOf(request.rewrite));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, ValidateQueryResponse._DESERIALIZER);
}
