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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoPolygonPoints
@JsonpDeserializable
public final class GeoPolygonPoints implements JsonpSerializable {
	private final List<JsonValue /* _types.query_dsl.GeoLocation */> points;

	// ---------------------------------------------------------------------------------------------

	public GeoPolygonPoints(Builder builder) {

		this.points = ModelTypeHelper.unmodifiableNonNull(builder.points, "points");

	}

	public GeoPolygonPoints(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code points}
	 */
	public List<JsonValue /* _types.query_dsl.GeoLocation */> points() {
		return this.points;
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

		generator.writeKey("points");
		generator.writeStartArray();
		for (JsonValue /* _types.query_dsl.GeoLocation */ item0 : this.points) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoPolygonPoints}.
	 */
	public static class Builder implements ObjectBuilder<GeoPolygonPoints> {
		private List<JsonValue /* _types.query_dsl.GeoLocation */> points;

		/**
		 * Required - API name: {@code points}
		 */
		public Builder points(List<JsonValue /* _types.query_dsl.GeoLocation */> value) {
			this.points = value;
			return this;
		}

		/**
		 * Required - API name: {@code points}
		 */
		public Builder points(JsonValue /* _types.query_dsl.GeoLocation */... value) {
			this.points = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #points(List)}, creating the list if needed.
		 */
		public Builder addPoints(JsonValue /* _types.query_dsl.GeoLocation */ value) {
			if (this.points == null) {
				this.points = new ArrayList<>();
			}
			this.points.add(value);
			return this;
		}

		/**
		 * Builds a {@link GeoPolygonPoints}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoPolygonPoints build() {

			return new GeoPolygonPoints(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoPolygonPoints}
	 */
	public static final JsonpDeserializer<GeoPolygonPoints> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoPolygonPoints::setupGeoPolygonPointsDeserializer, Builder::build);

	protected static void setupGeoPolygonPointsDeserializer(DelegatingDeserializer<GeoPolygonPoints.Builder> op) {

		op.add(Builder::points, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"points");

	}

}
