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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.lang.String;
import java.util.Collections;
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

// typedef: sql.translate.Request

/**
 * Translates SQL into Elasticsearch queries
 * 
 * @see <a href="../doc-files/api-spec.html#sql.translate.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class TranslateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Integer fetchSize;

	@Nullable
	private final Query filter;

	private final String query;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private TranslateRequest(Builder builder) {

		this.fetchSize = builder.fetchSize;
		this.filter = builder.filter;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.timeZone = builder.timeZone;

	}

	public static TranslateRequest of(Function<Builder, ObjectBuilder<TranslateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The maximum number of rows (or entries) to return in one response.
	 * <p>
	 * API name: {@code fetch_size}
	 */
	@Nullable
	public final Integer fetchSize() {
		return this.fetchSize;
	}

	/**
	 * Elasticsearch query DSL for additional filtering.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * Required - SQL query to run.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * ISO-8601 time zone ID for the search.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
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

		if (this.fetchSize != null) {
			generator.writeKey("fetch_size");
			generator.write(this.fetchSize);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TranslateRequest> {
		@Nullable
		private Integer fetchSize;

		@Nullable
		private Query filter;

		private String query;

		@Nullable
		private String timeZone;

		/**
		 * The maximum number of rows (or entries) to return in one response.
		 * <p>
		 * API name: {@code fetch_size}
		 */
		public final Builder fetchSize(@Nullable Integer value) {
			this.fetchSize = value;
			return this;
		}

		/**
		 * Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * Elasticsearch query DSL for additional filtering.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - SQL query to run.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * ISO-8601 time zone ID for the search.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TranslateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslateRequest build() {
			_checkSingleUse();

			return new TranslateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslateRequest}
	 */
	public static final JsonpDeserializer<TranslateRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TranslateRequest::setupTranslateRequestDeserializer);

	protected static void setupTranslateRequestDeserializer(ObjectDeserializer<TranslateRequest.Builder> op) {

		op.add(Builder::fetchSize, JsonpDeserializer.integerDeserializer(), "fetch_size");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code sql.translate}".
	 */
	public static final Endpoint<TranslateRequest, TranslateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/sql.translate",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_sql/translate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, TranslateResponse._DESERIALIZER);
}
