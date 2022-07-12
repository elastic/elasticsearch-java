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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.RecoveryStartStatus

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.recovery.RecoveryStartStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoveryStartStatus implements JsonpSerializable {
	@Nullable
	private final Time checkIndexTime;

	private final long checkIndexTimeInMillis;

	@Nullable
	private final Time totalTime;

	private final long totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private RecoveryStartStatus(Builder builder) {

		this.checkIndexTime = builder.checkIndexTime;
		this.checkIndexTimeInMillis = ApiTypeHelper.requireNonNull(builder.checkIndexTimeInMillis, this,
				"checkIndexTimeInMillis");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = ApiTypeHelper.requireNonNull(builder.totalTimeInMillis, this, "totalTimeInMillis");

	}

	public static RecoveryStartStatus of(Function<Builder, ObjectBuilder<RecoveryStartStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code check_index_time}
	 */
	@Nullable
	public final Time checkIndexTime() {
		return this.checkIndexTime;
	}

	/**
	 * Required - API name: {@code check_index_time_in_millis}
	 */
	public final long checkIndexTimeInMillis() {
		return this.checkIndexTimeInMillis;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.checkIndexTime != null) {
			generator.writeKey("check_index_time");
			this.checkIndexTime.serialize(generator, mapper);

		}
		generator.writeKey("check_index_time_in_millis");
		generator.write(this.checkIndexTimeInMillis);

		if (this.totalTime != null) {
			generator.writeKey("total_time");
			this.totalTime.serialize(generator, mapper);

		}
		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryStartStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RecoveryStartStatus> {
		@Nullable
		private Time checkIndexTime;

		private Long checkIndexTimeInMillis;

		@Nullable
		private Time totalTime;

		private Long totalTimeInMillis;

		/**
		 * API name: {@code check_index_time}
		 */
		public final Builder checkIndexTime(@Nullable Time value) {
			this.checkIndexTime = value;
			return this;
		}

		/**
		 * API name: {@code check_index_time}
		 */
		public final Builder checkIndexTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.checkIndexTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code check_index_time_in_millis}
		 */
		public final Builder checkIndexTimeInMillis(long value) {
			this.checkIndexTimeInMillis = value;
			return this;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryStartStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryStartStatus build() {
			_checkSingleUse();

			return new RecoveryStartStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryStartStatus}
	 */
	public static final JsonpDeserializer<RecoveryStartStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RecoveryStartStatus::setupRecoveryStartStatusDeserializer);

	protected static void setupRecoveryStartStatusDeserializer(ObjectDeserializer<RecoveryStartStatus.Builder> op) {

		op.add(Builder::checkIndexTime, Time._DESERIALIZER, "check_index_time");
		op.add(Builder::checkIndexTimeInMillis, JsonpDeserializer.longDeserializer(), "check_index_time_in_millis");
		op.add(Builder::totalTime, Time._DESERIALIZER, "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.longDeserializer(), "total_time_in_millis");

	}

}
