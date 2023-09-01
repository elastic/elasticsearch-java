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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.TopLeftBottomRightGeoBounds

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_types.TopLeftBottomRightGeoBounds">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopLeftBottomRightGeoBounds implements JsonpSerializable {
	private final GeoLocation topLeft;

	private final GeoLocation bottomRight;

	// ---------------------------------------------------------------------------------------------

	private TopLeftBottomRightGeoBounds(Builder builder) {

		this.topLeft = ApiTypeHelper.requireNonNull(builder.topLeft, this, "topLeft");
		this.bottomRight = ApiTypeHelper.requireNonNull(builder.bottomRight, this, "bottomRight");

	}

	public static TopLeftBottomRightGeoBounds of(Function<Builder, ObjectBuilder<TopLeftBottomRightGeoBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code top_left}
	 */
	public final GeoLocation topLeft() {
		return this.topLeft;
	}

	/**
	 * Required - API name: {@code bottom_right}
	 */
	public final GeoLocation bottomRight() {
		return this.bottomRight;
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

		generator.writeKey("top_left");
		this.topLeft.serialize(generator, mapper);

		generator.writeKey("bottom_right");
		this.bottomRight.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopLeftBottomRightGeoBounds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TopLeftBottomRightGeoBounds> {
		private GeoLocation topLeft;

		private GeoLocation bottomRight;

		/**
		 * Required - API name: {@code top_left}
		 */
		public final Builder topLeft(GeoLocation value) {
			this.topLeft = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_left}
		 */
		public final Builder topLeft(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.topLeft(fn.apply(new GeoLocation.Builder()).build());
		}

		/**
		 * Required - API name: {@code bottom_right}
		 */
		public final Builder bottomRight(GeoLocation value) {
			this.bottomRight = value;
			return this;
		}

		/**
		 * Required - API name: {@code bottom_right}
		 */
		public final Builder bottomRight(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.bottomRight(fn.apply(new GeoLocation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopLeftBottomRightGeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopLeftBottomRightGeoBounds build() {
			_checkSingleUse();

			return new TopLeftBottomRightGeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopLeftBottomRightGeoBounds}
	 */
	public static final JsonpDeserializer<TopLeftBottomRightGeoBounds> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TopLeftBottomRightGeoBounds::setupTopLeftBottomRightGeoBoundsDeserializer);

	protected static void setupTopLeftBottomRightGeoBoundsDeserializer(
			ObjectDeserializer<TopLeftBottomRightGeoBounds.Builder> op) {

		op.add(Builder::topLeft, GeoLocation._DESERIALIZER, "top_left");
		op.add(Builder::bottomRight, GeoLocation._DESERIALIZER, "bottom_right");

	}

}
