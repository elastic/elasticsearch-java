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

// typedef: _types.aggregations.DateHistogramAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DateHistogramAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateHistogramAggregate extends MultiBucketAggregateBase<DateHistogramBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private DateHistogramAggregate(Builder builder) {
		super(builder);

	}

	public static DateHistogramAggregate of(Function<Builder, ObjectBuilder<DateHistogramAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.DateHistogram;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateHistogramAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<DateHistogramBucket, Builder>
			implements
				ObjectBuilder<DateHistogramAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateHistogramAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateHistogramAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new DateHistogramAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateHistogramAggregate}
	 */
	public static final JsonpDeserializer<DateHistogramAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateHistogramAggregate::setupDateHistogramAggregateDeserializer);

	protected static void setupDateHistogramAggregateDeserializer(
			ObjectDeserializer<DateHistogramAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, DateHistogramBucket._DESERIALIZER);

	}

}
