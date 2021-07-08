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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.CombinedFieldsQuery
public final class CombinedFieldsQuery implements ToJsonp {
	private final String query;

	private final List<String> fields;

	@Nullable
	private final String operator;

	// ---------------------------------------------------------------------------------------------

	protected CombinedFieldsQuery(Builder builder) {

		this.query = Objects.requireNonNull(builder.query, "query");
		this.fields = Objects.requireNonNull(builder.fields, "fields");
		this.operator = builder.operator;

	}

	/**
	 * API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code fields}
	 */
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code operator}
	 */
	@Nullable
	public String operator() {
		return this.operator;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("query");
		generator.write(this.query);

		generator.writeKey("fields");
		generator.writeStartArray();
		for (String item0 : this.fields) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.operator != null) {

			generator.writeKey("operator");
			generator.write(this.operator);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CombinedFieldsQuery}.
	 */
	public static class Builder implements ObjectBuilder<CombinedFieldsQuery> {
		private String query;

		private List<String> fields;

		@Nullable
		private String operator;

		/**
		 * API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code operator}
		 */
		public Builder operator(@Nullable String value) {
			this.operator = value;
			return this;
		}

		/**
		 * Builds a {@link CombinedFieldsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CombinedFieldsQuery build() {

			return new CombinedFieldsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for CombinedFieldsQuery
	 */
	public static final JsonpDeserializer<CombinedFieldsQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CombinedFieldsQuery::setupCombinedFieldsQueryDeserializer);

	protected static void setupCombinedFieldsQueryDeserializer(DelegatingDeserializer<CombinedFieldsQuery.Builder> op) {

		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::operator, JsonpDeserializer.stringDeserializer(), "operator");

	}

}
