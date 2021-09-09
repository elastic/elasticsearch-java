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

package co.elastic.clients.elasticsearch.rollup.delete_job;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: rollup.delete_job.TaskFailureReason
public final class TaskFailureReason implements ToJsonp {
	private final String type;

	private final String reason;

	// ---------------------------------------------------------------------------------------------

	protected TaskFailureReason(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");
		this.reason = Objects.requireNonNull(builder.reason, "reason");

	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("reason");
		generator.write(this.reason);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskFailureReason}.
	 */
	public static class Builder implements ObjectBuilder<TaskFailureReason> {
		private String type;

		private String reason;

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Builds a {@link TaskFailureReason}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskFailureReason build() {

			return new TaskFailureReason(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TaskFailureReason
	 */
	public static final JsonpDeserializer<TaskFailureReason> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TaskFailureReason::setupTaskFailureReasonDeserializer);

	protected static void setupTaskFailureReasonDeserializer(DelegatingDeserializer<TaskFailureReason.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");

	}

}
