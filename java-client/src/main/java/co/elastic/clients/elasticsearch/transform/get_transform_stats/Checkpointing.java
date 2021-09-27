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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.Checkpointing
@JsonpDeserializable
public final class Checkpointing implements JsonpSerializable {
	private final long changesLastDetectedAt;

	@Nullable
	private final String changesLastDetectedAtDateTime;

	private final CheckpointStats last;

	@Nullable
	private final CheckpointStats next;

	@Nullable
	private final Long operationsBehind;

	// ---------------------------------------------------------------------------------------------

	public Checkpointing(Builder builder) {

		this.changesLastDetectedAt = Objects.requireNonNull(builder.changesLastDetectedAt, "changes_last_detected_at");
		this.changesLastDetectedAtDateTime = builder.changesLastDetectedAtDateTime;
		this.last = Objects.requireNonNull(builder.last, "last");
		this.next = builder.next;
		this.operationsBehind = builder.operationsBehind;

	}

	/**
	 * API name: {@code changes_last_detected_at}
	 */
	public long changesLastDetectedAt() {
		return this.changesLastDetectedAt;
	}

	/**
	 * API name: {@code changes_last_detected_at_date_time}
	 */
	@Nullable
	public String changesLastDetectedAtDateTime() {
		return this.changesLastDetectedAtDateTime;
	}

	/**
	 * API name: {@code last}
	 */
	public CheckpointStats last() {
		return this.last;
	}

	/**
	 * API name: {@code next}
	 */
	@Nullable
	public CheckpointStats next() {
		return this.next;
	}

	/**
	 * API name: {@code operations_behind}
	 */
	@Nullable
	public Long operationsBehind() {
		return this.operationsBehind;
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

		generator.writeKey("changes_last_detected_at");
		generator.write(this.changesLastDetectedAt);

		if (this.changesLastDetectedAtDateTime != null) {

			generator.writeKey("changes_last_detected_at_date_time");
			generator.write(this.changesLastDetectedAtDateTime);

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Checkpointing}.
	 */
	public static class Builder implements ObjectBuilder<Checkpointing> {
		private Long changesLastDetectedAt;

		@Nullable
		private String changesLastDetectedAtDateTime;

		private CheckpointStats last;

		@Nullable
		private CheckpointStats next;

		@Nullable
		private Long operationsBehind;

		/**
		 * API name: {@code changes_last_detected_at}
		 */
		public Builder changesLastDetectedAt(long value) {
			this.changesLastDetectedAt = value;
			return this;
		}

		/**
		 * API name: {@code changes_last_detected_at_date_time}
		 */
		public Builder changesLastDetectedAtDateTime(@Nullable String value) {
			this.changesLastDetectedAtDateTime = value;
			return this;
		}

		/**
		 * API name: {@code last}
		 */
		public Builder last(CheckpointStats value) {
			this.last = value;
			return this;
		}

		/**
		 * API name: {@code last}
		 */
		public Builder last(Function<CheckpointStats.Builder, ObjectBuilder<CheckpointStats>> fn) {
			return this.last(fn.apply(new CheckpointStats.Builder()).build());
		}

		/**
		 * API name: {@code next}
		 */
		public Builder next(@Nullable CheckpointStats value) {
			this.next = value;
			return this;
		}

		/**
		 * API name: {@code next}
		 */
		public Builder next(Function<CheckpointStats.Builder, ObjectBuilder<CheckpointStats>> fn) {
			return this.next(fn.apply(new CheckpointStats.Builder()).build());
		}

		/**
		 * API name: {@code operations_behind}
		 */
		public Builder operationsBehind(@Nullable Long value) {
			this.operationsBehind = value;
			return this;
		}

		/**
		 * Builds a {@link Checkpointing}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Checkpointing build() {

			return new Checkpointing(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Checkpointing}
	 */
	public static final JsonpDeserializer<Checkpointing> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Checkpointing::setupCheckpointingDeserializer, Builder::build);

	protected static void setupCheckpointingDeserializer(DelegatingDeserializer<Checkpointing.Builder> op) {

		op.add(Builder::changesLastDetectedAt, JsonpDeserializer.longDeserializer(), "changes_last_detected_at");
		op.add(Builder::changesLastDetectedAtDateTime, JsonpDeserializer.stringDeserializer(),
				"changes_last_detected_at_date_time");
		op.add(Builder::last, CheckpointStats._DESERIALIZER, "last");
		op.add(Builder::next, CheckpointStats._DESERIALIZER, "next");
		op.add(Builder::operationsBehind, JsonpDeserializer.longDeserializer(), "operations_behind");

	}

}
