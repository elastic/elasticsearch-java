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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.ThreadCount
@JsonpDeserializable
public final class ThreadCount implements JsonpSerializable {
	private final Long active;

	private final Long completed;

	private final Long largest;

	private final Long queue;

	private final Long rejected;

	private final Long threads;

	// ---------------------------------------------------------------------------------------------

	public ThreadCount(Builder builder) {

		this.active = Objects.requireNonNull(builder.active, "active");
		this.completed = Objects.requireNonNull(builder.completed, "completed");
		this.largest = Objects.requireNonNull(builder.largest, "largest");
		this.queue = Objects.requireNonNull(builder.queue, "queue");
		this.rejected = Objects.requireNonNull(builder.rejected, "rejected");
		this.threads = Objects.requireNonNull(builder.threads, "threads");

	}

	/**
	 * API name: {@code active}
	 */
	public Long active() {
		return this.active;
	}

	/**
	 * API name: {@code completed}
	 */
	public Long completed() {
		return this.completed;
	}

	/**
	 * API name: {@code largest}
	 */
	public Long largest() {
		return this.largest;
	}

	/**
	 * API name: {@code queue}
	 */
	public Long queue() {
		return this.queue;
	}

	/**
	 * API name: {@code rejected}
	 */
	public Long rejected() {
		return this.rejected;
	}

	/**
	 * API name: {@code threads}
	 */
	public Long threads() {
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
	public static class Builder implements ObjectBuilder<ThreadCount> {
		private Long active;

		private Long completed;

		private Long largest;

		private Long queue;

		private Long rejected;

		private Long threads;

		/**
		 * API name: {@code active}
		 */
		public Builder active(Long value) {
			this.active = value;
			return this;
		}

		/**
		 * API name: {@code completed}
		 */
		public Builder completed(Long value) {
			this.completed = value;
			return this;
		}

		/**
		 * API name: {@code largest}
		 */
		public Builder largest(Long value) {
			this.largest = value;
			return this;
		}

		/**
		 * API name: {@code queue}
		 */
		public Builder queue(Long value) {
			this.queue = value;
			return this;
		}

		/**
		 * API name: {@code rejected}
		 */
		public Builder rejected(Long value) {
			this.rejected = value;
			return this;
		}

		/**
		 * API name: {@code threads}
		 */
		public Builder threads(Long value) {
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

			return new ThreadCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ThreadCount}
	 */
	public static final JsonpDeserializer<ThreadCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ThreadCount::setupThreadCountDeserializer, Builder::build);

	protected static void setupThreadCountDeserializer(DelegatingDeserializer<ThreadCount.Builder> op) {

		op.add(Builder::active, JsonpDeserializer.longDeserializer(), "active");
		op.add(Builder::completed, JsonpDeserializer.longDeserializer(), "completed");
		op.add(Builder::largest, JsonpDeserializer.longDeserializer(), "largest");
		op.add(Builder::queue, JsonpDeserializer.longDeserializer(), "queue");
		op.add(Builder::rejected, JsonpDeserializer.longDeserializer(), "rejected");
		op.add(Builder::threads, JsonpDeserializer.longDeserializer(), "threads");

	}

}
