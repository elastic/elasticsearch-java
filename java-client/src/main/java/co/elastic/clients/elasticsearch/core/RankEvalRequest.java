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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.rank_eval.RankEvalMetric;
import co.elastic.clients.elasticsearch.core.rank_eval.RankEvalRequestItem;
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
public class RankEvalRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final RankEvalMetric metric;

	private final List<RankEvalRequestItem> requests;

	@Nullable
	private final String searchType;

	// ---------------------------------------------------------------------------------------------

	private RankEvalRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.metric = builder.metric;
		this.requests = ModelTypeHelper.unmodifiableRequired(builder.requests, this, "requests");
		this.searchType = builder.searchType;

	}

	public static RankEvalRequest of(Function<Builder, ObjectBuilder<RankEvalRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>true</code>, missing or closed indices are not included in the
	 * response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - Comma-separated list of data streams, indices, and index aliases
	 * used to limit the request. Wildcard (<code>*</code>) expressions are
	 * supported. To target all data streams and indices in a cluster, omit this
	 * parameter or use <code>_all</code> or <code>*</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Definition of the evaluation metric to calculate.
	 * <p>
	 * API name: {@code metric}
	 */
	@Nullable
	public final RankEvalMetric metric() {
		return this.metric;
	}

	/**
	 * Required - A set of typical search requests, together with their provided
	 * ratings.
	 * <p>
	 * API name: {@code requests}
	 */
	public final List<RankEvalRequestItem> requests() {
		return this.requests;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final String searchType() {
		return this.searchType;
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

		if (this.metric != null) {
			generator.writeKey("metric");
			this.metric.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.requests)) {
			generator.writeKey("requests");
			generator.writeStartArray();
			for (RankEvalRequestItem item0 : this.requests) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RankEvalRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		@Nullable
		private RankEvalMetric metric;

		private List<RankEvalRequestItem> requests;

		@Nullable
		private String searchType;

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
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * If <code>true</code>, missing or closed indices are not included in the
		 * response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
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
		public final Builder index(List<String> value) {
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
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Definition of the evaluation metric to calculate.
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(@Nullable RankEvalMetric value) {
			this.metric = value;
			return this;
		}

		/**
		 * Definition of the evaluation metric to calculate.
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(Function<RankEvalMetric.Builder, ObjectBuilder<RankEvalMetric>> fn) {
			return this.metric(fn.apply(new RankEvalMetric.Builder()).build());
		}

		/**
		 * Required - A set of typical search requests, together with their provided
		 * ratings.
		 * <p>
		 * API name: {@code requests}
		 */
		public final Builder requests(List<RankEvalRequestItem> value) {
			this.requests = value;
			return this;
		}

		/**
		 * Required - A set of typical search requests, together with their provided
		 * ratings.
		 * <p>
		 * API name: {@code requests}
		 */
		public final Builder requests(RankEvalRequestItem... value) {
			this.requests = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - A set of typical search requests, together with their provided
		 * ratings.
		 * <p>
		 * API name: {@code requests}
		 */
		@SafeVarargs
		public final Builder requests(
				Function<RankEvalRequestItem.Builder, ObjectBuilder<RankEvalRequestItem>>... fns) {
			this.requests = new ArrayList<>(fns.length);
			for (Function<RankEvalRequestItem.Builder, ObjectBuilder<RankEvalRequestItem>> fn : fns) {
				this.requests.add(fn.apply(new RankEvalRequestItem.Builder()).build());
			}
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable String value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalRequest build() {
			_checkSingleUse();

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

		op.add(Builder::metric, RankEvalMetric._DESERIALIZER, "metric");
		op.add(Builder::requests, JsonpDeserializer.arrayDeserializer(RankEvalRequestItem._DESERIALIZER), "requests");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rank_eval}".
	 */
	public static final Endpoint<RankEvalRequest, RankEvalResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.searchType != null) {
					params.put("search_type", request.searchType);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RankEvalResponse._DESERIALIZER);
}
