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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.LatLon
@JsonpDeserializable
public final class LatLon implements JsonpSerializable {
	private final double lat;

	private final double lon;

	// ---------------------------------------------------------------------------------------------

	public LatLon(Builder builder) {

		this.lat = Objects.requireNonNull(builder.lat, "lat");
		this.lon = Objects.requireNonNull(builder.lon, "lon");

	}

	public LatLon(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code lat}
	 */
	public double lat() {
		return this.lat;
	}

	/**
	 * Required - API name: {@code lon}
	 */
	public double lon() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LatLon}.
	 */
	public static class Builder implements ObjectBuilder<LatLon> {
		private Double lat;

		private Double lon;

		/**
		 * Required - API name: {@code lat}
		 */
		public Builder lat(double value) {
			this.lat = value;
			return this;
		}

		/**
		 * Required - API name: {@code lon}
		 */
		public Builder lon(double value) {
			this.lon = value;
			return this;
		}

		/**
		 * Builds a {@link LatLon}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LatLon build() {

			return new LatLon(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LatLon}
	 */
	public static final JsonpDeserializer<LatLon> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LatLon::setupLatLonDeserializer, Builder::build);

	protected static void setupLatLonDeserializer(DelegatingDeserializer<LatLon.Builder> op) {

		op.add(Builder::lat, JsonpDeserializer.doubleDeserializer(), "lat");
		op.add(Builder::lon, JsonpDeserializer.doubleDeserializer(), "lon");

	}

}
