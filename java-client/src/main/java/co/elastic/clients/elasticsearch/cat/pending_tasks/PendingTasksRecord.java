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

package co.elastic.clients.elasticsearch.cat.pending_tasks;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cat.pending_tasks.PendingTasksRecord
@JsonpDeserializable
public final class PendingTasksRecord implements JsonpSerializable {
	@Nullable
	private final String insertorder;

	@Nullable
	private final String timeinqueue;

	@Nullable
	private final String priority;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	public PendingTasksRecord(Builder builder) {

		this.insertorder = builder.insertorder;
		this.timeinqueue = builder.timeinqueue;
		this.priority = builder.priority;
		this.source = builder.source;

	}

	/**
	 * task insertion order
	 * <p>
	 * API name: {@code insertOrder}
	 */
	@Nullable
	public String insertorder() {
		return this.insertorder;
	}

	/**
	 * how long task has been in queue
	 * <p>
	 * API name: {@code timeInQueue}
	 */
	@Nullable
	public String timeinqueue() {
		return this.timeinqueue;
	}

	/**
	 * task priority
	 * <p>
	 * API name: {@code priority}
	 */
	@Nullable
	public String priority() {
		return this.priority;
	}

	/**
	 * task source
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public String source() {
		return this.source;
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

		if (this.insertorder != null) {

			generator.writeKey("insertOrder");
			generator.write(this.insertorder);

		}
		if (this.timeinqueue != null) {

			generator.writeKey("timeInQueue");
			generator.write(this.timeinqueue);

		}
		if (this.priority != null) {

			generator.writeKey("priority");
			generator.write(this.priority);

		}
		if (this.source != null) {

			generator.writeKey("source");
			generator.write(this.source);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTasksRecord}.
	 */
	public static class Builder implements ObjectBuilder<PendingTasksRecord> {
		@Nullable
		private String insertorder;

		@Nullable
		private String timeinqueue;

		@Nullable
		private String priority;

		@Nullable
		private String source;

		/**
		 * task insertion order
		 * <p>
		 * API name: {@code insertOrder}
		 */
		public Builder insertorder(@Nullable String value) {
			this.insertorder = value;
			return this;
		}

		/**
		 * how long task has been in queue
		 * <p>
		 * API name: {@code timeInQueue}
		 */
		public Builder timeinqueue(@Nullable String value) {
			this.timeinqueue = value;
			return this;
		}

		/**
		 * task priority
		 * <p>
		 * API name: {@code priority}
		 */
		public Builder priority(@Nullable String value) {
			this.priority = value;
			return this;
		}

		/**
		 * task source
		 * <p>
		 * API name: {@code source}
		 */
		public Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link PendingTasksRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTasksRecord build() {

			return new PendingTasksRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PendingTasksRecord}
	 */
	public static final JsonpDeserializer<PendingTasksRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PendingTasksRecord::setupPendingTasksRecordDeserializer, Builder::build);

	protected static void setupPendingTasksRecordDeserializer(DelegatingDeserializer<PendingTasksRecord.Builder> op) {

		op.add(Builder::insertorder, JsonpDeserializer.stringDeserializer(), "insertOrder", "o");
		op.add(Builder::timeinqueue, JsonpDeserializer.stringDeserializer(), "timeInQueue", "t");
		op.add(Builder::priority, JsonpDeserializer.stringDeserializer(), "priority", "p");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source", "s");

	}

}
