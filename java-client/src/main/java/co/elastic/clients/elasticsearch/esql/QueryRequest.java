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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
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

// typedef: esql.query.Request

/**
 * Executes an ES|QL request
 * 
 * @see <a href="../doc-files/api-spec.html#esql.query.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean columnar;

	@Nullable
	private final String delimiter;

	@Nullable
	private final Query filter;

	@Nullable
	private final String format;

	@Nullable
	private final String locale;

	private final List<FieldValue> params;

	private final String query;

	// ---------------------------------------------------------------------------------------------

	private QueryRequest(Builder builder) {

		this.columnar = builder.columnar;
		this.delimiter = builder.delimiter;
		this.filter = builder.filter;
		this.format = builder.format;
		this.locale = builder.locale;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");

	}

	public static QueryRequest of(Function<Builder, ObjectBuilder<QueryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * By default, ES|QL returns results as rows. For example, FROM returns each
	 * individual document as one row. For the JSON, YAML, CBOR and smile formats,
	 * ES|QL can return the results in a columnar fashion where one row represents
	 * all the values of a certain column in the results.
	 * <p>
	 * API name: {@code columnar}
	 */
	@Nullable
	public final Boolean columnar() {
		return this.columnar;
	}

	/**
	 * The character to use between values within a CSV row. Only valid for the CSV
	 * format.
	 * <p>
	 * API name: {@code delimiter}
	 */
	@Nullable
	public final String delimiter() {
		return this.delimiter;
	}

	/**
	 * Specify a Query DSL query in the filter parameter to filter the set of
	 * documents that an ES|QL query runs on.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * A short version of the Accept header, e.g. json, yaml.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code locale}
	 */
	@Nullable
	public final String locale() {
		return this.locale;
	}

	/**
	 * To avoid any attempts of hacking or code injection, extract the values in a
	 * separate list of parameters. Use question mark placeholders (?) in the query
	 * string for each of the parameters.
	 * <p>
	 * API name: {@code params}
	 */
	public final List<FieldValue> params() {
		return this.params;
	}

	/**
	 * Required - The ES|QL query API accepts an ES|QL query string in the query
	 * parameter, runs it, and returns the results.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
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

		if (this.columnar != null) {
			generator.writeKey("columnar");
			generator.write(this.columnar);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.locale != null) {
			generator.writeKey("locale");
			generator.write(this.locale);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartArray();
			for (FieldValue item0 : this.params) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("query");
		generator.write(this.query);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<QueryRequest> {
		@Nullable
		private Boolean columnar;

		@Nullable
		private String delimiter;

		@Nullable
		private Query filter;

		@Nullable
		private String format;

		@Nullable
		private String locale;

		@Nullable
		private List<FieldValue> params;

		private String query;

		/**
		 * By default, ES|QL returns results as rows. For example, FROM returns each
		 * individual document as one row. For the JSON, YAML, CBOR and smile formats,
		 * ES|QL can return the results in a columnar fashion where one row represents
		 * all the values of a certain column in the results.
		 * <p>
		 * API name: {@code columnar}
		 */
		public final Builder columnar(@Nullable Boolean value) {
			this.columnar = value;
			return this;
		}

		/**
		 * The character to use between values within a CSV row. Only valid for the CSV
		 * format.
		 * <p>
		 * API name: {@code delimiter}
		 */
		public final Builder delimiter(@Nullable String value) {
			this.delimiter = value;
			return this;
		}

		/**
		 * Specify a Query DSL query in the filter parameter to filter the set of
		 * documents that an ES|QL query runs on.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Specify a Query DSL query in the filter parameter to filter the set of
		 * documents that an ES|QL query runs on.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * A short version of the Accept header, e.g. json, yaml.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public final Builder locale(@Nullable String value) {
			this.locale = value;
			return this;
		}

		/**
		 * To avoid any attempts of hacking or code injection, extract the values in a
		 * separate list of parameters. Use question mark placeholders (?) in the query
		 * string for each of the parameters.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>params</code>.
		 */
		public final Builder params(List<FieldValue> list) {
			this.params = _listAddAll(this.params, list);
			return this;
		}

		/**
		 * To avoid any attempts of hacking or code injection, extract the values in a
		 * separate list of parameters. Use question mark placeholders (?) in the query
		 * string for each of the parameters.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds one or more values to <code>params</code>.
		 */
		public final Builder params(FieldValue value, FieldValue... values) {
			this.params = _listAdd(this.params, value, values);
			return this;
		}

		/**
		 * To avoid any attempts of hacking or code injection, extract the values in a
		 * separate list of parameters. Use question mark placeholders (?) in the query
		 * string for each of the parameters.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds a value to <code>params</code> using a builder lambda.
		 */
		public final Builder params(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return params(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - The ES|QL query API accepts an ES|QL query string in the query
		 * parameter, runs it, and returns the results.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRequest build() {
			_checkSingleUse();

			return new QueryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRequest}
	 */
	public static final JsonpDeserializer<QueryRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryRequest::setupQueryRequestDeserializer);

	protected static void setupQueryRequestDeserializer(ObjectDeserializer<QueryRequest.Builder> op) {

		op.add(Builder::columnar, JsonpDeserializer.booleanDeserializer(), "columnar");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");
		op.add(Builder::params, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "params");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code esql.query}".
	 */
	public static final Endpoint<QueryRequest, BinaryResponse, ErrorResponse> _ENDPOINT = new BinaryEndpoint<>(
			"es/esql.query",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_query";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.delimiter != null) {
					params.put("delimiter", request.delimiter);
				}
				if (request.format != null) {
					params.put("format", request.format);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);
}
