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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.elasticsearch.sql.query.Column;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.query.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/sql/query/QuerySqlResponse.ts#L22-L28">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryResponse implements JsonpSerializable {
	private final List<Column> columns;

	@Nullable
	private final String cursor;

	private final List<List<JsonData>> rows;

	// ---------------------------------------------------------------------------------------------

	private QueryResponse(Builder builder) {

		this.columns = ApiTypeHelper.unmodifiable(builder.columns);
		this.cursor = builder.cursor;
		this.rows = ApiTypeHelper.unmodifiableRequired(builder.rows, this, "rows");

	}

	public static QueryResponse of(Function<Builder, ObjectBuilder<QueryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code columns}
	 */
	public final List<Column> columns() {
		return this.columns;
	}

	/**
	 * API name: {@code cursor}
	 */
	@Nullable
	public final String cursor() {
		return this.cursor;
	}

	/**
	 * Required - API name: {@code rows}
	 */
	public final List<List<JsonData>> rows() {
		return this.rows;
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

		if (ApiTypeHelper.isDefined(this.columns)) {
			generator.writeKey("columns");
			generator.writeStartArray();
			for (Column item0 : this.columns) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.cursor != null) {
			generator.writeKey("cursor");
			generator.write(this.cursor);

		}
		if (ApiTypeHelper.isDefined(this.rows)) {
			generator.writeKey("rows");
			generator.writeStartArray();
			for (List<JsonData> item0 : this.rows) {
				generator.writeStartArray();
				if (item0 != null) {
					for (JsonData item1 : item0) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<QueryResponse> {
		@Nullable
		private List<Column> columns;

		@Nullable
		private String cursor;

		private List<List<JsonData>> rows;

		/**
		 * API name: {@code columns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>columns</code>.
		 */
		public final Builder columns(List<Column> list) {
			this.columns = _listAddAll(this.columns, list);
			return this;
		}

		/**
		 * API name: {@code columns}
		 * <p>
		 * Adds one or more values to <code>columns</code>.
		 */
		public final Builder columns(Column value, Column... values) {
			this.columns = _listAdd(this.columns, value, values);
			return this;
		}

		/**
		 * API name: {@code columns}
		 * <p>
		 * Adds a value to <code>columns</code> using a builder lambda.
		 */
		public final Builder columns(Function<Column.Builder, ObjectBuilder<Column>> fn) {
			return columns(fn.apply(new Column.Builder()).build());
		}

		/**
		 * API name: {@code cursor}
		 */
		public final Builder cursor(@Nullable String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * Required - API name: {@code rows}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rows</code>.
		 */
		public final Builder rows(List<List<JsonData>> list) {
			this.rows = _listAddAll(this.rows, list);
			return this;
		}

		/**
		 * Required - API name: {@code rows}
		 * <p>
		 * Adds one or more values to <code>rows</code>.
		 */
		public final Builder rows(List<JsonData> value, List<JsonData>... values) {
			this.rows = _listAdd(this.rows, value, values);
			return this;
		}

		/**
		 * Builds a {@link QueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryResponse build() {
			_checkSingleUse();

			return new QueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryResponse}
	 */
	public static final JsonpDeserializer<QueryResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryResponse::setupQueryResponseDeserializer);

	protected static void setupQueryResponseDeserializer(ObjectDeserializer<QueryResponse.Builder> op) {

		op.add(Builder::columns, JsonpDeserializer.arrayDeserializer(Column._DESERIALIZER), "columns");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::rows,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER)),
				"rows");

	}

}
