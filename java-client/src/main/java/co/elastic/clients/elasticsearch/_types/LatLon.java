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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.LatLon
public final class LatLon implements JsonpSerializable {
	private final Number lat;

	private final Number lon;

	// ---------------------------------------------------------------------------------------------

	public LatLon(Builder builder) {

		this.lat = Objects.requireNonNull(builder.lat, "lat");
		this.lon = Objects.requireNonNull(builder.lon, "lon");

	}

	/**
	 * API name: {@code lat}
	 */
	public Number lat() {
		return this.lat;
	}

	/**
	 * API name: {@code lon}
	 */
	public Number lon() {
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
		generator.write(this.lat.doubleValue());

		generator.writeKey("lon");
		generator.write(this.lon.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LatLon}.
	 */
	public static class Builder implements ObjectBuilder<LatLon> {
		private Number lat;

		private Number lon;

		/**
		 * API name: {@code lat}
		 */
		public Builder lat(Number value) {
			this.lat = value;
			return this;
		}

		/**
		 * API name: {@code lon}
		 */
		public Builder lon(Number value) {
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
	public static final JsonpDeserializer<LatLon> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			LatLon::setupLatLonDeserializer);

	protected static void setupLatLonDeserializer(DelegatingDeserializer<LatLon.Builder> op) {

		op.add(Builder::lat, JsonpDeserializer.numberDeserializer(), "lat");
		op.add(Builder::lon, JsonpDeserializer.numberDeserializer(), "lon");

	}

}
