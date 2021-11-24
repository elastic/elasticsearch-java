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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.FieldAndFormat;
import co.elastic.clients.elasticsearch.core.knn_search.KnnSearchQuery;
import co.elastic.clients.elasticsearch.core.search.SourceConfig;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.knn_search.Request
@JsonpDeserializable
public class KnnSearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final SourceConfig source;

	private final List<FieldAndFormat> docvalueFields;

	private final List<String> fields;

	private final List<String> index;

	private final KnnSearchQuery knn;

	@Nullable
	private final String routing;

	private final List<String> storedFields;

	// ---------------------------------------------------------------------------------------------

	private KnnSearchRequest(Builder builder) {

		this.source = builder.source;
		this.docvalueFields = ModelTypeHelper.unmodifiable(builder.docvalueFields);
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.knn = ModelTypeHelper.requireNonNull(builder.knn, this, "knn");
		this.routing = builder.routing;
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);

	}

	public static KnnSearchRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Indicates which source fields are returned for matching documents. These
	 * fields are returned in the hits._source property of the search response.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public final SourceConfig source() {
		return this.source;
	}

	/**
	 * The request returns doc values for field names matching these patterns in the
	 * hits.fields property of the response. Accepts wildcard (*) patterns.
	 * <p>
	 * API name: {@code docvalue_fields}
	 */
	public final List<FieldAndFormat> docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * The request returns values for field names matching these patterns in the
	 * hits.fields property of the response. Accepts wildcard (*) patterns.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Required - A comma-separated list of index names to search; use
	 * <code>_all</code> or to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Required - kNN query to execute
	 * <p>
	 * API name: {@code knn}
	 */
	public final KnnSearchQuery knn() {
		return this.knn;
	}

	/**
	 * A comma-separated list of specific routing values
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * List of stored fields to return as part of a hit. If no fields are specified,
	 * no stored fields are included in the response. If this field is specified,
	 * the _source parameter defaults to false. You can pass _source: true to return
	 * both source fields and stored fields in the search response.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	public final List<String> storedFields() {
		return this.storedFields;
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

		if (this.source != null) {
			generator.writeKey("_source");
			this.source.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.docvalueFields)) {
			generator.writeKey("docvalue_fields");
			generator.writeStartArray();
			for (FieldAndFormat item0 : this.docvalueFields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("knn");
		this.knn.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.storedFields)) {
			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KnnSearchRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<KnnSearchRequest> {
		@Nullable
		private SourceConfig source;

		@Nullable
		private List<FieldAndFormat> docvalueFields;

		@Nullable
		private List<String> fields;

		private List<String> index;

		private KnnSearchQuery knn;

		@Nullable
		private String routing;

		@Nullable
		private List<String> storedFields;

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(@Nullable SourceConfig value) {
			this.source = value;
			return this;
		}

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder source(Consumer<SourceConfig.Builder> fn) {
			SourceConfig.Builder builder = new SourceConfig.Builder();
			fn.accept(builder);
			return this.source(builder.build());
		}

		/**
		 * The request returns doc values for field names matching these patterns in the
		 * hits.fields property of the response. Accepts wildcard (*) patterns.
		 * <p>
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(@Nullable List<FieldAndFormat> value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * The request returns doc values for field names matching these patterns in the
		 * hits.fields property of the response. Accepts wildcard (*) patterns.
		 * <p>
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(FieldAndFormat... value) {
			this.docvalueFields = Arrays.asList(value);
			return this;
		}

		/**
		 * The request returns doc values for field names matching these patterns in the
		 * hits.fields property of the response. Accepts wildcard (*) patterns.
		 * <p>
		 * API name: {@code docvalue_fields}
		 */
		public final Builder docvalueFields(
				Function<ListBuilder<FieldAndFormat, FieldAndFormat.Builder>, ObjectBuilder<List<FieldAndFormat>>> fn) {
			return docvalueFields(fn.apply(new ListBuilder<>(FieldAndFormat.Builder::new)).build());
		}

		/**
		 * The request returns values for field names matching these patterns in the
		 * hits.fields property of the response. Accepts wildcard (*) patterns.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * The request returns values for field names matching these patterns in the
		 * hits.fields property of the response. Accepts wildcard (*) patterns.
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to search; use
		 * <code>_all</code> or to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to search; use
		 * <code>_all</code> or to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - kNN query to execute
		 * <p>
		 * API name: {@code knn}
		 */
		public final Builder knn(KnnSearchQuery value) {
			this.knn = value;
			return this;
		}

		/**
		 * Required - kNN query to execute
		 * <p>
		 * API name: {@code knn}
		 */
		public final Builder knn(Consumer<KnnSearchQuery.Builder> fn) {
			KnnSearchQuery.Builder builder = new KnnSearchQuery.Builder();
			fn.accept(builder);
			return this.knn(builder.build());
		}

		/**
		 * A comma-separated list of specific routing values
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public final Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link KnnSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnSearchRequest build() {
			_checkSingleUse();

			return new KnnSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnSearchRequest}
	 */
	public static final JsonpDeserializer<KnnSearchRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KnnSearchRequest::setupKnnSearchRequestDeserializer);

	protected static void setupKnnSearchRequestDeserializer(ObjectDeserializer<KnnSearchRequest.Builder> op) {

		op.add(Builder::source, SourceConfig._DESERIALIZER, "_source");
		op.add(Builder::docvalueFields, JsonpDeserializer.arrayDeserializer(FieldAndFormat._DESERIALIZER),
				"docvalue_fields");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::knn, KnnSearchQuery._DESERIALIZER, "knn");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code knn_search}".
	 */
	public static final SimpleEndpoint<KnnSearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/knn_search",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_knn_search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, KnnSearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code knn_search}" endpoint.
	 */
	public static <TDocument> Endpoint<KnnSearchRequest, KnnSearchResponse<TDocument>, ErrorResponse> createKnnSearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT
				.withResponseDeserializer(KnnSearchResponse.createKnnSearchResponseDeserializer(tDocumentDeserializer));
	}
}
