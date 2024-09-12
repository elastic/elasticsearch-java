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
import co.elastic.clients.elasticsearch.esql.query.EsqlFormat;
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
	private final Boolean dropNullColumns;

	@Nullable
	private final Query filter;

	@Nullable
	private final EsqlFormat format;

	@Nullable
	private final String locale;

	private final List<FieldValue> params;

	@Nullable
	private final Boolean profile;

	private final String query;

	private final Map<String, Map<String, TableValues>> tables;

	// ---------------------------------------------------------------------------------------------

	private QueryRequest(Builder builder) {

		this.columnar = builder.columnar;
		this.delimiter = builder.delimiter;
		this.dropNullColumns = builder.dropNullColumns;
		this.filter = builder.filter;
		this.format = builder.format;
		this.locale = builder.locale;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.profile = builder.profile;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.tables = ApiTypeHelper.unmodifiable(builder.tables);

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
	 * Should columns that are entirely <code>null</code> be removed from the
	 * <code>columns</code> and <code>values</code> portion of the results? Defaults
	 * to <code>false</code>. If <code>true</code> then the response will include an
	 * extra section under the name <code>all_columns</code> which has the name of
	 * all columns.
	 * <p>
	 * API name: {@code drop_null_columns}
	 */
	@Nullable
	public final Boolean dropNullColumns() {
		return this.dropNullColumns;
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
	public final EsqlFormat format() {
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
	 * If provided and <code>true</code> the response will include an extra
	 * <code>profile</code> object with information on how the query was executed.
	 * This information is for human debugging and its format can change at any time
	 * but it can give some insight into the performance of each part of the query.
	 * <p>
	 * API name: {@code profile}
	 */
	@Nullable
	public final Boolean profile() {
		return this.profile;
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
	 * Tables to use with the LOOKUP operation. The top level key is the table name
	 * and the next level key is the column name.
	 * <p>
	 * API name: {@code tables}
	 */
	public final Map<String, Map<String, TableValues>> tables() {
		return this.tables;
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
		if (this.profile != null) {
			generator.writeKey("profile");
			generator.write(this.profile);

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (ApiTypeHelper.isDefined(this.tables)) {
			generator.writeKey("tables");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, TableValues>> item0 : this.tables.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, TableValues> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

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
		private Boolean dropNullColumns;

		@Nullable
		private Query filter;

		@Nullable
		private EsqlFormat format;

		@Nullable
		private String locale;

		@Nullable
		private List<FieldValue> params;

		@Nullable
		private Boolean profile;

		private String query;

		@Nullable
		private Map<String, Map<String, TableValues>> tables;

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
		 * Should columns that are entirely <code>null</code> be removed from the
		 * <code>columns</code> and <code>values</code> portion of the results? Defaults
		 * to <code>false</code>. If <code>true</code> then the response will include an
		 * extra section under the name <code>all_columns</code> which has the name of
		 * all columns.
		 * <p>
		 * API name: {@code drop_null_columns}
		 */
		public final Builder dropNullColumns(@Nullable Boolean value) {
			this.dropNullColumns = value;
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
		public final Builder format(@Nullable EsqlFormat value) {
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
		 * Adds all passed values to <code>params</code>.
		 */
		public final Builder params(String value, String... values) {
			this.params = _listAdd(this.params, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (String v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.params = _listAddAll(this.params, fieldValues);
			return this;
		}

		/**
		 * To avoid any attempts of hacking or code injection, extract the values in a
		 * separate list of parameters. Use question mark placeholders (?) in the query
		 * string for each of the parameters.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all passed values to <code>params</code>.
		 */
		public final Builder params(long value, long... values) {
			this.params = _listAdd(this.params, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (long v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.params = _listAddAll(this.params, fieldValues);
			return this;
		}

		/**
		 * To avoid any attempts of hacking or code injection, extract the values in a
		 * separate list of parameters. Use question mark placeholders (?) in the query
		 * string for each of the parameters.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all passed values to <code>params</code>.
		 */
		public final Builder params(double value, double... values) {
			this.params = _listAdd(this.params, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (double v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.params = _listAddAll(this.params, fieldValues);
			return this;
		}

		/**
		 * To avoid any attempts of hacking or code injection, extract the values in a
		 * separate list of parameters. Use question mark placeholders (?) in the query
		 * string for each of the parameters.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all passed values to <code>params</code>.
		 */
		public final Builder params(boolean value, boolean... values) {
			this.params = _listAdd(this.params, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (boolean v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.params = _listAddAll(this.params, fieldValues);
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
		 * If provided and <code>true</code> the response will include an extra
		 * <code>profile</code> object with information on how the query was executed.
		 * This information is for human debugging and its format can change at any time
		 * but it can give some insight into the performance of each part of the query.
		 * <p>
		 * API name: {@code profile}
		 */
		public final Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
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

		/**
		 * Tables to use with the LOOKUP operation. The top level key is the table name
		 * and the next level key is the column name.
		 * <p>
		 * API name: {@code tables}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>tables</code>.
		 */
		public final Builder tables(Map<String, Map<String, TableValues>> map) {
			this.tables = _mapPutAll(this.tables, map);
			return this;
		}

		/**
		 * Tables to use with the LOOKUP operation. The top level key is the table name
		 * and the next level key is the column name.
		 * <p>
		 * API name: {@code tables}
		 * <p>
		 * Adds an entry to <code>tables</code>.
		 */
		public final Builder tables(String key, Map<String, TableValues> value) {
			this.tables = _mapPut(this.tables, key, value);
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
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::tables, JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(TableValues._DESERIALIZER)), "tables");

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
					params.put("format", request.format.jsonValue());
				}
				if (request.dropNullColumns != null) {
					params.put("drop_null_columns", String.valueOf(request.dropNullColumns));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);
}
