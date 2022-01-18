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

import co.elastic.clients.elasticsearch._types.GeoLocation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoCentroidAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoCentroidAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoCentroidAggregate extends AggregateBase implements AggregateVariant {
	private final long count;

	@Nullable
	private final GeoLocation location;

	// ---------------------------------------------------------------------------------------------

	private GeoCentroidAggregate(Builder builder) {
		super(builder);

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.location = builder.location;

	}

	public static GeoCentroidAggregate of(Function<Builder, ObjectBuilder<GeoCentroidAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.GeoCentroid;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * API name: {@code location}
	 */
	@Nullable
	public final GeoLocation location() {
		return this.location;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("count");
		generator.write(this.count);

		if (this.location != null) {
			generator.writeKey("location");
			this.location.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoCentroidAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoCentroidAggregate> {
		private Long count;

		@Nullable
		private GeoLocation location;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code location}
		 */
		public final Builder location(@Nullable GeoLocation value) {
			this.location = value;
			return this;
		}

		/**
		 * API name: {@code location}
		 */
		public final Builder location(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.location(fn.apply(new GeoLocation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoCentroidAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoCentroidAggregate build() {
			_checkSingleUse();

			return new GeoCentroidAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoCentroidAggregate}
	 */
	public static final JsonpDeserializer<GeoCentroidAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoCentroidAggregate::setupGeoCentroidAggregateDeserializer);

	protected static void setupGeoCentroidAggregateDeserializer(ObjectDeserializer<GeoCentroidAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::location, GeoLocation._DESERIALIZER, "location");

	}

}
