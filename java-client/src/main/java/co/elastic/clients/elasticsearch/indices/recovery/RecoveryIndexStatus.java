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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryIndexStatus
@JsonpDeserializable
public class RecoveryIndexStatus implements JsonpSerializable {
	@Nullable
	private final RecoveryBytes bytes;

	private final RecoveryFiles files;

	private final RecoveryBytes size;

	@Nullable
	private final String sourceThrottleTime;

	private final String sourceThrottleTimeInMillis;

	@Nullable
	private final String targetThrottleTime;

	private final String targetThrottleTimeInMillis;

	private final String totalTimeInMillis;

	@Nullable
	private final String totalTime;

	// ---------------------------------------------------------------------------------------------

	private RecoveryIndexStatus(Builder builder) {

		this.bytes = builder.bytes;
		this.files = ModelTypeHelper.requireNonNull(builder.files, this, "files");
		this.size = ModelTypeHelper.requireNonNull(builder.size, this, "size");
		this.sourceThrottleTime = builder.sourceThrottleTime;
		this.sourceThrottleTimeInMillis = ModelTypeHelper.requireNonNull(builder.sourceThrottleTimeInMillis, this,
				"sourceThrottleTimeInMillis");
		this.targetThrottleTime = builder.targetThrottleTime;
		this.targetThrottleTimeInMillis = ModelTypeHelper.requireNonNull(builder.targetThrottleTimeInMillis, this,
				"targetThrottleTimeInMillis");
		this.totalTimeInMillis = ModelTypeHelper.requireNonNull(builder.totalTimeInMillis, this, "totalTimeInMillis");
		this.totalTime = builder.totalTime;

	}

	public static RecoveryIndexStatus of(Function<Builder, ObjectBuilder<RecoveryIndexStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public final RecoveryBytes bytes() {
		return this.bytes;
	}

	/**
	 * Required - API name: {@code files}
	 */
	public final RecoveryFiles files() {
		return this.files;
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final RecoveryBytes size() {
		return this.size;
	}

	/**
	 * API name: {@code source_throttle_time}
	 */
	@Nullable
	public final String sourceThrottleTime() {
		return this.sourceThrottleTime;
	}

	/**
	 * Required - API name: {@code source_throttle_time_in_millis}
	 */
	public final String sourceThrottleTimeInMillis() {
		return this.sourceThrottleTimeInMillis;
	}

	/**
	 * API name: {@code target_throttle_time}
	 */
	@Nullable
	public final String targetThrottleTime() {
		return this.targetThrottleTime;
	}

	/**
	 * Required - API name: {@code target_throttle_time_in_millis}
	 */
	public final String targetThrottleTimeInMillis() {
		return this.targetThrottleTimeInMillis;
	}

	/**
	 * Required - API name: {@code total_time_in_millis}
	 */
	public final String totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public final String totalTime() {
		return this.totalTime;
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

		if (this.bytes != null) {
			generator.writeKey("bytes");
			this.bytes.serialize(generator, mapper);

		}
		generator.writeKey("files");
		this.files.serialize(generator, mapper);

		generator.writeKey("size");
		this.size.serialize(generator, mapper);

		if (this.sourceThrottleTime != null) {
			generator.writeKey("source_throttle_time");
			generator.write(this.sourceThrottleTime);

		}
		generator.writeKey("source_throttle_time_in_millis");
		generator.write(this.sourceThrottleTimeInMillis);

		if (this.targetThrottleTime != null) {
			generator.writeKey("target_throttle_time");
			generator.write(this.targetThrottleTime);

		}
		generator.writeKey("target_throttle_time_in_millis");
		generator.write(this.targetThrottleTimeInMillis);

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

		if (this.totalTime != null) {
			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryIndexStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RecoveryIndexStatus> {
		@Nullable
		private RecoveryBytes bytes;

		private RecoveryFiles files;

		private RecoveryBytes size;

		@Nullable
		private String sourceThrottleTime;

		private String sourceThrottleTimeInMillis;

		@Nullable
		private String targetThrottleTime;

		private String targetThrottleTimeInMillis;

		private String totalTimeInMillis;

		@Nullable
		private String totalTime;

		/**
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable RecoveryBytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public final Builder bytes(Function<RecoveryBytes.Builder, ObjectBuilder<RecoveryBytes>> fn) {
			return this.bytes(fn.apply(new RecoveryBytes.Builder()).build());
		}

		/**
		 * Required - API name: {@code files}
		 */
		public final Builder files(RecoveryFiles value) {
			this.files = value;
			return this;
		}

		/**
		 * Required - API name: {@code files}
		 */
		public final Builder files(Function<RecoveryFiles.Builder, ObjectBuilder<RecoveryFiles>> fn) {
			return this.files(fn.apply(new RecoveryFiles.Builder()).build());
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(RecoveryBytes value) {
			this.size = value;
			return this;
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(Function<RecoveryBytes.Builder, ObjectBuilder<RecoveryBytes>> fn) {
			return this.size(fn.apply(new RecoveryBytes.Builder()).build());
		}

		/**
		 * API name: {@code source_throttle_time}
		 */
		public final Builder sourceThrottleTime(@Nullable String value) {
			this.sourceThrottleTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code source_throttle_time_in_millis}
		 */
		public final Builder sourceThrottleTimeInMillis(String value) {
			this.sourceThrottleTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code target_throttle_time}
		 */
		public final Builder targetThrottleTime(@Nullable String value) {
			this.targetThrottleTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_throttle_time_in_millis}
		 */
		public final Builder targetThrottleTimeInMillis(String value) {
			this.targetThrottleTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_time_in_millis}
		 */
		public final Builder totalTimeInMillis(String value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public final Builder totalTime(@Nullable String value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * Builds a {@link RecoveryIndexStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryIndexStatus build() {
			_checkSingleUse();

			return new RecoveryIndexStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryIndexStatus}
	 */
	public static final JsonpDeserializer<RecoveryIndexStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RecoveryIndexStatus::setupRecoveryIndexStatusDeserializer, Builder::build);

	protected static void setupRecoveryIndexStatusDeserializer(DelegatingDeserializer<RecoveryIndexStatus.Builder> op) {

		op.add(Builder::bytes, RecoveryBytes._DESERIALIZER, "bytes");
		op.add(Builder::files, RecoveryFiles._DESERIALIZER, "files");
		op.add(Builder::size, RecoveryBytes._DESERIALIZER, "size");
		op.add(Builder::sourceThrottleTime, JsonpDeserializer.stringDeserializer(), "source_throttle_time");
		op.add(Builder::sourceThrottleTimeInMillis, JsonpDeserializer.stringDeserializer(),
				"source_throttle_time_in_millis");
		op.add(Builder::targetThrottleTime, JsonpDeserializer.stringDeserializer(), "target_throttle_time");
		op.add(Builder::targetThrottleTimeInMillis, JsonpDeserializer.stringDeserializer(),
				"target_throttle_time_in_millis");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.stringDeserializer(), "total_time_in_millis");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");

	}

}
