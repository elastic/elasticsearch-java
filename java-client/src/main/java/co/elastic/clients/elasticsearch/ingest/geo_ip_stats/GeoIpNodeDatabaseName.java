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

package co.elastic.clients.elasticsearch.ingest.geo_ip_stats;

import co.elastic.clients.json.DelegatingDeserializer;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.geo_ip_stats.GeoIpNodeDatabaseName
@JsonpDeserializable
public class GeoIpNodeDatabaseName implements JsonpSerializable {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private GeoIpNodeDatabaseName(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static GeoIpNodeDatabaseName of(Function<Builder, ObjectBuilder<GeoIpNodeDatabaseName>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the database.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpNodeDatabaseName}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GeoIpNodeDatabaseName> {
		private String name;

		/**
		 * Required - Name of the database.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link GeoIpNodeDatabaseName}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpNodeDatabaseName build() {
			_checkSingleUse();

			return new GeoIpNodeDatabaseName(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpNodeDatabaseName}
	 */
	public static final JsonpDeserializer<GeoIpNodeDatabaseName> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoIpNodeDatabaseName::setupGeoIpNodeDatabaseNameDeserializer, Builder::build);

	protected static void setupGeoIpNodeDatabaseNameDeserializer(
			DelegatingDeserializer<GeoIpNodeDatabaseName.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
