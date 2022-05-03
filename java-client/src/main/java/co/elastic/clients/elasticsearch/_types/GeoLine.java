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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.GeoLine

/**
 * A GeoJson GeoLine.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.GeoLine">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoLine implements JsonpSerializable {
	private final String type;

	private final List<List<Double>> coordinates;

	// ---------------------------------------------------------------------------------------------

	private GeoLine(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.coordinates = ApiTypeHelper.unmodifiableRequired(builder.coordinates, this, "coordinates");

	}

	public static GeoLine of(Function<Builder, ObjectBuilder<GeoLine>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Always <code>&quot;LineString&quot;</code>
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - Array of <code>[lon, lat]</code> coordinates
	 * <p>
	 * API name: {@code coordinates}
	 */
	public final List<List<Double>> coordinates() {
		return this.coordinates;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (ApiTypeHelper.isDefined(this.coordinates)) {
			generator.writeKey("coordinates");
			generator.writeStartArray();
			for (List<Double> item0 : this.coordinates) {
				generator.writeStartArray();
				if (item0 != null) {
					for (Double item1 : item0) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

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
	 * Builder for {@link GeoLine}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GeoLine> {
		private String type;

		private List<List<Double>> coordinates;

		/**
		 * Required - Always <code>&quot;LineString&quot;</code>
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - Array of <code>[lon, lat]</code> coordinates
		 * <p>
		 * API name: {@code coordinates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>coordinates</code>.
		 */
		public final Builder coordinates(List<List<Double>> list) {
			this.coordinates = _listAddAll(this.coordinates, list);
			return this;
		}

		/**
		 * Required - Array of <code>[lon, lat]</code> coordinates
		 * <p>
		 * API name: {@code coordinates}
		 * <p>
		 * Adds one or more values to <code>coordinates</code>.
		 */
		public final Builder coordinates(List<Double> value, List<Double>... values) {
			this.coordinates = _listAdd(this.coordinates, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoLine}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoLine build() {
			_checkSingleUse();

			return new GeoLine(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoLine}
	 */
	public static final JsonpDeserializer<GeoLine> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoLine::setupGeoLineDeserializer);

	protected static void setupGeoLineDeserializer(ObjectDeserializer<GeoLine.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::coordinates, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer())), "coordinates");

	}

}
