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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.ShardRecovery
public final class ShardRecovery implements ToJsonp {
	private final Number id;

	private final RecoveryIndexStatus index;

	private final Boolean primary;

	private final RecoveryOrigin source;

	private final String stage;

	@Nullable
	private final RecoveryStartStatus start;

	@Nullable
	private final String startTime;

	private final JsonValue startTimeInMillis;

	@Nullable
	private final String stopTime;

	private final JsonValue stopTimeInMillis;

	private final RecoveryOrigin target;

	@Nullable
	private final String totalTime;

	private final JsonValue totalTimeInMillis;

	private final TranslogStatus translog;

	private final String type;

	private final VerifyIndex verifyIndex;

	// ---------------------------------------------------------------------------------------------

	protected ShardRecovery(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.primary = Objects.requireNonNull(builder.primary, "primary");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.stage = Objects.requireNonNull(builder.stage, "stage");
		this.start = builder.start;
		this.startTime = builder.startTime;
		this.startTimeInMillis = Objects.requireNonNull(builder.startTimeInMillis, "start_time_in_millis");
		this.stopTime = builder.stopTime;
		this.stopTimeInMillis = Objects.requireNonNull(builder.stopTimeInMillis, "stop_time_in_millis");
		this.target = Objects.requireNonNull(builder.target, "target");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");
		this.translog = Objects.requireNonNull(builder.translog, "translog");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.verifyIndex = Objects.requireNonNull(builder.verifyIndex, "verify_index");

	}

	/**
	 * API name: {@code id}
	 */
	public Number id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	public RecoveryIndexStatus index() {
		return this.index;
	}

