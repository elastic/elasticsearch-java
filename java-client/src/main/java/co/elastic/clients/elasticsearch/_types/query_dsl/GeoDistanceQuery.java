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

import co.elastic.clients.elasticsearch._types.GeoDistanceType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoDistanceQuery
@JsonpDeserializable
public class GeoDistanceQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final JsonValue /* _types.query_dsl.GeoLocation */ location;

	@Nullable
	private final String distance;

	@Nullable
	private final GeoDistanceType distanceType;

	@Nullable
	private final GeoValidationMethod validationMethod;

	// ---------------------------------------------------------------------------------------------

	private GeoDistanceQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.location = ModelTypeHelper.requireNonNull(builder.location, this, "location");

		this.distance = builder.distance;
		this.distanceType = builder.distanceType;
		this.validationMethod = builder.validationMethod;

	}

	public static GeoDistanceQuery of(Function<Builder, ObjectBuilder<GeoDistanceQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_distance";
	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final JsonValue /* _types.query_dsl.GeoLocation */ location() {
		return this.location;
	}

	/**
	 * API name: {@code distance}
	 */
	@Nullable
	public final String distance() {
		return this.distance;
	}

	/**
	 * API name: {@code distance_type}
	 */
	@Nullable
	public final GeoDistanceType distanceType() {
		return this.distanceType;
	}

	/**
	 * API name: {@code validation_method}
	 */
	@Nullable
	public final GeoValidationMethod validationMethod() {
		return this.validationMethod;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		generator.write(this.location);

		super.serializeInternal(generator, mapper);
		if (this.distance != null) {
			generator.writeKey("distance");
			generator.write(this.distance);

		}
		if (this.distanceType != null) {
			generator.writeKey("distance_type");
			this.distanceType.serialize(generator, mapper);
		}
		if (this.validationMethod != null) {
			generator.writeKey("validation_method");
			this.validationMethod.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoDistanceQuery> {
		private String field;

		private JsonValue /* _types.query_dsl.GeoLocation */ location;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder location(JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.location = value;
			return this;
		}

		@Nullable
		private String distance;

		@Nullable
		private GeoDistanceType distanceType;

		@Nullable
		private GeoValidationMethod validationMethod;

		/**
		 * API name: {@code distance}
		 */
		public final Builder distance(@Nullable String value) {
			this.distance = value;
			return this;
		}

		/**
		 * API name: {@code distance_type}
		 */
		public final Builder distanceType(@Nullable GeoDistanceType value) {
			this.distanceType = value;
			return this;
		}

		/**
		 * API name: {@code validation_method}
		 */
		public final Builder validationMethod(@Nullable GeoValidationMethod value) {
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
			_checkSingleUse();

			return new GeoDistanceQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoDistanceQuery}
	 */
	public static final JsonpDeserializer<GeoDistanceQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoDistanceQuery::setupGeoDistanceQueryDeserializer, Builder::build);

	protected static void setupGeoDistanceQueryDeserializer(DelegatingDeserializer<GeoDistanceQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::distance, JsonpDeserializer.stringDeserializer(), "distance");
		op.add(Builder::distanceType, GeoDistanceType._DESERIALIZER, "distance_type");
		op.add(Builder::validationMethod, GeoValidationMethod._DESERIALIZER, "validation_method");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.location(JsonpDeserializer.jsonValueDeserializer().deserialize(parser, mapper));
		});

	}

}
