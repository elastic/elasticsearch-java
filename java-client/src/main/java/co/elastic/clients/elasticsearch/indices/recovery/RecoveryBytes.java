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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryBytes
@JsonpDeserializable
public final class RecoveryBytes implements JsonpSerializable {
	private final String percent;

	@Nullable
	private final String recovered;

	private final String recoveredInBytes;

	@Nullable
	private final String recoveredFromSnapshot;

	@Nullable
	private final String recoveredFromSnapshotInBytes;

	@Nullable
	private final String reused;

	private final String reusedInBytes;

	@Nullable
	private final String total;

	private final String totalInBytes;

	// ---------------------------------------------------------------------------------------------

	public RecoveryBytes(Builder builder) {

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
	public String percent() {
		return this.percent;
	}

	/**
	 * API name: {@code recovered}
	 */
	@Nullable
	public String recovered() {
		return this.recovered;
	}

	/**
	 * API name: {@code recovered_in_bytes}
	 */
	public String recoveredInBytes() {
		return this.recoveredInBytes;
	}

	/**
	 * API name: {@code recovered_from_snapshot}
	 */
	@Nullable
	public String recoveredFromSnapshot() {
		return this.recoveredFromSnapshot;
	}

	/**
	 * API name: {@code recovered_from_snapshot_in_bytes}
	 */
	@Nullable
	public String recoveredFromSnapshotInBytes() {
		return this.recoveredFromSnapshotInBytes;
	}

	/**
	 * API name: {@code reused}
	 */
	@Nullable
	public String reused() {
		return this.reused;
	}

	/**
	 * API name: {@code reused_in_bytes}
	 */
	public String reusedInBytes() {
		return this.reusedInBytes;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public String total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public String totalInBytes() {
		return this.totalInBytes;
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
		private String percent;

		@Nullable
		private String recovered;

		private String recoveredInBytes;

		@Nullable
		private String recoveredFromSnapshot;

		@Nullable
		private String recoveredFromSnapshotInBytes;

		@Nullable
		private String reused;

		private String reusedInBytes;

		@Nullable
		private String total;

		private String totalInBytes;

		/**
		 * API name: {@code percent}
		 */
		public Builder percent(String value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code recovered}
		 */
		public Builder recovered(@Nullable String value) {
			this.recovered = value;
			return this;
		}

		/**
		 * API name: {@code recovered_in_bytes}
		 */
		public Builder recoveredInBytes(String value) {
			this.recoveredInBytes = value;
			return this;
		}

		/**
		 * API name: {@code recovered_from_snapshot}
		 */
		public Builder recoveredFromSnapshot(@Nullable String value) {
			this.recoveredFromSnapshot = value;
			return this;
		}

		/**
		 * API name: {@code recovered_from_snapshot_in_bytes}
		 */
		public Builder recoveredFromSnapshotInBytes(@Nullable String value) {
			this.recoveredFromSnapshotInBytes = value;
			return this;
		}

		/**
		 * API name: {@code reused}
		 */
		public Builder reused(@Nullable String value) {
			this.reused = value;
			return this;
		}

		/**
		 * API name: {@code reused_in_bytes}
		 */
		public Builder reusedInBytes(String value) {
			this.reusedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public Builder totalInBytes(String value) {
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
	 * Json deserializer for {@link RecoveryBytes}
	 */
	public static final JsonpDeserializer<RecoveryBytes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryBytes::setupRecoveryBytesDeserializer, Builder::build);

	protected static void setupRecoveryBytesDeserializer(DelegatingDeserializer<RecoveryBytes.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.stringDeserializer(), "percent");
		op.add(Builder::recovered, JsonpDeserializer.stringDeserializer(), "recovered");
		op.add(Builder::recoveredInBytes, JsonpDeserializer.stringDeserializer(), "recovered_in_bytes");
		op.add(Builder::recoveredFromSnapshot, JsonpDeserializer.stringDeserializer(), "recovered_from_snapshot");
		op.add(Builder::recoveredFromSnapshotInBytes, JsonpDeserializer.stringDeserializer(),
				"recovered_from_snapshot_in_bytes");
		op.add(Builder::reused, JsonpDeserializer.stringDeserializer(), "reused");
		op.add(Builder::reusedInBytes, JsonpDeserializer.stringDeserializer(), "reused_in_bytes");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.stringDeserializer(), "total_in_bytes");

	}

}
