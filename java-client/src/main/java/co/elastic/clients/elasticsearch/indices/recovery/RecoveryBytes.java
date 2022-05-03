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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryBytes

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.recovery.RecoveryBytes">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoveryBytes implements JsonpSerializable {
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

	private RecoveryBytes(Builder builder) {

		this.percent = ApiTypeHelper.requireNonNull(builder.percent, this, "percent");
		this.recovered = builder.recovered;
		this.recoveredInBytes = ApiTypeHelper.requireNonNull(builder.recoveredInBytes, this, "recoveredInBytes");
		this.recoveredFromSnapshot = builder.recoveredFromSnapshot;
		this.recoveredFromSnapshotInBytes = builder.recoveredFromSnapshotInBytes;
		this.reused = builder.reused;
		this.reusedInBytes = ApiTypeHelper.requireNonNull(builder.reusedInBytes, this, "reusedInBytes");
		this.total = builder.total;
		this.totalInBytes = ApiTypeHelper.requireNonNull(builder.totalInBytes, this, "totalInBytes");

	}

	public static RecoveryBytes of(Function<Builder, ObjectBuilder<RecoveryBytes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code percent}
	 */
	public final String percent() {
		return this.percent;
	}

	/**
	 * API name: {@code recovered}
	 */
	@Nullable
	public final String recovered() {
		return this.recovered;
	}

	/**
	 * Required - API name: {@code recovered_in_bytes}
	 */
	public final String recoveredInBytes() {
		return this.recoveredInBytes;
	}

	/**
	 * API name: {@code recovered_from_snapshot}
	 */
	@Nullable
	public final String recoveredFromSnapshot() {
		return this.recoveredFromSnapshot;
	}

	/**
	 * API name: {@code recovered_from_snapshot_in_bytes}
	 */
	@Nullable
	public final String recoveredFromSnapshotInBytes() {
		return this.recoveredFromSnapshotInBytes;
	}

	/**
	 * API name: {@code reused}
	 */
	@Nullable
	public final String reused() {
		return this.reused;
	}

	/**
	 * Required - API name: {@code reused_in_bytes}
	 */
	public final String reusedInBytes() {
		return this.reusedInBytes;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final String total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code total_in_bytes}
	 */
	public final String totalInBytes() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryBytes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RecoveryBytes> {
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
		 * Required - API name: {@code percent}
		 */
		public final Builder percent(String value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code recovered}
		 */
		public final Builder recovered(@Nullable String value) {
			this.recovered = value;
			return this;
		}

		/**
		 * Required - API name: {@code recovered_in_bytes}
		 */
		public final Builder recoveredInBytes(String value) {
			this.recoveredInBytes = value;
			return this;
		}

		/**
		 * API name: {@code recovered_from_snapshot}
		 */
		public final Builder recoveredFromSnapshot(@Nullable String value) {
			this.recoveredFromSnapshot = value;
			return this;
		}

		/**
		 * API name: {@code recovered_from_snapshot_in_bytes}
		 */
		public final Builder recoveredFromSnapshotInBytes(@Nullable String value) {
			this.recoveredFromSnapshotInBytes = value;
			return this;
		}

		/**
		 * API name: {@code reused}
		 */
		public final Builder reused(@Nullable String value) {
			this.reused = value;
			return this;
		}

		/**
		 * Required - API name: {@code reused_in_bytes}
		 */
		public final Builder reusedInBytes(String value) {
			this.reusedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(String value) {
			this.totalInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryBytes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryBytes build() {
			_checkSingleUse();

			return new RecoveryBytes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryBytes}
	 */
	public static final JsonpDeserializer<RecoveryBytes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryBytes::setupRecoveryBytesDeserializer);

	protected static void setupRecoveryBytesDeserializer(ObjectDeserializer<RecoveryBytes.Builder> op) {

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
