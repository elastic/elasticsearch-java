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

// typedef: indices.recovery.VerifyIndex
public final class VerifyIndex implements ToJsonp {
	@Nullable
	private final JsonValue checkIndexTime;

	private final JsonValue checkIndexTimeInMillis;

	@Nullable
	private final JsonValue totalTime;

	private final JsonValue totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected VerifyIndex(Builder builder) {

		this.checkIndexTime = builder.checkIndexTime;
		this.checkIndexTimeInMillis = Objects.requireNonNull(builder.checkIndexTimeInMillis,
				"check_index_time_in_millis");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	/**
	 * API name: {@code check_index_time}
	 */
	@Nullable
	public JsonValue checkIndexTime() {
		return this.checkIndexTime;
	}

	/**
	 * API name: {@code check_index_time_in_millis}
	 */
	public JsonValue checkIndexTimeInMillis() {
		return this.checkIndexTimeInMillis;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public JsonValue totalTime() {
		return this.totalTime;
	}

	/**
	 * API name: {@code total_time_in_millis}
	 */
	public JsonValue totalTimeInMillis() {
		return this.totalTimeInMillis;
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

		if (this.checkIndexTime != null) {

			generator.writeKey("check_index_time");
			generator.write(this.checkIndexTime);

		}

		generator.writeKey("check_index_time_in_millis");
		generator.write(this.checkIndexTimeInMillis);

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VerifyIndex}.
	 */
	public static class Builder implements ObjectBuilder<VerifyIndex> {
		@Nullable
		private JsonValue checkIndexTime;

		private JsonValue checkIndexTimeInMillis;

		@Nullable
		private JsonValue totalTime;

		private JsonValue totalTimeInMillis;

		/**
		 * API name: {@code check_index_time}
		 */
		public Builder checkIndexTime(@Nullable JsonValue value) {
			this.checkIndexTime = value;
			return this;
		}

		/**
		 * API name: {@code check_index_time_in_millis}
		 */
		public Builder checkIndexTimeInMillis(JsonValue value) {
			this.checkIndexTimeInMillis = value;
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
		 * API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(JsonValue value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link VerifyIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VerifyIndex build() {

			return new VerifyIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for VerifyIndex
	 */
	public static final JsonpDeserializer<VerifyIndex> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, VerifyIndex::setupVerifyIndexDeserializer);

	protected static void setupVerifyIndexDeserializer(DelegatingDeserializer<VerifyIndex.Builder> op) {

		op.add(Builder::checkIndexTime, JsonpDeserializer.jsonValueDeserializer(), "check_index_time");
		op.add(Builder::checkIndexTimeInMillis, JsonpDeserializer.jsonValueDeserializer(),
				"check_index_time_in_millis");
		op.add(Builder::totalTime, JsonpDeserializer.jsonValueDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.jsonValueDeserializer(), "total_time_in_millis");

	}

}
