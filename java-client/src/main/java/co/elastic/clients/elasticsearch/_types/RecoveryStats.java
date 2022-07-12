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

package co.elastic.clients.elasticsearch._types;

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

// typedef: _types.RecoveryStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RecoveryStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoveryStats implements JsonpSerializable {
	private final long currentAsSource;

	private final long currentAsTarget;

	@Nullable
	private final Time throttleTime;

	private final long throttleTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private RecoveryStats(Builder builder) {

		this.currentAsSource = ApiTypeHelper.requireNonNull(builder.currentAsSource, this, "currentAsSource");
		this.currentAsTarget = ApiTypeHelper.requireNonNull(builder.currentAsTarget, this, "currentAsTarget");
		this.throttleTime = builder.throttleTime;
		this.throttleTimeInMillis = ApiTypeHelper.requireNonNull(builder.throttleTimeInMillis, this,
				"throttleTimeInMillis");

	}

	public static RecoveryStats of(Function<Builder, ObjectBuilder<RecoveryStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code current_as_source}
	 */
	public final long currentAsSource() {
		return this.currentAsSource;
	}

	/**
	 * Required - API name: {@code current_as_target}
	 */
	public final long currentAsTarget() {
		return this.currentAsTarget;
	}

	/**
	 * API name: {@code throttle_time}
	 */
	@Nullable
	public final Time throttleTime() {
		return this.throttleTime;
	}

	/**
	 * Required - API name: {@code throttle_time_in_millis}
	 */
	public final long throttleTimeInMillis() {
		return this.throttleTimeInMillis;
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

		generator.writeKey("current_as_source");
		generator.write(this.currentAsSource);

		generator.writeKey("current_as_target");
		generator.write(this.currentAsTarget);

		if (this.throttleTime != null) {
			generator.writeKey("throttle_time");
			this.throttleTime.serialize(generator, mapper);

		}
		generator.writeKey("throttle_time_in_millis");
		generator.write(this.throttleTimeInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RecoveryStats> {
		private Long currentAsSource;

		private Long currentAsTarget;

		@Nullable
		private Time throttleTime;

		private Long throttleTimeInMillis;

		/**
		 * Required - API name: {@code current_as_source}
		 */
		public final Builder currentAsSource(long value) {
			this.currentAsSource = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_as_target}
		 */
		public final Builder currentAsTarget(long value) {
			this.currentAsTarget = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time}
		 */
		public final Builder throttleTime(@Nullable Time value) {
			this.throttleTime = value;
			return this;
		}

		/**
		 * API name: {@code throttle_time}
		 */
		public final Builder throttleTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttleTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code throttle_time_in_millis}
		 */
		public final Builder throttleTimeInMillis(long value) {
			this.throttleTimeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryStats build() {
			_checkSingleUse();

			return new RecoveryStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RecoveryStats}
	 */
	public static final JsonpDeserializer<RecoveryStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryStats::setupRecoveryStatsDeserializer);

	protected static void setupRecoveryStatsDeserializer(ObjectDeserializer<RecoveryStats.Builder> op) {

		op.add(Builder::currentAsSource, JsonpDeserializer.longDeserializer(), "current_as_source");
		op.add(Builder::currentAsTarget, JsonpDeserializer.longDeserializer(), "current_as_target");
		op.add(Builder::throttleTime, Time._DESERIALIZER, "throttle_time");
		op.add(Builder::throttleTimeInMillis, JsonpDeserializer.longDeserializer(), "throttle_time_in_millis");

	}

}
