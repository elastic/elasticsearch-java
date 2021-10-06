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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._core.msearch_template.TemplateItem;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
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

// typedef: _global.msearch_template.Request
@JsonpDeserializable
public final class MsearchTemplateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final Long maxConcurrentSearches;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean typedKeys;

	private final List<TemplateItem> searchTemplates;

	// ---------------------------------------------------------------------------------------------

	public MsearchTemplateRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.searchType = builder.searchType;
		this.typedKeys = builder.typedKeys;
		this.searchTemplates = ModelTypeHelper.unmodifiableNonNull(builder.searchTemplates, "_value_body");

	}

	public MsearchTemplateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of index names to use as default
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Indicates whether network round-trips should be minimized as part of
	 * cross-cluster search requests execution
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * Controls the maximum number of concurrent searches the multi search api will
	 * execute
	 * <p>
	 * API name: {@code max_concurrent_searches}
	 */
	@Nullable
	public Long maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Specify whether aggregation and suggester names should be prefixed by their
	 * respective types in the response
	 * <p>
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public List<TemplateItem> searchTemplates() {
		return this.searchTemplates;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TemplateItem item0 : this.searchTemplates) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<MsearchTemplateRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private Long maxConcurrentSearches;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Boolean typedKeys;

		private List<TemplateItem> searchTemplates;

		/**
		 * A comma-separated list of index names to use as default
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to use as default
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Indicates whether network round-trips should be minimized as part of
		 * cross-cluster search requests execution
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * Controls the maximum number of concurrent searches the multi search api will
		 * execute
		 * <p>
		 * API name: {@code max_concurrent_searches}
		 */
		public Builder maxConcurrentSearches(@Nullable Long value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Specify whether aggregation and suggester names should be prefixed by their
		 * respective types in the response
		 * <p>
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder searchTemplates(List<TemplateItem> value) {
			this.searchTemplates = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder searchTemplates(TemplateItem... value) {
			this.searchTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searchTemplates(List)}, creating the list if needed.
		 */
		public Builder addSearchTemplates(TemplateItem value) {
			if (this.searchTemplates == null) {
				this.searchTemplates = new ArrayList<>();
			}
			this.searchTemplates.add(value);
			return this;
		}

		/**
		 * Set {@link #searchTemplates(List)} to a singleton list.
		 */
		public Builder searchTemplates(Function<TemplateItem.Builder, ObjectBuilder<TemplateItem>> fn) {
			return this.searchTemplates(fn.apply(new TemplateItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #searchTemplates(List)}, creating the list if needed.
		 */
		public Builder addSearchTemplates(Function<TemplateItem.Builder, ObjectBuilder<TemplateItem>> fn) {
			return this.addSearchTemplates(fn.apply(new TemplateItem.Builder()).build());
		}

		/**
		 * Builds a {@link MsearchTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchTemplateRequest build() {

			return new MsearchTemplateRequest(this);
		}
	}

	public static final JsonpDeserializer<MsearchTemplateRequest> _DESERIALIZER = createMsearchTemplateRequestDeserializer();
	protected static JsonpDeserializer<MsearchTemplateRequest> createMsearchTemplateRequestDeserializer() {

		JsonpDeserializer<List<TemplateItem>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(TemplateItem._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.searchTemplates(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code msearch_template}".
	 */
	private static final SimpleEndpoint<MsearchTemplateRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_msearch");
					buf.append("/template");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_msearch");
					buf.append("/template");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", String.valueOf(request.maxConcurrentSearches));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code msearch_template}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ElasticsearchError> createMsearchTemplateEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				MsearchTemplateResponse.createMsearchTemplateResponseDeserializer(tDocumentDeserializer));
	}
}
