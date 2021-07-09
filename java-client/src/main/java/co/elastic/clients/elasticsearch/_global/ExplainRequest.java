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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.explain.Request
public final class ExplainRequest extends RequestBase implements ToJsonp {
	private final String id;

	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final JsonValue defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final String preference;

	@Nullable
	private final String queryOnQueryString;

	@Nullable
	private final JsonValue routing;

	@Nullable
	private final JsonValue source;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final String q;

	@Nullable
	private final QueryContainer query;

	// ---------------------------------------------------------------------------------------------

	protected ExplainRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.lenient = builder.lenient;
		this.preference = builder.preference;
		this.queryOnQueryString = builder.queryOnQueryString;
		this.routing = builder.routing;
		this.source = builder.source;
		this.sourceExcludes = builder.sourceExcludes;
		this.sourceIncludes = builder.sourceIncludes;
		this.storedFields = builder.storedFields;
		this.q = builder.q;
		this.query = builder.query;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * API name: {@code default_operator}
	 */
	@Nullable
	public JsonValue defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code query_on_query_string}
	 */
	@Nullable
	public String queryOnQueryString() {
		return this.queryOnQueryString;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public JsonValue routing() {
		return this.routing;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue source() {
		return this.source;
	}

	/**
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * API name: {@code q}
	 */
	@Nullable
	public String q() {
		return this.q;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
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

		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExplainRequest> {
		private String id;

		private String index;

		@Nullable
		private String type;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private JsonValue defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private Boolean lenient;

		@Nullable
		private String preference;

		@Nullable
		private String queryOnQueryString;

		@Nullable
		private JsonValue routing;

		@Nullable
		private JsonValue source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private String q;

		@Nullable
		private QueryContainer query;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable JsonValue value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code query_on_query_string}
		 */
		public Builder queryOnQueryString(@Nullable String value) {
			this.queryOnQueryString = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable JsonValue value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable JsonValue value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return this;
		}

		/**
		 * API name: {@code q}
		 */
		public Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * Builds a {@link ExplainRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainRequest build() {

			return new ExplainRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExplainRequest
	 */
	public static final JsonpDeserializer<ExplainRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExplainRequest::setupExplainRequestDeserializer);

	protected static void setupExplainRequestDeserializer(DelegatingDeserializer<ExplainRequest.Builder> op) {

		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code explain}".
	 */
	private static final Endpoint.Simple<ExplainRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;
				final int _index = 1 << 1;
				final int _type = 1 << 2;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;
				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_explain");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				if (propsSet == (_index | _type | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/");
					buf.append(request.type);
					buf.append("/");
					buf.append(request.id);
					buf.append("/_explain");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.toString());
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.queryOnQueryString != null) {
					params.put("query_on_query_string", request.queryOnQueryString);
				}
				if (request.routing != null) {
					params.put("routing", request.routing.toString());
				}
				if (request.source != null) {
					params.put("_source", request.source.toString());
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.storedFields != null) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code explain}" endpoint.
	 */
	public static <TDocument> Endpoint<ExplainRequest, ExplainResponse<TDocument>, ElasticsearchError> createExplainEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(ExplainResponse.createExplainResponseDeserializer(tDocumentDeserializer));
	}
}
