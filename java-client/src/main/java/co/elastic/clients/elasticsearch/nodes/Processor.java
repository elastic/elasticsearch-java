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

// typedef: nodes._types.Processor

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Processor">API
 *      specification</a>
 */
@JsonpDeserializable
public class Processor implements JsonpSerializable {
	@Nullable
	private final Long count;

	@Nullable
	private final Long current;

	@Nullable
	private final Long failed;

	@Nullable
	private final Long timeInMillis;

	// ---------------------------------------------------------------------------------------------

	private Processor(Builder builder) {

		this.count = builder.count;
		this.current = builder.current;
		this.failed = builder.failed;
		this.timeInMillis = builder.timeInMillis;

	}

	public static Processor of(Function<Builder, ObjectBuilder<Processor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * API name: {@code current}
	 */
	@Nullable
	public final Long current() {
		return this.current;
	}

	/**
	 * API name: {@code failed}
	 */
	@Nullable
	public final Long failed() {
		return this.failed;
	}

	/**
	 * API name: {@code time_in_millis}
	 */
	@Nullable
	public final Long timeInMillis() {
		return this.timeInMillis;
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.current != null) {
			generator.writeKey("current");
			generator.write(this.current);

		}
		if (this.failed != null) {
			generator.writeKey("failed");
			generator.write(this.failed);

		}
		if (this.timeInMillis != null) {
			generator.writeKey("time_in_millis");
			generator.write(this.timeInMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Processor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Processor> {
		@Nullable
		private Long count;

		@Nullable
		private Long current;

		@Nullable
		private Long failed;

		@Nullable
		private Long timeInMillis;

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code current}
		 */
		public final Builder current(@Nullable Long value) {
			this.current = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public final Builder failed(@Nullable Long value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code time_in_millis}
		 */
		public final Builder timeInMillis(@Nullable Long value) {
			this.timeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Processor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Processor build() {
			_checkSingleUse();

			return new Processor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Processor}
	 */
	public static final JsonpDeserializer<Processor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Processor::setupProcessorDeserializer);

	protected static void setupProcessorDeserializer(ObjectDeserializer<Processor.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::current, JsonpDeserializer.longDeserializer(), "current");
		op.add(Builder::failed, JsonpDeserializer.longDeserializer(), "failed");
		op.add(Builder::timeInMillis, JsonpDeserializer.longDeserializer(), "time_in_millis");

	}

}
