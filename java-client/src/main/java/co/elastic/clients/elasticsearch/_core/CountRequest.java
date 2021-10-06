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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.DefaultOperator;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
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

// typedef: _global.count.Request
@JsonpDeserializable
public final class CountRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final DefaultOperator defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Double minScore;

	@Nullable
	private final String preference;

	@Nullable
	private final String routing;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final String q;

	@Nullable
	private final Query query;

	// ---------------------------------------------------------------------------------------------

	public CountRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.allowNoIndices = builder.allowNoIndices;
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.lenient = builder.lenient;
		this.minScore = builder.minScore;
		this.preference = builder.preference;
		this.routing = builder.routing;
		this.terminateAfter = builder.terminateAfter;
		this.q = builder.q;
		this.query = builder.query;

	}

	public CountRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of indices to restrict the results
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * The analyzer to use for the query string
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * Specify whether wildcard and prefix queries should be analyzed (default:
	 * false)
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * The default operator for query string query (AND or OR)
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public DefaultOperator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The field to use as default where no field prefix is given in the query
	 * string
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Whether specified concrete, expanded or aliased indices should be ignored
	 * when throttled
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Specify whether format-based query failures (such as providing text to a
	 * numeric field) should be ignored
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Include only documents with a specific <code>_score</code> value in the
	 * result
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public Double minScore() {
		return this.minScore;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * A comma-separated list of specific routing values
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * The maximum count for each shard, upon reaching which the query execution
	 * will terminate early
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * Query in the Lucene query string syntax
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public String q() {
		return this.q;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public Query query() {
		return this.query;
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
	 * Builder for {@link CountRequest}.
	 */
	public static class Builder implements ObjectBuilder<CountRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private DefaultOperator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Double minScore;

		@Nullable
		private String preference;

		@Nullable
		private String routing;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private String q;

		@Nullable
		private Query query;

		/**
		 * A comma-separated list of indices to restrict the results
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of indices to restrict the results
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * The analyzer to use for the query string
		 * <p>
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Specify whether wildcard and prefix queries should be analyzed (default:
		 * false)
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * The default operator for query string query (AND or OR)
		 * <p>
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable DefaultOperator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The field to use as default where no field prefix is given in the query
		 * string
		 * <p>
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
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
		 * Whether specified concrete, expanded or aliased indices should be ignored
		 * when throttled
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Specify whether format-based query failures (such as providing text to a
		 * numeric field) should be ignored
		 * <p>
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * Include only documents with a specific <code>_score</code> value in the
		 * result
		 * <p>
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * A comma-separated list of specific routing values
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * The maximum count for each shard, upon reaching which the query execution
		 * will terminate early
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax
		 * <p>
		 * API name: {@code q}
		 */
		public Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Builds a {@link CountRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CountRequest build() {

			return new CountRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CountRequest}
	 */
	public static final JsonpDeserializer<CountRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CountRequest::setupCountRequestDeserializer, Builder::build);

	protected static void setupCountRequestDeserializer(DelegatingDeserializer<CountRequest.Builder> op) {

		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code count}".
	 */
	public static final Endpoint<CountRequest, CountResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_count");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_count");
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
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.toString());
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.minScore != null) {
					params.put("min_score", String.valueOf(request.minScore));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.terminateAfter != null) {
					params.put("terminate_after", String.valueOf(request.terminateAfter));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CountResponse._DESERIALIZER);
}
