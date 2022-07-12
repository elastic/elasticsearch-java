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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Recording

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Recording">API
 *      specification</a>
 */
@JsonpDeserializable
public class Recording implements JsonpSerializable {
	@Nullable
	private final String name;

	@Nullable
	private final Long cumulativeExecutionCount;

	@Nullable
	private final Time cumulativeExecutionTime;

	@Nullable
	private final Long cumulativeExecutionTimeMillis;

	// ---------------------------------------------------------------------------------------------

	private Recording(Builder builder) {

		this.name = builder.name;
		this.cumulativeExecutionCount = builder.cumulativeExecutionCount;
		this.cumulativeExecutionTime = builder.cumulativeExecutionTime;
		this.cumulativeExecutionTimeMillis = builder.cumulativeExecutionTimeMillis;

	}

	public static Recording of(Function<Builder, ObjectBuilder<Recording>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code cumulative_execution_count}
	 */
	@Nullable
	public final Long cumulativeExecutionCount() {
		return this.cumulativeExecutionCount;
	}

	/**
	 * API name: {@code cumulative_execution_time}
	 */
	@Nullable
	public final Time cumulativeExecutionTime() {
		return this.cumulativeExecutionTime;
	}

	/**
	 * API name: {@code cumulative_execution_time_millis}
	 */
	@Nullable
	public final Long cumulativeExecutionTimeMillis() {
		return this.cumulativeExecutionTimeMillis;
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

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.cumulativeExecutionCount != null) {
			generator.writeKey("cumulative_execution_count");
			generator.write(this.cumulativeExecutionCount);

		}
		if (this.cumulativeExecutionTime != null) {
			generator.writeKey("cumulative_execution_time");
			this.cumulativeExecutionTime.serialize(generator, mapper);

		}
		if (this.cumulativeExecutionTimeMillis != null) {
			generator.writeKey("cumulative_execution_time_millis");
			generator.write(this.cumulativeExecutionTimeMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Recording}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Recording> {
		@Nullable
		private String name;

		@Nullable
		private Long cumulativeExecutionCount;

		@Nullable
		private Time cumulativeExecutionTime;

		@Nullable
		private Long cumulativeExecutionTimeMillis;

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code cumulative_execution_count}
		 */
		public final Builder cumulativeExecutionCount(@Nullable Long value) {
			this.cumulativeExecutionCount = value;
			return this;
		}

		/**
		 * API name: {@code cumulative_execution_time}
		 */
		public final Builder cumulativeExecutionTime(@Nullable Time value) {
			this.cumulativeExecutionTime = value;
			return this;
		}

		/**
		 * API name: {@code cumulative_execution_time}
		 */
		public final Builder cumulativeExecutionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.cumulativeExecutionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code cumulative_execution_time_millis}
		 */
		public final Builder cumulativeExecutionTimeMillis(@Nullable Long value) {
			this.cumulativeExecutionTimeMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Recording}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Recording build() {
			_checkSingleUse();

			return new Recording(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Recording}
	 */
	public static final JsonpDeserializer<Recording> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Recording::setupRecordingDeserializer);

	protected static void setupRecordingDeserializer(ObjectDeserializer<Recording.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::cumulativeExecutionCount, JsonpDeserializer.longDeserializer(), "cumulative_execution_count");
		op.add(Builder::cumulativeExecutionTime, Time._DESERIALIZER, "cumulative_execution_time");
		op.add(Builder::cumulativeExecutionTimeMillis, JsonpDeserializer.longDeserializer(),
				"cumulative_execution_time_millis");

	}

}
