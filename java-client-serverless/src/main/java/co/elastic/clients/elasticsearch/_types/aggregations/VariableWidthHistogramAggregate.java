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

// typedef: _types.aggregations.VariableWidthHistogramAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.VariableWidthHistogramAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class VariableWidthHistogramAggregate extends MultiBucketAggregateBase<VariableWidthHistogramBucket>
		implements
			AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private VariableWidthHistogramAggregate(Builder builder) {
		super(builder);

	}

	public static VariableWidthHistogramAggregate of(
			Function<Builder, ObjectBuilder<VariableWidthHistogramAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.VariableWidthHistogram;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VariableWidthHistogramAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<VariableWidthHistogramBucket, Builder>
			implements
				ObjectBuilder<VariableWidthHistogramAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link VariableWidthHistogramAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VariableWidthHistogramAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new VariableWidthHistogramAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VariableWidthHistogramAggregate}
	 */
	public static final JsonpDeserializer<VariableWidthHistogramAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, VariableWidthHistogramAggregate::setupVariableWidthHistogramAggregateDeserializer);

	protected static void setupVariableWidthHistogramAggregateDeserializer(
			ObjectDeserializer<VariableWidthHistogramAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op,
				VariableWidthHistogramBucket._DESERIALIZER);

	}

}
