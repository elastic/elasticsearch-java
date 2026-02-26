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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _types.CartesianPoint

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.CartesianPoint">API
 *      specification</a>
 */
@JsonpDeserializable
public class CartesianPoint implements JsonpSerializable {
	private final double x;

	private final double y;

	// ---------------------------------------------------------------------------------------------

	private CartesianPoint(Builder builder) {

		this.x = ApiTypeHelper.requireNonNull(builder.x, this, "x", 0);
		this.y = ApiTypeHelper.requireNonNull(builder.y, this, "y", 0);

	}

	public static CartesianPoint of(Function<Builder, ObjectBuilder<CartesianPoint>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code x}
	 */
	public final double x() {
		return this.x;
	}

	/**
	 * Required - API name: {@code y}
	 */
	public final double y() {
		return this.y;
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

		generator.writeKey("x");
		generator.write(this.x);

		generator.writeKey("y");
		generator.write(this.y);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CartesianPoint}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CartesianPoint> {
		private Double x;

		private Double y;

		public Builder() {
		}
		private Builder(CartesianPoint instance) {
			this.x = instance.x;
			this.y = instance.y;

		}
		/**
		 * Required - API name: {@code x}
		 */
		public final Builder x(double value) {
			this.x = value;
			return this;
		}

		/**
		 * Required - API name: {@code y}
		 */
		public final Builder y(double value) {
			this.y = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CartesianPoint}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CartesianPoint build() {
			_checkSingleUse();

			return new CartesianPoint(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CartesianPoint}
	 */
	public static final JsonpDeserializer<CartesianPoint> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CartesianPoint::setupCartesianPointDeserializer);

	protected static void setupCartesianPointDeserializer(ObjectDeserializer<CartesianPoint.Builder> op) {

		op.add(Builder::x, JsonpDeserializer.doubleDeserializer(), "x");
		op.add(Builder::y, JsonpDeserializer.doubleDeserializer(), "y");

	}

}
