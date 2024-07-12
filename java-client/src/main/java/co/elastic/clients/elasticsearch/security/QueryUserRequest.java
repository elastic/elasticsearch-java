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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SortOptions;
import co.elastic.clients.elasticsearch.security.query_user.UserQuery;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

// typedef: security.query_user.Request

/**
 * Retrieves information for Users in a paginated manner. You can optionally
 * filter the results with a query.
 * 
 * @see <a href="../doc-files/api-spec.html#security.query_user.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryUserRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Integer from;

	@Nullable
	private final UserQuery query;

	private final List<FieldValue> searchAfter;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	@Nullable
	private final Boolean withProfileUid;

	// ---------------------------------------------------------------------------------------------

	private QueryUserRequest(Builder builder) {

		this.from = builder.from;
		this.query = builder.query;
		this.searchAfter = ApiTypeHelper.unmodifiable(builder.searchAfter);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);
		this.withProfileUid = builder.withProfileUid;

	}

	public static QueryUserRequest of(Function<Builder, ObjectBuilder<QueryUserRequest>> fn) {
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
	 * A query to filter which users to return. If the query parameter is missing,
	 * it is equivalent to a <code>match_all</code> query. The query supports a
	 * subset of query types, including <code>match_all</code>, <code>bool</code>,
	 * <code>term</code>, <code>terms</code>, <code>match</code>, <code>ids</code>,
	 * <code>prefix</code>, <code>wildcard</code>, <code>exists</code>,
	 * <code>range</code>, and <code>simple_query_string</code>. You can query the
	 * following information associated with user: <code>username</code>,
	 * <code>roles</code>, <code>enabled</code>
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final UserQuery query() {
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
	 * Fields eligible for sorting are: username, roles, enabled In addition, sort
	 * can also be applied to the <code>_doc</code> field to sort by index order.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
	}

	/**
	 * If true will return the User Profile ID for the users in the query result, if
	 * any.
	 * <p>
	 * API name: {@code with_profile_uid}
	 */
	@Nullable
	public final Boolean withProfileUid() {
		return this.withProfileUid;
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
	 * Builder for {@link QueryUserRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<QueryUserRequest> {
		@Nullable
		private Integer from;

		@Nullable
		private UserQuery query;

		@Nullable
		private List<FieldValue> searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private List<SortOptions> sort;

		@Nullable
		private Boolean withProfileUid;

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
		 * A query to filter which users to return. If the query parameter is missing,
		 * it is equivalent to a <code>match_all</code> query. The query supports a
		 * subset of query types, including <code>match_all</code>, <code>bool</code>,
		 * <code>term</code>, <code>terms</code>, <code>match</code>, <code>ids</code>,
		 * <code>prefix</code>, <code>wildcard</code>, <code>exists</code>,
		 * <code>range</code>, and <code>simple_query_string</code>. You can query the
		 * following information associated with user: <code>username</code>,
		 * <code>roles</code>, <code>enabled</code>
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable UserQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * A query to filter which users to return. If the query parameter is missing,
		 * it is equivalent to a <code>match_all</code> query. The query supports a
		 * subset of query types, including <code>match_all</code>, <code>bool</code>,
		 * <code>term</code>, <code>terms</code>, <code>match</code>, <code>ids</code>,
		 * <code>prefix</code>, <code>wildcard</code>, <code>exists</code>,
		 * <code>range</code>, and <code>simple_query_string</code>. You can query the
		 * following information associated with user: <code>username</code>,
		 * <code>roles</code>, <code>enabled</code>
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<UserQuery.Builder, ObjectBuilder<UserQuery>> fn) {
			return this.query(fn.apply(new UserQuery.Builder()).build());
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
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(String value, String... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (String v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Search after definition
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(long value, long... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (long v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Search after definition
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(double value, double... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (double v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
			return this;
		}

		/**
		 * Search after definition
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds all passed values to <code>searchAfter</code>.
		 */
		public final Builder searchAfter(boolean value, boolean... values) {
			this.searchAfter = _listAdd(this.searchAfter, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (boolean v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.searchAfter = _listAddAll(this.searchAfter, fieldValues);
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
		 * Fields eligible for sorting are: username, roles, enabled In addition, sort
		 * can also be applied to the <code>_doc</code> field to sort by index order.
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
		 * Fields eligible for sorting are: username, roles, enabled In addition, sort
		 * can also be applied to the <code>_doc</code> field to sort by index order.
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
		 * Fields eligible for sorting are: username, roles, enabled In addition, sort
		 * can also be applied to the <code>_doc</code> field to sort by index order.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		/**
		 * If true will return the User Profile ID for the users in the query result, if
		 * any.
		 * <p>
		 * API name: {@code with_profile_uid}
		 */
		public final Builder withProfileUid(@Nullable Boolean value) {
			this.withProfileUid = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryUserRequest build() {
			_checkSingleUse();

			return new QueryUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryUserRequest}
	 */
	public static final JsonpDeserializer<QueryUserRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryUserRequest::setupQueryUserRequestDeserializer);

	protected static void setupQueryUserRequestDeserializer(ObjectDeserializer<QueryUserRequest.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::query, UserQuery._DESERIALIZER, "query");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.query_user}".
	 */
	public static final Endpoint<QueryUserRequest, QueryUserResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.query_user",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/_query/user";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.withProfileUid != null) {
					params.put("with_profile_uid", String.valueOf(request.withProfileUid));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, QueryUserResponse._DESERIALIZER);
}
