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

package co.elastic.clients.elasticsearch.core.msearch;

import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch.MultisearchHeader

/**
 * Contains parameters used to limit or change the subsequent search body
 * request.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.msearch.MultisearchHeader">API
 *      specification</a>
 */
@JsonpDeserializable
public class MultisearchHeader implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final String routing;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final Boolean allowPartialSearchResults;

	@Nullable
	private final Boolean ignoreThrottled;

	// ---------------------------------------------------------------------------------------------

	private MultisearchHeader(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.preference = builder.preference;
		this.requestCache = builder.requestCache;
		this.routing = builder.routing;
		this.searchType = builder.searchType;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.ignoreThrottled = builder.ignoreThrottled;

	}

	public static MultisearchHeader of(Function<Builder, ObjectBuilder<MultisearchHeader>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public final Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public final Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
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

		if (this.allowNoIndices != null) {
			generator.writeKey("allow_no_indices");
			generator.write(this.allowNoIndices);

		}
		if (ApiTypeHelper.isDefined(this.expandWildcards)) {
			generator.writeKey("expand_wildcards");
			generator.writeStartArray();
			for (ExpandWildcard item0 : this.expandWildcards) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.ignoreUnavailable != null) {
			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (ApiTypeHelper.isDefined(this.index)) {
			generator.writeKey("index");
			generator.writeStartArray();
			for (String item0 : this.index) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.preference != null) {
			generator.writeKey("preference");
			generator.write(this.preference);

		}
		if (this.requestCache != null) {
			generator.writeKey("request_cache");
			generator.write(this.requestCache);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.searchType != null) {
			generator.writeKey("search_type");
			this.searchType.serialize(generator, mapper);
		}
		if (this.ccsMinimizeRoundtrips != null) {
			generator.writeKey("ccs_minimize_roundtrips");
			generator.write(this.ccsMinimizeRoundtrips);

		}
		if (this.allowPartialSearchResults != null) {
			generator.writeKey("allow_partial_search_results");
			generator.write(this.allowPartialSearchResults);

		}
		if (this.ignoreThrottled != null) {
			generator.writeKey("ignore_throttled");
			generator.write(this.ignoreThrottled);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultisearchHeader}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MultisearchHeader> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private String preference;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private String routing;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private Boolean allowPartialSearchResults;

		@Nullable
		private Boolean ignoreThrottled;

		/**
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public final Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * API name: {@code allow_partial_search_results}
		 */
		public final Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * API name: {@code ignore_throttled}
		 */
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultisearchHeader}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultisearchHeader build() {
			_checkSingleUse();

			return new MultisearchHeader(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultisearchHeader}
	 */
	public static final JsonpDeserializer<MultisearchHeader> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MultisearchHeader::setupMultisearchHeaderDeserializer);

	protected static void setupMultisearchHeaderDeserializer(ObjectDeserializer<MultisearchHeader.Builder> op) {

		op.add(Builder::allowNoIndices, JsonpDeserializer.booleanDeserializer(), "allow_no_indices");
		op.add(Builder::expandWildcards, JsonpDeserializer.arrayDeserializer(ExpandWildcard._DESERIALIZER),
				"expand_wildcards");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::preference, JsonpDeserializer.stringDeserializer(), "preference");
		op.add(Builder::requestCache, JsonpDeserializer.booleanDeserializer(), "request_cache");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchType, SearchType._DESERIALIZER, "search_type");
		op.add(Builder::ccsMinimizeRoundtrips, JsonpDeserializer.booleanDeserializer(), "ccs_minimize_roundtrips");
		op.add(Builder::allowPartialSearchResults, JsonpDeserializer.booleanDeserializer(),
				"allow_partial_search_results");
		op.add(Builder::ignoreThrottled, JsonpDeserializer.booleanDeserializer(), "ignore_throttled");

	}

}
