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
import co.elastic.clients.elasticsearch._core.rank_eval.RankEvalMetric;
import co.elastic.clients.elasticsearch._core.rank_eval.RankEvalRequestItem;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
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

// typedef: _global.rank_eval.Request
@JsonpDeserializable
public final class RankEvalRequest extends RequestBase implements JsonpSerializable {
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final String searchType;

	private final List<RankEvalRequestItem> requests;

	@Nullable
	private final RankEvalMetric metric;

	// ---------------------------------------------------------------------------------------------

	public RankEvalRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiableNonNull(builder.index, "index");
		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.searchType = builder.searchType;
		this.requests = ModelTypeHelper.unmodifiableNonNull(builder.requests, "requests");
		this.metric = builder.metric;

	}

	public RankEvalRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Comma-separated list of data streams, indices, and index aliases
	 * used to limit the request. Wildcard (<code>*</code>) expressions are
	 * supported. To target all data streams and indices in a cluster, omit this
	 * parameter or use <code>_all</code> or <code>*</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices. For example, a request targeting <code>foo*,bar*</code> returns an
	 * error if an index starts with <code>foo</code> but no index starts with
	 * <code>bar</code>.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
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
	 * If <code>true</code>, missing or closed indices are not included in the
	 * response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public String searchType() {
		return this.searchType;
	}

	/**
	 * Required - A set of typical search requests, together with their provided
	 * ratings.
	 * <p>
	 * API name: {@code requests}
	 */
	public List<RankEvalRequestItem> requests() {
		return this.requests;
	}

	/**
	 * Definition of the evaluation metric to calculate.
	 * <p>
	 * API name: {@code metric}
	 */
	@Nullable
	public RankEvalMetric metric() {
		return this.metric;
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

		generator.writeKey("requests");
		generator.writeStartArray();
		for (RankEvalRequestItem item0 : this.requests) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.metric != null) {

			generator.writeKey("metric");
			this.metric.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalRequest}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalRequest> {
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private String searchType;

		private List<RankEvalRequestItem> requests;

		@Nullable
		private RankEvalMetric metric;

		/**
		 * Required - Comma-separated list of data streams, indices, and index aliases
		 * used to limit the request. Wildcard (<code>*</code>) expressions are
		 * supported. To target all data streams and indices in a cluster, omit this
		 * parameter or use <code>_all</code> or <code>*</code>.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, and index aliases
		 * used to limit the request. Wildcard (<code>*</code>) expressions are
		 * supported. To target all data streams and indices in a cluster, omit this
		 * parameter or use <code>_all</code> or <code>*</code>.
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
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices. For example, a request targeting <code>foo*,bar*</code> returns an
		 * error if an index starts with <code>foo</code> but no index starts with
		 * <code>bar</code>.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
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
		 * If <code>true</code>, missing or closed indices are not included in the
		 * response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable String value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Required - A set of typical search requests, together with their provided
		 * ratings.
		 * <p>
		 * API name: {@code requests}
		 */
		public Builder requests(List<RankEvalRequestItem> value) {
			this.requests = value;
			return this;
		}

		/**
		 * Required - A set of typical search requests, together with their provided
		 * ratings.
		 * <p>
		 * API name: {@code requests}
		 */
		public Builder requests(RankEvalRequestItem... value) {
			this.requests = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #requests(List)}, creating the list if needed.
		 */
		public Builder addRequests(RankEvalRequestItem value) {
			if (this.requests == null) {
				this.requests = new ArrayList<>();
			}
			this.requests.add(value);
			return this;
		}

		/**
		 * Set {@link #requests(List)} to a singleton list.
		 */
		public Builder requests(Function<RankEvalRequestItem.Builder, ObjectBuilder<RankEvalRequestItem>> fn) {
			return this.requests(fn.apply(new RankEvalRequestItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #requests(List)}, creating the list if needed.
		 */
		public Builder addRequests(Function<RankEvalRequestItem.Builder, ObjectBuilder<RankEvalRequestItem>> fn) {
			return this.addRequests(fn.apply(new RankEvalRequestItem.Builder()).build());
		}

		/**
		 * Definition of the evaluation metric to calculate.
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(@Nullable RankEvalMetric value) {
			this.metric = value;
			return this;
		}

		/**
		 * Definition of the evaluation metric to calculate.
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(Function<RankEvalMetric.Builder, ObjectBuilder<RankEvalMetric>> fn) {
			return this.metric(fn.apply(new RankEvalMetric.Builder()).build());
		}

		/**
		 * Builds a {@link RankEvalRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalRequest build() {

			return new RankEvalRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalRequest}
	 */
	public static final JsonpDeserializer<RankEvalRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankEvalRequest::setupRankEvalRequestDeserializer, Builder::build);

	protected static void setupRankEvalRequestDeserializer(DelegatingDeserializer<RankEvalRequest.Builder> op) {

		op.add(Builder::requests, JsonpDeserializer.arrayDeserializer(RankEvalRequestItem._DESERIALIZER), "requests");
		op.add(Builder::metric, RankEvalMetric._DESERIALIZER, "metric");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rank_eval}".
	 */
	public static final Endpoint<RankEvalRequest, RankEvalResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_rank_eval");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_rank_eval");
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
				if (request.searchType != null) {
					params.put("search_type", request.searchType);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RankEvalResponse._DESERIALIZER);
}
