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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SearchStats
@JsonpDeserializable
public final class SearchStats implements JsonpSerializable {
	private final Long fetchCurrent;

	private final Long fetchTimeInMillis;

	private final Long fetchTotal;

	@Nullable
	private final Long openContexts;

	private final Long queryCurrent;

	private final Long queryTimeInMillis;

	private final Long queryTotal;

	private final Long scrollCurrent;

	private final Long scrollTimeInMillis;

	private final Long scrollTotal;

	private final Long suggestCurrent;

	private final Long suggestTimeInMillis;

	private final Long suggestTotal;

	@Nullable
	private final Map<String, SearchStats> groups;

	// ---------------------------------------------------------------------------------------------

	public SearchStats(Builder builder) {

		this.fetchCurrent = Objects.requireNonNull(builder.fetchCurrent, "fetch_current");
		this.fetchTimeInMillis = Objects.requireNonNull(builder.fetchTimeInMillis, "fetch_time_in_millis");
		this.fetchTotal = Objects.requireNonNull(builder.fetchTotal, "fetch_total");
		this.openContexts = builder.openContexts;
		this.queryCurrent = Objects.requireNonNull(builder.queryCurrent, "query_current");
		this.queryTimeInMillis = Objects.requireNonNull(builder.queryTimeInMillis, "query_time_in_millis");
		this.queryTotal = Objects.requireNonNull(builder.queryTotal, "query_total");
		this.scrollCurrent = Objects.requireNonNull(builder.scrollCurrent, "scroll_current");
		this.scrollTimeInMillis = Objects.requireNonNull(builder.scrollTimeInMillis, "scroll_time_in_millis");
		this.scrollTotal = Objects.requireNonNull(builder.scrollTotal, "scroll_total");
		this.suggestCurrent = Objects.requireNonNull(builder.suggestCurrent, "suggest_current");
		this.suggestTimeInMillis = Objects.requireNonNull(builder.suggestTimeInMillis, "suggest_time_in_millis");
		this.suggestTotal = Objects.requireNonNull(builder.suggestTotal, "suggest_total");
		this.groups = builder.groups;

	}

	/**
	 * API name: {@code fetch_current}
	 */
	public Long fetchCurrent() {
		return this.fetchCurrent;
	}

	/**
	 * API name: {@code fetch_time_in_millis}
	 */
	public Long fetchTimeInMillis() {
		return this.fetchTimeInMillis;
	}

	/**
	 * API name: {@code fetch_total}
	 */
	public Long fetchTotal() {
		return this.fetchTotal;
	}

	/**
	 * API name: {@code open_contexts}
	 */
	@Nullable
	public Long openContexts() {
		return this.openContexts;
	}

	/**
	 * API name: {@code query_current}
	 */
	public Long queryCurrent() {
		return this.queryCurrent;
	}

	/**
	 * API name: {@code query_time_in_millis}
	 */
	public Long queryTimeInMillis() {
		return this.queryTimeInMillis;
	}

	/**
	 * API name: {@code query_total}
	 */
	public Long queryTotal() {
		return this.queryTotal;
	}

	/**
	 * API name: {@code scroll_current}
	 */
	public Long scrollCurrent() {
		return this.scrollCurrent;
	}

	/**
	 * API name: {@code scroll_time_in_millis}
	 */
	public Long scrollTimeInMillis() {
		return this.scrollTimeInMillis;
	}

	/**
	 * API name: {@code scroll_total}
	 */
	public Long scrollTotal() {
		return this.scrollTotal;
	}

	/**
	 * API name: {@code suggest_current}
	 */
	public Long suggestCurrent() {
		return this.suggestCurrent;
	}

	/**
	 * API name: {@code suggest_time_in_millis}
	 */
	public Long suggestTimeInMillis() {
		return this.suggestTimeInMillis;
	}

