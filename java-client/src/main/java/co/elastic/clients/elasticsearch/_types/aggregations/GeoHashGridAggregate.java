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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.GeoHashGridAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoHashGridAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoHashGridAggregate extends MultiBucketAggregateBase<GeoHashGridBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private GeoHashGridAggregate(Builder builder) {
		super(builder);

	}

	public static GeoHashGridAggregate of(Function<Builder, ObjectBuilder<GeoHashGridAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.GeohashGrid;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoHashGridAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<GeoHashGridBucket, Builder>
			implements
				ObjectBuilder<GeoHashGridAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoHashGridAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoHashGridAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new GeoHashGridAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoHashGridAggregate}
	 */
	public static final JsonpDeserializer<GeoHashGridAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoHashGridAggregate::setupGeoHashGridAggregateDeserializer);

	protected static void setupGeoHashGridAggregateDeserializer(ObjectDeserializer<GeoHashGridAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, GeoHashGridBucket._DESERIALIZER);

	}

}
