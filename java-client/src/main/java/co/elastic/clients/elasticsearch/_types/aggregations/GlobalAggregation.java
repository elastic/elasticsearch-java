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

// typedef: _types.aggregations.GlobalAggregation
@JsonpDeserializable
public final class GlobalAggregation extends BucketAggregationBase implements AggregationVariant {
	// ---------------------------------------------------------------------------------------------

	public GlobalAggregation(Builder builder) {
		super(builder);

	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "global";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GlobalAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GlobalAggregation> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GlobalAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GlobalAggregation build() {

			return new GlobalAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GlobalAggregation}
	 */
	public static final JsonpDeserializer<GlobalAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GlobalAggregation::setupGlobalAggregationDeserializer, Builder::build);

	protected static void setupGlobalAggregationDeserializer(DelegatingDeserializer<GlobalAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);

	}

}
