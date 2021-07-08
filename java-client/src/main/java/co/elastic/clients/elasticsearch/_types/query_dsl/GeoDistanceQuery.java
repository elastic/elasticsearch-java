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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoDistanceQuery
public final class GeoDistanceQuery extends QueryBase {
	@Nullable
	private final String distance;

	@Nullable
	private final JsonValue distanceType;

	@Nullable
	private final JsonValue validationMethod;

	// ---------------------------------------------------------------------------------------------

	protected GeoDistanceQuery(Builder builder) {
		super(builder);
		this.distance = builder.distance;
		this.distanceType = builder.distanceType;
		this.validationMethod = builder.validationMethod;

	}

	/**
	 * API name: {@code distance}
	 */
	@Nullable
	public String distance() {
		return this.distance;
	}

	/**
	 * API name: {@code distance_type}
	 */
	@Nullable
	public JsonValue distanceType() {
		return this.distanceType;
	}

	/**
	 * API name: {@code validation_method}
	 */
	@Nullable
	public JsonValue validationMethod() {
		return this.validationMethod;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.distance != null) {

			generator.writeKey("distance");
			generator.write(this.distance);

		}
		if (this.distanceType != null) {

			generator.writeKey("distance_type");
			generator.write(this.distanceType);

		}
		if (this.validationMethod != null) {

			generator.writeKey("validation_method");
			generator.write(this.validationMethod);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoDistanceQuery> {
		@Nullable
		private String distance;

		@Nullable
		private JsonValue distanceType;

		@Nullable
		private JsonValue validationMethod;

		/**
		 * API name: {@code distance}
		 */
		public Builder distance(@Nullable String value) {
			this.distance = value;
			return this;
		}

		/**
		 * API name: {@code distance_type}
		 */
		public Builder distanceType(@Nullable JsonValue value) {
			this.distanceType = value;
			return this;
		}

		/**
		 * API name: {@code validation_method}
		 */
		public Builder validationMethod(@Nullable JsonValue value) {
			this.validationMethod = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoDistanceQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoDistanceQuery build() {

			return new GeoDistanceQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoDistanceQuery
	 */
	public static final JsonpDeserializer<GeoDistanceQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoDistanceQuery::setupGeoDistanceQueryDeserializer);

	protected static void setupGeoDistanceQueryDeserializer(DelegatingDeserializer<GeoDistanceQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::distance, JsonpDeserializer.stringDeserializer(), "distance");
		op.add(Builder::distanceType, JsonpDeserializer.jsonValueDeserializer(), "distance_type");
		op.add(Builder::validationMethod, JsonpDeserializer.jsonValueDeserializer(), "validation_method");

	}

}