	/**
	 * API name: {@code suggest_total}
	 */
	public Long suggestTotal() {
		return this.suggestTotal;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public Map<String, SearchStats> groups() {
		return this.groups;
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

		generator.writeKey("fetch_current");
		generator.write(this.fetchCurrent);

		generator.writeKey("fetch_time_in_millis");
		generator.write(this.fetchTimeInMillis);

		generator.writeKey("fetch_total");
		generator.write(this.fetchTotal);

		if (this.openContexts != null) {

			generator.writeKey("open_contexts");
			generator.write(this.openContexts);

		}

		generator.writeKey("query_current");
		generator.write(this.queryCurrent);

		generator.writeKey("query_time_in_millis");
		generator.write(this.queryTimeInMillis);

		generator.writeKey("query_total");
		generator.write(this.queryTotal);

		generator.writeKey("scroll_current");
		generator.write(this.scrollCurrent);

		generator.writeKey("scroll_time_in_millis");
		generator.write(this.scrollTimeInMillis);

		generator.writeKey("scroll_total");
		generator.write(this.scrollTotal);

		generator.writeKey("suggest_current");
		generator.write(this.suggestCurrent);

		generator.writeKey("suggest_time_in_millis");
		generator.write(this.suggestTimeInMillis);

		generator.writeKey("suggest_total");
		generator.write(this.suggestTotal);

		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartObject();
			for (Map.Entry<String, SearchStats> item0 : this.groups.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchStats}.
	 */
	public static class Builder implements ObjectBuilder<SearchStats> {
		private Long fetchCurrent;

		private Long fetchTimeInMillis;

		private Long fetchTotal;

		@Nullable
		private Long openContexts;

		private Long queryCurrent;

		private Long queryTimeInMillis;

		private Long queryTotal;

		private Long scrollCurrent;

		private Long scrollTimeInMillis;

		private Long scrollTotal;

		private Long suggestCurrent;

		private Long suggestTimeInMillis;

		private Long suggestTotal;

		@Nullable
		private Map<String, SearchStats> groups;

		/**
		 * API name: {@code fetch_current}
		 */
		public Builder fetchCurrent(Long value) {
			this.fetchCurrent = value;
			return this;
		}

		/**
		 * API name: {@code fetch_time_in_millis}
		 */
		public Builder fetchTimeInMillis(Long value) {
			this.fetchTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code fetch_total}
		 */
		public Builder fetchTotal(Long value) {
			this.fetchTotal = value;
			return this;
		}

		/**
		 * API name: {@code open_contexts}
		 */
		public Builder openContexts(@Nullable Long value) {
			this.openContexts = value;
			return this;
		}

		/**
		 * API name: {@code query_current}
		 */
		public Builder queryCurrent(Long value) {
			this.queryCurrent = value;
			return this;
		}

		/**
		 * API name: {@code query_time_in_millis}
		 */
		public Builder queryTimeInMillis(Long value) {
			this.queryTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code query_total}
		 */
		public Builder queryTotal(Long value) {
			this.queryTotal = value;
			return this;
		}

		/**
		 * API name: {@code scroll_current}
		 */
		public Builder scrollCurrent(Long value) {
			this.scrollCurrent = value;
			return this;
		}

		/**
		 * API name: {@code scroll_time_in_millis}
		 */
		public Builder scrollTimeInMillis(Long value) {
			this.scrollTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code scroll_total}
		 */
		public Builder scrollTotal(Long value) {
			this.scrollTotal = value;
			return this;
		}

		/**
		 * API name: {@code suggest_current}
		 */
		public Builder suggestCurrent(Long value) {
			this.suggestCurrent = value;
			return this;
		}

		/**
		 * API name: {@code suggest_time_in_millis}
		 */
		public Builder suggestTimeInMillis(Long value) {
			this.suggestTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code suggest_total}
		 */
		public Builder suggestTotal(Long value) {
			this.suggestTotal = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable Map<String, SearchStats> value) {
			this.groups = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #groups(Map)}, creating the map if needed.
		 */
		public Builder putGroups(String key, SearchStats value) {
			if (this.groups == null) {
				this.groups = new HashMap<>();
			}
			this.groups.put(key, value);
			return this;
		}

		/**
		 * Set {@link #groups(Map)} to a singleton map.
		 */
		public Builder groups(String key, Function<SearchStats.Builder, ObjectBuilder<SearchStats>> fn) {
			return this.groups(Collections.singletonMap(key, fn.apply(new SearchStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #groups(Map)}, creating the map if needed.
		 */
		public Builder putGroups(String key, Function<SearchStats.Builder, ObjectBuilder<SearchStats>> fn) {
			return this.putGroups(key, fn.apply(new SearchStats.Builder()).build());
		}

		/**
		 * Builds a {@link SearchStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchStats build() {

			return new SearchStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchStats}
	 */
	public static final JsonpDeserializer<SearchStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchStats::setupSearchStatsDeserializer, Builder::build);

	protected static void setupSearchStatsDeserializer(DelegatingDeserializer<SearchStats.Builder> op) {

		op.add(Builder::fetchCurrent, JsonpDeserializer.longDeserializer(), "fetch_current");
		op.add(Builder::fetchTimeInMillis, JsonpDeserializer.longDeserializer(), "fetch_time_in_millis");
		op.add(Builder::fetchTotal, JsonpDeserializer.longDeserializer(), "fetch_total");
		op.add(Builder::openContexts, JsonpDeserializer.longDeserializer(), "open_contexts");
		op.add(Builder::queryCurrent, JsonpDeserializer.longDeserializer(), "query_current");
		op.add(Builder::queryTimeInMillis, JsonpDeserializer.longDeserializer(), "query_time_in_millis");
		op.add(Builder::queryTotal, JsonpDeserializer.longDeserializer(), "query_total");
		op.add(Builder::scrollCurrent, JsonpDeserializer.longDeserializer(), "scroll_current");
		op.add(Builder::scrollTimeInMillis, JsonpDeserializer.longDeserializer(), "scroll_time_in_millis");
		op.add(Builder::scrollTotal, JsonpDeserializer.longDeserializer(), "scroll_total");
		op.add(Builder::suggestCurrent, JsonpDeserializer.longDeserializer(), "suggest_current");
		op.add(Builder::suggestTimeInMillis, JsonpDeserializer.longDeserializer(), "suggest_time_in_millis");
		op.add(Builder::suggestTotal, JsonpDeserializer.longDeserializer(), "suggest_total");
		op.add(Builder::groups, JsonpDeserializer.stringMapDeserializer(SearchStats._DESERIALIZER), "groups");

	}

}
