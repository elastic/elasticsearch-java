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

import co.elastic.clients.elasticsearch._types.DefaultOperator;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
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
@JsonpDeserializable
public final class ExplainRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final JsonValue /* Union(_types.Fields | internal.boolean) */ source;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final String analyzer;

	@Nullable
	private final DefaultOperator defaultOperator;

	@Nullable
	private final String df;

	private final String id;

	private final String index;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final String preference;

	@Nullable
	private final String q;

	@Nullable
	private final Query query;

	@Nullable
	private final String routing;

	@Nullable
	private final List<String> storedFields;

	// ---------------------------------------------------------------------------------------------

	public ExplainRequest(Builder builder) {

		this.source = builder.source;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.analyzeWildcard = builder.analyzeWildcard;
		this.analyzer = builder.analyzer;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.lenient = builder.lenient;
		this.preference = builder.preference;
		this.q = builder.q;
		this.query = builder.query;
		this.routing = builder.routing;
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);

	}

	public ExplainRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * True or false to return the _source field or not, or a list of fields to
	 * return
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /* Union(_types.Fields | internal.boolean) */ source() {
		return this.source;
	}

	/**
	 * A list of fields to exclude from the returned _source field
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A list of fields to extract and return from the _source field
	 * <p>
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * Specify whether wildcards and prefix queries in the query string query should
	 * be analyzed (default: false)
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * The analyzer for the query string query
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * The default operator for query string query (AND or OR)
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public DefaultOperator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The default field for query string query (default: _all)
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * Required - The document ID
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Specify whether format-based query failures (such as providing text to a
	 * numeric field) should be ignored
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * Query in the Lucene query string syntax
	 * <p>
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
	public Query query() {
		return this.query;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * A comma-separated list of stored fields to return in the response
	 * <p>
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
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

		if (this.query != null) {

			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExplainRequest> {
		@Nullable
		private JsonValue /* Union(_types.Fields | internal.boolean) */ source;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private String analyzer;

		@Nullable
		private DefaultOperator defaultOperator;

		@Nullable
		private String df;

		private String id;

		private String index;

		@Nullable
		private Boolean lenient;

		@Nullable
		private String preference;

		@Nullable
		private String q;

		@Nullable
		private Query query;

		@Nullable
		private String routing;

		@Nullable
		private List<String> storedFields;

		/**
		 * True or false to return the _source field or not, or a list of fields to
		 * return
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable JsonValue /* Union(_types.Fields | internal.boolean) */ value) {
			this.source = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
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
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
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
		 * Specify whether wildcards and prefix queries in the query string query should
		 * be analyzed (default: false)
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * The analyzer for the query string query
		 * <p>
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * The default operator for query string query (AND or OR)
		 * <p>
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable DefaultOperator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The default field for query string query (default: _all)
		 * <p>
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * Required - The document ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Specify whether format-based query failures (such as providing text to a
		 * numeric field) should be ignored
		 * <p>
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Query in the Lucene query string syntax
		 * <p>
		 * API name: {@code q}
		 */
		public Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * A comma-separated list of stored fields to return in the response
		 * <p>
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
	 * Json deserializer for {@link ExplainRequest}
	 */
	public static final JsonpDeserializer<ExplainRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExplainRequest::setupExplainRequestDeserializer, Builder::build);

	protected static void setupExplainRequestDeserializer(DelegatingDeserializer<ExplainRequest.Builder> op) {

		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code explain}".
	 */
	private static final SimpleEndpoint<ExplainRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _id = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _id;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_explain");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
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
				if (request.q != null) {
					params.put("q", request.q);
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.toString());
				}
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.storedFields != null) {
					params.put("stored_fields",
							request.storedFields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.source != null) {
					params.put("_source", JsonpUtils.toString(request.source));
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code explain}" endpoint.
	 */
	public static <TDocument> Endpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> createExplainEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(ExplainResponse.createExplainResponseDeserializer(tDocumentDeserializer));
	}
}
