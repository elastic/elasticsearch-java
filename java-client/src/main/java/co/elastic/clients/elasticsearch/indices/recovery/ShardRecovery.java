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

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.ShardRecovery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.recovery.ShardRecovery">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardRecovery implements JsonpSerializable {
	private final long id;

	private final RecoveryIndexStatus index;

	private final boolean primary;

	private final RecoveryOrigin source;

	private final String stage;

	@Nullable
	private final RecoveryStartStatus start;

	@Nullable
	private final DateTime startTime;

	private final long startTimeInMillis;

	@Nullable
	private final DateTime stopTime;

	@Nullable
	private final Long stopTimeInMillis;

	private final RecoveryOrigin target;

	@Nullable
	private final Time totalTime;

	private final long totalTimeInMillis;

	private final TranslogStatus translog;

	private final String type;

	private final VerifyIndex verifyIndex;

	// ---------------------------------------------------------------------------------------------

	private ShardRecovery(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.primary = ApiTypeHelper.requireNonNull(builder.primary, this, "primary");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.stage = ApiTypeHelper.requireNonNull(builder.stage, this, "stage");
		this.start = builder.start;
		this.startTime = builder.startTime;
		this.startTimeInMillis = ApiTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis");
		this.stopTime = builder.stopTime;
		this.stopTimeInMillis = builder.stopTimeInMillis;
		this.target = ApiTypeHelper.requireNonNull(builder.target, this, "target");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = ApiTypeHelper.requireNonNull(builder.totalTimeInMillis, this, "totalTimeInMillis");
		this.translog = ApiTypeHelper.requireNonNull(builder.translog, this, "translog");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.verifyIndex = ApiTypeHelper.requireNonNull(builder.verifyIndex, this, "verifyIndex");

	}

	public static ShardRecovery of(Function<Builder, ObjectBuilder<ShardRecovery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final long id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final RecoveryIndexStatus index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code primary}
	 */
	public final boolean primary() {
		return this.primary;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final RecoveryOrigin source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code stage}
	 */
	public final String stage() {
		return this.stage;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public final RecoveryStartStatus start() {
		return this.start;
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * Required - API name: {@code start_time_in_millis}
	 */
	public final long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code stop_time}
	 */
	@Nullable
	public final DateTime stopTime() {
		return this.stopTime;
	}

	/**
	 * API name: {@code stop_time_in_millis}
	 */
	@Nullable
	public final Long stopTimeInMillis() {
		return this.stopTimeInMillis;
	}

	/**
	 * Required - API name: {@code target}
	 */
	public final RecoveryOrigin target() {
		return this.target;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public final Time totalTime() {
		return this.totalTime;
	}

	/**
	 * Required - API name: {@code total_time_in_millis}
	 */
	public final long totalTimeInMillis() {
		return this.totalTimeInMillis;
	}

	/**
	 * Required - API name: {@code translog}
	 */
	public final TranslogStatus translog() {
		return this.translog;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code verify_index}
	 */
	public final VerifyIndex verifyIndex() {
		return this.verifyIndex;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
		this.index.serialize(generator, mapper);

		generator.writeKey("primary");
		generator.write(this.primary);

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		generator.writeKey("stage");
		generator.write(this.stage);

		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);

		}
		if (this.startTime != null) {
			generator.writeKey("start_time");
			this.startTime.serialize(generator, mapper);
		}
		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		if (this.stopTime != null) {
			generator.writeKey("stop_time");
			this.stopTime.serialize(generator, mapper);
		}
		if (this.stopTimeInMillis != null) {
			generator.writeKey("stop_time_in_millis");
			generator.write(this.stopTimeInMillis);

		}
		generator.writeKey("target");
		this.target.serialize(generator, mapper);

		if (this.totalTime != null) {
			generator.writeKey("total_time");
			this.totalTime.serialize(generator, mapper);

		}
		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

		generator.writeKey("translog");
		this.translog.serialize(generator, mapper);

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("verify_index");
		this.verifyIndex.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardRecovery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardRecovery> {
		private Long id;

		private RecoveryIndexStatus index;

		private Boolean primary;

		private RecoveryOrigin source;

		private String stage;

		@Nullable
		private RecoveryStartStatus start;

		@Nullable
		private DateTime startTime;

		private Long startTimeInMillis;

		@Nullable
		private DateTime stopTime;

		@Nullable
		private Long stopTimeInMillis;

		private RecoveryOrigin target;

		@Nullable
		private Time totalTime;

		private Long totalTimeInMillis;

		private TranslogStatus translog;

		private String type;

		private VerifyIndex verifyIndex;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(long value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(RecoveryIndexStatus value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(Function<RecoveryIndexStatus.Builder, ObjectBuilder<RecoveryIndexStatus>> fn) {
			return this.index(fn.apply(new RecoveryIndexStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code primary}
		 */
		public final Builder primary(boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(RecoveryOrigin value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(Function<RecoveryOrigin.Builder, ObjectBuilder<RecoveryOrigin>> fn) {
			return this.source(fn.apply(new RecoveryOrigin.Builder()).build());
		}

		/**
		 * Required - API name: {@code stage}
		 */
		public final Builder stage(String value) {
			this.stage = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable RecoveryStartStatus value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public final Builder start(Function<RecoveryStartStatus.Builder, ObjectBuilder<RecoveryStartStatus>> fn) {
			return this.start(fn.apply(new RecoveryStartStatus.Builder()).build());
		}

		/**
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable DateTime value) {
			this.startTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code stop_time}
		 */
		public final Builder stopTime(@Nullable DateTime value) {
			this.stopTime = value;
			return this;
		}

		/**
		 * API name: {@code stop_time_in_millis}
		 */
		public final Builder stopTimeInMillis(@Nullable Long value) {
			this.stopTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code target}
		 */
		public final Builder target(RecoveryOrigin value) {
			this.target = value;
			return this;
		}

		/**
		 * Required - API name: {@code target}
		 */
		public final Builder target(Function<RecoveryOrigin.Builder, ObjectBuilder<RecoveryOrigin>> fn) {
			return this.target(fn.apply(new RecoveryOrigin.Builder()).build());
		}

		/**
		 * API name: {@code total_time}
		 */
		public final Builder totalTime(@Nullable Time value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public final Builder totalTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code total_time_in_millis}
		 */
		public final Builder totalTimeInMillis(long value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code translog}
		 */
		public final Builder translog(TranslogStatus value) {
			this.translog = value;
			return this;
		}

		/**
		 * Required - API name: {@code translog}
		 */
		public final Builder translog(Function<TranslogStatus.Builder, ObjectBuilder<TranslogStatus>> fn) {
			return this.translog(fn.apply(new TranslogStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code verify_index}
		 */
		public final Builder verifyIndex(VerifyIndex value) {
			this.verifyIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code verify_index}
		 */
		public final Builder verifyIndex(Function<VerifyIndex.Builder, ObjectBuilder<VerifyIndex>> fn) {
			return this.verifyIndex(fn.apply(new VerifyIndex.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardRecovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardRecovery build() {
			_checkSingleUse();

			return new ShardRecovery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardRecovery}
	 */
	public static final JsonpDeserializer<ShardRecovery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardRecovery::setupShardRecoveryDeserializer);

	protected static void setupShardRecoveryDeserializer(ObjectDeserializer<ShardRecovery.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::index, RecoveryIndexStatus._DESERIALIZER, "index");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::source, RecoveryOrigin._DESERIALIZER, "source");
		op.add(Builder::stage, JsonpDeserializer.stringDeserializer(), "stage");
		op.add(Builder::start, RecoveryStartStatus._DESERIALIZER, "start");
		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::stopTime, DateTime._DESERIALIZER, "stop_time");
		op.add(Builder::stopTimeInMillis, JsonpDeserializer.longDeserializer(), "stop_time_in_millis");
		op.add(Builder::target, RecoveryOrigin._DESERIALIZER, "target");
		op.add(Builder::totalTime, Time._DESERIALIZER, "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.longDeserializer(), "total_time_in_millis");
		op.add(Builder::translog, TranslogStatus._DESERIALIZER, "translog");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::verifyIndex, VerifyIndex._DESERIALIZER, "verify_index");

	}

}
