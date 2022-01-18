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

// typedef: _types.aggregations.WeightedAvgAggregate

/**
 * Weighted average aggregation result. <code>value</code> is missing if the
 * weight was set to zero.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.WeightedAvgAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class WeightedAvgAggregate extends SingleMetricAggregateBase implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private WeightedAvgAggregate(Builder builder) {
		super(builder);

	}

	public static WeightedAvgAggregate of(Function<Builder, ObjectBuilder<WeightedAvgAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.WeightedAvg;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WeightedAvgAggregate}.
	 */

	public static class Builder extends SingleMetricAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WeightedAvgAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WeightedAvgAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WeightedAvgAggregate build() {
			_checkSingleUse();

			return new WeightedAvgAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WeightedAvgAggregate}
	 */
	public static final JsonpDeserializer<WeightedAvgAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WeightedAvgAggregate::setupWeightedAvgAggregateDeserializer);

	protected static void setupWeightedAvgAggregateDeserializer(ObjectDeserializer<WeightedAvgAggregate.Builder> op) {
		SingleMetricAggregateBase.setupSingleMetricAggregateBaseDeserializer(op);

	}

}
