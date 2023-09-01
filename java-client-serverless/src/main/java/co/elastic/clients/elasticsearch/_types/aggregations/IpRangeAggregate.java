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

// typedef: _types.aggregations.IpRangeAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.IpRangeAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpRangeAggregate extends MultiBucketAggregateBase<IpRangeBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private IpRangeAggregate(Builder builder) {
		super(builder);

	}

	public static IpRangeAggregate of(Function<Builder, ObjectBuilder<IpRangeAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.IpRange;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpRangeAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<IpRangeBucket, Builder>
			implements
				ObjectBuilder<IpRangeAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpRangeAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpRangeAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new IpRangeAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpRangeAggregate}
	 */
	public static final JsonpDeserializer<IpRangeAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpRangeAggregate::setupIpRangeAggregateDeserializer);

	protected static void setupIpRangeAggregateDeserializer(ObjectDeserializer<IpRangeAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, IpRangeBucket._DESERIALIZER);

	}

}
