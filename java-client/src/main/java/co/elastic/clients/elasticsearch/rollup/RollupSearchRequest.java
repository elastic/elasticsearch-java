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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationVariant;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
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

// typedef: rollup.rollup_search.Request

/**
 * Search rolled-up data. The rollup search endpoint is needed because,
 * internally, rolled-up documents utilize a different document structure than
 * the original data. It rewrites standard Query DSL into a format that matches
 * the rollup documents then takes the response and rewrites it back to what a
 * client would expect given the original query.
 * <p>
 * The request body supports a subset of features from the regular search API.
 * The following functionality is not available:
 * <p>
 * <code>size</code>: Because rollups work on pre-aggregated data, no search
 * hits can be returned and so size must be set to zero or omitted entirely.
 * <code>highlighter</code>, <code>suggestors</code>, <code>post_filter</code>,
 * <code>profile</code>, <code>explain</code>: These are similarly disallowed.
 * <p>
 * <strong>Searching both historical rollup and non-rollup data</strong>
 * <p>
 * The rollup search API has the capability to search across both
 * &quot;live&quot; non-rollup data and the aggregated rollup data. This is done
 * by simply adding the live indices to the URI. For example:
 * 
 * <pre>
 * <code>GET sensor-1,sensor_rollup/_rollup_search
 * {
 *   &quot;size&quot;: 0,
 *   &quot;aggregations&quot;: {
 *      &quot;max_temperature&quot;: {
 *       &quot;max&quot;: {
 *         &quot;field&quot;: &quot;temperature&quot;
 *       }
 *     }
 *   }
 * }
 * </code>
 * </pre>
 * <p>
 * The rollup search endpoint does two things when the search runs:
 * <ul>
 * <li>The original request is sent to the non-rollup index unaltered.</li>
 * <li>A rewritten version of the original request is sent to the rollup
 * index.</li>
 * </ul>
 * <p>
 * When the two responses are received, the endpoint rewrites the rollup
 * response and merges the two together. During the merging process, if there is
 * any overlap in buckets between the two responses, the buckets from the
 * non-rollup index are used.
 * 
 * @see <a href="../doc-files/api-spec.html#rollup.rollup_search.Request">API
 *      specification</a>
 * @deprecated 8.11.0
 */
@Deprecated
@JsonpDeserializable
public class RollupSearchRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	private final List<String> index;

	@Nullable
	private final Query query;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private RollupSearchRequest(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.query = builder.query;
		this.size = builder.size;

	}

	public static RollupSearchRequest of(Function<Builder, ObjectBuilder<RollupSearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies aggregations.
	 * <p>
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * Required - A comma-separated list of data streams and indices used to limit
	 * the request. This parameter has the following rules:
	 * <ul>
	 * <li>At least one data stream, index, or wildcard expression must be
	 * specified. This target can include a rollup or non-rollup index. For data
	 * streams, the stream's backing indices can only serve as non-rollup indices.
	 * Omitting the parameter or using <code>_all</code> are not permitted.</li>
	 * <li>Multiple non-rollup indices may be specified.</li>
	 * <li>Only one rollup index may be specified. If more than one are supplied, an
	 * exception occurs.</li>
	 * <li>Wildcard expressions (<code>*</code>) may be used. If they match more
	 * than one rollup index, an exception occurs. However, you can use an
	 * expression to match multiple non-rollup indices or data streams.</li>
	 * </ul>
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Specifies a DSL query that is subject to some limitations.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Must be zero if set, as rollups work on pre-aggregated data.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupSearchRequest}.
	 */
	@Deprecated
	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RollupSearchRequest> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		private List<String> index;

		@Nullable
		private Query query;

		@Nullable
		private Integer size;

		/**
		 * Specifies aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, Aggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * Specifies aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, Aggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * Specifies aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, AggregationVariant value) {
			this.aggregations = _mapPut(this.aggregations, key, value._toAggregation());
			return this;
		}

		/**
		 * Specifies aggregations.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * Required - A comma-separated list of data streams and indices used to limit
		 * the request. This parameter has the following rules:
		 * <ul>
		 * <li>At least one data stream, index, or wildcard expression must be
		 * specified. This target can include a rollup or non-rollup index. For data
		 * streams, the stream's backing indices can only serve as non-rollup indices.
		 * Omitting the parameter or using <code>_all</code> are not permitted.</li>
		 * <li>Multiple non-rollup indices may be specified.</li>
		 * <li>Only one rollup index may be specified. If more than one are supplied, an
		 * exception occurs.</li>
		 * <li>Wildcard expressions (<code>*</code>) may be used. If they match more
		 * than one rollup index, an exception occurs. However, you can use an
		 * expression to match multiple non-rollup indices or data streams.</li>
		 * </ul>
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
		 * Required - A comma-separated list of data streams and indices used to limit
		 * the request. This parameter has the following rules:
		 * <ul>
		 * <li>At least one data stream, index, or wildcard expression must be
		 * specified. This target can include a rollup or non-rollup index. For data
		 * streams, the stream's backing indices can only serve as non-rollup indices.
		 * Omitting the parameter or using <code>_all</code> are not permitted.</li>
		 * <li>Multiple non-rollup indices may be specified.</li>
		 * <li>Only one rollup index may be specified. If more than one are supplied, an
		 * exception occurs.</li>
		 * <li>Wildcard expressions (<code>*</code>) may be used. If they match more
		 * than one rollup index, an exception occurs. However, you can use an
		 * expression to match multiple non-rollup indices or data streams.</li>
		 * </ul>
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
		 * Specifies a DSL query that is subject to some limitations.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Specifies a DSL query that is subject to some limitations.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Specifies a DSL query that is subject to some limitations.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
		}

		/**
		 * Must be zero if set, as rollups work on pre-aggregated data.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RollupSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupSearchRequest build() {
			_checkSingleUse();

			return new RollupSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupSearchRequest}
	 */
	public static final JsonpDeserializer<RollupSearchRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RollupSearchRequest::setupRollupSearchRequestDeserializer);

	protected static void setupRollupSearchRequestDeserializer(ObjectDeserializer<RollupSearchRequest.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.rollup_search}".
	 */
	public static final SimpleEndpoint<RollupSearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>(
			"es/rollup.rollup_search",

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
					buf.append("/_rollup_search");
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
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, RollupSearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code rollup.rollup_search}" endpoint.
	 */
	public static <TDocument> Endpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse> createRollupSearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT.withResponseDeserializer(
				RollupSearchResponse.createRollupSearchResponseDeserializer(tDocumentDeserializer));
	}
}
