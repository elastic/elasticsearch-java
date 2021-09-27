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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher._types.ExecutionThreadPool
@JsonpDeserializable
public final class ExecutionThreadPool implements JsonpSerializable {
	private final Long maxSize;

	private final Long queueSize;

	// ---------------------------------------------------------------------------------------------

	public ExecutionThreadPool(Builder builder) {

		this.maxSize = Objects.requireNonNull(builder.maxSize, "max_size");
		this.queueSize = Objects.requireNonNull(builder.queueSize, "queue_size");

	}

	/**
	 * API name: {@code max_size}
	 */
	public Long maxSize() {
		return this.maxSize;
	}

	/**
	 * API name: {@code queue_size}
	 */
	public Long queueSize() {
		return this.queueSize;
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

		generator.writeKey("max_size");
		generator.write(this.maxSize);

		generator.writeKey("queue_size");
		generator.write(this.queueSize);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionThreadPool}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionThreadPool> {
		private Long maxSize;

		private Long queueSize;

		/**
		 * API name: {@code max_size}
		 */
		public Builder maxSize(Long value) {
			this.maxSize = value;
			return this;
		}

		/**
		 * API name: {@code queue_size}
		 */
		public Builder queueSize(Long value) {
			this.queueSize = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutionThreadPool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionThreadPool build() {

			return new ExecutionThreadPool(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionThreadPool}
	 */
	public static final JsonpDeserializer<ExecutionThreadPool> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionThreadPool::setupExecutionThreadPoolDeserializer, Builder::build);

	protected static void setupExecutionThreadPoolDeserializer(DelegatingDeserializer<ExecutionThreadPool.Builder> op) {

		op.add(Builder::maxSize, JsonpDeserializer.longDeserializer(), "max_size");
		op.add(Builder::queueSize, JsonpDeserializer.longDeserializer(), "queue_size");

	}

}
