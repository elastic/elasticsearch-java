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

// typedef: _types.aggregations.GlobalAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GlobalAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class GlobalAggregation extends BucketAggregationBase implements AggregationVariant {
	// ---------------------------------------------------------------------------------------------

	private GlobalAggregation(Builder builder) {
		super(builder);

	}

	public static GlobalAggregation of(Function<Builder, ObjectBuilder<GlobalAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Global;
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
			_checkSingleUse();

			return new GlobalAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GlobalAggregation}
	 */
	public static final JsonpDeserializer<GlobalAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GlobalAggregation::setupGlobalAggregationDeserializer);

	protected static void setupGlobalAggregationDeserializer(ObjectDeserializer<GlobalAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);

	}

}
