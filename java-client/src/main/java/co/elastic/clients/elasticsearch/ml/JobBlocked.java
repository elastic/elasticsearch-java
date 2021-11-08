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

// typedef: ml._types.JobBlocked
@JsonpDeserializable
public class JobBlocked implements JsonpSerializable {
	private final JobBlockedReason reason;

	@Nullable
	private final String taskId;

	// ---------------------------------------------------------------------------------------------

	private JobBlocked(Builder builder) {

		this.reason = ModelTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.taskId = builder.taskId;

	}

	public static JobBlocked of(Function<Builder, ObjectBuilder<JobBlocked>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final JobBlockedReason reason() {
		return this.reason;
	}

	/**
	 * API name: {@code task_id}
	 */
	@Nullable
	public final String taskId() {
		return this.taskId;
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

		generator.writeKey("reason");
		this.reason.serialize(generator, mapper);
		if (this.taskId != null) {
			generator.writeKey("task_id");
			generator.write(this.taskId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobBlocked}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<JobBlocked> {
		private JobBlockedReason reason;

		@Nullable
		private String taskId;

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(JobBlockedReason value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code task_id}
		 */
		public final Builder taskId(@Nullable String value) {
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
			_checkSingleUse();

			return new JobBlocked(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobBlocked}
	 */
	public static final JsonpDeserializer<JobBlocked> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JobBlocked::setupJobBlockedDeserializer, Builder::build);

	protected static void setupJobBlockedDeserializer(DelegatingDeserializer<JobBlocked.Builder> op) {

		op.add(Builder::reason, JobBlockedReason._DESERIALIZER, "reason");
		op.add(Builder::taskId, JsonpDeserializer.stringDeserializer(), "task_id");

	}

}
