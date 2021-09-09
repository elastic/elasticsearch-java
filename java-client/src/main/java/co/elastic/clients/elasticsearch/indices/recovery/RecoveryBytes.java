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

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryBytes
public final class RecoveryBytes implements ToJsonp {
	private final JsonValue percent;

	@Nullable
	private final JsonValue recovered;

	private final JsonValue recoveredInBytes;

	@Nullable
	private final JsonValue recoveredFromSnapshot;

	@Nullable
	private final JsonValue recoveredFromSnapshotInBytes;

	@Nullable
	private final JsonValue reused;

	private final JsonValue reusedInBytes;

	@Nullable
	private final JsonValue total;

	private final JsonValue totalInBytes;

	// ---------------------------------------------------------------------------------------------

	protected RecoveryBytes(Builder builder) {

		this.percent = Objects.requireNonNull(builder.percent, "percent");
		this.recovered = builder.recovered;
		this.recoveredInBytes = Objects.requireNonNull(builder.recoveredInBytes, "recovered_in_bytes");
		this.recoveredFromSnapshot = builder.recoveredFromSnapshot;
		this.recoveredFromSnapshotInBytes = builder.recoveredFromSnapshotInBytes;
		this.reused = builder.reused;
		this.reusedInBytes = Objects.requireNonNull(builder.reusedInBytes, "reused_in_bytes");
		this.total = builder.total;
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");

	}

	/**
	 * API name: {@code percent}
	 */
	public JsonValue percent() {
		return this.percent;
	}

	/**
	 * API name: {@code recovered}
	 */
	@Nullable
	public JsonValue recovered() {
		return this.recovered;
	}

	/**
	 * API name: {@code recovered_in_bytes}
	 */
	public JsonValue recoveredInBytes() {
		return this.recoveredInBytes;
	}

	/**
	 * API name: {@code recovered_from_snapshot}
	 */
	@Nullable
	public JsonValue recoveredFromSnapshot() {
		return this.recoveredFromSnapshot;
	}

	/**
	 * API name: {@code recovered_from_snapshot_in_bytes}
	 */
	@Nullable
	public JsonValue recoveredFromSnapshotInBytes() {
		return this.recoveredFromSnapshotInBytes;
	}

	/**
	 * API name: {@code reused}
	 */
	@Nullable
	public JsonValue reused() {
		return this.reused;
	}

	/**
	 * API name: {@code reused_in_bytes}
	 */
	public JsonValue reusedInBytes() {
		return this.reusedInBytes;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public JsonValue total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public JsonValue totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("percent");
		generator.write(this.percent);

		if (this.recovered != null) {

			generator.writeKey("recovered");
			generator.write(this.recovered);

		}

		generator.writeKey("recovered_in_bytes");
		generator.write(this.recoveredInBytes);

		if (this.recoveredFromSnapshot != null) {

			generator.writeKey("recovered_from_snapshot");
			generator.write(this.recoveredFromSnapshot);

		}
		if (this.recoveredFromSnapshotInBytes != null) {

			generator.writeKey("recovered_from_snapshot_in_bytes");
			generator.write(this.recoveredFromSnapshotInBytes);

		}
		if (this.reused != null) {

			generator.writeKey("reused");
			generator.write(this.reused);

		}

		generator.writeKey("reused_in_bytes");
		generator.write(this.reusedInBytes);

		if (this.total != null) {

			generator.writeKey("total");
			generator.write(this.total);

		}

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryBytes}.
	 */
	public static class Builder implements ObjectBuilder<RecoveryBytes> {
		private JsonValue percent;

		@Nullable
		private JsonValue recovered;

		private JsonValue recoveredInBytes;

		@Nullable
		private JsonValue recoveredFromSnapshot;

		@Nullable
		private JsonValue recoveredFromSnapshotInBytes;

		@Nullable
		private JsonValue reused;

		private JsonValue reusedInBytes;

		@Nullable
		private JsonValue total;

		private JsonValue totalInBytes;

		/**
		 * API name: {@code percent}
		 */
		public Builder percent(JsonValue value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code recovered}
		 */
		public Builder recovered(@Nullable JsonValue value) {
			this.recovered = value;
			return this;
		}

		/**
		 * API name: {@code recovered_in_bytes}
		 */
		public Builder recoveredInBytes(JsonValue value) {
			this.recoveredInBytes = value;
			return this;
		}

		/**
		 * API name: {@code recovered_from_snapshot}
		 */
		public Builder recoveredFromSnapshot(@Nullable JsonValue value) {
			this.recoveredFromSnapshot = value;
			return this;
		}

		/**
		 * API name: {@code recovered_from_snapshot_in_bytes}
		 */
		public Builder recoveredFromSnapshotInBytes(@Nullable JsonValue value) {
			this.recoveredFromSnapshotInBytes = value;
			return this;
		}

		/**
		 * API name: {@code reused}
		 */
		public Builder reused(@Nullable JsonValue value) {
			this.reused = value;
			return this;
		}

		/**
		 * API name: {@code reused_in_bytes}
		 */
		public Builder reusedInBytes(JsonValue value) {
			this.reusedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(@Nullable JsonValue value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public Builder totalInBytes(JsonValue value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryBytes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryBytes build() {

			return new RecoveryBytes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RecoveryBytes
	 */
	public static final JsonpDeserializer<RecoveryBytes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RecoveryBytes::setupRecoveryBytesDeserializer);

	protected static void setupRecoveryBytesDeserializer(DelegatingDeserializer<RecoveryBytes.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.jsonValueDeserializer(), "percent");
		op.add(Builder::recovered, JsonpDeserializer.jsonValueDeserializer(), "recovered");
		op.add(Builder::recoveredInBytes, JsonpDeserializer.jsonValueDeserializer(), "recovered_in_bytes");
		op.add(Builder::recoveredFromSnapshot, JsonpDeserializer.jsonValueDeserializer(), "recovered_from_snapshot");
		op.add(Builder::recoveredFromSnapshotInBytes, JsonpDeserializer.jsonValueDeserializer(),
				"recovered_from_snapshot_in_bytes");
		op.add(Builder::reused, JsonpDeserializer.jsonValueDeserializer(), "reused");
		op.add(Builder::reusedInBytes, JsonpDeserializer.jsonValueDeserializer(), "reused_in_bytes");
		op.add(Builder::total, JsonpDeserializer.jsonValueDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.jsonValueDeserializer(), "total_in_bytes");

	}

}
