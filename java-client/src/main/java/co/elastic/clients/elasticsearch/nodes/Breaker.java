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
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.Breaker
@JsonpDeserializable
public final class Breaker implements JsonpSerializable {
	private final String estimatedSize;

	private final Long estimatedSizeInBytes;

	private final String limitSize;

	private final Long limitSizeInBytes;

	private final Float overhead;

	private final Float tripped;

	// ---------------------------------------------------------------------------------------------

	public Breaker(Builder builder) {

		this.estimatedSize = Objects.requireNonNull(builder.estimatedSize, "estimated_size");
		this.estimatedSizeInBytes = Objects.requireNonNull(builder.estimatedSizeInBytes, "estimated_size_in_bytes");
		this.limitSize = Objects.requireNonNull(builder.limitSize, "limit_size");
		this.limitSizeInBytes = Objects.requireNonNull(builder.limitSizeInBytes, "limit_size_in_bytes");
		this.overhead = Objects.requireNonNull(builder.overhead, "overhead");
		this.tripped = Objects.requireNonNull(builder.tripped, "tripped");

	}

	/**
	 * API name: {@code estimated_size}
	 */
	public String estimatedSize() {
		return this.estimatedSize;
	}

	/**
	 * API name: {@code estimated_size_in_bytes}
	 */
	public Long estimatedSizeInBytes() {
		return this.estimatedSizeInBytes;
	}

	/**
	 * API name: {@code limit_size}
	 */
	public String limitSize() {
		return this.limitSize;
	}

	/**
	 * API name: {@code limit_size_in_bytes}
	 */
	public Long limitSizeInBytes() {
		return this.limitSizeInBytes;
	}

	/**
	 * API name: {@code overhead}
	 */
	public Float overhead() {
		return this.overhead;
	}

	/**
	 * API name: {@code tripped}
	 */
	public Float tripped() {
		return this.tripped;
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

		generator.writeKey("estimated_size");
		generator.write(this.estimatedSize);

		generator.writeKey("estimated_size_in_bytes");
		generator.write(this.estimatedSizeInBytes);

		generator.writeKey("limit_size");
		generator.write(this.limitSize);

		generator.writeKey("limit_size_in_bytes");
		generator.write(this.limitSizeInBytes);

		generator.writeKey("overhead");
		generator.write(this.overhead);

		generator.writeKey("tripped");
		generator.write(this.tripped);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Breaker}.
	 */
	public static class Builder implements ObjectBuilder<Breaker> {
		private String estimatedSize;

		private Long estimatedSizeInBytes;

		private String limitSize;

		private Long limitSizeInBytes;

		private Float overhead;

		private Float tripped;

		/**
		 * API name: {@code estimated_size}
		 */
		public Builder estimatedSize(String value) {
			this.estimatedSize = value;
			return this;
		}

		/**
		 * API name: {@code estimated_size_in_bytes}
		 */
		public Builder estimatedSizeInBytes(Long value) {
			this.estimatedSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code limit_size}
		 */
		public Builder limitSize(String value) {
			this.limitSize = value;
			return this;
		}

		/**
		 * API name: {@code limit_size_in_bytes}
		 */
		public Builder limitSizeInBytes(Long value) {
			this.limitSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code overhead}
		 */
		public Builder overhead(Float value) {
			this.overhead = value;
			return this;
		}

		/**
		 * API name: {@code tripped}
		 */
		public Builder tripped(Float value) {
			this.tripped = value;
			return this;
		}

		/**
		 * Builds a {@link Breaker}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Breaker build() {

			return new Breaker(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Breaker}
	 */
	public static final JsonpDeserializer<Breaker> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Breaker::setupBreakerDeserializer, Builder::build);

	protected static void setupBreakerDeserializer(DelegatingDeserializer<Breaker.Builder> op) {

		op.add(Builder::estimatedSize, JsonpDeserializer.stringDeserializer(), "estimated_size");
		op.add(Builder::estimatedSizeInBytes, JsonpDeserializer.longDeserializer(), "estimated_size_in_bytes");
		op.add(Builder::limitSize, JsonpDeserializer.stringDeserializer(), "limit_size");
		op.add(Builder::limitSizeInBytes, JsonpDeserializer.longDeserializer(), "limit_size_in_bytes");
		op.add(Builder::overhead, JsonpDeserializer.floatDeserializer(), "overhead");
		op.add(Builder::tripped, JsonpDeserializer.floatDeserializer(), "tripped");

	}

}
