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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: watcher._types.ExecutionThreadPool
@JsonpDeserializable
public class ExecutionThreadPool implements JsonpSerializable {
	private final long maxSize;

	private final long queueSize;

	// ---------------------------------------------------------------------------------------------

	private ExecutionThreadPool(Builder builder) {

		this.maxSize = ModelTypeHelper.requireNonNull(builder.maxSize, this, "maxSize");
		this.queueSize = ModelTypeHelper.requireNonNull(builder.queueSize, this, "queueSize");

	}

	public static ExecutionThreadPool of(Function<Builder, ObjectBuilder<ExecutionThreadPool>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max_size}
	 */
	public final long maxSize() {
		return this.maxSize;
	}

	/**
	 * Required - API name: {@code queue_size}
	 */
	public final long queueSize() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExecutionThreadPool> {
		private Long maxSize;

		private Long queueSize;

		/**
		 * Required - API name: {@code max_size}
		 */
		public final Builder maxSize(long value) {
			this.maxSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue_size}
		 */
		public final Builder queueSize(long value) {
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
			_checkSingleUse();

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
