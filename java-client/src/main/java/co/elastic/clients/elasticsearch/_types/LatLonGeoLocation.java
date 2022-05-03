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

// typedef: _types.LatLonGeoLocation

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.LatLonGeoLocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class LatLonGeoLocation implements JsonpSerializable {
	private final double lat;

	private final double lon;

	// ---------------------------------------------------------------------------------------------

	private LatLonGeoLocation(Builder builder) {

		this.lat = ApiTypeHelper.requireNonNull(builder.lat, this, "lat");
		this.lon = ApiTypeHelper.requireNonNull(builder.lon, this, "lon");

	}

	public static LatLonGeoLocation of(Function<Builder, ObjectBuilder<LatLonGeoLocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code lat}
	 */
	public final double lat() {
		return this.lat;
	}

	/**
	 * Required - API name: {@code lon}
	 */
	public final double lon() {
		return this.lon;
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

		generator.writeKey("lat");
		generator.write(this.lat);

		generator.writeKey("lon");
		generator.write(this.lon);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LatLonGeoLocation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<LatLonGeoLocation> {
		private Double lat;

		private Double lon;

		/**
		 * Required - API name: {@code lat}
		 */
		public final Builder lat(double value) {
			this.lat = value;
			return this;
		}

		/**
		 * Required - API name: {@code lon}
		 */
		public final Builder lon(double value) {
			this.lon = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LatLonGeoLocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LatLonGeoLocation build() {
			_checkSingleUse();

			return new LatLonGeoLocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LatLonGeoLocation}
	 */
	public static final JsonpDeserializer<LatLonGeoLocation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LatLonGeoLocation::setupLatLonGeoLocationDeserializer);

	protected static void setupLatLonGeoLocationDeserializer(ObjectDeserializer<LatLonGeoLocation.Builder> op) {

		op.add(Builder::lat, JsonpDeserializer.doubleDeserializer(), "lat");
		op.add(Builder::lon, JsonpDeserializer.doubleDeserializer(), "lon");

	}

}
