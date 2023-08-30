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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SortOptions;
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
import java.lang.Integer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.query_api_keys.Request

/**
 * Retrieves information for API keys in a paginated manner. You can optionally
 * filter the results with a query.
 * 
 * @see <a href="../doc-files/api-spec.html#security.query_api_keys.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryApiKeysRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Integer from;

	@Nullable
	private final Query query;

	private final List<FieldValue> searchAfter;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	@Nullable
	private final Boolean withLimitedBy;

	// ---------------------------------------------------------------------------------------------

	private QueryApiKeysRequest(Builder builder) {

		this.from = builder.from;
		this.query = builder.query;
		this.searchAfter = ApiTypeHelper.unmodifiable(builder.searchAfter);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.withLimitedBy = builder.withLimitedBy;

	}

	public static QueryApiKeysRequest of(Function<Builder, ObjectBuilder<QueryApiKeysRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Starting document offset. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the <code>search_after</code> parameter.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * A query to filter which API keys to return. The query supports a subset of
	 * query types, including <code>match_all</code>, <code>bool</code>,
	 * <code>term</code>, <code>terms</code>, <code>ids</code>, <code>prefix</code>,
	 * <code>wildcard</code>, and <code>range</code>. You can query all public
	 * information associated with an API key.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Search after definition
	 * <p>
	 * API name: {@code search_after}
	 */
	public final List<FieldValue> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * The number of hits to return. By default, you cannot page through more than
	 * 10,000 hits using the <code>from</code> and <code>size</code> parameters. To
	 * page through more hits, use the <code>search_after</code> parameter.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Other than <code>id</code>, all public fields of an API key are eligible for
	 * sorting. In addition, sort can also be applied to the <code>_doc</code> field
	 * to sort by index order.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * Return the snapshot of the owner user's role descriptors associated with the
	 * API key. An API key's actual permission is the intersection of its assigned
	 * role descriptors and the owner user's role descriptors.
	 * <p>
	 * API name: {@code with_limited_by}
	 */
	@Nullable
	public final Boolean withLimitedBy() {
		return this.withLimitedBy;
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

		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.searchAfter)) {
			generator.writeKey("search_after");
			generator.writeStartArray();
			for (FieldValue item0 : this.searchAfter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (SortOptions item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryApiKeysRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<QueryApiKeysRequest> {
		@Nullable
		private Integer from;

		@Nullable
		private Query query;

		@Nullable
		private List<FieldValue> searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private Boolean withLimitedBy;

		/**
		 * Starting document offset. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the <code>search_after</code> parameter.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * A query to filter which API keys to return. The query supports a subset of
		 * query types, including <code>match_all</code>, <code>bool</code>,
		 * <code>term</code>, <code>terms</code>, <code>ids</code>, <code>prefix</code>,
		 * <code>wildcard</code>, and <code>range</code>. You can query all public
		 * information associated with an API key.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * A query to filter which API keys to return. The query supports a subset of
		 * query types, including <code>match_all</code>, <code>bool</code>,
		 * <code>term</code>, <code>terms</code>, <code>ids</code>, <code>prefix</code>,
		 * <code>wildcard</code>, and <code>range</code>. You can query all public
		 * information associated with an API key.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Search after definition
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(List<FieldValue> list) {
			this.searchAfter = _listAddAll(this.searchAfter, list);
			return this;
		}

		/**
		 * Search after definition
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds one or more values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(FieldValue value, FieldValue... values) {
			this.searchAfter = _listAdd(this.searchAfter, value, values);
			return this;
		}

		/**
		 * Search after definition
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds a value to <code>searchAfter</code> using a builder lambda.
		 */
		public final Builder searchAfter(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return searchAfter(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * The number of hits to return. By default, you cannot page through more than
		 * 10,000 hits using the <code>from</code> and <code>size</code> parameters. To
		 * page through more hits, use the <code>search_after</code> parameter.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Other than <code>id</code>, all public fields of an API key are eligible for
		 * sorting. In addition, sort can also be applied to the <code>_doc</code> field
		 * to sort by index order.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<SortOptions> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * Other than <code>id</code>, all public fields of an API key are eligible for
		 * sorting. In addition, sort can also be applied to the <code>_doc</code> field
		 * to sort by index order.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(SortOptions value, SortOptions... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * Other than <code>id</code>, all public fields of an API key are eligible for
		 * sorting. In addition, sort can also be applied to the <code>_doc</code> field
		 * to sort by index order.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * Return the snapshot of the owner user's role descriptors associated with the
		 * API key. An API key's actual permission is the intersection of its assigned
		 * role descriptors and the owner user's role descriptors.
		 * <p>
		 * API name: {@code with_limited_by}
		 */
		public final Builder withLimitedBy(@Nullable Boolean value) {
			this.withLimitedBy = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryApiKeysRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryApiKeysRequest build() {
			_checkSingleUse();

			return new QueryApiKeysRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryApiKeysRequest}
	 */
	public static final JsonpDeserializer<QueryApiKeysRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryApiKeysRequest::setupQueryApiKeysRequestDeserializer);

	protected static void setupQueryApiKeysRequestDeserializer(ObjectDeserializer<QueryApiKeysRequest.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.query_api_keys}".
	 */
	public static final Endpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.query_api_keys",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/_query/api_key";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.withLimitedBy != null) {
					params.put("with_limited_by", String.valueOf(request.withLimitedBy));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, QueryApiKeysResponse._DESERIALIZER);
}
