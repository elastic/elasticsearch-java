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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.IndexingStats
@JsonpDeserializable
public final class IndexingStats implements JsonpSerializable {
	private final long indexCurrent;

	private final long deleteCurrent;

	@Nullable
	private final String deleteTime;

	private final long deleteTimeInMillis;

	private final long deleteTotal;

	private final boolean isThrottled;

	private final long noopUpdateTotal;

	@Nullable
	private final String throttleTime;

	private final long throttleTimeInMillis;

	@Nullable
	private final String indexTime;

	private final long indexTimeInMillis;

	private final long indexTotal;

	private final long indexFailed;

	@Nullable
	private final Map<String, IndexingStats> types;

	// ---------------------------------------------------------------------------------------------

	public IndexingStats(Builder builder) {

		this.indexCurrent = Objects.requireNonNull(builder.indexCurrent, "index_current");
		this.deleteCurrent = Objects.requireNonNull(builder.deleteCurrent, "delete_current");
		this.deleteTime = builder.deleteTime;
		this.deleteTimeInMillis = Objects.requireNonNull(builder.deleteTimeInMillis, "delete_time_in_millis");
		this.deleteTotal = Objects.requireNonNull(builder.deleteTotal, "delete_total");
		this.isThrottled = Objects.requireNonNull(builder.isThrottled, "is_throttled");
		this.noopUpdateTotal = Objects.requireNonNull(builder.noopUpdateTotal, "noop_update_total");
		this.throttleTime = builder.throttleTime;
		this.throttleTimeInMillis = Objects.requireNonNull(builder.throttleTimeInMillis, "throttle_time_in_millis");
		this.indexTime = builder.indexTime;
		this.indexTimeInMillis = Objects.requireNonNull(builder.indexTimeInMillis, "index_time_in_millis");
		this.indexTotal = Objects.requireNonNull(builder.indexTotal, "index_total");
		this.indexFailed = Objects.requireNonNull(builder.indexFailed, "index_failed");
		this.types = ModelTypeHelper.unmodifiable(builder.types);

	}

