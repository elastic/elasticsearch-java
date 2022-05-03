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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.ThreadCount

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.ThreadCount">API
 *      specification</a>
 */
@JsonpDeserializable
public class ThreadCount implements JsonpSerializable {
	@Nullable
	private final Long active;

	@Nullable
	private final Long completed;

	@Nullable
	private final Long largest;

	@Nullable
	private final Long queue;

	@Nullable
	private final Long rejected;

	@Nullable
	private final Long threads;

	// ---------------------------------------------------------------------------------------------

	private ThreadCount(Builder builder) {

		this.active = builder.active;
		this.completed = builder.completed;
		this.largest = builder.largest;
		this.queue = builder.queue;
		this.rejected = builder.rejected;
		this.threads = builder.threads;

	}

	public static ThreadCount of(Function<Builder, ObjectBuilder<ThreadCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code active}
	 */
	@Nullable
	public final Long active() {
		return this.active;
	}

	/**
	 * API name: {@code completed}
	 */
	@Nullable
	public final Long completed() {
		return this.completed;
	}

	/**
	 * API name: {@code largest}
	 */
	@Nullable
	public final Long largest() {
		return this.largest;
	}

	/**
	 * API name: {@code queue}
	 */
	@Nullable
	public final Long queue() {
		return this.queue;
	}

	/**
	 * API name: {@code rejected}
	 */
	@Nullable
	public final Long rejected() {
		return this.rejected;
	}

	/**
	 * API name: {@code threads}
	 */
	@Nullable
	public final Long threads() {
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

		if (this.active != null) {
			generator.writeKey("active");
			generator.write(this.active);

		}
		if (this.completed != null) {
			generator.writeKey("completed");
			generator.write(this.completed);

		}
		if (this.largest != null) {
			generator.writeKey("largest");
			generator.write(this.largest);

		}
		if (this.queue != null) {
			generator.writeKey("queue");
			generator.write(this.queue);

		}
		if (this.rejected != null) {
			generator.writeKey("rejected");
			generator.write(this.rejected);

		}
		if (this.threads != null) {
			generator.writeKey("threads");
			generator.write(this.threads);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadCount}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ThreadCount> {
		@Nullable
		private Long active;

		@Nullable
		private Long completed;

		@Nullable
		private Long largest;

		@Nullable
		private Long queue;

		@Nullable
		private Long rejected;

		@Nullable
		private Long threads;

		/**
		 * API name: {@code active}
		 */
		public final Builder active(@Nullable Long value) {
			this.active = value;
			return this;
		}

		/**
		 * API name: {@code completed}
		 */
		public final Builder completed(@Nullable Long value) {
			this.completed = value;
			return this;
		}

		/**
		 * API name: {@code largest}
		 */
		public final Builder largest(@Nullable Long value) {
			this.largest = value;
			return this;
		}

		/**
		 * API name: {@code queue}
		 */
		public final Builder queue(@Nullable Long value) {
			this.queue = value;
			return this;
		}

		/**
		 * API name: {@code rejected}
		 */
		public final Builder rejected(@Nullable Long value) {
			this.rejected = value;
			return this;
		}

		/**
		 * API name: {@code threads}
		 */
		public final Builder threads(@Nullable Long value) {
			this.threads = value;
			return this;
		}

		@Override
		protected Builder self() {
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
