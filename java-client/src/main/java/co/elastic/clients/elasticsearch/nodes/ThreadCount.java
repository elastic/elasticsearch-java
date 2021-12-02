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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes._types.ThreadCount

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/nodes/_types/Stats.ts#L212-L219">API
 *      specification</a>
 */
@JsonpDeserializable
public class ThreadCount implements JsonpSerializable {
	private final long active;

	private final long completed;

	private final long largest;

	private final long queue;

	private final long rejected;

	private final long threads;

	// ---------------------------------------------------------------------------------------------

	private ThreadCount(Builder builder) {

		this.active = ApiTypeHelper.requireNonNull(builder.active, this, "active");
		this.completed = ApiTypeHelper.requireNonNull(builder.completed, this, "completed");
		this.largest = ApiTypeHelper.requireNonNull(builder.largest, this, "largest");
		this.queue = ApiTypeHelper.requireNonNull(builder.queue, this, "queue");
		this.rejected = ApiTypeHelper.requireNonNull(builder.rejected, this, "rejected");
		this.threads = ApiTypeHelper.requireNonNull(builder.threads, this, "threads");

	}

	public static ThreadCount of(Function<Builder, ObjectBuilder<ThreadCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code active}
	 */
	public final long active() {
		return this.active;
	}

	/**
	 * Required - API name: {@code completed}
	 */
	public final long completed() {
		return this.completed;
	}

	/**
	 * Required - API name: {@code largest}
	 */
	public final long largest() {
		return this.largest;
	}

	/**
	 * Required - API name: {@code queue}
	 */
	public final long queue() {
		return this.queue;
	}

	/**
	 * Required - API name: {@code rejected}
	 */
	public final long rejected() {
		return this.rejected;
	}

	/**
	 * Required - API name: {@code threads}
	 */
	public final long threads() {
		return this.threads;
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

		generator.writeKey("active");
		generator.write(this.active);

		generator.writeKey("completed");
		generator.write(this.completed);

		generator.writeKey("largest");
		generator.write(this.largest);

		generator.writeKey("queue");
		generator.write(this.queue);

		generator.writeKey("rejected");
		generator.write(this.rejected);

		generator.writeKey("threads");
		generator.write(this.threads);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadCount}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ThreadCount> {
		private Long active;

		private Long completed;

		private Long largest;

		private Long queue;

		private Long rejected;

		private Long threads;

		/**
		 * Required - API name: {@code active}
		 */
		public final Builder active(long value) {
			this.active = value;
			return this;
		}

		/**
		 * Required - API name: {@code completed}
		 */
		public final Builder completed(long value) {
			this.completed = value;
			return this;
		}

		/**
		 * Required - API name: {@code largest}
		 */
		public final Builder largest(long value) {
			this.largest = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue}
		 */
		public final Builder queue(long value) {
			this.queue = value;
			return this;
		}

		/**
		 * Required - API name: {@code rejected}
		 */
		public final Builder rejected(long value) {
			this.rejected = value;
			return this;
		}

		/**
		 * Required - API name: {@code threads}
		 */
		public final Builder threads(long value) {
			this.threads = value;
			return this;
		}

		/**
		 * Builds a {@link ThreadCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadCount build() {
			_checkSingleUse();

			return new ThreadCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ThreadCount}
	 */
	public static final JsonpDeserializer<ThreadCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ThreadCount::setupThreadCountDeserializer);

	protected static void setupThreadCountDeserializer(ObjectDeserializer<ThreadCount.Builder> op) {

		op.add(Builder::active, JsonpDeserializer.longDeserializer(), "active");
		op.add(Builder::completed, JsonpDeserializer.longDeserializer(), "completed");
		op.add(Builder::largest, JsonpDeserializer.longDeserializer(), "largest");
		op.add(Builder::queue, JsonpDeserializer.longDeserializer(), "queue");
		op.add(Builder::rejected, JsonpDeserializer.longDeserializer(), "rejected");
		op.add(Builder::threads, JsonpDeserializer.longDeserializer(), "threads");

	}

}
