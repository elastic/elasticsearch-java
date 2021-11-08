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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SearchStats
@JsonpDeserializable
public class SearchStats implements JsonpSerializable {
	private final long fetchCurrent;

	private final long fetchTimeInMillis;

	private final long fetchTotal;

	@Nullable
	private final Long openContexts;

	private final long queryCurrent;

	private final long queryTimeInMillis;

	private final long queryTotal;

	private final long scrollCurrent;

	private final long scrollTimeInMillis;

	private final long scrollTotal;

	private final long suggestCurrent;

	private final long suggestTimeInMillis;

	private final long suggestTotal;

	private final Map<String, SearchStats> groups;

	// ---------------------------------------------------------------------------------------------

	private SearchStats(Builder builder) {

		this.fetchCurrent = ModelTypeHelper.requireNonNull(builder.fetchCurrent, this, "fetchCurrent");
		this.fetchTimeInMillis = ModelTypeHelper.requireNonNull(builder.fetchTimeInMillis, this, "fetchTimeInMillis");
		this.fetchTotal = ModelTypeHelper.requireNonNull(builder.fetchTotal, this, "fetchTotal");
		this.openContexts = builder.openContexts;
		this.queryCurrent = ModelTypeHelper.requireNonNull(builder.queryCurrent, this, "queryCurrent");
		this.queryTimeInMillis = ModelTypeHelper.requireNonNull(builder.queryTimeInMillis, this, "queryTimeInMillis");
		this.queryTotal = ModelTypeHelper.requireNonNull(builder.queryTotal, this, "queryTotal");
		this.scrollCurrent = ModelTypeHelper.requireNonNull(builder.scrollCurrent, this, "scrollCurrent");
		this.scrollTimeInMillis = ModelTypeHelper.requireNonNull(builder.scrollTimeInMillis, this,
				"scrollTimeInMillis");
		this.scrollTotal = ModelTypeHelper.requireNonNull(builder.scrollTotal, this, "scrollTotal");
		this.suggestCurrent = ModelTypeHelper.requireNonNull(builder.suggestCurrent, this, "suggestCurrent");
		this.suggestTimeInMillis = ModelTypeHelper.requireNonNull(builder.suggestTimeInMillis, this,
				"suggestTimeInMillis");
		this.suggestTotal = ModelTypeHelper.requireNonNull(builder.suggestTotal, this, "suggestTotal");
		this.groups = ModelTypeHelper.unmodifiable(builder.groups);

	}

	public static SearchStats of(Function<Builder, ObjectBuilder<SearchStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code fetch_current}
	 */
	public final long fetchCurrent() {
		return this.fetchCurrent;
	}

	/**
	 * Required - API name: {@code fetch_time_in_millis}
	 */
	public final long fetchTimeInMillis() {
		return this.fetchTimeInMillis;
	}

	/**
	 * Required - API name: {@code fetch_total}
	 */
	public final long fetchTotal() {
		return this.fetchTotal;
	}

	/**
	 * API name: {@code open_contexts}
	 */
	@Nullable
	public final Long openContexts() {
		return this.openContexts;
	}

	/**
	 * Required - API name: {@code query_current}
	 */
	public final long queryCurrent() {
		return this.queryCurrent;
	}

	/**
	 * Required - API name: {@code query_time_in_millis}
	 */
	public final long queryTimeInMillis() {
		return this.queryTimeInMillis;
	}

	/**
	 * Required - API name: {@code query_total}
	 */
	public final long queryTotal() {
		return this.queryTotal;
	}

	/**
	 * Required - API name: {@code scroll_current}
	 */
	public final long scrollCurrent() {
		return this.scrollCurrent;
	}

	/**
	 * Required - API name: {@code scroll_time_in_millis}
	 */
	public final long scrollTimeInMillis() {
		return this.scrollTimeInMillis;
	}

	/**
	 * Required - API name: {@code scroll_total}
	 */
	public final long scrollTotal() {
		return this.scrollTotal;
	}

	/**
	 * Required - API name: {@code suggest_current}
	 */
	public final long suggestCurrent() {
		return this.suggestCurrent;
	}

	/**
	 * Required - API name: {@code suggest_time_in_millis}
	 */
	public final long suggestTimeInMillis() {
		return this.suggestTimeInMillis;
	}

	/**
	 * Required - API name: {@code suggest_total}
	 */
	public final long suggestTotal() {
		return this.suggestTotal;
	}

	/**
	 * API name: {@code groups}
	 */
	public final Map<String, SearchStats> groups() {
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

		if (ModelTypeHelper.isDefined(this.groups)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SearchStats> {
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
		 * Required - API name: {@code fetch_current}
		 */
		public final Builder fetchCurrent(long value) {
			this.fetchCurrent = value;
			return this;
		}

		/**
		 * Required - API name: {@code fetch_time_in_millis}
		 */
		public final Builder fetchTimeInMillis(long value) {
			this.fetchTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code fetch_total}
		 */
		public final Builder fetchTotal(long value) {
			this.fetchTotal = value;
			return this;
		}

		/**
		 * API name: {@code open_contexts}
		 */
		public final Builder openContexts(@Nullable Long value) {
			this.openContexts = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_current}
		 */
		public final Builder queryCurrent(long value) {
			this.queryCurrent = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_time_in_millis}
		 */
		public final Builder queryTimeInMillis(long value) {
			this.queryTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_total}
		 */
		public final Builder queryTotal(long value) {
			this.queryTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code scroll_current}
		 */
		public final Builder scrollCurrent(long value) {
			this.scrollCurrent = value;
			return this;
		}

		/**
		 * Required - API name: {@code scroll_time_in_millis}
		 */
		public final Builder scrollTimeInMillis(long value) {
			this.scrollTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code scroll_total}
		 */
		public final Builder scrollTotal(long value) {
			this.scrollTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code suggest_current}
		 */
		public final Builder suggestCurrent(long value) {
			this.suggestCurrent = value;
			return this;
		}

		/**
		 * Required - API name: {@code suggest_time_in_millis}
		 */
		public final Builder suggestTimeInMillis(long value) {
			this.suggestTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code suggest_total}
		 */
		public final Builder suggestTotal(long value) {
			this.suggestTotal = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public final Builder groups(@Nullable Map<String, SearchStats> value) {
			this.groups = value;
			return this;
		}

		/**
		 * Set {@link #groups(Map)} to a singleton map.
		 */
		public Builder groups(String key, Function<SearchStats.Builder, ObjectBuilder<SearchStats>> fn) {
			return this.groups(Collections.singletonMap(key, fn.apply(new SearchStats.Builder()).build()));
		}

		public final Builder groups(
				Function<MapBuilder<String, SearchStats, SearchStats.Builder>, ObjectBuilder<Map<String, SearchStats>>> fn) {
			return groups(fn.apply(new MapBuilder<>(SearchStats.Builder::new)).build());
		}

		/**
		 * Builds a {@link SearchStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchStats build() {
			_checkSingleUse();

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
