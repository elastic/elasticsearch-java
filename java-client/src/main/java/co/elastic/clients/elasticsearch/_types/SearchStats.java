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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SearchStats
public final class SearchStats implements JsonpSerializable {
	private final Number fetchCurrent;

	private final Number fetchTimeInMillis;

	private final Number fetchTotal;

	@Nullable
	private final Number openContexts;

	private final Number queryCurrent;

	private final Number queryTimeInMillis;

	private final Number queryTotal;

	private final Number scrollCurrent;

	private final Number scrollTimeInMillis;

	private final Number scrollTotal;

	private final Number suggestCurrent;

	private final Number suggestTimeInMillis;

	private final Number suggestTotal;

	@Nullable
	private final Map<String, co.elastic.clients.elasticsearch._types.SearchStats> groups;

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
	public Number fetchCurrent() {
		return this.fetchCurrent;
	}

	/**
	 * API name: {@code fetch_time_in_millis}
	 */
	public Number fetchTimeInMillis() {
		return this.fetchTimeInMillis;
	}

	/**
	 * API name: {@code fetch_total}
	 */
	public Number fetchTotal() {
		return this.fetchTotal;
	}

	/**
	 * API name: {@code open_contexts}
	 */
	@Nullable
	public Number openContexts() {
		return this.openContexts;
	}

	/**
	 * API name: {@code query_current}
	 */
	public Number queryCurrent() {
		return this.queryCurrent;
	}

	/**
	 * API name: {@code query_time_in_millis}
	 */
	public Number queryTimeInMillis() {
		return this.queryTimeInMillis;
	}

	/**
	 * API name: {@code query_total}
	 */
	public Number queryTotal() {
		return this.queryTotal;
	}

	/**
	 * API name: {@code scroll_current}
	 */
	public Number scrollCurrent() {
		return this.scrollCurrent;
	}

	/**
	 * API name: {@code scroll_time_in_millis}
	 */
	public Number scrollTimeInMillis() {
		return this.scrollTimeInMillis;
	}

	/**
	 * API name: {@code scroll_total}
	 */
	public Number scrollTotal() {
		return this.scrollTotal;
	}

	/**
	 * API name: {@code suggest_current}
	 */
	public Number suggestCurrent() {
		return this.suggestCurrent;
	}

	/**
	 * API name: {@code suggest_time_in_millis}
	 */
	public Number suggestTimeInMillis() {
		return this.suggestTimeInMillis;
	}

