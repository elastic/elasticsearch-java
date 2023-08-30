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
import co.elastic.clients.elasticsearch._types.GeoLocation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoDistanceQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.GeoDistanceQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoDistanceQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final GeoLocation location;

	private final String distance;

	@Nullable
	private final GeoDistanceType distanceType;

	@Nullable
	private final GeoValidationMethod validationMethod;

	// ---------------------------------------------------------------------------------------------

	private GeoDistanceQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.location = ApiTypeHelper.requireNonNull(builder.location, this, "location");

		this.distance = ApiTypeHelper.requireNonNull(builder.distance, this, "distance");
		this.distanceType = builder.distanceType;
		this.validationMethod = builder.validationMethod;

	}

	public static GeoDistanceQuery of(Function<Builder, ObjectBuilder<GeoDistanceQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.GeoDistance;
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
	public final GeoLocation location() {
		return this.location;
	}

	/**
	 * Required - The radius of the circle centred on the specified location. Points
	 * which fall into this circle are considered to be matches.
	 * <p>
	 * API name: {@code distance}
	 */
	public final String distance() {
		return this.distance;
	}

	/**
	 * How to compute the distance. Set to <code>plane</code> for a faster
	 * calculation that's inaccurate on long distances and close to the poles.
	 * <p>
	 * API name: {@code distance_type}
	 */
	@Nullable
	public final GeoDistanceType distanceType() {
		return this.distanceType;
	}

	/**
	 * Set to <code>IGNORE_MALFORMED</code> to accept geo points with invalid
	 * latitude or longitude. Set to <code>COERCE</code> to also try to infer
	 * correct latitude or longitude.
	 * <p>
	 * API name: {@code validation_method}
	 */
	@Nullable
	public final GeoValidationMethod validationMethod() {
		return this.validationMethod;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		this.location.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);
		generator.writeKey("distance");
		generator.write(this.distance);

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

		private GeoLocation location;

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
		public final Builder location(GeoLocation value) {
			this.location = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder location(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.location(fn.apply(new GeoLocation.Builder()).build());
		}

		private String distance;

		@Nullable
		private GeoDistanceType distanceType;

		@Nullable
		private GeoValidationMethod validationMethod;

		/**
		 * Required - The radius of the circle centred on the specified location. Points
		 * which fall into this circle are considered to be matches.
		 * <p>
		 * API name: {@code distance}
		 */
		public final Builder distance(String value) {
			this.distance = value;
			return this;
		}

		/**
		 * How to compute the distance. Set to <code>plane</code> for a faster
		 * calculation that's inaccurate on long distances and close to the poles.
		 * <p>
		 * API name: {@code distance_type}
		 */
		public final Builder distanceType(@Nullable GeoDistanceType value) {
			this.distanceType = value;
			return this;
		}

		/**
		 * Set to <code>IGNORE_MALFORMED</code> to accept geo points with invalid
		 * latitude or longitude. Set to <code>COERCE</code> to also try to infer
		 * correct latitude or longitude.
		 * <p>
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
			GeoDistanceQuery::setupGeoDistanceQueryDeserializer);

	protected static void setupGeoDistanceQueryDeserializer(ObjectDeserializer<GeoDistanceQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::distance, JsonpDeserializer.stringDeserializer(), "distance");
		op.add(Builder::distanceType, GeoDistanceType._DESERIALIZER, "distance_type");
		op.add(Builder::validationMethod, GeoValidationMethod._DESERIALIZER, "validation_method");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.location(GeoLocation._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
