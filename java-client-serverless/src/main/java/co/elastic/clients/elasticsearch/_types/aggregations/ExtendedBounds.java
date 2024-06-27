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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
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

// typedef: _types.aggregations.ExtendedBounds

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ExtendedBounds">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedBounds<T> implements JsonpSerializable {
	@Nullable
	private final T max;

	@Nullable
	private final T min;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	private ExtendedBounds(Builder<T> builder) {

		this.max = builder.max;
		this.min = builder.min;
		this.tSerializer = builder.tSerializer;

	}

	public static <T> ExtendedBounds<T> of(Function<Builder<T>, ObjectBuilder<ExtendedBounds<T>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Maximum value for the bound.
	 * <p>
	 * API name: {@code max}
	 */
	@Nullable
	public final T max() {
		return this.max;
	}

	/**
	 * Minimum value for the bound.
	 * <p>
	 * API name: {@code min}
	 */
	@Nullable
	public final T min() {
		return this.min;
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

		if (this.max != null) {
			generator.writeKey("max");
			JsonpUtils.serialize(this.max, generator, tSerializer, mapper);

		}
		if (this.min != null) {
			generator.writeKey("min");
			JsonpUtils.serialize(this.min, generator, tSerializer, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedBounds}.
	 */

	public static class Builder<T> extends WithJsonObjectBuilderBase<Builder<T>>
			implements
				ObjectBuilder<ExtendedBounds<T>> {
		@Nullable
		private T max;

		@Nullable
		private T min;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * Maximum value for the bound.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder<T> max(@Nullable T value) {
			this.max = value;
			return this;
		}

		/**
		 * Minimum value for the bound.
		 * <p>
		 * API name: {@code min}
		 */
		public final Builder<T> min(@Nullable T value) {
			this.min = value;
			return this;
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public final Builder<T> tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return this;
		}

		@Override
		protected Builder<T> self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedBounds<T> build() {
			_checkSingleUse();

			return new ExtendedBounds<T>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for ExtendedBounds
	 */
	public static <T> JsonpDeserializer<ExtendedBounds<T>> createExtendedBoundsDeserializer(
			JsonpDeserializer<T> tDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<T>>) Builder::new,
				op -> ExtendedBounds.setupExtendedBoundsDeserializer(op, tDeserializer));
	};

	/**
	 * Json deserializer for {@link ExtendedBounds} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<ExtendedBounds<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createExtendedBoundsDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_types.aggregations.ExtendedBounds.T")));

	protected static <T> void setupExtendedBoundsDeserializer(ObjectDeserializer<ExtendedBounds.Builder<T>> op,
			JsonpDeserializer<T> tDeserializer) {

		op.add(Builder::max, tDeserializer, "max");
		op.add(Builder::min, tDeserializer, "min");

	}

}
