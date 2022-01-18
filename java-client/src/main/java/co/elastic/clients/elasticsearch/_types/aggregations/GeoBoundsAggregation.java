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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoBoundsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoBoundsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoBoundsAggregation extends MetricAggregationBase implements AggregationVariant {
	@Nullable
	private final Boolean wrapLongitude;

	// ---------------------------------------------------------------------------------------------

	private GeoBoundsAggregation(Builder builder) {
		super(builder);

		this.wrapLongitude = builder.wrapLongitude;

	}

	public static GeoBoundsAggregation of(Function<Builder, ObjectBuilder<GeoBoundsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.GeoBounds;
	}

	/**
	 * API name: {@code wrap_longitude}
	 */
	@Nullable
	public final Boolean wrapLongitude() {
		return this.wrapLongitude;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.wrapLongitude != null) {
			generator.writeKey("wrap_longitude");
			generator.write(this.wrapLongitude);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBoundsAggregation}.
	 */

	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundsAggregation> {
		@Nullable
		private Boolean wrapLongitude;

		/**
		 * API name: {@code wrap_longitude}
		 */
		public final Builder wrapLongitude(@Nullable Boolean value) {
			this.wrapLongitude = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundsAggregation build() {
			_checkSingleUse();

			return new GeoBoundsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoBoundsAggregation}
	 */
	public static final JsonpDeserializer<GeoBoundsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoBoundsAggregation::setupGeoBoundsAggregationDeserializer);

	protected static void setupGeoBoundsAggregationDeserializer(ObjectDeserializer<GeoBoundsAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::wrapLongitude, JsonpDeserializer.booleanDeserializer(), "wrap_longitude");

	}

}