	public IndexingStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code index_current}
	 */
	public long indexCurrent() {
		return this.indexCurrent;
	}

	/**
	 * API name: {@code delete_current}
	 */
	public long deleteCurrent() {
		return this.deleteCurrent;
	}

	/**
	 * API name: {@code delete_time}
	 */
	@Nullable
	public String deleteTime() {
		return this.deleteTime;
	}

	/**
	 * API name: {@code delete_time_in_millis}
	 */
	public long deleteTimeInMillis() {
		return this.deleteTimeInMillis;
	}

	/**
	 * API name: {@code delete_total}
	 */
	public long deleteTotal() {
		return this.deleteTotal;
	}

	/**
	 * API name: {@code is_throttled}
	 */
	public boolean isThrottled() {
		return this.isThrottled;
	}

	/**
	 * API name: {@code noop_update_total}
	 */
	public long noopUpdateTotal() {
		return this.noopUpdateTotal;
	}

	/**
	 * API name: {@code throttle_time}
	 */
	@Nullable
	public String throttleTime() {
		return this.throttleTime;
	}

	/**
	 * API name: {@code throttle_time_in_millis}
	 */
	public long throttleTimeInMillis() {
		return this.throttleTimeInMillis;
	}

	/**
	 * API name: {@code index_time}
	 */
	@Nullable
	public String indexTime() {
		return this.indexTime;
	}

	/**
	 * API name: {@code index_time_in_millis}
	 */
	public long indexTimeInMillis() {
		return this.indexTimeInMillis;
	}

	/**
	 * API name: {@code index_total}
	 */
	public long indexTotal() {
		return this.indexTotal;
	}

	/**
	 * API name: {@code index_failed}
	 */
	public long indexFailed() {
		return this.indexFailed;
	}

	/**
	 * API name: {@code types}
	 */
	@Nullable
	public Map<String, IndexingStats> types() {
		return this.types;
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

		generator.writeKey("index_current");
		generator.write(this.indexCurrent);

		generator.writeKey("delete_current");
		generator.write(this.deleteCurrent);

		if (this.deleteTime != null) {

			generator.writeKey("delete_time");
			generator.write(this.deleteTime);

		}

		generator.writeKey("delete_time_in_millis");
		generator.write(this.deleteTimeInMillis);

		generator.writeKey("delete_total");
		generator.write(this.deleteTotal);

		generator.writeKey("is_throttled");
		generator.write(this.isThrottled);

		generator.writeKey("noop_update_total");
		generator.write(this.noopUpdateTotal);

		if (this.throttleTime != null) {

			generator.writeKey("throttle_time");
			generator.write(this.throttleTime);

		}

		generator.writeKey("throttle_time_in_millis");
		generator.write(this.throttleTimeInMillis);

		if (this.indexTime != null) {

			generator.writeKey("index_time");
			generator.write(this.indexTime);

		}

		generator.writeKey("index_time_in_millis");
		generator.write(this.indexTimeInMillis);

		generator.writeKey("index_total");
		generator.write(this.indexTotal);

		generator.writeKey("index_failed");
		generator.write(this.indexFailed);

		if (this.types != null) {

			generator.writeKey("types");
			generator.writeStartObject();
			for (Map.Entry<String, IndexingStats> item0 : this.types.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexingStats}.
	 */
	public static class Builder implements ObjectBuilder<IndexingStats> {
		private Long indexCurrent;

		private Long deleteCurrent;

		@Nullable
		private String deleteTime;

		private Long deleteTimeInMillis;

		private Long deleteTotal;

		private Boolean isThrottled;

		private Long noopUpdateTotal;

		@Nullable
		private String throttleTime;

		private Long throttleTimeInMillis;

		@Nullable
		private String indexTime;

		private Long indexTimeInMillis;

		private Long indexTotal;

		private Long indexFailed;

		@Nullable
		private Map<String, IndexingStats> types;

		/**
		 * API name: {@code index_current}
		 */
		public Builder indexCurrent(long value) {
			this.indexCurrent = value;
			return this;
		}

		/**
		 * API name: {@code delete_current}
		 */
		public Builder deleteCurrent(long value) {
			this.deleteCurrent = value;
			return this;
		}

		/**
		 * API name: {@code delete_time}
		 */
		public Builder deleteTime(@Nullable String value) {
			this.deleteTime = value;
			return this;
		}

		/**
		 * API name: {@code delete_time_in_millis}
		 */
		public Builder deleteTimeInMillis(long value) {
			this.deleteTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code delete_total}
		 */
		public Builder deleteTotal(long value) {
			this.deleteTotal = value;
			return this;
		}

		/**
		 * API name: {@code is_throttled}
		 */
		public Builder isThrottled(boolean value) {
			this.isThrottled = value;
			return this;
		}

		/**
		 * API name: {@code noop_update_total}
		 */
		public Builder noopUpdateTotal(long value) {
			this.noopUpdateTotal = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time}
		 */
		public Builder throttleTime(@Nullable String value) {
			this.throttleTime = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time_in_millis}
		 */
		public Builder throttleTimeInMillis(long value) {
			this.throttleTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code index_time}
		 */
		public Builder indexTime(@Nullable String value) {
			this.indexTime = value;
			return this;
		}

		/**
		 * API name: {@code index_time_in_millis}
		 */
		public Builder indexTimeInMillis(long value) {
			this.indexTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code index_total}
		 */
		public Builder indexTotal(long value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * API name: {@code index_failed}
		 */
		public Builder indexFailed(long value) {
			this.indexFailed = value;
			return this;
		}

		/**
		 * API name: {@code types}
		 */
		public Builder types(@Nullable Map<String, IndexingStats> value) {
			this.types = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #types(Map)}, creating the map if needed.
		 */
		public Builder putTypes(String key, IndexingStats value) {
			if (this.types == null) {
				this.types = new HashMap<>();
			}
			this.types.put(key, value);
			return this;
		}

		/**
		 * Set {@link #types(Map)} to a singleton map.
		 */
		public Builder types(String key, Function<IndexingStats.Builder, ObjectBuilder<IndexingStats>> fn) {
			return this.types(Collections.singletonMap(key, fn.apply(new IndexingStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #types(Map)}, creating the map if needed.
		 */
		public Builder putTypes(String key, Function<IndexingStats.Builder, ObjectBuilder<IndexingStats>> fn) {
			return this.putTypes(key, fn.apply(new IndexingStats.Builder()).build());
		}

		/**
		 * Builds a {@link IndexingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexingStats build() {

			return new IndexingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexingStats}
	 */
	public static final JsonpDeserializer<IndexingStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexingStats::setupIndexingStatsDeserializer, Builder::build);

	protected static void setupIndexingStatsDeserializer(DelegatingDeserializer<IndexingStats.Builder> op) {

		op.add(Builder::indexCurrent, JsonpDeserializer.longDeserializer(), "index_current");
		op.add(Builder::deleteCurrent, JsonpDeserializer.longDeserializer(), "delete_current");
		op.add(Builder::deleteTime, JsonpDeserializer.stringDeserializer(), "delete_time");
		op.add(Builder::deleteTimeInMillis, JsonpDeserializer.longDeserializer(), "delete_time_in_millis");
		op.add(Builder::deleteTotal, JsonpDeserializer.longDeserializer(), "delete_total");
		op.add(Builder::isThrottled, JsonpDeserializer.booleanDeserializer(), "is_throttled");
		op.add(Builder::noopUpdateTotal, JsonpDeserializer.longDeserializer(), "noop_update_total");
		op.add(Builder::throttleTime, JsonpDeserializer.stringDeserializer(), "throttle_time");
		op.add(Builder::throttleTimeInMillis, JsonpDeserializer.longDeserializer(), "throttle_time_in_millis");
		op.add(Builder::indexTime, JsonpDeserializer.stringDeserializer(), "index_time");
		op.add(Builder::indexTimeInMillis, JsonpDeserializer.longDeserializer(), "index_time_in_millis");
		op.add(Builder::indexTotal, JsonpDeserializer.longDeserializer(), "index_total");
		op.add(Builder::indexFailed, JsonpDeserializer.longDeserializer(), "index_failed");
		op.add(Builder::types, JsonpDeserializer.stringMapDeserializer(IndexingStats._DESERIALIZER), "types");

	}

}
