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

import co.elastic.clients.elasticsearch._types.GeoLocation;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoPolygonPoints

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.GeoPolygonPoints">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoPolygonPoints implements JsonpSerializable {
	private final List<GeoLocation> points;

	// ---------------------------------------------------------------------------------------------

	private GeoPolygonPoints(Builder builder) {

		this.points = ApiTypeHelper.unmodifiableRequired(builder.points, this, "points");

	}

	public static GeoPolygonPoints of(Function<Builder, ObjectBuilder<GeoPolygonPoints>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code points}
	 */
	public final List<GeoLocation> points() {
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

		if (ApiTypeHelper.isDefined(this.points)) {
			generator.writeKey("points");
			generator.writeStartArray();
			for (GeoLocation item0 : this.points) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoPolygonPoints}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GeoPolygonPoints> {
		private List<GeoLocation> points;

		/**
		 * Required - API name: {@code points}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>points</code>.
		 */
		public final Builder points(List<GeoLocation> list) {
			this.points = _listAddAll(this.points, list);
			return this;
		}

		/**
		 * Required - API name: {@code points}
		 * <p>
		 * Adds one or more values to <code>points</code>.
		 */
		public final Builder points(GeoLocation value, GeoLocation... values) {
			this.points = _listAdd(this.points, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code points}
		 * <p>
		 * Adds a value to <code>points</code> using a builder lambda.
		 */
		public final Builder points(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return points(fn.apply(new GeoLocation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoPolygonPoints}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoPolygonPoints build() {
			_checkSingleUse();

			return new GeoPolygonPoints(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoPolygonPoints}
	 */
	public static final JsonpDeserializer<GeoPolygonPoints> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoPolygonPoints::setupGeoPolygonPointsDeserializer);

	protected static void setupGeoPolygonPointsDeserializer(ObjectDeserializer<GeoPolygonPoints.Builder> op) {

		op.add(Builder::points, JsonpDeserializer.arrayDeserializer(GeoLocation._DESERIALIZER), "points");

	}

}
