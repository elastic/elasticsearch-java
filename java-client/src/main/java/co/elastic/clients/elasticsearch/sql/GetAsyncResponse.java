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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
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

// typedef: sql.get_async.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#sql.get_async.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetAsyncResponse implements JsonpSerializable {
	private final String id;

	private final boolean isRunning;

	private final boolean isPartial;

	private final List<Column> columns;

	@Nullable
	private final String cursor;

	private final List<List<JsonData>> rows;

	// ---------------------------------------------------------------------------------------------

	private GetAsyncResponse(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.isRunning = ApiTypeHelper.requireNonNull(builder.isRunning, this, "isRunning");
		this.isPartial = ApiTypeHelper.requireNonNull(builder.isPartial, this, "isPartial");
		this.columns = ApiTypeHelper.unmodifiable(builder.columns);
		this.cursor = builder.cursor;
		this.rows = ApiTypeHelper.unmodifiableRequired(builder.rows, this, "rows");

	}

	public static GetAsyncResponse of(Function<Builder, ObjectBuilder<GetAsyncResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Identifier for the search. This value is only returned for async
	 * and saved synchronous searches. For CSV, TSV, and TXT responses, this value
	 * is returned in the <code>Async-ID</code> HTTP header.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - If <code>true</code>, the search is still running. If false, the
	 * search has finished. This value is only returned for async and saved
	 * synchronous searches. For CSV, TSV, and TXT responses, this value is returned
	 * in the <code>Async-partial</code> HTTP header.
	 * <p>
	 * API name: {@code is_running}
	 */
	public final boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * Required - If <code>true</code>, the response does not contain complete
	 * search results. If <code>is_partial</code> is <code>true</code> and
	 * <code>is_running</code> is <code>true</code>, the search is still running. If
	 * <code>is_partial</code> is <code>true</code> but <code>is_running</code> is
	 * <code>false</code>, the results are partial due to a failure or timeout. This
	 * value is only returned for async and saved synchronous searches. For CSV,
	 * TSV, and TXT responses, this value is returned in the
	 * <code>Async-partial</code> HTTP header.
	 * <p>
	 * API name: {@code is_partial}
	 */
	public final boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * Column headings for the search results. Each object is a column.
	 * <p>
	 * API name: {@code columns}
	 */
	public final List<Column> columns() {
		return this.columns;
	}

	/**
	 * Cursor for the next set of paginated results. For CSV, TSV, and TXT
	 * responses, this value is returned in the <code>Cursor</code> HTTP header.
	 * <p>
	 * API name: {@code cursor}
	 */
	@Nullable
	public final String cursor() {
		return this.cursor;
	}

	/**
	 * Required - Values for the search results.
	 * <p>
	 * API name: {@code rows}
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("is_running");
		generator.write(this.isRunning);

		generator.writeKey("is_partial");
		generator.write(this.isPartial);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAsyncResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetAsyncResponse> {
		private String id;

		private Boolean isRunning;

		private Boolean isPartial;

		@Nullable
		private List<Column> columns;

		@Nullable
		private String cursor;

		private List<List<JsonData>> rows;

		/**
		 * Required - Identifier for the search. This value is only returned for async
		 * and saved synchronous searches. For CSV, TSV, and TXT responses, this value
		 * is returned in the <code>Async-ID</code> HTTP header.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the search is still running. If false, the
		 * search has finished. This value is only returned for async and saved
		 * synchronous searches. For CSV, TSV, and TXT responses, this value is returned
		 * in the <code>Async-partial</code> HTTP header.
		 * <p>
		 * API name: {@code is_running}
		 */
		public final Builder isRunning(boolean value) {
			this.isRunning = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the response does not contain complete
		 * search results. If <code>is_partial</code> is <code>true</code> and
		 * <code>is_running</code> is <code>true</code>, the search is still running. If
		 * <code>is_partial</code> is <code>true</code> but <code>is_running</code> is
		 * <code>false</code>, the results are partial due to a failure or timeout. This
		 * value is only returned for async and saved synchronous searches. For CSV,
		 * TSV, and TXT responses, this value is returned in the
		 * <code>Async-partial</code> HTTP header.
		 * <p>
		 * API name: {@code is_partial}
		 */
		public final Builder isPartial(boolean value) {
			this.isPartial = value;
			return this;
		}

		/**
		 * Column headings for the search results. Each object is a column.
		 * <p>
		 * API name: {@code columns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>columns</code>.
		 */
		public final Builder columns(List<Column> list) {
			this.columns = _listAddAll(this.columns, list);
			return this;
		}

		/**
		 * Column headings for the search results. Each object is a column.
		 * <p>
		 * API name: {@code columns}
		 * <p>
		 * Adds one or more values to <code>columns</code>.
		 */
		public final Builder columns(Column value, Column... values) {
			this.columns = _listAdd(this.columns, value, values);
			return this;
		}

		/**
		 * Column headings for the search results. Each object is a column.
		 * <p>
		 * API name: {@code columns}
		 * <p>
		 * Adds a value to <code>columns</code> using a builder lambda.
		 */
		public final Builder columns(Function<Column.Builder, ObjectBuilder<Column>> fn) {
			return columns(fn.apply(new Column.Builder()).build());
		}

		/**
		 * Cursor for the next set of paginated results. For CSV, TSV, and TXT
		 * responses, this value is returned in the <code>Cursor</code> HTTP header.
		 * <p>
		 * API name: {@code cursor}
		 */
		public final Builder cursor(@Nullable String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * Required - Values for the search results.
		 * <p>
		 * API name: {@code rows}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rows</code>.
		 */
		public final Builder rows(List<List<JsonData>> list) {
			this.rows = _listAddAll(this.rows, list);
			return this;
		}

		/**
		 * Required - Values for the search results.
		 * <p>
		 * API name: {@code rows}
		 * <p>
		 * Adds one or more values to <code>rows</code>.
		 */
		public final Builder rows(List<JsonData> value, List<JsonData>... values) {
			this.rows = _listAdd(this.rows, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetAsyncResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAsyncResponse build() {
			_checkSingleUse();

			return new GetAsyncResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAsyncResponse}
	 */
	public static final JsonpDeserializer<GetAsyncResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetAsyncResponse::setupGetAsyncResponseDeserializer);

	protected static void setupGetAsyncResponseDeserializer(ObjectDeserializer<GetAsyncResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(Builder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(Builder::columns, JsonpDeserializer.arrayDeserializer(Column._DESERIALIZER), "columns");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::rows,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER)),
				"rows");

	}

}
