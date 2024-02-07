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
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes._types.Breaker

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Breaker">API
 *      specification</a>
 */
@JsonpDeserializable
public class Breaker implements JsonpSerializable {
	@Nullable
	private final String estimatedSize;

	@Nullable
	private final Long estimatedSizeInBytes;

	@Nullable
	private final String limitSize;

	@Nullable
	private final Long limitSizeInBytes;

	@Nullable
	private final Float overhead;

	@Nullable
	private final Float tripped;

	// ---------------------------------------------------------------------------------------------

	private Breaker(Builder builder) {

		this.estimatedSize = builder.estimatedSize;
		this.estimatedSizeInBytes = builder.estimatedSizeInBytes;
		this.limitSize = builder.limitSize;
		this.limitSizeInBytes = builder.limitSizeInBytes;
		this.overhead = builder.overhead;
		this.tripped = builder.tripped;

	}

	public static Breaker of(Function<Builder, ObjectBuilder<Breaker>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Estimated memory used for the operation.
	 * <p>
	 * API name: {@code estimated_size}
	 */
	@Nullable
	public final String estimatedSize() {
		return this.estimatedSize;
	}

	/**
	 * Estimated memory used, in bytes, for the operation.
	 * <p>
	 * API name: {@code estimated_size_in_bytes}
	 */
	@Nullable
	public final Long estimatedSizeInBytes() {
		return this.estimatedSizeInBytes;
	}

	/**
	 * Memory limit for the circuit breaker.
	 * <p>
	 * API name: {@code limit_size}
	 */
	@Nullable
	public final String limitSize() {
		return this.limitSize;
	}

	/**
	 * Memory limit, in bytes, for the circuit breaker.
	 * <p>
	 * API name: {@code limit_size_in_bytes}
	 */
	@Nullable
	public final Long limitSizeInBytes() {
		return this.limitSizeInBytes;
	}

	/**
	 * A constant that all estimates for the circuit breaker are multiplied with to
	 * calculate a final estimate.
	 * <p>
	 * API name: {@code overhead}
	 */
	@Nullable
	public final Float overhead() {
		return this.overhead;
	}

	/**
	 * Total number of times the circuit breaker has been triggered and prevented an
	 * out of memory error.
	 * <p>
	 * API name: {@code tripped}
	 */
	@Nullable
	public final Float tripped() {
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

		if (this.estimatedSize != null) {
			generator.writeKey("estimated_size");
			generator.write(this.estimatedSize);

		}
		if (this.estimatedSizeInBytes != null) {
			generator.writeKey("estimated_size_in_bytes");
			generator.write(this.estimatedSizeInBytes);

		}
		if (this.limitSize != null) {
			generator.writeKey("limit_size");
			generator.write(this.limitSize);

		}
		if (this.limitSizeInBytes != null) {
			generator.writeKey("limit_size_in_bytes");
			generator.write(this.limitSizeInBytes);

		}
		if (this.overhead != null) {
			generator.writeKey("overhead");
			generator.write(this.overhead);

		}
		if (this.tripped != null) {
			generator.writeKey("tripped");
			generator.write(this.tripped);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Breaker}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Breaker> {
		@Nullable
		private String estimatedSize;

		@Nullable
		private Long estimatedSizeInBytes;

		@Nullable
		private String limitSize;

		@Nullable
		private Long limitSizeInBytes;

		@Nullable
		private Float overhead;

		@Nullable
		private Float tripped;

		/**
		 * Estimated memory used for the operation.
		 * <p>
		 * API name: {@code estimated_size}
		 */
		public final Builder estimatedSize(@Nullable String value) {
			this.estimatedSize = value;
			return this;
		}

		/**
		 * Estimated memory used, in bytes, for the operation.
		 * <p>
		 * API name: {@code estimated_size_in_bytes}
		 */
		public final Builder estimatedSizeInBytes(@Nullable Long value) {
			this.estimatedSizeInBytes = value;
			return this;
		}

		/**
		 * Memory limit for the circuit breaker.
		 * <p>
		 * API name: {@code limit_size}
		 */
		public final Builder limitSize(@Nullable String value) {
			this.limitSize = value;
			return this;
		}

		/**
		 * Memory limit, in bytes, for the circuit breaker.
		 * <p>
		 * API name: {@code limit_size_in_bytes}
		 */
		public final Builder limitSizeInBytes(@Nullable Long value) {
			this.limitSizeInBytes = value;
			return this;
		}

		/**
		 * A constant that all estimates for the circuit breaker are multiplied with to
		 * calculate a final estimate.
		 * <p>
		 * API name: {@code overhead}
		 */
		public final Builder overhead(@Nullable Float value) {
			this.overhead = value;
			return this;
		}

		/**
		 * Total number of times the circuit breaker has been triggered and prevented an
		 * out of memory error.
		 * <p>
		 * API name: {@code tripped}
		 */
		public final Builder tripped(@Nullable Float value) {
			this.tripped = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Breaker}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Breaker build() {
			_checkSingleUse();

			return new Breaker(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Breaker}
	 */
	public static final JsonpDeserializer<Breaker> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Breaker::setupBreakerDeserializer);

	protected static void setupBreakerDeserializer(ObjectDeserializer<Breaker.Builder> op) {

		op.add(Builder::estimatedSize, JsonpDeserializer.stringDeserializer(), "estimated_size");
		op.add(Builder::estimatedSizeInBytes, JsonpDeserializer.longDeserializer(), "estimated_size_in_bytes");
		op.add(Builder::limitSize, JsonpDeserializer.stringDeserializer(), "limit_size");
		op.add(Builder::limitSizeInBytes, JsonpDeserializer.longDeserializer(), "limit_size_in_bytes");
		op.add(Builder::overhead, JsonpDeserializer.floatDeserializer(), "overhead");
		op.add(Builder::tripped, JsonpDeserializer.floatDeserializer(), "tripped");

	}

}
