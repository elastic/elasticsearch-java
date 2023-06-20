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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.pending_tasks.PendingTasksRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.pending_tasks.PendingTasksRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class PendingTasksRecord implements JsonpSerializable {
	@Nullable
	private final String insertorder;

	@Nullable
	private final String timeinqueue;

	@Nullable
	private final String priority;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	private PendingTasksRecord(Builder builder) {

		this.insertorder = builder.insertorder;
		this.timeinqueue = builder.timeinqueue;
		this.priority = builder.priority;
		this.source = builder.source;

	}

	public static PendingTasksRecord of(Function<Builder, ObjectBuilder<PendingTasksRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The task insertion order.
	 * <p>
	 * API name: {@code insertOrder}
	 */
	@Nullable
	public final String insertorder() {
		return this.insertorder;
	}

	/**
	 * Indicates how long the task has been in queue.
	 * <p>
	 * API name: {@code timeInQueue}
	 */
	@Nullable
	public final String timeinqueue() {
		return this.timeinqueue;
	}

	/**
	 * The task priority.
	 * <p>
	 * API name: {@code priority}
	 */
	@Nullable
	public final String priority() {
		return this.priority;
	}

	/**
	 * The task source.
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public final String source() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTasksRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PendingTasksRecord> {
		@Nullable
		private String insertorder;

		@Nullable
		private String timeinqueue;

		@Nullable
		private String priority;

		@Nullable
		private String source;

		/**
		 * The task insertion order.
		 * <p>
		 * API name: {@code insertOrder}
		 */
		public final Builder insertorder(@Nullable String value) {
			this.insertorder = value;
			return this;
		}

		/**
		 * Indicates how long the task has been in queue.
		 * <p>
		 * API name: {@code timeInQueue}
		 */
		public final Builder timeinqueue(@Nullable String value) {
			this.timeinqueue = value;
			return this;
		}

		/**
		 * The task priority.
		 * <p>
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable String value) {
			this.priority = value;
			return this;
		}

		/**
		 * The task source.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PendingTasksRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTasksRecord build() {
			_checkSingleUse();

			return new PendingTasksRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PendingTasksRecord}
	 */
	public static final JsonpDeserializer<PendingTasksRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PendingTasksRecord::setupPendingTasksRecordDeserializer);

	protected static void setupPendingTasksRecordDeserializer(ObjectDeserializer<PendingTasksRecord.Builder> op) {

		op.add(Builder::insertorder, JsonpDeserializer.stringDeserializer(), "insertOrder", "o");
		op.add(Builder::timeinqueue, JsonpDeserializer.stringDeserializer(), "timeInQueue", "t");
		op.add(Builder::priority, JsonpDeserializer.stringDeserializer(), "priority", "p");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source", "s");

	}

}