	/**
	 * API name: {@code primary}
	 */
	public Boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code source}
	 */
	public RecoveryOrigin source() {
		return this.source;
	}

	/**
	 * API name: {@code stage}
	 */
	public String stage() {
		return this.stage;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public RecoveryStartStatus start() {
		return this.start;
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public String startTime() {
		return this.startTime;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	public JsonValue startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code stop_time}
	 */
	@Nullable
	public String stopTime() {
		return this.stopTime;
	}

	/**
	 * API name: {@code stop_time_in_millis}
	 */
	public JsonValue stopTimeInMillis() {
		return this.stopTimeInMillis;
	}

	/**
	 * API name: {@code target}
	 */
	public RecoveryOrigin target() {
		return this.target;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public String totalTime() {
		return this.totalTime;
	}

	/**
	 * API name: {@code total_time_in_millis}
	 */
	public JsonValue totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * API name: {@code translog}
	 */
	public TranslogStatus translog() {
		return this.translog;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code verify_index}
	 */
	public VerifyIndex verifyIndex() {
		return this.verifyIndex;
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

		generator.writeKey("id");
		generator.write(this.id.doubleValue());

		generator.writeKey("index");
		this.index.toJsonp(generator, mapper);

		generator.writeKey("primary");
		generator.write(this.primary);

		generator.writeKey("source");
		this.source.toJsonp(generator, mapper);

		generator.writeKey("stage");
		generator.write(this.stage);

		if (this.start != null) {

			generator.writeKey("start");
			this.start.toJsonp(generator, mapper);

		}
		if (this.startTime != null) {

			generator.writeKey("start_time");
			generator.write(this.startTime);

		}

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		if (this.stopTime != null) {

			generator.writeKey("stop_time");
			generator.write(this.stopTime);

		}

		generator.writeKey("stop_time_in_millis");
		generator.write(this.stopTimeInMillis);

		generator.writeKey("target");
		this.target.toJsonp(generator, mapper);

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

		generator.writeKey("translog");
		this.translog.toJsonp(generator, mapper);

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("verify_index");
		this.verifyIndex.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardRecovery}.
	 */
	public static class Builder implements ObjectBuilder<ShardRecovery> {
		private Number id;

		private RecoveryIndexStatus index;

		private Boolean primary;

		private RecoveryOrigin source;

		private String stage;

		@Nullable
		private RecoveryStartStatus start;

		@Nullable
		private String startTime;

		private JsonValue startTimeInMillis;

		@Nullable
		private String stopTime;

		private JsonValue stopTimeInMillis;

		private RecoveryOrigin target;

		@Nullable
		private String totalTime;

		private JsonValue totalTimeInMillis;

		private TranslogStatus translog;

		private String type;

		private VerifyIndex verifyIndex;

		/**
		 * API name: {@code id}
		 */
		public Builder id(Number value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(RecoveryIndexStatus value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(Function<RecoveryIndexStatus.Builder, ObjectBuilder<RecoveryIndexStatus>> fn) {
			return this.index(fn.apply(new RecoveryIndexStatus.Builder()).build());
		}

		/**
		 * API name: {@code primary}
		 */
		public Builder primary(Boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(RecoveryOrigin value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Function<RecoveryOrigin.Builder, ObjectBuilder<RecoveryOrigin>> fn) {
			return this.source(fn.apply(new RecoveryOrigin.Builder()).build());
		}

		/**
		 * API name: {@code stage}
		 */
		public Builder stage(String value) {
			this.stage = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable RecoveryStartStatus value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(Function<RecoveryStartStatus.Builder, ObjectBuilder<RecoveryStartStatus>> fn) {
			return this.start(fn.apply(new RecoveryStartStatus.Builder()).build());
		}

		/**
		 * API name: {@code start_time}
		 */
		public Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(JsonValue value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code stop_time}
		 */
		public Builder stopTime(@Nullable String value) {
			this.stopTime = value;
			return this;
		}

		/**
		 * API name: {@code stop_time_in_millis}
		 */
		public Builder stopTimeInMillis(JsonValue value) {
			this.stopTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code target}
		 */
		public Builder target(RecoveryOrigin value) {
			this.target = value;
			return this;
		}

		/**
		 * API name: {@code target}
		 */
		public Builder target(Function<RecoveryOrigin.Builder, ObjectBuilder<RecoveryOrigin>> fn) {
			return this.target(fn.apply(new RecoveryOrigin.Builder()).build());
		}

		/**
		 * API name: {@code total_time}
		 */
		public Builder totalTime(@Nullable String value) {
			this.totalTime = value;
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
		 * API name: {@code translog}
		 */
		public Builder translog(TranslogStatus value) {
			this.translog = value;
			return this;
		}

		/**
		 * API name: {@code translog}
		 */
		public Builder translog(Function<TranslogStatus.Builder, ObjectBuilder<TranslogStatus>> fn) {
			return this.translog(fn.apply(new TranslogStatus.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code verify_index}
		 */
		public Builder verifyIndex(VerifyIndex value) {
			this.verifyIndex = value;
			return this;
		}

		/**
		 * API name: {@code verify_index}
		 */
		public Builder verifyIndex(Function<VerifyIndex.Builder, ObjectBuilder<VerifyIndex>> fn) {
			return this.verifyIndex(fn.apply(new VerifyIndex.Builder()).build());
		}

		/**
		 * Builds a {@link ShardRecovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardRecovery build() {

			return new ShardRecovery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardRecovery
	 */
	public static final JsonpDeserializer<ShardRecovery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardRecovery::setupShardRecoveryDeserializer);

	protected static void setupShardRecoveryDeserializer(DelegatingDeserializer<ShardRecovery.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.numberDeserializer(), "id");
		op.add(Builder::index, RecoveryIndexStatus.DESERIALIZER, "index");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::source, RecoveryOrigin.DESERIALIZER, "source");
		op.add(Builder::stage, JsonpDeserializer.stringDeserializer(), "stage");
		op.add(Builder::start, RecoveryStartStatus.DESERIALIZER, "start");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.jsonValueDeserializer(), "start_time_in_millis");
		op.add(Builder::stopTime, JsonpDeserializer.stringDeserializer(), "stop_time");
		op.add(Builder::stopTimeInMillis, JsonpDeserializer.jsonValueDeserializer(), "stop_time_in_millis");
		op.add(Builder::target, RecoveryOrigin.DESERIALIZER, "target");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.jsonValueDeserializer(), "total_time_in_millis");
		op.add(Builder::translog, TranslogStatus.DESERIALIZER, "translog");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::verifyIndex, VerifyIndex.DESERIALIZER, "verify_index");

	}

}
