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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.BoundingBox
@JsonpDeserializable
public final class BoundingBox implements JsonpSerializable {
	@Nullable
	private final JsonValue /* _types.query_dsl.GeoLocation */ bottomRight;

	@Nullable
	private final JsonValue /* _types.query_dsl.GeoLocation */ topLeft;

	@Nullable
	private final JsonValue /* _types.query_dsl.GeoLocation */ topRight;

	@Nullable
	private final JsonValue /* _types.query_dsl.GeoLocation */ bottomLeft;

	@Nullable
	private final Double top;

	@Nullable
	private final Double left;

	@Nullable
	private final Double right;

	@Nullable
	private final Double bottom;

	@Nullable
	private final String wkt;

	// ---------------------------------------------------------------------------------------------

	public BoundingBox(Builder builder) {

		this.bottomRight = builder.bottomRight;
		this.topLeft = builder.topLeft;
		this.topRight = builder.topRight;
		this.bottomLeft = builder.bottomLeft;
		this.top = builder.top;
		this.left = builder.left;
		this.right = builder.right;
		this.bottom = builder.bottom;
		this.wkt = builder.wkt;

	}

	public BoundingBox(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code bottom_right}
	 */
	@Nullable
	public JsonValue /* _types.query_dsl.GeoLocation */ bottomRight() {
		return this.bottomRight;
	}

	/**
	 * API name: {@code top_left}
	 */
	@Nullable
	public JsonValue /* _types.query_dsl.GeoLocation */ topLeft() {
		return this.topLeft;
	}

	/**
	 * API name: {@code top_right}
	 */
	@Nullable
	public JsonValue /* _types.query_dsl.GeoLocation */ topRight() {
		return this.topRight;
	}

	/**
	 * API name: {@code bottom_left}
	 */
	@Nullable
	public JsonValue /* _types.query_dsl.GeoLocation */ bottomLeft() {
		return this.bottomLeft;
	}

	/**
	 * API name: {@code top}
	 */
	@Nullable
	public Double top() {
		return this.top;
	}

	/**
	 * API name: {@code left}
	 */
	@Nullable
	public Double left() {
		return this.left;
	}

	/**
	 * API name: {@code right}
	 */
	@Nullable
	public Double right() {
		return this.right;
	}

	/**
	 * API name: {@code bottom}
	 */
	@Nullable
	public Double bottom() {
		return this.bottom;
	}

	/**
	 * API name: {@code wkt}
	 */
	@Nullable
	public String wkt() {
		return this.wkt;
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

		if (this.bottomRight != null) {

			generator.writeKey("bottom_right");
			generator.write(this.bottomRight);

		}
		if (this.topLeft != null) {

			generator.writeKey("top_left");
			generator.write(this.topLeft);

		}
		if (this.topRight != null) {

			generator.writeKey("top_right");
			generator.write(this.topRight);

		}
		if (this.bottomLeft != null) {

			generator.writeKey("bottom_left");
			generator.write(this.bottomLeft);

		}
		if (this.top != null) {

			generator.writeKey("top");
			generator.write(this.top);

		}
		if (this.left != null) {

			generator.writeKey("left");
			generator.write(this.left);

		}
		if (this.right != null) {

			generator.writeKey("right");
			generator.write(this.right);

		}
		if (this.bottom != null) {

			generator.writeKey("bottom");
			generator.write(this.bottom);

		}
		if (this.wkt != null) {

			generator.writeKey("wkt");
			generator.write(this.wkt);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoundingBox}.
	 */
	public static class Builder implements ObjectBuilder<BoundingBox> {
		@Nullable
		private JsonValue /* _types.query_dsl.GeoLocation */ bottomRight;

		@Nullable
		private JsonValue /* _types.query_dsl.GeoLocation */ topLeft;

		@Nullable
		private JsonValue /* _types.query_dsl.GeoLocation */ topRight;

		@Nullable
		private JsonValue /* _types.query_dsl.GeoLocation */ bottomLeft;

		@Nullable
		private Double top;

		@Nullable
		private Double left;

		@Nullable
		private Double right;

		@Nullable
		private Double bottom;

		@Nullable
		private String wkt;

		/**
		 * API name: {@code bottom_right}
		 */
		public Builder bottomRight(@Nullable JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.bottomRight = value;
			return this;
		}

		/**
		 * API name: {@code top_left}
		 */
		public Builder topLeft(@Nullable JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.topLeft = value;
			return this;
		}

		/**
		 * API name: {@code top_right}
		 */
		public Builder topRight(@Nullable JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.topRight = value;
			return this;
		}

		/**
		 * API name: {@code bottom_left}
		 */
		public Builder bottomLeft(@Nullable JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.bottomLeft = value;
			return this;
		}

		/**
		 * API name: {@code top}
		 */
		public Builder top(@Nullable Double value) {
			this.top = value;
			return this;
		}

		/**
		 * API name: {@code left}
		 */
		public Builder left(@Nullable Double value) {
			this.left = value;
			return this;
		}

		/**
		 * API name: {@code right}
		 */
		public Builder right(@Nullable Double value) {
			this.right = value;
			return this;
		}

		/**
		 * API name: {@code bottom}
		 */
		public Builder bottom(@Nullable Double value) {
			this.bottom = value;
			return this;
		}

		/**
		 * API name: {@code wkt}
		 */
		public Builder wkt(@Nullable String value) {
			this.wkt = value;
			return this;
		}

		/**
		 * Builds a {@link BoundingBox}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoundingBox build() {

			return new BoundingBox(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BoundingBox}
	 */
	public static final JsonpDeserializer<BoundingBox> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BoundingBox::setupBoundingBoxDeserializer, Builder::build);

	protected static void setupBoundingBoxDeserializer(DelegatingDeserializer<BoundingBox.Builder> op) {

		op.add(Builder::bottomRight, JsonpDeserializer.jsonValueDeserializer(), "bottom_right");
		op.add(Builder::topLeft, JsonpDeserializer.jsonValueDeserializer(), "top_left");
		op.add(Builder::topRight, JsonpDeserializer.jsonValueDeserializer(), "top_right");
		op.add(Builder::bottomLeft, JsonpDeserializer.jsonValueDeserializer(), "bottom_left");
		op.add(Builder::top, JsonpDeserializer.doubleDeserializer(), "top");
		op.add(Builder::left, JsonpDeserializer.doubleDeserializer(), "left");
		op.add(Builder::right, JsonpDeserializer.doubleDeserializer(), "right");
		op.add(Builder::bottom, JsonpDeserializer.doubleDeserializer(), "bottom");
		op.add(Builder::wkt, JsonpDeserializer.stringDeserializer(), "wkt");

	}

}
