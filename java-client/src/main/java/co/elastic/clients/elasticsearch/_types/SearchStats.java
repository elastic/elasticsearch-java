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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.SearchStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.SearchStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchStats implements JsonpSerializable {
	private final long fetchCurrent;

	@Nullable
	private final Time fetchTime;

	private final long fetchTimeInMillis;

	private final long fetchTotal;

	@Nullable
	private final Long openContexts;

	private final long queryCurrent;

	@Nullable
	private final Time queryTime;

	private final long queryTimeInMillis;

	private final long queryTotal;

	private final long scrollCurrent;

	@Nullable
	private final Time scrollTime;

	private final long scrollTimeInMillis;

	private final long scrollTotal;

	private final long suggestCurrent;

	@Nullable
	private final Time suggestTime;

	private final long suggestTimeInMillis;

	private final long suggestTotal;

	private final Map<String, SearchStats> groups;

	// ---------------------------------------------------------------------------------------------

	private SearchStats(Builder builder) {

		this.fetchCurrent = ApiTypeHelper.requireNonNull(builder.fetchCurrent, this, "fetchCurrent");
		this.fetchTime = builder.fetchTime;
		this.fetchTimeInMillis = ApiTypeHelper.requireNonNull(builder.fetchTimeInMillis, this, "fetchTimeInMillis");
		this.fetchTotal = ApiTypeHelper.requireNonNull(builder.fetchTotal, this, "fetchTotal");
		this.openContexts = builder.openContexts;
		this.queryCurrent = ApiTypeHelper.requireNonNull(builder.queryCurrent, this, "queryCurrent");
		this.queryTime = builder.queryTime;
		this.queryTimeInMillis = ApiTypeHelper.requireNonNull(builder.queryTimeInMillis, this, "queryTimeInMillis");
		this.queryTotal = ApiTypeHelper.requireNonNull(builder.queryTotal, this, "queryTotal");
		this.scrollCurrent = ApiTypeHelper.requireNonNull(builder.scrollCurrent, this, "scrollCurrent");
		this.scrollTime = builder.scrollTime;
		this.scrollTimeInMillis = ApiTypeHelper.requireNonNull(builder.scrollTimeInMillis, this, "scrollTimeInMillis");
		this.scrollTotal = ApiTypeHelper.requireNonNull(builder.scrollTotal, this, "scrollTotal");
		this.suggestCurrent = ApiTypeHelper.requireNonNull(builder.suggestCurrent, this, "suggestCurrent");
		this.suggestTime = builder.suggestTime;
		this.suggestTimeInMillis = ApiTypeHelper.requireNonNull(builder.suggestTimeInMillis, this,
				"suggestTimeInMillis");
		this.suggestTotal = ApiTypeHelper.requireNonNull(builder.suggestTotal, this, "suggestTotal");
		this.groups = ApiTypeHelper.unmodifiable(builder.groups);

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
	 * API name: {@code fetch_time}
	 */
	@Nullable
	public final Time fetchTime() {
		return this.fetchTime;
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
	 * API name: {@code query_time}
	 */
	@Nullable
	public final Time queryTime() {
		return this.queryTime;
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
	 * API name: {@code scroll_time}
	 */
	@Nullable
	public final Time scrollTime() {
		return this.scrollTime;
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
	 * API name: {@code suggest_time}
	 */
	@Nullable
	public final Time suggestTime() {
		return this.suggestTime;
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

		if (this.fetchTime != null) {
			generator.writeKey("fetch_time");
			this.fetchTime.serialize(generator, mapper);

		}
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

		if (this.queryTime != null) {
			generator.writeKey("query_time");
			this.queryTime.serialize(generator, mapper);

		}
		generator.writeKey("query_time_in_millis");
		generator.write(this.queryTimeInMillis);

		generator.writeKey("query_total");
		generator.write(this.queryTotal);

		generator.writeKey("scroll_current");
		generator.write(this.scrollCurrent);

		if (this.scrollTime != null) {
			generator.writeKey("scroll_time");
			this.scrollTime.serialize(generator, mapper);

		}
		generator.writeKey("scroll_time_in_millis");
		generator.write(this.scrollTimeInMillis);

		generator.writeKey("scroll_total");
		generator.write(this.scrollTotal);

		generator.writeKey("suggest_current");
		generator.write(this.suggestCurrent);

		if (this.suggestTime != null) {
			generator.writeKey("suggest_time");
			this.suggestTime.serialize(generator, mapper);

		}
		generator.writeKey("suggest_time_in_millis");
		generator.write(this.suggestTimeInMillis);

		generator.writeKey("suggest_total");
		generator.write(this.suggestTotal);

		if (ApiTypeHelper.isDefined(this.groups)) {
			generator.writeKey("groups");
			generator.writeStartObject();
			for (Map.Entry<String, SearchStats> item0 : this.groups.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SearchStats> {
		private Long fetchCurrent;

		@Nullable
		private Time fetchTime;

		private Long fetchTimeInMillis;

		private Long fetchTotal;

		@Nullable
		private Long openContexts;

		private Long queryCurrent;

		@Nullable
		private Time queryTime;

		private Long queryTimeInMillis;

		private Long queryTotal;

		private Long scrollCurrent;

		@Nullable
		private Time scrollTime;

		private Long scrollTimeInMillis;

		private Long scrollTotal;

		private Long suggestCurrent;

		@Nullable
		private Time suggestTime;

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
		 * API name: {@code fetch_time}
		 */
		public final Builder fetchTime(@Nullable Time value) {
			this.fetchTime = value;
			return this;
		}

		/**
		 * API name: {@code fetch_time}
		 */
		public final Builder fetchTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.fetchTime(fn.apply(new Time.Builder()).build());
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
		 * API name: {@code query_time}
		 */
		public final Builder queryTime(@Nullable Time value) {
			this.queryTime = value;
			return this;
		}

		/**
		 * API name: {@code query_time}
		 */
		public final Builder queryTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.queryTime(fn.apply(new Time.Builder()).build());
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
		 * API name: {@code scroll_time}
		 */
		public final Builder scrollTime(@Nullable Time value) {
			this.scrollTime = value;
			return this;
		}

		/**
		 * API name: {@code scroll_time}
		 */
		public final Builder scrollTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.scrollTime(fn.apply(new Time.Builder()).build());
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
		 * API name: {@code suggest_time}
		 */
		public final Builder suggestTime(@Nullable Time value) {
			this.suggestTime = value;
			return this;
		}

		/**
		 * API name: {@code suggest_time}
		 */
		public final Builder suggestTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.suggestTime(fn.apply(new Time.Builder()).build());
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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>groups</code>.
		 */
		public final Builder groups(Map<String, SearchStats> map) {
			this.groups = _mapPutAll(this.groups, map);
			return this;
		}

		/**
		 * API name: {@code groups}
		 * <p>
		 * Adds an entry to <code>groups</code>.
		 */
		public final Builder groups(String key, SearchStats value) {
			this.groups = _mapPut(this.groups, key, value);
			return this;
		}

		/**
		 * API name: {@code groups}
		 * <p>
		 * Adds an entry to <code>groups</code> using a builder lambda.
		 */
		public final Builder groups(String key, Function<SearchStats.Builder, ObjectBuilder<SearchStats>> fn) {
			return groups(key, fn.apply(new SearchStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
			SearchStats::setupSearchStatsDeserializer);

	protected static void setupSearchStatsDeserializer(ObjectDeserializer<SearchStats.Builder> op) {

		op.add(Builder::fetchCurrent, JsonpDeserializer.longDeserializer(), "fetch_current");
		op.add(Builder::fetchTime, Time._DESERIALIZER, "fetch_time");
		op.add(Builder::fetchTimeInMillis, JsonpDeserializer.longDeserializer(), "fetch_time_in_millis");
		op.add(Builder::fetchTotal, JsonpDeserializer.longDeserializer(), "fetch_total");
		op.add(Builder::openContexts, JsonpDeserializer.longDeserializer(), "open_contexts");
		op.add(Builder::queryCurrent, JsonpDeserializer.longDeserializer(), "query_current");
		op.add(Builder::queryTime, Time._DESERIALIZER, "query_time");
		op.add(Builder::queryTimeInMillis, JsonpDeserializer.longDeserializer(), "query_time_in_millis");
		op.add(Builder::queryTotal, JsonpDeserializer.longDeserializer(), "query_total");
		op.add(Builder::scrollCurrent, JsonpDeserializer.longDeserializer(), "scroll_current");
		op.add(Builder::scrollTime, Time._DESERIALIZER, "scroll_time");
		op.add(Builder::scrollTimeInMillis, JsonpDeserializer.longDeserializer(), "scroll_time_in_millis");
		op.add(Builder::scrollTotal, JsonpDeserializer.longDeserializer(), "scroll_total");
		op.add(Builder::suggestCurrent, JsonpDeserializer.longDeserializer(), "suggest_current");
		op.add(Builder::suggestTime, Time._DESERIALIZER, "suggest_time");
		op.add(Builder::suggestTimeInMillis, JsonpDeserializer.longDeserializer(), "suggest_time_in_millis");
		op.add(Builder::suggestTotal, JsonpDeserializer.longDeserializer(), "suggest_total");
		op.add(Builder::groups, JsonpDeserializer.stringMapDeserializer(SearchStats._DESERIALIZER), "groups");

	}

}
