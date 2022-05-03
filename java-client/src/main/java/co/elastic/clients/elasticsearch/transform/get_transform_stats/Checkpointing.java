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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.Checkpointing

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.Checkpointing">API
 *      specification</a>
 */
@JsonpDeserializable
public class Checkpointing implements JsonpSerializable {
	@Nullable
	private final Long changesLastDetectedAt;

	@Nullable
	private final DateTime changesLastDetectedAtDateTime;

	private final CheckpointStats last;

	@Nullable
	private final CheckpointStats next;

	@Nullable
	private final Long operationsBehind;

	@Nullable
	private final Long lastSearchTime;

	// ---------------------------------------------------------------------------------------------

	private Checkpointing(Builder builder) {

		this.changesLastDetectedAt = builder.changesLastDetectedAt;
		this.changesLastDetectedAtDateTime = builder.changesLastDetectedAtDateTime;
		this.last = ApiTypeHelper.requireNonNull(builder.last, this, "last");
		this.next = builder.next;
		this.operationsBehind = builder.operationsBehind;
		this.lastSearchTime = builder.lastSearchTime;

	}

	public static Checkpointing of(Function<Builder, ObjectBuilder<Checkpointing>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code changes_last_detected_at}
	 */
	@Nullable
	public final Long changesLastDetectedAt() {
		return this.changesLastDetectedAt;
	}

	/**
	 * API name: {@code changes_last_detected_at_date_time}
	 */
	@Nullable
	public final DateTime changesLastDetectedAtDateTime() {
		return this.changesLastDetectedAtDateTime;
	}

	/**
	 * Required - API name: {@code last}
	 */
	public final CheckpointStats last() {
		return this.last;
	}

	/**
	 * API name: {@code next}
	 */
	@Nullable
	public final CheckpointStats next() {
		return this.next;
	}

	/**
	 * API name: {@code operations_behind}
	 */
	@Nullable
	public final Long operationsBehind() {
		return this.operationsBehind;
	}

	/**
	 * API name: {@code last_search_time}
	 */
	@Nullable
	public final Long lastSearchTime() {
		return this.lastSearchTime;
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

		if (this.changesLastDetectedAt != null) {
			generator.writeKey("changes_last_detected_at");
			generator.write(this.changesLastDetectedAt);

		}
		if (this.changesLastDetectedAtDateTime != null) {
			generator.writeKey("changes_last_detected_at_date_time");
			this.changesLastDetectedAtDateTime.serialize(generator, mapper);
		}
		generator.writeKey("last");
		this.last.serialize(generator, mapper);

		if (this.next != null) {
			generator.writeKey("next");
			this.next.serialize(generator, mapper);

		}
		if (this.operationsBehind != null) {
			generator.writeKey("operations_behind");
			generator.write(this.operationsBehind);

		}
		if (this.lastSearchTime != null) {
			generator.writeKey("last_search_time");
			generator.write(this.lastSearchTime);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Checkpointing}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Checkpointing> {
		@Nullable
		private Long changesLastDetectedAt;

		@Nullable
		private DateTime changesLastDetectedAtDateTime;

		private CheckpointStats last;

		@Nullable
		private CheckpointStats next;

		@Nullable
		private Long operationsBehind;

		@Nullable
		private Long lastSearchTime;

		/**
		 * API name: {@code changes_last_detected_at}
		 */
		public final Builder changesLastDetectedAt(@Nullable Long value) {
			this.changesLastDetectedAt = value;
			return this;
		}

		/**
		 * API name: {@code changes_last_detected_at_date_time}
		 */
		public final Builder changesLastDetectedAtDateTime(@Nullable DateTime value) {
			this.changesLastDetectedAtDateTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code last}
		 */
		public final Builder last(CheckpointStats value) {
			this.last = value;
			return this;
		}

		/**
		 * Required - API name: {@code last}
		 */
		public final Builder last(Function<CheckpointStats.Builder, ObjectBuilder<CheckpointStats>> fn) {
			return this.last(fn.apply(new CheckpointStats.Builder()).build());
		}

		/**
		 * API name: {@code next}
		 */
		public final Builder next(@Nullable CheckpointStats value) {
			this.next = value;
			return this;
		}

		/**
		 * API name: {@code next}
		 */
		public final Builder next(Function<CheckpointStats.Builder, ObjectBuilder<CheckpointStats>> fn) {
			return this.next(fn.apply(new CheckpointStats.Builder()).build());
		}

		/**
		 * API name: {@code operations_behind}
		 */
		public final Builder operationsBehind(@Nullable Long value) {
			this.operationsBehind = value;
			return this;
		}

		/**
		 * API name: {@code last_search_time}
		 */
		public final Builder lastSearchTime(@Nullable Long value) {
			this.lastSearchTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Checkpointing}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Checkpointing build() {
			_checkSingleUse();

			return new Checkpointing(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Checkpointing}
	 */
	public static final JsonpDeserializer<Checkpointing> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Checkpointing::setupCheckpointingDeserializer);

	protected static void setupCheckpointingDeserializer(ObjectDeserializer<Checkpointing.Builder> op) {

		op.add(Builder::changesLastDetectedAt, JsonpDeserializer.longDeserializer(), "changes_last_detected_at");
		op.add(Builder::changesLastDetectedAtDateTime, DateTime._DESERIALIZER, "changes_last_detected_at_date_time");
		op.add(Builder::last, CheckpointStats._DESERIALIZER, "last");
		op.add(Builder::next, CheckpointStats._DESERIALIZER, "next");
		op.add(Builder::operationsBehind, JsonpDeserializer.longDeserializer(), "operations_behind");
		op.add(Builder::lastSearchTime, JsonpDeserializer.longDeserializer(), "last_search_time");

	}

}
