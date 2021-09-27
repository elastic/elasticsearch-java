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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.query.Response
@JsonpDeserializable
public final class QueryResponse implements JsonpSerializable {
	@Nullable
	private final List<Column> columns;

	@Nullable
	private final String cursor;

	private final List<List<JsonData>> rows;

	// ---------------------------------------------------------------------------------------------

	public QueryResponse(Builder builder) {

		this.columns = builder.columns;
		this.cursor = builder.cursor;
		this.rows = Objects.requireNonNull(builder.rows, "rows");

	}

	/**
	 * API name: {@code columns}
	 */
	@Nullable
	public List<Column> columns() {
		return this.columns;
	}

	/**
	 * API name: {@code cursor}
	 */
	@Nullable
	public String cursor() {
		return this.cursor;
	}

	/**
	 * API name: {@code rows}
	 */
	public List<List<JsonData>> rows() {
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

		if (this.columns != null) {

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

		generator.writeKey("rows");
		generator.writeStartArray();
		for (List<JsonData> item0 : this.rows) {
			generator.writeStartArray();
			for (JsonData item1 : item0) {
				item1.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryResponse}.
	 */
	public static class Builder implements ObjectBuilder<QueryResponse> {
		@Nullable
		private List<Column> columns;

		@Nullable
		private String cursor;

		private List<List<JsonData>> rows;

		/**
		 * API name: {@code columns}
		 */
		public Builder columns(@Nullable List<Column> value) {
			this.columns = value;
			return this;
		}

		/**
		 * API name: {@code columns}
		 */
		public Builder columns(Column... value) {
			this.columns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #columns(List)}, creating the list if needed.
		 */
		public Builder addColumns(Column value) {
			if (this.columns == null) {
				this.columns = new ArrayList<>();
			}
			this.columns.add(value);
			return this;
		}

		/**
		 * Set {@link #columns(List)} to a singleton list.
		 */
		public Builder columns(Function<Column.Builder, ObjectBuilder<Column>> fn) {
			return this.columns(fn.apply(new Column.Builder()).build());
		}

		/**
		 * Add a value to {@link #columns(List)}, creating the list if needed.
		 */
		public Builder addColumns(Function<Column.Builder, ObjectBuilder<Column>> fn) {
			return this.addColumns(fn.apply(new Column.Builder()).build());
		}

		/**
		 * API name: {@code cursor}
		 */
		public Builder cursor(@Nullable String value) {
			this.cursor = value;
			return this;
		}

		/**
		 * API name: {@code rows}
		 */
		public Builder rows(List<List<JsonData>> value) {
			this.rows = value;
			return this;
		}

		/**
		 * API name: {@code rows}
		 */
		public Builder rows(List<JsonData>... value) {
			this.rows = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rows(List)}, creating the list if needed.
		 */
		public Builder addRows(List<JsonData> value) {
			if (this.rows == null) {
				this.rows = new ArrayList<>();
			}
			this.rows.add(value);
			return this;
		}

		/**
		 * Builds a {@link QueryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryResponse build() {

			return new QueryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryResponse}
	 */
	public static final JsonpDeserializer<QueryResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryResponse::setupQueryResponseDeserializer, Builder::build);

	protected static void setupQueryResponseDeserializer(DelegatingDeserializer<QueryResponse.Builder> op) {

		op.add(Builder::columns, JsonpDeserializer.arrayDeserializer(Column._DESERIALIZER), "columns");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::rows,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER)),
				"rows");

	}

}