	/**
	 * API name: {@code suggest_total}
	 */
	public Number suggestTotal() {
		return this.suggestTotal;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public Map<String, co.elastic.clients.elasticsearch._types.SearchStats> groups() {
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
		generator.write(this.fetchCurrent.doubleValue());

		generator.writeKey("fetch_time_in_millis");
		generator.write(this.fetchTimeInMillis.doubleValue());

		generator.writeKey("fetch_total");
		generator.write(this.fetchTotal.doubleValue());

		if (this.openContexts != null) {

			generator.writeKey("open_contexts");
			generator.write(this.openContexts.doubleValue());

		}

		generator.writeKey("query_current");
		generator.write(this.queryCurrent.doubleValue());

		generator.writeKey("query_time_in_millis");
		generator.write(this.queryTimeInMillis.doubleValue());

		generator.writeKey("query_total");
		generator.write(this.queryTotal.doubleValue());

		generator.writeKey("scroll_current");
		generator.write(this.scrollCurrent.doubleValue());

		generator.writeKey("scroll_time_in_millis");
		generator.write(this.scrollTimeInMillis.doubleValue());

		generator.writeKey("scroll_total");
		generator.write(this.scrollTotal.doubleValue());

		generator.writeKey("suggest_current");
		generator.write(this.suggestCurrent.doubleValue());

		generator.writeKey("suggest_time_in_millis");
		generator.write(this.suggestTimeInMillis.doubleValue());

		generator.writeKey("suggest_total");
		generator.write(this.suggestTotal.doubleValue());

		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartObject();
			for (Map.Entry<String, co.elastic.clients.elasticsearch._types.SearchStats> item0 : this.groups
					.entrySet()) {
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
		private Number fetchCurrent;

		private Number fetchTimeInMillis;

		private Number fetchTotal;

		@Nullable
		private Number openContexts;

		private Number queryCurrent;

		private Number queryTimeInMillis;

		private Number queryTotal;

		private Number scrollCurrent;

		private Number scrollTimeInMillis;

		private Number scrollTotal;

		private Number suggestCurrent;

		private Number suggestTimeInMillis;

		private Number suggestTotal;

		@Nullable
		private Map<String, co.elastic.clients.elasticsearch._types.SearchStats> groups;

		/**
		 * API name: {@code fetch_current}
		 */
		public Builder fetchCurrent(Number value) {
			this.fetchCurrent = value;
			return this;
		}

		/**
		 * API name: {@code fetch_time_in_millis}
		 */
		public Builder fetchTimeInMillis(Number value) {
			this.fetchTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code fetch_total}
		 */
		public Builder fetchTotal(Number value) {
			this.fetchTotal = value;
			return this;
		}

		/**
		 * API name: {@code open_contexts}
		 */
		public Builder openContexts(@Nullable Number value) {
			this.openContexts = value;
			return this;
		}

		/**
		 * API name: {@code query_current}
		 */
		public Builder queryCurrent(Number value) {
			this.queryCurrent = value;
			return this;
		}

		/**
		 * API name: {@code query_time_in_millis}
		 */
		public Builder queryTimeInMillis(Number value) {
			this.queryTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code query_total}
		 */
		public Builder queryTotal(Number value) {
			this.queryTotal = value;
			return this;
		}

		/**
		 * API name: {@code scroll_current}
		 */
		public Builder scrollCurrent(Number value) {
			this.scrollCurrent = value;
			return this;
		}

		/**
		 * API name: {@code scroll_time_in_millis}
		 */
		public Builder scrollTimeInMillis(Number value) {
			this.scrollTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code scroll_total}
		 */
		public Builder scrollTotal(Number value) {
			this.scrollTotal = value;
			return this;
		}

		/**
		 * API name: {@code suggest_current}
		 */
		public Builder suggestCurrent(Number value) {
			this.suggestCurrent = value;
			return this;
		}

		/**
		 * API name: {@code suggest_time_in_millis}
		 */
		public Builder suggestTimeInMillis(Number value) {
			this.suggestTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code suggest_total}
		 */
		public Builder suggestTotal(Number value) {
			this.suggestTotal = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable Map<String, co.elastic.clients.elasticsearch._types.SearchStats> value) {
			this.groups = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #groups(Map)}, creating the map if needed.
		 */
		public Builder putGroups(String key, co.elastic.clients.elasticsearch._types.SearchStats value) {
			if (this.groups == null) {
				this.groups = new HashMap<>();
			}
			this.groups.put(key, value);
			return this;
		}

		/**
		 * Set {@link #groups(Map)} to a singleton map.
		 */
		public Builder groups(String key,
				Function<co.elastic.clients.elasticsearch._types.SearchStats.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.SearchStats>> fn) {
			return this.groups(Collections.singletonMap(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.SearchStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #groups(Map)}, creating the map if needed.
		 */
		public Builder putGroups(String key,
				Function<co.elastic.clients.elasticsearch._types.SearchStats.Builder, ObjectBuilder<co.elastic.clients.elasticsearch._types.SearchStats>> fn) {
			return this.putGroups(key,
					fn.apply(new co.elastic.clients.elasticsearch._types.SearchStats.Builder()).build());
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
	public static final JsonpDeserializer<SearchStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SearchStats::setupSearchStatsDeserializer);

	protected static void setupSearchStatsDeserializer(DelegatingDeserializer<SearchStats.Builder> op) {

		op.add(Builder::fetchCurrent, JsonpDeserializer.numberDeserializer(), "fetch_current");
		op.add(Builder::fetchTimeInMillis, JsonpDeserializer.numberDeserializer(), "fetch_time_in_millis");
		op.add(Builder::fetchTotal, JsonpDeserializer.numberDeserializer(), "fetch_total");
		op.add(Builder::openContexts, JsonpDeserializer.numberDeserializer(), "open_contexts");
		op.add(Builder::queryCurrent, JsonpDeserializer.numberDeserializer(), "query_current");
		op.add(Builder::queryTimeInMillis, JsonpDeserializer.numberDeserializer(), "query_time_in_millis");
		op.add(Builder::queryTotal, JsonpDeserializer.numberDeserializer(), "query_total");
		op.add(Builder::scrollCurrent, JsonpDeserializer.numberDeserializer(), "scroll_current");
		op.add(Builder::scrollTimeInMillis, JsonpDeserializer.numberDeserializer(), "scroll_time_in_millis");
		op.add(Builder::scrollTotal, JsonpDeserializer.numberDeserializer(), "scroll_total");
		op.add(Builder::suggestCurrent, JsonpDeserializer.numberDeserializer(), "suggest_current");
		op.add(Builder::suggestTimeInMillis, JsonpDeserializer.numberDeserializer(), "suggest_time_in_millis");
		op.add(Builder::suggestTotal, JsonpDeserializer.numberDeserializer(), "suggest_total");
		op.add(Builder::groups, JsonpDeserializer
				.stringMapDeserializer(co.elastic.clients.elasticsearch._types.SearchStats.DESERIALIZER), "groups");

	}

}
