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

package co.elastic.clients.elasticsearch.cluster.pending_tasks;

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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.pending_tasks.PendingTask

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.pending_tasks.PendingTask">API
 *      specification</a>
 */
@JsonpDeserializable
public class PendingTask implements JsonpSerializable {
	private final boolean executing;

	private final int insertOrder;

	private final String priority;

	private final String source;

	@Nullable
	private final Time timeInQueue;

	private final long timeInQueueMillis;

	// ---------------------------------------------------------------------------------------------

	private PendingTask(Builder builder) {

		this.executing = ApiTypeHelper.requireNonNull(builder.executing, this, "executing");
		this.insertOrder = ApiTypeHelper.requireNonNull(builder.insertOrder, this, "insertOrder");
		this.priority = ApiTypeHelper.requireNonNull(builder.priority, this, "priority");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.timeInQueue = builder.timeInQueue;
		this.timeInQueueMillis = ApiTypeHelper.requireNonNull(builder.timeInQueueMillis, this, "timeInQueueMillis");

	}

	public static PendingTask of(Function<Builder, ObjectBuilder<PendingTask>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Indicates whether the pending tasks are currently executing or
	 * not.
	 * <p>
	 * API name: {@code executing}
	 */
	public final boolean executing() {
		return this.executing;
	}

	/**
	 * Required - The number that represents when the task has been inserted into
	 * the task queue.
	 * <p>
	 * API name: {@code insert_order}
	 */
	public final int insertOrder() {
		return this.insertOrder;
	}

	/**
	 * Required - The priority of the pending task. The valid priorities in
	 * descending priority order are: <code>IMMEDIATE</code> &gt;
	 * <code>URGENT</code> &gt; <code>HIGH</code> &gt; <code>NORMAL</code> &gt;
	 * <code>LOW</code> &gt; <code>LANGUID</code>.
	 * <p>
	 * API name: {@code priority}
	 */
	public final String priority() {
		return this.priority;
	}

	/**
	 * Required - A general description of the cluster task that may include a
	 * reason and origin.
	 * <p>
	 * API name: {@code source}
	 */
	public final String source() {
		return this.source;
	}

	/**
	 * The time since the task is waiting for being performed.
	 * <p>
	 * API name: {@code time_in_queue}
	 */
	@Nullable
	public final Time timeInQueue() {
		return this.timeInQueue;
	}

	/**
	 * Required - The time expressed in milliseconds since the task is waiting for
	 * being performed.
	 * <p>
	 * API name: {@code time_in_queue_millis}
	 */
	public final long timeInQueueMillis() {
		return this.timeInQueueMillis;
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

		generator.writeKey("executing");
		generator.write(this.executing);

		generator.writeKey("insert_order");
		generator.write(this.insertOrder);

		generator.writeKey("priority");
		generator.write(this.priority);

		generator.writeKey("source");
		generator.write(this.source);

		if (this.timeInQueue != null) {
			generator.writeKey("time_in_queue");
			this.timeInQueue.serialize(generator, mapper);

		}
		generator.writeKey("time_in_queue_millis");
		generator.write(this.timeInQueueMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTask}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PendingTask> {
		private Boolean executing;

		private Integer insertOrder;

		private String priority;

		private String source;

		@Nullable
		private Time timeInQueue;

		private Long timeInQueueMillis;

		/**
		 * Required - Indicates whether the pending tasks are currently executing or
		 * not.
		 * <p>
		 * API name: {@code executing}
		 */
		public final Builder executing(boolean value) {
			this.executing = value;
			return this;
		}

		/**
		 * Required - The number that represents when the task has been inserted into
		 * the task queue.
		 * <p>
		 * API name: {@code insert_order}
		 */
		public final Builder insertOrder(int value) {
			this.insertOrder = value;
			return this;
		}

		/**
		 * Required - The priority of the pending task. The valid priorities in
		 * descending priority order are: <code>IMMEDIATE</code> &gt;
		 * <code>URGENT</code> &gt; <code>HIGH</code> &gt; <code>NORMAL</code> &gt;
		 * <code>LOW</code> &gt; <code>LANGUID</code>.
		 * <p>
		 * API name: {@code priority}
		 */
		public final Builder priority(String value) {
			this.priority = value;
			return this;
		}

		/**
		 * Required - A general description of the cluster task that may include a
		 * reason and origin.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * The time since the task is waiting for being performed.
		 * <p>
		 * API name: {@code time_in_queue}
		 */
		public final Builder timeInQueue(@Nullable Time value) {
			this.timeInQueue = value;
			return this;
		}

		/**
		 * The time since the task is waiting for being performed.
		 * <p>
		 * API name: {@code time_in_queue}
		 */
		public final Builder timeInQueue(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeInQueue(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The time expressed in milliseconds since the task is waiting for
		 * being performed.
		 * <p>
		 * API name: {@code time_in_queue_millis}
		 */
		public final Builder timeInQueueMillis(long value) {
			this.timeInQueueMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PendingTask}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTask build() {
			_checkSingleUse();

			return new PendingTask(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PendingTask}
	 */
	public static final JsonpDeserializer<PendingTask> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PendingTask::setupPendingTaskDeserializer);

	protected static void setupPendingTaskDeserializer(ObjectDeserializer<PendingTask.Builder> op) {

		op.add(Builder::executing, JsonpDeserializer.booleanDeserializer(), "executing");
		op.add(Builder::insertOrder, JsonpDeserializer.integerDeserializer(), "insert_order");
		op.add(Builder::priority, JsonpDeserializer.stringDeserializer(), "priority");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");
		op.add(Builder::timeInQueue, Time._DESERIALIZER, "time_in_queue");
		op.add(Builder::timeInQueueMillis, JsonpDeserializer.longDeserializer(), "time_in_queue_millis");

	}

}
