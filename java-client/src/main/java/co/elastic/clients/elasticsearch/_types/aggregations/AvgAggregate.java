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

// typedef: _types.aggregations.AvgAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.AvgAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class AvgAggregate extends SingleMetricAggregateBase implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private AvgAggregate(Builder builder) {
		super(builder);

	}

	public static AvgAggregate of(Function<Builder, ObjectBuilder<AvgAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Avg;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AvgAggregate}.
	 */

	public static class Builder extends SingleMetricAggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AvgAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AvgAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AvgAggregate build() {
			_checkSingleUse();

			return new AvgAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AvgAggregate}
	 */
	public static final JsonpDeserializer<AvgAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AvgAggregate::setupAvgAggregateDeserializer);

	protected static void setupAvgAggregateDeserializer(ObjectDeserializer<AvgAggregate.Builder> op) {
		SingleMetricAggregateBase.setupSingleMetricAggregateBaseDeserializer(op);

	}

}
