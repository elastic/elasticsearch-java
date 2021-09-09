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
import co.elastic.clients.elasticsearch._global.msearch_template.TemplateItem;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.lang.Number;
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
public final class MsearchTemplateRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final Number maxConcurrentSearches;

	@Nullable
	private final JsonValue searchType;

	@Nullable
	private final Boolean restTotalHitsAsInt;

	@Nullable
	private final Boolean typedKeys;

	private final List<TemplateItem> value;

	// ---------------------------------------------------------------------------------------------

	protected MsearchTemplateRequest(Builder builder) {

		this.index = builder.index;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.searchType = builder.searchType;
		this.restTotalHitsAsInt = builder.restTotalHitsAsInt;
		this.typedKeys = builder.typedKeys;
		this.value = Objects.requireNonNull(builder.value, "value");

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
	public Number maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public JsonValue searchType() {
		return this.searchType;
	}

	/**
	 * Indicates whether hits.total should be rendered as an integer or an object in
	 * the rest search response
	 * <p>
	 * API name: {@code rest_total_hits_as_int}
	 */
	@Nullable
	public Boolean restTotalHitsAsInt() {
		return this.restTotalHitsAsInt;
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
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public List<TemplateItem> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TemplateItem item0 : this.value) {
			item0.toJsonp(generator, mapper);

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
		private Number maxConcurrentSearches;

		@Nullable
		private JsonValue searchType;

		@Nullable
		private Boolean restTotalHitsAsInt;

		@Nullable
		private Boolean typedKeys;

		private List<TemplateItem> value;

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
		public Builder maxConcurrentSearches(@Nullable Number value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable JsonValue value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Indicates whether hits.total should be rendered as an integer or an object in
		 * the rest search response
		 * <p>
		 * API name: {@code rest_total_hits_as_int}
		 */
		public Builder restTotalHitsAsInt(@Nullable Boolean value) {
			this.restTotalHitsAsInt = value;
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
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(List<TemplateItem> value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(TemplateItem... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(TemplateItem value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
			return this;
		}

		/**
		 * Set {@link #value(List)} to a singleton list.
		 */
		public Builder value(Function<TemplateItem.Builder, ObjectBuilder<TemplateItem>> fn) {
			return this.value(fn.apply(new TemplateItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(Function<TemplateItem.Builder, ObjectBuilder<TemplateItem>> fn) {
			return this.addValue(fn.apply(new TemplateItem.Builder()).build());
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MsearchTemplateRequest
	 */
	public static final JsonpDeserializer<MsearchTemplateRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MsearchTemplateRequest::setupMsearchTemplateRequestDeserializer);

	protected static void setupMsearchTemplateRequestDeserializer(
			DelegatingDeserializer<MsearchTemplateRequest.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(TemplateItem.DESERIALIZER), "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code msearch_template}".
	 */
	private static final Endpoint.Simple<MsearchTemplateRequest, Void> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_msearch");
					buf.append("/template");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", request.maxConcurrentSearches.toString());
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.restTotalHitsAsInt != null) {
					params.put("rest_total_hits_as_int", String.valueOf(request.restTotalHitsAsInt));
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code msearch_template}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ElasticsearchError> createMsearchTemplateEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				MsearchTemplateResponse.createMsearchTemplateResponseDeserializer(tDocumentDeserializer));
	}
}
