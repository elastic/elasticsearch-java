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

// typedef: _types.CoordsGeoBounds

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.CoordsGeoBounds">API
 *      specification</a>
 */
@JsonpDeserializable
public class CoordsGeoBounds implements JsonpSerializable {
	private final double top;

	private final double bottom;

	private final double left;

	private final double right;

	// ---------------------------------------------------------------------------------------------

	private CoordsGeoBounds(Builder builder) {

		this.top = ApiTypeHelper.requireNonNull(builder.top, this, "top");
		this.bottom = ApiTypeHelper.requireNonNull(builder.bottom, this, "bottom");
		this.left = ApiTypeHelper.requireNonNull(builder.left, this, "left");
		this.right = ApiTypeHelper.requireNonNull(builder.right, this, "right");

	}

	public static CoordsGeoBounds of(Function<Builder, ObjectBuilder<CoordsGeoBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code top}
	 */
	public final double top() {
		return this.top;
	}

	/**
	 * Required - API name: {@code bottom}
	 */
	public final double bottom() {
		return this.bottom;
	}

	/**
	 * Required - API name: {@code left}
	 */
	public final double left() {
		return this.left;
	}

	/**
	 * Required - API name: {@code right}
	 */
	public final double right() {
		return this.right;
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

		generator.writeKey("top");
		generator.write(this.top);

		generator.writeKey("bottom");
		generator.write(this.bottom);

		generator.writeKey("left");
		generator.write(this.left);

		generator.writeKey("right");
		generator.write(this.right);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CoordsGeoBounds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CoordsGeoBounds> {
		private Double top;

		private Double bottom;

		private Double left;

		private Double right;

		/**
		 * Required - API name: {@code top}
		 */
		public final Builder top(double value) {
			this.top = value;
			return this;
		}

		/**
		 * Required - API name: {@code bottom}
		 */
		public final Builder bottom(double value) {
			this.bottom = value;
			return this;
		}

		/**
		 * Required - API name: {@code left}
		 */
		public final Builder left(double value) {
			this.left = value;
			return this;
		}

		/**
		 * Required - API name: {@code right}
		 */
		public final Builder right(double value) {
			this.right = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CoordsGeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CoordsGeoBounds build() {
			_checkSingleUse();

			return new CoordsGeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CoordsGeoBounds}
	 */
	public static final JsonpDeserializer<CoordsGeoBounds> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CoordsGeoBounds::setupCoordsGeoBoundsDeserializer);

	protected static void setupCoordsGeoBoundsDeserializer(ObjectDeserializer<CoordsGeoBounds.Builder> op) {

		op.add(Builder::top, JsonpDeserializer.doubleDeserializer(), "top");
		op.add(Builder::bottom, JsonpDeserializer.doubleDeserializer(), "bottom");
		op.add(Builder::left, JsonpDeserializer.doubleDeserializer(), "left");
		op.add(Builder::right, JsonpDeserializer.doubleDeserializer(), "right");

	}

}
