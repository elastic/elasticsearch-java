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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.JobBlocked
public final class JobBlocked implements ToJsonp {
	private final JsonValue reason;

	@Nullable
	private final JsonValue taskId;

	// ---------------------------------------------------------------------------------------------

	protected JobBlocked(Builder builder) {

		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.taskId = builder.taskId;

	}

	/**
	 * API name: {@code reason}
	 */
	public JsonValue reason() {
		return this.reason;
	}

	/**
	 * API name: {@code task_id}
	 */
	@Nullable
	public JsonValue taskId() {
		return this.taskId;
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

		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.taskId != null) {

			generator.writeKey("task_id");
			generator.write(this.taskId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobBlocked}.
	 */
	public static class Builder implements ObjectBuilder<JobBlocked> {
		private JsonValue reason;

		@Nullable
		private JsonValue taskId;

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(JsonValue value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code task_id}
		 */
		public Builder taskId(@Nullable JsonValue value) {
			this.taskId = value;
			return this;
		}

		/**
		 * Builds a {@link JobBlocked}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobBlocked build() {

			return new JobBlocked(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for JobBlocked
	 */
	public static final JsonpDeserializer<JobBlocked> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, JobBlocked::setupJobBlockedDeserializer);

	protected static void setupJobBlockedDeserializer(DelegatingDeserializer<JobBlocked.Builder> op) {

		op.add(Builder::reason, JsonpDeserializer.jsonValueDeserializer(), "reason");
		op.add(Builder::taskId, JsonpDeserializer.jsonValueDeserializer(), "task_id");

	}

}
