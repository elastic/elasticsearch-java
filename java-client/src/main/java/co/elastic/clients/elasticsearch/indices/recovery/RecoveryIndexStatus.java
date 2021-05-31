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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryIndexStatus
public final class RecoveryIndexStatus implements ToJsonp {
	@Nullable
	private final RecoveryBytes bytes;

	private final RecoveryFiles files;

	private final RecoveryBytes size;

	@Nullable
	private final JsonValue sourceThrottleTime;

	private final JsonValue sourceThrottleTimeInMillis;

	@Nullable
	private final JsonValue targetThrottleTime;

	private final JsonValue targetThrottleTimeInMillis;

	private final JsonValue totalTimeInMillis;

	@Nullable
	private final JsonValue totalTime;

	// ---------------------------------------------------------------------------------------------

	protected RecoveryIndexStatus(Builder builder) {

		this.bytes = builder.bytes;
		this.files = Objects.requireNonNull(builder.files, "files");
		this.size = Objects.requireNonNull(builder.size, "size");
		this.sourceThrottleTime = builder.sourceThrottleTime;
		this.sourceThrottleTimeInMillis = Objects.requireNonNull(builder.sourceThrottleTimeInMillis,
				"source_throttle_time_in_millis");
		this.targetThrottleTime = builder.targetThrottleTime;
		this.targetThrottleTimeInMillis = Objects.requireNonNull(builder.targetThrottleTimeInMillis,
				"target_throttle_time_in_millis");
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");
		this.totalTime = builder.totalTime;

	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public RecoveryBytes bytes() {
		return this.bytes;
	}

	/**
	 * API name: {@code files}
	 */
	public RecoveryFiles files() {
		return this.files;
	}

	/**
	 * API name: {@code size}
	 */
	public RecoveryBytes size() {
		return this.size;
	}

	/**
	 * API name: {@code source_throttle_time}
	 */
	@Nullable
	public JsonValue sourceThrottleTime() {
		return this.sourceThrottleTime;
	}

	/**
	 * API name: {@code source_throttle_time_in_millis}
	 */
	public JsonValue sourceThrottleTimeInMillis() {
		return this.sourceThrottleTimeInMillis;
	}

	/**
	 * API name: {@code target_throttle_time}
	 */
	@Nullable
	public JsonValue targetThrottleTime() {
		return this.targetThrottleTime;
	}

	/**
	 * API name: {@code target_throttle_time_in_millis}
	 */
	public JsonValue targetThrottleTimeInMillis() {
		return this.targetThrottleTimeInMillis;
	}

	/**
	 * API name: {@code total_time_in_millis}
	 */
	public JsonValue totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public JsonValue totalTime() {
		return this.totalTime;
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

		if (this.bytes != null) {

			generator.writeKey("bytes");
			this.bytes.toJsonp(generator, mapper);

		}

		generator.writeKey("files");
		this.files.toJsonp(generator, mapper);

		generator.writeKey("size");
		this.size.toJsonp(generator, mapper);

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
	public static class Builder implements ObjectBuilder<RecoveryIndexStatus> {
		@Nullable
		private RecoveryBytes bytes;

		private RecoveryFiles files;

		private RecoveryBytes size;

		@Nullable
		private JsonValue sourceThrottleTime;

		private JsonValue sourceThrottleTimeInMillis;

		@Nullable
		private JsonValue targetThrottleTime;

		private JsonValue targetThrottleTimeInMillis;

		private JsonValue totalTimeInMillis;

		@Nullable
		private JsonValue totalTime;

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable RecoveryBytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(Function<RecoveryBytes.Builder, ObjectBuilder<RecoveryBytes>> fn) {
			return this.bytes(fn.apply(new RecoveryBytes.Builder()).build());
		}

		/**
		 * API name: {@code files}
		 */
		public Builder files(RecoveryFiles value) {
			this.files = value;
			return this;
		}

		/**
		 * API name: {@code files}
		 */
		public Builder files(Function<RecoveryFiles.Builder, ObjectBuilder<RecoveryFiles>> fn) {
			return this.files(fn.apply(new RecoveryFiles.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(RecoveryBytes value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(Function<RecoveryBytes.Builder, ObjectBuilder<RecoveryBytes>> fn) {
			return this.size(fn.apply(new RecoveryBytes.Builder()).build());
		}

		/**
		 * API name: {@code source_throttle_time}
		 */
		public Builder sourceThrottleTime(@Nullable JsonValue value) {
			this.sourceThrottleTime = value;
			return this;
		}

		/**
		 * API name: {@code source_throttle_time_in_millis}
		 */
		public Builder sourceThrottleTimeInMillis(JsonValue value) {
			this.sourceThrottleTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code target_throttle_time}
		 */
		public Builder targetThrottleTime(@Nullable JsonValue value) {
			this.targetThrottleTime = value;
			return this;
		}

		/**
		 * API name: {@code target_throttle_time_in_millis}
		 */
		public Builder targetThrottleTimeInMillis(JsonValue value) {
			this.targetThrottleTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(JsonValue value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public Builder totalTime(@Nullable JsonValue value) {
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

			return new RecoveryIndexStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RecoveryIndexStatus
	 */
	public static final JsonpValueParser<RecoveryIndexStatus> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RecoveryIndexStatus::setupRecoveryIndexStatusParser);

	protected static void setupRecoveryIndexStatusParser(DelegatingJsonpValueParser<RecoveryIndexStatus.Builder> op) {

		op.add(Builder::bytes, RecoveryBytes.JSONP_PARSER, "bytes");
		op.add(Builder::files, RecoveryFiles.JSONP_PARSER, "files");
		op.add(Builder::size, RecoveryBytes.JSONP_PARSER, "size");
		op.add(Builder::sourceThrottleTime, JsonpValueParser.jsonValueParser(), "source_throttle_time");
		op.add(Builder::sourceThrottleTimeInMillis, JsonpValueParser.jsonValueParser(),
				"source_throttle_time_in_millis");
		op.add(Builder::targetThrottleTime, JsonpValueParser.jsonValueParser(), "target_throttle_time");
		op.add(Builder::targetThrottleTimeInMillis, JsonpValueParser.jsonValueParser(),
				"target_throttle_time_in_millis");
		op.add(Builder::totalTimeInMillis, JsonpValueParser.jsonValueParser(), "total_time_in_millis");
		op.add(Builder::totalTime, JsonpValueParser.jsonValueParser(), "total_time");

	}

}
