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

import co.elastic.clients.elasticsearch._types.LatLon;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoBounds
@JsonpDeserializable
public final class GeoBounds implements JsonpSerializable {
	private final LatLon bottomRight;

	private final LatLon topLeft;

	// ---------------------------------------------------------------------------------------------

	public GeoBounds(Builder builder) {

		this.bottomRight = Objects.requireNonNull(builder.bottomRight, "bottom_right");
		this.topLeft = Objects.requireNonNull(builder.topLeft, "top_left");

	}

	public GeoBounds(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code bottom_right}
	 */
	public LatLon bottomRight() {
		return this.bottomRight;
	}

	/**
	 * Required - API name: {@code top_left}
	 */
	public LatLon topLeft() {
		return this.topLeft;
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

		generator.writeKey("bottom_right");
		this.bottomRight.serialize(generator, mapper);

		generator.writeKey("top_left");
		this.topLeft.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBounds}.
	 */
	public static class Builder implements ObjectBuilder<GeoBounds> {
		private LatLon bottomRight;

		private LatLon topLeft;

		/**
		 * Required - API name: {@code bottom_right}
		 */
		public Builder bottomRight(LatLon value) {
			this.bottomRight = value;
			return this;
		}

		/**
		 * Required - API name: {@code bottom_right}
		 */
		public Builder bottomRight(Function<LatLon.Builder, ObjectBuilder<LatLon>> fn) {
			return this.bottomRight(fn.apply(new LatLon.Builder()).build());
		}

		/**
		 * Required - API name: {@code top_left}
		 */
		public Builder topLeft(LatLon value) {
			this.topLeft = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_left}
		 */
		public Builder topLeft(Function<LatLon.Builder, ObjectBuilder<LatLon>> fn) {
			return this.topLeft(fn.apply(new LatLon.Builder()).build());
		}

		/**
		 * Builds a {@link GeoBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBounds build() {

			return new GeoBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoBounds}
	 */
	public static final JsonpDeserializer<GeoBounds> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoBounds::setupGeoBoundsDeserializer, Builder::build);

	protected static void setupGeoBoundsDeserializer(DelegatingDeserializer<GeoBounds.Builder> op) {

		op.add(Builder::bottomRight, LatLon._DESERIALIZER, "bottom_right");
		op.add(Builder::topLeft, LatLon._DESERIALIZER, "top_left");

	}

}
