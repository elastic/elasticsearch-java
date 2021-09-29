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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.ValueCountAggregation
@JsonpDeserializable
public final class ValueCountAggregation extends FormattableMetricAggregation implements AggregationVariant {
	// ---------------------------------------------------------------------------------------------

	public ValueCountAggregation(Builder builder) {
		super(builder);

	}

	public ValueCountAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "value_count";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValueCountAggregation}.
	 */
	public static class Builder extends FormattableMetricAggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ValueCountAggregation> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ValueCountAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValueCountAggregation build() {

			return new ValueCountAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValueCountAggregation}
	 */
	public static final JsonpDeserializer<ValueCountAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ValueCountAggregation::setupValueCountAggregationDeserializer, Builder::build);

	protected static void setupValueCountAggregationDeserializer(
			DelegatingDeserializer<ValueCountAggregation.Builder> op) {
		FormattableMetricAggregation.setupFormattableMetricAggregationDeserializer(op);

	}

}
