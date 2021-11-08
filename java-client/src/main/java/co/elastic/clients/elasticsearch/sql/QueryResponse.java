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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class QueryResponse implements JsonpSerializable {
	private final List<Column> columns;

	@Nullable
	private final String cursor;

	private final List<List<JsonData>> rows;

	// ---------------------------------------------------------------------------------------------

	private QueryResponse(Builder builder) {

		this.columns = ModelTypeHelper.unmodifiable(builder.columns);
		this.cursor = builder.cursor;
		this.rows = ModelTypeHelper.unmodifiableRequired(builder.rows, this, "rows");

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

		if (ModelTypeHelper.isDefined(this.columns)) {
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
		if (ModelTypeHelper.isDefined(this.rows)) {
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
		 */
		public final Builder columns(@Nullable List<Column> value) {
			this.columns = value;
			return this;
		}

		/**
		 * API name: {@code columns}
		 */
		public final Builder columns(Column... value) {
			this.columns = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code columns}
		 */
		@SafeVarargs
		public final Builder columns(Function<Column.Builder, ObjectBuilder<Column>>... fns) {
			this.columns = new ArrayList<>(fns.length);
			for (Function<Column.Builder, ObjectBuilder<Column>> fn : fns) {
				this.columns.add(fn.apply(new Column.Builder()).build());
			}
			return this;
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
		 */
		public final Builder rows(List<List<JsonData>> value) {
			this.rows = value;
			return this;
		}

		/**
		 * Required - API name: {@code rows}
		 */
		public final Builder rows(List<JsonData>... value) {
			this.rows = Arrays.asList(value);
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
			QueryResponse::setupQueryResponseDeserializer, Builder::build);

	protected static void setupQueryResponseDeserializer(DelegatingDeserializer<QueryResponse.Builder> op) {

		op.add(Builder::columns, JsonpDeserializer.arrayDeserializer(Column._DESERIALIZER), "columns");
		op.add(Builder::cursor, JsonpDeserializer.stringDeserializer(), "cursor");
		op.add(Builder::rows,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER)),
				"rows");

	}

}
