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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoCentroidAggregate
@JsonpDeserializable
public class GeoCentroidAggregate extends AggregateBase implements AggregateVariant {
	private final long count;

	@Nullable
	private final JsonValue /* _types.query_dsl.GeoLocation */ location;

	// ---------------------------------------------------------------------------------------------

	private GeoCentroidAggregate(Builder builder) {
		super(builder);

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.location = builder.location;

	}

	public static GeoCentroidAggregate of(Function<Builder, ObjectBuilder<GeoCentroidAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_centroid";
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
	public final JsonValue /* _types.query_dsl.GeoLocation */ location() {
		return this.location;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("count");
		generator.write(this.count);

		if (this.location != null) {
			generator.writeKey("location");
			generator.write(this.location);

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
		private JsonValue /* _types.query_dsl.GeoLocation */ location;

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
		public final Builder location(@Nullable JsonValue /* _types.query_dsl.GeoLocation */ value) {
			this.location = value;
			return this;
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
			.lazy(Builder::new, GeoCentroidAggregate::setupGeoCentroidAggregateDeserializer, Builder::build);

	protected static void setupGeoCentroidAggregateDeserializer(
			DelegatingDeserializer<GeoCentroidAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::location, JsonpDeserializer.jsonValueDeserializer(), "location");

	}

}
