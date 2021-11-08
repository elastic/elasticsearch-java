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
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch.core.msearch_template.TemplateItem;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class MsearchTemplateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	private final List<String> index;

	@Nullable
	private final Long maxConcurrentSearches;

	@Nullable
	private final SearchType searchType;

	private final List<TemplateItem> searchTemplates;

	// ---------------------------------------------------------------------------------------------

	private MsearchTemplateRequest(Builder builder) {

		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.searchType = builder.searchType;
		this.searchTemplates = ModelTypeHelper.unmodifiableRequired(builder.searchTemplates, this, "searchTemplates");

	}

	public static MsearchTemplateRequest of(Function<Builder, ObjectBuilder<MsearchTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether network round-trips should be minimized as part of
	 * cross-cluster search requests execution
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public final Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * A comma-separated list of index names to use as default
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Controls the maximum number of concurrent searches the multi search api will
	 * execute
	 * <p>
	 * API name: {@code max_concurrent_searches}
	 */
	@Nullable
	public final Long maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<TemplateItem> searchTemplates() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MsearchTemplateRequest> {
		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private List<String> index;

		@Nullable
		private Long maxConcurrentSearches;

		@Nullable
		private SearchType searchType;

		private List<TemplateItem> searchTemplates;

		/**
		 * Indicates whether network round-trips should be minimized as part of
		 * cross-cluster search requests execution
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public final Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to use as default
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to use as default
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Controls the maximum number of concurrent searches the multi search api will
		 * execute
		 * <p>
		 * API name: {@code max_concurrent_searches}
		 */
		public final Builder maxConcurrentSearches(@Nullable Long value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder searchTemplates(List<TemplateItem> value) {
			this.searchTemplates = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder searchTemplates(TemplateItem... value) {
			this.searchTemplates = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		@SafeVarargs
		public final Builder searchTemplates(Function<TemplateItem.Builder, ObjectBuilder<TemplateItem>>... fns) {
			this.searchTemplates = new ArrayList<>(fns.length);
			for (Function<TemplateItem.Builder, ObjectBuilder<TemplateItem>> fn : fns) {
				this.searchTemplates.add(fn.apply(new TemplateItem.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link MsearchTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchTemplateRequest build() {
			_checkSingleUse();

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

				if (ModelTypeHelper.isDefined(request.index()))
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
				params.put("typed_keys", "true");
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", String.valueOf(request.maxConcurrentSearches));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.jsonValue());
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code msearch_template}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> createMsearchTemplateEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				MsearchTemplateResponse.createMsearchTemplateResponseDeserializer(tDocumentDeserializer));
	}
}
