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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ExtendedBounds
public final class ExtendedBounds<T> implements ToJsonp {
	private final T max;

	private final T min;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	protected ExtendedBounds(Builder<T> builder) {

		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");
		this.tSerializer = builder.tSerializer;

	}

	/**
	 * API name: {@code max}
	 */
	public T max() {
		return this.max;
	}

	/**
	 * API name: {@code min}
	 */
	public T min() {
		return this.min;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("max");
		JsonpUtils.serialize(this.max, generator, tSerializer, mapper);

		generator.writeKey("min");
		JsonpUtils.serialize(this.min, generator, tSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedBounds}.
	 */
	public static class Builder<T> implements ObjectBuilder<ExtendedBounds<T>> {
		private T max;

		private T min;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * API name: {@code max}
		 */
		public Builder<T> max(T value) {
			this.max = value;
			return this;
		}

		/**
		 * API name: {@code min}
		 */
		public Builder<T> min(T value) {
			this.min = value;
			return this;
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 *
		 */
		public Builder<T> tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link ExtendedBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedBounds<T> build() {

			return new ExtendedBounds<T>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for ExtendedBounds
	 */
	public static <T> JsonpDeserializer<ExtendedBounds<T>> createExtendedBoundsDeserializer(
			JsonpDeserializer<T> tDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<T>>) Builder::new,
				op -> ExtendedBounds.setupExtendedBoundsDeserializer(op, tDeserializer));
	};

	protected static <T> void setupExtendedBoundsDeserializer(DelegatingDeserializer<ExtendedBounds.Builder<T>> op,
			JsonpDeserializer<T> tDeserializer) {

		op.add(Builder::max, tDeserializer, "max");
		op.add(Builder::min, tDeserializer, "min");

	}

}
