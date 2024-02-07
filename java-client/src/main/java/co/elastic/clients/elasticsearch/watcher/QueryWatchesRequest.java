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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

// typedef: watcher.query_watches.Request

/**
 * Retrieves stored watches.
 * 
 * @see <a href="../doc-files/api-spec.html#watcher.query_watches.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryWatchesRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Integer from;

	@Nullable
	private final Query query;

	private final List<FieldValue> searchAfter;

	@Nullable
	private final Integer size;

	private final List<SortOptions> sort;

	// ---------------------------------------------------------------------------------------------

	private QueryWatchesRequest(Builder builder) {

		this.from = builder.from;
		this.query = builder.query;
		this.searchAfter = ApiTypeHelper.unmodifiable(builder.searchAfter);
		this.size = builder.size;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static QueryWatchesRequest of(Function<Builder, ObjectBuilder<QueryWatchesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The offset from the first result to fetch. Needs to be non-negative.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Optional, query filter watches to be returned.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Optional search After to do pagination using last hit’s sort values.
	 * <p>
	 * API name: {@code search_after}
	 */
	public final List<FieldValue> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * The number of hits to return. Needs to be non-negative.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Optional sort definition.
	 * <p>
	 * API name: {@code sort}
	 */
	public final List<SortOptions> sort() {
		return this.sort;
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
	 * Builder for {@link QueryWatchesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<QueryWatchesRequest> {
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

		/**
		 * The offset from the first result to fetch. Needs to be non-negative.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Optional, query filter watches to be returned.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Optional, query filter watches to be returned.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Optional search After to do pagination using last hit’s sort values.
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
		 * Optional search After to do pagination using last hit’s sort values.
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
		 * Optional search After to do pagination using last hit’s sort values.
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
		 * Optional search After to do pagination using last hit’s sort values.
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
		 * Optional search After to do pagination using last hit’s sort values.
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
		 * Optional search After to do pagination using last hit’s sort values.
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
		 * Optional search After to do pagination using last hit’s sort values.
		 * <p>
		 * API name: {@code search_after}
		 * <p>
		 * Adds a value to <code>searchAfter</code> using a builder lambda.
		 */
		public final Builder searchAfter(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return searchAfter(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * The number of hits to return. Needs to be non-negative.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Optional sort definition.
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
		 * Optional sort definition.
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
		 * Optional sort definition.
		 * <p>
		 * API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<SortOptions.Builder, ObjectBuilder<SortOptions>> fn) {
			return sort(fn.apply(new SortOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryWatchesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatchesRequest build() {
			_checkSingleUse();

			return new QueryWatchesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryWatchesRequest}
	 */
	public static final JsonpDeserializer<QueryWatchesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryWatchesRequest::setupQueryWatchesRequestDeserializer);

	protected static void setupQueryWatchesRequestDeserializer(ObjectDeserializer<QueryWatchesRequest.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(SortOptions._DESERIALIZER), "sort");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.query_watches}".
	 */
	public static final Endpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.query_watches",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_watcher/_query/watches";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, QueryWatchesResponse._DESERIALIZER);
}
