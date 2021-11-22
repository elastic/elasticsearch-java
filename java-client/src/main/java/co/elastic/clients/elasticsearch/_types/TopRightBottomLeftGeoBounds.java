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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.TopRightBottomLeftGeoBounds
@JsonpDeserializable
public class TopRightBottomLeftGeoBounds implements JsonpSerializable {
	private final GeoLocation topRight;

	private final GeoLocation bottomLeft;

	// ---------------------------------------------------------------------------------------------

	private TopRightBottomLeftGeoBounds(Builder builder) {

		this.topRight = ModelTypeHelper.requireNonNull(builder.topRight, this, "topRight");
		this.bottomLeft = ModelTypeHelper.requireNonNull(builder.bottomLeft, this, "bottomLeft");

	}

	public static TopRightBottomLeftGeoBounds of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code top_right}
	 */
	public final GeoLocation topRight() {
		return this.topRight;
	}

	/**
	 * Required - API name: {@code bottom_left}
	 */
	public final GeoLocation bottomLeft() {
		return this.bottomLeft;
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

		generator.writeKey("top_right");
		this.topRight.serialize(generator, mapper);

		generator.writeKey("bottom_left");
		this.bottomLeft.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopRightBottomLeftGeoBounds}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TopRightBottomLeftGeoBounds> {
		private GeoLocation topRight;

		private GeoLocation bottomLeft;

		/**
		 * Required - API name: {@code top_right}
		 */
		public final Builder topRight(GeoLocation value) {
			this.topRight = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_right}
		 */
		public final Builder topRight(Consumer<GeoLocation.Builder> fn) {
			GeoLocation.Builder builder = new GeoLocation.Builder();
			fn.accept(builder);
			return this.topRight(builder.build());
		}

		/**
		 * Required - API name: {@code bottom_left}
		 */
		public final Builder bottomLeft(GeoLocation value) {
			this.bottomLeft = value;
			return this;
		}

		/**
		 * Required - API name: {@code bottom_left}
		 */
		public final Builder bottomLeft(Consumer<GeoLocation.Builder> fn) {
			GeoLocation.Builder builder = new GeoLocation.Builder();
			fn.accept(builder);
			return this.bottomLeft(builder.build());
		}

		/**
		 * Builds a {@link TopRightBottomLeftGeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopRightBottomLeftGeoBounds build() {
			_checkSingleUse();

			return new TopRightBottomLeftGeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopRightBottomLeftGeoBounds}
	 */
	public static final JsonpDeserializer<TopRightBottomLeftGeoBounds> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TopRightBottomLeftGeoBounds::setupTopRightBottomLeftGeoBoundsDeserializer);

	protected static void setupTopRightBottomLeftGeoBoundsDeserializer(
			ObjectDeserializer<TopRightBottomLeftGeoBounds.Builder> op) {

		op.add(Builder::topRight, GeoLocation._DESERIALIZER, "top_right");
		op.add(Builder::bottomLeft, GeoLocation._DESERIALIZER, "bottom_left");

	}

}
